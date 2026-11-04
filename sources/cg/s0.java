package cg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class s0 extends ViewOutlineProvider {
    public final boolean f4741a;
    public final int f4742b;
    public final boolean f4743c;
    public final boolean d;
    public final boolean f4744e;

    public s0(int i3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f4741a = z10;
        this.f4742b = i3;
        this.f4743c = z11;
        this.d = z12;
        this.f4744e = z13;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i3;
        int i10;
        int i11;
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z10 = this.f4741a;
        int i12 = 0;
        int i13 = this.f4742b;
        if (z10) {
            i3 = 0;
        } else {
            i3 = i13;
        }
        int i14 = -i3;
        if (this.f4743c) {
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
        if (!this.f4744e) {
            i12 = i13;
        }
        outline.setRoundRect(i14, i15, i16, height + i12, i13);
    }
}
