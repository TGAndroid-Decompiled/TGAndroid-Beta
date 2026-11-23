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
import bi.j7;
import hi.mb;
import hi.x4;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.d20;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.s2;
import org.telegram.messenger.w7;
import org.telegram.messenger.xe;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.y51;
public class o extends FrameLayout implements a {
    public float E;
    public float F;
    public boolean G;
    public final c H;
    public final float[] I;
    public boolean J;
    public boolean K;
    public int L;
    public m M;
    public n N;
    public final RectF O;
    public final RectF P;
    public final CropAreaView f21887a;
    public final ImageView f21888b;
    public final Matrix f21889c;
    public y51 d;
    public g f21890e;
    public final RectF f21891f;
    public final RectF h;
    public float f21892n;
    public final boolean f21893r;
    public final x4 f21894s;
    public final Matrix f21895w;
    public Bitmap f21896x;
    public boolean f21897y;

    public o(Context context) {
        super(context);
        this.I = new float[9];
        this.O = new RectF();
        this.P = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f21893r = z10;
        this.f21891f = new RectF();
        this.h = new RectF();
        this.f21889c = new Matrix();
        x4 x4Var = new x4(16, false);
        x4Var.f15680b = new float[8];
        this.f21894s = x4Var;
        this.f21895w = new Matrix();
        this.G = false;
        ImageView imageView = new ImageView(context);
        this.f21888b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar = new c(context);
        this.H = cVar;
        cVar.f21824b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f32882e = new RectF();
        viewGroup.f32884f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f32892n = new RectF();
        viewGroup.f32897r = new RectF();
        viewGroup.f32899s = new RectF();
        viewGroup.f32903w = new RectF();
        viewGroup.f32905y = new RectF();
        viewGroup.E = new RectF();
        viewGroup.L = -1.0f;
        viewGroup.M = 1.0f;
        viewGroup.N = -1.0f;
        viewGroup.V = new AccelerateDecelerateInterpolator();
        viewGroup.f32886g0 = true;
        viewGroup.m0 = new RectF();
        viewGroup.f32894o0 = 0.0f;
        viewGroup.f32895p0 = 1.0f;
        viewGroup.f32896q0 = 0.0f;
        viewGroup.f32898r0 = 0.0f;
        viewGroup.f32878b0 = z10;
        viewGroup.K = true;
        viewGroup.J = true;
        viewGroup.W = g0.L(16.0f);
        viewGroup.f32876a0 = g0.L(32.0f);
        viewGroup.f32902u0 = 1;
        Paint paint = new Paint();
        viewGroup.P = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.Q = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(g0.L(2.0f));
        Paint paint3 = new Paint();
        viewGroup.R = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(g0.L(1.0f));
        Paint paint4 = new Paint();
        viewGroup.S = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.T = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f32888i0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.U = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f21887a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(o oVar, Integer[][] numArr, int i7) {
        float f10;
        float f11;
        oVar.J = false;
        if (i7 != 0) {
            if (i7 != 1) {
                Integer[] numArr2 = numArr[i7 - 2];
                if (oVar.f21887a.getAspectRatio() > 1.0f) {
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
        m mVar = oVar.M;
        int i10 = ((mVar.f21882g % 180.0f) > 0.0f ? 1 : ((mVar.f21882g % 180.0f) == 0.0f ? 0 : -1));
        if (i10 != 0) {
            f10 = mVar.f21878b;
        } else {
            f10 = mVar.f21877a;
        }
        if (i10 != 0) {
            f11 = mVar.f21877a;
        } else {
            f11 = mVar.f21878b;
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
                    d20 d20Var = (d20) arrayList.get(i13);
                    float width = ((d20Var.f23446f / 2.0f) + d20Var.f23444c) * decodeFile.getWidth();
                    float height = ((d20Var.f23447g / 2.0f) + d20Var.d) * decodeFile.getHeight();
                    char c11 = c10;
                    float width2 = d20Var.f23463y * decodeFile.getWidth();
                    float height2 = d20Var.f23464z * decodeFile.getHeight();
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
                    if (d20Var.f23442a == 1) {
                        d20Var.f23446f = ((d20Var.f23446f * i11) / bitmap.getWidth()) * f13 * f10;
                        d20Var.f23447g = ((d20Var.f23447g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        d20Var.f23456q = (int) ((d20Var.f23456q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        d20Var.f23457r = (int) ((d20Var.f23457r / f16) * f17);
                        d20Var.f23446f = ((d20Var.f23446f * f14) / f15) * f13 * f10;
                        d20Var.f23447g = ((d20Var.f23447g * f16) / f17) * f13 * f10;
                    }
                    d20Var.f23444c = (fArr[0] / bitmap.getWidth()) - (d20Var.f23446f / 2.0f);
                    d20Var.d = (fArr[1] / bitmap.getHeight()) - (d20Var.f23447g / 2.0f);
                    d20Var.f23463y = fArr[c11] / bitmap.getWidth();
                    d20Var.f23464z = fArr[3] / bitmap.getHeight();
                    d20Var.f23445e = (float) (d20Var.f23445e - ((f11 + f12) * 0.017453292519943295d));
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

    public static float f(float f10, float f11, RectF rectF) {
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
        File z10 = w7.z(4);
        File file = new File(z10, cz.p() + "_temp.jpg");
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
        CropAreaView cropAreaView = this.f21887a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        n nVar = this.N;
        if (nVar != null) {
            nVar.D(false);
            this.N.w(true);
        }
    }

    public final void b(xe xeVar) {
        RectF rectF;
        float f10;
        int i7;
        int i10;
        float f11;
        CropAreaView cropAreaView = this.f21887a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(rectF, this.P));
        int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.f21885k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        m mVar = this.M;
        float f12 = mVar.f21881f * cropWidth;
        xeVar.f27845k = (int) mVar.h;
        if (s2.f26694a) {
            i5.c.t(xeVar.f27845k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i7 = xeVar.f27845k;
            if (i7 >= 0) {
                break;
            }
            xeVar.f27845k = i7 + 360;
        }
        if (i7 != 90 && i7 != 270) {
            m mVar2 = this.M;
            i10 = (int) mVar2.f21877a;
            f11 = mVar2.f21878b;
        } else {
            m mVar3 = this.M;
            i10 = (int) mVar3.f21878b;
            f11 = mVar3.f21877a;
        }
        int i11 = (int) f11;
        float f13 = i10;
        xeVar.f27841e = (float) (ceil / Math.ceil(f13 * f12));
        float f14 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f12 * f14));
        xeVar.f27842f = ceil3;
        float f15 = xeVar.f27841e;
        if (f15 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f15, ceil3);
            xeVar.f27841e /= max;
            xeVar.f27842f /= max;
        }
        xeVar.f27840c = Math.min(f13 / cropAreaView.getCropWidth(), f14 / cropAreaView.getCropHeight()) * this.M.f21880e;
        float f16 = fArr[2] / f13;
        m mVar4 = this.M;
        float f17 = mVar4.f21880e;
        xeVar.f27838a = f16 / f17;
        xeVar.f27839b = (fArr[5] / f14) / f17;
        xeVar.d = mVar4.f21883i;
        xeVar.f27847m = f17;
        xeVar.f27846l = mVar4.f21884j;
        xeVar.f27848o = cropWidth;
        xeVar.f27849r = mVar4.f21885k;
        xeVar.f27850s = ceil;
        xeVar.f27851t = ceil2;
        xeVar.f27852u = this.f21897y;
        xeVar.v = cropAreaView.getLockAspectRatio();
        xeVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        int i7;
        if (this.M == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f21887a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.M.f21880e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = max;
        if (!this.f21893r) {
            i7 = g0.f24004m;
        } else {
            i7 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f21888b;
        float a10 = m.a(this.M) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = m.b(this.M) * ((rectF.centerY() - ((((imageView.getHeight() - this.E) + i7) + this.F) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new j7(18, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.V;
        AnimatorSet animatorSet = cropAreaView.f32891l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f32891l0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f32891l0 = animatorSet2;
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
        animatorSet2.addListener(new ah.l(10, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f10;
        long j3;
        if (this.M != null) {
            CropAreaView cropAreaView = this.f21887a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a10 = m.a(this.M);
            float b10 = m.b(this.M);
            float f11 = this.M.f21883i;
            float radians = (float) Math.toRadians(f11);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
            float f12 = (cropWidth - a10) / 2.0f;
            m mVar = this.M;
            float f13 = mVar.f21880e;
            x4 x4Var = this.f21894s;
            float[] fArr = (float[]) x4Var.f15680b;
            float[] fArr2 = (float[]) x4Var.f15680b;
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
            matrix2.set(mVar.f21885k);
            matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
            Matrix matrix3 = this.f21895w;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f11, a10 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            m mVar2 = this.M;
            PointF pointF = new PointF(mVar2.f21879c, mVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f10 = f(f13, rectF.width() / n(rectF, rectF2), rectF2);
                } else {
                    f10 = f13;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f21892n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.M.f21880e * width < this.f21892n) {
                    width = 1.0f;
                }
                f10 = f(f13, width, rectF2);
                g(rectF2, rectF, pointF, radians);
            } else {
                f10 = f13;
            }
            float f18 = pointF.x;
            m mVar3 = this.M;
            float f19 = f18 - mVar3.f21879c;
            float f20 = pointF.y - mVar3.d;
            if (z12) {
                float f21 = f10 / f13;
                if (Math.abs(f21 - 1.0f) < 1.0E-5f && Math.abs(f19) < 1.0E-5f && Math.abs(f20) < 1.0E-5f) {
                    return;
                }
                this.G = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
                ofFloat.addListener(new l(this, z13, z10, z11, z12));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                if (z13) {
                    j3 = 100;
                } else {
                    j3 = 200;
                }
                ofFloat.setDuration(j3);
                ofFloat.start();
                return;
            }
            m.f(mVar3, f19, f20);
            m.g(this.M, f10 / f13, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f21887a;
        RectF rectF = this.O;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f21887a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f21887a.getCropLeft();
    }

    public float getCropTop() {
        return this.f21887a.getCropTop();
    }

    public float getCropWidth() {
        return this.f21887a.getCropWidth();
    }

    public int getCurrentHeight() {
        y51 y51Var = this.d;
        if (y51Var != null) {
            return y51Var.getVideoHeight();
        }
        Bitmap bitmap = this.f21896x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.L;
        if (i7 != 90 && i7 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        y51 y51Var = this.d;
        if (y51Var != null) {
            return y51Var.getVideoWidth();
        }
        Bitmap bitmap = this.f21896x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.L;
        if (i7 != 90 && i7 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        m mVar = this.M;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.f21882g + mVar.h;
    }

    public boolean getStateMirror() {
        m mVar = this.M;
        if (mVar != null && mVar.f21884j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        m mVar = this.M;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        m mVar = this.M;
        if (mVar == null) {
            return;
        }
        final float f10 = mVar.f21881f;
        CropAreaView cropAreaView = this.f21887a;
        AnimatorSet animatorSet = cropAreaView.f32891l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f32891l0 = null;
        }
        m mVar2 = this.M;
        if ((mVar2.h + mVar2.f21882g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        float f12 = 1.0f;
        if (!this.f21897y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        if (this.f21897y) {
            f12 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f12);
        this.f21892n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f32905y);
        m mVar3 = this.M;
        final float f13 = mVar3.f21879c;
        final float f14 = mVar3.d;
        final float f15 = mVar3.f21880e;
        final float f16 = mVar3.f21883i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o oVar = o.this;
                if (oVar.M == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = oVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                g0.Z1(rectF4, rectF3, floatValue, rectF5);
                oVar.f21887a.setActualRect(rectF5);
                m mVar4 = oVar.M;
                float f17 = 1.0f - floatValue;
                float f18 = mVar4.f21879c - (f13 * f17);
                float f19 = mVar4.d - (f14 * f17);
                float f20 = mVar4.f21883i - (f16 * f17);
                float T1 = g0.T1(f15, f10, floatValue);
                m mVar5 = oVar.M;
                m.f(mVar5, -f18, -f19);
                m.g(oVar.M, T1 / mVar5.f21880e, 0.0f, 0.0f);
                m.e(oVar.M, -f20);
                oVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        m mVar = this.M;
        boolean z10 = false;
        if (mVar == null) {
            return false;
        }
        mVar.f21884j = !mVar.f21884j;
        r(false);
        n nVar = this.N;
        if (nVar != null) {
            m mVar2 = this.M;
            float f10 = mVar2.h;
            float f11 = mVar2.f21882g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!m.c(mVar2) && f12 == 0.0f && this.f21887a.getLockAspectRatio() == 0.0f && !this.M.f21884j) {
                z10 = true;
            }
            nVar.D(z10);
        }
        return this.M.f21884j;
    }

    public final void k() {
        this.f21887a.g(2, false);
        if (this.f21892n < 1.0E-5f) {
            this.f21892n = this.M.f21880e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f10;
        CropAreaView cropAreaView = this.f21887a;
        AnimatorSet animatorSet = cropAreaView.f32891l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f32891l0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        m mVar = this.M;
        if (mVar != null && mVar.f21882g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f21897y);
        if (this.f21897y) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f10);
        m mVar2 = this.M;
        if (mVar2 != null) {
            m.d(mVar2, 0.0f);
            this.M.f21884j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f21892n = 0.0f;
        n nVar = this.N;
        if (nVar != null) {
            nVar.D(true);
            this.N.w(false);
        }
    }

    public final boolean m(float f10) {
        boolean z10;
        boolean z11;
        if (this.M != null) {
            CropAreaView cropAreaView = this.f21887a;
            AnimatorSet animatorSet = cropAreaView.f32891l0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f32891l0 = null;
            }
            this.f21892n = 0.0f;
            m mVar = this.M;
            float f11 = mVar.h;
            float f12 = mVar.f21882g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (this.f21897y && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.M.f21882g + f13) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f21897y);
            }
            m.d(this.M, f13);
            r(false);
            e(true, false, false, false);
            n nVar = this.N;
            if (nVar != null) {
                if (f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.M.f21884j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nVar.D(z11);
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
        strArr[0] = hd.N0(2131751685, null);
        strArr[1] = hd.N0(2131751683, null);
        int i7 = 2;
        for (int i10 = 0; i10 < 6; i10++) {
            Integer[] numArr2 = numArr[i10];
            if (this.f21887a.getAspectRatio() > 1.0f) {
                strArr[i7] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i7] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i7++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(0, this, numArr));
        t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.setCanceledOnTouchOutside(true);
        t1Var.setOnCancelListener(new mb(this, 4));
        t1Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            CropAreaView cropAreaView = this.f21887a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.G) {
                    cropAreaView.g(3, true);
                    this.f21892n = 0.0f;
                    n nVar = this.N;
                    if (nVar != null) {
                        nVar.D(false);
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

    public final void p(int i7, g gVar, xe xeVar) {
        this.f21897y = true;
        this.d = null;
        this.f21890e = gVar;
        this.L = i7;
        this.f21896x = null;
        CropAreaView cropAreaView = this.f21887a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.M = new m(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new k(this, xeVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        RectF rectF;
        float f10;
        int i7;
        float f11;
        float max;
        boolean z10;
        if (this.f21890e != null && this.M != null) {
            CropAreaView cropAreaView = this.f21887a;
            cropAreaView.d(this.O);
            int ceil = (int) Math.ceil(n(rectF, this.P));
            int ceil2 = (int) Math.ceil(f10 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.M.f21885k;
            float[] fArr = this.I;
            matrix.getValues(fArr);
            m mVar = this.M;
            float f12 = mVar.f21881f * cropWidth;
            int i10 = (int) mVar.h;
            while (i10 < 0) {
                i10 += 360;
            }
            if (i10 != 90 && i10 != 270) {
                m mVar2 = this.M;
                i7 = (int) mVar2.f21877a;
                f11 = mVar2.f21878b;
            } else {
                m mVar3 = this.M;
                i7 = (int) mVar3.f21878b;
                f11 = mVar3.f21877a;
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
            RectF rectF2 = cropAreaView.m0;
            cropAreaView.a(rectF2, f13 / f14);
            if (this.f21897y) {
                max = rectF2.width() / f13;
            } else {
                max = Math.max(rectF2.width() / f13, rectF2.height() / f14);
            }
            m mVar4 = this.M;
            float f17 = mVar4.f21880e;
            float f18 = f17 / max;
            float f19 = f17 / mVar4.f21881f;
            float f20 = (fArr[2] / f13) / f17;
            float f21 = (fArr[5] / f14) / f17;
            float f22 = mVar4.f21883i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            g gVar = this.f21890e;
            m mVar5 = this.M;
            if (!mVar5.f21884j && !m.c(mVar5) && this.M.f21882g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z11 = z10;
            m mVar6 = this.M;
            gVar.e(z11, f20, f21, f22, (int) mVar6.h, f18, f19, mVar6.f21881f / max, f16, f15, cropCenterX, cropCenterY, mVar6.f21884j);
        }
    }

    public final void r(boolean z10) {
        if (this.M == null) {
            return;
        }
        Matrix matrix = this.f21889c;
        matrix.reset();
        m mVar = this.M;
        float f10 = mVar.f21882g;
        if (f10 != 90.0f && f10 != 270.0f) {
            matrix.postTranslate((-mVar.f21877a) / 2.0f, (-mVar.f21878b) / 2.0f);
        } else {
            matrix.postTranslate((-mVar.f21878b) / 2.0f, (-mVar.f21877a) / 2.0f);
        }
        matrix.postRotate((int) this.M.h);
        matrix.postConcat(this.M.f21885k);
        CropAreaView cropAreaView = this.f21887a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f21897y || this.K || z10) {
            q();
            this.N.r();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.f21887a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.E = f10;
        this.f21887a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z10) {
        this.f21887a.setFreeform(z10);
        this.f21897y = z10;
    }

    public void setListener(n nVar) {
        this.N = nVar;
    }

    @Override
    public void setRotation(float f10) {
        m mVar = this.M;
        m.e(mVar, f10 - mVar.f21883i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f21887a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.F = f10;
        this.f21887a.setTopPadding(f10);
    }
}
