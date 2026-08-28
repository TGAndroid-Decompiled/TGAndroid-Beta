package kh;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.vs;
public final class o1 extends vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(8200);
    public final q1 N;

    public o1(q1 q1Var) {
        this.N = q1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.k5 k5Var, p1 p1Var, float f10) {
        if (k5Var != null) {
            k5Var.setAlpha((int) (f10 * 255.0f));
            k5Var.draw(canvas);
        } else if (p1Var.f15819e != null) {
            canvas.save();
            canvas.clipRect(p1Var.f15819e.getImageX(), p1Var.f15819e.getImageY(), p1Var.f15819e.getImageX2(), p1Var.f15819e.getImageY2());
            p1Var.f15819e.setAlpha(f10);
            p1Var.f15819e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        boolean z10;
        if (this.K == null) {
            return;
        }
        f2.w0 w0Var = this.N.V;
        boolean z11 = true;
        if ((w0Var == null || !w0Var.k()) && this.K.size() > 4 && this.M) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i11 = 0; i11 < this.K.size(); i11++) {
                if (((p1) this.K.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, f10);
            k();
            return;
        }
        super.a(canvas, j10, i9, i10, f10);
    }

    @Override
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                p1 p1Var = (p1) arrayList.get(i9);
                p1Var.getClass();
                org.telegram.ui.Components.k5 k5Var = p1Var.f15818c;
                if (k5Var != null) {
                    k5Var.setColorFilter(this.N.f15856d3);
                }
                p1Var.f15821n.draw(canvas, p1Var.h[this.G]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.k5 k5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i9 = 0; i9 < this.K.size(); i9++) {
                p1 p1Var = (p1) this.K.get(i9);
                p1Var.getClass();
                float scale = p1Var.getScale();
                float alpha = p1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(p1Var.getPaddingLeft() + ((int) p1Var.getX()), p1Var.getPaddingTop(), (p1Var.getWidth() + ((int) p1Var.getX())) - p1Var.getPaddingRight(), p1Var.getHeight() - p1Var.getPaddingBottom());
                org.telegram.ui.Components.k5 k5Var2 = p1Var.f15818c;
                if (k5Var2 != null) {
                    k5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = p1Var.f15819e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.f15856d3;
                if (porterDuffColorFilter != null && (k5Var = p1Var.f15818c) != null) {
                    k5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, k5Var2, p1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, k5Var2, p1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((p1) arrayList.get(i9)).h[this.G];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i9++;
            } else {
                this.N.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: kh.o1.i(long):void");
    }
}
