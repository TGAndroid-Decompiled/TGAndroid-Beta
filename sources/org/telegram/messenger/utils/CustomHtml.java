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
    public static String toHtml(Spanned spanned) {
        StringBuilder sb = new StringBuilder();
        toHTML_0_wrapQuote(sb, spanned, 0, spanned.length());
        return sb.toString();
    }

    private static void toHTML_0_wrapQuote(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, QuoteSpan.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(i, iNextSpanTransition, QuoteSpan.class);
            if (quoteSpanArr != null) {
                for (QuoteSpan quoteSpan : quoteSpanArr) {
                    sb.append(quoteSpan.isCollapsing ? "<details>" : "<blockquote>");
                }
            }
            toHTML_1_wrapTextStyle(sb, spanned, i, iNextSpanTransition);
            if (quoteSpanArr != null) {
                for (int length = quoteSpanArr.length - 1; length >= 0; length--) {
                    sb.append(quoteSpanArr[length].isCollapsing ? "</details>" : "</blockquote>");
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void textStyleSpanBegin(TextStyleSpan.TextStyleRun textStyleRun, StringBuilder sb) {
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

    private static void textStyleSpanEnd(TextStyleSpan.TextStyleRun textStyleRun, StringBuilder sb) {
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

    private static void toHTML_1_wrapTextStyle(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, TextStyleSpan.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i, iNextSpanTransition, TextStyleSpan.class);
            if (textStyleSpanArr != null) {
                for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
                    if (textStyleSpan != null) {
                        textStyleSpanBegin(textStyleSpan.getTextStyleRun(), sb);
                    }
                }
            }
            toHTML_2_wrapURLReplacements(sb, spanned, i, iNextSpanTransition);
            if (textStyleSpanArr != null) {
                for (TextStyleSpan textStyleSpan2 : textStyleSpanArr) {
                    if (textStyleSpan2 != null) {
                        textStyleSpanEnd(textStyleSpan2.getTextStyleRun(), sb);
                    }
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void toHTML_2_wrapURLReplacements(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, URLSpanReplacement.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i, iNextSpanTransition, URLSpanReplacement.class);
            if (uRLSpanReplacementArr != null) {
                for (URLSpanReplacement uRLSpanReplacement : uRLSpanReplacementArr) {
                    textStyleSpanBegin(uRLSpanReplacement.getTextStyleRun(), sb);
                    sb.append("<a href=\"");
                    sb.append(uRLSpanReplacement.getURL());
                    sb.append("\">");
                }
            }
            toHTML_3_wrapMonoscape(sb, spanned, i, iNextSpanTransition);
            if (uRLSpanReplacementArr != null) {
                for (URLSpanReplacement uRLSpanReplacement2 : uRLSpanReplacementArr) {
                    textStyleSpanEnd(uRLSpanReplacement2.getTextStyleRun(), sb);
                    sb.append("</a>");
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void toHTML_3_wrapMonoscape(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, URLSpanMono.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            URLSpanMono[] uRLSpanMonoArr = (URLSpanMono[]) spanned.getSpans(i, iNextSpanTransition, URLSpanMono.class);
            if (uRLSpanMonoArr != null) {
                for (URLSpanMono uRLSpanMono : uRLSpanMonoArr) {
                    if (uRLSpanMono != null) {
                        sb.append("<pre>");
                    }
                }
            }
            toHTML_4_wrapMonoscape2(sb, spanned, i, iNextSpanTransition);
            if (uRLSpanMonoArr != null) {
                for (URLSpanMono uRLSpanMono2 : uRLSpanMonoArr) {
                    if (uRLSpanMono2 != null) {
                        sb.append("</pre>");
                    }
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void toHTML_4_wrapMonoscape2(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, CodeHighlighting.Span.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i, iNextSpanTransition, CodeHighlighting.Span.class);
            if (spanArr != null) {
                for (CodeHighlighting.Span span : spanArr) {
                    if (span != null) {
                        if (TextUtils.isEmpty(span.lng)) {
                            sb.append("<pre>");
                        } else {
                            sb.append("<pre lang=\"");
                            sb.append(span.lng);
                            sb.append("\">");
                        }
                    }
                }
            }
            toHTML_6_wrapAnimatedEmoji(sb, spanned, i, iNextSpanTransition);
            if (spanArr != null) {
                for (CodeHighlighting.Span span2 : spanArr) {
                    if (span2 != null) {
                        sb.append("</pre>");
                    }
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void toHTML_6_wrapAnimatedEmoji(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, i2, AnimatedEmojiSpan.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = i2;
            }
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, iNextSpanTransition, AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                    if (animatedEmojiSpan != null && !animatedEmojiSpan.standard) {
                        sb.append("<animated-emoji data-document-id=\"" + animatedEmojiSpan.documentId + "\">");
                    }
                }
            }
            toHTML_7_withinStyle(sb, spanned, i, iNextSpanTransition);
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                    if (animatedEmojiSpan2 != null && !animatedEmojiSpan2.standard) {
                        sb.append("</animated-emoji>");
                    }
                }
            }
            i = iNextSpanTransition;
        }
    }

    private static void toHTML_7_withinStyle(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        int i3;
        char cCharAt;
        while (i < i2) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 == '\n') {
                sb.append("<br>");
            } else if (cCharAt2 == '<') {
                sb.append("&lt;");
            } else if (cCharAt2 == '>') {
                sb.append("&gt;");
            } else if (cCharAt2 == '&') {
                sb.append("&amp;");
            } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                if (cCharAt2 > '~' || cCharAt2 < ' ') {
                    sb.append("&#");
                    sb.append((int) cCharAt2);
                    sb.append(";");
                } else if (cCharAt2 == ' ') {
                    while (true) {
                        int i4 = i + 1;
                        if (i4 >= i2 || charSequence.charAt(i4) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i = i4;
                    }
                    sb.append(' ');
                } else {
                    sb.append(cCharAt2);
                }
            } else if (cCharAt2 < 56320 && (i3 = i + 1) < i2 && (cCharAt = charSequence.charAt(i3)) >= 56320 && cCharAt <= 57343) {
                sb.append("&#");
                sb.append(((cCharAt2 - 55296) << 10) | 65536 | (cCharAt - 56320));
                sb.append(";");
                i = i3;
            }
            i++;
        }
    }
}
