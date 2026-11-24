package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
public abstract class y53 {
    public static void a(wkb wkbVar, StringBuilder sb) {
        if (wkbVar != null) {
            if ((wkbVar.a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((wkbVar.a & 1) > 0) {
                sb.append("<b>");
            }
            if ((wkbVar.a & 2) > 0) {
                sb.append("<i>");
            }
            if ((wkbVar.a & 16) > 0) {
                sb.append("<u>");
            }
            if ((wkbVar.a & 8) > 0) {
                sb.append("<s>");
            }
            if ((wkbVar.a & 4) > 0) {
                sb.append("<code>");
            }
            if ((wkbVar.a & 128) > 0 && wkbVar.d != null) {
                sb.append("<a href=\"");
                sb.append(wkbVar.d.url);
                sb.append("\">");
            }
        }
    }

    public static void b(wkb wkbVar, StringBuilder sb) {
        if (wkbVar != null) {
            if ((wkbVar.a & 128) > 0 && wkbVar.d != null) {
                sb.append("</a>");
            }
            if ((wkbVar.a & 4) > 0) {
                sb.append("</code>");
            }
            if ((wkbVar.a & 8) > 0) {
                sb.append("</s>");
            }
            if ((wkbVar.a & 16) > 0) {
                sb.append("</u>");
            }
            if ((wkbVar.a & 2) > 0) {
                sb.append("</i>");
            }
            if ((wkbVar.a & 1) > 0) {
                sb.append("</b>");
            }
            if ((wkbVar.a & 768) > 0) {
                sb.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        int i6;
        String str3;
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i7 = 0;
        while (i7 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i7, length, f09.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            f09[] f09VarArr = (f09[]) spanned.getSpans(i7, nextSpanTransition, f09.class);
            if (f09VarArr != null) {
                for (f09 f09Var : f09VarArr) {
                    if (f09Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb.append(str3);
                }
            }
            while (i7 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i7, nextSpanTransition, xkb.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                xkb[] xkbVarArr = (xkb[]) spanned.getSpans(i7, nextSpanTransition2, xkb.class);
                String str4 = "<pre>";
                if (xkbVarArr != null) {
                    for (xkb xkbVar : xkbVarArr) {
                        if (xkbVar != null) {
                            a(xkbVar.b, sb);
                        }
                    }
                }
                while (i7 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i7, nextSpanTransition2, i6c.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    i6c[] i6cVarArr = (i6c[]) spanned.getSpans(i7, nextSpanTransition3, i6c.class);
                    String str5 = "\">";
                    if (i6cVarArr != null) {
                        for (i6c i6cVar : i6cVarArr) {
                            a(i6cVar.a, sb);
                            sb.append("<a href=\"");
                            sb.append(i6cVar.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i7 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i7, nextSpanTransition3, f6c.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        f6c[] f6cVarArr = (f6c[]) spanned.getSpans(i7, nextSpanTransition4, f6c.class);
                        if (f6cVarArr != null) {
                            for (f6c f6cVar : f6cVarArr) {
                                if (f6cVar != null) {
                                    sb.append(str4);
                                }
                            }
                        }
                        while (i7 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i7, nextSpanTransition4, bl2.class);
                            int i8 = length;
                            if (nextSpanTransition5 < 0) {
                                i = nextSpanTransition4;
                            } else {
                                i = nextSpanTransition5;
                            }
                            bl2[] bl2VarArr = (bl2[]) spanned.getSpans(i7, i, bl2.class);
                            int i9 = i7;
                            int i10 = nextSpanTransition;
                            if (bl2VarArr != null) {
                                int i11 = 0;
                                while (i11 < bl2VarArr.length) {
                                    bl2 bl2Var = bl2VarArr[i11];
                                    if (bl2Var != null) {
                                        String str6 = bl2Var.a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb.append(str4);
                                        } else {
                                            i6 = i11;
                                            wi8.z("<pre lang=\"", str6, str5, sb);
                                            i11 = i6 + 1;
                                        }
                                    }
                                    i6 = i11;
                                    i11 = i6 + 1;
                                }
                            }
                            int i12 = i9;
                            while (i12 < i) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i12, i, gn.class);
                                int i13 = i;
                                if (nextSpanTransition6 >= 0) {
                                    i = nextSpanTransition6;
                                }
                                gn[] gnVarArr = (gn[]) spanned.getSpans(i12, i, gn.class);
                                int i14 = i12;
                                int i15 = nextSpanTransition2;
                                if (gnVarArr != null) {
                                    int i16 = 0;
                                    while (i16 < gnVarArr.length) {
                                        gn gnVar = gnVarArr[i16];
                                        int i17 = i16;
                                        if (gnVar != null && !gnVar.standard) {
                                            str2 = str4;
                                            sb.append("<animated-emoji data-document-id=\"" + gnVar.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i16 = i17 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str7 = str4;
                                int i18 = i14;
                                while (i18 < i) {
                                    char charAt = spanned.charAt(i18);
                                    if (charAt == '\n') {
                                        sb.append("<br>");
                                    } else if (charAt == '<') {
                                        sb.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb.append("&amp;");
                                    } else {
                                        i2 = i18;
                                        i3 = nextSpanTransition3;
                                        if (charAt >= 55296 && charAt <= 57343) {
                                            if (charAt < 56320 && (i5 = i2 + 1) < i) {
                                                str = str5;
                                                char charAt2 = spanned.charAt(i5);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb.append("&#");
                                                    sb.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb.append(";");
                                                    i4 = i5;
                                                    i18 = i4 + 1;
                                                    nextSpanTransition3 = i3;
                                                    str5 = str;
                                                }
                                                i4 = i2;
                                                i18 = i4 + 1;
                                                nextSpanTransition3 = i3;
                                                str5 = str;
                                            }
                                            str = str5;
                                            i4 = i2;
                                            i18 = i4 + 1;
                                            nextSpanTransition3 = i3;
                                            str5 = str;
                                        } else {
                                            str = str5;
                                            if (charAt <= '~' && charAt >= ' ') {
                                                if (charAt == ' ') {
                                                    i4 = i2;
                                                    while (true) {
                                                        int i19 = i4 + 1;
                                                        if (i19 >= i || spanned.charAt(i19) != ' ') {
                                                            break;
                                                        }
                                                        sb.append("&nbsp;");
                                                        i4 = i19;
                                                    }
                                                    sb.append(' ');
                                                    i18 = i4 + 1;
                                                    nextSpanTransition3 = i3;
                                                    str5 = str;
                                                } else {
                                                    sb.append(charAt);
                                                }
                                            } else {
                                                sb.append("&#");
                                                sb.append((int) charAt);
                                                sb.append(";");
                                            }
                                            i4 = i2;
                                            i18 = i4 + 1;
                                            nextSpanTransition3 = i3;
                                            str5 = str;
                                        }
                                    }
                                    i2 = i18;
                                    i3 = nextSpanTransition3;
                                    str = str5;
                                    i4 = i2;
                                    i18 = i4 + 1;
                                    nextSpanTransition3 = i3;
                                    str5 = str;
                                }
                                int i20 = nextSpanTransition3;
                                String str8 = str5;
                                if (gnVarArr != null) {
                                    for (gn gnVar2 : gnVarArr) {
                                        if (gnVar2 != null && !gnVar2.standard) {
                                            sb.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i12 = i;
                                i = i13;
                                nextSpanTransition2 = i15;
                                str4 = str7;
                                nextSpanTransition3 = i20;
                                str5 = str8;
                            }
                            int i21 = i;
                            int i22 = nextSpanTransition2;
                            String str9 = str4;
                            int i23 = nextSpanTransition3;
                            String str10 = str5;
                            if (bl2VarArr != null) {
                                for (bl2 bl2Var2 : bl2VarArr) {
                                    if (bl2Var2 != null) {
                                        sb.append("</pre>");
                                    }
                                }
                            }
                            length = i8;
                            nextSpanTransition = i10;
                            i7 = i21;
                            nextSpanTransition2 = i22;
                            str4 = str9;
                            nextSpanTransition3 = i23;
                            str5 = str10;
                        }
                        int i24 = length;
                        int i25 = nextSpanTransition;
                        int i26 = nextSpanTransition2;
                        String str11 = str4;
                        int i27 = nextSpanTransition3;
                        String str12 = str5;
                        if (f6cVarArr != null) {
                            for (f6c f6cVar2 : f6cVarArr) {
                                if (f6cVar2 != null) {
                                    sb.append("</pre>");
                                }
                            }
                        }
                        i7 = nextSpanTransition4;
                        length = i24;
                        nextSpanTransition = i25;
                        nextSpanTransition2 = i26;
                        str4 = str11;
                        nextSpanTransition3 = i27;
                        str5 = str12;
                    }
                    int i28 = length;
                    int i29 = nextSpanTransition;
                    int i30 = nextSpanTransition2;
                    String str13 = str4;
                    int i31 = nextSpanTransition3;
                    if (i6cVarArr != null) {
                        for (i6c i6cVar2 : i6cVarArr) {
                            sb.append("</a>");
                            b(i6cVar2.a, sb);
                        }
                    }
                    length = i28;
                    nextSpanTransition = i29;
                    nextSpanTransition2 = i30;
                    str4 = str13;
                    i7 = i31;
                }
                int i32 = length;
                int i33 = nextSpanTransition;
                int i34 = nextSpanTransition2;
                if (xkbVarArr != null) {
                    for (xkb xkbVar2 : xkbVarArr) {
                        if (xkbVar2 != null) {
                            b(xkbVar2.b, sb);
                        }
                    }
                }
                length = i32;
                nextSpanTransition = i33;
                i7 = i34;
            }
            int i35 = length;
            int i36 = nextSpanTransition;
            if (f09VarArr != null) {
                for (int length2 = f09VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i7 = i36;
        }
        return sb.toString();
    }
}
