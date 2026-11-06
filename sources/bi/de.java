package bi;

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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.ys;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.cv;
import org.telegram.ui.hc1;
import org.telegram.ui.oq0;
import org.telegram.ui.pn;
import org.telegram.ui.vw;
import org.telegram.ui.ww;
public final class de implements ValueAnimator.AnimatorUpdateListener {
    public final int f3728a;
    public final Object f3729b;
    public final Object f3730c;

    public de(int i7, Object obj, Object obj2) {
        this.f3728a = i7;
        this.f3729b = obj;
        this.f3730c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = 0;
        switch (this.f3728a) {
            case 0:
                fe feVar = (fe) this.f3729b;
                feVar.getClass();
                ((ee) this.f3730c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                feVar.f1();
                return;
            case 1:
                ch.b0 b0Var = (ch.b0) this.f3729b;
                ArrayList arrayList = (ArrayList) this.f3730c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < arrayList.size()) {
                    ch.b0.g((View) arrayList.get(i7), floatValue);
                    i7++;
                }
                b0Var.f6193m.f49041k0.invalidate();
                return;
            case 2:
                di.p pVar = (di.p) this.f3729b;
                View view = (View) this.f3730c;
                pVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - floatValue2;
                view.setAlpha(f10);
                view.setTranslationY((-org.telegram.messenger.g0.L(5.0f)) * floatValue2);
                pVar.D.setAlpha(floatValue2);
                pVar.D.setTranslationY(org.telegram.messenger.g0.L(5.0f) * f10);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f3729b;
                boolean[] zArr = (boolean[]) this.f3730c;
                int i10 = ProfileStoriesView.f41976s0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue3 > 0.2f) {
                    zArr[0] = true;
                    if (iz.o() > 0) {
                        org.telegram.messenger.g0.c4(profileStoriesView);
                        org.telegram.messenger.g0.i3(new ab(profileStoriesView, 22), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue3);
                profileStoriesView.invalidate();
                return;
            case 4:
                ((TextView) this.f3729b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f3730c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                lg.g gVar = (lg.g) this.f3729b;
                ng.d dVar = (ng.d) this.f3730c;
                gVar.getClass();
                dVar.f20552f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = gVar.f18286b;
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ng.d dVar2 = (ng.d) obj;
                    if (dVar2 != dVar) {
                        dVar2.f20552f = (int) ((dVar2.f20553g / 255.0f) * (255 - dVar.f20552f));
                    }
                }
                gVar.invalidate();
                return;
            case 6:
                lg.g gVar2 = (lg.g) this.f3729b;
                ng.b bVar = (ng.b) this.f3730c;
                gVar2.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = gVar2.f18289c;
                int size2 = arrayList3.size();
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ng.b bVar2 = (ng.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue4 * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue4) * bVar2.f20540e);
                    }
                }
                gVar2.invalidate();
                return;
            case 7:
                lg.n nVar = (lg.n) this.f3729b;
                nVar.getClass();
                ((lg.o) this.f3730c).f18348r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 8:
                li.z zVar = (li.z) this.f3729b;
                zVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                zVar.f19032a = intValue;
                ((l2.y) this.f3730c).d(intValue);
                return;
            case 9:
                ((org.telegram.ui.Cells.s0) this.f3729b).f30231c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.t0) this.f3730c).invalidate();
                return;
            case 10:
                an anVar = (an) this.f3729b;
                an anVar2 = (an) this.f3730c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.f43894na = floatValue5;
                anVar2.fragmentView.invalidate();
                anVar2.f44038z0.invalidate();
                float f11 = 1.0f - floatValue5;
                float L = org.telegram.messenger.g0.L(8.0f) * f11;
                anVar.f43898o1.setTranslationY(L);
                anVar.f43898o1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.g0.L(8.0f)) * floatValue5;
                anVar2.f43898o1.setTranslationY(f12);
                anVar2.f43898o1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue5 * 0.2f) + 0.8f;
                anVar.f43898o1.getAvatarImageView().setScaleX(f13);
                anVar.f43898o1.getAvatarImageView().setScaleY(f13);
                anVar.f43898o1.getAvatarImageView().setAlpha(floatValue5);
                float f14 = (0.2f * f11) + 0.8f;
                anVar2.f43898o1.getAvatarImageView().setScaleX(f14);
                anVar2.f43898o1.getAvatarImageView().setScaleY(f14);
                anVar2.f43898o1.getAvatarImageView().setAlpha(f11);
                lg lgVar = anVar2.f43718a1;
                if (lgVar != null) {
                    lgVar.setAlpha(f11);
                    return;
                }
                return;
            case 11:
                pn pnVar = (pn) this.f3729b;
                ArrayList arrayList4 = (ArrayList) this.f3730c;
                pnVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pnVar.N.setAlpha(floatValue6);
                org.telegram.ui.Cells.m8 m8Var = pnVar.N;
                float f15 = 1.0f - floatValue6;
                m8Var.setTranslationY(((-m8Var.getHeight()) / 2.0f) * f15);
                pnVar.N.setScaleY((floatValue6 * 0.8f) + 0.2f);
                while (i7 < arrayList4.size()) {
                    ((View) arrayList4.get(i7)).setTranslationY((-pnVar.N.getHeight()) * f15);
                    i7++;
                }
                return;
            case 12:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.f3729b;
                org.telegram.ui.Components.l9 l9Var2 = (org.telegram.ui.Components.l9) this.f3730c;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.setScaleX(floatValue7);
                l9Var.setScaleY(floatValue7);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !l9Var2.getImageReceiver().I()) {
                    l9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.sa) this.f3729b).accept(Float.valueOf(((org.telegram.ui.Components.gb) this.f3730c).getTranslationY()));
                return;
            case 14:
                ((bl) this.f3729b).accept(Float.valueOf(((org.telegram.ui.Components.gb) this.f3730c).getTranslationY()));
                return;
            case 15:
                gh ghVar = (gh) this.f3729b;
                ghVar.getClass();
                ((ys) this.f3730c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                di diVar = ghVar.f33908c0;
                diVar.J1();
                vh vhVar = diVar.f32955s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32895a2;
                if (vhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(diVar.f32911f4);
                    return;
                }
                return;
            case 16:
                ab.q qVar = (ab.q) this.f3729b;
                qVar.getClass();
                ((org.telegram.messenger.t) this.f3730c).f25553b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i7 < ((ArrayList) qVar.d).size()) {
                    if (!ch.e0.f6232b) {
                        ((View) ((ArrayList) qVar.d).get(i7)).invalidate();
                    }
                    i7++;
                }
                return;
            case 17:
                fw0 fw0Var = (fw0) this.f3729b;
                ew0[] ew0VarArr = (ew0[]) this.f3730c;
                fw0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i7 < ew0VarArr.length) {
                    fw0Var.f33643c[i7] = (fw0Var.d[i7] * floatValue8) + ((1.0f - floatValue8) * fw0Var.f33644e[i7]);
                    i7++;
                }
                fw0Var.invalidate();
                return;
            case 18:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f3729b;
                k0Var.getClass();
                ((org.telegram.ui.Components.voip.y) this.f3730c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k0Var.invalidate();
                return;
            case 19:
                View view2 = (View) this.f3729b;
                View view3 = (View) this.f3730c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue9;
                view2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f16);
                view2.setAlpha(floatValue9);
                view3.setTranslationY((-org.telegram.messenger.g0.L(6.0f)) * floatValue9);
                view3.setAlpha(f16);
                return;
            case 20:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f3729b;
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f3730c;
                i1Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i1Var.c();
                int i11 = i1Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && u2Var.R) {
                    u2Var.Q.pause();
                    AnimatorSet animatorSet = u2Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) this.f3729b;
                int i12 = f3Var.f39145e;
                f3Var.f39147g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (f3Var.f39144c - i12)) + i12);
                int i13 = f3Var.f39146f;
                f3Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (f3Var.d - i13)) + i13);
                ((org.telegram.ui.Components.voip.r2) this.f3730c).invalidate();
                return;
            case 22:
                ww.u1(((cv) this.f3729b).M, (vw) this.f3730c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f3729b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f3730c).invalidateOutline();
                ImageView imageView = photoViewer.f41542w3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                oq0 oq0Var = photoViewer.E2;
                if (oq0Var != null) {
                    oq0Var.invalidateOutline();
                    return;
                }
                return;
            case 24:
                a8.wa waVar = (a8.wa) this.f3729b;
                int[] iArr = (int[]) this.f3730c;
                waVar.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - waVar.f700b;
                ((pj0) waVar.d).scrollBy(0, i14);
                iArr[0] = iArr[0] + i14;
                waVar.f700b = intValue2;
                return;
            case 25:
                hc1 hc1Var = (hc1) this.f3729b;
                hc1Var.getClass();
                hc1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ci) this.f3730c).invalidate();
                return;
            case 26:
                qg.a aVar = (qg.a) this.f3729b;
                int[] iArr2 = (int[]) this.f3730c;
                aVar.getClass();
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.f(floatValue10, iArr2[0], aVar.h[0]), i0.a.f(floatValue10, iArr2[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f54022b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f54023c);
                paint.setShader(aVar.f54022b);
                aVar.f54021a.f25390r.put(0, paint);
                aVar.f54026g.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[1], aVar.h[1]), -1));
                aVar.f54025f.setColor(i0.a.f(0.1f, i0.a.f(floatValue10, iArr2[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 27:
                ((View) ((g.b0) ((aa.n) this.f3729b).f825b).d.getParent()).invalidate();
                return;
            default:
                tg.q1 q1Var = (tg.q1) this.f3729b;
                boolean[] zArr2 = (boolean[]) this.f3730c;
                q1Var.getClass();
                float floatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue11 < 0.5f) {
                    float f17 = floatValue11 / 0.5f;
                    q1Var.setRotationY(90.0f * f17);
                    q1Var.f55825z0 = ((1.0f - f17) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    return;
                }
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    q1Var.f55817r0.b(q1Var.f55824y0, false);
                }
                float f18 = (floatValue11 - 0.5f) / 0.5f;
                q1Var.setRotationY((1.0f - f18) * (-90.0f));
                q1Var.f55825z0 = (f18 * 0.3f) + 0.7f;
                q1Var.invalidate();
                return;
        }
    }
}
