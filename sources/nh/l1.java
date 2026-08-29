package nh;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.at;
public final class l1 extends at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(8200);
    public final n1 N;

    public l1(n1 n1Var) {
        this.N = n1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, m1 m1Var, float f9) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f9 * 255.0f));
            p5Var.draw(canvas);
        } else if (m1Var.f18117e != null) {
            canvas.save();
            canvas.clipRect(m1Var.f18117e.getImageX(), m1Var.f18117e.getImageY(), m1Var.f18117e.getImageX2(), m1Var.f18117e.getImageY2());
            m1Var.f18117e.setAlpha(f9);
            m1Var.f18117e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        boolean z10;
        if (this.K == null) {
            return;
        }
        f2.u0 u0Var = this.N.V;
        boolean z11 = true;
        if ((u0Var == null || !u0Var.k()) && this.K.size() > 4 && this.M) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                if (((m1) this.K.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, f9);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, f9);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i10);
                m1Var.getClass();
                org.telegram.ui.Components.p5 p5Var = m1Var.f18116c;
                if (p5Var != null) {
                    p5Var.setColorFilter(this.N.f18165d3);
                }
                m1Var.f18119n.draw(canvas, m1Var.h[this.G]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f9) {
        org.telegram.ui.Components.p5 p5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                m1 m1Var = (m1) this.K.get(i10);
                m1Var.getClass();
                float scale = m1Var.getScale();
                float alpha = m1Var.getAlpha() * f9;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft() + ((int) m1Var.getX()), m1Var.getPaddingTop(), (m1Var.getWidth() + ((int) m1Var.getX())) - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = m1Var.f18116c;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = m1Var.f18117e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.f18165d3;
                if (porterDuffColorFilter != null && (p5Var = m1Var.f18116c) != null) {
                    p5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, p5Var2, m1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, p5Var2, m1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m1) arrayList.get(i10)).h[this.G];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.N.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: nh.l1.i(long):void");
    }
}
