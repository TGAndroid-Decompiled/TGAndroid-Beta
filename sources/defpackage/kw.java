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
public final class kw extends View implements vlb {
    public final byte a = 0;
    public Object b;
    public Drawable c;

    public kw(Activity activity, ui5 ui5Var) {
        super(activity);
        this.b = ui5Var;
        sn2 sn2Var = new sn2(new ColorDrawable(cmb.w0(null, cmb.Gl, false)), cmb.V0(activity, 2131231234, -16777216));
        this.c = sn2Var;
        sn2Var.x = true;
        setBackgroundDrawable(sn2Var);
        setImportantForAccessibility(2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(cmb.Gl));
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
                oj8.d().f(-gm.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - gm.L(2.0f), oj8.d().e());
                float L = gm.L(18.0f) / 2.0f;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(12.0f));
                int i3 = cmb.Gl;
                ((o) ((ui5) this.b)).getClass();
                cmb.z1((sn2) this.c, cmb.u0(i3), false);
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
                    sn2 sn2Var = (sn2) this.c;
                    if (sn2Var != null && ((ui5) this.b) != null) {
                        cmb.z1(sn2Var, cmb.w0(null, cmb.Gl, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                ((Paint) this.b).setColor(cmb.w0(null, cmb.g5, false));
                invalidate();
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public kw(Context context) {
        super(context);
    }
}
