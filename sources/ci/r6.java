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
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.a00;
import org.telegram.ui.bh1;
import org.telegram.ui.c71;
import org.telegram.ui.ff0;
import org.telegram.ui.k70;
import org.telegram.ui.ld;
import org.telegram.ui.nd;
import org.telegram.ui.qs;
import org.telegram.ui.rd1;
import org.telegram.ui.to;
import org.telegram.ui.vz;
import org.telegram.ui.wn;
import org.telegram.ui.yn;
public final class r6 extends View implements le.d {
    public final int f5866a;
    public final Object f5867b;
    public final Object f5868c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5866a = i10;
        this.f5868c = obj;
        this.f5867b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5867b;
        if (gaVar.f26757t) {
            if ((gaVar.f26750m == 1.0f || !gaVar.f26753p) && gaVar.f26751n && gaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
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
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5866a) {
            case 4:
                RectF rectF = (RectF) this.f5867b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                yn ynVar = (yn) this.f5868c;
                int backgroundSizeY = ynVar.V0.getBackgroundSizeY();
                float x10 = getX();
                float Q8 = ynVar.Q8(this);
                wn wnVar = ynVar.f43299ca;
                if (wnVar != null) {
                    wnVar.m(x10, Q8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, Q8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), ynVar.getThemedPaint("paintChatActionBackground"));
                wn wnVar2 = ynVar.f43299ca;
                if (wnVar2 == null ? org.telegram.ui.ActionBar.i6.a1() : wnVar2.r0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), ynVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.c5) this.f5867b)).q(canvas, 0);
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
        switch (this.f5866a) {
            case 0:
                Paint paint = (Paint) this.f5867b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                sg0 sg0Var = (sg0) this.f5868c;
                sg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                sg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5867b;
                fi.p pVar = (fi.p) this.f5868c;
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i11 = 0; i11 < 7; i11++) {
                    float f12 = width / 2.0f;
                    String str = ((String[]) this.f5867b)[i11];
                    canvas.drawText(str, f12 + (i11 * width) + paddingLeft, ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.f5868c).f37861f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f5867b;
                nd ndVar = (nd) this.f5868c;
                ai.y5 y5Var = ndVar.f38910e;
                if (y5Var != null && y5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.f38925r.getAlpha() * ndVar.f38910e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5867b;
                Paint paint4 = gaVar.f26760x;
                org.telegram.ui.ActionBar.d6 d6Var = gaVar.f26761y;
                Paint paint5 = gaVar.f26759w;
                int i12 = gaVar.f26741b;
                View view = gaVar.f26742c;
                r6 r6Var = gaVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i12 == 1 && !gaVar.f26757t && !gaVar.f26753p) {
                            gaVar.a();
                            gaVar.f26749l = false;
                        }
                        Bitmap[] bitmapArr2 = gaVar.f26745g;
                        if ((bitmapArr2 != null || gaVar.f26752o) && gaVar.f26753p) {
                            boolean z10 = gaVar.f26751n;
                            if (z10) {
                                float f13 = gaVar.f26750m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    gaVar.f26750m = f14;
                                    if (f14 > 1.0f) {
                                        gaVar.f26750m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f15 = gaVar.f26750m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    gaVar.f26750m = f16;
                                    if (f16 < 0.0f) {
                                        gaVar.f26750m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (gaVar.f26753p) {
                            f7 = gaVar.f26750m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && gaVar.f26752o) {
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
                            if (i12 == r02) {
                                canvas.translate(f10, gaVar.f26758u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i12 == 0) {
                                canvas.translate(f10, gaVar.f26758u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), gaVar.f26756s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            gaVar.f26757t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (gaVar.f26751n && !gaVar.f26748k) {
                            if (gaVar.f26745g == null || gaVar.f26749l) {
                                gaVar.f26748k = r02;
                                gaVar.f26749l = false;
                                if (gaVar.f26743e == null) {
                                    gaVar.f26743e = new Bitmap[2];
                                    gaVar.f26747j = new Canvas[2];
                                }
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (gaVar.f26743e[i13] != null && r6Var.getMeasuredWidth() == gaVar.f26755r && r6Var.getMeasuredHeight() == gaVar.f26754q) {
                                        gaVar.f26743e[i13].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        gaVar.f26756s = dp;
                                        if (i13 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            gaVar.f26743e[i13] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            gaVar.f26747j[i13] = new Canvas(gaVar.f26743e[i13]);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            AndroidUtilities.runOnUIThread(new qg(gaVar, 11));
                                            return;
                                        }
                                    }
                                    if (i13 == r02) {
                                        gaVar.f26743e[i13].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var));
                                    }
                                    gaVar.f26747j[i13].save();
                                    gaVar.f26747j[i13].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (d6Var instanceof wn) {
                                            background = ((wn) d6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.i6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i13));
                                    if (i13 == 0) {
                                        gaVar.f26747j[i13].translate(f10, -gaVar.f26758u);
                                        view.draw(gaVar.f26747j[i13]);
                                    }
                                    if (background != null && i13 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(gaVar.f26747j[i13]);
                                        background.setBounds(bounds);
                                        view.draw(gaVar.f26747j[i13]);
                                    }
                                    view.setTag(67108867, null);
                                    gaVar.f26747j[i13].restore();
                                }
                                gaVar.f26754q = r6Var.getMeasuredHeight();
                                gaVar.f26755r = r6Var.getMeasuredWidth();
                                gaVar.v.f26421b = r6Var.getMeasuredWidth();
                                gaVar.v.f26422c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.fa faVar = gaVar.v;
                                if (faVar.f26421b != 0 && faVar.f26422c != 0) {
                                    if (gaVar.f26740a == null) {
                                        gaVar.f26740a = new DispatchQueue("blur_thread_" + gaVar);
                                    }
                                    gaVar.f26740a.postRunnable(gaVar.v);
                                    return;
                                }
                                gaVar.f26748k = false;
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
                Paint paint6 = (Paint) this.f5867b;
                to toVar = (to) this.f5868c;
                ai.y5 y5Var2 = toVar.f40888e;
                if (y5Var2 != null && y5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (toVar.f40888e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f5867b;
                d30 d30Var = (d30) this.f5868c;
                boolean z11 = d30Var.f25546y;
                if (z11) {
                    float f17 = d30Var.E;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        d30Var.E = f18;
                        if (f18 > 1.0f) {
                            d30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f19 = d30Var.E;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        d30Var.E = f20;
                        if (f20 < 0.0f) {
                            d30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                j90 j90Var = (j90) this.f5868c;
                FrameLayout frameLayout = j90Var.f27688n;
                float[] fArr = j90Var.I;
                j90.a(frameLayout, (FrameLayout) this.f5867b, fArr);
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
                Paint paint8 = (Paint) this.f5867b;
                qs qsVar = (qs) this.f5868c;
                org.telegram.ui.Components.w9 w9Var2 = qsVar.f39805e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (qsVar.f39805e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 10:
                canvas.drawColor(855638016);
                a00 a00Var = (a00) this.f5868c;
                FrameLayout frameLayout2 = a00Var.f41856a;
                float[] fArr2 = a00Var.f41866y;
                vz.a(frameLayout2, (FrameLayout) this.f5867b, fArr2);
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
                Paint paint9 = (Paint) this.f5867b;
                k70 k70Var = (k70) this.f5868c;
                if (k70Var.d != null && k70Var.f37844n.getVisibility() == 0 && k70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (k70Var.f37844n.getAlpha() * k70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 13:
                Paint paint10 = (Paint) this.f5867b;
                ff0 ff0Var = (ff0) this.f5868c;
                ld ldVar = ff0Var.f36290r;
                ai.y5 y5Var3 = ff0Var.f36287e;
                if (y5Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * y5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 14:
                if (!((c71) this.f5868c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.d6) this.f5867b));
                    return;
                }
            case 15:
                rd1 rd1Var = (rd1) this.f5868c;
                int currentItem = rd1Var.f40062j0.getCurrentItem();
                Paint paint11 = (Paint) this.f5867b;
                int i14 = org.telegram.ui.ActionBar.i6.Ae;
                if (rd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.i6.C0(i14);
                } else {
                    themedColor = rd1Var.getThemedColor(i14);
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
                Paint paint12 = (Paint) this.f5867b;
                paint12.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) bh1.s0((bh1) this.f5868c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5867b);
                rg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5868c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5866a) {
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
        switch (this.f5866a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5867b;
                r6 r6Var = gaVar.d;
                if (gaVar.f26745g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    gaVar.a();
                    gaVar.f26754q = r6Var.getMeasuredHeight();
                    gaVar.f26755r = r6Var.getMeasuredWidth();
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
        switch (this.f5866a) {
            case 5:
                super.setAlpha(f7);
                View view = ((yn) this.f5868c).fragmentView;
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
                ((d30) this.f5868c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5866a) {
            case 7:
                super.setScaleX(f7);
                ((d30) this.f5868c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5866a) {
            case 7:
                super.setScaleY(f7);
                ((d30) this.f5868c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5866a) {
            case 7:
                super.setTranslationY(f7);
                ((d30) this.f5868c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5866a) {
            case 5:
                super.setVisibility(i10);
                View view = ((yn) this.f5868c).fragmentView;
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
        switch (this.f5866a) {
            case 0:
                if (drawable != ((sg0) this.f5868c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context);
        this.f5866a = 12;
        this.f5868c = new le.b(0, this, tr.h, 380L, true);
        this.f5867b = c5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f5866a = 0;
        Paint paint = new Paint(1);
        this.f5867b = paint;
        sg0 sg0Var = new sg0(10);
        this.f5868c = sg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        sg0Var.setCallback(this);
        sg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(fi.p pVar, Context context) {
        super(context);
        this.f5866a = 1;
        this.f5868c = pVar;
        this.f5867b = new Paint(1);
    }

    public r6(d30 d30Var, Context context) {
        super(context);
        this.f5866a = 7;
        this.f5868c = d30Var;
        this.f5867b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5866a = 17;
        this.f5867b = paint;
        this.f5868c = drawable;
    }

    public r6(bh1 bh1Var, Context context) {
        super(context);
        this.f5866a = 16;
        this.f5868c = bh1Var;
        this.f5867b = new Paint();
    }

    public r6(Context context, rd1 rd1Var) {
        super(context);
        this.f5866a = 15;
        this.f5868c = rd1Var;
        this.f5867b = new Paint(1);
    }

    public r6(yn ynVar, Context context) {
        super(context);
        this.f5866a = 4;
        this.f5868c = ynVar;
        this.f5867b = new RectF();
    }

    public r6(yn ynVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5866a = 5;
        this.f5868c = ynVar;
        org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(view, this, d6Var);
        this.f5867b = gaVar;
        gaVar.f26753p = false;
        gaVar.f26751n = true;
    }

    @Override
    public void V(float f7, int i10) {
    }
}
