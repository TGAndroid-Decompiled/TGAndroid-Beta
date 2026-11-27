package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class xhc extends ViewOutlineProvider {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xhc(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        int i3;
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z = this.a;
        int i4 = 0;
        int i5 = this.b;
        if (z) {
            i = 0;
        } else {
            i = i5;
        }
        int i6 = -i;
        if (this.c) {
            i2 = 0;
        } else {
            i2 = i5;
        }
        int i7 = -i2;
        if (this.d) {
            i3 = 0;
        } else {
            i3 = i5;
        }
        int i8 = width + i3;
        if (!this.e) {
            i4 = i5;
        }
        outline.setRoundRect(i6, i7, i8, height + i4, i5);
    }
}
