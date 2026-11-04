package gi;

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
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ad;
import org.telegram.ui.g11;
import org.telegram.ui.l71;
import org.telegram.ui.ln;
import org.telegram.ui.lr;
import org.telegram.ui.nc0;
import org.telegram.ui.ra1;
import org.telegram.ui.u10;
import org.telegram.ui.um;
import org.telegram.ui.ux;
import org.telegram.ui.wm;
import org.telegram.ui.y40;
import org.telegram.ui.yc;
import org.telegram.ui.zx;
public final class n5 extends View implements qe.b {
    public final int f13302a;
    public Object f13303b;
    public final Object f13304c;

    public n5(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.f13302a = i3;
        this.f13304c = obj;
        this.f13303b = obj2;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
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
        org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f13303b;
        if (v9Var.f39050t) {
            if ((v9Var.f39043m == 1.0f || !v9Var.f39046p) && v9Var.f39044n && v9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f13302a) {
            case 4:
                RectF rectF = (RectF) this.f13303b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                wm wmVar = (wm) this.f13304c;
                int backgroundSizeY = wmVar.m1.getBackgroundSizeY();
                float x10 = getX();
                float j92 = wmVar.j9(this);
                um umVar = wmVar.f51557ya;
                if (umVar != null) {
                    umVar.b(x10, j92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, j92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), wmVar.getThemedPaint("paintChatActionBackground"));
                um umVar2 = wmVar.f51557ya;
                if (umVar2 == null ? org.telegram.ui.ActionBar.k6.d1() : umVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), wmVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                u10 u10Var = (u10) this.f13304c;
                uq uqVar = u10Var.f39674d0;
                float measuredWidth2 = (1.0f - uqVar.f38845g) * u10Var.f39676e0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f13303b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((u10Var.f39678f0.getMeasuredWidth() * uqVar.f38845g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) this.f13303b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f13302a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f13303b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f13302a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f13303b).jumpToCurrentState();
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
        int i3;
        switch (this.f13302a) {
            case 0:
                Paint paint = (Paint) this.f13303b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                je0 je0Var = (je0) this.f13304c;
                je0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                je0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f13303b;
                ji.n nVar = (ji.n) this.f13304c;
                org.telegram.ui.Components.k9 k9Var = nVar.f16351x;
                if (k9Var != null && k9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (nVar.f16351x.getImageReceiver().f21249i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f13303b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.f13304c).f46172f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f13303b;
                ad adVar = (ad) this.f13304c;
                ei.d4 d4Var = adVar.f43734f;
                if (d4Var != null && d4Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (adVar.f43749s.getAlpha() * adVar.f43734f.getImageReceiver().f21249i1 * 85.0f));
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
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f13303b;
                Paint paint4 = v9Var.f39053x;
                org.telegram.ui.ActionBar.e6 e6Var = v9Var.f39054y;
                Paint paint5 = v9Var.f39052w;
                int i11 = v9Var.f39034b;
                View view = v9Var.f39035c;
                n5 n5Var = v9Var.d;
                if (n5Var != null) {
                    if (n5Var.getMeasuredHeight() != 0 || n5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !v9Var.f39050t && !v9Var.f39046p) {
                            v9Var.a();
                            v9Var.f39042l = false;
                        }
                        Bitmap[] bitmapArr2 = v9Var.f39038g;
                        if ((bitmapArr2 != null || v9Var.f39045o) && v9Var.f39046p) {
                            boolean z10 = v9Var.f39044n;
                            if (z10) {
                                float f12 = v9Var.f39043m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    v9Var.f39043m = f13;
                                    if (f13 > 1.0f) {
                                        v9Var.f39043m = 1.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = v9Var.f39043m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    v9Var.f39043m = f15;
                                    if (f15 < 0.0f) {
                                        v9Var.f39043m = 0.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                        }
                        if (v9Var.f39046p) {
                            f10 = v9Var.f39043m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && v9Var.f39045o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f10 * 255.0f));
                            if (i11 == r15) {
                                canvas.translate(f11, v9Var.f39051u);
                            }
                            canvas.save();
                            canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), n5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, v9Var.f39051u);
                            }
                            canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), v9Var.f39049s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            v9Var.f39050t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (v9Var.f39044n && !v9Var.f39041k) {
                            if (v9Var.f39038g == null || v9Var.f39042l) {
                                v9Var.f39041k = r15;
                                v9Var.f39042l = r16;
                                if (v9Var.f39036e == null) {
                                    v9Var.f39036e = new Bitmap[2];
                                    v9Var.f39040j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (v9Var.f39036e[i12] != null && n5Var.getMeasuredWidth() == v9Var.f39048r && n5Var.getMeasuredHeight() == v9Var.f39047q) {
                                        v9Var.f39036e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = n5Var.getMeasuredHeight();
                                        int measuredWidth = n5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f22602m;
                                        v9Var.f39049s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            v9Var.f39036e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            v9Var.f39040j[i12] = new Canvas(v9Var.f39036e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.h3(new vf(v9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        v9Var.f39036e[i12].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
                                    }
                                    v9Var.f39040j[i12].save();
                                    v9Var.f39040j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (e6Var instanceof um) {
                                            background = ((um) e6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.k6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        v9Var.f39040j[i12].translate(f11, -v9Var.f39051u);
                                        view.draw(v9Var.f39040j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(v9Var.f39040j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(v9Var.f39040j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    v9Var.f39040j[i12].restore();
                                }
                                v9Var.f39047q = n5Var.getMeasuredHeight();
                                v9Var.f39048r = n5Var.getMeasuredWidth();
                                v9Var.v.f38702b = n5Var.getMeasuredWidth();
                                v9Var.v.f38703c = n5Var.getMeasuredHeight();
                                org.telegram.ui.Components.u9 u9Var = v9Var.v;
                                if (u9Var.f38702b != 0 && u9Var.f38703c != 0) {
                                    if (v9Var.f39033a == null) {
                                        v9Var.f39033a = new org.telegram.messenger.q5("blur_thread_" + v9Var, (boolean) r15);
                                    }
                                    v9Var.f39033a.postRunnable(v9Var.v);
                                    return;
                                }
                                v9Var.f39041k = false;
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
                Paint paint6 = (Paint) this.f13303b;
                ln lnVar = (ln) this.f13304c;
                ei.d4 d4Var2 = lnVar.f47371e;
                if (d4Var2 != null && d4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (lnVar.f47371e.getImageReceiver().f21249i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f13303b;
                l10 l10Var = (l10) this.f13304c;
                boolean z11 = l10Var.E;
                if (z11) {
                    float f16 = l10Var.F;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        l10Var.F = f17;
                        if (f17 > 1.0f) {
                            l10Var.F = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(l10Var.F, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * l10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = l10Var.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        l10Var.F = f19;
                        if (f19 < 0.0f) {
                            l10Var.F = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(l10Var.F, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * l10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                m70 m70Var = (m70) this.f13304c;
                FrameLayout frameLayout = m70Var.f36060n;
                float[] fArr = m70Var.J;
                m70.a(frameLayout, (FrameLayout) this.f13303b, fArr);
                canvas.save();
                float y9 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y9 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y9) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 10:
                Paint paint8 = (Paint) this.f13303b;
                lr lrVar = (lr) this.f13304c;
                org.telegram.ui.Components.k9 k9Var2 = lrVar.f47418e;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (lrVar.f47418e.getImageReceiver().f21249i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                zx zxVar = (zx) this.f13304c;
                FrameLayout frameLayout2 = zxVar.f50336a;
                float[] fArr2 = zxVar.E;
                ux.a(frameLayout2, (FrameLayout) this.f13303b, fArr2);
                canvas.save();
                float y10 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 12:
                Paint paint9 = (Paint) this.f13303b;
                y40 y40Var = (y40) this.f13304c;
                if (y40Var.d != null && y40Var.f52185n.getVisibility() == 0 && y40Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (y40Var.f52185n.getAlpha() * y40Var.d.getImageReceiver().f21249i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f13303b;
                nc0 nc0Var = (nc0) this.f13304c;
                yc ycVar = nc0Var.f47962r;
                ei.d4 d4Var3 = nc0Var.f47959e;
                if (d4Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * d4Var3.getImageReceiver().f21249i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((g11) this.f13304c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.e6) this.f13303b));
                    return;
                }
            case 16:
                l71 l71Var = (l71) this.f13304c;
                int currentItem = l71Var.f47177l0.getCurrentItem();
                Paint paint11 = (Paint) this.f13303b;
                int i13 = org.telegram.ui.ActionBar.k6.f28110pf;
                if (l71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.k6.F0(i13);
                } else {
                    themedColor = l71Var.getThemedColor(i13);
                }
                paint11.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i3 = 255;
                    } else {
                        i3 = 127;
                    }
                    paint11.setAlpha(i3);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i14 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                }
                return;
            case 17:
                Paint paint12 = (Paint) this.f13303b;
                paint12.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) ra1.x0((ra1) this.f13304c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.a6) this.f13304c).f42138b;
                if (x5Var != null) {
                    x5Var.e(canvas, (float[]) this.f13303b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.p7.a(-16216082, (float[]) this.f13303b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f13303b);
                ha.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ha.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f13304c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f13302a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f13302a) {
            case 5:
                super.onSizeChanged(i3, i10, i11, i12);
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f13303b;
                n5 n5Var = v9Var.d;
                if (v9Var.f39038g != null && n5Var.getMeasuredHeight() != 0 && n5Var.getMeasuredWidth() != 0) {
                    v9Var.a();
                    v9Var.f39047q = n5Var.getMeasuredHeight();
                    v9Var.f39048r = n5Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f13302a) {
            case 5:
                super.setAlpha(f10);
                View view = ((wm) this.f13304c).fragmentView;
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
                ((l10) this.f13304c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f13302a) {
            case 7:
                super.setScaleX(f10);
                ((l10) this.f13304c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f13302a) {
            case 7:
                super.setScaleY(f10);
                ((l10) this.f13304c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f13302a) {
            case 7:
                super.setTranslationY(f10);
                ((l10) this.f13304c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f13302a) {
            case 5:
                super.setVisibility(i3);
                View view = ((wm) this.f13304c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f13302a) {
            case 0:
                if (drawable != ((je0) this.f13304c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f13303b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.f13302a = 13;
        this.f13304c = new qe.a(0, this, xq.h, 380L, true);
        this.f13303b = q4Var;
    }

    public n5(Activity activity) {
        super(activity);
        this.f13302a = 0;
        Paint paint = new Paint(1);
        this.f13303b = paint;
        je0 je0Var = new je0(10);
        this.f13304c = je0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        je0Var.setCallback(this);
        je0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public n5(ji.n nVar, Context context) {
        super(context);
        this.f13302a = 1;
        this.f13304c = nVar;
        this.f13303b = new Paint(1);
    }

    public n5(l10 l10Var, Context context) {
        super(context);
        this.f13302a = 7;
        this.f13304c = l10Var;
        this.f13303b = new Paint(1);
    }

    public n5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f13302a = 19;
        this.f13303b = paint;
        this.f13304c = drawable;
    }

    public n5(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.f13302a = 18;
        this.f13304c = a6Var;
    }

    public n5(ra1 ra1Var, Context context) {
        super(context);
        this.f13302a = 17;
        this.f13304c = ra1Var;
        this.f13303b = new Paint();
    }

    public n5(Context context, l71 l71Var) {
        super(context);
        this.f13302a = 16;
        this.f13304c = l71Var;
        this.f13303b = new Paint(1);
    }

    public n5(wm wmVar, Context context) {
        super(context);
        this.f13302a = 4;
        this.f13304c = wmVar;
        this.f13303b = new RectF();
    }

    public n5(wm wmVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f13302a = 5;
        this.f13304c = wmVar;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(view, this, e6Var);
        this.f13303b = v9Var;
        v9Var.f39046p = false;
        v9Var.f39044n = true;
    }

    @Override
    public void F(float f10, int i3) {
    }
}
