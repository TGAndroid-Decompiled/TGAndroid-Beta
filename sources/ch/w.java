package ch;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import di.nc;
import di.oc;
import java.util.ArrayList;
import kg.y1;
import org.telegram.messenger.cz;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.gv;
import org.telegram.ui.kc1;
import org.telegram.ui.qq0;
import org.telegram.ui.rn;
import tg.s1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f5519a;
    public final Object f5520b;
    public final Object f5521c;

    public w(int i7, Object obj, Object obj2) {
        this.f5519a = i7;
        this.f5520b = obj;
        this.f5521c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.f5519a) {
            case 0:
                b0 b0Var = (b0) this.f5520b;
                ArrayList arrayList = (ArrayList) this.f5521c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.f5299m.f51428l0.invalidate();
                return;
            case 1:
                oc ocVar = (oc) this.f5520b;
                ocVar.getClass();
                ((nc) this.f5521c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.f1();
                return;
            case 2:
                fi.p pVar = (fi.p) this.f5520b;
                View view = (View) this.f5521c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.E.setAlpha(floatValue2);
                pVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f5520b;
                boolean[] zArr = (boolean[]) this.f5521c;
                int i10 = ProfileStoriesView.f43807t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (cz.o() > 0) {
                        org.telegram.messenger.g0.a4(profileStoriesView);
                        org.telegram.messenger.g0.h3(new f2.a(profileStoriesView, 8), 180L);
                    }
                }
                profileStoriesView.f43809a0 = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f5520b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f5521c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                lg.g gVar = (lg.g) this.f5520b;
                ng.d dVar = (ng.d) this.f5521c;
                gVar.getClass();
                dVar.f21483f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f19782b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f21483f = (int) ((dVar2.f21484g / 255.0f) * (255 - dVar.f21483f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                lg.g gVar2 = (lg.g) this.f5520b;
                ng.b bVar = (ng.b) this.f5521c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f19785c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f21471e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                lg.n nVar = (lg.n) this.f5520b;
                nVar.getClass();
                ((lg.o) this.f5521c).f19845r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                m5.b bVar3 = (m5.b) this.f5520b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f20829b = intValue;
                ((y1) this.f5521c).c(intValue);
                return;
            case 9:
                bn bnVar = (bn) this.f5520b;
                bn bnVar2 = (bn) this.f5521c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.f46136ra = floatValue5;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                bnVar.f46100p1.setTranslationY(L);
                bnVar.f46100p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                bnVar2.f46100p1.setTranslationY(f12);
                bnVar2.f46100p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                bnVar.f46100p1.getAvatarImageView().setScaleX(f13);
                bnVar.f46100p1.getAvatarImageView().setScaleY(f13);
                bnVar.f46100p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                bnVar2.f46100p1.getAvatarImageView().setScaleX(f14);
                bnVar2.f46100p1.getAvatarImageView().setScaleY(f14);
                bnVar2.f46100p1.getAvatarImageView().setAlpha(f11);
                ch chVar = bnVar2.f45919b1;
                if (chVar != null) {
                    chVar.setAlpha(f11);
                    return;
                }
                return;
            case 10:
                rn rnVar = (rn) this.f5520b;
                ArrayList arrayList4 = (ArrayList) this.f5521c;
                rnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.O.setAlpha(floatValue6);
                n8 n8Var = rnVar.O;
                float f15 = 1.0f - floatValue6;
                n8Var.setTranslationY(((-n8Var.getHeight()) / 2.0f) * f15);
                rnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-rnVar.O.getHeight()) * f15);
                    i7++;
                }
                return;
            case 11:
                q9 q9Var = (q9) this.f5520b;
                q9 q9Var2 = (q9) this.f5521c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.setScaleX(floatValue7);
                q9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !q9Var2.getImageReceiver().I()) {
                    q9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((xa) this.f5520b).accept(Float.valueOf(((lb) this.f5521c).getTranslationY()));
                return;
            case 13:
                ((rl) this.f5520b).accept(Float.valueOf(((lb) this.f5521c).getTranslationY()));
                return;
            case 14:
                xh xhVar = (xh) this.f5520b;
                xhVar.getClass();
                ((ot) this.f5521c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ui uiVar = xhVar.f42048d0;
                uiVar.K1();
                mi miVar = uiVar.f40425w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40363e2;
                if (miVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(uiVar.f40379j4);
                    return;
                }
                return;
            case 15:
                ab.q qVar = (ab.q) this.f5520b;
                qVar.getClass();
                ((org.telegram.messenger.t) this.f5521c).f26893b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!f0.f5346b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                return;
            case 16:
                rw0 rw0Var = (rw0) this.f5520b;
                qw0[] qw0VarArr = (qw0[]) this.f5521c;
                rw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < qw0VarArr.length) {
                    rw0Var.f39314c[i7] = (rw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * rw0Var.f39315e[i7]);
                    i7++;
                }
                rw0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f5520b;
                k0Var.getClass();
                ((org.telegram.ui.Components.voip.y) this.f5521c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f5520b;
                View view3 = (View) this.f5521c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                return;
            case 19:
                x2 x2Var = (x2) this.f5520b;
                l1 l1Var = (l1) this.f5521c;
                l1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l1Var.c();
                int i11 = l1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && x2Var.S) {
                    x2Var.R.pause();
                    AnimatorSet animatorSet = x2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                i3 i3Var = (i3) this.f5520b;
                int i12 = i3Var.f41030e;
                i3Var.f41032g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.f41029c - i12)) + i12);
                int i13 = i3Var.f41031f;
                i3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.d - i13)) + i13);
                ((u2) this.f5521c).invalidate();
                return;
            case 21:
                cx.v1(((gv) this.f5520b).M, (bx) this.f5521c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f5520b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f5521c).invalidateOutline();
                ImageView imageView = photoViewer.f43379x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                qq0 qq0Var = photoViewer.F2;
                if (qq0Var != null) {
                    qq0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                a8.xa xaVar = (a8.xa) this.f5520b;
                int[] iArr = (int[]) this.f5521c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - xaVar.f713b;
                ((ek0) xaVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                xaVar.f713b = intValue2;
                return;
            case 24:
                kc1 kc1Var = (kc1) this.f5520b;
                kc1Var.getClass();
                kc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ti) this.f5521c).invalidate();
                return;
            case 25:
                ((u0) this.f5520b).f31866c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f5521c).invalidate();
                return;
            case 26:
                qg.a aVar = (qg.a) this.f5520b;
                int[] iArr2 = (int[]) this.f5521c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f56145b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f56146c);
                paint.setShader(aVar.f56145b);
                aVar.f56144a.f25668r.put(0, paint);
                aVar.f56149g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f56148f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.b0) ((cb.c) this.f5520b).f5146b).d.getParent()).invalidate();
                return;
            default:
                s1 s1Var = (s1) this.f5520b;
                boolean[] zArr2 = (boolean[]) this.f5521c;
                s1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f17 = floatValue11 / 0.5f;
                    s1Var.setRotationY(90.0f * f17);
                    s1Var.A0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    s1Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    s1Var.f58127s0.b(s1Var.f58134z0, false);
                }
                float f18 = (floatValue11 - 0.5f) / 0.5f;
                s1Var.setRotationY((1.0f - f18) * (-90.0f));
                s1Var.A0 = (f18 * 0.3f) + 0.7f;
                s1Var.invalidate();
                return;
        }
    }
}
