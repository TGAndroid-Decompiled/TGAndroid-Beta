package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class cg0 implements p30 {
    public l30 b;
    public l30 c;
    public l30 d;
    public l30 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public cg0() {
        ByteBuffer byteBuffer = p30.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        l30 l30Var = l30.e;
        this.d = l30Var;
        this.e = l30Var;
        this.b = l30Var;
        this.c = l30Var;
    }

    @Override
    public boolean a() {
        if (this.h && this.g == p30.a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = p30.a;
        return byteBuffer;
    }

    @Override
    public final void c(n30 n30Var) {
        this.g = p30.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override
    public final l30 e(l30 l30Var) {
        this.d = l30Var;
        this.e = h(l30Var);
        if (isActive()) {
            return this.e;
        }
        return l30.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public l30 h(l30 l30Var) {
        if (l30Var.c == 2) {
            if (l30Var.a == -1) {
                return l30.e;
            }
            return l30Var;
        }
        throw new o30(l30Var);
    }

    @Override
    public boolean isActive() {
        if (this.e != l30.e) {
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
        ByteBuffer byteBuffer = p30.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        l30 l30Var = l30.e;
        this.d = l30Var;
        this.e = l30Var;
        this.b = l30Var;
        this.c = l30Var;
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
