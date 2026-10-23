package ah;

import ai.oe;
import ai.pe;
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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.m3;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.zh;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.du0;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.hw;
import org.telegram.ui.ko;
import org.telegram.ui.rh1;
import org.telegram.ui.sn;
import rg.c2;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f824a;
    public final Object f825b;
    public final Object f826c;

    public l0(int i10, Object obj, Object obj2) {
        this.f824a = i10;
        this.f825b = obj;
        this.f826c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f824a) {
            case 0:
                t0 t0Var = (t0) this.f825b;
                ArrayList arrayList = (ArrayList) this.f826c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    t0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                t0Var.f878m.f35911k0.invalidate();
                return;
            case 1:
                pe peVar = (pe) this.f825b;
                peVar.getClass();
                ((oe) this.f826c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                peVar.f1();
                return;
            case 2:
                ci.q qVar = (ci.q) this.f825b;
                View view = (View) this.f826c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.f5764y.setAlpha(floatValue2);
                qVar.f5764y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f825b;
                boolean[] zArr = (boolean[]) this.f826c;
                int i11 = ProfileStoriesView.f34167s0;
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
                ((TextView) this.f825b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f826c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jg.g gVar = (jg.g) this.f825b;
                lg.d dVar = (lg.d) this.f826c;
                gVar.getClass();
                dVar.f16104f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f14493b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    lg.d dVar2 = (lg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f16104f = (int) ((dVar2.f16105g / 255.0f) * (255 - dVar.f16104f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                jg.g gVar2 = (jg.g) this.f825b;
                lg.b bVar = (lg.b) this.f826c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f14496c;
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
                jg.n nVar = (jg.n) this.f825b;
                nVar.getClass();
                ((jg.o) this.f826c).f14552r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                j5.c cVar = (j5.c) this.f825b;
                cVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                cVar.f14302b = intValue;
                ((j5.b) this.f826c).j(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.u0) this.f825b).f23720c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.v0) this.f826c).invalidate();
                return;
            case 10:
                og.a aVar = (og.a) this.f825b;
                int[] iArr = (int[]) this.f826c;
                aVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue5, iArr[0], aVar.h[0]), i0.a.f(floatValue5, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f17796b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f17797c);
                paint.setShader(aVar.f17796b);
                aVar.f17795a.setPaint(paint, 0);
                aVar.f17799g.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[1], aVar.h[1]), -1));
                aVar.f17798f.setColor(i0.a.f(0.1f, i0.a.f(floatValue5, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 11:
                sn snVar = (sn) this.f825b;
                sn snVar2 = (sn) this.f826c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.f41534ga = floatValue6;
                snVar2.fragmentView.invalidate();
                snVar2.f41737x0.invalidate();
                float f10 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                snVar.f41597m1.setTranslationY(dp);
                snVar.f41597m1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                snVar2.f41597m1.setTranslationY(f11);
                snVar2.f41597m1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue6 * 0.2f) + 0.8f;
                snVar.f41597m1.getAvatarImageView().setScaleX(f12);
                snVar.f41597m1.getAvatarImageView().setScaleY(f12);
                snVar.f41597m1.getAvatarImageView().setAlpha(floatValue6);
                float f13 = (0.2f * f10) + 0.8f;
                snVar2.f41597m1.getAvatarImageView().setScaleX(f13);
                snVar2.f41597m1.getAvatarImageView().setScaleY(f13);
                snVar2.f41597m1.getAvatarImageView().setAlpha(f10);
                ch chVar = snVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    return;
                }
                return;
            case 12:
                ko koVar = (ko) this.f825b;
                ArrayList arrayList4 = (ArrayList) this.f826c;
                koVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                koVar.N.setAlpha(floatValue7);
                r8 r8Var = koVar.N;
                float f14 = 1.0f - floatValue7;
                r8Var.setTranslationY(((-r8Var.getHeight()) / 2.0f) * f14);
                koVar.N.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-koVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 13:
                w9 w9Var = (w9) this.f825b;
                w9 w9Var2 = (w9) this.f826c;
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
                ((gb) this.f825b).accept(Float.valueOf(((ub) this.f826c).getTranslationY()));
                return;
            case 15:
                ((xl) this.f825b).accept(Float.valueOf(((ub) this.f826c).getTranslationY()));
                return;
            case 16:
                zh zhVar = (zh) this.f825b;
                zhVar.getClass();
                ((iu) this.f826c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = zhVar.f33224c0;
                tiVar.c2();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30742j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.f30758o2);
                    return;
                }
                return;
            case 17:
                c2.b bVar3 = (c2.b) this.f825b;
                bVar3.getClass();
                ((su) this.f826c).f30555b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar3.d).size()) {
                    if (!x0.f902b) {
                        ((View) ((ArrayList) bVar3.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 18:
                az0 az0Var = (az0) this.f825b;
                zy0[] zy0VarArr = (zy0[]) this.f826c;
                az0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < zy0VarArr.length) {
                    az0Var.f24882c[i10] = (az0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * az0Var.e[i10]);
                    i10++;
                }
                az0Var.invalidate();
                return;
            case 19:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f825b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f826c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 20:
                View view2 = (View) this.f825b;
                View view3 = (View) this.f826c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue10;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue10);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view3.setAlpha(f15);
                return;
            case 21:
                a3 a3Var = (a3) this.f825b;
                o1 o1Var = (o1) this.f826c;
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
                m3 m3Var = (m3) this.f825b;
                int i13 = m3Var.e;
                m3Var.f31754g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.f31752c - i13)) + i13);
                int i14 = m3Var.f31753f;
                m3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (m3Var.d - i14)) + i14);
                ((x2) this.f826c).invalidate();
                return;
            case 23:
                ey.m1(((hw) this.f825b).M, (dy) this.f826c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) this.f825b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f826c).invalidateOutline();
                ImageView imageView = photoViewer.f33753x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                du0 du0Var = photoViewer.E2;
                if (du0Var != null) {
                    du0Var.invalidateOutline();
                    return;
                }
                return;
            case 25:
                a5.a aVar2 = (a5.a) this.f825b;
                int[] iArr2 = (int[]) this.f826c;
                aVar2.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - aVar2.f281b;
                ((mm0) aVar2.d).scrollBy(0, i15);
                iArr2[0] = iArr2[0] + i15;
                aVar2.f281b = intValue2;
                return;
            case 26:
                rh1 rh1Var = (rh1) this.f825b;
                rh1Var.getClass();
                rh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((si) this.f826c).invalidate();
                return;
            case 27:
                ((View) ((g.a0) ((a4.l) this.f825b).f279b).d.getParent()).invalidate();
                return;
            default:
                c2 c2Var = (c2) this.f825b;
                boolean[] zArr2 = (boolean[]) this.f826c;
                c2Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f16 = floatValue11 / 0.5f;
                    c2Var.setRotationY(90.0f * f16);
                    c2Var.f45733z0 = ((1.0f - f16) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c2Var.f45725r0.b(c2Var.f45732y0, false);
                }
                float f17 = (floatValue11 - 0.5f) / 0.5f;
                c2Var.setRotationY((1.0f - f17) * (-90.0f));
                c2Var.f45733z0 = (f17 * 0.3f) + 0.7f;
                c2Var.invalidate();
                return;
        }
    }
}
