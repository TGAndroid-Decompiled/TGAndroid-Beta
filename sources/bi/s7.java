package bi;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ae1;
import org.telegram.ui.bo;
import org.telegram.ui.c00;
import org.telegram.ui.eo;
import org.telegram.ui.hf0;
import org.telegram.ui.k70;
import org.telegram.ui.k91;
import org.telegram.ui.l71;
import org.telegram.ui.mh1;
import org.telegram.ui.ts;
import org.telegram.ui.xz;
import org.telegram.ui.yo;
public final class s7 extends View implements le.d {
    public final int f3650a;
    public final Object f3651b;
    public final Object f3652c;

    public s7(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f3650a = i10;
        this.f3652c = obj;
        this.f3651b = obj2;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
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
        org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.f3651b;
        if (eaVar.f22649t) {
            if ((eaVar.f22642m == 1.0f || !eaVar.f22645p) && eaVar.f22643n && eaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.b) this.f3652c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3650a) {
            case 3:
                RectF rectF = (RectF) this.f3651b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                eo eoVar = (eo) this.f3652c;
                int backgroundSizeY = eoVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = eoVar.P8(this);
                bo boVar = eoVar.f32316ea;
                if (boVar != null) {
                    boVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackground"));
                bo boVar2 = eoVar.f32316ea;
                if (boVar2 == null ? org.telegram.ui.ActionBar.j6.a1() : boVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.f5) this.f3651b)).q(canvas, 0);
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
        switch (this.f3650a) {
            case 0:
                Paint paint = (Paint) this.f3651b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                pg0 pg0Var = (pg0) this.f3652c;
                pg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                pg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f3651b;
                ei.p pVar = (ei.p) this.f3652c;
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f3651b;
                org.telegram.ui.nd ndVar = (org.telegram.ui.nd) this.f3652c;
                gg.i1 i1Var = ndVar.e;
                if (i1Var != null && i1Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.f35239r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.f3651b;
                Paint paint4 = eaVar.f22652x;
                org.telegram.ui.ActionBar.f6 f6Var = eaVar.f22653y;
                Paint paint5 = eaVar.f22651w;
                int i11 = eaVar.f22634b;
                View view = eaVar.f22635c;
                s7 s7Var = eaVar.d;
                if (s7Var != null) {
                    if (s7Var.getMeasuredHeight() != 0 || s7Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !eaVar.f22649t && !eaVar.f22645p) {
                            eaVar.a();
                            eaVar.f22641l = false;
                        }
                        Bitmap[] bitmapArr2 = eaVar.f22637g;
                        if ((bitmapArr2 != null || eaVar.f22644o) && eaVar.f22645p) {
                            boolean z10 = eaVar.f22643n;
                            if (z10) {
                                float f12 = eaVar.f22642m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    eaVar.f22642m = f13;
                                    if (f13 > 1.0f) {
                                        eaVar.f22642m = 1.0f;
                                    }
                                    s7Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = eaVar.f22642m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    eaVar.f22642m = f15;
                                    if (f15 < 0.0f) {
                                        eaVar.f22642m = 0.0f;
                                    }
                                    s7Var.invalidate();
                                }
                            }
                        }
                        if (eaVar.f22645p) {
                            f7 = eaVar.f22642m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && eaVar.f22644o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, s7Var.getMeasuredWidth(), s7Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * f11));
                            if (i11 == r02) {
                                canvas.translate(f10, eaVar.f22650u);
                            }
                            canvas.save();
                            canvas.scale(s7Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), s7Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, eaVar.f22650u);
                            }
                            canvas.scale(s7Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), eaVar.f22648s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            eaVar.f22649t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (eaVar.f22643n && !eaVar.f22640k) {
                            if (eaVar.f22637g == null || eaVar.f22641l) {
                                eaVar.f22640k = r02;
                                eaVar.f22641l = false;
                                if (eaVar.e == null) {
                                    eaVar.e = new Bitmap[2];
                                    eaVar.f22639j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (eaVar.e[i12] != null && s7Var.getMeasuredWidth() == eaVar.f22647r && s7Var.getMeasuredHeight() == eaVar.f22646q) {
                                        eaVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = s7Var.getMeasuredHeight();
                                        int measuredWidth = s7Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        eaVar.f22648s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            eaVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            eaVar.f22639j[i12] = new Canvas(eaVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new rg(eaVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        eaVar.e[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                                    }
                                    eaVar.f22639j[i12].save();
                                    eaVar.f22639j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof bo) {
                                            background = ((bo) f6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.j6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        eaVar.f22639j[i12].translate(f10, -eaVar.f22650u);
                                        view.draw(eaVar.f22639j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(eaVar.f22639j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(eaVar.f22639j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    eaVar.f22639j[i12].restore();
                                }
                                eaVar.f22646q = s7Var.getMeasuredHeight();
                                eaVar.f22647r = s7Var.getMeasuredWidth();
                                eaVar.v.f22342b = s7Var.getMeasuredWidth();
                                eaVar.v.f22343c = s7Var.getMeasuredHeight();
                                org.telegram.ui.Components.da daVar = eaVar.v;
                                if (daVar.f22342b != 0 && daVar.f22343c != 0) {
                                    if (eaVar.f22633a == null) {
                                        eaVar.f22633a = new DispatchQueue("blur_thread_" + eaVar);
                                    }
                                    eaVar.f22633a.postRunnable(eaVar.v);
                                    return;
                                }
                                eaVar.f22640k = false;
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
                Paint paint6 = (Paint) this.f3651b;
                yo yoVar = (yo) this.f3652c;
                gg.i1 i1Var2 = yoVar.e;
                if (i1Var2 != null && i1Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (yoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f3651b;
                j30 j30Var = (j30) this.f3652c;
                boolean z11 = j30Var.f24221y;
                if (z11) {
                    float f16 = j30Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        j30Var.E = f17;
                        if (f17 > 1.0f) {
                            j30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(j30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = j30Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        j30Var.E = f19;
                        if (f19 < 0.0f) {
                            j30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(j30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                f90 f90Var = (f90) this.f3652c;
                FrameLayout frameLayout = f90Var.f22951n;
                float[] fArr = f90Var.I;
                f90.a(frameLayout, (FrameLayout) this.f3651b, fArr);
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
                Paint paint8 = (Paint) this.f3651b;
                ts tsVar = (ts) this.f3652c;
                org.telegram.ui.Components.w9 w9Var2 = tsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (tsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                c00 c00Var = (c00) this.f3652c;
                FrameLayout frameLayout2 = c00Var.f38842a;
                float[] fArr2 = c00Var.f38851y;
                xz.a(frameLayout2, (FrameLayout) this.f3651b, fArr2);
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
                Paint paint9 = (Paint) this.f3651b;
                k70 k70Var = (k70) this.f3652c;
                if (k70Var.d != null && k70Var.f34251n.getVisibility() == 0 && k70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (k70Var.f34251n.getAlpha() * k70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f3651b;
                hf0 hf0Var = (hf0) this.f3652c;
                org.telegram.ui.ld ldVar = hf0Var.f33377r;
                gg.i1 i1Var3 = hf0Var.e;
                if (i1Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * i1Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((l71) this.f3652c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f3651b));
                    return;
                }
            case 14:
                k91 k91Var = (k91) this.f3652c;
                int height = k91.g0(k91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f3651b;
                paint11.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, k91.h0(k91Var)));
                k91Var.f34296b.J(canvas, 0.0f, rect, paint11, true);
                if (k91Var.getParentLayout() != null) {
                    ((ActionBarLayout) k91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                ae1 ae1Var = (ae1) this.f3652c;
                int currentItem = ae1Var.f30944j0.getCurrentItem();
                Paint paint12 = (Paint) this.f3651b;
                int i13 = org.telegram.ui.ActionBar.j6.Ae;
                if (ae1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.j6.C0(i13);
                } else {
                    themedColor = ae1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f3651b;
                paint13.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) mh1.s0((mh1) this.f3652c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f3651b);
                qg.d1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), qg.d1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f3652c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f3650a) {
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
        switch (this.f3650a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.f3651b;
                s7 s7Var = eaVar.d;
                if (eaVar.f22637g != null && s7Var.getMeasuredHeight() != 0 && s7Var.getMeasuredWidth() != 0) {
                    eaVar.a();
                    eaVar.f22646q = s7Var.getMeasuredHeight();
                    eaVar.f22647r = s7Var.getMeasuredWidth();
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
        switch (this.f3650a) {
            case 4:
                super.setAlpha(f7);
                View view = ((eo) this.f3652c).fragmentView;
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
                ((j30) this.f3652c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f3650a) {
            case 6:
                super.setScaleX(f7);
                ((j30) this.f3652c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f3650a) {
            case 6:
                super.setScaleY(f7);
                ((j30) this.f3652c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f3650a) {
            case 6:
                super.setTranslationY(f7);
                ((j30) this.f3652c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f3650a) {
            case 4:
                super.setVisibility(i10);
                View view = ((eo) this.f3652c).fragmentView;
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
        switch (this.f3650a) {
            case 0:
                if (drawable != ((pg0) this.f3652c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public s7(Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context);
        this.f3650a = 11;
        this.f3652c = new le.b(0, this, wr.h, 380L, true);
        this.f3651b = f5Var;
    }

    public s7(Activity activity) {
        super(activity);
        this.f3650a = 0;
        Paint paint = new Paint(1);
        this.f3651b = paint;
        pg0 pg0Var = new pg0(10);
        this.f3652c = pg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        pg0Var.setCallback(this);
        pg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public s7(ei.p pVar, Context context) {
        super(context);
        this.f3650a = 1;
        this.f3652c = pVar;
        this.f3651b = new Paint(1);
    }

    public s7(j30 j30Var, Context context) {
        super(context);
        this.f3650a = 6;
        this.f3652c = j30Var;
        this.f3651b = new Paint(1);
    }

    public s7(k91 k91Var, Context context) {
        super(context);
        this.f3650a = 14;
        this.f3652c = k91Var;
        this.f3651b = new Paint(1);
    }

    public s7(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f3650a = 17;
        this.f3651b = paint;
        this.f3652c = drawable;
    }

    public s7(mh1 mh1Var, Context context) {
        super(context);
        this.f3650a = 16;
        this.f3652c = mh1Var;
        this.f3651b = new Paint();
    }

    public s7(Context context, ae1 ae1Var) {
        super(context);
        this.f3650a = 15;
        this.f3652c = ae1Var;
        this.f3651b = new Paint(1);
    }

    public s7(eo eoVar, Context context) {
        super(context);
        this.f3650a = 3;
        this.f3652c = eoVar;
        this.f3651b = new RectF();
    }

    public s7(eo eoVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3650a = 4;
        this.f3652c = eoVar;
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(view, this, f6Var);
        this.f3651b = eaVar;
        eaVar.f22645p = false;
        eaVar.f22643n = true;
    }

    @Override
    public void B(float f7, int i10) {
    }
}
