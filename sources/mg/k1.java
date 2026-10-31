package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.h4;
import org.telegram.ui.m60;
public final class k1 extends View implements k6 {
    public final int f13178a = 0;
    public Object f13179b;
    public Drawable f13180c;

    public k1(Context context) {
        super(context);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f13178a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(t6.El));
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13178a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f13179b);
                ea.f.d().f(-org.telegram.messenger.i0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(2.0f), ea.f.d().e());
                float L = org.telegram.messenger.i0.L(18.0f) / 2.0f;
                Drawable drawable = this.f13180c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f13178a) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(12.0f));
                int i12 = t6.El;
                ((h4) ((m60) this.f13179b)).getClass();
                t6.B1((eq) this.f13180c, t6.v0(i12), false);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f13178a) {
            case 0:
                ((Paint) this.f13179b).setColor(t6.x0(null, t6.f21001h5, false));
                invalidate();
                return;
            default:
                try {
                    eq eqVar = (eq) this.f13180c;
                    if (eqVar != null && ((m60) this.f13179b) != null) {
                        t6.B1(eqVar, t6.x0(null, t6.El, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }

    public k1(Context context, m60 m60Var) {
        super(context);
        this.f13179b = m60Var;
        eq eqVar = new eq(new ColorDrawable(t6.x0(null, t6.El, false)), t6.X0(context, 2131231231, -16777216));
        this.f13180c = eqVar;
        eqVar.f25847x = true;
        setBackgroundDrawable(eqVar);
        setImportantForAccessibility(2);
    }

    private final void a(HashSet hashSet) {
    }
}
