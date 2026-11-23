package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.m10;
import org.telegram.ui.zy;
public final class db extends org.telegram.ui.Components.n6 {
    public final int f8665s = 0;
    public final Object f8666w;
    public final ViewGroup f8667x;

    public db(eb ebVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f8667x = ebVar;
        this.f8666w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f8665s) {
            case 0:
                ((eb) this.f8667x).getClass();
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                Drawable drawable = (Drawable) this.f8666w;
                drawable.setBounds(measuredWidth, m10.z(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                zy zyVar = (zy) this.f8667x;
                int a10 = zyVar.f54749x.a(zyVar.f54748w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f8666w;
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.2f;
                } else {
                    f10 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(f10, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public db(zy zyVar, Context context) {
        super(context, false, true, true);
        this.f8667x = zyVar;
        this.f8666w = new Paint(1);
    }
}
