package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class h88 extends ecc {
    public final PhotoViewer i0;

    public h88(PhotoViewer photoViewer, Context context, r68 r68Var) {
        super(context, r68Var);
        this.i0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable[] drawableArr = PhotoViewer.f9;
        this.i0.Q2();
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Drawable[] drawableArr = PhotoViewer.f9;
            this.i0.Q2();
        }
    }
}
