package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class i implements h {
    public f f4012b;
    public f f4013c;
    public f d;
    public f f4014e;
    public ByteBuffer f4015f;
    public ByteBuffer f4016g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.f4011a;
        this.f4015f = byteBuffer;
        this.f4016g = byteBuffer;
        f fVar = f.f4007e;
        this.d = fVar;
        this.f4014e = fVar;
        this.f4012b = fVar;
        this.f4013c = fVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4016g;
        this.f4016g = h.f4011a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4016g == h.f4011a) {
            return true;
        }
        return false;
    }

    @Override
    public final f d(f fVar) {
        this.d = fVar;
        this.f4014e = f(fVar);
        if (isActive()) {
            return this.f4014e;
        }
        return f.f4007e;
    }

    @Override
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override
    public final void flush() {
        this.f4016g = h.f4011a;
        this.h = false;
        this.f4012b = this.d;
        this.f4013c = this.f4014e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f4014e != f.f4007e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f4015f.capacity() < i10) {
            this.f4015f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4015f.clear();
        }
        ByteBuffer byteBuffer = this.f4015f;
        this.f4016g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = h.f4011a;
        this.f4016g = byteBuffer;
        this.h = false;
        this.f4015f = byteBuffer;
        f fVar = f.f4007e;
        this.d = fVar;
        this.f4014e = fVar;
        this.f4012b = fVar;
        this.f4013c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
