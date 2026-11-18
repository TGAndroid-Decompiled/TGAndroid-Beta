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
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.voip.i3;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.xa;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.gv;
import org.telegram.ui.kc1;
import org.telegram.ui.pq0;
import org.telegram.ui.rn;
import tg.q1;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f5524a;
    public final Object f5525b;
    public final Object f5526c;

    public w(int i7, Object obj, Object obj2) {
        this.f5524a = i7;
        this.f5525b = obj;
        this.f5526c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.f5524a) {
            case 0:
                b0 b0Var = (b0) this.f5525b;
                ArrayList arrayList = (ArrayList) this.f5526c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.f5304m.f51404l0.invalidate();
                return;
            case 1:
                oc ocVar = (oc) this.f5525b;
                ocVar.getClass();
                ((nc) this.f5526c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.f1();
                return;
            case 2:
                fi.p pVar = (fi.p) this.f5525b;
                View view = (View) this.f5526c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.E.setAlpha(floatValue2);
                pVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f5525b;
                boolean[] zArr = (boolean[]) this.f5526c;
                int i10 = ProfileStoriesView.f43797t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (bz.o() > 0) {
                        org.telegram.messenger.g0.a4(profileStoriesView);
                        org.telegram.messenger.g0.h3(new f2.a(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.f43799a0 = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f5525b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f5526c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                lg.g gVar = (lg.g) this.f5525b;
                ng.d dVar = (ng.d) this.f5526c;
                gVar.getClass();
                dVar.f21486f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f19785b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f21486f = (int) ((dVar2.f21487g / 255.0f) * (255 - dVar.f21486f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                lg.g gVar2 = (lg.g) this.f5525b;
                ng.b bVar = (ng.b) this.f5526c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f19788c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f21474e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                lg.n nVar = (lg.n) this.f5525b;
                nVar.getClass();
                ((lg.o) this.f5526c).f19848r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                m5.b bVar3 = (m5.b) this.f5525b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f20832b = intValue;
                ((ki.e) this.f5526c).c(intValue);
                return;
            case 9:
                bn bnVar = (bn) this.f5525b;
                bn bnVar2 = (bn) this.f5526c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.f46156ra = floatValue5;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                bnVar.f46120p1.setTranslationY(L);
                bnVar.f46120p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                bnVar2.f46120p1.setTranslationY(f12);
                bnVar2.f46120p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                bnVar.f46120p1.getAvatarImageView().setScaleX(f13);
                bnVar.f46120p1.getAvatarImageView().setScaleY(f13);
                bnVar.f46120p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                bnVar2.f46120p1.getAvatarImageView().setScaleX(f14);
                bnVar2.f46120p1.getAvatarImageView().setScaleY(f14);
                bnVar2.f46120p1.getAvatarImageView().setAlpha(f11);
                ah ahVar = bnVar2.f45939b1;
                if (ahVar != null) {
                    ahVar.setAlpha(f11);
                    return;
                }
                return;
            case 10:
                rn rnVar = (rn) this.f5525b;
                ArrayList arrayList4 = (ArrayList) this.f5526c;
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
                q9 q9Var = (q9) this.f5525b;
                q9 q9Var2 = (q9) this.f5526c;
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
                ((xa) this.f5525b).accept(Float.valueOf(((lb) this.f5526c).getTranslationY()));
                return;
            case 13:
                ((pl) this.f5525b).accept(Float.valueOf(((lb) this.f5526c).getTranslationY()));
                return;
            case 14:
                vh vhVar = (vh) this.f5525b;
                vhVar.getClass();
                ((mt) this.f5526c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                si siVar = vhVar.f40630d0;
                siVar.K1();
                ki kiVar = siVar.f39732w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
                if (kiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(siVar.f39686j4);
                    return;
                }
                return;
            case 15:
                ab.q qVar = (ab.q) this.f5525b;
                qVar.getClass();
                ((org.telegram.messenger.t) this.f5526c).f26911b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!f0.f5351b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                return;
            case 16:
                pw0 pw0Var = (pw0) this.f5525b;
                ow0[] ow0VarArr = (ow0[]) this.f5526c;
                pw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < ow0VarArr.length) {
                    pw0Var.f38582c[i7] = (pw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * pw0Var.f38583e[i7]);
                    i7++;
                }
                pw0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f5525b;
                k0Var.getClass();
                ((org.telegram.ui.Components.voip.y) this.f5526c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f5525b;
                View view3 = (View) this.f5526c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                return;
            case 19:
                x2 x2Var = (x2) this.f5525b;
                l1 l1Var = (l1) this.f5526c;
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
                i3 i3Var = (i3) this.f5525b;
                int i12 = i3Var.f40932e;
                i3Var.f40934g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.f40931c - i12)) + i12);
                int i13 = i3Var.f40933f;
                i3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (i3Var.d - i13)) + i13);
                ((u2) this.f5526c).invalidate();
                return;
            case 21:
                cx.v1(((gv) this.f5525b).M, (bx) this.f5526c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f5525b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f5526c).invalidateOutline();
                ImageView imageView = photoViewer.f43369x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                a8.xa xaVar = (a8.xa) this.f5525b;
                int[] iArr = (int[]) this.f5526c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - xaVar.f713b;
                ((ck0) xaVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                xaVar.f713b = intValue2;
                return;
            case 24:
                kc1 kc1Var = (kc1) this.f5525b;
                kc1Var.getClass();
                kc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ri) this.f5526c).invalidate();
                return;
            case 25:
                ((u0) this.f5525b).f31869c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f5526c).invalidate();
                return;
            case 26:
                qg.a aVar = (qg.a) this.f5525b;
                int[] iArr2 = (int[]) this.f5526c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f56135b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f56136c);
                paint.setShader(aVar.f56135b);
                aVar.f56134a.f25498r.put(0, paint);
                aVar.f56139g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f56138f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.b0) ((cb.c) this.f5525b).f5151b).d.getParent()).invalidate();
                return;
            default:
                q1 q1Var = (q1) this.f5525b;
                boolean[] zArr2 = (boolean[]) this.f5526c;
                q1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f17 = floatValue11 / 0.5f;
                    q1Var.setRotationY(90.0f * f17);
                    q1Var.A0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    q1Var.f58095s0.b(q1Var.f58102z0, false);
                }
                float f18 = (floatValue11 - 0.5f) / 0.5f;
                q1Var.setRotationY((1.0f - f18) * (-90.0f));
                q1Var.A0 = (f18 * 0.3f) + 0.7f;
                q1Var.invalidate();
                return;
        }
    }
}
