package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class n49 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.e0(i);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.c < 1) {
                sc8.j("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i2 = this.c;
            if (i2 >= 1) {
                recyclerView.s0.b(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
                return;
            }
            sc8.j("Scroll duration must be a positive number");
        } else {
            this.g = 0;
        }
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = interpolator;
        this.f = true;
    }
}
