package og;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class a1 {
    public float f14322a;
    public float f14323b;
    public float f14324c;
    public float d;
    public float e;
    public float f14325f;
    public double f14326g;
    public int h;
    public int f14327i;
    public ByteBuffer f14328j;

    public final boolean a(PointF pointF, float f7, float f10, float f11, int i10) {
        if ((i10 != -1 && i10 >= this.f14327i) || this.f14328j.position() == this.f14328j.limit()) {
            d();
            return false;
        }
        if (i10 != -1) {
            this.f14328j.position(i10 * 20);
        }
        this.f14328j.putFloat(pointF.x);
        this.f14328j.putFloat(pointF.y);
        this.f14328j.putFloat(f7);
        this.f14328j.putFloat(f10);
        this.f14328j.putFloat(f11);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.h + i10;
        if (i11 > this.f14327i || this.f14328j == null) {
            d();
        }
        this.h = i11;
    }

    public final void c() {
        this.h = 0;
        if (this.f14328j != null) {
            return;
        }
        this.f14327i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 5 * 4);
        this.f14328j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f14328j.position(0);
    }

    public final void d() {
        if (this.f14328j != null) {
            this.f14328j = null;
        }
        int max = Math.max(this.f14327i * 2, 256);
        this.f14327i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.f14328j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f14328j.position(0);
    }
}
