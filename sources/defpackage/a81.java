package defpackage;

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
public final class a81 extends View implements s84 {
    public final byte a;
    public Object b;
    public Object c;

    public a81(Activity activity) {
        super(activity);
        this.a = (byte) 17;
        Paint paint = new Paint(1);
        this.b = paint;
        mf8 mf8Var = new mf8(10);
        this.c = mf8Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        mf8Var.setCallback(this);
        mf8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final boolean a() {
        wk0 wk0Var = (wk0) this.b;
        if (wk0Var.t) {
            if ((wk0Var.m == 1.0f || !wk0Var.p) && wk0Var.n && wk0Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                zu1 zu1Var = (zu1) this.c;
                int backgroundSizeY = zu1Var.m1.getBackgroundSizeY();
                float x = getX();
                float m7 = zu1Var.m7(this);
                xu1 xu1Var = zu1Var.Ba;
                if (xu1Var != null) {
                    xu1Var.b(x, m7, measuredWidth, backgroundSizeY);
                } else {
                    aob.q(x, m7, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), zu1Var.getThemedPaint("paintChatActionBackground"));
                xu1 xu1Var2 = zu1Var.Ba;
                if (xu1Var2 == null ? aob.b1() : xu1Var2.g()) {
                    canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), zu1Var.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                g75 g75Var = (g75) this.c;
                c43 c43Var = g75Var.d0;
                float measuredWidth2 = (1.0f - c43Var.g) * g75Var.e0.getMeasuredWidth();
                canvas.save();
                hf0 hf0Var = (hf0) this.b;
                hf0Var.setBounds(0, 0, hl.L(50.0f) + ((int) ((g75Var.f0.getMeasuredWidth() * c43Var.g) + measuredWidth2)), getMeasuredHeight());
                hf0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((wk5) this.b)).o(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void drawableStateChanged() {
        switch (this.a) {
            case 9:
                super.drawableStateChanged();
                ((hf0) this.b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        switch (this.a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((hf0) this.b).jumpToCurrentState();
                return;
            default:
                super.jumpDrawablesToCurrentState();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        View view;
        Paint paint;
        Bitmap[] bitmapArr;
        a81 a81Var;
        boolean z;
        int themedColor;
        int i;
        Canvas canvas2 = canvas;
        int i2 = 0;
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                while (i2 < 7) {
                    canvas2.drawText(((String[]) this.b)[i2], (width / 2.0f) + (i2 * width) + paddingLeft, ((getMeasuredHeight() - hl.L(2.0f)) / 2.0f) + hl.L(5.0f), ((j81) this.c).f);
                    i2++;
                }
                return;
            case 1:
                Paint paint2 = (Paint) this.b;
                gi1 gi1Var = (gi1) this.c;
                mb0 mb0Var = gi1Var.f;
                if (mb0Var != null && mb0Var.getImageReceiver().E()) {
                    paint2.setAlpha((int) (gi1Var.s.getAlpha() * gi1Var.f.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                    return;
                }
                return;
            case 2:
            case 9:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                wk0 wk0Var = (wk0) this.b;
                Paint paint3 = wk0Var.x;
                vnb vnbVar = wk0Var.y;
                Paint paint4 = wk0Var.w;
                boolean z2 = wk0Var.b;
                View view2 = wk0Var.c;
                a81 a81Var2 = wk0Var.d;
                if (a81Var2 != null) {
                    if (a81Var2.getMeasuredHeight() != 0 || a81Var2.getMeasuredWidth() != 0) {
                        if (z2 && !wk0Var.t && !wk0Var.p) {
                            wk0Var.a();
                            wk0Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = wk0Var.g;
                        if ((bitmapArr2 != null || wk0Var.o) && wk0Var.p) {
                            boolean z3 = wk0Var.n;
                            float f2 = wk0Var.m;
                            if (z3) {
                                if (f2 != 1.0f) {
                                    float f3 = f2 + 0.09f;
                                    wk0Var.m = f3;
                                    if (f3 > 1.0f) {
                                        wk0Var.m = 1.0f;
                                    }
                                    a81Var2.invalidate();
                                }
                            } else if (f2 != 0.0f) {
                                float f4 = f2 - 0.09f;
                                wk0Var.m = f4;
                                if (f4 < 0.0f) {
                                    wk0Var.m = 0.0f;
                                }
                                a81Var2.invalidate();
                            }
                        }
                        if (wk0Var.p) {
                            f = wk0Var.m;
                        } else {
                            f = 1.0f;
                        }
                        if (bitmapArr2 == null && wk0Var.o) {
                            paint3.setAlpha((int) (f * 50.0f));
                            canvas2.drawPaint(paint3);
                            return;
                        }
                        if (f == 1.0f) {
                            canvas2.save();
                            paint = paint4;
                            z = z2;
                            view = view2;
                            a81Var = a81Var2;
                            bitmapArr = bitmapArr2;
                        } else {
                            view = view2;
                            paint = paint4;
                            bitmapArr = bitmapArr2;
                            a81Var = a81Var2;
                            z = z2;
                            canvas.saveLayerAlpha(0.0f, 0.0f, a81Var2.getMeasuredWidth(), a81Var2.getMeasuredHeight(), (int) (f * 255.0f), 31);
                            canvas2 = canvas;
                        }
                        if (bitmapArr != null) {
                            paint.setAlpha((int) (f * 255.0f));
                            if (z) {
                                canvas2.translate(0.0f, wk0Var.u);
                            }
                            canvas2.save();
                            canvas2.scale(a81Var.getMeasuredWidth() / bitmapArr[1].getWidth(), a81Var.getMeasuredHeight() / bitmapArr[1].getHeight());
                            canvas2.drawBitmap(bitmapArr[1], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            canvas2.save();
                            if (!z) {
                                canvas2.translate(0.0f, wk0Var.u);
                            }
                            canvas2.scale(a81Var.getMeasuredWidth() / bitmapArr[0].getWidth(), wk0Var.s / bitmapArr[0].getHeight());
                            canvas2.drawBitmap(bitmapArr[0], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            wk0Var.t = true;
                            canvas2.drawColor(436207616);
                        }
                        canvas2.restore();
                        if (wk0Var.n && !wk0Var.k) {
                            if (wk0Var.g == null || wk0Var.l) {
                                wk0Var.k = true;
                                wk0Var.l = false;
                                if (wk0Var.e == null) {
                                    wk0Var.e = new Bitmap[2];
                                    wk0Var.j = new Canvas[2];
                                }
                                int i3 = 0;
                                while (i3 < 2) {
                                    if (wk0Var.e[i3] != null && a81Var.getMeasuredWidth() == wk0Var.r && a81Var.getMeasuredHeight() == wk0Var.q) {
                                        wk0Var.e[i3].eraseColor(0);
                                    } else {
                                        int measuredHeight = a81Var.getMeasuredHeight();
                                        int measuredWidth = a81Var.getMeasuredWidth();
                                        int L = hl.L(200.0f) + hl.m;
                                        wk0Var.s = L;
                                        if (i3 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            wk0Var.e[i3] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            wk0Var.j[i3] = new Canvas(wk0Var.e[i3]);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                            hl.c3(new pz(wk0Var, (byte) 9));
                                            return;
                                        }
                                    }
                                    if (i3 == 1) {
                                        wk0Var.e[i3].eraseColor(aob.v0(aob.d6, vnbVar));
                                    }
                                    wk0Var.j[i3].save();
                                    wk0Var.j[i3].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (vnbVar instanceof xu1) {
                                            background = ((xu1) vnbVar).l();
                                        } else {
                                            background = aob.s0();
                                        }
                                    }
                                    View view3 = view;
                                    view3.setTag(67108867, Integer.valueOf(i3));
                                    if (i3 == 0) {
                                        wk0Var.j[i3].translate(0.0f, -wk0Var.u);
                                        view3.draw(wk0Var.j[i3]);
                                    }
                                    if (background != null && i3 == 1) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                        background.draw(wk0Var.j[i3]);
                                        background.setBounds(bounds);
                                        view3.draw(wk0Var.j[i3]);
                                    }
                                    view3.setTag(67108867, null);
                                    wk0Var.j[i3].restore();
                                    i3++;
                                    view = view3;
                                }
                                wk0Var.q = a81Var.getMeasuredHeight();
                                wk0Var.r = a81Var.getMeasuredWidth();
                                wk0Var.v.b = a81Var.getMeasuredWidth();
                                wk0Var.v.c = a81Var.getMeasuredHeight();
                                vk0 vk0Var = wk0Var.v;
                                if (vk0Var.b != 0 && vk0Var.c != 0) {
                                    uo3 uo3Var = wk0Var.a;
                                    if (uo3Var == null) {
                                        uo3Var = new uo3("blur_thread_" + wk0Var, true);
                                        wk0Var.a = uo3Var;
                                    }
                                    uo3Var.postRunnable(wk0Var.v);
                                    return;
                                }
                                wk0Var.k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Paint paint5 = (Paint) this.b;
                g92 g92Var = (g92) this.c;
                mb0 mb0Var2 = g92Var.e;
                if (mb0Var2 != null && mb0Var2.getImageReceiver().E()) {
                    paint5.setAlpha((int) (g92Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    return;
                }
                return;
            case 5:
                Paint paint6 = (Paint) this.b;
                xn2 xn2Var = (xn2) this.c;
                de0 de0Var = xn2Var.x;
                if (de0Var != null && de0Var.getImageReceiver().E()) {
                    paint6.setColor(1426063360);
                    paint6.setAlpha((int) (xn2Var.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), hl.L(20.0f), hl.L(20.0f), paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.b;
                cu2 cu2Var = (cu2) this.c;
                de0 de0Var2 = cu2Var.e;
                if (de0Var2 != null && de0Var2.getImageReceiver().E()) {
                    paint7.setAlpha((int) (cu2Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 7:
                canvas2.drawColor(855638016);
                he4 he4Var = (he4) this.c;
                FrameLayout frameLayout = he4Var.a;
                float[] fArr = he4Var.E;
                ce4.a(frameLayout, (FrameLayout) this.b, fArr);
                canvas2.save();
                float y = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y < 1.0f) {
                    canvas2.clipRect(0.0f, (fArr[1] - y) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas2.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas2);
                canvas2.restore();
                return;
            case 8:
                Paint paint8 = (Paint) this.b;
                ra5 ra5Var = (ra5) this.c;
                boolean z4 = ra5Var.F;
                float f5 = ra5Var.G;
                if (z4) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.064f;
                        ra5Var.G = f6;
                        if (f6 > 1.0f) {
                            ra5Var.G = 1.0f;
                        }
                        invalidate();
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.064f;
                    ra5Var.G = f7;
                    if (f7 < 0.0f) {
                        ra5Var.G = 0.0f;
                    }
                    invalidate();
                }
                paint8.setColor(vm2.f(ra5Var.G, 1711607061, 1714752530));
                canvas2.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - hl.L(25.0f), (hl.L(5.0f) * ra5Var.G) + hl.L(35.0f), paint8);
                return;
            case 10:
                Paint paint9 = (Paint) this.b;
                xc5 xc5Var = (xc5) this.c;
                if (xc5Var.d != null && xc5Var.n.getVisibility() == 0 && xc5Var.d.getImageReceiver().E()) {
                    paint9.setAlpha((int) (xc5Var.n.getAlpha() * xc5Var.d.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                canvas2.drawCircle(measuredWidth2, measuredHeight2, getMeasuredWidth() / 2.0f, (Paint) this.b);
                bl8.d().f(-hl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas2.drawCircle(measuredWidth2, measuredHeight2, (getMeasuredWidth() / 2.0f) - hl.L(2.0f), bl8.d().e());
                float L2 = hl.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight2 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight2 + L2));
                drawable.draw(canvas2);
                return;
            case 13:
                canvas2.drawColor(855638016);
                i56 i56Var = (i56) this.c;
                FrameLayout frameLayout2 = i56Var.n;
                float[] fArr2 = i56Var.J;
                i56.a(frameLayout2, (FrameLayout) this.b, fArr2);
                canvas2.save();
                float y2 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y2 < 1.0f) {
                    canvas2.clipRect(0.0f, (fArr2[1] - y2) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas2.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas2);
                canvas2.restore();
                return;
            case 14:
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width2 = getWidth();
                    float height = getHeight();
                    float max = Math.max(width2 / ((Bitmap) this.c).getWidth(), height / ((Bitmap) this.c).getHeight());
                    canvas2.save();
                    canvas2.translate(c00.c(((Bitmap) this.c).getWidth(), max, width2, 2.0f), c00.c(((Bitmap) this.c).getHeight(), max, height, 2.0f));
                    canvas2.scale(max, max);
                    canvas2.drawBitmap((Bitmap) this.c, 0.0f, 0.0f, (Paint) this.b);
                    canvas2.restore();
                    return;
                }
                return;
            case 15:
                Paint paint10 = (Paint) this.b;
                cg6 cg6Var = (cg6) this.c;
                ei1 ei1Var = cg6Var.r;
                mb0 mb0Var3 = cg6Var.e;
                if (mb0Var3 != null && ei1Var.getVisibility() == 0) {
                    paint10.setAlpha((int) (ei1Var.getAlpha() * mb0Var3.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 16:
                va6 va6Var = (va6) this.b;
                super.onDraw(canvas);
                mm mmVar = (mm) this.c;
                mmVar.a = this;
                mmVar.e(false, 0.0f);
                float f8 = mmVar.c;
                if (f8 != 0.0f) {
                    if (f8 != 1.0f) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (mmVar.c * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    va6Var.e(rectF);
                    va6Var.j(24.0f);
                    va6Var.g(vm2.o(-1, 20), vm2.o(-1, 50), vm2.o(-1, 50), vm2.o(-1, 70));
                    va6Var.draw(canvas2);
                    invalidate();
                    canvas2.restore();
                    return;
                }
                return;
            case 17:
                Paint paint11 = (Paint) this.b;
                paint11.setStrokeWidth(hl.N(1.66f));
                canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, hl.L(10.0f), paint11);
                mf8 mf8Var = (mf8) this.c;
                mf8Var.setBounds(0, 0, hl.L(10.0f), hl.L(10.0f));
                canvas2.save();
                canvas2.translate((getWidth() - hl.L(10.0f)) / 2.0f, (getHeight() - hl.L(10.0f)) / 2.0f);
                mf8Var.draw(canvas2);
                canvas2.restore();
                return;
            case 18:
                if (!((n1a) this.c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas2.drawColor(aob.v0(aob.G8, (vnb) this.b));
                    return;
                }
            case 19:
                pqb pqbVar = (pqb) this.c;
                int currentItem = pqbVar.l0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i4 = aob.sf;
                if (pqbVar.d) {
                    themedColor = aob.D0(i4);
                } else {
                    themedColor = pqbVar.getThemedColor(i4);
                }
                paint12.setColor(themedColor);
                while (i2 < 2) {
                    if (i2 == currentItem) {
                        i = 255;
                    } else {
                        i = 127;
                    }
                    paint12.setAlpha(i);
                    canvas2.drawCircle(hl.L((i2 * 15) + 3), hl.L(4.0f), hl.L(3.0f), paint12);
                    i2++;
                }
                return;
            case 20:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(aob.w0(null, aob.d6, false));
                int measuredHeight3 = getMeasuredHeight() - hl.L(3.0f);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                ((ActionBarLayout) o7c.b0((o7c) this.c)).o(canvas2, measuredHeight3);
                return;
            case 21:
                super.onDraw(canvas);
                int save = canvas2.save();
                canvas2.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                wqc wqcVar = ((zqc) this.c).b;
                float[] fArr3 = (float[]) this.b;
                if (wqcVar != null) {
                    wqcVar.e(canvas2, fArr3);
                } else {
                    canvas2.drawColor(lsc.a(-16216082, fArr3));
                }
                canvas2.restoreToCount(save);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i, i2, i3, i4);
                wk0 wk0Var = (wk0) this.b;
                a81 a81Var = wk0Var.d;
                if (wk0Var.g != null && a81Var.getMeasuredHeight() != 0 && a81Var.getMeasuredWidth() != 0) {
                    wk0Var.a();
                    wk0Var.q = a81Var.getMeasuredHeight();
                    wk0Var.r = a81Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                View view = ((zu1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f);
                ((ra5) this.c).d.setAlpha(f);
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setScaleX(float f) {
        switch (this.a) {
            case 8:
                super.setScaleX(f);
                ((ra5) this.c).d.setScaleX(f);
                return;
            default:
                super.setScaleX(f);
                return;
        }
    }

    @Override
    public final void setScaleY(float f) {
        switch (this.a) {
            case 8:
                super.setScaleY(f);
                ((ra5) this.c).d.setScaleY(f);
                return;
            default:
                super.setScaleY(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 8:
                super.setTranslationY(f);
                ((ra5) this.c).d.setTranslationY(f);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                View view = ((zu1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (f > 0.0f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setAlpha(f);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 9:
                if (((hf0) this.b) == drawable || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 17:
                if (drawable == ((mf8) this.c) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override
    public final void v0(float f, int i) {
    }

    public a81(Context context, wk5 wk5Var) {
        super(context);
        this.a = (byte) 11;
        this.c = new fm0(0, this, k43.h, 380L, true);
        this.b = wk5Var;
    }

    public a81(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public a81(xn2 xn2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = xn2Var;
        this.b = new Paint(1);
    }

    public a81(ra5 ra5Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = ra5Var;
        this.b = new Paint(1);
    }

    public a81(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = (byte) 12;
        this.b = paint;
        this.c = drawable;
    }

    public a81(Context context) {
        super(context);
        this.a = (byte) 14;
        this.b = new Paint(2);
    }

    public a81(zqc zqcVar, Context context) {
        super(context);
        this.a = (byte) 21;
        this.c = zqcVar;
    }

    public a81(o7c o7cVar, Context context) {
        super(context);
        this.a = (byte) 20;
        this.c = o7cVar;
        this.b = new Paint();
    }

    public a81(pqb pqbVar, Context context) {
        super(context);
        this.a = (byte) 19;
        this.c = pqbVar;
        this.b = new Paint(1);
    }

    public a81(o68 o68Var, Context context) {
        super(context);
        this.a = (byte) 16;
        this.b = new va6();
        this.c = new mm(250L, k43.f);
    }

    public a81(zu1 zu1Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.c = zu1Var;
        this.b = new RectF();
    }

    public a81(zu1 zu1Var, Context context, View view, vnb vnbVar) {
        super(context);
        this.a = (byte) 3;
        this.c = zu1Var;
        wk0 wk0Var = new wk0(view, this, vnbVar);
        this.b = wk0Var;
        wk0Var.p = false;
        wk0Var.n = true;
    }
}
