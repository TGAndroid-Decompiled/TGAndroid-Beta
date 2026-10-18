package ah;

import ai.ne;
import ai.oe;
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
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.zh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cu0;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.hw;
import org.telegram.ui.ko;
import org.telegram.ui.mh1;
import org.telegram.ui.sn;
import rg.a2;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f825a;
    public final Object f826b;
    public final Object f827c;

    public l0(int i10, Object obj, Object obj2) {
        this.f825a = i10;
        this.f826b = obj;
        this.f827c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f825a) {
            case 0:
                t0 t0Var = (t0) this.f826b;
                ArrayList arrayList = (ArrayList) this.f827c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    t0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                t0Var.f879m.f43628k0.invalidate();
                return;
            case 1:
                oe oeVar = (oe) this.f826b;
                oeVar.getClass();
                ((ne) this.f827c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oeVar.f1();
                return;
            case 2:
                ci.q qVar = (ci.q) this.f826b;
                View view = (View) this.f827c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.f5750y.setAlpha(floatValue2);
                qVar.f5750y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f826b;
                boolean[] zArr = (boolean[]) this.f827c;
                int i11 = ProfileStoriesView.f33858s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(profileStoriesView, 13), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f826b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f827c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jg.g gVar = (jg.g) this.f826b;
                lg.d dVar = (lg.d) this.f827c;
                gVar.getClass();
                dVar.f16042f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f14450b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f16042f = (int) ((dVar2.f16043g / 255.0f) * (255 - dVar.f16042f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                jg.g gVar2 = (jg.g) this.f826b;
                lg.b bVar = (lg.b) this.f827c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f14453c;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    lg.b bVar2 = (lg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                jg.n nVar = (jg.n) this.f826b;
                nVar.getClass();
                ((jg.o) this.f827c).f14509r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                j5.c cVar = (j5.c) this.f826b;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.f14259b = intValue;
                ((j5.b) this.f827c).i(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.v0) this.f826b).f23624c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f827c).invalidate();
                return;
            case 10:
                og.a aVar = (og.a) this.f826b;
                int[] iArr = (int[]) this.f827c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue5, iArr[0], aVar.h[0]), i0.a.f(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f17736b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f17737c);
                paint.setShader(aVar.f17736b);
                aVar.f17735a.setPaint(paint, 0);
                aVar.f17739g.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f17738f.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 11:
                sn snVar = (sn) this.f826b;
                sn snVar2 = (sn) this.f827c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.U9 = floatValue6;
                snVar2.fragmentView.invalidate();
                snVar2.f41454x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                snVar.f41166a1.setTranslationY(dp);
                snVar.f41166a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                snVar2.f41166a1.setTranslationY(f11);
                snVar2.f41166a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                snVar.f41166a1.getAvatarImageView().setScaleX(f12);
                snVar.f41166a1.getAvatarImageView().setScaleY(f12);
                snVar.f41166a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                snVar2.f41166a1.getAvatarImageView().setScaleX(f13);
                snVar2.f41166a1.getAvatarImageView().setScaleY(f13);
                snVar2.f41166a1.getAvatarImageView().setAlpha(f10);
                ch chVar = snVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    return;
                }
                return;
            case 12:
                ko koVar = (ko) this.f826b;
                ArrayList arrayList4 = (ArrayList) this.f827c;
                koVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                koVar.N.setAlpha(floatValue7);
                q8 q8Var = koVar.N;
                float f14 = 1.0f - floatValue7;
                q8Var.setTranslationY(((-q8Var.getHeight()) / 2.0f) * f14);
                koVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-koVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 13:
                w9 w9Var = (w9) this.f826b;
                w9 w9Var2 = (w9) this.f827c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue8);
                w9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !w9Var2.getImageReceiver().hasBitmapImage()) {
                    w9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 14:
                ((gb) this.f826b).accept(Float.valueOf(((ub) this.f827c).getTranslationY()));
                return;
            case 15:
                ((xl) this.f826b).accept(Float.valueOf(((ub) this.f827c).getTranslationY()));
                return;
            case 16:
                zh zhVar = (zh) this.f826b;
                zhVar.getClass();
                ((iu) this.f827c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = zhVar.f32937c0;
                tiVar.Y1();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30593j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.f30609o2);
                    return;
                }
                return;
            case 17:
                c2.b bVar3 = (c2.b) this.f826b;
                bVar3.getClass();
                ((su) this.f827c).f30337b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar3.d).size()) {
                    if (!x0.f903b) {
                        ((View) ((ArrayList) bVar3.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 18:
                vy0 vy0Var = (vy0) this.f826b;
                uy0[] uy0VarArr = (uy0[]) this.f827c;
                vy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < uy0VarArr.length) {
                    vy0Var.f31936c[i10] = (vy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * vy0Var.e[i10]);
                    i10++;
                }
                vy0Var.invalidate();
                return;
            case 19:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f826b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f827c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 20:
                View view2 = (View) this.f826b;
                View view3 = (View) this.f827c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                return;
            case 21:
                a3 a3Var = (a3) this.f826b;
                o1 o1Var = (o1) this.f827c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && a3Var.R) {
                    a3Var.Q.pause();
                    AnimatorSet animatorSet = a3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                m3 m3Var = (m3) this.f826b;
                int i13 = m3Var.e;
                m3Var.f31615g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.f31613c - i13)) + i13);
                int i14 = m3Var.f31614f;
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - i14)) + i14);
                ((x2) this.f827c).invalidate();
                return;
            case 23:
                ey.n1(((hw) this.f826b).M, (dy) this.f827c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) this.f826b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f827c).invalidateOutline();
                ImageView imageView = photoViewer.f33446x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                cu0 cu0Var = photoViewer.E2;
                if (cu0Var != null) {
                    cu0Var.invalidateOutline();
                    return;
                }
                return;
            case 25:
                a5.a aVar2 = (a5.a) this.f826b;
                int[] iArr2 = (int[]) this.f827c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f280b;
                ((im0) aVar2.d).scrollBy(0, i15);
                iArr2[0] = iArr2[0] + i15;
                aVar2.f280b = intValue2;
                return;
            case 26:
                mh1 mh1Var = (mh1) this.f826b;
                mh1Var.getClass();
                mh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((si) this.f827c).invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((ag.b) this.f826b).f634b).d.getParent()).invalidate();
                return;
            default:
                a2 a2Var = (a2) this.f826b;
                boolean[] zArr2 = (boolean[]) this.f827c;
                a2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    a2Var.setRotationY(90.0f * f16);
                    a2Var.f45332z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a2Var.f45324r0.b(a2Var.f45331y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f17) * (-90.0f));
                a2Var.f45332z0 = (f17 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
        }
    }
}
