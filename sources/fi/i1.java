package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.xq;
public final class i1 extends FrameLayout {
    public final int f12161a = 0;
    public final Object f12162b;
    public final Object f12163c;
    public final Object d;
    public Object f12164e;
    public Object f12165f;
    public Object h;
    public final Object f12166n;
    public final Object f12167r;
    public Object f12168s;
    public final Object f12169w;

    public i1(po0 po0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12169w = po0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12162b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var), 20, 20, 6, 6));
        c8.ka.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, c8.ha.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f12163c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f27934hf, f6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ha.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, c8.ha.t(-2, -1, 115, 6, 0, 0, 0));
        this.f12166n = new org.telegram.ui.Components.l9[3];
        for (int i7 = 2; i7 >= 0; i7--) {
            ((org.telegram.ui.Components.l9[]) this.f12166n)[i7] = new org.telegram.ui.Components.l9(context);
            ((org.telegram.ui.Components.l9[]) this.f12166n)[i7].setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            ((org.telegram.ui.Components.l9[]) this.f12166n)[i7].setVisibility(8);
            int i10 = 32 - (i7 * 4);
            ((FrameLayout) this.h).addView(((org.telegram.ui.Components.l9[]) this.f12166n)[i7], c8.ha.d(i10, i10, 19, i7 * 12, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f12167r = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        l9Var.setVisibility(8);
        ((LinearLayout) this.f12162b).addView(l9Var, c8.ha.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.f12162b).addView(frameLayout2, c8.ha.p(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27989kf, f6Var);
        frameLayout2.addView(k5Var, c8.ha.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f12164e = k5Var2;
        k5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.k6.Ll;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i11, f6Var);
        frameLayout2.addView(k5Var2, c8.ha.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.f12165f = k5Var3;
        k5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Y(k5Var3, i11, f6Var);
        k5Var3.setAlpha(0.0f);
        frameLayout2.addView(k5Var3, c8.ha.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12168s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231500);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Kl, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var), 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new la0(this, 11));
        ((LinearLayout) this.f12162b).addView(imageView2, c8.ha.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        switch (this.f12161a) {
            case 0:
                RectF rectF = (RectF) this.f12167r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.f12162b;
                int i7 = org.telegram.ui.ActionBar.k6.f27925h5;
                k2 k2Var = (k2) this.f12169w;
                g1 g1Var = k2Var.f12255m1;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i7, k2Var.I0));
                if (((Bitmap) this.f12164e) == null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.85f;
                }
                paint2.setAlpha((int) (f10 * 255.0f));
                View[] viewPages = g1Var.getViewPages();
                k2Var.f12262u1 = 0.0f;
                boolean z10 = false;
                for (View view : viewPages) {
                    if (view instanceof u1) {
                        u1 u1Var = (u1) view;
                        k2Var.f12262u1 += Utilities.i(1.0f - Math.abs(u1Var.getTranslationX() / u1Var.getMeasuredWidth()), 1.0f, 0.0f) * u1Var.b();
                        if (u1Var.getVisibility() == 0) {
                            u1Var.c();
                        }
                    }
                }
                org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.f12166n;
                if (k2Var.f12262u1 <= 0.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e10 = w5Var.e(false, f11);
                float paddingTop = (k2Var.f12262u1 + g1Var.getPaddingTop()) - org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(8.0f), g1Var.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(k2Var.f28649t0, paddingTop, getWidth() - k2Var.f28649t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                if (((Bitmap) this.f12164e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f12165f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), (Paint) this.f12163c);
                }
                if (rectF2.top < org.telegram.messenger.g0.f22557m) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Boolean bool = (Boolean) this.f12168s;
                if (bool == null || bool.booleanValue() != z9) {
                    this.f12168s = Boolean.valueOf(z9);
                    Window window = k2Var.getWindow();
                    if (z9 && org.telegram.messenger.g0.B(paint2.getColor()) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.s3(window, z10);
                }
                float f12 = 1.0f - e10;
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f) * f12, org.telegram.messenger.g0.L(14.0f) * f12, paint2);
                rectF.set((getWidth() - org.telegram.messenger.g0.L(36.0f)) / 2.0f, org.telegram.messenger.g0.L(9.66f) + paddingTop, (org.telegram.messenger.g0.L(36.0f) + getWidth()) / 2.0f, paddingTop + org.telegram.messenger.g0.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f12 * 81.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas.save();
                canvas.clipRect(rectF2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12161a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    k2 k2Var = (k2) this.f12169w;
                    if (y10 < k2Var.f12262u1) {
                        k2Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12161a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.f12164e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.f12163c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f12161a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                k2 k2Var = (k2) this.f12169w;
                if (((Bitmap) this.f12164e) == null) {
                    org.telegram.ui.ActionBar.f6 f6Var = k2Var.I0;
                    if (f6Var == null) {
                        if (!org.telegram.ui.ActionBar.k6.I.q()) {
                            return;
                        }
                    } else if (!f6Var.a()) {
                        return;
                    }
                    if (k2Var.f12261t1 != null && iz.o() > 0 && !sc.f()) {
                        Point point = org.telegram.messenger.g0.f22563q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        k2Var.f12261t1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.f12164e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.f12164e, tileMode, tileMode);
                        this.f12165f = bitmapShader;
                        ((Paint) this.f12163c).setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f12165f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12161a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.g0.L(350.0f) / 0.55f) * 0.45f);
                k2 k2Var = (k2) this.f12169w;
                k2Var.f12256o1 = min;
                g1 g1Var = k2Var.f12255m1;
                g1Var.setPadding(0, org.telegram.messenger.g0.f22557m, 0, 0);
                g1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                j2 j2Var = k2Var.n1;
                if (j2Var != null) {
                    j2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12161a) {
            case 0:
                super.setTranslationY(f10);
                invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public i1(k2 k2Var, Context context) {
        super(context);
        this.f12169w = k2Var;
        this.f12162b = new Paint(1);
        this.f12163c = new Paint(3);
        this.d = new Paint(1);
        this.f12166n = new org.telegram.ui.Components.w5(this, 0L, 250L, xq.h);
        this.f12167r = new RectF();
    }
}
