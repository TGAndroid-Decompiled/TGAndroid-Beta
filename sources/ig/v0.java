package ig;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class v0 {
    public float f8489a;
    public float f8490b;
    public float f8491c;
    public float d;
    public float e;
    public float f8492f;
    public double f8493g;
    public int h;
    public int f8494i;
    public ByteBuffer f8495j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f8494i) || this.f8495j.position() == this.f8495j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f8495j.position(i10 * 20);
        }
        this.f8495j.putFloat(pointF.x);
        this.f8495j.putFloat(pointF.y);
        this.f8495j.putFloat(f7);
        this.f8495j.putFloat(f10);
        this.f8495j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f8494i || this.f8495j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f8495j != null) {
            return;
        }
        this.f8494i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f8495j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8495j.position(0);
    }

    public final void d() {
        if (this.f8495j != null) {
            this.f8495j = null;
        }
        int max = Math.max(this.f8494i * 2, 256);
        this.f8494i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f8495j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8495j.position(0);
    }
}
