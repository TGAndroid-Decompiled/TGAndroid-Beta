package ag;

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
import jh.z3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.v9;
import org.telegram.ui.a61;
import org.telegram.ui.gd;
import org.telegram.ui.hz;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.js;
import org.telegram.ui.mz;
import org.telegram.ui.nc1;
import org.telegram.ui.pn;
import org.telegram.ui.rn;
import org.telegram.ui.te0;
import org.telegram.ui.u60;
import org.telegram.ui.x71;
import org.telegram.ui.zf1;

public final class t0 extends View implements ud.b {

    public final int f660a;

    public final Object f661b;

    public final Object f662c;

    public t0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f660a = i10;
        this.f662c = obj;
        this.f661b = obj2;
    }

    public boolean a() {
        v9 v9Var = (v9) this.f661b;
        if (v9Var.f33331t) {
            return (v9Var.f33324m == 1.0f || !v9Var.f33327p) && v9Var.f33325n && v9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ud.a) this.f662c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f660a) {
            case 4:
                RectF rectF = (RectF) this.f661b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                rn rnVar = (rn) this.f662c;
                int backgroundSizeY = rnVar.T0.getBackgroundSizeY();
                float x8 = getX();
                float fP8 = rnVar.P8(this);
                pn pnVar = rnVar.f41983aa;
                if (pnVar != null) {
                    pnVar.m(x8, fP8, measuredWidth, backgroundSizeY);
                } else {
                    g6.q(x8, fP8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), rnVar.getThemedPaint("paintChatActionBackground"));
                pn pnVar2 = rnVar.f41983aa;
                if (pnVar2 == null ? g6.a1() : pnVar2.u0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), rnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((b5) this.f661b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        ?? r10;
        float f12;
        float f13;
        char c10;
        float f14;
        float f15;
        switch (this.f660a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f661b);
                j2.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), j2.d().e());
                float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f662c;
                drawable.setBounds((int) (measuredWidth - fDp), (int) (measuredHeight - fDp), (int) (measuredWidth + fDp), (int) (measuredHeight + fDp));
                drawable.draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) this.f661b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                tf0 tf0Var = (tf0) this.f662c;
                tf0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                tf0Var.draw(canvas);
                canvas.restore();
                break;
            case 2:
                Paint paint2 = (Paint) this.f661b;
                oh.o oVar = (oh.o) this.f662c;
                n9 n9Var = oVar.v;
                if (n9Var != null && n9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.f661b;
                id idVar = (id) this.f662c;
                z3 z3Var = idVar.f39036e;
                if (z3Var != null && z3Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (idVar.f39051r.getAlpha() * idVar.f39036e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    break;
                }
                break;
            case 4:
            case 12:
            default:
                super.onDraw(canvas);
                break;
            case 5:
                v9 v9Var = (v9) this.f661b;
                Paint paint4 = v9Var.f33334x;
                c6 c6Var = v9Var.f33335y;
                Paint paint5 = v9Var.f33333w;
                int i10 = v9Var.f33315b;
                View view = v9Var.f33316c;
                t0 t0Var = v9Var.d;
                if (t0Var != null) {
                    if (t0Var.getMeasuredHeight() != 0 || t0Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !v9Var.f33331t && !v9Var.f33327p) {
                            v9Var.a();
                            v9Var.f33323l = false;
                        }
                        Bitmap[] bitmapArr = v9Var.f33319g;
                        if ((bitmapArr != null || v9Var.f33326o) && v9Var.f33327p) {
                            boolean z10 = v9Var.f33325n;
                            if (z10) {
                                float f16 = v9Var.f33324m;
                                if (f16 != 1.0f) {
                                    float f17 = f16 + 0.09f;
                                    v9Var.f33324m = f17;
                                    if (f17 > 1.0f) {
                                        v9Var.f33324m = 1.0f;
                                    }
                                    t0Var.invalidate();
                                } else if (!z10) {
                                    f10 = v9Var.f33324m;
                                    if (f10 != 0.0f) {
                                        f11 = f10 - 0.09f;
                                        v9Var.f33324m = f11;
                                        if (f11 < 0.0f) {
                                            v9Var.f33324m = 0.0f;
                                        }
                                        t0Var.invalidate();
                                    }
                                }
                            } else if (!z10) {
                                f10 = v9Var.f33324m;
                                if (f10 != 0.0f) {
                                    f11 = f10 - 0.09f;
                                    v9Var.f33324m = f11;
                                    if (f11 < 0.0f) {
                                        v9Var.f33324m = 0.0f;
                                    }
                                    t0Var.invalidate();
                                }
                            }
                        }
                        float f18 = v9Var.f33327p ? v9Var.f33324m : 1.0f;
                        if (bitmapArr == null && v9Var.f33326o) {
                            paint4.setAlpha((int) (50.0f * f18));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f18 == 1.0f) {
                                canvas.save();
                                r10 = 1;
                                f12 = 0.0f;
                                f13 = 255.0f;
                                c10 = 0;
                            } else {
                                r10 = 1;
                                f12 = 0.0f;
                                f13 = 255.0f;
                                c10 = 0;
                                canvas.saveLayerAlpha(0.0f, 0.0f, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight(), (int) (f18 * 255.0f), 31);
                            }
                            if (bitmapArr != 0) {
                                paint5.setAlpha((int) (f18 * f13));
                                if (i10 == r10) {
                                    canvas.translate(f12, v9Var.f33332u);
                                }
                                canvas.save();
                                canvas.scale(t0Var.getMeasuredWidth() / bitmapArr[r10].getWidth(), t0Var.getMeasuredHeight() / bitmapArr[r10].getHeight());
                                canvas.drawBitmap(bitmapArr[r10], f12, f12, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f12, v9Var.f33332u);
                                }
                                canvas.scale(t0Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), v9Var.f33330s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f12, f12, paint5);
                                canvas.restore();
                                v9Var.f33331t = r10;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (v9Var.f33325n && !v9Var.f33322k) {
                                if (v9Var.f33319g == null || v9Var.f33323l) {
                                    v9Var.f33322k = r10;
                                    v9Var.f33323l = false;
                                    if (v9Var.f33317e == null) {
                                        v9Var.f33317e = new Bitmap[2];
                                        v9Var.f33321j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (v9Var.f33317e[i11] != null && t0Var.getMeasuredWidth() == v9Var.f33329r && t0Var.getMeasuredHeight() == v9Var.f33328q) {
                                            v9Var.f33317e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight2 = t0Var.getMeasuredHeight();
                                            int measuredWidth2 = t0Var.getMeasuredWidth();
                                            int iDp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            v9Var.f33330s = iDp;
                                            if (i11 == 0) {
                                                measuredHeight2 = iDp;
                                            }
                                            try {
                                                v9Var.f33317e[i11] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                                v9Var.f33321j[i11] = new Canvas(v9Var.f33317e[i11]);
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                AndroidUtilities.runOnUIThread(new bg(v9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r10) {
                                            v9Var.f33317e[i11].eraseColor(g6.v0(g6.f23053d6, c6Var));
                                        }
                                        v9Var.f33321j[i11].save();
                                        v9Var.f33321j[i11].scale(0.06666667f, 0.06666667f, f12, f12);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = c6Var instanceof pn ? ((pn) c6Var).d() : g6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            v9Var.f33321j[i11].translate(f12, -v9Var.f33332u);
                                            view.draw(v9Var.f33321j[i11]);
                                        }
                                        if (background != null && i11 == r10) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(v9Var.f33321j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(v9Var.f33321j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        v9Var.f33321j[i11].restore();
                                        break;
                                    }
                                    v9Var.f33328q = t0Var.getMeasuredHeight();
                                    v9Var.f33329r = t0Var.getMeasuredWidth();
                                    v9Var.v.f33020b = t0Var.getMeasuredWidth();
                                    v9Var.v.f33021c = t0Var.getMeasuredHeight();
                                    u9 u9Var = v9Var.v;
                                    if (u9Var.f33020b == 0 || u9Var.f33021c == 0) {
                                        v9Var.f33322k = false;
                                    } else {
                                        if (v9Var.f33314a == null) {
                                            v9Var.f33314a = new DispatchQueue("blur_thread_" + v9Var);
                                        }
                                        v9Var.f33314a.postRunnable(v9Var.v);
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                Paint paint6 = (Paint) this.f661b;
                jo joVar = (jo) this.f662c;
                z3 z3Var2 = joVar.f39410e;
                if (z3Var2 != null && z3Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (joVar.f39410e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.f661b;
                n20 n20Var = (n20) this.f662c;
                boolean z11 = n20Var.f30829y;
                if (z11) {
                    float f19 = n20Var.A;
                    if (f19 != 1.0f) {
                        float f20 = f19 + 0.064f;
                        n20Var.A = f20;
                        if (f20 > 1.0f) {
                            n20Var.A = 1.0f;
                        }
                        invalidate();
                    } else if (!z11) {
                        f14 = n20Var.A;
                        if (f14 != 0.0f) {
                            f15 = f14 - 0.064f;
                            n20Var.A = f15;
                            if (f15 < 0.0f) {
                                n20Var.A = 0.0f;
                            }
                            invalidate();
                        }
                    }
                } else if (!z11) {
                    f14 = n20Var.A;
                    if (f14 != 0.0f) {
                        f15 = f14 - 0.064f;
                        n20Var.A = f15;
                        if (f15 < 0.0f) {
                            n20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.b.d(n20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * n20Var.A) + AndroidUtilities.dp(35.0f), paint7);
                break;
            case 8:
                canvas.drawColor(855638016);
                i80 i80Var = (i80) this.f662c;
                FrameLayout frameLayout = i80Var.f29274n;
                FrameLayout frameLayout2 = (FrameLayout) this.f661b;
                float[] fArr = i80Var.E;
                i80.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 9:
                Paint paint8 = (Paint) this.f661b;
                js jsVar = (js) this.f662c;
                n9 n9Var2 = jsVar.f39486e;
                if (n9Var2 != null && n9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (jsVar.f39486e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 10:
                canvas.drawColor(855638016);
                mz mzVar = (mz) this.f662c;
                FrameLayout frameLayout3 = mzVar.f38912a;
                FrameLayout frameLayout4 = (FrameLayout) this.f661b;
                float[] fArr2 = mzVar.f38922y;
                hz.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y11 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 11:
                Paint paint9 = (Paint) this.f661b;
                u60 u60Var = (u60) this.f662c;
                if (u60Var.d != null && u60Var.f43138n.getVisibility() == 0 && u60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (u60Var.f43138n.getAlpha() * u60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 13:
                Paint paint10 = (Paint) this.f661b;
                te0 te0Var = (te0) this.f662c;
                gd gdVar = te0Var.f42921r;
                z3 z3Var3 = te0Var.f42918e;
                if (z3Var3 != null && gdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (gdVar.getAlpha() * z3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 14:
                if (((a61) this.f662c).M0) {
                    canvas.drawColor(g6.v0(g6.G8, (c6) this.f661b));
                } else {
                    dispatchDraw(canvas);
                }
                break;
            case 15:
                x71 x71Var = (x71) this.f662c;
                int height = ((org.telegram.ui.ActionBar.n2) x71Var).actionBar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f661b;
                paint11.setColor(g6.v0(g6.f23322s8, ((org.telegram.ui.ActionBar.n2) x71Var).resourceProvider));
                x71Var.f44305b.J(canvas, 0.0f, rect, paint11, true);
                if (x71Var.getParentLayout() != null) {
                    ((ActionBarLayout) x71Var.getParentLayout()).q(canvas, height);
                }
                break;
            case 16:
                nc1 nc1Var = (nc1) this.f662c;
                int currentItem = nc1Var.f40754f0.getCurrentItem();
                Paint paint12 = (Paint) this.f661b;
                int i12 = g6.Ae;
                paint12.setColor(nc1Var.d ? g6.C0(i12) : nc1Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint12.setAlpha(i13 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i13 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i13++;
                }
                break;
            case 17:
                Paint paint13 = (Paint) this.f661b;
                paint13.setColor(g6.w0(null, g6.f23053d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) ((zf1) this.f662c)).parentLayout).q(canvas, measuredHeight3);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f660a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f660a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                v9 v9Var = (v9) this.f661b;
                t0 t0Var = v9Var.d;
                if (v9Var.f33319g != null && t0Var.getMeasuredHeight() != 0 && t0Var.getMeasuredWidth() != 0) {
                    v9Var.a();
                    v9Var.f33328q = t0Var.getMeasuredHeight();
                    v9Var.f33329r = t0Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f660a) {
            case 5:
                super.setAlpha(f10);
                View view = ((rn) this.f662c).fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 6:
            default:
                super.setAlpha(f10);
                break;
            case 7:
                super.setAlpha(f10);
                ((n20) this.f662c).d.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f660a) {
            case 7:
                super.setScaleX(f10);
                ((n20) this.f662c).d.setScaleX(f10);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f660a) {
            case 7:
                super.setScaleY(f10);
                ((n20) this.f662c).d.setScaleY(f10);
                break;
            default:
                super.setScaleY(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f660a) {
            case 7:
                super.setTranslationY(f10);
                ((n20) this.f662c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f660a) {
            case 5:
                super.setVisibility(i10);
                View view = ((rn) this.f662c).fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f660a) {
            case 1:
                return drawable == ((tf0) this.f662c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public t0(Context context, b5 b5Var) {
        super(context);
        this.f660a = 12;
        this.f662c = new ud.a(0, this, er.h, 380L, true);
        this.f661b = b5Var;
    }

    public t0(Activity activity) {
        super(activity);
        this.f660a = 1;
        Paint paint = new Paint(1);
        this.f661b = paint;
        tf0 tf0Var = new tf0(10);
        this.f662c = tf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        tf0Var.setCallback(this);
        tf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public t0(oh.o oVar, Context context) {
        super(context);
        this.f660a = 2;
        this.f662c = oVar;
        this.f661b = new Paint(1);
    }

    public t0(n20 n20Var, Context context) {
        super(context);
        this.f660a = 7;
        this.f662c = n20Var;
        this.f661b = new Paint(1);
    }

    public t0(x71 x71Var, Context context) {
        super(context);
        this.f660a = 15;
        this.f662c = x71Var;
        this.f661b = new Paint(1);
    }

    public t0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f660a = 0;
        this.f661b = paint;
        this.f662c = drawable;
    }

    public t0(zf1 zf1Var, Context context) {
        super(context);
        this.f660a = 17;
        this.f662c = zf1Var;
        this.f661b = new Paint();
    }

    public t0(Context context, nc1 nc1Var) {
        super(context);
        this.f660a = 16;
        this.f662c = nc1Var;
        this.f661b = new Paint(1);
    }

    public t0(rn rnVar, Context context) {
        super(context);
        this.f660a = 4;
        this.f662c = rnVar;
        this.f661b = new RectF();
    }

    public t0(rn rnVar, Context context, View view, c6 c6Var) {
        super(context);
        this.f660a = 5;
        this.f662c = rnVar;
        v9 v9Var = new v9(view, this, c6Var);
        this.f661b = v9Var;
        v9Var.f33327p = false;
        v9Var.f33325n = true;
    }

    @Override
    public void A(float f10, int i10) {
    }
}
