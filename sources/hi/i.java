package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.t90;
public final class i extends t90 {
    public final int W;
    public final KeyEvent.Callback f14742a0;

    public i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, j3, 0L, h2Var, i6Var);
        this.W = i7;
        this.f14742a0 = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                n nVar = (n) this.f14742a0;
                Paint paint = nVar.f15049e;
                RectF rectF = nVar.f15077z0;
                rectF.set(rect);
                if (nVar.g()) {
                    nVar.h(nVar.U, canvas, nVar.f15077z0, f10, false, -nVar.N.getX(), -nVar.N.getY(), false);
                    return;
                }
                Paint c10 = nVar.U.c(1.0f);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((si) this.f14742a0).f39670e2;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((si) this.f14742a0).f39670e2;
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
