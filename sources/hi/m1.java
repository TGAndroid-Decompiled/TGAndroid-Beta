package hi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.xs;
public final class m1 extends xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = pc.e(8200);
    public final o1 S;

    public m1(o1 o1Var) {
        this.S = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, n1 n1Var, float f10) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f10 * 255.0f));
            p5Var.draw(canvas);
        } else if (n1Var.f15065f != null) {
            canvas.save();
            ImageReceiver imageReceiver = n1Var.f15065f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), n1Var.f15065f.A());
            n1Var.f15065f.setAlpha(f10);
            n1Var.f15065f.h(canvas, null);
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
                if (((n1) this.P.get(i11)).getScale() != 1.0f) {
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
                n1 n1Var = (n1) arrayList.get(i7);
                n1Var.getClass();
                org.telegram.ui.Components.p5 p5Var = n1Var.d;
                if (p5Var != null) {
                    p5Var.setColorFilter(this.S.f15195p3);
                }
                n1Var.f15067r.h(canvas, n1Var.f15066n[this.L]);
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
                n1 n1Var = (n1) this.P.get(i7);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = n1Var.d;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.f15065f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.f15195p3;
                if (porterDuffColorFilter != null && (p5Var = n1Var.d) != null) {
                    p5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, p5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, p5Var2, n1Var, alpha);
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
                gc gcVar = ((n1) arrayList.get(i7)).f15066n[this.L];
                if (gcVar != null) {
                    gcVar.a();
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
        throw new UnsupportedOperationException("Method not decompiled: hi.m1.i(long):void");
    }
}
