package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oxb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public oxb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        View view;
        View view2;
        byte b = this.a;
        boolean z = true;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                pxb pxbVar = (pxb) obj;
                pxbVar.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pxbVar.n0();
                return;
            case 1:
                ((qxb) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                mzb mzbVar = (mzb) obj;
                mzbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzbVar.m();
                return;
            case 3:
                ((m0c) obj).g(valueAnimator);
                return;
            case 4:
                o3c o3cVar = (o3c) obj;
                o3cVar.r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3cVar.invalidate();
                return;
            case 5:
                y7c y7cVar = (y7c) obj;
                y7cVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y7cVar.invalidate();
                return;
            case 6:
                w9c w9cVar = (w9c) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9cVar.b = floatValue;
                w9cVar.setTranslationY(floatValue);
                return;
            case 7:
                vgc vgcVar = (vgc) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vgcVar.setAnimationIdicatorProgress(floatValue2);
                ugc ugcVar = vgcVar.E;
                if (ugcVar != null) {
                    ugcVar.g(floatValue2);
                    return;
                }
                return;
            case 8:
                phc phcVar = (phc) obj;
                phcVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                phcVar.invalidate();
                return;
            case 9:
                iic iicVar = (iic) obj;
                iicVar.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iicVar.x();
                return;
            case 10:
                yic yicVar = (yic) obj;
                yicVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yicVar.b.invalidate();
                return;
            case 11:
                wnc wncVar = (wnc) obj;
                wncVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wncVar.invalidate();
                return;
            case 12:
                eoc eocVar = (eoc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eocVar.c.setRotationY(floatValue3);
                if (floatValue3 <= 90.0f) {
                    z = false;
                }
                FrameLayout frameLayout = eocVar.d;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                FrameLayout frameLayout2 = eocVar.e;
                if (!z) {
                    i2 = 4;
                }
                frameLayout2.setVisibility(i2);
                return;
            case 13:
                apc apcVar = (apc) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yoc yocVar = apcVar.q;
                npc npcVar = apcVar.i;
                RectF rectF = apcVar.n;
                RectF rectF2 = apcVar.o;
                if (!apcVar.v) {
                    apcVar.e();
                    float interpolation = apcVar.k.getInterpolation(Math.min(1.0f, floatValue4 * 2.0f));
                    i22 i22Var = apcVar.c;
                    if (i22Var != null) {
                        i22Var.s1(interpolation);
                    } else {
                        apcVar.b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (apcVar.p != null && !rectF2.isEmpty()) {
                        cm1 M6 = apcVar.e.M6(apcVar.f);
                        cm1 cm1Var = apcVar.p;
                        if (M6 != cm1Var) {
                            cm1Var.J0.i(false);
                            apcVar.p = M6;
                        } else {
                            M6 = cm1Var;
                        }
                        if (M6 != null && !apcVar.s) {
                            M6.J0.i(true);
                            lmc lmcVar = apcVar.p.J0.m;
                            if (lmcVar != null && lmcVar.isAttachedToWindow()) {
                                rectF2.set(apcVar.c(lmcVar));
                                apcVar.r = floatValue4;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue4 - 0.25f) / 0.5f));
                                float B = mlb.B(max, 2.0f, 3.0f, max * max);
                                npcVar.setAlpha((1.0f - B) * apcVar.l);
                                yocVar.setAlpha(B);
                                apcVar.d();
                                float f = 1.0f - floatValue4;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - gm.L(150.0f);
                                float f2 = f * f;
                                float f3 = f * 2.0f * floatValue4;
                                float f4 = floatValue4 * floatValue4;
                                float centerX2 = (rectF2.centerX() * f4) + (centerX * f3) + (rectF.centerX() * f2);
                                float centerY = (rectF2.centerY() * f4) + (f3 * min) + (rectF.centerY() * f2);
                                apcVar.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue4) + rectF.width());
                                if (floatValue4 < 0.92f) {
                                    apcVar.j.A(centerX2, centerY);
                                }
                                apcVar.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            npcVar.setAlpha(0.0f);
                            yocVar.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        npcVar.setAlpha(0.0f);
                        yocVar.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                npc npcVar2 = (npc) obj;
                npcVar2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npcVar2.b();
                return;
            case 15:
                ((aqc) obj).n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                yqc yqcVar = (yqc) obj;
                yqcVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqcVar.invalidate();
                return;
            case 17:
                brc brcVar = (brc) obj;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                brcVar.w = f5.floatValue();
                brcVar.f.a(f5);
                View view3 = brcVar.a;
                view3.setAlpha(1.0f - brc.c(0.05f, 0.45f, brcVar.w));
                view3.setScaleX(1.0f - (brcVar.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = brcVar.b;
                editTextBoldCursor.setAlpha(brc.c(0.3f, 0.9f, brcVar.w));
                editTextBoldCursor.setTranslationX((1.0f - brcVar.w) * b10.c(80.0f, brcVar.getWidth(), 0));
                brcVar.invalidate();
                return;
            case 18:
                ((rrc) obj).y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                qrc qrcVar = (qrc) obj;
                qrcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrcVar.c();
                return;
            case 20:
                esc escVar = (esc) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = escVar.n;
                RectF rectF4 = escVar.o;
                if (!escVar.s) {
                    escVar.e();
                    float interpolation2 = escVar.k.getInterpolation(Math.min(1.0f, floatValue5 * 2.0f));
                    i22 i22Var2 = escVar.a;
                    if (i22Var2 != null) {
                        i22Var2.s1(interpolation2);
                    } else {
                        escVar.c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (escVar.p != null && !rectF4.isEmpty()) {
                        npc pendingDiamond = escVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            m0c m0cVar = escVar.p;
                            TL_wallet.walletTransaction wallettransaction = escVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = m0cVar.S;
                            if (wallettransaction2 != null && k0c.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(escVar.d(pendingDiamond));
                            }
                        }
                        float f6 = 1.0f - floatValue5;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - gm.L(150.0f);
                        float f7 = f6 * f6;
                        float f8 = f6 * 2.0f * floatValue5;
                        float f9 = floatValue5 * floatValue5;
                        float centerX4 = (rectF4.centerX() * f9) + (centerX3 * f8) + (rectF3.centerX() * f7);
                        float centerY2 = (rectF4.centerY() * f9) + (f8 * min2) + (rectF3.centerY() * f7);
                        escVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue5) + rectF3.width());
                        if (floatValue5 < 0.92f) {
                            escVar.j.A(centerX4, centerY2);
                        }
                        escVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                puc pucVar = (puc) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pucVar.V = floatValue6;
                pucVar.W.setAlpha(floatValue6);
                pucVar.invalidate();
                return;
            default:
                wu wuVar = (wu) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.b0 = floatValue7;
                wuVar.j(floatValue7);
                wuVar.c0.setAlpha(wuVar.b0);
                wuVar.S.setTranslationX(gm.L(56.0f) * wuVar.b0);
                wuVar.P.setTranslationX(gm.L(112.0f) * wuVar.b0);
                wuVar.invalidate();
                return;
        }
    }
}
