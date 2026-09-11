package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.vi;
public final class i extends oa0 {
    public final int V;
    public final KeyEvent.Callback W;

    public i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, j3, 0L, n2Var, f6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.f7591e;
                RectF rectF = mVar.f7619z0;
                rectF.set(rect);
                if (mVar.g()) {
                    mVar.h(mVar.T, canvas, mVar.f7619z0, f7, false, -mVar.M.getX(), -mVar.M.getY(), false);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vi) this.W).f31291j0;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vi) this.W).f31291j0;
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
