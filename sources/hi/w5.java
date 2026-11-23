package hi;

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.a20;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.cy;
import org.telegram.ui.e50;
import org.telegram.ui.hy;
import org.telegram.ui.oc0;
import org.telegram.ui.q11;
import org.telegram.ui.qr;
import org.telegram.ui.rn;
import org.telegram.ui.v71;
import org.telegram.ui.yc;
import org.telegram.ui.za1;
import org.telegram.ui.zm;
public final class w5 extends View implements te.b {
    public final int f15676a;
    public Object f15677b;
    public final Object f15678c;

    public w5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f15676a = i7;
        this.f15678c = obj;
        this.f15677b = obj2;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) this.f15677b;
        if (z9Var.f42774t) {
            if ((z9Var.f42767m == 1.0f || !z9Var.f42770p) && z9Var.f42768n && z9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15676a) {
            case 4:
                RectF rectF = (RectF) this.f15677b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                bn bnVar = (bn) this.f15678c;
                int backgroundSizeY = bnVar.f46279m1.getBackgroundSizeY();
                float x10 = getX();
                float l92 = bnVar.l9(this);
                zm zmVar = bnVar.Ba;
                if (zmVar != null) {
                    zmVar.c(x10, l92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.n6.r(x10, l92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackground"));
                zm zmVar2 = bnVar.Ba;
                if (zmVar2 == null ? org.telegram.ui.ActionBar.n6.d1() : zmVar2.h()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                a20 a20Var = (a20) this.f15678c;
                hr hrVar = a20Var.f41007d0;
                float measuredWidth2 = (1.0f - hrVar.f35796g) * a20Var.f41009e0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f15677b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((a20Var.f41011f0.getMeasuredWidth() * hrVar.f35796g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.r4) this.f15677b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f15676a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f15677b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f15676a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f15677b).jumpToCurrentState();
                return;
            default:
                super.jumpDrawablesToCurrentState();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        Bitmap[] bitmapArr;
        float f11;
        ?? r16;
        ?? r15;
        int themedColor;
        int i7;
        switch (this.f15676a) {
            case 0:
                Paint paint = (Paint) this.f15677b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                ve0 ve0Var = (ve0) this.f15678c;
                ve0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                ve0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f15677b;
                li.o oVar = (li.o) this.f15678c;
                org.telegram.ui.Components.p9 p9Var = oVar.f20080x;
                if (p9Var != null && p9Var.getImageReceiver().M()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.f20080x.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f15677b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.j8) this.f15678c).f49022f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f15677b;
                ad adVar = (ad) this.f15678c;
                fi.t3 t3Var = adVar.f45667f;
                if (t3Var != null && t3Var.getImageReceiver().M()) {
                    paint3.setAlpha((int) (adVar.f45682s.getAlpha() * adVar.f45667f.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    return;
                }
                return;
            case 4:
            case 9:
            case 13:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) this.f15677b;
                Paint paint4 = z9Var.f42777x;
                org.telegram.ui.ActionBar.i6 i6Var = z9Var.f42778y;
                Paint paint5 = z9Var.f42776w;
                int i11 = z9Var.f42758b;
                View view = z9Var.f42759c;
                w5 w5Var = z9Var.d;
                if (w5Var != null) {
                    if (w5Var.getMeasuredHeight() != 0 || w5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !z9Var.f42774t && !z9Var.f42770p) {
                            z9Var.a();
                            z9Var.f42766l = false;
                        }
                        Bitmap[] bitmapArr2 = z9Var.f42762g;
                        if ((bitmapArr2 != null || z9Var.f42769o) && z9Var.f42770p) {
                            boolean z10 = z9Var.f42768n;
                            if (z10) {
                                float f12 = z9Var.f42767m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    z9Var.f42767m = f13;
                                    if (f13 > 1.0f) {
                                        z9Var.f42767m = 1.0f;
                                    }
                                    w5Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = z9Var.f42767m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    z9Var.f42767m = f15;
                                    if (f15 < 0.0f) {
                                        z9Var.f42767m = 0.0f;
                                    }
                                    w5Var.invalidate();
                                }
                            }
                        }
                        if (z9Var.f42770p) {
                            f10 = z9Var.f42767m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && z9Var.f42769o) {
                            paint4.setAlpha((int) (50.0f * f10));
                            canvas.drawPaint(paint4);
                            return;
                        }
                        if (f10 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            f11 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                        } else {
                            bitmapArr = bitmapArr2;
                            f11 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                            canvas.saveLayerAlpha(0.0f, 0.0f, w5Var.getMeasuredWidth(), w5Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f10 * 255.0f));
                            if (i11 == r15) {
                                canvas.translate(f11, z9Var.f42775u);
                            }
                            canvas.save();
                            canvas.scale(w5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), w5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, z9Var.f42775u);
                            }
                            canvas.scale(w5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), z9Var.f42773s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            z9Var.f42774t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (z9Var.f42768n && !z9Var.f42765k) {
                            if (z9Var.f42762g == null || z9Var.f42766l) {
                                z9Var.f42765k = r15;
                                z9Var.f42766l = r16;
                                if (z9Var.f42760e == null) {
                                    z9Var.f42760e = new Bitmap[2];
                                    z9Var.f42764j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (z9Var.f42760e[i12] != null && w5Var.getMeasuredWidth() == z9Var.f42772r && w5Var.getMeasuredHeight() == z9Var.f42771q) {
                                        z9Var.f42760e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = w5Var.getMeasuredHeight();
                                        int measuredWidth = w5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24220m;
                                        z9Var.f42773s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            z9Var.f42760e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            z9Var.f42764j[i12] = new Canvas(z9Var.f42760e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.g3(new ng(z9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        z9Var.f42760e[i12].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var));
                                    }
                                    z9Var.f42764j[i12].save();
                                    z9Var.f42764j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (i6Var instanceof zm) {
                                            background = ((zm) i6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.n6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        z9Var.f42764j[i12].translate(f11, -z9Var.f42775u);
                                        view.draw(z9Var.f42764j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(z9Var.f42764j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(z9Var.f42764j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    z9Var.f42764j[i12].restore();
                                }
                                z9Var.f42771q = w5Var.getMeasuredHeight();
                                z9Var.f42772r = w5Var.getMeasuredWidth();
                                z9Var.v.f42381b = w5Var.getMeasuredWidth();
                                z9Var.v.f42382c = w5Var.getMeasuredHeight();
                                org.telegram.ui.Components.y9 y9Var = z9Var.v;
                                if (y9Var.f42381b != 0 && y9Var.f42382c != 0) {
                                    if (z9Var.f42757a == null) {
                                        z9Var.f42757a = new org.telegram.messenger.r5("blur_thread_" + z9Var, (boolean) r15);
                                    }
                                    z9Var.f42757a.postRunnable(z9Var.v);
                                    return;
                                }
                                z9Var.f42765k = false;
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
                Paint paint6 = (Paint) this.f15677b;
                rn rnVar = (rn) this.f15678c;
                fi.t3 t3Var2 = rnVar.f51771e;
                if (t3Var2 != null && t3Var2.getImageReceiver().M()) {
                    paint6.setAlpha((int) (rnVar.f51771e.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f15677b;
                org.telegram.ui.Components.a20 a20Var = (org.telegram.ui.Components.a20) this.f15678c;
                boolean z11 = a20Var.F;
                if (z11) {
                    float f16 = a20Var.G;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        a20Var.G = f17;
                        if (f17 > 1.0f) {
                            a20Var.G = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(a20Var.G, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * a20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = a20Var.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        a20Var.G = f19;
                        if (f19 < 0.0f) {
                            a20Var.G = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(a20Var.G, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * a20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                d80 d80Var = (d80) this.f15678c;
                FrameLayout frameLayout = d80Var.f34239n;
                float[] fArr = d80Var.J;
                d80.a(frameLayout, (FrameLayout) this.f15677b, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 10:
                Paint paint8 = (Paint) this.f15677b;
                qr qrVar = (qr) this.f15678c;
                org.telegram.ui.Components.p9 p9Var2 = qrVar.f51521e;
                if (p9Var2 != null && p9Var2.getImageReceiver().M()) {
                    paint8.setAlpha((int) (qrVar.f51521e.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                hy hyVar = (hy) this.f15678c;
                FrameLayout frameLayout2 = hyVar.f46896a;
                float[] fArr2 = hyVar.E;
                cy.a(frameLayout2, (FrameLayout) this.f15677b, fArr2);
                canvas.save();
                float y11 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 12:
                Paint paint9 = (Paint) this.f15677b;
                e50 e50Var = (e50) this.f15678c;
                if (e50Var.d != null && e50Var.f47441n.getVisibility() == 0 && e50Var.d.getImageReceiver().M()) {
                    paint9.setAlpha((int) (e50Var.f47441n.getAlpha() * e50Var.d.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f15677b;
                oc0 oc0Var = (oc0) this.f15678c;
                yc ycVar = oc0Var.f50657r;
                fi.t3 t3Var3 = oc0Var.f50654e;
                if (t3Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * t3Var3.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((q11) this.f15678c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, (org.telegram.ui.ActionBar.i6) this.f15677b));
                    return;
                }
            case 16:
                v71 v71Var = (v71) this.f15678c;
                int currentItem = v71Var.f52882l0.getCurrentItem();
                Paint paint11 = (Paint) this.f15677b;
                int i13 = org.telegram.ui.ActionBar.n6.f29737sf;
                if (v71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.n6.F0(i13);
                } else {
                    themedColor = v71Var.getThemedColor(i13);
                }
                paint11.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i7 = 255;
                    } else {
                        i7 = 127;
                    }
                    paint11.setAlpha(i7);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i14 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                }
                return;
            case 17:
                Paint paint12 = (Paint) this.f15677b;
                paint12.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) za1.x0((za1) this.f15678c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.q6 q6Var = ((org.telegram.ui.Wallet.t6) this.f15678c).f45168b;
                if (q6Var != null) {
                    q6Var.e(canvas, (float[]) this.f15677b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.g8.a(-16216082, (float[]) this.f15677b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f15677b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f15678c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15676a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f15676a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) this.f15677b;
                w5 w5Var = z9Var.d;
                if (z9Var.f42762g != null && w5Var.getMeasuredHeight() != 0 && w5Var.getMeasuredWidth() != 0) {
                    z9Var.a();
                    z9Var.f42771q = w5Var.getMeasuredHeight();
                    z9Var.f42772r = w5Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f15676a) {
            case 5:
                super.setAlpha(f10);
                View view = ((bn) this.f15678c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
            default:
                super.setAlpha(f10);
                return;
            case 7:
                super.setAlpha(f10);
                ((org.telegram.ui.Components.a20) this.f15678c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f15676a) {
            case 7:
                super.setScaleX(f10);
                ((org.telegram.ui.Components.a20) this.f15678c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f15676a) {
            case 7:
                super.setScaleY(f10);
                ((org.telegram.ui.Components.a20) this.f15678c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f15676a) {
            case 7:
                super.setTranslationY(f10);
                ((org.telegram.ui.Components.a20) this.f15678c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f15676a) {
            case 5:
                super.setVisibility(i7);
                View view = ((bn) this.f15678c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f15676a) {
            case 0:
                if (drawable != ((ve0) this.f15678c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f15677b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w5(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.f15676a = 13;
        this.f15678c = new te.a(0, this, kr.h, 380L, true);
        this.f15677b = r4Var;
    }

    public w5(Activity activity) {
        super(activity);
        this.f15676a = 0;
        Paint paint = new Paint(1);
        this.f15677b = paint;
        ve0 ve0Var = new ve0(10);
        this.f15678c = ve0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ve0Var.setCallback(this);
        ve0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public w5(li.o oVar, Context context) {
        super(context);
        this.f15676a = 1;
        this.f15678c = oVar;
        this.f15677b = new Paint(1);
    }

    public w5(org.telegram.ui.Components.a20 a20Var, Context context) {
        super(context);
        this.f15676a = 7;
        this.f15678c = a20Var;
        this.f15677b = new Paint(1);
    }

    public w5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f15676a = 19;
        this.f15677b = paint;
        this.f15678c = drawable;
    }

    public w5(org.telegram.ui.Wallet.t6 t6Var, Context context) {
        super(context);
        this.f15676a = 18;
        this.f15678c = t6Var;
    }

    public w5(za1 za1Var, Context context) {
        super(context);
        this.f15676a = 17;
        this.f15678c = za1Var;
        this.f15677b = new Paint();
    }

    public w5(Context context, v71 v71Var) {
        super(context);
        this.f15676a = 16;
        this.f15678c = v71Var;
        this.f15677b = new Paint(1);
    }

    public w5(bn bnVar, Context context) {
        super(context);
        this.f15676a = 4;
        this.f15678c = bnVar;
        this.f15677b = new RectF();
    }

    public w5(bn bnVar, Context context, View view, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f15676a = 5;
        this.f15678c = bnVar;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(view, this, i6Var);
        this.f15677b = z9Var;
        z9Var.f42770p = false;
        z9Var.f42768n = true;
    }

    @Override
    public void G(float f10, int i7) {
    }
}
