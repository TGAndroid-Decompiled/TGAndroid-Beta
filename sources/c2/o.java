package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4521b;
    public k f4522c;
    public k d;
    public k e;
    public ByteBuffer f4523f;
    public ByteBuffer f4524g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4520a;
        this.f4523f = byteBuffer;
        this.f4524g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4521b = kVar;
        this.f4522c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4524g;
        this.f4524g = n.f4520a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4524g == n.f4520a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4524g = n.f4520a;
        this.h = false;
        this.f4521b = this.d;
        this.f4522c = this.e;
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
        if (this.f4523f.capacity() < i10) {
            this.f4523f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4523f.clear();
        }
        ByteBuffer byteBuffer = this.f4523f;
        this.f4524g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4520a;
        this.f4524g = byteBuffer;
        this.h = false;
        this.f4523f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4521b = kVar;
        this.f4522c = kVar;
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
