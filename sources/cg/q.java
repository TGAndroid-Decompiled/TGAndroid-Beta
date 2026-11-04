package cg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xg0;
public abstract class q {
    public static void a(ty0 ty0Var, StringBuilder sb2) {
        if (ty0Var != null) {
            if ((ty0Var.f38578a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((ty0Var.f38578a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((ty0Var.f38578a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((ty0Var.f38578a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((ty0Var.f38578a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((ty0Var.f38578a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((ty0Var.f38578a & 128) > 0 && ty0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(ty0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(ty0 ty0Var, StringBuilder sb2) {
        if (ty0Var != null) {
            if ((ty0Var.f38578a & 128) > 0 && ty0Var.d != null) {
                sb2.append("</a>");
            }
            if ((ty0Var.f38578a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((ty0Var.f38578a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((ty0Var.f38578a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((ty0Var.f38578a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((ty0Var.f38578a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((ty0Var.f38578a & 768) > 0) {
                sb2.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i3;
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
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, xg0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            xg0[] xg0VarArr = (xg0[]) spanned.getSpans(i15, nextSpanTransition, xg0.class);
            if (xg0VarArr != null) {
                for (xg0 xg0Var : xg0VarArr) {
                    if (xg0Var.f40357e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, uy0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                uy0[] uy0VarArr = (uy0[]) spanned.getSpans(i15, nextSpanTransition2, uy0.class);
                String str4 = "<pre>";
                if (uy0VarArr != null) {
                    for (uy0 uy0Var : uy0VarArr) {
                        if (uy0Var != null) {
                            a(uy0Var.f38912b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, x31.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    x31[] x31VarArr = (x31[]) spanned.getSpans(i15, nextSpanTransition3, x31.class);
                    String str5 = "\">";
                    if (x31VarArr != null) {
                        for (x31 x31Var : x31VarArr) {
                            a(x31Var.f40213a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(x31Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, u31.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        u31[] u31VarArr = (u31[]) spanned.getSpans(i15, nextSpanTransition4, u31.class);
                        if (u31VarArr != null) {
                            for (u31 u31Var : u31VarArr) {
                                if (u31Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, oi.h.class);
                            int i16 = length;
                            if (nextSpanTransition5 < 0) {
                                i3 = nextSpanTransition4;
                            } else {
                                i3 = nextSpanTransition5;
                            }
                            oi.h[] hVarArr = (oi.h[]) spanned.getSpans(i15, i3, oi.h.class);
                            int i17 = i15;
                            int i18 = nextSpanTransition;
                            if (hVarArr != null) {
                                int i19 = 0;
                                while (i19 < hVarArr.length) {
                                    oi.h hVar = hVarArr[i19];
                                    if (hVar != null) {
                                        String str6 = hVar.f21141a;
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
                            while (i20 < i3) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i3, p5.class);
                                int i21 = i3;
                                if (nextSpanTransition6 >= 0) {
                                    i3 = nextSpanTransition6;
                                }
                                p5[] p5VarArr = (p5[]) spanned.getSpans(i20, i3, p5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (p5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < p5VarArr.length) {
                                        p5 p5Var = p5VarArr[i24];
                                        int i25 = i24;
                                        if (p5Var != null && !p5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + p5Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i24 = i25 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str7 = str4;
                                int i26 = i22;
                                while (i26 < i3) {
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
                                            if (charAt < 56320 && (i13 = i10 + 1) < i3) {
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
                                                        if (i27 >= i3 || spanned.charAt(i27) != ' ') {
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
                                if (p5VarArr != null) {
                                    for (p5 p5Var2 : p5VarArr) {
                                        if (p5Var2 != null && !p5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i20 = i3;
                                i3 = i21;
                                nextSpanTransition2 = i23;
                                str4 = str7;
                                nextSpanTransition3 = i28;
                                str5 = str8;
                            }
                            int i29 = i3;
                            int i30 = nextSpanTransition2;
                            String str9 = str4;
                            int i31 = nextSpanTransition3;
                            String str10 = str5;
                            if (hVarArr != null) {
                                for (oi.h hVar2 : hVarArr) {
                                    if (hVar2 != null) {
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
                        if (u31VarArr != null) {
                            for (u31 u31Var2 : u31VarArr) {
                                if (u31Var2 != null) {
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
                    if (x31VarArr != null) {
                        for (x31 x31Var2 : x31VarArr) {
                            sb2.append("</a>");
                            b(x31Var2.f40213a, sb2);
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
                if (uy0VarArr != null) {
                    for (uy0 uy0Var2 : uy0VarArr) {
                        if (uy0Var2 != null) {
                            b(uy0Var2.f38912b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i15 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (xg0VarArr != null) {
                for (int length2 = xg0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i15 = i44;
        }
        return sb2.toString();
    }
}
