package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class ef0 implements q20 {
    public m20 b;
    public m20 c;
    public m20 d;
    public m20 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public ef0() {
        ByteBuffer byteBuffer = q20.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.b = m20Var;
        this.c = m20Var;
    }

    @Override
    public boolean a() {
        if (this.h && this.g == q20.a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = q20.a;
        return byteBuffer;
    }

    @Override
    public final void c(o20 o20Var) {
        this.g = q20.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override
    public final m20 e(m20 m20Var) {
        this.d = m20Var;
        this.e = h(m20Var);
        if (isActive()) {
            return this.e;
        }
        return m20.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public m20 h(m20 m20Var) {
        if (m20Var.c == 2) {
            if (m20Var.a == -1) {
                return m20.e;
            }
            return m20Var;
        }
        throw new p20(m20Var);
    }

    @Override
    public boolean isActive() {
        if (this.e != m20.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = q20.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.b = m20Var;
        this.c = m20Var;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override
    public long g(long j) {
        return j;
    }
}
