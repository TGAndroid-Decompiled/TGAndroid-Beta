package gf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public abstract class r {
    public static void a(xz0 xz0Var, StringBuilder sb2) {
        if (xz0Var == null) {
            return;
        }
        if ((xz0Var.f34734a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((xz0Var.f34734a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((xz0Var.f34734a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((xz0Var.f34734a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((xz0Var.f34734a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((xz0Var.f34734a & 128) <= 0 || xz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(xz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(xz0 xz0Var, StringBuilder sb2) {
        if (xz0Var == null) {
            return;
        }
        if ((xz0Var.f34734a & 128) > 0 && xz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((xz0Var.f34734a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((xz0Var.f34734a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((xz0Var.f34734a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((xz0Var.f34734a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((xz0Var.f34734a & 768) > 0) {
            sb2.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int iNextSpanTransition = spanned.nextSpanTransition(i14, length, hi0.class);
            if (iNextSpanTransition < 0) {
                iNextSpanTransition = length;
            }
            hi0[] hi0VarArr = (hi0[]) spanned.getSpans(i14, iNextSpanTransition, hi0.class);
            if (hi0VarArr != null) {
                for (hi0 hi0Var : hi0VarArr) {
                    sb2.append(hi0Var.f29029e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < iNextSpanTransition) {
                int iNextSpanTransition2 = spanned.nextSpanTransition(i14, iNextSpanTransition, yz0.class);
                if (iNextSpanTransition2 < 0) {
                    iNextSpanTransition2 = iNextSpanTransition;
                }
                yz0[] yz0VarArr = (yz0[]) spanned.getSpans(i14, iNextSpanTransition2, yz0.class);
                String str2 = "<pre>";
                if (yz0VarArr != null) {
                    for (yz0 yz0Var : yz0VarArr) {
                        if (yz0Var != null) {
                            a(yz0Var.f35101b, sb2);
                        }
                    }
                }
                while (i14 < iNextSpanTransition2) {
                    int iNextSpanTransition3 = spanned.nextSpanTransition(i14, iNextSpanTransition2, t41.class);
                    if (iNextSpanTransition3 < 0) {
                        iNextSpanTransition3 = iNextSpanTransition2;
                    }
                    t41[] t41VarArr = (t41[]) spanned.getSpans(i14, iNextSpanTransition3, t41.class);
                    String str3 = "\">";
                    if (t41VarArr != null) {
                        for (t41 t41Var : t41VarArr) {
                            a(t41Var.f32651a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(t41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < iNextSpanTransition3) {
                        int iNextSpanTransition4 = spanned.nextSpanTransition(i14, iNextSpanTransition3, q41.class);
                        if (iNextSpanTransition4 < 0) {
                            iNextSpanTransition4 = iNextSpanTransition3;
                        }
                        q41[] q41VarArr = (q41[]) spanned.getSpans(i14, iNextSpanTransition4, q41.class);
                        if (q41VarArr != null) {
                            for (q41 q41Var : q41VarArr) {
                                if (q41Var != null) {
                                    sb2.append(str2);
                                }
                            }
                        }
                        while (i14 < iNextSpanTransition4) {
                            int iNextSpanTransition5 = spanned.nextSpanTransition(i14, iNextSpanTransition4, CodeHighlighting.Span.class);
                            int i15 = length;
                            int i16 = iNextSpanTransition5 < 0 ? iNextSpanTransition4 : iNextSpanTransition5;
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i14, i16, CodeHighlighting.Span.class);
                            int i17 = i14;
                            int i18 = iNextSpanTransition;
                            if (spanArr != null) {
                                int i19 = 0;
                                while (i19 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i19];
                                    int i20 = i19;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str2);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str3);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i16) {
                                int iNextSpanTransition6 = spanned.nextSpanTransition(i21, i16, t5.class);
                                int i22 = i16;
                                if (iNextSpanTransition6 >= 0) {
                                    i16 = iNextSpanTransition6;
                                }
                                t5[] t5VarArr = (t5[]) spanned.getSpans(i21, i16, t5.class);
                                int i23 = i21;
                                int i24 = iNextSpanTransition2;
                                if (t5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < t5VarArr.length) {
                                        t5 t5Var = t5VarArr[i25];
                                        int i26 = i25;
                                        if (t5Var != null && !t5Var.standard) {
                                            sb2.append("<animated-emoji data-document-id=\"" + t5Var.documentId + str3);
                                        }
                                        i25 = i26 + 1;
                                        str2 = str2;
                                    }
                                }
                                String str4 = str2;
                                int i27 = i23;
                                while (i27 < i16) {
                                    char cCharAt = spanned.charAt(i27);
                                    if (cCharAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (cCharAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (cCharAt == '>') {
                                        sb2.append("&gt;");
                                    } else {
                                        if (cCharAt == '&') {
                                            sb2.append("&amp;");
                                        } else {
                                            i10 = i27;
                                            i11 = iNextSpanTransition3;
                                            if (cCharAt < 55296 || cCharAt > 57343) {
                                                str = str3;
                                                if (cCharAt > '~' || cCharAt < ' ') {
                                                    sb2.append("&#");
                                                    sb2.append((int) cCharAt);
                                                    sb2.append(";");
                                                } else if (cCharAt == ' ') {
                                                    i12 = i10;
                                                    while (true) {
                                                        int i28 = i12 + 1;
                                                        if (i28 >= i16 || spanned.charAt(i28) != ' ') {
                                                            break;
                                                        }
                                                        sb2.append("&nbsp;");
                                                        i12 = i28;
                                                    }
                                                    sb2.append(' ');
                                                } else {
                                                    sb2.append(cCharAt);
                                                }
                                                i12 = i10;
                                            } else {
                                                if (cCharAt >= 56320 || (i13 = i10 + 1) >= i16) {
                                                    str = str3;
                                                } else {
                                                    str = str3;
                                                    char cCharAt2 = spanned.charAt(i13);
                                                    if (cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                                                        sb2.append("&#");
                                                        sb2.append(((cCharAt - 55296) << 10) | 65536 | (cCharAt2 - 56320));
                                                        sb2.append(";");
                                                        i12 = i13;
                                                    }
                                                }
                                                i12 = i10;
                                            }
                                        }
                                        i27 = i12 + 1;
                                        iNextSpanTransition3 = i11;
                                        str3 = str;
                                    }
                                    i10 = i27;
                                    i11 = iNextSpanTransition3;
                                    str = str3;
                                    i12 = i10;
                                    i27 = i12 + 1;
                                    iNextSpanTransition3 = i11;
                                    str3 = str;
                                }
                                int i29 = iNextSpanTransition3;
                                String str5 = str3;
                                if (t5VarArr != null) {
                                    for (t5 t5Var2 : t5VarArr) {
                                        if (t5Var2 != null && !t5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i16;
                                i16 = i22;
                                iNextSpanTransition2 = i24;
                                str2 = str4;
                                iNextSpanTransition3 = i29;
                                str3 = str5;
                            }
                            int i30 = i16;
                            int i31 = iNextSpanTransition2;
                            String str6 = str2;
                            int i32 = iNextSpanTransition3;
                            String str7 = str3;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i15;
                            iNextSpanTransition = i18;
                            i14 = i30;
                            iNextSpanTransition2 = i31;
                            str2 = str6;
                            iNextSpanTransition3 = i32;
                            str3 = str7;
                        }
                        int i33 = length;
                        int i34 = iNextSpanTransition;
                        int i35 = iNextSpanTransition2;
                        String str8 = str2;
                        int i36 = iNextSpanTransition3;
                        String str9 = str3;
                        if (q41VarArr != null) {
                            for (q41 q41Var2 : q41VarArr) {
                                if (q41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i14 = iNextSpanTransition4;
                        length = i33;
                        iNextSpanTransition = i34;
                        iNextSpanTransition2 = i35;
                        str2 = str8;
                        iNextSpanTransition3 = i36;
                        str3 = str9;
                    }
                    int i37 = length;
                    int i38 = iNextSpanTransition;
                    int i39 = iNextSpanTransition2;
                    String str10 = str2;
                    int i40 = iNextSpanTransition3;
                    if (t41VarArr != null) {
                        for (t41 t41Var2 : t41VarArr) {
                            sb2.append("</a>");
                            b(t41Var2.f32651a, sb2);
                        }
                    }
                    length = i37;
                    iNextSpanTransition = i38;
                    iNextSpanTransition2 = i39;
                    str2 = str10;
                    i14 = i40;
                }
                int i41 = length;
                int i42 = iNextSpanTransition;
                int i43 = iNextSpanTransition2;
                if (yz0VarArr != null) {
                    for (yz0 yz0Var2 : yz0VarArr) {
                        if (yz0Var2 != null) {
                            b(yz0Var2.f35101b, sb2);
                        }
                    }
                }
                length = i41;
                iNextSpanTransition = i42;
                i14 = i43;
            }
            int i44 = length;
            int i45 = iNextSpanTransition;
            if (hi0VarArr != null) {
                for (int length2 = hi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i14 = i45;
        }
        return sb2.toString();
    }
}
