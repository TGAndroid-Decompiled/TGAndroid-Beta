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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.w90;
import org.telegram.ui.a00;
import org.telegram.ui.ce1;
import org.telegram.ui.co;
import org.telegram.ui.f00;
import org.telegram.ui.fo;
import org.telegram.ui.mf0;
import org.telegram.ui.o91;
import org.telegram.ui.oh1;
import org.telegram.ui.p70;
import org.telegram.ui.qd;
import org.telegram.ui.r71;
import org.telegram.ui.sd;
import org.telegram.ui.ws;
import org.telegram.ui.zo;
public final class p6 extends View implements ne.d {
    public final int f7586a;
    public final Object f7587b;
    public final Object f7588c;

    public p6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f7586a = i10;
        this.f7588c = obj;
        this.f7587b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f7587b;
        if (haVar.f25600t) {
            if ((haVar.f25593m == 1.0f || !haVar.f25596p) && haVar.f25594n && haVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.f7588c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f7586a) {
            case 3:
                RectF rectF = (RectF) this.f7587b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                fo foVar = (fo) this.f7588c;
                int backgroundSizeY = foVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = foVar.U8(this);
                co coVar = foVar.f35932ea;
                if (coVar != null) {
                    coVar.l(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.g6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), foVar.getThemedPaint("paintChatActionBackground"));
                co coVar2 = foVar.f35932ea;
                if (coVar2 == null ? org.telegram.ui.ActionBar.g6.b1() : coVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), foVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) this.f7587b)).q(canvas, 0);
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
        ?? r16;
        float f10;
        ?? r02;
        int themedColor;
        int i10;
        switch (this.f7586a) {
            case 0:
                Paint paint = (Paint) this.f7587b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                gh0 gh0Var = (gh0) this.f7588c;
                gh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                gh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f7587b;
                gi.p pVar = (gi.p) this.f7588c;
                org.telegram.ui.Components.z9 z9Var = pVar.v;
                if (z9Var != null && z9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f7587b;
                sd sdVar = (sd) this.f7588c;
                bi.k5 k5Var = sdVar.e;
                if (k5Var != null && k5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (sdVar.f40084r.getAlpha() * sdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f7587b;
                Paint paint4 = haVar.f25603x;
                org.telegram.ui.ActionBar.c6 c6Var = haVar.f25604y;
                Paint paint5 = haVar.f25602w;
                int i11 = haVar.f25585b;
                View view = haVar.f25586c;
                p6 p6Var = haVar.d;
                if (p6Var != null) {
                    if (p6Var.getMeasuredHeight() != 0 || p6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !haVar.f25600t && !haVar.f25596p) {
                            haVar.a();
                            haVar.f25592l = false;
                        }
                        Bitmap[] bitmapArr2 = haVar.f25588g;
                        if ((bitmapArr2 != null || haVar.f25595o) && haVar.f25596p) {
                            boolean z10 = haVar.f25594n;
                            if (z10) {
                                float f11 = haVar.f25593m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    haVar.f25593m = f12;
                                    if (f12 > 1.0f) {
                                        haVar.f25593m = 1.0f;
                                    }
                                    p6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = haVar.f25593m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    haVar.f25593m = f14;
                                    if (f14 < 0.0f) {
                                        haVar.f25593m = 0.0f;
                                    }
                                    p6Var.invalidate();
                                }
                            }
                        }
                        if (haVar.f25596p) {
                            f7 = haVar.f25593m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && haVar.f25595o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, p6Var.getMeasuredWidth(), p6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, haVar.f25601u);
                            }
                            canvas.save();
                            canvas.scale(p6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), p6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, haVar.f25601u);
                            }
                            canvas.scale(p6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), haVar.f25599s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            haVar.f25600t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (haVar.f25594n && !haVar.f25591k) {
                            if (haVar.f25588g == null || haVar.f25592l) {
                                haVar.f25591k = r02;
                                haVar.f25592l = r16;
                                if (haVar.e == null) {
                                    haVar.e = new Bitmap[2];
                                    haVar.f25590j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (haVar.e[i12] != null && p6Var.getMeasuredWidth() == haVar.f25598r && p6Var.getMeasuredHeight() == haVar.f25597q) {
                                        haVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = p6Var.getMeasuredHeight();
                                        int measuredWidth = p6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        haVar.f25599s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            haVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            haVar.f25590j[i12] = new Canvas(haVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new qg(haVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        haVar.e[i12].eraseColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
                                    }
                                    haVar.f25590j[i12].save();
                                    haVar.f25590j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (c6Var instanceof co) {
                                            background = ((co) c6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.g6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        haVar.f25590j[i12].translate(f10, -haVar.f25601u);
                                        view.draw(haVar.f25590j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(haVar.f25590j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(haVar.f25590j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    haVar.f25590j[i12].restore();
                                }
                                haVar.f25597q = p6Var.getMeasuredHeight();
                                haVar.f25598r = p6Var.getMeasuredWidth();
                                haVar.v.f25242b = p6Var.getMeasuredWidth();
                                haVar.v.f25243c = p6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ga gaVar = haVar.v;
                                if (gaVar.f25242b != 0 && gaVar.f25243c != 0) {
                                    if (haVar.f25584a == null) {
                                        haVar.f25584a = new DispatchQueue("blur_thread_" + haVar);
                                    }
                                    haVar.f25584a.postRunnable(haVar.v);
                                    return;
                                }
                                haVar.f25591k = false;
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
                Paint paint6 = (Paint) this.f7587b;
                zo zoVar = (zo) this.f7588c;
                bi.k5 k5Var2 = zoVar.e;
                if (k5Var2 != null && k5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (zoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f7587b;
                m30 m30Var = (m30) this.f7588c;
                boolean z11 = m30Var.f27189y;
                if (z11) {
                    float f15 = m30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        m30Var.E = f16;
                        if (f16 > 1.0f) {
                            m30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(m30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * m30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = m30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        m30Var.E = f18;
                        if (f18 < 0.0f) {
                            m30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(m30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * m30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                w90 w90Var = (w90) this.f7588c;
                FrameLayout frameLayout = w90Var.f30830n;
                float[] fArr = w90Var.I;
                w90.a(frameLayout, (FrameLayout) this.f7587b, fArr);
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
                Paint paint8 = (Paint) this.f7587b;
                ws wsVar = (ws) this.f7588c;
                org.telegram.ui.Components.z9 z9Var2 = wsVar.e;
                if (z9Var2 != null && z9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (wsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                f00 f00Var = (f00) this.f7588c;
                FrameLayout frameLayout2 = f00Var.f34000a;
                float[] fArr2 = f00Var.f34009y;
                a00.a(frameLayout2, (FrameLayout) this.f7587b, fArr2);
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
                Paint paint9 = (Paint) this.f7587b;
                p70 p70Var = (p70) this.f7588c;
                if (p70Var.d != null && p70Var.f39134n.getVisibility() == 0 && p70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (p70Var.f39134n.getAlpha() * p70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f7587b;
                mf0 mf0Var = (mf0) this.f7588c;
                qd qdVar = mf0Var.f38247r;
                bi.k5 k5Var3 = mf0Var.e;
                if (k5Var3 != null && qdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (qdVar.getAlpha() * k5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((r71) this.f7588c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, (org.telegram.ui.ActionBar.c6) this.f7587b));
                    return;
                }
            case 14:
                o91 o91Var = (o91) this.f7588c;
                int height = o91.g0(o91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f7587b;
                paint11.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, o91.h0(o91Var)));
                o91Var.f38895b.J(canvas, 0.0f, rect, paint11, true);
                if (o91Var.getParentLayout() != null) {
                    ((ActionBarLayout) o91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                ce1 ce1Var = (ce1) this.f7588c;
                int currentItem = ce1Var.f34883j0.getCurrentItem();
                Paint paint12 = (Paint) this.f7587b;
                int i13 = org.telegram.ui.ActionBar.g6.Ae;
                if (ce1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.g6.D0(i13);
                } else {
                    themedColor = ce1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f7587b;
                paint13.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) oh1.s0((oh1) this.f7588c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f7587b);
                sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f7588c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f7586a) {
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
        switch (this.f7586a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f7587b;
                p6 p6Var = haVar.d;
                if (haVar.f25588g != null && p6Var.getMeasuredHeight() != 0 && p6Var.getMeasuredWidth() != 0) {
                    haVar.a();
                    haVar.f25597q = p6Var.getMeasuredHeight();
                    haVar.f25598r = p6Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
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
    public void setAlpha(float f7) {
        switch (this.f7586a) {
            case 4:
                super.setAlpha(f7);
                View view = ((fo) this.f7588c).fragmentView;
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
                ((m30) this.f7588c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f7586a) {
            case 6:
                super.setScaleX(f7);
                ((m30) this.f7588c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f7586a) {
            case 6:
                super.setScaleY(f7);
                ((m30) this.f7588c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f7586a) {
            case 6:
                super.setTranslationY(f7);
                ((m30) this.f7588c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f7586a) {
            case 4:
                super.setVisibility(i10);
                View view = ((fo) this.f7588c).fragmentView;
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
        switch (this.f7586a) {
            case 0:
                if (drawable != ((gh0) this.f7588c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public p6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f7586a = 11;
        this.f7588c = new ne.b(0, this, es.h, 380L, true);
        this.f7587b = b5Var;
    }

    public p6(Activity activity) {
        super(activity);
        this.f7586a = 0;
        Paint paint = new Paint(1);
        this.f7587b = paint;
        gh0 gh0Var = new gh0(10);
        this.f7588c = gh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        gh0Var.setCallback(this);
        gh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public p6(gi.p pVar, Context context) {
        super(context);
        this.f7586a = 1;
        this.f7588c = pVar;
        this.f7587b = new Paint(1);
    }

    public p6(m30 m30Var, Context context) {
        super(context);
        this.f7586a = 6;
        this.f7588c = m30Var;
        this.f7587b = new Paint(1);
    }

    public p6(o91 o91Var, Context context) {
        super(context);
        this.f7586a = 14;
        this.f7588c = o91Var;
        this.f7587b = new Paint(1);
    }

    public p6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f7586a = 17;
        this.f7587b = paint;
        this.f7588c = drawable;
    }

    public p6(oh1 oh1Var, Context context) {
        super(context);
        this.f7586a = 16;
        this.f7588c = oh1Var;
        this.f7587b = new Paint();
    }

    public p6(Context context, ce1 ce1Var) {
        super(context);
        this.f7586a = 15;
        this.f7588c = ce1Var;
        this.f7587b = new Paint(1);
    }

    public p6(fo foVar, Context context) {
        super(context);
        this.f7586a = 3;
        this.f7588c = foVar;
        this.f7587b = new RectF();
    }

    public p6(fo foVar, Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f7586a = 4;
        this.f7588c = foVar;
        org.telegram.ui.Components.ha haVar = new org.telegram.ui.Components.ha(view, this, c6Var);
        this.f7587b = haVar;
        haVar.f25596p = false;
        haVar.f25594n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
