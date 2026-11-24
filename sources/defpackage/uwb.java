package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uwb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public uwb(Object obj, byte b) {
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
                kxb kxbVar = (kxb) obj;
                kxbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kxbVar.m();
                return;
            case 1:
                ((lyb) obj).g(valueAnimator);
                return;
            case 2:
                o1c o1cVar = (o1c) obj;
                o1cVar.r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1cVar.invalidate();
                return;
            case 3:
                y5c y5cVar = (y5c) obj;
                y5cVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5cVar.invalidate();
                return;
            case 4:
                v7c v7cVar = (v7c) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v7cVar.b = floatValue;
                v7cVar.setTranslationY(floatValue);
                return;
            case 5:
                vec vecVar = (vec) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vecVar.setAnimationIdicatorProgress(floatValue2);
                uec uecVar = vecVar.E;
                if (uecVar != null) {
                    uecVar.g(floatValue2);
                    return;
                }
                return;
            case 6:
                pfc pfcVar = (pfc) obj;
                pfcVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pfcVar.invalidate();
                return;
            case 7:
                hgc hgcVar = (hgc) obj;
                hgcVar.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hgcVar.x();
                return;
            case 8:
                xgc xgcVar = (xgc) obj;
                xgcVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xgcVar.b.invalidate();
                return;
            case 9:
                xlc xlcVar = (xlc) obj;
                xlcVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xlcVar.invalidate();
                return;
            case 10:
                fmc fmcVar = (fmc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fmcVar.c.setRotationY(floatValue3);
                if (floatValue3 <= 90.0f) {
                    z = false;
                }
                FrameLayout frameLayout = fmcVar.d;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                FrameLayout frameLayout2 = fmcVar.e;
                if (!z) {
                    i2 = 4;
                }
                frameLayout2.setVisibility(i2);
                return;
            case 11:
                anc ancVar = (anc) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymc ymcVar = ancVar.q;
                lnc lncVar = ancVar.i;
                RectF rectF = ancVar.n;
                RectF rectF2 = ancVar.o;
                if (!ancVar.v) {
                    ancVar.e();
                    float interpolation = ancVar.k.getInterpolation(Math.min(1.0f, floatValue4 * 2.0f));
                    x02 x02Var = ancVar.c;
                    if (x02Var != null) {
                        x02Var.s1(interpolation);
                    } else {
                        ancVar.b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (ancVar.p != null && !rectF2.isEmpty()) {
                        uk1 D6 = ancVar.e.D6(ancVar.f);
                        uk1 uk1Var = ancVar.p;
                        if (D6 != uk1Var) {
                            uk1Var.J0.i(false);
                            ancVar.p = D6;
                        } else {
                            D6 = uk1Var;
                        }
                        if (D6 != null && !ancVar.s) {
                            D6.J0.i(true);
                            mkc mkcVar = ancVar.p.J0.m;
                            if (mkcVar != null && mkcVar.isAttachedToWindow()) {
                                rectF2.set(ancVar.c(mkcVar));
                                ancVar.r = floatValue4;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue4 - 0.25f) / 0.5f));
                                float B = yjb.B(max, 2.0f, 3.0f, max * max);
                                lncVar.setAlpha((1.0f - B) * ancVar.l);
                                ymcVar.setAlpha(B);
                                ancVar.d();
                                float f = 1.0f - floatValue4;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - gl.L(150.0f);
                                float f2 = f * f;
                                float f3 = f * 2.0f * floatValue4;
                                float f4 = floatValue4 * floatValue4;
                                float centerX2 = (rectF2.centerX() * f4) + (centerX * f3) + (rectF.centerX() * f2);
                                float centerY = (rectF2.centerY() * f4) + (f3 * min) + (rectF.centerY() * f2);
                                ancVar.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue4) + rectF.width());
                                if (floatValue4 < 0.92f) {
                                    ancVar.j.A(centerX2, centerY);
                                }
                                ancVar.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            lncVar.setAlpha(0.0f);
                            ymcVar.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        lncVar.setAlpha(0.0f);
                        ymcVar.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                lnc lncVar2 = (lnc) obj;
                lncVar2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lncVar2.b();
                return;
            case 13:
                ((ync) obj).n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                woc wocVar = (woc) obj;
                wocVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wocVar.invalidate();
                return;
            case 15:
                zoc zocVar = (zoc) obj;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                zocVar.w = f5.floatValue();
                zocVar.f.a(f5);
                View view3 = zocVar.a;
                view3.setAlpha(1.0f - zoc.c(0.05f, 0.45f, zocVar.w));
                view3.setScaleX(1.0f - (zocVar.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = zocVar.b;
                editTextBoldCursor.setAlpha(zoc.c(0.3f, 0.9f, zocVar.w));
                editTextBoldCursor.setTranslationX((1.0f - zocVar.w) * b00.c(80.0f, zocVar.getWidth(), 0));
                zocVar.invalidate();
                return;
            case 16:
                ((qpc) obj).x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                ppc ppcVar = (ppc) obj;
                ppcVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ppcVar.c();
                return;
            case 18:
                cqc cqcVar = (cqc) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = cqcVar.n;
                RectF rectF4 = cqcVar.o;
                if (!cqcVar.s) {
                    cqcVar.e();
                    float interpolation2 = cqcVar.k.getInterpolation(Math.min(1.0f, floatValue5 * 2.0f));
                    x02 x02Var2 = cqcVar.a;
                    if (x02Var2 != null) {
                        x02Var2.s1(interpolation2);
                    } else {
                        cqcVar.c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (cqcVar.p != null && !rectF4.isEmpty()) {
                        lnc pendingDiamond = cqcVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            lyb lybVar = cqcVar.p;
                            TL_wallet.walletTransaction wallettransaction = cqcVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = lybVar.S;
                            if (wallettransaction2 != null && jyb.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(cqcVar.d(pendingDiamond));
                            }
                        }
                        float f6 = 1.0f - floatValue5;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - gl.L(150.0f);
                        float f7 = f6 * f6;
                        float f8 = f6 * 2.0f * floatValue5;
                        float f9 = floatValue5 * floatValue5;
                        float centerX4 = (rectF4.centerX() * f9) + (centerX3 * f8) + (rectF3.centerX() * f7);
                        float centerY2 = (rectF4.centerY() * f9) + (f8 * min2) + (rectF3.centerY() * f7);
                        cqcVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue5) + rectF3.width());
                        if (floatValue5 < 0.92f) {
                            cqcVar.j.A(centerX4, centerY2);
                        }
                        cqcVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                nsc nscVar = (nsc) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nscVar.V = floatValue6;
                nscVar.W.setAlpha(floatValue6);
                nscVar.invalidate();
                return;
            default:
                wt wtVar = (wt) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.b0 = floatValue7;
                wtVar.j(floatValue7);
                wtVar.c0.setAlpha(wtVar.b0);
                wtVar.S.setTranslationX(gl.L(56.0f) * wtVar.b0);
                wtVar.P.setTranslationX(gl.L(112.0f) * wtVar.b0);
                wtVar.invalidate();
                return;
        }
    }
}
