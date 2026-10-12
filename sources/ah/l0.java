package ah;

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
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.n3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
import org.telegram.ui.bx;
import org.telegram.ui.fo;
import org.telegram.ui.g31;
import org.telegram.ui.gj1;
import org.telegram.ui.l31;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
import org.telegram.ui.zo;
import rg.c2;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f819a;
    public final Object f820b;
    public final Object f821c;

    public l0(int i10, Object obj, Object obj2) {
        this.f819a = i10;
        this.f820b = obj;
        this.f821c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f819a) {
            case 0:
                t0 t0Var = (t0) this.f820b;
                ArrayList arrayList = (ArrayList) this.f821c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    t0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                t0Var.f873m.f39643k0.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f820b;
                View view = (View) this.f821c;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                uVar.f3769y.setAlpha(floatValue2);
                uVar.f3769y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f820b;
                boolean[] zArr = (boolean[]) this.f821c;
                int i11 = ProfileStoriesView.f32809s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 20), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 3:
                ((TextView) this.f820b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f821c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                jg.g gVar = (jg.g) this.f820b;
                lg.d dVar = (lg.d) this.f821c;
                gVar.getClass();
                dVar.f14698f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f13032b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f14698f = (int) ((dVar2.f14699g / 255.0f) * (255 - dVar.f14698f));
                    }
                }
                gVar.invalidate();
                return;
            case 5:
                jg.g gVar2 = (jg.g) this.f820b;
                lg.b bVar = (lg.b) this.f821c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f13035c;
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
            case 6:
                jg.n nVar = (jg.n) this.f820b;
                nVar.getClass();
                ((jg.o) this.f821c).f13091r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 7:
                j5.b bVar3 = (j5.b) this.f820b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f12841b = intValue;
                ((f1.a) this.f821c).c(intValue);
                return;
            case 8:
                ((org.telegram.ui.Cells.w0) this.f820b).f22601c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.x0) this.f821c).invalidate();
                return;
            case 9:
                og.a aVar = (og.a) this.f820b;
                int[] iArr = (int[]) this.f821c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue5, iArr[0], aVar.h[0]), i0.a.d(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f16642b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f16643c);
                paint.setShader(aVar.f16642b);
                aVar.f16641a.setPaint(paint, 0);
                aVar.f16645g.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f16644f.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 10:
                fo foVar = (fo) this.f820b;
                fo foVar2 = (fo) this.f821c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.U9 = floatValue6;
                foVar2.fragmentView.invalidate();
                foVar2.f36160x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                foVar.f35872a1.setTranslationY(dp);
                foVar.f35872a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                foVar2.f35872a1.setTranslationY(f11);
                foVar2.f35872a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                foVar.f35872a1.getAvatarImageView().setScaleX(f12);
                foVar.f35872a1.getAvatarImageView().setScaleY(f12);
                foVar.f35872a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                foVar2.f35872a1.getAvatarImageView().setScaleX(f13);
                foVar2.f35872a1.getAvatarImageView().setScaleY(f13);
                foVar2.f35872a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = foVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    return;
                }
                return;
            case 11:
                zo zoVar = (zo) this.f820b;
                ArrayList arrayList4 = (ArrayList) this.f821c;
                zoVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zoVar.N.setAlpha(floatValue7);
                r8 r8Var = zoVar.N;
                float f14 = 1.0f - floatValue7;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                zoVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-zoVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 12:
                z9 z9Var = (z9) this.f820b;
                z9 z9Var2 = (z9) this.f821c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.setScaleX(floatValue8);
                z9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !z9Var2.getImageReceiver().hasBitmapImage()) {
                    z9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 13:
                ((ib) this.f820b).accept(Float.valueOf(((wb) this.f821c).getTranslationY()));
                return;
            case 14:
                ((am) this.f820b).accept(Float.valueOf(((wb) this.f821c).getTranslationY()));
                return;
            case 15:
                ai aiVar = (ai) this.f820b;
                aiVar.getClass();
                ((nu) this.f821c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.f23560c0;
                viVar.Y1();
                ni niVar = viVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f30013j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(viVar.f30029o2);
                    return;
                }
                return;
            case 16:
                c2.b bVar4 = (c2.b) this.f820b;
                bVar4.getClass();
                ((xu) this.f821c).f31330b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar4.d).size()) {
                    if (!x0.f897b) {
                        ((View) ((ArrayList) bVar4.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 17:
                az0 az0Var = (az0) this.f820b;
                zy0[] zy0VarArr = (zy0[]) this.f821c;
                az0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < zy0VarArr.length) {
                    az0Var.f23649c[i10] = (az0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * az0Var.e[i10]);
                    i10++;
                }
                az0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f820b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f821c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 19:
                View view2 = (View) this.f820b;
                View view3 = (View) this.f821c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                return;
            case 20:
                b3 b3Var = (b3) this.f820b;
                o1 o1Var = (o1) this.f821c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && b3Var.R) {
                    b3Var.Q.pause();
                    AnimatorSet animatorSet = b3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                n3 n3Var = (n3) this.f820b;
                int i13 = n3Var.e;
                n3Var.f30343g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.f30341c - i13)) + i13);
                int i14 = n3Var.f30342f;
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - i14)) + i14);
                ((y2) this.f821c).invalidate();
                return;
            case 22:
                yy.n1(((bx) this.f820b).M, (xy) this.f821c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f820b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f821c).invalidateOutline();
                ImageView imageView = photoViewer.f32399x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                bv0 bv0Var = photoViewer.E2;
                if (bv0Var != null) {
                    bv0Var.invalidateOutline();
                    return;
                }
                return;
            case 24:
                l31 l31Var = (l31) this.f820b;
                int[] iArr2 = (int[]) this.f821c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd0 cd0Var = l31Var.f37830n;
                if (cd0Var != null) {
                    cd0Var.K = 1.0f;
                    cd0Var.i();
                    l31Var.f37830n.s(1.0f - floatValue11);
                }
                cd0 cd0Var2 = l31Var.h;
                cd0Var2.K = floatValue11;
                cd0Var2.i();
                l31Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, l31Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, l31Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, l31Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, l31Var.e[3], iArr2[3]);
                    g31 g31Var = l31Var.E;
                    g31Var.f36288a.n(d, d10, d11, d12);
                    g31Var.invalidate();
                }
                l31Var.f37833w.invalidate();
                return;
            case 25:
                a5.a aVar2 = (a5.a) this.f820b;
                int[] iArr3 = (int[]) this.f821c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f279b;
                ((mm0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f279b = intValue2;
                return;
            case 26:
                gj1 gj1Var = (gj1) this.f820b;
                gj1Var.getClass();
                gj1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ui) this.f821c).invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((k6.h) this.f820b).f14176b).d.getParent()).invalidate();
                return;
            case 28:
                c2 c2Var = (c2) this.f820b;
                boolean[] zArr2 = (boolean[]) this.f821c;
                c2Var.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue12 < 0.5f) {
                    float f16 = floatValue12 / 0.5f;
                    c2Var.setRotationY(90.0f * f16);
                    c2Var.f44224z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c2Var.f44216r0.b(c2Var.f44223y0, false);
                }
                float f17 = (floatValue12 - 0.5f) / 0.5f;
                c2Var.setRotationY((1.0f - f17) * (-90.0f));
                c2Var.f44224z0 = (f17 * 0.3f) + 0.7f;
                c2Var.invalidate();
                return;
            default:
                ((s4.k) this.f820b).P((s4.b1) this.f821c);
                return;
        }
    }
}
