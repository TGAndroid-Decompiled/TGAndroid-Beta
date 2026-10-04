package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3963b;
    public f f3964c;
    public f d;
    public f f3965e;
    public ByteBuffer f3966f;
    public ByteBuffer f3967g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3962a;
        this.f3966f = byteBuffer;
        this.f3967g = byteBuffer;
        f fVar = f.f3958e;
        this.d = fVar;
        this.f3965e = fVar;
        this.f3963b = fVar;
        this.f3964c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3967g;
        this.f3967g = h.f3962a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3967g == h.f3962a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f3965e = f(fVar);
        if (isActive()) {
            return this.f3965e;
        }
        return f.f3958e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f3967g = h.f3962a;
        this.h = false;
        this.f3963b = this.d;
        this.f3964c = this.f3965e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f3965e != f.f3958e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f3966f.capacity() < i10) {
            this.f3966f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3966f.clear();
        }
        ByteBuffer byteBuffer = this.f3966f;
        this.f3967g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3962a;
        this.f3967g = byteBuffer;
        this.h = false;
        this.f3966f = byteBuffer;
        f fVar = f.f3958e;
        this.d = fVar;
        this.f3965e = fVar;
        this.f3963b = fVar;
        this.f3964c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
