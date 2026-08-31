package lf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.u5;
public abstract class q {
    public static void a(t01 t01Var, StringBuilder sb) {
        if (t01Var != null) {
            if ((t01Var.f31225a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((t01Var.f31225a & 1) > 0) {
                sb.append("<b>");
            }
            if ((t01Var.f31225a & 2) > 0) {
                sb.append("<i>");
            }
            if ((t01Var.f31225a & 16) > 0) {
                sb.append("<u>");
            }
            if ((t01Var.f31225a & 8) > 0) {
                sb.append("<s>");
            }
            if ((t01Var.f31225a & 128) > 0 && t01Var.d != null) {
                sb.append("<a href=\"");
                sb.append(t01Var.d.url);
                sb.append("\">");
            }
        }
    }

    public static void b(t01 t01Var, StringBuilder sb) {
        if (t01Var != null) {
            if ((t01Var.f31225a & 128) > 0 && t01Var.d != null) {
                sb.append("</a>");
            }
            if ((t01Var.f31225a & 8) > 0) {
                sb.append("</s>");
            }
            if ((t01Var.f31225a & 16) > 0) {
                sb.append("</u>");
            }
            if ((t01Var.f31225a & 2) > 0) {
                sb.append("</i>");
            }
            if ((t01Var.f31225a & 1) > 0) {
                sb.append("</b>");
            }
            if ((t01Var.f31225a & 768) > 0) {
                sb.append("</spoiler>");
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
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i15 = 0;
        while (i15 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, bj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            bj0[] bj0VarArr = (bj0[]) spanned.getSpans(i15, nextSpanTransition, bj0.class);
            if (bj0VarArr != null) {
                for (bj0 bj0Var : bj0VarArr) {
                    if (bj0Var.f25609e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, u01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                u01[] u01VarArr = (u01[]) spanned.getSpans(i15, nextSpanTransition2, u01.class);
                String str4 = "<pre>";
                if (u01VarArr != null) {
                    for (u01 u01Var : u01VarArr) {
                        if (u01Var != null) {
                            a(u01Var.f31513b, sb);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, p51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    p51[] p51VarArr = (p51[]) spanned.getSpans(i15, nextSpanTransition3, p51.class);
                    String str5 = "\">";
                    if (p51VarArr != null) {
                        for (p51 p51Var : p51VarArr) {
                            a(p51Var.f29971a, sb);
                            sb.append("<a href=\"");
                            sb.append(p51Var.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, m51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        m51[] m51VarArr = (m51[]) spanned.getSpans(i15, nextSpanTransition4, m51.class);
                        if (m51VarArr != null) {
                            for (m51 m51Var : m51VarArr) {
                                if (m51Var != null) {
                                    sb.append(str4);
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
                                            sb.append(str4);
                                        } else {
                                            sb.append("<pre lang=\"");
                                            sb.append(span.lng);
                                            sb.append(str5);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i10) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, u5.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                u5[] u5VarArr = (u5[]) spanned.getSpans(i21, i10, u5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (u5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < u5VarArr.length) {
                                        u5 u5Var = u5VarArr[i25];
                                        int i26 = i25;
                                        if (u5Var != null && !u5Var.standard) {
                                            str2 = str4;
                                            sb.append("<animated-emoji data-document-id=\"" + u5Var.documentId + str5);
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
                                        sb.append("<br>");
                                    } else if (charAt == '<') {
                                        sb.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb.append("&amp;");
                                    } else {
                                        i11 = i27;
                                        i12 = nextSpanTransition3;
                                        if (charAt >= 55296 && charAt <= 57343) {
                                            if (charAt < 56320 && (i14 = i11 + 1) < i10) {
                                                str = str5;
                                                char charAt2 = spanned.charAt(i14);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb.append("&#");
                                                    sb.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb.append(";");
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
                                                        sb.append("&nbsp;");
                                                        i13 = i28;
                                                    }
                                                    sb.append(' ');
                                                    i27 = i13 + 1;
                                                    nextSpanTransition3 = i12;
                                                    str5 = str;
                                                } else {
                                                    sb.append(charAt);
                                                }
                                            } else {
                                                sb.append("&#");
                                                sb.append((int) charAt);
                                                sb.append(";");
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
                                if (u5VarArr != null) {
                                    for (u5 u5Var2 : u5VarArr) {
                                        if (u5Var2 != null && !u5Var2.standard) {
                                            sb.append("</animated-emoji>");
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
                                        sb.append("</pre>");
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
                        if (m51VarArr != null) {
                            for (m51 m51Var2 : m51VarArr) {
                                if (m51Var2 != null) {
                                    sb.append("</pre>");
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
                    if (p51VarArr != null) {
                        for (p51 p51Var2 : p51VarArr) {
                            sb.append("</a>");
                            b(p51Var2.f29971a, sb);
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
                if (u01VarArr != null) {
                    for (u01 u01Var2 : u01VarArr) {
                        if (u01Var2 != null) {
                            b(u01Var2.f31513b, sb);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i15 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (bj0VarArr != null) {
                for (int length2 = bj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i44;
            i15 = i45;
        }
        return sb.toString();
    }
}
