package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ni;
public final class i extends ka0 {
    public final int R;
    public final KeyEvent.Callback S;

    public i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, j10, 0L, o2Var, c6Var);
        this.R = i10;
        this.S = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f9) {
        switch (this.R) {
            case 0:
                m mVar = (m) this.S;
                Paint paint = mVar.f18074e;
                RectF rectF = mVar.f18095v0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.P, canvas, mVar.f18095v0, f9, false, -mVar.I.getX(), -mVar.I.getY(), false);
                    return;
                }
                Paint c3 = mVar.P.c(1.0f);
                if (c3 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f9, f9, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f9, f9, c3);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f9, f9, paint);
                return;
            default:
                super.f(canvas, rect, f9);
                return;
        }
    }

    @Override
    public boolean h() {
        switch (this.R) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public void i() {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ni) this.S).f31005f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void n(boolean z10) {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ni) this.S).f31005f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
