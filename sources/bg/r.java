package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
public abstract class r {
    public static void a(uy0 uy0Var, StringBuilder sb2) {
        if (uy0Var != null) {
            if ((uy0Var.f38751a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((uy0Var.f38751a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((uy0Var.f38751a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((uy0Var.f38751a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((uy0Var.f38751a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((uy0Var.f38751a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((uy0Var.f38751a & 128) > 0 && uy0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(uy0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(uy0 uy0Var, StringBuilder sb2) {
        if (uy0Var != null) {
            if ((uy0Var.f38751a & 128) > 0 && uy0Var.d != null) {
                sb2.append("</a>");
            }
            if ((uy0Var.f38751a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((uy0Var.f38751a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((uy0Var.f38751a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((uy0Var.f38751a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((uy0Var.f38751a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((uy0Var.f38751a & 768) > 0) {
                sb2.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        int i14;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i15 = 0;
        while (i15 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, ug0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ug0[] ug0VarArr = (ug0[]) spanned.getSpans(i15, nextSpanTransition, ug0.class);
            if (ug0VarArr != null) {
                for (ug0 ug0Var : ug0VarArr) {
                    if (ug0Var.f38623e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, vy0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                vy0[] vy0VarArr = (vy0[]) spanned.getSpans(i15, nextSpanTransition2, vy0.class);
                String str4 = "<pre>";
                if (vy0VarArr != null) {
                    for (vy0 vy0Var : vy0VarArr) {
                        if (vy0Var != null) {
                            a(vy0Var.f39784b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, d41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    d41[] d41VarArr = (d41[]) spanned.getSpans(i15, nextSpanTransition3, d41.class);
                    String str5 = "\">";
                    if (d41VarArr != null) {
                        for (d41 d41Var : d41VarArr) {
                            a(d41Var.f32778a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(d41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, a41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        a41[] a41VarArr = (a41[]) spanned.getSpans(i15, nextSpanTransition4, a41.class);
                        if (a41VarArr != null) {
                            for (a41 a41Var : a41VarArr) {
                                if (a41Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, ni.j.class);
                            int i16 = length;
                            if (nextSpanTransition5 < 0) {
                                i7 = nextSpanTransition4;
                            } else {
                                i7 = nextSpanTransition5;
                            }
                            ni.j[] jVarArr = (ni.j[]) spanned.getSpans(i15, i7, ni.j.class);
                            int i17 = i15;
                            int i18 = nextSpanTransition;
                            if (jVarArr != null) {
                                int i19 = 0;
                                while (i19 < jVarArr.length) {
                                    ni.j jVar = jVarArr[i19];
                                    if (jVar != null) {
                                        String str6 = jVar.f20624a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb2.append(str4);
                                        } else {
                                            i14 = i19;
                                            sb2.append("<pre lang=\"");
                                            sb2.append(str6);
                                            sb2.append(str5);
                                            i19 = i14 + 1;
                                        }
                                    }
                                    i14 = i19;
                                    i19 = i14 + 1;
                                }
                            }
                            int i20 = i17;
                            while (i20 < i7) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i7, r5.class);
                                int i21 = i7;
                                if (nextSpanTransition6 >= 0) {
                                    i7 = nextSpanTransition6;
                                }
                                r5[] r5VarArr = (r5[]) spanned.getSpans(i20, i7, r5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (r5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < r5VarArr.length) {
                                        r5 r5Var = r5VarArr[i24];
                                        int i25 = i24;
                                        if (r5Var != null && !r5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + r5Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i24 = i25 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str7 = str4;
                                int i26 = i22;
                                while (i26 < i7) {
                                    char charAt = spanned.charAt(i26);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i10 = i26;
                                        i11 = nextSpanTransition3;
                                        if (charAt >= 55296 && charAt <= 57343) {
                                            if (charAt < 56320 && (i13 = i10 + 1) < i7) {
                                                str = str5;
                                                char charAt2 = spanned.charAt(i13);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb2.append("&#");
                                                    sb2.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb2.append(";");
                                                    i12 = i13;
                                                    i26 = i12 + 1;
                                                    nextSpanTransition3 = i11;
                                                    str5 = str;
                                                }
                                                i12 = i10;
                                                i26 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str5 = str;
                                            }
                                            str = str5;
                                            i12 = i10;
                                            i26 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str5 = str;
                                        } else {
                                            str = str5;
                                            if (charAt <= '~' && charAt >= ' ') {
                                                if (charAt == ' ') {
                                                    i12 = i10;
                                                    while (true) {
                                                        int i27 = i12 + 1;
                                                        if (i27 >= i7 || spanned.charAt(i27) != ' ') {
                                                            break;
                                                        }
                                                        sb2.append("&nbsp;");
                                                        i12 = i27;
                                                    }
                                                    sb2.append(' ');
                                                    i26 = i12 + 1;
                                                    nextSpanTransition3 = i11;
                                                    str5 = str;
                                                } else {
                                                    sb2.append(charAt);
                                                }
                                            } else {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            }
                                            i12 = i10;
                                            i26 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str5 = str;
                                        }
                                    }
                                    i10 = i26;
                                    i11 = nextSpanTransition3;
                                    str = str5;
                                    i12 = i10;
                                    i26 = i12 + 1;
                                    nextSpanTransition3 = i11;
                                    str5 = str;
                                }
                                int i28 = nextSpanTransition3;
                                String str8 = str5;
                                if (r5VarArr != null) {
                                    for (r5 r5Var2 : r5VarArr) {
                                        if (r5Var2 != null && !r5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i20 = i7;
                                i7 = i21;
                                nextSpanTransition2 = i23;
                                str4 = str7;
                                nextSpanTransition3 = i28;
                                str5 = str8;
                            }
                            int i29 = i7;
                            int i30 = nextSpanTransition2;
                            String str9 = str4;
                            int i31 = nextSpanTransition3;
                            String str10 = str5;
                            if (jVarArr != null) {
                                for (ni.j jVar2 : jVarArr) {
                                    if (jVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i16;
                            nextSpanTransition = i18;
                            i15 = i29;
                            nextSpanTransition2 = i30;
                            str4 = str9;
                            nextSpanTransition3 = i31;
                            str5 = str10;
                        }
                        int i32 = length;
                        int i33 = nextSpanTransition;
                        int i34 = nextSpanTransition2;
                        String str11 = str4;
                        int i35 = nextSpanTransition3;
                        String str12 = str5;
                        if (a41VarArr != null) {
                            for (a41 a41Var2 : a41VarArr) {
                                if (a41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i15 = nextSpanTransition4;
                        length = i32;
                        nextSpanTransition = i33;
                        nextSpanTransition2 = i34;
                        str4 = str11;
                        nextSpanTransition3 = i35;
                        str5 = str12;
                    }
                    int i36 = length;
                    int i37 = nextSpanTransition;
                    int i38 = nextSpanTransition2;
                    String str13 = str4;
                    int i39 = nextSpanTransition3;
                    if (d41VarArr != null) {
                        for (d41 d41Var2 : d41VarArr) {
                            sb2.append("</a>");
                            b(d41Var2.f32778a, sb2);
                        }
                    }
                    length = i36;
                    nextSpanTransition = i37;
                    nextSpanTransition2 = i38;
                    str4 = str13;
                    i15 = i39;
                }
                int i40 = length;
                int i41 = nextSpanTransition;
                int i42 = nextSpanTransition2;
                if (vy0VarArr != null) {
                    for (vy0 vy0Var2 : vy0VarArr) {
                        if (vy0Var2 != null) {
                            b(vy0Var2.f39784b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i15 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (ug0VarArr != null) {
                for (int length2 = ug0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i15 = i44;
        }
        return sb2.toString();
    }
}
