package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public abstract class ff9 {
    public static void A(java.util.ArrayList r31, java.util.ArrayList r32, java.util.HashMap r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff9.A(java.util.ArrayList, java.util.ArrayList, java.util.HashMap):void");
    }

    public static lk0 B(ef9 ef9Var, boolean z) {
        TL_iv.PageBlock pageblockcollage;
        if (z) {
            pageblockcollage = new TL_iv.pageBlockSlideshow();
        } else {
            pageblockcollage = new TL_iv.pageBlockCollage();
        }
        ArrayList c3 = ye9.c3(pageblockcollage);
        ArrayList arrayList = ef9Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ef9 ef9Var2 = (ef9) obj;
            if (!ef9Var2.b) {
                if ("figcaption".equals(ef9Var2.a)) {
                    charSequence = w(ef9Var2);
                } else {
                    boolean equals = "video".equals(ef9Var2.a);
                    if (equals || "img".equals(ef9Var2.a)) {
                        long E = E(ef9Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y = y(E, equals, ef9Var2.b("data-spoiler"));
                            J(y);
                            c3.add(y);
                        }
                    }
                }
            }
        }
        if (c3.isEmpty()) {
            return null;
        }
        if (c3.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) c3.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new lk0(pageBlock, 0, 0);
        }
        J(pageblockcollage);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockcollage, charSequence);
        }
        return new lk0(pageblockcollage, 0, 0);
    }

    public static int C(int i, String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str.trim());
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    public static void D(ef9 ef9Var, ArrayList arrayList, int i, boolean z) {
        int i2;
        boolean z2;
        String a;
        ArrayList arrayList2;
        int i3;
        int i4 = i + 1;
        ArrayList arrayList3 = ef9Var.e;
        int size = arrayList3.size();
        int i5 = 1;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList3.get(i6);
            i6++;
            ef9 ef9Var2 = (ef9) obj;
            if (!ef9Var2.b && "li".equals(ef9Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ef9Var2.e;
                int size2 = arrayList5.size();
                int i7 = 0;
                while (i7 < size2) {
                    int i8 = i7 + 1;
                    ef9 ef9Var3 = (ef9) arrayList5.get(i7);
                    if (!ef9Var3.b && ("ul".equals(ef9Var3.a) || "ol".equals(ef9Var3.a))) {
                        arrayList4.add(ef9Var3);
                    } else if (ef9Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(ef9Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i3 = size2;
                        h(spannableStringBuilder, ef9Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i7 = i8;
                        size2 = i3;
                    }
                    arrayList2 = arrayList5;
                    i3 = size2;
                    arrayList5 = arrayList2;
                    i7 = i8;
                    size2 = i3;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = yi9.f(L(spannableStringBuilder));
                if (z) {
                    i2 = i5;
                } else {
                    i2 = 0;
                }
                lk0 lk0Var = new lk0(pageblockparagraph, i4, i2);
                if (!ef9Var2.b("data-checkbox") && ((a = ef9Var2.a("class")) == null || !a.toLowerCase().contains("checkbox"))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                lk0Var.e = z2;
                lk0Var.f = ef9Var2.b("data-checked");
                arrayList.add(lk0Var);
                int size3 = arrayList4.size();
                int i9 = 0;
                while (i9 < size3) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    ef9 ef9Var4 = (ef9) obj2;
                    D(ef9Var4, arrayList, i4, "ol".equals(ef9Var4.a));
                }
                i5++;
            }
        }
    }

    public static long E(String str) {
        if (str != null) {
            try {
                return Long.parseLong(str.trim());
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static void F(StringBuilder sb, ArrayList arrayList, int[] iArr, int i, int i2, int i3, int i4, int i5, xt6 xt6Var, boolean z, int i6, HashMap hashMap) {
        int i7;
        ArrayList arrayList2;
        boolean z2;
        String str;
        String str2;
        StringBuilder sb2 = sb;
        ArrayList arrayList3 = arrayList;
        int i8 = i;
        xt6 xt6Var2 = xt6Var;
        int i9 = i6;
        ArrayList arrayList4 = xt6Var2.a;
        while (true) {
            int i10 = iArr[0];
            if (i10 > i8) {
                return;
            }
            lk0 lk0Var = (lk0) arrayList3.get(i10);
            if (!lk0Var.i) {
                if (lk0Var.k.size() > i9) {
                    xt6Var2.d(sb2);
                    Long l = (Long) ((lk0) arrayList3.get(iArr[0])).k.get(i9);
                    long longValue = l.longValue();
                    int i11 = iArr[0];
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 > i8) {
                            break;
                        }
                        lk0 lk0Var2 = (lk0) arrayList3.get(i12);
                        if (lk0Var2.k.size() <= i9 || ((Long) lk0Var2.k.get(i9)).longValue() != longValue) {
                            break;
                        }
                        i11 = i12;
                    }
                    sb2.append("<blockquote>");
                    xt6 xt6Var3 = new xt6();
                    F(sb2, arrayList3, iArr, i11, i2, i3, i4, i5, xt6Var3, z, i9 + 1, hashMap);
                    xt6Var3.d(sb2);
                    c(sb2, hashMap != null ? k((TL_iv.RichText) hashMap.get(l)) : null);
                    sb2.append("</blockquote>");
                    i8 = i;
                    i9 = i6;
                } else {
                    if (ye9.t3(lk0Var)) {
                        xt6Var2.d(sb2);
                        lk0 lk0Var3 = (lk0) arrayList3.get(iArr[0]);
                        sb2.append(((TL_iv.pageBlockDetails) lk0Var3.b).open ? "<details open>" : "<details>");
                        sb2.append("<summary>");
                        g(sb2, K(lk0Var3, iArr[0], i2, i3, i4, i5));
                        sb2.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        xt6 xt6Var4 = new xt6();
                        F(sb2, arrayList3, iArr, i, i2, i3, i4, i5, xt6Var4, true, i6, hashMap);
                        arrayList2 = arrayList3;
                        i7 = i;
                        xt6Var4.d(sb2);
                        int i13 = iArr[0];
                        if (i13 <= i7 && i13 < arrayList2.size() && ((lk0) arrayList2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb2.append("</details>");
                    } else {
                        i7 = i;
                        arrayList2 = arrayList3;
                        boolean z3 = true;
                        if (lk0Var.c > 0 && l(lk0Var.b) != null) {
                            int i14 = lk0Var.c;
                            boolean z4 = lk0Var.d > 0;
                            while (arrayList4.size() > i14) {
                                xt6Var2.c(sb2);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList4.size() >= i14) {
                                    break;
                                }
                                if (z4) {
                                    str2 = "<ol>";
                                }
                                sb2.append(str2);
                                arrayList4.add(Boolean.valueOf(z4));
                            }
                            if (!arrayList4.isEmpty() && ((Boolean) b00.f(1, arrayList4)).booleanValue() != z4) {
                                xt6Var2.c(sb2);
                                sb2.append(z4 ? "<ol>" : "<ul>");
                                arrayList4.add(Boolean.valueOf(z4));
                            }
                            sb2.append("<li>");
                            g(sb2, K(lk0Var, iArr[0], i2, i3, i4, i5));
                            sb2.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        } else {
                            xt6Var2.d(sb2);
                            int i15 = iArr[0];
                            TL_iv.PageBlock pageBlock = lk0Var.b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb2.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb2.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb2.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb2.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb2.append(" data-align=\"right\"");
                                } else {
                                    sb2.append(" data-align=\"fill\"");
                                }
                                sb2.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList5 = pageblockbuttonrow.buttons;
                                if (arrayList5 != null) {
                                    int size = arrayList5.size();
                                    int i16 = 0;
                                    while (i16 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList5.get(i16);
                                        i16++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb2, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb2.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb2, (TL_iv.pageBlockTable) pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                G(sb2, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, lk0Var.g, pageBlock);
                                sb2 = sb;
                            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                sb2 = sb;
                                G(sb2, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, lk0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                sb2 = sb;
                                G(sb2, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, lk0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                sb2 = sb;
                                G(sb2, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, lk0Var.g, pageBlock);
                            } else {
                                sb2 = sb;
                                String str3 = "<figcaption>";
                                if (ye9.x3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb2.append("<div class=\"");
                                    sb2.append(str4);
                                    sb2.append("\">");
                                    ArrayList c3 = ye9.c3(pageBlock);
                                    if (c3 != null) {
                                        int i17 = 0;
                                        while (i17 < c3.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) c3.get(i17);
                                            ArrayList arrayList6 = lk0Var.h;
                                            iy6 iy6Var = (arrayList6 == null || i17 >= arrayList6.size()) ? null : (iy6) lk0Var.h.get(i17);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z2 = z3;
                                                long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j != 0) {
                                                    str = str3;
                                                    i(sb2, "video", j, iy6Var, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z2 = z3;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j2 != 0) {
                                                        sb2 = sb;
                                                        i(sb2, "img", j2, iy6Var, pageBlock2);
                                                        i17++;
                                                        str3 = str;
                                                        z3 = z2;
                                                    }
                                                }
                                            }
                                            sb2 = sb;
                                            i17++;
                                            str3 = str;
                                            z3 = z2;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o = o(pageBlock);
                                    if (o != null && o.length() > 0) {
                                        sb2.append(str5);
                                        g(sb2, o);
                                        sb2.append("</figcaption>");
                                    }
                                    sb2.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o2 = o(pageblockmap);
                                    boolean z5 = o2 != null && o2.length() > 0;
                                    if (z5) {
                                        sb2.append("<figure>");
                                    }
                                    sb2.append("<location");
                                    if (pageblockmap.geo != null) {
                                        sb2.append(" lat=\"");
                                        sb2.append(pageblockmap.geo.lat);
                                        sb2.append('\"');
                                        sb2.append(" long=\"");
                                        sb2.append(pageblockmap.geo._long);
                                        sb2.append('\"');
                                        if (pageblockmap.geo.access_hash != 0) {
                                            sb2.append(" access=\"");
                                            sb2.append(pageblockmap.geo.access_hash);
                                            sb2.append('\"');
                                        }
                                    }
                                    if (pageblockmap.zoom != 0) {
                                        sb2.append(" zoom=\"");
                                        sb2.append(pageblockmap.zoom);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.w != 0) {
                                        sb2.append(" w=\"");
                                        sb2.append(pageblockmap.w);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.h != 0) {
                                        sb2.append(" h=\"");
                                        sb2.append(pageblockmap.h);
                                        sb2.append('\"');
                                    }
                                    sb2.append(" />");
                                    if (z5) {
                                        sb2.append("<figcaption>");
                                        g(sb2, o2);
                                        sb2.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l2 = l(pageBlock);
                                    if (l2 == null) {
                                        SpannableStringBuilder o3 = o(pageBlock);
                                        if (o3 != null && o3.length() > 0) {
                                            sb2.append("<p>");
                                            g(sb2, o3);
                                            sb2.append("</p>");
                                        }
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                        if (!TextUtils.isEmpty(str6)) {
                                            sb2.append("<pre language=\"");
                                            sb2.append(s(str6));
                                            sb2.append("\">");
                                        } else {
                                            sb2.append("<pre>");
                                        }
                                        g(sb2, K(lk0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb2.append("<blockquote class=\"pull\">");
                                        g(sb2, K(lk0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb2.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb2.append("<blockquote collapsed>");
                                        } else {
                                            sb2.append("<blockquote>");
                                        }
                                        g(sb2, K(lk0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(pageblockblockquote.caption));
                                        sb2.append("</blockquote>");
                                    } else {
                                        sb2.append('<');
                                        sb2.append(l2);
                                        sb2.append('>');
                                        g(sb2, K(lk0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</");
                                        sb2.append(l2);
                                        sb2.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                xt6Var2 = xt6Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            xt6Var2 = xt6Var;
                        }
                    }
                    i9 = i6;
                    arrayList3 = arrayList2;
                    i8 = i7;
                }
            } else if (z) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb, String str, long j, iy6 iy6Var, TL_iv.PageBlock pageBlock) {
        boolean z;
        if (j != 0) {
            SpannableStringBuilder o = o(pageBlock);
            if (o != null && o.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append("<figure>");
            }
            i(sb, str, j, iy6Var, pageBlock);
            if (z) {
                sb.append("<figcaption>");
                g(sb, o);
                sb.append("</figcaption></figure>");
            }
        }
    }

    public static void H(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        SpannableStringBuilder spannableStringBuilder;
        ArrayList<TL_iv.pageTableCell> arrayList;
        String str;
        String str2;
        String str3;
        sb.append("<table");
        if (pageblocktable.bordered) {
            sb.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb.append(" class=\"");
            if (pageblocktable.striped) {
                sb.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb.append(' ');
            }
            if (pageblocktable.compact) {
                sb.append("compact");
            }
            sb.append('\"');
        }
        sb.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null) {
            spannableStringBuilder = yi9.r(richText, null, true);
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null && spannableStringBuilder.length() > 0) {
            sb.append("<caption>");
            g(sb, spannableStringBuilder);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i);
                i++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i2);
                        i2++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            if (pagetablecell2.header) {
                                str = "th";
                            } else {
                                str = "td";
                            }
                            sb.append('<');
                            sb.append(str);
                            int i3 = pagetablecell2.colspan;
                            if (i3 <= 1) {
                                i3 = 0;
                            }
                            if (i3 > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            int i4 = pagetablecell2.rowspan;
                            if (i4 <= 1) {
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i4);
                                sb.append('\"');
                            }
                            if (pagetablecell2.align_right) {
                                str2 = "right";
                            } else if (pagetablecell2.align_center) {
                                str2 = "center";
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb.append(" align=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            if (pagetablecell2.valign_bottom) {
                                str3 = "bottom";
                            } else if (pagetablecell2.valign_middle) {
                                str3 = "middle";
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                sb.append(" valign=\"");
                                sb.append(str3);
                                sb.append('\"');
                            }
                            sb.append('>');
                            g(sb, ffb.h(pagetablecell2));
                            sb.append("</");
                            sb.append(str);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = yi9.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(lk0 lk0Var, int i, int i2, int i3, int i4, int i5) {
        CharSequence z;
        int i6;
        int i7;
        boolean t3 = ye9.t3(lk0Var);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (t3) {
            z = yi9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
        } else {
            z = wi9.z(pageBlock);
        }
        if (z == null) {
            z = "";
        }
        int length = z.length();
        if (i == i2) {
            i6 = Math.max(0, Math.min(i4, length));
        } else {
            i6 = 0;
        }
        if (i == i3) {
            i7 = Math.max(0, Math.min(i5, length));
        } else {
            i7 = length;
        }
        if (i6 > i7) {
            int i8 = i6;
            i6 = i7;
            i7 = i8;
        }
        if (i6 == 0 && i7 == length) {
            return z;
        }
        return z.subSequence(i6, i7);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && ((charAt = spannableStringBuilder.charAt(i)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i++;
        }
        while (length > i) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        if (i == 0 && length == spannableStringBuilder.length()) {
            return spannableStringBuilder;
        }
        return spannableStringBuilder.subSequence(i, length);
    }

    public static void a(lk0 lk0Var, ArrayList arrayList) {
        if (lk0Var != null) {
            arrayList.add(lk0Var);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, ef9 ef9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, ef9Var, 0, null, 0L);
        wi9.b(pageBlock, L(spannableStringBuilder));
        arrayList.add(new lk0(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && spannableStringBuilder.length() != 0) {
            sb.append("<cite>");
            g(sb, spannableStringBuilder);
            sb.append("</cite>");
        }
    }

    public static void d(StringBuilder sb, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        String str;
        if (!mf9.c(inlineButtonType)) {
            return;
        }
        sb.append("<button");
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            sb.append(" data-type=\"url\" data-url=\"");
            sb.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
            sb.append("\"");
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            sb.append(" data-type=\"copy\" data-copy-text=\"");
            sb.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
            sb.append("\"");
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            sb.append(" data-type=\"user-profile\" data-user-id=\"");
            sb.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
            sb.append("\"");
        }
        if (richButtonStyle != null) {
            if (richButtonStyle.bg_primary) {
                str = "primary";
            } else if (richButtonStyle.bg_danger) {
                str = "danger";
            } else if (richButtonStyle.bg_success) {
                str = "success";
            } else {
                str = "default";
            }
            ug8.z(" data-style=\"", str, "\"", sb);
        }
        sb.append(">");
        g(sb, yi9.r(richText, null, true));
        sb.append("</button>");
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, ef9 ef9Var, int i, String str, long j) {
        SpannableStringBuilder spannableStringBuilder2;
        int i2;
        String str2;
        long j2;
        ArrayList arrayList = ef9Var.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ef9 ef9Var2 = (ef9) obj;
            if (ef9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                j(spannableStringBuilder2, q(ef9Var2.c), i2, str2, j2);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                h(spannableStringBuilder2, ef9Var2, i2, str2, j2);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i = i2;
            str = str2;
            j = j2;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, ef9 ef9Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = ef9Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ef9 ef9Var2 = (ef9) obj;
            if (ef9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(ef9Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(ef9Var2.a)) {
                    h(spannableStringBuilder2, ef9Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void g(java.lang.StringBuilder r22, java.lang.CharSequence r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff9.g(java.lang.StringBuilder, java.lang.CharSequence):void");
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, ef9 ef9Var, int i, String str, long j) {
        int i2;
        String str2;
        int i3;
        long j2;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(ef9Var.a) && (v = v(ef9Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, ef9Var, i, str, j);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = yi9.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(ef9Var);
                spannableStringBuilder.setSpan(new mf9(textbutton), length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        String str3 = ef9Var.a;
        str3.getClass();
        char c = 65535;
        switch (str3.hashCode()) {
            case -1999048254:
                if (str3.equals("spoiler")) {
                    c = 0;
                    break;
                }
                break;
            case -891985998:
                if (str3.equals("strike")) {
                    c = 1;
                    break;
                }
                break;
            case -891980137:
                if (str3.equals("strong")) {
                    c = 2;
                    break;
                }
                break;
            case 97:
                if (str3.equals("a")) {
                    c = 3;
                    break;
                }
                break;
            case 98:
                if (str3.equals("b")) {
                    c = 4;
                    break;
                }
                break;
            case 105:
                if (str3.equals("i")) {
                    c = 5;
                    break;
                }
                break;
            case 115:
                if (str3.equals("s")) {
                    c = 6;
                    break;
                }
                break;
            case 117:
                if (str3.equals("u")) {
                    c = 7;
                    break;
                }
                break;
            case 3152:
                if (str3.equals("br")) {
                    c = '\b';
                    break;
                }
                break;
            case 3240:
                if (str3.equals("em")) {
                    c = '\t';
                    break;
                }
                break;
            case 3712:
                if (str3.equals("tt")) {
                    c = '\n';
                    break;
                }
                break;
            case 99339:
                if (str3.equals("del")) {
                    c = 11;
                    break;
                }
                break;
            case 114240:
                if (str3.equals("sub")) {
                    c = '\f';
                    break;
                }
                break;
            case 114254:
                if (str3.equals("sup")) {
                    c = '\r';
                    break;
                }
                break;
            case 3059181:
                if (str3.equals("code")) {
                    c = 14;
                    break;
                }
                break;
            case 3344077:
                if (str3.equals("mark")) {
                    c = 15;
                    break;
                }
                break;
            case 1438365596:
                if (str3.equals("animated-emoji")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i2 = i | 256;
                str2 = str;
                j2 = j;
                break;
            case 1:
            case 6:
            case 11:
                i2 = i | 8;
                str2 = str;
                j2 = j;
                break;
            case 2:
            case 4:
                i2 = i | 1;
                str2 = str;
                j2 = j;
                break;
            case 3:
                String a = ef9Var.a("href");
                if (a != null) {
                    str2 = a;
                    i2 = i;
                    j2 = j;
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
            case 5:
            case '\t':
                i2 = i | 2;
                str2 = str;
                j2 = j;
                break;
            case 7:
                i2 = i | 16;
                str2 = str;
                j2 = j;
                break;
            case '\b':
                j(spannableStringBuilder, "\n", i, str, j);
                return;
            case '\n':
            case 14:
                i2 = i | 4;
                str2 = str;
                j2 = j;
                break;
            case '\f':
                i2 = i | 16384;
                str2 = str;
                j2 = j;
                break;
            case '\r':
                i3 = 32768;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                break;
            case 15:
                i3 = 65536;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                break;
            case 16:
                String a2 = ef9Var.a("data-document-id");
                if (a2 != null) {
                    try {
                        j2 = Long.parseLong(a2.trim());
                        i2 = i;
                        str2 = str;
                        break;
                    } catch (Exception unused) {
                    }
                }
                i2 = i;
                str2 = str;
                j2 = j;
                break;
            default:
                i2 = i;
                str2 = str;
                j2 = j;
                break;
        }
        if (ef9Var.e.isEmpty() && !ef9Var.b) {
            return;
        }
        e(spannableStringBuilder, ef9Var, i2, str2, j2);
    }

    public static void i(StringBuilder sb, String str, long j, iy6 iy6Var, TL_iv.PageBlock pageBlock) {
        sb.append('<');
        sb.append(str);
        sb.append(" src=\"");
        sb.append(j);
        sb.append('\"');
        if (iy6Var != null) {
            if (iy6Var.j > 0) {
                sb.append(" width=\"");
                sb.append(iy6Var.j);
                sb.append('\"');
            }
            if (iy6Var.k > 0) {
                sb.append(" height=\"");
                sb.append(iy6Var.k);
                sb.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        sb.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, long j) {
        if (str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j != 0) {
                spannableStringBuilder.setSpan(new gm(j, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i != 0) {
                ?? obj = new Object();
                obj.a = i & 114975;
                spannableStringBuilder.setSpan(new wib(obj, gl.L(gba.S0)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(yi9.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            SpannableStringBuilder r = yi9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
        }
        return null;
    }

    public static String l(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    public static defpackage.lk0 m(defpackage.ef9 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff9.m(ef9):lk0");
    }

    public static lk0 n(ef9 ef9Var, boolean z) {
        long E = E(ef9Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y = y(E, z, ef9Var.b("data-spoiler"));
        J(y);
        return new lk0(y, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r = yi9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
        }
        return null;
    }

    public static void p(ef9 ef9Var, TL_iv.pageBlockTable pageblocktable) {
        boolean z;
        String lowerCase;
        int indexOf;
        ArrayList arrayList = ef9Var.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ef9 ef9Var2 = (ef9) obj;
            if (!ef9Var2.b) {
                String str = ef9Var2.a;
                str.getClass();
                int i3 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i3 = i;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i3 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i3 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i3 = 4;
                            break;
                        }
                        break;
                }
                switch (i3) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = ef9Var2.e;
                        int size2 = arrayList3.size();
                        int i4 = i;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            ef9 ef9Var3 = (ef9) obj2;
                            if (!ef9Var3.b) {
                                if ("td".equals(ef9Var3.a) || "th".equals(ef9Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i, ef9Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i, ef9Var3.a("rowspan"));
                                    ffb.d(pagetablecell, w(ef9Var3));
                                    if (!"th".equals(ef9Var3.a) && !ef9Var3.b("header")) {
                                        z = i;
                                    } else {
                                        z = 1;
                                    }
                                    ffb.l(pagetablecell, z);
                                    String a = ef9Var3.a("align");
                                    if (a == null) {
                                        String a2 = ef9Var3.a("style");
                                        if (a2 != null && (indexOf = (lowerCase = a2.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a = "right";
                                            }
                                        }
                                        a = null;
                                    }
                                    if ("center".equalsIgnoreCase(a)) {
                                        ffb.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a)) {
                                        ffb.k(pagetablecell, 2);
                                    }
                                    String a3 = ef9Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a3)) {
                                        ffb.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a3)) {
                                        ffb.m(pagetablecell, 2);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(ffb.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(ef9Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = yi9.f(w(ef9Var2));
                        break;
                }
                i = 0;
            }
        }
    }

    public static String q(String str) {
        String str2;
        int parseInt;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '&') {
                sb.append(charAt);
            } else {
                int i2 = i + 1;
                int indexOf = str.indexOf(59, i2);
                if (indexOf >= 0 && indexOf - i <= 12) {
                    String substring = str.substring(i2, indexOf);
                    char c = 65535;
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3000915:
                            if (substring.equals("apos")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3482377:
                            if (substring.equals("quot")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = ">";
                            break;
                        case 1:
                            str2 = "<";
                            break;
                        case 2:
                            str2 = "&";
                            break;
                        case 3:
                            str2 = "'";
                            break;
                        case 4:
                            str2 = " ";
                            break;
                        case 5:
                            str2 = "\"";
                            break;
                        default:
                            str2 = null;
                            if (substring.length() > 1 && substring.charAt(0) == '#') {
                                try {
                                    if (substring.charAt(1) != 'x' && substring.charAt(1) != 'X') {
                                        parseInt = Integer.parseInt(substring.substring(1));
                                    } else {
                                        parseInt = Integer.parseInt(substring.substring(2), 16);
                                    }
                                    str2 = new String(Character.toChars(parseInt));
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb.append(str2);
                        i = indexOf;
                    } else {
                        sb.append(charAt);
                    }
                } else {
                    sb.append(charAt);
                }
            }
            i++;
        }
        return sb.toString();
    }

    public static void r(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\n') {
                sb.append("<br>");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(charAt);
            }
            i++;
        }
    }

    public static String s(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static void t(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && !x(spannableStringBuilder.toString())) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = yi9.f(L(spannableStringBuilder));
            arrayList.add(new lk0(pageblockparagraph, 0, 0));
        }
    }

    public static TL_keyboard.RichButtonStyle u(ef9 ef9Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a = ef9Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a);
        richButtonStyle.bg_danger = "danger".equals(a);
        richButtonStyle.bg_success = "success".equals(a);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(ef9 ef9Var) {
        String a = ef9Var.a("data-type");
        if ("url".equals(a)) {
            String a2 = ef9Var.a("data-url");
            if (!TextUtils.isEmpty(a2)) {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = a2;
                return tL_inlineButtonTypeUrl;
            }
            return null;
        } else if ("copy".equals(a)) {
            String a3 = ef9Var.a("data-copy-text");
            if (!TextUtils.isEmpty(a3)) {
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = a3;
                return tL_inlineButtonTypeCopy;
            }
            return null;
        } else if ("user-profile".equals(a)) {
            long E = E(ef9Var.a("data-user-id"));
            if (E > 0) {
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = E;
                return tL_inlineButtonTypeUserProfile;
            }
            return null;
        } else {
            return null;
        }
    }

    public static CharSequence w(ef9 ef9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, ef9Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j, boolean z, boolean z2) {
        if (z) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j <= 0) {
                j = 0;
            }
            pageblockvideo.video_id = j;
            pageblockvideo.spoiler = z2;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j <= 0) {
            j = 0;
        }
        pageblockphoto.photo_id = j;
        pageblockphoto.spoiler = z2;
        return pageblockphoto;
    }

    public static java.util.ArrayList z(java.lang.String r16, java.util.HashMap r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff9.z(java.lang.String, java.util.HashMap):java.util.ArrayList");
    }
}
