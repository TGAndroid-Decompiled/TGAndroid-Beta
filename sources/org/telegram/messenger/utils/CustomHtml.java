package org.telegram.messenger.utils;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanReplacement;
public class CustomHtml {
    public static String toHtml(Spanned spanned) {
        StringBuilder sb = new StringBuilder();
        toHTML_0_wrapQuote(sb, spanned, 0, spanned.length());
        return sb.toString();
    }

    private static void toHTML_0_wrapQuote(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, QuoteSpan.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(i, nextSpanTransition, QuoteSpan.class);
            if (quoteSpanArr != null) {
                for (QuoteSpan quoteSpan : quoteSpanArr) {
                    sb.append(quoteSpan.isCollapsing ? "<details>" : "<blockquote>");
                }
            }
            toHTML_1_wrapTextStyle(sb, spanned, i, nextSpanTransition);
            if (quoteSpanArr != null) {
                for (int length = quoteSpanArr.length - 1; length >= 0; length--) {
                    sb.append(quoteSpanArr[length].isCollapsing ? "</details>" : "</blockquote>");
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_1_wrapTextStyle(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, TextStyleSpan.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i, nextSpanTransition, TextStyleSpan.class);
            if (textStyleSpanArr != null) {
                for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
                    if (textStyleSpan != null) {
                        int styleFlags = textStyleSpan.getStyleFlags();
                        if ((styleFlags & 768) > 0) {
                            sb.append("<spoiler>");
                        }
                        if ((styleFlags & 1) > 0) {
                            sb.append("<b>");
                        }
                        if ((styleFlags & 2) > 0) {
                            sb.append("<i>");
                        }
                        if ((styleFlags & 16) > 0) {
                            sb.append("<u>");
                        }
                        if ((styleFlags & 8) > 0) {
                            sb.append("<s>");
                        }
                        if ((styleFlags & 128) > 0 && textStyleSpan.getTextStyleRun() != null && textStyleSpan.getTextStyleRun().urlEntity != null) {
                            sb.append("<a href=\"");
                            sb.append(textStyleSpan.getTextStyleRun().urlEntity.url);
                            sb.append("\">");
                        }
                    } else if (textStyleSpan instanceof URLSpanMono) {
                        sb.append("<pre>");
                    }
                }
            }
            toHTML_2_wrapURLReplacements(sb, spanned, i, nextSpanTransition);
            if (textStyleSpanArr != null) {
                for (TextStyleSpan textStyleSpan2 : textStyleSpanArr) {
                    if (textStyleSpan2 != null) {
                        int styleFlags2 = textStyleSpan2.getStyleFlags();
                        if ((styleFlags2 & 128) > 0 && textStyleSpan2.getTextStyleRun() != null && textStyleSpan2.getTextStyleRun().urlEntity != null) {
                            sb.append("</a>");
                        }
                        if ((styleFlags2 & 8) > 0) {
                            sb.append("</s>");
                        }
                        if ((styleFlags2 & 16) > 0) {
                            sb.append("</u>");
                        }
                        if ((styleFlags2 & 2) > 0) {
                            sb.append("</i>");
                        }
                        if ((styleFlags2 & 1) > 0) {
                            sb.append("</b>");
                        }
                        if ((styleFlags2 & 768) > 0) {
                            sb.append("</spoiler>");
                        }
                    }
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_2_wrapURLReplacements(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, URLSpanReplacement.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i, nextSpanTransition, URLSpanReplacement.class);
            if (uRLSpanReplacementArr != null) {
                for (URLSpanReplacement uRLSpanReplacement : uRLSpanReplacementArr) {
                    sb.append("<a href=\"");
                    sb.append(uRLSpanReplacement.getURL());
                    sb.append("\">");
                }
            }
            toHTML_3_wrapMonoscape(sb, spanned, i, nextSpanTransition);
            if (uRLSpanReplacementArr != null) {
                for (int i3 = 0; i3 < uRLSpanReplacementArr.length; i3++) {
                    sb.append("</a>");
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_3_wrapMonoscape(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, URLSpanMono.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            URLSpanMono[] uRLSpanMonoArr = (URLSpanMono[]) spanned.getSpans(i, nextSpanTransition, URLSpanMono.class);
            if (uRLSpanMonoArr != null) {
                for (URLSpanMono uRLSpanMono : uRLSpanMonoArr) {
                    if (uRLSpanMono != null) {
                        sb.append("<pre>");
                    }
                }
            }
            toHTML_4_wrapMonoscape2(sb, spanned, i, nextSpanTransition);
            if (uRLSpanMonoArr != null) {
                for (URLSpanMono uRLSpanMono2 : uRLSpanMonoArr) {
                    if (uRLSpanMono2 != null) {
                        sb.append("</pre>");
                    }
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_4_wrapMonoscape2(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, CodeHighlighting.Span.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i, nextSpanTransition, CodeHighlighting.Span.class);
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
            toHTML_6_wrapAnimatedEmoji(sb, spanned, i, nextSpanTransition);
            if (spanArr != null) {
                for (CodeHighlighting.Span span2 : spanArr) {
                    if (span2 != null) {
                        sb.append("</pre>");
                    }
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_6_wrapAnimatedEmoji(StringBuilder sb, Spanned spanned, int i, int i2) {
        while (i < i2) {
            int nextSpanTransition = spanned.nextSpanTransition(i, i2, AnimatedEmojiSpan.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = i2;
            }
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, nextSpanTransition, AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                    if (animatedEmojiSpan != null && !animatedEmojiSpan.standard) {
                        sb.append("<animated-emoji data-document-id=\"" + animatedEmojiSpan.documentId + "\">");
                    }
                }
            }
            toHTML_7_withinStyle(sb, spanned, i, nextSpanTransition);
            if (animatedEmojiSpanArr != null) {
                for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                    if (animatedEmojiSpan2 != null && !animatedEmojiSpan2.standard) {
                        sb.append("</animated-emoji>");
                    }
                }
            }
            i = nextSpanTransition;
        }
    }

    private static void toHTML_7_withinStyle(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        int i3;
        char charAt;
        while (i < i2) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == '\n') {
                sb.append("<br>");
            } else if (charAt2 == '<') {
                sb.append("&lt;");
            } else if (charAt2 == '>') {
                sb.append("&gt;");
            } else if (charAt2 == '&') {
                sb.append("&amp;");
            } else if (charAt2 < 55296 || charAt2 > 57343) {
                if (charAt2 > '~' || charAt2 < ' ') {
                    sb.append("&#");
                    sb.append((int) charAt2);
                    sb.append(";");
                } else if (charAt2 == ' ') {
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
                    sb.append(charAt2);
                }
            } else if (charAt2 < 56320 && (i3 = i + 1) < i2 && (charAt = charSequence.charAt(i3)) >= 56320 && charAt <= 57343) {
                sb.append("&#");
                sb.append(65536 | ((charAt2 - CharacterCompat.MIN_HIGH_SURROGATE) << 10) | (charAt - CharacterCompat.MIN_LOW_SURROGATE));
                sb.append(";");
                i = i3;
            }
            i++;
        }
    }
}
