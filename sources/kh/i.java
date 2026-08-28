package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.w90;
public final class i extends w90 {
    public final int R;
    public final KeyEvent.Callback S;

    public i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, j10, 0L, o2Var, b6Var);
        this.R = i9;
        this.S = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.R) {
            case 0:
                m mVar = (m) this.S;
                Paint paint = mVar.f15630e;
                RectF rectF = mVar.f15651v0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.P, canvas, mVar.f15651v0, f10, false, -mVar.I.getX(), -mVar.I.getY(), false);
                    return;
                }
                Paint c10 = mVar.P.c(1.0f);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.S).f30114f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.S).f30114f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
