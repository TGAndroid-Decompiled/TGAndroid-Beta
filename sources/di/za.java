package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.i20;
import org.telegram.ui.xy;
public final class za extends org.telegram.ui.Components.h6 {
    public final int f9851s = 0;
    public final Object f9852w;
    public final ViewGroup f9853x;

    public za(ab abVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f9853x = abVar;
        this.f9852w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f9851s) {
            case 0:
                ((ab) this.f9853x).getClass();
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                Drawable drawable = (Drawable) this.f9852w;
                drawable.setBounds(measuredWidth, i20.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                xy xyVar = (xy) this.f9853x;
                int a10 = xyVar.f53353x.a(xyVar.f53352w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f9852w;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.2f;
                } else {
                    f10 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(f10, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public za(xy xyVar, Context context) {
        super(context, false, true, true);
        this.f9853x = xyVar;
        this.f9852w = new Paint(1);
    }
}
