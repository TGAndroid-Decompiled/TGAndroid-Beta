package ei;

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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q90;
import org.telegram.ui.gz;
import org.telegram.ui.hs;
import org.telegram.ui.ko;
import org.telegram.ui.lz;
import org.telegram.ui.mc1;
import org.telegram.ui.md;
import org.telegram.ui.od;
import org.telegram.ui.pe0;
import org.telegram.ui.qn;
import org.telegram.ui.sn;
import org.telegram.ui.u60;
import org.telegram.ui.xf1;
import org.telegram.ui.z51;
import org.telegram.ui.z71;
public final class g6 extends View implements ne.d {
    public final int f9071a;
    public final Object f9072b;
    public final Object f9073c;

    public g6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f9071a = i10;
        this.f9073c = obj;
        this.f9072b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9072b;
        if (faVar.f26206t) {
            if ((faVar.f26199m == 1.0f || !faVar.f26202p) && faVar.f26200n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.f9073c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9071a) {
            case 3:
                RectF rectF = (RectF) this.f9072b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                sn snVar = (sn) this.f9073c;
                int backgroundSizeY = snVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = snVar.U8(this);
                qn qnVar = snVar.f41226ea;
                if (qnVar != null) {
                    qnVar.d(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackground"));
                qn qnVar2 = snVar.f41226ea;
                if (qnVar2 == null ? org.telegram.ui.ActionBar.h6.b1() : qnVar2.s()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f9072b)).q(canvas, 0);
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
        switch (this.f9071a) {
            case 0:
                Paint paint = (Paint) this.f9072b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                ah0 ah0Var = (ah0) this.f9073c;
                ah0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                ah0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f9072b;
                hi.o oVar = (hi.o) this.f9073c;
                org.telegram.ui.Components.w9 w9Var = oVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f9072b;
                od odVar = (od) this.f9073c;
                ci.k4 k4Var = odVar.e;
                if (k4Var != null && k4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (odVar.f39752r.getAlpha() * odVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9072b;
                Paint paint4 = faVar.f26209x;
                org.telegram.ui.ActionBar.d6 d6Var = faVar.f26210y;
                Paint paint5 = faVar.f26208w;
                int i11 = faVar.f26191b;
                View view = faVar.f26192c;
                g6 g6Var = faVar.d;
                if (g6Var != null) {
                    if (g6Var.getMeasuredHeight() != 0 || g6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !faVar.f26206t && !faVar.f26202p) {
                            faVar.a();
                            faVar.f26198l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.f26194g;
                        if ((bitmapArr2 != null || faVar.f26201o) && faVar.f26202p) {
                            boolean z10 = faVar.f26200n;
                            if (z10) {
                                float f11 = faVar.f26199m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    faVar.f26199m = f12;
                                    if (f12 > 1.0f) {
                                        faVar.f26199m = 1.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = faVar.f26199m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    faVar.f26199m = f14;
                                    if (f14 < 0.0f) {
                                        faVar.f26199m = 0.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                        }
                        if (faVar.f26202p) {
                            f7 = faVar.f26199m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && faVar.f26201o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, g6Var.getMeasuredWidth(), g6Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, faVar.f26207u);
                            }
                            canvas.save();
                            canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), g6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, faVar.f26207u);
                            }
                            canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), faVar.f26205s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            faVar.f26206t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (faVar.f26200n && !faVar.f26197k) {
                            if (faVar.f26194g == null || faVar.f26198l) {
                                faVar.f26197k = r02;
                                faVar.f26198l = r16;
                                if (faVar.e == null) {
                                    faVar.e = new Bitmap[2];
                                    faVar.f26196j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (faVar.e[i12] != null && g6Var.getMeasuredWidth() == faVar.f26204r && g6Var.getMeasuredHeight() == faVar.f26203q) {
                                        faVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = g6Var.getMeasuredHeight();
                                        int measuredWidth = g6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        faVar.f26205s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            faVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            faVar.f26196j[i12] = new Canvas(faVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new pg(faVar, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        faVar.e[i12].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
                                    }
                                    faVar.f26196j[i12].save();
                                    faVar.f26196j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (d6Var instanceof qn) {
                                            background = ((qn) d6Var).e();
                                        } else {
                                            background = org.telegram.ui.ActionBar.h6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        faVar.f26196j[i12].translate(f10, -faVar.f26207u);
                                        view.draw(faVar.f26196j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(faVar.f26196j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(faVar.f26196j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    faVar.f26196j[i12].restore();
                                }
                                faVar.f26203q = g6Var.getMeasuredHeight();
                                faVar.f26204r = g6Var.getMeasuredWidth();
                                faVar.v.f25901b = g6Var.getMeasuredWidth();
                                faVar.v.f25902c = g6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ea eaVar = faVar.v;
                                if (eaVar.f25901b != 0 && eaVar.f25902c != 0) {
                                    if (faVar.f26190a == null) {
                                        faVar.f26190a = new DispatchQueue("blur_thread_" + faVar);
                                    }
                                    faVar.f26190a.postRunnable(faVar.v);
                                    return;
                                }
                                faVar.f26197k = false;
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
                Paint paint6 = (Paint) this.f9072b;
                ko koVar = (ko) this.f9073c;
                ci.k4 k4Var2 = koVar.e;
                if (k4Var2 != null && k4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (koVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f9072b;
                i30 i30Var = (i30) this.f9073c;
                boolean z11 = i30Var.f27070y;
                if (z11) {
                    float f15 = i30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        i30Var.E = f16;
                        if (f16 > 1.0f) {
                            i30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(i30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = i30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        i30Var.E = f18;
                        if (f18 < 0.0f) {
                            i30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(i30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 7:
                canvas.drawColor(855638016);
                q90 q90Var = (q90) this.f9073c;
                FrameLayout frameLayout = q90Var.f29607n;
                float[] fArr = q90Var.I;
                q90.a(frameLayout, (FrameLayout) this.f9072b, fArr);
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
                Paint paint8 = (Paint) this.f9072b;
                hs hsVar = (hs) this.f9073c;
                org.telegram.ui.Components.w9 w9Var2 = hsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (hsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                lz lzVar = (lz) this.f9073c;
                FrameLayout frameLayout2 = lzVar.f37385a;
                float[] fArr2 = lzVar.f37394y;
                gz.a(frameLayout2, (FrameLayout) this.f9072b, fArr2);
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
                Paint paint9 = (Paint) this.f9072b;
                u60 u60Var = (u60) this.f9073c;
                if (u60Var.d != null && u60Var.f41909n.getVisibility() == 0 && u60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (u60Var.f41909n.getAlpha() * u60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f9072b;
                pe0 pe0Var = (pe0) this.f9073c;
                md mdVar = pe0Var.f40116r;
                ci.k4 k4Var3 = pe0Var.e;
                if (k4Var3 != null && mdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (mdVar.getAlpha() * k4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((z51) this.f9073c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.f9072b));
                    return;
                }
            case 14:
                z71 z71Var = (z71) this.f9073c;
                int height = z71.g0(z71Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f9072b;
                paint11.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21272s8, z71.h0(z71Var)));
                z71Var.f43678b.J(canvas, 0.0f, rect, paint11, true);
                if (z71Var.getParentLayout() != null) {
                    ((ActionBarLayout) z71Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                mc1 mc1Var = (mc1) this.f9073c;
                int currentItem = mc1Var.f39152j0.getCurrentItem();
                Paint paint12 = (Paint) this.f9072b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                if (mc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.h6.D0(i13);
                } else {
                    themedColor = mc1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f9072b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) xf1.s0((xf1) this.f9073c)).q(canvas, measuredHeight2);
                return;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f9072b);
                sg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f9073c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9071a) {
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
        switch (this.f9071a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9072b;
                g6 g6Var = faVar.d;
                if (faVar.f26194g != null && g6Var.getMeasuredHeight() != 0 && g6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.f26203q = g6Var.getMeasuredHeight();
                    faVar.f26204r = g6Var.getMeasuredWidth();
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
        switch (this.f9071a) {
            case 4:
                super.setAlpha(f7);
                View view = ((sn) this.f9073c).fragmentView;
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
                ((i30) this.f9073c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f9071a) {
            case 6:
                super.setScaleX(f7);
                ((i30) this.f9073c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f9071a) {
            case 6:
                super.setScaleY(f7);
                ((i30) this.f9073c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f9071a) {
            case 6:
                super.setTranslationY(f7);
                ((i30) this.f9073c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f9071a) {
            case 4:
                super.setVisibility(i10);
                View view = ((sn) this.f9073c).fragmentView;
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
    public void u(int i10, float f7, float f10, ne.e eVar) {
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
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f9071a) {
            case 0:
                if (drawable != ((ah0) this.f9073c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public g6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f9071a = 11;
        this.f9073c = new ne.b(0, this, bs.h, 380L, true);
        this.f9072b = d5Var;
    }

    public g6(Activity activity) {
        super(activity);
        this.f9071a = 0;
        Paint paint = new Paint(1);
        this.f9072b = paint;
        ah0 ah0Var = new ah0(10);
        this.f9073c = ah0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ah0Var.setCallback(this);
        ah0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public g6(hi.o oVar, Context context) {
        super(context);
        this.f9071a = 1;
        this.f9073c = oVar;
        this.f9072b = new Paint(1);
    }

    public g6(i30 i30Var, Context context) {
        super(context);
        this.f9071a = 6;
        this.f9073c = i30Var;
        this.f9072b = new Paint(1);
    }

    public g6(z71 z71Var, Context context) {
        super(context);
        this.f9071a = 14;
        this.f9073c = z71Var;
        this.f9072b = new Paint(1);
    }

    public g6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f9071a = 17;
        this.f9072b = paint;
        this.f9073c = drawable;
    }

    public g6(xf1 xf1Var, Context context) {
        super(context);
        this.f9071a = 16;
        this.f9073c = xf1Var;
        this.f9072b = new Paint();
    }

    public g6(Context context, mc1 mc1Var) {
        super(context);
        this.f9071a = 15;
        this.f9073c = mc1Var;
        this.f9072b = new Paint(1);
    }

    public g6(sn snVar, Context context) {
        super(context);
        this.f9071a = 3;
        this.f9073c = snVar;
        this.f9072b = new RectF();
    }

    public g6(sn snVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f9071a = 4;
        this.f9073c = snVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, d6Var);
        this.f9072b = faVar;
        faVar.f26202p = false;
        faVar.f26200n = true;
    }

    @Override
    public void E(float f7, int i10) {
    }
}
