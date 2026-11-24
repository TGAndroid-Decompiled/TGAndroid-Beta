package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class mka implements p20 {
    public float b;
    public float c;
    public l20 d;
    public l20 e;
    public l20 f;
    public l20 g;
    public boolean h;
    public lka i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override
    public final boolean a() {
        boolean z;
        if (this.n) {
            lka lkaVar = this.i;
            if (lkaVar != null) {
                if (lkaVar.k >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                gre.p(z);
                if (lkaVar.i.o() * lkaVar.k * lkaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z;
        lka lkaVar = this.i;
        if (lkaVar != null) {
            jka jkaVar = lkaVar.i;
            int i = lkaVar.b;
            boolean z2 = true;
            if (lkaVar.k >= 0) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            int o = jkaVar.o() * lkaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                if (lkaVar.k < 0) {
                    z2 = false;
                }
                gre.p(z2);
                int min = Math.min(byteBuffer.remaining() / (jkaVar.o() * i), lkaVar.k);
                jkaVar.b(min, byteBuffer);
                lkaVar.k -= min;
                System.arraycopy(jkaVar.h(), min * i, jkaVar.h(), 0, lkaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = p20.a;
        return byteBuffer2;
    }

    @Override
    public final void c(n20 n20Var) {
        boolean z;
        if (isActive()) {
            l20 l20Var = this.d;
            this.f = l20Var;
            l20 l20Var2 = this.e;
            this.g = l20Var2;
            if (this.h) {
                int i = l20Var.a;
                int i2 = l20Var.b;
                float f = this.b;
                float f2 = this.c;
                int i3 = l20Var2.a;
                if (l20Var.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.i = new lka(i, i2, f, f2, i3, z);
            } else {
                lka lkaVar = this.i;
                if (lkaVar != null) {
                    lkaVar.j = 0;
                    lkaVar.k = 0;
                    lkaVar.l = 0;
                    lkaVar.m = 0;
                    lkaVar.n = 0;
                    lkaVar.o = 0;
                    lkaVar.p = 0;
                    lkaVar.q = 0.0d;
                    lkaVar.i.flush();
                }
            }
        }
        this.k = p20.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        lka lkaVar = this.i;
        lkaVar.getClass();
        this.l += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i = lkaVar.b;
        jka jkaVar = lkaVar.i;
        int o = remaining / (jkaVar.o() * i);
        jkaVar.p(o);
        jkaVar.a(remaining, byteBuffer);
        lkaVar.j += o;
        lkaVar.b();
    }

    @Override
    public final l20 e(l20 l20Var) {
        int i = l20Var.c;
        if (i != 2 && i != 4) {
            throw new o20(l20Var);
        }
        int i2 = l20Var.a;
        this.d = l20Var;
        l20 l20Var2 = new l20(i2, l20Var.b, i);
        this.e = l20Var2;
        this.h = true;
        return l20Var2;
    }

    @Override
    public final void f() {
        int i;
        lka lkaVar = this.i;
        if (lkaVar != null) {
            int i2 = lkaVar.j;
            float f = lkaVar.c;
            float f2 = lkaVar.d;
            int i3 = lkaVar.k + ((int) (((((((i2 - i) / (f / f2)) + lkaVar.o) + lkaVar.q) + lkaVar.l) / (lkaVar.e * f2)) + 0.5d));
            lkaVar.q = 0.0d;
            jka jkaVar = lkaVar.i;
            int i4 = lkaVar.h << 1;
            jkaVar.p(i2 + i4);
            jkaVar.c(i2 * lkaVar.b, i4);
            lkaVar.j += i4;
            lkaVar.b();
            if (lkaVar.k > i3) {
                lkaVar.k = Math.max(i3, 0);
            }
            lkaVar.j = 0;
            lkaVar.o = 0;
            lkaVar.l = 0;
        }
        this.n = true;
    }

    @Override
    public final long g(long j) {
        if (this.m >= 1024) {
            long j2 = this.l;
            lka lkaVar = this.i;
            lkaVar.getClass();
            long o = j2 - (lkaVar.i.o() * (lkaVar.j * lkaVar.b));
            int i = this.g.a;
            int i2 = this.f.a;
            long j3 = this.m;
            if (i == i2) {
                return g8c.b0(j, j3, o, RoundingMode.DOWN);
            }
            return g8c.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
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
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.f = l20Var;
        this.g = l20Var;
        ByteBuffer byteBuffer = p20.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
