package org.telegram.messenger.utils;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanReplacement;

public abstract class CustomHtml {
    public static void textStyleSpanBegin(TextStyleSpan.TextStyleRun textStyleRun, StringBuilder sb) {
        if (textStyleRun == null) {
            return;
        }
        if ((textStyleRun.flags & 768) > 0) {
            sb.append("<spoiler>");
        }
        if ((textStyleRun.flags & 1) > 0) {
            sb.append("<b>");
        }
        if ((textStyleRun.flags & 2) > 0) {
            sb.append("<i>");
        }
        if ((textStyleRun.flags & 16) > 0) {
            sb.append("<u>");
        }
        if ((textStyleRun.flags & 8) > 0) {
            sb.append("<s>");
        }
        if ((textStyleRun.flags & 128) <= 0 || textStyleRun.urlEntity == null) {
            return;
        }
        sb.append("<a href=\"");
        sb.append(textStyleRun.urlEntity.url);
        sb.append("\">");
    }

    public static void textStyleSpanEnd(TextStyleSpan.TextStyleRun textStyleRun, StringBuilder sb) {
        if (textStyleRun == null) {
            return;
        }
        if ((textStyleRun.flags & 128) > 0 && textStyleRun.urlEntity != null) {
            sb.append("</a>");
        }
        if ((textStyleRun.flags & 8) > 0) {
            sb.append("</s>");
        }
        if ((textStyleRun.flags & 16) > 0) {
            sb.append("</u>");
        }
        if ((textStyleRun.flags & 2) > 0) {
            sb.append("</i>");
        }
        if ((textStyleRun.flags & 1) > 0) {
            sb.append("</b>");
        }
        if ((textStyleRun.flags & 768) > 0) {
            sb.append("</spoiler>");
        }
    }

    public static String toHtml(Spanned spanned) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i5 = 0;
        while (i5 < length) {
            int iNextSpanTransition = spanned.nextSpanTransition(i5, length, QuoteSpan.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = length;
            }
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(i5, iNextSpanTransition, QuoteSpan.class);
            if (quoteSpanArr != null) {
                for (QuoteSpan quoteSpan : quoteSpanArr) {
                    sb.append(quoteSpan.isCollapsing ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i5 < iNextSpanTransition) {
                int iNextSpanTransition2 = spanned.nextSpanTransition(i5, iNextSpanTransition, TextStyleSpan.class);
                if (iNextSpanTransition2 < 0) {
                    iNextSpanTransition2 = iNextSpanTransition;
                }
                TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i5, iNextSpanTransition2, TextStyleSpan.class);
                String str2 = "<pre>";
                if (textStyleSpanArr != null) {
                    for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
                        if (textStyleSpan != null) {
                            textStyleSpanBegin(textStyleSpan.getTextStyleRun(), sb);
                        }
                    }
                }
                while (i5 < iNextSpanTransition2) {
                    int iNextSpanTransition3 = spanned.nextSpanTransition(i5, iNextSpanTransition2, URLSpanReplacement.class);
                    if (iNextSpanTransition3 < 0) {
                        iNextSpanTransition3 = iNextSpanTransition2;
                    }
                    URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i5, iNextSpanTransition3, URLSpanReplacement.class);
                    String str3 = "\">";
                    if (uRLSpanReplacementArr != null) {
                        for (URLSpanReplacement uRLSpanReplacement : uRLSpanReplacementArr) {
                            textStyleSpanBegin(uRLSpanReplacement.getTextStyleRun(), sb);
                            sb.append("<a href=\"");
                            sb.append(uRLSpanReplacement.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i5 < iNextSpanTransition3) {
                        int iNextSpanTransition4 = spanned.nextSpanTransition(i5, iNextSpanTransition3, URLSpanMono.class);
                        if (iNextSpanTransition4 < 0) {
                            iNextSpanTransition4 = iNextSpanTransition3;
                        }
                        URLSpanMono[] uRLSpanMonoArr = (URLSpanMono[]) spanned.getSpans(i5, iNextSpanTransition4, URLSpanMono.class);
                        if (uRLSpanMonoArr != null) {
                            for (URLSpanMono uRLSpanMono : uRLSpanMonoArr) {
                                if (uRLSpanMono != null) {
                                    sb.append(str2);
                                }
                            }
                        }
                        while (i5 < iNextSpanTransition4) {
                            int iNextSpanTransition5 = spanned.nextSpanTransition(i5, iNextSpanTransition4, CodeHighlighting.Span.class);
                            int i6 = length;
                            int i7 = iNextSpanTransition5 < 0 ? iNextSpanTransition4 : iNextSpanTransition5;
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i5, i7, CodeHighlighting.Span.class);
                            int i8 = i5;
                            int i9 = iNextSpanTransition;
                            if (spanArr != null) {
                                int i10 = 0;
                                while (i10 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i10];
                                    int i11 = i10;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb.append(str2);
                                        } else {
                                            sb.append("<pre lang=\"");
                                            sb.append(span.lng);
                                            sb.append(str3);
                                        }
                                    }
                                    i10 = i11 + 1;
                                }
                            }
                            int i12 = i8;
                            while (i12 < i7) {
                                int iNextSpanTransition6 = spanned.nextSpanTransition(i12, i7, AnimatedEmojiSpan.class);
                                int i13 = i7;
                                if (iNextSpanTransition6 >= 0) {
                                    i7 = iNextSpanTransition6;
                                }
                                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i12, i7, AnimatedEmojiSpan.class);
                                int i14 = i12;
                                int i15 = iNextSpanTransition2;
                                if (animatedEmojiSpanArr != null) {
                                    int i16 = 0;
                                    while (i16 < animatedEmojiSpanArr.length) {
                                        AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i16];
                                        int i17 = i16;
                                        if (animatedEmojiSpan != null && !animatedEmojiSpan.standard) {
                                            sb.append("<animated-emoji data-document-id=\"" + animatedEmojiSpan.documentId + str3);
                                        }
                                        i16 = i17 + 1;
                                        str2 = str2;
                                    }
                                }
                                String str4 = str2;
                                int i18 = i14;
                                while (i18 < i7) {
                                    char cCharAt = spanned.charAt(i18);
                                    if (cCharAt == '\n') {
                                        sb.append("<br>");
                                    } else if (cCharAt == '<') {
                                        sb.append("&lt;");
                                    } else if (cCharAt == '>') {
                                        sb.append("&gt;");
                                    } else {
                                        if (cCharAt == '&') {
                                            sb.append("&amp;");
                                        } else {
                                            i = i18;
                                            i2 = iNextSpanTransition3;
                                            if (cCharAt < 55296 || cCharAt > 57343) {
                                                str = str3;
                                                if (cCharAt > '~' || cCharAt < ' ') {
                                                    sb.append("&#");
                                                    sb.append((int) cCharAt);
                                                    sb.append(";");
                                                } else if (cCharAt == ' ') {
                                                    i3 = i;
                                                    while (true) {
                                                        int i19 = i3 + 1;
                                                        if (i19 >= i7 || spanned.charAt(i19) != ' ') {
                                                            break;
                                                        }
                                                        sb.append("&nbsp;");
                                                        i3 = i19;
                                                    }
                                                    sb.append(' ');
                                                } else {
                                                    sb.append(cCharAt);
                                                }
                                                i3 = i;
                                            } else {
                                                if (cCharAt >= 56320 || (i4 = i + 1) >= i7) {
                                                    str = str3;
                                                } else {
                                                    str = str3;
                                                    char cCharAt2 = spanned.charAt(i4);
                                                    if (cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                                                        sb.append("&#");
                                                        sb.append(((cCharAt - 55296) << 10) | 65536 | (cCharAt2 - 56320));
                                                        sb.append(";");
                                                        i3 = i4;
                                                    }
                                                }
                                                i3 = i;
                                            }
                                        }
                                        i18 = i3 + 1;
                                        iNextSpanTransition3 = i2;
                                        str3 = str;
                                    }
                                    i = i18;
                                    i2 = iNextSpanTransition3;
                                    str = str3;
                                    i3 = i;
                                    i18 = i3 + 1;
                                    iNextSpanTransition3 = i2;
                                    str3 = str;
                                }
                                int i20 = iNextSpanTransition3;
                                String str5 = str3;
                                if (animatedEmojiSpanArr != null) {
                                    for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                                        if (animatedEmojiSpan2 != null && !animatedEmojiSpan2.standard) {
                                            sb.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i12 = i7;
                                i7 = i13;
                                iNextSpanTransition2 = i15;
                                str2 = str4;
                                iNextSpanTransition3 = i20;
                                str3 = str5;
                            }
                            int i21 = i7;
                            int i22 = iNextSpanTransition2;
                            String str6 = str2;
                            int i23 = iNextSpanTransition3;
                            String str7 = str3;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb.append("</pre>");
                                    }
                                }
                            }
                            length = i6;
                            iNextSpanTransition = i9;
                            i5 = i21;
                            iNextSpanTransition2 = i22;
                            str2 = str6;
                            iNextSpanTransition3 = i23;
                            str3 = str7;
                        }
                        int i24 = length;
                        int i25 = iNextSpanTransition;
                        int i26 = iNextSpanTransition2;
                        String str8 = str2;
                        int i27 = iNextSpanTransition3;
                        String str9 = str3;
                        if (uRLSpanMonoArr != null) {
                            for (URLSpanMono uRLSpanMono2 : uRLSpanMonoArr) {
                                if (uRLSpanMono2 != null) {
                                    sb.append("</pre>");
                                }
                            }
                        }
                        i5 = iNextSpanTransition4;
                        length = i24;
                        iNextSpanTransition = i25;
                        iNextSpanTransition2 = i26;
                        str2 = str8;
                        iNextSpanTransition3 = i27;
                        str3 = str9;
                    }
                    int i28 = length;
                    int i29 = iNextSpanTransition;
                    int i30 = iNextSpanTransition2;
                    String str10 = str2;
                    int i31 = iNextSpanTransition3;
                    if (uRLSpanReplacementArr != null) {
                        for (URLSpanReplacement uRLSpanReplacement2 : uRLSpanReplacementArr) {
                            sb.append("</a>");
                            textStyleSpanEnd(uRLSpanReplacement2.getTextStyleRun(), sb);
                        }
                    }
                    length = i28;
                    iNextSpanTransition = i29;
                    iNextSpanTransition2 = i30;
                    str2 = str10;
                    i5 = i31;
                }
                int i32 = length;
                int i33 = iNextSpanTransition;
                int i34 = iNextSpanTransition2;
                if (textStyleSpanArr != null) {
                    for (TextStyleSpan textStyleSpan2 : textStyleSpanArr) {
                        if (textStyleSpan2 != null) {
                            textStyleSpanEnd(textStyleSpan2.getTextStyleRun(), sb);
                        }
                    }
                }
                length = i32;
                iNextSpanTransition = i33;
                i5 = i34;
            }
            int i35 = length;
            int i36 = iNextSpanTransition;
            if (quoteSpanArr != null) {
                for (int length2 = quoteSpanArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i5 = i36;
        }
        return sb.toString();
    }
}
