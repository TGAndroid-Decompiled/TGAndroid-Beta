package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b4.e0;
import cb.m;
import dg.a3;
import dg.y2;
import eg.e2;
import f2.l;
import f2.l1;
import java.util.ArrayList;
import lh.fb;
import lh.gb;
import mg.d0;
import mg.g0;
import nh.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.voip.c3;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.voip.o3;
import org.telegram.ui.Components.voip.t;
import org.telegram.ui.Components.voip.z2;
import org.telegram.ui.Components.xa;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.hu0;
import org.telegram.ui.li1;
import org.telegram.ui.o21;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.ro;
import org.telegram.ui.u21;
import org.telegram.ui.uw;
import org.telegram.ui.zn;
import vf.g;
import vf.n;
import vf.o;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f183a;
    public final Object f184b;
    public final Object f185c;

    public a(int i10, Object obj, Object obj2) {
        this.f183a = i10;
        this.f184b = obj;
        this.f185c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f183a) {
            case 0:
                b bVar = (b) this.f184b;
                int[] iArr = (int[]) this.f185c;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue, iArr[0], bVar.h[0]), i0.a.d(floatValue, iArr[1], bVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                bVar.f190b = linearGradient;
                linearGradient.setLocalMatrix(bVar.f191c);
                paint.setShader(bVar.f190b);
                bVar.f189a.setPaint(paint, 0);
                bVar.f193g.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[1], bVar.h[1]), -1));
                bVar.f192f.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[0], bVar.h[0]), -16777216));
                bVar.invalidateSelf();
                return;
            case 1:
                a3 a3Var = (a3) this.f184b;
                boolean[] zArr = (boolean[]) this.f185c;
                a3Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    float f10 = floatValue2 / 0.5f;
                    a3Var.setRotationY(90.0f * f10);
                    a3Var.f4378w0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    a3Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    a3Var.f4370o0.b(a3Var.f4377v0, false);
                }
                float f11 = (floatValue2 - 0.5f) / 0.5f;
                a3Var.setRotationY((1.0f - f11) * (-90.0f));
                a3Var.f4378w0 = (f11 * 0.3f) + 0.7f;
                a3Var.invalidate();
                return;
            case 2:
                y2 y2Var = (y2) this.f184b;
                y2Var.getClass();
                ((Drawable) this.f185c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((e2) y2Var.f4867c).f5269x0;
                if (view instanceof s1) {
                    ((s1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            case 3:
                ((l) this.f184b).P((l1) this.f185c);
                return;
            case 4:
                gb gbVar = (gb) this.f184b;
                gbVar.getClass();
                ((fb) this.f185c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.M();
                return;
            case 5:
                d0 d0Var = (d0) this.f184b;
                ArrayList arrayList = (ArrayList) this.f185c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    d0.g((View) arrayList.get(i10), floatValue3);
                    i10++;
                }
                d0Var.f13969m.f39869h0.invalidate();
                return;
            case 6:
                p pVar = (p) this.f184b;
                View view2 = (View) this.f185c;
                pVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue4;
                view2.setAlpha(f12);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue4);
                pVar.f15715y.setAlpha(floatValue4);
                pVar.f15715y.setTranslationY(AndroidUtilities.dp(5.0f) * f12);
                return;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f184b;
                boolean[] zArr2 = (boolean[]) this.f185c;
                int i11 = ProfileStoriesView.f32277p0;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue5 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new lh.b(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.T = Math.max(1.0f, floatValue5);
                profileStoriesView.invalidate();
                return;
            case 8:
                zn znVar = (zn) this.f184b;
                zn znVar2 = (zn) this.f185c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.R9 = floatValue6;
                znVar2.fragmentView.invalidate();
                znVar2.f40759u0.invalidate();
                float f13 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f13;
                znVar.X0.setTranslationY(dp);
                znVar.X0.getAvatarImageView().setTranslationY(-dp);
                float f14 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                znVar2.X0.setTranslationY(f14);
                znVar2.X0.getAvatarImageView().setTranslationY(-f14);
                float f15 = (floatValue6 * 0.2f) + 0.8f;
                znVar.X0.getAvatarImageView().setScaleX(f15);
                znVar.X0.getAvatarImageView().setScaleY(f15);
                znVar.X0.getAvatarImageView().setAlpha(floatValue6);
                float f16 = (0.2f * f13) + 0.8f;
                znVar2.X0.getAvatarImageView().setScaleX(f16);
                znVar2.X0.getAvatarImageView().setScaleY(f16);
                znVar2.X0.getAvatarImageView().setAlpha(f13);
                sg sgVar = znVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(f13);
                    return;
                }
                return;
            case 9:
                ro roVar = (ro) this.f184b;
                ArrayList arrayList2 = (ArrayList) this.f185c;
                roVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roVar.K.setAlpha(floatValue7);
                n8 n8Var = roVar.K;
                float f17 = 1.0f - floatValue7;
                n8Var.setTranslationY(((-n8Var.getHeight()) / 2.0f) * f17);
                roVar.K.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-roVar.K.getHeight()) * f17);
                    i10++;
                }
                return;
            case 10:
                p9 p9Var = (p9) this.f184b;
                p9 p9Var2 = (p9) this.f185c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue8);
                p9Var.setScaleY(floatValue8);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !p9Var2.getImageReceiver().hasBitmapImage()) {
                    p9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 11:
                ((xa) this.f184b).accept(Float.valueOf(((nb) this.f185c).getTranslationY()));
                return;
            case 12:
                ((gl) this.f184b).accept(Float.valueOf(((nb) this.f185c).getTranslationY()));
                return;
            case 13:
                qh qhVar = (qh) this.f184b;
                qhVar.getClass();
                ((ut) this.f185c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                li liVar = qhVar.W;
                liVar.U1();
                di diVar = liVar.f26744v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
                if (diVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(liVar.f26706i2);
                    return;
                }
                return;
            case 14:
                m mVar = (m) this.f184b;
                mVar.getClass();
                ((eu) this.f185c).f24693b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!g0.f13992b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 15:
                fy0 fy0Var = (fy0) this.f184b;
                ey0[] ey0VarArr = (ey0[]) this.f185c;
                fy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ey0VarArr.length) {
                    fy0Var.f24990c[i10] = (fy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * fy0Var.e[i10]);
                    i10++;
                }
                fy0Var.invalidate();
                return;
            case 16:
                k0 k0Var = (k0) this.f184b;
                k0Var.getClass();
                ((t) this.f185c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                return;
            case 17:
                View view3 = (View) this.f184b;
                View view4 = (View) this.f185c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f18 = 1.0f - floatValue10;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f18);
                view3.setAlpha(floatValue10);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view4.setAlpha(f18);
                return;
            case 18:
                c3 c3Var = (c3) this.f184b;
                n1 n1Var = (n1) this.f185c;
                n1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                n1Var.c();
                int i12 = n1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && c3Var.O) {
                    c3Var.N.pause();
                    AnimatorSet animatorSet = c3Var.M;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                o3 o3Var = (o3) this.f184b;
                int i13 = o3Var.e;
                o3Var.f29805g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.f29803c - i13)) + i13);
                int i14 = o3Var.f29804f;
                o3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (o3Var.d - i14)) + i14);
                ((z2) this.f185c).invalidate();
                return;
            case 20:
                qy.q1(((uw) this.f184b).M, (py) this.f185c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f184b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f185c).invalidateOutline();
                ImageView imageView = photoViewer.f31852u3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    hu0Var.invalidateOutline();
                    return;
                }
                return;
            case 22:
                u21 u21Var = (u21) this.f184b;
                int[] iArr2 = (int[]) this.f185c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0 ec0Var = u21Var.f38678n;
                if (ec0Var != null) {
                    ec0Var.K = 1.0f;
                    ec0Var.i();
                    u21Var.f38678n.s(1.0f - floatValue11);
                }
                ec0 ec0Var2 = u21Var.h;
                ec0Var2.K = floatValue11;
                ec0Var2.i();
                u21Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, u21Var.e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, u21Var.e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, u21Var.e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, u21Var.e[3], iArr2[3]);
                    o21 o21Var = u21Var.B;
                    o21Var.f36630a.n(d, d10, d11, d12);
                    o21Var.invalidate();
                }
                u21Var.f38681w.invalidate();
                return;
            case 23:
                e0 e0Var = (e0) this.f184b;
                int[] iArr3 = (int[]) this.f185c;
                e0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue - e0Var.f1378b;
                ((rl0) e0Var.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                e0Var.f1378b = intValue;
                return;
            case 24:
                li1 li1Var = (li1) this.f184b;
                li1Var.getClass();
                li1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ki) this.f185c).invalidate();
                return;
            case 25:
                ((TextView) this.f184b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f185c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                g gVar = (g) this.f184b;
                xf.d dVar = (xf.d) this.f185c;
                gVar.getClass();
                dVar.f47033f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.f45785b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    xf.d dVar2 = (xf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f47033f = (int) ((dVar2.f47034g / 255.0f) * (255 - dVar.f47033f));
                    }
                }
                gVar.invalidate();
                return;
            case 27:
                g gVar2 = (g) this.f184b;
                xf.b bVar2 = (xf.b) this.f185c;
                gVar2.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.f45788c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    xf.b bVar3 = (xf.b) obj2;
                    if (bVar3 == bVar2) {
                        bVar2.d = (int) (floatValue12 * 255.0f);
                    } else {
                        bVar3.d = (int) ((1.0f - floatValue12) * bVar3.e);
                    }
                }
                gVar2.invalidate();
                return;
            default:
                n nVar = (n) this.f184b;
                nVar.getClass();
                ((o) this.f185c).f45841r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
        }
    }
}
