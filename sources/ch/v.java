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
import di.jc;
import di.kc;
import fi.c1;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.voip.j3;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.dv;
import org.telegram.ui.hc1;
import org.telegram.ui.nq0;
import org.telegram.ui.qn;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
import tg.q1;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f5239a;
    public final Object f5240b;
    public final Object f5241c;

    public v(int i7, Object obj, Object obj2) {
        this.f5239a = i7;
        this.f5240b = obj;
        this.f5241c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.f5239a) {
            case 0:
                b0 b0Var = (b0) this.f5240b;
                ArrayList arrayList = (ArrayList) this.f5241c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.f5021m.f49391l0.invalidate();
                return;
            case 1:
                kc kcVar = (kc) this.f5240b;
                kcVar.getClass();
                ((jc) this.f5241c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f1();
                return;
            case 2:
                fi.p pVar = (fi.p) this.f5240b;
                View view = (View) this.f5241c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.E.setAlpha(floatValue2);
                pVar.E.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f5240b;
                boolean[] zArr = (boolean[]) this.f5241c;
                int i10 = ProfileStoriesView.f43351t0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (gz.o() > 0) {
                        org.telegram.messenger.g0.b4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new c1(profileStoriesView, 5), 180L);
                    }
                }
                profileStoriesView.f43353a0 = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f5240b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f5241c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                lg.g gVar = (lg.g) this.f5240b;
                ng.d dVar = (ng.d) this.f5241c;
                gVar.getClass();
                dVar.f21125f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f19421b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f21125f = (int) ((dVar2.f21126g / 255.0f) * (255 - dVar.f21125f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                lg.g gVar2 = (lg.g) this.f5240b;
                ng.b bVar = (ng.b) this.f5241c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f19424c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f21113e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                lg.n nVar = (lg.n) this.f5240b;
                nVar.getClass();
                ((lg.o) this.f5241c).f19484r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                m5.b bVar3 = (m5.b) this.f5240b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f20471b = intValue;
                ((ki.e) this.f5241c).d(intValue);
                return;
            case 9:
                an anVar = (an) this.f5240b;
                an anVar2 = (an) this.f5241c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.f45335qa = floatValue5;
                anVar2.fragmentView.invalidate();
                anVar2.A0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                anVar.f45313p1.setTranslationY(L);
                anVar.f45313p1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                anVar2.f45313p1.setTranslationY(f12);
                anVar2.f45313p1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                anVar.f45313p1.getAvatarImageView().setScaleX(f13);
                anVar.f45313p1.getAvatarImageView().setScaleY(f13);
                anVar.f45313p1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                anVar2.f45313p1.getAvatarImageView().setScaleX(f14);
                anVar2.f45313p1.getAvatarImageView().setScaleY(f14);
                anVar2.f45313p1.getAvatarImageView().setAlpha(f11);
                rg rgVar = anVar2.f45133b1;
                if (rgVar != null) {
                    rgVar.setAlpha(f11);
                    return;
                }
                return;
            case 10:
                qn qnVar = (qn) this.f5240b;
                ArrayList arrayList4 = (ArrayList) this.f5241c;
                qnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.O.setAlpha(floatValue6);
                l8 l8Var = qnVar.O;
                float f15 = 1.0f - floatValue6;
                l8Var.setTranslationY(((-l8Var.getHeight()) / 2.0f) * f15);
                qnVar.O.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-qnVar.O.getHeight()) * f15);
                    i7++;
                }
                return;
            case 11:
                i9 i9Var = (i9) this.f5240b;
                i9 i9Var2 = (i9) this.f5241c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.setScaleX(floatValue7);
                i9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !i9Var2.getImageReceiver().I()) {
                    i9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((oa) this.f5240b).accept(Float.valueOf(((cb) this.f5241c).getTranslationY()));
                return;
            case 13:
                ((il) this.f5240b).accept(Float.valueOf(((cb) this.f5241c).getTranslationY()));
                return;
            case 14:
                nh nhVar = (nh) this.f5240b;
                nhVar.getClass();
                ((ft) this.f5241c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ki kiVar = nhVar.f37605d0;
                kiVar.J1();
                ci ciVar = kiVar.f36497w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(kiVar.f36451j4);
                    return;
                }
                return;
            case 15:
                ab.q qVar = (ab.q) this.f5240b;
                qVar.getClass();
                ((org.telegram.messenger.t) this.f5241c).f26607b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!f0.f5068b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                return;
            case 16:
                iw0 iw0Var = (iw0) this.f5240b;
                hw0[] hw0VarArr = (hw0[]) this.f5241c;
                iw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < hw0VarArr.length) {
                    iw0Var.f35735c[i7] = (iw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * iw0Var.f35736e[i7]);
                    i7++;
                }
                iw0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f5240b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.z) this.f5241c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f5240b;
                View view3 = (View) this.f5241c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                return;
            case 19:
                y2 y2Var = (y2) this.f5240b;
                m1 m1Var = (m1) this.f5241c;
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
                j3 j3Var = (j3) this.f5240b;
                int i12 = j3Var.f40687e;
                j3Var.f40689g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.f40686c - i12)) + i12);
                int i13 = j3Var.f40688f;
                j3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (j3Var.d - i13)) + i13);
                ((v2) this.f5241c).invalidate();
                return;
            case 21:
                yw.u1(((dv) this.f5240b).M, (xw) this.f5241c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f5240b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f5241c).invalidateOutline();
                ImageView imageView = photoViewer.f42924x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                nq0 nq0Var = photoViewer.F2;
                if (nq0Var != null) {
                    nq0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                xa xaVar = (xa) this.f5240b;
                int[] iArr = (int[]) this.f5241c;
                xaVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - xaVar.f713b;
                ((uj0) xaVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                xaVar.f713b = intValue2;
                return;
            case 24:
                hc1 hc1Var = (hc1) this.f5240b;
                hc1Var.getClass();
                hc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ji) this.f5241c).invalidate();
                return;
            case 25:
                ((org.telegram.ui.Cells.s0) this.f5240b).f31385c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.t0) this.f5241c).invalidate();
                return;
            case 26:
                qg.a aVar = (qg.a) this.f5240b;
                int[] iArr2 = (int[]) this.f5241c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f55561b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f55562c);
                paint.setShader(aVar.f55561b);
                aVar.f55560a.f26041r.put(0, paint);
                aVar.f55565g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f55564f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.b0) ((ob.c) this.f5240b).f21417b).d.getParent()).invalidate();
                return;
            default:
                q1 q1Var = (q1) this.f5240b;
                boolean[] zArr2 = (boolean[]) this.f5241c;
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
                    q1Var.f57527s0.b(q1Var.f57534z0, false);
                }
                float f18 = (floatValue11 - 0.5f) / 0.5f;
                q1Var.setRotationY((1.0f - f18) * (-90.0f));
                q1Var.A0 = (f18 * 0.3f) + 0.7f;
                q1Var.invalidate();
                return;
        }
    }
}
