package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
public final class jy9 extends wb2 {
    public boolean Ld;
    public final RectF Md;
    public final RectF Nd;
    public RadialGradient Od;
    public Paint Pd;
    public Matrix Qd;
    public final Path Rd;
    public Paint Sd;
    public final Paint Td;
    public tsb Ud;
    public final mm Vd;
    public final int Wd;
    public final int Xd;
    public final ky9 Yd;

    public jy9(ky9 ky9Var, Context context, int i, vnb vnbVar, int i2, int i3) {
        super(context, i, false, null, vnbVar);
        this.Yd = ky9Var;
        this.Wd = i2;
        this.Xd = i3;
        this.Ld = false;
        this.Md = new RectF();
        this.Nd = new RectF();
        this.Rd = new Path();
        this.Td = new Paint(1);
        this.Vd = new mm(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void A1(float f, Canvas canvas, boolean z) {
        canvas.save();
        ky9 ky9Var = this.Yd;
        if (ky9Var.T) {
            int i = this.M9;
            r47 r47Var = ky9Var.N;
            int i2 = 0;
            if (r47Var != null && r47Var.O3()) {
                r47 r47Var2 = ky9Var.N;
                if (r47Var2 != null && r47Var2.D == 19) {
                    i2 = 4;
                }
                i2 += 20;
            }
            canvas.translate(((this.Nd.right - (hl.L(8 + i2) + i)) - this.O9) * ky9Var.s, 0.0f);
        }
        super.A1(f, canvas, z);
        canvas.restore();
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.Pd;
        ky9 ky9Var = this.Yd;
        if (paint != null) {
            float f = ky9Var.s;
            RectF rectF = ky9Var.S;
            if (f > 0.0f) {
                if (ky9Var.R) {
                    if (this.Tc) {
                        Bitmap bitmap = ky9Var.Q.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Rd;
                            path.rewind();
                            path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.scale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                            canvas.translate(rectF.left, rectF.top);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            bitmap.recycle();
                        }
                    } else {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        if (this.Sd == null) {
                            Paint paint2 = new Paint(1);
                            this.Sd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Sd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Vd.d(ky9Var.R), 1.0f - ky9Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.Qd.reset();
            float width2 = (rectF.width() / 76.8f) * ky9Var.w;
            this.Qd.postScale(width2, width2);
            this.Qd.postTranslate(rectF.centerX(), rectF.centerY());
            this.Od.setLocalMatrix(this.Qd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Pd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(ky9Var.S, (int) (ky9Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Td;
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = hl.P;
        rectF2.set(ky9Var.S);
        rectF2.inset(hl.L(7.0f), hl.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - ky9Var.b0) * (-360.0f), false, paint3);
        if (this.Ud == null) {
            tsb tsbVar = new tsb(120);
            this.Ud = tsbVar;
            tsbVar.b = true;
        }
        paint3.setStrokeWidth(hl.L(2.8f));
        this.Ud.a((1.0f - ky9Var.b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f = this.Yd.w;
        Typeface typeface = hl.a;
        super.O0(canvas);
    }

    @Override
    public final int getBoundsLeft() {
        return 0;
    }

    @Override
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ky9 ky9Var = this.Yd;
        boolean z = ky9Var.T;
        RectF rectF = ky9Var.S;
        if (z) {
            boolean z2 = this.Ld;
            RectF rectF2 = this.Nd;
            RectF rectF3 = this.Md;
            if (!z2) {
                rectF3.set(getPhotoImage().L0, getPhotoImage().M0, getPhotoImage().w(), getPhotoImage().x());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Ld = true;
                this.Od = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Pd = paint;
                paint.setShader(this.Od);
                this.Pd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Qd = new Matrix();
            }
            hl.X1(rectF3, rectF2, ky9Var.s, rectF);
            x3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().q0((int) rectF.width());
            if (ky9Var.s > 0.0f && ky9Var.R) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.sd = 1.0f - ky9Var.s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (ky9Var.T && ky9Var.s > 0.0f && ky9Var.R) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.Wd, this.Xd);
    }

    @Override
    public final void q1(Canvas canvas, float f, Integer num) {
        canvas.save();
        x49 x49Var = this.O;
        ky9 ky9Var = this.Yd;
        canvas.translate(hl.U1(ky9Var.s, 0, -x49Var.b), hl.U1(ky9Var.s, ky9Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), x49Var.n));
        super.q1(canvas, (1.0f - ky9Var.s) * f, num);
        canvas.restore();
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        TextureView textureView = this.Yd.Q;
        if (textureView != null && i == 8) {
            textureView.setVisibility(i);
        }
    }

    @Override
    public final void setPressed(boolean z) {
    }
}
