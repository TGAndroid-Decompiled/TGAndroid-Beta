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
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.e31;
import org.telegram.ui.ty;
import org.telegram.ui.uo;
import org.telegram.ui.uu0;
import org.telegram.ui.uy;
import org.telegram.ui.vi1;
import org.telegram.ui.xw;
import org.telegram.ui.y21;
import org.telegram.ui.zn;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1680a;
    public final Object f1681b;
    public final Object f1682c;

    public x(int i10, Object obj, Object obj2) {
        this.f1680a = i10;
        this.f1681b = obj;
        this.f1682c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1680a) {
            case 0:
                a0 a0Var = (a0) this.f1681b;
                View view = (View) this.f1682c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f506y.setAlpha(floatValue);
                a0Var.f506y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1681b;
                boolean[] zArr = (boolean[]) this.f1682c;
                int i11 = ProfileStoriesView.f31762s0;
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
                ((TextView) this.f1681b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1682c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1681b;
                kg.d dVar = (kg.d) this.f1682c;
                gVar.getClass();
                dVar.f13607f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f11133b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f13607f = (int) ((dVar2.f13608g / 255.0f) * (255 - dVar.f13607f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1681b;
                kg.b bVar = (kg.b) this.f1682c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f11136c;
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
                ig.n nVar = (ig.n) this.f1681b;
                nVar.getClass();
                ((ig.o) this.f1682c).f11192r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1681b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f11248a = intValue;
                ((ei.d5) this.f1682c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1681b).f21637c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1682c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1681b;
                int[] iArr = (int[]) this.f1682c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f15404b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f15405c);
                paint.setShader(aVar.f15404b);
                aVar.f15403a.setPaint(paint, 0);
                aVar.f15407g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f15406f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                zn znVar = (zn) this.f1681b;
                zn znVar2 = (zn) this.f1682c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.U9 = floatValue5;
                znVar2.fragmentView.invalidate();
                znVar2.f40488x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                znVar.f40201a1.setTranslationY(dp);
                znVar.f40201a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                znVar2.f40201a1.setTranslationY(f11);
                znVar2.f40201a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                znVar.f40201a1.getAvatarImageView().setScaleX(f12);
                znVar.f40201a1.getAvatarImageView().setScaleY(f12);
                znVar.f40201a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                znVar2.f40201a1.getAvatarImageView().setScaleX(f13);
                znVar2.f40201a1.getAvatarImageView().setScaleY(f13);
                znVar2.f40201a1.getAvatarImageView().setAlpha(f10);
                ch chVar = znVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                uo uoVar = (uo) this.f1681b;
                ArrayList arrayList3 = (ArrayList) this.f1682c;
                uoVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uoVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = uoVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                uoVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-uoVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f1681b;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f1682c;
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
                ((org.telegram.ui.Components.gb) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1682c).getTranslationY()));
                return;
            case 13:
                ((ml) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1682c).getTranslationY()));
                return;
            case 14:
                ai aiVar = (ai) this.f1681b;
                aiVar.getClass();
                ((bu) this.f1682c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.f22619c0;
                viVar.U1();
                ni niVar = viVar.f29082y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29033j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.f29040l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1681b;
                mVar.getClass();
                ((lu) this.f1682c).f26248b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.e0.f49272b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                py0 py0Var = (py0) this.f1681b;
                oy0[] oy0VarArr = (oy0[]) this.f1682c;
                py0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < oy0VarArr.length) {
                    py0Var.f27355c[i10] = (py0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * py0Var.e[i10]);
                    i10++;
                }
                py0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f1681b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f1682c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1682c;
                View view3 = (View) this.f1681b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f1681b;
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f1682c;
                q1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q1Var.c();
                int i12 = q1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && c3Var.R) {
                    c3Var.Q.pause();
                    AnimatorSet animatorSet = c3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.o3 o3Var = (org.telegram.ui.Components.voip.o3) this.f1681b;
                int i13 = o3Var.e;
                o3Var.f29422g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f29420c - i13)) + i13);
                int i14 = o3Var.f29421f;
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.z2) this.f1682c).invalidate();
                return;
            case 21:
                uy.q1(((xw) this.f1681b).M, (ty) this.f1682c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1681b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1682c).invalidateOutline();
                ImageView imageView = photoViewer.f31353x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                uu0 uu0Var = photoViewer.E2;
                if (uu0Var != null) {
                    uu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                e31 e31Var = (e31) this.f1681b;
                int[] iArr2 = (int[]) this.f1682c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lc0 lc0Var = e31Var.f33162n;
                if (lc0Var != null) {
                    lc0Var.K = 1.0f;
                    lc0Var.i();
                    e31Var.f33162n.s(1.0f - floatValue10);
                }
                lc0 lc0Var2 = e31Var.h;
                lc0Var2.K = floatValue10;
                lc0Var2.i();
                e31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, e31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, e31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, e31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, e31Var.e[3], iArr2[3]);
                    y21 y21Var = e31Var.E;
                    y21Var.f39681a.n(d, d10, d11, d12);
                    y21Var.invalidate();
                }
                e31Var.f33165w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1681b;
                int[] iArr3 = (int[]) this.f1682c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f277b;
                ((wl0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f277b = intValue2;
                return;
            case 25:
                vi1 vi1Var = (vi1) this.f1681b;
                vi1Var.getClass();
                vi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ui) this.f1682c).invalidate();
                return;
            case 26:
                qg.a2 a2Var = (qg.a2) this.f1681b;
                boolean[] zArr2 = (boolean[]) this.f1682c;
                a2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    a2Var.setRotationY(90.0f * f16);
                    a2Var.f41557z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a2Var.f41549r0.b(a2Var.f41556y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f17) * (-90.0f));
                a2Var.f41557z0 = (f17 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
            case 27:
                al0 al0Var = (al0) this.f1681b;
                al0Var.getClass();
                ((Drawable) this.f1682c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.k1) al0Var.f22650c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1681b).P((s4.c1) this.f1682c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1680a = 18;
        this.f1682c = view;
        this.f1681b = view2;
    }
}
