package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11084b;
    public k f11085c;
    public k d;
    public k f11086e;
    public ByteBuffer f11087f;
    public ByteBuffer f11088g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11083a;
        this.f11087f = byteBuffer;
        this.f11088g = byteBuffer;
        k kVar = k.f11077e;
        this.d = kVar;
        this.f11086e = kVar;
        this.f11084b = kVar;
        this.f11085c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11088g == n.f11083a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11088g;
        this.f11088g = n.f11083a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11088g = n.f11083a;
        this.h = false;
        this.f11084b = this.d;
        this.f11085c = this.f11086e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11086e = h(kVar);
        if (isActive()) {
            return this.f11086e;
        }
        return k.f11077e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11086e != k.f11077e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11087f.capacity() < i7) {
            this.f11087f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11087f.clear();
        }
        ByteBuffer byteBuffer = this.f11087f;
        this.f11088g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11083a;
        this.f11088g = byteBuffer;
        this.h = false;
        this.f11087f = byteBuffer;
        k kVar = k.f11077e;
        this.d = kVar;
        this.f11086e = kVar;
        this.f11084b = kVar;
        this.f11085c = kVar;
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
