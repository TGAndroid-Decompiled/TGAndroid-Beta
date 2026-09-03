package fg;

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
import oh.a4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.y80;
import org.telegram.ui.af0;
import org.telegram.ui.f70;
import org.telegram.ui.jd1;
import org.telegram.ui.ld;
import org.telegram.ui.nd;
import org.telegram.ui.os;
import org.telegram.ui.po;
import org.telegram.ui.sz;
import org.telegram.ui.v81;
import org.telegram.ui.vg1;
import org.telegram.ui.vn;
import org.telegram.ui.w61;
import org.telegram.ui.xn;
import org.telegram.ui.xz;
public final class i0 extends View implements xd.b {
    public final int f6335a;
    public final Object f6336b;
    public final Object f6337c;

    public i0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f6335a = i10;
        this.f6337c = obj;
        this.f6336b = obj2;
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
        x9 x9Var = (x9) this.f6336b;
        if (x9Var.f32989t) {
            if ((x9Var.f32982m == 1.0f || !x9Var.f32985p) && x9Var.f32983n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z4, boolean z10) {
        ((xd.a) this.f6337c).a(z4, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6335a) {
            case 2:
                RectF rectF = (RectF) this.f6336b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                xn xnVar = (xn) this.f6337c;
                int backgroundSizeY = xnVar.U0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = xnVar.P8(this);
                vn vnVar = xnVar.f43114ba;
                if (vnVar != null) {
                    vnVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    k6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackground"));
                vn vnVar2 = xnVar.f43114ba;
                if (vnVar2 == null ? k6.a1() : vnVar2.o0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((f5) this.f6336b)).q(canvas, 0);
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
        switch (this.f6335a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f6336b);
                q1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), q1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f6337c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) this.f6336b;
                nd ndVar = (nd) this.f6337c;
                a4 a4Var = ndVar.f39304e;
                if (a4Var != null && a4Var.getImageReceiver().hasNotThumb()) {
                    paint.setAlpha((int) (ndVar.f39319r.getAlpha() * ndVar.f39304e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                x9 x9Var = (x9) this.f6336b;
                Paint paint2 = x9Var.f32992x;
                g6 g6Var = x9Var.f32993y;
                Paint paint3 = x9Var.f32991w;
                int i11 = x9Var.f32973b;
                View view = x9Var.f32974c;
                i0 i0Var = x9Var.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !x9Var.f32989t && !x9Var.f32985p) {
                            x9Var.a();
                            x9Var.f32981l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.f32977g;
                        if ((bitmapArr2 != null || x9Var.f32984o) && x9Var.f32985p) {
                            boolean z4 = x9Var.f32983n;
                            if (z4) {
                                float f13 = x9Var.f32982m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    x9Var.f32982m = f14;
                                    if (f14 > 1.0f) {
                                        x9Var.f32982m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z4) {
                                float f15 = x9Var.f32982m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    x9Var.f32982m = f16;
                                    if (f16 < 0.0f) {
                                        x9Var.f32982m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        if (x9Var.f32985p) {
                            f10 = x9Var.f32982m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && x9Var.f32984o) {
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
                                canvas.translate(f11, x9Var.f32990u);
                            }
                            canvas.save();
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f11, f11, paint3);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, x9Var.f32990u);
                            }
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), x9Var.f32988s / bitmapArr[c3].getHeight());
                            canvas.drawBitmap(bitmapArr[c3], f11, f11, paint3);
                            canvas.restore();
                            x9Var.f32989t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (x9Var.f32983n && !x9Var.f32980k) {
                            if (x9Var.f32977g == null || x9Var.f32981l) {
                                x9Var.f32980k = r02;
                                x9Var.f32981l = false;
                                if (x9Var.f32975e == null) {
                                    x9Var.f32975e = new Bitmap[2];
                                    x9Var.f32979j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (x9Var.f32975e[i12] != null && i0Var.getMeasuredWidth() == x9Var.f32987r && i0Var.getMeasuredHeight() == x9Var.f32986q) {
                                        x9Var.f32975e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight2 = i0Var.getMeasuredHeight();
                                        int measuredWidth2 = i0Var.getMeasuredWidth();
                                        int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        x9Var.f32988s = dp2;
                                        if (i12 == 0) {
                                            measuredHeight2 = dp2;
                                        }
                                        try {
                                            x9Var.f32975e[i12] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                            x9Var.f32979j[i12] = new Canvas(x9Var.f32975e[i12]);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                            AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        x9Var.f32975e[i12].eraseColor(k6.v0(k6.f21661d6, g6Var));
                                    }
                                    x9Var.f32979j[i12].save();
                                    x9Var.f32979j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (g6Var instanceof vn) {
                                            background = ((vn) g6Var).d();
                                        } else {
                                            background = k6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        x9Var.f32979j[i12].translate(f11, -x9Var.f32990u);
                                        view.draw(x9Var.f32979j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(x9Var.f32979j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(x9Var.f32979j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    x9Var.f32979j[i12].restore();
                                }
                                x9Var.f32986q = i0Var.getMeasuredHeight();
                                x9Var.f32987r = i0Var.getMeasuredWidth();
                                x9Var.v.f32690b = i0Var.getMeasuredWidth();
                                x9Var.v.f32691c = i0Var.getMeasuredHeight();
                                w9 w9Var = x9Var.v;
                                if (w9Var.f32690b != 0 && w9Var.f32691c != 0) {
                                    if (x9Var.f32972a == null) {
                                        x9Var.f32972a = new DispatchQueue("blur_thread_" + x9Var);
                                    }
                                    x9Var.f32972a.postRunnable(x9Var.v);
                                    return;
                                }
                                x9Var.f32980k = false;
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
                Paint paint4 = (Paint) this.f6336b;
                po poVar = (po) this.f6337c;
                a4 a4Var2 = poVar.f40063e;
                if (a4Var2 != null && a4Var2.getImageReceiver().hasNotThumb()) {
                    paint4.setAlpha((int) (poVar.f40063e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    return;
                }
                return;
            case 5:
                Paint paint5 = (Paint) this.f6336b;
                c30 c30Var = (c30) this.f6337c;
                boolean z10 = c30Var.f25759y;
                if (z10) {
                    float f17 = c30Var.B;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        c30Var.B = f18;
                        if (f18 > 1.0f) {
                            c30Var.B = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.a.d(c30Var.B, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * c30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                        return;
                    }
                }
                if (!z10) {
                    float f19 = c30Var.B;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        c30Var.B = f20;
                        if (f20 < 0.0f) {
                            c30Var.B = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.a.d(c30Var.B, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * c30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                return;
            case 6:
                canvas.drawColor(855638016);
                y80 y80Var = (y80) this.f6337c;
                FrameLayout frameLayout = y80Var.f33429n;
                float[] fArr = y80Var.F;
                y80.a(frameLayout, (FrameLayout) this.f6336b, fArr);
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
                Paint paint6 = (Paint) this.f6336b;
                os osVar = (os) this.f6337c;
                p9 p9Var = osVar.f39793e;
                if (p9Var != null && p9Var.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (osVar.f39793e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 8:
                canvas.drawColor(855638016);
                xz xzVar = (xz) this.f6337c;
                FrameLayout frameLayout2 = xzVar.f41332a;
                float[] fArr2 = xzVar.f41342y;
                sz.a(frameLayout2, (FrameLayout) this.f6336b, fArr2);
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
                Paint paint7 = (Paint) this.f6336b;
                f70 f70Var = (f70) this.f6337c;
                if (f70Var.d != null && f70Var.f36695n.getVisibility() == 0 && f70Var.d.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (f70Var.f36695n.getAlpha() * f70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 11:
                Paint paint8 = (Paint) this.f6336b;
                af0 af0Var = (af0) this.f6337c;
                ld ldVar = af0Var.f35163r;
                a4 a4Var3 = af0Var.f35160e;
                if (a4Var3 != null && ldVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (ldVar.getAlpha() * a4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 12:
                if (!((w61) this.f6337c).N0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(k6.v0(k6.G8, (g6) this.f6336b));
                    return;
                }
            case 13:
                v81 v81Var = (v81) this.f6337c;
                int height = v81.g0(v81Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint9 = (Paint) this.f6336b;
                paint9.setColor(k6.v0(k6.f21932s8, v81.h0(v81Var)));
                v81Var.f42045b.J(canvas, 0.0f, rect, paint9, true);
                if (v81Var.getParentLayout() != null) {
                    ((ActionBarLayout) v81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 14:
                jd1 jd1Var = (jd1) this.f6337c;
                int currentItem = jd1Var.f37983g0.getCurrentItem();
                Paint paint10 = (Paint) this.f6336b;
                int i13 = k6.Ae;
                if (jd1Var.d) {
                    themedColor = k6.C0(i13);
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
                Paint paint11 = (Paint) this.f6336b;
                paint11.setColor(k6.w0(null, k6.f21661d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint11);
                ((ActionBarLayout) vg1.s0((vg1) this.f6337c)).q(canvas, measuredHeight3);
                return;
            case 16:
                Paint paint12 = (Paint) this.f6336b;
                paint12.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint12);
                og0 og0Var = (og0) this.f6337c;
                og0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                og0Var.draw(canvas);
                canvas.restore();
                return;
            case 17:
                Paint paint13 = (Paint) this.f6336b;
                th.n nVar = (th.n) this.f6337c;
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
        switch (this.f6335a) {
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
        switch (this.f6335a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                x9 x9Var = (x9) this.f6336b;
                i0 i0Var = x9Var.d;
                if (x9Var.f32977g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.f32986q = i0Var.getMeasuredHeight();
                    x9Var.f32987r = i0Var.getMeasuredWidth();
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
        switch (this.f6335a) {
            case 3:
                super.setAlpha(f10);
                View view = ((xn) this.f6337c).fragmentView;
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
                ((c30) this.f6337c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f6335a) {
            case 5:
                super.setScaleX(f10);
                ((c30) this.f6337c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f6335a) {
            case 5:
                super.setScaleY(f10);
                ((c30) this.f6337c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f6335a) {
            case 5:
                super.setTranslationY(f10);
                ((c30) this.f6337c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f6335a) {
            case 3:
                super.setVisibility(i10);
                View view = ((xn) this.f6337c).fragmentView;
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
        switch (this.f6335a) {
            case 16:
                if (drawable != ((og0) this.f6337c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i0(Context context, f5 f5Var) {
        super(context);
        this.f6335a = 10;
        this.f6337c = new xd.a(0, this, pr.h, 380L, true);
        this.f6336b = f5Var;
    }

    public i0(Activity activity) {
        super(activity);
        this.f6335a = 16;
        Paint paint = new Paint(1);
        this.f6336b = paint;
        og0 og0Var = new og0(10);
        this.f6337c = og0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        og0Var.setCallback(this);
        og0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public i0(th.n nVar, Context context) {
        super(context);
        this.f6335a = 17;
        this.f6337c = nVar;
        this.f6336b = new Paint(1);
    }

    public i0(c30 c30Var, Context context) {
        super(context);
        this.f6335a = 5;
        this.f6337c = c30Var;
        this.f6336b = new Paint(1);
    }

    public i0(v81 v81Var, Context context) {
        super(context);
        this.f6335a = 13;
        this.f6337c = v81Var;
        this.f6336b = new Paint(1);
    }

    public i0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f6335a = 0;
        this.f6336b = paint;
        this.f6337c = drawable;
    }

    public i0(vg1 vg1Var, Context context) {
        super(context);
        this.f6335a = 15;
        this.f6337c = vg1Var;
        this.f6336b = new Paint();
    }

    public i0(Context context, jd1 jd1Var) {
        super(context);
        this.f6335a = 14;
        this.f6337c = jd1Var;
        this.f6336b = new Paint(1);
    }

    public i0(xn xnVar, Context context) {
        super(context);
        this.f6335a = 2;
        this.f6337c = xnVar;
        this.f6336b = new RectF();
    }

    public i0(xn xnVar, Context context, View view, g6 g6Var) {
        super(context);
        this.f6335a = 3;
        this.f6337c = xnVar;
        x9 x9Var = new x9(view, this, g6Var);
        this.f6336b = x9Var;
        x9Var.f32985p = false;
        x9Var.f32983n = true;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
