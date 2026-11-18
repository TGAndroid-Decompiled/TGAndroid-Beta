package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f11055b;
    public k f11056c;
    public k d;
    public k f11057e;
    public ByteBuffer f11058f;
    public ByteBuffer f11059g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f11054a;
        this.f11058f = byteBuffer;
        this.f11059g = byteBuffer;
        k kVar = k.f11048e;
        this.d = kVar;
        this.f11057e = kVar;
        this.f11055b = kVar;
        this.f11056c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f11059g == n.f11054a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f11059g;
        this.f11059g = n.f11054a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f11059g = n.f11054a;
        this.h = false;
        this.f11055b = this.d;
        this.f11056c = this.f11057e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f11057e = h(kVar);
        if (isActive()) {
            return this.f11057e;
        }
        return k.f11048e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f11057e != k.f11048e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f11058f.capacity() < i7) {
            this.f11058f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f11058f.clear();
        }
        ByteBuffer byteBuffer = this.f11058f;
        this.f11059g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f11054a;
        this.f11059g = byteBuffer;
        this.h = false;
        this.f11058f = byteBuffer;
        k kVar = k.f11048e;
        this.d = kVar;
        this.f11057e = kVar;
        this.f11055b = kVar;
        this.f11056c = kVar;
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
