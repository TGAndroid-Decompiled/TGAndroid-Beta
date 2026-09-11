package di;

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
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.z20;
import org.telegram.ui.a00;
import org.telegram.ui.ao;
import org.telegram.ui.co;
import org.telegram.ui.hf0;
import org.telegram.ui.hh1;
import org.telegram.ui.i91;
import org.telegram.ui.j71;
import org.telegram.ui.l70;
import org.telegram.ui.ss;
import org.telegram.ui.vz;
import org.telegram.ui.wd1;
import org.telegram.ui.xo;
public final class r6 extends View implements le.d {
    public final int f8067a;
    public final Object f8068b;
    public final Object f8069c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f8067a = i10;
        this.f8069c = obj;
        this.f8068b = obj2;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
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
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f8068b;
        if (faVar.f25998t) {
            if ((faVar.f25991m == 1.0f || !faVar.f25994p) && faVar.f25992n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.b) this.f8069c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8067a) {
            case 3:
                RectF rectF = (RectF) this.f8068b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                co coVar = (co) this.f8069c;
                int backgroundSizeY = coVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = coVar.P8(this);
                ao aoVar = coVar.f35247ea;
                if (aoVar != null) {
                    aoVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), coVar.getThemedPaint("paintChatActionBackground"));
                ao aoVar2 = coVar.f35247ea;
                if (aoVar2 == null ? org.telegram.ui.ActionBar.j6.a1() : aoVar2.o0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), coVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f8068b)).q(canvas, 0);
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
        switch (this.f8067a) {
            case 0:
                Paint paint = (Paint) this.f8068b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                fg0 fg0Var = (fg0) this.f8069c;
                fg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                fg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f8068b;
                gi.p pVar = (gi.p) this.f8069c;
                org.telegram.ui.Components.x9 x9Var = pVar.v;
                if (x9Var != null && x9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f8068b;
                org.telegram.ui.md mdVar = (org.telegram.ui.md) this.f8069c;
                bi.i5 i5Var = mdVar.f38640e;
                if (i5Var != null && i5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.f38655r.getAlpha() * mdVar.f38640e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f8068b;
                Paint paint4 = faVar.f26001x;
                org.telegram.ui.ActionBar.f6 f6Var = faVar.f26002y;
                Paint paint5 = faVar.f26000w;
                int i11 = faVar.f25982b;
                View view = faVar.f25983c;
                r6 r6Var = faVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !faVar.f25998t && !faVar.f25994p) {
                            faVar.a();
                            faVar.f25990l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.f25986g;
                        if ((bitmapArr2 != null || faVar.f25993o) && faVar.f25994p) {
                            boolean z10 = faVar.f25992n;
                            if (z10) {
                                float f12 = faVar.f25991m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    faVar.f25991m = f13;
                                    if (f13 > 1.0f) {
                                        faVar.f25991m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = faVar.f25991m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    faVar.f25991m = f15;
                                    if (f15 < 0.0f) {
                                        faVar.f25991m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (faVar.f25994p) {
                            f7 = faVar.f25991m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && faVar.f25993o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * f11));
                            if (i11 == r02) {
                                canvas.translate(f10, faVar.f25999u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, faVar.f25999u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), faVar.f25997s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            faVar.f25998t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (faVar.f25992n && !faVar.f25989k) {
                            if (faVar.f25986g == null || faVar.f25990l) {
                                faVar.f25989k = r02;
                                faVar.f25990l = false;
                                if (faVar.f25984e == null) {
                                    faVar.f25984e = new Bitmap[2];
                                    faVar.f25988j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (faVar.f25984e[i12] != null && r6Var.getMeasuredWidth() == faVar.f25996r && r6Var.getMeasuredHeight() == faVar.f25995q) {
                                        faVar.f25984e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        faVar.f25997s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            faVar.f25984e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            faVar.f25988j[i12] = new Canvas(faVar.f25984e[i12]);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            AndroidUtilities.runOnUIThread(new pg(faVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        faVar.f25984e[i12].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
                                    }
                                    faVar.f25988j[i12].save();
                                    faVar.f25988j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof ao) {
                                            background = ((ao) f6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.j6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        faVar.f25988j[i12].translate(f10, -faVar.f25999u);
                                        view.draw(faVar.f25988j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(faVar.f25988j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(faVar.f25988j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    faVar.f25988j[i12].restore();
                                }
                                faVar.f25995q = r6Var.getMeasuredHeight();
                                faVar.f25996r = r6Var.getMeasuredWidth();
                                faVar.v.f25634b = r6Var.getMeasuredWidth();
                                faVar.v.f25635c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ea eaVar = faVar.v;
                                if (eaVar.f25634b != 0 && eaVar.f25635c != 0) {
                                    if (faVar.f25981a == null) {
                                        faVar.f25981a = new DispatchQueue("blur_thread_" + faVar);
                                    }
                                    faVar.f25981a.postRunnable(faVar.v);
                                    return;
                                }
                                faVar.f25989k = false;
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
                Paint paint6 = (Paint) this.f8068b;
                xo xoVar = (xo) this.f8069c;
                bi.i5 i5Var2 = xoVar.f42774e;
                if (i5Var2 != null && i5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (xoVar.f42774e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f8068b;
                z20 z20Var = (z20) this.f8069c;
                boolean z11 = z20Var.f33069y;
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
                w80 w80Var = (w80) this.f8069c;
                FrameLayout frameLayout = w80Var.f32204n;
                float[] fArr = w80Var.I;
                w80.a(frameLayout, (FrameLayout) this.f8068b, fArr);
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
                Paint paint8 = (Paint) this.f8068b;
                ss ssVar = (ss) this.f8069c;
                org.telegram.ui.Components.x9 x9Var2 = ssVar.f40513e;
                if (x9Var2 != null && x9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (ssVar.f40513e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                a00 a00Var = (a00) this.f8069c;
                FrameLayout frameLayout2 = a00Var.f41715a;
                float[] fArr2 = a00Var.f41725y;
                vz.a(frameLayout2, (FrameLayout) this.f8068b, fArr2);
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
                Paint paint9 = (Paint) this.f8068b;
                l70 l70Var = (l70) this.f8069c;
                if (l70Var.d != null && l70Var.f38212n.getVisibility() == 0 && l70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (l70Var.f38212n.getAlpha() * l70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f8068b;
                hf0 hf0Var = (hf0) this.f8069c;
                org.telegram.ui.kd kdVar = hf0Var.f36986r;
                bi.i5 i5Var3 = hf0Var.f36983e;
                if (i5Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * i5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((j71) this.f8069c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.f8068b));
                    return;
                }
            case 14:
                i91 i91Var = (i91) this.f8069c;
                int height = i91.g0(i91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f8068b;
                paint11.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20937s8, i91.h0(i91Var)));
                i91Var.f37266b.J(canvas, 0.0f, rect, paint11, true);
                if (i91Var.getParentLayout() != null) {
                    ((ActionBarLayout) i91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                wd1 wd1Var = (wd1) this.f8069c;
                int currentItem = wd1Var.f41945j0.getCurrentItem();
                Paint paint12 = (Paint) this.f8068b;
                int i13 = org.telegram.ui.ActionBar.j6.Ae;
                if (wd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.j6.C0(i13);
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
                Paint paint13 = (Paint) this.f8068b;
                paint13.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) hh1.s0((hh1) this.f8069c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f8068b);
                sg.d1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.d1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f8069c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8067a) {
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
        switch (this.f8067a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f8068b;
                r6 r6Var = faVar.d;
                if (faVar.f25986g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.f25995q = r6Var.getMeasuredHeight();
                    faVar.f25996r = r6Var.getMeasuredWidth();
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
        switch (this.f8067a) {
            case 4:
                super.setAlpha(f7);
                View view = ((co) this.f8069c).fragmentView;
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
                ((z20) this.f8069c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f8067a) {
            case 6:
                super.setScaleX(f7);
                ((z20) this.f8069c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f8067a) {
            case 6:
                super.setScaleY(f7);
                ((z20) this.f8069c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f8067a) {
            case 6:
                super.setTranslationY(f7);
                ((z20) this.f8069c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f8067a) {
            case 4:
                super.setVisibility(i10);
                View view = ((co) this.f8069c).fragmentView;
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
        switch (this.f8067a) {
            case 0:
                if (drawable != ((fg0) this.f8069c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f8067a = 11;
        this.f8069c = new le.b(0, this, pr.h, 380L, true);
        this.f8068b = d5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f8067a = 0;
        Paint paint = new Paint(1);
        this.f8068b = paint;
        fg0 fg0Var = new fg0(10);
        this.f8069c = fg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        fg0Var.setCallback(this);
        fg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(gi.p pVar, Context context) {
        super(context);
        this.f8067a = 1;
        this.f8069c = pVar;
        this.f8068b = new Paint(1);
    }

    public r6(z20 z20Var, Context context) {
        super(context);
        this.f8067a = 6;
        this.f8069c = z20Var;
        this.f8068b = new Paint(1);
    }

    public r6(i91 i91Var, Context context) {
        super(context);
        this.f8067a = 14;
        this.f8069c = i91Var;
        this.f8068b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f8067a = 17;
        this.f8068b = paint;
        this.f8069c = drawable;
    }

    public r6(hh1 hh1Var, Context context) {
        super(context);
        this.f8067a = 16;
        this.f8069c = hh1Var;
        this.f8068b = new Paint();
    }

    public r6(Context context, wd1 wd1Var) {
        super(context);
        this.f8067a = 15;
        this.f8069c = wd1Var;
        this.f8068b = new Paint(1);
    }

    public r6(co coVar, Context context) {
        super(context);
        this.f8067a = 3;
        this.f8069c = coVar;
        this.f8068b = new RectF();
    }

    public r6(co coVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f8067a = 4;
        this.f8069c = coVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, f6Var);
        this.f8068b = faVar;
        faVar.f25994p = false;
        faVar.f25992n = true;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
