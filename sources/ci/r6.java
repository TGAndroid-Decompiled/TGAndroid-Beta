package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.x90;
import org.telegram.ui.a00;
import org.telegram.ui.gf0;
import org.telegram.ui.i91;
import org.telegram.ui.ih1;
import org.telegram.ui.j70;
import org.telegram.ui.k71;
import org.telegram.ui.md;
import org.telegram.ui.qs;
import org.telegram.ui.uo;
import org.telegram.ui.vz;
import org.telegram.ui.xd1;
import org.telegram.ui.xn;
import org.telegram.ui.zn;
public final class r6 extends View implements me.d {
    public final int f5906a;
    public final Object f5907b;
    public final Object f5908c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5906a = i10;
        this.f5908c = obj;
        this.f5907b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.f5907b;
        if (iaVar.f27315t) {
            if ((iaVar.f27308m == 1.0f || !iaVar.f27311p) && iaVar.f27309n && iaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((me.b) this.f5908c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5906a) {
            case 3:
                RectF rectF = (RectF) this.f5907b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                zn znVar = (zn) this.f5908c;
                int backgroundSizeY = znVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = znVar.U8(this);
                xn xnVar = znVar.f44761ea;
                if (xnVar != null) {
                    xnVar.m(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackground"));
                xn xnVar2 = znVar.f44761ea;
                if (xnVar2 == null ? org.telegram.ui.ActionBar.i6.b1() : xnVar2.k0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f5907b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f7);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        Bitmap[] bitmapArr;
        ?? r16;
        float f10;
        ?? r02;
        int themedColor;
        int i10;
        switch (this.f5906a) {
            case 0:
                Paint paint = (Paint) this.f5907b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                hh0 hh0Var = (hh0) this.f5908c;
                hh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                hh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5907b;
                fi.p pVar = (fi.p) this.f5908c;
                org.telegram.ui.Components.y9 y9Var = pVar.v;
                if (y9Var != null && y9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f5907b;
                md mdVar = (md) this.f5908c;
                ai.z5 z5Var = mdVar.f39843e;
                if (z5Var != null && z5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.f39858r.getAlpha() * mdVar.f39843e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    return;
                }
                return;
            case 3:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.f5907b;
                Paint paint4 = iaVar.f27318x;
                org.telegram.ui.ActionBar.e6 e6Var = iaVar.f27319y;
                Paint paint5 = iaVar.f27317w;
                int i11 = iaVar.f27299b;
                View view = iaVar.f27300c;
                r6 r6Var = iaVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !iaVar.f27315t && !iaVar.f27311p) {
                            iaVar.a();
                            iaVar.f27307l = false;
                        }
                        Bitmap[] bitmapArr2 = iaVar.f27303g;
                        if ((bitmapArr2 != null || iaVar.f27310o) && iaVar.f27311p) {
                            boolean z10 = iaVar.f27309n;
                            if (z10) {
                                float f11 = iaVar.f27308m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    iaVar.f27308m = f12;
                                    if (f12 > 1.0f) {
                                        iaVar.f27308m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = iaVar.f27308m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    iaVar.f27308m = f14;
                                    if (f14 < 0.0f) {
                                        iaVar.f27308m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (iaVar.f27311p) {
                            f7 = iaVar.f27308m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && iaVar.f27310o) {
                            paint4.setAlpha((int) (50.0f * f7));
                            canvas.drawPaint(paint4);
                            return;
                        }
                        if (f7 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r16 = 0;
                            r02 = 1;
                            f10 = 0.0f;
                        } else {
                            bitmapArr = bitmapArr2;
                            r16 = 0;
                            f10 = 0.0f;
                            r02 = 1;
                            canvas.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, iaVar.f27316u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, iaVar.f27316u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), iaVar.f27314s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            iaVar.f27315t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (iaVar.f27309n && !iaVar.f27306k) {
                            if (iaVar.f27303g == null || iaVar.f27307l) {
                                iaVar.f27306k = r02;
                                iaVar.f27307l = r16;
                                if (iaVar.f27301e == null) {
                                    iaVar.f27301e = new Bitmap[2];
                                    iaVar.f27305j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (iaVar.f27301e[i12] != null && r6Var.getMeasuredWidth() == iaVar.f27313r && r6Var.getMeasuredHeight() == iaVar.f27312q) {
                                        iaVar.f27301e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        iaVar.f27314s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            iaVar.f27301e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            iaVar.f27305j[i12] = new Canvas(iaVar.f27301e[i12]);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            AndroidUtilities.runOnUIThread(new rg(iaVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        iaVar.f27301e[i12].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                                    }
                                    iaVar.f27305j[i12].save();
                                    iaVar.f27305j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (e6Var instanceof xn) {
                                            background = ((xn) e6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.i6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        iaVar.f27305j[i12].translate(f10, -iaVar.f27316u);
                                        view.draw(iaVar.f27305j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(iaVar.f27305j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(iaVar.f27305j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    iaVar.f27305j[i12].restore();
                                }
                                iaVar.f27312q = r6Var.getMeasuredHeight();
                                iaVar.f27313r = r6Var.getMeasuredWidth();
                                iaVar.v.f26996b = r6Var.getMeasuredWidth();
                                iaVar.v.f26997c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ha haVar = iaVar.v;
                                if (haVar.f26996b != 0 && haVar.f26997c != 0) {
                                    if (iaVar.f27298a == null) {
                                        iaVar.f27298a = new DispatchQueue("blur_thread_" + iaVar);
                                    }
                                    iaVar.f27298a.postRunnable(iaVar.v);
                                    return;
                                }
                                iaVar.f27306k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Paint paint6 = (Paint) this.f5907b;
                uo uoVar = (uo) this.f5908c;
                ai.z5 z5Var2 = uoVar.f42469e;
                if (z5Var2 != null && z5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (uoVar.f42469e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f5907b;
                q30 q30Var = (q30) this.f5908c;
                boolean z11 = q30Var.f30024y;
                if (z11) {
                    float f15 = q30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        q30Var.E = f16;
                        if (f16 > 1.0f) {
                            q30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(q30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * q30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = q30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        q30Var.E = f18;
                        if (f18 < 0.0f) {
                            q30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(q30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * q30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                x90 x90Var = (x90) this.f5908c;
                FrameLayout frameLayout = x90Var.f32785n;
                float[] fArr = x90Var.I;
                x90.a(frameLayout, (FrameLayout) this.f5907b, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 8:
                Paint paint8 = (Paint) this.f5907b;
                qs qsVar = (qs) this.f5908c;
                org.telegram.ui.Components.y9 y9Var2 = qsVar.f41173e;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (qsVar.f41173e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                a00 a00Var = (a00) this.f5908c;
                FrameLayout frameLayout2 = a00Var.f43010a;
                float[] fArr2 = a00Var.f43020y;
                vz.a(frameLayout2, (FrameLayout) this.f5907b, fArr2);
                canvas.save();
                float y10 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 10:
                Paint paint9 = (Paint) this.f5907b;
                j70 j70Var = (j70) this.f5908c;
                if (j70Var.d != null && j70Var.f38848n.getVisibility() == 0 && j70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (j70Var.f38848n.getAlpha() * j70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f5907b;
                gf0 gf0Var = (gf0) this.f5908c;
                org.telegram.ui.kd kdVar = gf0Var.f38004r;
                ai.z5 z5Var3 = gf0Var.f38001e;
                if (z5Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((k71) this.f5908c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f5907b));
                    return;
                }
            case 14:
                i91 i91Var = (i91) this.f5908c;
                int height = i91.g0(i91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5907b;
                paint11.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21075s8, i91.h0(i91Var)));
                i91Var.f38580b.J(canvas, 0.0f, rect, paint11, true);
                if (i91Var.getParentLayout() != null) {
                    ((ActionBarLayout) i91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                xd1 xd1Var = (xd1) this.f5908c;
                int currentItem = xd1Var.f43966j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5907b;
                int i13 = org.telegram.ui.ActionBar.i6.Ae;
                if (xd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.i6.D0(i13);
                } else {
                    themedColor = xd1Var.getThemedColor(i13);
                }
                paint12.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint12.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                }
                return;
            case 16:
                Paint paint13 = (Paint) this.f5907b;
                paint13.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) ih1.s0((ih1) this.f5908c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5907b);
                rg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5908c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5906a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5906a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.f5907b;
                r6 r6Var = iaVar.d;
                if (iaVar.f27303g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    iaVar.a();
                    iaVar.f27312q = r6Var.getMeasuredHeight();
                    iaVar.f27313r = r6Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f5906a) {
            case 4:
                super.setAlpha(f7);
                View view = ((zn) this.f5908c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 6:
                super.setAlpha(f7);
                ((q30) this.f5908c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5906a) {
            case 6:
                super.setScaleX(f7);
                ((q30) this.f5908c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5906a) {
            case 6:
                super.setScaleY(f7);
                ((q30) this.f5908c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5906a) {
            case 6:
                super.setTranslationY(f7);
                ((q30) this.f5908c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5906a) {
            case 4:
                super.setVisibility(i10);
                View view = ((zn) this.f5908c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5906a) {
            case 0:
                if (drawable != ((hh0) this.f5908c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f5906a = 11;
        this.f5908c = new me.b(0, this, hs.h, 380L, true);
        this.f5907b = d5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f5906a = 0;
        Paint paint = new Paint(1);
        this.f5907b = paint;
        hh0 hh0Var = new hh0(10);
        this.f5908c = hh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        hh0Var.setCallback(this);
        hh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(fi.p pVar, Context context) {
        super(context);
        this.f5906a = 1;
        this.f5908c = pVar;
        this.f5907b = new Paint(1);
    }

    public r6(q30 q30Var, Context context) {
        super(context);
        this.f5906a = 6;
        this.f5908c = q30Var;
        this.f5907b = new Paint(1);
    }

    public r6(i91 i91Var, Context context) {
        super(context);
        this.f5906a = 14;
        this.f5908c = i91Var;
        this.f5907b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5906a = 17;
        this.f5907b = paint;
        this.f5908c = drawable;
    }

    public r6(ih1 ih1Var, Context context) {
        super(context);
        this.f5906a = 16;
        this.f5908c = ih1Var;
        this.f5907b = new Paint();
    }

    public r6(Context context, xd1 xd1Var) {
        super(context);
        this.f5906a = 15;
        this.f5908c = xd1Var;
        this.f5907b = new Paint(1);
    }

    public r6(zn znVar, Context context) {
        super(context);
        this.f5906a = 3;
        this.f5908c = znVar;
        this.f5907b = new RectF();
    }

    public r6(zn znVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5906a = 4;
        this.f5908c = znVar;
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(view, this, e6Var);
        this.f5907b = iaVar;
        iaVar.f27311p = false;
        iaVar.f27309n = true;
    }

    @Override
    public void A(float f7, int i10) {
    }
}
