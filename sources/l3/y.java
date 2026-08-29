package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class y implements j {
    public h f14249b;
    public h f14250c;
    public h d;
    public h f14251e;
    public ByteBuffer f14252f;
    public ByteBuffer f14253g;
    public boolean h;

    public y() {
        ByteBuffer byteBuffer = j.f14106a;
        this.f14252f = byteBuffer;
        this.f14253g = byteBuffer;
        h hVar = h.f14098e;
        this.d = hVar;
        this.f14251e = hVar;
        this.f14249b = hVar;
        this.f14250c = hVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f14253g;
        this.f14253g = j.f14106a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        if (this.h && this.f14253g == j.f14106a) {
            return true;
        }
        return false;
    }

    @Override
    public final h e(h hVar) {
        this.d = hVar;
        this.f14251e = f(hVar);
        if (isActive()) {
            return this.f14251e;
        }
        return h.f14098e;
    }

    public abstract h f(h hVar);

    @Override
    public final void flush() {
        this.f14253g = j.f14106a;
        this.h = false;
        this.f14249b = this.d;
        this.f14250c = this.f14251e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f14251e != h.f14098e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f14252f.capacity() < i10) {
            this.f14252f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f14252f.clear();
        }
        ByteBuffer byteBuffer = this.f14252f;
        this.f14253g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f14252f = j.f14106a;
        h hVar = h.f14098e;
        this.d = hVar;
        this.f14251e = hVar;
        this.f14249b = hVar;
        this.f14250c = hVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
