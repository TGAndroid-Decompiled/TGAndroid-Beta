package jf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z41;
public abstract class q {
    public static void a(h01 h01Var, StringBuilder sb2) {
        if (h01Var != null) {
            if ((h01Var.f29024a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((h01Var.f29024a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((h01Var.f29024a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((h01Var.f29024a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((h01Var.f29024a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((h01Var.f29024a & 128) > 0 && h01Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(h01Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(h01 h01Var, StringBuilder sb2) {
        if (h01Var != null) {
            if ((h01Var.f29024a & 128) > 0 && h01Var.d != null) {
                sb2.append("</a>");
            }
            if ((h01Var.f29024a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((h01Var.f29024a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((h01Var.f29024a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((h01Var.f29024a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((h01Var.f29024a & 768) > 0) {
                sb2.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i15 = 0;
        while (i15 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, qi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            qi0[] qi0VarArr = (qi0[]) spanned.getSpans(i15, nextSpanTransition, qi0.class);
            if (qi0VarArr != null) {
                for (qi0 qi0Var : qi0VarArr) {
                    if (qi0Var.f31959e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, i01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                i01[] i01VarArr = (i01[]) spanned.getSpans(i15, nextSpanTransition2, i01.class);
                String str4 = "<pre>";
                if (i01VarArr != null) {
                    for (i01 i01Var : i01VarArr) {
                        if (i01Var != null) {
                            a(i01Var.f29294b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, c51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    c51[] c51VarArr = (c51[]) spanned.getSpans(i15, nextSpanTransition3, c51.class);
                    String str5 = "\">";
                    if (c51VarArr != null) {
                        for (c51 c51Var : c51VarArr) {
                            a(c51Var.f27311a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(c51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, z41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        z41[] z41VarArr = (z41[]) spanned.getSpans(i15, nextSpanTransition4, z41.class);
                        if (z41VarArr != null) {
                            for (z41 z41Var : z41VarArr) {
                                if (z41Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i16 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i15, i10, CodeHighlighting.Span.class);
                            int i17 = i15;
                            int i18 = nextSpanTransition;
                            if (spanArr != null) {
                                int i19 = 0;
                                while (i19 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i19];
                                    int i20 = i19;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str4);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str5);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i10) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, y5.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                y5[] y5VarArr = (y5[]) spanned.getSpans(i21, i10, y5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (y5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < y5VarArr.length) {
                                        y5 y5Var = y5VarArr[i25];
                                        int i26 = i25;
                                        if (y5Var != null && !y5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + y5Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i25 = i26 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str6 = str4;
                                int i27 = i23;
                                while (i27 < i10) {
                                    char charAt = spanned.charAt(i27);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i11 = i27;
                                        i12 = nextSpanTransition3;
                                        if (charAt >= 55296 && charAt <= 57343) {
                                            if (charAt < 56320 && (i14 = i11 + 1) < i10) {
                                                str = str5;
                                                char charAt2 = spanned.charAt(i14);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb2.append("&#");
                                                    sb2.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb2.append(";");
                                                    i13 = i14;
                                                    i27 = i13 + 1;
                                                    nextSpanTransition3 = i12;
                                                    str5 = str;
                                                }
                                                i13 = i11;
                                                i27 = i13 + 1;
                                                nextSpanTransition3 = i12;
                                                str5 = str;
                                            }
                                            str = str5;
                                            i13 = i11;
                                            i27 = i13 + 1;
                                            nextSpanTransition3 = i12;
                                            str5 = str;
                                        } else {
                                            str = str5;
                                            if (charAt <= '~' && charAt >= ' ') {
                                                if (charAt == ' ') {
                                                    i13 = i11;
                                                    while (true) {
                                                        int i28 = i13 + 1;
                                                        if (i28 >= i10 || spanned.charAt(i28) != ' ') {
                                                            break;
                                                        }
                                                        sb2.append("&nbsp;");
                                                        i13 = i28;
                                                    }
                                                    sb2.append(' ');
                                                    i27 = i13 + 1;
                                                    nextSpanTransition3 = i12;
                                                    str5 = str;
                                                } else {
                                                    sb2.append(charAt);
                                                }
                                            } else {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            }
                                            i13 = i11;
                                            i27 = i13 + 1;
                                            nextSpanTransition3 = i12;
                                            str5 = str;
                                        }
                                    }
                                    i11 = i27;
                                    i12 = nextSpanTransition3;
                                    str = str5;
                                    i13 = i11;
                                    i27 = i13 + 1;
                                    nextSpanTransition3 = i12;
                                    str5 = str;
                                }
                                int i29 = nextSpanTransition3;
                                String str7 = str5;
                                if (y5VarArr != null) {
                                    for (y5 y5Var2 : y5VarArr) {
                                        if (y5Var2 != null && !y5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i10;
                                i10 = i22;
                                nextSpanTransition2 = i24;
                                str4 = str6;
                                nextSpanTransition3 = i29;
                                str5 = str7;
                            }
                            int i30 = i10;
                            int i31 = nextSpanTransition2;
                            String str8 = str4;
                            int i32 = nextSpanTransition3;
                            String str9 = str5;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i16;
                            nextSpanTransition = i18;
                            i15 = i30;
                            nextSpanTransition2 = i31;
                            str4 = str8;
                            nextSpanTransition3 = i32;
                            str5 = str9;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str10 = str4;
                        int i36 = nextSpanTransition3;
                        String str11 = str5;
                        if (z41VarArr != null) {
                            for (z41 z41Var2 : z41VarArr) {
                                if (z41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i15 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str4 = str10;
                        nextSpanTransition3 = i36;
                        str5 = str11;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str12 = str4;
                    int i40 = nextSpanTransition3;
                    if (c51VarArr != null) {
                        for (c51 c51Var2 : c51VarArr) {
                            sb2.append("</a>");
                            b(c51Var2.f27311a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str4 = str12;
                    i15 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (i01VarArr != null) {
                    for (i01 i01Var2 : i01VarArr) {
                        if (i01Var2 != null) {
                            b(i01Var2.f29294b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i15 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (qi0VarArr != null) {
                for (int length2 = qi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i15 = i45;
        }
        return sb2.toString();
    }
}
