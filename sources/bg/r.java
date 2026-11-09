package bg;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;
public abstract class r {
    public static void a(vy0 vy0Var, StringBuilder sb2) {
        if (vy0Var != null) {
            if ((vy0Var.f39836a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((vy0Var.f39836a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((vy0Var.f39836a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((vy0Var.f39836a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((vy0Var.f39836a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((vy0Var.f39836a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((vy0Var.f39836a & 128) > 0 && vy0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(vy0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(vy0 vy0Var, StringBuilder sb2) {
        if (vy0Var != null) {
            if ((vy0Var.f39836a & 128) > 0 && vy0Var.d != null) {
                sb2.append("</a>");
            }
            if ((vy0Var.f39836a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((vy0Var.f39836a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((vy0Var.f39836a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((vy0Var.f39836a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((vy0Var.f39836a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((vy0Var.f39836a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, vg0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            vg0[] vg0VarArr = (vg0[]) spanned.getSpans(i15, nextSpanTransition, vg0.class);
            if (vg0VarArr != null) {
                for (vg0 vg0Var : vg0VarArr) {
                    if (vg0Var.f39062e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, wy0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wy0[] wy0VarArr = (wy0[]) spanned.getSpans(i15, nextSpanTransition2, wy0.class);
                String str4 = "<pre>";
                if (wy0VarArr != null) {
                    for (wy0 wy0Var : wy0VarArr) {
                        if (wy0Var != null) {
                            a(wy0Var.f40238b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, e41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    e41[] e41VarArr = (e41[]) spanned.getSpans(i15, nextSpanTransition3, e41.class);
                    String str5 = "\">";
                    if (e41VarArr != null) {
                        for (e41 e41Var : e41VarArr) {
                            a(e41Var.f33290a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(e41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, b41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        b41[] b41VarArr = (b41[]) spanned.getSpans(i15, nextSpanTransition4, b41.class);
                        if (b41VarArr != null) {
                            for (b41 b41Var : b41VarArr) {
                                if (b41Var != null) {
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
                                        String str6 = jVar.f20627a;
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
                        if (b41VarArr != null) {
                            for (b41 b41Var2 : b41VarArr) {
                                if (b41Var2 != null) {
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
                    if (e41VarArr != null) {
                        for (e41 e41Var2 : e41VarArr) {
                            sb2.append("</a>");
                            b(e41Var2.f33290a, sb2);
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
                if (wy0VarArr != null) {
                    for (wy0 wy0Var2 : wy0VarArr) {
                        if (wy0Var2 != null) {
                            b(wy0Var2.f40238b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i15 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (vg0VarArr != null) {
                for (int length2 = vg0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i15 = i44;
        }
        return sb2.toString();
    }
}
