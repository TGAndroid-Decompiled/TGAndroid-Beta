package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3962b;
    public f f3963c;
    public f d;
    public f f3964e;
    public ByteBuffer f3965f;
    public ByteBuffer f3966g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3961a;
        this.f3965f = byteBuffer;
        this.f3966g = byteBuffer;
        f fVar = f.f3957e;
        this.d = fVar;
        this.f3964e = fVar;
        this.f3962b = fVar;
        this.f3963c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3966g;
        this.f3966g = h.f3961a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3966g == h.f3961a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f3964e = f(fVar);
        if (isActive()) {
            return this.f3964e;
        }
        return f.f3957e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f3966g = h.f3961a;
        this.h = false;
        this.f3962b = this.d;
        this.f3963c = this.f3964e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f3964e != f.f3957e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f3965f.capacity() < i10) {
            this.f3965f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3965f.clear();
        }
        ByteBuffer byteBuffer = this.f3965f;
        this.f3966g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3961a;
        this.f3966g = byteBuffer;
        this.h = false;
        this.f3965f = byteBuffer;
        f fVar = f.f3957e;
        this.d = fVar;
        this.f3964e = fVar;
        this.f3962b = fVar;
        this.f3963c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
