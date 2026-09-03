package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class a0 implements n {
    public l f11237b;
    public l f11238c;
    public l d;
    public l e;
    public ByteBuffer f11239f;
    public ByteBuffer f11240g;
    public boolean h;

    public a0() {
        ByteBuffer byteBuffer = n.f11308a;
        this.f11239f = byteBuffer;
        this.f11240g = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f11237b = lVar;
        this.f11238c = lVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f11240g;
        this.f11240g = n.f11308a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        if (this.h && this.f11240g == n.f11308a) {
            return true;
        }
        return false;
    }

    @Override
    public final l e(l lVar) {
        this.d = lVar;
        this.e = f(lVar);
        if (isActive()) {
            return this.e;
        }
        return l.e;
    }

    public abstract l f(l lVar);

    @Override
    public final void flush() {
        this.f11240g = n.f11308a;
        this.h = false;
        this.f11237b = this.d;
        this.f11238c = this.e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.e != l.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f11239f.capacity() < i10) {
            this.f11239f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f11239f.clear();
        }
        ByteBuffer byteBuffer = this.f11239f;
        this.f11240g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f11239f = n.f11308a;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f11237b = lVar;
        this.f11238c = lVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
