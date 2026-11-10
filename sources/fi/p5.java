package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.wq;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.c20;
import org.telegram.ui.cb1;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.g50;
import org.telegram.ui.hy;
import org.telegram.ui.qr;
import org.telegram.ui.rn;
import org.telegram.ui.sc0;
import org.telegram.ui.t11;
import org.telegram.ui.x71;
import org.telegram.ui.zc;
public final class p5 extends View implements te.b {
    public final int f12598a;
    public Object f12599b;
    public final Object f12600c;

    public p5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f12598a = i7;
        this.f12600c = obj;
        this.f12599b = obj2;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f12599b;
        if (v9Var.f38963t) {
            if ((v9Var.f38956m == 1.0f || !v9Var.f38959p) && v9Var.f38957n && v9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12598a) {
            case 4:
                RectF rectF = (RectF) this.f12599b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                cn cnVar = (cn) this.f12600c;
                int backgroundSizeY = cnVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float k92 = cnVar.k9(this);
                an anVar = cnVar.f44750za;
                if (anVar != null) {
                    anVar.b(x10, k92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.m6.r(x10, k92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackground"));
                an anVar2 = cnVar.f44750za;
                if (anVar2 == null ? org.telegram.ui.ActionBar.m6.d1() : anVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                c20 c20Var = (c20) this.f12600c;
                tq tqVar = c20Var.f39305c0;
                float measuredWidth2 = (1.0f - tqVar.f38367g) * c20Var.f39306d0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f12599b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((c20Var.f39308e0.getMeasuredWidth() * tqVar.f38367g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.r4) this.f12599b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f12598a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f12599b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f12598a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f12599b).jumpToCurrentState();
                return;
            default:
                super.jumpDrawablesToCurrentState();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        Bitmap[] bitmapArr;
        float f11;
        ?? r16;
        ?? r15;
        int themedColor;
        int i7;
        switch (this.f12598a) {
            case 0:
                Paint paint = (Paint) this.f12599b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                he0 he0Var = (he0) this.f12600c;
                he0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                he0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f12599b;
                ii.p pVar = (ii.p) this.f12600c;
                org.telegram.ui.Components.k9 k9Var = pVar.f15591x;
                if (k9Var != null && k9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.f15591x.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f12599b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.h8) this.f12600c).f46253f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f12599b;
                bd bdVar = (bd) this.f12600c;
                di.d4 d4Var = bdVar.f44017f;
                if (d4Var != null && d4Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (bdVar.f44032s.getAlpha() * bdVar.f44017f.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    return;
                }
                return;
            case 4:
            case 9:
            case 13:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f12599b;
                Paint paint4 = v9Var.f38966x;
                org.telegram.ui.ActionBar.h6 h6Var = v9Var.f38967y;
                Paint paint5 = v9Var.f38965w;
                int i11 = v9Var.f38947b;
                View view = v9Var.f38948c;
                p5 p5Var = v9Var.d;
                if (p5Var != null) {
                    if (p5Var.getMeasuredHeight() != 0 || p5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !v9Var.f38963t && !v9Var.f38959p) {
                            v9Var.a();
                            v9Var.f38955l = false;
                        }
                        Bitmap[] bitmapArr2 = v9Var.f38951g;
                        if ((bitmapArr2 != null || v9Var.f38958o) && v9Var.f38959p) {
                            boolean z9 = v9Var.f38957n;
                            if (z9) {
                                float f12 = v9Var.f38956m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    v9Var.f38956m = f13;
                                    if (f13 > 1.0f) {
                                        v9Var.f38956m = 1.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                            if (!z9) {
                                float f14 = v9Var.f38956m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    v9Var.f38956m = f15;
                                    if (f15 < 0.0f) {
                                        v9Var.f38956m = 0.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                        }
                        if (v9Var.f38959p) {
                            f10 = v9Var.f38956m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && v9Var.f38958o) {
                            paint4.setAlpha((int) (50.0f * f10));
                            canvas.drawPaint(paint4);
                            return;
                        }
                        if (f10 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            f11 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                        } else {
                            bitmapArr = bitmapArr2;
                            f11 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                            canvas.saveLayerAlpha(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f10 * 255.0f));
                            if (i11 == r15) {
                                canvas.translate(f11, v9Var.f38964u);
                            }
                            canvas.save();
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), p5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, v9Var.f38964u);
                            }
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), v9Var.f38962s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            v9Var.f38963t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (v9Var.f38957n && !v9Var.f38954k) {
                            if (v9Var.f38951g == null || v9Var.f38955l) {
                                v9Var.f38954k = r15;
                                v9Var.f38955l = r16;
                                if (v9Var.f38949e == null) {
                                    v9Var.f38949e = new Bitmap[2];
                                    v9Var.f38953j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (v9Var.f38949e[i12] != null && p5Var.getMeasuredWidth() == v9Var.f38961r && p5Var.getMeasuredHeight() == v9Var.f38960q) {
                                        v9Var.f38949e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = p5Var.getMeasuredHeight();
                                        int measuredWidth = p5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22561m;
                                        v9Var.f38962s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            v9Var.f38949e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            v9Var.f38953j[i12] = new Canvas(v9Var.f38949e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.h3(new wf(v9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        v9Var.f38949e[i12].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var));
                                    }
                                    v9Var.f38953j[i12].save();
                                    v9Var.f38953j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (h6Var instanceof an) {
                                            background = ((an) h6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.m6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        v9Var.f38953j[i12].translate(f11, -v9Var.f38964u);
                                        view.draw(v9Var.f38953j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(v9Var.f38953j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(v9Var.f38953j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    v9Var.f38953j[i12].restore();
                                }
                                v9Var.f38960q = p5Var.getMeasuredHeight();
                                v9Var.f38961r = p5Var.getMeasuredWidth();
                                v9Var.v.f38600b = p5Var.getMeasuredWidth();
                                v9Var.v.f38601c = p5Var.getMeasuredHeight();
                                org.telegram.ui.Components.u9 u9Var = v9Var.v;
                                if (u9Var.f38600b != 0 && u9Var.f38601c != 0) {
                                    if (v9Var.f38946a == null) {
                                        v9Var.f38946a = new org.telegram.messenger.q5("blur_thread_" + v9Var, (boolean) r15);
                                    }
                                    v9Var.f38946a.postRunnable(v9Var.v);
                                    return;
                                }
                                v9Var.f38954k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                Paint paint6 = (Paint) this.f12599b;
                rn rnVar = (rn) this.f12600c;
                di.d4 d4Var2 = rnVar.f49454e;
                if (d4Var2 != null && d4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (rnVar.f49454e.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f12599b;
                p10 p10Var = (p10) this.f12600c;
                boolean z10 = p10Var.E;
                if (z10) {
                    float f16 = p10Var.F;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        p10Var.F = f17;
                        if (f17 > 1.0f) {
                            p10Var.F = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(p10Var.F, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * p10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z10) {
                    float f18 = p10Var.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        p10Var.F = f19;
                        if (f19 < 0.0f) {
                            p10Var.F = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(p10Var.F, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * p10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                q70 q70Var = (q70) this.f12600c;
                FrameLayout frameLayout = q70Var.f37160n;
                float[] fArr = q70Var.I;
                q70.a(frameLayout, (FrameLayout) this.f12599b, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 10:
                Paint paint8 = (Paint) this.f12599b;
                qr qrVar = (qr) this.f12600c;
                org.telegram.ui.Components.k9 k9Var2 = qrVar.f49135e;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (qrVar.f49135e.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                hy hyVar = (hy) this.f12600c;
                FrameLayout frameLayout2 = hyVar.f44832a;
                float[] fArr2 = hyVar.D;
                cy.a(frameLayout2, (FrameLayout) this.f12599b, fArr2);
                canvas.save();
                float y11 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 12:
                Paint paint9 = (Paint) this.f12599b;
                g50 g50Var = (g50) this.f12600c;
                if (g50Var.d != null && g50Var.f45983n.getVisibility() == 0 && g50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (g50Var.f45983n.getAlpha() * g50Var.d.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f12599b;
                sc0 sc0Var = (sc0) this.f12600c;
                zc zcVar = sc0Var.f49825r;
                di.d4 d4Var3 = sc0Var.f49822e;
                if (d4Var3 != null && zcVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (zcVar.getAlpha() * d4Var3.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((t11) this.f12600c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, (org.telegram.ui.ActionBar.h6) this.f12599b));
                    return;
                }
            case 16:
                x71 x71Var = (x71) this.f12600c;
                int currentItem = x71Var.f51595k0.getCurrentItem();
                Paint paint11 = (Paint) this.f12599b;
                int i13 = org.telegram.ui.ActionBar.m6.f28119pf;
                if (x71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.m6.F0(i13);
                } else {
                    themedColor = x71Var.getThemedColor(i13);
                }
                paint11.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i7 = 255;
                    } else {
                        i7 = 127;
                    }
                    paint11.setAlpha(i7);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i14 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                }
                return;
            case 17:
                Paint paint12 = (Paint) this.f12599b;
                paint12.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) cb1.x0((cb1) this.f12600c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.a6 a6Var = ((org.telegram.ui.Wallet.d6) this.f12600c).f42352b;
                if (a6Var != null) {
                    a6Var.e(canvas, (float[]) this.f12599b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.r7.a(-16216082, (float[]) this.f12599b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f12599b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f12600c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12598a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f12598a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f12599b;
                p5 p5Var = v9Var.d;
                if (v9Var.f38951g != null && p5Var.getMeasuredHeight() != 0 && p5Var.getMeasuredWidth() != 0) {
                    v9Var.a();
                    v9Var.f38960q = p5Var.getMeasuredHeight();
                    v9Var.f38961r = p5Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f12598a) {
            case 5:
                super.setAlpha(f10);
                View view = ((cn) this.f12600c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
            default:
                super.setAlpha(f10);
                return;
            case 7:
                super.setAlpha(f10);
                ((p10) this.f12600c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f12598a) {
            case 7:
                super.setScaleX(f10);
                ((p10) this.f12600c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f12598a) {
            case 7:
                super.setScaleY(f10);
                ((p10) this.f12600c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12598a) {
            case 7:
                super.setTranslationY(f10);
                ((p10) this.f12600c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f12598a) {
            case 5:
                super.setVisibility(i7);
                View view = ((cn) this.f12600c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12598a) {
            case 0:
                if (drawable != ((he0) this.f12600c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f12599b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public p5(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.f12598a = 13;
        this.f12600c = new te.a(0, this, wq.h, 380L, true);
        this.f12599b = r4Var;
    }

    public p5(Activity activity) {
        super(activity);
        this.f12598a = 0;
        Paint paint = new Paint(1);
        this.f12599b = paint;
        he0 he0Var = new he0(10);
        this.f12600c = he0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        he0Var.setCallback(this);
        he0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public p5(ii.p pVar, Context context) {
        super(context);
        this.f12598a = 1;
        this.f12600c = pVar;
        this.f12599b = new Paint(1);
    }

    public p5(p10 p10Var, Context context) {
        super(context);
        this.f12598a = 7;
        this.f12600c = p10Var;
        this.f12599b = new Paint(1);
    }

    public p5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f12598a = 19;
        this.f12599b = paint;
        this.f12600c = drawable;
    }

    public p5(org.telegram.ui.Wallet.d6 d6Var, Context context) {
        super(context);
        this.f12598a = 18;
        this.f12600c = d6Var;
    }

    public p5(cb1 cb1Var, Context context) {
        super(context);
        this.f12598a = 17;
        this.f12600c = cb1Var;
        this.f12599b = new Paint();
    }

    public p5(Context context, x71 x71Var) {
        super(context);
        this.f12598a = 16;
        this.f12600c = x71Var;
        this.f12599b = new Paint(1);
    }

    public p5(cn cnVar, Context context) {
        super(context);
        this.f12598a = 4;
        this.f12600c = cnVar;
        this.f12599b = new RectF();
    }

    public p5(cn cnVar, Context context, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f12598a = 5;
        this.f12600c = cnVar;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(view, this, h6Var);
        this.f12599b = v9Var;
        v9Var.f38959p = false;
        v9Var.f38957n = true;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
