package ff;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;
public abstract class r {
    public static void a(vz0 vz0Var, StringBuilder sb2) {
        if (vz0Var != null) {
            if ((vz0Var.f34062a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((vz0Var.f34062a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((vz0Var.f34062a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((vz0Var.f34062a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((vz0Var.f34062a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((vz0Var.f34062a & 128) > 0 && vz0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(vz0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(vz0 vz0Var, StringBuilder sb2) {
        if (vz0Var != null) {
            if ((vz0Var.f34062a & 128) > 0 && vz0Var.d != null) {
                sb2.append("</a>");
            }
            if ((vz0Var.f34062a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((vz0Var.f34062a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((vz0Var.f34062a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((vz0Var.f34062a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((vz0Var.f34062a & 768) > 0) {
                sb2.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i9;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, fi0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            fi0[] fi0VarArr = (fi0[]) spanned.getSpans(i14, nextSpanTransition, fi0.class);
            if (fi0VarArr != null) {
                for (fi0 fi0Var : fi0VarArr) {
                    if (fi0Var.f28439e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, wz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                wz0[] wz0VarArr = (wz0[]) spanned.getSpans(i14, nextSpanTransition2, wz0.class);
                String str4 = "<pre>";
                if (wz0VarArr != null) {
                    for (wz0 wz0Var : wz0VarArr) {
                        if (wz0Var != null) {
                            a(wz0Var.f34479b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, r41.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    r41[] r41VarArr = (r41[]) spanned.getSpans(i14, nextSpanTransition3, r41.class);
                    String str5 = "\">";
                    if (r41VarArr != null) {
                        for (r41 r41Var : r41VarArr) {
                            a(r41Var.f32081a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(r41Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, o41.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        o41[] o41VarArr = (o41[]) spanned.getSpans(i14, nextSpanTransition4, o41.class);
                        if (o41VarArr != null) {
                            for (o41 o41Var : o41VarArr) {
                                if (o41Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i14 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i14, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i15 = length;
                            if (nextSpanTransition5 < 0) {
                                i9 = nextSpanTransition4;
                            } else {
                                i9 = nextSpanTransition5;
                            }
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i14, i9, CodeHighlighting.Span.class);
                            int i16 = i14;
                            int i17 = nextSpanTransition;
                            if (spanArr != null) {
                                int i18 = 0;
                                while (i18 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i18];
                                    int i19 = i18;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str4);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str5);
                                        }
                                    }
                                    i18 = i19 + 1;
                                }
                            }
                            int i20 = i16;
                            while (i20 < i9) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i20, i9, t5.class);
                                int i21 = i9;
                                if (nextSpanTransition6 >= 0) {
                                    i9 = nextSpanTransition6;
                                }
                                t5[] t5VarArr = (t5[]) spanned.getSpans(i20, i9, t5.class);
                                int i22 = i20;
                                int i23 = nextSpanTransition2;
                                if (t5VarArr != null) {
                                    int i24 = 0;
                                    while (i24 < t5VarArr.length) {
                                        t5 t5Var = t5VarArr[i24];
                                        int i25 = i24;
                                        if (t5Var != null && !t5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + t5Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i24 = i25 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str6 = str4;
                                int i26 = i22;
                                while (i26 < i9) {
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
                                            if (charAt < 56320 && (i13 = i10 + 1) < i9) {
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
                                                        if (i27 >= i9 || spanned.charAt(i27) != ' ') {
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
                                String str7 = str5;
                                if (t5VarArr != null) {
                                    for (t5 t5Var2 : t5VarArr) {
                                        if (t5Var2 != null && !t5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i20 = i9;
                                i9 = i21;
                                nextSpanTransition2 = i23;
                                str4 = str6;
                                nextSpanTransition3 = i28;
                                str5 = str7;
                            }
                            int i29 = i9;
                            int i30 = nextSpanTransition2;
                            String str8 = str4;
                            int i31 = nextSpanTransition3;
                            String str9 = str5;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i15;
                            nextSpanTransition = i17;
                            i14 = i29;
                            nextSpanTransition2 = i30;
                            str4 = str8;
                            nextSpanTransition3 = i31;
                            str5 = str9;
                        }
                        int i32 = length;
                        int i33 = nextSpanTransition;
                        int i34 = nextSpanTransition2;
                        String str10 = str4;
                        int i35 = nextSpanTransition3;
                        String str11 = str5;
                        if (o41VarArr != null) {
                            for (o41 o41Var2 : o41VarArr) {
                                if (o41Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i14 = nextSpanTransition4;
                        length = i32;
                        nextSpanTransition = i33;
                        nextSpanTransition2 = i34;
                        str4 = str10;
                        nextSpanTransition3 = i35;
                        str5 = str11;
                    }
                    int i36 = length;
                    int i37 = nextSpanTransition;
                    int i38 = nextSpanTransition2;
                    String str12 = str4;
                    int i39 = nextSpanTransition3;
                    if (r41VarArr != null) {
                        for (r41 r41Var2 : r41VarArr) {
                            sb2.append("</a>");
                            b(r41Var2.f32081a, sb2);
                        }
                    }
                    length = i36;
                    nextSpanTransition = i37;
                    nextSpanTransition2 = i38;
                    str4 = str12;
                    i14 = i39;
                }
                int i40 = length;
                int i41 = nextSpanTransition;
                int i42 = nextSpanTransition2;
                if (wz0VarArr != null) {
                    for (wz0 wz0Var2 : wz0VarArr) {
                        if (wz0Var2 != null) {
                            b(wz0Var2.f34479b, sb2);
                        }
                    }
                }
                length = i40;
                nextSpanTransition = i41;
                i14 = i42;
            }
            int i43 = length;
            int i44 = nextSpanTransition;
            if (fi0VarArr != null) {
                for (int length2 = fi0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i43;
            i14 = i44;
        }
        return sb2.toString();
    }
}
