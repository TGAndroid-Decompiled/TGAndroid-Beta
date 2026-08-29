package l3;

import j7.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class t0 implements j {
    public int f14196b;
    public float f14197c;
    public float d;
    public h f14198e;
    public h f14199f;
    public h f14200g;
    public h h;
    public boolean f14201i;
    public s0 f14202j;
    public ByteBuffer f14203k;
    public ShortBuffer f14204l;
    public ByteBuffer f14205m;
    public long f14206n;
    public long f14207o;
    public boolean f14208p;

    @Override
    public final ByteBuffer a() {
        s0 s0Var = this.f14202j;
        if (s0Var != null) {
            int i10 = s0Var.f14178b;
            int i11 = s0Var.f14187m * i10 * 2;
            if (i11 > 0) {
                if (this.f14203k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f14203k = order;
                    this.f14204l = order.asShortBuffer();
                } else {
                    this.f14203k.clear();
                    this.f14204l.clear();
                }
                ShortBuffer shortBuffer = this.f14204l;
                int min = Math.min(shortBuffer.remaining() / i10, s0Var.f14187m);
                int i12 = min * i10;
                shortBuffer.put(s0Var.f14186l, 0, i12);
                int i13 = s0Var.f14187m - min;
                s0Var.f14187m = i13;
                short[] sArr = s0Var.f14186l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f14207o += i11;
                this.f14203k.limit(i11);
                this.f14205m = this.f14203k;
            }
        }
        ByteBuffer byteBuffer = this.f14205m;
        this.f14205m = j.f14106a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        s0 s0Var = this.f14202j;
        s0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f14206n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = s0Var.f14178b;
        int i11 = remaining2 / i10;
        short[] c3 = s0Var.c(s0Var.f14184j, s0Var.f14185k, i11);
        s0Var.f14184j = c3;
        asShortBuffer.get(c3, s0Var.f14185k * i10, ((i11 * i10) * 2) / 2);
        s0Var.f14185k += i11;
        s0Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final void c() {
        s0 s0Var = this.f14202j;
        if (s0Var != null) {
            int i10 = s0Var.f14185k;
            float f9 = s0Var.f14179c;
            float f10 = s0Var.d;
            float f11 = s0Var.f14180e * f10;
            int c3 = s0Var.f14187m + ((int) l1.c(i10 / (f9 / f10), s0Var.f14189o, f11, 0.5f));
            short[] sArr = s0Var.f14184j;
            int i11 = s0Var.h * 2;
            s0Var.f14184j = s0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = s0Var.f14178b;
                if (i12 >= i11 * i13) {
                    break;
                }
                s0Var.f14184j[(i13 * i10) + i12] = 0;
                i12++;
            }
            s0Var.f14185k = i11 + s0Var.f14185k;
            s0Var.f();
            if (s0Var.f14187m > c3) {
                s0Var.f14187m = c3;
            }
            s0Var.f14185k = 0;
            s0Var.f14192r = 0;
            s0Var.f14189o = 0;
        }
        this.f14208p = true;
    }

    @Override
    public final boolean d() {
        if (this.f14208p) {
            s0 s0Var = this.f14202j;
            if (s0Var == null || s0Var.f14187m * s0Var.f14178b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final h e(h hVar) {
        if (hVar.f14101c == 2) {
            int i10 = this.f14196b;
            if (i10 == -1) {
                i10 = hVar.f14099a;
            }
            this.f14198e = hVar;
            h hVar2 = new h(i10, hVar.f14100b, 2);
            this.f14199f = hVar2;
            this.f14201i = true;
            return hVar2;
        }
        throw new i(hVar);
    }

    @Override
    public final void flush() {
        if (isActive()) {
            h hVar = this.f14198e;
            this.f14200g = hVar;
            h hVar2 = this.f14199f;
            this.h = hVar2;
            if (this.f14201i) {
                this.f14202j = new s0(hVar.f14099a, this.f14197c, hVar.f14100b, this.d, hVar2.f14099a);
            } else {
                s0 s0Var = this.f14202j;
                if (s0Var != null) {
                    s0Var.f14185k = 0;
                    s0Var.f14187m = 0;
                    s0Var.f14189o = 0;
                    s0Var.f14190p = 0;
                    s0Var.f14191q = 0;
                    s0Var.f14192r = 0;
                    s0Var.f14193s = 0;
                    s0Var.f14194t = 0;
                    s0Var.f14195u = 0;
                    s0Var.v = 0;
                }
            }
        }
        this.f14205m = j.f14106a;
        this.f14206n = 0L;
        this.f14207o = 0L;
        this.f14208p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f14199f.f14099a != -1) {
            if (Math.abs(this.f14197c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f14199f.f14099a != this.f14198e.f14099a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f14197c = 1.0f;
        this.d = 1.0f;
        h hVar = h.f14098e;
        this.f14198e = hVar;
        this.f14199f = hVar;
        this.f14200g = hVar;
        this.h = hVar;
        ByteBuffer byteBuffer = j.f14106a;
        this.f14203k = byteBuffer;
        this.f14204l = byteBuffer.asShortBuffer();
        this.f14205m = byteBuffer;
        this.f14196b = -1;
        this.f14201i = false;
        this.f14202j = null;
        this.f14206n = 0L;
        this.f14207o = 0L;
        this.f14208p = false;
    }
}
