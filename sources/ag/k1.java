package ag;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class k1 {
    public float f563a;
    public float f564b;
    public float f565c;
    public float d;
    public float f566e;
    public float f567f;
    public double f568g;
    public int h;
    public int f569i;
    public ByteBuffer f570j;

    public final boolean a(PointF pointF, float f9, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f569i) || this.f570j.position() == this.f570j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f570j.position(i10 * 20);
        }
        this.f570j.putFloat(pointF.x);
        this.f570j.putFloat(pointF.y);
        this.f570j.putFloat(f9);
        this.f570j.putFloat(f10);
        this.f570j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f569i || this.f570j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f570j != null) {
            return;
        }
        this.f569i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f570j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f570j.position(0);
    }

    public final void d() {
        if (this.f570j != null) {
            this.f570j = null;
        }
        int max = Math.max(this.f569i * 2, 256);
        this.f569i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f570j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f570j.position(0);
    }
}
