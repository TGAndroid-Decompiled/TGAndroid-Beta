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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tg;
import org.telegram.ui.bo;
import org.telegram.ui.c00;
import org.telegram.ui.eo;
import org.telegram.ui.hf0;
import org.telegram.ui.k91;
import org.telegram.ui.kh1;
import org.telegram.ui.l70;
import org.telegram.ui.n71;
import org.telegram.ui.od;
import org.telegram.ui.qd;
import org.telegram.ui.ts;
import org.telegram.ui.xo;
import org.telegram.ui.xz;
import org.telegram.ui.zd1;
public final class r6 extends View implements me.d {
    public final int f5904a;
    public final Object f5905b;
    public final Object f5906c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5904a = i10;
        this.f5906c = obj;
        this.f5905b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f5905b;
        if (haVar.f26727t) {
            if ((haVar.f26720m == 1.0f || !haVar.f26723p) && haVar.f26721n && haVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((me.b) this.f5906c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5904a) {
            case 3:
                RectF rectF = (RectF) this.f5905b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                eo eoVar = (eo) this.f5906c;
                int backgroundSizeY = eoVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = eoVar.U8(this);
                bo boVar = eoVar.f37256ea;
                if (boVar != null) {
                    boVar.m(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackground"));
                bo boVar2 = eoVar.f37256ea;
                if (boVar2 == null ? org.telegram.ui.ActionBar.h6.b1() : boVar2.l0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) this.f5905b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
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
        switch (this.f5904a) {
            case 0:
                Paint paint = (Paint) this.f5905b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                kh0 kh0Var = (kh0) this.f5906c;
                kh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                kh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5905b;
                fi.p pVar = (fi.p) this.f5906c;
                org.telegram.ui.Components.y9 y9Var = pVar.v;
                if (y9Var != null && y9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f5905b;
                qd qdVar = (qd) this.f5906c;
                ai.z5 z5Var = qdVar.f41281e;
                if (z5Var != null && z5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (qdVar.f41296r.getAlpha() * qdVar.f41281e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f5905b;
                Paint paint4 = haVar.f26730x;
                org.telegram.ui.ActionBar.c6 c6Var = haVar.f26731y;
                Paint paint5 = haVar.f26729w;
                int i11 = haVar.f26711b;
                View view = haVar.f26712c;
                r6 r6Var = haVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !haVar.f26727t && !haVar.f26723p) {
                            haVar.a();
                            haVar.f26719l = false;
                        }
                        Bitmap[] bitmapArr2 = haVar.f26715g;
                        if ((bitmapArr2 != null || haVar.f26722o) && haVar.f26723p) {
                            boolean z10 = haVar.f26721n;
                            if (z10) {
                                float f11 = haVar.f26720m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    haVar.f26720m = f12;
                                    if (f12 > 1.0f) {
                                        haVar.f26720m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = haVar.f26720m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    haVar.f26720m = f14;
                                    if (f14 < 0.0f) {
                                        haVar.f26720m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (haVar.f26723p) {
                            f7 = haVar.f26720m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && haVar.f26722o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, haVar.f26728u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, haVar.f26728u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), haVar.f26726s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            haVar.f26727t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (haVar.f26721n && !haVar.f26718k) {
                            if (haVar.f26715g == null || haVar.f26719l) {
                                haVar.f26718k = r02;
                                haVar.f26719l = r16;
                                if (haVar.f26713e == null) {
                                    haVar.f26713e = new Bitmap[2];
                                    haVar.f26717j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (haVar.f26713e[i12] != null && r6Var.getMeasuredWidth() == haVar.f26725r && r6Var.getMeasuredHeight() == haVar.f26724q) {
                                        haVar.f26713e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        haVar.f26726s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            haVar.f26713e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            haVar.f26717j[i12] = new Canvas(haVar.f26713e[i12]);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            AndroidUtilities.runOnUIThread(new tg(haVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        haVar.f26713e[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                                    }
                                    haVar.f26717j[i12].save();
                                    haVar.f26717j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (c6Var instanceof bo) {
                                            background = ((bo) c6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.h6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        haVar.f26717j[i12].translate(f10, -haVar.f26728u);
                                        view.draw(haVar.f26717j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(haVar.f26717j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(haVar.f26717j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    haVar.f26717j[i12].restore();
                                }
                                haVar.f26724q = r6Var.getMeasuredHeight();
                                haVar.f26725r = r6Var.getMeasuredWidth();
                                haVar.v.f26376b = r6Var.getMeasuredWidth();
                                haVar.v.f26377c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ga gaVar = haVar.v;
                                if (gaVar.f26376b != 0 && gaVar.f26377c != 0) {
                                    if (haVar.f26710a == null) {
                                        haVar.f26710a = new DispatchQueue("blur_thread_" + haVar);
                                    }
                                    haVar.f26710a.postRunnable(haVar.v);
                                    return;
                                }
                                haVar.f26718k = false;
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
                Paint paint6 = (Paint) this.f5905b;
                xo xoVar = (xo) this.f5906c;
                ai.z5 z5Var2 = xoVar.f44059e;
                if (z5Var2 != null && z5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (xoVar.f44059e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f5905b;
                t30 t30Var = (t30) this.f5906c;
                boolean z11 = t30Var.f30757y;
                if (z11) {
                    float f15 = t30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        t30Var.E = f16;
                        if (f16 > 1.0f) {
                            t30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(t30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * t30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = t30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        t30Var.E = f18;
                        if (f18 < 0.0f) {
                            t30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(t30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * t30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                ba0 ba0Var = (ba0) this.f5906c;
                FrameLayout frameLayout = ba0Var.f24585n;
                float[] fArr = ba0Var.I;
                ba0.a(frameLayout, (FrameLayout) this.f5905b, fArr);
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
                Paint paint8 = (Paint) this.f5905b;
                ts tsVar = (ts) this.f5906c;
                org.telegram.ui.Components.y9 y9Var2 = tsVar.f42278e;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (tsVar.f42278e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                c00 c00Var = (c00) this.f5906c;
                FrameLayout frameLayout2 = c00Var.f44208a;
                float[] fArr2 = c00Var.f44218y;
                xz.a(frameLayout2, (FrameLayout) this.f5905b, fArr2);
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
                Paint paint9 = (Paint) this.f5905b;
                l70 l70Var = (l70) this.f5906c;
                if (l70Var.d != null && l70Var.f39649n.getVisibility() == 0 && l70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (l70Var.f39649n.getAlpha() * l70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f5905b;
                hf0 hf0Var = (hf0) this.f5906c;
                od odVar = hf0Var.f38359r;
                ai.z5 z5Var3 = hf0Var.f38356e;
                if (z5Var3 != null && odVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (odVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((n71) this.f5906c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.c6) this.f5905b));
                    return;
                }
            case 14:
                k91 k91Var = (k91) this.f5906c;
                int height = k91.g0(k91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5905b;
                paint11.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20840s8, k91.h0(k91Var)));
                k91Var.f39418b.J(canvas, 0.0f, rect, paint11, true);
                if (k91Var.getParentLayout() != null) {
                    ((ActionBarLayout) k91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                zd1 zd1Var = (zd1) this.f5906c;
                int currentItem = zd1Var.f44765j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5905b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                if (zd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.h6.D0(i13);
                } else {
                    themedColor = zd1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f5905b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) kh1.s0((kh1) this.f5906c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5905b);
                rg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5906c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5904a) {
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
        switch (this.f5904a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f5905b;
                r6 r6Var = haVar.d;
                if (haVar.f26715g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    haVar.a();
                    haVar.f26724q = r6Var.getMeasuredHeight();
                    haVar.f26725r = r6Var.getMeasuredWidth();
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
        switch (this.f5904a) {
            case 4:
                super.setAlpha(f7);
                View view = ((eo) this.f5906c).fragmentView;
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
                ((t30) this.f5906c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5904a) {
            case 6:
                super.setScaleX(f7);
                ((t30) this.f5906c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5904a) {
            case 6:
                super.setScaleY(f7);
                ((t30) this.f5906c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5904a) {
            case 6:
                super.setTranslationY(f7);
                ((t30) this.f5906c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5904a) {
            case 4:
                super.setVisibility(i10);
                View view = ((eo) this.f5906c).fragmentView;
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
        switch (this.f5904a) {
            case 0:
                if (drawable != ((kh0) this.f5906c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f5904a = 11;
        this.f5906c = new me.b(0, this, js.h, 380L, true);
        this.f5905b = b5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f5904a = 0;
        Paint paint = new Paint(1);
        this.f5905b = paint;
        kh0 kh0Var = new kh0(10);
        this.f5906c = kh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        kh0Var.setCallback(this);
        kh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(fi.p pVar, Context context) {
        super(context);
        this.f5904a = 1;
        this.f5906c = pVar;
        this.f5905b = new Paint(1);
    }

    public r6(t30 t30Var, Context context) {
        super(context);
        this.f5904a = 6;
        this.f5906c = t30Var;
        this.f5905b = new Paint(1);
    }

    public r6(k91 k91Var, Context context) {
        super(context);
        this.f5904a = 14;
        this.f5906c = k91Var;
        this.f5905b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5904a = 17;
        this.f5905b = paint;
        this.f5906c = drawable;
    }

    public r6(kh1 kh1Var, Context context) {
        super(context);
        this.f5904a = 16;
        this.f5906c = kh1Var;
        this.f5905b = new Paint();
    }

    public r6(Context context, zd1 zd1Var) {
        super(context);
        this.f5904a = 15;
        this.f5906c = zd1Var;
        this.f5905b = new Paint(1);
    }

    public r6(eo eoVar, Context context) {
        super(context);
        this.f5904a = 3;
        this.f5906c = eoVar;
        this.f5905b = new RectF();
    }

    public r6(eo eoVar, Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f5904a = 4;
        this.f5906c = eoVar;
        org.telegram.ui.Components.ha haVar = new org.telegram.ui.Components.ha(view, this, c6Var);
        this.f5905b = haVar;
        haVar.f26723p = false;
        haVar.f26721n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
