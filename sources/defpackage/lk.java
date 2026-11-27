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
public final class lk implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public lk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        skb skbVar;
        float f = 0.2f;
        int i = 0;
        switch (this.a) {
            case 0:
                xz1 xz1Var = (xz1) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (xz1Var != null) {
                    n12 n12Var = xz1Var.b;
                    n12Var.G0 = -1;
                    n12Var.H0 = intValue;
                    n12Var.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                de0 de0Var = (de0) this.b;
                de0 de0Var2 = (de0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.setScaleX(floatValue);
                de0Var.setScaleY(floatValue);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !de0Var2.getImageReceiver().B()) {
                    de0Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 2:
                pf0 pf0Var = (pf0) this.b;
                rk1 rk1Var = (rk1) this.c;
                rk1Var.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = pf0Var.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    rk1 rk1Var2 = (rk1) obj;
                    if (rk1Var2 != rk1Var) {
                        rk1Var2.f = (int) ((rk1Var2.g / 255.0f) * (255 - rk1Var.f));
                    }
                }
                pf0Var.invalidate();
                return;
            case 3:
                pf0 pf0Var2 = (pf0) this.b;
                mk1 mk1Var = (mk1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = pf0Var2.c;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    mk1 mk1Var2 = (mk1) obj2;
                    if (mk1Var2 == mk1Var) {
                        mk1Var.d = (int) (floatValue2 * 255.0f);
                    } else {
                        mk1Var2.d = (int) ((1.0f - floatValue2) * mk1Var2.e);
                    }
                }
                pf0Var2.invalidate();
                return;
            case 4:
                ((hw) this.b).accept(Float.valueOf(((z11) this.c).getTranslationY()));
                return;
            case 5:
                ((y42) this.b).accept(Float.valueOf(((z11) this.c).getTranslationY()));
                return;
            case 6:
                zu1 zu1Var = (zu1) this.b;
                zu1 zu1Var2 = (zu1) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var2.ra = floatValue3;
                zu1Var2.fragmentView.invalidate();
                zu1Var2.A0.invalidate();
                float f2 = 1.0f - floatValue3;
                float L = hl.L(8.0f) * f2;
                zu1Var.p1.setTranslationY(L);
                zu1Var.p1.getAvatarImageView().setTranslationY(-L);
                float f3 = (-hl.L(8.0f)) * floatValue3;
                zu1Var2.p1.setTranslationY(f3);
                zu1Var2.p1.getAvatarImageView().setTranslationY(-f3);
                float f4 = (floatValue3 * 0.2f) + 0.8f;
                zu1Var.p1.getAvatarImageView().setScaleX(f4);
                zu1Var.p1.getAvatarImageView().setScaleY(f4);
                zu1Var.p1.getAvatarImageView().setAlpha(floatValue3);
                float f5 = (0.2f * f2) + 0.8f;
                zu1Var2.p1.getAvatarImageView().setScaleX(f5);
                zu1Var2.p1.getAvatarImageView().setScaleY(f5);
                zu1Var2.p1.getAvatarImageView().setAlpha(f2);
                wz1 wz1Var = zu1Var2.b1;
                if (wz1Var != null) {
                    wz1Var.setAlpha(f2);
                    return;
                }
                return;
            case 7:
                ((xt3) this.c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                n12 n12Var2 = ((p02) this.b).d0;
                n12Var2.F1();
                f12 f12Var = n12Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var2.d2;
                if (f12Var == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(n12Var2.i4);
                    return;
                }
                return;
            case 8:
                g92 g92Var = (g92) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g92Var.O.setAlpha(floatValue4);
                float f6 = 1.0f - floatValue4;
                g92Var.O.setTranslationY(((-skbVar.getHeight()) / 2.0f) * f6);
                g92Var.O.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i < arrayList3.size()) {
                    ((View) arrayList3.get(i)).setTranslationY((-g92Var.O.getHeight()) * f6);
                    i++;
                }
                return;
            case 9:
                ((cl1) this.b).c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((dl1) this.c).invalidate();
                return;
            case 10:
                e53 e53Var = (e53) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < arrayList4.size()) {
                    e53.g((View) arrayList4.get(i), floatValue5);
                    i++;
                }
                e53Var.m.l0.invalidate();
                return;
            case 11:
                ((zb3) this.b).P((f89) this.c);
                return;
            case 12:
                og3 og3Var = (og3) this.b;
                ema emaVar = (ema) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue6;
                emaVar.setAlpha(f7);
                emaVar.setTranslationY((-hl.L(5.0f)) * floatValue6);
                og3Var.E.setAlpha(floatValue6);
                og3Var.E.setTranslationY(hl.L(5.0f) * f7);
                return;
            case 13:
                ((uh3) this.b).M.a5((tj3) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                vh4 vh4Var = (vh4) this.b;
                ((sk) this.c).b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i < ((ArrayList) vh4Var.c).size()) {
                    if (!ri5.b) {
                        ((View) ((ArrayList) vh4Var.c).get(i)).invalidate();
                    }
                    i++;
                }
                return;
            case 15:
                oo4 oo4Var = (oo4) this.b;
                int[] iArr = (int[]) this.c;
                oo4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{vm2.f(floatValue7, iArr[0], oo4Var.h[0]), vm2.f(floatValue7, iArr[1], oo4Var.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                oo4Var.b = linearGradient;
                linearGradient.setLocalMatrix(oo4Var.c);
                paint.setShader(oo4Var.b);
                oo4Var.a.r.put(0, paint);
                oo4Var.g.setColor(vm2.f(0.1f, vm2.f(floatValue7, iArr[1], oo4Var.h[1]), -1));
                oo4Var.f.setColor(vm2.f(0.1f, vm2.f(floatValue7, iArr[0], oo4Var.h[0]), -16777216));
                oo4Var.invalidateSelf();
                return;
            case 16:
                mb5 mb5Var = (mb5) this.b;
                mb5Var.getClass();
                ((ka5) this.c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mb5Var.invalidate();
                return;
            case 17:
                kfc kfcVar = (kfc) this.c;
                String[] strArr = MediaController.W1;
                if (((MediaController) this.b).Y != 1) {
                    f = 1.0f;
                }
                kfcVar.A0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f);
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.c).invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                zc8 zc8Var = photoViewer.F2;
                if (zc8Var != null) {
                    zc8Var.invalidateOutline();
                    return;
                }
                return;
            case 19:
                ((ud8) this.c).r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((td8) this.b).invalidate();
                return;
            case 20:
                ((Drawable) this.c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((kl8) ((wd8) this.b).c).v2;
                if (view instanceof wb2) {
                    ((wb2) view).r2();
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
                    if (xea.o() > 0) {
                        hl.W3(profileStoriesView);
                        hl.d3(new uk8(profileStoriesView, (byte) 17), 180L);
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
                s39 s39Var = (s39) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 < 0.5f) {
                    float f8 = floatValue9 / 0.5f;
                    s39Var.setRotationY(90.0f * f8);
                    s39Var.B0 = ((1.0f - f8) * 0.3f) + 0.7f;
                    s39Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    s39Var.t0.b(s39Var.A0, false);
                }
                float f9 = (floatValue9 - 0.5f) / 0.5f;
                s39Var.setRotationY((1.0f - f9) * (-90.0f));
                s39Var.B0 = (f9 * 0.3f) + 0.7f;
                s39Var.invalidate();
                return;
            case 24:
                lp lpVar = (lp) this.b;
                int[] iArr2 = (int[]) this.c;
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i3 = intValue2 - lpVar.b;
                ((d79) lpVar.d).scrollBy(0, i3);
                iArr2[0] = iArr2[0] + i3;
                lpVar.b = intValue2;
                return;
            case 25:
                int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((sd1) this.b).a = intValue3;
                ((ye9) this.c).j(intValue3);
                return;
            case 26:
                View view2 = (View) this.c;
                ((dl9) this.b).a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 27:
                b5b b5bVar = (b5b) this.b;
                j35[] j35VarArr = (j35[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < j35VarArr.length) {
                    b5bVar.c[i] = (b5bVar.d[i] * floatValue10) + ((1.0f - floatValue10) * b5bVar.e[i]);
                    i++;
                }
                b5bVar.invalidate();
                return;
            case 28:
                kfb kfbVar = (kfb) this.b;
                kfbVar.getClass();
                ((jfb) this.c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kfbVar.i();
                return;
            default:
                ((View) ((p1d) ((pq8) this.b).b).d.getParent()).invalidate();
                return;
        }
    }
}
