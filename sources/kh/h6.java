package kh;

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
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.ag1;
import org.telegram.ui.b61;
import org.telegram.ui.ez;
import org.telegram.ui.gd;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.is;
import org.telegram.ui.jz;
import org.telegram.ui.oc1;
import org.telegram.ui.on;
import org.telegram.ui.qe0;
import org.telegram.ui.qn;
import org.telegram.ui.r60;
import org.telegram.ui.z71;
public final class h6 extends View implements td.b {
    public final int f15396a;
    public final Object f15397b;
    public final Object f15398c;

    public h6(Object obj, Context context, Object obj2, int i9) {
        super(context);
        this.f15396a = i9;
        this.f15398c = obj;
        this.f15397b = obj2;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
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
        org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.f15397b;
        if (x9Var.f34619t) {
            if ((x9Var.f34612m == 1.0f || !x9Var.f34615p) && x9Var.f34613n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((td.a) this.f15398c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15396a) {
            case 3:
                RectF rectF = (RectF) this.f15397b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                qn qnVar = (qn) this.f15398c;
                int backgroundSizeY = qnVar.T0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = qnVar.P8(this);
                on onVar = qnVar.f41848aa;
                if (onVar != null) {
                    onVar.o(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.f6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackground"));
                on onVar2 = qnVar.f41848aa;
                if (onVar2 == null ? org.telegram.ui.ActionBar.f6.a1() : onVar2.t0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) this.f15397b)).q(canvas, 0);
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
        char c10;
        int themedColor;
        int i9;
        switch (this.f15396a) {
            case 0:
                Paint paint = (Paint) this.f15397b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                qf0 qf0Var = (qf0) this.f15398c;
                qf0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                qf0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f15397b;
                nh.o oVar = (nh.o) this.f15398c;
                org.telegram.ui.Components.o9 o9Var = oVar.v;
                if (o9Var != null && o9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f15397b;
                id idVar = (id) this.f15398c;
                ih.d4 d4Var = idVar.f39108e;
                if (d4Var != null && d4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (idVar.f39123r.getAlpha() * idVar.f39108e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.f15397b;
                Paint paint4 = x9Var.f34622x;
                org.telegram.ui.ActionBar.b6 b6Var = x9Var.f34623y;
                Paint paint5 = x9Var.f34621w;
                int i10 = x9Var.f34603b;
                View view = x9Var.f34604c;
                h6 h6Var = x9Var.d;
                if (h6Var != null) {
                    if (h6Var.getMeasuredHeight() != 0 || h6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !x9Var.f34619t && !x9Var.f34615p) {
                            x9Var.a();
                            x9Var.f34611l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.f34607g;
                        if ((bitmapArr2 != null || x9Var.f34614o) && x9Var.f34615p) {
                            boolean z10 = x9Var.f34613n;
                            if (z10) {
                                float f13 = x9Var.f34612m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    x9Var.f34612m = f14;
                                    if (f14 > 1.0f) {
                                        x9Var.f34612m = 1.0f;
                                    }
                                    h6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f15 = x9Var.f34612m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    x9Var.f34612m = f16;
                                    if (f16 < 0.0f) {
                                        x9Var.f34612m = 0.0f;
                                    }
                                    h6Var.invalidate();
                                }
                            }
                        }
                        if (x9Var.f34615p) {
                            f10 = x9Var.f34612m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && x9Var.f34614o) {
                            paint4.setAlpha((int) (50.0f * f10));
                            canvas.drawPaint(paint4);
                            return;
                        }
                        if (f10 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c10 = 0;
                        } else {
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c10 = 0;
                            canvas.saveLayerAlpha(0.0f, 0.0f, h6Var.getMeasuredWidth(), h6Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f10 * f12));
                            if (i10 == r02) {
                                canvas.translate(f11, x9Var.f34620u);
                            }
                            canvas.save();
                            canvas.scale(h6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), h6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i10 == 0) {
                                canvas.translate(f11, x9Var.f34620u);
                            }
                            canvas.scale(h6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), x9Var.f34618s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f11, f11, paint5);
                            canvas.restore();
                            x9Var.f34619t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (x9Var.f34613n && !x9Var.f34610k) {
                            if (x9Var.f34607g == null || x9Var.f34611l) {
                                x9Var.f34610k = r02;
                                x9Var.f34611l = false;
                                if (x9Var.f34605e == null) {
                                    x9Var.f34605e = new Bitmap[2];
                                    x9Var.f34609j = new Canvas[2];
                                }
                                for (int i11 = 0; i11 < 2; i11++) {
                                    if (x9Var.f34605e[i11] != null && h6Var.getMeasuredWidth() == x9Var.f34617r && h6Var.getMeasuredHeight() == x9Var.f34616q) {
                                        x9Var.f34605e[i11].eraseColor(0);
                                    } else {
                                        int measuredHeight = h6Var.getMeasuredHeight();
                                        int measuredWidth = h6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        x9Var.f34618s = dp;
                                        if (i11 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            x9Var.f34605e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            x9Var.f34609j[i11] = new Canvas(x9Var.f34605e[i11]);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i11 == r02) {
                                        x9Var.f34605e[i11].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                                    }
                                    x9Var.f34609j[i11].save();
                                    x9Var.f34609j[i11].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (b6Var instanceof on) {
                                            background = ((on) b6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.f6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i11));
                                    if (i11 == 0) {
                                        x9Var.f34609j[i11].translate(f11, -x9Var.f34620u);
                                        view.draw(x9Var.f34609j[i11]);
                                    }
                                    if (background != null && i11 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(x9Var.f34609j[i11]);
                                        background.setBounds(bounds);
                                        view.draw(x9Var.f34609j[i11]);
                                    }
                                    view.setTag(67108867, null);
                                    x9Var.f34609j[i11].restore();
                                }
                                x9Var.f34616q = h6Var.getMeasuredHeight();
                                x9Var.f34617r = h6Var.getMeasuredWidth();
                                x9Var.v.f34153b = h6Var.getMeasuredWidth();
                                x9Var.v.f34154c = h6Var.getMeasuredHeight();
                                org.telegram.ui.Components.w9 w9Var = x9Var.v;
                                if (w9Var.f34153b != 0 && w9Var.f34154c != 0) {
                                    if (x9Var.f34602a == null) {
                                        x9Var.f34602a = new DispatchQueue("blur_thread_" + x9Var);
                                    }
                                    x9Var.f34602a.postRunnable(x9Var.v);
                                    return;
                                }
                                x9Var.f34610k = false;
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
                Paint paint6 = (Paint) this.f15397b;
                ho hoVar = (ho) this.f15398c;
                ih.d4 d4Var2 = hoVar.f38842e;
                if (d4Var2 != null && d4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (hoVar.f38842e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f15397b;
                j20 j20Var = (j20) this.f15398c;
                boolean z11 = j20Var.f29608y;
                if (z11) {
                    float f17 = j20Var.A;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        j20Var.A = f18;
                        if (f18 > 1.0f) {
                            j20Var.A = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(j20Var.A, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j20Var.A) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f19 = j20Var.A;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        j20Var.A = f20;
                        if (f20 < 0.0f) {
                            j20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(j20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j20Var.A) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                e80 e80Var = (e80) this.f15398c;
                FrameLayout frameLayout = e80Var.f27972n;
                float[] fArr = e80Var.E;
                e80.a(frameLayout, (FrameLayout) this.f15397b, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 8:
                Paint paint8 = (Paint) this.f15397b;
                is isVar = (is) this.f15398c;
                org.telegram.ui.Components.o9 o9Var2 = isVar.f39272e;
                if (o9Var2 != null && o9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (isVar.f39272e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                jz jzVar = (jz) this.f15398c;
                FrameLayout frameLayout2 = jzVar.f38045a;
                float[] fArr2 = jzVar.f38055y;
                ez.a(frameLayout2, (FrameLayout) this.f15397b, fArr2);
                canvas.save();
                float y11 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 10:
                Paint paint9 = (Paint) this.f15397b;
                r60 r60Var = (r60) this.f15398c;
                if (r60Var.d != null && r60Var.f42282n.getVisibility() == 0 && r60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (r60Var.f42282n.getAlpha() * r60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f15397b;
                qe0 qe0Var = (qe0) this.f15398c;
                gd gdVar = qe0Var.f41777r;
                ih.d4 d4Var3 = qe0Var.f41774e;
                if (d4Var3 != null && gdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (gdVar.getAlpha() * d4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((b61) this.f15398c).M0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, (org.telegram.ui.ActionBar.b6) this.f15397b));
                    return;
                }
            case 14:
                z71 z71Var = (z71) this.f15398c;
                int height = z71.f0(z71Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f15397b;
                paint11.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, z71.g0(z71Var)));
                z71Var.f45061b.J(canvas, 0.0f, rect, paint11, true);
                if (z71Var.getParentLayout() != null) {
                    ((ActionBarLayout) z71Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                oc1 oc1Var = (oc1) this.f15398c;
                int currentItem = oc1Var.f41075f0.getCurrentItem();
                Paint paint12 = (Paint) this.f15397b;
                int i12 = org.telegram.ui.ActionBar.f6.Ae;
                if (oc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.f6.C0(i12);
                } else {
                    themedColor = oc1Var.getThemedColor(i12);
                }
                paint12.setColor(themedColor);
                for (int i13 = 0; i13 < 2; i13++) {
                    if (i13 == currentItem) {
                        i9 = 255;
                    } else {
                        i9 = 127;
                    }
                    paint12.setAlpha(i9);
                    canvas.drawCircle(AndroidUtilities.dp((i13 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                }
                return;
            case 16:
                Paint paint13 = (Paint) this.f15397b;
                paint13.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) ag1.r0((ag1) this.f15398c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f15397b);
                zf.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), zf.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f15398c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f15396a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f15396a) {
            case 4:
                super.onSizeChanged(i9, i10, i11, i12);
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.f15397b;
                h6 h6Var = x9Var.d;
                if (x9Var.f34607g != null && h6Var.getMeasuredHeight() != 0 && h6Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.f34616q = h6Var.getMeasuredHeight();
                    x9Var.f34617r = h6Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f15396a) {
            case 4:
                super.setAlpha(f10);
                View view = ((qn) this.f15398c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 6:
                super.setAlpha(f10);
                ((j20) this.f15398c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f15396a) {
            case 6:
                super.setScaleX(f10);
                ((j20) this.f15398c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f15396a) {
            case 6:
                super.setScaleY(f10);
                ((j20) this.f15398c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f15396a) {
            case 6:
                super.setTranslationY(f10);
                ((j20) this.f15398c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f15396a) {
            case 4:
                super.setVisibility(i9);
                View view = ((qn) this.f15398c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f15396a) {
            case 0:
                if (drawable != ((qf0) this.f15398c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f15396a = 11;
        this.f15398c = new td.a(0, this, gr.h, 380L, true);
        this.f15397b = b5Var;
    }

    public h6(Activity activity) {
        super(activity);
        this.f15396a = 0;
        Paint paint = new Paint(1);
        this.f15397b = paint;
        qf0 qf0Var = new qf0(10);
        this.f15398c = qf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        qf0Var.setCallback(this);
        qf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public h6(nh.o oVar, Context context) {
        super(context);
        this.f15396a = 1;
        this.f15398c = oVar;
        this.f15397b = new Paint(1);
    }

    public h6(j20 j20Var, Context context) {
        super(context);
        this.f15396a = 6;
        this.f15398c = j20Var;
        this.f15397b = new Paint(1);
    }

    public h6(z71 z71Var, Context context) {
        super(context);
        this.f15396a = 14;
        this.f15398c = z71Var;
        this.f15397b = new Paint(1);
    }

    public h6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f15396a = 17;
        this.f15397b = paint;
        this.f15398c = drawable;
    }

    public h6(ag1 ag1Var, Context context) {
        super(context);
        this.f15396a = 16;
        this.f15398c = ag1Var;
        this.f15397b = new Paint();
    }

    public h6(Context context, oc1 oc1Var) {
        super(context);
        this.f15396a = 15;
        this.f15398c = oc1Var;
        this.f15397b = new Paint(1);
    }

    public h6(qn qnVar, Context context) {
        super(context);
        this.f15396a = 3;
        this.f15398c = qnVar;
        this.f15397b = new RectF();
    }

    public h6(qn qnVar, Context context, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f15396a = 4;
        this.f15398c = qnVar;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(view, this, b6Var);
        this.f15397b = x9Var;
        x9Var.f34615p = false;
        x9Var.f34613n = true;
    }

    @Override
    public void B(float f10, int i9) {
    }
}
