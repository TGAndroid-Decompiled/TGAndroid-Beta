package defpackage;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class pk implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public pk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        wgb wgbVar;
        float f = 0.2f;
        int i = 0;
        switch (this.a) {
            case 0:
                fz1 fz1Var = (fz1) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (fz1Var != null) {
                    x02 x02Var = fz1Var.b;
                    x02Var.G0 = -1;
                    x02Var.H0 = intValue;
                    x02Var.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                be0 be0Var = (be0) this.b;
                be0 be0Var2 = (be0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.setScaleX(floatValue);
                be0Var.setScaleY(floatValue);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !be0Var2.getImageReceiver().B()) {
                    be0Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 2:
                nf0 nf0Var = (nf0) this.b;
                ik1 ik1Var = (ik1) this.c;
                ik1Var.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = nf0Var.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ik1 ik1Var2 = (ik1) obj;
                    if (ik1Var2 != ik1Var) {
                        ik1Var2.f = (int) ((ik1Var2.g / 255.0f) * (255 - ik1Var.f));
                    }
                }
                nf0Var.invalidate();
                return;
            case 3:
                nf0 nf0Var2 = (nf0) this.b;
                dk1 dk1Var = (dk1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = nf0Var2.c;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    dk1 dk1Var2 = (dk1) obj2;
                    if (dk1Var2 == dk1Var) {
                        dk1Var.d = (int) (floatValue2 * 255.0f);
                    } else {
                        dk1Var2.d = (int) ((1.0f - floatValue2) * dk1Var2.e);
                    }
                }
                nf0Var2.invalidate();
                return;
            case 4:
                ((gw) this.b).accept(Float.valueOf(((q11) this.c).getTranslationY()));
                return;
            case 5:
                ((i42) this.b).accept(Float.valueOf(((q11) this.c).getTranslationY()));
                return;
            case 6:
                mu1 mu1Var = (mu1) this.b;
                mu1 mu1Var2 = (mu1) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var2.ra = floatValue3;
                mu1Var2.fragmentView.invalidate();
                mu1Var2.A0.invalidate();
                float f2 = 1.0f - floatValue3;
                float L = gl.L(8.0f) * f2;
                mu1Var.p1.setTranslationY(L);
                mu1Var.p1.getAvatarImageView().setTranslationY(-L);
                float f3 = (-gl.L(8.0f)) * floatValue3;
                mu1Var2.p1.setTranslationY(f3);
                mu1Var2.p1.getAvatarImageView().setTranslationY(-f3);
                float f4 = (floatValue3 * 0.2f) + 0.8f;
                mu1Var.p1.getAvatarImageView().setScaleX(f4);
                mu1Var.p1.getAvatarImageView().setScaleY(f4);
                mu1Var.p1.getAvatarImageView().setAlpha(floatValue3);
                float f5 = (0.2f * f2) + 0.8f;
                mu1Var2.p1.getAvatarImageView().setScaleX(f5);
                mu1Var2.p1.getAvatarImageView().setScaleY(f5);
                mu1Var2.p1.getAvatarImageView().setAlpha(f2);
                ez1 ez1Var = mu1Var2.b1;
                if (ez1Var != null) {
                    ez1Var.setAlpha(f2);
                    return;
                }
                return;
            case 7:
                ((gt3) this.c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x02 x02Var2 = ((zz1) this.b).d0;
                x02Var2.E1();
                p02 p02Var = x02Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var2.d2;
                if (p02Var == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(x02Var2.i4);
                    return;
                }
                return;
            case 8:
                p82 p82Var = (p82) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p82Var.O.setAlpha(floatValue4);
                float f6 = 1.0f - floatValue4;
                p82Var.O.setTranslationY(((-wgbVar.getHeight()) / 2.0f) * f6);
                p82Var.O.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i < arrayList3.size()) {
                    ((View) arrayList3.get(i)).setTranslationY((-p82Var.O.getHeight()) * f6);
                    i++;
                }
                return;
            case 9:
                ((tk1) this.b).c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((uk1) this.c).invalidate();
                return;
            case 10:
                m43 m43Var = (m43) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < arrayList4.size()) {
                    m43.g((View) arrayList4.get(i), floatValue5);
                    i++;
                }
                m43Var.m.l0.invalidate();
                return;
            case 11:
                ((gb3) this.b).P((s49) this.c);
                return;
            case 12:
                uf3 uf3Var = (uf3) this.b;
                jia jiaVar = (jia) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue6;
                jiaVar.setAlpha(f7);
                jiaVar.setTranslationY((-gl.L(5.0f)) * floatValue6);
                uf3Var.E.setAlpha(floatValue6);
                uf3Var.E.setTranslationY(gl.L(5.0f) * f7);
                return;
            case 13:
                ((ah3) this.b).M.W4((bj3) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                xf4 xf4Var = (xf4) this.b;
                ((rk) this.c).b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i < ((ArrayList) xf4Var.c).size()) {
                    if (!pg5.b) {
                        ((View) ((ArrayList) xf4Var.c).get(i)).invalidate();
                    }
                    i++;
                }
                return;
            case 15:
                jm4 jm4Var = (jm4) this.b;
                int[] iArr = (int[]) this.c;
                jm4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{bm2.f(floatValue7, iArr[0], jm4Var.h[0]), bm2.f(floatValue7, iArr[1], jm4Var.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                jm4Var.b = linearGradient;
                linearGradient.setLocalMatrix(jm4Var.c);
                paint.setShader(jm4Var.b);
                jm4Var.a.r.put(0, paint);
                jm4Var.g.setColor(bm2.f(0.1f, bm2.f(floatValue7, iArr[1], jm4Var.h[1]), -1));
                jm4Var.f.setColor(bm2.f(0.1f, bm2.f(floatValue7, iArr[0], jm4Var.h[0]), -16777216));
                jm4Var.invalidateSelf();
                return;
            case 16:
                l95 l95Var = (l95) this.b;
                l95Var.getClass();
                ((h85) this.c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l95Var.invalidate();
                return;
            case 17:
                lbc lbcVar = (lbc) this.c;
                String[] strArr = MediaController.W1;
                if (((MediaController) this.b).Y != 1) {
                    f = 1.0f;
                }
                lbcVar.A0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f);
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.c).invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                j98 j98Var = photoViewer.F2;
                if (j98Var != null) {
                    j98Var.invalidateOutline();
                    return;
                }
                return;
            case 19:
                ((ea8) this.c).r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((da8) this.b).invalidate();
                return;
            case 20:
                ((Drawable) this.c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((xh8) ((eh8) this.b).c).v2;
                if (view instanceof gb2) {
                    ((gb2) view).r2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i2 = ProfileStoriesView.t0;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue8 > 0.2f) {
                    zArr[0] = true;
                    if (gba.o() > 0) {
                        gl.X3(profileStoriesView);
                        gl.e3(new sr8(profileStoriesView, (byte) 1), 180L);
                    }
                }
                profileStoriesView.a0 = Math.max(1.0f, floatValue8);
                profileStoriesView.invalidate();
                return;
            case 22:
                ((TextView) this.b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                e09 e09Var = (e09) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 < 0.5f) {
                    float f8 = floatValue9 / 0.5f;
                    e09Var.setRotationY(90.0f * f8);
                    e09Var.B0 = ((1.0f - f8) * 0.3f) + 0.7f;
                    e09Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e09Var.t0.b(e09Var.A0, false);
                }
                float f9 = (floatValue9 - 0.5f) / 0.5f;
                e09Var.setRotationY((1.0f - f9) * (-90.0f));
                e09Var.B0 = (f9 * 0.3f) + 0.7f;
                e09Var.invalidate();
                return;
            case 24:
                kp kpVar = (kp) this.b;
                int[] iArr2 = (int[]) this.c;
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i3 = intValue2 - kpVar.b;
                ((o39) kpVar.d).scrollBy(0, i3);
                iArr2[0] = iArr2[0] + i3;
                kpVar.b = intValue2;
                return;
            case 25:
                int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((jd1) this.b).a = intValue3;
                ((k88) this.c).c(intValue3);
                return;
            case 26:
                View view2 = (View) this.c;
                ((nh9) this.b).a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 27:
                e1b e1bVar = (e1b) this.b;
                f15[] f15VarArr = (f15[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < f15VarArr.length) {
                    e1bVar.c[i] = (e1bVar.d[i] * floatValue10) + ((1.0f - floatValue10) * e1bVar.e[i]);
                    i++;
                }
                e1bVar.invalidate();
                return;
            case 28:
                obb obbVar = (obb) this.b;
                obbVar.getClass();
                ((nbb) this.c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                obbVar.i();
                return;
            default:
                ((View) ((zwc) ((g29) this.b).b).d.getParent()).invalidate();
                return;
        }
    }
}
