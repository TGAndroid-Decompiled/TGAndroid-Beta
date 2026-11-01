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
import java.util.ArrayList;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.de1;
import org.telegram.ui.gw;
import org.telegram.ui.oo;
import org.telegram.ui.un;
import org.telegram.ui.yr0;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import rh.a9;
import rh.z8;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f676a;
    public final Object f677b;
    public final Object f678c;

    public p2(int i10, Object obj, Object obj2) {
        this.f676a = i10;
        this.f677b = obj;
        this.f678c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = 0;
        switch (this.f676a) {
            case 0:
                ((TextView) this.f677b).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f678c).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                bg.i iVar = (bg.i) this.f677b;
                dg.e eVar = (dg.e) this.f678c;
                iVar.getClass();
                eVar.f5897f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = iVar.f2707b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    dg.e eVar2 = (dg.e) obj;
                    if (eVar2 != eVar) {
                        eVar2.f5897f = (int) ((eVar2.f5898g / 255.0f) * (255 - eVar.f5897f));
                    }
                }
                iVar.invalidate();
                return;
            case 2:
                bg.i iVar2 = (bg.i) this.f677b;
                dg.b bVar = (dg.b) this.f678c;
                iVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = iVar2.f2710c;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    dg.b bVar2 = (dg.b) obj2;
                    if (bVar2 == bVar) {
                        bVar.d = (int) (floatValue * 255.0f);
                    } else {
                        bVar2.d = (int) ((1.0f - floatValue) * bVar2.e);
                    }
                }
                iVar2.invalidate();
                return;
            case 3:
                bg.s sVar = (bg.s) this.f677b;
                sVar.getClass();
                ((bg.t) this.f678c).f2774r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            case 4:
                bi.d0 d0Var = (bi.d0) this.f677b;
                d0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d0Var.f2914a = intValue;
                ((a1.c) this.f678c).d(intValue);
                return;
            case 5:
                ((org.telegram.ui.Cells.r0) this.f677b).f22864c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((org.telegram.ui.Cells.s0) this.f678c).invalidate();
                return;
            case 6:
                gg.a aVar = (gg.a) this.f677b;
                int[] iArr = (int[]) this.f678c;
                aVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.b.f(floatValue2, iArr[0], aVar.h[0]), i0.b.f(floatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f7496b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f7497c);
                paint.setShader(aVar.f7496b);
                aVar.f7495a.f15275r.put(0, paint);
                aVar.f7499g.setColor(i0.b.f(0.1f, i0.b.f(floatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f7498f.setColor(i0.b.f(0.1f, i0.b.f(floatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                return;
            case 7:
                jg.h2 h2Var = (jg.h2) this.f677b;
                boolean[] zArr = (boolean[]) this.f678c;
                h2Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue3 < 0.5f) {
                    float f7 = floatValue3 / 0.5f;
                    h2Var.setRotationY(90.0f * f7);
                    h2Var.f10006z0 = ((1.0f - f7) * 0.3f) + 0.7f;
                    h2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    h2Var.f9998r0.b(h2Var.f10005y0, false);
                }
                float f10 = (floatValue3 - 0.5f) / 0.5f;
                h2Var.setRotationY((1.0f - f10) * (-90.0f));
                h2Var.f10006z0 = (f10 * 0.3f) + 0.7f;
                h2Var.invalidate();
                return;
            case 8:
                bg.f fVar = (bg.f) this.f677b;
                fVar.getClass();
                ((Drawable) this.f678c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((kg.v1) fVar.f2682b).f11311s2;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).n2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            case 9:
                un unVar = (un) this.f677b;
                un unVar2 = (un) this.f678c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.f42162na = floatValue4;
                unVar2.fragmentView.invalidate();
                unVar2.f42303z0.invalidate();
                float f11 = 1.0f - floatValue4;
                float L = org.telegram.messenger.i0.L(8.0f) * f11;
                unVar.f42166o1.setTranslationY(L);
                unVar.f42166o1.getAvatarImageView().setTranslationY(-L);
                float f12 = (-org.telegram.messenger.i0.L(8.0f)) * floatValue4;
                unVar2.f42166o1.setTranslationY(f12);
                unVar2.f42166o1.getAvatarImageView().setTranslationY(-f12);
                float f13 = (floatValue4 * 0.2f) + 0.8f;
                unVar.f42166o1.getAvatarImageView().setScaleX(f13);
                unVar.f42166o1.getAvatarImageView().setScaleY(f13);
                unVar.f42166o1.getAvatarImageView().setAlpha(floatValue4);
                float f14 = (0.2f * f11) + 0.8f;
                unVar2.f42166o1.getAvatarImageView().setScaleX(f14);
                unVar2.f42166o1.getAvatarImageView().setScaleY(f14);
                unVar2.f42166o1.getAvatarImageView().setAlpha(f11);
                hg hgVar = unVar2.f41990a1;
                if (hgVar != null) {
                    hgVar.setAlpha(f11);
                    return;
                }
                return;
            case 10:
                oo ooVar = (oo) this.f677b;
                ArrayList arrayList3 = (ArrayList) this.f678c;
                ooVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.N.setAlpha(floatValue5);
                p8 p8Var = ooVar.N;
                float f15 = 1.0f - floatValue5;
                p8Var.setTranslationY(((-p8Var.getHeight()) / 2.0f) * f15);
                ooVar.N.setScaleY((floatValue5 * 0.8f) + 0.2f);
                while (i10 < arrayList3.size()) {
                    ((View) arrayList3.get(i10)).setTranslationY((-ooVar.N.getHeight()) * f15);
                    i10++;
                }
                return;
            case 11:
                g9 g9Var = (g9) this.f677b;
                g9 g9Var2 = (g9) this.f678c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.setScaleX(floatValue6);
                g9Var.setScaleY(floatValue6);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !g9Var2.getImageReceiver().I()) {
                    g9Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    return;
                }
                return;
            case 12:
                ((ma) this.f677b).accept(Float.valueOf(((bb) this.f678c).getTranslationY()));
                return;
            case 13:
                ((gl) this.f677b).accept(Float.valueOf(((bb) this.f678c).getTranslationY()));
                return;
            case 14:
                dh dhVar = (dh) this.f677b;
                dhVar.getClass();
                ((mt) this.f678c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bi biVar = dhVar.f25488c0;
                biVar.I1();
                uh uhVar = biVar.f24812s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.l(biVar.f24766f4);
                    return;
                }
                return;
            case 15:
                ac.a aVar2 = (ac.a) this.f677b;
                aVar2.getClass();
                ((org.telegram.messenger.u) this.f678c).f18329b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i10 < ((ArrayList) aVar2.d).size()) {
                    if (!sg.e0.f48331b) {
                        ((View) ((ArrayList) aVar2.d).get(i10)).invalidate();
                    }
                    i10++;
                }
                return;
            case 16:
                kx0 kx0Var = (kx0) this.f677b;
                jx0[] jx0VarArr = (jx0[]) this.f678c;
                kx0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < jx0VarArr.length) {
                    kx0Var.f27977c[i10] = (kx0Var.d[i10] * floatValue7) + ((1.0f - floatValue7) * kx0Var.e[i10]);
                    i10++;
                }
                kx0Var.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.f677b;
                xVar.getClass();
                ((org.telegram.ui.Components.voip.r) this.f678c).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xVar.invalidate();
                return;
            case 18:
                View view2 = (View) this.f677b;
                View view3 = (View) this.f678c;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = 1.0f - floatValue8;
                view2.setTranslationY(org.telegram.messenger.i0.L(8.0f) * f16);
                view2.setAlpha(floatValue8);
                view3.setTranslationY((-org.telegram.messenger.i0.L(6.0f)) * floatValue8);
                view3.setAlpha(f16);
                return;
            case 19:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.f677b;
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f678c;
                y0Var.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y0Var.c();
                int i11 = y0Var.h;
                if (((i11 >= 0 && i11 <= 2) || (i11 >= 180 && i11 <= 182)) && k2Var.R) {
                    k2Var.Q.pause();
                    AnimatorSet animatorSet = k2Var.P;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f677b;
                int i12 = w2Var.e;
                w2Var.f31779g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (w2Var.f31777c - i12)) + i12);
                int i13 = w2Var.f31778f;
                w2Var.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (w2Var.d - i13)) + i13);
                ((org.telegram.ui.Components.voip.g2) this.f678c).invalidate();
                return;
            case 21:
                zx.u1(((gw) this.f677b).M, (yx) this.f678c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f677b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f678c).invalidateOutline();
                ImageView imageView = photoViewer.f33650x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                yr0 yr0Var = photoViewer.E2;
                if (yr0Var != null) {
                    yr0Var.invalidateOutline();
                    return;
                }
                return;
            case 23:
                a5.a aVar3 = (a5.a) this.f677b;
                int[] iArr2 = (int[]) this.f678c;
                aVar3.getClass();
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i14 = intValue2 - aVar3.f281b;
                ((uk0) aVar3.d).scrollBy(0, i14);
                iArr2[0] = iArr2[0] + i14;
                aVar3.f281b = intValue2;
                return;
            case 24:
                de1 de1Var = (de1) this.f677b;
                de1Var.getClass();
                de1Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ih.e) this.f678c).invalidate();
                return;
            case 25:
                ((View) ((g.b0) ((a4.l) this.f677b).f279b).d.getParent()).invalidate();
                return;
            case 26:
                a9 a9Var = (a9) this.f677b;
                a9Var.getClass();
                ((z8) this.f678c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f1();
                return;
            case 27:
                ((s4.j) this.f677b).P((s4.c1) this.f678c);
                return;
            default:
                sg.b0 b0Var = (sg.b0) this.f677b;
                ArrayList arrayList4 = (ArrayList) this.f678c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i10 < arrayList4.size()) {
                    sg.b0.g((View) arrayList4.get(i10), floatValue9);
                    i10++;
                }
                b0Var.f48295m.f37311k0.invalidate();
                return;
        }
    }
}
