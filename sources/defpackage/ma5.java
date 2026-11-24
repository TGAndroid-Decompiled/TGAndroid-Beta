package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
public final class ma5 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final la5 e;
    public final bn3 f;
    public final float h;
    public final oa5 n;

    public ma5(oa5 oa5Var, Context context, float f) {
        super(context);
        this.n = oa5Var;
        this.h = f;
        this.e = new la5(this);
        this.f = new bn3((byte) 13);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = gm.q;
        int i3 = point.x;
        oa5 oa5Var = this.n;
        if (i3 != oa5Var.K || oa5Var.L != point.y) {
            oa5Var.K = i3;
            oa5Var.L = point.y;
            if (oa5Var.M < 0.0f) {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
                this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            oa5 oa5Var2 = oa5.f0;
            if (oa5Var2 != null) {
                oa5 oa5Var3 = this.n;
                float f = oa5Var3.M;
                float f2 = oa5Var3.N;
                float f3 = -gm.L(36.0f);
                oa5Var2.s.x = (int) td4.A(point.x - (2.0f * f3), gm.L(105.0f), f, f3);
                oa5Var2.s.y = (int) ((point.y - gm.L(105.0f)) * f2);
                oa5Var2.i();
                ma5 ma5Var = oa5Var2.a;
                if (ma5Var.getParent() != null) {
                    oa5Var2.n.updateViewLayout(ma5Var, oa5Var2.s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma5.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
