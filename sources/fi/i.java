package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.g90;
public final class i extends g90 {
    public final int V;
    public final KeyEvent.Callback W;

    public i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, j3, 0L, f2Var, f6Var);
        this.V = i7;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.f12363e;
                RectF rectF = mVar.f12390y0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.T, canvas, mVar.f12390y0, f10, false, -mVar.M.getX(), -mVar.M.getY(), false);
                    return;
                }
                Paint c10 = mVar.T.c(1.0f);
                if (c10 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f10, f10, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f10, f10, c10);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f10, f10, paint);
                return;
            default:
                super.f(canvas, rect, f10);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((di) this.W).f32895a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void n(boolean z9) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((di) this.W).f32895a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
