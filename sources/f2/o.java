package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class o implements n {
    public k f10923b;
    public k f10924c;
    public k d;
    public k f10925e;
    public ByteBuffer f10926f;
    public ByteBuffer f10927g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.f10922a;
        this.f10926f = byteBuffer;
        this.f10927g = byteBuffer;
        k kVar = k.f10916e;
        this.d = kVar;
        this.f10925e = kVar;
        this.f10923b = kVar;
        this.f10924c = kVar;
    }

    @Override
    public boolean a() {
        if (this.h && this.f10927g == n.f10922a) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f10927g;
        this.f10927g = n.f10922a;
        return byteBuffer;
    }

    @Override
    public final void d(l lVar) {
        this.f10927g = n.f10922a;
        this.h = false;
        this.f10923b = this.d;
        this.f10924c = this.f10925e;
        i();
    }

    @Override
    public final k e(k kVar) {
        this.d = kVar;
        this.f10925e = h(kVar);
        if (isActive()) {
            return this.f10925e;
        }
        return k.f10916e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override
    public boolean isActive() {
        if (this.f10925e != k.f10916e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i7) {
        if (this.f10926f.capacity() < i7) {
            this.f10926f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f10926f.clear();
        }
        ByteBuffer byteBuffer = this.f10926f;
        this.f10927g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = n.f10922a;
        this.f10927g = byteBuffer;
        this.h = false;
        this.f10926f = byteBuffer;
        k kVar = k.f10916e;
        this.d = kVar;
        this.f10925e = kVar;
        this.f10923b = kVar;
        this.f10924c = kVar;
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
