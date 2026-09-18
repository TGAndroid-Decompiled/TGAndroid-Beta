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
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a31;
import org.telegram.ui.bo;
import org.telegram.ui.g31;
import org.telegram.ui.vy;
import org.telegram.ui.wi1;
import org.telegram.ui.wo;
import org.telegram.ui.wu0;
import org.telegram.ui.wy;
import org.telegram.ui.zw;
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
                int i11 = ProfileStoriesView.f31535s0;
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
                dVar.f13609f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f11133b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f13609f = (int) ((dVar2.f13610g / 255.0f) * (255 - dVar.f13609f));
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
                ((org.telegram.ui.Cells.v0) this.f1681b).f21469c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1682c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1681b;
                int[] iArr = (int[]) this.f1682c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f15230b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f15231c);
                paint.setShader(aVar.f15230b);
                aVar.f15229a.setPaint(paint, 0);
                aVar.f15233g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f15232f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                bo boVar = (bo) this.f1681b;
                bo boVar2 = (bo) this.f1682c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.U9 = floatValue5;
                boVar2.fragmentView.invalidate();
                boVar2.f32506x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                boVar.f32219a1.setTranslationY(dp);
                boVar.f32219a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                boVar2.f32219a1.setTranslationY(f11);
                boVar2.f32219a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                boVar.f32219a1.getAvatarImageView().setScaleX(f12);
                boVar.f32219a1.getAvatarImageView().setScaleY(f12);
                boVar.f32219a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                boVar2.f32219a1.getAvatarImageView().setScaleX(f13);
                boVar2.f32219a1.getAvatarImageView().setScaleY(f13);
                boVar2.f32219a1.getAvatarImageView().setAlpha(f10);
                bh bhVar = boVar2.M0;
                if (bhVar != null) {
                    bhVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                wo woVar = (wo) this.f1681b;
                ArrayList arrayList3 = (ArrayList) this.f1682c;
                woVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                woVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = woVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                woVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-woVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.f1681b;
                org.telegram.ui.Components.u9 u9Var2 = (org.telegram.ui.Components.u9) this.f1682c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue7);
                u9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !u9Var2.getImageReceiver().hasBitmapImage()) {
                    u9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.eb) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.sb) this.f1682c).getTranslationY()));
                return;
            case 13:
                ((ml) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.sb) this.f1682c).getTranslationY()));
                return;
            case 14:
                ai aiVar = (ai) this.f1681b;
                aiVar.getClass();
                ((bu) this.f1682c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.f22418c0;
                viVar.U1();
                ni niVar = viVar.f28806y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28757j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.f28764l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1681b;
                mVar.getClass();
                ((lu) this.f1682c).f25973b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.f0.f49051b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                ey0 ey0Var = (ey0) this.f1681b;
                dy0[] dy0VarArr = (dy0[]) this.f1682c;
                ey0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < dy0VarArr.length) {
                    ey0Var.f23696c[i10] = (ey0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * ey0Var.e[i10]);
                    i10++;
                }
                ey0Var.invalidate();
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
                o3Var.f29106g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f29104c - i13)) + i13);
                int i14 = o3Var.f29105f;
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.z2) this.f1682c).invalidate();
                return;
            case 21:
                wy.q1(((zw) this.f1681b).M, (vy) this.f1682c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1681b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1682c).invalidateOutline();
                ImageView imageView = photoViewer.f31126x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                wu0 wu0Var = photoViewer.E2;
                if (wu0Var != null) {
                    wu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                g31 g31Var = (g31) this.f1681b;
                int[] iArr2 = (int[]) this.f1682c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cc0 cc0Var = g31Var.f33836n;
                if (cc0Var != null) {
                    cc0Var.K = 1.0f;
                    cc0Var.i();
                    g31Var.f33836n.s(1.0f - floatValue10);
                }
                cc0 cc0Var2 = g31Var.h;
                cc0Var2.K = floatValue10;
                cc0Var2.i();
                g31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, g31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, g31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, g31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, g31Var.e[3], iArr2[3]);
                    a31 a31Var = g31Var.E;
                    a31Var.f31705a.n(d, d10, d11, d12);
                    a31Var.invalidate();
                }
                g31Var.f33839w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1681b;
                int[] iArr3 = (int[]) this.f1682c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f277b;
                ((ml0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f277b = intValue2;
                return;
            case 25:
                wi1 wi1Var = (wi1) this.f1681b;
                wi1Var.getClass();
                wi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ui) this.f1682c).invalidate();
                return;
            case 26:
                qg.d2 d2Var = (qg.d2) this.f1681b;
                boolean[] zArr2 = (boolean[]) this.f1682c;
                d2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    d2Var.setRotationY(90.0f * f16);
                    d2Var.f41367z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    d2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    d2Var.f41359r0.b(d2Var.f41366y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                d2Var.setRotationY((1.0f - f17) * (-90.0f));
                d2Var.f41367z0 = (f17 * 0.3f) + 0.7f;
                d2Var.invalidate();
                return;
            case 27:
                qk0 qk0Var = (qk0) this.f1681b;
                qk0Var.getClass();
                ((Drawable) this.f1682c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.k1) qk0Var.f27341c).A0;
                if (view4 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view4).a3();
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
