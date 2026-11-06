package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.is;
public final class k1 extends is {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = rc.e(8200);
    public final m1 R;

    public k1(m1 m1Var) {
        this.R = m1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.i5 i5Var, l1 l1Var, float f10) {
        if (i5Var != null) {
            i5Var.setAlpha((int) (f10 * 255.0f));
            i5Var.draw(canvas);
        } else if (l1Var.f12306f != null) {
            canvas.save();
            ImageReceiver imageReceiver = l1Var.f12306f;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), l1Var.f12306f.A());
            l1Var.f12306f.setAlpha(f10);
            l1Var.f12306f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z9;
        if (this.O == null) {
            return;
        }
        boolean z10 = true;
        if (!this.R.b0() && this.O.size() > 4 && this.Q) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                if (((l1) this.O.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z9;
        if (z10) {
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
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                l1 l1Var = (l1) arrayList.get(i7);
                l1Var.getClass();
                org.telegram.ui.Components.i5 i5Var = l1Var.d;
                if (i5Var != null) {
                    i5Var.setColorFilter(this.R.f12412o3);
                }
                l1Var.f12308r.h(canvas, l1Var.f12307n[this.K]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.i5 i5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                l1 l1Var = (l1) this.O.get(i7);
                l1Var.getClass();
                float scale = l1Var.getScale();
                float alpha = l1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft() + ((int) l1Var.getX()), l1Var.getPaddingTop(), (l1Var.getWidth() + ((int) l1Var.getX())) - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                org.telegram.ui.Components.i5 i5Var2 = l1Var.d;
                if (i5Var2 != null) {
                    i5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = l1Var.f12306f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f12412o3;
                if (porterDuffColorFilter != null && (i5Var = l1Var.d) != null) {
                    i5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, i5Var2, l1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, i5Var2, l1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                ic icVar = ((l1) arrayList.get(i7)).f12307n[this.K];
                if (icVar != null) {
                    icVar.a();
                }
                i7++;
            } else {
                this.R.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.k1.i(long):void");
    }
}
