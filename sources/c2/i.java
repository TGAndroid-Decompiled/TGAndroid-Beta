package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f4087b;
    public f f4088c;
    public f d;
    public f e;
    public ByteBuffer f4089f;
    public ByteBuffer f4090g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f4086a;
        this.f4089f = byteBuffer;
        this.f4090g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f4087b = fVar;
        this.f4088c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4090g;
        this.f4090g = h.f4086a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4090g == h.f4086a) {
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
        this.f4090g = h.f4086a;
        this.h = false;
        this.f4087b = this.d;
        this.f4088c = this.e;
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
        if (this.f4089f.capacity() < i10) {
            this.f4089f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4089f.clear();
        }
        ByteBuffer byteBuffer = this.f4089f;
        this.f4090g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f4086a;
        this.f4090g = byteBuffer;
        this.h = false;
        this.f4089f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f4087b = fVar;
        this.f4088c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
