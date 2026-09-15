package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3668b;
    public f f3669c;
    public f d;
    public f e;
    public ByteBuffer f3670f;
    public ByteBuffer f3671g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3667a;
        this.f3670f = byteBuffer;
        this.f3671g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3668b = fVar;
        this.f3669c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3671g;
        this.f3671g = h.f3667a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3671g == h.f3667a) {
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
        this.f3671g = h.f3667a;
        this.h = false;
        this.f3668b = this.d;
        this.f3669c = this.e;
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
        if (this.f3670f.capacity() < i10) {
            this.f3670f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3670f.clear();
        }
        ByteBuffer byteBuffer = this.f3670f;
        this.f3671g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3667a;
        this.f3671g = byteBuffer;
        this.h = false;
        this.f3670f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3668b = fVar;
        this.f3669c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
