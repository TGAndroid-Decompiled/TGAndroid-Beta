package og;

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
import ch.y;
import fi.ob;
import g6.d0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.h20;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.i51;
public class o extends FrameLayout implements a {
    public float D;
    public float E;
    public boolean F;
    public final c G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public int K;
    public m L;
    public n M;
    public final RectF N;
    public final RectF O;
    public final CropAreaView f21012a;
    public final ImageView f21013b;
    public final Matrix f21014c;
    public i51 d;
    public g f21015e;
    public final RectF f21016f;
    public final RectF h;
    public float f21017n;
    public final boolean f21018r;
    public final d0 f21019s;
    public final Matrix f21020w;
    public Bitmap f21021x;
    public boolean f21022y;

    public o(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z9 = context instanceof BubbleActivity;
        this.f21018r = z9;
        this.f21016f = new RectF();
        this.h = new RectF();
        this.f21014c = new Matrix();
        d0 d0Var = new d0(21, false);
        d0Var.f13557b = new float[8];
        this.f21019s = d0Var;
        this.f21020w = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.f21013b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar = new c(context);
        this.G = cVar;
        cVar.f20949b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f31321e = new RectF();
        viewGroup.f31323f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f31331n = new RectF();
        viewGroup.f31336r = new RectF();
        viewGroup.f31338s = new RectF();
        viewGroup.f31341w = new RectF();
        viewGroup.f31343y = new RectF();
        viewGroup.D = new RectF();
        viewGroup.K = -1.0f;
        viewGroup.L = 1.0f;
        viewGroup.M = -1.0f;
        viewGroup.U = new AccelerateDecelerateInterpolator();
        viewGroup.f31324f0 = true;
        viewGroup.f31330l0 = new RectF();
        viewGroup.f31332n0 = 0.0f;
        viewGroup.f31333o0 = 1.0f;
        viewGroup.f31334p0 = 0.0f;
        viewGroup.f31335q0 = 0.0f;
        viewGroup.f31315a0 = z9;
        viewGroup.J = true;
        viewGroup.I = true;
        viewGroup.V = g0.L(16.0f);
        viewGroup.W = g0.L(32.0f);
        viewGroup.f31340t0 = 1;
        Paint paint = new Paint();
        viewGroup.O = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.P = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(g0.L(2.0f));
        Paint paint3 = new Paint();
        viewGroup.Q = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(g0.L(1.0f));
        Paint paint4 = new Paint();
        viewGroup.R = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.S = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f31326h0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.T = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f21012a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(o oVar, Integer[][] numArr, int i7) {
        float f10;
        float f11;
        oVar.I = false;
        if (i7 != 0) {
            if (i7 != 1) {
                Integer[] numArr2 = numArr[i7 - 2];
                if (oVar.f21012a.getAspectRatio() > 1.0f) {
                    oVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    oVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            oVar.setLockedAspectRatio(1.0f);
            return;
        }
        m mVar = oVar.L;
        int i10 = ((mVar.f21007g % 180.0f) > 0.0f ? 1 : ((mVar.f21007g % 180.0f) == 0.0f ? 0 : -1));
        if (i10 != 0) {
            f10 = mVar.f21003b;
        } else {
            f10 = mVar.f21002a;
        }
        if (i10 != 0) {
            f11 = mVar.f21002a;
        } else {
            f11 = mVar.f21003b;
        }
        oVar.setLockedAspectRatio(f10 / f11);
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i7, int i10, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        int i11 = i7;
        int i12 = i10;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c10 = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i7, i10));
            matrix2.postScale(max, max);
            matrix2.postRotate(f12);
            matrix2.postConcat(matrix);
            matrix2.postScale(f13, f13);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    h20 h20Var = (h20) arrayList.get(i13);
                    float width = ((h20Var.f22821f / 2.0f) + h20Var.f22819c) * decodeFile.getWidth();
                    float height = ((h20Var.f22822g / 2.0f) + h20Var.d) * decodeFile.getHeight();
                    char c11 = c10;
                    float width2 = h20Var.f22838y * decodeFile.getWidth();
                    float height2 = h20Var.f22839z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c11] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f12 == 90.0f || f12 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    if (h20Var.f22817a == 1) {
                        h20Var.f22821f = ((h20Var.f22821f * i11) / bitmap.getWidth()) * f13 * f10;
                        h20Var.f22822g = ((h20Var.f22822g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        h20Var.f22831q = (int) ((h20Var.f22831q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        h20Var.f22832r = (int) ((h20Var.f22832r / f16) * f17);
                        h20Var.f22821f = ((h20Var.f22821f * f14) / f15) * f13 * f10;
                        h20Var.f22822g = ((h20Var.f22822g * f16) / f17) * f13 * f10;
                    }
                    h20Var.f22819c = (fArr[0] / bitmap.getWidth()) - (h20Var.f22821f / 2.0f);
                    h20Var.d = (fArr[1] / bitmap.getHeight()) - (h20Var.f22822g / 2.0f);
                    h20Var.f22838y = fArr[c11] / bitmap.getWidth();
                    h20Var.f22839z = fArr[3] / bitmap.getHeight();
                    h20Var.f22820e = (float) (h20Var.f22820e - ((f11 + f12) * 0.017453292519943295d));
                    i13++;
                    i11 = i7;
                    i12 = i10;
                    c10 = c11;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static float f(RectF rectF, float f10, float f11) {
        float width = rectF.width() * f11;
        float height = rectF.height() * f11;
        float width2 = rectF.left + ((rectF.width() - width) / 2.0f);
        float height2 = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF.set(width2, height2, width + width2, height + height2);
        return f10 * f11;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f10) {
        float f11 = rectF2.left;
        float f12 = rectF2.top;
        float f13 = rectF2.right;
        float f14 = rectF2.bottom;
        float f15 = rectF.left;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.top;
        if (f16 > f12) {
            f14 += f16 - f12;
            f12 = f16;
        }
        float f17 = rectF.right;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float f18 = rectF.bottom;
        if (f18 < f14) {
            f12 += f18 - f14;
        }
        double d = f10;
        double d2 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float cos = (float) (Math.cos(d2) * centerX);
        double d10 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        pointF.set(pointF.x + ((float) (Math.sin(d2) * centerX)) + ((float) (Math.cos(d10) * centerY)), pointF.y + cos + ((float) (Math.sin(d10) * centerY)));
    }

    public static String h(String str) {
        File z9 = w7.z(4);
        File file = new File(z9, iz.p() + "_temp.jpg");
        try {
            g0.E(new File(str), file);
        } catch (Exception e10) {
            a8.g(e10, true);
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

    private void setLockedAspectRatio(float f10) {
        CropAreaView cropAreaView = this.f21012a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        n nVar = this.M;
        if (nVar != null) {
            nVar.Z(false);
            this.M.H(true);
        }
    }

    public final void b(ye yeVar) {
        RectF rectF;
        float f10;
        int i7;
        int i10;
        float f11;
        CropAreaView cropAreaView = this.f21012a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(rectF, this.O));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.f21010k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        m mVar = this.L;
        float f12 = mVar.f21006f * cropWidth;
        yeVar.f26646k = (int) mVar.h;
        if (r2.f25216a) {
            jg.g.s(yeVar.f26646k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i7 = yeVar.f26646k;
            if (i7 >= 0) {
                break;
            }
            yeVar.f26646k = i7 + 360;
        }
        if (i7 != 90 && i7 != 270) {
            m mVar2 = this.L;
            i10 = (int) mVar2.f21002a;
            f11 = mVar2.f21003b;
        } else {
            m mVar3 = this.L;
            i10 = (int) mVar3.f21003b;
            f11 = mVar3.f21002a;
        }
        int i11 = (int) f11;
        float f13 = i10;
        yeVar.f26642e = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        yeVar.f26643f = ceil3;
        float f15 = yeVar.f26642e;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            yeVar.f26642e /= max;
            yeVar.f26643f /= max;
        }
        yeVar.f26641c = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.L.f21005e;
        float f16 = fArr[2] / f13;
        m mVar4 = this.L;
        float f17 = mVar4.f21005e;
        yeVar.f26639a = f16 / f17;
        yeVar.f26640b = (fArr[5] / f14) / f17;
        yeVar.d = mVar4.f21008i;
        yeVar.f26648m = f17;
        yeVar.f26647l = mVar4.f21009j;
        yeVar.f26649o = cropWidth;
        yeVar.f26650r = mVar4.f21010k;
        yeVar.f26651s = ceil;
        yeVar.f26652t = ceil2;
        yeVar.f26653u = this.f21022y;
        yeVar.v = cropAreaView.getLockAspectRatio();
        yeVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z9;
        int i7;
        if (this.L == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f21012a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.L.f21005e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = max;
        if (!this.f21018r) {
            i7 = g0.f22561m;
        } else {
            i7 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f21013b;
        float a10 = m.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = m.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.D) + i7) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new y(17, this, z9));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.U;
        AnimatorSet animatorSet = cropAreaView.f31329k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31329k0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f31329k0 = animatorSet2;
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
        animatorSet2.addListener(new ah.l(11, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z9, boolean z10, boolean z11, boolean z12) {
        float f10;
        long j3;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f21012a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a10 = m.a(this.L);
            float b10 = m.b(this.L);
            float f11 = this.L.f21008i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
            float f12 = (cropWidth - a10) / 2.0f;
            m mVar = this.L;
            float f13 = mVar.f21005e;
            d0 d0Var = this.f21019s;
            float[] fArr = (float[]) d0Var.f13557b;
            float[] fArr2 = (float[]) d0Var.f13557b;
            float f14 = rectF2.left;
            fArr[0] = f14;
            float f15 = rectF2.top;
            fArr[1] = f15;
            float f16 = rectF2.right;
            fArr[2] = f16;
            fArr[3] = f15;
            fArr[4] = f16;
            float f17 = rectF2.bottom;
            fArr[5] = f17;
            fArr[6] = f14;
            fArr[7] = f17;
            Matrix matrix2 = new Matrix();
            matrix2.set(mVar.f21010k);
            matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
            Matrix matrix3 = this.f21020w;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f11, a10 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            m mVar2 = this.L;
            PointF pointF = new PointF(mVar2.f21004c, mVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z9 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(rectF2, f13, rectF.width() / n(rectF, rectF2));
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z10 && this.f21017n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.L.f21005e * width < this.f21017n) {
                    width = 1.0f;
                }
                f10 = f(rectF2, f13, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            m mVar3 = this.L;
            float f19 = f18 - mVar3.f21004c;
            float f20 = pointF.y - mVar3.d;
            if (z11) {
                float f21 = f10 / f13;
                if (Math.abs(f21 - 1.0f) < 1.0E-5f && Math.abs(f19) < 1.0E-5f && Math.abs(f20) < 1.0E-5f) {
                    return;
                }
                this.F = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
                ofFloat.addListener(new l(this, z12, z9, z10, z11));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                if (z12) {
                    j3 = 100;
                } else {
                    j3 = 200;
                }
                ofFloat.setDuration(j3);
                ofFloat.start();
                return;
            }
            m.f(mVar3, f19, f20);
            m.g(this.L, f10 / f13, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f21012a;
        RectF rectF = this.N;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f21012a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f21012a.getCropLeft();
    }

    public float getCropTop() {
        return this.f21012a.getCropTop();
    }

    public float getCropWidth() {
        return this.f21012a.getCropWidth();
    }

    public int getCurrentHeight() {
        i51 i51Var = this.d;
        if (i51Var != null) {
            return i51Var.getVideoHeight();
        }
        Bitmap bitmap = this.f21021x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.K;
        if (i7 != 90 && i7 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        i51 i51Var = this.d;
        if (i51Var != null) {
            return i51Var.getVideoWidth();
        }
        Bitmap bitmap = this.f21021x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.K;
        if (i7 != 90 && i7 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        m mVar = this.L;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.f21007g + mVar.h;
    }

    public boolean getStateMirror() {
        m mVar = this.L;
        if (mVar != null && mVar.f21009j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        m mVar = this.L;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        m mVar = this.L;
        if (mVar == null) {
            return;
        }
        final float f10 = mVar.f21006f;
        CropAreaView cropAreaView = this.f21012a;
        AnimatorSet animatorSet = cropAreaView.f31329k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31329k0 = null;
        }
        m mVar2 = this.L;
        if ((mVar2.h + mVar2.f21007g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f21022y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f21022y) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f21017n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f31343y);
        m mVar3 = this.L;
        final float f13 = mVar3.f21004c;
        final float f14 = mVar3.d;
        final float f15 = mVar3.f21005e;
        final float f16 = mVar3.f21008i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o oVar = o.this;
                if (oVar.L == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = oVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                g0.Z1(rectF4, rectF3, floatValue, rectF5);
                oVar.f21012a.setActualRect(rectF5);
                m mVar4 = oVar.L;
                float f17 = 1.0f - floatValue;
                float f18 = mVar4.f21004c - (f13 * f17);
                float f19 = mVar4.d - (f14 * f17);
                float f20 = mVar4.f21008i - (f16 * f17);
                float T1 = g0.T1(f15, f10, floatValue);
                m mVar5 = oVar.L;
                m.f(mVar5, -f18, -f19);
                m.g(oVar.L, T1 / mVar5.f21005e, 0.0f, 0.0f);
                m.e(oVar.L, -f20);
                oVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        m mVar = this.L;
        boolean z9 = false;
        if (mVar == null) {
            return false;
        }
        mVar.f21009j = !mVar.f21009j;
        r(false);
        n nVar = this.M;
        if (nVar != null) {
            m mVar2 = this.L;
            float f10 = mVar2.h;
            float f11 = mVar2.f21007g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!m.c(mVar2) && f12 == 0.0f && this.f21012a.getLockAspectRatio() == 0.0f && !this.L.f21009j) {
                z9 = true;
            }
            nVar.Z(z9);
        }
        return this.L.f21009j;
    }

    public final void k() {
        this.f21012a.g(2, false);
        if (this.f21017n < 1.0E-5f) {
            this.f21017n = this.L.f21005e;
        }
    }

    public final void l(boolean z9) {
        boolean z10;
        float f10;
        CropAreaView cropAreaView = this.f21012a;
        AnimatorSet animatorSet = cropAreaView.f31329k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31329k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        m mVar = this.L;
        if (mVar != null && mVar.f21007g % 180.0f != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z10, this.f21022y);
        if (this.f21022y) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        m mVar2 = this.L;
        if (mVar2 != null) {
            m.d(mVar2, 0.0f);
            this.L.f21009j = false;
        }
        cropAreaView.d(this.h);
        r(z9);
        this.f21017n = 0.0f;
        n nVar = this.M;
        if (nVar != null) {
            nVar.Z(true);
            this.M.H(false);
        }
    }

    public final boolean m(float f10) {
        boolean z9;
        boolean z10;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f21012a;
            AnimatorSet animatorSet = cropAreaView.f31329k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f31329k0 = null;
            }
            this.f21017n = 0.0f;
            m mVar = this.L;
            float f11 = mVar.h;
            float f12 = mVar.f21007g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f21022y && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.L.f21007g + f13) % 180.0f != 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z9, this.f21022y);
            }
            m.d(this.L, f13);
            r(false);
            e(true, false, false, false);
            n nVar = this.M;
            if (nVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.f21009j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nVar.Z(z10);
            }
            if (((int) this.L.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.L == null || this.I) {
            return;
        }
        this.I = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = id.M0(2131751697, null);
        strArr[1] = id.M0(2131751695, null);
        int i7 = 2;
        for (int i10 = 0; i10 < 6; i10++) {
            Integer[] numArr2 = numArr[i10];
            if (this.f21012a.getAspectRatio() > 1.0f) {
                strArr[i7] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i7] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(0, this, numArr));
        u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.setCanceledOnTouchOutside(true);
        u1Var.setOnCancelListener(new ob(this, 4));
        u1Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.F) {
            CropAreaView cropAreaView = this.f21012a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.F) {
                    cropAreaView.g(3, true);
                    this.f21017n = 0.0f;
                    n nVar = this.M;
                    if (nVar != null) {
                        nVar.Z(false);
                    }
                }
                try {
                    this.G.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i7, g gVar, ye yeVar) {
        this.f21022y = true;
        this.d = null;
        this.f21015e = gVar;
        this.K = i7;
        this.f21021x = null;
        CropAreaView cropAreaView = this.f21012a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.L = new m(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new k(this, yeVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        RectF rectF;
        float f10;
        int i7;
        float f11;
        float max;
        boolean z9;
        if (this.f21015e != null && this.L != null) {
            CropAreaView cropAreaView = this.f21012a;
            cropAreaView.d(this.N);
            int ceil = (int) Math.ceil(n(rectF, this.O));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.L.f21010k;
            float[] fArr = this.H;
            matrix.getValues(fArr);
            m mVar = this.L;
            float f12 = mVar.f21006f * cropWidth;
            int i10 = (int) mVar.h;
            while (i10 < 0) {
                i10 += 360;
            }
            if (i10 != 90 && i10 != 270) {
                m mVar2 = this.L;
                i7 = (int) mVar2.f21002a;
                f11 = mVar2.f21003b;
            } else {
                m mVar3 = this.L;
                i7 = (int) mVar3.f21003b;
                f11 = mVar3.f21002a;
            }
            int i11 = (int) f11;
            double d = ceil;
            float f13 = i7;
            float ceil3 = (float) (d / Math.ceil(f13 * f12));
            float f14 = i11;
            float ceil4 = (float) (ceil2 / Math.ceil(f12 * f14));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f15 = ceil4;
            float f16 = ceil3;
            RectF rectF2 = cropAreaView.f31330l0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f21022y) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            m mVar4 = this.L;
            float f17 = mVar4.f21005e;
            float f18 = f17 / max;
            float f19 = f17 / mVar4.f21006f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = mVar4.f21008i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            g gVar = this.f21015e;
            m mVar5 = this.L;
            if (!mVar5.f21009j && !m.c(mVar5) && this.L.f21007g < 1.0E-5f) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean z10 = z9;
            m mVar6 = this.L;
            gVar.e(z10, f20, f21, f22, (int) mVar6.h, f18, f19, mVar6.f21006f / max, f16, f15, cropCenterX, cropCenterY, mVar6.f21009j);
        }
    }

    public final void r(boolean z9) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.f21014c;
        matrix.reset();
        m mVar = this.L;
        float f10 = mVar.f21007g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-mVar.f21002a) / 2.0f, (-mVar.f21003b) / 2.0f);
        } else {
            matrix.postTranslate((-mVar.f21003b) / 2.0f, (-mVar.f21002a) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.f21010k);
        CropAreaView cropAreaView = this.f21012a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f21022y || this.J || z9) {
            q();
            this.M.w();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f21012a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.D = f10;
        this.f21012a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z9) {
        this.f21012a.setFreeform(z9);
        this.f21022y = z9;
    }

    public void setListener(n nVar) {
        this.M = nVar;
    }

    @Override
    public void setRotation(float f10) {
        m mVar = this.L;
        m.e(mVar, f10 - mVar.f21008i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f21012a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.E = f10;
        this.f21012a.setTopPadding(f10);
    }
}
