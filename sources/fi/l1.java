package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.st;
public final class l1 extends st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(8200);
    public final n1 R;

    public l1(n1 n1Var) {
        this.R = n1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.t5 t5Var, m1 m1Var, float f7) {
        if (t5Var != null) {
            t5Var.setAlpha((int) (f7 * 255.0f));
            t5Var.draw(canvas);
        } else if (m1Var.f11239f != null) {
            canvas.save();
            canvas.clipRect(m1Var.f11239f.getImageX(), m1Var.f11239f.getImageY(), m1Var.f11239f.getImageX2(), m1Var.f11239f.getImageY2());
            m1Var.f11239f.setAlpha(f7);
            m1Var.f11239f.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        if (this.O == null) {
            return;
        }
        boolean z11 = true;
        if (!this.R.b0() && this.O.size() > 4 && this.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((m1) this.O.get(i12)).getScale() != 1.0f) {
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
                m1 m1Var = (m1) arrayList.get(i10);
                m1Var.getClass();
                org.telegram.ui.Components.t5 t5Var = m1Var.d;
                if (t5Var != null) {
                    t5Var.setColorFilter(this.R.f11290p3);
                }
                m1Var.f11241r.draw(canvas, m1Var.f11240n[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.t5 t5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                m1 m1Var = (m1) this.O.get(i10);
                m1Var.getClass();
                float scale = m1Var.getScale();
                float alpha = m1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft() + ((int) m1Var.getX()), m1Var.getPaddingTop(), (m1Var.getWidth() + ((int) m1Var.getX())) - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                org.telegram.ui.Components.t5 t5Var2 = m1Var.d;
                if (t5Var2 != null) {
                    t5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = m1Var.f11239f;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f11290p3;
                if (porterDuffColorFilter != null && (t5Var = m1Var.d) != null) {
                    t5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, t5Var2, m1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, t5Var2, m1Var, alpha);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m1) arrayList.get(i10)).f11240n[this.K];
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
        throw new UnsupportedOperationException("Method not decompiled: fi.l1.i(long):void");
    }
}
