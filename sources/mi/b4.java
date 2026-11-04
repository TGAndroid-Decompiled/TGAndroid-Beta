package mi;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.az;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.uy0;
public abstract class b4 {
    public static void A(java.util.ArrayList r31, java.util.ArrayList r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b4.A(java.util.ArrayList, java.util.ArrayList, java.util.Map):void");
    }

    public static a B(a4 a4Var, boolean z10) {
        TL_iv.PageBlock pageblockcollage;
        if (z10) {
            pageblockcollage = new TL_iv.pageBlockSlideshow();
        } else {
            pageblockcollage = new TL_iv.pageBlockCollage();
        }
        ArrayList j32 = t3.j3(pageblockcollage);
        ArrayList arrayList = a4Var.f19462e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.f19460b) {
                if ("figcaption".equals(a4Var2.f19459a)) {
                    charSequence = w(a4Var2);
                } else {
                    boolean equals = "video".equals(a4Var2.f19459a);
                    if (equals || "img".equals(a4Var2.f19459a)) {
                        long E = E(a4Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y9 = y(E, equals, a4Var2.b("data-spoiler"));
                            J(y9);
                            j32.add(y9);
                        }
                    }
                }
            }
        }
        if (j32.isEmpty()) {
            return null;
        }
        if (j32.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j32.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new a(pageBlock, 0, 0);
        }
        J(pageblockcollage);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockcollage, charSequence);
        }
        return new a(pageblockcollage, 0, 0);
    }

    public static int C(int i3, String str) {
        if (str != null) {
            try {
            } catch (Exception unused) {
                return i3;
            }
        }
        return Integer.parseInt(str.trim());
    }

    public static void D(a4 a4Var, ArrayList arrayList, int i3, boolean z10) {
        int i10;
        boolean z11;
        String a10;
        ArrayList arrayList2;
        int i11;
        int i12 = i3 + 1;
        ArrayList arrayList3 = a4Var.f19462e;
        int size = arrayList3.size();
        int i13 = 1;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList3.get(i14);
            i14++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.f19460b && "li".equals(a4Var2.f19459a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = a4Var2.f19462e;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    a4 a4Var3 = (a4) arrayList5.get(i15);
                    if (!a4Var3.f19460b && ("ul".equals(a4Var3.f19459a) || "ol".equals(a4Var3.f19459a))) {
                        arrayList4.add(a4Var3);
                    } else if (a4Var3.f19460b) {
                        spannableStringBuilder.append((CharSequence) q(a4Var3.f19461c));
                    } else {
                        arrayList2 = arrayList5;
                        i11 = size2;
                        h(spannableStringBuilder, a4Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i15 = i16;
                        size2 = i11;
                    }
                    arrayList2 = arrayList5;
                    i11 = size2;
                    arrayList5 = arrayList2;
                    i15 = i16;
                    size2 = i11;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = d6.f(L(spannableStringBuilder));
                if (z10) {
                    i10 = i13;
                } else {
                    i10 = 0;
                }
                a aVar = new a(pageblockparagraph, i12, i10);
                if (!a4Var2.b("data-checkbox") && ((a10 = a4Var2.a("class")) == null || !a10.toLowerCase().contains("checkbox"))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aVar.f19433e = z11;
                aVar.f19434f = a4Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList4.get(i17);
                    i17++;
                    a4 a4Var4 = (a4) obj2;
                    D(a4Var4, arrayList, i12, "ol".equals(a4Var4.f19459a));
                }
                i13++;
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

    public static void F(StringBuilder sb2, List list, int[] iArr, int i3, int i10, int i11, int i12, int i13, z3 z3Var, boolean z10, int i14, Map map) {
        int i15;
        List list2;
        boolean z11;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i16 = i3;
        z3 z3Var2 = z3Var;
        int i17 = i14;
        ArrayList arrayList = z3Var2.f20086a;
        while (true) {
            int i18 = iArr[0];
            if (i18 > i16) {
                return;
            }
            a aVar = (a) list3.get(i18);
            if (!aVar.f19436i) {
                if (aVar.f19438k.size() > i17) {
                    z3Var2.b(sb3);
                    Long l10 = (Long) ((a) list3.get(iArr[0])).f19438k.get(i17);
                    long longValue = l10.longValue();
                    int i19 = iArr[0];
                    while (true) {
                        int i20 = i19 + 1;
                        if (i20 > i16) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i20);
                        if (aVar2.f19438k.size() <= i17 || ((Long) aVar2.f19438k.get(i17)).longValue() != longValue) {
                            break;
                        }
                        i19 = i20;
                    }
                    sb3.append("<blockquote>");
                    z3 z3Var3 = new z3();
                    F(sb3, list3, iArr, i19, i10, i11, i12, i13, z3Var3, z10, i17 + 1, map);
                    z3Var3.b(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l10)) : null);
                    sb3.append("</blockquote>");
                    i16 = i3;
                    i17 = i14;
                } else {
                    if (t3.A3(aVar)) {
                        z3Var2.b(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.f19431b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i10, i11, i12, i13));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        z3 z3Var4 = new z3();
                        F(sb3, list3, iArr, i3, i10, i11, i12, i13, z3Var4, true, i14, map);
                        list2 = list3;
                        i15 = i3;
                        z3Var4.b(sb3);
                        int i21 = iArr[0];
                        if (i21 <= i15 && i21 < list2.size() && ((a) list2.get(iArr[0])).f19436i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i15 = i3;
                        list2 = list3;
                        boolean z12 = true;
                        if (aVar.f19432c > 0 && l(aVar.f19431b) != null) {
                            int i22 = aVar.f19432c;
                            boolean z13 = aVar.d > 0;
                            while (arrayList.size() > i22) {
                                z3Var2.a(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i22) {
                                    break;
                                }
                                if (z13) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z13));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) k2.p1.h(1, arrayList)).booleanValue() != z13) {
                                z3Var2.a(sb3);
                                sb3.append(z13 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z13));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i10, i11, i12, i13));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        } else {
                            z3Var2.b(sb3);
                            int i23 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.f19431b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb3.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb3.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb3.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb3.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb3.append(" data-align=\"right\"");
                                } else {
                                    sb3.append(" data-align=\"fill\"");
                                }
                                sb3.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList2 = pageblockbuttonrow.buttons;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i24);
                                        i24++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb3, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb3.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb3, (TL_iv.pageBlockTable) pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.f19435g, pageBlock);
                                sb3 = sb2;
                            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                sb3 = sb2;
                                G(sb3, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.f19435g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                sb3 = sb2;
                                G(sb3, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.f19435g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                sb3 = sb2;
                                G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.f19435g, pageBlock);
                            } else {
                                sb3 = sb2;
                                String str3 = "<figcaption>";
                                if (t3.E3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb3.append("<div class=\"");
                                    sb3.append(str4);
                                    sb3.append("\">");
                                    ArrayList j32 = t3.j3(pageBlock);
                                    if (j32 != null) {
                                        int i25 = 0;
                                        while (i25 < j32.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) j32.get(i25);
                                            ArrayList arrayList3 = aVar.h;
                                            s sVar = (arrayList3 == null || i25 >= arrayList3.size()) ? null : (s) aVar.h.get(i25);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z11 = z12;
                                                long j10 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j10 != 0) {
                                                    str = str3;
                                                    i(sb3, "video", j10, sVar, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z11 = z12;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j11 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j11 != 0) {
                                                        sb3 = sb2;
                                                        i(sb3, "img", j11, sVar, pageBlock2);
                                                        i25++;
                                                        str3 = str;
                                                        z12 = z11;
                                                    }
                                                }
                                            }
                                            sb3 = sb2;
                                            i25++;
                                            str3 = str;
                                            z12 = z11;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o10 = o(pageBlock);
                                    if (o10 != null && o10.length() > 0) {
                                        sb3.append(str5);
                                        g(sb3, o10);
                                        sb3.append("</figcaption>");
                                    }
                                    sb3.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o11 = o(pageblockmap);
                                    boolean z14 = o11 != null && o11.length() > 0;
                                    if (z14) {
                                        sb3.append("<figure>");
                                    }
                                    sb3.append("<location");
                                    if (pageblockmap.geo != null) {
                                        sb3.append(" lat=\"");
                                        sb3.append(pageblockmap.geo.lat);
                                        sb3.append('\"');
                                        sb3.append(" long=\"");
                                        sb3.append(pageblockmap.geo._long);
                                        sb3.append('\"');
                                        if (pageblockmap.geo.access_hash != 0) {
                                            sb3.append(" access=\"");
                                            sb3.append(pageblockmap.geo.access_hash);
                                            sb3.append('\"');
                                        }
                                    }
                                    if (pageblockmap.zoom != 0) {
                                        sb3.append(" zoom=\"");
                                        sb3.append(pageblockmap.zoom);
                                        sb3.append('\"');
                                    }
                                    if (pageblockmap.f27226w != 0) {
                                        sb3.append(" w=\"");
                                        sb3.append(pageblockmap.f27226w);
                                        sb3.append('\"');
                                    }
                                    if (pageblockmap.h != 0) {
                                        sb3.append(" h=\"");
                                        sb3.append(pageblockmap.h);
                                        sb3.append('\"');
                                    }
                                    sb3.append(" />");
                                    if (z14) {
                                        sb3.append("<figcaption>");
                                        g(sb3, o11);
                                        sb3.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l11 = l(pageBlock);
                                    if (l11 == null) {
                                        SpannableStringBuilder o12 = o(pageBlock);
                                        if (o12 != null && o12.length() > 0) {
                                            sb3.append("<p>");
                                            g(sb3, o12);
                                            sb3.append("</p>");
                                        }
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                        if (!TextUtils.isEmpty(str6)) {
                                            sb3.append("<pre language=\"");
                                            sb3.append(s(str6));
                                            sb3.append("\">");
                                        } else {
                                            sb3.append("<pre>");
                                        }
                                        g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                        sb3.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb3.append("<blockquote class=\"pull\">");
                                        g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                        c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb3.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb3.append("<blockquote collapsed>");
                                        } else {
                                            sb3.append("<blockquote>");
                                        }
                                        g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                        c(sb3, k(pageblockblockquote.caption));
                                        sb3.append("</blockquote>");
                                    } else {
                                        sb3.append('<');
                                        sb3.append(l11);
                                        sb3.append('>');
                                        g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                        sb3.append("</");
                                        sb3.append(l11);
                                        sb3.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                z3Var2 = z3Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            z3Var2 = z3Var;
                        }
                    }
                    i17 = i14;
                    list3 = list2;
                    i16 = i15;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        boolean z10;
        if (j10 != 0) {
            SpannableStringBuilder o10 = o(pageBlock);
            if (o10 != null && o10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append("<figure>");
            }
            i(sb2, str, j10, sVar, pageBlock);
            if (z10) {
                sb2.append("<figcaption>");
                g(sb2, o10);
                sb2.append("</figcaption></figure>");
            }
        }
    }

    public static void H(StringBuilder sb2, TL_iv.pageBlockTable pageblocktable) {
        SpannableStringBuilder spannableStringBuilder;
        ArrayList<TL_iv.pageTableCell> arrayList;
        String str;
        String str2;
        String str3;
        sb2.append("<table");
        if (pageblocktable.bordered) {
            sb2.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb2.append(" class=\"");
            if (pageblocktable.striped) {
                sb2.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb2.append(' ');
            }
            if (pageblocktable.compact) {
                sb2.append("compact");
            }
            sb2.append('\"');
        }
        sb2.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null) {
            spannableStringBuilder = d6.r(richText, null, true);
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null && spannableStringBuilder.length() > 0) {
            sb2.append("<caption>");
            g(sb2, spannableStringBuilder);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i3);
                i3++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i10);
                        i10++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            if (pagetablecell2.header) {
                                str = "th";
                            } else {
                                str = "td";
                            }
                            sb2.append('<');
                            sb2.append(str);
                            int i11 = pagetablecell2.colspan;
                            if (i11 <= 1) {
                                i11 = 0;
                            }
                            if (i11 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i11);
                                sb2.append('\"');
                            }
                            int i12 = pagetablecell2.rowspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.align_right) {
                                str2 = "right";
                            } else if (pagetablecell2.align_center) {
                                str2 = "center";
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb2.append(" align=\"");
                                sb2.append(str2);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.valign_bottom) {
                                str3 = "bottom";
                            } else if (pagetablecell2.valign_middle) {
                                str3 = "middle";
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                sb2.append(" valign=\"");
                                sb2.append(str3);
                                sb2.append('\"');
                            }
                            sb2.append('>');
                            g(sb2, f6.h(pagetablecell2));
                            sb2.append("</");
                            sb2.append(str);
                            sb2.append('>');
                        }
                    }
                }
                sb2.append("</tr>");
            }
        }
        sb2.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = d6.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i3, int i10, int i11, int i12, int i13) {
        CharSequence A;
        int i14;
        int i15;
        if (t3.A3(aVar)) {
            A = d6.r(((TL_iv.pageBlockDetails) aVar.f19431b).title, null, true);
        } else {
            A = b6.A(aVar.f19431b);
        }
        if (A == null) {
            A = "";
        }
        int length = A.length();
        if (i3 == i10) {
            i14 = Math.max(0, Math.min(i12, length));
        } else {
            i14 = 0;
        }
        if (i3 == i11) {
            i15 = Math.max(0, Math.min(i13, length));
        } else {
            i15 = length;
        }
        if (i14 > i15) {
            int i16 = i14;
            i14 = i15;
            i15 = i16;
        }
        if (i14 == 0 && i15 == length) {
            return A;
        }
        return A.subSequence(i14, i15);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i3 = 0;
        while (i3 < length && ((charAt = spannableStringBuilder.charAt(i3)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i3++;
        }
        while (length > i3) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        if (i3 == 0 && length == spannableStringBuilder.length()) {
            return spannableStringBuilder;
        }
        return spannableStringBuilder.subSequence(i3, length);
    }

    public static void a(ArrayList arrayList, a aVar) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, a4Var, 0, null, 0L);
        b6.d(pageBlock, L(spannableStringBuilder));
        arrayList.add(new a(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb2, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && spannableStringBuilder.length() != 0) {
            sb2.append("<cite>");
            g(sb2, spannableStringBuilder);
            sb2.append("</cite>");
        }
    }

    public static void d(StringBuilder sb2, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        String str;
        if (!j4.c(inlineButtonType)) {
            return;
        }
        sb2.append("<button");
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            sb2.append(" data-type=\"url\" data-url=\"");
            sb2.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
            sb2.append("\"");
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            sb2.append(" data-type=\"copy\" data-copy-text=\"");
            sb2.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
            sb2.append("\"");
        } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            sb2.append(" data-type=\"user-profile\" data-user-id=\"");
            sb2.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
            sb2.append("\"");
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
            sb2.append(" data-style=\"");
            sb2.append(str);
            sb2.append("\"");
        }
        sb2.append(">");
        g(sb2, d6.r(richText, null, true));
        sb2.append("</button>");
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, a4 a4Var, int i3, String str, long j10) {
        SpannableStringBuilder spannableStringBuilder2;
        int i10;
        String str2;
        long j11;
        ArrayList arrayList = a4Var.f19462e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a4 a4Var2 = (a4) obj;
            if (a4Var2.f19460b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i3;
                str2 = str;
                j11 = j10;
                j(spannableStringBuilder2, q(a4Var2.f19461c), i10, str2, j11);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i3;
                str2 = str;
                j11 = j10;
                h(spannableStringBuilder2, a4Var2, i10, str2, j11);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i3 = i10;
            str = str2;
            j10 = j11;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = a4Var.f19462e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a4 a4Var2 = (a4) obj;
            if (a4Var2.f19460b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(a4Var2.f19461c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(a4Var2.f19459a)) {
                    h(spannableStringBuilder2, a4Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void g(java.lang.StringBuilder r22, java.lang.CharSequence r23) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b4.g(java.lang.StringBuilder, java.lang.CharSequence):void");
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, a4 a4Var, int i3, String str, long j10) {
        int i10;
        String str2;
        int i11;
        long j11;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(a4Var.f19459a) && (v = v(a4Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, a4Var, i3, str, j10);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = d6.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(a4Var);
                spannableStringBuilder.setSpan(new j4(textbutton), length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        String str3 = a4Var.f19459a;
        str3.getClass();
        char c2 = 65535;
        switch (str3.hashCode()) {
            case -1999048254:
                if (str3.equals("spoiler")) {
                    c2 = 0;
                    break;
                }
                break;
            case -891985998:
                if (str3.equals("strike")) {
                    c2 = 1;
                    break;
                }
                break;
            case -891980137:
                if (str3.equals("strong")) {
                    c2 = 2;
                    break;
                }
                break;
            case 97:
                if (str3.equals("a")) {
                    c2 = 3;
                    break;
                }
                break;
            case 98:
                if (str3.equals("b")) {
                    c2 = 4;
                    break;
                }
                break;
            case 105:
                if (str3.equals("i")) {
                    c2 = 5;
                    break;
                }
                break;
            case 115:
                if (str3.equals("s")) {
                    c2 = 6;
                    break;
                }
                break;
            case 117:
                if (str3.equals("u")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3152:
                if (str3.equals("br")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 3240:
                if (str3.equals("em")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 3712:
                if (str3.equals("tt")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 99339:
                if (str3.equals("del")) {
                    c2 = 11;
                    break;
                }
                break;
            case 114240:
                if (str3.equals("sub")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 114254:
                if (str3.equals("sup")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 3059181:
                if (str3.equals("code")) {
                    c2 = 14;
                    break;
                }
                break;
            case 3344077:
                if (str3.equals("mark")) {
                    c2 = 15;
                    break;
                }
                break;
            case 1438365596:
                if (str3.equals("animated-emoji")) {
                    c2 = 16;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                i10 = i3 | 256;
                str2 = str;
                j11 = j10;
                break;
            case 1:
            case 6:
            case 11:
                i10 = i3 | 8;
                str2 = str;
                j11 = j10;
                break;
            case 2:
            case 4:
                i10 = i3 | 1;
                str2 = str;
                j11 = j10;
                break;
            case 3:
                String a10 = a4Var.a("href");
                if (a10 != null) {
                    str2 = a10;
                    i10 = i3;
                    j11 = j10;
                    break;
                }
                i10 = i3;
                str2 = str;
                j11 = j10;
            case 5:
            case '\t':
                i10 = i3 | 2;
                str2 = str;
                j11 = j10;
                break;
            case 7:
                i10 = i3 | 16;
                str2 = str;
                j11 = j10;
                break;
            case '\b':
                j(spannableStringBuilder, "\n", i3, str, j10);
                return;
            case '\n':
            case 14:
                i10 = i3 | 4;
                str2 = str;
                j11 = j10;
                break;
            case '\f':
                i10 = i3 | 16384;
                str2 = str;
                j11 = j10;
                break;
            case '\r':
                i11 = 32768;
                i10 = i11 | i3;
                str2 = str;
                j11 = j10;
                break;
            case 15:
                i11 = 65536;
                i10 = i11 | i3;
                str2 = str;
                j11 = j10;
                break;
            case 16:
                String a11 = a4Var.a("data-document-id");
                if (a11 != null) {
                    try {
                        j11 = Long.parseLong(a11.trim());
                        i10 = i3;
                        str2 = str;
                        break;
                    } catch (Exception unused) {
                    }
                }
                i10 = i3;
                str2 = str;
                j11 = j10;
                break;
            default:
                i10 = i3;
                str2 = str;
                j11 = j10;
                break;
        }
        if (a4Var.f19462e.isEmpty() && !a4Var.f19460b) {
            return;
        }
        e(spannableStringBuilder, a4Var, i10, str2, j11);
    }

    public static void i(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j10);
        sb2.append('\"');
        if (sVar != null) {
            if (sVar.f19866j > 0) {
                sb2.append(" width=\"");
                sb2.append(sVar.f19866j);
                sb2.append('\"');
            }
            if (sVar.f19867k > 0) {
                sb2.append(" height=\"");
                sb2.append(sVar.f19867k);
                sb2.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        sb2.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i3, String str2, long j10) {
        if (str != null && str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j10 != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(j10, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i3 != 0) {
                ?? obj = new Object();
                obj.f38578a = i3 & 114975;
                spannableStringBuilder.setSpan(new uy0(obj, org.telegram.messenger.g0.L(az.W0)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(d6.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r5 = d6.r(richText, null, true);
        if (r5.length() <= 0) {
            return null;
        }
        return r5;
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

    public static mi.a m(mi.a4 r8) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b4.m(mi.a4):mi.a");
    }

    public static a n(a4 a4Var, boolean z10) {
        long E = E(a4Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y9 = y(E, z10, a4Var.b("data-spoiler"));
        J(y9);
        return new a(y9, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r5 = d6.r(richText, null, true);
            if (r5.length() > 0) {
                return r5;
            }
        }
        return null;
    }

    public static void p(a4 a4Var, TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        String lowerCase;
        int indexOf;
        ArrayList arrayList = a4Var.f19462e;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a4 a4Var2 = (a4) obj;
            if (!a4Var2.f19460b) {
                String str = a4Var2.f19459a;
                str.getClass();
                int i11 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i11 = i3;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i11 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i11 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i11 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i11 = 4;
                            break;
                        }
                        break;
                }
                switch (i11) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = a4Var2.f19462e;
                        int size2 = arrayList3.size();
                        int i12 = i3;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            a4 a4Var3 = (a4) obj2;
                            if (!a4Var3.f19460b) {
                                if ("td".equals(a4Var3.f19459a) || "th".equals(a4Var3.f19459a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i3, a4Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i3, a4Var3.a("rowspan"));
                                    f6.d(pagetablecell, w(a4Var3));
                                    if (!"th".equals(a4Var3.f19459a) && !a4Var3.b("header")) {
                                        z10 = i3;
                                    } else {
                                        z10 = 1;
                                    }
                                    f6.l(pagetablecell, z10);
                                    String a10 = a4Var3.a("align");
                                    if (a10 == null) {
                                        String a11 = a4Var3.a("style");
                                        if (a11 != null && (indexOf = (lowerCase = a11.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a10 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a10 = "right";
                                            }
                                        }
                                        a10 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a10)) {
                                        f6.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a10)) {
                                        f6.k(pagetablecell, 2);
                                    }
                                    String a12 = a4Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a12)) {
                                        f6.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a12)) {
                                        f6.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i3 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(f6.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(a4Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = d6.f(w(a4Var2));
                        break;
                }
                i3 = 0;
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
        StringBuilder sb2 = new StringBuilder(str.length());
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i10 = i3 + 1;
                int indexOf = str.indexOf(59, i10);
                if (indexOf >= 0 && indexOf - i3 <= 12) {
                    String substring = str.substring(i10, indexOf);
                    substring.getClass();
                    char c2 = 65535;
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 3000915:
                            if (substring.equals("apos")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3482377:
                            if (substring.equals("quot")) {
                                c2 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
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
                                        str2 = new String(Character.toChars(parseInt));
                                        break;
                                    }
                                    parseInt = Integer.parseInt(substring.substring(2), 16);
                                    str2 = new String(Character.toChars(parseInt));
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb2.append(str2);
                        i3 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                } else {
                    sb2.append(charAt);
                }
            }
            i3++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i3, int i10) {
        while (i3 < i10) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n') {
                sb2.append("<br>");
            } else if (charAt == '<') {
                sb2.append("&lt;");
            } else if (charAt == '>') {
                sb2.append("&gt;");
            } else if (charAt == '&') {
                sb2.append("&amp;");
            } else {
                sb2.append(charAt);
            }
            i3++;
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
            pageblockparagraph.text = d6.f(L(spannableStringBuilder));
            arrayList.add(new a(pageblockparagraph, 0, 0));
        }
    }

    public static TL_keyboard.RichButtonStyle u(a4 a4Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a10 = a4Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a10);
        richButtonStyle.bg_danger = "danger".equals(a10);
        richButtonStyle.bg_success = "success".equals(a10);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(a4 a4Var) {
        String a10 = a4Var.a("data-type");
        if ("url".equals(a10)) {
            String a11 = a4Var.a("data-url");
            if (!TextUtils.isEmpty(a11)) {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = a11;
                return tL_inlineButtonTypeUrl;
            }
            return null;
        } else if ("copy".equals(a10)) {
            String a12 = a4Var.a("data-copy-text");
            if (!TextUtils.isEmpty(a12)) {
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = a12;
                return tL_inlineButtonTypeCopy;
            }
            return null;
        } else if ("user-profile".equals(a10)) {
            long E = E(a4Var.a("data-user-id"));
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

    public static CharSequence w(a4 a4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, a4Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j10, boolean z10, boolean z11) {
        if (z10) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j10 <= 0) {
                j10 = 0;
            }
            pageblockvideo.video_id = j10;
            pageblockvideo.spoiler = z11;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j10 <= 0) {
            j10 = 0;
        }
        pageblockphoto.photo_id = j10;
        pageblockphoto.spoiler = z11;
        return pageblockphoto;
    }

    public static java.util.ArrayList z(java.lang.String r16, java.util.HashMap r17) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b4.z(java.lang.String, java.util.HashMap):java.util.ArrayList");
    }
}
