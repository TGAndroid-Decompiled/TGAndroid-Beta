package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ti;
public final class i extends gb0 {
    public final int V;
    public final KeyEvent.Callback W;

    public i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, j10, 0L, r2Var, u6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.e;
                RectF rectF = mVar.f11225z0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.T, canvas, mVar.f11225z0, f7, false, -mVar.M.getX(), -mVar.M.getY(), false);
                    return;
                }
                Paint c10 = mVar.T.c(1.0f);
                if (c10 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f7, f7, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f7, f7, c10);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f7, f7, paint);
                return;
            default:
                super.f(canvas, rect, f7);
                return;
        }
    }

    @Override
    public boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ti) this.W).f33030j0;
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
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ti) this.W).f33030j0;
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
