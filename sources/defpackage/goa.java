package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class goa implements q20 {
    public float b;
    public float c;
    public m20 d;
    public m20 e;
    public m20 f;
    public m20 g;
    public boolean h;
    public foa i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override
    public final boolean a() {
        boolean z;
        if (this.n) {
            foa foaVar = this.i;
            if (foaVar != null) {
                if (foaVar.k >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
                if (foaVar.i.o() * foaVar.k * foaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z;
        foa foaVar = this.i;
        if (foaVar != null) {
            doa doaVar = foaVar.i;
            int i = foaVar.b;
            boolean z2 = true;
            if (foaVar.k >= 0) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            int o = doaVar.o() * foaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                if (foaVar.k < 0) {
                    z2 = false;
                }
                yve.p(z2);
                int min = Math.min(byteBuffer.remaining() / (doaVar.o() * i), foaVar.k);
                doaVar.b(min, byteBuffer);
                foaVar.k -= min;
                System.arraycopy(doaVar.h(), min * i, doaVar.h(), 0, foaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = q20.a;
        return byteBuffer2;
    }

    @Override
    public final void c(o20 o20Var) {
        boolean z;
        if (isActive()) {
            m20 m20Var = this.d;
            this.f = m20Var;
            m20 m20Var2 = this.e;
            this.g = m20Var2;
            if (this.h) {
                int i = m20Var.a;
                int i2 = m20Var.b;
                float f = this.b;
                float f2 = this.c;
                int i3 = m20Var2.a;
                if (m20Var.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.i = new foa(i, i2, f, f2, i3, z);
            } else {
                foa foaVar = this.i;
                if (foaVar != null) {
                    foaVar.j = 0;
                    foaVar.k = 0;
                    foaVar.l = 0;
                    foaVar.m = 0;
                    foaVar.n = 0;
                    foaVar.o = 0;
                    foaVar.p = 0;
                    foaVar.q = 0.0d;
                    foaVar.i.flush();
                }
            }
        }
        this.k = q20.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        foa foaVar = this.i;
        foaVar.getClass();
        this.l += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i = foaVar.b;
        doa doaVar = foaVar.i;
        int o = remaining / (doaVar.o() * i);
        doaVar.p(o);
        doaVar.a(remaining, byteBuffer);
        foaVar.j += o;
        foaVar.b();
    }

    @Override
    public final m20 e(m20 m20Var) {
        int i = m20Var.c;
        if (i != 2 && i != 4) {
            throw new p20(m20Var);
        }
        int i2 = m20Var.a;
        this.d = m20Var;
        m20 m20Var2 = new m20(i2, m20Var.b, i);
        this.e = m20Var2;
        this.h = true;
        return m20Var2;
    }

    @Override
    public final void f() {
        int i;
        foa foaVar = this.i;
        if (foaVar != null) {
            int i2 = foaVar.j;
            float f = foaVar.c;
            float f2 = foaVar.d;
            int i3 = foaVar.k + ((int) (((((((i2 - i) / (f / f2)) + foaVar.o) + foaVar.q) + foaVar.l) / (foaVar.e * f2)) + 0.5d));
            foaVar.q = 0.0d;
            doa doaVar = foaVar.i;
            int i4 = foaVar.h << 1;
            doaVar.p(i2 + i4);
            doaVar.c(i2 * foaVar.b, i4);
            foaVar.j += i4;
            foaVar.b();
            if (foaVar.k > i3) {
                foaVar.k = Math.max(i3, 0);
            }
            foaVar.j = 0;
            foaVar.o = 0;
            foaVar.l = 0;
        }
        this.n = true;
    }

    @Override
    public final long g(long j) {
        if (this.m >= 1024) {
            long j2 = this.l;
            foa foaVar = this.i;
            foaVar.getClass();
            long o = j2 - (foaVar.i.o() * (foaVar.j * foaVar.b));
            int i = this.g.a;
            int i2 = this.f.a;
            long j3 = this.m;
            if (i == i2) {
                return gcc.b0(j, j3, o, RoundingMode.DOWN);
            }
            return gcc.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
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
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.f = m20Var;
        this.g = m20Var;
        ByteBuffer byteBuffer = q20.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
