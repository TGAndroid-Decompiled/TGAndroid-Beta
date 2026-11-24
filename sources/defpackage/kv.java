package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;
public final class kv extends View implements tjb {
    public final byte a = 0;
    public Object b;
    public Drawable c;

    public kv(Activity activity, vg5 vg5Var) {
        super(activity);
        this.b = vg5Var;
        fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.Gl, false)), bkb.V0(activity, 2131231233, -16777216));
        this.c = fm2Var;
        fm2Var.x = true;
        setBackgroundDrawable(fm2Var);
        setImportantForAccessibility(2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(bkb.Gl));
                return;
            default:
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                nh8.d().f(-gl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - gl.L(2.0f), nh8.d().e());
                float L = gl.L(18.0f) / 2.0f;
                Drawable drawable = this.c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(12.0f));
                int i3 = bkb.Gl;
                ((o) ((vg5) this.b)).getClass();
                bkb.z1((fm2) this.c, bkb.u0(i3), false);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    fm2 fm2Var = (fm2) this.c;
                    if (fm2Var != null && ((vg5) this.b) != null) {
                        bkb.z1(fm2Var, bkb.w0(null, bkb.Gl, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                ((Paint) this.b).setColor(bkb.w0(null, bkb.g5, false));
                invalidate();
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public kv(Context context) {
        super(context);
    }
}
