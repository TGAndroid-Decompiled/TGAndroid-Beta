package ci;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b8.kg;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zk;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cc1;
import org.telegram.ui.fq0;
import org.telegram.ui.ln;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.zu;
public final class uc implements ValueAnimator.AnimatorUpdateListener {
    public final int f6127a;
    public final Object f6128b;
    public final Object f6129c;

    public uc(int i3, Object obj, Object obj2) {
        this.f6127a = i3;
        this.f6128b = obj;
        this.f6129c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = 0;
        switch (this.f6127a) {
            case 0:
                wc wcVar = (wc) this.f6128b;
                wcVar.getClass();
                ((vc) this.f6129c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.f1();
                return;
            case 1:
                dh.a0 a0Var = (dh.a0) this.f6128b;
                ArrayList arrayList = (ArrayList) this.f6129c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i3 < arrayList.size()) {
                    dh.a0.g((View) arrayList.get(i3), floatValue);
                    i3++;
                }
                a0Var.f8941m.f45461l0.invalidate();
                return;
            case 2:
                ei.q qVar = (ei.q) this.f6128b;
                View view = (View) this.f6129c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                qVar.E.setAlpha(floatValue2);
                qVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f6128b;
                boolean[] zArr = (boolean[]) this.f6129c;
                int i10 = ProfileStoriesView.f42008t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (az.o() > 0) {
                        org.telegram.messenger.g0.c4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new d1(profileStoriesView, 27), 180L);
                    }
                }
                profileStoriesView.f42010a0 = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f6128b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f6129c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                mg.g gVar = (mg.g) this.f6128b;
                og.d dVar = (og.d) this.f6129c;
                gVar.getClass();
                dVar.f21072f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f19328b;
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    og.d dVar2 = (og.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f21072f = (int) ((dVar2.f21073g / 255.0f) * (255 - dVar.f21072f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                mg.g gVar2 = (mg.g) this.f6128b;
                og.b bVar = (og.b) this.f6129c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f19331c;
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    og.b bVar2 = (og.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f21060e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                mg.n nVar = (mg.n) this.f6128b;
                nVar.getClass();
                ((mg.o) this.f6129c).f19390r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                l5.c cVar = (l5.c) this.f6128b;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.f18043b = intValue;
                ((l5.b) this.f6129c).e(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.s0) this.f6128b).f30309c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.t0) this.f6129c).invalidate();
                return;
            case 10:
                wm wmVar = (wm) this.f6128b;
                wm wmVar2 = (wm) this.f6129c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.f51429oa = floatValue5;
                wmVar2.fragmentView.invalidate();
                wmVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                wmVar.f51433p1.setTranslationY(L);
                wmVar.f51433p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                wmVar2.f51433p1.setTranslationY(f12);
                wmVar2.f51433p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                wmVar.f51433p1.getAvatarImageView().setScaleX(f13);
                wmVar.f51433p1.getAvatarImageView().setScaleY(f13);
                wmVar.f51433p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                wmVar2.f51433p1.getAvatarImageView().setScaleX(f14);
                wmVar2.f51433p1.getAvatarImageView().setScaleY(f14);
                wmVar2.f51433p1.getAvatarImageView().setAlpha(f11);
                jg jgVar = wmVar2.f51252b1;
                if (jgVar != null) {
                    jgVar.setAlpha(f11);
                    return;
                }
                return;
            case 11:
                ln lnVar = (ln) this.f6128b;
                ArrayList arrayList4 = (ArrayList) this.f6129c;
                lnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lnVar.O.setAlpha(floatValue6);
                org.telegram.ui.Cells.l8 l8Var = lnVar.O;
                float f15 = 1.0f - floatValue6;
                l8Var.setTranslationY(((-l8Var.getHeight()) / 2.0f) * f15);
                lnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i3 < arrayList4.size()) {
                    ((View) arrayList4.get(i3)).setTranslationY((-lnVar.O.getHeight()) * f15);
                    i3++;
                }
                return;
            case 12:
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.f6128b;
                org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) this.f6129c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue7);
                k9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !k9Var2.getImageReceiver().I()) {
                    k9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.ra) this.f6128b).accept(Float.valueOf(((org.telegram.ui.Components.fb) this.f6129c).getTranslationY()));
                return;
            case 14:
                ((zk) this.f6128b).accept(Float.valueOf(((org.telegram.ui.Components.fb) this.f6129c).getTranslationY()));
                return;
            case 15:
                dh dhVar = (dh) this.f6128b;
                dhVar.getClass();
                ((xs) this.f6129c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bi biVar = dhVar.f33105d0;
                biVar.J1();
                th thVar = biVar.f32275t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
                if (thVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(biVar.f32231g4);
                    return;
                }
                return;
            case 16:
                b4.n nVar2 = (b4.n) this.f6128b;
                nVar2.getClass();
                ((org.telegram.messenger.t) this.f6129c).f25455b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i3 < ((ArrayList) nVar2.d).size()) {
                    if (!dh.d0.f8983b) {
                        ((View) ((ArrayList) nVar2.d).get(i3)).invalidate();
                    }
                    i3++;
                }
                return;
            case 17:
                ew0 ew0Var = (ew0) this.f6128b;
                dw0[] dw0VarArr = (dw0[]) this.f6129c;
                ew0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i3 < dw0VarArr.length) {
                    ew0Var.f33482c[i3] = (ew0Var.d[i3] * floatValue8) + ((1.0f - floatValue8) * ew0Var.f33483e[i3]);
                    i3++;
                }
                ew0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.f6128b;
                xVar.getClass();
                ((org.telegram.ui.Components.voip.r) this.f6129c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xVar.invalidate();
                return;
            case 19:
                View view2 = (View) this.f6128b;
                View view3 = (View) this.f6129c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                return;
            case 20:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.f6128b;
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f6129c;
                x0Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.c();
                int i11 = x0Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && j2Var.S) {
                    j2Var.R.pause();
                    AnimatorSet animatorSet = j2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f6128b;
                int i12 = u2Var.f39635e;
                u2Var.f39637g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (u2Var.f39634c - i12)) + i12);
                int i13 = u2Var.f39636f;
                u2Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (u2Var.d - i13)) + i13);
                ((org.telegram.ui.Components.voip.g2) this.f6129c).invalidate();
                return;
            case 22:
                uw.u1(((zu) this.f6128b).M, (tw) this.f6129c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f6128b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f6129c).invalidateOutline();
                ImageView imageView = photoViewer.f41591y3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                fq0 fq0Var = photoViewer.F2;
                if (fq0Var != null) {
                    fq0Var.invalidateOutline();
                    return;
                }
                return;
            case 24:
                kg kgVar = (kg) this.f6128b;
                int[] iArr = (int[]) this.f6129c;
                kgVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - kgVar.f2722b;
                ((tj0) kgVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                kgVar.f2722b = intValue2;
                return;
            case 25:
                cc1 cc1Var = (cc1) this.f6128b;
                cc1Var.getClass();
                cc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ai) this.f6129c).invalidate();
                return;
            case 26:
                ((View) ((g.b0) ((bb.c) this.f6128b).f3211b).d.getParent()).invalidate();
                return;
            case 27:
                rg.a aVar = (rg.a) this.f6128b;
                int[] iArr2 = (int[]) this.f6129c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f54507b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f54508c);
                paint.setShader(aVar.f54507b);
                aVar.f54506a.f23775r.put(0, paint);
                aVar.f54511g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f54510f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            default:
                ((u4.k) this.f6128b).P((u4.d1) this.f6129c);
                return;
        }
    }
}
