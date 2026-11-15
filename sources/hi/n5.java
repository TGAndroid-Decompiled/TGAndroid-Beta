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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.t70;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.c50;
import org.telegram.ui.fy;
import org.telegram.ui.n11;
import org.telegram.ui.oc0;
import org.telegram.ui.pr;
import org.telegram.ui.qn;
import org.telegram.ui.t71;
import org.telegram.ui.xa1;
import org.telegram.ui.y10;
import org.telegram.ui.yc;
import org.telegram.ui.ym;
import org.telegram.ui.zx;
public final class n5 extends View implements te.b {
    public final int f14760a;
    public Object f14761b;
    public final Object f14762c;

    public n5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f14760a = i7;
        this.f14762c = obj;
        this.f14761b = obj2;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
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
        org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.f14761b;
        if (s9Var.f39256t) {
            if ((s9Var.f39249m == 1.0f || !s9Var.f39252p) && s9Var.f39250n && s9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f14760a) {
            case 4:
                RectF rectF = (RectF) this.f14761b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                an anVar = (an) this.f14762c;
                int backgroundSizeY = anVar.f45278m1.getBackgroundSizeY();
                float x10 = getX();
                float l92 = anVar.l9(this);
                ym ymVar = anVar.Aa;
                if (ymVar != null) {
                    ymVar.b(x10, l92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.r(x10, l92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackground"));
                ym ymVar2 = anVar.Aa;
                if (ymVar2 == null ? org.telegram.ui.ActionBar.j6.d1() : ymVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                y10 y10Var = (y10) this.f14762c;
                br brVar = y10Var.f40728d0;
                float measuredWidth2 = (1.0f - brVar.f33348g) * y10Var.f40730e0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f14761b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) ((y10Var.f40732f0.getMeasuredWidth() * brVar.f33348g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.o4) this.f14761b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f14760a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f14761b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f14760a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f14761b).jumpToCurrentState();
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
        switch (this.f14760a) {
            case 0:
                Paint paint = (Paint) this.f14761b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                ke0 ke0Var = (ke0) this.f14762c;
                ke0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                ke0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f14761b;
                li.n nVar = (li.n) this.f14762c;
                org.telegram.ui.Components.i9 i9Var = nVar.f19618x;
                if (i9Var != null && i9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (nVar.f19618x.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    String str = ((String[]) this.f14761b)[i10];
                    canvas.drawText(str, (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.f14762c).f47947f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f14761b;
                ad adVar = (ad) this.f14762c;
                fi.v3 v3Var = adVar.f45004f;
                if (v3Var != null && v3Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (adVar.f45019s.getAlpha() * adVar.f45004f.getImageReceiver().f22278i1 * 85.0f));
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
                org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.f14761b;
                Paint paint4 = s9Var.f39259x;
                org.telegram.ui.ActionBar.e6 e6Var = s9Var.f39260y;
                Paint paint5 = s9Var.f39258w;
                int i11 = s9Var.f39240b;
                View view = s9Var.f39241c;
                n5 n5Var = s9Var.d;
                if (n5Var != null) {
                    if (n5Var.getMeasuredHeight() != 0 || n5Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !s9Var.f39256t && !s9Var.f39252p) {
                            s9Var.a();
                            s9Var.f39248l = false;
                        }
                        Bitmap[] bitmapArr2 = s9Var.f39244g;
                        if ((bitmapArr2 != null || s9Var.f39251o) && s9Var.f39252p) {
                            boolean z10 = s9Var.f39250n;
                            if (z10) {
                                float f12 = s9Var.f39249m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    s9Var.f39249m = f13;
                                    if (f13 > 1.0f) {
                                        s9Var.f39249m = 1.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = s9Var.f39249m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    s9Var.f39249m = f15;
                                    if (f15 < 0.0f) {
                                        s9Var.f39249m = 0.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                        }
                        if (s9Var.f39252p) {
                            f10 = s9Var.f39249m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && s9Var.f39251o) {
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
                                canvas.translate(f11, s9Var.f39257u);
                            }
                            canvas.save();
                            canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), n5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f11, f11, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, s9Var.f39257u);
                            }
                            canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), s9Var.f39255s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f11, f11, paint5);
                            canvas.restore();
                            s9Var.f39256t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (s9Var.f39250n && !s9Var.f39247k) {
                            if (s9Var.f39244g == null || s9Var.f39248l) {
                                s9Var.f39247k = r15;
                                s9Var.f39248l = r16;
                                if (s9Var.f39242e == null) {
                                    s9Var.f39242e = new Bitmap[2];
                                    s9Var.f39246j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (s9Var.f39242e[i12] != null && n5Var.getMeasuredWidth() == s9Var.f39254r && n5Var.getMeasuredHeight() == s9Var.f39253q) {
                                        s9Var.f39242e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = n5Var.getMeasuredHeight();
                                        int measuredWidth = n5Var.getMeasuredWidth();
                                        int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.f23603m;
                                        s9Var.f39255s = L;
                                        if (i12 == 0) {
                                            measuredHeight = L;
                                        }
                                        try {
                                            s9Var.f39242e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            s9Var.f39246j[i12] = new Canvas(s9Var.f39242e[i12]);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r15);
                                            org.telegram.messenger.g0.h3(new dg(s9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r15) {
                                        s9Var.f39242e[i12].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
                                    }
                                    s9Var.f39246j[i12].save();
                                    s9Var.f39246j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (e6Var instanceof ym) {
                                            background = ((ym) e6Var).m();
                                        } else {
                                            background = org.telegram.ui.ActionBar.j6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        s9Var.f39246j[i12].translate(f11, -s9Var.f39257u);
                                        view.draw(s9Var.f39246j[i12]);
                                    }
                                    if (background != null && i12 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(s9Var.f39246j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(s9Var.f39246j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    s9Var.f39246j[i12].restore();
                                }
                                s9Var.f39253q = n5Var.getMeasuredHeight();
                                s9Var.f39254r = n5Var.getMeasuredWidth();
                                s9Var.v.f38905b = n5Var.getMeasuredWidth();
                                s9Var.v.f38906c = n5Var.getMeasuredHeight();
                                org.telegram.ui.Components.r9 r9Var = s9Var.v;
                                if (r9Var.f38905b != 0 && r9Var.f38906c != 0) {
                                    if (s9Var.f39239a == null) {
                                        s9Var.f39239a = new org.telegram.messenger.q5("blur_thread_" + s9Var, (boolean) r15);
                                    }
                                    s9Var.f39239a.postRunnable(s9Var.v);
                                    return;
                                }
                                s9Var.f39247k = false;
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
                Paint paint6 = (Paint) this.f14761b;
                qn qnVar = (qn) this.f14762c;
                fi.v3 v3Var2 = qnVar.f50668e;
                if (v3Var2 != null && v3Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (qnVar.f50668e.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f14761b;
                s10 s10Var = (s10) this.f14762c;
                boolean z11 = s10Var.F;
                if (z11) {
                    float f16 = s10Var.G;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        s10Var.G = f17;
                        if (f17 > 1.0f) {
                            s10Var.G = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(s10Var.G, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * s10Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f18 = s10Var.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        s10Var.G = f19;
                        if (f19 < 0.0f) {
                            s10Var.G = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(s10Var.G, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * s10Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                t70 t70Var = (t70) this.f14762c;
                FrameLayout frameLayout = t70Var.f39581n;
                float[] fArr = t70Var.J;
                t70.a(frameLayout, (FrameLayout) this.f14761b, fArr);
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
                Paint paint8 = (Paint) this.f14761b;
                pr prVar = (pr) this.f14762c;
                org.telegram.ui.Components.i9 i9Var2 = prVar.f50348e;
                if (i9Var2 != null && i9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (prVar.f50348e.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 11:
                canvas.drawColor(855638016);
                fy fyVar = (fy) this.f14762c;
                FrameLayout frameLayout2 = fyVar.f54043a;
                float[] fArr2 = fyVar.E;
                zx.a(frameLayout2, (FrameLayout) this.f14761b, fArr2);
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
                Paint paint9 = (Paint) this.f14761b;
                c50 c50Var = (c50) this.f14762c;
                if (c50Var.d != null && c50Var.f46022n.getVisibility() == 0 && c50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (c50Var.f46022n.getAlpha() * c50Var.d.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 14:
                Paint paint10 = (Paint) this.f14761b;
                oc0 oc0Var = (oc0) this.f14762c;
                yc ycVar = oc0Var.f49922r;
                fi.v3 v3Var3 = oc0Var.f49919e;
                if (v3Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * v3Var3.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 15:
                if (!((n11) this.f14762c).R0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.e6) this.f14761b));
                    return;
                }
            case 16:
                t71 t71Var = (t71) this.f14762c;
                int currentItem = t71Var.f51445l0.getCurrentItem();
                Paint paint11 = (Paint) this.f14761b;
                int i13 = org.telegram.ui.ActionBar.j6.f29135sf;
                if (t71Var.d) {
                    themedColor = org.telegram.ui.ActionBar.j6.F0(i13);
                } else {
                    themedColor = t71Var.getThemedColor(i13);
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
                Paint paint12 = (Paint) this.f14761b;
                paint12.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                ((ActionBarLayout) xa1.x0((xa1) this.f14762c)).q(canvas, measuredHeight2);
                return;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.z5 z5Var = ((org.telegram.ui.Wallet.c6) this.f14762c).f43621b;
                if (z5Var != null) {
                    z5Var.e(canvas, (float[]) this.f14761b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.q7.a(-16216082, (float[]) this.f14761b));
                }
                canvas.restoreToCount(save);
                return;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f14761b);
                ia.f.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.f.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f14762c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f14760a) {
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
        switch (this.f14760a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.f14761b;
                n5 n5Var = s9Var.d;
                if (s9Var.f39244g != null && n5Var.getMeasuredHeight() != 0 && n5Var.getMeasuredWidth() != 0) {
                    s9Var.a();
                    s9Var.f39253q = n5Var.getMeasuredHeight();
                    s9Var.f39254r = n5Var.getMeasuredWidth();
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
        switch (this.f14760a) {
            case 5:
                super.setAlpha(f10);
                View view = ((an) this.f14762c).fragmentView;
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
                ((s10) this.f14762c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f14760a) {
            case 7:
                super.setScaleX(f10);
                ((s10) this.f14762c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f14760a) {
            case 7:
                super.setScaleY(f10);
                ((s10) this.f14762c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f14760a) {
            case 7:
                super.setTranslationY(f10);
                ((s10) this.f14762c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f14760a) {
            case 5:
                super.setVisibility(i7);
                View view = ((an) this.f14762c).fragmentView;
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
        switch (this.f14760a) {
            case 0:
                if (drawable != ((ke0) this.f14762c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 9:
                if (((org.telegram.ui.Cells.y) this.f14761b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n5(Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context);
        this.f14760a = 13;
        this.f14762c = new te.a(0, this, er.h, 380L, true);
        this.f14761b = o4Var;
    }

    public n5(Activity activity) {
        super(activity);
        this.f14760a = 0;
        Paint paint = new Paint(1);
        this.f14761b = paint;
        ke0 ke0Var = new ke0(10);
        this.f14762c = ke0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ke0Var.setCallback(this);
        ke0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public n5(li.n nVar, Context context) {
        super(context);
        this.f14760a = 1;
        this.f14762c = nVar;
        this.f14761b = new Paint(1);
    }

    public n5(s10 s10Var, Context context) {
        super(context);
        this.f14760a = 7;
        this.f14762c = s10Var;
        this.f14761b = new Paint(1);
    }

    public n5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f14760a = 19;
        this.f14761b = paint;
        this.f14762c = drawable;
    }

    public n5(org.telegram.ui.Wallet.c6 c6Var, Context context) {
        super(context);
        this.f14760a = 18;
        this.f14762c = c6Var;
    }

    public n5(xa1 xa1Var, Context context) {
        super(context);
        this.f14760a = 17;
        this.f14762c = xa1Var;
        this.f14761b = new Paint();
    }

    public n5(Context context, t71 t71Var) {
        super(context);
        this.f14760a = 16;
        this.f14762c = t71Var;
        this.f14761b = new Paint(1);
    }

    public n5(an anVar, Context context) {
        super(context);
        this.f14760a = 4;
        this.f14762c = anVar;
        this.f14761b = new RectF();
    }

    public n5(an anVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f14760a = 5;
        this.f14762c = anVar;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(view, this, e6Var);
        this.f14761b = s9Var;
        s9Var.f39252p = false;
        s9Var.f39250n = true;
    }

    @Override
    public void E(float f10, int i7) {
    }
}
