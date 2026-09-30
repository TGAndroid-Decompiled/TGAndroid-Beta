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
import org.telegram.ui.a71;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.ms;
import org.telegram.ui.od1;
import org.telegram.ui.ro;
import org.telegram.ui.rz;
import org.telegram.ui.un;
import org.telegram.ui.wn;
import org.telegram.ui.wz;
import org.telegram.ui.z81;
import org.telegram.ui.zg1;
public final class r6 extends View implements le.e {
    public final int f5465a;
    public final Object f5466b;
    public final Object f5467c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5465a = i10;
        this.f5467c = obj;
        this.f5466b = obj2;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
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
        org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5466b;
        if (gaVar.f24501t) {
            if ((gaVar.f24494m == 1.0f || !gaVar.f24497p) && gaVar.f24495n && gaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.c) this.f5467c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5465a) {
            case 3:
                RectF rectF = (RectF) this.f5466b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                wn wnVar = (wn) this.f5467c;
                int backgroundSizeY = wnVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = wnVar.P8(this);
                un unVar = wnVar.f39562ea;
                if (unVar != null) {
                    unVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackground"));
                un unVar2 = wnVar.f39562ea;
                if (unVar2 == null ? org.telegram.ui.ActionBar.h6.a1() : unVar2.p0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) this.f5466b)).q(canvas, 0);
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
        switch (this.f5465a) {
            case 0:
                Paint paint = (Paint) this.f5466b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                sg0 sg0Var = (sg0) this.f5467c;
                sg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                sg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5466b;
                fi.p pVar = (fi.p) this.f5467c;
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f5466b;
                org.telegram.ui.ld ldVar = (org.telegram.ui.ld) this.f5467c;
                ai.y5 y5Var = ldVar.e;
                if (y5Var != null && y5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ldVar.f35411r.getAlpha() * ldVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5466b;
                Paint paint4 = gaVar.f24504x;
                org.telegram.ui.ActionBar.d6 d6Var = gaVar.f24505y;
                Paint paint5 = gaVar.f24503w;
                int i11 = gaVar.f24486b;
                View view = gaVar.f24487c;
                r6 r6Var = gaVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !gaVar.f24501t && !gaVar.f24497p) {
                            gaVar.a();
                            gaVar.f24493l = false;
                        }
                        Bitmap[] bitmapArr2 = gaVar.f24489g;
                        if ((bitmapArr2 != null || gaVar.f24496o) && gaVar.f24497p) {
                            boolean z10 = gaVar.f24495n;
                            if (z10) {
                                float f12 = gaVar.f24494m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    gaVar.f24494m = f13;
                                    if (f13 > 1.0f) {
                                        gaVar.f24494m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = gaVar.f24494m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    gaVar.f24494m = f15;
                                    if (f15 < 0.0f) {
                                        gaVar.f24494m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (gaVar.f24497p) {
                            f7 = gaVar.f24494m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && gaVar.f24496o) {
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
                                canvas.translate(f10, gaVar.f24502u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, gaVar.f24502u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), gaVar.f24500s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            gaVar.f24501t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (gaVar.f24495n && !gaVar.f24492k) {
                            if (gaVar.f24489g == null || gaVar.f24493l) {
                                gaVar.f24492k = r02;
                                gaVar.f24493l = false;
                                if (gaVar.e == null) {
                                    gaVar.e = new Bitmap[2];
                                    gaVar.f24491j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (gaVar.e[i12] != null && r6Var.getMeasuredWidth() == gaVar.f24499r && r6Var.getMeasuredHeight() == gaVar.f24498q) {
                                        gaVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        gaVar.f24500s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            gaVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            gaVar.f24491j[i12] = new Canvas(gaVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new qg(gaVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        gaVar.e[i12].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var));
                                    }
                                    gaVar.f24491j[i12].save();
                                    gaVar.f24491j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (d6Var instanceof un) {
                                            background = ((un) d6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.h6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        gaVar.f24491j[i12].translate(f10, -gaVar.f24502u);
                                        view.draw(gaVar.f24491j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(gaVar.f24491j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(gaVar.f24491j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    gaVar.f24491j[i12].restore();
                                }
                                gaVar.f24498q = r6Var.getMeasuredHeight();
                                gaVar.f24499r = r6Var.getMeasuredWidth();
                                gaVar.v.f24257b = r6Var.getMeasuredWidth();
                                gaVar.v.f24258c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.fa faVar = gaVar.v;
                                if (faVar.f24257b != 0 && faVar.f24258c != 0) {
                                    if (gaVar.f24485a == null) {
                                        gaVar.f24485a = new DispatchQueue("blur_thread_" + gaVar);
                                    }
                                    gaVar.f24485a.postRunnable(gaVar.v);
                                    return;
                                }
                                gaVar.f24492k = false;
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
                Paint paint6 = (Paint) this.f5466b;
                ro roVar = (ro) this.f5467c;
                ai.y5 y5Var2 = roVar.e;
                if (y5Var2 != null && y5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (roVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f5466b;
                d30 d30Var = (d30) this.f5467c;
                boolean z11 = d30Var.f23511y;
                if (z11) {
                    float f16 = d30Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        d30Var.E = f17;
                        if (f17 > 1.0f) {
                            d30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = d30Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        d30Var.E = f19;
                        if (f19 < 0.0f) {
                            d30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                j90 j90Var = (j90) this.f5467c;
                FrameLayout frameLayout = j90Var.f25374n;
                float[] fArr = j90Var.I;
                j90.a(frameLayout, (FrameLayout) this.f5466b, fArr);
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
                Paint paint8 = (Paint) this.f5466b;
                ms msVar = (ms) this.f5467c;
                org.telegram.ui.Components.w9 w9Var2 = msVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (msVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                wz wzVar = (wz) this.f5467c;
                FrameLayout frameLayout2 = wzVar.f37637a;
                float[] fArr2 = wzVar.f37646y;
                rz.a(frameLayout2, (FrameLayout) this.f5466b, fArr2);
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
                Paint paint9 = (Paint) this.f5466b;
                g70 g70Var = (g70) this.f5467c;
                if (g70Var.d != null && g70Var.f33980n.getVisibility() == 0 && g70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (g70Var.f33980n.getAlpha() * g70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f5466b;
                bf0 bf0Var = (bf0) this.f5467c;
                org.telegram.ui.jd jdVar = bf0Var.f32485r;
                ai.y5 y5Var3 = bf0Var.e;
                if (y5Var3 != null && jdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (jdVar.getAlpha() * y5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((a71) this.f5467c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f5466b));
                    return;
                }
            case 14:
                z81 z81Var = (z81) this.f5467c;
                int height = z81.g0(z81Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5466b;
                paint11.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19354s8, z81.h0(z81Var)));
                z81Var.f40520b.J(canvas, 0.0f, rect, paint11, true);
                if (z81Var.getParentLayout() != null) {
                    ((ActionBarLayout) z81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                od1 od1Var = (od1) this.f5467c;
                int currentItem = od1Var.f36319j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5466b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                if (od1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.h6.C0(i13);
                } else {
                    themedColor = od1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f5466b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) zg1.s0((zg1) this.f5467c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5466b);
                rg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5467c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5465a) {
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
        switch (this.f5465a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.f5466b;
                r6 r6Var = gaVar.d;
                if (gaVar.f24489g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    gaVar.a();
                    gaVar.f24498q = r6Var.getMeasuredHeight();
                    gaVar.f24499r = r6Var.getMeasuredWidth();
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
        switch (this.f5465a) {
            case 4:
                super.setAlpha(f7);
                View view = ((wn) this.f5467c).fragmentView;
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
                ((d30) this.f5467c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5465a) {
            case 6:
                super.setScaleX(f7);
                ((d30) this.f5467c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5465a) {
            case 6:
                super.setScaleY(f7);
                ((d30) this.f5467c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5465a) {
            case 6:
                super.setTranslationY(f7);
                ((d30) this.f5467c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5465a) {
            case 4:
                super.setVisibility(i10);
                View view = ((wn) this.f5467c).fragmentView;
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
        switch (this.f5465a) {
            case 0:
                if (drawable != ((sg0) this.f5467c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f5465a = 11;
        this.f5467c = new le.c(0, this, tr.h, 380L, true);
        this.f5466b = b5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f5465a = 0;
        Paint paint = new Paint(1);
        this.f5466b = paint;
        sg0 sg0Var = new sg0(10);
        this.f5467c = sg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        sg0Var.setCallback(this);
        sg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(fi.p pVar, Context context) {
        super(context);
        this.f5465a = 1;
        this.f5467c = pVar;
        this.f5466b = new Paint(1);
    }

    public r6(d30 d30Var, Context context) {
        super(context);
        this.f5465a = 6;
        this.f5467c = d30Var;
        this.f5466b = new Paint(1);
    }

    public r6(z81 z81Var, Context context) {
        super(context);
        this.f5465a = 14;
        this.f5467c = z81Var;
        this.f5466b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5465a = 17;
        this.f5466b = paint;
        this.f5467c = drawable;
    }

    public r6(zg1 zg1Var, Context context) {
        super(context);
        this.f5465a = 16;
        this.f5467c = zg1Var;
        this.f5466b = new Paint();
    }

    public r6(Context context, od1 od1Var) {
        super(context);
        this.f5465a = 15;
        this.f5467c = od1Var;
        this.f5466b = new Paint(1);
    }

    public r6(wn wnVar, Context context) {
        super(context);
        this.f5465a = 3;
        this.f5467c = wnVar;
        this.f5466b = new RectF();
    }

    public r6(wn wnVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5465a = 4;
        this.f5467c = wnVar;
        org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(view, this, d6Var);
        this.f5466b = gaVar;
        gaVar.f24497p = false;
        gaVar.f24495n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
