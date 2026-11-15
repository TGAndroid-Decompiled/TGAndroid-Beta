package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ki;
public final class i extends i90 {
    public final int W;
    public final KeyEvent.Callback f14393a0;

    public i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, j3, 0L, e2Var, e6Var);
        this.W = i7;
        this.f14393a0 = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                m mVar = (m) this.f14393a0;
                Paint paint = mVar.f14621e;
                RectF rectF = mVar.f14649z0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.U, canvas, mVar.f14649z0, f10, false, -mVar.N.getX(), -mVar.N.getY(), false);
                    return;
                }
                Paint c10 = mVar.U.c(1.0f);
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
        switch (this.W) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public void i() {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.f14393a0).f36447e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.f14393a0).f36447e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
