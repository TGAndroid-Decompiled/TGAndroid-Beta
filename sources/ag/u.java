package ag;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z61;
public abstract class u {
    public static void a(y11 y11Var, StringBuilder sb2) {
        if (y11Var != null) {
            if ((y11Var.f34904a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((y11Var.f34904a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((y11Var.f34904a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((y11Var.f34904a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((y11Var.f34904a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((y11Var.f34904a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((y11Var.f34904a & 128) > 0 && y11Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(y11Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(y11 y11Var, StringBuilder sb2) {
        if (y11Var != null) {
            if ((y11Var.f34904a & 128) > 0 && y11Var.d != null) {
                sb2.append("</a>");
            }
            if ((y11Var.f34904a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((y11Var.f34904a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((y11Var.f34904a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((y11Var.f34904a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((y11Var.f34904a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((y11Var.f34904a & 768) > 0) {
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
        int i15;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i16 = 0;
        while (i16 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i16, length, sj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            sj0[] sj0VarArr = (sj0[]) spanned.getSpans(i16, nextSpanTransition, sj0.class);
            if (sj0VarArr != null) {
                for (sj0 sj0Var : sj0VarArr) {
                    if (sj0Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i16 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i16, nextSpanTransition, z11.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                z11[] z11VarArr = (z11[]) spanned.getSpans(i16, nextSpanTransition2, z11.class);
                String str4 = "<pre>";
                if (z11VarArr != null) {
                    for (z11 z11Var : z11VarArr) {
                        if (z11Var != null) {
                            a(z11Var.f35178b, sb2);
                        }
                    }
                }
                while (i16 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i16, nextSpanTransition2, z61.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    z61[] z61VarArr = (z61[]) spanned.getSpans(i16, nextSpanTransition3, z61.class);
                    String str5 = "\">";
                    if (z61VarArr != null) {
                        for (z61 z61Var : z61VarArr) {
                            a(z61Var.f35230a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(z61Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i16 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i16, nextSpanTransition3, w61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        w61[] w61VarArr = (w61[]) spanned.getSpans(i16, nextSpanTransition4, w61.class);
                        if (w61VarArr != null) {
                            for (w61 w61Var : w61VarArr) {
                                if (w61Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i16 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i16, nextSpanTransition4, ni.h.class);
                            int i17 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            ni.h[] hVarArr = (ni.h[]) spanned.getSpans(i16, i10, ni.h.class);
                            int i18 = i16;
                            int i19 = nextSpanTransition;
                            if (hVarArr != null) {
                                int i20 = 0;
                                while (i20 < hVarArr.length) {
                                    ni.h hVar = hVarArr[i20];
                                    if (hVar != null) {
                                        String str6 = hVar.f18879a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb2.append(str4);
                                        } else {
                                            i15 = i20;
                                            sb2.append("<pre lang=\"");
                                            sb2.append(str6);
                                            sb2.append(str5);
                                            i20 = i15 + 1;
                                        }
                                    }
                                    i15 = i20;
                                    i20 = i15 + 1;
                                }
                            }
                            int i21 = i18;
                            while (i21 < i10) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, c6.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                c6[] c6VarArr = (c6[]) spanned.getSpans(i21, i10, c6.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (c6VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < c6VarArr.length) {
                                        c6 c6Var = c6VarArr[i25];
                                        int i26 = i25;
                                        if (c6Var != null && !c6Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + c6Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i25 = i26 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str7 = str4;
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
                                String str8 = str5;
                                if (c6VarArr != null) {
                                    for (c6 c6Var2 : c6VarArr) {
                                        if (c6Var2 != null && !c6Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i10;
                                i10 = i22;
                                nextSpanTransition2 = i24;
                                str4 = str7;
                                nextSpanTransition3 = i29;
                                str5 = str8;
                            }
                            int i30 = i10;
                            int i31 = nextSpanTransition2;
                            String str9 = str4;
                            int i32 = nextSpanTransition3;
                            String str10 = str5;
                            if (hVarArr != null) {
                                for (ni.h hVar2 : hVarArr) {
                                    if (hVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i17;
                            nextSpanTransition = i19;
                            i16 = i30;
                            nextSpanTransition2 = i31;
                            str4 = str9;
                            nextSpanTransition3 = i32;
                            str5 = str10;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str11 = str4;
                        int i36 = nextSpanTransition3;
                        String str12 = str5;
                        if (w61VarArr != null) {
                            for (w61 w61Var2 : w61VarArr) {
                                if (w61Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i16 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str4 = str11;
                        nextSpanTransition3 = i36;
                        str5 = str12;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str13 = str4;
                    int i40 = nextSpanTransition3;
                    if (z61VarArr != null) {
                        for (z61 z61Var2 : z61VarArr) {
                            sb2.append("</a>");
                            b(z61Var2.f35230a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str4 = str13;
                    i16 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (z11VarArr != null) {
                    for (z11 z11Var2 : z11VarArr) {
                        if (z11Var2 != null) {
                            b(z11Var2.f35178b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i16 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (sj0VarArr != null) {
                for (int length2 = sj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i16 = i45;
        }
        return sb2.toString();
    }
}
