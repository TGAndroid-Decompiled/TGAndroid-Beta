package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c90;
public final class i extends c90 {
    public final int W;
    public final KeyEvent.Callback f12932a0;

    public i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, j10, 0L, d2Var, e6Var);
        this.W = i3;
        this.f12932a0 = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                m mVar = (m) this.f12932a0;
                Paint paint = mVar.f13142e;
                RectF rectF = mVar.f13170z0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.U, canvas, mVar.f13170z0, f10, false, -mVar.N.getX(), -mVar.N.getY(), false);
                    return;
                }
                Paint c2 = mVar.U.c(1.0f);
                if (c2 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f10, f10, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f10, f10, c2);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.f12932a0).f32215b2;
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
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.f12932a0).f32215b2;
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
