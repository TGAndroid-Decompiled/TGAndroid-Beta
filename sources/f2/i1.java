package f2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class i1 {
    public int f6351a;
    public int f6352b;
    public int f6353c;
    public int d;
    public Interpolator f6354e;
    public boolean f6355f;
    public int f6356g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f6355f = false;
        } else if (this.f6355f) {
            Interpolator interpolator = this.f6354e;
            if (interpolator != null && this.f6353c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f6353c;
            if (i11 >= 1) {
                recyclerView.m0.b(this.f6351a, this.f6352b, i11, interpolator);
                int i12 = this.f6356g + 1;
                this.f6356g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f6355f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f6356g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f6351a = i10;
        this.f6352b = i11;
        this.f6353c = i12;
        this.f6354e = interpolator;
        this.f6355f = true;
    }
}
