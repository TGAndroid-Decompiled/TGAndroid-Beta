package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class a0 implements n {
    public l f11487b;
    public l f11488c;
    public l d;
    public l f11489e;
    public ByteBuffer f11490f;
    public ByteBuffer f11491g;
    public boolean h;

    public a0() {
        ByteBuffer byteBuffer = n.f11564a;
        this.f11490f = byteBuffer;
        this.f11491g = byteBuffer;
        l lVar = l.f11559e;
        this.d = lVar;
        this.f11489e = lVar;
        this.f11487b = lVar;
        this.f11488c = lVar;
    }

    @Override
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f11491g;
        this.f11491g = n.f11564a;
        return byteBuffer;
    }

    @Override
    public final void c() {
        this.h = true;
        h();
    }

    @Override
    public boolean d() {
        if (this.h && this.f11491g == n.f11564a) {
            return true;
        }
        return false;
    }

    @Override
    public final l e(l lVar) {
        this.d = lVar;
        this.f11489e = f(lVar);
        if (isActive()) {
            return this.f11489e;
        }
        return l.f11559e;
    }

    public abstract l f(l lVar);

    @Override
    public final void flush() {
        this.f11491g = n.f11564a;
        this.h = false;
        this.f11487b = this.d;
        this.f11488c = this.f11489e;
        g();
    }

    @Override
    public boolean isActive() {
        if (this.f11489e != l.f11559e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i10) {
        if (this.f11490f.capacity() < i10) {
            this.f11490f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f11490f.clear();
        }
        ByteBuffer byteBuffer = this.f11490f;
        this.f11491g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        flush();
        this.f11490f = n.f11564a;
        l lVar = l.f11559e;
        this.d = lVar;
        this.f11489e = lVar;
        this.f11487b = lVar;
        this.f11488c = lVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
