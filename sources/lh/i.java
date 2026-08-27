package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.gi;

public final class i extends aa0 {
    public final int R;
    public final KeyEvent.Callback S;

    public i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, j10, 0L, n2Var, c6Var);
        this.R = i10;
        this.S = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.R) {
            case 0:
                m mVar = (m) this.S;
                Paint paint = mVar.f16336e;
                RectF rectF = mVar.f16357v0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint paintC = mVar.P.c(1.0f);
                    if (paintC != null) {
                        canvas.drawRoundRect(rectF, f10, f10, paintC);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                    }
                } else {
                    mVar.h(mVar.P, canvas, mVar.f16357v0, f10, false, -mVar.I.getX(), -mVar.I.getY(), false);
                }
                break;
            default:
                super.f(canvas, rect, f10);
                break;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gi) this.S).f28650f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
                break;
        }
    }

    @Override
    public void n(boolean z10) {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gi) this.S).f28650f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
                break;
        }
    }
}
