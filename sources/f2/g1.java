package f2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class g1 {
    public int f5700a;
    public int f5701b;
    public int f5702c;
    public int d;
    public Interpolator e;
    public boolean f5703f;
    public int f5704g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f5703f = false;
        } else if (this.f5703f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f5702c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f5702c;
            if (i11 >= 1) {
                recyclerView.f1248n0.b(this.f5700a, this.f5701b, i11, interpolator);
                int i12 = this.f5704g + 1;
                this.f5704g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5703f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f5704g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f5700a = i10;
        this.f5701b = i11;
        this.f5702c = i12;
        this.e = interpolator;
        this.f5703f = true;
    }
}
