package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4148b;
    public k f4149c;
    public k d;
    public k e;
    public ByteBuffer f4150f;
    public ByteBuffer f4151g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4147a;
        this.f4150f = byteBuffer;
        this.f4151g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4148b = kVar;
        this.f4149c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4151g;
        this.f4151g = n.f4147a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4151g == n.f4147a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4151g = n.f4147a;
        this.h = false;
        this.f4148b = this.d;
        this.f4149c = this.e;
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
        if (this.f4150f.capacity() < i10) {
            this.f4150f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4150f.clear();
        }
        ByteBuffer byteBuffer = this.f4150f;
        this.f4151g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4147a;
        this.f4151g = byteBuffer;
        this.h = false;
        this.f4150f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4148b = kVar;
        this.f4149c = kVar;
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
