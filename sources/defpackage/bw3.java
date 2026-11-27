package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class bw3 extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = i86.e(8200);
    public final dw3 S;

    public bw3(dw3 dw3Var) {
        this.S = dw3Var;
    }

    public static void m(Canvas canvas, wl wlVar, cw3 cw3Var, float f) {
        if (wlVar != null) {
            wlVar.setAlpha((int) (f * 255.0f));
            wlVar.draw(canvas);
        } else if (cw3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = cw3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), cw3Var.f.x());
            cw3Var.f.setAlpha(f);
            cw3Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        if (this.P == null) {
            return;
        }
        boolean z2 = true;
        if (!this.S.d0() && this.P.size() > 4 && this.R) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                if (((cw3) this.P.get(i3)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z2 = z;
        if (z2) {
            i(System.currentTimeMillis());
            d(canvas, f);
            k();
            return;
        }
        super.a(canvas, j, i, i2, f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                cw3 cw3Var = (cw3) arrayList.get(i);
                cw3Var.getClass();
                wl wlVar = cw3Var.d;
                if (wlVar != null) {
                    wlVar.setColorFilter(this.S.p3);
                }
                cw3Var.r.h(canvas, cw3Var.n[this.L]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        wl wlVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                cw3 cw3Var = (cw3) this.P.get(i);
                cw3Var.getClass();
                float scale = cw3Var.getScale();
                float alpha = cw3Var.getAlpha() * f;
                Rect rect = hl.Q;
                rect.set(cw3Var.getPaddingLeft() + ((int) cw3Var.getX()), cw3Var.getPaddingTop(), (cw3Var.getWidth() + ((int) cw3Var.getX())) - cw3Var.getPaddingRight(), cw3Var.getHeight() - cw3Var.getPaddingBottom());
                wl wlVar2 = cw3Var.d;
                if (wlVar2 != null) {
                    wlVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = cw3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (wlVar = cw3Var.d) != null) {
                    wlVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, wlVar2, cw3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, wlVar2, cw3Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                ln5 ln5Var = ((cw3) arrayList.get(i)).n[this.L];
                if (ln5Var != null) {
                    ln5Var.a();
                }
                i++;
            } else {
                this.S.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw3.i(long):void");
    }
}
