package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
public abstract class n43 {
    public static void a(vib vibVar, StringBuilder sb) {
        if (vibVar != null) {
            if ((vibVar.a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((vibVar.a & 1) > 0) {
                sb.append("<b>");
            }
            if ((vibVar.a & 2) > 0) {
                sb.append("<i>");
            }
            if ((vibVar.a & 16) > 0) {
                sb.append("<u>");
            }
            if ((vibVar.a & 8) > 0) {
                sb.append("<s>");
            }
            if ((vibVar.a & 4) > 0) {
                sb.append("<code>");
            }
            if ((vibVar.a & 128) > 0 && vibVar.d != null) {
                sb.append("<a href=\"");
                sb.append(vibVar.d.url);
                sb.append("\">");
            }
        }
    }

    public static void b(vib vibVar, StringBuilder sb) {
        if (vibVar != null) {
            if ((vibVar.a & 128) > 0 && vibVar.d != null) {
                sb.append("</a>");
            }
            if ((vibVar.a & 4) > 0) {
                sb.append("</code>");
            }
            if ((vibVar.a & 8) > 0) {
                sb.append("</s>");
            }
            if ((vibVar.a & 16) > 0) {
                sb.append("</u>");
            }
            if ((vibVar.a & 2) > 0) {
                sb.append("</i>");
            }
            if ((vibVar.a & 1) > 0) {
                sb.append("</b>");
            }
            if ((vibVar.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i7, length, ey8.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ey8[] ey8VarArr = (ey8[]) spanned.getSpans(i7, nextSpanTransition, ey8.class);
            if (ey8VarArr != null) {
                for (ey8 ey8Var : ey8VarArr) {
                    if (ey8Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb.append(str3);
                }
            }
            while (i7 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i7, nextSpanTransition, wib.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wib[] wibVarArr = (wib[]) spanned.getSpans(i7, nextSpanTransition2, wib.class);
                String str4 = "<pre>";
                if (wibVarArr != null) {
                    for (wib wibVar : wibVarArr) {
                        if (wibVar != null) {
                            a(wibVar.b, sb);
                        }
                    }
                }
                while (i7 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i7, nextSpanTransition2, i4c.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    i4c[] i4cVarArr = (i4c[]) spanned.getSpans(i7, nextSpanTransition3, i4c.class);
                    String str5 = "\">";
                    if (i4cVarArr != null) {
                        for (i4c i4cVar : i4cVarArr) {
                            a(i4cVar.a, sb);
                            sb.append("<a href=\"");
                            sb.append(i4cVar.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i7 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i7, nextSpanTransition3, f4c.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        f4c[] f4cVarArr = (f4c[]) spanned.getSpans(i7, nextSpanTransition4, f4c.class);
                        if (f4cVarArr != null) {
                            for (f4c f4cVar : f4cVarArr) {
                                if (f4cVar != null) {
                                    sb.append(str4);
                                }
                            }
                        }
                        while (i7 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i7, nextSpanTransition4, nj2.class);
                            int i8 = length;
                            if (nextSpanTransition5 < 0) {
                                i = nextSpanTransition4;
                            } else {
                                i = nextSpanTransition5;
                            }
                            nj2[] nj2VarArr = (nj2[]) spanned.getSpans(i7, i, nj2.class);
                            int i9 = i7;
                            int i10 = nextSpanTransition;
                            if (nj2VarArr != null) {
                                int i11 = 0;
                                while (i11 < nj2VarArr.length) {
                                    nj2 nj2Var = nj2VarArr[i11];
                                    if (nj2Var != null) {
                                        String str6 = nj2Var.a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb.append(str4);
                                        } else {
                                            i6 = i11;
                                            ug8.z("<pre lang=\"", str6, str5, sb);
                                            i11 = i6 + 1;
                                        }
                                    }
                                    i6 = i11;
                                    i11 = i6 + 1;
                                }
                            }
                            int i12 = i9;
                            while (i12 < i) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i12, i, gm.class);
                                int i13 = i;
                                if (nextSpanTransition6 >= 0) {
                                    i = nextSpanTransition6;
                                }
                                gm[] gmVarArr = (gm[]) spanned.getSpans(i12, i, gm.class);
                                int i14 = i12;
                                int i15 = nextSpanTransition2;
                                if (gmVarArr != null) {
                                    int i16 = 0;
                                    while (i16 < gmVarArr.length) {
                                        gm gmVar = gmVarArr[i16];
                                        int i17 = i16;
                                        if (gmVar != null && !gmVar.standard) {
                                            str2 = str4;
                                            sb.append("<animated-emoji data-document-id=\"" + gmVar.documentId + str5);
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
                                if (gmVarArr != null) {
                                    for (gm gmVar2 : gmVarArr) {
                                        if (gmVar2 != null && !gmVar2.standard) {
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
                            if (nj2VarArr != null) {
                                for (nj2 nj2Var2 : nj2VarArr) {
                                    if (nj2Var2 != null) {
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
                        if (f4cVarArr != null) {
                            for (f4c f4cVar2 : f4cVarArr) {
                                if (f4cVar2 != null) {
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
                    if (i4cVarArr != null) {
                        for (i4c i4cVar2 : i4cVarArr) {
                            sb.append("</a>");
                            b(i4cVar2.a, sb);
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
                if (wibVarArr != null) {
                    for (wib wibVar2 : wibVarArr) {
                        if (wibVar2 != null) {
                            b(wibVar2.b, sb);
                        }
                    }
                }
                length = i32;
                nextSpanTransition = i33;
                i7 = i34;
            }
            int i35 = length;
            int i36 = nextSpanTransition;
            if (ey8VarArr != null) {
                for (int length2 = ey8VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i7 = i36;
        }
        return sb.toString();
    }
}
