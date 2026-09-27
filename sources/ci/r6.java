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
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.a91;
import org.telegram.ui.c71;
import org.telegram.ui.ef0;
import org.telegram.ui.j70;
import org.telegram.ui.ld;
import org.telegram.ui.nd;
import org.telegram.ui.pd1;
import org.telegram.ui.ps;
import org.telegram.ui.so;
import org.telegram.ui.uz;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import org.telegram.ui.zg1;
import org.telegram.ui.zz;
public final class r6 extends View implements le.e {
    public final int f5453a;
    public final Object f5454b;
    public final Object f5455c;

    public r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5453a = i10;
        this.f5455c = obj;
        this.f5454b = obj2;
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
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f5454b;
        if (faVar.f24223t) {
            if ((faVar.f24216m == 1.0f || !faVar.f24219p) && faVar.f24217n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.c) this.f5455c).a(z10, z11);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5453a) {
            case 4:
                RectF rectF = (RectF) this.f5454b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                xn xnVar = (xn) this.f5455c;
                int backgroundSizeY = xnVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = xnVar.P8(this);
                vn vnVar = xnVar.f39750ea;
                if (vnVar != null) {
                    vnVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackground"));
                vn vnVar2 = xnVar.f39750ea;
                if (vnVar2 == null ? org.telegram.ui.ActionBar.i6.a1() : vnVar2.p0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.f5454b)).q(canvas, 0);
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
        switch (this.f5453a) {
            case 0:
                Paint paint = (Paint) this.f5454b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                sg0 sg0Var = (sg0) this.f5455c;
                sg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                sg0Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Paint paint2 = (Paint) this.f5454b;
                fi.p pVar = (fi.p) this.f5455c;
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i11 = 0; i11 < 7; i11++) {
                    float f12 = width / 2.0f;
                    String str = ((String[]) this.f5454b)[i11];
                    canvas.drawText(str, f12 + (i11 * width) + paddingLeft, ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.f5455c).f34931f);
                }
                return;
            case 3:
                Paint paint3 = (Paint) this.f5454b;
                nd ndVar = (nd) this.f5455c;
                ai.y5 y5Var = ndVar.e;
                if (y5Var != null && y5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.f35955r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    return;
                }
                return;
            case 4:
            case 12:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f5454b;
                Paint paint4 = faVar.f24226x;
                org.telegram.ui.ActionBar.e6 e6Var = faVar.f24227y;
                Paint paint5 = faVar.f24225w;
                int i12 = faVar.f24208b;
                View view = faVar.f24209c;
                r6 r6Var = faVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i12 == 1 && !faVar.f24223t && !faVar.f24219p) {
                            faVar.a();
                            faVar.f24215l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.f24211g;
                        if ((bitmapArr2 != null || faVar.f24218o) && faVar.f24219p) {
                            boolean z10 = faVar.f24217n;
                            if (z10) {
                                float f13 = faVar.f24216m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    faVar.f24216m = f14;
                                    if (f14 > 1.0f) {
                                        faVar.f24216m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f15 = faVar.f24216m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    faVar.f24216m = f16;
                                    if (f16 < 0.0f) {
                                        faVar.f24216m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        if (faVar.f24219p) {
                            f7 = faVar.f24216m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && faVar.f24218o) {
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
                            if (i12 == r02) {
                                canvas.translate(f10, faVar.f24224u);
                            }
                            canvas.save();
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                            canvas.restore();
                            canvas.save();
                            if (i12 == 0) {
                                canvas.translate(f10, faVar.f24224u);
                            }
                            canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), faVar.f24222s / bitmapArr[c10].getHeight());
                            canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                            canvas.restore();
                            faVar.f24223t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (faVar.f24217n && !faVar.f24214k) {
                            if (faVar.f24211g == null || faVar.f24215l) {
                                faVar.f24214k = r02;
                                faVar.f24215l = false;
                                if (faVar.e == null) {
                                    faVar.e = new Bitmap[2];
                                    faVar.f24213j = new Canvas[2];
                                }
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (faVar.e[i13] != null && r6Var.getMeasuredWidth() == faVar.f24221r && r6Var.getMeasuredHeight() == faVar.f24220q) {
                                        faVar.e[i13].eraseColor(0);
                                    } else {
                                        int measuredHeight = r6Var.getMeasuredHeight();
                                        int measuredWidth = r6Var.getMeasuredWidth();
                                        int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        faVar.f24222s = dp;
                                        if (i13 == 0) {
                                            measuredHeight = dp;
                                        }
                                        try {
                                            faVar.e[i13] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                            faVar.f24213j[i13] = new Canvas(faVar.e[i13]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new pg(faVar, 11));
                                            return;
                                        }
                                    }
                                    if (i13 == r02) {
                                        faVar.e[i13].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var));
                                    }
                                    faVar.f24213j[i13].save();
                                    faVar.f24213j[i13].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (e6Var instanceof vn) {
                                            background = ((vn) e6Var).d();
                                        } else {
                                            background = org.telegram.ui.ActionBar.i6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i13));
                                    if (i13 == 0) {
                                        faVar.f24213j[i13].translate(f10, -faVar.f24224u);
                                        view.draw(faVar.f24213j[i13]);
                                    }
                                    if (background != null && i13 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(faVar.f24213j[i13]);
                                        background.setBounds(bounds);
                                        view.draw(faVar.f24213j[i13]);
                                    }
                                    view.setTag(67108867, null);
                                    faVar.f24213j[i13].restore();
                                }
                                faVar.f24220q = r6Var.getMeasuredHeight();
                                faVar.f24221r = r6Var.getMeasuredWidth();
                                faVar.v.f23993b = r6Var.getMeasuredWidth();
                                faVar.v.f23994c = r6Var.getMeasuredHeight();
                                org.telegram.ui.Components.ea eaVar = faVar.v;
                                if (eaVar.f23993b != 0 && eaVar.f23994c != 0) {
                                    if (faVar.f24207a == null) {
                                        faVar.f24207a = new DispatchQueue("blur_thread_" + faVar);
                                    }
                                    faVar.f24207a.postRunnable(faVar.v);
                                    return;
                                }
                                faVar.f24214k = false;
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
                Paint paint6 = (Paint) this.f5454b;
                so soVar = (so) this.f5455c;
                ai.y5 y5Var2 = soVar.e;
                if (y5Var2 != null && y5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (soVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 7:
                Paint paint7 = (Paint) this.f5454b;
                c30 c30Var = (c30) this.f5455c;
                boolean z11 = c30Var.f23211y;
                if (z11) {
                    float f17 = c30Var.E;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        c30Var.E = f18;
                        if (f18 > 1.0f) {
                            c30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(c30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * c30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        return;
                    }
                }
                if (!z11) {
                    float f19 = c30Var.E;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        c30Var.E = f20;
                        if (f20 < 0.0f) {
                            c30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(c30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * c30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                return;
            case 8:
                canvas.drawColor(855638016);
                i90 i90Var = (i90) this.f5455c;
                FrameLayout frameLayout = i90Var.f25059n;
                float[] fArr = i90Var.I;
                i90.a(frameLayout, (FrameLayout) this.f5454b, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 9:
                Paint paint8 = (Paint) this.f5454b;
                ps psVar = (ps) this.f5455c;
                org.telegram.ui.Components.w9 w9Var2 = psVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (psVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 10:
                canvas.drawColor(855638016);
                zz zzVar = (zz) this.f5455c;
                FrameLayout frameLayout2 = zzVar.f38381a;
                float[] fArr2 = zzVar.f38390y;
                uz.a(frameLayout2, (FrameLayout) this.f5454b, fArr2);
                canvas.save();
                float y10 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 11:
                Paint paint9 = (Paint) this.f5454b;
                j70 j70Var = (j70) this.f5455c;
                if (j70Var.d != null && j70Var.f34648n.getVisibility() == 0 && j70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (j70Var.f34648n.getAlpha() * j70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    return;
                }
                return;
            case 13:
                Paint paint10 = (Paint) this.f5454b;
                ef0 ef0Var = (ef0) this.f5455c;
                ld ldVar = ef0Var.f33254r;
                ai.y5 y5Var3 = ef0Var.e;
                if (y5Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * y5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    return;
                }
                return;
            case 14:
                if (!((c71) this.f5455c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.f5454b));
                    return;
                }
            case 15:
                a91 a91Var = (a91) this.f5455c;
                int height = a91.j0(a91Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.f5454b;
                paint11.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19337s8, a91.i0(a91Var)));
                a91Var.f32012b.J(canvas, 0.0f, rect, paint11, true);
                if (a91Var.getParentLayout() != null) {
                    ((ActionBarLayout) a91Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 16:
                pd1 pd1Var = (pd1) this.f5455c;
                int currentItem = pd1Var.f36420j0.getCurrentItem();
                Paint paint12 = (Paint) this.f5454b;
                int i14 = org.telegram.ui.ActionBar.i6.Ae;
                if (pd1Var.d) {
                    themedColor = org.telegram.ui.ActionBar.i6.C0(i14);
                } else {
                    themedColor = pd1Var.getThemedColor(i14);
                }
                paint12.setColor(themedColor);
                for (int i15 = 0; i15 < 2; i15++) {
                    if (i15 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint12.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i15 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                }
                return;
            case 17:
                Paint paint13 = (Paint) this.f5454b;
                paint13.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                ((ActionBarLayout) zg1.s0((zg1) this.f5455c)).q(canvas, measuredHeight2);
                return;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.f5454b);
                rg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5455c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5453a) {
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
        switch (this.f5453a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f5454b;
                r6 r6Var = faVar.d;
                if (faVar.f24211g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.f24220q = r6Var.getMeasuredHeight();
                    faVar.f24221r = r6Var.getMeasuredWidth();
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
        switch (this.f5453a) {
            case 5:
                super.setAlpha(f7);
                View view = ((xn) this.f5455c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
            default:
                super.setAlpha(f7);
                return;
            case 7:
                super.setAlpha(f7);
                ((c30) this.f5455c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f5453a) {
            case 7:
                super.setScaleX(f7);
                ((c30) this.f5455c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f5453a) {
            case 7:
                super.setScaleY(f7);
                ((c30) this.f5455c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5453a) {
            case 7:
                super.setTranslationY(f7);
                ((c30) this.f5455c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5453a) {
            case 5:
                super.setVisibility(i10);
                View view = ((xn) this.f5455c).fragmentView;
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
        switch (this.f5453a) {
            case 0:
                if (drawable != ((sg0) this.f5455c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public r6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.f5453a = 12;
        this.f5455c = new le.c(0, this, sr.h, 380L, true);
        this.f5454b = d5Var;
    }

    public r6(Activity activity) {
        super(activity);
        this.f5453a = 0;
        Paint paint = new Paint(1);
        this.f5454b = paint;
        sg0 sg0Var = new sg0(10);
        this.f5455c = sg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        sg0Var.setCallback(this);
        sg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public r6(fi.p pVar, Context context) {
        super(context);
        this.f5453a = 1;
        this.f5455c = pVar;
        this.f5454b = new Paint(1);
    }

    public r6(a91 a91Var, Context context) {
        super(context);
        this.f5453a = 15;
        this.f5455c = a91Var;
        this.f5454b = new Paint(1);
    }

    public r6(c30 c30Var, Context context) {
        super(context);
        this.f5453a = 7;
        this.f5455c = c30Var;
        this.f5454b = new Paint(1);
    }

    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5453a = 18;
        this.f5454b = paint;
        this.f5455c = drawable;
    }

    public r6(zg1 zg1Var, Context context) {
        super(context);
        this.f5453a = 17;
        this.f5455c = zg1Var;
        this.f5454b = new Paint();
    }

    public r6(Context context, pd1 pd1Var) {
        super(context);
        this.f5453a = 16;
        this.f5455c = pd1Var;
        this.f5454b = new Paint(1);
    }

    public r6(xn xnVar, Context context) {
        super(context);
        this.f5453a = 4;
        this.f5455c = xnVar;
        this.f5454b = new RectF();
    }

    public r6(xn xnVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5453a = 5;
        this.f5455c = xnVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, e6Var);
        this.f5454b = faVar;
        faVar.f24219p = false;
        faVar.f24217n = true;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
