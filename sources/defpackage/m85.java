package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
public final class m85 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final l85 e;
    public final ql3 f;
    public final float h;
    public final o85 n;

    public m85(o85 o85Var, Context context, float f) {
        super(context);
        this.n = o85Var;
        this.h = f;
        this.e = new l85(this);
        this.f = new ql3((byte) 13);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = gl.q;
        int i3 = point.x;
        o85 o85Var = this.n;
        if (i3 != o85Var.K || o85Var.L != point.y) {
            o85Var.K = i3;
            o85Var.L = point.y;
            if (o85Var.M < 0.0f) {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
                this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
                this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            o85 o85Var2 = o85.f0;
            if (o85Var2 != null) {
                o85 o85Var3 = this.n;
                float f = o85Var3.M;
                float f2 = o85Var3.N;
                float f3 = -gl.L(36.0f);
                o85Var2.s.x = (int) tb4.A(point.x - (2.0f * f3), gl.L(105.0f), f, f3);
                o85Var2.s.y = (int) ((point.y - gl.L(105.0f)) * f2);
                o85Var2.i();
                m85 m85Var = o85Var2.a;
                if (m85Var.getParent() != null) {
                    o85Var2.n.updateViewLayout(m85Var, o85Var2.s);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m85.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
