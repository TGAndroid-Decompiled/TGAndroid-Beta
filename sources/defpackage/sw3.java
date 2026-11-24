package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class sw3 extends yr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = e86.e(8200);
    public final uw3 S;

    public sw3(uw3 uw3Var) {
        this.S = uw3Var;
    }

    public static void m(Canvas canvas, vm vmVar, tw3 tw3Var, float f) {
        if (vmVar != null) {
            vmVar.setAlpha((int) (f * 255.0f));
            vmVar.draw(canvas);
        } else if (tw3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = tw3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), tw3Var.f.x());
            tw3Var.f.setAlpha(f);
            tw3Var.f.h(canvas, null);
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
                if (((tw3) this.P.get(i3)).getScale() != 1.0f) {
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
                tw3 tw3Var = (tw3) arrayList.get(i);
                tw3Var.getClass();
                vm vmVar = tw3Var.d;
                if (vmVar != null) {
                    vmVar.setColorFilter(this.S.p3);
                }
                tw3Var.r.h(canvas, tw3Var.n[this.L]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        vm vmVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                tw3 tw3Var = (tw3) this.P.get(i);
                tw3Var.getClass();
                float scale = tw3Var.getScale();
                float alpha = tw3Var.getAlpha() * f;
                Rect rect = gm.Q;
                rect.set(tw3Var.getPaddingLeft() + ((int) tw3Var.getX()), tw3Var.getPaddingTop(), (tw3Var.getWidth() + ((int) tw3Var.getX())) - tw3Var.getPaddingRight(), tw3Var.getHeight() - tw3Var.getPaddingBottom());
                vm vmVar2 = tw3Var.d;
                if (vmVar2 != null) {
                    vmVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = tw3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (vmVar = tw3Var.d) != null) {
                    vmVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, vmVar2, tw3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, vmVar2, tw3Var, alpha);
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
                in5 in5Var = ((tw3) arrayList.get(i)).n[this.L];
                if (in5Var != null) {
                    in5Var.a();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw3.i(long):void");
    }
}
