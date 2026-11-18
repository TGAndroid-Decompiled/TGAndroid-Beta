package hi;

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
import org.telegram.messenger.bz;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.lr;
public final class k1 extends FrameLayout {
    public final int f14851a = 0;
    public final Object f14852b;
    public final Object f14853c;
    public final Object d;
    public Object f14854e;
    public Object f14855f;
    public Object h;
    public final Object f14856n;
    public final Object f14857r;
    public Object f14858s;
    public final Object f14859w;

    public k1(cp0 cp0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f14859w = cp0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14852b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.n6.c0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29488i6, i6Var), 20, 20, 6, 6));
        c8.ra.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, c8.ma.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f14853c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29551lf, i6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ma.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, c8.ma.t(-2, -1, 115, 6, 0, 0, 0));
        this.f14856n = new org.telegram.ui.Components.q9[3];
        for (int i7 = 2; i7 >= 0; i7--) {
            ((org.telegram.ui.Components.q9[]) this.f14856n)[i7] = new org.telegram.ui.Components.q9(context);
            ((org.telegram.ui.Components.q9[]) this.f14856n)[i7].setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            ((org.telegram.ui.Components.q9[]) this.f14856n)[i7].setVisibility(8);
            int i10 = 32 - (i7 * 4);
            ((FrameLayout) this.h).addView(((org.telegram.ui.Components.q9[]) this.f14856n)[i7], c8.ma.d(i10, i10, 19, i7 * 12, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f14857r = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        q9Var.setVisibility(8);
        ((LinearLayout) this.f14852b).addView(q9Var, c8.ma.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.f14852b).addView(frameLayout2, c8.ma.p(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29586nf, i6Var);
        frameLayout2.addView(n5Var, c8.ma.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f14854e = n5Var2;
        n5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.n6.Ol;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i11, i6Var);
        frameLayout2.addView(n5Var2, c8.ma.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.f14855f = n5Var3;
        n5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.u6.X(n5Var3, i11, i6Var);
        n5Var3.setAlpha(0.0f);
        frameLayout2.addView(n5Var3, c8.ma.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14858s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231500);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Nl, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29488i6, i6Var), 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h70(this, 13));
        ((LinearLayout) this.f14852b).addView(imageView2, c8.ma.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        switch (this.f14851a) {
            case 0:
                RectF rectF = (RectF) this.f14857r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.f14852b;
                int i7 = org.telegram.ui.ActionBar.n6.f29469h5;
                j2 j2Var = (j2) this.f14859w;
                i1 i1Var = j2Var.f14799q1;
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(i7, j2Var.J0));
                if (((Bitmap) this.f14854e) == null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.85f;
                }
                paint2.setAlpha((int) (f10 * 255.0f));
                View[] viewPages = i1Var.getViewPages();
                j2Var.f14807y1 = 0.0f;
                boolean z11 = false;
                for (View view : viewPages) {
                    if (view instanceof v1) {
                        v1 v1Var = (v1) view;
                        j2Var.f14807y1 += Utilities.i(1.0f - Math.abs(v1Var.getTranslationX() / v1Var.getMeasuredWidth()), 1.0f, 0.0f) * v1Var.b();
                        if (v1Var.getVisibility() == 0) {
                            v1Var.c();
                        }
                    }
                }
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f14856n;
                if (j2Var.f14807y1 <= 0.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e10 = c6Var.e(false, f11);
                float paddingTop = (j2Var.f14807y1 + i1Var.getPaddingTop()) - org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(8.0f), i1Var.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(j2Var.f30227u0, paddingTop, getWidth() - j2Var.f30227u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                if (((Bitmap) this.f14854e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f14855f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), (Paint) this.f14853c);
                }
                if (rectF2.top < org.telegram.messenger.g0.f24115m) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f14858s;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f14858s = Boolean.valueOf(z10);
                    Window window = j2Var.getWindow();
                    if (z10 && org.telegram.messenger.g0.B(paint2.getColor()) >= 0.721f) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.r3(window, z11);
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
        switch (this.f14851a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    j2 j2Var = (j2) this.f14859w;
                    if (y10 < j2Var.f14807y1) {
                        j2Var.dismiss();
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
        switch (this.f14851a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.f14854e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.f14853c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f14851a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                j2 j2Var = (j2) this.f14859w;
                if (((Bitmap) this.f14854e) == null) {
                    org.telegram.ui.ActionBar.i6 i6Var = j2Var.J0;
                    if (i6Var == null) {
                        if (!org.telegram.ui.ActionBar.n6.I.q()) {
                            return;
                        }
                    } else if (!i6Var.d()) {
                        return;
                    }
                    if (j2Var.f14806x1 != null && bz.o() > 0 && !pc.f()) {
                        Point point = org.telegram.messenger.g0.f24121q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        j2Var.f14806x1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.f14854e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.f14854e, tileMode, tileMode);
                        this.f14855f = bitmapShader;
                        ((Paint) this.f14853c).setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f14855f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f14851a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.g0.L(350.0f) / 0.55f) * 0.45f);
                j2 j2Var = (j2) this.f14859w;
                j2Var.f14801s1 = min;
                i1 i1Var = j2Var.f14799q1;
                i1Var.setPadding(0, org.telegram.messenger.g0.f24115m, 0, 0);
                i1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                i2 i2Var = j2Var.f14800r1;
                if (i2Var != null) {
                    i2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
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
        switch (this.f14851a) {
            case 0:
                super.setTranslationY(f10);
                invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public k1(j2 j2Var, Context context) {
        super(context);
        this.f14859w = j2Var;
        this.f14852b = new Paint(1);
        this.f14853c = new Paint(3);
        this.d = new Paint(1);
        this.f14856n = new org.telegram.ui.Components.c6(this, 0L, 250L, lr.h);
        this.f14857r = new RectF();
    }
}
