package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class hv3 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = e66.e(8200);
    public final jv3 S;

    public hv3(jv3 jv3Var) {
        this.S = jv3Var;
    }

    public static void m(Canvas canvas, vl vlVar, iv3 iv3Var, float f) {
        if (vlVar != null) {
            vlVar.setAlpha((int) (f * 255.0f));
            vlVar.draw(canvas);
        } else if (iv3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = iv3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), iv3Var.f.x());
            iv3Var.f.setAlpha(f);
            iv3Var.f.h(canvas, null);
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
        if (!this.S.c0() && this.P.size() > 4 && this.R) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                if (((iv3) this.P.get(i3)).getScale() != 1.0f) {
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
                iv3 iv3Var = (iv3) arrayList.get(i);
                iv3Var.getClass();
                vl vlVar = iv3Var.d;
                if (vlVar != null) {
                    vlVar.setColorFilter(this.S.p3);
                }
                iv3Var.r.h(canvas, iv3Var.n[this.L]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        vl vlVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                iv3 iv3Var = (iv3) this.P.get(i);
                iv3Var.getClass();
                float scale = iv3Var.getScale();
                float alpha = iv3Var.getAlpha() * f;
                Rect rect = gl.Q;
                rect.set(iv3Var.getPaddingLeft() + ((int) iv3Var.getX()), iv3Var.getPaddingTop(), (iv3Var.getWidth() + ((int) iv3Var.getX())) - iv3Var.getPaddingRight(), iv3Var.getHeight() - iv3Var.getPaddingBottom());
                vl vlVar2 = iv3Var.d;
                if (vlVar2 != null) {
                    vlVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = iv3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (vlVar = iv3Var.d) != null) {
                    vlVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, vlVar2, iv3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, vlVar2, iv3Var, alpha);
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
                il5 il5Var = ((iv3) arrayList.get(i)).n[this.L];
                if (il5Var != null) {
                    il5Var.a();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv3.i(long):void");
    }
}
