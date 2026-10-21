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
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.au0;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.fw;
import org.telegram.ui.io;
import org.telegram.ui.kh1;
import org.telegram.ui.qn;
import rg.b2;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f823a;
    public final Object f824b;
    public final Object f825c;

    public l0(int i10, Object obj, Object obj2) {
        this.f823a = i10;
        this.f824b = obj;
        this.f825c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f823a) {
            case 0:
                t0 t0Var = (t0) this.f824b;
                ArrayList arrayList = (ArrayList) this.f825c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    t0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                t0Var.f877m.f43067k0.invalidate();
                return;
            case 1:
                oe oeVar = (oe) this.f824b;
                oeVar.getClass();
                ((ne) this.f825c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oeVar.f1();
                return;
            case 2:
                ci.q qVar = (ci.q) this.f824b;
                View view = (View) this.f825c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.f5747y.setAlpha(floatValue2);
                qVar.f5747y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f824b;
                boolean[] zArr = (boolean[]) this.f825c;
                int i11 = ProfileStoriesView.f33866s0;
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
                ((TextView) this.f824b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f825c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jg.g gVar = (jg.g) this.f824b;
                lg.d dVar = (lg.d) this.f825c;
                gVar.getClass();
                dVar.f16041f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f14448b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f16041f = (int) ((dVar2.f16042g / 255.0f) * (255 - dVar.f16041f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                jg.g gVar2 = (jg.g) this.f824b;
                lg.b bVar = (lg.b) this.f825c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f14451c;
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
                jg.n nVar = (jg.n) this.f824b;
                nVar.getClass();
                ((jg.o) this.f825c).f14507r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                j5.c cVar = (j5.c) this.f824b;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.f14257b = intValue;
                ((j5.b) this.f825c).i(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.v0) this.f824b).f23621c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f825c).invalidate();
                return;
            case 10:
                og.a aVar = (og.a) this.f824b;
                int[] iArr = (int[]) this.f825c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue5, iArr[0], aVar.h[0]), i0.a.f(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f17733b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f17734c);
                paint.setShader(aVar.f17733b);
                aVar.f17732a.setPaint(paint, 0);
                aVar.f17736g.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f17735f.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 11:
                qn qnVar = (qn) this.f824b;
                qn qnVar2 = (qn) this.f825c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.U9 = floatValue6;
                qnVar2.fragmentView.invalidate();
                qnVar2.f40901x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                qnVar.f40613a1.setTranslationY(dp);
                qnVar.f40613a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                qnVar2.f40613a1.setTranslationY(f11);
                qnVar2.f40613a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                qnVar.f40613a1.getAvatarImageView().setScaleX(f12);
                qnVar.f40613a1.getAvatarImageView().setScaleY(f12);
                qnVar.f40613a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                qnVar2.f40613a1.getAvatarImageView().setScaleX(f13);
                qnVar2.f40613a1.getAvatarImageView().setScaleY(f13);
                qnVar2.f40613a1.getAvatarImageView().setAlpha(f10);
                ch chVar = qnVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    return;
                }
                return;
            case 12:
                io ioVar = (io) this.f824b;
                ArrayList arrayList4 = (ArrayList) this.f825c;
                ioVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ioVar.N.setAlpha(floatValue7);
                q8 q8Var = ioVar.N;
                float f14 = 1.0f - floatValue7;
                q8Var.setTranslationY(((-q8Var.getHeight()) / 2.0f) * f14);
                ioVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-ioVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 13:
                w9 w9Var = (w9) this.f824b;
                w9 w9Var2 = (w9) this.f825c;
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
                ((gb) this.f824b).accept(Float.valueOf(((ub) this.f825c).getTranslationY()));
                return;
            case 15:
                ((xl) this.f824b).accept(Float.valueOf(((ub) this.f825c).getTranslationY()));
                return;
            case 16:
                zh zhVar = (zh) this.f824b;
                zhVar.getClass();
                ((iu) this.f825c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = zhVar.f32901c0;
                tiVar.Y1();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30558j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.f30574o2);
                    return;
                }
                return;
            case 17:
                c2.b bVar3 = (c2.b) this.f824b;
                bVar3.getClass();
                ((su) this.f825c).f30359b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar3.d).size()) {
                    if (!x0.f901b) {
                        ((View) ((ArrayList) bVar3.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 18:
                xy0 xy0Var = (xy0) this.f824b;
                wy0[] wy0VarArr = (wy0[]) this.f825c;
                xy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < wy0VarArr.length) {
                    xy0Var.f32502c[i10] = (xy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * xy0Var.e[i10]);
                    i10++;
                }
                xy0Var.invalidate();
                return;
            case 19:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f824b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f825c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 20:
                View view2 = (View) this.f824b;
                View view3 = (View) this.f825c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                return;
            case 21:
                a3 a3Var = (a3) this.f824b;
                o1 o1Var = (o1) this.f825c;
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
                m3 m3Var = (m3) this.f824b;
                int i13 = m3Var.e;
                m3Var.f31569g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.f31567c - i13)) + i13);
                int i14 = m3Var.f31568f;
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - i14)) + i14);
                ((x2) this.f825c).invalidate();
                return;
            case 23:
                cy.n1(((fw) this.f824b).M, (ay) this.f825c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) this.f824b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f825c).invalidateOutline();
                ImageView imageView = photoViewer.f33452x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                au0 au0Var = photoViewer.E2;
                if (au0Var != null) {
                    au0Var.invalidateOutline();
                    return;
                }
                return;
            case 25:
                a5.a aVar2 = (a5.a) this.f824b;
                int[] iArr2 = (int[]) this.f825c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f281b;
                ((jm0) aVar2.d).scrollBy(0, i15);
                iArr2[0] = iArr2[0] + i15;
                aVar2.f281b = intValue2;
                return;
            case 26:
                kh1 kh1Var = (kh1) this.f824b;
                kh1Var.getClass();
                kh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((si) this.f825c).invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((a4.l) this.f824b).f279b).d.getParent()).invalidate();
                return;
            default:
                b2 b2Var = (b2) this.f824b;
                boolean[] zArr2 = (boolean[]) this.f825c;
                b2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    b2Var.setRotationY(90.0f * f16);
                    b2Var.f45305z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b2Var.f45297r0.b(b2Var.f45304y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f17) * (-90.0f));
                b2Var.f45305z0 = (f17 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
        }
    }
}
