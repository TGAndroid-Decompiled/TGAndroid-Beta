package e2;

import b8.zb;
import g2.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements m {
    public int f9391b;
    public float f9392c;
    public float d;
    public j f9393e;
    public j f9394f;
    public j f9395g;
    public j h;
    public boolean f9396i;
    public r f9397j;
    public ByteBuffer f9398k;
    public ByteBuffer f9399l;
    public long f9400m;
    public long f9401n;
    public boolean f9402o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f9402o) {
            r rVar = this.f9397j;
            if (rVar != null) {
                if (rVar.f9384k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                if (rVar.f9382i.o() * rVar.f9384k * rVar.f9377b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f9397j;
        if (rVar != null) {
            p pVar = rVar.f9382i;
            int i3 = rVar.f9377b;
            boolean z11 = true;
            if (rVar.f9384k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            int o10 = pVar.o() * rVar.f9384k * i3;
            if (o10 > 0) {
                if (this.f9398k.capacity() < o10) {
                    this.f9398k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f9398k.clear();
                }
                ByteBuffer byteBuffer = this.f9398k;
                if (rVar.f9384k < 0) {
                    z11 = false;
                }
                zb.p(z11);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i3), rVar.f9384k);
                pVar.b(min, byteBuffer);
                rVar.f9384k -= min;
                System.arraycopy(pVar.h(), min * i3, pVar.h(), 0, rVar.f9384k * i3);
                this.f9398k.flip();
                this.f9401n += o10;
                this.f9399l = this.f9398k;
            }
        }
        ByteBuffer byteBuffer2 = this.f9399l;
        this.f9399l = m.f9358a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f9397j;
        rVar.getClass();
        this.f9400m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i3 = rVar.f9377b;
        p pVar = rVar.f9382i;
        int o10 = remaining / (pVar.o() * i3);
        pVar.p(o10);
        pVar.a(remaining, byteBuffer);
        rVar.f9383j += o10;
        rVar.b();
    }

    @Override
    public final j d(j jVar) {
        int i3 = jVar.f9355c;
        if (i3 != 2 && i3 != 4) {
            throw new l(jVar);
        }
        int i10 = this.f9391b;
        if (i10 == -1) {
            i10 = jVar.f9353a;
        }
        this.f9393e = jVar;
        j jVar2 = new j(i10, jVar.f9354b, i3);
        this.f9394f = jVar2;
        this.f9396i = true;
        return jVar2;
    }

    @Override
    public final void e(k kVar) {
        boolean z10;
        if (isActive()) {
            j jVar = this.f9393e;
            this.f9395g = jVar;
            j jVar2 = this.f9394f;
            this.h = jVar2;
            if (this.f9396i) {
                int i3 = jVar.f9353a;
                int i10 = jVar.f9354b;
                float f10 = this.f9392c;
                float f11 = this.d;
                int i11 = jVar2.f9353a;
                if (jVar.f9355c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9397j = new r(i3, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f9397j;
                if (rVar != null) {
                    rVar.f9383j = 0;
                    rVar.f9384k = 0;
                    rVar.f9385l = 0;
                    rVar.f9386m = 0;
                    rVar.f9387n = 0;
                    rVar.f9388o = 0;
                    rVar.f9389p = 0;
                    rVar.f9390q = 0.0d;
                    rVar.f9382i.flush();
                }
            }
        }
        this.f9399l = m.f9358a;
        this.f9400m = 0L;
        this.f9401n = 0L;
        this.f9402o = false;
    }

    @Override
    public final void f() {
        r rVar = this.f9397j;
        if (rVar != null) {
            int i3 = rVar.f9383j;
            float f10 = rVar.f9378c;
            float f11 = rVar.d;
            int i10 = rVar.f9388o;
            int i11 = rVar.f9384k + ((int) (((((((i3 - i10) / (f10 / f11)) + i10) + rVar.f9390q) + rVar.f9385l) / (rVar.f9379e * f11)) + 0.5d));
            rVar.f9390q = 0.0d;
            p pVar = rVar.f9382i;
            int i12 = rVar.h * 2;
            pVar.p(i12 + i3);
            pVar.c(i3 * rVar.f9377b, i12);
            rVar.f9383j = i12 + rVar.f9383j;
            rVar.b();
            if (rVar.f9384k > i11) {
                rVar.f9384k = Math.max(i11, 0);
            }
            rVar.f9383j = 0;
            rVar.f9388o = 0;
            rVar.f9385l = 0;
        }
        this.f9402o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f9401n >= 1024) {
            long j11 = this.f9400m;
            r rVar = this.f9397j;
            rVar.getClass();
            long o10 = j11 - (rVar.f9382i.o() * (rVar.f9383j * rVar.f9377b));
            int i3 = this.h.f9353a;
            int i10 = this.f9395g.f9353a;
            if (i3 == i10) {
                return n0.a0(j10, this.f9401n, o10, RoundingMode.DOWN);
            }
            return n0.a0(j10, this.f9401n * i10, o10 * i3, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f9392c);
    }

    @Override
    public final boolean isActive() {
        if (this.f9394f.f9353a != -1) {
            if (Math.abs(this.f9392c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f9394f.f9353a != this.f9393e.f9353a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f9392c = 1.0f;
        this.d = 1.0f;
        j jVar = j.f9352e;
        this.f9393e = jVar;
        this.f9394f = jVar;
        this.f9395g = jVar;
        this.h = jVar;
        ByteBuffer byteBuffer = m.f9358a;
        this.f9398k = byteBuffer;
        this.f9399l = byteBuffer;
        this.f9391b = -1;
        this.f9396i = false;
        this.f9397j = null;
        this.f9400m = 0L;
        this.f9401n = 0L;
        this.f9402o = false;
    }
}
