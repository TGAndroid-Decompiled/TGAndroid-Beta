package di;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gt;
public final class n1 extends gt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(8200);
    public final p1 R;

    public n1(p1 p1Var) {
        this.R = p1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.q5 q5Var, o1 o1Var, float f7) {
        if (q5Var != null) {
            q5Var.setAlpha((int) (f7 * 255.0f));
            q5Var.draw(canvas);
        } else if (o1Var.f7742e != null) {
            canvas.save();
            canvas.clipRect(o1Var.f7742e.getImageX(), o1Var.f7742e.getImageY(), o1Var.f7742e.getImageX2(), o1Var.f7742e.getImageY2());
            o1Var.f7742e.setAlpha(f7);
            o1Var.f7742e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        if (this.O == null) {
            return;
        }
        s4.m0 m0Var = this.R.f1897c0;
        boolean z11 = true;
        if ((m0Var == null || !m0Var.k()) && this.O.size() > 4 && this.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((o1) this.O.get(i12)).getScale() != 1.0f) {
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
        super.a(canvas, j3, i10, i11, f7);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                o1 o1Var = (o1) arrayList.get(i10);
                o1Var.getClass();
                org.telegram.ui.Components.q5 q5Var = o1Var.f7741c;
                if (q5Var != null) {
                    q5Var.setColorFilter(this.R.f7848h3);
                }
                o1Var.f7744n.draw(canvas, o1Var.h[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.q5 q5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                o1 o1Var = (o1) this.O.get(i10);
                o1Var.getClass();
                float scale = o1Var.getScale();
                float alpha = o1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(o1Var.getPaddingLeft() + ((int) o1Var.getX()), o1Var.getPaddingTop(), (o1Var.getWidth() + ((int) o1Var.getX())) - o1Var.getPaddingRight(), o1Var.getHeight() - o1Var.getPaddingBottom());
                org.telegram.ui.Components.q5 q5Var2 = o1Var.f7741c;
                if (q5Var2 != null) {
                    q5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = o1Var.f7742e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f7848h3;
                if (porterDuffColorFilter != null && (q5Var = o1Var.f7741c) != null) {
                    q5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, q5Var2, o1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, q5Var2, o1Var, alpha);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((o1) arrayList.get(i10)).h[this.K];
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
        throw new UnsupportedOperationException("Method not decompiled: di.n1.i(long):void");
    }
}
