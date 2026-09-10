package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.yi;
public final class k extends xa0 {
    public final int V;
    public final KeyEvent.Callback W;

    public k(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, j3, 0L, p2Var, f6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 0:
                o oVar = (o) this.W;
                Paint paint = oVar.e;
                RectF rectF = oVar.f3294z0;
                rectF.set(rect);
                if (oVar.g()) {
                    oVar.h(oVar.T, canvas, oVar.f3294z0, f7, false, -oVar.M.getX(), -oVar.M.getY(), false);
                    return;
                }
                Paint c10 = oVar.T.c(1.0f);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yi) this.W).f29378j0;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yi) this.W).f29378j0;
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
