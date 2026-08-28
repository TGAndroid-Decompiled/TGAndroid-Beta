package f2;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ky;
public abstract class d0 {
    public static final c0 f5339b = new c0(0);
    public static final c0 f5340c = new c0(1);
    public int f5341a = -1;

    public static int c(int i9, int i10) {
        int i11;
        int i12 = i9 & 789516;
        if (i12 == 0) {
            return i9;
        }
        int i13 = i9 & (~i12);
        if (i10 == 0) {
            i11 = i12 << 2;
        } else {
            int i14 = i12 << 1;
            i13 |= (-789517) & i14;
            i11 = (i14 & 789516) << 2;
        }
        return i13 | i11;
    }

    public static int l(int i9, int i10) {
        int i11 = i10 | i9;
        return (i9 << 16) | (i10 << 8) | i11;
    }

    public void a(RecyclerView recyclerView, q1 q1Var) {
        View view = q1Var.f5501a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.j0.f46915a;
            r0.b0.i(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i9, int i10) {
        int i11;
        int i12 = i9 & 3158064;
        if (i12 == 0) {
            return i9;
        }
        int i13 = i9 & (~i12);
        if (i10 == 0) {
            i11 = i12 >> 2;
        } else {
            int i14 = i12 >> 1;
            i13 |= (-3158065) & i14;
            i11 = (i14 & 3158064) >> 2;
        }
        return i13 | i11;
    }

    public long d(RecyclerView recyclerView, int i9, float f10, float f11) {
        w0 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i9 == 8) {
                return 200L;
            }
            return 250L;
        } else if (i9 == 8) {
            return itemAnimator.j();
        } else {
            return itemAnimator.d;
        }
    }

    public abstract int e(RecyclerView recyclerView, q1 q1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i9, int i10, long j10) {
        if (this.f5341a == -1) {
            this.f5341a = AndroidUtilities.dp(20.0f);
        }
        int i11 = this.f5341a;
        float f10 = 1.0f;
        int interpolation = (int) (f5340c.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i9)) * ((int) Math.signum(i10)) * i11);
        if (j10 <= 500) {
            f10 = ((float) j10) / 500.0f;
        }
        int interpolation2 = (int) (f5339b.getInterpolation(f10) * interpolation);
        if (interpolation2 == 0) {
            if (i10 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public boolean j() {
        return true;
    }

    public boolean k() {
        return !(this instanceof ky);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, q1 q1Var, float f10, float f11, int i9, boolean z10) {
        View view = q1Var.f5501a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.j0.f46915a;
            Float valueOf = Float.valueOf(r0.b0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.j0.f46915a;
                    float e10 = r0.b0.e(childAt);
                    if (e10 > f12) {
                        f12 = e10;
                    }
                }
            }
            r0.b0.i(view, f12 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public abstract boolean n(RecyclerView recyclerView, q1 q1Var, q1 q1Var2);

    public void o(RecyclerView recyclerView, q1 q1Var, q1 q1Var2, int i9, int i10, int i11) {
        View view = q1Var2.f5501a;
        z0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof m0) {
            ((m0) layoutManager).b1(q1Var.f5501a, view, i10, i11);
            return;
        }
        if (layoutManager.d()) {
            if (z0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i9);
            }
            if (z0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i9);
            }
        }
        if (layoutManager.e()) {
            if (z0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i9);
            }
            if (z0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i9);
            }
        }
    }

    public abstract void q(q1 q1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(q1 q1Var, int i9) {
    }
}
