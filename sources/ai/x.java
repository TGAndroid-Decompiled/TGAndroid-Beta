package ai;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mu0;
import org.telegram.ui.pi1;
import org.telegram.ui.py;
import org.telegram.ui.q21;
import org.telegram.ui.qy;
import org.telegram.ui.ro;
import org.telegram.ui.tw;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1675a;
    public final Object f1676b;
    public final Object f1677c;

    public x(int i10, Object obj, Object obj2) {
        this.f1675a = i10;
        this.f1676b = obj;
        this.f1677c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1675a) {
            case 0:
                a0 a0Var = (a0) this.f1676b;
                View view = (View) this.f1677c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f503y.setAlpha(floatValue);
                a0Var.f503y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1676b;
                boolean[] zArr = (boolean[]) this.f1677c;
                int i11 = ProfileStoriesView.f31790s0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue2 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue2);
                profileStoriesView.invalidate();
                return;
            case 2:
                ((TextView) this.f1676b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1677c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1676b;
                kg.d dVar = (kg.d) this.f1677c;
                gVar.getClass();
                dVar.f13594f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f11120b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f13594f = (int) ((dVar2.f13595g / 255.0f) * (255 - dVar.f13594f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1676b;
                kg.b bVar = (kg.b) this.f1677c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f11123c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    kg.b bVar2 = (kg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue3 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue3) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                return;
            case 5:
                ig.n nVar = (ig.n) this.f1676b;
                nVar.getClass();
                ((ig.o) this.f1677c).f11179r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1676b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f11234a = intValue;
                ((ei.d5) this.f1677c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1676b).f21658c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1677c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1676b;
                int[] iArr = (int[]) this.f1677c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f15432b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f15433c);
                paint.setShader(aVar.f15432b);
                aVar.f15431a.setPaint(paint, 0);
                aVar.f15435g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f15434f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                wn wnVar = (wn) this.f1676b;
                wn wnVar2 = (wn) this.f1677c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.U9 = floatValue5;
                wnVar2.fragmentView.invalidate();
                wnVar2.f39680x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                wnVar.f39394a1.setTranslationY(dp);
                wnVar.f39394a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                wnVar2.f39394a1.setTranslationY(f11);
                wnVar2.f39394a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                wnVar.f39394a1.getAvatarImageView().setScaleX(f12);
                wnVar.f39394a1.getAvatarImageView().setScaleY(f12);
                wnVar.f39394a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                wnVar2.f39394a1.getAvatarImageView().setScaleX(f13);
                wnVar2.f39394a1.getAvatarImageView().setScaleY(f13);
                wnVar2.f39394a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = wnVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                ro roVar = (ro) this.f1676b;
                ArrayList arrayList3 = (ArrayList) this.f1677c;
                roVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = roVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                roVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-roVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f1676b;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f1677c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue7);
                w9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.gb) this.f1676b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1677c).getTranslationY()));
                return;
            case 13:
                ((nl) this.f1676b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1677c).getTranslationY()));
                return;
            case 14:
                bi biVar = (bi) this.f1676b;
                biVar.getClass();
                ((cu) this.f1677c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                wi wiVar = biVar.f22989c0;
                wiVar.U1();
                oi oiVar = wiVar.f30046y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29997j0;
                if (oiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(wiVar.f30004l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1676b;
                mVar.getClass();
                ((mu) this.f1677c).f26575b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.e0.f49280b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                ny0 ny0Var = (ny0) this.f1676b;
                my0[] my0VarArr = (my0[]) this.f1677c;
                ny0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < my0VarArr.length) {
                    ny0Var.f26822c[i10] = (ny0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * ny0Var.e[i10]);
                    i10++;
                }
                ny0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f1676b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f1677c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1677c;
                View view3 = (View) this.f1676b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f1676b;
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f1677c;
                r1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r1Var.c();
                int i12 = r1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && d3Var.R) {
                    d3Var.Q.pause();
                    AnimatorSet animatorSet = d3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.p3 p3Var = (org.telegram.ui.Components.voip.p3) this.f1676b;
                int i13 = p3Var.e;
                p3Var.f29548g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f29546c - i13)) + i13);
                int i14 = p3Var.f29547f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.a3) this.f1677c).invalidate();
                return;
            case 21:
                qy.q1(((tw) this.f1676b).M, (py) this.f1677c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1676b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1677c).invalidateOutline();
                ImageView imageView = photoViewer.f31381x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                mu0 mu0Var = photoViewer.E2;
                if (mu0Var != null) {
                    mu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                w21 w21Var = (w21) this.f1676b;
                int[] iArr2 = (int[]) this.f1677c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc0 mc0Var = w21Var.f38861n;
                if (mc0Var != null) {
                    mc0Var.K = 1.0f;
                    mc0Var.i();
                    w21Var.f38861n.s(1.0f - floatValue10);
                }
                mc0 mc0Var2 = w21Var.h;
                mc0Var2.K = floatValue10;
                mc0Var2.i();
                w21Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, w21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, w21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, w21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, w21Var.e[3], iArr2[3]);
                    q21 q21Var = w21Var.E;
                    q21Var.f36722a.n(d, d10, d11, d12);
                    q21Var.invalidate();
                }
                w21Var.f38864w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1676b;
                int[] iArr3 = (int[]) this.f1677c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f277b;
                ((wl0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f277b = intValue2;
                return;
            case 25:
                pi1 pi1Var = (pi1) this.f1676b;
                pi1Var.getClass();
                pi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((vi) this.f1677c).invalidate();
                return;
            case 26:
                qg.b2 b2Var = (qg.b2) this.f1676b;
                boolean[] zArr2 = (boolean[]) this.f1677c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f16);
                    b2Var.f41583z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b2Var.f41575r0.b(b2Var.f41582y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f17) * (-90.0f));
                b2Var.f41583z0 = (f17 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
            case 27:
                al0 al0Var = (al0) this.f1676b;
                al0Var.getClass();
                ((Drawable) this.f1677c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.k1) al0Var.f22708c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1676b).P((s4.c1) this.f1677c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1675a = 18;
        this.f1677c = view;
        this.f1676b = view2;
    }
}
