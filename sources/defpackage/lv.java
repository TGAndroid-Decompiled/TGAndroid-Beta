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
public final class lv extends View implements snb {
    public final byte a = 0;
    public Object b;
    public Drawable c;

    public lv(Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = xi5Var;
        zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.Hl, false)), aob.V0(activity, 2131231233, -16777216));
        this.c = zm2Var;
        zm2Var.x = true;
        setBackgroundDrawable(zm2Var);
        setImportantForAccessibility(2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(aob.Hl));
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
                bl8.d().f(-hl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - hl.L(2.0f), bl8.d().e());
                float L = hl.L(18.0f) / 2.0f;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(12.0f));
                int i3 = aob.Hl;
                ((o) ((xi5) this.b)).getClass();
                aob.z1((zm2) this.c, aob.u0(i3), false);
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
                    zm2 zm2Var = (zm2) this.c;
                    if (zm2Var != null && ((xi5) this.b) != null) {
                        aob.z1(zm2Var, aob.w0(null, aob.Hl, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                ((Paint) this.b).setColor(aob.w0(null, aob.h5, false));
                invalidate();
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public lv(Context context) {
        super(context);
    }
}
