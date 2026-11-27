package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class ea8 implements pcc {
    public final byte a;
    public final PhotoViewer b;

    public ea8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b;
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        byte b2 = this.a;
        boolean z5 = true;
        PhotoViewer photoViewer = this.b;
        switch (b2) {
            case 0:
                h3b h3bVar = (h3b) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((go6) photoViewer.f7.get(photoViewer.O4)).i);
                    k3b k3bVar = photoViewer.o5;
                    k3bVar.M = true;
                    k3bVar.F = h3bVar;
                    Bitmap n = photoViewer.B4.n();
                    int i3 = photoViewer.B4.V;
                    h3b h3bVar2 = k3bVar.F;
                    if (h3bVar2 == null) {
                        b = k3bVar.J;
                    } else if (!isEmpty && n != null) {
                        b = k3bVar.e(n);
                    } else {
                        b = h3bVar2.b();
                    }
                    photoViewer.B4.f0(b);
                    photoViewer.s5.setUndoCutState(true);
                    photoViewer.k2(true, true);
                    photoViewer.s5.post(new y98(photoViewer, (byte) 6));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                d31.F(photoViewer.f0, true).j();
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.M1.V1 = photoViewer.L1.c();
                photoViewer.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer.M1.X1);
                if ((photoViewer.M1.C0 instanceof rlb) && max > 0) {
                    f = ((hl.q.y - max) - hl.L(80.0f)) - photoViewer.M1.getSelectedEntityBottom();
                } else {
                    f = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer.x7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer.x7 = null;
                }
                if (photoViewer.t4 != 3) {
                    f = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer.Y5, f);
                photoViewer.x7 = ofFloat;
                ofFloat.addUpdateListener(new w98(photoViewer, (byte) 9));
                photoViewer.x7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer.x7;
                k43 k43Var = k43.h;
                valueAnimator2.setInterpolator(k43Var);
                photoViewer.x7.start();
                AnimatorSet animatorSet = photoViewer.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new w98(photoViewer, (byte) 6));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer.K1 = animatorSet2;
                gx7 gx7Var = photoViewer.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gx7Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer.M1.M0, property, Math.min(0, hl.L(40.0f) + i));
                g7 g7Var = photoViewer.M1.P0;
                Property property2 = View.ALPHA;
                if (max > hl.L(20.0f)) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g7Var, property2, f2);
                dv7 dv7Var = photoViewer.M1.k0;
                if (max > hl.L(20.0f)) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(dv7Var, property2, f3);
                iv7 iv7Var = photoViewer.M1.l0;
                if (max > hl.L(20.0f)) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(iv7Var, property2, f4), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(k43Var);
                animatorSet2.start();
                hc8 hc8Var = photoViewer.M1;
                nv7 nv7Var = hc8Var.e1;
                if (nv7Var != null) {
                    if (hc8Var.V1) {
                        nv7Var.a(2131231516);
                    } else if (hc8Var.U1) {
                        nv7Var.a(2131231508);
                    } else {
                        nv7Var.a(2131232047);
                    }
                }
                TextView textView = hc8Var.i1;
                if (!hc8Var.V1 && !hc8Var.U1) {
                    z = true;
                    z2 = false;
                } else {
                    z = false;
                    z2 = false;
                }
                hl.O3(1.0f, textView, z, z2);
                ImageView imageView = hc8Var.g1;
                if (!hc8Var.V1 && !hc8Var.U1) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                hl.O3(1.0f, imageView, z3, z2);
                TextView textView2 = hc8Var.k1;
                if (!hc8Var.V1 && !hc8Var.U1) {
                    z4 = z2;
                } else {
                    z4 = true;
                }
                hl.O3(1.0f, textView2, z4, z2);
                TextView textView3 = hc8Var.j1;
                if (!hc8Var.V1 && !hc8Var.U1) {
                    z5 = z2;
                }
                hl.O3(1.0f, textView3, z5, z2);
                return;
            case 3:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                kfc kfcVar = photoViewer.G2;
                if (kfcVar != null && photoViewer.C2 != null) {
                    if (photoViewer.L3) {
                        photoViewer.G3 = (byte) 2;
                    }
                    kfcVar.z0(null);
                    photoViewer.G2.z0(photoViewer.C2);
                    photoViewer.C2.setVisibility(0);
                    photoViewer.F3 = false;
                    photoViewer.f0.invalidate();
                    if (photoViewer.G2.c0()) {
                        hl.d3(new y98(photoViewer, (byte) 17), 500L);
                    } else {
                        photoViewer.X8 = true;
                        photoViewer.q(false);
                    }
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            case 4:
                no6 no6Var = (no6) obj;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                if (!photoViewer.p5.b.R && (i2 = photoViewer.O4) >= 0 && i2 < photoViewer.f7.size() && (photoViewer.f7.get(photoViewer.O4) instanceof no6)) {
                    ld8 ld8Var = photoViewer.p5;
                    au4 au4Var = ld8Var.h;
                    if (au4Var != null) {
                        au4Var.dismiss();
                        ld8Var.h = null;
                    }
                    photoViewer.p5.b.setLoading(true);
                    Utilities.e.c(new oy6(photoViewer, no6Var, (no6) photoViewer.f7.get(photoViewer.O4), PhotoViewer.x0(), (byte) 20));
                    return;
                }
                return;
            case 5:
                Integer num = (Integer) obj;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                Object obj2 = photoViewer.f7.get(photoViewer.O4);
                if (obj2 instanceof no6) {
                    ((no6) obj2).x = num.intValue();
                } else if (obj2 instanceof ro6) {
                    ((ro6) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer.d.w(photoViewer.O4)) {
                    photoViewer.V1();
                }
                photoViewer.W1.setTimer(num.intValue());
                return;
            case 6:
                Integer num2 = (Integer) obj;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                FrameLayout frameLayout = photoViewer.W7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.W7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, num2.intValue(), 0)));
                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, num2.intValue(), 0)));
                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, num2.intValue(), 0)));
                mb1 mb1Var = photoViewer.V1.N;
                if (mb1Var != null) {
                    mb1Var.setTranslationY((-num2.intValue()) - hl.L(14.0f));
                    return;
                }
                return;
            case 7:
                Integer num3 = (Integer) obj;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                Object obj3 = photoViewer.f7.get(photoViewer.O4);
                if (obj3 instanceof no6) {
                    ((no6) obj3).x = num3.intValue();
                } else if (obj3 instanceof ro6) {
                    ((ro6) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer.d.w(photoViewer.O4)) {
                    photoViewer.V1();
                }
                photoViewer.V1.setTimer(num3.intValue());
                return;
            case 8:
                Integer num4 = (Integer) obj;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                mb1 mb1Var2 = photoViewer.W1.N;
                if (mb1Var2 != null) {
                    mb1Var2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 9:
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer.v(0, false);
                return;
            default:
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                photoViewer.v(0, false);
                return;
        }
    }
}
