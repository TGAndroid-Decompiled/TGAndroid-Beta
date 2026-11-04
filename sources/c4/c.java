package c4;

import g2.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends j {
    public final int f4147i;
    public final int f4148j;
    public final int f4149k;
    public List f4153o;
    public List f4154p;
    public int f4155q;
    public int f4156r;
    public boolean f4157s;
    public boolean f4158t;
    public byte f4159u;
    public byte v;
    public boolean f4161x;
    public long f4162y;
    public static final int[] f4146z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final y h = new y();
    public final ArrayList f4151m = new ArrayList();
    public b f4152n = new b(0, 4);
    public int f4160w = 0;
    public final long f4150l = 16000000;

    public c(String str, int i3) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f4147i = i10;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        g2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f4149k = 0;
                        this.f4148j = 0;
                    } else {
                        this.f4149k = 1;
                        this.f4148j = 1;
                    }
                } else {
                    this.f4149k = 0;
                    this.f4148j = 1;
                }
            } else {
                this.f4149k = 1;
                this.f4148j = 0;
            }
        } else {
            this.f4149k = 0;
            this.f4148j = 0;
        }
        l(0);
        k();
        this.f4161x = true;
        this.f4162y = -9223372036854775807L;
    }

    @Override
    public final android.support.v4.media.c f() {
        List list = this.f4153o;
        this.f4154p = list;
        list.getClass();
        return new android.support.v4.media.c(list, 6);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f4153o = null;
        this.f4154p = null;
        l(0);
        this.f4156r = 4;
        this.f4152n.h = 4;
        k();
        this.f4157s = false;
        this.f4158t = false;
        this.f4159u = (byte) 0;
        this.v = (byte) 0;
        this.f4160w = 0;
        this.f4161x = true;
        this.f4162y = -9223372036854775807L;
    }

    @Override
    public final void g(c4.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: c4.c.g(c4.h):void");
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override
    public final b4.j c() {
        b4.j jVar;
        b4.j c2 = super.c();
        if (c2 != null) {
            return c2;
        }
        long j10 = this.f4150l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f4162y;
            if (j11 != -9223372036854775807L && this.f4207e - j11 >= j10 && (jVar = (b4.j) this.f4205b.pollFirst()) != null) {
                this.f4153o = Collections.EMPTY_LIST;
                this.f4162y = -9223372036854775807L;
                android.support.v4.media.c f10 = f();
                long j12 = this.f4207e;
                jVar.timeUs = j12;
                jVar.f2370a = f10;
                jVar.f2371b = j12;
                return jVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean i() {
        if (this.f4153o != this.f4154p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f4151m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            f2.b c2 = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c2);
            if (c2 != null) {
                i3 = Math.min(i3, c2.f11367i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            f2.b bVar = (f2.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f11367i != i3) {
                    bVar = ((b) arrayList.get(i11)).c(i3);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f4152n;
        bVar.f4145g = this.f4155q;
        bVar.f4140a.clear();
        bVar.f4141b.clear();
        bVar.f4142c.setLength(0);
        bVar.d = 15;
        bVar.f4143e = 0;
        bVar.f4144f = 0;
        ArrayList arrayList = this.f4151m;
        arrayList.clear();
        arrayList.add(this.f4152n);
    }

    public final void l(int i3) {
        int i10 = this.f4155q;
        if (i10 != i3) {
            this.f4155q = i3;
            if (i3 == 3) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f4151m;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).f4145g = i3;
                        i11++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i10 != 3 && i3 != 1 && i3 != 0) {
                    return;
                }
                this.f4153o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
