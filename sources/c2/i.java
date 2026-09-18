package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3673b;
    public f f3674c;
    public f d;
    public f e;
    public ByteBuffer f3675f;
    public ByteBuffer f3676g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3672a;
        this.f3675f = byteBuffer;
        this.f3676g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3673b = fVar;
        this.f3674c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3676g;
        this.f3676g = h.f3672a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3676g == h.f3672a) {
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
        this.f3676g = h.f3672a;
        this.h = false;
        this.f3673b = this.d;
        this.f3674c = this.e;
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
        if (this.f3675f.capacity() < i10) {
            this.f3675f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3675f.clear();
        }
        ByteBuffer byteBuffer = this.f3675f;
        this.f3676g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3672a;
        this.f3676g = byteBuffer;
        this.h = false;
        this.f3675f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3673b = fVar;
        this.f3674c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
