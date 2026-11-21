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
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ad;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.bn;
import org.telegram.ui.dy;
import org.telegram.ui.f50;
import org.telegram.ui.iy;
import org.telegram.ui.pc0;
import org.telegram.ui.qr;
import org.telegram.ui.rn;
import org.telegram.ui.s11;
import org.telegram.ui.x71;
import org.telegram.ui.yc;
import org.telegram.ui.zm;
public final class l5 extends View implements te.b {
    public final int f15001a;
    public Object f15002b;
    public final Object f15003c;

    public l5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f15001a = i7;
        this.f15003c = obj;
        this.f15002b = obj2;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
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
        org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.f15002b;
        if (aaVar.f33448t) {
            if ((aaVar.f33441m == 1.0f || !aaVar.f33444p) && aaVar.f33442n && aaVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15001a) {
            case 4:
                RectF rectF = (RectF) this.f15002b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                bn bnVar = (bn) this.f15003c;
                int backgroundSizeY = bnVar.f46107m1.getBackgroundSizeY();
                float x10 = getX();
                float l92 = bnVar.l9(this);
                zm zmVar = bnVar.Ba;
                if (zmVar != null) {
                    zmVar.e(x10, l92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.m6.r(x10, l92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackground"));
                zm zmVar2 = bnVar.Ba;
                if (zmVar2 == null ? org.telegram.ui.ActionBar.m6.d1() : zmVar2.j()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                b20 b20Var = (b20) this.f15003c;
                kr krVar = b20Var.f41112d0;
                float measuredWidth2 = (1.0f - krVar.f36954g) * b20Var.f41114e0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f15002b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((b20Var.f41116f0.getMeasuredWidth() * krVar.f36954g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.r4) this.f15002b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f15001a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f15002b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f15001a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f15002b).jumpToCurrentState();
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
        switch (this.f15001a) {
            case 0:
                Paint paint = (Paint) this.f15002b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                we0 we0Var = (we0) this.f15003c;
                we0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                we0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f15002b;
                li.p pVar = (li.p) this.f15003c;
                org.telegram.ui.Components.q9 q9Var = pVar.f20014x;
                if (q9Var != null && q9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.f20014x.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f15002b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.f15003c).f48624f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f15002b;
                ad adVar = (ad) this.f15003c;
                fi.t3 t3Var = adVar.f45580f;
                if (t3Var != null && t3Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (adVar.f45595s.getAlpha() * adVar.f45580f.getImageReceiver().f22669i1 * 85.0f));
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
                org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.f15002b;
                Paint paint4 = aaVar.f33451x;
                org.telegram.ui.ActionBar.h6 h6Var = aaVar.f33452y;
                Paint paint5 = aaVar.f33450w;
                int i11 = aaVar.f33432b;
                View view = aaVar.f33433c;
                l5 l5Var = aaVar.d;
                if (l5Var != null) {
                    if (l5Var.getMeasuredHeight() != 0 || l5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !aaVar.f33448t && !aaVar.f33444p) {
                            aaVar.a();
                            aaVar.f33440l = false;
                        }
                        Bitmap[] bitmapArr2 = aaVar.f33436g;
                        if ((bitmapArr2 != null || aaVar.f33443o) && aaVar.f33444p) {
                            boolean z10 = aaVar.f33442n;
                            if (z10) {
                                float f12 = aaVar.f33441m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    aaVar.f33441m = f13;
                                    if (f13 > 1.0f) {
                                        aaVar.f33441m = 1.0f;
                                    }
                                    l5Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = aaVar.f33441m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    aaVar.f33441m = f15;
                                    if (f15 < 0.0f) {
                                        aaVar.f33441m = 0.0f;
                                    }
                                    l5Var.invalidate();
                                }
                            }
                        }
                        if (aaVar.f33444p) {
                            f10 = aaVar.f33441m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && aaVar.f33443o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, l5Var.getMeasuredWidth(), l5Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f10 * 255.0f));
                            if (i11 == r15) {
                                canvas.translate(f11, aaVar.f33449u);
                            }
                            canvas.save();
                            canvas.scale(l5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), l5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, aaVar.f33449u);
                            }
                            canvas.scale(l5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), aaVar.f33447s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            aaVar.f33448t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (aaVar.f33442n && !aaVar.f33439k) {
                            if (aaVar.f33436g == null || aaVar.f33440l) {
                                aaVar.f33439k = r15;
                                aaVar.f33440l = r16;
                                if (aaVar.f33434e == null) {
                                    aaVar.f33434e = new Bitmap[2];
                                    aaVar.f33438j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (aaVar.f33434e[i12] != null && l5Var.getMeasuredWidth() == aaVar.f33446r && l5Var.getMeasuredHeight() == aaVar.f33445q) {
                                        aaVar.f33434e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = l5Var.getMeasuredHeight();
                                        int measuredWidth = l5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f24140m;
                                        aaVar.f33447s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            aaVar.f33434e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            aaVar.f33438j[i12] = new Canvas(aaVar.f33434e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.g3(new og(aaVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        aaVar.f33434e[i12].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, h6Var));
                                    }
                                    aaVar.f33438j[i12].save();
                                    aaVar.f33438j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (h6Var instanceof zm) {
                                            background = ((zm) h6Var).c();
                                        } else {
                                            background = org.telegram.ui.ActionBar.m6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        aaVar.f33438j[i12].translate(f11, -aaVar.f33449u);
                                        view.draw(aaVar.f33438j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(aaVar.f33438j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(aaVar.f33438j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    aaVar.f33438j[i12].restore();
                                }
                                aaVar.f33445q = l5Var.getMeasuredHeight();
                                aaVar.f33446r = l5Var.getMeasuredWidth();
                                aaVar.v.f42736b = l5Var.getMeasuredWidth();
                                aaVar.v.f42737c = l5Var.getMeasuredHeight();
                                org.telegram.ui.Components.z9 z9Var = aaVar.v;
                                if (z9Var.f42736b != 0 && z9Var.f42737c != 0) {
                                    if (aaVar.f33431a == null) {
                                        aaVar.f33431a = new org.telegram.messenger.r5("blur_thread_" + aaVar, (boolean) r15);
                                    }
                                    aaVar.f33431a.postRunnable(aaVar.v);
                                    return;
                                }
                                aaVar.f33439k = false;
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
                Paint paint6 = (Paint) this.f15002b;
                rn rnVar = (rn) this.f15003c;
                fi.t3 t3Var2 = rnVar.f51646e;
                if (t3Var2 != null && t3Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (rnVar.f51646e.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f15002b;
                c20 c20Var = (c20) this.f15003c;
                boolean z11 = c20Var.F;
                if (z11) {
                    float f16 = c20Var.G;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        c20Var.G = f17;
                        if (f17 > 1.0f) {
                            c20Var.G = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(c20Var.G, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * c20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = c20Var.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        c20Var.G = f19;
                        if (f19 < 0.0f) {
                            c20Var.G = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(c20Var.G, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * c20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                g80 g80Var = (g80) this.f15003c;
                FrameLayout frameLayout = g80Var.f35453n;
                float[] fArr = g80Var.J;
                g80.a(frameLayout, (FrameLayout) this.f15002b, fArr);
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
                Paint paint8 = (Paint) this.f15002b;
                qr qrVar = (qr) this.f15003c;
                org.telegram.ui.Components.q9 q9Var2 = qrVar.f51335e;
                if (q9Var2 != null && q9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (qrVar.f51335e.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                iy iyVar = (iy) this.f15003c;
                FrameLayout frameLayout2 = iyVar.f47065a;
                float[] fArr2 = iyVar.E;
                dy.a(frameLayout2, (FrameLayout) this.f15002b, fArr2);
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
                Paint paint9 = (Paint) this.f15002b;
                f50 f50Var = (f50) this.f15003c;
                if (f50Var.d != null && f50Var.f47594n.getVisibility() == 0 && f50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (f50Var.f47594n.getAlpha() * f50Var.d.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f15002b;
                pc0 pc0Var = (pc0) this.f15003c;
                yc ycVar = pc0Var.f50850r;
                fi.t3 t3Var3 = pc0Var.f50847e;
                if (t3Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * t3Var3.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((s11) this.f15003c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, (org.telegram.ui.ActionBar.h6) this.f15002b));
                    return;
                }
            case 16:
                x71 x71Var = (x71) this.f15003c;
                int currentItem = x71Var.f53748l0.getCurrentItem();
                Paint paint11 = (Paint) this.f15002b;
                int i13 = org.telegram.ui.ActionBar.m6.f29664sf;
                if (x71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.m6.F0(i13);
                } else {
                    themedColor = x71Var.getThemedColor(i13);
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
                Paint paint12 = (Paint) this.f15002b;
                paint12.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) bb1.x0((bb1) this.f15003c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.p6 p6Var = ((org.telegram.ui.Wallet.s6) this.f15003c).f45036b;
                if (p6Var != null) {
                    p6Var.e(canvas, (float[]) this.f15002b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.f8.a(-16216082, (float[]) this.f15002b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f15002b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f15003c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15001a) {
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
        switch (this.f15001a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.f15002b;
                l5 l5Var = aaVar.d;
                if (aaVar.f33436g != null && l5Var.getMeasuredHeight() != 0 && l5Var.getMeasuredWidth() != 0) {
                    aaVar.a();
                    aaVar.f33445q = l5Var.getMeasuredHeight();
                    aaVar.f33446r = l5Var.getMeasuredWidth();
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
        switch (this.f15001a) {
            case 5:
                super.setAlpha(f10);
                View view = ((bn) this.f15003c).fragmentView;
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
                ((c20) this.f15003c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f15001a) {
            case 7:
                super.setScaleX(f10);
                ((c20) this.f15003c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f15001a) {
            case 7:
                super.setScaleY(f10);
                ((c20) this.f15003c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f15001a) {
            case 7:
                super.setTranslationY(f10);
                ((c20) this.f15003c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f15001a) {
            case 5:
                super.setVisibility(i7);
                View view = ((bn) this.f15003c).fragmentView;
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
        switch (this.f15001a) {
            case 0:
                if (drawable != ((we0) this.f15003c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f15002b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l5(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.f15001a = 13;
        this.f15003c = new te.a(0, this, nr.h, 380L, true);
        this.f15002b = r4Var;
    }

    public l5(Activity activity) {
        super(activity);
        this.f15001a = 0;
        Paint paint = new Paint(1);
        this.f15002b = paint;
        we0 we0Var = new we0(10);
        this.f15003c = we0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        we0Var.setCallback(this);
        we0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public l5(li.p pVar, Context context) {
        super(context);
        this.f15001a = 1;
        this.f15003c = pVar;
        this.f15002b = new Paint(1);
    }

    public l5(c20 c20Var, Context context) {
        super(context);
        this.f15001a = 7;
        this.f15003c = c20Var;
        this.f15002b = new Paint(1);
    }

    public l5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f15001a = 19;
        this.f15002b = paint;
        this.f15003c = drawable;
    }

    public l5(org.telegram.ui.Wallet.s6 s6Var, Context context) {
        super(context);
        this.f15001a = 18;
        this.f15003c = s6Var;
    }

    public l5(bb1 bb1Var, Context context) {
        super(context);
        this.f15001a = 17;
        this.f15003c = bb1Var;
        this.f15002b = new Paint();
    }

    public l5(Context context, x71 x71Var) {
        super(context);
        this.f15001a = 16;
        this.f15003c = x71Var;
        this.f15002b = new Paint(1);
    }

    public l5(bn bnVar, Context context) {
        super(context);
        this.f15001a = 4;
        this.f15003c = bnVar;
        this.f15002b = new RectF();
    }

    public l5(bn bnVar, Context context, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f15001a = 5;
        this.f15003c = bnVar;
        org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(view, this, h6Var);
        this.f15002b = aaVar;
        aaVar.f33444p = false;
        aaVar.f33442n = true;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
