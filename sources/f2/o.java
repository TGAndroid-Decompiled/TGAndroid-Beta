package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11087b;
    public k f11088c;
    public k d;
    public k f11089e;
    public ByteBuffer f11090f;
    public ByteBuffer f11091g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11086a;
        this.f11090f = byteBuffer;
        this.f11091g = byteBuffer;
        k kVar = k.f11080e;
        this.d = kVar;
        this.f11089e = kVar;
        this.f11087b = kVar;
        this.f11088c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11091g == n.f11086a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11091g;
        this.f11091g = n.f11086a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11091g = n.f11086a;
        this.h = false;
        this.f11087b = this.d;
        this.f11088c = this.f11089e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11089e = h(kVar);
        if (isActive()) {
            return this.f11089e;
        }
        return k.f11080e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11089e != k.f11080e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11090f.capacity() < i7) {
            this.f11090f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11090f.clear();
        }
        ByteBuffer byteBuffer = this.f11090f;
        this.f11091g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11086a;
        this.f11091g = byteBuffer;
        this.h = false;
        this.f11090f = byteBuffer;
        k kVar = k.f11080e;
        this.d = kVar;
        this.f11089e = kVar;
        this.f11087b = kVar;
        this.f11088c = kVar;
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
