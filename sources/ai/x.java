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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f31;
import org.telegram.ui.ty;
import org.telegram.ui.uo;
import org.telegram.ui.uu0;
import org.telegram.ui.uy;
import org.telegram.ui.wi1;
import org.telegram.ui.xw;
import org.telegram.ui.z21;
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
                int i11 = ProfileStoriesView.f31802s0;
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
                dVar.f13608f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f11134b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f13608f = (int) ((dVar2.f13609g / 255.0f) * (255 - dVar.f13608f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1681b;
                kg.b bVar = (kg.b) this.f1682c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f11137c;
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
                ((ig.o) this.f1682c).f11193r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1681b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f11249a = intValue;
                ((ei.d5) this.f1682c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1681b).f21663c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1682c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1681b;
                int[] iArr = (int[]) this.f1682c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f15439b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f15440c);
                paint.setShader(aVar.f15439b);
                aVar.f15438a.setPaint(paint, 0);
                aVar.f15442g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f15441f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                zn znVar = (zn) this.f1681b;
                zn znVar2 = (zn) this.f1682c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.U9 = floatValue5;
                znVar2.fragmentView.invalidate();
                znVar2.f40530x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                znVar.f40243a1.setTranslationY(dp);
                znVar.f40243a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                znVar2.f40243a1.setTranslationY(f11);
                znVar2.f40243a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                znVar.f40243a1.getAvatarImageView().setScaleX(f12);
                znVar.f40243a1.getAvatarImageView().setScaleY(f12);
                znVar.f40243a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                znVar2.f40243a1.getAvatarImageView().setScaleX(f13);
                znVar2.f40243a1.getAvatarImageView().setScaleY(f13);
                znVar2.f40243a1.getAvatarImageView().setAlpha(f10);
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
                org.telegram.ui.Cells.s8 s8Var = uoVar.N;
                float f14 = 1.0f - floatValue6;
                s8Var.setTranslationY(((-s8Var.getHeight()) / 2.0f) * f14);
                uoVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-uoVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f1681b;
                org.telegram.ui.Components.v9 v9Var2 = (org.telegram.ui.Components.v9) this.f1682c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.setScaleX(floatValue7);
                v9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !v9Var2.getImageReceiver().hasBitmapImage()) {
                    v9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.fb) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.tb) this.f1682c).getTranslationY()));
                return;
            case 13:
                ((ml) this.f1681b).accept(Float.valueOf(((org.telegram.ui.Components.tb) this.f1682c).getTranslationY()));
                return;
            case 14:
                ai aiVar = (ai) this.f1681b;
                aiVar.getClass();
                ((bu) this.f1682c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.f22686c0;
                viVar.U1();
                ni niVar = viVar.f29159y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f29110j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.f29117l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1681b;
                mVar.getClass();
                ((lu) this.f1682c).f26237b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.e0.f49318b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                oy0 oy0Var = (oy0) this.f1681b;
                ny0[] ny0VarArr = (ny0[]) this.f1682c;
                oy0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ny0VarArr.length) {
                    oy0Var.f27076c[i10] = (oy0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * oy0Var.e[i10]);
                    i10++;
                }
                oy0Var.invalidate();
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
                o3Var.f29529g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f29527c - i13)) + i13);
                int i14 = o3Var.f29528f;
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
                ImageView imageView = photoViewer.f31393x3;
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
                f31 f31Var = (f31) this.f1681b;
                int[] iArr2 = (int[]) this.f1682c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc0 kc0Var = f31Var.f33471n;
                if (kc0Var != null) {
                    kc0Var.K = 1.0f;
                    kc0Var.i();
                    f31Var.f33471n.s(1.0f - floatValue10);
                }
                kc0 kc0Var2 = f31Var.h;
                kc0Var2.K = floatValue10;
                kc0Var2.i();
                f31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, f31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, f31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, f31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, f31Var.e[3], iArr2[3]);
                    z21 z21Var = f31Var.E;
                    z21Var.f40071a.n(d, d10, d11, d12);
                    z21Var.invalidate();
                }
                f31Var.f33474w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1681b;
                int[] iArr3 = (int[]) this.f1682c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f277b;
                ((vl0) aVar2.d).scrollBy(0, i15);
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
                qg.b2 b2Var = (qg.b2) this.f1681b;
                boolean[] zArr2 = (boolean[]) this.f1682c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f16);
                    b2Var.f41611z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b2Var.f41603r0.b(b2Var.f41610y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f17) * (-90.0f));
                b2Var.f41611z0 = (f17 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
            case 27:
                zk0 zk0Var = (zk0) this.f1681b;
                zk0Var.getClass();
                ((Drawable) this.f1682c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.k1) zk0Var.f30853c).A0;
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
