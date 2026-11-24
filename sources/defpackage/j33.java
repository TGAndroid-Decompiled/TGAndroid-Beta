package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
public class j33 extends FrameLayout implements o23 {
    public float E;
    public float F;
    public boolean G;
    public final v23 H;
    public final float[] I;
    public boolean J;
    public boolean K;
    public int L;
    public h33 M;
    public i33 N;
    public final RectF O;
    public final RectF P;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public kac d;
    public c33 e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final lj9 s;
    public final Matrix w;
    public Bitmap x;
    public boolean y;

    public j33(Context context) {
        super(context);
        this.I = new float[9];
        this.O = new RectF();
        this.P = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z = context instanceof BubbleActivity;
        this.r = z;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        lj9 lj9Var = new lj9((byte) 24, false);
        lj9Var.b = new float[8];
        this.s = lj9Var;
        this.w = new Matrix();
        this.G = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        v23 v23Var = new v23(context);
        this.H = v23Var;
        v23Var.b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.e = new RectF();
        viewGroup.f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.n = new RectF();
        viewGroup.r = new RectF();
        viewGroup.s = new RectF();
        viewGroup.w = new RectF();
        viewGroup.y = new RectF();
        viewGroup.E = new RectF();
        viewGroup.L = -1.0f;
        viewGroup.M = 1.0f;
        viewGroup.N = -1.0f;
        viewGroup.V = new AccelerateDecelerateInterpolator();
        viewGroup.g0 = true;
        viewGroup.m0 = new RectF();
        viewGroup.o0 = 0.0f;
        viewGroup.p0 = 1.0f;
        viewGroup.q0 = 0.0f;
        viewGroup.r0 = 0.0f;
        viewGroup.b0 = z;
        viewGroup.K = true;
        viewGroup.J = true;
        viewGroup.W = gl.L(16.0f);
        viewGroup.a0 = gl.L(32.0f);
        viewGroup.u0 = 1;
        Paint paint = new Paint();
        viewGroup.P = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.Q = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(gl.L(2.0f));
        Paint paint3 = new Paint();
        viewGroup.R = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gl.L(1.0f));
        Paint paint4 = new Paint();
        viewGroup.S = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.T = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.i0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.U = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void b(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i, int i2, float f, float f2, float f3, float f4, ArrayList arrayList) {
        int i3 = i;
        int i4 = i2;
        float f5 = f3;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i, i2));
            matrix2.postScale(max, max);
            matrix2.postRotate(f5);
            matrix2.postConcat(matrix);
            matrix2.postScale(f4, f4);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    mac macVar = (mac) arrayList.get(i5);
                    float width = ((macVar.f / 2.0f) + macVar.c) * decodeFile.getWidth();
                    float height = ((macVar.g / 2.0f) + macVar.d) * decodeFile.getHeight();
                    char c2 = c;
                    float width2 = macVar.y * decodeFile.getWidth();
                    float height2 = macVar.z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c2] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f5 == 90.0f || f5 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    byte b = macVar.a;
                    if (b != 1 && b != 11) {
                        float f6 = i3;
                        float f7 = width3;
                        macVar.q = (int) ((macVar.q / f6) * f7);
                        float f8 = i4;
                        float f9 = height3;
                        macVar.r = (int) ((macVar.r / f8) * f9);
                        macVar.f = ((macVar.f * f6) / f7) * f4 * f;
                        macVar.g = ((macVar.g * f8) / f9) * f4 * f;
                    } else {
                        macVar.f = ((macVar.f * i3) / bitmap.getWidth()) * f4 * f;
                        macVar.g = ((macVar.g * i4) / bitmap.getHeight()) * f4 * f;
                    }
                    macVar.c = (fArr[0] / bitmap.getWidth()) - (macVar.f / 2.0f);
                    macVar.d = (fArr[1] / bitmap.getHeight()) - (macVar.g / 2.0f);
                    macVar.y = fArr[c2] / bitmap.getWidth();
                    macVar.z = fArr[3] / bitmap.getHeight();
                    macVar.e = (float) (macVar.e - ((f2 + f3) * 0.017453292519943295d));
                    i5++;
                    i3 = i;
                    i4 = i2;
                    f5 = f3;
                    c = c2;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public static float e(float f, float f2, RectF rectF) {
        float width = rectF.width() * f2;
        float height = rectF.height() * f2;
        float width2 = rectF.left + ((rectF.width() - width) / 2.0f);
        float height2 = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF.set(width2, height2, width + width2, height + height2);
        return f * f2;
    }

    public static void f(RectF rectF, RectF rectF2, PointF pointF, float f) {
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        float f6 = rectF.left;
        if (f6 > f2) {
            f4 += f6 - f2;
            f2 = f6;
        }
        float f7 = rectF.top;
        if (f7 > f3) {
            f5 += f7 - f3;
            f3 = f7;
        }
        float f8 = rectF.right;
        if (f8 < f4) {
            f2 += f8 - f4;
        }
        float f9 = rectF.bottom;
        if (f9 < f5) {
            f3 += f9 - f5;
        }
        double d = f;
        double d2 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f2);
        float cos = (float) (Math.cos(d2) * centerX);
        double d3 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f3);
        pointF.set(pointF.x + ((float) (Math.sin(d2) * centerX)) + ((float) (Math.cos(d3) * centerY)), pointF.y + cos + ((float) (Math.sin(d3) * centerY)));
    }

    public static String g(String str) {
        File z = ba4.z(4);
        File file = new File(z, gba.p() + "_temp.jpg");
        try {
            gl.E(new File(str), file);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        return file.getAbsolutePath();
    }

    public static float n(RectF rectF, RectF rectF2) {
        float width = rectF2.width();
        if (((float) Math.floor((rectF.height() * width) / rectF.width())) > rectF2.height()) {
            return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
        }
        return width;
    }

    private void setLockedAspectRatio(float f) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f);
        c(rectF);
        i33 i33Var = this.N;
        if (i33Var != null) {
            i33Var.h2(false);
            this.N.o1(true);
        }
    }

    public final void a(zl6 zl6Var) {
        RectF rectF;
        float f;
        int i;
        int i2;
        float f2;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(rectF, this.P));
        int ceil2 = (int) Math.ceil(f / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        h33 h33Var = this.M;
        float f3 = h33Var.f * cropWidth;
        zl6Var.k = (int) h33Var.h;
        if (w01.a) {
            b00.p(zl6Var.k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i = zl6Var.k;
            if (i >= 0) {
                break;
            }
            zl6Var.k = i + 360;
        }
        if (i != 90 && i != 270) {
            h33 h33Var2 = this.M;
            i2 = (int) h33Var2.a;
            f2 = h33Var2.b;
        } else {
            h33 h33Var3 = this.M;
            i2 = (int) h33Var3.b;
            f2 = h33Var3.a;
        }
        int i3 = (int) f2;
        float f4 = i2;
        zl6Var.e = (float) (ceil / Math.ceil(f4 * f3));
        float f5 = i3;
        float ceil3 = (float) (ceil2 / Math.ceil(f3 * f5));
        zl6Var.f = ceil3;
        float f6 = zl6Var.e;
        if (f6 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f6, ceil3);
            zl6Var.e /= max;
            zl6Var.f /= max;
        }
        zl6Var.c = Math.min(f4 / cropAreaView.getCropWidth(), f5 / cropAreaView.getCropHeight()) * this.M.e;
        float f7 = fArr[2] / f4;
        h33 h33Var4 = this.M;
        float f8 = h33Var4.e;
        zl6Var.a = f7 / f8;
        zl6Var.b = (fArr[5] / f5) / f8;
        zl6Var.d = h33Var4.i;
        zl6Var.m = f8;
        zl6Var.l = h33Var4.j;
        zl6Var.o = cropWidth;
        zl6Var.r = h33Var4.k;
        zl6Var.s = ceil;
        zl6Var.t = ceil2;
        zl6Var.u = this.y;
        zl6Var.v = cropAreaView.getLockAspectRatio();
        zl6Var.C = true;
    }

    public final void c(RectF rectF) {
        boolean z;
        int i;
        if (this.M == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f = this.M.e;
        if (f * max > 30.0f) {
            max = 30.0f / f;
            z = true;
        } else {
            z = false;
        }
        float f2 = max;
        if (!this.r) {
            i = gl.m;
        } else {
            i = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float b = this.M.b() * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float a = this.M.a() * ((rectF.centerY() - ((((imageView.getHeight() - this.E) + i) + this.F) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d33(this, f2, fArr, b, a, (byte) 0));
        ofFloat.addListener(new y7((byte) 26, this, z));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.V;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.l0 = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        ofFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        ofFloat4.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        ofFloat5.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat);
        animatorSet2.addListener(new u5(cropAreaView, rectF, (byte) 16));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void d(boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        long j;
        if (this.M != null) {
            CropAreaView cropAreaView = this.a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float b = this.M.b();
            float a = this.M.a();
            float f2 = this.M.i;
            float radians = (float) Math.toRadians(f2);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f2, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, b, a);
            float f3 = (cropWidth - b) / 2.0f;
            h33 h33Var = this.M;
            float f4 = h33Var.e;
            lj9 lj9Var = this.s;
            float[] fArr = (float[]) lj9Var.b;
            float[] fArr2 = (float[]) lj9Var.b;
            float f5 = rectF2.left;
            fArr[0] = f5;
            float f6 = rectF2.top;
            fArr[1] = f6;
            float f7 = rectF2.right;
            fArr[2] = f7;
            fArr[3] = f6;
            fArr[4] = f7;
            float f8 = rectF2.bottom;
            fArr[5] = f8;
            fArr[6] = f5;
            fArr[7] = f8;
            Matrix matrix2 = new Matrix();
            matrix2.set(h33Var.k);
            matrix2.preTranslate(f3 / f4, ((cropHeight - a) / 2.0f) / f4);
            Matrix matrix3 = this.w;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f2, b / 2.0f, a / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            h33 h33Var2 = this.M;
            PointF pointF = new PointF(h33Var2.c, h33Var2.d);
            if (!rectF2.contains(rectF)) {
                if (z && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f = e(f4, rectF.width() / n(rectF, rectF2), rectF2);
                } else {
                    f = f4;
                }
                f(rectF2, rectF, pointF, radians);
            } else if (z2 && this.n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.M.e * width < this.n) {
                    width = 1.0f;
                }
                f = e(f4, width, rectF2);
                f(rectF2, rectF, pointF, radians);
            } else {
                f = f4;
            }
            float f9 = pointF.x;
            h33 h33Var3 = this.M;
            float f10 = f9 - h33Var3.c;
            float f11 = pointF.y - h33Var3.d;
            if (z3) {
                float f12 = f / f4;
                if (Math.abs(f12 - 1.0f) < 1.0E-5f && Math.abs(f10) < 1.0E-5f && Math.abs(f11) < 1.0E-5f) {
                    return;
                }
                this.G = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d33(this, f10, new float[]{1.0f, 0.0f, 0.0f}, f11, f12, (byte) 1));
                ofFloat.addListener(new g33(this, z4, z, z2, z3));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                if (z4) {
                    j = 100;
                } else {
                    j = 200;
                }
                ofFloat.setDuration(j);
                ofFloat.start();
                return;
            }
            h33Var3.g(f10, f11);
            this.M.f(f / f4, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.a;
        RectF rectF = this.O;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.a.getCropHeight();
    }

    public float getCropLeft() {
        return this.a.getCropLeft();
    }

    public float getCropTop() {
        return this.a.getCropTop();
    }

    public float getCropWidth() {
        return this.a.getCropWidth();
    }

    public int getCurrentHeight() {
        kac kacVar = this.d;
        if (kacVar != null) {
            return kacVar.getVideoHeight();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i = this.L;
        if (i != 90 && i != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        kac kacVar = this.d;
        if (kacVar != null) {
            return kacVar.getVideoWidth();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i = this.L;
        if (i != 90 && i != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        h33 h33Var = this.M;
        if (h33Var == null) {
            return 0.0f;
        }
        return h33Var.g + h33Var.h;
    }

    public boolean getStateMirror() {
        h33 h33Var = this.M;
        if (h33Var != null && h33Var.j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        h33 h33Var = this.M;
        if (h33Var == null) {
            return 0.0f;
        }
        return h33Var.h;
    }

    public final void h(Integer[][] numArr, int i) {
        float f;
        float f2;
        this.J = false;
        if (i != 0) {
            if (i != 1) {
                Integer[] numArr2 = numArr[i - 2];
                if (this.a.getAspectRatio() > 1.0f) {
                    setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            setLockedAspectRatio(1.0f);
            return;
        }
        h33 h33Var = this.M;
        if (h33Var.g % 180.0f != 0.0f) {
            f = h33Var.b;
            f2 = h33Var.a;
        } else {
            f = h33Var.a;
            f2 = h33Var.b;
        }
        setLockedAspectRatio(f / f2);
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        h33 h33Var = this.M;
        if (h33Var == null) {
            return;
        }
        final float f = h33Var.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        h33 h33Var2 = this.M;
        if ((h33Var2.h + h33Var2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f2 = currentWidth / currentHeight;
        float f3 = 1.0f;
        if (!this.y) {
            f2 = 1.0f;
        }
        cropAreaView.a(this.h, f2);
        if (this.y) {
            f3 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f3);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.y);
        h33 h33Var3 = this.M;
        final float f4 = h33Var3.c;
        final float f5 = h33Var3.d;
        final float f6 = h33Var3.e;
        final float f7 = h33Var3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j33 j33Var = j33.this;
                if (j33Var.M == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = j33Var.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                gl.X1(rectF4, rectF3, floatValue, rectF5);
                j33Var.a.setActualRect(rectF5);
                h33 h33Var4 = j33Var.M;
                float f8 = 1.0f - floatValue;
                float f9 = h33Var4.c - (f4 * f8);
                float f10 = h33Var4.d - (f5 * f8);
                float R1 = gl.R1(f6, f, floatValue);
                h33 h33Var5 = j33Var.M;
                float f11 = R1 / h33Var5.e;
                h33Var5.g(-f9, -f10);
                j33Var.M.f(f11, 0.0f, 0.0f);
                j33Var.M.e(-(h33Var4.i - (f7 * f8)));
                j33Var.d(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        h33 h33Var = this.M;
        boolean z = false;
        if (h33Var == null) {
            return false;
        }
        h33Var.j = !h33Var.j;
        r(false);
        i33 i33Var = this.N;
        if (i33Var != null) {
            h33 h33Var2 = this.M;
            float f = h33Var2.h;
            float f2 = h33Var2.g;
            float f3 = ((f + f2) - f2) % 360.0f;
            if (!h33Var2.c() && f3 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.M.j) {
                z = true;
            }
            i33Var.h2(z);
        }
        return this.M.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.M.e;
        }
    }

    public final void l(boolean z) {
        boolean z2;
        float f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        h33 h33Var = this.M;
        if (h33Var != null && h33Var.g % 180.0f != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z2, this.y);
        if (this.y) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f);
        h33 h33Var2 = this.M;
        if (h33Var2 != null) {
            h33Var2.d(0.0f);
            this.M.j = false;
        }
        cropAreaView.d(this.h);
        r(z);
        this.n = 0.0f;
        i33 i33Var = this.N;
        if (i33Var != null) {
            i33Var.h2(true);
            this.N.o1(false);
        }
    }

    public final boolean m(float f) {
        boolean z;
        boolean z2;
        if (this.M != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.l0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.l0 = null;
            }
            this.n = 0.0f;
            h33 h33Var = this.M;
            float f2 = h33Var.h;
            float f3 = h33Var.g;
            float f4 = (((f2 + f3) - f3) + f) % 360.0f;
            if (this.y && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.M.g + f4) % 180.0f != 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z, this.y);
            }
            this.M.d(f4);
            r(false);
            d(true, false, false, false);
            i33 i33Var = this.N;
            if (i33Var != null) {
                if (f4 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.M.j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i33Var.h2(z2);
            }
            if (((int) this.M.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.M == null || this.J) {
            return;
        }
        this.J = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = k96.M0(2131751685, null);
        strArr[1] = k96.M0(2131751683, null);
        int i = 2;
        for (int i2 = 0; i2 < 6; i2++) {
            Integer[] numArr2 = numArr[i2];
            if (this.a.getAspectRatio() > 1.0f) {
                strArr[i] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.e(strArr, new fe(this, numArr, (byte) 4));
        hd hdVar = alertDialog$Builder.a;
        hdVar.setCanceledOnTouchOutside(true);
        hdVar.setOnCancelListener(new ur0(this, (byte) 8));
        hdVar.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            CropAreaView cropAreaView = this.a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        d(true, false, true, false);
                    }
                } else if (!this.G) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    i33 i33Var = this.N;
                    if (i33Var != null) {
                        i33Var.h2(false);
                    }
                }
                try {
                    this.H.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i, c33 c33Var, zl6 zl6Var) {
        this.y = true;
        this.d = null;
        this.e = c33Var;
        this.L = i;
        this.x = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.M = new h33(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new f33(this, zl6Var, currentHeight, currentWidth, (byte) 0));
    }

    public final void q() {
        RectF rectF;
        float f;
        int i;
        float f2;
        float max;
        boolean z;
        if (this.e != null && this.M != null) {
            CropAreaView cropAreaView = this.a;
            cropAreaView.d(this.O);
            int ceil = (int) Math.ceil(n(rectF, this.P));
            int ceil2 = (int) Math.ceil(f / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.M.k;
            float[] fArr = this.I;
            matrix.getValues(fArr);
            h33 h33Var = this.M;
            float f3 = h33Var.f * cropWidth;
            int i2 = (int) h33Var.h;
            while (i2 < 0) {
                i2 += 360;
            }
            if (i2 != 90 && i2 != 270) {
                h33 h33Var2 = this.M;
                i = (int) h33Var2.a;
                f2 = h33Var2.b;
            } else {
                h33 h33Var3 = this.M;
                i = (int) h33Var3.b;
                f2 = h33Var3.a;
            }
            int i3 = (int) f2;
            double d = ceil;
            float f4 = i;
            float ceil3 = (float) (d / Math.ceil(f4 * f3));
            float f5 = i3;
            float ceil4 = (float) (ceil2 / Math.ceil(f3 * f5));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f6 = ceil4;
            float f7 = ceil3;
            RectF rectF2 = cropAreaView.m0;
            cropAreaView.a(rectF2, f4 / f5);
            if (this.y) {
                max = rectF2.width() / f4;
            } else {
                max = Math.max(rectF2.width() / f4, rectF2.height() / f5);
            }
            h33 h33Var4 = this.M;
            float f8 = h33Var4.e;
            float f9 = f8 / max;
            float f10 = f8 / h33Var4.f;
            float f11 = (fArr[2] / f4) / f8;
            float f12 = (fArr[5] / f5) / f8;
            float f13 = h33Var4.i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            c33 c33Var = this.e;
            h33 h33Var5 = this.M;
            if (!h33Var5.j && !h33Var5.c() && this.M.g < 1.0E-5f) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = z;
            h33 h33Var6 = this.M;
            c33Var.b(z2, f11, f12, f13, (int) h33Var6.h, f9, f10, h33Var6.f / max, f7, f6, cropCenterX, cropCenterY, h33Var6.j);
        }
    }

    public final void r(boolean z) {
        if (this.M == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        h33 h33Var = this.M;
        float f = h33Var.g;
        if (f != 90.0f && f != 270.0f) {
            matrix.postTranslate((-h33Var.a) / 2.0f, (-h33Var.b) / 2.0f);
        } else {
            matrix.postTranslate((-h33Var.b) / 2.0f, (-h33Var.a) / 2.0f);
        }
        matrix.postRotate((int) this.M.h);
        matrix.postConcat(this.M.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.y || this.K || z) {
            q();
            this.N.K0();
        }
        invalidate();
    }

    public void setAspectRatio(float f) {
        this.a.setActualRect(f);
    }

    public void setBottomPadding(float f) {
        this.E = f;
        this.a.setBottomPadding(f);
    }

    public void setFreeform(boolean z) {
        this.a.setFreeform(z);
        this.y = z;
    }

    public void setListener(i33 i33Var) {
        this.N = i33Var;
    }

    @Override
    public void setRotation(float f) {
        h33 h33Var = this.M;
        h33Var.e(f - h33Var.i);
        d(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f) {
        this.F = f;
        this.a.setTopPadding(f);
    }
}
