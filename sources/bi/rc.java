package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.wy;
public final class rc extends org.telegram.ui.Components.j6 {
    public final int f4647s = 0;
    public final Object f4648w;
    public final ViewGroup f4649x;

    public rc(sc scVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f4649x = scVar;
        this.f4648w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f4647s) {
            case 0:
                Drawable drawable = (Drawable) this.f4648w;
                if (!((sc) this.f4649x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.camera.q.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                wy wyVar = (wy) this.f4649x;
                int a10 = wyVar.f51675x.a(wyVar.f51674w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f4648w;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 0.2f;
                } else {
                    f10 = 0.1f;
                }
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(f10, a10));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.g0.N(9.32f), (getHeight() - org.telegram.messenger.g0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                return;
        }
    }

    public rc(wy wyVar, Context context) {
        super(context, false, true, true);
        this.f4649x = wyVar;
        this.f4648w = new Paint(1);
    }
}
