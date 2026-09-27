package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3667b;
    public f f3668c;
    public f d;
    public f e;
    public ByteBuffer f3669f;
    public ByteBuffer f3670g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3666a;
        this.f3669f = byteBuffer;
        this.f3670g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3667b = fVar;
        this.f3668c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3670g;
        this.f3670g = h.f3666a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3670g == h.f3666a) {
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
        this.f3670g = h.f3666a;
        this.h = false;
        this.f3667b = this.d;
        this.f3668c = this.e;
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
        if (this.f3669f.capacity() < i10) {
            this.f3669f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3669f.clear();
        }
        ByteBuffer byteBuffer = this.f3669f;
        this.f3670g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3666a;
        this.f3670g = byteBuffer;
        this.h = false;
        this.f3669f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3667b = fVar;
        this.f3668c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
