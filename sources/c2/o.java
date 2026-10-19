package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4519b;
    public k f4520c;
    public k d;
    public k e;
    public ByteBuffer f4521f;
    public ByteBuffer f4522g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4518a;
        this.f4521f = byteBuffer;
        this.f4522g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4519b = kVar;
        this.f4520c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4522g;
        this.f4522g = n.f4518a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4522g == n.f4518a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4522g = n.f4518a;
        this.h = false;
        this.f4519b = this.d;
        this.f4520c = this.e;
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
        if (this.f4521f.capacity() < i10) {
            this.f4521f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4521f.clear();
        }
        ByteBuffer byteBuffer = this.f4521f;
        this.f4522g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4518a;
        this.f4522g = byteBuffer;
        this.h = false;
        this.f4521f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4519b = kVar;
        this.f4520c = kVar;
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
