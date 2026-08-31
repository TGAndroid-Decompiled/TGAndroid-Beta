package f2;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.wy;
public abstract class b0 {
    public static final a0 f5732b = new a0(0);
    public static final a0 f5733c = new a0(1);
    public int f5734a = -1;

    public static int c(int i10, int i11) {
        int i12;
        int i13 = i10 & 789516;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 << 2;
        } else {
            int i15 = i13 << 1;
            i14 |= (-789517) & i15;
            i12 = (i15 & 789516) << 2;
        }
        return i14 | i12;
    }

    public static int l(int i10, int i11) {
        int i12 = i11 | i10;
        return (i10 << 16) | (i11 << 8) | i12;
    }

    public void a(RecyclerView recyclerView, m1 m1Var) {
        View view = m1Var.f5875a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.j0.f46438a;
            r0.b0.i(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i10, int i11) {
        int i12;
        int i13 = i10 & 3158064;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 >> 2;
        } else {
            int i15 = i13 >> 1;
            i14 |= (-3158065) & i15;
            i12 = (i15 & 3158064) >> 2;
        }
        return i14 | i12;
    }

    public long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        u0 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i10 == 8) {
                return 200L;
            }
            return 250L;
        } else if (i10 == 8) {
            return itemAnimator.j();
        } else {
            return itemAnimator.d;
        }
    }

    public abstract int e(RecyclerView recyclerView, m1 m1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i10, int i11, long j10) {
        if (this.f5734a == -1) {
            this.f5734a = AndroidUtilities.dp(20.0f);
        }
        int i12 = this.f5734a;
        float f10 = 1.0f;
        int interpolation = (int) (f5733c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
        if (j10 <= 500) {
            f10 = ((float) j10) / 500.0f;
        }
        int interpolation2 = (int) (f5732b.getInterpolation(f10) * interpolation);
        if (interpolation2 == 0) {
            if (i11 <= 0) {
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
        return !(this instanceof wy);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, m1 m1Var, float f10, float f11, int i10, boolean z4) {
        View view = m1Var.f5875a;
        if (z4 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.j0.f46438a;
            Float valueOf = Float.valueOf(r0.b0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.j0.f46438a;
                    float e6 = r0.b0.e(childAt);
                    if (e6 > f12) {
                        f12 = e6;
                    }
                }
            }
            r0.b0.i(view, f12 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public abstract boolean n(RecyclerView recyclerView, m1 m1Var, m1 m1Var2);

    public void o(RecyclerView recyclerView, m1 m1Var, m1 m1Var2, int i10, int i11, int i12) {
        View view = m1Var2.f5875a;
        w0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof j0) {
            ((j0) layoutManager).b1(m1Var.f5875a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (w0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i10);
            }
            if (w0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i10);
            }
        }
        if (layoutManager.e()) {
            if (w0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i10);
            }
            if (w0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i10);
            }
        }
    }

    public abstract void q(m1 m1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(m1 m1Var, int i10) {
    }
}
