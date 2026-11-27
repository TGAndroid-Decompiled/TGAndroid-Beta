package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class wd1 extends de1 {
    public final byte i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ey7 h = new ey7();
    public final ArrayList m = new ArrayList();
    public vd1 n = new vd1(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public wd1(String str, int i) {
        byte b;
        if ("application/x-mp4-cea-608".equals(str)) {
            b = 2;
        } else {
            b = 3;
        }
        this.i = b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        efd.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = false;
                        this.j = false;
                    } else {
                        this.k = true;
                        this.j = true;
                    }
                } else {
                    this.k = false;
                    this.j = true;
                }
            } else {
                this.k = true;
                this.j = false;
            }
        } else {
            this.k = false;
            this.j = false;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override
    public final wz4 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new wz4(list);
    }

    @Override
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override
    public final void g(defpackage.be1 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.g(be1):void");
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override
    public final oeb c() {
        oeb oebVar;
        oeb c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (oebVar = (oeb) this.b.pollFirst()) != null) {
                this.o = Collections.EMPTY_LIST;
                this.y = -9223372036854775807L;
                wz4 f = f();
                long j3 = this.e;
                oebVar.timeUs = j3;
                oebVar.a = f;
                oebVar.b = j3;
                return oebVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean i() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            m43 c = ((vd1) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            m43 m43Var = (m43) arrayList2.get(i3);
            if (m43Var != null) {
                if (m43Var.i != i) {
                    m43Var = ((vd1) arrayList.get(i3)).c(i);
                    m43Var.getClass();
                }
                arrayList3.add(m43Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        vd1 vd1Var = this.n;
        vd1Var.g = this.q;
        vd1Var.a.clear();
        vd1Var.b.clear();
        vd1Var.c.setLength(0);
        vd1Var.d = 15;
        vd1Var.e = 0;
        vd1Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        byte b = this.q;
        if (b != i) {
            this.q = i;
            if (i == 3) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i2 < arrayList.size()) {
                        ((vd1) arrayList.get(i2)).g = i;
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (b != 3 && i != 1 && i != 0) {
                    return;
                }
                this.o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
