package f2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class h1 {
    public int f5792a;
    public int f5793b;
    public int f5794c;
    public int d;
    public Interpolator f5795e;
    public boolean f5796f;
    public int f5797g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f5796f = false;
        } else if (this.f5796f) {
            Interpolator interpolator = this.f5795e;
            if (interpolator != null && this.f5794c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f5794c;
            if (i11 >= 1) {
                recyclerView.f1336n0.b(this.f5792a, this.f5793b, i11, interpolator);
                int i12 = this.f5797g + 1;
                this.f5797g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5796f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f5797g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f5792a = i10;
        this.f5793b = i11;
        this.f5794c = i12;
        this.f5795e = interpolator;
        this.f5796f = true;
    }
}
