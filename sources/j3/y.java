package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class y implements j {

    public h f12490b;

    public h f12491c;
    public h d;

    public h f12492e;

    public ByteBuffer f12493f;

    public ByteBuffer f12494g;
    public boolean h;

    public y() {
        ByteBuffer byteBuffer = j.f12350a;
        this.f12493f = byteBuffer;
        this.f12494g = byteBuffer;
        h hVar = h.f12342e;
        this.d = hVar;
        this.f12492e = hVar;
        this.f12490b = hVar;
        this.f12491c = hVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f12494g;
        this.f12494g = j.f12350a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        return this.h && this.f12494g == j.f12350a;
    }

    @Override
    public final h e(h hVar) {
        this.d = hVar;
        this.f12492e = f(hVar);
        return isActive() ? this.f12492e : h.f12342e;
    }

    public abstract h f(h hVar);

    @Override
    public final void flush() {
        this.f12494g = j.f12350a;
        this.h = false;
        this.f12490b = this.d;
        this.f12491c = this.f12492e;
        g();
    }

    @Override
    public boolean isActive() {
        return this.f12492e != h.f12342e;
    }

    public final ByteBuffer j(int i10) {
        if (this.f12493f.capacity() < i10) {
            this.f12493f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f12493f.clear();
        }
        ByteBuffer byteBuffer = this.f12493f;
        this.f12494g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f12493f = j.f12350a;
        h hVar = h.f12342e;
        this.d = hVar;
        this.f12492e = hVar;
        this.f12490b = hVar;
        this.f12491c = hVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
