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
public final class rw9 extends rc2 {
    public boolean Ld;
    public final RectF Md;
    public final RectF Nd;
    public RadialGradient Od;
    public Paint Pd;
    public Matrix Qd;
    public final Path Rd;
    public Paint Sd;
    public final Paint Td;
    public uqb Ud;
    public final ln Vd;
    public final int Wd;
    public final int Xd;
    public final tw9 Yd;

    public rw9(tw9 tw9Var, Context context, int i, ylb ylbVar, int i2, int i3) {
        super(context, i, false, null, ylbVar);
        this.Yd = tw9Var;
        this.Wd = i2;
        this.Xd = i3;
        this.Ld = false;
        this.Md = new RectF();
        this.Nd = new RectF();
        this.Rd = new Path();
        this.Td = new Paint(1);
        this.Vd = new ln(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void A1(float f, Canvas canvas, boolean z) {
        canvas.save();
        tw9 tw9Var = this.Yd;
        if (tw9Var.T) {
            int i = this.M9;
            k47 k47Var = tw9Var.N;
            int i2 = 0;
            if (k47Var != null && k47Var.O3()) {
                k47 k47Var2 = tw9Var.N;
                if (k47Var2 != null && k47Var2.D == 19) {
                    i2 = 4;
                }
                i2 += 20;
            }
            canvas.translate(((this.Nd.right - (gm.L(8 + i2) + i)) - this.O9) * tw9Var.s, 0.0f);
        }
        super.A1(f, canvas, z);
        canvas.restore();
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.Pd;
        tw9 tw9Var = this.Yd;
        if (paint != null) {
            float f = tw9Var.s;
            RectF rectF = tw9Var.S;
            if (f > 0.0f) {
                if (tw9Var.R) {
                    if (this.Tc) {
                        Bitmap bitmap = tw9Var.Q.getBitmap();
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
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Vd.d(tw9Var.R), 1.0f - tw9Var.s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.Qd.reset();
            float width2 = (rectF.width() / 76.8f) * tw9Var.w;
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
        canvas.saveLayerAlpha(tw9Var.S, (int) (tw9Var.w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Td;
        paint3.setStyle(style);
        paint3.setStrokeWidth(gm.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = gm.P;
        rectF2.set(tw9Var.S);
        rectF2.inset(gm.L(7.0f), gm.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - tw9Var.b0) * (-360.0f), false, paint3);
        if (this.Ud == null) {
            uqb uqbVar = new uqb(120);
            this.Ud = uqbVar;
            uqbVar.b = true;
        }
        paint3.setStrokeWidth(gm.L(2.8f));
        this.Ud.a((1.0f - tw9Var.b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f = this.Yd.w;
        Typeface typeface = gm.a;
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
        tw9 tw9Var = this.Yd;
        boolean z = tw9Var.T;
        RectF rectF = tw9Var.S;
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
            gm.X1(rectF3, rectF2, tw9Var.s, rectF);
            x3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().q0((int) rectF.width());
            if (tw9Var.s > 0.0f && tw9Var.R) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.sd = 1.0f - tw9Var.s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (tw9Var.T && tw9Var.s > 0.0f && tw9Var.R) {
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
        l39 l39Var = this.O;
        tw9 tw9Var = this.Yd;
        canvas.translate(gm.U1(tw9Var.s, 0, -l39Var.b), gm.U1(tw9Var.s, tw9Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), l39Var.n));
        super.q1(canvas, (1.0f - tw9Var.s) * f, num);
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
