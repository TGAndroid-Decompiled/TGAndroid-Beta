package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f4157b;
    public f f4158c;
    public f d;
    public f f4159e;
    public ByteBuffer f4160f;
    public ByteBuffer f4161g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f4156a;
        this.f4160f = byteBuffer;
        this.f4161g = byteBuffer;
        f fVar = f.f4152e;
        this.d = fVar;
        this.f4159e = fVar;
        this.f4157b = fVar;
        this.f4158c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4161g;
        this.f4161g = h.f4156a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4161g == h.f4156a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f4159e = f(fVar);
        if (isActive()) {
            return this.f4159e;
        }
        return f.f4152e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f4161g = h.f4156a;
        this.h = false;
        this.f4157b = this.d;
        this.f4158c = this.f4159e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f4159e != f.f4152e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f4160f.capacity() < i10) {
            this.f4160f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4160f.clear();
        }
        ByteBuffer byteBuffer = this.f4160f;
        this.f4161g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f4156a;
        this.f4161g = byteBuffer;
        this.h = false;
        this.f4160f = byteBuffer;
        f fVar = f.f4152e;
        this.d = fVar;
        this.f4159e = fVar;
        this.f4157b = fVar;
        this.f4158c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
