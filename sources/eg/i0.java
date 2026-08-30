package eg;

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
import nh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cd1;
import org.telegram.ui.e70;
import org.telegram.ui.ld;
import org.telegram.ui.nd;
import org.telegram.ui.ns;
import org.telegram.ui.o81;
import org.telegram.ui.og1;
import org.telegram.ui.po;
import org.telegram.ui.q61;
import org.telegram.ui.rz;
import org.telegram.ui.vn;
import org.telegram.ui.wz;
import org.telegram.ui.xn;
import org.telegram.ui.ze0;
public final class i0 extends View implements xd.b {
    public final int f5300a;
    public final Object f5301b;
    public final Object f5302c;

    public i0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5300a = i10;
        this.f5302c = obj;
        this.f5301b = obj2;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (f10 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f10);
    }

    public boolean a() {
        x9 x9Var = (x9) this.f5301b;
        if (x9Var.f30631t) {
            if ((x9Var.f30624m == 1.0f || !x9Var.f30627p) && x9Var.f30625n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void b(boolean z4, boolean z10) {
        ((xd.a) this.f5302c).a(z4, z10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5300a) {
            case 2:
                RectF rectF = (RectF) this.f5301b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                xn xnVar = (xn) this.f5302c;
                int backgroundSizeY = xnVar.U0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = xnVar.P8(this);
                vn vnVar = xnVar.f39968ba;
                if (vnVar != null) {
                    vnVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackground"));
                vn vnVar2 = xnVar.f39968ba;
                if (vnVar2 == null ? j6.a1() : vnVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((e5) this.f5301b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        Bitmap[] bitmapArr;
        ?? r02;
        float f11;
        float f12;
        char c3;
        int themedColor;
        int i10;
        switch (this.f5300a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f5301b);
                r1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), r1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f5302c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) this.f5301b;
                nd ndVar = (nd) this.f5302c;
                y3 y3Var = ndVar.e;
                if (y3Var != null && y3Var.getImageReceiver().hasNotThumb()) {
                    paint.setAlpha((int) (ndVar.f36597r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                    return;
                }
                return;
            case 2:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                x9 x9Var = (x9) this.f5301b;
                Paint paint2 = x9Var.f30634x;
                f6 f6Var = x9Var.f30635y;
                Paint paint3 = x9Var.f30633w;
                int i11 = x9Var.f30616b;
                View view = x9Var.f30617c;
                i0 i0Var = x9Var.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !x9Var.f30631t && !x9Var.f30627p) {
                            x9Var.a();
                            x9Var.f30623l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.f30619g;
                        if ((bitmapArr2 != null || x9Var.f30626o) && x9Var.f30627p) {
                            boolean z4 = x9Var.f30625n;
                            if (z4) {
                                float f13 = x9Var.f30624m;
                                if (f13 != 1.0f) {
                                    float f14 = f13 + 0.09f;
                                    x9Var.f30624m = f14;
                                    if (f14 > 1.0f) {
                                        x9Var.f30624m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z4) {
                                float f15 = x9Var.f30624m;
                                if (f15 != 0.0f) {
                                    float f16 = f15 - 0.09f;
                                    x9Var.f30624m = f16;
                                    if (f16 < 0.0f) {
                                        x9Var.f30624m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        if (x9Var.f30627p) {
                            f10 = x9Var.f30624m;
                        } else {
                            f10 = 1.0f;
                        }
                        if (bitmapArr2 == null && x9Var.f30626o) {
                            paint2.setAlpha((int) (50.0f * f10));
                            canvas.drawPaint(paint2);
                            return;
                        }
                        if (f10 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c3 = 0;
                        } else {
                            bitmapArr = bitmapArr2;
                            r02 = 1;
                            f11 = 0.0f;
                            f12 = 255.0f;
                            c3 = 0;
                            canvas.saveLayerAlpha(0.0f, 0.0f, i0Var.getMeasuredWidth(), i0Var.getMeasuredHeight(), (int) (f10 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint3.setAlpha((int) (f10 * f12));
                            if (i11 == r02) {
                                canvas.translate(f11, x9Var.f30632u);
                            }
                            canvas.save();
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                            canvas.drawBitmap(bitmapArr[r02], f11, f11, paint3);
                            canvas.restore();
                            canvas.save();
                            if (i11 == 0) {
                                canvas.translate(f11, x9Var.f30632u);
                            }
                            canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), x9Var.f30630s / bitmapArr[c3].getHeight());
                            canvas.drawBitmap(bitmapArr[c3], f11, f11, paint3);
                            canvas.restore();
                            x9Var.f30631t = r02;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (x9Var.f30625n && !x9Var.f30622k) {
                            if (x9Var.f30619g == null || x9Var.f30623l) {
                                x9Var.f30622k = r02;
                                x9Var.f30623l = false;
                                if (x9Var.e == null) {
                                    x9Var.e = new Bitmap[2];
                                    x9Var.f30621j = new Canvas[2];
                                }
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (x9Var.e[i12] != null && i0Var.getMeasuredWidth() == x9Var.f30629r && i0Var.getMeasuredHeight() == x9Var.f30628q) {
                                        x9Var.e[i12].eraseColor(0);
                                    } else {
                                        int measuredHeight2 = i0Var.getMeasuredHeight();
                                        int measuredWidth2 = i0Var.getMeasuredWidth();
                                        int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                        x9Var.f30630s = dp2;
                                        if (i12 == 0) {
                                            measuredHeight2 = dp2;
                                        }
                                        try {
                                            x9Var.e[i12] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                            x9Var.f30621j[i12] = new Canvas(x9Var.e[i12]);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                            return;
                                        }
                                    }
                                    if (i12 == r02) {
                                        x9Var.e[i12].eraseColor(j6.v0(j6.f19906d6, f6Var));
                                    }
                                    x9Var.f30621j[i12].save();
                                    x9Var.f30621j[i12].scale(0.06666667f, 0.06666667f, f11, f11);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (f6Var instanceof vn) {
                                            background = ((vn) f6Var).d();
                                        } else {
                                            background = j6.s0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i12));
                                    if (i12 == 0) {
                                        x9Var.f30621j[i12].translate(f11, -x9Var.f30632u);
                                        view.draw(x9Var.f30621j[i12]);
                                    }
                                    if (background != null && i12 == r02) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(x9Var.f30621j[i12]);
                                        background.setBounds(bounds);
                                        view.draw(x9Var.f30621j[i12]);
                                    }
                                    view.setTag(67108867, null);
                                    x9Var.f30621j[i12].restore();
                                }
                                x9Var.f30628q = i0Var.getMeasuredHeight();
                                x9Var.f30629r = i0Var.getMeasuredWidth();
                                x9Var.v.f30278b = i0Var.getMeasuredWidth();
                                x9Var.v.f30279c = i0Var.getMeasuredHeight();
                                w9 w9Var = x9Var.v;
                                if (w9Var.f30278b != 0 && w9Var.f30279c != 0) {
                                    if (x9Var.f30615a == null) {
                                        x9Var.f30615a = new DispatchQueue("blur_thread_" + x9Var);
                                    }
                                    x9Var.f30615a.postRunnable(x9Var.v);
                                    return;
                                }
                                x9Var.f30622k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Paint paint4 = (Paint) this.f5301b;
                po poVar = (po) this.f5302c;
                y3 y3Var2 = poVar.e;
                if (y3Var2 != null && y3Var2.getImageReceiver().hasNotThumb()) {
                    paint4.setAlpha((int) (poVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    return;
                }
                return;
            case 5:
                Paint paint5 = (Paint) this.f5301b;
                a30 a30Var = (a30) this.f5302c;
                boolean z10 = a30Var.f23288y;
                if (z10) {
                    float f17 = a30Var.B;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        a30Var.B = f18;
                        if (f18 > 1.0f) {
                            a30Var.B = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.a.d(a30Var.B, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * a30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                        return;
                    }
                }
                if (!z10) {
                    float f19 = a30Var.B;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        a30Var.B = f20;
                        if (f20 < 0.0f) {
                            a30Var.B = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.a.d(a30Var.B, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * a30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                return;
            case 6:
                canvas.drawColor(855638016);
                x80 x80Var = (x80) this.f5302c;
                FrameLayout frameLayout = x80Var.f30607n;
                float[] fArr = x80Var.F;
                x80.a(frameLayout, (FrameLayout) this.f5301b, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 7:
                Paint paint6 = (Paint) this.f5301b;
                ns nsVar = (ns) this.f5302c;
                p9 p9Var = nsVar.e;
                if (p9Var != null && p9Var.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (nsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 8:
                canvas.drawColor(855638016);
                wz wzVar = (wz) this.f5302c;
                FrameLayout frameLayout2 = wzVar.f38142a;
                float[] fArr2 = wzVar.f38151y;
                rz.a(frameLayout2, (FrameLayout) this.f5301b, fArr2);
                canvas.save();
                float y11 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 9:
                Paint paint7 = (Paint) this.f5301b;
                e70 e70Var = (e70) this.f5302c;
                if (e70Var.d != null && e70Var.f33919n.getVisibility() == 0 && e70Var.d.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (e70Var.f33919n.getAlpha() * e70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 11:
                Paint paint8 = (Paint) this.f5301b;
                ze0 ze0Var = (ze0) this.f5302c;
                ld ldVar = ze0Var.f40783r;
                y3 y3Var3 = ze0Var.e;
                if (y3Var3 != null && ldVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (ldVar.getAlpha() * y3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 12:
                if (!((q61) this.f5302c).N0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(j6.v0(j6.G8, (f6) this.f5301b));
                    return;
                }
            case 13:
                o81 o81Var = (o81) this.f5302c;
                int height = o81.g0(o81Var).getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint9 = (Paint) this.f5301b;
                paint9.setColor(j6.v0(j6.f20176s8, o81.h0(o81Var)));
                o81Var.f36815b.J(canvas, 0.0f, rect, paint9, true);
                if (o81Var.getParentLayout() != null) {
                    ((ActionBarLayout) o81Var.getParentLayout()).q(canvas, height);
                    return;
                }
                return;
            case 14:
                cd1 cd1Var = (cd1) this.f5302c;
                int currentItem = cd1Var.f33308g0.getCurrentItem();
                Paint paint10 = (Paint) this.f5301b;
                int i13 = j6.Ae;
                if (cd1Var.d) {
                    themedColor = j6.C0(i13);
                } else {
                    themedColor = cd1Var.getThemedColor(i13);
                }
                paint10.setColor(themedColor);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint10.setAlpha(i10);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint10);
                }
                return;
            case 15:
                Paint paint11 = (Paint) this.f5301b;
                paint11.setColor(j6.w0(null, j6.f19906d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint11);
                ((ActionBarLayout) og1.s0((og1) this.f5302c)).q(canvas, measuredHeight3);
                return;
            case 16:
                Paint paint12 = (Paint) this.f5301b;
                paint12.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint12);
                mg0 mg0Var = (mg0) this.f5302c;
                mg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                mg0Var.draw(canvas);
                canvas.restore();
                return;
            case 17:
                Paint paint13 = (Paint) this.f5301b;
                sh.n nVar = (sh.n) this.f5302c;
                p9 p9Var2 = nVar.v;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    paint13.setColor(1426063360);
                    paint13.setAlpha((int) (nVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint13);
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5300a) {
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5300a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                x9 x9Var = (x9) this.f5301b;
                i0 i0Var = x9Var.d;
                if (x9Var.f30619g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.f30628q = i0Var.getMeasuredHeight();
                    x9Var.f30629r = i0Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f5300a) {
            case 3:
                super.setAlpha(f10);
                View view = ((xn) this.f5302c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                super.setAlpha(f10);
                return;
            case 5:
                super.setAlpha(f10);
                ((a30) this.f5302c).d.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f5300a) {
            case 5:
                super.setScaleX(f10);
                ((a30) this.f5302c).d.setScaleX(f10);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setScaleY(float f10) {
        switch (this.f5300a) {
            case 5:
                super.setScaleY(f10);
                ((a30) this.f5302c).d.setScaleY(f10);
                return;
            default:
                super.setScaleY(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f5300a) {
            case 5:
                super.setTranslationY(f10);
                ((a30) this.f5302c).d.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f5300a) {
            case 3:
                super.setVisibility(i10);
                View view = ((xn) this.f5302c).fragmentView;
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
        switch (this.f5300a) {
            case 16:
                if (drawable != ((mg0) this.f5302c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i0(Context context, e5 e5Var) {
        super(context);
        this.f5300a = 10;
        this.f5302c = new xd.a(0, this, nr.h, 380L, true);
        this.f5301b = e5Var;
    }

    public i0(Activity activity) {
        super(activity);
        this.f5300a = 16;
        Paint paint = new Paint(1);
        this.f5301b = paint;
        mg0 mg0Var = new mg0(10);
        this.f5302c = mg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        mg0Var.setCallback(this);
        mg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public i0(sh.n nVar, Context context) {
        super(context);
        this.f5300a = 17;
        this.f5302c = nVar;
        this.f5301b = new Paint(1);
    }

    public i0(a30 a30Var, Context context) {
        super(context);
        this.f5300a = 5;
        this.f5302c = a30Var;
        this.f5301b = new Paint(1);
    }

    public i0(o81 o81Var, Context context) {
        super(context);
        this.f5300a = 13;
        this.f5302c = o81Var;
        this.f5301b = new Paint(1);
    }

    public i0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f5300a = 0;
        this.f5301b = paint;
        this.f5302c = drawable;
    }

    public i0(og1 og1Var, Context context) {
        super(context);
        this.f5300a = 15;
        this.f5302c = og1Var;
        this.f5301b = new Paint();
    }

    public i0(Context context, cd1 cd1Var) {
        super(context);
        this.f5300a = 14;
        this.f5302c = cd1Var;
        this.f5301b = new Paint(1);
    }

    public i0(xn xnVar, Context context) {
        super(context);
        this.f5300a = 2;
        this.f5302c = xnVar;
        this.f5301b = new RectF();
    }

    public i0(xn xnVar, Context context, View view, f6 f6Var) {
        super(context);
        this.f5300a = 3;
        this.f5302c = xnVar;
        x9 x9Var = new x9(view, this, f6Var);
        this.f5301b = x9Var;
        x9Var.f30627p = false;
        x9Var.f30625n = true;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
