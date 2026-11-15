package d4;

import h2.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends j {
    public final int f7510i;
    public final int f7511j;
    public final int f7512k;
    public List f7516o;
    public List f7517p;
    public int f7518q;
    public int f7519r;
    public boolean f7520s;
    public boolean f7521t;
    public byte f7522u;
    public byte v;
    public boolean f7524x;
    public long f7525y;
    public static final int[] f7509z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final x h = new x();
    public final ArrayList f7514m = new ArrayList();
    public b f7515n = new b(0, 4);
    public int f7523w = 0;
    public final long f7513l = 16000000;

    public c(String str, int i7) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f7510i = i10;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        h2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f7512k = 0;
                        this.f7511j = 0;
                    } else {
                        this.f7512k = 1;
                        this.f7511j = 1;
                    }
                } else {
                    this.f7512k = 0;
                    this.f7511j = 1;
                }
            } else {
                this.f7512k = 1;
                this.f7511j = 0;
            }
        } else {
            this.f7512k = 0;
            this.f7511j = 0;
        }
        l(0);
        k();
        this.f7524x = true;
        this.f7525y = -9223372036854775807L;
    }

    @Override
    public final d6.i f() {
        List list = this.f7516o;
        this.f7517p = list;
        list.getClass();
        return new d6.i(list, 11);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f7516o = null;
        this.f7517p = null;
        l(0);
        this.f7519r = 4;
        this.f7515n.h = 4;
        k();
        this.f7520s = false;
        this.f7521t = false;
        this.f7522u = (byte) 0;
        this.v = (byte) 0;
        this.f7523w = 0;
        this.f7524x = true;
        this.f7525y = -9223372036854775807L;
    }

    @Override
    public final void g(d4.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: d4.c.g(d4.h):void");
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override
    public final c4.j c() {
        c4.j jVar;
        c4.j c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j3 = this.f7513l;
        if (j3 != -9223372036854775807L) {
            long j10 = this.f7525y;
            if (j10 != -9223372036854775807L && this.f7570e - j10 >= j3 && (jVar = (c4.j) this.f7568b.pollFirst()) != null) {
                this.f7516o = Collections.EMPTY_LIST;
                this.f7525y = -9223372036854775807L;
                d6.i f10 = f();
                long j11 = this.f7570e;
                jVar.timeUs = j11;
                jVar.f4112a = f10;
                jVar.f4113b = j11;
                return jVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean i() {
        if (this.f7516o != this.f7517p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f7514m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i7 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            g2.b c10 = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i7 = Math.min(i7, c10.f12794i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            g2.b bVar = (g2.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f12794i != i7) {
                    bVar = ((b) arrayList.get(i11)).c(i7);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f7515n;
        bVar.f7508g = this.f7518q;
        bVar.f7503a.clear();
        bVar.f7504b.clear();
        bVar.f7505c.setLength(0);
        bVar.d = 15;
        bVar.f7506e = 0;
        bVar.f7507f = 0;
        ArrayList arrayList = this.f7514m;
        arrayList.clear();
        arrayList.add(this.f7515n);
    }

    public final void l(int i7) {
        int i10 = this.f7518q;
        if (i10 != i7) {
            this.f7518q = i7;
            if (i7 == 3) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f7514m;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).f7508g = i7;
                        i11++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i10 != 3 && i7 != 1 && i7 != 0) {
                    return;
                }
                this.f7516o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
