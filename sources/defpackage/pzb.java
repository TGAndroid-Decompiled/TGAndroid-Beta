package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pzb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public pzb(Object obj, byte b) {
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
                qzb qzbVar = (qzb) obj;
                qzbVar.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qzbVar.n0();
                return;
            case 1:
                ((rzb) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                l1c l1cVar = (l1c) obj;
                l1cVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1cVar.m();
                return;
            case 3:
                ((l2c) obj).g(valueAnimator);
                return;
            case 4:
                n5c n5cVar = (n5c) obj;
                n5cVar.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5cVar.invalidate();
                return;
            case 5:
                y9c y9cVar = (y9c) obj;
                y9cVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9cVar.invalidate();
                return;
            case 6:
                vbc vbcVar = (vbc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbcVar.b = floatValue;
                vbcVar.setTranslationY(floatValue);
                return;
            case 7:
                uic uicVar = (uic) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uicVar.setAnimationIdicatorProgress(floatValue2);
                tic ticVar = uicVar.E;
                if (ticVar != null) {
                    ticVar.a(floatValue2);
                    return;
                }
                return;
            case 8:
                ujc ujcVar = (ujc) obj;
                ujcVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ujcVar.invalidate();
                return;
            case 9:
                mkc mkcVar = (mkc) obj;
                mkcVar.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mkcVar.x();
                return;
            case 10:
                dlc dlcVar = (dlc) obj;
                dlcVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dlcVar.b.invalidate();
                return;
            case 11:
                kqc kqcVar = (kqc) obj;
                kqcVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kqcVar.invalidate();
                return;
            case 12:
                sqc sqcVar = (sqc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sqcVar.c.setRotationY(floatValue3);
                if (floatValue3 <= 90.0f) {
                    z = false;
                }
                FrameLayout frameLayout = sqcVar.d;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                FrameLayout frameLayout2 = sqcVar.e;
                if (!z) {
                    i2 = 4;
                }
                frameLayout2.setVisibility(i2);
                return;
            case 13:
                nrc nrcVar = (nrc) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lrc lrcVar = nrcVar.q;
                yrc yrcVar = nrcVar.i;
                RectF rectF = nrcVar.n;
                RectF rectF2 = nrcVar.o;
                if (!nrcVar.v) {
                    nrcVar.e();
                    float interpolation = nrcVar.k.getInterpolation(Math.min(1.0f, floatValue4 * 2.0f));
                    n12 n12Var = nrcVar.c;
                    if (n12Var != null) {
                        n12Var.t1(interpolation);
                    } else {
                        nrcVar.b.setTranslationY(view.getHeight() * interpolation);
                    }
                    if (nrcVar.p != null && !rectF2.isEmpty()) {
                        dl1 M6 = nrcVar.e.M6(nrcVar.f);
                        dl1 dl1Var = nrcVar.p;
                        if (M6 != dl1Var) {
                            dl1Var.J0.i(false);
                            nrcVar.p = M6;
                        } else {
                            M6 = dl1Var;
                        }
                        if (M6 != null && !nrcVar.s) {
                            M6.J0.i(true);
                            yoc yocVar = nrcVar.p.J0.m;
                            if (yocVar != null && yocVar.isAttachedToWindow()) {
                                rectF2.set(nrcVar.c(yocVar));
                                nrcVar.r = floatValue4;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue4 - 0.25f) / 0.5f));
                                float B = xnb.B(max, 2.0f, 3.0f, max * max);
                                yrcVar.setAlpha((1.0f - B) * nrcVar.l);
                                lrcVar.setAlpha(B);
                                nrcVar.d();
                                float f = 1.0f - floatValue4;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - hl.L(150.0f);
                                float f2 = f * f;
                                float f3 = f * 2.0f * floatValue4;
                                float f4 = floatValue4 * floatValue4;
                                float centerX2 = (rectF2.centerX() * f4) + (centerX * f3) + (rectF.centerX() * f2);
                                float centerY = (rectF2.centerY() * f4) + (f3 * min) + (rectF.centerY() * f2);
                                nrcVar.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue4) + rectF.width());
                                if (floatValue4 < 0.92f) {
                                    nrcVar.j.A(centerX2, centerY);
                                }
                                nrcVar.h.invalidate();
                                return;
                            }
                            rectF2.setEmpty();
                            yrcVar.setAlpha(0.0f);
                            lrcVar.setAlpha(0.0f);
                            return;
                        }
                        rectF2.setEmpty();
                        yrcVar.setAlpha(0.0f);
                        lrcVar.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                yrc yrcVar2 = (yrc) obj;
                yrcVar2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yrcVar2.b();
                return;
            case 15:
                ((ksc) obj).n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                jtc jtcVar = (jtc) obj;
                jtcVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jtcVar.invalidate();
                return;
            case 17:
                ltc ltcVar = (ltc) obj;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                ltcVar.w = f5.floatValue();
                ltcVar.f.a(f5);
                View view3 = ltcVar.a;
                view3.setAlpha(1.0f - ltc.c(0.05f, 0.45f, ltcVar.w));
                view3.setScaleX(1.0f - (ltcVar.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = ltcVar.b;
                editTextBoldCursor.setAlpha(ltc.c(0.3f, 0.9f, ltcVar.w));
                editTextBoldCursor.setTranslationX((1.0f - ltcVar.w) * c00.d(80.0f, ltcVar.getWidth(), 0));
                ltcVar.invalidate();
                return;
            case 18:
                ((euc) obj).y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                duc ducVar = (duc) obj;
                ducVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ducVar.c();
                return;
            case 20:
                quc qucVar = (quc) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = qucVar.n;
                RectF rectF4 = qucVar.o;
                if (!qucVar.s) {
                    qucVar.e();
                    float interpolation2 = qucVar.k.getInterpolation(Math.min(1.0f, floatValue5 * 2.0f));
                    n12 n12Var2 = qucVar.a;
                    if (n12Var2 != null) {
                        n12Var2.t1(interpolation2);
                    } else {
                        qucVar.c.setTranslationY(view2.getHeight() * interpolation2);
                    }
                    if (qucVar.p != null && !rectF4.isEmpty()) {
                        yrc pendingDiamond = qucVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            l2c l2cVar = qucVar.p;
                            TL_wallet.walletTransaction wallettransaction = qucVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = l2cVar.S;
                            if (wallettransaction2 != null && j2c.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(qucVar.d(pendingDiamond));
                            }
                        }
                        float f6 = 1.0f - floatValue5;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - hl.L(150.0f);
                        float f7 = f6 * f6;
                        float f8 = f6 * 2.0f * floatValue5;
                        float f9 = floatValue5 * floatValue5;
                        float centerX4 = (rectF4.centerX() * f9) + (centerX3 * f8) + (rectF3.centerX() * f7);
                        float centerY2 = (rectF4.centerY() * f9) + (f8 * min2) + (rectF3.centerY() * f7);
                        qucVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue5) + rectF3.width());
                        if (floatValue5 < 0.92f) {
                            qucVar.j.A(centerX4, centerY2);
                        }
                        qucVar.h.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                dxc dxcVar = (dxc) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dxcVar.V = floatValue6;
                dxcVar.W.setAlpha(floatValue6);
                dxcVar.invalidate();
                return;
            default:
                xt xtVar = (xt) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xtVar.b0 = floatValue7;
                xtVar.j(floatValue7);
                xtVar.c0.setAlpha(xtVar.b0);
                xtVar.S.setTranslationX(hl.L(56.0f) * xtVar.b0);
                xtVar.P.setTranslationX(hl.L(112.0f) * xtVar.b0);
                xtVar.invalidate();
                return;
        }
    }
}
