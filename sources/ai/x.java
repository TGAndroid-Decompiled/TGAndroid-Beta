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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.e31;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uo;
import org.telegram.ui.vu0;
import org.telegram.ui.ww;
import org.telegram.ui.y21;
import org.telegram.ui.zi1;
import org.telegram.ui.zn;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1889a;
    public final Object f1890b;
    public final Object f1891c;

    public x(int i10, Object obj, Object obj2) {
        this.f1889a = i10;
        this.f1890b = obj;
        this.f1891c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1889a) {
            case 0:
                a0 a0Var = (a0) this.f1890b;
                View view = (View) this.f1891c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f632y.setAlpha(floatValue);
                a0Var.f632y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1890b;
                boolean[] zArr = (boolean[]) this.f1891c;
                int i11 = ProfileStoriesView.f34535s0;
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
                ((TextView) this.f1890b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1891c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1890b;
                kg.d dVar = (kg.d) this.f1891c;
                gVar.getClass();
                dVar.f14828f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f12159b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f14828f = (int) ((dVar2.f14829g / 255.0f) * (255 - dVar.f14828f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1890b;
                kg.b bVar = (kg.b) this.f1891c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f12162c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    kg.b bVar2 = (kg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue3 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue3) * bVar2.f14816e);
                    }
                }
                gVar2.invalidate();
                return;
            case 5:
                ig.n nVar = (ig.n) this.f1890b;
                nVar.getClass();
                ((ig.o) this.f1891c).f12221r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1890b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f12281a = intValue;
                ((ei.c5) this.f1891c).e(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1890b).f23533c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1891c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1890b;
                int[] iArr = (int[]) this.f1891c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f16850b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f16851c);
                paint.setShader(aVar.f16850b);
                aVar.f16849a.setPaint(paint, 0);
                aVar.f16854g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f16853f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                zn znVar = (zn) this.f1890b;
                zn znVar2 = (zn) this.f1891c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.U9 = floatValue5;
                znVar2.fragmentView.invalidate();
                znVar2.f45034x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                znVar.f44746a1.setTranslationY(dp);
                znVar.f44746a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                znVar2.f44746a1.setTranslationY(f11);
                znVar2.f44746a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                znVar.f44746a1.getAvatarImageView().setScaleX(f12);
                znVar.f44746a1.getAvatarImageView().setScaleY(f12);
                znVar.f44746a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                znVar2.f44746a1.getAvatarImageView().setScaleX(f13);
                znVar2.f44746a1.getAvatarImageView().setScaleY(f13);
                znVar2.f44746a1.getAvatarImageView().setAlpha(f10);
                fh fhVar = znVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                uo uoVar = (uo) this.f1890b;
                ArrayList arrayList3 = (ArrayList) this.f1891c;
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
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f1890b;
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.f1891c;
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
                ((org.telegram.ui.Components.jb) this.f1890b).accept(Float.valueOf(((org.telegram.ui.Components.xb) this.f1891c).getTranslationY()));
                return;
            case 13:
                ((dm) this.f1890b).accept(Float.valueOf(((org.telegram.ui.Components.xb) this.f1891c).getTranslationY()));
                return;
            case 14:
                di diVar = (di) this.f1890b;
                diVar.getClass();
                ((su) this.f1891c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yi yiVar = diVar.f25708c0;
                yiVar.Y1();
                qi qiVar = yiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33247j0;
                if (qiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(yiVar.f33263o2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1890b;
                mVar.getClass();
                ((cv) this.f1891c).f25415b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.d0.f54546b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                fz0 fz0Var = (fz0) this.f1890b;
                ez0[] ez0VarArr = (ez0[]) this.f1891c;
                fz0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ez0VarArr.length) {
                    fz0Var.f26547c[i10] = (fz0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * fz0Var.f26548e[i10]);
                    i10++;
                }
                fz0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f1890b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f1891c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1891c;
                View view3 = (View) this.f1890b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f1890b;
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f1891c;
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
                org.telegram.ui.Components.voip.o3 o3Var = (org.telegram.ui.Components.voip.o3) this.f1890b;
                int i13 = o3Var.f32190e;
                o3Var.f32192g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f32189c - i13)) + i13);
                int i14 = o3Var.f32191f;
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.z2) this.f1891c).invalidate();
                return;
            case 21:
                ty.n1(((ww) this.f1890b).M, (sy) this.f1891c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1890b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1891c).invalidateOutline();
                ImageView imageView = photoViewer.f34114x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    vu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                e31 e31Var = (e31) this.f1890b;
                int[] iArr2 = (int[]) this.f1891c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dd0 dd0Var = e31Var.f37184n;
                if (dd0Var != null) {
                    dd0Var.K = 1.0f;
                    dd0Var.i();
                    e31Var.f37184n.s(1.0f - floatValue10);
                }
                dd0 dd0Var2 = e31Var.h;
                dd0Var2.K = floatValue10;
                dd0Var2.i();
                e31Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, e31Var.f37182e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, e31Var.f37182e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, e31Var.f37182e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, e31Var.f37182e[3], iArr2[3]);
                    y21 y21Var = e31Var.E;
                    y21Var.f44265a.n(d, d10, d11, d12);
                    y21Var.invalidate();
                }
                e31Var.f37187w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1890b;
                int[] iArr3 = (int[]) this.f1891c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f299b;
                ((rm0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f299b = intValue2;
                return;
            case 25:
                zi1 zi1Var = (zi1) this.f1890b;
                zi1Var.getClass();
                zi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((xi) this.f1891c).invalidate();
                return;
            case 26:
                qg.b2 b2Var = (qg.b2) this.f1890b;
                boolean[] zArr2 = (boolean[]) this.f1891c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f16);
                    b2Var.f46245z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b2Var.f46237r0.b(b2Var.f46244y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f17) * (-90.0f));
                b2Var.f46245z0 = (f17 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((a4.l) this.f1890b).f297b).d.getParent()).invalidate();
                return;
            case 28:
                vl0 vl0Var = (vl0) this.f1890b;
                vl0Var.getClass();
                ((Drawable) this.f1891c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.l1) vl0Var.f31886c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1890b).P((s4.d1) this.f1891c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1889a = 18;
        this.f1891c = view;
        this.f1890b = view2;
    }
}
