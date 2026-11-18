package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11058b;
    public k f11059c;
    public k d;
    public k f11060e;
    public ByteBuffer f11061f;
    public ByteBuffer f11062g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11057a;
        this.f11061f = byteBuffer;
        this.f11062g = byteBuffer;
        k kVar = k.f11051e;
        this.d = kVar;
        this.f11060e = kVar;
        this.f11058b = kVar;
        this.f11059c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11062g == n.f11057a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11062g;
        this.f11062g = n.f11057a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11062g = n.f11057a;
        this.h = false;
        this.f11058b = this.d;
        this.f11059c = this.f11060e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11060e = h(kVar);
        if (isActive()) {
            return this.f11060e;
        }
        return k.f11051e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11060e != k.f11051e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11061f.capacity() < i7) {
            this.f11061f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11061f.clear();
        }
        ByteBuffer byteBuffer = this.f11061f;
        this.f11062g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11057a;
        this.f11062g = byteBuffer;
        this.h = false;
        this.f11061f = byteBuffer;
        k kVar = k.f11051e;
        this.d = kVar;
        this.f11060e = kVar;
        this.f11058b = kVar;
        this.f11059c = kVar;
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
