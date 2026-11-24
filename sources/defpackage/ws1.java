package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MediaController;
public final class ws1 implements nc8, kj1 {
    public final yv1 a;

    public ws1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final TextureView J() {
        return this.a.M8;
    }

    @Override
    public final void L(k47 k47Var) {
        yv1 yv1Var;
        Bitmap bitmap;
        if (k47Var == null) {
            return;
        }
        if (MediaController.w().D(k47Var)) {
            int i = 0;
            while (true) {
                int childCount = this.a.A0.getChildCount();
                yv1Var = this.a;
                if (i >= childCount) {
                    break;
                }
                if (yv1Var.A0.getChildAt(i) instanceof rc2) {
                    rc2 rc2Var = (rc2) this.a.A0.getChildAt(i);
                    if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().e1() == k47Var.e1()) {
                        kn m = rc2Var.getPhotoImage().m();
                        if (m.c0) {
                            m.stop();
                        }
                        Bitmap m2 = m.m();
                        if (m2 != null) {
                            try {
                                vs1 vs1Var = this.a.Ta;
                                int width = m2.getWidth();
                                int height = m2.getHeight();
                                x78 x78Var = vs1Var.d;
                                if (x78Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ((TextureView) x78Var.d).getBitmap(width, height);
                                }
                                new Canvas(m2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                fc4.g(th, true);
                            }
                        }
                    }
                }
                i++;
            }
            yv1Var.e6(true);
            MediaController w = MediaController.w();
            yv1 yv1Var2 = this.a;
            w.o0(yv1Var2.M8, yv1Var2.L8, yv1Var2.J8, true);
        }
        this.a.A0.invalidate();
    }

    @Override
    public final void d0(boolean z) {
        va2 va2Var = this.a.U;
        va2Var.e = !z;
        va2Var.invalidate();
    }

    @Override
    public final void l0(RectF rectF) {
        rectF.set(this.a.U.n.S.m);
    }

    @Override
    public final void p(k47 k47Var) {
        yv1 yv1Var = this.a;
        yv1Var.A0.J0(true);
        yv1Var.A0.D0();
        if (MediaController.w().D(k47Var)) {
            yv1Var.m1.removeView(yv1Var.J8);
            yv1Var.J8 = null;
            yv1Var.M8 = null;
            yv1Var.L8 = null;
        }
        for (int i = 0; i < yv1Var.A0.getChildCount(); i++) {
            if (yv1Var.A0.getChildAt(i) instanceof rc2) {
                rc2 rc2Var = (rc2) yv1Var.A0.getChildAt(i);
                if (rc2Var.getMessageObject() != null && rc2Var.getMessageObject().e1() == k47Var.e1()) {
                    rc2Var.getPhotoImage().v0(false, true);
                }
            }
        }
    }

    @Override
    public final View v0() {
        return this.a.U;
    }
}
