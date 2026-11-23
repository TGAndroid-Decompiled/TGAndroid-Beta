package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.x5;
public abstract class s {
    public static void a(ez0 ez0Var, StringBuilder sb2) {
        if (ez0Var != null) {
            if ((ez0Var.f34924a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((ez0Var.f34924a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((ez0Var.f34924a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((ez0Var.f34924a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((ez0Var.f34924a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((ez0Var.f34924a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((ez0Var.f34924a & 128) > 0 && ez0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(ez0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(ez0 ez0Var, StringBuilder sb2) {
        if (ez0Var != null) {
            if ((ez0Var.f34924a & 128) > 0 && ez0Var.d != null) {
                sb2.append("</a>");
            }
            if ((ez0Var.f34924a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((ez0Var.f34924a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((ez0Var.f34924a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((ez0Var.f34924a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((ez0Var.f34924a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((ez0Var.f34924a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, ih0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ih0[] ih0VarArr = (ih0[]) spanned.getSpans(i15, nextSpanTransition, ih0.class);
            if (ih0VarArr != null) {
                for (ih0 ih0Var : ih0VarArr) {
                    if (ih0Var.f36014e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, fz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                fz0[] fz0VarArr = (fz0[]) spanned.getSpans(i15, nextSpanTransition2, fz0.class);
                String str4 = "<pre>";
                if (fz0VarArr != null) {
                    for (fz0 fz0Var : fz0VarArr) {
                        if (fz0Var != null) {
                            a(fz0Var.f35240b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, t41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    t41[] t41VarArr = (t41[]) spanned.getSpans(i15, nextSpanTransition3, t41.class);
                    String str5 = "\">";
                    if (t41VarArr != null) {
                        for (t41 t41Var : t41VarArr) {
                            a(t41Var.f39795a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(t41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, q41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        q41[] q41VarArr = (q41[]) spanned.getSpans(i15, nextSpanTransition4, q41.class);
                        if (q41VarArr != null) {
                            for (q41 q41Var : q41VarArr) {
                                if (q41Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, qi.g.class);
                            int i16 = length;
                            if (nextSpanTransition5 < 0) {
                                i7 = nextSpanTransition4;
                            } else {
                                i7 = nextSpanTransition5;
                            }
                            qi.g[] gVarArr = (qi.g[]) spanned.getSpans(i15, i7, qi.g.class);
                            int i17 = i15;
                            int i18 = nextSpanTransition;
                            if (gVarArr != null) {
                                int i19 = 0;
                                while (i19 < gVarArr.length) {
                                    qi.g gVar = gVarArr[i19];
                                    if (gVar != null) {
                                        String str6 = gVar.f56302a;
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i7, x5.class);
                                int i21 = i7;
                                if (nextSpanTransition6 >= 0) {
                                    i7 = nextSpanTransition6;
                                }
                                x5[] x5VarArr = (x5[]) spanned.getSpans(i20, i7, x5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (x5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < x5VarArr.length) {
                                        x5 x5Var = x5VarArr[i24];
                                        int i25 = i24;
                                        if (x5Var != null && !x5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + x5Var.documentId + str5);
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
                                if (x5VarArr != null) {
                                    for (x5 x5Var2 : x5VarArr) {
                                        if (x5Var2 != null && !x5Var2.standard) {
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
                            if (gVarArr != null) {
                                for (qi.g gVar2 : gVarArr) {
                                    if (gVar2 != null) {
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
                        if (q41VarArr != null) {
                            for (q41 q41Var2 : q41VarArr) {
                                if (q41Var2 != null) {
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
                    if (t41VarArr != null) {
                        for (t41 t41Var2 : t41VarArr) {
                            sb2.append("</a>");
                            b(t41Var2.f39795a, sb2);
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
                if (fz0VarArr != null) {
                    for (fz0 fz0Var2 : fz0VarArr) {
                        if (fz0Var2 != null) {
                            b(fz0Var2.f35240b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i15 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (ih0VarArr != null) {
                for (int length2 = ih0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i15 = i44;
        }
        return sb2.toString();
    }
}
