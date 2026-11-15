package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class n implements m {
    public j f10736b;
    public j f10737c;
    public j d;
    public j f10738e;
    public ByteBuffer f10739f;
    public ByteBuffer f10740g;
    public boolean h;

    public n() {
        ByteBuffer byteBuffer = m.f10735a;
        this.f10739f = byteBuffer;
        this.f10740g = byteBuffer;
        j jVar = j.f10729e;
        this.d = jVar;
        this.f10738e = jVar;
        this.f10736b = jVar;
        this.f10737c = jVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f10740g == m.f10735a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f10740g;
        this.f10740g = m.f10735a;
        return byteBuffer;
    }

    @Override
    public final void d(k kVar) {
        this.f10740g = m.f10735a;
        this.h = false;
        this.f10736b = this.d;
        this.f10737c = this.f10738e;
        i();
    }

    @Override
    public final j e(j jVar) {
        this.d = jVar;
        this.f10738e = h(jVar);
        if (isActive()) {
            return this.f10738e;
        }
        return j.f10729e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override
    public boolean isActive() {
        if (this.f10738e != j.f10729e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f10739f.capacity() < i7) {
            this.f10739f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f10739f.clear();
        }
        ByteBuffer byteBuffer = this.f10739f;
        this.f10740g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = m.f10735a;
        this.f10740g = byteBuffer;
        this.h = false;
        this.f10739f = byteBuffer;
        j jVar = j.f10729e;
        this.d = jVar;
        this.f10738e = jVar;
        this.f10736b = jVar;
        this.f10737c = jVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override
    public long g(long j3) {
        return j3;
    }
}
