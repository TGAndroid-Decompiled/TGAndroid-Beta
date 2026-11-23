package hi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.us;
public final class u1 extends us {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = pc.e(8200);
    public final w1 S;

    public u1(w1 w1Var) {
        this.S = w1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.o5 o5Var, v1 v1Var, float f10) {
        if (o5Var != null) {
            o5Var.setAlpha((int) (f10 * 255.0f));
            o5Var.draw(canvas);
        } else if (v1Var.f15545f != null) {
            canvas.save();
            ImageReceiver imageReceiver = v1Var.f15545f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), v1Var.f15545f.B());
            v1Var.f15545f.setAlpha(f10);
            v1Var.f15545f.h(canvas, null);
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
                if (((v1) this.P.get(i11)).getScale() != 1.0f) {
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
                v1 v1Var = (v1) arrayList.get(i7);
                v1Var.getClass();
                org.telegram.ui.Components.o5 o5Var = v1Var.d;
                if (o5Var != null) {
                    o5Var.setColorFilter(this.S.f15652p3);
                }
                v1Var.f15547r.h(canvas, v1Var.f15546n[this.L]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.o5 o5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i7 = 0; i7 < this.P.size(); i7++) {
                v1 v1Var = (v1) this.P.get(i7);
                v1Var.getClass();
                float scale = v1Var.getScale();
                float alpha = v1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(v1Var.getPaddingLeft() + ((int) v1Var.getX()), v1Var.getPaddingTop(), (v1Var.getWidth() + ((int) v1Var.getX())) - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                org.telegram.ui.Components.o5 o5Var2 = v1Var.d;
                if (o5Var2 != null) {
                    o5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = v1Var.f15545f;
                if (imageReceiver != null) {
                    imageReceiver.A0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.f15652p3;
                if (porterDuffColorFilter != null && (o5Var = v1Var.d) != null) {
                    o5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, o5Var2, v1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, o5Var2, v1Var, alpha);
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
                org.telegram.messenger.gc gcVar = ((v1) arrayList.get(i7)).f15546n[this.L];
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
        throw new UnsupportedOperationException("Method not decompiled: hi.u1.i(long):void");
    }
}
