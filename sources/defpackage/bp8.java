package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;
public final class bp8 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public yo8 b;
    public yo8 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public bp8(ProfileActivity profileActivity, yo8 yo8Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = yo8Var;
    }

    public final boolean a() {
        yo8 yo8Var = this.b;
        if (!yo8Var.b || this.h < 1.0f) {
            return false;
        }
        if (yo8Var.c.y() != null) {
            this.b.c.y().I(0, false, false);
            this.b.c.y().C(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(yo8 yo8Var) {
        if (this.b != yo8Var && yo8Var != null) {
            ArrayList arrayList = yo8Var.e;
            if (this.r) {
                this.c = yo8Var;
                return;
            }
            if (this.f) {
                for (int i = 0; i < this.b.e.size(); i++) {
                    ((ap8) this.b.e.get(i)).p0(null);
                }
                this.f = false;
            }
            yo8 yo8Var2 = this.b;
            ArrayList arrayList2 = yo8Var2.j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && yo8Var2.i) {
                yo8Var2.b(true);
                yo8Var2.i = false;
            }
            this.b = yo8Var;
            if (!this.f) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((ap8) arrayList.get(i2)).p0(this);
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
                ((ap8) this.b.e.get(i)).p0(null);
            }
            this.f = false;
        }
        yo8 yo8Var = this.b;
        ArrayList arrayList = yo8Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && yo8Var.i) {
            yo8Var.b(true);
            yo8Var.i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z = true;
            if (!this.f) {
                for (int i = 0; i < this.b.e.size(); i++) {
                    ((ap8) this.b.e.get(i)).p0(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new w88(this, (byte) 25));
                }
            }
            if (!this.r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.n = currentTimeMillis;
            ProfileActivity profileActivity = this.a;
            om8 om8Var = profileActivity.a;
            int i2 = profileActivity.V2;
            PointF pointF = this.d;
            float f = 2.0f;
            if (i2 >= 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= om8Var.getChildCount()) {
                        break;
                    }
                    View childAt = om8Var.getChildAt(i3);
                    if (i2 == RecyclerView.R(childAt) && (childAt instanceof ghb)) {
                        wla wlaVar = ((ghb) childAt).a;
                        pointF.set(wlaVar.getX() + childAt.getX() + om8Var.getX() + gl.L(12.0f), (wlaVar.getMeasuredHeight() / 2.0f) + wlaVar.getY() + childAt.getY() + om8Var.getY());
                        break;
                    }
                    i3++;
                }
            }
            float f2 = zu3.f();
            this.b.c.i0((getWidth() - gl.L(f2)) / 2.0f, Math.max(0.0f, pointF.y - (gl.L(f2) * 0.5f)), gl.L(f2), gl.L(f2));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            yo8 yo8Var = null;
            this.b.c.h(canvas, null);
            this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = gl.L(110.0f);
            int size = this.b.d.size() - 1;
            while (size >= 0) {
                ap8 ap8Var = (ap8) this.b.d.get(size);
                float f3 = size;
                float s2 = gl.s(this.h, f3, this.b.d.size(), 1.8f);
                float f4 = L;
                boolean z2 = z;
                float f5 = f4 * 0.88f;
                float b = b00.b(f5, this.b.d.size() - 1, getWidth(), f);
                float f6 = pointF.x;
                float f7 = f;
                float f8 = pointF.y;
                float f9 = ((b - f6) * s2) + (f5 * f3) + f6;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = s33.h.getInterpolation(Utilities.i(s2 / 0.4f, 1.0f, 0.0f));
                float f10 = (f4 / f7) * interpolation;
                float f11 = f4 * interpolation;
                ap8Var.i0(f9 - f10, (f8 - ((f8 + f4) * ((float) Math.pow(d, 2.0d)))) - f10, f11, f11);
                ap8Var.h(canvas, null);
                size--;
                yo8Var = null;
                pointF = pointF2;
                z = z2;
                f = f7;
            }
            yo8 yo8Var2 = yo8Var;
            if (this.h >= 1.0f) {
                this.r = false;
                b(this.c);
                this.c = yo8Var2;
                return;
            }
            invalidate();
        }
    }
}
