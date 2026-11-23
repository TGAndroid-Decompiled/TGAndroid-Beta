package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11048b;
    public k f11049c;
    public k d;
    public k f11050e;
    public ByteBuffer f11051f;
    public ByteBuffer f11052g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11047a;
        this.f11051f = byteBuffer;
        this.f11052g = byteBuffer;
        k kVar = k.f11041e;
        this.d = kVar;
        this.f11050e = kVar;
        this.f11048b = kVar;
        this.f11049c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11052g == n.f11047a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11052g;
        this.f11052g = n.f11047a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11052g = n.f11047a;
        this.h = false;
        this.f11048b = this.d;
        this.f11049c = this.f11050e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11050e = h(kVar);
        if (isActive()) {
            return this.f11050e;
        }
        return k.f11041e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11050e != k.f11041e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11051f.capacity() < i7) {
            this.f11051f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11051f.clear();
        }
        ByteBuffer byteBuffer = this.f11051f;
        this.f11052g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11047a;
        this.f11052g = byteBuffer;
        this.h = false;
        this.f11051f = byteBuffer;
        k kVar = k.f11041e;
        this.d = kVar;
        this.f11050e = kVar;
        this.f11048b = kVar;
        this.f11049c = kVar;
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
