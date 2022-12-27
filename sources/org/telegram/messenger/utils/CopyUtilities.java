package org.telegram.messenger.utils;

import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.p009ui.Components.AnimatedEmojiSpan;
import org.telegram.p009ui.Components.URLSpanReplacement;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$TL_messageEntityBold;
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_messageEntityItalic;
import org.telegram.tgnet.TLRPC$TL_messageEntityPre;
import org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler;
import org.telegram.tgnet.TLRPC$TL_messageEntityStrike;
import org.telegram.tgnet.TLRPC$TL_messageEntityUnderline;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class CopyUtilities {
    public static Spannable fromHTML(String str) {
        try {
            Spanned fromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml("<inject>" + str + "</inject>", 63, null, new HTMLTagAttributesHandler(new HTMLTagHandler())) : Html.fromHtml("<inject>" + str + "</inject>", null, new HTMLTagAttributesHandler(new HTMLTagHandler()));
            if (fromHtml == null) {
                return null;
            }
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if ((style & 1) > 0) {
                        arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityBold(), spanStart, spanEnd));
                    }
                    if ((style & 2) > 0) {
                        arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityItalic(), spanStart, spanEnd));
                    }
                } else if (obj instanceof UnderlineSpan) {
                    arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityUnderline(), spanStart, spanEnd));
                } else if (obj instanceof StrikethroughSpan) {
                    arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityStrike(), spanStart, spanEnd));
                } else if (obj instanceof ParsedSpan) {
                    int i = ((ParsedSpan) obj).type;
                    if (i == 0) {
                        arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntitySpoiler(), spanStart, spanEnd));
                    } else if (i == 1) {
                        arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityPre(), spanStart, spanEnd));
                    }
                } else if (obj instanceof AnimatedEmojiSpan) {
                    TLRPC$TL_messageEntityCustomEmoji tLRPC$TL_messageEntityCustomEmoji = new TLRPC$TL_messageEntityCustomEmoji();
                    AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) obj;
                    tLRPC$TL_messageEntityCustomEmoji.document_id = animatedEmojiSpan.documentId;
                    tLRPC$TL_messageEntityCustomEmoji.document = animatedEmojiSpan.document;
                    arrayList.add(setEntityStartEnd(tLRPC$TL_messageEntityCustomEmoji, spanStart, spanEnd));
                }
            }
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            MediaDataController.addTextStyleRuns(arrayList, spannableString, spannableString);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = fromHtml.getSpanStart(obj2);
                    int spanEnd2 = fromHtml.getSpanEnd(obj2);
                    String charSequence = fromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (charSequence.equals(url)) {
                        spannableString.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableString.setSpan(new URLSpanReplacement(url), spanStart2, spanEnd2, 33);
                    }
                }
            }
            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, null);
            return spannableString;
        } catch (Exception e) {
            FileLog.m33e("Html.fromHtml", e);
            return null;
        }
    }

    private static TLRPC$MessageEntity setEntityStartEnd(TLRPC$MessageEntity tLRPC$MessageEntity, int i, int i2) {
        tLRPC$MessageEntity.offset = i;
        tLRPC$MessageEntity.length = i2 - i;
        return tLRPC$MessageEntity;
    }

    public static class HTMLTagAttributesHandler implements Html.TagHandler, ContentHandler {
        private final TagHandler handler;
        private ArrayDeque<Boolean> tagStatus;
        private Editable text;
        private ContentHandler wrapped;

        public interface TagHandler {
            boolean handleTag(boolean z, String str, Editable editable, Attributes attributes);
        }

        public static String getValue(Attributes attributes, String str) {
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                if (str.equals(attributes.getLocalName(i))) {
                    return attributes.getValue(i);
                }
            }
            return null;
        }

        private HTMLTagAttributesHandler(TagHandler tagHandler) {
            this.tagStatus = new ArrayDeque<>();
            this.handler = tagHandler;
        }

        @Override
        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (this.wrapped == null) {
                this.text = editable;
                this.wrapped = xMLReader.getContentHandler();
                xMLReader.setContentHandler(this);
                this.tagStatus.addLast(Boolean.FALSE);
            }
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            boolean handleTag = this.handler.handleTag(true, str2, this.text, attributes);
            this.tagStatus.addLast(Boolean.valueOf(handleTag));
            if (handleTag) {
                return;
            }
            this.wrapped.startElement(str, str2, str3, attributes);
        }

        @Override
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (!this.tagStatus.removeLast().booleanValue()) {
                this.wrapped.endElement(str, str2, str3);
            }
            this.handler.handleTag(false, str2, this.text, null);
        }

        @Override
        public void setDocumentLocator(Locator locator) {
            this.wrapped.setDocumentLocator(locator);
        }

        @Override
        public void startDocument() throws SAXException {
            this.wrapped.startDocument();
        }

        @Override
        public void endDocument() throws SAXException {
            this.wrapped.endDocument();
        }

        @Override
        public void startPrefixMapping(String str, String str2) throws SAXException {
            this.wrapped.startPrefixMapping(str, str2);
        }

        @Override
        public void endPrefixMapping(String str) throws SAXException {
            this.wrapped.endPrefixMapping(str);
        }

        @Override
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            this.wrapped.characters(cArr, i, i2);
        }

        @Override
        public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
            this.wrapped.ignorableWhitespace(cArr, i, i2);
        }

        @Override
        public void processingInstruction(String str, String str2) throws SAXException {
            this.wrapped.processingInstruction(str, str2);
        }

        @Override
        public void skippedEntity(String str) throws SAXException {
            this.wrapped.skippedEntity(str);
        }
    }

    public static class HTMLTagHandler implements HTMLTagAttributesHandler.TagHandler {
        private HTMLTagHandler() {
        }

        @Override
        public boolean handleTag(boolean z, String str, Editable editable, Attributes attributes) {
            if (str.startsWith("animated-emoji")) {
                if (z) {
                    String value = HTMLTagAttributesHandler.getValue(attributes, "data-document-id");
                    if (value != null) {
                        editable.setSpan(new AnimatedEmojiSpan(Long.parseLong(value), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                        return true;
                    }
                } else {
                    AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) getLast(editable, AnimatedEmojiSpan.class);
                    if (animatedEmojiSpan != null) {
                        int spanStart = editable.getSpanStart(animatedEmojiSpan);
                        editable.removeSpan(animatedEmojiSpan);
                        if (spanStart != editable.length()) {
                            editable.setSpan(animatedEmojiSpan, spanStart, editable.length(), 33);
                        }
                        return true;
                    }
                }
            } else if (str.equals("spoiler")) {
                if (z) {
                    editable.setSpan(new ParsedSpan(0), editable.length(), editable.length(), 17);
                    return true;
                }
                ParsedSpan last = getLast(editable, ParsedSpan.class, 0);
                if (last != null) {
                    int spanStart2 = editable.getSpanStart(last);
                    editable.removeSpan(last);
                    if (spanStart2 != editable.length()) {
                        editable.setSpan(last, spanStart2, editable.length(), 33);
                    }
                    return true;
                }
            } else if (str.equals("pre")) {
                if (z) {
                    editable.setSpan(new ParsedSpan(1), editable.length(), editable.length(), 17);
                    return true;
                }
                ParsedSpan last2 = getLast(editable, ParsedSpan.class, 1);
                if (last2 != null) {
                    int spanStart3 = editable.getSpanStart(last2);
                    editable.removeSpan(last2);
                    if (spanStart3 != editable.length()) {
                        editable.setSpan(last2, spanStart3, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }

        private <T> T getLast(Editable editable, Class<T> cls) {
            Object[] spans = editable.getSpans(0, editable.length(), cls);
            if (spans.length == 0) {
                return null;
            }
            for (int length = spans.length; length > 0; length--) {
                int i = length - 1;
                if (editable.getSpanFlags(spans[i]) == 17) {
                    return (T) spans[i];
                }
            }
            return null;
        }

        private <T extends ParsedSpan> T getLast(Editable editable, Class<T> cls, int i) {
            Object[] objArr = (ParsedSpan[]) editable.getSpans(0, editable.length(), cls);
            if (objArr.length == 0) {
                return null;
            }
            for (int length = objArr.length; length > 0; length--) {
                int i2 = length - 1;
                if (editable.getSpanFlags(objArr[i2]) == 17 && objArr[i2].type == i) {
                    return (T) objArr[i2];
                }
            }
            return null;
        }
    }

    public static class ParsedSpan {
        final int type;

        private ParsedSpan(int i) {
            this.type = i;
        }
    }
}
