package bg;

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
import eg.w2;
import eg.y2;
import f2.l;
import f2.m1;
import fg.d2;
import java.util.ArrayList;
import mh.fb;
import mh.gb;
import ng.d0;
import ng.g0;
import oh.o;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.l0;
import org.telegram.ui.Components.voip.o1;
import org.telegram.ui.Components.voip.p3;
import org.telegram.ui.Components.voip.u;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cu0;
import org.telegram.ui.fi1;
import org.telegram.ui.j21;
import org.telegram.ui.o21;
import org.telegram.ui.oy;
import org.telegram.ui.po;
import org.telegram.ui.py;
import org.telegram.ui.tw;
import org.telegram.ui.xn;
import wf.g;
import wf.n;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f1962a;
    public final Object f1963b;
    public final Object f1964c;

    public a(int i10, Object obj, Object obj2) {
        this.f1962a = i10;
        this.f1963b = obj;
        this.f1964c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f1962a) {
            case 0:
                b bVar = (b) this.f1963b;
                int[] iArr = (int[]) this.f1964c;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue, iArr[0], bVar.h[0]), i0.a.d(floatValue, iArr[1], bVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                bVar.f1969b = linearGradient;
                linearGradient.setLocalMatrix(bVar.f1970c);
                paint.setShader(bVar.f1969b);
                bVar.f1968a.setPaint(paint, 0);
                bVar.f1973g.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[1], bVar.h[1]), -1));
                bVar.f1972f.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[0], bVar.h[0]), -16777216));
                bVar.invalidateSelf();
                return;
            case 1:
                y2 y2Var = (y2) this.f1963b;
                boolean[] zArr = (boolean[]) this.f1964c;
                y2Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    float f10 = floatValue2 / 0.5f;
                    y2Var.setRotationY(90.0f * f10);
                    y2Var.f5574w0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    y2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    y2Var.f5566o0.b(y2Var.f5573v0, false);
                }
                float f11 = (floatValue2 - 0.5f) / 0.5f;
                y2Var.setRotationY((1.0f - f11) * (-90.0f));
                y2Var.f5574w0 = (f11 * 0.3f) + 0.7f;
                y2Var.invalidate();
                return;
            case 2:
                ((l) this.f1963b).P((m1) this.f1964c);
                return;
            case 3:
                w2 w2Var = (w2) this.f1963b;
                w2Var.getClass();
                ((Drawable) this.f1964c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((d2) w2Var.f5528c).f6296x0;
                if (view instanceof t1) {
                    ((t1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            case 4:
                gb gbVar = (gb) this.f1963b;
                gbVar.getClass();
                ((fb) this.f1964c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.M();
                return;
            case 5:
                d0 d0Var = (d0) this.f1963b;
                ArrayList arrayList = (ArrayList) this.f1964c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    d0.g((View) arrayList.get(i10), floatValue3);
                    i10++;
                }
                d0Var.f16043m.f40798h0.invalidate();
                return;
            case 6:
                o oVar = (o) this.f1963b;
                View view2 = (View) this.f1964c;
                oVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue4;
                view2.setAlpha(f12);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue4);
                oVar.f17526y.setAlpha(floatValue4);
                oVar.f17526y.setTranslationY(AndroidUtilities.dp(5.0f) * f12);
                return;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1963b;
                boolean[] zArr2 = (boolean[]) this.f1964c;
                int i11 = ProfileStoriesView.f34841p0;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr2[0] && floatValue5 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new t3(profileStoriesView, 1), 180L);
                    }
                }
                profileStoriesView.T = Math.max(1.0f, floatValue5);
                profileStoriesView.invalidate();
                return;
            case 8:
                xn xnVar = (xn) this.f1963b;
                xn xnVar2 = (xn) this.f1964c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.R9 = floatValue6;
                xnVar2.fragmentView.invalidate();
                xnVar2.f43362u0.invalidate();
                float f13 = 1.0f - floatValue6;
                float dp = AndroidUtilities.dp(8.0f) * f13;
                xnVar.X0.setTranslationY(dp);
                xnVar.X0.getAvatarImageView().setTranslationY(-dp);
                float f14 = (-AndroidUtilities.dp(8.0f)) * floatValue6;
                xnVar2.X0.setTranslationY(f14);
                xnVar2.X0.getAvatarImageView().setTranslationY(-f14);
                float f15 = (floatValue6 * 0.2f) + 0.8f;
                xnVar.X0.getAvatarImageView().setScaleX(f15);
                xnVar.X0.getAvatarImageView().setScaleY(f15);
                xnVar.X0.getAvatarImageView().setAlpha(floatValue6);
                float f16 = (0.2f * f13) + 0.8f;
                xnVar2.X0.getAvatarImageView().setScaleX(f16);
                xnVar2.X0.getAvatarImageView().setScaleY(f16);
                xnVar2.X0.getAvatarImageView().setAlpha(f13);
                sg sgVar = xnVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(f13);
                    return;
                }
                return;
            case 9:
                po poVar = (po) this.f1963b;
                ArrayList arrayList2 = (ArrayList) this.f1964c;
                poVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                poVar.K.setAlpha(floatValue7);
                o8 o8Var = poVar.K;
                float f17 = 1.0f - floatValue7;
                o8Var.setTranslationY(((-o8Var.getHeight()) / 2.0f) * f17);
                poVar.K.setScaleY((floatValue7 * 0.8f) + 0.2f);
                while (i10 < arrayList2.size()) {
                    ((View) arrayList2.get(i10)).setTranslationY((-poVar.K.getHeight()) * f17);
                    i10++;
                }
                return;
            case 10:
                p9 p9Var = (p9) this.f1963b;
                p9 p9Var2 = (p9) this.f1964c;
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
                ((xa) this.f1963b).accept(Float.valueOf(((nb) this.f1964c).getTranslationY()));
                return;
            case 12:
                ((il) this.f1963b).accept(Float.valueOf(((nb) this.f1964c).getTranslationY()));
                return;
            case 13:
                qh qhVar = (qh) this.f1963b;
                qhVar.getClass();
                ((xt) this.f1964c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mi miVar = qhVar.W;
                miVar.U1();
                ei eiVar = miVar.f29100v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
                if (eiVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.k(miVar.f29062i2);
                    return;
                }
                return;
            case 14:
                m mVar = (m) this.f1963b;
                mVar.getClass();
                ((hu) this.f1964c).f27589b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) mVar.d).size()) {
                    if (!g0.f16068b) {
                        ((View) ((ArrayList) mVar.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 15:
                gy0 gy0Var = (gy0) this.f1963b;
                fy0[] fy0VarArr = (fy0[]) this.f1964c;
                gy0Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < fy0VarArr.length) {
                    gy0Var.f27326c[i10] = (gy0Var.d[i10] * floatValue9) + ((1.0f - floatValue9) * gy0Var.f27327e[i10]);
                    i10++;
                }
                gy0Var.invalidate();
                return;
            case 16:
                l0 l0Var = (l0) this.f1963b;
                l0Var.getClass();
                ((u) this.f1964c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 17:
                View view3 = (View) this.f1963b;
                View view4 = (View) this.f1964c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f18 = 1.0f - floatValue10;
                view3.setTranslationY(AndroidUtilities.dp(8.0f) * f18);
                view3.setAlpha(floatValue10);
                view4.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue10);
                view4.setAlpha(f18);
                return;
            case 18:
                d3 d3Var = (d3) this.f1963b;
                o1 o1Var = (o1) this.f1964c;
                o1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                o1Var.c();
                int i12 = o1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && d3Var.O) {
                    d3Var.N.pause();
                    AnimatorSet animatorSet = d3Var.M;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                p3 p3Var = (p3) this.f1963b;
                int i13 = p3Var.f32265e;
                p3Var.f32267g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f32264c - i13)) + i13);
                int i14 = p3Var.f32266f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((a3) this.f1964c).invalidate();
                return;
            case 20:
                py.q1(((tw) this.f1963b).M, (oy) this.f1964c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f1963b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f1964c).invalidateOutline();
                ImageView imageView = photoViewer.f34404u3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                cu0 cu0Var = photoViewer.B2;
                if (cu0Var != null) {
                    cu0Var.invalidateOutline();
                    return;
                }
                return;
            case 22:
                o21 o21Var = (o21) this.f1963b;
                int[] iArr2 = (int[]) this.f1964c;
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0 fc0Var = o21Var.f39570n;
                if (fc0Var != null) {
                    fc0Var.K = 1.0f;
                    fc0Var.i();
                    o21Var.f39570n.s(1.0f - floatValue11);
                }
                fc0 fc0Var2 = o21Var.h;
                fc0Var2.K = floatValue11;
                fc0Var2.i();
                o21Var.h.s(floatValue11);
                if (iArr2 != null) {
                    int d = i0.a.d(floatValue11, o21Var.f39568e[0], iArr2[0]);
                    int d10 = i0.a.d(floatValue11, o21Var.f39568e[1], iArr2[1]);
                    int d11 = i0.a.d(floatValue11, o21Var.f39568e[2], iArr2[2]);
                    int d12 = i0.a.d(floatValue11, o21Var.f39568e[3], iArr2[3]);
                    j21 j21Var = o21Var.B;
                    j21Var.f37992a.n(d, d10, d11, d12);
                    j21Var.invalidate();
                }
                o21Var.f39573w.invalidate();
                return;
            case 23:
                e0 e0Var = (e0) this.f1963b;
                int[] iArr3 = (int[]) this.f1964c;
                e0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue - e0Var.f1474b;
                ((tl0) e0Var.d).scrollBy(0, i15);
                iArr3[0] = iArr3[0] + i15;
                e0Var.f1474b = intValue;
                return;
            case 24:
                fi1 fi1Var = (fi1) this.f1963b;
                fi1Var.getClass();
                fi1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((li) this.f1964c).invalidate();
                return;
            case 25:
                ((TextView) this.f1963b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f1964c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                g gVar = (g) this.f1963b;
                yf.d dVar = (yf.d) this.f1964c;
                gVar.getClass();
                dVar.f50908f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar.f49544b;
                int size = arrayList3.size();
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    yf.d dVar2 = (yf.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f50908f = (int) ((dVar2.f50909g / 255.0f) * (255 - dVar.f50908f));
                    }
                }
                gVar.invalidate();
                return;
            case 27:
                g gVar2 = (g) this.f1963b;
                yf.b bVar2 = (yf.b) this.f1964c;
                gVar2.getClass();
                float floatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList4 = gVar2.f49547c;
                int size2 = arrayList4.size();
                while (i10 < size2) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    yf.b bVar3 = (yf.b) obj2;
                    if (bVar3 == bVar2) {
                        bVar2.d = (int) (floatValue12 * 255.0f);
                    } else {
                        bVar3.d = (int) ((1.0f - floatValue12) * bVar3.f50896e);
                    }
                }
                gVar2.invalidate();
                return;
            default:
                n nVar = (n) this.f1963b;
                nVar.getClass();
                ((wf.o) this.f1964c).f49603r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
        }
    }
}
