package f2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import gh.kb;
import gh.lb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.voip.b3;
import org.telegram.ui.Components.voip.n3;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xa;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.ho;
import org.telegram.ui.hw;
import org.telegram.ui.ph1;
import org.telegram.ui.qn;
import org.telegram.ui.st0;
import org.telegram.ui.u11;
import org.telegram.ui.z11;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f5356a;
    public final Object f5357b;
    public final Object f5358c;

    public g(int i9, Object obj, Object obj2) {
        this.f5356a = i9;
        this.f5357b = obj;
        this.f5358c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = 0;
        switch (this.f5356a) {
            case 0:
                ((n) this.f5357b).P((q1) this.f5358c);
                return;
            case 1:
                lb lbVar = (lb) this.f5357b;
                lbVar.getClass();
                ((kb) this.f5358c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lbVar.R();
                return;
            case 2:
                hg.e0 e0Var = (hg.e0) this.f5357b;
                ArrayList arrayList = (ArrayList) this.f5358c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i9 < arrayList.size()) {
                    hg.e0.g((View) arrayList.get(i9), floatValue);
                    i9++;
                }
                e0Var.f10584m.f36677g0.invalidate();
                return;
            case 3:
                ih.q qVar = (ih.q) this.f5357b;
                View view = (View) this.f5358c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.f11989y.setAlpha(floatValue2);
                qVar.f11989y.setTranslationY(AndroidUtilities.dp(5.0f) * f10);
                return;
            case 4:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f5357b;
                boolean[] zArr = (boolean[]) this.f5358c;
                int i10 = ProfileStoriesView.f36197o0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new ih.g(profileStoriesView, 7), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 5:
                qn qnVar = (qn) this.f5357b;
                qn qnVar2 = (qn) this.f5358c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.Q9 = floatValue4;
                qnVar2.fragmentView.invalidate();
                qnVar2.f42077t0.invalidate();
                float f11 = 1.0f - floatValue4;
                float dp = AndroidUtilities.dp(8.0f) * f11;
                qnVar.W0.setTranslationY(dp);
                qnVar.W0.getAvatarImageView().setTranslationY(-dp);
                float f12 = (-AndroidUtilities.dp(8.0f)) * floatValue4;
                qnVar2.W0.setTranslationY(f12);
                qnVar2.W0.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue4 * 0.2f) + 0.8f;
                qnVar.W0.getAvatarImageView().setScaleX(f13);
                qnVar.W0.getAvatarImageView().setScaleY(f13);
                qnVar.W0.getAvatarImageView().setAlpha(floatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                qnVar2.W0.getAvatarImageView().setScaleX(f14);
                qnVar2.W0.getAvatarImageView().setScaleY(f14);
                qnVar2.W0.getAvatarImageView().setAlpha(f11);
                sg sgVar = qnVar2.I0;
                if (sgVar != null) {
                    sgVar.setAlpha(f11);
                    return;
                }
                return;
            case 6:
                ho hoVar = (ho) this.f5357b;
                ArrayList arrayList2 = (ArrayList) this.f5358c;
                hoVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hoVar.J.setAlpha(floatValue5);
                p8 p8Var = hoVar.J;
                float f15 = 1.0f - floatValue5;
                p8Var.setTranslationY(((-p8Var.getHeight()) / 2.0f) * f15);
                hoVar.J.setScaleY((floatValue5 * 0.8f) + 0.2f);
                while (i9 < arrayList2.size()) {
                    ((View) arrayList2.get(i9)).setTranslationY((-hoVar.J.getHeight()) * f15);
                    i9++;
                }
                return;
            case 7:
                o9 o9Var = (o9) this.f5357b;
                o9 o9Var2 = (o9) this.f5358c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var.setScaleX(floatValue6);
                o9Var.setScaleY(floatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !o9Var2.getImageReceiver().hasBitmapImage()) {
                    o9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 8:
                ((xa) this.f5357b).accept(Float.valueOf(((org.telegram.ui.Components.lb) this.f5358c).getTranslationY()));
                return;
            case 9:
                ((dl) this.f5357b).accept(Float.valueOf(((org.telegram.ui.Components.lb) this.f5358c).getTranslationY()));
                return;
            case 10:
                qh qhVar = (qh) this.f5357b;
                qhVar.getClass();
                ((mt) this.f5358c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ki kiVar = qhVar.V;
                kiVar.U1();
                ci ciVar = kiVar.f30160u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(kiVar.f30122h2);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f5357b;
                lVar.getClass();
                ((wt) this.f5358c).f34360b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i9 < ((ArrayList) lVar.d).size()) {
                    if (!hg.h0.f10609b) {
                        ((View) ((ArrayList) lVar.d).get(i9)).invalidate();
                    }
                    i9++;
                }
                return;
            case 12:
                kx0 kx0Var = (kx0) this.f5357b;
                jx0[] jx0VarArr = (jx0[]) this.f5358c;
                kx0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i9 < jx0VarArr.length) {
                    kx0Var.f30255c[i9] = (kx0Var.d[i9] * floatValue7) + ((1.0f - floatValue7) * kx0Var.f30256e[i9]);
                    i9++;
                }
                kx0Var.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f5357b;
                k0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f5358c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                return;
            case 14:
                View view2 = (View) this.f5357b;
                View view3 = (View) this.f5358c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue8;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f16);
                view2.setAlpha(floatValue8);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue8);
                view3.setAlpha(f16);
                return;
            case 15:
                b3 b3Var = (b3) this.f5357b;
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f5358c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i11 = n1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && b3Var.N) {
                    b3Var.M.pause();
                    AnimatorSet animatorSet = b3Var.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                n3 n3Var = (n3) this.f5357b;
                int i12 = n3Var.f33702e;
                n3Var.f33704g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.f33701c - i12)) + i12);
                int i13 = n3Var.f33703f;
                n3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (n3Var.d - i13)) + i13);
                ((y2) this.f5358c).invalidate();
                return;
            case 17:
                dy.q1(((hw) this.f5357b).M, (cy) this.f5358c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.f5357b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f5358c).invalidateOutline();
                ImageView imageView = photoViewer.f35755t3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                st0 st0Var = photoViewer.A2;
                if (st0Var != null) {
                    st0Var.invalidateOutline();
                    return;
                }
                return;
            case 19:
                z11 z11Var = (z11) this.f5357b;
                int[] iArr = (int[]) this.f5358c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb0 jb0Var = z11Var.f45005n;
                if (jb0Var != null) {
                    jb0Var.K = 1.0f;
                    jb0Var.i();
                    z11Var.f45005n.s(1.0f - floatValue9);
                }
                jb0 jb0Var2 = z11Var.h;
                jb0Var2.K = floatValue9;
                jb0Var2.i();
                z11Var.h.s(floatValue9);
                if (iArr != null) {
                    int d = i0.a.d(floatValue9, z11Var.f45003e[0], iArr[0]);
                    int d9 = i0.a.d(floatValue9, z11Var.f45003e[1], iArr[1]);
                    int d10 = i0.a.d(floatValue9, z11Var.f45003e[2], iArr[2]);
                    int d11 = i0.a.d(floatValue9, z11Var.f45003e[3], iArr[3]);
                    u11 u11Var = z11Var.A;
                    u11Var.f43100a.n(d, d9, d10, d11);
                    u11Var.invalidate();
                }
                z11Var.f45008w.invalidate();
                return;
            case 20:
                a6.a aVar = (a6.a) this.f5357b;
                int[] iArr2 = (int[]) this.f5358c;
                aVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue - aVar.f102c;
                ((wk0) aVar.d).scrollBy(0, i14);
                iArr2[0] = iArr2[0] + i14;
                aVar.f102c = intValue;
                return;
            case 21:
                ph1 ph1Var = (ph1) this.f5357b;
                ph1Var.getClass();
                ph1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ji) this.f5358c).invalidate();
                return;
            case 22:
                ((TextView) this.f5357b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f5358c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                qf.g gVar = (qf.g) this.f5357b;
                sf.d dVar = (sf.d) this.f5358c;
                gVar.getClass();
                dVar.f47533f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.f46196b;
                int size = arrayList3.size();
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    sf.d dVar2 = (sf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f47533f = (int) ((dVar2.f47534g / 255.0f) * (255 - dVar.f47533f));
                    }
                }
                gVar.invalidate();
                return;
            case 24:
                qf.g gVar2 = (qf.g) this.f5357b;
                sf.b bVar = (sf.b) this.f5358c;
                gVar2.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.f46199c;
                int size2 = arrayList4.size();
                while (i9 < size2) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    sf.b bVar2 = (sf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue10 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue10) * bVar2.f47521e);
                    }
                }
                gVar2.invalidate();
                return;
            case 25:
                qf.n nVar = (qf.n) this.f5357b;
                nVar.getClass();
                ((qf.o) this.f5358c).f46254r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 26:
                j4.x0 x0Var = (j4.x0) this.f5357b;
                x0Var.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x0Var.f13607b = intValue2;
                ((kh.p) this.f5358c).h(intValue2);
                return;
            case 27:
                ((org.telegram.ui.Cells.v0) this.f5357b).f25780c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.w0) this.f5358c).invalidate();
                return;
            default:
                vf.a aVar2 = (vf.a) this.f5357b;
                int[] iArr3 = (int[]) this.f5358c;
                aVar2.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue11, iArr3[0], aVar2.h[0]), i0.a.d(floatValue11, iArr3[1], aVar2.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar2.f48393b = linearGradient;
                linearGradient.setLocalMatrix(aVar2.f48394c);
                paint.setShader(aVar2.f48393b);
                aVar2.f48392a.setPaint(paint, 0);
                aVar2.f48397g.setColor(i0.a.d(0.1f, i0.a.d(floatValue11, iArr3[1], aVar2.h[1]), -1));
                aVar2.f48396f.setColor(i0.a.d(0.1f, i0.a.d(floatValue11, iArr3[0], aVar2.h[0]), -16777216));
                aVar2.invalidateSelf();
                return;
        }
    }
}
