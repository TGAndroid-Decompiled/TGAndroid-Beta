package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.ty;
public final class kb extends org.telegram.ui.Components.h6 {
    public final int f5412s = 0;
    public final Object f5413w;
    public final ViewGroup f5414x;

    public kb(lb lbVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.f5414x = lbVar;
        this.f5413w = drawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        switch (this.f5412s) {
            case 0:
                Drawable drawable = (Drawable) this.f5413w;
                if (!((lb) this.f5414x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.g0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.camera.q.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(17.0f) + measuredWidth, (org.telegram.messenger.g0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                ty tyVar = (ty) this.f5414x;
                int a10 = tyVar.f49920x.a(tyVar.f49919w, false);
                setTextColor(a10);
                Paint paint = (Paint) this.f5413w;
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

    public kb(ty tyVar, Context context) {
        super(context, false, true, true);
        this.f5414x = tyVar;
        this.f5413w = new Paint(1);
    }
}
