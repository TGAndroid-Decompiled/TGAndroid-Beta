package bi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.nt;
public final class u1 extends nt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(8200);
    public final w1 R;

    public u1(w1 w1Var) {
        this.R = w1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, v1 v1Var, float f7) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f7 * 255.0f));
            p5Var.draw(canvas);
        } else if (v1Var.e != null) {
            canvas.save();
            canvas.clipRect(v1Var.e.getImageX(), v1Var.e.getImageY(), v1Var.e.getImageX2(), v1Var.e.getImageY2());
            v1Var.e.setAlpha(f7);
            v1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        if (this.O == null) {
            return;
        }
        s4.m0 m0Var = this.R.f1535c0;
        boolean z11 = true;
        if ((m0Var == null || !m0Var.k()) && this.O.size() > 4 && this.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((v1) this.O.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, f7);
            k();
            return;
        }
        super.a(canvas, j3, i10, i11, f7);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                v1 v1Var = (v1) arrayList.get(i10);
                v1Var.getClass();
                org.telegram.ui.Components.p5 p5Var = v1Var.f3777c;
                if (p5Var != null) {
                    p5Var.setColorFilter(this.R.f3823h3);
                }
                v1Var.f3779n.draw(canvas, v1Var.h[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.p5 p5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                v1 v1Var = (v1) this.O.get(i10);
                v1Var.getClass();
                float scale = v1Var.getScale();
                float alpha = v1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(v1Var.getPaddingLeft() + ((int) v1Var.getX()), v1Var.getPaddingTop(), (v1Var.getWidth() + ((int) v1Var.getX())) - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = v1Var.f3777c;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = v1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f3823h3;
                if (porterDuffColorFilter != null && (p5Var = v1Var.f3777c) != null) {
                    p5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, p5Var2, v1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, p5Var2, v1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((v1) arrayList.get(i10)).h[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.R.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.u1.i(long):void");
    }
}
