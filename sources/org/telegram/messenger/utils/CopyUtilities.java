package org.telegram.messenger.utils;

import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.stripe.android.time.Clock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.URLSpanReplacement;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public abstract class CopyUtilities {

    public final class HTMLTagAttributesHandler implements Html.TagHandler, ContentHandler {
        public final Clock handler;
        public final ArrayDeque tagStatus = new ArrayDeque();
        public Editable text;
        public ContentHandler wrapped;

        public HTMLTagAttributesHandler(Clock clock) {
            this.handler = clock;
        }

        public static String getValue(String str, Attributes attributes) {
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                if (str.equals(attributes.getLocalName(i))) {
                    return attributes.getValue(i);
                }
            }
            return null;
        }

        @Override
        public final void characters(char[] cArr, int i, int i2) throws SAXException {
            this.wrapped.characters(cArr, i, i2);
        }

        @Override
        public final void endDocument() throws SAXException {
            this.wrapped.endDocument();
        }

        @Override
        public final void endElement(String str, String str2, String str3) throws SAXException {
            if (!((Boolean) this.tagStatus.removeLast()).booleanValue()) {
                this.wrapped.endElement(str, str2, str3);
            }
            Editable editable = this.text;
            this.handler.getClass();
            Clock.handleTag(false, str2, editable, null);
        }

        @Override
        public final void endPrefixMapping(String str) throws SAXException {
            this.wrapped.endPrefixMapping(str);
        }

        @Override
        public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (this.wrapped == null) {
                this.text = editable;
                this.wrapped = xMLReader.getContentHandler();
                xMLReader.setContentHandler(this);
                this.tagStatus.addLast(Boolean.FALSE);
            }
        }

        @Override
        public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
            this.wrapped.ignorableWhitespace(cArr, i, i2);
        }

        @Override
        public final void processingInstruction(String str, String str2) throws SAXException {
            this.wrapped.processingInstruction(str, str2);
        }

        @Override
        public final void setDocumentLocator(Locator locator) {
            this.wrapped.setDocumentLocator(locator);
        }

        @Override
        public final void skippedEntity(String str) throws SAXException {
            this.wrapped.skippedEntity(str);
        }

        @Override
        public final void startDocument() throws SAXException {
            this.wrapped.startDocument();
        }

        @Override
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            Editable editable = this.text;
            this.handler.getClass();
            boolean zHandleTag = Clock.handleTag(true, str2, editable, attributes);
            this.tagStatus.addLast(Boolean.valueOf(zHandleTag));
            if (zHandleTag) {
                return;
            }
            this.wrapped.startElement(str, str2, str3, attributes);
        }

        @Override
        public final void startPrefixMapping(String str, String str2) throws SAXException {
            this.wrapped.startPrefixMapping(str, str2);
        }
    }

    public static SpannableStringBuilder fromHTML(String str) {
        try {
            Spanned spannedFromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml("<inject>" + str + "</inject>", 63, null, new HTMLTagAttributesHandler(new Clock(22))) : Html.fromHtml("<inject>" + str + "</inject>", null, new HTMLTagAttributesHandler(new Clock(22)));
            if (spannedFromHtml == null) {
                return null;
            }
            Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : spans) {
                int spanStart = spannedFromHtml.getSpanStart(obj);
                int spanEnd = spannedFromHtml.getSpanEnd(obj);
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if ((style & 1) > 0) {
                        TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
                        tL_messageEntityBold.offset = spanStart;
                        tL_messageEntityBold.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityBold);
                    }
                    if ((style & 2) > 0) {
                        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
                        tL_messageEntityItalic.offset = spanStart;
                        tL_messageEntityItalic.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityItalic);
                    }
                } else if (obj instanceof UnderlineSpan) {
                    TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
                    tL_messageEntityUnderline.offset = spanStart;
                    tL_messageEntityUnderline.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityUnderline);
                } else if (obj instanceof StrikethroughSpan) {
                    TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
                    tL_messageEntityStrike.offset = spanStart;
                    tL_messageEntityStrike.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityStrike);
                } else if (obj instanceof ParsedSpan) {
                    ParsedSpan parsedSpan = (ParsedSpan) obj;
                    int i = parsedSpan.type;
                    if (i == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (i == 1) {
                        if (TextUtils.isEmpty(parsedSpan.lng)) {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        } else {
                            arrayList2.add(parsedSpan);
                        }
                    } else if (i == 2 || i == 3) {
                        arrayList3.add(parsedSpan);
                    }
                } else if (obj instanceof AnimatedEmojiSpan) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) obj;
                    tL_messageEntityCustomEmoji.document_id = animatedEmojiSpan.documentId;
                    tL_messageEntityCustomEmoji.document = animatedEmojiSpan.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml.toString());
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, spannableStringBuilder, spannableStringBuilder);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = spannedFromHtml.getSpanStart(obj2);
                    int spanEnd2 = spannedFromHtml.getSpanEnd(obj2);
                    String string = spannedFromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (string.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new URLSpanReplacement(url), spanStart2, spanEnd2, 33);
                    }
                }
            }
            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableStringBuilder, null);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ParsedSpan parsedSpan2 = (ParsedSpan) arrayList2.get(i2);
                int spanStart3 = spannedFromHtml.getSpanStart(parsedSpan2);
                int spanEnd3 = spannedFromHtml.getSpanEnd(parsedSpan2);
                spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, parsedSpan2.lng, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString()), spanStart3, spanEnd3, 33);
            }
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                ParsedSpan parsedSpan3 = (ParsedSpan) arrayList3.get(i3);
                QuoteSpan.putQuoteToEditable(spannableStringBuilder, spannedFromHtml.getSpanStart(parsedSpan3), spannedFromHtml.getSpanEnd(parsedSpan3), parsedSpan3.type == 3);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            FileLog.e("Html.fromHtml", e);
            return null;
        }
    }

    public final class ParsedSpan {
        public final String lng;
        public final int type;

        public ParsedSpan(int i) {
            this.type = i;
            this.lng = null;
        }

        public ParsedSpan(String str) {
            this.type = 1;
            this.lng = str;
        }
    }
}
