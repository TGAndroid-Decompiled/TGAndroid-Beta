package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class x implements j {
    public h f13390b;
    public h f13391c;
    public h d;
    public h f13392e;
    public ByteBuffer f13393f;
    public ByteBuffer f13394g;
    public boolean h;

    public x() {
        ByteBuffer byteBuffer = j.f13282a;
        this.f13393f = byteBuffer;
        this.f13394g = byteBuffer;
        h hVar = h.f13246e;
        this.d = hVar;
        this.f13392e = hVar;
        this.f13390b = hVar;
        this.f13391c = hVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f13394g;
        this.f13394g = j.f13282a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        if (this.h && this.f13394g == j.f13282a) {
            return true;
        }
        return false;
    }

    @Override
    public final h e(h hVar) {
        this.d = hVar;
        this.f13392e = f(hVar);
        if (isActive()) {
            return this.f13392e;
        }
        return h.f13246e;
    }

    public abstract h f(h hVar);

    @Override
    public final void flush() {
        this.f13394g = j.f13282a;
        this.h = false;
        this.f13390b = this.d;
        this.f13391c = this.f13392e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f13392e != h.f13246e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i9) {
        if (this.f13393f.capacity() < i9) {
            this.f13393f = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.f13393f.clear();
        }
        ByteBuffer byteBuffer = this.f13393f;
        this.f13394g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f13393f = j.f13282a;
        h hVar = h.f13246e;
        this.d = hVar;
        this.f13392e = hVar;
        this.f13390b = hVar;
        this.f13391c = hVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
