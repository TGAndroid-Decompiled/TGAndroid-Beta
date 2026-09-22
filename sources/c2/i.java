package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3670b;
    public f f3671c;
    public f d;
    public f e;
    public ByteBuffer f3672f;
    public ByteBuffer f3673g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3669a;
        this.f3672f = byteBuffer;
        this.f3673g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3670b = fVar;
        this.f3671c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3673g;
        this.f3673g = h.f3669a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3673g == h.f3669a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.e = f(fVar);
        if (isActive()) {
            return this.e;
        }
        return f.e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f3673g = h.f3669a;
        this.h = false;
        this.f3670b = this.d;
        this.f3671c = this.e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.e != f.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f3672f.capacity() < i10) {
            this.f3672f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3672f.clear();
        }
        ByteBuffer byteBuffer = this.f3672f;
        this.f3673g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3669a;
        this.f3673g = byteBuffer;
        this.h = false;
        this.f3672f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3670b = fVar;
        this.f3671c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
