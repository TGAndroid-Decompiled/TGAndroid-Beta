package cg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class i1 {
    public float f2404a;
    public float f2405b;
    public float f2406c;
    public float d;
    public float e;
    public float f2407f;
    public double f2408g;
    public int h;
    public int f2409i;
    public ByteBuffer f2410j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i10) {
        if ((i10 != -1 && i10 >= this.f2409i) || this.f2410j.position() == this.f2410j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f2410j.position(i10 * 20);
        }
        this.f2410j.putFloat(pointF.x);
        this.f2410j.putFloat(pointF.y);
        this.f2410j.putFloat(f10);
        this.f2410j.putFloat(f11);
        this.f2410j.putFloat(f12);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f2409i || this.f2410j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f2410j != null) {
            return;
        }
        this.f2409i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f2410j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f2410j.position(0);
    }

    public final void d() {
        if (this.f2410j != null) {
            this.f2410j = null;
        }
        int max = Math.max(this.f2409i * 2, 256);
        this.f2409i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f2410j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f2410j.position(0);
    }
}
