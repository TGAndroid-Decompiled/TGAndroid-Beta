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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q90;
import org.telegram.ui.ez;
import org.telegram.ui.fs;
import org.telegram.ui.io;
import org.telegram.ui.jz;
import org.telegram.ui.kc1;
import org.telegram.ui.kd;
import org.telegram.ui.md;
import org.telegram.ui.ne0;
import org.telegram.ui.on;
import org.telegram.ui.qn;
import org.telegram.ui.s60;
import org.telegram.ui.vf1;
import org.telegram.ui.x51;
import org.telegram.ui.x71;
public final class g6 extends View implements ne.d {
    public final int f9068a;
    public Object f9069b;
    public final Object f9070c;

    public g6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f9068a = i10;
        this.f9070c = obj;
        this.f9069b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9069b;
        if (faVar.f26184t) {
            if ((faVar.f26177m == 1.0f || !faVar.f26180p) && faVar.f26178n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.f9070c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9068a) {
            case 3:
                RectF rectF = (RectF) this.f9069b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                qn qnVar = (qn) this.f9070c;
                int backgroundSizeY = qnVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = qnVar.U8(this);
                on onVar = qnVar.f40667ea;
                if (onVar != null) {
                    onVar.d(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackground"));
                on onVar2 = qnVar.f40667ea;
                if (onVar2 == null ? org.telegram.ui.ActionBar.h6.b1() : onVar2.s()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f9069b)).q(canvas, 0);
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
        switch (this.f9068a) {
            case 0:
                Paint paint = (Paint) this.f9069b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                ah0 ah0Var = (ah0) this.f9070c;
                ah0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                ah0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f9069b;
                hi.o oVar = (hi.o) this.f9070c;
                org.telegram.ui.Components.w9 w9Var = oVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f9069b;
                md mdVar = (md) this.f9070c;
                ci.k4 k4Var = mdVar.e;
                if (k4Var != null && k4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.f39192r.getAlpha() * mdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9069b;
                Paint paint4 = faVar.f26187x;
                org.telegram.ui.ActionBar.d6 d6Var = faVar.f26188y;
                Paint paint5 = faVar.f26186w;
                int i11 = faVar.f26169b;
                View view = faVar.f26170c;
                g6 g6Var = faVar.d;
                if (g6Var != null) {
                    if (g6Var.getMeasuredHeight() != 0 || g6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !faVar.f26184t && !faVar.f26180p) {
                            faVar.a();
                            faVar.f26176l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.f26172g;
                        if ((bitmapArr2 != null || faVar.f26179o) && faVar.f26180p) {
                            boolean z10 = faVar.f26178n;
                            if (z10) {
                                float f11 = faVar.f26177m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    faVar.f26177m = f12;
                                    if (f12 > 1.0f) {
                                        faVar.f26177m = 1.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = faVar.f26177m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    faVar.f26177m = f14;
                                    if (f14 < 0.0f) {
                                        faVar.f26177m = 0.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                        }
                        if (faVar.f26180p) {
                            f7 = faVar.f26177m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && faVar.f26179o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, g6Var.getMeasuredWidth(), g6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, faVar.f26185u);
                            }
                            canvas.save();
                            canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), g6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, faVar.f26185u);
                            }
                            canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), faVar.f26183s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            faVar.f26184t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (faVar.f26178n && !faVar.f26175k) {
                            if (faVar.f26172g == null || faVar.f26176l) {
                                faVar.f26175k = r02;
                                faVar.f26176l = r16;
                                if (faVar.e == null) {
                                    faVar.e = new Bitmap[2];
                                    faVar.f26174j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (faVar.e[i12] != null && g6Var.getMeasuredWidth() == faVar.f26182r && g6Var.getMeasuredHeight() == faVar.f26181q) {
                                        faVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = g6Var.getMeasuredHeight();
                                        int measuredWidth = g6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        faVar.f26183s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            faVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            faVar.f26174j[i12] = new Canvas(faVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new pg(faVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        faVar.e[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, d6Var));
                                    }
                                    faVar.f26174j[i12].save();
                                    faVar.f26174j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (d6Var instanceof on) {
                                            background = ((on) d6Var).e();
                                        } else {
                                            background = org.telegram.ui.ActionBar.h6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        faVar.f26174j[i12].translate(f10, -faVar.f26185u);
                                        view.draw(faVar.f26174j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(faVar.f26174j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(faVar.f26174j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    faVar.f26174j[i12].restore();
                                }
                                faVar.f26181q = g6Var.getMeasuredHeight();
                                faVar.f26182r = g6Var.getMeasuredWidth();
                                faVar.v.f25883b = g6Var.getMeasuredWidth();
                                faVar.v.f25884c = g6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ea eaVar = faVar.v;
                                if (eaVar.f25883b != 0 && eaVar.f25884c != 0) {
                                    if (faVar.f26168a == null) {
                                        faVar.f26168a = new DispatchQueue("blur_thread_" + faVar);
                                    }
                                    faVar.f26168a.postRunnable(faVar.v);
                                    return;
                                }
                                faVar.f26175k = false;
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
                Paint paint6 = (Paint) this.f9069b;
                io ioVar = (io) this.f9070c;
                ci.k4 k4Var2 = ioVar.e;
                if (k4Var2 != null && k4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (ioVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f9069b;
                i30 i30Var = (i30) this.f9070c;
                boolean z11 = i30Var.f27062y;
                if (z11) {
                    float f15 = i30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        i30Var.E = f16;
                        if (f16 > 1.0f) {
                            i30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(i30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = i30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        i30Var.E = f18;
                        if (f18 < 0.0f) {
                            i30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(i30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                q90 q90Var = (q90) this.f9070c;
                FrameLayout frameLayout = q90Var.f29564n;
                float[] fArr = q90Var.I;
                q90.a(frameLayout, (FrameLayout) this.f9069b, fArr);
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
                Paint paint8 = (Paint) this.f9069b;
                fs fsVar = (fs) this.f9070c;
                org.telegram.ui.Components.w9 w9Var2 = fsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (fsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                jz jzVar = (jz) this.f9070c;
                FrameLayout frameLayout2 = jzVar.f36824a;
                float[] fArr2 = jzVar.f36833y;
                ez.a(frameLayout2, (FrameLayout) this.f9069b, fArr2);
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
                Paint paint9 = (Paint) this.f9069b;
                s60 s60Var = (s60) this.f9070c;
                if (s60Var.d != null && s60Var.f41372n.getVisibility() == 0 && s60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (s60Var.f41372n.getAlpha() * s60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f9069b;
                ne0 ne0Var = (ne0) this.f9070c;
                kd kdVar = ne0Var.f39552r;
                ci.k4 k4Var3 = ne0Var.e;
                if (k4Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * k4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((x51) this.f9070c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f9069b));
                    return;
                }
            case 14:
                x71 x71Var = (x71) this.f9070c;
                int height = x71.g0(x71Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f9069b;
                paint11.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21266s8, x71.h0(x71Var)));
                x71Var.f43116b.J(canvas, 0.0f, rect, paint11, true);
                if (x71Var.getParentLayout() != null) {
                    ((ActionBarLayout) x71Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                kc1 kc1Var = (kc1) this.f9070c;
                int currentItem = kc1Var.f38540j0.getCurrentItem();
                Paint paint12 = (Paint) this.f9069b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                if (kc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.h6.D0(i13);
                } else {
                    themedColor = kc1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f9069b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) vf1.s0((vf1) this.f9070c)).q(canvas, measuredHeight2);
                return;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.p5 p5Var = ((org.telegram.ui.Wallet.s5) this.f9070c).f34836b;
                if (p5Var != null) {
                    p5Var.e(canvas, (float[]) this.f9069b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.h7.a((float[]) this.f9069b, -16216082));
                }
                canvas.restoreToCount(save);
                return;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f9069b);
                sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f9070c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9068a) {
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
        switch (this.f9068a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9069b;
                g6 g6Var = faVar.d;
                if (faVar.f26172g != null && g6Var.getMeasuredHeight() != 0 && g6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.f26181q = g6Var.getMeasuredHeight();
                    faVar.f26182r = g6Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
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
        switch (this.f9068a) {
            case 4:
                super.setAlpha(f7);
                View view = ((qn) this.f9070c).fragmentView;
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
                ((i30) this.f9070c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f9068a) {
            case 6:
                super.setScaleX(f7);
                ((i30) this.f9070c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f9068a) {
            case 6:
                super.setScaleY(f7);
                ((i30) this.f9070c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f9068a) {
            case 6:
                super.setTranslationY(f7);
                ((i30) this.f9070c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f9068a) {
            case 4:
                super.setVisibility(i10);
                View view = ((qn) this.f9070c).fragmentView;
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
        switch (this.f9068a) {
            case 0:
                if (drawable != ((ah0) this.f9070c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public g6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f9068a = 11;
        this.f9070c = new ne.b(0, this, bs.h, 380L, true);
        this.f9069b = d5Var;
    }

    public g6(Activity activity) {
        super(activity);
        this.f9068a = 0;
        Paint paint = new Paint(1);
        this.f9069b = paint;
        ah0 ah0Var = new ah0(10);
        this.f9070c = ah0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ah0Var.setCallback(this);
        ah0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public g6(hi.o oVar, Context context) {
        super(context);
        this.f9068a = 1;
        this.f9070c = oVar;
        this.f9069b = new Paint(1);
    }

    public g6(i30 i30Var, Context context) {
        super(context);
        this.f9068a = 6;
        this.f9070c = i30Var;
        this.f9069b = new Paint(1);
    }

    public g6(x71 x71Var, Context context) {
        super(context);
        this.f9068a = 14;
        this.f9070c = x71Var;
        this.f9069b = new Paint(1);
    }

    public g6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f9068a = 18;
        this.f9069b = paint;
        this.f9070c = drawable;
    }

    public g6(org.telegram.ui.Wallet.s5 s5Var, Context context) {
        super(context);
        this.f9068a = 17;
        this.f9070c = s5Var;
    }

    public g6(vf1 vf1Var, Context context) {
        super(context);
        this.f9068a = 16;
        this.f9070c = vf1Var;
        this.f9069b = new Paint();
    }

    public g6(Context context, kc1 kc1Var) {
        super(context);
        this.f9068a = 15;
        this.f9070c = kc1Var;
        this.f9069b = new Paint(1);
    }

    public g6(qn qnVar, Context context) {
        super(context);
        this.f9068a = 3;
        this.f9070c = qnVar;
        this.f9069b = new RectF();
    }

    public g6(qn qnVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f9068a = 4;
        this.f9070c = qnVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, d6Var);
        this.f9069b = faVar;
        faVar.f26180p = false;
        faVar.f26178n = true;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
