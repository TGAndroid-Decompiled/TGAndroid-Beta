package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class n implements m {
    public j f3553b;
    public j f3554c;
    public j d;
    public j e;
    public ByteBuffer f3555f;
    public ByteBuffer f3556g;
    public boolean h;

    public n() {
        ByteBuffer byteBuffer = m.f3552a;
        this.f3555f = byteBuffer;
        this.f3556g = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.f3553b = jVar;
        this.f3554c = jVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f3556g;
        this.f3556g = m.f3552a;
        return byteBuffer;
    }

    @Override
    public boolean c() {
        if (this.h && this.f3556g == m.f3552a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(k kVar) {
        this.f3556g = m.f3552a;
        this.h = false;
        this.f3553b = this.d;
        this.f3554c = this.e;
        i();
    }

    @Override
    public final j e(j jVar) {
        this.d = jVar;
        this.e = h(jVar);
        if (isActive()) {
            return this.e;
        }
        return j.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override
    public boolean isActive() {
        if (this.e != j.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i10) {
        if (this.f3555f.capacity() < i10) {
            this.f3555f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3555f.clear();
        }
        ByteBuffer byteBuffer = this.f3555f;
        this.f3556g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = m.f3552a;
        this.f3556g = byteBuffer;
        this.h = false;
        this.f3555f = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.f3553b = jVar;
        this.f3554c = jVar;
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
