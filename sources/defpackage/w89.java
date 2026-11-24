package defpackage;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class w89 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public double g;
    public int h;
    public int i;
    public ByteBuffer j;

    public final boolean a(PointF pointF, float f, float f2, float f3, int i) {
        if ((i != -1 && i >= this.i) || this.j.position() == this.j.limit()) {
            d();
            return false;
        }
        if (i != -1) {
            this.j.position(i * 20);
        }
        this.j.putFloat(pointF.x);
        this.j.putFloat(pointF.y);
        this.j.putFloat(f);
        this.j.putFloat(f2);
        this.j.putFloat(f3);
        return true;
    }

    public final void b(int i) {
        int i2 = this.h + i;
        if (i2 > this.i || this.j == null) {
            d();
        }
        this.h = i2;
    }

    public final void c() {
        this.h = 0;
        if (this.j != null) {
            return;
        }
        this.i = 256;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((5 << 8) << 2);
        this.j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.j.position(0);
    }

    public final void d() {
        if (this.j != null) {
            this.j = null;
        }
        int max = Math.max(this.i << 1, 256);
        this.i = max;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(max * 20);
        this.j = allocateDirect;
        allocateDirect.order(ByteOrder.nativeOrder());
        this.j.position(0);
    }
}
