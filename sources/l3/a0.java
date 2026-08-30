package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class a0 implements n {
    public l f11127b;
    public l f11128c;
    public l d;
    public l e;
    public ByteBuffer f11129f;
    public ByteBuffer f11130g;
    public boolean h;

    public a0() {
        ByteBuffer byteBuffer = n.f11198a;
        this.f11129f = byteBuffer;
        this.f11130g = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f11127b = lVar;
        this.f11128c = lVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f11130g;
        this.f11130g = n.f11198a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        if (this.h && this.f11130g == n.f11198a) {
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
        this.f11130g = n.f11198a;
        this.h = false;
        this.f11127b = this.d;
        this.f11128c = this.e;
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
        if (this.f11129f.capacity() < i10) {
            this.f11129f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f11129f.clear();
        }
        ByteBuffer byteBuffer = this.f11129f;
        this.f11130g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f11129f = n.f11198a;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f11127b = lVar;
        this.f11128c = lVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
