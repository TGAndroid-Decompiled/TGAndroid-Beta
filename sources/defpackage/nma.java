package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class nma implements p30 {
    public float b;
    public float c;
    public l30 d;
    public l30 e;
    public l30 f;
    public l30 g;
    public boolean h;
    public mma i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override
    public final boolean a() {
        boolean z;
        if (this.n) {
            mma mmaVar = this.i;
            if (mmaVar != null) {
                if (mmaVar.k >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
                if (mmaVar.i.o() * mmaVar.k * mmaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z;
        mma mmaVar = this.i;
        if (mmaVar != null) {
            kma kmaVar = mmaVar.i;
            int i = mmaVar.b;
            boolean z2 = true;
            if (mmaVar.k >= 0) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            int o = kmaVar.o() * mmaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                if (mmaVar.k < 0) {
                    z2 = false;
                }
                jte.p(z2);
                int min = Math.min(byteBuffer.remaining() / (kmaVar.o() * i), mmaVar.k);
                kmaVar.b(min, byteBuffer);
                mmaVar.k -= min;
                System.arraycopy(kmaVar.h(), min * i, kmaVar.h(), 0, mmaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = p30.a;
        return byteBuffer2;
    }

    @Override
    public final void c(n30 n30Var) {
        boolean z;
        if (isActive()) {
            l30 l30Var = this.d;
            this.f = l30Var;
            l30 l30Var2 = this.e;
            this.g = l30Var2;
            if (this.h) {
                int i = l30Var.a;
                int i2 = l30Var.b;
                float f = this.b;
                float f2 = this.c;
                int i3 = l30Var2.a;
                if (l30Var.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.i = new mma(i, i2, f, f2, i3, z);
            } else {
                mma mmaVar = this.i;
                if (mmaVar != null) {
                    mmaVar.j = 0;
                    mmaVar.k = 0;
                    mmaVar.l = 0;
                    mmaVar.m = 0;
                    mmaVar.n = 0;
                    mmaVar.o = 0;
                    mmaVar.p = 0;
                    mmaVar.q = 0.0d;
                    mmaVar.i.flush();
                }
            }
        }
        this.k = p30.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        mma mmaVar = this.i;
        mmaVar.getClass();
        this.l += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i = mmaVar.b;
        kma kmaVar = mmaVar.i;
        int o = remaining / (kmaVar.o() * i);
        kmaVar.p(o);
        kmaVar.a(remaining, byteBuffer);
        mmaVar.j += o;
        mmaVar.b();
    }

    @Override
    public final l30 e(l30 l30Var) {
        int i = l30Var.c;
        if (i != 2 && i != 4) {
            throw new o30(l30Var);
        }
        int i2 = l30Var.a;
        this.d = l30Var;
        l30 l30Var2 = new l30(i2, l30Var.b, i);
        this.e = l30Var2;
        this.h = true;
        return l30Var2;
    }

    @Override
    public final void f() {
        int i;
        mma mmaVar = this.i;
        if (mmaVar != null) {
            int i2 = mmaVar.j;
            float f = mmaVar.c;
            float f2 = mmaVar.d;
            int i3 = mmaVar.k + ((int) (((((((i2 - i) / (f / f2)) + mmaVar.o) + mmaVar.q) + mmaVar.l) / (mmaVar.e * f2)) + 0.5d));
            mmaVar.q = 0.0d;
            kma kmaVar = mmaVar.i;
            int i4 = mmaVar.h << 1;
            kmaVar.p(i2 + i4);
            kmaVar.c(i2 * mmaVar.b, i4);
            mmaVar.j += i4;
            mmaVar.b();
            if (mmaVar.k > i3) {
                mmaVar.k = Math.max(i3, 0);
            }
            mmaVar.j = 0;
            mmaVar.o = 0;
            mmaVar.l = 0;
        }
        this.n = true;
    }

    @Override
    public final long g(long j) {
        if (this.m >= 1024) {
            long j2 = this.l;
            mma mmaVar = this.i;
            mmaVar.getClass();
            long o = j2 - (mmaVar.i.o() * (mmaVar.j * mmaVar.b));
            int i = this.g.a;
            int i2 = this.f.a;
            long j3 = this.m;
            if (i == i2) {
                return hac.b0(j, j3, o, RoundingMode.DOWN);
            }
            return hac.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
        }
        return (long) (j / this.b);
    }

    @Override
    public final boolean isActive() {
        if (this.e.a != -1) {
            if (Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        l30 l30Var = l30.e;
        this.d = l30Var;
        this.e = l30Var;
        this.f = l30Var;
        this.g = l30Var;
        ByteBuffer byteBuffer = p30.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
