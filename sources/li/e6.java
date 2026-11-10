package li;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
public final class e6 {
    public final TL_iv.pageBlockTable f18546a;
    public int f18547b;
    public int f18548c;
    public TL_iv.pageTableCell[][] d;
    public int[][] f18549e;
    public int[][] f18550f;
    public final ArrayList f18551g = new ArrayList();

    public e6(TL_iv.pageBlockTable pageblocktable) {
        this.f18546a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        int i7;
        int i10;
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        pagetablecell.text = textplain;
        int i11 = pagetablecell.flags;
        int i12 = i11 | 128;
        pagetablecell.flags = i12;
        if (pagetablecell.colspan > 1) {
            i7 = i11 | 130;
        } else {
            i7 = i12 & (-3);
        }
        pagetablecell.flags = i7;
        if (pagetablecell.rowspan > 1) {
            i10 = pagetablecell.flags | 4;
        } else {
            i10 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i10;
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        int i7;
        int i10;
        pagetablecell.text = c6.f(charSequence);
        int i11 = pagetablecell.flags;
        int i12 = i11 | 128;
        pagetablecell.flags = i12;
        if (pagetablecell.colspan > 1) {
            i7 = i11 | 130;
        } else {
            i7 = i12 & (-3);
        }
        pagetablecell.flags = i7;
        if (pagetablecell.rowspan > 1) {
            i10 = pagetablecell.flags | 4;
        } else {
            i10 = pagetablecell.flags & (-5);
        }
        pagetablecell.flags = i10;
    }

    public static int[][] e(int[][] iArr, int i7) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr.length, i7);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr3 = iArr[i10];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i10], 0, length);
            while (length < i7) {
                iArr2[i10][length] = -1;
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
            return c6.l(richText);
        }
        return "";
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return c6.r(richText, null, true);
        }
        return "";
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i7) {
        boolean z9;
        int i10;
        int i11;
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = false;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        pagetablecell.align_center = z9;
        if (i7 == 2) {
            z10 = true;
        }
        pagetablecell.align_right = z10;
        int i12 = pagetablecell.flags;
        if (z9) {
            i10 = i12 | 8;
        } else {
            i10 = i12 & (-9);
        }
        pagetablecell.flags = i10;
        int i13 = pagetablecell.flags;
        if (z10) {
            i11 = i13 | 16;
        } else {
            i11 = i13 & (-17);
        }
        pagetablecell.flags = i11;
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z9) {
        int i7;
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z9;
        if (z9) {
            i7 = pagetablecell.flags | 1;
        } else {
            i7 = pagetablecell.flags & (-2);
        }
        pagetablecell.flags = i7;
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i7) {
        boolean z9;
        int i10;
        int i11;
        if (pagetablecell == null) {
            return;
        }
        boolean z10 = false;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        pagetablecell.valign_middle = z9;
        if (i7 == 2) {
            z10 = true;
        }
        pagetablecell.valign_bottom = z10;
        int i12 = pagetablecell.flags;
        if (z9) {
            i10 = i12 | 32;
        } else {
            i10 = i12 & (-33);
        }
        pagetablecell.flags = i10;
        int i13 = pagetablecell.flags;
        if (z10) {
            i11 = i13 | 64;
        } else {
            i11 = i13 & (-65);
        }
        pagetablecell.flags = i11;
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i7 = pagetablecell.colspan;
        if (i7 != 0) {
            return i7;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i7 = pagetablecell.rowspan;
        if (i7 != 0) {
            return i7;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < this.f18547b; i7++) {
            for (int i10 = 0; i10 < this.f18548c; i10++) {
                if (this.d[i7][i10] == pagetablecell) {
                    return this.f18550f[i7][i10];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < this.f18547b; i7++) {
            for (int i10 = 0; i10 < this.f18548c; i10++) {
                if (this.d[i7][i10] == pagetablecell) {
                    return this.f18549e[i7][i10];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int size;
        int i7;
        int i10;
        TL_iv.pageTableCell pagetablecell;
        int i11;
        int i12;
        TL_iv.pageBlockTable pageblocktable = this.f18546a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        int i13 = 0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        this.f18547b = size;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i7 = this.f18547b;
            if (i14 >= i7) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
            int i16 = 0;
            for (int i17 = 0; i17 < pagetablerow.cells.size(); i17++) {
                i16 += n(pagetablerow.cells.get(i17));
            }
            if (i16 > i15) {
                i15 = i16;
            }
            i14++;
        }
        int i18 = 1;
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i7, 1), Math.max(i15, 1));
        int[] iArr = {Math.max(this.f18547b, 1), Math.max(i15, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, Math.max(this.f18547b, 1), Math.max(i15, 1));
        for (int i19 = 0; i19 < iArr2.length; i19++) {
            for (int i20 = 0; i20 < iArr2[0].length; i20++) {
                iArr2[i19][i20] = -1;
                iArr3[i19][i20] = -1;
            }
        }
        int i21 = 0;
        int i22 = 0;
        while (true) {
            i10 = this.f18547b;
            if (i21 >= i10) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i21);
            int i23 = i18;
            int i24 = i13;
            int i25 = i24;
            while (i24 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i24);
                int n10 = n(pagetablecell2);
                int i26 = i13;
                int i27 = pagetablecell2.rowspan;
                if (i27 == 0) {
                    i27 = i23;
                }
                while (i25 < i15 && pagetablecellArr[i21][i25] != null) {
                    i25++;
                }
                int i28 = i25 + n10;
                if (i28 > i15) {
                    i15 = Math.max(i28, i15 * 2);
                    pagetablecell = pagetablecell2;
                    int length = pagetablecellArr.length;
                    i11 = i27;
                    int[] iArr4 = new int[2];
                    iArr4[i23] = i15;
                    iArr4[i26] = length;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr4);
                    int i29 = i26;
                    while (i29 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i29];
                        int i30 = i29;
                        int i31 = i21;
                        int i32 = i26;
                        System.arraycopy(pagetablecellArr3, i32, pagetablecellArr2[i30], i32, pagetablecellArr3.length);
                        i29 = i30 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i21 = i31;
                        i26 = 0;
                    }
                    i12 = i21;
                    iArr2 = e(iArr2, i15);
                    iArr3 = e(iArr3, i15);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i11 = i27;
                    i12 = i21;
                }
                for (int i33 = i12; i33 < i12 + i11 && i33 < this.f18547b; i33++) {
                    for (int i34 = i25; i34 < i28; i34++) {
                        pagetablecellArr[i33][i34] = pagetablecell;
                        iArr2[i33][i34] = i12;
                        iArr3[i33][i34] = i25;
                    }
                }
                if (i28 > i22) {
                    i22 = i28;
                }
                i24++;
                i25 = i28;
                i21 = i12;
                i13 = 0;
            }
            i21++;
            i18 = i23;
            i13 = 0;
        }
        this.f18548c = i22;
        int max = Math.max(i10, i18);
        int[] iArr5 = new int[2];
        iArr5[i18] = Math.max(this.f18548c, i18);
        iArr5[0] = max;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr5);
        int max2 = Math.max(this.f18547b, i18);
        int[] iArr6 = new int[2];
        iArr6[i18] = Math.max(this.f18548c, i18);
        iArr6[0] = max2;
        this.f18549e = (int[][]) Array.newInstance(cls, iArr6);
        int max3 = Math.max(this.f18547b, i18);
        int[] iArr7 = new int[2];
        iArr7[i18] = Math.max(this.f18548c, i18);
        iArr7[0] = max3;
        this.f18550f = (int[][]) Array.newInstance(cls, iArr7);
        for (int i35 = 0; i35 < this.f18547b; i35++) {
            for (int i36 = 0; i36 < this.f18548c; i36++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i35][i36] = pagetablecellArr[i35][i36];
                this.f18549e[i35][i36] = iArr2[i35][i36];
                this.f18550f[i35][i36] = iArr3[i35][i36];
                if (pagetablecellArr4[i35][i36] == null) {
                    TL_iv.pageTableCell f10 = f();
                    this.d[i35][i36] = f10;
                    this.f18549e[i35][i36] = i35;
                    this.f18550f[i35][i36] = i36;
                    pageblocktable.rows.get(i35).cells.add(f10);
                }
            }
        }
        ArrayList arrayList2 = this.f18551g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i37 = 0; i37 < this.f18547b; i37++) {
            int i38 = 0;
            while (true) {
                int i39 = this.f18548c;
                if (i38 < i39) {
                    if (i37 >= 0 && i38 >= 0 && i37 < this.f18547b && i38 < i39 && this.f18549e[i37][i38] == i37 && this.f18550f[i37][i38] == i38 && linkedHashSet.add(this.d[i37][i38])) {
                        arrayList2.add(this.d[i37][i38]);
                    }
                    i38++;
                }
            }
        }
    }

    public final void j(final IdentityHashMap identityHashMap, int i7) {
        int i10;
        int i11;
        TL_iv.pageBlockTable pageblocktable = this.f18546a;
        pageblocktable.rows.clear();
        for (int i12 = 0; i12 < i7; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i12) {
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
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i14 = iArr[2];
                if (i14 <= 1) {
                    i14 = 0;
                }
                pagetablecell.rowspan = i14;
                int i15 = iArr[3];
                if (i15 <= 1) {
                    i15 = 0;
                }
                pagetablecell.colspan = i15;
                if (i14 != 0) {
                    i10 = pagetablecell.flags | 4;
                } else {
                    i10 = pagetablecell.flags & (-5);
                }
                pagetablecell.flags = i10;
                if (i15 != 0) {
                    i11 = pagetablecell.flags | 2;
                } else {
                    i11 = pagetablecell.flags & (-3);
                }
                pagetablecell.flags = i11;
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b10 = b(pagetablecell);
        int a10 = a(pagetablecell);
        if (b10 >= 0 && a10 >= 0) {
            int i7 = pagetablecell.rowspan;
            if (i7 == 0) {
                i7 = 1;
            }
            int i10 = pagetablecell.colspan;
            if (i10 == 0) {
                i10 = 1;
            }
            if (i7 > 1 || i10 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i11 = b10; i11 < b10 + i7 && i11 < this.f18547b; i11++) {
                    TL_iv.pageTableRow pagetablerow = this.f18546a.rows.get(i11);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i12);
                        i12++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i13 = a10; i13 < a10 + i10; i13++) {
                        if (i11 != b10 || i13 != a10) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i13)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(10)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj = arrayList.get(i14);
                        i14++;
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
