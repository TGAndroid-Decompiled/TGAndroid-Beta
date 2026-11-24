package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;
public final class u88 implements gk, ee, jw7, ln5, qq7 {
    public final PhotoViewer a;

    public u88(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        n88 n88Var = photoViewer.u4;
        Rect rect = photoViewer.t2;
        Rect rect2 = new Rect(rect);
        iq5 H0 = gm.H0(wzcVar, false);
        int i = wzcVar.a.f(647).d;
        int i2 = H0.a;
        int i3 = H0.b;
        int i4 = H0.c;
        rect.set(i2, i3, i4, i);
        if (!rect2.equals(rect)) {
            byte b = photoViewer.m4;
            if (b == 1 || b == 3) {
                ClippingImageView clippingImageView = photoViewer.i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.j4[0][2] = photoViewer.i0.getTranslationX();
            }
            z zVar = photoViewer.h0;
            if (zVar != null) {
                zVar.requestLayout();
            }
        }
        View view2 = photoViewer.k0;
        if (view2 != null) {
            photoViewer.l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i5 = photoViewer.l0;
            marginLayoutParams.height = i5;
            marginLayoutParams.bottomMargin = (-i5) / 2;
            photoViewer.k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f0.setPadding(i2, 0, i4, 0);
        if (photoViewer.G != null) {
            gm.r(n88Var);
            if (photoViewer.e && photoViewer.m4 == 0) {
                gm.d3(n88Var, 200L);
            }
        }
        return wzc.b;
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        pb8 pb8Var;
        int i;
        Bitmap n;
        boolean z4;
        int i2;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (imageReceiver == photoViewer.B4 && z && !z2) {
            if (!photoViewer.s1 && ((photoViewer.t4 == 1 || (i2 = photoViewer.d2) == 1 || i2 == 11) && photoViewer.D1 != null && (n = imageReceiver.n()) != null)) {
                x68 x68Var = photoViewer.D1;
                int i3 = imageReceiver.V;
                int i4 = photoViewer.d2;
                if (i4 != 1 && i4 != 11) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                x68Var.b(n, i3, z4, true, photoViewer.E1, null, null);
            }
            if (photoViewer.x4.getVisibility() == 0) {
                photoViewer.f0.requestLayout();
            }
            photoViewer.M();
        }
        if (imageReceiver == photoViewer.B4 && z && (pb8Var = photoViewer.d) != null && pb8Var.K() && !photoViewer.j5 && (i = photoViewer.d2) != 1 && i != 11) {
            if (!photoViewer.S5) {
                photoViewer.T5 = true;
            } else {
                photoViewer.W1();
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.a.o2(0);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.a.F1(z, i, i2, false, false, false);
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
