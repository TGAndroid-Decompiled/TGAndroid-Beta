package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f4523b;
    public k f4524c;
    public k d;
    public k e;
    public ByteBuffer f4525f;
    public ByteBuffer f4526g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f4522a;
        this.f4525f = byteBuffer;
        this.f4526g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4523b = kVar;
        this.f4524c = kVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f4526g;
        this.f4526g = n.f4522a;
        return byteBuffer;
    }

    @Override
    public boolean b() {
        if (this.h && this.f4526g == n.f4522a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(l lVar) {
        this.f4526g = n.f4522a;
        this.h = false;
        this.f4523b = this.d;
        this.f4524c = this.e;
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
        if (this.f4525f.capacity() < i10) {
            this.f4525f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4525f.clear();
        }
        ByteBuffer byteBuffer = this.f4525f;
        this.f4526g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f4522a;
        this.f4526g = byteBuffer;
        this.h = false;
        this.f4525f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.f4523b = kVar;
        this.f4524c = kVar;
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
