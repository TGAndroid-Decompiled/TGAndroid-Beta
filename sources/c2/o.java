package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4152b;
    public k f4153c;
    public k d;
    public k e;
    public ByteBuffer f4154f;
    public ByteBuffer f4155g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4151a;
        this.f4154f = byteBuffer;
        this.f4155g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4152b = kVar;
        this.f4153c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4155g;
        this.f4155g = n.f4151a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4155g == n.f4151a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4155g = n.f4151a;
        this.h = false;
        this.f4152b = this.d;
        this.f4153c = this.e;
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
        if (this.f4154f.capacity() < i10) {
            this.f4154f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4154f.clear();
        }
        ByteBuffer byteBuffer = this.f4154f;
        this.f4155g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4151a;
        this.f4155g = byteBuffer;
        this.h = false;
        this.f4154f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4152b = kVar;
        this.f4153c = kVar;
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
