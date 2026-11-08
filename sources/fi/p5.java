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
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.d50;
import org.telegram.ui.ey;
import org.telegram.ui.nr;
import org.telegram.ui.pc0;
import org.telegram.ui.pn;
import org.telegram.ui.q11;
import org.telegram.ui.v71;
import org.telegram.ui.ym;
import org.telegram.ui.yx;
import org.telegram.ui.z10;
import org.telegram.ui.za1;
import org.telegram.ui.zc;
public final class p5 extends View implements te.b {
    public final int f12596a;
    public Object f12597b;
    public final Object f12598c;

    public p5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f12596a = i7;
        this.f12598c = obj;
        this.f12597b = obj2;
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
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12597b;
        if (w9Var.f39897t) {
            if ((w9Var.f39890m == 1.0f || !w9Var.f39893p) && w9Var.f39891n && w9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12596a) {
            case 4:
                RectF rectF = (RectF) this.f12597b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                an anVar = (an) this.f12598c;
                int backgroundSizeY = anVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float j92 = anVar.j9(this);
                ym ymVar = anVar.f44028xa;
                if (ymVar != null) {
                    ymVar.b(x10, j92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, j92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackground"));
                ym ymVar2 = anVar.f44028xa;
                if (ymVar2 == null ? org.telegram.ui.ActionBar.k6.d1() : ymVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                z10 z10Var = (z10) this.f12598c;
                uq uqVar = z10Var.f39296c0;
                float measuredWidth2 = (1.0f - uqVar.f38708g) * z10Var.f39297d0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f12597b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((z10Var.f39299e0.getMeasuredWidth() * uqVar.f38708g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) this.f12597b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f12596a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f12597b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f12596a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f12597b).jumpToCurrentState();
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
        switch (this.f12596a) {
            case 0:
                Paint paint = (Paint) this.f12597b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                he0 he0Var = (he0) this.f12598c;
                he0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                he0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f12597b;
                ii.p pVar = (ii.p) this.f12598c;
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
                    String str = ((String[]) this.f12597b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.h8) this.f12598c).f46269f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f12597b;
                bd bdVar = (bd) this.f12598c;
                di.c4 c4Var = bdVar.f44262f;
                if (c4Var != null && c4Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (bdVar.f44277s.getAlpha() * bdVar.f44262f.getImageReceiver().f21197h1 * 85.0f));
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
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12597b;
                Paint paint4 = w9Var.f39900x;
                org.telegram.ui.ActionBar.f6 f6Var = w9Var.f39901y;
                Paint paint5 = w9Var.f39899w;
                int i11 = w9Var.f39881b;
                View view = w9Var.f39882c;
                p5 p5Var = w9Var.d;
                if (p5Var != null) {
                    if (p5Var.getMeasuredHeight() != 0 || p5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !w9Var.f39897t && !w9Var.f39893p) {
                            w9Var.a();
                            w9Var.f39889l = false;
                        }
                        Bitmap[] bitmapArr2 = w9Var.f39885g;
                        if ((bitmapArr2 != null || w9Var.f39892o) && w9Var.f39893p) {
                            boolean z9 = w9Var.f39891n;
                            if (z9) {
                                float f12 = w9Var.f39890m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    w9Var.f39890m = f13;
                                    if (f13 > 1.0f) {
                                        w9Var.f39890m = 1.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                            if (!z9) {
                                float f14 = w9Var.f39890m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    w9Var.f39890m = f15;
                                    if (f15 < 0.0f) {
                                        w9Var.f39890m = 0.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                        }
                        if (w9Var.f39893p) {
                            f10 = w9Var.f39890m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && w9Var.f39892o) {
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
                                canvas.translate(f11, w9Var.f39898u);
                            }
                            canvas.save();
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), p5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, w9Var.f39898u);
                            }
                            canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), w9Var.f39896s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            w9Var.f39897t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (w9Var.f39891n && !w9Var.f39888k) {
                            if (w9Var.f39885g == null || w9Var.f39889l) {
                                w9Var.f39888k = r15;
                                w9Var.f39889l = r16;
                                if (w9Var.f39883e == null) {
                                    w9Var.f39883e = new Bitmap[2];
                                    w9Var.f39887j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (w9Var.f39883e[i12] != null && p5Var.getMeasuredWidth() == w9Var.f39895r && p5Var.getMeasuredHeight() == w9Var.f39894q) {
                                        w9Var.f39883e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = p5Var.getMeasuredHeight();
                                        int measuredWidth = p5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22557m;
                                        w9Var.f39896s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            w9Var.f39883e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            w9Var.f39887j[i12] = new Canvas(w9Var.f39883e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.h3(new xf(w9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        w9Var.f39883e[i12].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, f6Var));
                                    }
                                    w9Var.f39887j[i12].save();
                                    w9Var.f39887j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof ym) {
                                            background = ((ym) f6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.k6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        w9Var.f39887j[i12].translate(f11, -w9Var.f39898u);
                                        view.draw(w9Var.f39887j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(w9Var.f39887j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(w9Var.f39887j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    w9Var.f39887j[i12].restore();
                                }
                                w9Var.f39894q = p5Var.getMeasuredHeight();
                                w9Var.f39895r = p5Var.getMeasuredWidth();
                                w9Var.v.f38951b = p5Var.getMeasuredWidth();
                                w9Var.v.f38952c = p5Var.getMeasuredHeight();
                                org.telegram.ui.Components.v9 v9Var = w9Var.v;
                                if (v9Var.f38951b != 0 && v9Var.f38952c != 0) {
                                    if (w9Var.f39880a == null) {
                                        w9Var.f39880a = new org.telegram.messenger.q5("blur_thread_" + w9Var, (boolean) r15);
                                    }
                                    w9Var.f39880a.postRunnable(w9Var.v);
                                    return;
                                }
                                w9Var.f39888k = false;
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
                Paint paint6 = (Paint) this.f12597b;
                pn pnVar = (pn) this.f12598c;
                di.c4 c4Var2 = pnVar.f48866e;
                if (c4Var2 != null && c4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (pnVar.f48866e.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f12597b;
                p10 p10Var = (p10) this.f12598c;
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
                q70 q70Var = (q70) this.f12598c;
                FrameLayout frameLayout = q70Var.f37213n;
                float[] fArr = q70Var.I;
                q70.a(frameLayout, (FrameLayout) this.f12597b, fArr);
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
                Paint paint8 = (Paint) this.f12597b;
                nr nrVar = (nr) this.f12598c;
                org.telegram.ui.Components.l9 l9Var2 = nrVar.f48119e;
                if (l9Var2 != null && l9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (nrVar.f48119e.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                ey eyVar = (ey) this.f12598c;
                FrameLayout frameLayout2 = eyVar.f52335a;
                float[] fArr2 = eyVar.D;
                yx.a(frameLayout2, (FrameLayout) this.f12597b, fArr2);
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
                Paint paint9 = (Paint) this.f12597b;
                d50 d50Var = (d50) this.f12598c;
                if (d50Var.d != null && d50Var.f44956n.getVisibility() == 0 && d50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (d50Var.f44956n.getAlpha() * d50Var.d.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f12597b;
                pc0 pc0Var = (pc0) this.f12598c;
                zc zcVar = pc0Var.f48788r;
                di.c4 c4Var3 = pc0Var.f48785e;
                if (c4Var3 != null && zcVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (zcVar.getAlpha() * c4Var3.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((q11) this.f12598c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.f6) this.f12597b));
                    return;
                }
            case 16:
                v71 v71Var = (v71) this.f12598c;
                int currentItem = v71Var.f50554k0.getCurrentItem();
                Paint paint11 = (Paint) this.f12597b;
                int i13 = org.telegram.ui.ActionBar.k6.f28081pf;
                if (v71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.k6.F0(i13);
                } else {
                    themedColor = v71Var.getThemedColor(i13);
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
                Paint paint12 = (Paint) this.f12597b;
                paint12.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) za1.x0((za1) this.f12598c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.y5 y5Var = ((org.telegram.ui.Wallet.b6) this.f12598c).f42193b;
                if (y5Var != null) {
                    y5Var.e(canvas, (float[]) this.f12597b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.p7.a(-16216082, (float[]) this.f12597b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f12597b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f12598c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12596a) {
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
        switch (this.f12596a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f12597b;
                p5 p5Var = w9Var.d;
                if (w9Var.f39885g != null && p5Var.getMeasuredHeight() != 0 && p5Var.getMeasuredWidth() != 0) {
                    w9Var.a();
                    w9Var.f39894q = p5Var.getMeasuredHeight();
                    w9Var.f39895r = p5Var.getMeasuredWidth();
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
        switch (this.f12596a) {
            case 5:
                super.setAlpha(f10);
                View view = ((an) this.f12598c).fragmentView;
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
                ((p10) this.f12598c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f12596a) {
            case 7:
                super.setScaleX(f10);
                ((p10) this.f12598c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f12596a) {
            case 7:
                super.setScaleY(f10);
                ((p10) this.f12598c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12596a) {
            case 7:
                super.setTranslationY(f10);
                ((p10) this.f12598c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f12596a) {
            case 5:
                super.setVisibility(i7);
                View view = ((an) this.f12598c).fragmentView;
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
        switch (this.f12596a) {
            case 0:
                if (drawable != ((he0) this.f12598c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f12597b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public p5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.f12596a = 13;
        this.f12598c = new te.a(0, this, xq.h, 380L, true);
        this.f12597b = q4Var;
    }

    public p5(Activity activity) {
        super(activity);
        this.f12596a = 0;
        Paint paint = new Paint(1);
        this.f12597b = paint;
        he0 he0Var = new he0(10);
        this.f12598c = he0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        he0Var.setCallback(this);
        he0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public p5(ii.p pVar, Context context) {
        super(context);
        this.f12596a = 1;
        this.f12598c = pVar;
        this.f12597b = new Paint(1);
    }

    public p5(p10 p10Var, Context context) {
        super(context);
        this.f12596a = 7;
        this.f12598c = p10Var;
        this.f12597b = new Paint(1);
    }

    public p5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f12596a = 19;
        this.f12597b = paint;
        this.f12598c = drawable;
    }

    public p5(org.telegram.ui.Wallet.b6 b6Var, Context context) {
        super(context);
        this.f12596a = 18;
        this.f12598c = b6Var;
    }

    public p5(za1 za1Var, Context context) {
        super(context);
        this.f12596a = 17;
        this.f12598c = za1Var;
        this.f12597b = new Paint();
    }

    public p5(Context context, v71 v71Var) {
        super(context);
        this.f12596a = 16;
        this.f12598c = v71Var;
        this.f12597b = new Paint(1);
    }

    public p5(an anVar, Context context) {
        super(context);
        this.f12596a = 4;
        this.f12598c = anVar;
        this.f12597b = new RectF();
    }

    public p5(an anVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12596a = 5;
        this.f12598c = anVar;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(view, this, f6Var);
        this.f12597b = w9Var;
        w9Var.f39893p = false;
        w9Var.f39891n = true;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
