package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class t0 extends ViewOutlineProvider {
    public final boolean f3336a;
    public final int f3337b;
    public final boolean f3338c;
    public final boolean d;
    public final boolean f3339e;

    public t0(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3336a = z10;
        this.f3337b = i7;
        this.f3338c = z11;
        this.d = z12;
        this.f3339e = z13;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i7;
        int i10;
        int i11;
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z10 = this.f3336a;
        int i12 = 0;
        int i13 = this.f3337b;
        if (z10) {
            i7 = 0;
        } else {
            i7 = i13;
        }
        int i14 = -i7;
        if (this.f3338c) {
            i10 = 0;
        } else {
            i10 = i13;
        }
        int i15 = -i10;
        if (this.d) {
            i11 = 0;
        } else {
            i11 = i13;
        }
        int i16 = width + i11;
        if (!this.f3339e) {
            i12 = i13;
        }
        outline.setRoundRect(i14, i15, i16, height + i12, i13);
    }
}
