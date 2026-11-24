package defpackage;

import j$.util.Comparator$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.tgnet.tl.TL_iv;
public final class fhb {
    public final TL_iv.pageBlockTable a;
    public int b;
    public int c;
    public TL_iv.pageTableCell[][] d;
    public int[][] e;
    public int[][] f;
    public final ArrayList g = new ArrayList();

    public fhb(TL_iv.pageBlockTable pageblocktable) {
        this.a = pageblocktable;
        i();
    }

    public static void c(TL_iv.pageTableCell pagetablecell, String str) {
        int i;
        int i2;
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pagetablecell.text = textplain;
        int i3 = pagetablecell.flags;
        int i4 = i3 | 128;
        pagetablecell.flags = i4;
        if (pagetablecell.colspan > 1) {
            i = i3 | 130;
        } else {
            i = i4 & (-3);
        }
        pagetablecell.flags = i;
        if (pagetablecell.rowspan > 1) {
            i2 = i | 4;
        } else {
            i2 = i & (-5);
        }
        pagetablecell.flags = i2;
    }

    public static void d(TL_iv.pageTableCell pagetablecell, CharSequence charSequence) {
        int i;
        int i2;
        pagetablecell.text = zk9.f(charSequence);
        int i3 = pagetablecell.flags;
        int i4 = i3 | 128;
        pagetablecell.flags = i4;
        if (pagetablecell.colspan > 1) {
            i = i3 | 130;
        } else {
            i = i4 & (-3);
        }
        pagetablecell.flags = i;
        if (pagetablecell.rowspan > 1) {
            i2 = i | 4;
        } else {
            i2 = i & (-5);
        }
        pagetablecell.flags = i2;
    }

    public static int[][] e(int[][] iArr, int i) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr.length, i);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int[] iArr3 = iArr[i2];
            int length = iArr3.length;
            System.arraycopy(iArr3, 0, iArr2[i2], 0, length);
            while (length < i) {
                iArr2[i2][length] = -1;
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
            return zk9.l(richText);
        }
        return "";
    }

    public static CharSequence h(TL_iv.pageTableCell pagetablecell) {
        TL_iv.RichText richText;
        if (pagetablecell != null && (richText = pagetablecell.text) != null) {
            return zk9.r(richText, null, true);
        }
        return "";
    }

    public static void k(TL_iv.pageTableCell pagetablecell, int i) {
        boolean z;
        int i2;
        int i3;
        if (pagetablecell == null) {
            return;
        }
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        pagetablecell.align_center = z;
        if (i == 2) {
            z2 = true;
        }
        pagetablecell.align_right = z2;
        int i4 = pagetablecell.flags;
        if (z) {
            i2 = i4 | 8;
        } else {
            i2 = i4 & (-9);
        }
        pagetablecell.flags = i2;
        if (z2) {
            i3 = i2 | 16;
        } else {
            i3 = i2 & (-17);
        }
        pagetablecell.flags = i3;
    }

    public static void l(TL_iv.pageTableCell pagetablecell, boolean z) {
        int i;
        if (pagetablecell == null) {
            return;
        }
        pagetablecell.header = z;
        int i2 = pagetablecell.flags;
        if (z) {
            i = i2 | 1;
        } else {
            i = i2 & (-2);
        }
        pagetablecell.flags = i;
    }

    public static void m(TL_iv.pageTableCell pagetablecell, int i) {
        boolean z;
        int i2;
        int i3;
        if (pagetablecell == null) {
            return;
        }
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        pagetablecell.valign_middle = z;
        if (i == 2) {
            z2 = true;
        }
        pagetablecell.valign_bottom = z2;
        int i4 = pagetablecell.flags;
        if (z) {
            i2 = i4 | 32;
        } else {
            i2 = i4 & (-33);
        }
        pagetablecell.flags = i2;
        if (z2) {
            i3 = i2 | 64;
        } else {
            i3 = i2 & (-65);
        }
        pagetablecell.flags = i3;
    }

    public static int n(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.colspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public static int o(TL_iv.pageTableCell pagetablecell) {
        int i = pagetablecell.rowspan;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final int a(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                if (this.d[i][i2] == pagetablecell) {
                    return this.f[i][i2];
                }
            }
        }
        return -1;
    }

    public final int b(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                if (this.d[i][i2] == pagetablecell) {
                    return this.e[i][i2];
                }
            }
        }
        return -1;
    }

    public final void i() {
        int size;
        int i;
        int i2;
        TL_iv.pageTableCell pagetablecell;
        int i3;
        int i4;
        TL_iv.pageBlockTable pageblocktable = this.a;
        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
        int i5 = 0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        this.b = size;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.b;
            if (i6 >= i) {
                break;
            }
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i6);
            int i8 = 0;
            for (int i9 = 0; i9 < pagetablerow.cells.size(); i9++) {
                i8 += n(pagetablerow.cells.get(i9));
            }
            if (i8 > i7) {
                i7 = i8;
            }
            i6++;
        }
        int i10 = 1;
        TL_iv.pageTableCell[][] pagetablecellArr = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, Math.max(i, 1), Math.max(i7, 1));
        int[] iArr = {Math.max(this.b, 1), Math.max(i7, 1)};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[][] iArr3 = (int[][]) Array.newInstance(cls, Math.max(this.b, 1), Math.max(i7, 1));
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            for (int i12 = 0; i12 < iArr2[0].length; i12++) {
                iArr2[i11][i12] = -1;
                iArr3[i11][i12] = -1;
            }
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i2 = this.b;
            if (i13 >= i2) {
                break;
            }
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i13);
            int i15 = i10;
            int i16 = i5;
            int i17 = i16;
            while (i16 < pagetablerow2.cells.size()) {
                TL_iv.pageTableCell pagetablecell2 = pagetablerow2.cells.get(i16);
                int n = n(pagetablecell2);
                int i18 = i5;
                int i19 = pagetablecell2.rowspan;
                if (i19 == 0) {
                    i19 = i15;
                }
                while (i17 < i7 && pagetablecellArr[i13][i17] != null) {
                    i17++;
                }
                int i20 = i17 + n;
                if (i20 > i7) {
                    i7 = Math.max(i20, i7 << 1);
                    pagetablecell = pagetablecell2;
                    int length = pagetablecellArr.length;
                    i3 = i19;
                    int[] iArr4 = new int[2];
                    iArr4[i15] = i7;
                    iArr4[i18] = length;
                    TL_iv.pageTableCell[][] pagetablecellArr2 = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr4);
                    int i21 = i18;
                    while (i21 < pagetablecellArr.length) {
                        TL_iv.pageTableCell[] pagetablecellArr3 = pagetablecellArr[i21];
                        int i22 = i21;
                        int i23 = i13;
                        int i24 = i18;
                        System.arraycopy(pagetablecellArr3, i24, pagetablecellArr2[i22], i24, pagetablecellArr3.length);
                        i21 = i22 + 1;
                        pagetablecellArr = pagetablecellArr;
                        i13 = i23;
                        i18 = 0;
                    }
                    i4 = i13;
                    iArr2 = e(iArr2, i7);
                    iArr3 = e(iArr3, i7);
                    pagetablecellArr = pagetablecellArr2;
                } else {
                    pagetablecell = pagetablecell2;
                    i3 = i19;
                    i4 = i13;
                }
                for (int i25 = i4; i25 < i4 + i3 && i25 < this.b; i25++) {
                    for (int i26 = i17; i26 < i20; i26++) {
                        pagetablecellArr[i25][i26] = pagetablecell;
                        iArr2[i25][i26] = i4;
                        iArr3[i25][i26] = i17;
                    }
                }
                if (i20 > i14) {
                    i14 = i20;
                }
                i16++;
                i17 = i20;
                i13 = i4;
                i5 = 0;
            }
            i13++;
            i10 = i15;
            i5 = 0;
        }
        this.c = i14;
        int max = Math.max(i2, i10);
        int[] iArr5 = new int[2];
        iArr5[i10] = Math.max(this.c, i10);
        iArr5[0] = max;
        this.d = (TL_iv.pageTableCell[][]) Array.newInstance(TL_iv.pageTableCell.class, iArr5);
        int max2 = Math.max(this.b, i10);
        int[] iArr6 = new int[2];
        iArr6[i10] = Math.max(this.c, i10);
        iArr6[0] = max2;
        this.e = (int[][]) Array.newInstance(cls, iArr6);
        int max3 = Math.max(this.b, i10);
        int[] iArr7 = new int[2];
        iArr7[i10] = Math.max(this.c, i10);
        iArr7[0] = max3;
        this.f = (int[][]) Array.newInstance(cls, iArr7);
        for (int i27 = 0; i27 < this.b; i27++) {
            for (int i28 = 0; i28 < this.c; i28++) {
                TL_iv.pageTableCell[][] pagetablecellArr4 = this.d;
                pagetablecellArr4[i27][i28] = pagetablecellArr[i27][i28];
                this.e[i27][i28] = iArr2[i27][i28];
                this.f[i27][i28] = iArr3[i27][i28];
                if (pagetablecellArr4[i27][i28] == null) {
                    TL_iv.pageTableCell f = f();
                    this.d[i27][i28] = f;
                    this.e[i27][i28] = i27;
                    this.f[i27][i28] = i28;
                    pageblocktable.rows.get(i27).cells.add(f);
                }
            }
        }
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i29 = 0; i29 < this.b; i29++) {
            int i30 = 0;
            while (true) {
                int i31 = this.c;
                if (i30 < i31) {
                    if (i29 >= 0 && i30 >= 0 && i29 < this.b && i30 < i31 && this.e[i29][i30] == i29 && this.f[i29][i30] == i30 && linkedHashSet.add(this.d[i29][i30])) {
                        arrayList2.add(this.d[i29][i30]);
                    }
                    i30++;
                }
            }
        }
    }

    public final void j(IdentityHashMap identityHashMap, int i) {
        int i2;
        int i3;
        TL_iv.pageBlockTable pageblocktable = this.a;
        pageblocktable.rows.clear();
        for (int i4 = 0; i4 < i; i4++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : identityHashMap.entrySet()) {
                if (((int[]) entry.getValue())[0] == i4) {
                    arrayList.add((TL_iv.pageTableCell) entry.getKey());
                }
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new xm1(identityHashMap, (byte) 3)));
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                int[] iArr = (int[]) identityHashMap.get(pagetablecell);
                int i6 = iArr[2];
                if (i6 <= 1) {
                    i6 = 0;
                }
                pagetablecell.rowspan = i6;
                int i7 = iArr[3];
                if (i7 <= 1) {
                    i7 = 0;
                }
                pagetablecell.colspan = i7;
                int i8 = pagetablecell.flags;
                if (i6 != 0) {
                    i2 = i8 | 4;
                } else {
                    i2 = i8 & (-5);
                }
                pagetablecell.flags = i2;
                if (i7 != 0) {
                    i3 = i2 | 2;
                } else {
                    i3 = i2 & (-3);
                }
                pagetablecell.flags = i3;
                pagetablerow.cells.add(pagetablecell);
            }
            pageblocktable.rows.add(pagetablerow);
        }
    }

    public final boolean p(TL_iv.pageTableCell pagetablecell) {
        int b = b(pagetablecell);
        int a = a(pagetablecell);
        if (b >= 0 && a >= 0) {
            int i = pagetablecell.rowspan;
            if (i == 0) {
                i = 1;
            }
            int i2 = pagetablecell.colspan;
            if (i2 == 0) {
                i2 = 1;
            }
            if (i > 1 || i2 > 1) {
                pagetablecell.rowspan = 0;
                pagetablecell.colspan = 0;
                pagetablecell.flags &= -7;
                for (int i3 = b; i3 < b + i && i3 < this.b; i3++) {
                    TL_iv.pageTableRow pagetablerow = this.a.rows.get(i3);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TL_iv.pageTableCell pagetablecell2 = arrayList2.get(i4);
                        i4++;
                        TL_iv.pageTableCell pagetablecell3 = pagetablecell2;
                        arrayList.add(new Object[]{pagetablecell3, Integer.valueOf(a(pagetablecell3))});
                    }
                    for (int i5 = a; i5 < a + i2; i5++) {
                        if (i3 != b || i5 != a) {
                            TL_iv.pageTableCell pagetablecell4 = new TL_iv.pageTableCell();
                            pagetablecell4.header = pagetablecell.header;
                            pagetablecell4.align_center = pagetablecell.align_center;
                            pagetablecell4.align_right = pagetablecell.align_right;
                            pagetablecell4.valign_middle = pagetablecell.valign_middle;
                            pagetablecell4.valign_bottom = pagetablecell.valign_bottom;
                            c(pagetablecell4, "");
                            arrayList.add(new Object[]{pagetablecell4, Integer.valueOf(i5)});
                        }
                    }
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new mn((byte) 22)));
                    pagetablerow.cells.clear();
                    int size2 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj = arrayList.get(i6);
                        i6++;
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
