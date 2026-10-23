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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.r90;
import org.telegram.ui.b61;
import org.telegram.ui.bg1;
import org.telegram.ui.c81;
import org.telegram.ui.hs;
import org.telegram.ui.hz;
import org.telegram.ui.kd;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.mz;
import org.telegram.ui.qc1;
import org.telegram.ui.qn;
import org.telegram.ui.sn;
import org.telegram.ui.ue0;
import org.telegram.ui.w60;
public final class g6 extends View implements ne.d {
    public final int f9078a;
    public Object f9079b;
    public final Object f9080c;

    public g6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f9078a = i10;
        this.f9080c = obj;
        this.f9079b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9079b;
        if (faVar.f26258t) {
            if ((faVar.f26251m == 1.0f || !faVar.f26254p) && faVar.f26252n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.f9080c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9078a) {
            case 3:
                RectF rectF = (RectF) this.f9079b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                sn snVar = (sn) this.f9080c;
                int backgroundSizeY = snVar.f41561j1.getBackgroundSizeY();
                float x10 = getX();
                float U8 = snVar.U8(this);
                qn qnVar = snVar.f41654qa;
                if (qnVar != null) {
                    qnVar.b(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.k6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackground"));
                qn qnVar2 = snVar.f41654qa;
                if (qnVar2 == null ? org.telegram.ui.ActionBar.k6.c1() : qnVar2.f()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.h5) this.f9079b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
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
        switch (this.f9078a) {
            case 0:
                Paint paint = (Paint) this.f9079b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                eh0 eh0Var = (eh0) this.f9080c;
                eh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                eh0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f9079b;
                hi.o oVar = (hi.o) this.f9080c;
                org.telegram.ui.Components.w9 w9Var = oVar.f12229w;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.f12229w.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                Paint paint3 = (Paint) this.f9079b;
                md mdVar = (md) this.f9080c;
                ci.j4 j4Var = mdVar.f39482f;
                if (j4Var != null && j4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.f39497s.getAlpha() * mdVar.f39482f.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9079b;
                Paint paint4 = faVar.f26261x;
                org.telegram.ui.ActionBar.g6 g6Var = faVar.f26262y;
                Paint paint5 = faVar.f26260w;
                int i11 = faVar.f26243b;
                View view = faVar.f26244c;
                g6 g6Var2 = faVar.d;
                if (g6Var2 != null) {
                    if (g6Var2.getMeasuredHeight() != 0 || g6Var2.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !faVar.f26258t && !faVar.f26254p) {
                            faVar.a();
                            faVar.f26250l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.f26246g;
                        if ((bitmapArr2 != null || faVar.f26253o) && faVar.f26254p) {
                            boolean z10 = faVar.f26252n;
                            if (z10) {
                                float f11 = faVar.f26251m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    faVar.f26251m = f12;
                                    if (f12 > 1.0f) {
                                        faVar.f26251m = 1.0f;
                                    }
                                    g6Var2.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = faVar.f26251m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    faVar.f26251m = f14;
                                    if (f14 < 0.0f) {
                                        faVar.f26251m = 0.0f;
                                    }
                                    g6Var2.invalidate();
                                }
                            }
                        }
                        if (faVar.f26254p) {
                            f7 = faVar.f26251m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && faVar.f26253o) {
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
                            canvas.saveLayerAlpha(0.0f, 0.0f, g6Var2.getMeasuredWidth(), g6Var2.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint5.setAlpha((int) (f7 * 255.0f));
                            if (i11 == r02) {
                                canvas.translate(f10, faVar.f26259u);
                            }
                            canvas.save();
                            canvas.scale(g6Var2.getMeasuredWidth() / bitmapArr[r02].getWidth(), g6Var2.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f10, faVar.f26259u);
                            }
                            canvas.scale(g6Var2.getMeasuredWidth() / bitmapArr[r16].getWidth(), faVar.f26257s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint5);
                            canvas.restore();
                            faVar.f26258t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (faVar.f26252n && !faVar.f26249k) {
                            if (faVar.f26246g == null || faVar.f26250l) {
                                faVar.f26249k = r02;
                                faVar.f26250l = r16;
                                if (faVar.e == null) {
                                    faVar.e = new Bitmap[2];
                                    faVar.f26248j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (faVar.e[i12] != null && g6Var2.getMeasuredWidth() == faVar.f26256r && g6Var2.getMeasuredHeight() == faVar.f26255q) {
                                        faVar.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight = g6Var2.getMeasuredHeight();
                                        int measuredWidth = g6Var2.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        faVar.f26257s = dp;
                                        if (i12 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            faVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            faVar.f26248j[i12] = new Canvas(faVar.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new pg(faVar, 12));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        faVar.e[i12].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var));
                                    }
                                    faVar.f26248j[i12].save();
                                    faVar.f26248j[i12].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (g6Var instanceof qn) {
                                            background = ((qn) g6Var).l();
                                        } else {
                                            background = org.telegram.ui.ActionBar.k6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        faVar.f26248j[i12].translate(f10, -faVar.f26259u);
                                        view.draw(faVar.f26248j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(faVar.f26248j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(faVar.f26248j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    faVar.f26248j[i12].restore();
                                }
                                faVar.f26255q = g6Var2.getMeasuredHeight();
                                faVar.f26256r = g6Var2.getMeasuredWidth();
                                faVar.v.f25942b = g6Var2.getMeasuredWidth();
                                faVar.v.f25943c = g6Var2.getMeasuredHeight();
                                org.telegram.ui.Components.ea eaVar = faVar.v;
                                if (eaVar.f25942b != 0 && eaVar.f25943c != 0) {
                                    if (faVar.f26242a == null) {
                                        faVar.f26242a = new DispatchQueue("blur_thread_" + faVar);
                                    }
                                    faVar.f26242a.postRunnable(faVar.v);
                                    return;
                                }
                                faVar.f26249k = false;
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
                Paint paint6 = (Paint) this.f9079b;
                ko koVar = (ko) this.f9080c;
                ci.j4 j4Var2 = koVar.e;
                if (j4Var2 != null && j4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (koVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 6:
                Paint paint7 = (Paint) this.f9079b;
                i30 i30Var = (i30) this.f9080c;
                boolean z11 = i30Var.f27198y;
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
                r90 r90Var = (r90) this.f9080c;
                FrameLayout frameLayout = r90Var.f30127n;
                float[] fArr = r90Var.I;
                r90.a(frameLayout, (FrameLayout) this.f9079b, fArr);
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
                Paint paint8 = (Paint) this.f9079b;
                hs hsVar = (hs) this.f9080c;
                org.telegram.ui.Components.w9 w9Var2 = hsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (hsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 9:
                canvas.drawColor(855638016);
                mz mzVar = (mz) this.f9080c;
                FrameLayout frameLayout2 = mzVar.f37987a;
                float[] fArr2 = mzVar.f37996y;
                hz.a(frameLayout2, (FrameLayout) this.f9079b, fArr2);
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
                Paint paint9 = (Paint) this.f9079b;
                w60 w60Var = (w60) this.f9080c;
                if (w60Var.d != null && w60Var.f42939n.getVisibility() == 0 && w60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (w60Var.f42939n.getAlpha() * w60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 12:
                Paint paint10 = (Paint) this.f9079b;
                ue0 ue0Var = (ue0) this.f9080c;
                kd kdVar = ue0Var.f42398r;
                ci.j4 j4Var3 = ue0Var.e;
                if (j4Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * j4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 13:
                if (!((b61) this.f9080c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.g6) this.f9079b));
                    return;
                }
            case 14:
                Paint paint11 = (Paint) this.f9079b;
                c81 c81Var = (c81) this.f9080c;
                int height = c81.h0(c81Var).getHeight();
                if (AndroidUtilities.isTablet()) {
                    paint11.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, c81.i0(c81Var)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), height, paint11);
                    return;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                paint11.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, c81.j0(c81Var)));
                c81Var.f36292b.I(canvas, 0.0f, rect, paint11, true);
                if (c81Var.getParentLayout() != null) {
                    ((ActionBarLayout) c81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 15:
                qc1 qc1Var = (qc1) this.f9080c;
                int currentItem = qc1Var.f40746k0.getCurrentItem();
                Paint paint12 = (Paint) this.f9079b;
                int i13 = org.telegram.ui.ActionBar.k6.Ae;
                if (qc1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.k6.E0(i13);
                } else {
                    themedColor = qc1Var.getThemedColor(i13);
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
                Paint paint13 = (Paint) this.f9079b;
                paint13.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) bg1.s0((bg1) this.f9080c)).q(canvas, measuredHeight2);
                return;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.p5 p5Var = ((org.telegram.ui.Wallet.s5) this.f9080c).f35131b;
                if (p5Var != null) {
                    p5Var.e(canvas, (float[]) this.f9079b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.h7.a((float[]) this.f9079b, -16216082));
                }
                canvas.restoreToCount(save);
                return;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f9079b);
                sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.b1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f9080c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9078a) {
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
        switch (this.f9078a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f9079b;
                g6 g6Var = faVar.d;
                if (faVar.f26246g != null && g6Var.getMeasuredHeight() != 0 && g6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.f26255q = g6Var.getMeasuredHeight();
                    faVar.f26256r = g6Var.getMeasuredWidth();
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
        switch (this.f9078a) {
            case 4:
                super.setAlpha(f7);
                View view = ((sn) this.f9080c).fragmentView;
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
                ((i30) this.f9080c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setScaleX(f7);
                ((i30) this.f9080c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setScaleY(f7);
                ((i30) this.f9080c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f9078a) {
            case 6:
                super.setTranslationY(f7);
                ((i30) this.f9080c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f9078a) {
            case 4:
                super.setVisibility(i10);
                View view = ((sn) this.f9080c).fragmentView;
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
        switch (this.f9078a) {
            case 0:
                if (drawable != ((eh0) this.f9080c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public g6(Context context, org.telegram.ui.ActionBar.h5 h5Var) {
        super(context);
        this.f9078a = 11;
        this.f9080c = new ne.b(0, this, bs.h, 380L, true);
        this.f9079b = h5Var;
    }

    public g6(Activity activity) {
        super(activity);
        this.f9078a = 0;
        Paint paint = new Paint(1);
        this.f9079b = paint;
        eh0 eh0Var = new eh0(10);
        this.f9080c = eh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        eh0Var.setCallback(this);
        eh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public g6(hi.o oVar, Context context) {
        super(context);
        this.f9078a = 1;
        this.f9080c = oVar;
        this.f9079b = new Paint(1);
    }

    public g6(i30 i30Var, Context context) {
        super(context);
        this.f9078a = 6;
        this.f9080c = i30Var;
        this.f9079b = new Paint(1);
    }

    public g6(c81 c81Var, Context context) {
        super(context);
        this.f9078a = 14;
        this.f9080c = c81Var;
        this.f9079b = new Paint(1);
    }

    public g6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f9078a = 18;
        this.f9079b = paint;
        this.f9080c = drawable;
    }

    public g6(org.telegram.ui.Wallet.s5 s5Var, Context context) {
        super(context);
        this.f9078a = 17;
        this.f9080c = s5Var;
    }

    public g6(bg1 bg1Var, Context context) {
        super(context);
        this.f9078a = 16;
        this.f9080c = bg1Var;
        this.f9079b = new Paint();
    }

    public g6(Context context, qc1 qc1Var) {
        super(context);
        this.f9078a = 15;
        this.f9080c = qc1Var;
        this.f9079b = new Paint(1);
    }

    public g6(sn snVar, Context context) {
        super(context);
        this.f9078a = 3;
        this.f9080c = snVar;
        this.f9079b = new RectF();
    }

    public g6(sn snVar, Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f9078a = 4;
        this.f9080c = snVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, g6Var);
        this.f9079b = faVar;
        faVar.f26254p = false;
        faVar.f26252n = true;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
