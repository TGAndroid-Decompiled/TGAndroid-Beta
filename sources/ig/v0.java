package ig;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f8488a;
    public float f8489b;
    public float f8490c;
    public float d;
    public float e;
    public float f8491f;
    public double f8492g;
    public int h;
    public int f8493i;
    public ByteBuffer f8494j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f8493i) || this.f8494j.position() == this.f8494j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f8494j.position(i10 * 20);
        }
        this.f8494j.putFloat(pointF.x);
        this.f8494j.putFloat(pointF.y);
        this.f8494j.putFloat(f7);
        this.f8494j.putFloat(f10);
        this.f8494j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f8493i || this.f8494j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f8494j != null) {
            return;
        }
        this.f8493i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f8494j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8494j.position(0);
    }

    public final void d() {
        if (this.f8494j != null) {
            this.f8494j = null;
        }
        int max = Math.max(this.f8493i * 2, 256);
        this.f8493i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f8494j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8494j.position(0);
    }
}
