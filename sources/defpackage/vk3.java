package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class vk3 extends njb {
    public long E;
    public int F;
    public int G;
    public final zk3 H;
    public boolean x;
    public float y;

    public vk3(zk3 zk3Var, Context context) {
        super(context);
        this.H = zk3Var;
    }

    @Override
    public final void a() {
        zk3 zk3Var = this.H;
        Drawable drawable = zk3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = zk3Var.P;
            int i = this.F;
            drawable2.setBounds(i, this.G, bounds.width() + i, bounds.height() + this.G);
        }
    }

    @Override
    public final void b() {
        zk3 zk3Var = this.H;
        Drawable drawable = zk3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * gm.L(3.0f));
            int i = bounds.left;
            this.F = i;
            int i2 = bounds.top;
            this.G = i2;
            zk3Var.P.setBounds(i + L, gm.L(1.0f) + i2, bounds.width() + this.F + L, bounds.height() + gm.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.E;
            if (j > 17) {
                j = 17;
            }
            this.E = elapsedRealtime;
            boolean z = this.x;
            float f = this.y;
            if (!z) {
                float f2 = (((float) j) / 664.0f) + f;
                this.y = f2;
                if (f2 >= 1.0f) {
                    this.x = true;
                    this.y = 1.0f;
                }
            } else {
                float f3 = f - (((float) j) / 664.0f);
                this.y = f3;
                if (f3 <= 0.0f) {
                    this.x = false;
                    this.y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
