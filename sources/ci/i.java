package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.za0;
public final class i extends za0 {
    public final int V;
    public final KeyEvent.Callback W;

    public i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, j3, 0L, m2Var, d6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.e;
                RectF rectF = mVar.f5147z0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.T, canvas, mVar.f5147z0, f7, false, -mVar.M.getX(), -mVar.M.getY(), false);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((wi) this.W).f30017j0;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((wi) this.W).f30017j0;
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
