package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4522b;
    public k f4523c;
    public k d;
    public k e;
    public ByteBuffer f4524f;
    public ByteBuffer f4525g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4521a;
        this.f4524f = byteBuffer;
        this.f4525g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4522b = kVar;
        this.f4523c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4525g;
        this.f4525g = n.f4521a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4525g == n.f4521a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4525g = n.f4521a;
        this.h = false;
        this.f4522b = this.d;
        this.f4523c = this.e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.e = h(kVar);
        if (isActive()) {
            return this.e;
        }
        return k.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.e != k.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i10) {
        if (this.f4524f.capacity() < i10) {
            this.f4524f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4524f.clear();
        }
        ByteBuffer byteBuffer = this.f4524f;
        this.f4525g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4521a;
        this.f4525g = byteBuffer;
        this.h = false;
        this.f4524f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4522b = kVar;
        this.f4523c = kVar;
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
