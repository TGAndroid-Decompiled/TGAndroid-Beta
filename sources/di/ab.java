package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.i20;
import org.telegram.ui.xy;
public final class ab extends org.telegram.ui.Components.h6 {
    public final int f8216s = 0;
    public final Object f8217w;
    public final ViewGroup f8218x;

    public ab(bb bbVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f8218x = bbVar;
        this.f8217w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f8216s) {
            case 0:
                ((bb) this.f8218x).getClass();
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                Drawable drawable = (Drawable) this.f8217w;
                drawable.setBounds(measuredWidth, i20.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                xy xyVar = (xy) this.f8218x;
                int a10 = xyVar.f53349x.a(xyVar.f53348w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f8217w;
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

    public ab(xy xyVar, Context context) {
        super(context, false, true, true);
        this.f8218x = xyVar;
        this.f8217w = new Paint(1);
    }
}
