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
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.c51;
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
    public final CropAreaView f21004a;
    public final ImageView f21005b;
    public final Matrix f21006c;
    public c51 d;
    public g f21007e;
    public final RectF f21008f;
    public final RectF h;
    public float f21009n;
    public final boolean f21010r;
    public final d0 f21011s;
    public final Matrix f21012w;
    public Bitmap f21013x;
    public boolean f21014y;

    public o(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z9 = context instanceof BubbleActivity;
        this.f21010r = z9;
        this.f21008f = new RectF();
        this.h = new RectF();
        this.f21006c = new Matrix();
        d0 d0Var = new d0(21, false);
        d0Var.f13555b = new float[8];
        this.f21011s = d0Var;
        this.f21012w = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.f21005b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar = new c(context);
        this.G = cVar;
        cVar.f20941b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f31300e = new RectF();
        viewGroup.f31302f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f31310n = new RectF();
        viewGroup.f31315r = new RectF();
        viewGroup.f31317s = new RectF();
        viewGroup.f31320w = new RectF();
        viewGroup.f31322y = new RectF();
        viewGroup.D = new RectF();
        viewGroup.K = -1.0f;
        viewGroup.L = 1.0f;
        viewGroup.M = -1.0f;
        viewGroup.U = new AccelerateDecelerateInterpolator();
        viewGroup.f31303f0 = true;
        viewGroup.f31309l0 = new RectF();
        viewGroup.f31311n0 = 0.0f;
        viewGroup.f31312o0 = 1.0f;
        viewGroup.f31313p0 = 0.0f;
        viewGroup.f31314q0 = 0.0f;
        viewGroup.f31294a0 = z9;
        viewGroup.J = true;
        viewGroup.I = true;
        viewGroup.V = g0.L(16.0f);
        viewGroup.W = g0.L(32.0f);
        viewGroup.f31319t0 = 1;
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
        viewGroup.f31305h0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.T = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f21004a = viewGroup;
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
                if (oVar.f21004a.getAspectRatio() > 1.0f) {
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
        int i10 = ((mVar.f20999g % 180.0f) > 0.0f ? 1 : ((mVar.f20999g % 180.0f) == 0.0f ? 0 : -1));
        if (i10 != 0) {
            f10 = mVar.f20995b;
        } else {
            f10 = mVar.f20994a;
        }
        if (i10 != 0) {
            f11 = mVar.f20994a;
        } else {
            f11 = mVar.f20995b;
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
                    float width = ((h20Var.f22804f / 2.0f) + h20Var.f22802c) * decodeFile.getWidth();
                    float height = ((h20Var.f22805g / 2.0f) + h20Var.d) * decodeFile.getHeight();
                    char c11 = c10;
                    float width2 = h20Var.f22821y * decodeFile.getWidth();
                    float height2 = h20Var.f22822z * decodeFile.getHeight();
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
                    if (h20Var.f22800a == 1) {
                        h20Var.f22804f = ((h20Var.f22804f * i11) / bitmap.getWidth()) * f13 * f10;
                        h20Var.f22805g = ((h20Var.f22805g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        h20Var.f22814q = (int) ((h20Var.f22814q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        h20Var.f22815r = (int) ((h20Var.f22815r / f16) * f17);
                        h20Var.f22804f = ((h20Var.f22804f * f14) / f15) * f13 * f10;
                        h20Var.f22805g = ((h20Var.f22805g * f16) / f17) * f13 * f10;
                    }
                    h20Var.f22802c = (fArr[0] / bitmap.getWidth()) - (h20Var.f22804f / 2.0f);
                    h20Var.d = (fArr[1] / bitmap.getHeight()) - (h20Var.f22805g / 2.0f);
                    h20Var.f22821y = fArr[c11] / bitmap.getWidth();
                    h20Var.f22822z = fArr[3] / bitmap.getHeight();
                    h20Var.f22803e = (float) (h20Var.f22803e - ((f11 + f12) * 0.017453292519943295d));
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
        CropAreaView cropAreaView = this.f21004a;
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
        CropAreaView cropAreaView = this.f21004a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(rectF, this.O));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.f21002k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        m mVar = this.L;
        float f12 = mVar.f20998f * cropWidth;
        yeVar.f26625k = (int) mVar.h;
        if (r2.f25191a) {
            jg.g.s(yeVar.f26625k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i7 = yeVar.f26625k;
            if (i7 >= 0) {
                break;
            }
            yeVar.f26625k = i7 + 360;
        }
        if (i7 != 90 && i7 != 270) {
            m mVar2 = this.L;
            i10 = (int) mVar2.f20994a;
            f11 = mVar2.f20995b;
        } else {
            m mVar3 = this.L;
            i10 = (int) mVar3.f20995b;
            f11 = mVar3.f20994a;
        }
        int i11 = (int) f11;
        float f13 = i10;
        yeVar.f26621e = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        yeVar.f26622f = ceil3;
        float f15 = yeVar.f26621e;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            yeVar.f26621e /= max;
            yeVar.f26622f /= max;
        }
        yeVar.f26620c = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.L.f20997e;
        float f16 = fArr[2] / f13;
        m mVar4 = this.L;
        float f17 = mVar4.f20997e;
        yeVar.f26618a = f16 / f17;
        yeVar.f26619b = (fArr[5] / f14) / f17;
        yeVar.d = mVar4.f21000i;
        yeVar.f26627m = f17;
        yeVar.f26626l = mVar4.f21001j;
        yeVar.f26628o = cropWidth;
        yeVar.f26629r = mVar4.f21002k;
        yeVar.f26630s = ceil;
        yeVar.f26631t = ceil2;
        yeVar.f26632u = this.f21014y;
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
        CropAreaView cropAreaView = this.f21004a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.L.f20997e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = max;
        if (!this.f21010r) {
            i7 = g0.f22531m;
        } else {
            i7 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f21005b;
        float a10 = m.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = m.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.D) + i7) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new y(17, this, z9));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.U;
        AnimatorSet animatorSet = cropAreaView.f31308k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31308k0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f31308k0 = animatorSet2;
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
            CropAreaView cropAreaView = this.f21004a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a10 = m.a(this.L);
            float b10 = m.b(this.L);
            float f11 = this.L.f21000i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
            float f12 = (cropWidth - a10) / 2.0f;
            m mVar = this.L;
            float f13 = mVar.f20997e;
            d0 d0Var = this.f21011s;
            float[] fArr = (float[]) d0Var.f13555b;
            float[] fArr2 = (float[]) d0Var.f13555b;
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
            matrix2.set(mVar.f21002k);
            matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
            Matrix matrix3 = this.f21012w;
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
            PointF pointF = new PointF(mVar2.f20996c, mVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z9 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(rectF2, f13, rectF.width() / n(rectF, rectF2));
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z10 && this.f21009n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.L.f20997e * width < this.f21009n) {
                    width = 1.0f;
                }
                f10 = f(rectF2, f13, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            m mVar3 = this.L;
            float f19 = f18 - mVar3.f20996c;
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
        CropAreaView cropAreaView = this.f21004a;
        RectF rectF = this.N;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f21004a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f21004a.getCropLeft();
    }

    public float getCropTop() {
        return this.f21004a.getCropTop();
    }

    public float getCropWidth() {
        return this.f21004a.getCropWidth();
    }

    public int getCurrentHeight() {
        c51 c51Var = this.d;
        if (c51Var != null) {
            return c51Var.getVideoHeight();
        }
        Bitmap bitmap = this.f21013x;
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
        c51 c51Var = this.d;
        if (c51Var != null) {
            return c51Var.getVideoWidth();
        }
        Bitmap bitmap = this.f21013x;
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
        return mVar.f20999g + mVar.h;
    }

    public boolean getStateMirror() {
        m mVar = this.L;
        if (mVar != null && mVar.f21001j) {
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
        final float f10 = mVar.f20998f;
        CropAreaView cropAreaView = this.f21004a;
        AnimatorSet animatorSet = cropAreaView.f31308k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31308k0 = null;
        }
        m mVar2 = this.L;
        if ((mVar2.h + mVar2.f20999g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f21014y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f21014y) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f21009n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f31322y);
        m mVar3 = this.L;
        final float f13 = mVar3.f20996c;
        final float f14 = mVar3.d;
        final float f15 = mVar3.f20997e;
        final float f16 = mVar3.f21000i;
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
                oVar.f21004a.setActualRect(rectF5);
                m mVar4 = oVar.L;
                float f17 = 1.0f - floatValue;
                float f18 = mVar4.f20996c - (f13 * f17);
                float f19 = mVar4.d - (f14 * f17);
                float f20 = mVar4.f21000i - (f16 * f17);
                float T1 = g0.T1(f15, f10, floatValue);
                m mVar5 = oVar.L;
                m.f(mVar5, -f18, -f19);
                m.g(oVar.L, T1 / mVar5.f20997e, 0.0f, 0.0f);
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
        mVar.f21001j = !mVar.f21001j;
        r(false);
        n nVar = this.M;
        if (nVar != null) {
            m mVar2 = this.L;
            float f10 = mVar2.h;
            float f11 = mVar2.f20999g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!m.c(mVar2) && f12 == 0.0f && this.f21004a.getLockAspectRatio() == 0.0f && !this.L.f21001j) {
                z9 = true;
            }
            nVar.Z(z9);
        }
        return this.L.f21001j;
    }

    public final void k() {
        this.f21004a.g(2, false);
        if (this.f21009n < 1.0E-5f) {
            this.f21009n = this.L.f20997e;
        }
    }

    public final void l(boolean z9) {
        boolean z10;
        float f10;
        CropAreaView cropAreaView = this.f21004a;
        AnimatorSet animatorSet = cropAreaView.f31308k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f31308k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        m mVar = this.L;
        if (mVar != null && mVar.f20999g % 180.0f != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z10, this.f21014y);
        if (this.f21014y) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        m mVar2 = this.L;
        if (mVar2 != null) {
            m.d(mVar2, 0.0f);
            this.L.f21001j = false;
        }
        cropAreaView.d(this.h);
        r(z9);
        this.f21009n = 0.0f;
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
            CropAreaView cropAreaView = this.f21004a;
            AnimatorSet animatorSet = cropAreaView.f31308k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f31308k0 = null;
            }
            this.f21009n = 0.0f;
            m mVar = this.L;
            float f11 = mVar.h;
            float f12 = mVar.f20999g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f21014y && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.L.f20999g + f13) % 180.0f != 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z9, this.f21014y);
            }
            m.d(this.L, f13);
            r(false);
            e(true, false, false, false);
            n nVar = this.M;
            if (nVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.f21001j) {
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
        strArr[0] = hd.M0(2131751698, null);
        strArr[1] = hd.M0(2131751696, null);
        int i7 = 2;
        for (int i10 = 0; i10 < 6; i10++) {
            Integer[] numArr2 = numArr[i10];
            if (this.f21004a.getAspectRatio() > 1.0f) {
                strArr[i7] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i7] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(0, this, numArr));
        u1 u1Var = alertDialog$Builder.f27292a;
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
            CropAreaView cropAreaView = this.f21004a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.F) {
                    cropAreaView.g(3, true);
                    this.f21009n = 0.0f;
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
        this.f21014y = true;
        this.d = null;
        this.f21007e = gVar;
        this.K = i7;
        this.f21013x = null;
        CropAreaView cropAreaView = this.f21004a;
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
        if (this.f21007e != null && this.L != null) {
            CropAreaView cropAreaView = this.f21004a;
            cropAreaView.d(this.N);
            int ceil = (int) Math.ceil(n(rectF, this.O));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.L.f21002k;
            float[] fArr = this.H;
            matrix.getValues(fArr);
            m mVar = this.L;
            float f12 = mVar.f20998f * cropWidth;
            int i10 = (int) mVar.h;
            while (i10 < 0) {
                i10 += 360;
            }
            if (i10 != 90 && i10 != 270) {
                m mVar2 = this.L;
                i7 = (int) mVar2.f20994a;
                f11 = mVar2.f20995b;
            } else {
                m mVar3 = this.L;
                i7 = (int) mVar3.f20995b;
                f11 = mVar3.f20994a;
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
            RectF rectF2 = cropAreaView.f31309l0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f21014y) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            m mVar4 = this.L;
            float f17 = mVar4.f20997e;
            float f18 = f17 / max;
            float f19 = f17 / mVar4.f20998f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = mVar4.f21000i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            g gVar = this.f21007e;
            m mVar5 = this.L;
            if (!mVar5.f21001j && !m.c(mVar5) && this.L.f20999g < 1.0E-5f) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean z10 = z9;
            m mVar6 = this.L;
            gVar.e(z10, f20, f21, f22, (int) mVar6.h, f18, f19, mVar6.f20998f / max, f16, f15, cropCenterX, cropCenterY, mVar6.f21001j);
        }
    }

    public final void r(boolean z9) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.f21006c;
        matrix.reset();
        m mVar = this.L;
        float f10 = mVar.f20999g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-mVar.f20994a) / 2.0f, (-mVar.f20995b) / 2.0f);
        } else {
            matrix.postTranslate((-mVar.f20995b) / 2.0f, (-mVar.f20994a) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.f21002k);
        CropAreaView cropAreaView = this.f21004a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f21014y || this.J || z9) {
            q();
            this.M.w();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f21004a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.D = f10;
        this.f21004a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z9) {
        this.f21004a.setFreeform(z9);
        this.f21014y = z9;
    }

    public void setListener(n nVar) {
        this.M = nVar;
    }

    @Override
    public void setRotation(float f10) {
        m mVar = this.L;
        m.e(mVar, f10 - mVar.f21000i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f21004a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.E = f10;
        this.f21004a.setTopPadding(f10);
    }
}
