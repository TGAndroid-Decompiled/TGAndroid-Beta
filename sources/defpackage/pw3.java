package defpackage;

import android.app.Activity;
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
public final class pw3 extends FrameLayout {
    public final byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;
    public final Object n;
    public final Object r;
    public Object s;
    public final Object w;

    public pw3(bda bdaVar, Activity activity, ylb ylbVar) {
        super(activity);
        this.w = bdaVar;
        LinearLayout linearLayout = new LinearLayout(activity);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(cmb.a0(cmb.v0(cmb.h6, ylbVar), 20, 20, 6, 6));
        rve.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, qoe.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.kf, ylbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, qoe.r(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, qoe.t(-2, -1, 115, 6, 0, 0, 0));
        this.n = new bf0[3];
        for (int i = 2; i >= 0; i--) {
            ((bf0[]) this.n)[i] = new bf0(activity);
            ((bf0[]) this.n)[i].setRoundRadius(gm.L(6.0f));
            ((bf0[]) this.n)[i].setVisibility(8);
            int i2 = 32 - (i << 2);
            ((FrameLayout) this.h).addView(((bf0[]) this.n)[i], qoe.d(i2, i2, 19, i * 12, 0.0f, 0.0f, 0.0f));
        }
        bf0 bf0Var = new bf0(activity);
        this.r = bf0Var;
        bf0Var.setRoundRadius(gm.L(4.0f));
        bf0Var.setVisibility(8);
        ((LinearLayout) this.b).addView(bf0Var, qoe.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        ((LinearLayout) this.b).addView(frameLayout2, qoe.p(0, -1, 1.0f, 119));
        lka lkaVar = new lka(activity);
        this.d = lkaVar;
        lkaVar.setTextSize(14);
        lkaVar.setTypeface(gm.o());
        anb.W(lkaVar, cmb.mf, ylbVar);
        frameLayout2.addView(lkaVar, qoe.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        lka lkaVar2 = new lka(activity);
        this.e = lkaVar2;
        lkaVar2.setTextSize(14);
        int i3 = cmb.Nl;
        anb.W(lkaVar2, i3, ylbVar);
        frameLayout2.addView(lkaVar2, qoe.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        lka lkaVar3 = new lka(activity);
        this.f = lkaVar3;
        lkaVar3.setTextSize(14);
        anb.W(lkaVar3, i3, ylbVar);
        lkaVar3.setAlpha(0.0f);
        frameLayout2.addView(lkaVar3, qoe.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(activity);
        this.s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231504);
        anb.s(imageView2, cmb.Ml, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 1, gm.L(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new wk8(this, (byte) 27));
        ((LinearLayout) this.b).addView(imageView2, qoe.t(36, 36, 21, 0, 0, 4, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.r;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.b;
                int i = cmb.g5;
                px3 px3Var = (px3) this.w;
                hs1 hs1Var = px3Var.p1;
                paint2.setColor(cmb.v0(i, px3Var.J0));
                if (((Bitmap) this.e) == null) {
                    f = 1.0f;
                } else {
                    f = 0.85f;
                }
                paint2.setAlpha((int) (f * 255.0f));
                View[] viewPages = hs1Var.getViewPages();
                px3Var.x1 = 0.0f;
                boolean z2 = false;
                for (View view : viewPages) {
                    if (view instanceof zw3) {
                        zw3 zw3Var = (zw3) view;
                        px3Var.x1 += Utilities.i(1.0f - Math.abs(zw3Var.getTranslationX() / zw3Var.getMeasuredWidth()), 1.0f, 0.0f) * zw3Var.b();
                        if (zw3Var.getVisibility() == 0) {
                            zw3Var.c();
                        }
                    }
                }
                ln lnVar = (ln) this.n;
                if (px3Var.x1 <= 0.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                float e = lnVar.e(false, f2);
                float paddingTop = (px3Var.x1 + hs1Var.getPaddingTop()) - gm.U1(e, gm.L(8.0f), hs1Var.getPaddingTop());
                RectF rectF2 = gm.P;
                rectF2.set(px3Var.u0, paddingTop, getWidth() - px3Var.u0, gm.L(8.0f) + getHeight());
                if (((Bitmap) this.e) != null) {
                    ((Matrix) this.h).reset();
                    ((Matrix) this.h).postScale(16.0f, 16.0f);
                    ((Matrix) this.h).postTranslate(0.0f, -getY());
                    ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                    canvas.drawRoundRect(rectF2, gm.L(14.0f), gm.L(14.0f), (Paint) this.c);
                }
                if (rectF2.top < gm.m) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean bool = (Boolean) this.s;
                if (bool == null || bool.booleanValue() != z) {
                    this.s = Boolean.valueOf(z);
                    Window window = px3Var.getWindow();
                    if (z && gm.B(paint2.getColor()) >= 0.721f) {
                        z2 = true;
                    }
                    gm.n3(window, z2);
                }
                float f3 = 1.0f - e;
                canvas.drawRoundRect(rectF2, gm.L(14.0f) * f3, gm.L(14.0f) * f3, paint2);
                rectF.set((getWidth() - gm.L(36.0f)) / 2.0f, gm.L(9.66f) + paddingTop, (gm.L(36.0f) + getWidth()) / 2.0f, paddingTop + gm.L(13.66f));
                paint.setColor(1367573379);
                paint.setAlpha((int) (f3 * 81.0f));
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    px3 px3Var = (px3) this.w;
                    if (y < px3Var.x1) {
                        px3Var.dismiss();
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                Bitmap bitmap = (Bitmap) this.e;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((Paint) this.c).setShader(null);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                px3 px3Var = (px3) this.w;
                if (((Bitmap) this.e) == null) {
                    ylb ylbVar = px3Var.J0;
                    if (ylbVar == null) {
                        if (!cmb.I.o()) {
                            return;
                        }
                    } else if (!ylbVar.a()) {
                        return;
                    }
                    if (px3Var.w1 != null && gda.o() > 0 && !e86.f()) {
                        Point point = gm.q;
                        Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                        ((u9b) px3Var.w1.b).X(16.0f, createBitmap);
                        Utilities.stackBlurBitmap(createBitmap, 8);
                        this.e = createBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader((Bitmap) this.e, tileMode, tileMode);
                        this.f = bitmapShader;
                        ((Paint) this.c).setShader(bitmapShader);
                        Matrix matrix = (Matrix) this.h;
                        if (matrix == null) {
                            matrix = new Matrix();
                            this.h = matrix;
                        }
                        matrix.postScale(16.0f, 16.0f);
                        ((BitmapShader) this.f).setLocalMatrix((Matrix) this.h);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float min = Math.min(size2 * 0.45f, (gm.L(350.0f) / 0.55f) * 0.45f);
                px3 px3Var = (px3) this.w;
                px3Var.r1 = min;
                hs1 hs1Var = px3Var.p1;
                hs1Var.setPadding(0, gm.m, 0, 0);
                hs1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                ox3 ox3Var = px3Var.q1;
                if (ox3Var != null) {
                    ox3Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f);
                invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public pw3(px3 px3Var, Context context) {
        super(context);
        this.w = px3Var;
        this.b = new Paint(1);
        this.c = new Paint(3);
        this.d = new Paint(1);
        this.n = new ln(this, 0L, 250L, d53.h);
        this.r = new RectF();
    }
}
