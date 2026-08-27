package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class k1 {

    public int f5731a = -1;

    public RecyclerView f5732b;

    public x0 f5733c;
    public boolean d;

    public boolean f5734e;

    public View f5735f;

    public final j1 f5736g;
    public boolean h;

    public k1() {
        j1 j1Var = new j1();
        j1Var.d = -1;
        j1Var.f5714f = false;
        j1Var.f5715g = 0;
        j1Var.f5710a = 0;
        j1Var.f5711b = 0;
        j1Var.f5712c = Integer.MIN_VALUE;
        j1Var.f5713e = null;
        this.f5736g = j1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public PointF a(int i10) {
        x0 x0Var = this.f5733c;
        if (x0Var instanceof k0) {
            return ((k0) x0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + k0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF pointFA;
        RecyclerView recyclerView = this.f5732b;
        if (this.f5731a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f5735f == null && this.f5733c != null && (pointFA = a(this.f5731a)) != null) {
            float f10 = pointFA.x;
            if (f10 != 0.0f || pointFA.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
            }
        }
        this.d = false;
        View view = this.f5735f;
        j1 j1Var = this.f5736g;
        if (view != null) {
            this.f5732b.getClass();
            if (RecyclerView.S(view) == this.f5731a) {
                View view2 = this.f5735f;
                l1 l1Var = recyclerView.f1853p0;
                g(view2, j1Var);
                j1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5735f = null;
            }
        }
        if (this.f5734e) {
            l1 l1Var2 = recyclerView.f1853p0;
            d(i10, i11, j1Var);
            boolean z10 = j1Var.d >= 0;
            j1Var.a(recyclerView);
            if (z10 && this.f5734e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, j1 j1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, j1 j1Var);

    public final void h() {
        if (this.f5734e) {
            this.f5734e = false;
            f();
            this.f5732b.f1853p0.f5757a = -1;
            this.f5735f = null;
            this.f5731a = -1;
            this.d = false;
            x0 x0Var = this.f5733c;
            if (x0Var.f5855e == this) {
                x0Var.f5855e = null;
            }
            this.f5733c = null;
            this.f5732b = null;
        }
    }
}
