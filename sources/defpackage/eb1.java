package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class eb1 extends uz6 {
    public final byte V;
    public final KeyEvent.Callback W;

    public eb1(KeyEvent.Callback callback, Context context, long j, d dVar, wjb wjbVar, byte b) {
        super(context, j, 0L, dVar, wjbVar);
        this.V = b;
        this.W = callback;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                ib1 ib1Var = (ib1) this.W;
                Paint paint = ib1Var.e;
                RectF rectF = ib1Var.z0;
                rectF.set(rect);
                boolean g = ib1Var.g();
                wl0 wl0Var = ib1Var.U;
                if (g) {
                    ib1Var.h(wl0Var, canvas, ib1Var.z0, f, false, -ib1Var.N.getX(), -ib1Var.N.getY(), false);
                    return;
                }
                Paint c = wl0Var.c(1.0f);
                if (c == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f, f, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f, f, c);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f, f, paint);
                return;
            default:
                super.f(canvas, rect, f);
                return;
        }
    }

    @Override
    public final boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public final void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((x02) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void n(boolean z) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((x02) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
