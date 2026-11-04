package e2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class n implements m {
    public j f9359b;
    public j f9360c;
    public j d;
    public j f9361e;
    public ByteBuffer f9362f;
    public ByteBuffer f9363g;
    public boolean h;

    public n() {
        ByteBuffer byteBuffer = m.f9358a;
        this.f9362f = byteBuffer;
        this.f9363g = byteBuffer;
        j jVar = j.f9352e;
        this.d = jVar;
        this.f9361e = jVar;
        this.f9359b = jVar;
        this.f9360c = jVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f9363g == m.f9358a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f9363g;
        this.f9363g = m.f9358a;
        return byteBuffer;
    }

    @Override
    public final j d(j jVar) {
        this.d = jVar;
        this.f9361e = h(jVar);
        if (isActive()) {
            return this.f9361e;
        }
        return j.f9352e;
    }

    @Override
    public final void e(k kVar) {
        this.f9363g = m.f9358a;
        this.h = false;
        this.f9359b = this.d;
        this.f9360c = this.f9361e;
        i();
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override
    public boolean isActive() {
        if (this.f9361e != j.f9352e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i3) {
        if (this.f9362f.capacity() < i3) {
            this.f9362f = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f9362f.clear();
        }
        ByteBuffer byteBuffer = this.f9362f;
        this.f9363g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = m.f9358a;
        this.f9363g = byteBuffer;
        this.h = false;
        this.f9362f = byteBuffer;
        j jVar = j.f9352e;
        this.d = jVar;
        this.f9361e = jVar;
        this.f9359b = jVar;
        this.f9360c = jVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override
    public long g(long j10) {
        return j10;
    }
}
