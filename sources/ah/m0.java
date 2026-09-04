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
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a31;
import org.telegram.ui.co;
import org.telegram.ui.g31;
import org.telegram.ui.tu0;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.xi1;
import org.telegram.ui.xo;
import org.telegram.ui.xw;
import rg.c2;
public final class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f639a;
    public final Object f640b;
    public final Object f641c;

    public m0(int i10, Object obj, Object obj2) {
        this.f639a = i10;
        this.f640b = obj;
        this.f641c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f639a) {
            case 0:
                u0 u0Var = (u0) this.f640b;
                ArrayList arrayList = (ArrayList) this.f641c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    u0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                u0Var.f695m.f37652k0.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f640b;
                View view = (View) this.f641c;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                uVar.f3779y.setAlpha(floatValue2);
                uVar.f3779y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f640b;
                boolean[] zArr = (boolean[]) this.f641c;
                int i11 = ProfileStoriesView.f34142s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.c(profileStoriesView, 19), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 3:
                ((TextView) this.f640b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f641c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                jg.g gVar = (jg.g) this.f640b;
                lg.d dVar = (lg.d) this.f641c;
                gVar.getClass();
                dVar.f15424f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f13657b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f15424f = (int) ((dVar2.f15425g / 255.0f) * (255 - dVar.f15424f));
                    }
                }
                gVar.invalidate();
                return;
            case 5:
                jg.g gVar2 = (jg.g) this.f640b;
                lg.b bVar = (lg.b) this.f641c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f13660c;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    lg.b bVar2 = (lg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f15412e);
                    }
                }
                gVar2.invalidate();
                return;
            case 6:
                jg.n nVar = (jg.n) this.f640b;
                nVar.getClass();
                ((jg.o) this.f641c).f13719r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 7:
                j5.b bVar3 = (j5.b) this.f640b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f13513b = intValue;
                ((fi.f) this.f641c).c(intValue);
                return;
            case 8:
                ((org.telegram.ui.Cells.v0) this.f640b).f23354c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f641c).invalidate();
                return;
            case 9:
                og.a aVar = (og.a) this.f640b;
                int[] iArr = (int[]) this.f641c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue5, iArr[0], aVar.h[0]), i0.a.d(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f17015b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f17016c);
                paint.setShader(aVar.f17015b);
                aVar.f17014a.setPaint(paint, 0);
                aVar.f17019g.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f17018f.setColor(i0.a.d(0.1f, i0.a.d(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 10:
                co coVar = (co) this.f640b;
                co coVar2 = (co) this.f641c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.U9 = floatValue6;
                coVar2.fragmentView.invalidate();
                coVar2.f35473x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                coVar.f35186a1.setTranslationY(dp);
                coVar.f35186a1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                coVar2.f35186a1.setTranslationY(f11);
                coVar2.f35186a1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                coVar.f35186a1.getAvatarImageView().setScaleX(f12);
                coVar.f35186a1.getAvatarImageView().setScaleY(f12);
                coVar.f35186a1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                coVar2.f35186a1.getAvatarImageView().setScaleX(f13);
                coVar2.f35186a1.getAvatarImageView().setScaleY(f13);
                coVar2.f35186a1.getAvatarImageView().setAlpha(f10);
                dh dhVar = coVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(f10);
                    return;
                }
                return;
            case 11:
                xo xoVar = (xo) this.f640b;
                ArrayList arrayList4 = (ArrayList) this.f641c;
                xoVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xoVar.N.setAlpha(floatValue7);
                r8 r8Var = xoVar.N;
                float f14 = 1.0f - floatValue7;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                xoVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-xoVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 12:
                x9 x9Var = (x9) this.f640b;
                x9 x9Var2 = (x9) this.f641c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.setScaleX(floatValue8);
                x9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !x9Var2.getImageReceiver().hasBitmapImage()) {
                    x9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 13:
                ((gb) this.f640b).accept(Float.valueOf(((ub) this.f641c).getTranslationY()));
                return;
            case 14:
                ((ml) this.f640b).accept(Float.valueOf(((ub) this.f641c).getTranslationY()));
                return;
            case 15:
                ai aiVar = (ai) this.f640b;
                aiVar.getClass();
                ((zt) this.f641c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vi viVar = aiVar.f24398c0;
                viVar.U1();
                ni niVar = viVar.f31340y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31291j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(viVar.f31298l2);
                    return;
                }
                return;
            case 16:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f640b;
                mVar.getClass();
                ((ju) this.f641c).f27570b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!y0.f720b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 17:
                cy0 cy0Var = (cy0) this.f640b;
                by0[] by0VarArr = (by0[]) this.f641c;
                cy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < by0VarArr.length) {
                    cy0Var.f25130c[i10] = (cy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * cy0Var.f25131e[i10]);
                    i10++;
                }
                cy0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f640b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f641c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 19:
                View view2 = (View) this.f640b;
                View view3 = (View) this.f641c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                return;
            case 20:
                a3 a3Var = (a3) this.f640b;
                o1 o1Var = (o1) this.f641c;
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
            case 21:
                m3 m3Var = (m3) this.f640b;
                int i13 = m3Var.f31652e;
                m3Var.f31654g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.f31651c - i13)) + i13);
                int i14 = m3Var.f31653f;
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - i14)) + i14);
                ((x2) this.f641c).invalidate();
                return;
            case 22:
                uy.q1(((xw) this.f640b).M, (ty) this.f641c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f640b;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f641c).invalidateOutline();
                ImageView imageView = photoViewer.f33721x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                tu0 tu0Var = photoViewer.E2;
                if (tu0Var != null) {
                    tu0Var.invalidateOutline();
                    return;
                }
                return;
            case 24:
                g31 g31Var = (g31) this.f640b;
                int[] iArr2 = (int[]) this.f641c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dc0 dc0Var = g31Var.f36543n;
                if (dc0Var != null) {
                    dc0Var.K = 1.0f;
                    dc0Var.i();
                    g31Var.f36543n.s(1.0f - floatValue11);
                }
                dc0 dc0Var2 = g31Var.h;
                dc0Var2.K = floatValue11;
                dc0Var2.i();
                g31Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, g31Var.f36541e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, g31Var.f36541e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, g31Var.f36541e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, g31Var.f36541e[3], iArr2[3]);
                    a31 a31Var = g31Var.E;
                    a31Var.f34314a.n(d, d10, d11, d12);
                    a31Var.invalidate();
                }
                g31Var.f36546w.invalidate();
                return;
            case 25:
                a5.a aVar2 = (a5.a) this.f640b;
                int[] iArr3 = (int[]) this.f641c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f285b;
                ((ll0) aVar2.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                aVar2.f285b = intValue2;
                return;
            case 26:
                xi1 xi1Var = (xi1) this.f640b;
                xi1Var.getClass();
                xi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ui) this.f641c).invalidate();
                return;
            case 27:
                c2 c2Var = (c2) this.f640b;
                boolean[] zArr2 = (boolean[]) this.f641c;
                c2Var.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue12 < 0.5f) {
                    float f16 = floatValue12 / 0.5f;
                    c2Var.setRotationY(90.0f * f16);
                    c2Var.f45153z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c2Var.f45145r0.b(c2Var.f45152y0, false);
                }
                float f17 = (floatValue12 - 0.5f) / 0.5f;
                c2Var.setRotationY((1.0f - f17) * (-90.0f));
                c2Var.f45153z0 = (f17 * 0.3f) + 0.7f;
                c2Var.invalidate();
                return;
            default:
                ((s4.j) this.f640b).P((s4.c1) this.f641c);
                return;
        }
    }
}
