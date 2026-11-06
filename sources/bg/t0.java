package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class t0 extends ViewOutlineProvider {
    public final boolean f3376a;
    public final int f3377b;
    public final boolean f3378c;
    public final boolean d;
    public final boolean f3379e;

    public t0(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f3376a = z9;
        this.f3377b = i7;
        this.f3378c = z10;
        this.d = z11;
        this.f3379e = z12;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i7;
        int i10;
        int i11;
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z9 = this.f3376a;
        int i12 = 0;
        int i13 = this.f3377b;
        if (z9) {
            i7 = 0;
        } else {
            i7 = i13;
        }
        int i14 = -i7;
        if (this.f3378c) {
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
        if (!this.f3379e) {
            i12 = i13;
        }
        outline.setRoundRect(i14, i15, i16, height + i12, i13);
    }
}
