package defpackage;

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
public final class s71 extends View implements x74 {
    public final byte a;
    public Object b;
    public Object c;

    public s71(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 17:
                super(context);
                Paint paint = new Paint(1);
                this.b = paint;
                xb8 xb8Var = new xb8(10);
                this.c = xb8Var;
                paint.setColor(-1);
                paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
                paint.setStyle(Paint.Style.STROKE);
                xb8Var.setCallback(this);
                xb8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                return;
            default:
                this.b = new Paint(2);
                return;
        }
    }

    public final boolean a() {
        vk0 vk0Var = (vk0) this.b;
        if (vk0Var.t) {
            if ((vk0Var.m == 1.0f || !vk0Var.p) && vk0Var.n && vk0Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
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
                mu1 mu1Var = (mu1) this.c;
                int backgroundSizeY = mu1Var.m1.getBackgroundSizeY();
                float x = getX();
                float c7 = mu1Var.c7(this);
                ku1 ku1Var = mu1Var.Ba;
                if (ku1Var != null) {
                    ku1Var.b(x, c7, measuredWidth, backgroundSizeY);
                } else {
                    bkb.q(x, c7, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), mu1Var.getThemedPaint("paintChatActionBackground"));
                ku1 ku1Var2 = mu1Var.Ba;
                if (ku1Var2 == null ? bkb.b1() : ku1Var2.g()) {
                    canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), mu1Var.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                e55 e55Var = (e55) this.c;
                k33 k33Var = e55Var.d0;
                float measuredWidth2 = (1.0f - k33Var.g) * e55Var.e0.getMeasuredWidth();
                canvas.save();
                ff0 ff0Var = (ff0) this.b;
                ff0Var.setBounds(0, 0, gl.L(50.0f) + ((int) ((e55Var.f0.getMeasuredWidth() * k33Var.g) + measuredWidth2)), getMeasuredHeight());
                ff0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((ui5) this.b)).o(canvas, 0);
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
                ((ff0) this.b).setState(getDrawableState());
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
                ((ff0) this.b).jumpToCurrentState();
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
        s71 s71Var;
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
                    canvas2.drawText(((String[]) this.b)[i2], (width / 2.0f) + (i2 * width) + paddingLeft, ((getMeasuredHeight() - gl.L(2.0f)) / 2.0f) + gl.L(5.0f), ((b81) this.c).f);
                    i2++;
                }
                return;
            case 1:
                Paint paint2 = (Paint) this.b;
                yh1 yh1Var = (yh1) this.c;
                kb0 kb0Var = yh1Var.f;
                if (kb0Var != null && kb0Var.getImageReceiver().E()) {
                    paint2.setAlpha((int) (yh1Var.s.getAlpha() * yh1Var.f.getImageReceiver().i1 * 85.0f));
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
                vk0 vk0Var = (vk0) this.b;
                Paint paint3 = vk0Var.x;
                wjb wjbVar = vk0Var.y;
                Paint paint4 = vk0Var.w;
                boolean z2 = vk0Var.b;
                View view2 = vk0Var.c;
                s71 s71Var2 = vk0Var.d;
                if (s71Var2 != null) {
                    if (s71Var2.getMeasuredHeight() != 0 || s71Var2.getMeasuredWidth() != 0) {
                        if (z2 && !vk0Var.t && !vk0Var.p) {
                            vk0Var.a();
                            vk0Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = vk0Var.g;
                        if ((bitmapArr2 != null || vk0Var.o) && vk0Var.p) {
                            boolean z3 = vk0Var.n;
                            float f2 = vk0Var.m;
                            if (z3) {
                                if (f2 != 1.0f) {
                                    float f3 = f2 + 0.09f;
                                    vk0Var.m = f3;
                                    if (f3 > 1.0f) {
                                        vk0Var.m = 1.0f;
                                    }
                                    s71Var2.invalidate();
                                }
                            } else if (f2 != 0.0f) {
                                float f4 = f2 - 0.09f;
                                vk0Var.m = f4;
                                if (f4 < 0.0f) {
                                    vk0Var.m = 0.0f;
                                }
                                s71Var2.invalidate();
                            }
                        }
                        if (vk0Var.p) {
                            f = vk0Var.m;
                        } else {
                            f = 1.0f;
                        }
                        if (bitmapArr2 == null && vk0Var.o) {
                            paint3.setAlpha((int) (f * 50.0f));
                            canvas2.drawPaint(paint3);
                            return;
                        }
                        if (f == 1.0f) {
                            canvas2.save();
                            paint = paint4;
                            z = z2;
                            view = view2;
                            s71Var = s71Var2;
                            bitmapArr = bitmapArr2;
                        } else {
                            view = view2;
                            paint = paint4;
                            bitmapArr = bitmapArr2;
                            s71Var = s71Var2;
                            z = z2;
                            canvas.saveLayerAlpha(0.0f, 0.0f, s71Var2.getMeasuredWidth(), s71Var2.getMeasuredHeight(), (int) (f * 255.0f), 31);
                            canvas2 = canvas;
                        }
                        if (bitmapArr != null) {
                            paint.setAlpha((int) (f * 255.0f));
                            if (z) {
                                canvas2.translate(0.0f, vk0Var.u);
                            }
                            canvas2.save();
                            canvas2.scale(s71Var.getMeasuredWidth() / bitmapArr[1].getWidth(), s71Var.getMeasuredHeight() / bitmapArr[1].getHeight());
                            canvas2.drawBitmap(bitmapArr[1], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            canvas2.save();
                            if (!z) {
                                canvas2.translate(0.0f, vk0Var.u);
                            }
                            canvas2.scale(s71Var.getMeasuredWidth() / bitmapArr[0].getWidth(), vk0Var.s / bitmapArr[0].getHeight());
                            canvas2.drawBitmap(bitmapArr[0], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            vk0Var.t = true;
                            canvas2.drawColor(436207616);
                        }
                        canvas2.restore();
                        if (vk0Var.n && !vk0Var.k) {
                            if (vk0Var.g == null || vk0Var.l) {
                                vk0Var.k = true;
                                vk0Var.l = false;
                                if (vk0Var.e == null) {
                                    vk0Var.e = new Bitmap[2];
                                    vk0Var.j = new Canvas[2];
                                }
                                int i3 = 0;
                                while (i3 < 2) {
                                    if (vk0Var.e[i3] != null && s71Var.getMeasuredWidth() == vk0Var.r && s71Var.getMeasuredHeight() == vk0Var.q) {
                                        vk0Var.e[i3].eraseColor(0);
                                    } else {
                                        int measuredHeight = s71Var.getMeasuredHeight();
                                        int measuredWidth = s71Var.getMeasuredWidth();
                                        int L = gl.L(200.0f) + gl.m;
                                        vk0Var.s = L;
                                        if (i3 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            vk0Var.e[i3] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            vk0Var.j[i3] = new Canvas(vk0Var.e[i3]);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                            gl.d3(new oz(vk0Var, (byte) 9));
                                            return;
                                        }
                                    }
                                    if (i3 == 1) {
                                        vk0Var.e[i3].eraseColor(bkb.v0(bkb.c6, wjbVar));
                                    }
                                    vk0Var.j[i3].save();
                                    vk0Var.j[i3].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (wjbVar instanceof ku1) {
                                            background = ((ku1) wjbVar).l();
                                        } else {
                                            background = bkb.s0();
                                        }
                                    }
                                    View view3 = view;
                                    view3.setTag(67108867, Integer.valueOf(i3));
                                    if (i3 == 0) {
                                        vk0Var.j[i3].translate(0.0f, -vk0Var.u);
                                        view3.draw(vk0Var.j[i3]);
                                    }
                                    if (background != null && i3 == 1) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                        background.draw(vk0Var.j[i3]);
                                        background.setBounds(bounds);
                                        view3.draw(vk0Var.j[i3]);
                                    }
                                    view3.setTag(67108867, null);
                                    vk0Var.j[i3].restore();
                                    i3++;
                                    view = view3;
                                }
                                vk0Var.q = s71Var.getMeasuredHeight();
                                vk0Var.r = s71Var.getMeasuredWidth();
                                vk0Var.v.b = s71Var.getMeasuredWidth();
                                vk0Var.v.c = s71Var.getMeasuredHeight();
                                uk0 uk0Var = vk0Var.v;
                                if (uk0Var.b != 0 && uk0Var.c != 0) {
                                    do3 do3Var = vk0Var.a;
                                    if (do3Var == null) {
                                        do3Var = new do3("blur_thread_" + vk0Var, true);
                                        vk0Var.a = do3Var;
                                    }
                                    do3Var.postRunnable(vk0Var.v);
                                    return;
                                }
                                vk0Var.k = false;
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
                p82 p82Var = (p82) this.c;
                kb0 kb0Var2 = p82Var.e;
                if (kb0Var2 != null && kb0Var2.getImageReceiver().E()) {
                    paint5.setAlpha((int) (p82Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    return;
                }
                return;
            case 5:
                Paint paint6 = (Paint) this.b;
                en2 en2Var = (en2) this.c;
                be0 be0Var = en2Var.x;
                if (be0Var != null && be0Var.getImageReceiver().E()) {
                    paint6.setColor(1426063360);
                    paint6.setAlpha((int) (en2Var.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), gl.L(20.0f), gl.L(20.0f), paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.b;
                it2 it2Var = (it2) this.c;
                be0 be0Var2 = it2Var.e;
                if (be0Var2 != null && be0Var2.getImageReceiver().E()) {
                    paint7.setAlpha((int) (it2Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 7:
                canvas2.drawColor(855638016);
                kc4 kc4Var = (kc4) this.c;
                FrameLayout frameLayout = kc4Var.a;
                float[] fArr = kc4Var.E;
                fc4.a(frameLayout, (FrameLayout) this.b, fArr);
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
                o85 o85Var = (o85) this.c;
                boolean z4 = o85Var.F;
                float f5 = o85Var.G;
                if (z4) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.064f;
                        o85Var.G = f6;
                        if (f6 > 1.0f) {
                            o85Var.G = 1.0f;
                        }
                        invalidate();
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.064f;
                    o85Var.G = f7;
                    if (f7 < 0.0f) {
                        o85Var.G = 0.0f;
                    }
                    invalidate();
                }
                paint8.setColor(bm2.f(o85Var.G, 1711607061, 1714752530));
                canvas2.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - gl.L(25.0f), (gl.L(5.0f) * o85Var.G) + gl.L(35.0f), paint8);
                return;
            case 10:
                Paint paint9 = (Paint) this.b;
                wa5 wa5Var = (wa5) this.c;
                if (wa5Var.d != null && wa5Var.n.getVisibility() == 0 && wa5Var.d.getImageReceiver().E()) {
                    paint9.setAlpha((int) (wa5Var.n.getAlpha() * wa5Var.d.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                canvas2.drawCircle(measuredWidth2, measuredHeight2, getMeasuredWidth() / 2.0f, (Paint) this.b);
                nh8.d().f(-gl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas2.drawCircle(measuredWidth2, measuredHeight2, (getMeasuredWidth() / 2.0f) - gl.L(2.0f), nh8.d().e());
                float L2 = gl.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight2 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight2 + L2));
                drawable.draw(canvas2);
                return;
            case 13:
                canvas2.drawColor(855638016);
                f36 f36Var = (f36) this.c;
                FrameLayout frameLayout2 = f36Var.n;
                float[] fArr2 = f36Var.J;
                f36.a(frameLayout2, (FrameLayout) this.b, fArr2);
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
                    canvas2.translate(b00.b(((Bitmap) this.c).getWidth(), max, width2, 2.0f), b00.b(((Bitmap) this.c).getHeight(), max, height, 2.0f));
                    canvas2.scale(max, max);
                    canvas2.drawBitmap((Bitmap) this.c, 0.0f, 0.0f, (Paint) this.b);
                    canvas2.restore();
                    return;
                }
                return;
            case 15:
                Paint paint10 = (Paint) this.b;
                ae6 ae6Var = (ae6) this.c;
                wh1 wh1Var = ae6Var.r;
                kb0 kb0Var3 = ae6Var.e;
                if (kb0Var3 != null && wh1Var.getVisibility() == 0) {
                    paint10.setAlpha((int) (wh1Var.getAlpha() * kb0Var3.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 16:
                r86 r86Var = (r86) this.b;
                super.onDraw(canvas);
                lm lmVar = (lm) this.c;
                lmVar.a = this;
                lmVar.e(false, 0.0f);
                float f8 = lmVar.c;
                if (f8 != 0.0f) {
                    if (f8 != 1.0f) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (lmVar.c * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    r86Var.e(rectF);
                    r86Var.j(24.0f);
                    r86Var.g(bm2.o(-1, 20), bm2.o(-1, 50), bm2.o(-1, 50), bm2.o(-1, 70));
                    r86Var.draw(canvas2);
                    invalidate();
                    canvas2.restore();
                    return;
                }
                return;
            case 17:
                Paint paint11 = (Paint) this.b;
                paint11.setStrokeWidth(gl.N(1.66f));
                canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(10.0f), paint11);
                xb8 xb8Var = (xb8) this.c;
                xb8Var.setBounds(0, 0, gl.L(10.0f), gl.L(10.0f));
                canvas2.save();
                canvas2.translate((getWidth() - gl.L(10.0f)) / 2.0f, (getHeight() - gl.L(10.0f)) / 2.0f);
                xb8Var.draw(canvas2);
                canvas2.restore();
                return;
            case 18:
                if (!((tx9) this.c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas2.drawColor(bkb.v0(bkb.F8, (wjb) this.b));
                    return;
                }
            case 19:
                qmb qmbVar = (qmb) this.c;
                int currentItem = qmbVar.l0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i4 = bkb.rf;
                if (qmbVar.d) {
                    themedColor = bkb.D0(i4);
                } else {
                    themedColor = qmbVar.getThemedColor(i4);
                }
                paint12.setColor(themedColor);
                while (i2 < 2) {
                    if (i2 == currentItem) {
                        i = 255;
                    } else {
                        i = 127;
                    }
                    paint12.setAlpha(i);
                    canvas2.drawCircle(gl.L((i2 * 15) + 3), gl.L(4.0f), gl.L(3.0f), paint12);
                    i2++;
                }
                return;
            case 20:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(bkb.w0(null, bkb.c6, false));
                int measuredHeight3 = getMeasuredHeight() - gl.L(3.0f);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                ((ActionBarLayout) p3c.i0((p3c) this.c)).o(canvas2, measuredHeight3);
                return;
            case 21:
                super.onDraw(canvas);
                int save = canvas2.save();
                canvas2.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                jmc jmcVar = ((mmc) this.c).b;
                float[] fArr3 = (float[]) this.b;
                if (jmcVar != null) {
                    jmcVar.e(canvas2, fArr3);
                } else {
                    canvas2.drawColor(znc.a(-16216082, fArr3));
                }
                canvas2.restoreToCount(save);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
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
                vk0 vk0Var = (vk0) this.b;
                s71 s71Var = vk0Var.d;
                if (vk0Var.g != null && s71Var.getMeasuredHeight() != 0 && s71Var.getMeasuredWidth() != 0) {
                    vk0Var.a();
                    vk0Var.q = s71Var.getMeasuredHeight();
                    vk0Var.r = s71Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
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
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                View view = ((mu1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f);
                ((o85) this.c).d.setAlpha(f);
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
                ((o85) this.c).d.setScaleX(f);
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
                ((o85) this.c).d.setScaleY(f);
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
                ((o85) this.c).d.setTranslationY(f);
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
                View view = ((mu1) this.c).fragmentView;
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
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 9:
                if (((ff0) this.b) == drawable || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 17:
                if (drawable == ((xb8) this.c) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override
    public final void D(float f, int i) {
    }

    public s71(Context context, ui5 ui5Var) {
        super(context);
        this.a = (byte) 11;
        this.c = new fm0(0, this, s33.h, 380L, true);
        this.b = ui5Var;
    }

    public s71(en2 en2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = en2Var;
        this.b = new Paint(1);
    }

    public s71(o85 o85Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = o85Var;
        this.b = new Paint(1);
    }

    public s71(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = (byte) 12;
        this.b = paint;
        this.c = drawable;
    }

    public s71(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public s71(mmc mmcVar, Context context) {
        super(context);
        this.a = (byte) 21;
        this.c = mmcVar;
    }

    public s71(p3c p3cVar, Context context) {
        super(context);
        this.a = (byte) 20;
        this.c = p3cVar;
        this.b = new Paint();
    }

    public s71(qmb qmbVar, Context context) {
        super(context);
        this.a = (byte) 19;
        this.c = qmbVar;
        this.b = new Paint(1);
    }

    public s71(y28 y28Var, Context context) {
        super(context);
        this.a = (byte) 16;
        this.b = new r86();
        this.c = new lm(250L, s33.f);
    }

    public s71(mu1 mu1Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.c = mu1Var;
        this.b = new RectF();
    }

    public s71(mu1 mu1Var, Context context, View view, wjb wjbVar) {
        super(context);
        this.a = (byte) 3;
        this.c = mu1Var;
        vk0 vk0Var = new vk0(view, this, wjbVar);
        this.b = vk0Var;
        vk0Var.p = false;
        vk0Var.n = true;
    }
}
