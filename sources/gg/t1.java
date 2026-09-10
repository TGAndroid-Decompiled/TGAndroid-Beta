package gg;

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
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.o3;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cj1;
import org.telegram.ui.e31;
import org.telegram.ui.eo;
import org.telegram.ui.k31;
import org.telegram.ui.vu0;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.yo;
import org.telegram.ui.zw;
import xh.t8;
public final class t1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9040a;
    public final Object f9041b;
    public final Object f9042c;

    public t1(int i10, Object obj, Object obj2) {
        this.f9040a = i10;
        this.f9041b = obj;
        this.f9042c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f9040a) {
            case 0:
                ((TextView) this.f9041b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f9042c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                hg.g gVar = (hg.g) this.f9041b;
                jg.d dVar = (jg.d) this.f9042c;
                gVar.getClass();
                dVar.f11902f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = gVar.f9350b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jg.d dVar2 = (jg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f11902f = (int) ((dVar2.f11903g / 255.0f) * (255 - dVar.f11902f));
                    }
                }
                gVar.invalidate();
                return;
            case 2:
                hg.g gVar2 = (hg.g) this.f9041b;
                jg.b bVar = (jg.b) this.f9042c;
                gVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar2.f9353c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    jg.b bVar2 = (jg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                return;
            case 3:
                hg.n nVar = (hg.n) this.f9041b;
                nVar.getClass();
                ((hg.o) this.f9042c).f9409r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 4:
                hi.c0 c0Var = (hi.c0) this.f9041b;
                c0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c0Var.f9482a = intValue;
                ((a1.c) this.f9042c).g(intValue);
                return;
            case 5:
                ((org.telegram.ui.Cells.v0) this.f9041b).f20534c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f9042c).invalidate();
                return;
            case 6:
                mg.a aVar = (mg.a) this.f9041b;
                int[] iArr = (int[]) this.f9042c;
                aVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue2, iArr[0], aVar.h[0]), i0.a.d(floatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f13649b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f13650c);
                paint.setShader(aVar.f13649b);
                aVar.f13648a.setPaint(paint, 0);
                aVar.f13652g.setColor(i0.a.d(0.1f, i0.a.d(floatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f13651f.setColor(i0.a.d(0.1f, i0.a.d(floatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 7:
                eo eoVar = (eo) this.f9041b;
                eo eoVar2 = (eo) this.f9042c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.U9 = floatValue3;
                eoVar2.fragmentView.invalidate();
                eoVar2.f32542x0.invalidate();
                float f7 = 1.0f - floatValue3;
                float dp = AndroidUtilities.dp(8.0f) * f7;
                eoVar.f32256a1.setTranslationY(dp);
                eoVar.f32256a1.getAvatarImageView().setTranslationY(-dp);
                float f10 = (-AndroidUtilities.dp(8.0f)) * floatValue3;
                eoVar2.f32256a1.setTranslationY(f10);
                eoVar2.f32256a1.getAvatarImageView().setTranslationY(-f10);
                float f11 = (floatValue3 * 0.2f) + 0.8f;
                eoVar.f32256a1.getAvatarImageView().setScaleX(f11);
                eoVar.f32256a1.getAvatarImageView().setScaleY(f11);
                eoVar.f32256a1.getAvatarImageView().setAlpha(floatValue3);
                float f12 = (0.2f * f7) + 0.8f;
                eoVar2.f32256a1.getAvatarImageView().setScaleX(f12);
                eoVar2.f32256a1.getAvatarImageView().setScaleY(f12);
                eoVar2.f32256a1.getAvatarImageView().setAlpha(f7);
                fh fhVar = eoVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(f7);
                    return;
                }
                return;
            case 8:
                yo yoVar = (yo) this.f9041b;
                ArrayList arrayList3 = (ArrayList) this.f9042c;
                yoVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yoVar.N.setAlpha(floatValue4);
                s8 s8Var = yoVar.N;
                float f13 = 1.0f - floatValue4;
                s8Var.setTranslationY(((-s8Var.getHeight()) / 2.0f) * f13);
                yoVar.N.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-yoVar.N.getHeight()) * f13);
                    i10++;
                }
                return;
            case 9:
                w9 w9Var = (w9) this.f9041b;
                w9 w9Var2 = (w9) this.f9042c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue5);
                w9Var.setScaleY(floatValue5);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 10:
                ((fb) this.f9041b).accept(Float.valueOf(((tb) this.f9042c).getTranslationY()));
                return;
            case 11:
                ((rl) this.f9041b).accept(Float.valueOf(((tb) this.f9042c).getTranslationY()));
                return;
            case 12:
                di diVar = (di) this.f9041b;
                diVar.getClass();
                ((fu) this.f9042c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yi yiVar = diVar.f22425c0;
                yiVar.U1();
                qi qiVar = yiVar.f29427y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
                if (qiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(yiVar.f29385l2);
                    return;
                }
                return;
            case 13:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f9041b;
                mVar.getClass();
                ((pu) this.f9042c).f26250b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!yg.f0.f46996b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 14:
                py0 py0Var = (py0) this.f9041b;
                oy0[] oy0VarArr = (oy0[]) this.f9042c;
                py0Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < oy0VarArr.length) {
                    py0Var.f26265c[i10] = (py0Var.d[i10] * floatValue6) + ((1.0f - floatValue6) * py0Var.e[i10]);
                    i10++;
                }
                py0Var.invalidate();
                return;
            case 15:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f9041b;
                m0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f9042c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m0Var.invalidate();
                return;
            case 16:
                View view = (View) this.f9041b;
                View view2 = (View) this.f9042c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f14 = 1.0f - floatValue7;
                view.setTranslationY(AndroidUtilities.dp(8.0f) * f14);
                view.setAlpha(floatValue7);
                view2.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue7);
                view2.setAlpha(f14);
                return;
            case 17:
                c3 c3Var = (c3) this.f9041b;
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.f9042c;
                p1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p1Var.c();
                int i11 = p1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && c3Var.R) {
                    c3Var.Q.pause();
                    AnimatorSet animatorSet = c3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                o3 o3Var = (o3) this.f9041b;
                int i12 = o3Var.e;
                o3Var.f28316g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f28314c - i12)) + i12);
                int i13 = o3Var.f28315f;
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - i13)) + i13);
                ((z2) this.f9042c).invalidate();
                return;
            case 19:
                wy.q1(((zw) this.f9041b).M, (vy) this.f9042c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.f9041b;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f9042c).invalidateOutline();
                ImageView imageView = photoViewer.f30221x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                vu0 vu0Var = photoViewer.E2;
                if (vu0Var != null) {
                    vu0Var.invalidateOutline();
                    return;
                }
                return;
            case 21:
                k31 k31Var = (k31) this.f9041b;
                int[] iArr2 = (int[]) this.f9042c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lc0 lc0Var = k31Var.f34213n;
                if (lc0Var != null) {
                    lc0Var.K = 1.0f;
                    lc0Var.i();
                    k31Var.f34213n.s(1.0f - floatValue8);
                }
                lc0 lc0Var2 = k31Var.h;
                lc0Var2.K = floatValue8;
                lc0Var2.i();
                k31Var.h.s(floatValue8);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue8, k31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue8, k31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue8, k31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue8, k31Var.e[3], iArr2[3]);
                    e31 e31Var = k31Var.E;
                    e31Var.f32047a.n(d, d10, d11, d12);
                    e31Var.invalidate();
                }
                k31Var.f34216w.invalidate();
                return;
            case 22:
                a5.a aVar2 = (a5.a) this.f9041b;
                int[] iArr3 = (int[]) this.f9042c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - aVar2.f275b;
                ((vl0) aVar2.d).scrollBy(0, i14);
                iArr3[0] = iArr3[0] + i14;
                aVar2.f275b = intValue2;
                return;
            case 23:
                cj1 cj1Var = (cj1) this.f9041b;
                cj1Var.getClass();
                cj1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((xi) this.f9042c).invalidate();
                return;
            case 24:
                pg.a2 a2Var = (pg.a2) this.f9041b;
                boolean[] zArr = (boolean[]) this.f9042c;
                a2Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 < 0.5f) {
                    float f15 = floatValue9 / 0.5f;
                    a2Var.setRotationY(90.0f * f15);
                    a2Var.f39943z0 = ((1.0f - f15) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f39935r0.b(a2Var.f39942y0, false);
                }
                float f16 = (floatValue9 - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f16) * (-90.0f));
                a2Var.f39943z0 = (f16 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
            case 25:
                vv0 vv0Var = (vv0) this.f9041b;
                vv0Var.getClass();
                ((Drawable) this.f9042c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view3 = ((qg.m1) vv0Var.f28603c).A0;
                if (view3 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view3).a3();
                    return;
                } else {
                    view3.invalidate();
                    return;
                }
            case 26:
                ((s4.j) this.f9041b).P((s4.c1) this.f9042c);
                return;
            case 27:
                t8 t8Var = (t8) this.f9041b;
                t8Var.getClass();
                ((xh.s8) this.f9042c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.a1();
                return;
            default:
                yg.c0 c0Var2 = (yg.c0) this.f9041b;
                ArrayList arrayList4 = (ArrayList) this.f9042c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList4.size()) {
                    yg.c0.g((View) arrayList4.get(i10), floatValue10);
                    i10++;
                }
                c0Var2.f46959m.f34576k0.invalidate();
                return;
        }
    }
}
