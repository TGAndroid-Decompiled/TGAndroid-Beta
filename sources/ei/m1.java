package ei;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.qt;
public final class m1 extends qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(8200);
    public final o1 R;

    public m1(o1 o1Var) {
        this.R = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.r5 r5Var, n1 n1Var, float f7) {
        if (r5Var != null) {
            r5Var.setAlpha((int) (f7 * 255.0f));
            r5Var.draw(canvas);
        } else if (n1Var.e != null) {
            canvas.save();
            canvas.clipRect(n1Var.e.getImageX(), n1Var.e.getImageY(), n1Var.e.getImageX2(), n1Var.e.getImageY2());
            n1Var.e.setAlpha(f7);
            n1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        if (this.O == null) {
            return;
        }
        s4.l0 l0Var = this.R.f3609c0;
        boolean z11 = true;
        if ((l0Var == null || !l0Var.k()) && this.O.size() > 4 && this.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((n1) this.O.get(i12)).getScale() != 1.0f) {
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
        super.a(canvas, j10, i10, i11, f7);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                n1 n1Var = (n1) arrayList.get(i10);
                n1Var.getClass();
                org.telegram.ui.Components.r5 r5Var = n1Var.f9496c;
                if (r5Var != null) {
                    r5Var.setColorFilter(this.R.f9546f3);
                }
                n1Var.f9498n.draw(canvas, n1Var.h[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.r5 r5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                n1 n1Var = (n1) this.O.get(i10);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.r5 r5Var2 = n1Var.f9496c;
                if (r5Var2 != null) {
                    r5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f9546f3;
                if (porterDuffColorFilter != null && (r5Var = n1Var.f9496c) != null) {
                    r5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, r5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, r5Var2, n1Var, alpha);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((n1) arrayList.get(i10)).h[this.K];
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
        throw new UnsupportedOperationException("Method not decompiled: ei.m1.i(long):void");
    }
}
