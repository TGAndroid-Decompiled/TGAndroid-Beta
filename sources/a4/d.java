package a4;

import e2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class d extends l {
    public final int f230i;
    public final int f231j;
    public final int f232k;
    public List f236o;
    public List f237p;
    public int f238q;
    public int f239r;
    public boolean f240s;
    public boolean f241t;
    public byte f242u;
    public byte v;
    public boolean f244x;
    public long f245y;
    public static final int[] f229z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final v h = new v();
    public final ArrayList f234m = new ArrayList();
    public c f235n = new c(0, 4);
    public int f243w = 0;
    public final long f233l = 16000000;

    public d(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f230i = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        e2.a.n("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f232k = 0;
                        this.f231j = 0;
                    } else {
                        this.f232k = 1;
                        this.f231j = 1;
                    }
                } else {
                    this.f232k = 0;
                    this.f231j = 1;
                }
            } else {
                this.f232k = 1;
                this.f231j = 0;
            }
        } else {
            this.f232k = 0;
            this.f231j = 0;
        }
        l(0);
        k();
        this.f244x = true;
        this.f245y = -9223372036854775807L;
    }

    @Override
    public final m f() {
        List list = this.f236o;
        this.f237p = list;
        list.getClass();
        return new m(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f236o = null;
        this.f237p = null;
        l(0);
        this.f239r = 4;
        this.f235n.h = 4;
        k();
        this.f240s = false;
        this.f241t = false;
        this.f242u = (byte) 0;
        this.v = (byte) 0;
        this.f243w = 0;
        this.f244x = true;
        this.f245y = -9223372036854775807L;
    }

    @Override
    public final void g(a4.j r15) {
        throw new UnsupportedOperationException("Method not decompiled: a4.d.g(a4.j):void");
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override
    public final z3.j c() {
        z3.j jVar;
        z3.j c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j3 = this.f233l;
        if (j3 != -9223372036854775807L) {
            long j10 = this.f245y;
            if (j10 != -9223372036854775807L && this.f291e - j10 >= j3 && (jVar = (z3.j) this.f289b.pollFirst()) != null) {
                this.f236o = Collections.EMPTY_LIST;
                this.f245y = -9223372036854775807L;
                m f7 = f();
                long j11 = this.f291e;
                jVar.timeUs = j11;
                jVar.f50729a = f7;
                jVar.f50730b = j11;
                return jVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean i() {
        if (this.f236o != this.f237p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f234m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d2.b c10 = ((c) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f6525i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d2.b bVar = (d2.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f6525i != i10) {
                    bVar = ((c) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        c cVar = this.f235n;
        cVar.f228g = this.f238q;
        cVar.f223a.clear();
        cVar.f224b.clear();
        cVar.f225c.setLength(0);
        cVar.d = 15;
        cVar.f226e = 0;
        cVar.f227f = 0;
        ArrayList arrayList = this.f234m;
        arrayList.clear();
        arrayList.add(this.f235n);
    }

    public final void l(int i10) {
        int i11 = this.f238q;
        if (i11 != i10) {
            this.f238q = i10;
            if (i10 == 3) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f234m;
                    if (i12 < arrayList.size()) {
                        ((c) arrayList.get(i12)).f228g = i10;
                        i12++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i11 != 3 && i10 != 1 && i10 != 0) {
                    return;
                }
                this.f236o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
