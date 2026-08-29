package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import jh.eb;
import jh.fb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a21;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.jw;
import org.telegram.ui.ko;
import org.telegram.ui.qt0;
import org.telegram.ui.rh1;
import org.telegram.ui.tn;
import org.telegram.ui.v11;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2108a;
    public final Object f2109b;
    public final Object f2110c;

    public b3(int i10, Object obj, Object obj2) {
        this.f2108a = i10;
        this.f2109b = obj;
        this.f2110c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f2108a) {
            case 0:
                e3 e3Var = (e3) this.f2109b;
                boolean[] zArr = (boolean[]) this.f2110c;
                e3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float f9 = floatValue / 0.5f;
                    e3Var.setRotationY(90.0f * f9);
                    e3Var.f2186v0 = ((1.0f - f9) * 0.3f) + 0.7f;
                    e3Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    e3Var.f2178n0.b(e3Var.f2185u0, false);
                }
                float f10 = (floatValue - 0.5f) / 0.5f;
                e3Var.setRotationY((1.0f - f10) * (-90.0f));
                e3Var.f2186v0 = (f10 * 0.3f) + 0.7f;
                e3Var.invalidate();
                return;
            case 1:
                c3 c3Var = (c3) this.f2109b;
                c3Var.getClass();
                ((Drawable) this.f2110c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((cg.f2) c3Var.f2125c).f3143w0;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            case 2:
                ((f2.l) this.f2109b).P((f2.n1) this.f2110c);
                return;
            case 3:
                fb fbVar = (fb) this.f2109b;
                fbVar.getClass();
                ((eb) this.f2110c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fbVar.R();
                return;
            case 4:
                kg.d0 d0Var = (kg.d0) this.f2109b;
                ArrayList arrayList = (ArrayList) this.f2110c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    kg.d0.g((View) arrayList.get(i10), floatValue2);
                    i10++;
                }
                d0Var.f13691m.f37334g0.invalidate();
                return;
            case 5:
                lh.o oVar = (lh.o) this.f2109b;
                View view2 = (View) this.f2110c;
                oVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = 1.0f - floatValue3;
                view2.setAlpha(f11);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue3);
                oVar.f16005y.setAlpha(floatValue3);
                oVar.f16005y.setTranslationY(AndroidUtilities.dp(5.0f) * f11);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f2109b;
                boolean[] zArr2 = (boolean[]) this.f2110c;
                int i11 = ProfileStoriesView.f36262o0;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue4 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new jh.o(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.S = Math.max(1.0f, floatValue4);
                profileStoriesView.invalidate();
                return;
            case 7:
                tn tnVar = (tn) this.f2109b;
                tn tnVar2 = (tn) this.f2110c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.Q9 = floatValue5;
                tnVar2.fragmentView.invalidate();
                tnVar2.f42973t0.invalidate();
                float f12 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f12;
                tnVar.W0.setTranslationY(dp);
                tnVar.W0.getAvatarImageView().setTranslationY(-dp);
                float f13 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                tnVar2.W0.setTranslationY(f13);
                tnVar2.W0.getAvatarImageView().setTranslationY(-f13);
                float f14 = (floatValue5 * 0.2f) + 0.8f;
                tnVar.W0.getAvatarImageView().setScaleX(f14);
                tnVar.W0.getAvatarImageView().setScaleY(f14);
                tnVar.W0.getAvatarImageView().setAlpha(floatValue5);
                float f15 = (0.2f * f12) + 0.8f;
                tnVar2.W0.getAvatarImageView().setScaleX(f15);
                tnVar2.W0.getAvatarImageView().setScaleY(f15);
                tnVar2.W0.getAvatarImageView().setAlpha(f12);
                vg vgVar = tnVar2.I0;
                if (vgVar != null) {
                    vgVar.setAlpha(f12);
                    return;
                }
                return;
            case 8:
                ko koVar = (ko) this.f2109b;
                ArrayList arrayList2 = (ArrayList) this.f2110c;
                koVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                koVar.J.setAlpha(floatValue6);
                m8 m8Var = koVar.J;
                float f16 = 1.0f - floatValue6;
                m8Var.setTranslationY(((-m8Var.getHeight()) / 2.0f) * f16);
                koVar.J.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-koVar.J.getHeight()) * f16);
                    i10++;
                }
                return;
            case 9:
                t9 t9Var = (t9) this.f2109b;
                t9 t9Var2 = (t9) this.f2110c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9Var.setScaleX(floatValue7);
                t9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !t9Var2.getImageReceiver().hasBitmapImage()) {
                    t9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 10:
                ((cb) this.f2109b).accept(Float.valueOf(((rb) this.f2110c).getTranslationY()));
                return;
            case 11:
                ((hl) this.f2109b).accept(Float.valueOf(((rb) this.f2110c).getTranslationY()));
                return;
            case 12:
                th thVar = (th) this.f2109b;
                thVar.getClass();
                ((st) this.f2110c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ni niVar = thVar.V;
                niVar.U1();
                fi fiVar = niVar.f31051u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
                if (fiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(niVar.f31013h2);
                    return;
                }
                return;
            case 13:
                ab.m mVar = (ab.m) this.f2109b;
                mVar.getClass();
                ((cu) this.f2110c).f27572b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!kg.g0.f13716b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 14:
                vx0 vx0Var = (vx0) this.f2109b;
                ux0[] ux0VarArr = (ux0[]) this.f2110c;
                vx0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < ux0VarArr.length) {
                    vx0Var.f34218c[i10] = (vx0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * vx0Var.f34219e[i10]);
                    i10++;
                }
                vx0Var.invalidate();
                return;
            case 15:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f2109b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.u) this.f2110c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 16:
                View view3 = (View) this.f2109b;
                View view4 = (View) this.f2110c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f17 = 1.0f - floatValue9;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f17);
                view3.setAlpha(floatValue9);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view4.setAlpha(f17);
                return;
            case 17:
                org.telegram.ui.Components.voip.e3 e3Var2 = (org.telegram.ui.Components.voip.e3) this.f2109b;
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f2110c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && e3Var2.N) {
                    e3Var2.M.pause();
                    AnimatorSet animatorSet = e3Var2.L;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.q3 q3Var = (org.telegram.ui.Components.voip.q3) this.f2109b;
                int i13 = q3Var.f33947e;
                q3Var.f33949g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (q3Var.f33946c - i13)) + i13);
                int i14 = q3Var.f33948f;
                q3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (q3Var.d - i14)) + i14);
                ((org.telegram.ui.Components.voip.b3) this.f2110c).invalidate();
                return;
            case 19:
                fy.q1(((jw) this.f2109b).M, (ey) this.f2110c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.f2109b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f2110c).invalidateOutline();
                ImageView imageView = photoViewer.f35821t3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                qt0 qt0Var = photoViewer.A2;
                if (qt0Var != null) {
                    qt0Var.invalidateOutline();
                    return;
                }
                return;
            case 21:
                a21 a21Var = (a21) this.f2109b;
                int[] iArr = (int[]) this.f2110c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yb0 yb0Var = a21Var.f36408n;
                if (yb0Var != null) {
                    yb0Var.K = 1.0f;
                    yb0Var.i();
                    a21Var.f36408n.s(1.0f - floatValue10);
                }
                yb0 yb0Var2 = a21Var.h;
                yb0Var2.K = floatValue10;
                yb0Var2.i();
                a21Var.h.s(floatValue10);
                if (iArr != null) {
                    int d = i0.a.d(floatValue10, a21Var.f36406e[0], iArr[0]);
                    int d10 = i0.a.d(floatValue10, a21Var.f36406e[1], iArr[1]);
                    int d11 = i0.a.d(floatValue10, a21Var.f36406e[2], iArr[2]);
                    int d12 = i0.a.d(floatValue10, a21Var.f36406e[3], iArr[3]);
                    v11 v11Var = a21Var.A;
                    v11Var.f43392a.n(d, d10, d11, d12);
                    v11Var.invalidate();
                }
                a21Var.f36411w.invalidate();
                return;
            case 22:
                ag.j2 j2Var = (ag.j2) this.f2109b;
                int[] iArr2 = (int[]) this.f2110c;
                j2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue - j2Var.f558b;
                ((jl0) j2Var.d).scrollBy(0, i15);
                iArr2[0] = iArr2[0] + i15;
                j2Var.f558b = intValue;
                return;
            case 23:
                rh1 rh1Var = (rh1) this.f2109b;
                rh1Var.getClass();
                rh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((mi) this.f2110c).invalidate();
                return;
            case 24:
                ((TextView) this.f2109b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f2110c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                tf.g gVar = (tf.g) this.f2109b;
                vf.d dVar = (vf.d) this.f2110c;
                gVar.getClass();
                dVar.f49559f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.f48255b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    vf.d dVar2 = (vf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f49559f = (int) ((dVar2.f49560g / 255.0f) * (255 - dVar.f49559f));
                    }
                }
                gVar.invalidate();
                return;
            case 26:
                tf.g gVar2 = (tf.g) this.f2109b;
                vf.b bVar = (vf.b) this.f2110c;
                gVar2.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.f48258c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    vf.b bVar2 = (vf.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue11 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue11) * bVar2.f49547e);
                    }
                }
                gVar2.invalidate();
                return;
            case 27:
                tf.n nVar = (tf.n) this.f2109b;
                nVar.getClass();
                ((tf.o) this.f2110c).f48313r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            default:
                l4.y0 y0Var = (l4.y0) this.f2109b;
                y0Var.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y0Var.f14472b = intValue2;
                ((sf.f1) this.f2110c).d(intValue2);
                return;
        }
    }
}
