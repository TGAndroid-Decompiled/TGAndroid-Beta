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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aj1;
import org.telegram.ui.b31;
import org.telegram.ui.eo;
import org.telegram.ui.g31;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
import org.telegram.ui.xo;
import org.telegram.ui.xu0;
import org.telegram.ui.yw;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1887a;
    public final Object f1888b;
    public final Object f1889c;

    public x(int i10, Object obj, Object obj2) {
        this.f1887a = i10;
        this.f1888b = obj;
        this.f1889c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1887a) {
            case 0:
                a0 a0Var = (a0) this.f1888b;
                View view = (View) this.f1889c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f634y.setAlpha(floatValue);
                a0Var.f634y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1888b;
                boolean[] zArr = (boolean[]) this.f1889c;
                int i11 = ProfileStoriesView.f34336s0;
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
                ((TextView) this.f1888b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1889c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1888b;
                kg.d dVar = (kg.d) this.f1889c;
                gVar.getClass();
                dVar.f14825f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f12157b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f14825f = (int) ((dVar2.f14826g / 255.0f) * (255 - dVar.f14825f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1888b;
                kg.b bVar = (kg.b) this.f1889c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f12160c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    kg.b bVar2 = (kg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue3 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue3) * bVar2.f14813e);
                    }
                }
                gVar2.invalidate();
                return;
            case 5:
                ig.n nVar = (ig.n) this.f1888b;
                nVar.getClass();
                ((ig.o) this.f1889c).f12219r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1888b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f12278a = intValue;
                ((ei.c5) this.f1889c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1888b).f23302c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1889c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1888b;
                int[] iArr = (int[]) this.f1889c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f16599b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f16600c);
                paint.setShader(aVar.f16599b);
                aVar.f16598a.setPaint(paint, 0);
                aVar.f16603g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f16602f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                eo eoVar = (eo) this.f1888b;
                eo eoVar2 = (eo) this.f1889c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.U9 = floatValue5;
                eoVar2.fragmentView.invalidate();
                eoVar2.f37483x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                eoVar.f37195a1.setTranslationY(dp);
                eoVar.f37195a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                eoVar2.f37195a1.setTranslationY(f11);
                eoVar2.f37195a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                eoVar.f37195a1.getAvatarImageView().setScaleX(f12);
                eoVar.f37195a1.getAvatarImageView().setScaleY(f12);
                eoVar.f37195a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                eoVar2.f37195a1.getAvatarImageView().setScaleX(f13);
                eoVar2.f37195a1.getAvatarImageView().setScaleY(f13);
                eoVar2.f37195a1.getAvatarImageView().setAlpha(f10);
                hh hhVar = eoVar2.M0;
                if (hhVar != null) {
                    hhVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                xo xoVar = (xo) this.f1888b;
                ArrayList arrayList3 = (ArrayList) this.f1889c;
                xoVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xoVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = xoVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                xoVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-xoVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f1888b;
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.f1889c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue7);
                y9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !y9Var2.getImageReceiver().hasBitmapImage()) {
                    y9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.ib) this.f1888b).accept(Float.valueOf(((org.telegram.ui.Components.wb) this.f1889c).getTranslationY()));
                return;
            case 13:
                ((fm) this.f1888b).accept(Float.valueOf(((org.telegram.ui.Components.wb) this.f1889c).getTranslationY()));
                return;
            case 14:
                fi fiVar = (fi) this.f1888b;
                fiVar.getClass();
                ((uu) this.f1889c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                aj ajVar = fiVar.f26077c0;
                ajVar.Y1();
                si siVar = ajVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ajVar.f24350j0;
                if (siVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(ajVar.f24366o2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1888b;
                mVar.getClass();
                ((ev) this.f1889c).f25790b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.d0.f54734b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                kz0 kz0Var = (kz0) this.f1888b;
                jz0[] jz0VarArr = (jz0[]) this.f1889c;
                kz0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < jz0VarArr.length) {
                    kz0Var.f27954c[i10] = (kz0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * kz0Var.f27955e[i10]);
                    i10++;
                }
                kz0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.n0 n0Var = (org.telegram.ui.Components.voip.n0) this.f1888b;
                n0Var.getClass();
                ((org.telegram.ui.Components.voip.v) this.f1889c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                n0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1889c;
                View view3 = (View) this.f1888b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f1888b;
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f1889c;
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
                org.telegram.ui.Components.voip.p3 p3Var = (org.telegram.ui.Components.voip.p3) this.f1888b;
                int i13 = p3Var.f31870e;
                p3Var.f31872g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f31869c - i13)) + i13);
                int i14 = p3Var.f31871f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.a3) this.f1889c).invalidate();
                return;
            case 21:
                vy.n1(((yw) this.f1888b).M, (uy) this.f1889c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1888b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1889c).invalidateOutline();
                ImageView imageView = photoViewer.f33915x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                xu0 xu0Var = photoViewer.E2;
                if (xu0Var != null) {
                    xu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                g31 g31Var = (g31) this.f1888b;
                int[] iArr2 = (int[]) this.f1889c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gd0 gd0Var = g31Var.f37909n;
                if (gd0Var != null) {
                    gd0Var.K = 1.0f;
                    gd0Var.i();
                    g31Var.f37909n.s(1.0f - floatValue10);
                }
                gd0 gd0Var2 = g31Var.h;
                gd0Var2.K = floatValue10;
                gd0Var2.i();
                g31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, g31Var.f37907e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, g31Var.f37907e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, g31Var.f37907e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, g31Var.f37907e[3], iArr2[3]);
                    b31 b31Var = g31Var.E;
                    b31Var.f36053a.n(d, d10, d11, d12);
                    b31Var.invalidate();
                }
                g31Var.f37912w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1888b;
                int[] iArr3 = (int[]) this.f1889c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f299b;
                ((wm0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f299b = intValue2;
                return;
            case 25:
                aj1 aj1Var = (aj1) this.f1888b;
                aj1Var.getClass();
                aj1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((zi) this.f1889c).invalidate();
                return;
            case 26:
                qg.b2 b2Var = (qg.b2) this.f1888b;
                boolean[] zArr2 = (boolean[]) this.f1889c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f16);
                    b2Var.f46146z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b2Var.f46138r0.b(b2Var.f46145y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f17) * (-90.0f));
                b2Var.f46146z0 = (f17 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((a4.l) this.f1888b).f297b).d.getParent()).invalidate();
                return;
            case 28:
                am0 am0Var = (am0) this.f1888b;
                am0Var.getClass();
                ((Drawable) this.f1889c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.l1) am0Var.f24434c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1888b).P((s4.d1) this.f1889c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1887a = 18;
        this.f1889c = view;
        this.f1888b = view2;
    }
}
