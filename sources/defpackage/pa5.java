package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
public final class pa5 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final oa5 e;
    public final jm3 f;
    public final float h;
    public final ra5 n;

    public pa5(ra5 ra5Var, Context context, float f) {
        super(context);
        this.n = ra5Var;
        this.h = f;
        this.e = new oa5(this);
        this.f = new jm3((byte) 15);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = hl.q;
        int i3 = point.x;
        ra5 ra5Var = this.n;
        if (i3 != ra5Var.K || ra5Var.L != point.y) {
            ra5Var.K = i3;
            ra5Var.L = point.y;
            if (ra5Var.M < 0.0f) {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
                this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            ra5 ra5Var2 = ra5.f0;
            if (ra5Var2 != null) {
                ra5 ra5Var3 = this.n;
                float f = ra5Var3.M;
                float f2 = ra5Var3.N;
                float f3 = -hl.L(36.0f);
                ra5Var2.s.x = (int) qd4.A(point.x - (2.0f * f3), hl.L(105.0f), f, f3);
                ra5Var2.s.y = (int) ((point.y - hl.L(105.0f)) * f2);
                ra5Var2.i();
                pa5 pa5Var = ra5Var2.a;
                if (pa5Var.getParent() != null) {
                    ra5Var2.n.updateViewLayout(pa5Var, ra5Var2.s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa5.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
