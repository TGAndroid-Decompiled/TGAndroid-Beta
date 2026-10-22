package a4;

import e2.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends k {
    public final int f217i;
    public final int f218j;
    public final int f219k;
    public List f223o;
    public List f224p;
    public int f225q;
    public int f226r;
    public boolean f227s;
    public boolean f228t;
    public byte f229u;
    public byte v;
    public boolean f231x;
    public long f232y;
    public static final int[] f216z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final x h = new x();
    public final ArrayList f221m = new ArrayList();
    public b f222n = new b(0, 4);
    public int f230w = 0;
    public final long f220l = 16000000;

    public c(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f217i = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        e2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f219k = 0;
                        this.f218j = 0;
                    } else {
                        this.f219k = 1;
                        this.f218j = 1;
                    }
                } else {
                    this.f219k = 0;
                    this.f218j = 1;
                }
            } else {
                this.f219k = 1;
                this.f218j = 0;
            }
        } else {
            this.f219k = 0;
            this.f218j = 0;
        }
        l(0);
        k();
        this.f231x = true;
        this.f232y = -9223372036854775807L;
    }

    @Override
    public final l f() {
        List list = this.f223o;
        this.f224p = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f223o = null;
        this.f224p = null;
        l(0);
        this.f226r = 4;
        this.f222n.h = 4;
        k();
        this.f227s = false;
        this.f228t = false;
        this.f229u = (byte) 0;
        this.v = (byte) 0;
        this.f230w = 0;
        this.f231x = true;
        this.f232y = -9223372036854775807L;
    }

    @Override
    public final void g(a4.i r15) {
        throw new UnsupportedOperationException("Method not decompiled: a4.c.g(a4.i):void");
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
        long j10 = this.f220l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f232y;
            if (j11 != -9223372036854775807L && this.e - j11 >= j10 && (jVar = (z3.j) this.f274b.pollFirst()) != null) {
                this.f223o = Collections.EMPTY_LIST;
                this.f232y = -9223372036854775807L;
                l f7 = f();
                long j12 = this.e;
                jVar.timeUs = j12;
                jVar.f50661a = f7;
                jVar.f50662b = j12;
                return jVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean i() {
        if (this.f223o != this.f224p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f221m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d2.b c10 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f7758i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d2.b bVar = (d2.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f7758i != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f222n;
        bVar.f215g = this.f225q;
        bVar.f211a.clear();
        bVar.f212b.clear();
        bVar.f213c.setLength(0);
        bVar.d = 15;
        bVar.e = 0;
        bVar.f214f = 0;
        ArrayList arrayList = this.f221m;
        arrayList.clear();
        arrayList.add(this.f222n);
    }

    public final void l(int i10) {
        int i11 = this.f225q;
        if (i11 != i10) {
            this.f225q = i10;
            if (i10 == 3) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f221m;
                    if (i12 < arrayList.size()) {
                        ((b) arrayList.get(i12)).f215g = i10;
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
                this.f223o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
