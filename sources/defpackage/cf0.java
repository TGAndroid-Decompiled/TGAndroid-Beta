package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class cf0 implements p20 {
    public l20 b;
    public l20 c;
    public l20 d;
    public l20 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public cf0() {
        ByteBuffer byteBuffer = p20.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.b = l20Var;
        this.c = l20Var;
    }

    @Override
    public boolean a() {
        if (this.h && this.g == p20.a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = p20.a;
        return byteBuffer;
    }

    @Override
    public final void c(n20 n20Var) {
        this.g = p20.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override
    public final l20 e(l20 l20Var) {
        this.d = l20Var;
        this.e = h(l20Var);
        if (isActive()) {
            return this.e;
        }
        return l20.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public l20 h(l20 l20Var) {
        if (l20Var.c == 2) {
            if (l20Var.a == -1) {
                return l20.e;
            }
            return l20Var;
        }
        throw new o20(l20Var);
    }

    @Override
    public boolean isActive() {
        if (this.e != l20.e) {
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
        ByteBuffer byteBuffer = p20.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.b = l20Var;
        this.c = l20Var;
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
