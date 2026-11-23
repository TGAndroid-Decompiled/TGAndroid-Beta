package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11050b;
    public k f11051c;
    public k d;
    public k f11052e;
    public ByteBuffer f11053f;
    public ByteBuffer f11054g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11049a;
        this.f11053f = byteBuffer;
        this.f11054g = byteBuffer;
        k kVar = k.f11043e;
        this.d = kVar;
        this.f11052e = kVar;
        this.f11050b = kVar;
        this.f11051c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11054g == n.f11049a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11054g;
        this.f11054g = n.f11049a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11054g = n.f11049a;
        this.h = false;
        this.f11050b = this.d;
        this.f11051c = this.f11052e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11052e = h(kVar);
        if (isActive()) {
            return this.f11052e;
        }
        return k.f11043e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11052e != k.f11043e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11053f.capacity() < i7) {
            this.f11053f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11053f.clear();
        }
        ByteBuffer byteBuffer = this.f11053f;
        this.f11054g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11049a;
        this.f11054g = byteBuffer;
        this.h = false;
        this.f11053f = byteBuffer;
        k kVar = k.f11043e;
        this.d = kVar;
        this.f11052e = kVar;
        this.f11050b = kVar;
        this.f11051c = kVar;
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
