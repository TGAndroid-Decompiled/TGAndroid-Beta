package ei;

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
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.zr;
import org.telegram.ui.a61;
import org.telegram.ui.ag1;
import org.telegram.ui.b81;
import org.telegram.ui.hs;
import org.telegram.ui.hz;
import org.telegram.ui.kd;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.mz;
import org.telegram.ui.pc1;
import org.telegram.ui.qn;
import org.telegram.ui.sn;
import org.telegram.ui.te0;
import org.telegram.ui.w60;
public final class g6 extends View implements ne.d {
    public final int f9078a;
    public Object f9079b;
    public final Object f9080c;

    public g6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f9078a = i10;
        this.f9080c = obj;
        this.f9079b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f9079b;
        if (daVar.f25647t) {
            if ((daVar.f25640m == 1.0f || !daVar.f25643p) && daVar.f25641n && daVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.f9080c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9078a) {
            case 3:
                RectF rectF = (RectF) this.f9079b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                sn snVar = (sn) this.f9080c;
                int backgroundSizeY = snVar.f41558j1.getBackgroundSizeY();
                float x10 = getX();
                float U8 = snVar.U8(this);
                qn qnVar = snVar.f41651qa;
                if (qnVar != null) {
                    qnVar.b(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.k6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackground"));
                qn qnVar2 = snVar.f41651qa;
                if (qnVar2 == null ? org.telegram.ui.ActionBar.k6.c1() : qnVar2.f()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.h5) this.f9079b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
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
        switch (this.f9078a) {
            case 0:
                Paint paint = (Paint) this.f9079b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                dh0 dh0Var = (dh0) this.f9080c;
                dh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                dh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f9079b;
                hi.o oVar = (hi.o) this.f9080c;
                org.telegram.ui.Components.u9 u9Var = oVar.f12229w;
                if (u9Var != null && u9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.f12229w.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f9079b;
                md mdVar = (md) this.f9080c;
                ci.j4 j4Var = mdVar.f39542f;
                if (j4Var != null && j4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.f39557s.getAlpha() * mdVar.f39542f.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f9079b;
                Paint paint4 = daVar.f25650x;
                org.telegram.ui.ActionBar.g6 g6Var = daVar.f25651y;
                Paint paint5 = daVar.f25649w;
                int i11 = daVar.f25632b;
                View view = daVar.f25633c;
                g6 g6Var2 = daVar.d;
                if (g6Var2 != null) {
                    if (g6Var2.getMeasuredHeight() != 0 || g6Var2.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !daVar.f25647t && !daVar.f25643p) {
                            daVar.a();
                            daVar.f25639l = false;
                        }
                        Bitmap[] bitmapArr2 = daVar.f25635g;
                        if ((bitmapArr2 != null || daVar.f25642o) && daVar.f25643p) {
                            boolean z10 = daVar.f25641n;
                            if (z10) {
                                float f11 = daVar.f25640m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    daVar.f25640m = f12;
                                    if (f12 > 1.0f) {
                                        daVar.f25640m = 1.0f;
                                    }
                                    g6Var2.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = daVar.f25640m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    daVar.f25640m = f14;
                                    if (f14 < 0.0f) {
                                        daVar.f25640m = 0.0f;
                                    }
                                    g6Var2.invalidate();
                                }
                            }
                        }
                        if (daVar.f25643p) {
                            f7 = daVar.f25640m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && daVar.f25642o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, g6Var2.getMeasuredWidth(), g6Var2.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, daVar.f25648u);
                            }
                            canvas.save();
                            canvas.scale(g6Var2.getMeasuredWidth() / bitmapArr[r02].getWidth(), g6Var2.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, daVar.f25648u);
                            }
                            canvas.scale(g6Var2.getMeasuredWidth() / bitmapArr[r16].getWidth(), daVar.f25646s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            daVar.f25647t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (daVar.f25641n && !daVar.f25638k) {
                            if (daVar.f25635g == null || daVar.f25639l) {
                                daVar.f25638k = r02;
                                daVar.f25639l = r16;
                                if (daVar.e == null) {
                                    daVar.e = new Bitmap[2];
                                    daVar.f25637j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (daVar.e[i12] != null && g6Var2.getMeasuredWidth() == daVar.f25645r && g6Var2.getMeasuredHeight() == daVar.f25644q) {
                                        daVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = g6Var2.getMeasuredHeight();
                                        int measuredWidth = g6Var2.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        daVar.f25646s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            daVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            daVar.f25637j[i12] = new Canvas(daVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new ng(daVar, 12));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        daVar.e[i12].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var));
                                    }
                                    daVar.f25637j[i12].save();
                                    daVar.f25637j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (g6Var instanceof qn) {
                                            background = ((qn) g6Var).l();
                                        } else {
                                            background = org.telegram.ui.ActionBar.k6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        daVar.f25637j[i12].translate(f10, -daVar.f25648u);
                                        view.draw(daVar.f25637j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(daVar.f25637j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(daVar.f25637j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    daVar.f25637j[i12].restore();
                                }
                                daVar.f25644q = g6Var2.getMeasuredHeight();
                                daVar.f25645r = g6Var2.getMeasuredWidth();
                                daVar.v.f25275b = g6Var2.getMeasuredWidth();
                                daVar.v.f25276c = g6Var2.getMeasuredHeight();
                                org.telegram.ui.Components.ca caVar = daVar.v;
                                if (caVar.f25275b != 0 && caVar.f25276c != 0) {
                                    if (daVar.f25631a == null) {
                                        daVar.f25631a = new DispatchQueue("blur_thread_" + daVar);
                                    }
                                    daVar.f25631a.postRunnable(daVar.v);
                                    return;
                                }
                                daVar.f25638k = false;
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
                Paint paint6 = (Paint) this.f9079b;
                ko koVar = (ko) this.f9080c;
                ci.j4 j4Var2 = koVar.e;
                if (j4Var2 != null && j4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (koVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f9079b;
                g30 g30Var = (g30) this.f9080c;
                boolean z11 = g30Var.f26549y;
                if (z11) {
                    float f15 = g30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        g30Var.E = f16;
                        if (f16 > 1.0f) {
                            g30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(g30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * g30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = g30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        g30Var.E = f18;
                        if (f18 < 0.0f) {
                            g30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(g30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * g30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                p90 p90Var = (p90) this.f9080c;
                FrameLayout frameLayout = p90Var.f29520n;
                float[] fArr = p90Var.I;
                p90.a(frameLayout, (FrameLayout) this.f9079b, fArr);
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
                Paint paint8 = (Paint) this.f9079b;
                hs hsVar = (hs) this.f9080c;
                org.telegram.ui.Components.u9 u9Var2 = hsVar.e;
                if (u9Var2 != null && u9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (hsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                mz mzVar = (mz) this.f9080c;
                FrameLayout frameLayout2 = mzVar.f38072a;
                float[] fArr2 = mzVar.f38081y;
                hz.a(frameLayout2, (FrameLayout) this.f9079b, fArr2);
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
                Paint paint9 = (Paint) this.f9079b;
                w60 w60Var = (w60) this.f9080c;
                if (w60Var.d != null && w60Var.f42920n.getVisibility() == 0 && w60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (w60Var.f42920n.getAlpha() * w60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f9079b;
                te0 te0Var = (te0) this.f9080c;
                kd kdVar = te0Var.f42020r;
                ci.j4 j4Var3 = te0Var.e;
                if (j4Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * j4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((a61) this.f9080c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.g6) this.f9079b));
                    return;
                }
            case 14:
                Paint paint11 = (Paint) this.f9079b;
                b81 b81Var = (b81) this.f9080c;
                int height = b81.h0(b81Var).getHeight();
                if (AndroidUtilities.isTablet()) {
                    paint11.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, b81.i0(b81Var)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), height, paint11);
                    return;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                paint11.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, b81.j0(b81Var)));
                b81Var.f35954b.I(canvas, 0.0f, rect, paint11, true);
                if (b81Var.getParentLayout() != null) {
                    ((ActionBarLayout) b81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                pc1 pc1Var = (pc1) this.f9080c;
                int currentItem = pc1Var.f40475k0.getCurrentItem();
                Paint paint12 = (Paint) this.f9079b;
                int i13 = org.telegram.ui.ActionBar.k6.Ae;
                if (pc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.k6.E0(i13);
                } else {
                    themedColor = pc1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f9079b;
                paint13.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) ag1.s0((ag1) this.f9080c)).q(canvas, measuredHeight2);
                return;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.p5 p5Var = ((org.telegram.ui.Wallet.s5) this.f9080c).f35133b;
                if (p5Var != null) {
                    p5Var.e(canvas, (float[]) this.f9079b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.h7.a((float[]) this.f9079b, -16216082));
                }
                canvas.restoreToCount(save);
                return;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f9079b);
                sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f9080c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9078a) {
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
        switch (this.f9078a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f9079b;
                g6 g6Var = daVar.d;
                if (daVar.f25635g != null && g6Var.getMeasuredHeight() != 0 && g6Var.getMeasuredWidth() != 0) {
                    daVar.a();
                    daVar.f25644q = g6Var.getMeasuredHeight();
                    daVar.f25645r = g6Var.getMeasuredWidth();
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
        switch (this.f9078a) {
            case 4:
                super.setAlpha(f7);
                View view = ((sn) this.f9080c).fragmentView;
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
                ((g30) this.f9080c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setScaleX(f7);
                ((g30) this.f9080c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setScaleY(f7);
                ((g30) this.f9080c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setTranslationY(f7);
                ((g30) this.f9080c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f9078a) {
            case 4:
                super.setVisibility(i10);
                View view = ((sn) this.f9080c).fragmentView;
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
        switch (this.f9078a) {
            case 0:
                if (drawable != ((dh0) this.f9080c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public g6(Context context, org.telegram.ui.ActionBar.h5 h5Var) {
        super(context);
        this.f9078a = 11;
        this.f9080c = new ne.b(0, this, zr.h, 380L, true);
        this.f9079b = h5Var;
    }

    public g6(Activity activity) {
        super(activity);
        this.f9078a = 0;
        Paint paint = new Paint(1);
        this.f9079b = paint;
        dh0 dh0Var = new dh0(10);
        this.f9080c = dh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        dh0Var.setCallback(this);
        dh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public g6(hi.o oVar, Context context) {
        super(context);
        this.f9078a = 1;
        this.f9080c = oVar;
        this.f9079b = new Paint(1);
    }

    public g6(g30 g30Var, Context context) {
        super(context);
        this.f9078a = 6;
        this.f9080c = g30Var;
        this.f9079b = new Paint(1);
    }

    public g6(b81 b81Var, Context context) {
        super(context);
        this.f9078a = 14;
        this.f9080c = b81Var;
        this.f9079b = new Paint(1);
    }

    public g6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f9078a = 18;
        this.f9079b = paint;
        this.f9080c = drawable;
    }

    public g6(org.telegram.ui.Wallet.s5 s5Var, Context context) {
        super(context);
        this.f9078a = 17;
        this.f9080c = s5Var;
    }

    public g6(ag1 ag1Var, Context context) {
        super(context);
        this.f9078a = 16;
        this.f9080c = ag1Var;
        this.f9079b = new Paint();
    }

    public g6(Context context, pc1 pc1Var) {
        super(context);
        this.f9078a = 15;
        this.f9080c = pc1Var;
        this.f9079b = new Paint(1);
    }

    public g6(sn snVar, Context context) {
        super(context);
        this.f9078a = 3;
        this.f9080c = snVar;
        this.f9079b = new RectF();
    }

    public g6(sn snVar, Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f9078a = 4;
        this.f9080c = snVar;
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(view, this, g6Var);
        this.f9079b = daVar;
        daVar.f25643p = false;
        daVar.f25641n = true;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
