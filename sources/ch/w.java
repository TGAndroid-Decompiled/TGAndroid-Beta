package ch;

import a8.xa;
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
import kg.f1;
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fv;
import org.telegram.ui.ic1;
import org.telegram.ui.pq0;
import org.telegram.ui.rn;
import tg.v1;
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
                b0Var.f5299m.f51253l0.invalidate();
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
                int i10 = ProfileStoriesView.f43923t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (bz.o() > 0) {
                        org.telegram.messenger.g0.a4(profileStoriesView);
                        org.telegram.messenger.g0.h3(new f2.a(profileStoriesView, 8), 180L);
                    }
                }
                profileStoriesView.f43925a0 = Math.max(1.0f, floatValue3);
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
                dVar.f21582f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f19882b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f21582f = (int) ((dVar2.f21583g / 255.0f) * (255 - dVar.f21582f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                lg.g gVar2 = (lg.g) this.f5520b;
                ng.b bVar = (ng.b) this.f5521c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f19885c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f21570e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                lg.n nVar = (lg.n) this.f5520b;
                nVar.getClass();
                ((lg.o) this.f5521c).f19945r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                m5.b bVar3 = (m5.b) this.f5520b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f20925b = intValue;
                ((f1) this.f5521c).c(intValue);
                return;
            case 9:
                bn bnVar = (bn) this.f5520b;
                bn bnVar2 = (bn) this.f5521c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.f46351ra = floatValue5;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                bnVar.f46315p1.setTranslationY(L);
                bnVar.f46315p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                bnVar2.f46315p1.setTranslationY(f12);
                bnVar2.f46315p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                bnVar.f46315p1.getAvatarImageView().setScaleX(f13);
                bnVar.f46315p1.getAvatarImageView().setScaleY(f13);
                bnVar.f46315p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                bnVar2.f46315p1.getAvatarImageView().setScaleX(f14);
                bnVar2.f46315p1.getAvatarImageView().setScaleY(f14);
                bnVar2.f46315p1.getAvatarImageView().setAlpha(f11);
                bh bhVar = bnVar2.f46134b1;
                if (bhVar != null) {
                    bhVar.setAlpha(f11);
                    return;
                }
                return;
            case 10:
                rn rnVar = (rn) this.f5520b;
                ArrayList arrayList4 = (ArrayList) this.f5521c;
                rnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.O.setAlpha(floatValue6);
                m8 m8Var = rnVar.O;
                float f15 = 1.0f - floatValue6;
                m8Var.setTranslationY(((-m8Var.getHeight()) / 2.0f) * f15);
                rnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-rnVar.O.getHeight()) * f15);
                    i7++;
                }
                return;
            case 11:
                p9 p9Var = (p9) this.f5520b;
                p9 p9Var2 = (p9) this.f5521c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue7);
                p9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !p9Var2.getImageReceiver().J()) {
                    p9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((wa) this.f5520b).accept(Float.valueOf(((kb) this.f5521c).getTranslationY()));
                return;
            case 13:
                ((pl) this.f5520b).accept(Float.valueOf(((kb) this.f5521c).getTranslationY()));
                return;
            case 14:
                wh whVar = (wh) this.f5520b;
                whVar.getClass();
                ((mt) this.f5521c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = whVar.f41655d0;
                tiVar.K1();
                li liVar = tiVar.f40029w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(tiVar.f39983j4);
                    return;
                }
                return;
            case 15:
                ab.q qVar = (ab.q) this.f5520b;
                qVar.getClass();
                ((org.telegram.messenger.t) this.f5521c).f27011b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!f0.f5346b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                return;
            case 16:
                qw0 qw0Var = (qw0) this.f5520b;
                pw0[] pw0VarArr = (pw0[]) this.f5521c;
                qw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < pw0VarArr.length) {
                    qw0Var.f39008c[i7] = (qw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * qw0Var.f39009e[i7]);
                    i7++;
                }
                qw0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f5520b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.z) this.f5521c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
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
                y2 y2Var = (y2) this.f5520b;
                m1 m1Var = (m1) this.f5521c;
                m1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m1Var.c();
                int i11 = m1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && y2Var.S) {
                    y2Var.R.pause();
                    AnimatorSet animatorSet = y2Var.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                j3 j3Var = (j3) this.f5520b;
                int i12 = j3Var.f40963e;
                j3Var.f40965g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.f40962c - i12)) + i12);
                int i13 = j3Var.f40964f;
                j3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.d - i13)) + i13);
                ((v2) this.f5521c).invalidate();
                return;
            case 21:
                bx.v1(((fv) this.f5520b).M, (ax) this.f5521c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f5520b;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f5521c).invalidateOutline();
                ImageView imageView = photoViewer.f43495x3;
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
                xa xaVar = (xa) this.f5520b;
                int[] iArr = (int[]) this.f5521c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - xaVar.f713b;
                ((ek0) xaVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                xaVar.f713b = intValue2;
                return;
            case 24:
                ic1 ic1Var = (ic1) this.f5520b;
                ic1Var.getClass();
                ic1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((si) this.f5521c).invalidate();
                return;
            case 25:
                ((u0) this.f5520b).f31950c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f5521c).invalidate();
                return;
            case 26:
                qg.a aVar = (qg.a) this.f5520b;
                int[] iArr2 = (int[]) this.f5521c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f56258b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f56259c);
                paint.setShader(aVar.f56258b);
                aVar.f56257a.f25421r.put(0, paint);
                aVar.f56262g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f56261f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.b0) ((cb.c) this.f5520b).f5146b).d.getParent()).invalidate();
                return;
            default:
                v1 v1Var = (v1) this.f5520b;
                boolean[] zArr2 = (boolean[]) this.f5521c;
                v1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f17 = floatValue11 / 0.5f;
                    v1Var.setRotationY(90.0f * f17);
                    v1Var.B0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    v1Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    v1Var.f58269t0.b(v1Var.A0, false);
                }
                float f18 = (floatValue11 - 0.5f) / 0.5f;
                v1Var.setRotationY((1.0f - f18) * (-90.0f));
                v1Var.B0 = (f18 * 0.3f) + 0.7f;
                v1Var.invalidate();
                return;
        }
    }
}
