package io.noties.markwon.html;

import androidx.datastore.preferences.PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility;
import io.noties.markwon.html.jsoup.nodes.Attribute;
import io.noties.markwon.html.jsoup.nodes.Attributes;
import io.noties.markwon.html.jsoup.parser.CharacterReader;
import io.noties.markwon.html.jsoup.parser.ParseErrorList;
import io.noties.markwon.html.jsoup.parser.Token;
import io.noties.markwon.html.jsoup.parser.Tokeniser;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.iv.RichEditor;

public final class MarkwonHtmlParserImpl extends MarkwonHtmlParser {
    public final RichEditor.AnonymousClass12 emptyTagReplacement;
    public boolean isInsidePreTag;
    public boolean previousIsBlock;
    public final ChatActivity.AnonymousClass40 trimmingAppender;
    public static final Set INLINE_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set VOID_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set BLOCK_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final ArrayList inlineTags = new ArrayList(0);
    public HtmlTagImpl.BlockImpl currentBlock = new HtmlTagImpl.BlockImpl("", 0, Collections.EMPTY_MAP, null);

    public MarkwonHtmlParserImpl(RichEditor.AnonymousClass12 anonymousClass12, ChatActivity.AnonymousClass40 anonymousClass40) {
        this.emptyTagReplacement = anonymousClass12;
        this.trimmingAppender = anonymousClass40;
    }

    public static Map extractAttributes(Token.StartTag startTag) {
        Attributes attributes = startTag.attributes;
        int i = attributes.size;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < attributes.size)) {
                return DesugarCollections.unmodifiableMap(map);
            }
            String str = attributes.vals[i2];
            String str2 = attributes.keys[i2];
            if (str == null) {
                str = "";
            }
            Attribute attribute = new Attribute();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            attribute.key = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            attribute.val = str;
            attribute.parent = attributes;
            i2++;
            map.put(attribute.key.toLowerCase(Locale.US), attribute.val);
        }
    }

    public final void processFragment(Appendable appendable, String str) {
        Token token;
        HtmlTagImpl.InlineImpl inlineImpl;
        int length;
        Tokeniser tokeniser = new Tokeniser(new CharacterReader(str), new ParseErrorList(0));
        while (true) {
            if (tokeniser.isEmitPending) {
                StringBuilder sb = tokeniser.charsBuilder;
                int length2 = sb.length();
                Token.Character character = tokeniser.charPending;
                if (length2 > 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    tokeniser.charsString = null;
                    character.data = string;
                    token = character;
                } else {
                    String str2 = tokeniser.charsString;
                    if (str2 != null) {
                        character.data = str2;
                        tokeniser.charsString = null;
                        token = character;
                    } else {
                        tokeniser.isEmitPending = false;
                        token = tokeniser.emitPending;
                    }
                }
                int i = token.type;
                if (6 == i) {
                    return;
                }
                int iOrdinal = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.ordinal(i);
                ArrayList arrayList = this.inlineTags;
                RichEditor.AnonymousClass12 anonymousClass12 = this.emptyTagReplacement;
                Set set = BLOCK_TAGS;
                Set set2 = INLINE_TAGS;
                if (iOrdinal == 1) {
                    Token.StartTag startTag = (Token.StartTag) token;
                    boolean zContains = set2.contains(startTag.normalName);
                    Set set3 = VOID_TAGS;
                    if (zContains) {
                        String str3 = startTag.normalName;
                        CharSequence charSequence = (CharSequence) appendable;
                        HtmlTagImpl.InlineImpl inlineImpl2 = new HtmlTagImpl.InlineImpl(charSequence.length(), str3, extractAttributes(startTag));
                        if (this.previousIsBlock) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                AppendableUtils.appendQuietly(appendable, '\n');
                            }
                            this.previousIsBlock = false;
                        }
                        if (set3.contains(str3) || startTag.selfClosing) {
                            anonymousClass12.getClass();
                            String strReplace = RichEditor.AnonymousClass12.replace(inlineImpl2);
                            if (strReplace != null && strReplace.length() > 0) {
                                try {
                                    appendable.append(strReplace);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            int length4 = charSequence.length();
                            if (inlineImpl2.end <= -1) {
                                inlineImpl2.end = length4;
                            }
                        }
                        arrayList.add(inlineImpl2);
                    } else {
                        String str4 = startTag.normalName;
                        if ("p".equals(this.currentBlock.name)) {
                            this.currentBlock.closeAt(((CharSequence) appendable).length());
                            AppendableUtils.appendQuietly(appendable, '\n');
                            this.currentBlock = this.currentBlock.parent;
                        } else if ("li".equals(str4) && "li".equals(this.currentBlock.name)) {
                            this.currentBlock.closeAt(((CharSequence) appendable).length());
                            this.currentBlock = this.currentBlock.parent;
                        }
                        if (set.contains(str4)) {
                            this.isInsidePreTag = "pre".equals(str4);
                            CharSequence charSequence2 = (CharSequence) appendable;
                            int length5 = charSequence2.length();
                            if (length5 > 0 && '\n' != charSequence2.charAt(length5 - 1)) {
                                AppendableUtils.appendQuietly(appendable, '\n');
                            }
                        } else if (this.previousIsBlock) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                AppendableUtils.appendQuietly(appendable, '\n');
                            }
                            this.previousIsBlock = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map mapExtractAttributes = extractAttributes(startTag);
                        HtmlTagImpl.BlockImpl blockImpl = this.currentBlock;
                        HtmlTagImpl.BlockImpl blockImpl2 = new HtmlTagImpl.BlockImpl(str4, length7, mapExtractAttributes, blockImpl);
                        boolean z = set3.contains(str4) || startTag.selfClosing;
                        if (z) {
                            anonymousClass12.getClass();
                            String strReplace2 = RichEditor.AnonymousClass12.replace(blockImpl2);
                            if (strReplace2 != null && strReplace2.length() > 0) {
                                try {
                                    appendable.append(strReplace2);
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                            blockImpl2.closeAt(charSequence4.length());
                        }
                        ArrayList arrayList2 = blockImpl.children;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            blockImpl.children = arrayList2;
                        }
                        arrayList2.add(blockImpl2);
                        if (!z) {
                            this.currentBlock = blockImpl2;
                        }
                    }
                } else if (iOrdinal == 2) {
                    Token.EndTag endTag = (Token.EndTag) token;
                    if (set2.contains(endTag.normalName)) {
                        String str5 = endTag.normalName;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                inlineImpl = null;
                                break;
                            }
                            HtmlTagImpl.InlineImpl inlineImpl3 = (HtmlTagImpl.InlineImpl) arrayList.get(size);
                            if (str5.equals(inlineImpl3.name) && inlineImpl3.end < 0) {
                                inlineImpl = inlineImpl3;
                                break;
                            }
                            size--;
                        }
                        if (inlineImpl != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (inlineImpl.start == charSequence5.length()) {
                                anonymousClass12.getClass();
                                CharSequence charSequenceReplace = RichEditor.AnonymousClass12.replace(inlineImpl);
                                if (charSequenceReplace != null) {
                                    try {
                                        appendable.append(charSequenceReplace);
                                    } catch (IOException e3) {
                                        throw new RuntimeException(e3);
                                    }
                                }
                            }
                            int length8 = charSequence5.length();
                            if (inlineImpl.end <= -1) {
                                inlineImpl.end = length8;
                            }
                        }
                    } else {
                        String str6 = endTag.normalName;
                        HtmlTagImpl.BlockImpl blockImpl3 = this.currentBlock;
                        while (blockImpl3 != null && !str6.equals(blockImpl3.name) && blockImpl3.end <= -1) {
                            blockImpl3 = blockImpl3.parent;
                        }
                        if (blockImpl3 != null) {
                            if ("pre".equals(str6)) {
                                this.isInsidePreTag = false;
                            }
                            CharSequence charSequence6 = (CharSequence) appendable;
                            int length9 = charSequence6.length();
                            int i2 = blockImpl3.start;
                            if (i2 == length9) {
                                anonymousClass12.getClass();
                                CharSequence charSequenceReplace2 = RichEditor.AnonymousClass12.replace(blockImpl3);
                                if (charSequenceReplace2 != null) {
                                    try {
                                        appendable.append(charSequenceReplace2);
                                    } catch (IOException e4) {
                                        throw new RuntimeException(e4);
                                    }
                                }
                            }
                            blockImpl3.closeAt(charSequence6.length());
                            if (i2 != blockImpl3.end) {
                                this.previousIsBlock = set.contains(blockImpl3.name);
                            }
                            if ("p".equals(str6)) {
                                AppendableUtils.appendQuietly(appendable, '\n');
                            }
                            this.currentBlock = blockImpl3.parent;
                        }
                    }
                } else if (iOrdinal == 4) {
                    Token.Character character2 = (Token.Character) token;
                    if (this.isInsidePreTag) {
                        try {
                            appendable.append(character2.data);
                        } catch (IOException e5) {
                            throw new RuntimeException(e5);
                        }
                    } else {
                        if (this.previousIsBlock) {
                            CharSequence charSequence7 = (CharSequence) appendable;
                            int length10 = charSequence7.length();
                            if (length10 > 0 && '\n' != charSequence7.charAt(length10 - 1)) {
                                AppendableUtils.appendQuietly(appendable, '\n');
                            }
                            this.previousIsBlock = false;
                        }
                        String str7 = character2.data;
                        this.trimmingAppender.getClass();
                        CharSequence charSequence8 = (CharSequence) appendable;
                        int length11 = charSequence8.length();
                        int length12 = str7.length();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < length12; i3++) {
                            char cCharAt = str7.charAt(i3);
                            if (Character.isWhitespace(cCharAt)) {
                                z2 = true;
                            } else {
                                if (z2 && (length = charSequence8.length()) > 0 && !Character.isWhitespace(charSequence8.charAt(length - 1))) {
                                    AppendableUtils.appendQuietly(appendable, ' ');
                                }
                                AppendableUtils.appendQuietly(appendable, cCharAt);
                                z2 = false;
                            }
                        }
                        if (z2 && length11 < charSequence8.length()) {
                            AppendableUtils.appendQuietly(appendable, ' ');
                        }
                    }
                }
                token.reset();
            } else {
                tokeniser.state.read(tokeniser, tokeniser.reader);
            }
        }
    }
}
