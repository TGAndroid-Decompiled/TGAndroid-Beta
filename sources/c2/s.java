package c2;

import e2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.t6;
public final class s implements m {
    public int f3581b;
    public float f3582c;
    public float d;
    public j e;
    public j f3583f;
    public j f3584g;
    public j h;
    public boolean f3585i;
    public r f3586j;
    public ByteBuffer f3587k;
    public ByteBuffer f3588l;
    public long f3589m;
    public long f3590n;
    public boolean f3591o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        r rVar = this.f3586j;
        if (rVar != null) {
            p pVar = rVar.f3572i;
            int i10 = rVar.f3568b;
            boolean z11 = true;
            if (rVar.f3574k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
            int o10 = pVar.o() * rVar.f3574k * i10;
            if (o10 > 0) {
                if (this.f3587k.capacity() < o10) {
                    this.f3587k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f3587k.clear();
                }
                ByteBuffer byteBuffer = this.f3587k;
                if (rVar.f3574k < 0) {
                    z11 = false;
                }
                t6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i10), rVar.f3574k);
                pVar.b(min, byteBuffer);
                rVar.f3574k -= min;
                System.arraycopy(pVar.h(), min * i10, pVar.h(), 0, rVar.f3574k * i10);
                this.f3587k.flip();
                this.f3590n += o10;
                this.f3588l = this.f3587k;
            }
        }
        ByteBuffer byteBuffer2 = this.f3588l;
        this.f3588l = m.f3552a;
        return byteBuffer2;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f3586j;
        rVar.getClass();
        this.f3589m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = rVar.f3568b;
        p pVar = rVar.f3572i;
        int o10 = remaining / (pVar.o() * i10);
        pVar.p(o10);
        pVar.a(remaining, byteBuffer);
        rVar.f3573j += o10;
        rVar.b();
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f3591o) {
            r rVar = this.f3586j;
            if (rVar != null) {
                if (rVar.f3574k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
                if (rVar.f3572i.o() * rVar.f3574k * rVar.f3568b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void d(k kVar) {
        boolean z10;
        if (isActive()) {
            j jVar = this.e;
            this.f3584g = jVar;
            j jVar2 = this.f3583f;
            this.h = jVar2;
            if (this.f3585i) {
                int i10 = jVar.f3547a;
                int i11 = jVar.f3548b;
                float f7 = this.f3582c;
                float f10 = this.d;
                int i12 = jVar2.f3547a;
                if (jVar.f3549c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f3586j = new r(i10, i11, f7, f10, i12, z10);
            } else {
                r rVar = this.f3586j;
                if (rVar != null) {
                    rVar.f3573j = 0;
                    rVar.f3574k = 0;
                    rVar.f3575l = 0;
                    rVar.f3576m = 0;
                    rVar.f3577n = 0;
                    rVar.f3578o = 0;
                    rVar.f3579p = 0;
                    rVar.f3580q = 0.0d;
                    rVar.f3572i.flush();
                }
            }
        }
        this.f3588l = m.f3552a;
        this.f3589m = 0L;
        this.f3590n = 0L;
        this.f3591o = false;
    }

    @Override
    public final j e(j jVar) {
        int i10 = jVar.f3549c;
        if (i10 != 2 && i10 != 4) {
            throw new l(jVar);
        }
        int i11 = this.f3581b;
        if (i11 == -1) {
            i11 = jVar.f3547a;
        }
        this.e = jVar;
        j jVar2 = new j(i11, jVar.f3548b, i10);
        this.f3583f = jVar2;
        this.f3585i = true;
        return jVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f3586j;
        if (rVar != null) {
            int i10 = rVar.f3573j;
            float f7 = rVar.f3569c;
            float f10 = rVar.d;
            int i11 = rVar.f3578o;
            int i12 = rVar.f3574k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + rVar.f3580q) + rVar.f3575l) / (rVar.e * f10)) + 0.5d));
            rVar.f3580q = 0.0d;
            p pVar = rVar.f3572i;
            int i13 = rVar.h * 2;
            pVar.p(i13 + i10);
            pVar.c(i10 * rVar.f3568b, i13);
            rVar.f3573j = i13 + rVar.f3573j;
            rVar.b();
            if (rVar.f3574k > i12) {
                rVar.f3574k = Math.max(i12, 0);
            }
            rVar.f3573j = 0;
            rVar.f3578o = 0;
            rVar.f3575l = 0;
        }
        this.f3591o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f3590n >= 1024) {
            long j11 = this.f3589m;
            r rVar = this.f3586j;
            rVar.getClass();
            long o10 = j11 - (rVar.f3572i.o() * (rVar.f3573j * rVar.f3568b));
            int i10 = this.h.f3547a;
            int i11 = this.f3584g.f3547a;
            if (i10 == i11) {
                return l0.a0(j10, this.f3590n, o10, RoundingMode.DOWN);
            }
            return l0.a0(j10, this.f3590n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f3582c);
    }

    @Override
    public final boolean isActive() {
        if (this.f3583f.f3547a != -1) {
            if (Math.abs(this.f3582c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3583f.f3547a != this.e.f3547a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3582c = 1.0f;
        this.d = 1.0f;
        j jVar = j.e;
        this.e = jVar;
        this.f3583f = jVar;
        this.f3584g = jVar;
        this.h = jVar;
        ByteBuffer byteBuffer = m.f3552a;
        this.f3587k = byteBuffer;
        this.f3588l = byteBuffer;
        this.f3581b = -1;
        this.f3585i = false;
        this.f3586j = null;
        this.f3589m = 0L;
        this.f3590n = 0L;
        this.f3591o = false;
    }
}
