package gi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bc;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.is;
public final class k1 extends is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = lc.e(8200);
    public final m1 S;

    public k1(m1 m1Var) {
        this.S = m1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.g5 g5Var, l1 l1Var, float f10) {
        if (g5Var != null) {
            g5Var.setAlpha((int) (f10 * 255.0f));
            g5Var.draw(canvas);
        } else if (l1Var.f13072f != null) {
            canvas.save();
            ImageReceiver imageReceiver = l1Var.f13072f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), l1Var.f13072f.A());
            l1Var.f13072f.setAlpha(f10);
            l1Var.f13072f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
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
                if (((l1) this.P.get(i11)).getScale() != 1.0f) {
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
        super.a(canvas, j10, i3, i10, f10);
    }

    @Override
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                l1 l1Var = (l1) arrayList.get(i3);
                l1Var.getClass();
                org.telegram.ui.Components.g5 g5Var = l1Var.d;
                if (g5Var != null) {
                    g5Var.setColorFilter(this.S.f13191p3);
                }
                l1Var.f13074r.h(canvas, l1Var.f13073n[this.L]);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.g5 g5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                l1 l1Var = (l1) this.P.get(i3);
                l1Var.getClass();
                float scale = l1Var.getScale();
                float alpha = l1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft() + ((int) l1Var.getX()), l1Var.getPaddingTop(), (l1Var.getWidth() + ((int) l1Var.getX())) - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                org.telegram.ui.Components.g5 g5Var2 = l1Var.d;
                if (g5Var2 != null) {
                    g5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = l1Var.f13072f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.f13191p3;
                if (porterDuffColorFilter != null && (g5Var = l1Var.d) != null) {
                    g5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, g5Var2, l1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, g5Var2, l1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                bc bcVar = ((l1) arrayList.get(i3)).f13073n[this.L];
                if (bcVar != null) {
                    bcVar.a();
                }
                i3++;
            } else {
                this.S.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: gi.k1.i(long):void");
    }
}
