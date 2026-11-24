package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class lc1 extends u17 {
    public final byte V;
    public final KeyEvent.Callback W;

    public lc1(KeyEvent.Callback callback, Context context, long j, d dVar, ylb ylbVar, byte b) {
        super(context, j, 0L, dVar, ylbVar);
        this.V = b;
        this.W = callback;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                pc1 pc1Var = (pc1) this.W;
                Paint paint = pc1Var.e;
                RectF rectF = pc1Var.z0;
                rectF.set(rect);
                boolean g = pc1Var.g();
                wm0 wm0Var = pc1Var.U;
                if (g) {
                    pc1Var.h(wm0Var, canvas, pc1Var.z0, f, false, -pc1Var.N.getX(), -pc1Var.N.getY(), false);
                    return;
                }
                Paint c = wm0Var.c(1.0f);
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((i22) this.W).d2;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((i22) this.W).d2;
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
