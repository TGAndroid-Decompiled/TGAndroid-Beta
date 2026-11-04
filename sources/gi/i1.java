package gi;

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
import b8.mf;
import b8.pf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.xq;
public final class i1 extends FrameLayout {
    public final int f12941a = 0;
    public final Object f12942b;
    public final Object f12943c;
    public final Object d;
    public Object f12944e;
    public Object f12945f;
    public Object h;
    public final Object f12946n;
    public final Object f12947r;
    public Object f12948s;
    public final Object f12949w;

    public i1(ro0 ro0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12949w = ro0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12942b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var), 20, 20, 6, 6));
        pf.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, mf.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f12943c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f27962hf, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, mf.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, mf.t(-2, -1, 115, 6, 0, 0, 0));
        this.f12946n = new org.telegram.ui.Components.k9[3];
        for (int i3 = 2; i3 >= 0; i3--) {
            ((org.telegram.ui.Components.k9[]) this.f12946n)[i3] = new org.telegram.ui.Components.k9(context);
            ((org.telegram.ui.Components.k9[]) this.f12946n)[i3].setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            ((org.telegram.ui.Components.k9[]) this.f12946n)[i3].setVisibility(8);
            int i10 = 32 - (i3 * 4);
            ((FrameLayout) this.h).addView(((org.telegram.ui.Components.k9[]) this.f12946n)[i3], mf.d(i10, i10, 19, i3 * 12, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f12947r = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        k9Var.setVisibility(8);
        ((LinearLayout) this.f12942b).addView(k9Var, mf.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ((LinearLayout) this.f12942b).addView(frameLayout2, mf.p(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f28015kf, e6Var);
        frameLayout2.addView(k5Var, mf.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f12944e = k5Var2;
        k5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.k6.Ll;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i11, e6Var);
        frameLayout2.addView(k5Var2, mf.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.f12945f = k5Var3;
        k5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Y(k5Var3, i11, e6Var);
        k5Var3.setAlpha(0.0f);
        frameLayout2.addView(k5Var3, mf.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12948s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231500);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Kl, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var), 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new ga0(this, 12));
        ((LinearLayout) this.f12942b).addView(imageView2, mf.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        switch (this.f12941a) {
            case 0:
                RectF rectF = (RectF) this.f12947r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.f12942b;
                int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
                i2 i2Var = (i2) this.f12949w;
                g1 g1Var = i2Var.f12953n1;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i3, i2Var.J0));
                if (((Bitmap) this.f12944e) == null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.85f;
                }
                paint2.setAlpha((int) (f10 * 255.0f));
                View[] viewPages = g1Var.getViewPages();
                i2Var.f12961v1 = 0.0f;
                boolean z11 = false;
                for (View view : viewPages) {
                    if (view instanceof u1) {
                        u1 u1Var = (u1) view;
                        i2Var.f12961v1 += Utilities.i(1.0f - Math.abs(u1Var.getTranslationX() / u1Var.getMeasuredWidth()), 1.0f, 0.0f) * u1Var.b();
                        if (u1Var.getVisibility() == 0) {
                            u1Var.c();
                        }
                    }
                }
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.f12946n;
                if (i2Var.f12961v1 <= 0.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e10 = u5Var.e(false, f11);
                float paddingTop = (i2Var.f12961v1 + g1Var.getPaddingTop()) - org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(8.0f), g1Var.getPaddingTop());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(i2Var.f28618u0, paddingTop, getWidth() - i2Var.f28618u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                if (((Bitmap) this.f12944e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f12945f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), (Paint) this.f12943c);
                }
                if (rectF2.top < org.telegram.messenger.g0.f22602m) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f12948s;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f12948s = Boolean.valueOf(z10);
                    Window window = i2Var.getWindow();
                    if (z10 && org.telegram.messenger.g0.B(paint2.getColor()) >= 0.721f) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.s3(window, z11);
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
        switch (this.f12941a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y9 = motionEvent.getY();
                    i2 i2Var = (i2) this.f12949w;
                    if (y9 < i2Var.f12961v1) {
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
        switch (this.f12941a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.f12944e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.f12943c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f12941a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                i2 i2Var = (i2) this.f12949w;
                if (((Bitmap) this.f12944e) == null) {
                    org.telegram.ui.ActionBar.e6 e6Var = i2Var.J0;
                    if (e6Var == null) {
                        if (!org.telegram.ui.ActionBar.k6.I.q()) {
                            return;
                        }
                    } else if (!e6Var.a()) {
                        return;
                    }
                    if (i2Var.f12960u1 != null && az.o() > 0 && !lc.f()) {
                        Point point = org.telegram.messenger.g0.f22608q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        i2Var.f12960u1.a(createBitmap, Float.valueOf(16.0f));
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.f12944e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.f12944e, tileMode, tileMode);
                        this.f12945f = bitmapShader;
                        ((Paint) this.f12943c).setShader(bitmapShader);
                        if (((Matrix) this.h) == null) {
                            this.h = new Matrix();
                        }
                        ((Matrix) this.h).postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f12945f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f12941a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                float min = Math.min(size2 * 0.45f, (org.telegram.messenger.g0.L(350.0f) / 0.55f) * 0.45f);
                i2 i2Var = (i2) this.f12949w;
                i2Var.f12955p1 = min;
                g1 g1Var = i2Var.f12953n1;
                g1Var.setPadding(0, org.telegram.messenger.g0.f22602m, 0, 0);
                g1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                h2 h2Var = i2Var.f12954o1;
                if (h2Var != null) {
                    h2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f12941a) {
            case 0:
                super.setTranslationY(f10);
                invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public i1(i2 i2Var, Context context) {
        super(context);
        this.f12949w = i2Var;
        this.f12942b = new Paint(1);
        this.f12943c = new Paint(3);
        this.d = new Paint(1);
        this.f12946n = new org.telegram.ui.Components.u5(this, 0L, 250L, xq.h);
        this.f12947r = new RectF();
    }
}
