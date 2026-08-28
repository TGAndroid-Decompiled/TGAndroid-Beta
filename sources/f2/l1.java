package f2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class l1 {
    public int f5422a;
    public int f5423b;
    public int f5424c;
    public int d;
    public Interpolator f5425e;
    public boolean f5426f;
    public int f5427g;

    public final void a(RecyclerView recyclerView) {
        int i9 = this.d;
        if (i9 >= 0) {
            this.d = -1;
            recyclerView.c0(i9);
            this.f5426f = false;
        } else if (this.f5426f) {
            Interpolator interpolator = this.f5425e;
            if (interpolator != null && this.f5424c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f5424c;
            if (i10 >= 1) {
                recyclerView.m0.b(this.f5422a, this.f5423b, i10, interpolator);
                int i11 = this.f5427g + 1;
                this.f5427g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5426f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f5427g = 0;
        }
    }

    public final void b(int i9, int i10, int i11, Interpolator interpolator) {
        this.f5422a = i9;
        this.f5423b = i10;
        this.f5424c = i11;
        this.f5425e = interpolator;
        this.f5426f = true;
    }
}
