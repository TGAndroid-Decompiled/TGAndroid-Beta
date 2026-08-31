package dg;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class h1 {
    public float f4548a;
    public float f4549b;
    public float f4550c;
    public float d;
    public float f4551e;
    public float f4552f;
    public double f4553g;
    public int h;
    public int f4554i;
    public ByteBuffer f4555j;

    public final boolean a(PointF pointF, float f10, float f11, float f12, int i10) {
        if ((i10 != -1 && i10 >= this.f4554i) || this.f4555j.position() == this.f4555j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f4555j.position(i10 * 20);
        }
        this.f4555j.putFloat(pointF.x);
        this.f4555j.putFloat(pointF.y);
        this.f4555j.putFloat(f10);
        this.f4555j.putFloat(f11);
        this.f4555j.putFloat(f12);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f4554i || this.f4555j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f4555j != null) {
            return;
        }
        this.f4554i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f4555j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4555j.position(0);
    }

    public final void d() {
        if (this.f4555j != null) {
            this.f4555j = null;
        }
        int max = Math.max(this.f4554i * 2, 256);
        this.f4554i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f4555j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4555j.position(0);
    }
}
