package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3672b;
    public f f3673c;
    public f d;
    public f e;
    public ByteBuffer f3674f;
    public ByteBuffer f3675g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3671a;
        this.f3674f = byteBuffer;
        this.f3675g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3672b = fVar;
        this.f3673c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3675g;
        this.f3675g = h.f3671a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3675g == h.f3671a) {
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
        this.f3675g = h.f3671a;
        this.h = false;
        this.f3672b = this.d;
        this.f3673c = this.e;
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
        if (this.f3674f.capacity() < i10) {
            this.f3674f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3674f.clear();
        }
        ByteBuffer byteBuffer = this.f3674f;
        this.f3675g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3671a;
        this.f3675g = byteBuffer;
        this.h = false;
        this.f3674f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3672b = fVar;
        this.f3673c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
