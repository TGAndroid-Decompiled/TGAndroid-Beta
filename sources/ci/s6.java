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
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z20;
import org.telegram.ui.bo;
import org.telegram.ui.c00;
import org.telegram.ui.g91;
import org.telegram.ui.i71;
import org.telegram.ui.ih1;
import org.telegram.ui.jf0;
import org.telegram.ui.n70;
import org.telegram.ui.us;
import org.telegram.ui.wo;
import org.telegram.ui.xd1;
import org.telegram.ui.xz;
import org.telegram.ui.zn;
public final class s6 extends View implements le.d {
    public final int f5515a;
    public final Object f5516b;
    public final Object f5517c;

    public s6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5515a = i10;
        this.f5517c = obj;
        this.f5516b = obj2;
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
        org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5516b;
        if (daVar.f23304t) {
            if ((daVar.f23297m == 1.0f || !daVar.f23300p) && daVar.f23298n && daVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.b) this.f5517c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5515a) {
            case 3:
                RectF rectF = (RectF) this.f5516b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                bo boVar = (bo) this.f5517c;
                int backgroundSizeY = boVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = boVar.P8(this);
                zn znVar = boVar.f32279ea;
                if (znVar != null) {
                    znVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), boVar.getThemedPaint("paintChatActionBackground"));
                zn znVar2 = boVar.f32279ea;
                if (znVar2 == null ? org.telegram.ui.ActionBar.j6.a1() : znVar2.p0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), boVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.e5) this.f5516b)).q(canvas, 0);
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
        switch (this.f5515a) {
            case 0:
                Paint paint = (Paint) this.f5516b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                gg0 gg0Var = (gg0) this.f5517c;
                gg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                gg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5516b;
                fi.p pVar = (fi.p) this.f5517c;
                org.telegram.ui.Components.u9 u9Var = pVar.v;
                if (u9Var != null && u9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f5516b;
                org.telegram.ui.nd ndVar = (org.telegram.ui.nd) this.f5517c;
                ai.z5 z5Var = ndVar.e;
                if (z5Var != null && z5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.f36063r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5516b;
                Paint paint4 = daVar.f23307x;
                org.telegram.ui.ActionBar.f6 f6Var = daVar.f23308y;
                Paint paint5 = daVar.f23306w;
                int i11 = daVar.f23289b;
                View view = daVar.f23290c;
                s6 s6Var = daVar.d;
                if (s6Var != null) {
                    if (s6Var.getMeasuredHeight() != 0 || s6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !daVar.f23304t && !daVar.f23300p) {
                            daVar.a();
                            daVar.f23296l = false;
                        }
                        Bitmap[] bitmapArr2 = daVar.f23292g;
                        if ((bitmapArr2 != null || daVar.f23299o) && daVar.f23300p) {
                            boolean z10 = daVar.f23298n;
                            if (z10) {
                                float f12 = daVar.f23297m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    daVar.f23297m = f13;
                                    if (f13 > 1.0f) {
                                        daVar.f23297m = 1.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = daVar.f23297m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    daVar.f23297m = f15;
                                    if (f15 < 0.0f) {
                                        daVar.f23297m = 0.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                        }
                        if (daVar.f23300p) {
                            f7 = daVar.f23297m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && daVar.f23299o) {
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
                                canvas.translate(f10, daVar.f23305u);
                            }
                            canvas.save();
                            canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), s6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, daVar.f23305u);
                            }
                            canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), daVar.f23303s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            daVar.f23304t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (daVar.f23298n && !daVar.f23295k) {
                            if (daVar.f23292g == null || daVar.f23296l) {
                                daVar.f23295k = r02;
                                daVar.f23296l = false;
                                if (daVar.e == null) {
                                    daVar.e = new Bitmap[2];
                                    daVar.f23294j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (daVar.e[i12] != null && s6Var.getMeasuredWidth() == daVar.f23302r && s6Var.getMeasuredHeight() == daVar.f23301q) {
                                        daVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = s6Var.getMeasuredHeight();
                                        int measuredWidth = s6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        daVar.f23303s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            daVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            daVar.f23294j[i12] = new Canvas(daVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new ng(daVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        daVar.e[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d6, f6Var));
                                    }
                                    daVar.f23294j[i12].save();
                                    daVar.f23294j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof zn) {
                                            background = ((zn) f6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.j6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        daVar.f23294j[i12].translate(f10, -daVar.f23305u);
                                        view.draw(daVar.f23294j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(daVar.f23294j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(daVar.f23294j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    daVar.f23294j[i12].restore();
                                }
                                daVar.f23301q = s6Var.getMeasuredHeight();
                                daVar.f23302r = s6Var.getMeasuredWidth();
                                daVar.v.f22992b = s6Var.getMeasuredWidth();
                                daVar.v.f22993c = s6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ca caVar = daVar.v;
                                if (caVar.f22992b != 0 && caVar.f22993c != 0) {
                                    if (daVar.f23288a == null) {
                                        daVar.f23288a = new DispatchQueue("blur_thread_" + daVar);
                                    }
                                    daVar.f23288a.postRunnable(daVar.v);
                                    return;
                                }
                                daVar.f23295k = false;
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
                Paint paint6 = (Paint) this.f5516b;
                wo woVar = (wo) this.f5517c;
                ai.z5 z5Var2 = woVar.e;
                if (z5Var2 != null && z5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (woVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f5516b;
                z20 z20Var = (z20) this.f5517c;
                boolean z11 = z20Var.f30390y;
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
                v80 v80Var = (v80) this.f5517c;
                FrameLayout frameLayout = v80Var.f28654n;
                float[] fArr = v80Var.I;
                v80.a(frameLayout, (FrameLayout) this.f5516b, fArr);
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
                Paint paint8 = (Paint) this.f5516b;
                us usVar = (us) this.f5517c;
                org.telegram.ui.Components.u9 u9Var2 = usVar.e;
                if (u9Var2 != null && u9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (usVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                c00 c00Var = (c00) this.f5517c;
                FrameLayout frameLayout2 = c00Var.f39732a;
                float[] fArr2 = c00Var.f39741y;
                xz.a(frameLayout2, (FrameLayout) this.f5516b, fArr2);
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
                Paint paint9 = (Paint) this.f5516b;
                n70 n70Var = (n70) this.f5517c;
                if (n70Var.d != null && n70Var.f35965n.getVisibility() == 0 && n70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (n70Var.f35965n.getAlpha() * n70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f5516b;
                jf0 jf0Var = (jf0) this.f5517c;
                org.telegram.ui.ld ldVar = jf0Var.f34873r;
                ai.z5 z5Var3 = jf0Var.e;
                if (z5Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((i71) this.f5517c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f5516b));
                    return;
                }
            case 14:
                g91 g91Var = (g91) this.f5517c;
                int height = g91.g0(g91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5516b;
                paint11.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19140s8, g91.h0(g91Var)));
                g91Var.f33923b.J(canvas, 0.0f, rect, paint11, true);
                if (g91Var.getParentLayout() != null) {
                    ((ActionBarLayout) g91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                xd1 xd1Var = (xd1) this.f5517c;
                int currentItem = xd1Var.f39566j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5516b;
                int i13 = org.telegram.ui.ActionBar.j6.Ae;
                if (xd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.j6.C0(i13);
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
                Paint paint13 = (Paint) this.f5516b;
                paint13.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) ih1.s0((ih1) this.f5517c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5516b);
                rg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5517c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5515a) {
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
        switch (this.f5515a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f5516b;
                s6 s6Var = daVar.d;
                if (daVar.f23292g != null && s6Var.getMeasuredHeight() != 0 && s6Var.getMeasuredWidth() != 0) {
                    daVar.a();
                    daVar.f23301q = s6Var.getMeasuredHeight();
                    daVar.f23302r = s6Var.getMeasuredWidth();
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
        switch (this.f5515a) {
            case 4:
                super.setAlpha(f7);
                View view = ((bo) this.f5517c).fragmentView;
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
                ((z20) this.f5517c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5515a) {
            case 6:
                super.setScaleX(f7);
                ((z20) this.f5517c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5515a) {
            case 6:
                super.setScaleY(f7);
                ((z20) this.f5517c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5515a) {
            case 6:
                super.setTranslationY(f7);
                ((z20) this.f5517c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5515a) {
            case 4:
                super.setVisibility(i10);
                View view = ((bo) this.f5517c).fragmentView;
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
        switch (this.f5515a) {
            case 0:
                if (drawable != ((gg0) this.f5517c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public s6(Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context);
        this.f5515a = 11;
        this.f5517c = new le.b(0, this, qr.h, 380L, true);
        this.f5516b = e5Var;
    }

    public s6(Activity activity) {
        super(activity);
        this.f5515a = 0;
        Paint paint = new Paint(1);
        this.f5516b = paint;
        gg0 gg0Var = new gg0(10);
        this.f5517c = gg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        gg0Var.setCallback(this);
        gg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public s6(fi.p pVar, Context context) {
        super(context);
        this.f5515a = 1;
        this.f5517c = pVar;
        this.f5516b = new Paint(1);
    }

    public s6(z20 z20Var, Context context) {
        super(context);
        this.f5515a = 6;
        this.f5517c = z20Var;
        this.f5516b = new Paint(1);
    }

    public s6(g91 g91Var, Context context) {
        super(context);
        this.f5515a = 14;
        this.f5517c = g91Var;
        this.f5516b = new Paint(1);
    }

    public s6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5515a = 17;
        this.f5516b = paint;
        this.f5517c = drawable;
    }

    public s6(ih1 ih1Var, Context context) {
        super(context);
        this.f5515a = 16;
        this.f5517c = ih1Var;
        this.f5516b = new Paint();
    }

    public s6(Context context, xd1 xd1Var) {
        super(context);
        this.f5515a = 15;
        this.f5517c = xd1Var;
        this.f5516b = new Paint(1);
    }

    public s6(bo boVar, Context context) {
        super(context);
        this.f5515a = 3;
        this.f5517c = boVar;
        this.f5516b = new RectF();
    }

    public s6(bo boVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f5515a = 4;
        this.f5517c = boVar;
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(view, this, f6Var);
        this.f5516b = daVar;
        daVar.f23300p = false;
        daVar.f23298n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
