package ii;

import ai.h7;
import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
public final class j6 {
    public final TL_iv.pageBlockTable f12521a;
    public int f12522b;
    public int f12523c;
    public TL_iv.pageTableCell[][] d;
    public int[][] f12524e;
    public int[][] f12525f;
    public final ArrayList f12526g = new ArrayList();

    public j6(TL_iv.pageBlockTable pageblocktable) {
        this.f12521a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        int i10;
        int i11;
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i12 = pagetablecell.flags;
        int i13 = i12 | 128;
        pagetablecell.flags = i13;
        if (pagetablecell.colspan > 1) {
            i10 = i12 | 130;
        } else {
            i10 = i13 & (-3);
        }
        pagetablecell.flags = i10;
        if (pagetablecell.rowspan > 1) {
            i11 = pagetablecell.flags | 4;
        } else {
            i11 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i11;
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        int i10;
        int i11;
        pagetablecell.text = h6.f(charSequence);
        int i12 = pagetablecell.flags;
        int i13 = i12 | 128;
        pagetablecell.flags = i13;
        if (pagetablecell.colspan > 1) {
            i10 = i12 | 130;
        } else {
            i10 = i13 & (-3);
        }
        pagetablecell.flags = i10;
        if (pagetablecell.rowspan > 1) {
            i11 = pagetablecell.flags | 4;
        } else {
            i11 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i11;
    }

    public static int[][] e(int[][] iArr, int i10) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr.length, i10);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int[] iArr3 = iArr[i11];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i11], 0, length);
            while (length < i10) {
                iArr2[i11][length] = -1;
                length++;
            }
        }
        return iArr2;
    }

    public static TL_iv.pageTableCell f() {
        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
        c(pagetablecell, "");
        return pagetablecell;
    }

    public static String g(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return h6.l(richText);
        }
        return "";
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return h6.r(richText, null, true);
        }
        return "";
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (pagetablecell == null) {
            return;
        }
        boolean z11 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        pagetablecell.align_center = z10;
        if (i10 == 2) {
            z11 = true;
        }
        pagetablecell.align_right = z11;
        int i13 = pagetablecell.flags;
        if (z10) {
            i11 = i13 | 8;
        } else {
            i11 = i13 & (-9);
        }
        pagetablecell.flags = i11;
        int i14 = pagetablecell.flags;
        if (z11) {
            i12 = i14 | 16;
        } else {
            i12 = i14 & (-17);
        }
        pagetablecell.flags = i12;
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z10) {
        int i10;
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z10;
        if (z10) {
            i10 = pagetablecell.flags | 1;
        } else {
            i10 = pagetablecell.flags & (-2);
        }
        pagetablecell.flags = i10;
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (pagetablecell == null) {
            return;
        }
        boolean z11 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        pagetablecell.valign_middle = z10;
        if (i10 == 2) {
            z11 = true;
        }
        pagetablecell.valign_bottom = z11;
        int i13 = pagetablecell.flags;
        if (z10) {
            i11 = i13 | 32;
        } else {
            i11 = i13 & (-33);
        }
        pagetablecell.flags = i11;
        int i14 = pagetablecell.flags;
        if (z11) {
            i12 = i14 | 64;
        } else {
            i12 = i14 & (-65);
        }
        pagetablecell.flags = i12;
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.colspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i10 = pagetablecell.rowspan;
        if (i10 != 0) {
            return i10;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.f12522b; i10++) {
            for (int i11 = 0; i11 < this.f12523c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f12525f[i10][i11];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < this.f12522b; i10++) {
            for (int i11 = 0; i11 < this.f12523c; i11++) {
                if (this.d[i10][i11] == pagetablecell) {
                    return this.f12524e[i10][i11];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int size;
        int i10;
        int i11;
        TL_iv.pageTableCell pagetablecell;
        int i12;
        int i13;
        TL_iv.pageBlockTable pageblocktable = this.f12521a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        int i14 = 0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        this.f12522b = size;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = this.f12522b;
            if (i15 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i15);
            int i17 = 0;
            for (int i18 = 0; i18 < pagetablerow.cells.size(); i18++) {
                i17 += n(pagetablerow.cells.get(i18));
            }
            if (i17 > i16) {
                i16 = i17;
            }
            i15++;
        }
        int i19 = 1;
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i10, 1), Math.max(i16, 1));
        int[] iArr = {Math.max(this.f12522b, 1), Math.max(i16, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, Math.max(this.f12522b, 1), Math.max(i16, 1));
        for (int i20 = 0; i20 < iArr2.length; i20++) {
            for (int i21 = 0; i21 < iArr2[0].length; i21++) {
                iArr2[i20][i21] = -1;
                iArr3[i20][i21] = -1;
            }
        }
        int i22 = 0;
        int i23 = 0;
        while (true) {
            i11 = this.f12522b;
            if (i22 >= i11) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i22);
            int i24 = i19;
            int i25 = i14;
            int i26 = i25;
            while (i25 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i25);
                int n10 = n(pagetablecell2);
                int i27 = i14;
                int i28 = pagetablecell2.rowspan;
                if (i28 == 0) {
                    i28 = i24;
                }
                while (i26 < i16 && pagetablecellArr[i22][i26] != null) {
                    i26++;
                }
                int i29 = i26 + n10;
                if (i29 > i16) {
                    i16 = Math.max(i29, i16 * 2);
                    pagetablecell = pagetablecell2;
                    int length = pagetablecellArr.length;
                    i12 = i28;
                    int[] iArr4 = new int[2];
                    iArr4[i24] = i16;
                    iArr4[i27] = length;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr4);
                    int i30 = i27;
                    while (i30 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i30];
                        int i31 = i30;
                        int i32 = i22;
                        int i33 = i27;
                        System.arraycopy(pagetablecellArr3, i33, pagetablecellArr2[i31], i33, pagetablecellArr3.length);
                        i30 = i31 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i22 = i32;
                        i27 = 0;
                    }
                    i13 = i22;
                    iArr2 = e(iArr2, i16);
                    iArr3 = e(iArr3, i16);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i12 = i28;
                    i13 = i22;
                }
                for (int i34 = i13; i34 < i13 + i12 && i34 < this.f12522b; i34++) {
                    for (int i35 = i26; i35 < i29; i35++) {
                        pagetablecellArr[i34][i35] = pagetablecell;
                        iArr2[i34][i35] = i13;
                        iArr3[i34][i35] = i26;
                    }
                }
                if (i29 > i23) {
                    i23 = i29;
                }
                i25++;
                i26 = i29;
                i22 = i13;
                i14 = 0;
            }
            i22++;
            i19 = i24;
            i14 = 0;
        }
        this.f12523c = i23;
        int max = Math.max(i11, i19);
        int[] iArr5 = new int[2];
        iArr5[i19] = Math.max(this.f12523c, i19);
        iArr5[0] = max;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr5);
        int max2 = Math.max(this.f12522b, i19);
        int[] iArr6 = new int[2];
        iArr6[i19] = Math.max(this.f12523c, i19);
        iArr6[0] = max2;
        this.f12524e = (int[][]) Array.newInstance(cls, iArr6);
        int max3 = Math.max(this.f12522b, i19);
        int[] iArr7 = new int[2];
        iArr7[i19] = Math.max(this.f12523c, i19);
        iArr7[0] = max3;
        this.f12525f = (int[][]) Array.newInstance(cls, iArr7);
        for (int i36 = 0; i36 < this.f12522b; i36++) {
            for (int i37 = 0; i37 < this.f12523c; i37++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i36][i37] = pagetablecellArr[i36][i37];
                this.f12524e[i36][i37] = iArr2[i36][i37];
                this.f12525f[i36][i37] = iArr3[i36][i37];
                if (pagetablecellArr4[i36][i37] == null) {
                    TL_iv.pageTableCell f7 = f();
                    this.d[i36][i37] = f7;
                    this.f12524e[i36][i37] = i36;
                    this.f12525f[i36][i37] = i37;
                    pageblocktable.rows.get(i36).cells.add(f7);
                }
            }
        }
        ArrayList arrayList2 = this.f12526g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i38 = 0; i38 < this.f12522b; i38++) {
            int i39 = 0;
            while (true) {
                int i40 = this.f12523c;
                if (i39 < i40) {
                    if (i38 >= 0 && i39 >= 0 && i38 < this.f12522b && i39 < i40 && this.f12524e[i38][i39] == i38 && this.f12525f[i38][i39] == i39 && linkedHashSet.add(this.d[i38][i39])) {
                        arrayList2.add(this.d[i38][i39]);
                    }
                    i39++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.f12521a;
        pageblocktable.rows.clear();
        for (int i13 = 0; i13 < i10; i13++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i13) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return ((int[]) identityHashMap.get((TL_iv.pageTableCell) obj))[1];
                }
            }));
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i15 = iArr[2];
                if (i15 <= 1) {
                    i15 = 0;
                }
                pagetablecell.rowspan = i15;
                int i16 = iArr[3];
                if (i16 <= 1) {
                    i16 = 0;
                }
                pagetablecell.colspan = i16;
                if (i15 != 0) {
                    i11 = pagetablecell.flags | 4;
                } else {
                    i11 = pagetablecell.flags & (-5);
                }
                pagetablecell.flags = i11;
                if (i16 != 0) {
                    i12 = pagetablecell.flags | 2;
                } else {
                    i12 = pagetablecell.flags & (-3);
                }
                pagetablecell.flags = i12;
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a2 = a(pagetablecell);
        if (b10 >= 0 && a2 >= 0) {
            int i10 = pagetablecell.rowspan;
            if (i10 == 0) {
                i10 = 1;
            }
            int i11 = pagetablecell.colspan;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i10 > 1 || i11 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i12 = b10; i12 < b10 + i10 && i12 < this.f12522b; i12++) {
                    TL_iv.pageTableRow pagetablerow = this.f12521a.rows.get(i12);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i14 = a2; i14 < a2 + i11; i14++) {
                        if (i12 != b10 || i14 != a2) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i14)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new h7(3)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        pagetablerow.cells.add((TL_iv.pageTableCell) ((Object[]) obj)[0]);
                    }
                }
                i();
                return true;
            }
        }
        return false;
    }
}
