package bh;

import a8.ng;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bi.de;
import bi.ee;
import bi.u6;
import java.util.ArrayList;
import jg.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.voip.a3;
import org.telegram.ui.Components.voip.d3;
import org.telegram.ui.Components.voip.p3;
import org.telegram.ui.Components.voip.r1;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dy;
import org.telegram.ui.ew;
import org.telegram.ui.ey;
import org.telegram.ui.ju0;
import org.telegram.ui.oo;
import org.telegram.ui.uh1;
import org.telegram.ui.wn;
public final class b0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3991a;
    public final Object f3992b;
    public final Object f3993c;

    public b0(int i10, Object obj, Object obj2) {
        this.f3991a = i10;
        this.f3992b = obj;
        this.f3993c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f3991a) {
            case 0:
                i0 i0Var = (i0) this.f3992b;
                ArrayList arrayList = (ArrayList) this.f3993c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList.size()) {
                    i0.g((View) arrayList.get(i10), floatValue);
                    i10++;
                }
                i0Var.f4056m.f39208k0.invalidate();
                return;
            case 1:
                ee eeVar = (ee) this.f3992b;
                eeVar.getClass();
                ((de) this.f3993c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eeVar.f1();
                return;
            case 2:
                di.q qVar = (di.q) this.f3992b;
                View view = (View) this.f3993c;
                qVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view.setAlpha(f7);
                view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                qVar.f8945y.setAlpha(floatValue2);
                qVar.f8945y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f3992b;
                boolean[] zArr = (boolean[]) this.f3993c;
                int i11 = ProfileStoriesView.f36256s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new u6(profileStoriesView, 20), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f3992b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f3993c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                kg.h hVar = (kg.h) this.f3992b;
                mg.d dVar = (mg.d) this.f3993c;
                hVar.getClass();
                dVar.f18452f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = hVar.f16585b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    mg.d dVar2 = (mg.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f18452f = (int) ((dVar2.f18453g / 255.0f) * (255 - dVar.f18452f));
                    }
                }
                hVar.invalidate();
                return;
            case 6:
                kg.h hVar2 = (kg.h) this.f3992b;
                mg.b bVar = (mg.b) this.f3993c;
                hVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = hVar2.f16588c;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    mg.b bVar2 = (mg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.e);
                    }
                }
                hVar2.invalidate();
                return;
            case 7:
                kg.o oVar = (kg.o) this.f3992b;
                oVar.getClass();
                ((kg.p) this.f3993c).f16644r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.invalidate();
                return;
            case 8:
                k5.b bVar3 = (k5.b) this.f3992b;
                bVar3.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bVar3.f16388b = intValue;
                ((e1) this.f3993c).i(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.u0) this.f3992b).f25473c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.v0) this.f3993c).invalidate();
                return;
            case 10:
                wn wnVar = (wn) this.f3992b;
                wn wnVar2 = (wn) this.f3993c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.f45184ka = floatValue5;
                wnVar2.fragmentView.invalidate();
                wnVar2.f45339x0.invalidate();
                float f10 = 1.0f - floatValue5;
                float dp = AndroidUtilities.dp(8.0f) * f10;
                wnVar.f45198m1.setTranslationY(dp);
                wnVar.f45198m1.getAvatarImageView().setTranslationY(-dp);
                float f11 = (-AndroidUtilities.dp(8.0f)) * floatValue5;
                wnVar2.f45198m1.setTranslationY(f11);
                wnVar2.f45198m1.getAvatarImageView().setTranslationY(-f11);
                float f12 = (floatValue5 * 0.2f) + 0.8f;
                wnVar.f45198m1.getAvatarImageView().setScaleX(f12);
                wnVar.f45198m1.getAvatarImageView().setScaleY(f12);
                wnVar.f45198m1.getAvatarImageView().setAlpha(floatValue5);
                float f13 = (0.2f * f10) + 0.8f;
                wnVar2.f45198m1.getAvatarImageView().setScaleX(f13);
                wnVar2.f45198m1.getAvatarImageView().setScaleY(f13);
                wnVar2.f45198m1.getAvatarImageView().setAlpha(f10);
                ch chVar = wnVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(f10);
                    return;
                }
                return;
            case 11:
                oo ooVar = (oo) this.f3992b;
                ArrayList arrayList4 = (ArrayList) this.f3993c;
                ooVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.N.setAlpha(floatValue6);
                v8 v8Var = ooVar.N;
                float f14 = 1.0f - floatValue6;
                v8Var.setTranslationY(((-v8Var.getHeight()) / 2.0f) * f14);
                ooVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i10 < arrayList4.size()) {
                    ((View) arrayList4.get(i10)).setTranslationY((-ooVar.N.getHeight()) * f14);
                    i10++;
                }
                return;
            case 12:
                y9 y9Var = (y9) this.f3992b;
                y9 y9Var2 = (y9) this.f3993c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue7);
                y9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !y9Var2.getImageReceiver().hasBitmapImage()) {
                    y9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 13:
                ((gb) this.f3992b).accept(Float.valueOf(((ub) this.f3993c).getTranslationY()));
                return;
            case 14:
                ((yl) this.f3992b).accept(Float.valueOf(((ub) this.f3993c).getTranslationY()));
                return;
            case 15:
                wh whVar = (wh) this.f3992b;
                whVar.getClass();
                ((ju) this.f3993c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ti tiVar = whVar.f34514c0;
                tiVar.c2();
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33002j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(tiVar.f33018o2);
                    return;
                }
                return;
            case 16:
                c2.b bVar4 = (c2.b) this.f3992b;
                bVar4.getClass();
                ((tu) this.f3993c).f33149b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) bVar4.d).size()) {
                    if (!m0.f4082b) {
                        ((View) ((ArrayList) bVar4.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 17:
                kz0 kz0Var = (kz0) this.f3992b;
                jz0[] jz0VarArr = (jz0[]) this.f3993c;
                kz0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < jz0VarArr.length) {
                    kz0Var.f30065c[i10] = (kz0Var.d[i10] * floatValue8) + ((1.0f - floatValue8) * kz0Var.e[i10]);
                    i10++;
                }
                kz0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f3992b;
                l0Var.getClass();
                ((org.telegram.ui.Components.voip.t) this.f3993c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l0Var.invalidate();
                return;
            case 19:
                View view2 = (View) this.f3992b;
                View view3 = (View) this.f3993c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue9;
                view2.setTranslationY(AndroidUtilities.dp(8.0f) * f15);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-AndroidUtilities.dp(6.0f)) * floatValue9);
                view3.setAlpha(f15);
                return;
            case 20:
                d3 d3Var = (d3) this.f3992b;
                r1 r1Var = (r1) this.f3993c;
                r1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r1Var.c();
                int i12 = r1Var.h;
                if (((i12 >= 0 && i12 <= 2) || (i12 >= 180 && i12 <= 182)) && d3Var.R) {
                    d3Var.Q.pause();
                    AnimatorSet animatorSet = d3Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                p3 p3Var = (p3) this.f3992b;
                int i13 = p3Var.e;
                p3Var.f34115g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.f34113c - i13)) + i13);
                int i14 = p3Var.f34114f;
                p3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (p3Var.d - i14)) + i14);
                ((a3) this.f3993c).invalidate();
                return;
            case 22:
                ey.r1(((ew) this.f3992b).M, (dy) this.f3993c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f3992b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f3993c).invalidateOutline();
                ImageView imageView = photoViewer.f35843x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                ju0 ju0Var = photoViewer.E2;
                if (ju0Var != null) {
                    ju0Var.invalidateOutline();
                    return;
                }
                return;
            case 24:
                ng ngVar = (ng) this.f3992b;
                int[] iArr = (int[]) this.f3993c;
                ngVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i15 = intValue2 - ngVar.f639b;
                ((nm0) ngVar.d).scrollBy(0, i15);
                iArr[0] = iArr[0] + i15;
                ngVar.f639b = intValue2;
                return;
            case 25:
                uh1 uh1Var = (uh1) this.f3992b;
                uh1Var.getClass();
                uh1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((si) this.f3993c).invalidate();
                return;
            case 26:
                pg.a aVar = (pg.a) this.f3992b;
                int[] iArr2 = (int[]) this.f3993c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f46880b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f46881c);
                paint.setShader(aVar.f46880b);
                aVar.f46879a.setPaint(paint, 0);
                aVar.f46883g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f46882f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.a0) ((a4.l) this.f3992b).f279b).d.getParent()).invalidate();
                return;
            default:
                ((s4.l) this.f3992b).P((s4.e1) this.f3993c);
                return;
        }
    }
}
