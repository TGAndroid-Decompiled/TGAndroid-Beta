package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class mb1 extends b27 {
    public final byte V;
    public final KeyEvent.Callback W;

    public mb1(KeyEvent.Callback callback, Context context, long j, e eVar, vnb vnbVar, byte b) {
        super(context, j, 0L, eVar, vnbVar);
        this.V = b;
        this.W = callback;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                qb1 qb1Var = (qb1) this.W;
                Paint paint = qb1Var.e;
                RectF rectF = qb1Var.z0;
                rectF.set(rect);
                boolean g = qb1Var.g();
                xl0 xl0Var = qb1Var.U;
                if (g) {
                    qb1Var.h(xl0Var, canvas, qb1Var.z0, f, false, -qb1Var.N.getX(), -qb1Var.N.getY(), false);
                    return;
                }
                Paint c = xl0Var.c(1.0f);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((n12) this.W).d2;
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
    public final void n(boolean z) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((n12) this.W).d2;
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
