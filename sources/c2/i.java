package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f3665b;
    public f f3666c;
    public f d;
    public f e;
    public ByteBuffer f3667f;
    public ByteBuffer f3668g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f3664a;
        this.f3667f = byteBuffer;
        this.f3668g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3665b = fVar;
        this.f3666c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3668g;
        this.f3668g = h.f3664a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f3668g == h.f3664a) {
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
        this.f3668g = h.f3664a;
        this.h = false;
        this.f3665b = this.d;
        this.f3666c = this.e;
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
        if (this.f3667f.capacity() < i10) {
            this.f3667f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3667f.clear();
        }
        ByteBuffer byteBuffer = this.f3667f;
        this.f3668g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f3664a;
        this.f3668g = byteBuffer;
        this.h = false;
        this.f3667f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.f3665b = fVar;
        this.f3666c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
