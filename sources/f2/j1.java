package f2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class j1 {

    public int f5710a;

    public int f5711b;

    public int f5712c;
    public int d;

    public Interpolator f5713e;

    public boolean f5714f;

    public int f5715g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f5714f = false;
            return;
        }
        if (!this.f5714f) {
            this.f5715g = 0;
            return;
        }
        Interpolator interpolator = this.f5713e;
        if (interpolator != null && this.f5712c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f5712c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.m0.b(this.f5710a, this.f5711b, i11, interpolator);
        int i12 = this.f5715g + 1;
        this.f5715g = i12;
        if (i12 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f5714f = false;
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f5710a = i10;
        this.f5711b = i11;
        this.f5712c = i12;
        this.f5713e = interpolator;
        this.f5714f = true;
    }
}
