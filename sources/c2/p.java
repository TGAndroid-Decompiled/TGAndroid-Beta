package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class p implements o {
    public l f5960b;
    public l f5961c;
    public l d;
    public l e;
    public ByteBuffer f5962f;
    public ByteBuffer f5963g;
    public boolean h;

    public p() {
        ByteBuffer byteBuffer = o.f5959a;
        this.f5962f = byteBuffer;
        this.f5963g = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f5960b = lVar;
        this.f5961c = lVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f5963g;
        this.f5963g = o.f5959a;
        return byteBuffer;
    }

    @Override
    public boolean c() {
        if (this.h && this.f5963g == o.f5959a) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(m mVar) {
        this.f5963g = o.f5959a;
        this.h = false;
        this.f5960b = this.d;
        this.f5961c = this.e;
        i();
    }

    @Override
    public final l e(l lVar) {
        this.d = lVar;
        this.e = h(lVar);
        if (isActive()) {
            return this.e;
        }
        return l.e;
    }

    @Override
    public final void f() {
        this.h = true;
        j();
    }

    public abstract l h(l lVar);

    @Override
    public boolean isActive() {
        if (this.e != l.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer l(int i10) {
        if (this.f5962f.capacity() < i10) {
            this.f5962f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f5962f.clear();
        }
        ByteBuffer byteBuffer = this.f5962f;
        this.f5963g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = o.f5959a;
        this.f5963g = byteBuffer;
        this.h = false;
        this.f5962f = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.f5960b = lVar;
        this.f5961c = lVar;
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
