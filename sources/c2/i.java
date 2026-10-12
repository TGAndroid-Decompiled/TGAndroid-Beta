package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f4011b;
    public f f4012c;
    public f d;
    public f f4013e;
    public ByteBuffer f4014f;
    public ByteBuffer f4015g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f4010a;
        this.f4014f = byteBuffer;
        this.f4015g = byteBuffer;
        f fVar = f.f4006e;
        this.d = fVar;
        this.f4013e = fVar;
        this.f4011b = fVar;
        this.f4012c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4015g;
        this.f4015g = h.f4010a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4015g == h.f4010a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f4013e = f(fVar);
        if (isActive()) {
            return this.f4013e;
        }
        return f.f4006e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f4015g = h.f4010a;
        this.h = false;
        this.f4011b = this.d;
        this.f4012c = this.f4013e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f4013e != f.f4006e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f4014f.capacity() < i10) {
            this.f4014f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4014f.clear();
        }
        ByteBuffer byteBuffer = this.f4014f;
        this.f4015g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f4010a;
        this.f4015g = byteBuffer;
        this.h = false;
        this.f4014f = byteBuffer;
        f fVar = f.f4006e;
        this.d = fVar;
        this.f4013e = fVar;
        this.f4011b = fVar;
        this.f4012c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
