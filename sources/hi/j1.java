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
import org.telegram.messenger.cz;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.nr;
public final class j1 extends FrameLayout {
    public final int f14750a = 0;
    public final Object f14751b;
    public final Object f14752c;
    public final Object d;
    public Object f14753e;
    public Object f14754f;
    public Object h;
    public final Object f14755n;
    public final Object f14756r;
    public Object f14757s;
    public final Object f14758w;

    public j1(ep0 ep0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f14758w = ep0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14751b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.m6.c0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var), 20, 20, 6, 6));
        c8.sa.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, c8.na.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f14752c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29502lf, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.na.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, c8.na.t(-2, -1, 115, 6, 0, 0, 0));
        this.f14755n = new org.telegram.ui.Components.q9[3];
        for (int i7 = 2; i7 >= 0; i7--) {
            ((org.telegram.ui.Components.q9[]) this.f14755n)[i7] = new org.telegram.ui.Components.q9(context);
            ((org.telegram.ui.Components.q9[]) this.f14755n)[i7].setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            ((org.telegram.ui.Components.q9[]) this.f14755n)[i7].setVisibility(8);
            int i10 = 32 - (i7 * 4);
            ((FrameLayout) this.h).addView(((org.telegram.ui.Components.q9[]) this.f14755n)[i7], c8.na.d(i10, i10, 19, i7 * 12, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f14756r = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        q9Var.setVisibility(8);
        ((LinearLayout) this.f14751b).addView(q9Var, c8.na.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.f14751b).addView(frameLayout2, c8.na.p(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29537nf, h6Var);
        frameLayout2.addView(m5Var, c8.na.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f14753e = m5Var2;
        m5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.m6.Ol;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i11, h6Var);
        frameLayout2.addView(m5Var2, c8.na.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.f14754f = m5Var3;
        m5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.t6.X(m5Var3, i11, h6Var);
        m5Var3.setAlpha(0.0f);
        frameLayout2.addView(m5Var3, c8.na.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14757s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231500);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.Nl, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var), 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new j70(this, 14));
        ((LinearLayout) this.f14751b).addView(imageView2, c8.na.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        switch (this.f14750a) {
            case 0:
                RectF rectF = (RectF) this.f14756r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.f14751b;
                int i7 = org.telegram.ui.ActionBar.m6.f29420h5;
                i2 i2Var = (i2) this.f14758w;
                h1 h1Var = i2Var.f14707q1;
                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, i2Var.J0));
                if (((Bitmap) this.f14753e) == null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.85f;
                }
                paint2.setAlpha((int) (f10 * 255.0f));
                View[] viewPages = h1Var.getViewPages();
                i2Var.f14715y1 = 0.0f;
                boolean z11 = false;
                for (View view : viewPages) {
                    if (view instanceof u1) {
                        u1 u1Var = (u1) view;
                        i2Var.f14715y1 += Utilities.i(1.0f - Math.abs(u1Var.getTranslationX() / u1Var.getMeasuredWidth()), 1.0f, 0.0f) * u1Var.b();
                        if (u1Var.getVisibility() == 0) {
                            u1Var.c();
                        }
                    }
                }
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f14755n;
                if (i2Var.f14715y1 <= 0.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e10 = d6Var.e(false, f11);
                float paddingTop = (i2Var.f14715y1 + h1Var.getPaddingTop()) - org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(8.0f), h1Var.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(i2Var.f30177u0, paddingTop, getWidth() - i2Var.f30177u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                if (((Bitmap) this.f14753e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f14754f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), (Paint) this.f14752c);
                }
                if (rectF2.top < org.telegram.messenger.g0.f24004m) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f14757s;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f14757s = Boolean.valueOf(z10);
                    Window window = i2Var.getWindow();
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
        switch (this.f14750a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    i2 i2Var = (i2) this.f14758w;
                    if (y10 < i2Var.f14715y1) {
                        i2Var.dismiss();
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
        switch (this.f14750a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.f14753e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.f14752c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f14750a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                i2 i2Var = (i2) this.f14758w;
                if (((Bitmap) this.f14753e) == null) {
                    org.telegram.ui.ActionBar.h6 h6Var = i2Var.J0;
                    if (h6Var == null) {
                        if (!org.telegram.ui.ActionBar.m6.I.q()) {
                            return;
                        }
                    } else if (!h6Var.d()) {
                        return;
                    }
                    if (i2Var.f14714x1 != null && cz.o() > 0 && !qc.f()) {
                        Point point = org.telegram.messenger.g0.f24010q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        i2Var.f14714x1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.f14753e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.f14753e, tileMode, tileMode);
                        this.f14754f = bitmapShader;
                        ((Paint) this.f14752c).setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f14754f).setLocalMatrix((Matrix) this.h);
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
        switch (this.f14750a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.g0.L(350.0f) / 0.55f) * 0.45f);
                i2 i2Var = (i2) this.f14758w;
                i2Var.f14709s1 = min;
                h1 h1Var = i2Var.f14707q1;
                h1Var.setPadding(0, org.telegram.messenger.g0.f24004m, 0, 0);
                h1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                h2 h2Var = i2Var.f14708r1;
                if (h2Var != null) {
                    h2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
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
        switch (this.f14750a) {
            case 0:
                super.setTranslationY(f10);
                invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public j1(i2 i2Var, Context context) {
        super(context);
        this.f14758w = i2Var;
        this.f14751b = new Paint(1);
        this.f14752c = new Paint(3);
        this.d = new Paint(1);
        this.f14755n = new org.telegram.ui.Components.d6(this, 0L, 250L, nr.h);
        this.f14756r = new RectF();
    }
}
