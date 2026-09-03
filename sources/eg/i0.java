package eg;

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
import nh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.x9;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.jd1;
import org.telegram.ui.nd;
import org.telegram.ui.pd;
import org.telegram.ui.ps;
import org.telegram.ui.ro;
import org.telegram.ui.tz;
import org.telegram.ui.w81;
import org.telegram.ui.wg1;
import org.telegram.ui.x61;
import org.telegram.ui.xn;
import org.telegram.ui.yz;
import org.telegram.ui.zn;
public final class i0 extends View implements xd.b {
    public final int f5289a;
    public final Object f5290b;
    public final Object f5291c;

    public i0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5289a = i10;
        this.f5291c = obj;
        this.f5290b = obj2;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (f10 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f10);
    }

    public boolean a() {
        x9 x9Var = (x9) this.f5290b;
        if (x9Var.f30561t) {
            if ((x9Var.f30554m == 1.0f || !x9Var.f30557p) && x9Var.f30555n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z4, boolean z10) {
        ((xd.a) this.f5291c).a(z4, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5289a) {
            case 2:
                RectF rectF = (RectF) this.f5290b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                zn znVar = (zn) this.f5291c;
                int backgroundSizeY = znVar.U0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = znVar.P8(this);
                xn xnVar = znVar.f40534ba;
                if (xnVar != null) {
                    xnVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackground"));
                xn xnVar2 = znVar.f40534ba;
                if (xnVar2 == null ? j6.a1() : xnVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((e5) this.f5290b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        Bitmap[] bitmapArr;
        ?? r02;
        float f11;
        float f12;
        char c3;
        int themedColor;
        int i10;
        switch (this.f5289a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f5290b);
                r1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), r1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5291c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) this.f5290b;
                pd pdVar = (pd) this.f5291c;
                y3 y3Var = pdVar.e;
                if (y3Var != null && y3Var.getImageReceiver().hasNotThumb()) {
                    paint.setAlpha((int) (pdVar.f37096r.getAlpha() * pdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                    return;
                }
                return;
            case 2:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                x9 x9Var = (x9) this.f5290b;
                Paint paint2 = x9Var.f30564x;
                f6 f6Var = x9Var.f30565y;
                Paint paint3 = x9Var.f30563w;
                int i11 = x9Var.f30546b;
                View view = x9Var.f30547c;
                i0 i0Var = x9Var.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !x9Var.f30561t && !x9Var.f30557p) {
                            x9Var.a();
                            x9Var.f30553l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.f30549g;
                        if ((bitmapArr2 != null || x9Var.f30556o) && x9Var.f30557p) {
                            boolean z4 = x9Var.f30555n;
                            if (z4) {
                                float f13 = x9Var.f30554m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    x9Var.f30554m = f14;
                                    if (f14 > 1.0f) {
                                        x9Var.f30554m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z4) {
                                float f15 = x9Var.f30554m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    x9Var.f30554m = f16;
                                    if (f16 < 0.0f) {
                                        x9Var.f30554m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        if (x9Var.f30557p) {
                            f10 = x9Var.f30554m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && x9Var.f30556o) {
                            paint2.setAlpha((int) (50.0f * f10));
                            canvas.drawPaint(paint2);
                            return;
                        }
                        if (f10 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c3 = 0;
                        } else {
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c3 = 0;
                            canvas.saveLayerAlpha(0.0f, 0.0f, i0Var.getMeasuredWidth(), i0Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint3.setAlpha((int) (f10 * f12));
                            if (i11 == r02) {
                                canvas.translate(f11, x9Var.f30562u);
                            }
                            canvas.save();
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f11, f11, paint3);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, x9Var.f30562u);
                            }
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), x9Var.f30560s / bitmapArr[c3].getHeight());
                            canvas.drawBitmap(bitmapArr[c3], f11, f11, paint3);
                            canvas.restore();
                            x9Var.f30561t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (x9Var.f30555n && !x9Var.f30552k) {
                            if (x9Var.f30549g == null || x9Var.f30553l) {
                                x9Var.f30552k = r02;
                                x9Var.f30553l = false;
                                if (x9Var.e == null) {
                                    x9Var.e = new Bitmap[2];
                                    x9Var.f30551j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (x9Var.e[i12] != null && i0Var.getMeasuredWidth() == x9Var.f30559r && i0Var.getMeasuredHeight() == x9Var.f30558q) {
                                        x9Var.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight2 = i0Var.getMeasuredHeight();
                                        int measuredWidth2 = i0Var.getMeasuredWidth();
                                        int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        x9Var.f30560s = dp2;
                                        if (i12 == 0) {
                                            measuredHeight2 = dp2;
                                        }
                                        try {
                                            x9Var.e[i12] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                            x9Var.f30551j[i12] = new Canvas(x9Var.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        x9Var.e[i12].eraseColor(j6.v0(j6.f19881d6, f6Var));
                                    }
                                    x9Var.f30551j[i12].save();
                                    x9Var.f30551j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof xn) {
                                            background = ((xn) f6Var).d();
                                        } else {
                                            background = j6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        x9Var.f30551j[i12].translate(f11, -x9Var.f30562u);
                                        view.draw(x9Var.f30551j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(x9Var.f30551j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(x9Var.f30551j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    x9Var.f30551j[i12].restore();
                                }
                                x9Var.f30558q = i0Var.getMeasuredHeight();
                                x9Var.f30559r = i0Var.getMeasuredWidth();
                                x9Var.v.f30186b = i0Var.getMeasuredWidth();
                                x9Var.v.f30187c = i0Var.getMeasuredHeight();
                                w9 w9Var = x9Var.v;
                                if (w9Var.f30186b != 0 && w9Var.f30187c != 0) {
                                    if (x9Var.f30545a == null) {
                                        x9Var.f30545a = new DispatchQueue("blur_thread_" + x9Var);
                                    }
                                    x9Var.f30545a.postRunnable(x9Var.v);
                                    return;
                                }
                                x9Var.f30552k = false;
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
                Paint paint4 = (Paint) this.f5290b;
                ro roVar = (ro) this.f5291c;
                y3 y3Var2 = roVar.e;
                if (y3Var2 != null && y3Var2.getImageReceiver().hasNotThumb()) {
                    paint4.setAlpha((int) (roVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    return;
                }
                return;
            case 5:
                Paint paint5 = (Paint) this.f5290b;
                b30 b30Var = (b30) this.f5291c;
                boolean z10 = b30Var.f23541y;
                if (z10) {
                    float f17 = b30Var.B;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        b30Var.B = f18;
                        if (f18 > 1.0f) {
                            b30Var.B = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.a.d(b30Var.B, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * b30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                        return;
                    }
                }
                if (!z10) {
                    float f19 = b30Var.B;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        b30Var.B = f20;
                        if (f20 < 0.0f) {
                            b30Var.B = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.a.d(b30Var.B, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * b30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                return;
            case 6:
                canvas.drawColor(855638016);
                x80 x80Var = (x80) this.f5291c;
                FrameLayout frameLayout = x80Var.f30537n;
                float[] fArr = x80Var.F;
                x80.a(frameLayout, (FrameLayout) this.f5290b, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 7:
                Paint paint6 = (Paint) this.f5290b;
                ps psVar = (ps) this.f5291c;
                p9 p9Var = psVar.e;
                if (p9Var != null && p9Var.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (psVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 8:
                canvas.drawColor(855638016);
                yz yzVar = (yz) this.f5291c;
                FrameLayout frameLayout2 = yzVar.f38614a;
                float[] fArr2 = yzVar.f38623y;
                tz.a(frameLayout2, (FrameLayout) this.f5290b, fArr2);
                canvas.save();
                float y11 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 9:
                Paint paint7 = (Paint) this.f5290b;
                g70 g70Var = (g70) this.f5291c;
                if (g70Var.d != null && g70Var.f34344n.getVisibility() == 0 && g70Var.d.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (g70Var.f34344n.getAlpha() * g70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 11:
                Paint paint8 = (Paint) this.f5290b;
                bf0 bf0Var = (bf0) this.f5291c;
                nd ndVar = bf0Var.f32868r;
                y3 y3Var3 = bf0Var.e;
                if (y3Var3 != null && ndVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (ndVar.getAlpha() * y3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 12:
                if (!((x61) this.f5291c).N0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(j6.v0(j6.G8, (f6) this.f5290b));
                    return;
                }
            case 13:
                w81 w81Var = (w81) this.f5291c;
                int height = w81.g0(w81Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint9 = (Paint) this.f5290b;
                paint9.setColor(j6.v0(j6.f20151s8, w81.h0(w81Var)));
                w81Var.f39310b.J(canvas, 0.0f, rect, paint9, true);
                if (w81Var.getParentLayout() != null) {
                    ((ActionBarLayout) w81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 14:
                jd1 jd1Var = (jd1) this.f5291c;
                int currentItem = jd1Var.f35200g0.getCurrentItem();
                Paint paint10 = (Paint) this.f5290b;
                int i13 = j6.Ae;
                if (jd1Var.d) {
                    themedColor = j6.C0(i13);
                } else {
                    themedColor = jd1Var.getThemedColor(i13);
                }
                paint10.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint10.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint10);
                }
                return;
            case 15:
                Paint paint11 = (Paint) this.f5290b;
                paint11.setColor(j6.w0(null, j6.f19881d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint11);
                ((ActionBarLayout) wg1.s0((wg1) this.f5291c)).q(canvas, measuredHeight3);
                return;
            case 16:
                Paint paint12 = (Paint) this.f5290b;
                paint12.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint12);
                ng0 ng0Var = (ng0) this.f5291c;
                ng0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                ng0Var.draw(canvas);
                canvas.restore();
                return;
            case 17:
                Paint paint13 = (Paint) this.f5290b;
                sh.n nVar = (sh.n) this.f5291c;
                p9 p9Var2 = nVar.v;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    paint13.setColor(1426063360);
                    paint13.setAlpha((int) (nVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint13);
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5289a) {
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5289a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                x9 x9Var = (x9) this.f5290b;
                i0 i0Var = x9Var.d;
                if (x9Var.f30549g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.f30558q = i0Var.getMeasuredHeight();
                    x9Var.f30559r = i0Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f5289a) {
            case 3:
                super.setAlpha(f10);
                View view = ((zn) this.f5291c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                super.setAlpha(f10);
                return;
            case 5:
                super.setAlpha(f10);
                ((b30) this.f5291c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f5289a) {
            case 5:
                super.setScaleX(f10);
                ((b30) this.f5291c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f5289a) {
            case 5:
                super.setScaleY(f10);
                ((b30) this.f5291c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f5289a) {
            case 5:
                super.setTranslationY(f10);
                ((b30) this.f5291c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5289a) {
            case 3:
                super.setVisibility(i10);
                View view = ((zn) this.f5291c).fragmentView;
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
        switch (this.f5289a) {
            case 16:
                if (drawable != ((ng0) this.f5291c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i0(Context context, e5 e5Var) {
        super(context);
        this.f5289a = 10;
        this.f5291c = new xd.a(0, this, mr.h, 380L, true);
        this.f5290b = e5Var;
    }

    public i0(Activity activity) {
        super(activity);
        this.f5289a = 16;
        Paint paint = new Paint(1);
        this.f5290b = paint;
        ng0 ng0Var = new ng0(10);
        this.f5291c = ng0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ng0Var.setCallback(this);
        ng0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public i0(sh.n nVar, Context context) {
        super(context);
        this.f5289a = 17;
        this.f5291c = nVar;
        this.f5290b = new Paint(1);
    }

    public i0(b30 b30Var, Context context) {
        super(context);
        this.f5289a = 5;
        this.f5291c = b30Var;
        this.f5290b = new Paint(1);
    }

    public i0(w81 w81Var, Context context) {
        super(context);
        this.f5289a = 13;
        this.f5291c = w81Var;
        this.f5290b = new Paint(1);
    }

    public i0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5289a = 0;
        this.f5290b = paint;
        this.f5291c = drawable;
    }

    public i0(wg1 wg1Var, Context context) {
        super(context);
        this.f5289a = 15;
        this.f5291c = wg1Var;
        this.f5290b = new Paint();
    }

    public i0(Context context, jd1 jd1Var) {
        super(context);
        this.f5289a = 14;
        this.f5291c = jd1Var;
        this.f5290b = new Paint(1);
    }

    public i0(zn znVar, Context context) {
        super(context);
        this.f5289a = 2;
        this.f5291c = znVar;
        this.f5290b = new RectF();
    }

    public i0(zn znVar, Context context, View view, f6 f6Var) {
        super(context);
        this.f5289a = 3;
        this.f5291c = znVar;
        x9 x9Var = new x9(view, this, f6Var);
        this.f5290b = x9Var;
        x9Var.f30557p = false;
        x9Var.f30555n = true;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
