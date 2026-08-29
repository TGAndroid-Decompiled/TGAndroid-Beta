package cg;

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
import lh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w20;
import org.telegram.ui.b81;
import org.telegram.ui.cg1;
import org.telegram.ui.d61;
import org.telegram.ui.fd;
import org.telegram.ui.gz;
import org.telegram.ui.hd;
import org.telegram.ui.hs;
import org.telegram.ui.ko;
import org.telegram.ui.lz;
import org.telegram.ui.pe0;
import org.telegram.ui.qc1;
import org.telegram.ui.rn;
import org.telegram.ui.t60;
import org.telegram.ui.tn;
public final class i0 extends View implements vd.b {
    public final int f3156a;
    public final Object f3157b;
    public final Object f3158c;

    public i0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f3156a = i10;
        this.f3158c = obj;
        this.f3157b = obj2;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        if (f9 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f9);
    }

    public boolean a() {
        ca caVar = (ca) this.f3157b;
        if (caVar.f27420t) {
            if ((caVar.f27413m == 1.0f || !caVar.f27416p) && caVar.f27414n && caVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((vd.a) this.f3158c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3156a) {
            case 3:
                RectF rectF = (RectF) this.f3157b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                tn tnVar = (tn) this.f3158c;
                int backgroundSizeY = tnVar.T0.getBackgroundSizeY();
                float x4 = getX();
                float P8 = tnVar.P8(this);
                rn rnVar = tnVar.f42746aa;
                if (rnVar != null) {
                    rnVar.l(x4, P8, measuredWidth, backgroundSizeY);
                } else {
                    g6.q(x4, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), tnVar.getThemedPaint("paintChatActionBackground"));
                rn rnVar2 = tnVar.f42746aa;
                if (rnVar2 == null ? g6.a1() : rnVar2.l0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), tnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((b5) this.f3157b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f9;
        Bitmap[] bitmapArr;
        ?? r02;
        float f10;
        float f11;
        char c3;
        int themedColor;
        int i10;
        switch (this.f3156a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f3157b);
                s1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), s1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f3158c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) this.f3157b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                cg0 cg0Var = (cg0) this.f3158c;
                cg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                cg0Var.draw(canvas);
                canvas.restore();
                return;
            case 2:
                Paint paint2 = (Paint) this.f3157b;
                hd hdVar = (hd) this.f3158c;
                y3 y3Var = hdVar.f38856e;
                if (y3Var != null && y3Var.getImageReceiver().hasNotThumb()) {
                    paint2.setAlpha((int) (hdVar.f38871r.getAlpha() * hdVar.f38856e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                    return;
                }
                return;
            case 3:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                ca caVar = (ca) this.f3157b;
                Paint paint3 = caVar.f27423x;
                c6 c6Var = caVar.f27424y;
                Paint paint4 = caVar.f27422w;
                int i11 = caVar.f27404b;
                View view = caVar.f27405c;
                i0 i0Var = caVar.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !caVar.f27420t && !caVar.f27416p) {
                            caVar.a();
                            caVar.f27412l = false;
                        }
                        Bitmap[] bitmapArr2 = caVar.f27408g;
                        if ((bitmapArr2 != null || caVar.f27415o) && caVar.f27416p) {
                            boolean z10 = caVar.f27414n;
                            if (z10) {
                                float f12 = caVar.f27413m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    caVar.f27413m = f13;
                                    if (f13 > 1.0f) {
                                        caVar.f27413m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = caVar.f27413m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    caVar.f27413m = f15;
                                    if (f15 < 0.0f) {
                                        caVar.f27413m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        if (caVar.f27416p) {
                            f9 = caVar.f27413m;
                        } else {
                            f9 = 1.0f;
                        }
                        if (bitmapArr2 == null && caVar.f27415o) {
                            paint3.setAlpha((int) (50.0f * f9));
                            canvas.drawPaint(paint3);
                            return;
                        }
                        if (f9 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f10 = 0.0f;
                            f11 = 255.0f;
                            c3 = 0;
                        } else {
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f10 = 0.0f;
                            f11 = 255.0f;
                            c3 = 0;
                            canvas.saveLayerAlpha(0.0f, 0.0f, i0Var.getMeasuredWidth(), i0Var.getMeasuredHeight(), (int) (f9 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint4.setAlpha((int) (f9 * f11));
                            if (i11 == r02) {
                                canvas.translate(f10, caVar.f27421u);
                            }
                            canvas.save();
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint4);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, caVar.f27421u);
                            }
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), caVar.f27419s / bitmapArr[c3].getHeight());
                            canvas.drawBitmap(bitmapArr[c3], f10, f10, paint4);
                            canvas.restore();
                            caVar.f27420t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (caVar.f27414n && !caVar.f27411k) {
                            if (caVar.f27408g == null || caVar.f27412l) {
                                caVar.f27411k = r02;
                                caVar.f27412l = false;
                                if (caVar.f27406e == null) {
                                    caVar.f27406e = new Bitmap[2];
                                    caVar.f27410j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (caVar.f27406e[i12] != null && i0Var.getMeasuredWidth() == caVar.f27418r && i0Var.getMeasuredHeight() == caVar.f27417q) {
                                        caVar.f27406e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight2 = i0Var.getMeasuredHeight();
                                        int measuredWidth2 = i0Var.getMeasuredWidth();
                                        int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        caVar.f27419s = dp2;
                                        if (i12 == 0) {
                                            measuredHeight2 = dp2;
                                        }
                                        try {
                                            caVar.f27406e[i12] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                            caVar.f27410j[i12] = new Canvas(caVar.f27406e[i12]);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            AndroidUtilities.runOnUIThread(new ig(caVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        caVar.f27406e[i12].eraseColor(g6.v0(g6.f23062d6, c6Var));
                                    }
                                    caVar.f27410j[i12].save();
                                    caVar.f27410j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (c6Var instanceof rn) {
                                            background = ((rn) c6Var).d();
                                        } else {
                                            background = g6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        caVar.f27410j[i12].translate(f10, -caVar.f27421u);
                                        view.draw(caVar.f27410j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(caVar.f27410j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(caVar.f27410j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    caVar.f27410j[i12].restore();
                                }
                                caVar.f27417q = i0Var.getMeasuredHeight();
                                caVar.f27418r = i0Var.getMeasuredWidth();
                                caVar.v.f27015b = i0Var.getMeasuredWidth();
                                caVar.v.f27016c = i0Var.getMeasuredHeight();
                                ba baVar = caVar.v;
                                if (baVar.f27015b != 0 && baVar.f27016c != 0) {
                                    if (caVar.f27403a == null) {
                                        caVar.f27403a = new DispatchQueue("blur_thread_" + caVar);
                                    }
                                    caVar.f27403a.postRunnable(caVar.v);
                                    return;
                                }
                                caVar.f27411k = false;
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
                Paint paint5 = (Paint) this.f3157b;
                ko koVar = (ko) this.f3158c;
                y3 y3Var2 = koVar.f39945e;
                if (y3Var2 != null && y3Var2.getImageReceiver().hasNotThumb()) {
                    paint5.setAlpha((int) (koVar.f39945e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    return;
                }
                return;
            case 6:
                Paint paint6 = (Paint) this.f3157b;
                w20 w20Var = (w20) this.f3158c;
                boolean z11 = w20Var.f34285y;
                if (z11) {
                    float f16 = w20Var.A;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        w20Var.A = f17;
                        if (f17 > 1.0f) {
                            w20Var.A = 1.0f;
                        }
                        invalidate();
                        paint6.setColor(i0.a.d(w20Var.A, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * w20Var.A) + AndroidUtilities.dp(35.0f), paint6);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = w20Var.A;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        w20Var.A = f19;
                        if (f19 < 0.0f) {
                            w20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint6.setColor(i0.a.d(w20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * w20Var.A) + AndroidUtilities.dp(35.0f), paint6);
                return;
            case 7:
                canvas.drawColor(855638016);
                r80 r80Var = (r80) this.f3158c;
                FrameLayout frameLayout = r80Var.f32236n;
                float[] fArr = r80Var.E;
                r80.a(frameLayout, (FrameLayout) this.f3157b, fArr);
                canvas.save();
                float y8 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y8 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y8) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 8:
                Paint paint7 = (Paint) this.f3157b;
                hs hsVar = (hs) this.f3158c;
                t9 t9Var = hsVar.f39006e;
                if (t9Var != null && t9Var.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (hsVar.f39006e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                lz lzVar = (lz) this.f3158c;
                FrameLayout frameLayout2 = lzVar.f38693a;
                float[] fArr2 = lzVar.f38703y;
                gz.a(frameLayout2, (FrameLayout) this.f3157b, fArr2);
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
                Paint paint8 = (Paint) this.f3157b;
                t60 t60Var = (t60) this.f3158c;
                if (t60Var.d != null && t60Var.f42562n.getVisibility() == 0 && t60Var.d.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (t60Var.f42562n.getAlpha() * t60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 12:
                Paint paint9 = (Paint) this.f3157b;
                pe0 pe0Var = (pe0) this.f3158c;
                fd fdVar = pe0Var.f41391r;
                y3 y3Var3 = pe0Var.f41388e;
                if (y3Var3 != null && fdVar.getVisibility() == 0) {
                    paint9.setAlpha((int) (fdVar.getAlpha() * y3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 13:
                if (!((d61) this.f3158c).M0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(g6.v0(g6.G8, (c6) this.f3157b));
                    return;
                }
            case 14:
                b81 b81Var = (b81) this.f3158c;
                int height = b81.g0(b81Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint10 = (Paint) this.f3157b;
                paint10.setColor(g6.v0(g6.f23329s8, b81.h0(b81Var)));
                b81Var.f36718b.J(canvas, 0.0f, rect, paint10, true);
                if (b81Var.getParentLayout() != null) {
                    ((ActionBarLayout) b81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                qc1 qc1Var = (qc1) this.f3158c;
                int currentItem = qc1Var.f41642f0.getCurrentItem();
                Paint paint11 = (Paint) this.f3157b;
                int i13 = g6.Ae;
                if (qc1Var.d) {
                    themedColor = g6.C0(i13);
                } else {
                    themedColor = qc1Var.getThemedColor(i13);
                }
                paint11.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint11.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint11);
                }
                return;
            case 16:
                Paint paint12 = (Paint) this.f3157b;
                paint12.setColor(g6.w0(null, g6.f23062d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint12);
                ((ActionBarLayout) cg1.s0((cg1) this.f3158c)).q(canvas, measuredHeight3);
                return;
            case 17:
                Paint paint13 = (Paint) this.f3157b;
                qh.n nVar = (qh.n) this.f3158c;
                t9 t9Var2 = nVar.v;
                if (t9Var2 != null && t9Var2.getImageReceiver().hasNotThumb()) {
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
        switch (this.f3156a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f3156a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ca caVar = (ca) this.f3157b;
                i0 i0Var = caVar.d;
                if (caVar.f27408g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    caVar.a();
                    caVar.f27417q = i0Var.getMeasuredHeight();
                    caVar.f27418r = i0Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f3156a) {
            case 4:
                super.setAlpha(f9);
                View view = ((tn) this.f3158c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
            default:
                super.setAlpha(f9);
                return;
            case 6:
                super.setAlpha(f9);
                ((w20) this.f3158c).d.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setScaleX(float f9) {
        switch (this.f3156a) {
            case 6:
                super.setScaleX(f9);
                ((w20) this.f3158c).d.setScaleX(f9);
                return;
            default:
                super.setScaleX(f9);
                return;
        }
    }

    @Override
    public void setScaleY(float f9) {
        switch (this.f3156a) {
            case 6:
                super.setScaleY(f9);
                ((w20) this.f3158c).d.setScaleY(f9);
                return;
            default:
                super.setScaleY(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f3156a) {
            case 6:
                super.setTranslationY(f9);
                ((w20) this.f3158c).d.setTranslationY(f9);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f3156a) {
            case 4:
                super.setVisibility(i10);
                View view = ((tn) this.f3158c).fragmentView;
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
        switch (this.f3156a) {
            case 1:
                if (drawable != ((cg0) this.f3158c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i0(Context context, b5 b5Var) {
        super(context);
        this.f3156a = 11;
        this.f3158c = new vd.a(0, this, jr.h, 380L, true);
        this.f3157b = b5Var;
    }

    public i0(Activity activity) {
        super(activity);
        this.f3156a = 1;
        Paint paint = new Paint(1);
        this.f3157b = paint;
        cg0 cg0Var = new cg0(10);
        this.f3158c = cg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        cg0Var.setCallback(this);
        cg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public i0(qh.n nVar, Context context) {
        super(context);
        this.f3156a = 17;
        this.f3158c = nVar;
        this.f3157b = new Paint(1);
    }

    public i0(w20 w20Var, Context context) {
        super(context);
        this.f3156a = 6;
        this.f3158c = w20Var;
        this.f3157b = new Paint(1);
    }

    public i0(b81 b81Var, Context context) {
        super(context);
        this.f3156a = 14;
        this.f3158c = b81Var;
        this.f3157b = new Paint(1);
    }

    public i0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f3156a = 0;
        this.f3157b = paint;
        this.f3158c = drawable;
    }

    public i0(cg1 cg1Var, Context context) {
        super(context);
        this.f3156a = 16;
        this.f3158c = cg1Var;
        this.f3157b = new Paint();
    }

    public i0(Context context, qc1 qc1Var) {
        super(context);
        this.f3156a = 15;
        this.f3158c = qc1Var;
        this.f3157b = new Paint(1);
    }

    public i0(tn tnVar, Context context) {
        super(context);
        this.f3156a = 3;
        this.f3158c = tnVar;
        this.f3157b = new RectF();
    }

    public i0(tn tnVar, Context context, View view, c6 c6Var) {
        super(context);
        this.f3156a = 4;
        this.f3158c = tnVar;
        ca caVar = new ca(view, this, c6Var);
        this.f3157b = caVar;
        caVar.f27416p = false;
        caVar.f27414n = true;
    }

    @Override
    public void z(float f9, int i10) {
    }
}
