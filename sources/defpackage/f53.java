package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
public abstract class f53 {
    public static void a(rmb rmbVar, StringBuilder sb) {
        if (rmbVar != null) {
            if ((rmbVar.a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((rmbVar.a & 1) > 0) {
                sb.append("<b>");
            }
            if ((rmbVar.a & 2) > 0) {
                sb.append("<i>");
            }
            if ((rmbVar.a & 16) > 0) {
                sb.append("<u>");
            }
            if ((rmbVar.a & 8) > 0) {
                sb.append("<s>");
            }
            if ((rmbVar.a & 4) > 0) {
                sb.append("<code>");
            }
            if ((rmbVar.a & 128) > 0 && rmbVar.d != null) {
                sb.append("<a href=\"");
                sb.append(rmbVar.d.url);
                sb.append("\">");
            }
        }
    }

    public static void b(rmb rmbVar, StringBuilder sb) {
        if (rmbVar != null) {
            if ((rmbVar.a & 128) > 0 && rmbVar.d != null) {
                sb.append("</a>");
            }
            if ((rmbVar.a & 4) > 0) {
                sb.append("</code>");
            }
            if ((rmbVar.a & 8) > 0) {
                sb.append("</s>");
            }
            if ((rmbVar.a & 16) > 0) {
                sb.append("</u>");
            }
            if ((rmbVar.a & 2) > 0) {
                sb.append("</i>");
            }
            if ((rmbVar.a & 1) > 0) {
                sb.append("</b>");
            }
            if ((rmbVar.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i7, length, r19.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            r19[] r19VarArr = (r19[]) spanned.getSpans(i7, nextSpanTransition, r19.class);
            if (r19VarArr != null) {
                for (r19 r19Var : r19VarArr) {
                    if (r19Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb.append(str3);
                }
            }
            while (i7 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i7, nextSpanTransition, smb.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                smb[] smbVarArr = (smb[]) spanned.getSpans(i7, nextSpanTransition2, smb.class);
                String str4 = "<pre>";
                if (smbVarArr != null) {
                    for (smb smbVar : smbVarArr) {
                        if (smbVar != null) {
                            a(smbVar.b, sb);
                        }
                    }
                }
                while (i7 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i7, nextSpanTransition2, h8c.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    h8c[] h8cVarArr = (h8c[]) spanned.getSpans(i7, nextSpanTransition3, h8c.class);
                    String str5 = "\">";
                    if (h8cVarArr != null) {
                        for (h8c h8cVar : h8cVarArr) {
                            a(h8cVar.a, sb);
                            sb.append("<a href=\"");
                            sb.append(h8cVar.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i7 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i7, nextSpanTransition3, e8c.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        e8c[] e8cVarArr = (e8c[]) spanned.getSpans(i7, nextSpanTransition4, e8c.class);
                        if (e8cVarArr != null) {
                            for (e8c e8cVar : e8cVarArr) {
                                if (e8cVar != null) {
                                    sb.append(str4);
                                }
                            }
                        }
                        while (i7 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i7, nextSpanTransition4, jk2.class);
                            int i8 = length;
                            if (nextSpanTransition5 < 0) {
                                i = nextSpanTransition4;
                            } else {
                                i = nextSpanTransition5;
                            }
                            jk2[] jk2VarArr = (jk2[]) spanned.getSpans(i7, i, jk2.class);
                            int i9 = i7;
                            int i10 = nextSpanTransition;
                            if (jk2VarArr != null) {
                                int i11 = 0;
                                while (i11 < jk2VarArr.length) {
                                    jk2 jk2Var = jk2VarArr[i11];
                                    if (jk2Var != null) {
                                        String str6 = jk2Var.a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb.append(str4);
                                        } else {
                                            i6 = i11;
                                            ik8.z("<pre lang=\"", str6, str5, sb);
                                            i11 = i6 + 1;
                                        }
                                    }
                                    i6 = i11;
                                    i11 = i6 + 1;
                                }
                            }
                            int i12 = i9;
                            while (i12 < i) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i12, i, hm.class);
                                int i13 = i;
                                if (nextSpanTransition6 >= 0) {
                                    i = nextSpanTransition6;
                                }
                                hm[] hmVarArr = (hm[]) spanned.getSpans(i12, i, hm.class);
                                int i14 = i12;
                                int i15 = nextSpanTransition2;
                                if (hmVarArr != null) {
                                    int i16 = 0;
                                    while (i16 < hmVarArr.length) {
                                        hm hmVar = hmVarArr[i16];
                                        int i17 = i16;
                                        if (hmVar != null && !hmVar.standard) {
                                            str2 = str4;
                                            sb.append("<animated-emoji data-document-id=\"" + hmVar.documentId + str5);
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
                                if (hmVarArr != null) {
                                    for (hm hmVar2 : hmVarArr) {
                                        if (hmVar2 != null && !hmVar2.standard) {
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
                            if (jk2VarArr != null) {
                                for (jk2 jk2Var2 : jk2VarArr) {
                                    if (jk2Var2 != null) {
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
                        if (e8cVarArr != null) {
                            for (e8c e8cVar2 : e8cVarArr) {
                                if (e8cVar2 != null) {
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
                    if (h8cVarArr != null) {
                        for (h8c h8cVar2 : h8cVarArr) {
                            sb.append("</a>");
                            b(h8cVar2.a, sb);
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
                if (smbVarArr != null) {
                    for (smb smbVar2 : smbVarArr) {
                        if (smbVar2 != null) {
                            b(smbVar2.b, sb);
                        }
                    }
                }
                length = i32;
                nextSpanTransition = i33;
                i7 = i34;
            }
            int i35 = length;
            int i36 = nextSpanTransition;
            if (r19VarArr != null) {
                for (int length2 = r19VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i7 = i36;
        }
        return sb.toString();
    }
}
