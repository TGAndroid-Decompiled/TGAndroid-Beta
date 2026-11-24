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
public final class a91 extends View implements g94 {
    public final byte a;
    public Object b;
    public Object c;

    public a91(Activity activity) {
        super(activity);
        this.a = (byte) 17;
        Paint paint = new Paint(1);
        this.b = paint;
        ae8 ae8Var = new ae8(10);
        this.c = ae8Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ae8Var.setCallback(this);
        ae8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        if (f > 0.0f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setAlpha(f);
    }

    public final boolean a() {
        vl0 vl0Var = (vl0) this.b;
        if (vl0Var.t) {
            if ((vl0Var.m == 1.0f || !vl0Var.p) && vl0Var.n && vl0Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
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
                yv1 yv1Var = (yv1) this.c;
                int backgroundSizeY = yv1Var.m1.getBackgroundSizeY();
                float x = getX();
                float m7 = yv1Var.m7(this);
                wv1 wv1Var = yv1Var.Ba;
                if (wv1Var != null) {
                    wv1Var.b(x, m7, measuredWidth, backgroundSizeY);
                } else {
                    cmb.q(x, m7, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), yv1Var.getThemedPaint("paintChatActionBackground"));
                wv1 wv1Var2 = yv1Var.Ba;
                if (wv1Var2 == null ? cmb.b1() : wv1Var2.g()) {
                    canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), yv1Var.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                c75 c75Var = (c75) this.c;
                v43 v43Var = c75Var.d0;
                float measuredWidth2 = (1.0f - v43Var.g) * c75Var.e0.getMeasuredWidth();
                canvas.save();
                fg0 fg0Var = (fg0) this.b;
                fg0Var.setBounds(0, 0, gm.L(50.0f) + ((int) ((c75Var.f0.getMeasuredWidth() * v43Var.g) + measuredWidth2)), getMeasuredHeight());
                fg0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((tk5) this.b)).o(canvas, 0);
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
                ((fg0) this.b).setState(getDrawableState());
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
                ((fg0) this.b).jumpToCurrentState();
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
        a91 a91Var;
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
                    canvas2.drawText(((String[]) this.b)[i2], (width / 2.0f) + (i2 * width) + paddingLeft, ((getMeasuredHeight() - gm.L(2.0f)) / 2.0f) + gm.L(5.0f), ((k91) this.c).f);
                    i2++;
                }
                return;
            case 1:
                Paint paint2 = (Paint) this.b;
                fj1 fj1Var = (fj1) this.c;
                kc0 kc0Var = fj1Var.f;
                if (kc0Var != null && kc0Var.getImageReceiver().E()) {
                    paint2.setAlpha((int) (fj1Var.s.getAlpha() * fj1Var.f.getImageReceiver().i1 * 85.0f));
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
                vl0 vl0Var = (vl0) this.b;
                Paint paint3 = vl0Var.x;
                ylb ylbVar = vl0Var.y;
                Paint paint4 = vl0Var.w;
                boolean z2 = vl0Var.b;
                View view2 = vl0Var.c;
                a91 a91Var2 = vl0Var.d;
                if (a91Var2 != null) {
                    if (a91Var2.getMeasuredHeight() != 0 || a91Var2.getMeasuredWidth() != 0) {
                        if (z2 && !vl0Var.t && !vl0Var.p) {
                            vl0Var.a();
                            vl0Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = vl0Var.g;
                        if ((bitmapArr2 != null || vl0Var.o) && vl0Var.p) {
                            boolean z3 = vl0Var.n;
                            float f2 = vl0Var.m;
                            if (z3) {
                                if (f2 != 1.0f) {
                                    float f3 = f2 + 0.09f;
                                    vl0Var.m = f3;
                                    if (f3 > 1.0f) {
                                        vl0Var.m = 1.0f;
                                    }
                                    a91Var2.invalidate();
                                }
                            } else if (f2 != 0.0f) {
                                float f4 = f2 - 0.09f;
                                vl0Var.m = f4;
                                if (f4 < 0.0f) {
                                    vl0Var.m = 0.0f;
                                }
                                a91Var2.invalidate();
                            }
                        }
                        if (vl0Var.p) {
                            f = vl0Var.m;
                        } else {
                            f = 1.0f;
                        }
                        if (bitmapArr2 == null && vl0Var.o) {
                            paint3.setAlpha((int) (f * 50.0f));
                            canvas2.drawPaint(paint3);
                            return;
                        }
                        if (f == 1.0f) {
                            canvas2.save();
                            paint = paint4;
                            z = z2;
                            view = view2;
                            a91Var = a91Var2;
                            bitmapArr = bitmapArr2;
                        } else {
                            view = view2;
                            paint = paint4;
                            bitmapArr = bitmapArr2;
                            a91Var = a91Var2;
                            z = z2;
                            canvas.saveLayerAlpha(0.0f, 0.0f, a91Var2.getMeasuredWidth(), a91Var2.getMeasuredHeight(), (int) (f * 255.0f), 31);
                            canvas2 = canvas;
                        }
                        if (bitmapArr != null) {
                            paint.setAlpha((int) (f * 255.0f));
                            if (z) {
                                canvas2.translate(0.0f, vl0Var.u);
                            }
                            canvas2.save();
                            canvas2.scale(a91Var.getMeasuredWidth() / bitmapArr[1].getWidth(), a91Var.getMeasuredHeight() / bitmapArr[1].getHeight());
                            canvas2.drawBitmap(bitmapArr[1], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            canvas2.save();
                            if (!z) {
                                canvas2.translate(0.0f, vl0Var.u);
                            }
                            canvas2.scale(a91Var.getMeasuredWidth() / bitmapArr[0].getWidth(), vl0Var.s / bitmapArr[0].getHeight());
                            canvas2.drawBitmap(bitmapArr[0], 0.0f, 0.0f, paint);
                            canvas2.restore();
                            vl0Var.t = true;
                            canvas2.drawColor(436207616);
                        }
                        canvas2.restore();
                        if (vl0Var.n && !vl0Var.k) {
                            if (vl0Var.g == null || vl0Var.l) {
                                vl0Var.k = true;
                                vl0Var.l = false;
                                if (vl0Var.e == null) {
                                    vl0Var.e = new Bitmap[2];
                                    vl0Var.j = new Canvas[2];
                                }
                                int i3 = 0;
                                while (i3 < 2) {
                                    if (vl0Var.e[i3] != null && a91Var.getMeasuredWidth() == vl0Var.r && a91Var.getMeasuredHeight() == vl0Var.q) {
                                        vl0Var.e[i3].eraseColor(0);
                                    } else {
                                        int measuredHeight = a91Var.getMeasuredHeight();
                                        int measuredWidth = a91Var.getMeasuredWidth();
                                        int L = gm.L(200.0f) + gm.m;
                                        vl0Var.s = L;
                                        if (i3 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            vl0Var.e[i3] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            vl0Var.j[i3] = new Canvas(vl0Var.e[i3]);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                            gm.c3(new f00(vl0Var, (byte) 11));
                                            return;
                                        }
                                    }
                                    if (i3 == 1) {
                                        vl0Var.e[i3].eraseColor(cmb.v0(cmb.c6, ylbVar));
                                    }
                                    vl0Var.j[i3].save();
                                    vl0Var.j[i3].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (ylbVar instanceof wv1) {
                                            background = ((wv1) ylbVar).l();
                                        } else {
                                            background = cmb.s0();
                                        }
                                    }
                                    View view3 = view;
                                    view3.setTag(67108867, Integer.valueOf(i3));
                                    if (i3 == 0) {
                                        vl0Var.j[i3].translate(0.0f, -vl0Var.u);
                                        view3.draw(vl0Var.j[i3]);
                                    }
                                    if (background != null && i3 == 1) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                        background.draw(vl0Var.j[i3]);
                                        background.setBounds(bounds);
                                        view3.draw(vl0Var.j[i3]);
                                    }
                                    view3.setTag(67108867, null);
                                    vl0Var.j[i3].restore();
                                    i3++;
                                    view = view3;
                                }
                                vl0Var.q = a91Var.getMeasuredHeight();
                                vl0Var.r = a91Var.getMeasuredWidth();
                                vl0Var.v.b = a91Var.getMeasuredWidth();
                                vl0Var.v.c = a91Var.getMeasuredHeight();
                                ul0 ul0Var = vl0Var.v;
                                if (ul0Var.b != 0 && ul0Var.c != 0) {
                                    np3 np3Var = vl0Var.a;
                                    if (np3Var == null) {
                                        np3Var = new np3("blur_thread_" + vl0Var, true);
                                        vl0Var.a = np3Var;
                                    }
                                    np3Var.postRunnable(vl0Var.v);
                                    return;
                                }
                                vl0Var.k = false;
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
                ba2 ba2Var = (ba2) this.c;
                kc0 kc0Var2 = ba2Var.e;
                if (kc0Var2 != null && kc0Var2.getImageReceiver().E()) {
                    paint5.setAlpha((int) (ba2Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    return;
                }
                return;
            case 5:
                Paint paint6 = (Paint) this.b;
                po2 po2Var = (po2) this.c;
                bf0 bf0Var = po2Var.x;
                if (bf0Var != null && bf0Var.getImageReceiver().E()) {
                    paint6.setColor(1426063360);
                    paint6.setAlpha((int) (po2Var.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), gm.L(20.0f), gm.L(20.0f), paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.b;
                tu2 tu2Var = (tu2) this.c;
                bf0 bf0Var2 = tu2Var.e;
                if (bf0Var2 != null && bf0Var2.getImageReceiver().E()) {
                    paint7.setAlpha((int) (tu2Var.e.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 7:
                canvas2.drawColor(855638016);
                ke4 ke4Var = (ke4) this.c;
                FrameLayout frameLayout = ke4Var.a;
                float[] fArr = ke4Var.E;
                fe4.a(frameLayout, (FrameLayout) this.b, fArr);
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
                oa5 oa5Var = (oa5) this.c;
                boolean z4 = oa5Var.F;
                float f5 = oa5Var.G;
                if (z4) {
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.064f;
                        oa5Var.G = f6;
                        if (f6 > 1.0f) {
                            oa5Var.G = 1.0f;
                        }
                        invalidate();
                    }
                } else if (f5 != 0.0f) {
                    float f7 = f5 - 0.064f;
                    oa5Var.G = f7;
                    if (f7 < 0.0f) {
                        oa5Var.G = 0.0f;
                    }
                    invalidate();
                }
                paint8.setColor(on2.f(oa5Var.G, 1711607061, 1714752530));
                canvas2.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - gm.L(25.0f), (gm.L(5.0f) * oa5Var.G) + gm.L(35.0f), paint8);
                return;
            case 10:
                Paint paint9 = (Paint) this.b;
                uc5 uc5Var = (uc5) this.c;
                if (uc5Var.d != null && uc5Var.n.getVisibility() == 0 && uc5Var.d.getImageReceiver().E()) {
                    paint9.setAlpha((int) (uc5Var.n.getAlpha() * uc5Var.d.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                canvas2.drawCircle(measuredWidth2, measuredHeight2, getMeasuredWidth() / 2.0f, (Paint) this.b);
                oj8.d().f(-gm.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas2.drawCircle(measuredWidth2, measuredHeight2, (getMeasuredWidth() / 2.0f) - gm.L(2.0f), oj8.d().e());
                float L2 = gm.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight2 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight2 + L2));
                drawable.draw(canvas2);
                return;
            case 13:
                canvas2.drawColor(855638016);
                f56 f56Var = (f56) this.c;
                FrameLayout frameLayout2 = f56Var.n;
                float[] fArr2 = f56Var.J;
                f56.a(frameLayout2, (FrameLayout) this.b, fArr2);
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
                    canvas2.translate(b10.b(((Bitmap) this.c).getWidth(), max, width2, 2.0f), b10.b(((Bitmap) this.c).getHeight(), max, height, 2.0f));
                    canvas2.scale(max, max);
                    canvas2.drawBitmap((Bitmap) this.c, 0.0f, 0.0f, (Paint) this.b);
                    canvas2.restore();
                    return;
                }
                return;
            case 15:
                Paint paint10 = (Paint) this.b;
                zf6 zf6Var = (zf6) this.c;
                dj1 dj1Var = zf6Var.r;
                kc0 kc0Var3 = zf6Var.e;
                if (kc0Var3 != null && dj1Var.getVisibility() == 0) {
                    paint10.setAlpha((int) (dj1Var.getAlpha() * kc0Var3.getImageReceiver().i1 * 85.0f));
                    canvas2.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 16:
                qa6 qa6Var = (qa6) this.b;
                super.onDraw(canvas);
                ln lnVar = (ln) this.c;
                lnVar.a = this;
                lnVar.e(false, 0.0f);
                float f8 = lnVar.c;
                if (f8 != 0.0f) {
                    if (f8 != 1.0f) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (lnVar.c * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    qa6Var.e(rectF);
                    qa6Var.j(24.0f);
                    qa6Var.g(on2.p(-1, 20), on2.p(-1, 50), on2.p(-1, 50), on2.p(-1, 70));
                    qa6Var.draw(canvas2);
                    invalidate();
                    canvas2.restore();
                    return;
                }
                return;
            case 17:
                Paint paint11 = (Paint) this.b;
                paint11.setStrokeWidth(gm.N(1.66f));
                canvas2.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gm.L(10.0f), paint11);
                ae8 ae8Var = (ae8) this.c;
                ae8Var.setBounds(0, 0, gm.L(10.0f), gm.L(10.0f));
                canvas2.save();
                canvas2.translate((getWidth() - gm.L(10.0f)) / 2.0f, (getHeight() - gm.L(10.0f)) / 2.0f);
                ae8Var.draw(canvas2);
                canvas2.restore();
                return;
            case 18:
                if (!((vz9) this.c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas2.drawColor(cmb.v0(cmb.F8, (ylb) this.b));
                    return;
                }
            case 19:
                rob robVar = (rob) this.c;
                int currentItem = robVar.l0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i4 = cmb.rf;
                if (robVar.d) {
                    themedColor = cmb.D0(i4);
                } else {
                    themedColor = robVar.getThemedColor(i4);
                }
                paint12.setColor(themedColor);
                while (i2 < 2) {
                    if (i2 == currentItem) {
                        i = 255;
                    } else {
                        i = 127;
                    }
                    paint12.setAlpha(i);
                    canvas2.drawCircle(gm.L((i2 * 15) + 3), gm.L(4.0f), gm.L(3.0f), paint12);
                    i2++;
                }
                return;
            case 20:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(cmb.w0(null, cmb.c6, false));
                int measuredHeight3 = getMeasuredHeight() - gm.L(3.0f);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                ((ActionBarLayout) p5c.j0((p5c) this.c)).o(canvas2, measuredHeight3);
                return;
            case 21:
                super.onDraw(canvas);
                int save = canvas2.save();
                canvas2.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                ioc iocVar = ((moc) this.c).b;
                float[] fArr3 = (float[]) this.b;
                if (iocVar != null) {
                    iocVar.e(canvas2, fArr3);
                } else {
                    canvas2.drawColor(bqc.a(-16216082, fArr3));
                }
                canvas2.restoreToCount(save);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
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
                vl0 vl0Var = (vl0) this.b;
                a91 a91Var = vl0Var.d;
                if (vl0Var.g != null && a91Var.getMeasuredHeight() != 0 && a91Var.getMeasuredWidth() != 0) {
                    vl0Var.a();
                    vl0Var.q = a91Var.getMeasuredHeight();
                    vl0Var.r = a91Var.getMeasuredWidth();
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
                View view = ((yv1) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f);
                ((oa5) this.c).d.setAlpha(f);
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
                ((oa5) this.c).d.setScaleX(f);
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
                ((oa5) this.c).d.setScaleY(f);
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
                ((oa5) this.c).d.setTranslationY(f);
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
                View view = ((yv1) this.c).fragmentView;
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
                if (((fg0) this.b) == drawable || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            case 17:
                if (drawable == ((ae8) this.c) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override
    public final void V(float f, int i) {
    }

    public a91(Context context, tk5 tk5Var) {
        super(context);
        this.a = (byte) 11;
        this.c = new fn0(0, this, d53.h, 380L, true);
        this.b = tk5Var;
    }

    public a91(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public a91(po2 po2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = po2Var;
        this.b = new Paint(1);
    }

    public a91(oa5 oa5Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = oa5Var;
        this.b = new Paint(1);
    }

    public a91(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = (byte) 12;
        this.b = paint;
        this.c = drawable;
    }

    public a91(Context context) {
        super(context);
        this.a = (byte) 14;
        this.b = new Paint(2);
    }

    public a91(moc mocVar, Context context) {
        super(context);
        this.a = (byte) 21;
        this.c = mocVar;
    }

    public a91(p5c p5cVar, Context context) {
        super(context);
        this.a = (byte) 20;
        this.c = p5cVar;
        this.b = new Paint();
    }

    public a91(rob robVar, Context context) {
        super(context);
        this.a = (byte) 19;
        this.c = robVar;
        this.b = new Paint(1);
    }

    public a91(a58 a58Var, Context context) {
        super(context);
        this.a = (byte) 16;
        this.b = new qa6();
        this.c = new ln(250L, d53.f);
    }

    public a91(yv1 yv1Var, Context context) {
        super(context);
        this.a = (byte) 2;
        this.c = yv1Var;
        this.b = new RectF();
    }

    public a91(yv1 yv1Var, Context context, View view, ylb ylbVar) {
        super(context);
        this.a = (byte) 3;
        this.c = yv1Var;
        vl0 vl0Var = new vl0(view, this, ylbVar);
        this.b = vl0Var;
        vl0Var.p = false;
        vl0Var.n = true;
    }
}
