package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public abstract class iu5 {
    public static final if3 c = new if3((byte) 1);
    public static final if3 d = new if3((byte) 2);
    public final byte a;
    public int b;

    public iu5() {
        this.a = (byte) 0;
        this.b = -1;
    }

    public static int c(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 << 1;
            i4 |= (-789517) & i5;
            i3 = i5 & 789516;
        }
        return i4 | (i3 << 2);
    }

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int m(int i, int i2) {
        return i2 | i | (i2 << 8) | (i << 16);
    }

    public static void t(StringBuilder sb) {
        sb.delete(0, sb.length());
    }

    public void a(RecyclerView recyclerView, f89 f89Var) {
        View view = f89Var.a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = ihc.a;
            ahc.h(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 >> 1;
            i4 |= (-3158065) & i5;
            i3 = i5 & 3158064;
        }
        return i4 | (i3 >> 2);
    }

    public long d(RecyclerView recyclerView, int i, float f, float f2) {
        o79 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i == 8) {
                return 200L;
            }
            return 250L;
        } else if (i == 8) {
            return itemAnimator.j();
        } else {
            return itemAnimator.d;
        }
    }

    public int f(RecyclerView recyclerView, f89 f89Var) {
        if (f89Var.f != 3) {
            return m(0, 0);
        }
        return m(3, 0);
    }

    public float h() {
        return 0.5f;
    }

    public final int j(int i, int i2, long j) {
        int i3 = this.b;
        if (i3 == -1) {
            i3 = hl.L(20.0f);
            this.b = i3;
        }
        float f = 1.0f;
        int interpolation = (int) (d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * i3);
        if (j <= 500) {
            f = ((float) j) / 500.0f;
        }
        int interpolation2 = (int) (c.getInterpolation(f) * interpolation);
        if (interpolation2 == 0) {
            if (i2 <= 0) {
                return -1;
            }
            return 1;
        }
        return interpolation2;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return !(this instanceof pu3);
    }

    public void n(Canvas canvas, RecyclerView recyclerView, f89 f89Var, float f, float f2, int i, boolean z) {
        View view = f89Var.a;
        if (z && view.getTag() == null) {
            WeakHashMap weakHashMap = ihc.a;
            Float valueOf = Float.valueOf(ahc.e(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = ihc.a;
                    float e = ahc.e(childAt);
                    if (e > f3) {
                        f3 = e;
                    }
                }
            }
            ahc.h(view, f3 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2);

    public void p(RecyclerView recyclerView, f89 f89Var, f89 f89Var2, int i, int i2, int i3) {
        View view = f89Var2.a;
        q79 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof x46) {
            ((x46) layoutManager).a1(f89Var.a, view, i2, i3);
            return;
        }
        if (layoutManager.d()) {
            if (q79.w(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.x0(i);
            }
            if (q79.x(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.x0(i);
            }
        }
        if (layoutManager.e()) {
            if (q79.y(view) <= recyclerView.getPaddingTop()) {
                recyclerView.x0(i);
            }
            if (q79.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.x0(i);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public iu5(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public iu5 s() {
        return this;
    }

    public float g(float f) {
        return f;
    }

    public float i(float f) {
        return f;
    }

    public void r(f89 f89Var) {
    }

    public void q(f89 f89Var, int i) {
    }
}
