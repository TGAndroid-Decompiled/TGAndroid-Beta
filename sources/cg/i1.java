package cg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class i1 {
    public float f2421a;
    public float f2422b;
    public float f2423c;
    public float d;
    public float e;
    public float f2424f;
    public double f2425g;
    public int h;
    public int f2426i;
    public ByteBuffer f2427j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i10) {
        if ((i10 != -1 && i10 >= this.f2426i) || this.f2427j.position() == this.f2427j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f2427j.position(i10 * 20);
        }
        this.f2427j.putFloat(pointF.x);
        this.f2427j.putFloat(pointF.y);
        this.f2427j.putFloat(f10);
        this.f2427j.putFloat(f11);
        this.f2427j.putFloat(f12);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f2426i || this.f2427j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f2427j != null) {
            return;
        }
        this.f2426i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f2427j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f2427j.position(0);
    }

    public final void d() {
        if (this.f2427j != null) {
            this.f2427j = null;
        }
        int max = Math.max(this.f2426i * 2, 256);
        this.f2426i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f2427j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f2427j.position(0);
    }
}
