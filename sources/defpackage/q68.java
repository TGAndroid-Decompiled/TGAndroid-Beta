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
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class q68 implements p8c {
    public final byte a;
    public final PhotoViewer b;

    public q68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b;
        TextureView textureView;
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
        boolean z5 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                jza jzaVar = (jza) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((bm6) photoViewer.g7.get(photoViewer.P4)).i);
                    mza mzaVar = photoViewer.p5;
                    mzaVar.M = true;
                    mzaVar.F = jzaVar;
                    Bitmap n = photoViewer.C4.n();
                    int i3 = photoViewer.C4.V;
                    jza jzaVar2 = mzaVar.F;
                    if (jzaVar2 == null) {
                        b = mzaVar.J;
                    } else if (!isEmpty && n != null) {
                        b = mzaVar.e(n);
                    } else {
                        b = jzaVar2.b();
                    }
                    photoViewer.C4.f0(b);
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.j2(true, true);
                    photoViewer.t5.post(new l68(photoViewer, (byte) 9));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                if (surfaceTexture != null && (textureView = photoViewer2.C2) != null) {
                    if (photoViewer2.L3) {
                        photoViewer2.G3 = (byte) 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer2.C2.setVisibility(0);
                    photoViewer2.F3 = false;
                    photoViewer2.f0.invalidate();
                    gl.e3(new l68(photoViewer2, (byte) 12), 64L);
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Uri uri = (Uri) obj;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                u21.F(photoViewer3.f0, true).j();
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer4.M1.b2 = photoViewer4.L1.c();
                photoViewer4.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer4.M1.d2);
                if ((photoViewer4.M1.I0 instanceof vhb) && max > 0) {
                    f = ((gl.q.y - max) - gl.L(80.0f)) - photoViewer4.M1.getSelectedEntityBottom();
                } else {
                    f = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer4.y7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer4.y7 = null;
                }
                if (photoViewer4.u4 != 3) {
                    f = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer4.Z5, f);
                photoViewer4.y7 = ofFloat;
                ofFloat.addUpdateListener(new f68(photoViewer4, (byte) 10));
                photoViewer4.y7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer4.y7;
                s33 s33Var = s33.h;
                valueAnimator2.setInterpolator(s33Var);
                photoViewer4.y7.start();
                AnimatorSet animatorSet = photoViewer4.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new f68(photoViewer4, (byte) 9));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer4.K1 = animatorSet2;
                zt7 zt7Var = photoViewer4.M1.b1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zt7Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer4.M1.S0, property, Math.min(0, gl.L(40.0f) + i));
                f7 f7Var = photoViewer4.M1.V0;
                Property property2 = View.ALPHA;
                if (max > gl.L(20.0f)) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(f7Var, property2, f2);
                xr7 xr7Var = photoViewer4.M1.q0;
                if (max > gl.L(20.0f)) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(xr7Var, property2, f3);
                cs7 cs7Var = photoViewer4.M1.r0;
                if (max > gl.L(20.0f)) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(cs7Var, property2, f4), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(s33Var);
                animatorSet2.start();
                q88 q88Var = photoViewer4.M1;
                hs7 hs7Var = q88Var.k1;
                if (hs7Var != null) {
                    if (q88Var.b2) {
                        hs7Var.a(2131231516);
                    } else if (q88Var.a2) {
                        hs7Var.a(2131231508);
                    } else {
                        hs7Var.a(2131232047);
                    }
                }
                TextView textView = q88Var.o1;
                if (!q88Var.b2 && !q88Var.a2) {
                    z = true;
                    z2 = false;
                } else {
                    z = false;
                    z2 = false;
                }
                gl.P3(1.0f, textView, z, z2);
                ImageView imageView = q88Var.m1;
                if (!q88Var.b2 && !q88Var.a2) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                gl.P3(1.0f, imageView, z3, z2);
                TextView textView2 = q88Var.q1;
                if (!q88Var.b2 && !q88Var.a2) {
                    z4 = z2;
                } else {
                    z4 = true;
                }
                gl.P3(1.0f, textView2, z4, z2);
                TextView textView3 = q88Var.p1;
                if (!q88Var.b2 && !q88Var.a2) {
                    z5 = z2;
                }
                gl.P3(1.0f, textView3, z5, z2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                jm6 jm6Var = (jm6) obj;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                if (!photoViewer5.q5.b.R && (i2 = photoViewer5.P4) >= 0 && i2 < photoViewer5.g7.size() && (photoViewer5.g7.get(photoViewer5.P4) instanceof jm6)) {
                    v98 v98Var = photoViewer5.q5;
                    wr4 wr4Var = v98Var.h;
                    if (wr4Var != null) {
                        wr4Var.dismiss();
                        v98Var.h = null;
                    }
                    photoViewer5.q5.b.setLoading(true);
                    Utilities.e.c(new jw6(photoViewer5, jm6Var, (jm6) photoViewer5.g7.get(photoViewer5.P4), PhotoViewer.x0(), (byte) 18));
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Integer num = (Integer) obj;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                Object obj2 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj2 instanceof jm6) {
                    ((jm6) obj2).x = num.intValue();
                } else if (obj2 instanceof nm6) {
                    ((nm6) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer6.d.w(photoViewer6.P4)) {
                    photoViewer6.U1();
                }
                photoViewer6.W1.setTimer(num.intValue());
                return;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Integer num2 = (Integer) obj;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                FrameLayout frameLayout = photoViewer7.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer7.X7.setTranslationY(photoViewer7.Q0.getTranslationY() - (photoViewer7.V1.getAlpha() * b00.c(46.0f, photoViewer7.V1.getEditTextHeight(), 0)));
                }
                photoViewer7.f1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                photoViewer7.g1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                photoViewer7.h1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                eb1 eb1Var = photoViewer7.V1.N;
                if (eb1Var != null) {
                    eb1Var.setTranslationY((-num2.intValue()) - gl.L(14.0f));
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Integer num3 = (Integer) obj;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                Object obj3 = photoViewer8.g7.get(photoViewer8.P4);
                if (obj3 instanceof jm6) {
                    ((jm6) obj3).x = num3.intValue();
                } else if (obj3 instanceof nm6) {
                    ((nm6) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer8.d.w(photoViewer8.P4)) {
                    photoViewer8.U1();
                }
                photoViewer8.V1.setTimer(num3.intValue());
                return;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Integer num4 = (Integer) obj;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                eb1 eb1Var2 = photoViewer9.W1.N;
                if (eb1Var2 != null) {
                    eb1Var2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer10.w(0, false);
                return;
            default:
                PhotoViewer photoViewer11 = this.b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                photoViewer11.w(0, false);
                return;
        }
    }
}
