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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ni1;
import org.telegram.ui.pu0;
import org.telegram.ui.s21;
import org.telegram.ui.so;
import org.telegram.ui.sy;
import org.telegram.ui.tw;
import org.telegram.ui.ty;
import org.telegram.ui.xn;
import org.telegram.ui.y21;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f1677a;
    public final Object f1678b;
    public final Object f1679c;

    public x(int i10, Object obj, Object obj2) {
        this.f1677a = i10;
        this.f1678b = obj;
        this.f1679c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1677a) {
            case 0:
                a0 a0Var = (a0) this.f1678b;
                View view = (View) this.f1679c;
                a0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
                a0Var.f506y.setAlpha(floatValue);
                a0Var.f506y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1678b;
                boolean[] zArr = (boolean[]) this.f1679c;
                int i11 = ProfileStoriesView.f31806s0;
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
                ((TextView) this.f1678b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1679c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ig.g gVar = (ig.g) this.f1678b;
                kg.d dVar = (kg.d) this.f1679c;
                gVar.getClass();
                dVar.f13596f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f11123b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.d dVar2 = (kg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f13596f = (int) ((dVar2.f13597g / 255.0f) * (255 - dVar.f13596f));
                    }
                }
                gVar.invalidate();
                return;
            case 4:
                ig.g gVar2 = (ig.g) this.f1678b;
                kg.b bVar = (kg.b) this.f1679c;
                gVar2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f11126c;
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
                ig.n nVar = (ig.n) this.f1678b;
                nVar.getClass();
                ((ig.o) this.f1679c).f11182r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 6:
                ii.b0 b0Var = (ii.b0) this.f1678b;
                b0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b0Var.f11237a = intValue;
                ((ei.d5) this.f1679c).d(intValue);
                return;
            case 7:
                ((org.telegram.ui.Cells.v0) this.f1678b).f21675c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f1679c).invalidate();
                return;
            case 8:
                ng.a aVar = (ng.a) this.f1678b;
                int[] iArr = (int[]) this.f1679c;
                aVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue4, iArr[0], aVar.h[0]), i0.a.d(floatValue4, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f15482b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f15483c);
                paint.setShader(aVar.f15482b);
                aVar.f15481a.setPaint(paint, 0);
                aVar.f15485g.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[1], aVar.h[1]), -1));
                aVar.f15484f.setColor(i0.a.d(0.1f, i0.a.d(floatValue4, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 9:
                xn xnVar = (xn) this.f1678b;
                xn xnVar2 = (xn) this.f1679c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.U9 = floatValue5;
                xnVar2.fragmentView.invalidate();
                xnVar2.f39977x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                xnVar.f39690a1.setTranslationY(dp);
                xnVar.f39690a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                xnVar2.f39690a1.setTranslationY(f11);
                xnVar2.f39690a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                xnVar.f39690a1.getAvatarImageView().setScaleX(f12);
                xnVar.f39690a1.getAvatarImageView().setScaleY(f12);
                xnVar.f39690a1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                xnVar2.f39690a1.getAvatarImageView().setScaleX(f13);
                xnVar2.f39690a1.getAvatarImageView().setScaleY(f13);
                xnVar2.f39690a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = xnVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    return;
                }
                return;
            case 10:
                so soVar = (so) this.f1678b;
                ArrayList arrayList3 = (ArrayList) this.f1679c;
                soVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.r8 r8Var = soVar.N;
                float f14 = 1.0f - floatValue6;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                soVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-soVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 11:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f1678b;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f1679c;
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
                ((org.telegram.ui.Components.gb) this.f1678b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1679c).getTranslationY()));
                return;
            case 13:
                ((ol) this.f1678b).accept(Float.valueOf(((org.telegram.ui.Components.ub) this.f1679c).getTranslationY()));
                return;
            case 14:
                yh yhVar = (yh) this.f1678b;
                yhVar.getClass();
                ((du) this.f1679c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                wi wiVar = yhVar.f30667c0;
                wiVar.R1();
                oi oiVar = wiVar.f30023y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29974j0;
                if (oiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(wiVar.f29981l2);
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f1678b;
                mVar.getClass();
                ((nu) this.f1679c).f26896b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!zg.f0.f49339b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                py0 py0Var = (py0) this.f1678b;
                oy0[] oy0VarArr = (oy0[]) this.f1679c;
                py0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < oy0VarArr.length) {
                    py0Var.f27497c[i10] = (py0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * py0Var.e[i10]);
                    i10++;
                }
                py0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f1678b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f1679c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 18:
                View view2 = (View) this.f1679c;
                View view3 = (View) this.f1678b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f1678b;
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f1679c;
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
                org.telegram.ui.Components.voip.p3 p3Var = (org.telegram.ui.Components.voip.p3) this.f1678b;
                int i13 = p3Var.e;
                p3Var.f29500g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f29498c - i13)) + i13);
                int i14 = p3Var.f29499f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.a3) this.f1679c).invalidate();
                return;
            case 21:
                ty.u1(((tw) this.f1678b).M, (sy) this.f1679c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f1678b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1679c).invalidateOutline();
                ImageView imageView = photoViewer.f31397x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                pu0 pu0Var = photoViewer.E2;
                if (pu0Var != null) {
                    pu0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                y21 y21Var = (y21) this.f1678b;
                int[] iArr2 = (int[]) this.f1679c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc0 nc0Var = y21Var.f40116n;
                if (nc0Var != null) {
                    nc0Var.K = 1.0f;
                    nc0Var.i();
                    y21Var.f40116n.s(1.0f - floatValue10);
                }
                nc0 nc0Var2 = y21Var.h;
                nc0Var2.K = floatValue10;
                nc0Var2.i();
                y21Var.h.s(floatValue10);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue10, y21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue10, y21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue10, y21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue10, y21Var.e[3], iArr2[3]);
                    s21 s21Var = y21Var.E;
                    s21Var.f37275a.n(d, d10, d11, d12);
                    s21Var.invalidate();
                }
                y21Var.f40119w.invalidate();
                return;
            case 24:
                a5.a aVar2 = (a5.a) this.f1678b;
                int[] iArr3 = (int[]) this.f1679c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f277b;
                ((yl0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f277b = intValue2;
                return;
            case 25:
                ni1 ni1Var = (ni1) this.f1678b;
                ni1Var.getClass();
                ni1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((vi) this.f1679c).invalidate();
                return;
            case 26:
                qg.a2 a2Var = (qg.a2) this.f1678b;
                boolean[] zArr2 = (boolean[]) this.f1679c;
                a2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    a2Var.setRotationY(90.0f * f16);
                    a2Var.f41615z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a2Var.f41607r0.b(a2Var.f41614y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f17) * (-90.0f));
                a2Var.f41615z0 = (f17 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
            case 27:
                cl0 cl0Var = (cl0) this.f1678b;
                cl0Var.getClass();
                ((Drawable) this.f1679c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view4 = ((rg.k1) cl0Var.f23359c).A0;
                if (view4 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view4).a3();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            default:
                ((s4.j) this.f1678b).P((s4.c1) this.f1679c);
                return;
        }
    }

    public x(View view, View view2) {
        this.f1677a = 18;
        this.f1679c = view;
        this.f1678b = view2;
    }
}
