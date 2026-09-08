package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f4184b;
    public f f4185c;
    public f d;
    public f f4186e;
    public ByteBuffer f4187f;
    public ByteBuffer f4188g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f4183a;
        this.f4187f = byteBuffer;
        this.f4188g = byteBuffer;
        f fVar = f.f4179e;
        this.d = fVar;
        this.f4186e = fVar;
        this.f4184b = fVar;
        this.f4185c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4188g;
        this.f4188g = h.f4183a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4188g == h.f4183a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f4186e = f(fVar);
        if (isActive()) {
            return this.f4186e;
        }
        return f.f4179e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f4188g = h.f4183a;
        this.h = false;
        this.f4184b = this.d;
        this.f4185c = this.f4186e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f4186e != f.f4179e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f4187f.capacity() < i10) {
            this.f4187f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4187f.clear();
        }
        ByteBuffer byteBuffer = this.f4187f;
        this.f4188g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f4183a;
        this.f4188g = byteBuffer;
        this.h = false;
        this.f4187f = byteBuffer;
        f fVar = f.f4179e;
        this.d = fVar;
        this.f4186e = fVar;
        this.f4184b = fVar;
        this.f4185c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
