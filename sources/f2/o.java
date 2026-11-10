package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f10928b;
    public k f10929c;
    public k d;
    public k f10930e;
    public ByteBuffer f10931f;
    public ByteBuffer f10932g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f10927a;
        this.f10931f = byteBuffer;
        this.f10932g = byteBuffer;
        k kVar = k.f10921e;
        this.d = kVar;
        this.f10930e = kVar;
        this.f10928b = kVar;
        this.f10929c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f10932g == n.f10927a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f10932g;
        this.f10932g = n.f10927a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f10932g = n.f10927a;
        this.h = false;
        this.f10928b = this.d;
        this.f10929c = this.f10930e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f10930e = h(kVar);
        if (isActive()) {
            return this.f10930e;
        }
        return k.f10921e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f10930e != k.f10921e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f10931f.capacity() < i7) {
            this.f10931f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f10931f.clear();
        }
        ByteBuffer byteBuffer = this.f10931f;
        this.f10932g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f10927a;
        this.f10932g = byteBuffer;
        this.h = false;
        this.f10931f = byteBuffer;
        k kVar = k.f10921e;
        this.d = kVar;
        this.f10930e = kVar;
        this.f10928b = kVar;
        this.f10929c = kVar;
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
