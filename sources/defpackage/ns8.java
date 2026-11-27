package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;
public final class ns8 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public ks8 b;
    public ks8 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public ns8(ProfileActivity profileActivity, ks8 ks8Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = ks8Var;
    }

    public final boolean a() {
        ks8 ks8Var = this.b;
        if (!ks8Var.b || this.h < 1.0f) {
            return false;
        }
        if (ks8Var.c.y() != null) {
            this.b.c.y().I(0, false, false);
            this.b.c.y().C(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ks8 ks8Var) {
        if (this.b != ks8Var && ks8Var != null) {
            ArrayList arrayList = ks8Var.e;
            if (this.r) {
                this.c = ks8Var;
                return;
            }
            if (this.f) {
                for (int i = 0; i < this.b.e.size(); i++) {
                    ((ms8) this.b.e.get(i)).p0(null);
                }
                this.f = false;
            }
            ks8 ks8Var2 = this.b;
            ArrayList arrayList2 = ks8Var2.j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && ks8Var2.i) {
                ks8Var2.b(true);
                ks8Var2.i = false;
            }
            this.b = ks8Var;
            if (!this.f) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((ms8) arrayList.get(i2)).p0(this);
                }
                this.f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f) {
            for (int i = 0; i < this.b.e.size(); i++) {
                ((ms8) this.b.e.get(i)).p0(null);
            }
            this.f = false;
        }
        ks8 ks8Var = this.b;
        ArrayList arrayList = ks8Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ks8Var.i) {
            ks8Var.b(true);
            ks8Var.i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z = true;
            if (!this.f) {
                for (int i = 0; i < this.b.e.size(); i++) {
                    ((ms8) this.b.e.get(i)).p0(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new uk8(this, (byte) 11));
                }
            }
            if (!this.r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.n = currentTimeMillis;
            ProfileActivity profileActivity = this.a;
            zp8 zp8Var = profileActivity.a;
            int i2 = profileActivity.V2;
            PointF pointF = this.d;
            float f = 2.0f;
            if (i2 >= 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= zp8Var.getChildCount()) {
                        break;
                    }
                    View childAt = zp8Var.getChildAt(i3);
                    if (i2 == RecyclerView.S(childAt) && (childAt instanceof clb)) {
                        tpa tpaVar = ((clb) childAt).a;
                        pointF.set(tpaVar.getX() + childAt.getX() + zp8Var.getX() + hl.L(12.0f), (tpaVar.getMeasuredHeight() / 2.0f) + tpaVar.getY() + childAt.getY() + zp8Var.getY());
                        break;
                    }
                    i3++;
                }
            }
            float f2 = tv3.f();
            this.b.c.i0((getWidth() - hl.L(f2)) / 2.0f, Math.max(0.0f, pointF.y - (hl.L(f2) * 0.5f)), hl.L(f2), hl.L(f2));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            ks8 ks8Var = null;
            this.b.c.h(canvas, null);
            this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = hl.L(110.0f);
            int size = this.b.d.size() - 1;
            while (size >= 0) {
                ms8 ms8Var = (ms8) this.b.d.get(size);
                float f3 = size;
                float s2 = hl.s(this.h, f3, this.b.d.size(), 1.8f);
                float f4 = L;
                boolean z2 = z;
                float f5 = f4 * 0.88f;
                float c = c00.c(f5, this.b.d.size() - 1, getWidth(), f);
                float f6 = pointF.x;
                float f7 = f;
                float f8 = pointF.y;
                float f9 = ((c - f6) * s2) + (f5 * f3) + f6;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = k43.h.getInterpolation(Utilities.i(s2 / 0.4f, 1.0f, 0.0f));
                float f10 = (f4 / f7) * interpolation;
                float f11 = f4 * interpolation;
                ms8Var.i0(f9 - f10, (f8 - ((f8 + f4) * ((float) Math.pow(d, 2.0d)))) - f10, f11, f11);
                ms8Var.h(canvas, null);
                size--;
                ks8Var = null;
                pointF = pointF2;
                z = z2;
                f = f7;
            }
            ks8 ks8Var2 = ks8Var;
            if (this.h >= 1.0f) {
                this.r = false;
                b(this.c);
                this.c = ks8Var2;
                return;
            }
            invalidate();
        }
    }
}
