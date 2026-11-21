package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.n10;
import org.telegram.ui.az;
public final class db extends org.telegram.ui.Components.o6 {
    public final int f8701s = 0;
    public final Object f8702w;
    public final ViewGroup f8703x;

    public db(eb ebVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f8703x = ebVar;
        this.f8702w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f8701s) {
            case 0:
                ((eb) this.f8703x).getClass();
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                Drawable drawable = (Drawable) this.f8702w;
                drawable.setBounds(measuredWidth, n10.z(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                az azVar = (az) this.f8703x;
                int a10 = azVar.f45733x.a(azVar.f45732w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f8702w;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = 0.2f;
                } else {
                    f10 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(f10, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public db(az azVar, Context context) {
        super(context, false, true, true);
        this.f8703x = azVar;
        this.f8702w = new Paint(1);
    }
}
