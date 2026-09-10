package hi;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.c11;
public abstract class g4 {
    public static void A(java.util.ArrayList r31, java.util.ArrayList r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g4.A(java.util.ArrayList, java.util.ArrayList, java.util.Map):void");
    }

    public static a B(f4 f4Var, boolean z10) {
        TL_iv.PageBlock pageblockcollage;
        if (z10) {
            pageblockcollage = new TL_iv.pageBlockSlideshow();
        } else {
            pageblockcollage = new TL_iv.pageBlockCollage();
        }
        ArrayList f32 = z3.f3(pageblockcollage);
        ArrayList arrayList = f4Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f4 f4Var2 = (f4) obj;
            if (!f4Var2.f9570b) {
                if ("figcaption".equals(f4Var2.f9569a)) {
                    charSequence = w(f4Var2);
                } else {
                    boolean equals = "video".equals(f4Var2.f9569a);
                    if (equals || "img".equals(f4Var2.f9569a)) {
                        long E = E(f4Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y3 = y(E, equals, f4Var2.b("data-spoiler"));
                            J(y3);
                            f32.add(y3);
                        }
                    }
                }
            }
        }
        if (f32.isEmpty()) {
            return null;
        }
        if (f32.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) f32.get(0);
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

    public static int C(int i10, String str) {
        if (str != null) {
            try {
            } catch (Exception unused) {
                return i10;
            }
        }
        return Integer.parseInt(str.trim());
    }

    public static void D(f4 f4Var, ArrayList arrayList, int i10, boolean z10) {
        int i11;
        boolean z11;
        String a2;
        ArrayList arrayList2;
        int i12;
        int i13 = i10 + 1;
        ArrayList arrayList3 = f4Var.e;
        int size = arrayList3.size();
        int i14 = 1;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList3.get(i15);
            i15++;
            f4 f4Var2 = (f4) obj;
            if (!f4Var2.f9570b && "li".equals(f4Var2.f9569a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = f4Var2.e;
                int size2 = arrayList5.size();
                int i16 = 0;
                while (i16 < size2) {
                    int i17 = i16 + 1;
                    f4 f4Var3 = (f4) arrayList5.get(i16);
                    if (!f4Var3.f9570b && ("ul".equals(f4Var3.f9569a) || "ol".equals(f4Var3.f9569a))) {
                        arrayList4.add(f4Var3);
                    } else if (f4Var3.f9570b) {
                        spannableStringBuilder.append((CharSequence) q(f4Var3.f9571c));
                    } else {
                        arrayList2 = arrayList5;
                        i12 = size2;
                        h(spannableStringBuilder, f4Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i16 = i17;
                        size2 = i12;
                    }
                    arrayList2 = arrayList5;
                    i12 = size2;
                    arrayList5 = arrayList2;
                    i16 = i17;
                    size2 = i12;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = i6.f(L(spannableStringBuilder));
                if (z10) {
                    i11 = i14;
                } else {
                    i11 = 0;
                }
                a aVar = new a(pageblockparagraph, i13, i11);
                if (!f4Var2.b("data-checkbox") && ((a2 = f4Var2.a("class")) == null || !a2.toLowerCase().contains("checkbox"))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aVar.e = z11;
                aVar.f9423f = f4Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj2 = arrayList4.get(i18);
                    i18++;
                    f4 f4Var4 = (f4) obj2;
                    D(f4Var4, arrayList, i13, "ol".equals(f4Var4.f9569a));
                }
                i14++;
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

    public static void F(StringBuilder sb2, List list, int[] iArr, int i10, int i11, int i12, int i13, int i14, c5.m mVar, boolean z10, int i15, Map map) {
        int i16;
        List list2;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i17 = i10;
        c5.m mVar2 = mVar;
        int i18 = i15;
        ArrayList arrayList = mVar2.f4326a;
        while (true) {
            int i19 = iArr[0];
            if (i19 > i17) {
                return;
            }
            a aVar = (a) list3.get(i19);
            if (!aVar.f9425i) {
                if (aVar.f9427k.size() > i18) {
                    mVar2.c(sb3);
                    Long l4 = (Long) ((a) list3.get(iArr[0])).f9427k.get(i18);
                    long longValue = l4.longValue();
                    int i20 = iArr[0];
                    while (true) {
                        int i21 = i20 + 1;
                        if (i21 > i17) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i21);
                        if (aVar2.f9427k.size() <= i18 || ((Long) aVar2.f9427k.get(i18)).longValue() != longValue) {
                            break;
                        }
                        i20 = i21;
                    }
                    sb3.append("<blockquote>");
                    c5.m mVar3 = new c5.m();
                    F(sb3, list3, iArr, i20, i11, i12, i13, i14, mVar3, z10, i18 + 1, map);
                    mVar3.c(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l4)) : null);
                    sb3.append("</blockquote>");
                    i17 = i10;
                    i18 = i15;
                } else {
                    if (z3.w3(aVar)) {
                        mVar2.c(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.f9421b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i11, i12, i13, i14));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        c5.m mVar4 = new c5.m();
                        F(sb3, list3, iArr, i10, i11, i12, i13, i14, mVar4, true, i15, map);
                        list2 = list3;
                        i16 = i10;
                        mVar4.c(sb3);
                        int i22 = iArr[0];
                        if (i22 <= i16 && i22 < list2.size() && ((a) list2.get(iArr[0])).f9425i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i16 = i10;
                        list2 = list3;
                        if (aVar.f9422c > 0 && l(aVar.f9421b) != null) {
                            int i23 = aVar.f9422c;
                            boolean z11 = aVar.d > 0;
                            while (arrayList.size() > i23) {
                                mVar2.b(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i23) {
                                    break;
                                }
                                if (z11) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z11));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) hc.b.i(1, arrayList)).booleanValue() != z11) {
                                mVar2.b(sb3);
                                sb3.append(z11 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z11));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i11, i12, i13, i14));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        } else {
                            mVar2.c(sb3);
                            int i24 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.f9421b;
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
                                    int i25 = 0;
                                    while (i25 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i25);
                                        i25++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb3, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb3.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb3, (TL_iv.pageBlockTable) pageBlock);
                            } else {
                                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                    G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.f9424g, pageBlock);
                                    sb3 = sb2;
                                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                    sb3 = sb2;
                                    G(sb3, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.f9424g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                    sb3 = sb2;
                                    G(sb3, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.f9424g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                    sb3 = sb2;
                                    G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.f9424g, pageBlock);
                                } else {
                                    sb3 = sb2;
                                    String str3 = "<figcaption>";
                                    if (z3.A3(pageBlock)) {
                                        String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                        sb3.append("<div class=\"");
                                        sb3.append(str4);
                                        sb3.append("\">");
                                        ArrayList f32 = z3.f3(pageBlock);
                                        if (f32 != null) {
                                            int i26 = 0;
                                            while (i26 < f32.size()) {
                                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) f32.get(i26);
                                                ArrayList arrayList3 = aVar.h;
                                                v vVar = (arrayList3 == null || i26 >= arrayList3.size()) ? null : (v) aVar.h.get(i26);
                                                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                    long j3 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                    if (j3 != 0) {
                                                        str = str3;
                                                        i(sb3, "video", j3, vVar, pageBlock2);
                                                    } else {
                                                        str = str3;
                                                    }
                                                } else {
                                                    str = str3;
                                                    if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                        long j10 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                        if (j10 != 0) {
                                                            sb3 = sb2;
                                                            i(sb3, "img", j10, vVar, pageBlock2);
                                                            i26++;
                                                            str3 = str;
                                                        }
                                                    }
                                                }
                                                sb3 = sb2;
                                                i26++;
                                                str3 = str;
                                            }
                                        }
                                        String str5 = str3;
                                        SpannableStringBuilder o9 = o(pageBlock);
                                        if (o9 != null && o9.length() > 0) {
                                            sb3.append(str5);
                                            g(sb3, o9);
                                            sb3.append("</figcaption>");
                                        }
                                        sb3.append("</div>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                        SpannableStringBuilder o10 = o(pageblockmap);
                                        boolean z12 = o10 != null && o10.length() > 0;
                                        if (z12) {
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
                                        if (pageblockmap.f17421w != 0) {
                                            sb3.append(" w=\"");
                                            sb3.append(pageblockmap.f17421w);
                                            sb3.append('\"');
                                        }
                                        if (pageblockmap.h != 0) {
                                            sb3.append(" h=\"");
                                            sb3.append(pageblockmap.h);
                                            sb3.append('\"');
                                        }
                                        sb3.append(" />");
                                        if (z12) {
                                            sb3.append("<figcaption>");
                                            g(sb3, o10);
                                            sb3.append("</figcaption></figure>");
                                        }
                                    } else {
                                        String l10 = l(pageBlock);
                                        if (l10 == null) {
                                            SpannableStringBuilder o11 = o(pageBlock);
                                            if (o11 != null && o11.length() > 0) {
                                                sb3.append("<p>");
                                                g(sb3, o11);
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
                                            g(sb3, K(aVar, i24, i11, i12, i13, i14));
                                            sb3.append("</pre>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                            sb3.append("<blockquote class=\"pull\">");
                                            g(sb3, K(aVar, i24, i11, i12, i13, i14));
                                            c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                            sb3.append("</blockquote>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                            if (pageblockblockquote.collapsed) {
                                                sb3.append("<blockquote collapsed>");
                                            } else {
                                                sb3.append("<blockquote>");
                                            }
                                            g(sb3, K(aVar, i24, i11, i12, i13, i14));
                                            c(sb3, k(pageblockblockquote.caption));
                                            sb3.append("</blockquote>");
                                        } else {
                                            sb3.append('<');
                                            sb3.append(l10);
                                            sb3.append('>');
                                            g(sb3, K(aVar, i24, i11, i12, i13, i14));
                                            sb3.append("</");
                                            sb3.append(l10);
                                            sb3.append('>');
                                        }
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                mVar2 = mVar;
                            }
                            iArr[0] = iArr[0] + 1;
                            mVar2 = mVar;
                        }
                    }
                    i18 = i15;
                    list3 = list2;
                    i17 = i16;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j3, v vVar, TL_iv.PageBlock pageBlock) {
        boolean z10;
        if (j3 != 0) {
            SpannableStringBuilder o9 = o(pageBlock);
            if (o9 != null && o9.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append("<figure>");
            }
            i(sb2, str, j3, vVar, pageBlock);
            if (z10) {
                sb2.append("<figcaption>");
                g(sb2, o9);
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
            spannableStringBuilder = i6.r(richText, null, true);
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
            int i10 = 0;
            while (i10 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i10);
                i10++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i11);
                        i11++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            if (pagetablecell2.header) {
                                str = "th";
                            } else {
                                str = "td";
                            }
                            sb2.append('<');
                            sb2.append(str);
                            int i12 = pagetablecell2.colspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            int i13 = pagetablecell2.rowspan;
                            if (i13 <= 1) {
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i13);
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
                            g(sb2, l6.h(pagetablecell2));
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
        pageCaption.text = i6.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i10, int i11, int i12, int i13, int i14) {
        CharSequence A;
        int i15;
        int i16;
        if (z3.w3(aVar)) {
            A = i6.r(((TL_iv.pageBlockDetails) aVar.f9421b).title, null, true);
        } else {
            A = g6.A(aVar.f9421b);
        }
        if (A == null) {
            A = "";
        }
        int length = A.length();
        if (i10 == i11) {
            i15 = Math.max(0, Math.min(i13, length));
        } else {
            i15 = 0;
        }
        if (i10 == i12) {
            i16 = Math.max(0, Math.min(i14, length));
        } else {
            i16 = length;
        }
        if (i15 > i16) {
            int i17 = i15;
            i15 = i16;
            i16 = i17;
        }
        if (i15 == 0 && i16 == length) {
            return A;
        }
        return A.subSequence(i15, i16);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        while (i10 < length && ((charAt = spannableStringBuilder.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i10++;
        }
        while (length > i10) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        if (i10 == 0 && length == spannableStringBuilder.length()) {
            return spannableStringBuilder;
        }
        return spannableStringBuilder.subSequence(i10, length);
    }

    public static void a(a aVar, ArrayList arrayList) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, f4 f4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, f4Var, 0, null, 0L);
        g6.d(pageBlock, L(spannableStringBuilder));
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
        if (!n4.c(inlineButtonType)) {
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
        g(sb2, i6.r(richText, null, true));
        sb2.append("</button>");
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, f4 f4Var, int i10, String str, long j3) {
        SpannableStringBuilder spannableStringBuilder2;
        int i11;
        String str2;
        long j10;
        ArrayList arrayList = f4Var.e;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            f4 f4Var2 = (f4) obj;
            if (f4Var2.f9570b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j10 = j3;
                j(spannableStringBuilder2, q(f4Var2.f9571c), i11, str2, j10);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j10 = j3;
                h(spannableStringBuilder2, f4Var2, i11, str2, j10);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i10 = i11;
            str = str2;
            j3 = j10;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, f4 f4Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = f4Var.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f4 f4Var2 = (f4) obj;
            if (f4Var2.f9570b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(f4Var2.f9571c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(f4Var2.f9569a)) {
                    h(spannableStringBuilder2, f4Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void g(java.lang.StringBuilder r22, java.lang.CharSequence r23) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g4.g(java.lang.StringBuilder, java.lang.CharSequence):void");
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, f4 f4Var, int i10, String str, long j3) {
        int i11;
        String str2;
        int i12;
        long j10;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(f4Var.f9569a) && (v = v(f4Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, f4Var, i10, str, j3);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = i6.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(f4Var);
                spannableStringBuilder.setSpan(new n4(textbutton), length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        String str3 = f4Var.f9569a;
        str3.getClass();
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -1999048254:
                if (str3.equals("spoiler")) {
                    c10 = 0;
                    break;
                }
                break;
            case -891985998:
                if (str3.equals("strike")) {
                    c10 = 1;
                    break;
                }
                break;
            case -891980137:
                if (str3.equals("strong")) {
                    c10 = 2;
                    break;
                }
                break;
            case 97:
                if (str3.equals("a")) {
                    c10 = 3;
                    break;
                }
                break;
            case 98:
                if (str3.equals("b")) {
                    c10 = 4;
                    break;
                }
                break;
            case 105:
                if (str3.equals("i")) {
                    c10 = 5;
                    break;
                }
                break;
            case 115:
                if (str3.equals("s")) {
                    c10 = 6;
                    break;
                }
                break;
            case 117:
                if (str3.equals("u")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3152:
                if (str3.equals("br")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3240:
                if (str3.equals("em")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3712:
                if (str3.equals("tt")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 99339:
                if (str3.equals("del")) {
                    c10 = 11;
                    break;
                }
                break;
            case 114240:
                if (str3.equals("sub")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 114254:
                if (str3.equals("sup")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3059181:
                if (str3.equals("code")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3344077:
                if (str3.equals("mark")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1438365596:
                if (str3.equals("animated-emoji")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i11 = i10 | 256;
                str2 = str;
                j10 = j3;
                break;
            case 1:
            case 6:
            case 11:
                i11 = i10 | 8;
                str2 = str;
                j10 = j3;
                break;
            case 2:
            case 4:
                i11 = i10 | 1;
                str2 = str;
                j10 = j3;
                break;
            case 3:
                String a2 = f4Var.a("href");
                if (a2 != null) {
                    str2 = a2;
                    i11 = i10;
                    j10 = j3;
                    break;
                }
                i11 = i10;
                str2 = str;
                j10 = j3;
            case 5:
            case '\t':
                i11 = i10 | 2;
                str2 = str;
                j10 = j3;
                break;
            case 7:
                i11 = i10 | 16;
                str2 = str;
                j10 = j3;
                break;
            case '\b':
                j(spannableStringBuilder, "\n", i10, str, j3);
                return;
            case '\n':
            case 14:
                i11 = i10 | 4;
                str2 = str;
                j10 = j3;
                break;
            case '\f':
                i11 = i10 | 16384;
                str2 = str;
                j10 = j3;
                break;
            case '\r':
                i12 = 32768;
                i11 = i12 | i10;
                str2 = str;
                j10 = j3;
                break;
            case 15:
                i12 = 65536;
                i11 = i12 | i10;
                str2 = str;
                j10 = j3;
                break;
            case 16:
                String a10 = f4Var.a("data-document-id");
                if (a10 != null) {
                    try {
                        j10 = Long.parseLong(a10.trim());
                        i11 = i10;
                        str2 = str;
                        break;
                    } catch (Exception unused) {
                    }
                }
                i11 = i10;
                str2 = str;
                j10 = j3;
                break;
            default:
                i11 = i10;
                str2 = str;
                j10 = j3;
                break;
        }
        if (f4Var.e.isEmpty() && !f4Var.f9570b) {
            return;
        }
        e(spannableStringBuilder, f4Var, i11, str2, j10);
    }

    public static void i(StringBuilder sb2, String str, long j3, v vVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j3);
        sb2.append('\"');
        if (vVar != null) {
            if (vVar.f9900j > 0) {
                sb2.append(" width=\"");
                sb2.append(vVar.f9900j);
                sb2.append('\"');
            }
            if (vVar.f9901k > 0) {
                sb2.append(" height=\"");
                sb2.append(vVar.f9901k);
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

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i10, String str2, long j3) {
        if (str != null && str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j3 != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j3, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i10 != 0) {
                ?? obj = new Object();
                obj.f21677a = i10 & 114975;
                spannableStringBuilder.setSpan(new c11(obj, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(i6.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r10 = i6.r(richText, null, true);
        if (r10.length() <= 0) {
            return null;
        }
        return r10;
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

    public static hi.a m(hi.f4 r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g4.m(hi.f4):hi.a");
    }

    public static a n(f4 f4Var, boolean z10) {
        long E = E(f4Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y3 = y(E, z10, f4Var.b("data-spoiler"));
        J(y3);
        return new a(y3, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r10 = i6.r(richText, null, true);
            if (r10.length() > 0) {
                return r10;
            }
        }
        return null;
    }

    public static void p(f4 f4Var, TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        String lowerCase;
        int indexOf;
        ArrayList arrayList = f4Var.e;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            f4 f4Var2 = (f4) obj;
            if (!f4Var2.f9570b) {
                String str = f4Var2.f9569a;
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = f4Var2.e;
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            f4 f4Var3 = (f4) obj2;
                            if (!f4Var3.f9570b) {
                                if ("td".equals(f4Var3.f9569a) || "th".equals(f4Var3.f9569a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i10, f4Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i10, f4Var3.a("rowspan"));
                                    l6.d(pagetablecell, w(f4Var3));
                                    if (!"th".equals(f4Var3.f9569a) && !f4Var3.b("header")) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    l6.l(pagetablecell, z10);
                                    String a2 = f4Var3.a("align");
                                    if (a2 == null) {
                                        String a10 = f4Var3.a("style");
                                        if (a10 != null && (indexOf = (lowerCase = a10.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a2 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a2 = "right";
                                            }
                                        }
                                        a2 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a2)) {
                                        l6.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a2)) {
                                        l6.k(pagetablecell, 2);
                                    }
                                    String a11 = f4Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a11)) {
                                        l6.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a11)) {
                                        l6.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i10 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(l6.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(f4Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = i6.f(w(f4Var2));
                        break;
                }
                i10 = 0;
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
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i11 = i10 + 1;
                int indexOf = str.indexOf(59, i11);
                if (indexOf >= 0 && indexOf - i10 <= 12) {
                    String substring = str.substring(i11, indexOf);
                    substring.getClass();
                    char c10 = 65535;
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3000915:
                            if (substring.equals("apos")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 3482377:
                            if (substring.equals("quot")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
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
                        i10 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                } else {
                    sb2.append(charAt);
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
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
            i10++;
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
            pageblockparagraph.text = i6.f(L(spannableStringBuilder));
            arrayList.add(new a(pageblockparagraph, 0, 0));
        }
    }

    public static TL_keyboard.RichButtonStyle u(f4 f4Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a2 = f4Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a2);
        richButtonStyle.bg_danger = "danger".equals(a2);
        richButtonStyle.bg_success = "success".equals(a2);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(f4 f4Var) {
        String a2 = f4Var.a("data-type");
        if ("url".equals(a2)) {
            String a10 = f4Var.a("data-url");
            if (!TextUtils.isEmpty(a10)) {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = a10;
                return tL_inlineButtonTypeUrl;
            }
            return null;
        } else if ("copy".equals(a2)) {
            String a11 = f4Var.a("data-copy-text");
            if (!TextUtils.isEmpty(a11)) {
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = a11;
                return tL_inlineButtonTypeCopy;
            }
            return null;
        } else if ("user-profile".equals(a2)) {
            long E = E(f4Var.a("data-user-id"));
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

    public static CharSequence w(f4 f4Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, f4Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j3, boolean z10, boolean z11) {
        if (z10) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j3 <= 0) {
                j3 = 0;
            }
            pageblockvideo.video_id = j3;
            pageblockvideo.spoiler = z11;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j3 <= 0) {
            j3 = 0;
        }
        pageblockphoto.photo_id = j3;
        pageblockphoto.spoiler = z11;
        return pageblockphoto;
    }

    public static java.util.ArrayList z(java.lang.String r16, java.util.HashMap r17) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g4.z(java.lang.String, java.util.HashMap):java.util.ArrayList");
    }
}
