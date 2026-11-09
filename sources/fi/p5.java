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
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.ay;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.bd;
import org.telegram.ui.cn;
import org.telegram.ui.f50;
import org.telegram.ui.gy;
import org.telegram.ui.pr;
import org.telegram.ui.rc0;
import org.telegram.ui.rn;
import org.telegram.ui.s11;
import org.telegram.ui.w71;
import org.telegram.ui.zc;
public final class p5 extends View implements te.b {
    public final int f12594a;
    public Object f12595b;
    public final Object f12596c;

    public p5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f12594a = i7;
        this.f12596c = obj;
        this.f12595b = obj2;
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
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12595b;
        if (w9Var.f40012t) {
            if ((w9Var.f40005m == 1.0f || !w9Var.f40008p) && w9Var.f40006n && w9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12594a) {
            case 4:
                RectF rectF = (RectF) this.f12595b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                cn cnVar = (cn) this.f12596c;
                int backgroundSizeY = cnVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float k92 = cnVar.k9(this);
                an anVar = cnVar.f44709za;
                if (anVar != null) {
                    anVar.b(x10, k92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.l6.r(x10, k92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackground"));
                an anVar2 = cnVar.f44709za;
                if (anVar2 == null ? org.telegram.ui.ActionBar.l6.d1() : anVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                b20 b20Var = (b20) this.f12596c;
                uq uqVar = b20Var.f39385c0;
                float measuredWidth2 = (1.0f - uqVar.f38773g) * b20Var.f39386d0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f12595b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((b20Var.f39388e0.getMeasuredWidth() * uqVar.f38773g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) this.f12595b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f12594a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f12595b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f12594a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f12595b).jumpToCurrentState();
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
        switch (this.f12594a) {
            case 0:
                Paint paint = (Paint) this.f12595b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                ie0 ie0Var = (ie0) this.f12596c;
                ie0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                ie0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f12595b;
                ii.p pVar = (ii.p) this.f12596c;
                org.telegram.ui.Components.l9 l9Var = pVar.f15592x;
                if (l9Var != null && l9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.f15592x.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f12595b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.h8) this.f12596c).f46198f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f12595b;
                bd bdVar = (bd) this.f12596c;
                di.d4 d4Var = bdVar.f43988f;
                if (d4Var != null && d4Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (bdVar.f44003s.getAlpha() * bdVar.f43988f.getImageReceiver().f21197h1 * 85.0f));
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12595b;
                Paint paint4 = w9Var.f40015x;
                org.telegram.ui.ActionBar.g6 g6Var = w9Var.f40016y;
                Paint paint5 = w9Var.f40014w;
                int i11 = w9Var.f39996b;
                View view = w9Var.f39997c;
                p5 p5Var = w9Var.d;
                if (p5Var != null) {
                    if (p5Var.getMeasuredHeight() != 0 || p5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !w9Var.f40012t && !w9Var.f40008p) {
                            w9Var.a();
                            w9Var.f40004l = false;
                        }
                        Bitmap[] bitmapArr2 = w9Var.f40000g;
                        if ((bitmapArr2 != null || w9Var.f40007o) && w9Var.f40008p) {
                            boolean z9 = w9Var.f40006n;
                            if (z9) {
                                float f12 = w9Var.f40005m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    w9Var.f40005m = f13;
                                    if (f13 > 1.0f) {
                                        w9Var.f40005m = 1.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                            if (!z9) {
                                float f14 = w9Var.f40005m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    w9Var.f40005m = f15;
                                    if (f15 < 0.0f) {
                                        w9Var.f40005m = 0.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                        }
                        if (w9Var.f40008p) {
                            f10 = w9Var.f40005m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && w9Var.f40007o) {
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
                                canvas.translate(f11, w9Var.f40013u);
                            }
                            canvas.save();
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), p5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, w9Var.f40013u);
                            }
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), w9Var.f40011s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            w9Var.f40012t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (w9Var.f40006n && !w9Var.f40003k) {
                            if (w9Var.f40000g == null || w9Var.f40004l) {
                                w9Var.f40003k = r15;
                                w9Var.f40004l = r16;
                                if (w9Var.f39998e == null) {
                                    w9Var.f39998e = new Bitmap[2];
                                    w9Var.f40002j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (w9Var.f39998e[i12] != null && p5Var.getMeasuredWidth() == w9Var.f40010r && p5Var.getMeasuredHeight() == w9Var.f40009q) {
                                        w9Var.f39998e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = p5Var.getMeasuredHeight();
                                        int measuredWidth = p5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22557m;
                                        w9Var.f40011s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            w9Var.f39998e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            w9Var.f40002j[i12] = new Canvas(w9Var.f39998e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.h3(new xf(w9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        w9Var.f39998e[i12].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var));
                                    }
                                    w9Var.f40002j[i12].save();
                                    w9Var.f40002j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (g6Var instanceof an) {
                                            background = ((an) g6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.l6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        w9Var.f40002j[i12].translate(f11, -w9Var.f40013u);
                                        view.draw(w9Var.f40002j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(w9Var.f40002j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(w9Var.f40002j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    w9Var.f40002j[i12].restore();
                                }
                                w9Var.f40009q = p5Var.getMeasuredHeight();
                                w9Var.f40010r = p5Var.getMeasuredWidth();
                                w9Var.v.f39015b = p5Var.getMeasuredWidth();
                                w9Var.v.f39016c = p5Var.getMeasuredHeight();
                                org.telegram.ui.Components.v9 v9Var = w9Var.v;
                                if (v9Var.f39015b != 0 && v9Var.f39016c != 0) {
                                    if (w9Var.f39995a == null) {
                                        w9Var.f39995a = new org.telegram.messenger.q5("blur_thread_" + w9Var, (boolean) r15);
                                    }
                                    w9Var.f39995a.postRunnable(w9Var.v);
                                    return;
                                }
                                w9Var.f40003k = false;
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
                Paint paint6 = (Paint) this.f12595b;
                rn rnVar = (rn) this.f12596c;
                di.d4 d4Var2 = rnVar.f49516e;
                if (d4Var2 != null && d4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (rnVar.f49516e.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f12595b;
                q10 q10Var = (q10) this.f12596c;
                boolean z10 = q10Var.E;
                if (z10) {
                    float f16 = q10Var.F;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        q10Var.F = f17;
                        if (f17 > 1.0f) {
                            q10Var.F = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(q10Var.F, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * q10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z10) {
                    float f18 = q10Var.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        q10Var.F = f19;
                        if (f19 < 0.0f) {
                            q10Var.F = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(q10Var.F, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * q10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                r70 r70Var = (r70) this.f12596c;
                FrameLayout frameLayout = r70Var.f37569n;
                float[] fArr = r70Var.I;
                r70.a(frameLayout, (FrameLayout) this.f12595b, fArr);
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
                Paint paint8 = (Paint) this.f12595b;
                pr prVar = (pr) this.f12596c;
                org.telegram.ui.Components.l9 l9Var2 = prVar.f48790e;
                if (l9Var2 != null && l9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (prVar.f48790e.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                gy gyVar = (gy) this.f12596c;
                FrameLayout frameLayout2 = gyVar.f43816a;
                float[] fArr2 = gyVar.D;
                ay.a(frameLayout2, (FrameLayout) this.f12595b, fArr2);
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
                Paint paint9 = (Paint) this.f12595b;
                f50 f50Var = (f50) this.f12596c;
                if (f50Var.d != null && f50Var.f45589n.getVisibility() == 0 && f50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (f50Var.f45589n.getAlpha() * f50Var.d.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f12595b;
                rc0 rc0Var = (rc0) this.f12596c;
                zc zcVar = rc0Var.f49447r;
                di.d4 d4Var3 = rc0Var.f49444e;
                if (d4Var3 != null && zcVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (zcVar.getAlpha() * d4Var3.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((s11) this.f12596c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, (org.telegram.ui.ActionBar.g6) this.f12595b));
                    return;
                }
            case 16:
                w71 w71Var = (w71) this.f12596c;
                int currentItem = w71Var.f50936k0.getCurrentItem();
                Paint paint11 = (Paint) this.f12595b;
                int i13 = org.telegram.ui.ActionBar.l6.f28094pf;
                if (w71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.l6.F0(i13);
                } else {
                    themedColor = w71Var.getThemedColor(i13);
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
                Paint paint12 = (Paint) this.f12595b;
                paint12.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) bb1.x0((bb1) this.f12596c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.a6) this.f12596c).f42113b;
                if (x5Var != null) {
                    x5Var.e(canvas, (float[]) this.f12595b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.o7.a(-16216082, (float[]) this.f12595b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f12595b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f12596c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12594a) {
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
        switch (this.f12594a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12595b;
                p5 p5Var = w9Var.d;
                if (w9Var.f40000g != null && p5Var.getMeasuredHeight() != 0 && p5Var.getMeasuredWidth() != 0) {
                    w9Var.a();
                    w9Var.f40009q = p5Var.getMeasuredHeight();
                    w9Var.f40010r = p5Var.getMeasuredWidth();
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
        switch (this.f12594a) {
            case 5:
                super.setAlpha(f10);
                View view = ((cn) this.f12596c).fragmentView;
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
                ((q10) this.f12596c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f12594a) {
            case 7:
                super.setScaleX(f10);
                ((q10) this.f12596c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f12594a) {
            case 7:
                super.setScaleY(f10);
                ((q10) this.f12596c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12594a) {
            case 7:
                super.setTranslationY(f10);
                ((q10) this.f12596c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f12594a) {
            case 5:
                super.setVisibility(i7);
                View view = ((cn) this.f12596c).fragmentView;
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
        switch (this.f12594a) {
            case 0:
                if (drawable != ((ie0) this.f12596c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f12595b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public p5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.f12594a = 13;
        this.f12596c = new te.a(0, this, xq.h, 380L, true);
        this.f12595b = q4Var;
    }

    public p5(Activity activity) {
        super(activity);
        this.f12594a = 0;
        Paint paint = new Paint(1);
        this.f12595b = paint;
        ie0 ie0Var = new ie0(10);
        this.f12596c = ie0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ie0Var.setCallback(this);
        ie0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public p5(ii.p pVar, Context context) {
        super(context);
        this.f12594a = 1;
        this.f12596c = pVar;
        this.f12595b = new Paint(1);
    }

    public p5(q10 q10Var, Context context) {
        super(context);
        this.f12594a = 7;
        this.f12596c = q10Var;
        this.f12595b = new Paint(1);
    }

    public p5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f12594a = 19;
        this.f12595b = paint;
        this.f12596c = drawable;
    }

    public p5(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.f12594a = 18;
        this.f12596c = a6Var;
    }

    public p5(bb1 bb1Var, Context context) {
        super(context);
        this.f12594a = 17;
        this.f12596c = bb1Var;
        this.f12595b = new Paint();
    }

    public p5(Context context, w71 w71Var) {
        super(context);
        this.f12594a = 16;
        this.f12596c = w71Var;
        this.f12595b = new Paint(1);
    }

    public p5(cn cnVar, Context context) {
        super(context);
        this.f12594a = 4;
        this.f12596c = cnVar;
        this.f12595b = new RectF();
    }

    public p5(cn cnVar, Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f12594a = 5;
        this.f12596c = cnVar;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(view, this, g6Var);
        this.f12595b = w9Var;
        w9Var.f40008p = false;
        w9Var.f40006n = true;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
