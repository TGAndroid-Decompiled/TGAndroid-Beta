package hi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.xs;
public final class l1 extends xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = qc.e(8200);
    public final n1 S;

    public l1(n1 n1Var) {
        this.S = n1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, m1 m1Var, float f10) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f10 * 255.0f));
            p5Var.draw(canvas);
        } else if (m1Var.f15005f != null) {
            canvas.save();
            ImageReceiver imageReceiver = m1Var.f15005f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), m1Var.f15005f.A());
            m1Var.f15005f.setAlpha(f10);
            m1Var.f15005f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        if (this.P == null) {
            return;
        }
        boolean z11 = true;
        if (!this.S.b0() && this.P.size() > 4 && this.R) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i11 = 0; i11 < this.P.size(); i11++) {
                if (((m1) this.P.get(i11)).getScale() != 1.0f) {
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
        super.a(canvas, j3, i7, i10, f10);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i7);
                m1Var.getClass();
                org.telegram.ui.Components.p5 p5Var = m1Var.d;
                if (p5Var != null) {
                    p5Var.setColorFilter(this.S.f15048p3);
                }
                m1Var.f15007r.h(canvas, m1Var.f15006n[this.L]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.p5 p5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i7 = 0; i7 < this.P.size(); i7++) {
                m1 m1Var = (m1) this.P.get(i7);
                m1Var.getClass();
                float scale = m1Var.getScale();
                float alpha = m1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(m1Var.getPaddingLeft() + ((int) m1Var.getX()), m1Var.getPaddingTop(), (m1Var.getWidth() + ((int) m1Var.getX())) - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = m1Var.d;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = m1Var.f15005f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.f15048p3;
                if (porterDuffColorFilter != null && (p5Var = m1Var.d) != null) {
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                hc hcVar = ((m1) arrayList.get(i7)).f15006n[this.L];
                if (hcVar != null) {
                    hcVar.a();
                }
                i7++;
            } else {
                this.S.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l1.i(long):void");
    }
}
