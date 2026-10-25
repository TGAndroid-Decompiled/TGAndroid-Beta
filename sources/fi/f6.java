package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.r90;
import org.telegram.ui.c61;
import org.telegram.ui.dg1;
import org.telegram.ui.ez;
import org.telegram.ui.js;
import org.telegram.ui.jz;
import org.telegram.ui.ld;
import org.telegram.ui.mo;
import org.telegram.ui.nd;
import org.telegram.ui.re0;
import org.telegram.ui.sn;
import org.telegram.ui.tc1;
import org.telegram.ui.un;
import org.telegram.ui.x60;
public final class f6 extends View implements oe.d {
    public final int f10863a;
    public Object f10864b;
    public final Object f10865c;

    public f6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f10863a = i10;
        this.f10865c = obj;
        this.f10864b = obj2;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
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
        org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f10864b;
        if (jaVar.f29570t) {
            if ((jaVar.f29563m == 1.0f || !jaVar.f29566p) && jaVar.f29564n && jaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10863a) {
            case 4:
                RectF rectF = (RectF) this.f10864b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                un unVar = (un) this.f10865c;
                int backgroundSizeY = unVar.f44292j1.getBackgroundSizeY();
                float x9 = getX();
                float Z8 = unVar.Z8(this);
                sn snVar = unVar.f44385qa;
                if (snVar != null) {
                    snVar.b(x9, Z8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.y6.q(x9, Z8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), unVar.getThemedPaint("paintChatActionBackground"));
                sn snVar2 = unVar.f44385qa;
                if (snVar2 == null ? org.telegram.ui.ActionBar.y6.c1() : snVar2.f()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), unVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.j5) this.f10864b)).q(canvas, 0);
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
        switch (this.f10863a) {
            case 0:
                Paint paint = (Paint) this.f10864b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                dh0 dh0Var = (dh0) this.f10865c;
                dh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                dh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f10864b;
                ii.o oVar = (ii.o) this.f10865c;
                org.telegram.ui.Components.y9 y9Var = oVar.f14397w;
                if (y9Var != null && y9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.f14397w.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i11 = 0; i11 < 7; i11++) {
                    String str = ((String[]) this.f10864b)[i11];
                    canvas.drawText(str, (width / 2.0f) + (i11 * width) + paddingLeft, ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.n8) this.f10865c).f41782f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f10864b;
                nd ndVar = (nd) this.f10865c;
                di.k4 k4Var = ndVar.f41847f;
                if (k4Var != null && k4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.f41862s.getAlpha() * ndVar.f41847f.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    return;
                }
                return;
            case 4:
            case 12:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f10864b;
                Paint paint4 = jaVar.f29573x;
                org.telegram.ui.ActionBar.u6 u6Var = jaVar.f29574y;
                Paint paint5 = jaVar.f29572w;
                int i12 = jaVar.f29555b;
                View view = jaVar.f29556c;
                f6 f6Var = jaVar.d;
                if (f6Var != null) {
                    if (f6Var.getMeasuredHeight() != 0 || f6Var.getMeasuredWidth() != 0) {
                        if (i12 == 1 && !jaVar.f29570t && !jaVar.f29566p) {
                            jaVar.a();
                            jaVar.f29562l = false;
                        }
                        Bitmap[] bitmapArr2 = jaVar.f29558g;
                        if ((bitmapArr2 != null || jaVar.f29565o) && jaVar.f29566p) {
                            boolean z10 = jaVar.f29564n;
                            if (z10) {
                                float f11 = jaVar.f29563m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    jaVar.f29563m = f12;
                                    if (f12 > 1.0f) {
                                        jaVar.f29563m = 1.0f;
                                    }
                                    f6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = jaVar.f29563m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    jaVar.f29563m = f14;
                                    if (f14 < 0.0f) {
                                        jaVar.f29563m = 0.0f;
                                    }
                                    f6Var.invalidate();
                                }
                            }
                        }
                        if (jaVar.f29566p) {
                            f7 = jaVar.f29563m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && jaVar.f29565o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, f6Var.getMeasuredWidth(), f6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i12 == r02) {
                                canvas.translate(f10, jaVar.f29571u);
                            }
                            canvas.save();
                            canvas.scale(f6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), f6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i12 == 0) {
                                canvas.translate(f10, jaVar.f29571u);
                            }
                            canvas.scale(f6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), jaVar.f29569s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            jaVar.f29570t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (jaVar.f29564n && !jaVar.f29561k) {
                            if (jaVar.f29558g == null || jaVar.f29562l) {
                                jaVar.f29561k = r02;
                                jaVar.f29562l = r16;
                                if (jaVar.e == null) {
                                    jaVar.e = new Bitmap[2];
                                    jaVar.f29560j = new Canvas[2];
                                }
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (jaVar.e[i13] != null && f6Var.getMeasuredWidth() == jaVar.f29568r && f6Var.getMeasuredHeight() == jaVar.f29567q) {
                                        jaVar.e[i13].eraseColor(0);
                                    } else {
                                        int measuredHeight = f6Var.getMeasuredHeight();
                                        int measuredWidth = f6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        jaVar.f29569s = dp;
                                        if (i13 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            jaVar.e[i13] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            jaVar.f29560j[i13] = new Canvas(jaVar.e[i13]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new pg(jaVar, 12));
                                            return;
                                        }
                                    }
                                    if (i13 == r02) {
                                        jaVar.e[i13].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, u6Var));
                                    }
                                    jaVar.f29560j[i13].save();
                                    jaVar.f29560j[i13].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (u6Var instanceof sn) {
                                            background = ((sn) u6Var).l();
                                        } else {
                                            background = org.telegram.ui.ActionBar.y6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i13));
                                    if (i13 == 0) {
                                        jaVar.f29560j[i13].translate(f10, -jaVar.f29571u);
                                        view.draw(jaVar.f29560j[i13]);
                                    }
                                    if (background != null && i13 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(jaVar.f29560j[i13]);
                                        background.setBounds(bounds);
                                        view.draw(jaVar.f29560j[i13]);
                                    }
                                    view.setTag(67108867, null);
                                    jaVar.f29560j[i13].restore();
                                }
                                jaVar.f29567q = f6Var.getMeasuredHeight();
                                jaVar.f29568r = f6Var.getMeasuredWidth();
                                jaVar.v.f29238b = f6Var.getMeasuredWidth();
                                jaVar.v.f29239c = f6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ia iaVar = jaVar.v;
                                if (iaVar.f29238b != 0 && iaVar.f29239c != 0) {
                                    if (jaVar.f29554a == null) {
                                        jaVar.f29554a = new DispatchQueue("blur_thread_" + jaVar);
                                    }
                                    jaVar.f29554a.postRunnable(jaVar.v);
                                    return;
                                }
                                jaVar.f29561k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                Paint paint6 = (Paint) this.f10864b;
                mo moVar = (mo) this.f10865c;
                di.k4 k4Var2 = moVar.e;
                if (k4Var2 != null && k4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (moVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f10864b;
                k30 k30Var = (k30) this.f10865c;
                boolean z11 = k30Var.f29798y;
                if (z11) {
                    float f15 = k30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        k30Var.E = f16;
                        if (f16 > 1.0f) {
                            k30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(k30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * k30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = k30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        k30Var.E = f18;
                        if (f18 < 0.0f) {
                            k30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(k30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * k30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                r90 r90Var = (r90) this.f10865c;
                FrameLayout frameLayout = r90Var.f32172n;
                float[] fArr = r90Var.I;
                r90.a(frameLayout, (FrameLayout) this.f10864b, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 9:
                Paint paint8 = (Paint) this.f10864b;
                js jsVar = (js) this.f10865c;
                org.telegram.ui.Components.y9 y9Var2 = jsVar.e;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (jsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 10:
                canvas.drawColor(855638016);
                jz jzVar = (jz) this.f10865c;
                FrameLayout frameLayout2 = jzVar.f39208a;
                float[] fArr2 = jzVar.f39217y;
                ez.a(frameLayout2, (FrameLayout) this.f10864b, fArr2);
                canvas.save();
                float y10 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 11:
                Paint paint9 = (Paint) this.f10864b;
                x60 x60Var = (x60) this.f10865c;
                if (x60Var.d != null && x60Var.f45666n.getVisibility() == 0 && x60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (x60Var.f45666n.getAlpha() * x60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 13:
                Paint paint10 = (Paint) this.f10864b;
                re0 re0Var = (re0) this.f10865c;
                ld ldVar = re0Var.f43127r;
                di.k4 k4Var3 = re0Var.e;
                if (k4Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * k4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 14:
                if (!((c61) this.f10865c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, (org.telegram.ui.ActionBar.u6) this.f10864b));
                    return;
                }
            case 15:
                tc1 tc1Var = (tc1) this.f10865c;
                int currentItem = tc1Var.f43766k0.getCurrentItem();
                Paint paint11 = (Paint) this.f10864b;
                int i14 = org.telegram.ui.ActionBar.y6.Ae;
                if (tc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.y6.E0(i14);
                } else {
                    themedColor = tc1Var.getThemedColor(i14);
                }
                paint11.setColor(themedColor);
                for (int i15 = 0; i15 < 2; i15++) {
                    if (i15 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint11.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i15 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint11);
                }
                return;
            case 16:
                Paint paint12 = (Paint) this.f10864b;
                paint12.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) dg1.t0((dg1) this.f10865c)).q(canvas, measuredHeight2);
                return;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.n5 n5Var = ((org.telegram.ui.Wallet.r5) this.f10865c).f37165b;
                if (n5Var != null) {
                    n5Var.e(canvas, (float[]) this.f10864b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.h7.a((float[]) this.f10864b, -16216082));
                }
                canvas.restoreToCount(save);
                return;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f10864b);
                tg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), tg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f10865c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10863a) {
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
        switch (this.f10863a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f10864b;
                f6 f6Var = jaVar.d;
                if (jaVar.f29558g != null && f6Var.getMeasuredHeight() != 0 && f6Var.getMeasuredWidth() != 0) {
                    jaVar.a();
                    jaVar.f29567q = f6Var.getMeasuredHeight();
                    jaVar.f29568r = f6Var.getMeasuredWidth();
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
        switch (this.f10863a) {
            case 5:
                super.setAlpha(f7);
                View view = ((un) this.f10865c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
            default:
                super.setAlpha(f7);
                return;
            case 7:
                super.setAlpha(f7);
                ((k30) this.f10865c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f10863a) {
            case 7:
                super.setScaleX(f7);
                ((k30) this.f10865c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f10863a) {
            case 7:
                super.setScaleY(f7);
                ((k30) this.f10865c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f10863a) {
            case 7:
                super.setTranslationY(f7);
                ((k30) this.f10865c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f10863a) {
            case 5:
                super.setVisibility(i10);
                View view = ((un) this.f10865c).fragmentView;
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
        switch (this.f10863a) {
            case 0:
                if (drawable != ((dh0) this.f10865c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public f6(Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context);
        this.f10863a = 12;
        this.f10865c = new oe.b(0, this, ds.h, 380L, true);
        this.f10864b = j5Var;
    }

    public f6(Activity activity) {
        super(activity);
        this.f10863a = 0;
        Paint paint = new Paint(1);
        this.f10864b = paint;
        dh0 dh0Var = new dh0(10);
        this.f10865c = dh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        dh0Var.setCallback(this);
        dh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public f6(ii.o oVar, Context context) {
        super(context);
        this.f10863a = 1;
        this.f10865c = oVar;
        this.f10864b = new Paint(1);
    }

    public f6(k30 k30Var, Context context) {
        super(context);
        this.f10863a = 7;
        this.f10865c = k30Var;
        this.f10864b = new Paint(1);
    }

    public f6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f10863a = 18;
        this.f10864b = paint;
        this.f10865c = drawable;
    }

    public f6(org.telegram.ui.Wallet.r5 r5Var, Context context) {
        super(context);
        this.f10863a = 17;
        this.f10865c = r5Var;
    }

    public f6(dg1 dg1Var, Context context) {
        super(context);
        this.f10863a = 16;
        this.f10865c = dg1Var;
        this.f10864b = new Paint();
    }

    public f6(Context context, tc1 tc1Var) {
        super(context);
        this.f10863a = 15;
        this.f10865c = tc1Var;
        this.f10864b = new Paint(1);
    }

    public f6(un unVar, Context context) {
        super(context);
        this.f10863a = 4;
        this.f10865c = unVar;
        this.f10864b = new RectF();
    }

    public f6(un unVar, Context context, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f10863a = 5;
        this.f10865c = unVar;
        org.telegram.ui.Components.ja jaVar = new org.telegram.ui.Components.ja(view, this, u6Var);
        this.f10864b = jaVar;
        jaVar.f29566p = false;
        jaVar.f29564n = true;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
