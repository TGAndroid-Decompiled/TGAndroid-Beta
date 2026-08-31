package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class i1 {
    public int f5805a = -1;
    public RecyclerView f5806b;
    public w0 f5807c;
    public boolean d;
    public boolean f5808e;
    public View f5809f;
    public final h1 f5810g;
    public boolean h;

    public i1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f5796f = false;
        obj.f5797g = 0;
        obj.f5792a = 0;
        obj.f5793b = 0;
        obj.f5794c = Integer.MIN_VALUE;
        obj.f5795e = null;
        this.f5810g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        w0 w0Var = this.f5807c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + j0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f5806b;
        if (this.f5805a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f5809f == null && this.f5807c != null && (a2 = a(this.f5805a)) != null) {
            float f10 = a2.x;
            if (f10 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f10), (int) Math.signum(a2.y), null);
            }
        }
        boolean z4 = false;
        this.d = false;
        View view = this.f5809f;
        h1 h1Var = this.f5810g;
        if (view != null) {
            this.f5806b.getClass();
            if (RecyclerView.S(view) == this.f5805a) {
                View view2 = this.f5809f;
                j1 j1Var = recyclerView.f1339q0;
                g(view2, h1Var);
                h1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5809f = null;
            }
        }
        if (this.f5808e) {
            j1 j1Var2 = recyclerView.f1339q0;
            d(i10, i11, h1Var);
            if (h1Var.d >= 0) {
                z4 = true;
            }
            h1Var.a(recyclerView);
            if (z4 && this.f5808e) {
                this.d = true;
                recyclerView.f1336n0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, h1 h1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, h1 h1Var);

    public final void h() {
        if (!this.f5808e) {
            return;
        }
        this.f5808e = false;
        f();
        this.f5806b.f1339q0.f5827a = -1;
        this.f5809f = null;
        this.f5805a = -1;
        this.d = false;
        w0 w0Var = this.f5807c;
        if (w0Var.f5943e == this) {
            w0Var.f5943e = null;
        }
        this.f5807c = null;
        this.f5806b = null;
    }
}
