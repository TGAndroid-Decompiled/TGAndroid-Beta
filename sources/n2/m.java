package n2;

import d2.v;
import g2.n0;
import mi.h0;
import w2.d1;
public final class m implements d1 {
    public final v f20193a;
    public long[] f20195c;
    public boolean d;
    public o2.g f20196e;
    public boolean f20197f;
    public int h;
    public final h0 f20194b = new h0(17);
    public long f20198n = -9223372036854775807L;

    public m(o2.g gVar, v vVar, boolean z10) {
        this.f20193a = vVar;
        this.f20196e = gVar;
        this.f20195c = gVar.f20538b;
        b(gVar, z10);
    }

    public final void b(o2.g gVar, boolean z10) {
        long j10;
        int i3 = this.h;
        long j11 = -9223372036854775807L;
        if (i3 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f20195c[i3 - 1];
        }
        this.d = z10;
        this.f20196e = gVar;
        long[] jArr = gVar.f20538b;
        this.f20195c = jArr;
        long j12 = this.f20198n;
        if (j12 != -9223372036854775807L) {
            int b10 = n0.b(jArr, j12, true);
            this.h = b10;
            if (this.d && b10 == this.f20195c.length) {
                j11 = j12;
            }
            this.f20198n = j11;
        } else if (j10 != -9223372036854775807L) {
            this.h = n0.b(jArr, j10, false);
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int m(long j10) {
        int max = Math.max(this.h, n0.b(this.f20195c, j10, true));
        int i3 = max - this.h;
        this.h = max;
        return i3;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        boolean z10;
        int i10 = this.h;
        if (i10 == this.f20195c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.d) {
            hVar.setFlags(4);
            return -4;
        } else if ((i3 & 2) == 0 && this.f20197f) {
            if (z10) {
                return -3;
            }
            if ((i3 & 1) == 0) {
                this.h = i10 + 1;
            }
            if ((i3 & 4) == 0) {
                byte[] e10 = this.f20194b.e(this.f20196e.f20537a[i10]);
                hVar.b(e10.length);
                hVar.f16157c.put(e10);
            }
            hVar.f16158e = this.f20195c[i10];
            hVar.setFlags(1);
            return -4;
        } else {
            bVar.f55095b = this.f20193a;
            this.f20197f = true;
            return -5;
        }
    }

    @Override
    public final void a() {
    }
}
