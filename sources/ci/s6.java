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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z20;
import org.telegram.ui.a00;
import org.telegram.ui.bo;
import org.telegram.ui.f91;
import org.telegram.ui.h71;
import org.telegram.ui.hf0;
import org.telegram.ui.hh1;
import org.telegram.ui.l70;
import org.telegram.ui.ss;
import org.telegram.ui.vz;
import org.telegram.ui.wd1;
import org.telegram.ui.wo;
import org.telegram.ui.zn;
public final class s6 extends View implements le.d {
    public final int f5512a;
    public final Object f5513b;
    public final Object f5514c;

    public s6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5512a = i10;
        this.f5514c = obj;
        this.f5513b = obj2;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f7);
    }

    public boolean a() {
        org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5513b;
        if (daVar.f23273t) {
            if ((daVar.f23266m == 1.0f || !daVar.f23269p) && daVar.f23267n && daVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.b) this.f5514c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5512a) {
            case 3:
                RectF rectF = (RectF) this.f5513b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                bo boVar = (bo) this.f5514c;
                int backgroundSizeY = boVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = boVar.P8(this);
                zn znVar = boVar.f32293ea;
                if (znVar != null) {
                    znVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), boVar.getThemedPaint("paintChatActionBackground"));
                zn znVar2 = boVar.f32293ea;
                if (znVar2 == null ? org.telegram.ui.ActionBar.i6.a1() : znVar2.p0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), boVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f5513b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        Bitmap[] bitmapArr;
        ?? r02;
        float f10;
        float f11;
        char c10;
        int themedColor;
        int i10;
        switch (this.f5512a) {
            case 0:
                Paint paint = (Paint) this.f5513b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                fg0 fg0Var = (fg0) this.f5514c;
                fg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                fg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5513b;
                fi.p pVar = (fi.p) this.f5514c;
                org.telegram.ui.Components.u9 u9Var = pVar.v;
                if (u9Var != null && u9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f5513b;
                org.telegram.ui.ld ldVar = (org.telegram.ui.ld) this.f5514c;
                ai.z5 z5Var = ldVar.e;
                if (z5Var != null && z5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ldVar.f35428r.getAlpha() * ldVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5513b;
                Paint paint4 = daVar.f23276x;
                org.telegram.ui.ActionBar.e6 e6Var = daVar.f23277y;
                Paint paint5 = daVar.f23275w;
                int i11 = daVar.f23258b;
                View view = daVar.f23259c;
                s6 s6Var = daVar.d;
                if (s6Var != null) {
                    if (s6Var.getMeasuredHeight() != 0 || s6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !daVar.f23273t && !daVar.f23269p) {
                            daVar.a();
                            daVar.f23265l = false;
                        }
                        Bitmap[] bitmapArr2 = daVar.f23261g;
                        if ((bitmapArr2 != null || daVar.f23268o) && daVar.f23269p) {
                            boolean z10 = daVar.f23267n;
                            if (z10) {
                                float f12 = daVar.f23266m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    daVar.f23266m = f13;
                                    if (f13 > 1.0f) {
                                        daVar.f23266m = 1.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = daVar.f23266m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    daVar.f23266m = f15;
                                    if (f15 < 0.0f) {
                                        daVar.f23266m = 0.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                        }
                        if (daVar.f23269p) {
                            f7 = daVar.f23266m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && daVar.f23268o) {
                            paint4.setAlpha((int) (50.0f * f7));
                            canvas.drawPaint(paint4);
                            return;
                        }
                        if (f7 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f10 = 0.0f;
                            f11 = 255.0f;
                            c10 = 0;
                        } else {
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f10 = 0.0f;
                            f11 = 255.0f;
                            c10 = 0;
                            canvas.saveLayerAlpha(0.0f, 0.0f, s6Var.getMeasuredWidth(), s6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * f11));
                            if (i11 == r02) {
                                canvas.translate(f10, daVar.f23274u);
                            }
                            canvas.save();
                            canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), s6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, daVar.f23274u);
                            }
                            canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), daVar.f23272s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            daVar.f23273t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (daVar.f23267n && !daVar.f23264k) {
                            if (daVar.f23261g == null || daVar.f23265l) {
                                daVar.f23264k = r02;
                                daVar.f23265l = false;
                                if (daVar.e == null) {
                                    daVar.e = new Bitmap[2];
                                    daVar.f23263j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (daVar.e[i12] != null && s6Var.getMeasuredWidth() == daVar.f23271r && s6Var.getMeasuredHeight() == daVar.f23270q) {
                                        daVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = s6Var.getMeasuredHeight();
                                        int measuredWidth = s6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        daVar.f23272s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            daVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            daVar.f23263j[i12] = new Canvas(daVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new ng(daVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        daVar.e[i12].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                                    }
                                    daVar.f23263j[i12].save();
                                    daVar.f23263j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (e6Var instanceof zn) {
                                            background = ((zn) e6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.i6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        daVar.f23263j[i12].translate(f10, -daVar.f23274u);
                                        view.draw(daVar.f23263j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(daVar.f23263j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(daVar.f23263j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    daVar.f23263j[i12].restore();
                                }
                                daVar.f23270q = s6Var.getMeasuredHeight();
                                daVar.f23271r = s6Var.getMeasuredWidth();
                                daVar.v.f23037b = s6Var.getMeasuredWidth();
                                daVar.v.f23038c = s6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ca caVar = daVar.v;
                                if (caVar.f23037b != 0 && caVar.f23038c != 0) {
                                    if (daVar.f23257a == null) {
                                        daVar.f23257a = new DispatchQueue("blur_thread_" + daVar);
                                    }
                                    daVar.f23257a.postRunnable(daVar.v);
                                    return;
                                }
                                daVar.f23264k = false;
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
                Paint paint6 = (Paint) this.f5513b;
                wo woVar = (wo) this.f5514c;
                ai.z5 z5Var2 = woVar.e;
                if (z5Var2 != null && z5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (woVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f5513b;
                z20 z20Var = (z20) this.f5514c;
                boolean z11 = z20Var.f30465y;
                if (z11) {
                    float f16 = z20Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        z20Var.E = f17;
                        if (f17 > 1.0f) {
                            z20Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(z20Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * z20Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = z20Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        z20Var.E = f19;
                        if (f19 < 0.0f) {
                            z20Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(z20Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * z20Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                v80 v80Var = (v80) this.f5514c;
                FrameLayout frameLayout = v80Var.f28655n;
                float[] fArr = v80Var.I;
                v80.a(frameLayout, (FrameLayout) this.f5513b, fArr);
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
                Paint paint8 = (Paint) this.f5513b;
                ss ssVar = (ss) this.f5514c;
                org.telegram.ui.Components.u9 u9Var2 = ssVar.e;
                if (u9Var2 != null && u9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (ssVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                a00 a00Var = (a00) this.f5514c;
                FrameLayout frameLayout2 = a00Var.f38648a;
                float[] fArr2 = a00Var.f38657y;
                vz.a(frameLayout2, (FrameLayout) this.f5513b, fArr2);
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
                Paint paint9 = (Paint) this.f5513b;
                l70 l70Var = (l70) this.f5514c;
                if (l70Var.d != null && l70Var.f35338n.getVisibility() == 0 && l70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (l70Var.f35338n.getAlpha() * l70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f5513b;
                hf0 hf0Var = (hf0) this.f5514c;
                org.telegram.ui.jd jdVar = hf0Var.f34248r;
                ai.z5 z5Var3 = hf0Var.e;
                if (z5Var3 != null && jdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (jdVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((h71) this.f5514c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f5513b));
                    return;
                }
            case 14:
                f91 f91Var = (f91) this.f5514c;
                int height = f91.g0(f91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5513b;
                paint11.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19110s8, f91.h0(f91Var)));
                f91Var.f33544b.J(canvas, 0.0f, rect, paint11, true);
                if (f91Var.getParentLayout() != null) {
                    ((ActionBarLayout) f91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                wd1 wd1Var = (wd1) this.f5514c;
                int currentItem = wd1Var.f38816j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5513b;
                int i13 = org.telegram.ui.ActionBar.i6.Ae;
                if (wd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.i6.C0(i13);
                } else {
                    themedColor = wd1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f5513b;
                paint13.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) hh1.s0((hh1) this.f5514c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5513b);
                rg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5514c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5512a) {
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
        switch (this.f5512a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5513b;
                s6 s6Var = daVar.d;
                if (daVar.f23261g != null && s6Var.getMeasuredHeight() != 0 && s6Var.getMeasuredWidth() != 0) {
                    daVar.a();
                    daVar.f23270q = s6Var.getMeasuredHeight();
                    daVar.f23271r = s6Var.getMeasuredWidth();
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
        switch (this.f5512a) {
            case 4:
                super.setAlpha(f7);
                View view = ((bo) this.f5514c).fragmentView;
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
                ((z20) this.f5514c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5512a) {
            case 6:
                super.setScaleX(f7);
                ((z20) this.f5514c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5512a) {
            case 6:
                super.setScaleY(f7);
                ((z20) this.f5514c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5512a) {
            case 6:
                super.setTranslationY(f7);
                ((z20) this.f5514c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5512a) {
            case 4:
                super.setVisibility(i10);
                View view = ((bo) this.f5514c).fragmentView;
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
        switch (this.f5512a) {
            case 0:
                if (drawable != ((fg0) this.f5514c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public s6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f5512a = 11;
        this.f5514c = new le.b(0, this, qr.h, 380L, true);
        this.f5513b = d5Var;
    }

    public s6(Activity activity) {
        super(activity);
        this.f5512a = 0;
        Paint paint = new Paint(1);
        this.f5513b = paint;
        fg0 fg0Var = new fg0(10);
        this.f5514c = fg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        fg0Var.setCallback(this);
        fg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public s6(fi.p pVar, Context context) {
        super(context);
        this.f5512a = 1;
        this.f5514c = pVar;
        this.f5513b = new Paint(1);
    }

    public s6(z20 z20Var, Context context) {
        super(context);
        this.f5512a = 6;
        this.f5514c = z20Var;
        this.f5513b = new Paint(1);
    }

    public s6(f91 f91Var, Context context) {
        super(context);
        this.f5512a = 14;
        this.f5514c = f91Var;
        this.f5513b = new Paint(1);
    }

    public s6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5512a = 17;
        this.f5513b = paint;
        this.f5514c = drawable;
    }

    public s6(hh1 hh1Var, Context context) {
        super(context);
        this.f5512a = 16;
        this.f5514c = hh1Var;
        this.f5513b = new Paint();
    }

    public s6(Context context, wd1 wd1Var) {
        super(context);
        this.f5512a = 15;
        this.f5514c = wd1Var;
        this.f5513b = new Paint(1);
    }

    public s6(bo boVar, Context context) {
        super(context);
        this.f5512a = 3;
        this.f5514c = boVar;
        this.f5513b = new RectF();
    }

    public s6(bo boVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5512a = 4;
        this.f5514c = boVar;
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(view, this, e6Var);
        this.f5513b = daVar;
        daVar.f23269p = false;
        daVar.f23267n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
