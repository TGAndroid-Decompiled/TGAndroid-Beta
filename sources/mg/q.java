package mg;

import ah.q0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
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
import bi.t;
import di.id;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.u61;
public class q extends FrameLayout implements a {
    public float E;
    public boolean F;
    public final c G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public int K;
    public o L;
    public p M;
    public final RectF N;
    public final RectF O;
    public final CropAreaView f16330a;
    public final ImageView f16331b;
    public final Matrix f16332c;
    public u61 d;
    public g f16333e;
    public final RectF f16334f;
    public final RectF h;
    public float f16335n;
    public final boolean f16336r;
    public final n f16337s;
    public final Matrix v;
    public Bitmap f16338w;
    public boolean f16339x;
    public float f16340y;

    public q(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f16336r = z10;
        this.f16334f = new RectF();
        this.h = new RectF();
        this.f16332c = new Matrix();
        n nVar = new n(0, false);
        nVar.f16319b = new float[8];
        this.f16337s = nVar;
        this.v = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.f16331b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar = new c(context);
        this.G = cVar;
        cVar.f16264b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.f23975e = new RectF();
        viewGroup.f23977f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f23985n = new RectF();
        viewGroup.f23990r = new RectF();
        viewGroup.f23992s = new RectF();
        viewGroup.v = new RectF();
        viewGroup.f23996x = new RectF();
        viewGroup.f23997y = new RectF();
        viewGroup.K = -1.0f;
        viewGroup.L = 1.0f;
        viewGroup.M = -1.0f;
        viewGroup.U = new AccelerateDecelerateInterpolator();
        viewGroup.f23978f0 = true;
        viewGroup.f23984l0 = new RectF();
        viewGroup.f23986n0 = 0.0f;
        viewGroup.f23987o0 = 1.0f;
        viewGroup.f23988p0 = 0.0f;
        viewGroup.f23989q0 = 0.0f;
        viewGroup.f23969a0 = z10;
        viewGroup.J = true;
        viewGroup.I = true;
        viewGroup.V = AndroidUtilities.dp(16.0f);
        viewGroup.W = AndroidUtilities.dp(32.0f);
        viewGroup.f23994t0 = 1;
        Paint paint = new Paint();
        viewGroup.O = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        viewGroup.P = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        viewGroup.Q = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        viewGroup.R = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        viewGroup.S = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        viewGroup.f23980h0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.T = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f16330a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(q qVar, Integer[][] numArr, int i10) {
        float f7;
        float f10;
        qVar.I = false;
        if (i10 != 0) {
            if (i10 != 1) {
                Integer[] numArr2 = numArr[i10 - 2];
                if (qVar.f16330a.getAspectRatio() > 1.0f) {
                    qVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    qVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            qVar.setLockedAspectRatio(1.0f);
            return;
        }
        o oVar = qVar.L;
        int i11 = ((oVar.f16325g % 180.0f) > 0.0f ? 1 : ((oVar.f16325g % 180.0f) == 0.0f ? 0 : -1));
        if (i11 != 0) {
            f7 = oVar.f16321b;
        } else {
            f7 = oVar.f16320a;
        }
        if (i11 != 0) {
            f10 = oVar.f16320a;
        } else {
            f10 = oVar.f16321b;
        }
        qVar.setLockedAspectRatio(f7 / f10);
    }

    public static void c(java.lang.String r19, android.graphics.Canvas r20, android.graphics.Bitmap r21, android.graphics.Matrix r22, int r23, int r24, float r25, float r26, float r27, float r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: mg.q.c(java.lang.String, android.graphics.Canvas, android.graphics.Bitmap, android.graphics.Matrix, int, int, float, float, float, float, java.util.ArrayList):void");
    }

    public static float f(RectF rectF, float f7, float f10) {
        float width = rectF.width() * f10;
        float height = rectF.height() * f10;
        float width2 = rectF.left + ((rectF.width() - width) / 2.0f);
        float height2 = rectF.top + ((rectF.height() - height) / 2.0f);
        rectF.set(width2, height2, width + width2, height + height2);
        return f7 * f10;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f7) {
        float f10 = rectF2.left;
        float f11 = rectF2.top;
        float f12 = rectF2.right;
        float f13 = rectF2.bottom;
        float f14 = rectF.left;
        if (f14 > f10) {
            f12 += f14 - f10;
            f10 = f14;
        }
        float f15 = rectF.top;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.right;
        if (f16 < f12) {
            f10 += f16 - f12;
        }
        float f17 = rectF.bottom;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        double d = f7;
        double d10 = 1.5707963267948966d - d;
        double centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f10);
        float cos = (float) (Math.cos(d10) * centerX);
        double d11 = d + 1.5707963267948966d;
        double centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f11);
        pointF.set(pointF.x + ((float) (Math.sin(d10) * centerX)) + ((float) (Math.cos(d11) * centerY)), pointF.y + cos + ((float) (Math.sin(d11) * centerY)));
    }

    public static String h(String str) {
        File directory = FileLoader.getDirectory(4);
        File file = new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e7) {
            FileLog.e(e7);
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

    private void setLockedAspectRatio(float f7) {
        CropAreaView cropAreaView = this.f16330a;
        cropAreaView.setLockedAspectRatio(f7);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f7);
        d(rectF);
        p pVar = this.M;
        if (pVar != null) {
            pVar.W(false);
            this.M.E(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        RectF rectF;
        float f7;
        int i10;
        int i11;
        float f10;
        CropAreaView cropAreaView = this.f16330a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(rectF, this.O));
        int ceil2 = (int) Math.ceil(f7 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.f16328k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        o oVar = this.L;
        float f11 = oVar.f16324f * cropWidth;
        cropState.transformRotation = (int) oVar.h;
        if (BuildVars.LOGS_ENABLED) {
            i2.g.o(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            }
            cropState.transformRotation = i10 + 360;
        }
        if (i10 != 90 && i10 != 270) {
            o oVar2 = this.L;
            i11 = (int) oVar2.f16320a;
            f10 = oVar2.f16321b;
        } else {
            o oVar3 = this.L;
            i11 = (int) oVar3.f16321b;
            f10 = oVar3.f16320a;
        }
        int i12 = (int) f10;
        float f12 = i11;
        cropState.cropPw = (float) (ceil / Math.ceil(f12 * f11));
        float f13 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f11 * f13));
        cropState.cropPh = ceil3;
        float f14 = cropState.cropPw;
        if (f14 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f14, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.L.f16323e;
        float f15 = fArr[2] / f12;
        o oVar4 = this.L;
        float f16 = oVar4.f16323e;
        cropState.cropPx = f15 / f16;
        cropState.cropPy = (fArr[5] / f13) / f16;
        cropState.cropRotate = oVar4.f16326i;
        cropState.stateScale = f16;
        cropState.mirrored = oVar4.f16327j;
        cropState.scale = cropWidth;
        cropState.matrix = oVar4.f16328k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.f16339x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        int i10;
        if (this.L == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.f16330a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f7 = this.L.f16323e;
        if (f7 * max > 30.0f) {
            max = 30.0f / f7;
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = max;
        if (!this.f16336r) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f16331b;
        float a2 = o.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = o.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.f16340y) + i10) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f10, fArr, a2, b10, 0));
        ofFloat.addListener(new q0(18, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.U;
        AnimatorSet animatorSet = cropAreaView.f23983k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f23983k0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f23983k0 = animatorSet2;
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
        animatorSet2.addListener(new t(9, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f7;
        long j3;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f16330a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a2 = o.a(this.L);
            float b10 = o.b(this.L);
            float f10 = this.L.f16326i;
            float radians = (float) Math.toRadians(f10);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f10, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
            float f11 = (cropWidth - a2) / 2.0f;
            o oVar = this.L;
            float f12 = oVar.f16323e;
            n nVar = this.f16337s;
            float[] fArr = (float[]) nVar.f16319b;
            float[] fArr2 = (float[]) nVar.f16319b;
            float f13 = rectF2.left;
            fArr[0] = f13;
            float f14 = rectF2.top;
            fArr[1] = f14;
            float f15 = rectF2.right;
            fArr[2] = f15;
            fArr[3] = f14;
            fArr[4] = f15;
            float f16 = rectF2.bottom;
            fArr[5] = f16;
            fArr[6] = f13;
            fArr[7] = f16;
            Matrix matrix2 = new Matrix();
            matrix2.set(oVar.f16328k);
            matrix2.preTranslate(f11 / f12, ((cropHeight - b10) / 2.0f) / f12);
            Matrix matrix3 = this.v;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f10, a2 / 2.0f, b10 / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            o oVar2 = this.L;
            PointF pointF = new PointF(oVar2.f16322c, oVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f7 = f(rectF2, f12, rectF.width() / n(rectF, rectF2));
                } else {
                    f7 = f12;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f16335n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.L.f16323e * width < this.f16335n) {
                    width = 1.0f;
                }
                f7 = f(rectF2, f12, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f7 = f12;
            }
            float f17 = pointF.x;
            o oVar3 = this.L;
            float f18 = f17 - oVar3.f16322c;
            float f19 = pointF.y - oVar3.d;
            if (z12) {
                float f20 = f7 / f12;
                if (Math.abs(f20 - 1.0f) < 1.0E-5f && Math.abs(f18) < 1.0E-5f && Math.abs(f19) < 1.0E-5f) {
                    return;
                }
                this.F = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h(this, f18, new float[]{1.0f, 0.0f, 0.0f}, f19, f20, 1));
                ofFloat.addListener(new m(this, z13, z10, z11, z12));
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
            o.f(oVar3, f18, f19);
            o.g(this.L, f7 / f12, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f16330a;
        RectF rectF = this.N;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f16330a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f16330a.getCropLeft();
    }

    public float getCropTop() {
        return this.f16330a.getCropTop();
    }

    public float getCropWidth() {
        return this.f16330a.getCropWidth();
    }

    public int getCurrentHeight() {
        u61 u61Var = this.d;
        if (u61Var != null) {
            return u61Var.getVideoHeight();
        }
        Bitmap bitmap = this.f16338w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.K;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
    }

    public int getCurrentWidth() {
        u61 u61Var = this.d;
        if (u61Var != null) {
            return u61Var.getVideoWidth();
        }
        Bitmap bitmap = this.f16338w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.K;
        if (i10 != 90 && i10 != 270) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public float getStateFullOrientation() {
        o oVar = this.L;
        if (oVar == null) {
            return 0.0f;
        }
        return oVar.f16325g + oVar.h;
    }

    public boolean getStateMirror() {
        o oVar = this.L;
        if (oVar != null && oVar.f16327j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        o oVar = this.L;
        if (oVar == null) {
            return 0.0f;
        }
        return oVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        o oVar = this.L;
        if (oVar == null) {
            return;
        }
        final float f7 = oVar.f16324f;
        CropAreaView cropAreaView = this.f16330a;
        AnimatorSet animatorSet = cropAreaView.f23983k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f23983k0 = null;
        }
        o oVar2 = this.L;
        if ((oVar2.h + oVar2.f16325g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f10 = currentWidth / currentHeight;
        float f11 = 1.0f;
        if (!this.f16339x) {
            f10 = 1.0f;
        }
        cropAreaView.a(this.h, f10);
        if (this.f16339x) {
            f11 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f11);
        this.f16335n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f23996x);
        o oVar3 = this.L;
        final float f12 = oVar3.f16322c;
        final float f13 = oVar3.d;
        final float f14 = oVar3.f16323e;
        final float f15 = oVar3.f16326i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q qVar = q.this;
                if (qVar.L == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = qVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                qVar.f16330a.setActualRect(rectF5);
                o oVar4 = qVar.L;
                float f16 = 1.0f - floatValue;
                float f17 = oVar4.f16322c - (f12 * f16);
                float f18 = oVar4.d - (f13 * f16);
                float f19 = oVar4.f16326i - (f15 * f16);
                float lerp = AndroidUtilities.lerp(f14, f7, floatValue);
                o oVar5 = qVar.L;
                o.f(oVar5, -f17, -f18);
                o.g(qVar.L, lerp / oVar5.f16323e, 0.0f, 0.0f);
                o.e(qVar.L, -f19);
                qVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        o oVar = this.L;
        boolean z10 = false;
        if (oVar == null) {
            return false;
        }
        oVar.f16327j = !oVar.f16327j;
        r(false);
        p pVar = this.M;
        if (pVar != null) {
            o oVar2 = this.L;
            float f7 = oVar2.h;
            float f10 = oVar2.f16325g;
            float f11 = ((f7 + f10) - f10) % 360.0f;
            if (!o.c(oVar2) && f11 == 0.0f && this.f16330a.getLockAspectRatio() == 0.0f && !this.L.f16327j) {
                z10 = true;
            }
            pVar.W(z10);
        }
        return this.L.f16327j;
    }

    public final void k() {
        this.f16330a.g(2, false);
        if (this.f16335n < 1.0E-5f) {
            this.f16335n = this.L.f16323e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f7;
        CropAreaView cropAreaView = this.f16330a;
        AnimatorSet animatorSet = cropAreaView.f23983k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f23983k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        o oVar = this.L;
        if (oVar != null && oVar.f16325g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f16339x);
        if (this.f16339x) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f7);
        o oVar2 = this.L;
        if (oVar2 != null) {
            o.d(oVar2, 0.0f);
            this.L.f16327j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f16335n = 0.0f;
        p pVar = this.M;
        if (pVar != null) {
            pVar.W(true);
            this.M.E(false);
        }
    }

    public final boolean m(float f7) {
        boolean z10;
        boolean z11;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f16330a;
            AnimatorSet animatorSet = cropAreaView.f23983k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f23983k0 = null;
            }
            this.f16335n = 0.0f;
            o oVar = this.L;
            float f10 = oVar.h;
            float f11 = oVar.f16325g;
            float f12 = (((f10 + f11) - f11) + f7) % 360.0f;
            if (this.f16339x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.L.f16325g + f12) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f16339x);
            }
            o.d(this.L, f12);
            r(false);
            e(true, false, false, false);
            p pVar = this.M;
            if (pVar != null) {
                if (f12 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.f16327j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pVar.W(z11);
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
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i10 = 2;
        for (int i11 = 0; i11 < 6; i11++) {
            Integer[] numArr2 = numArr[i11];
            if (this.f16330a.getAspectRatio() > 1.0f) {
                strArr[i10] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i10] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(0, this, numArr));
        b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.setCanceledOnTouchOutside(true);
        b2Var.setOnCancelListener(new id(this, 4));
        b2Var.show();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.F) {
            CropAreaView cropAreaView = this.f16330a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.F) {
                    cropAreaView.g(3, true);
                    this.f16335n = 0.0f;
                    p pVar = this.M;
                    if (pVar != null) {
                        pVar.W(false);
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

    public final void p(int i10, g gVar, MediaController.CropState cropState) {
        this.f16339x = true;
        this.d = null;
        this.f16333e = gVar;
        this.K = i10;
        this.f16338w = null;
        CropAreaView cropAreaView = this.f16330a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.L = new o(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new k(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        RectF rectF;
        float f7;
        int i10;
        float f10;
        float max;
        boolean z10;
        if (this.f16333e != null && this.L != null) {
            CropAreaView cropAreaView = this.f16330a;
            cropAreaView.d(this.N);
            int ceil = (int) Math.ceil(n(rectF, this.O));
            int ceil2 = (int) Math.ceil(f7 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.L.f16328k;
            float[] fArr = this.H;
            matrix.getValues(fArr);
            o oVar = this.L;
            float f11 = oVar.f16324f * cropWidth;
            int i11 = (int) oVar.h;
            while (i11 < 0) {
                i11 += 360;
            }
            if (i11 != 90 && i11 != 270) {
                o oVar2 = this.L;
                i10 = (int) oVar2.f16320a;
                f10 = oVar2.f16321b;
            } else {
                o oVar3 = this.L;
                i10 = (int) oVar3.f16321b;
                f10 = oVar3.f16320a;
            }
            int i12 = (int) f10;
            double d = ceil;
            float f12 = i10;
            float ceil3 = (float) (d / Math.ceil(f12 * f11));
            float f13 = i12;
            float ceil4 = (float) (ceil2 / Math.ceil(f11 * f13));
            if (ceil3 > 1.0f || ceil4 > 1.0f) {
                float max2 = Math.max(ceil3, ceil4);
                ceil3 /= max2;
                ceil4 /= max2;
            }
            float f14 = ceil4;
            float f15 = ceil3;
            RectF rectF2 = cropAreaView.f23984l0;
            cropAreaView.a(rectF2, f12 / f13);
            if (this.f16339x) {
                max = rectF2.width() / f12;
            } else {
                max = Math.max(rectF2.width() / f12, rectF2.height() / f13);
            }
            o oVar4 = this.L;
            float f16 = oVar4.f16323e;
            float f17 = f16 / max;
            float f18 = f16 / oVar4.f16324f;
            float f19 = (fArr[2] / f12) / f16;
            float f20 = (fArr[5] / f13) / f16;
            float f21 = oVar4.f16326i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            g gVar = this.f16333e;
            o oVar5 = this.L;
            if (!oVar5.f16327j && !o.c(oVar5) && this.L.f16325g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            o oVar6 = this.L;
            gVar.e(z10, f19, f20, f21, (int) oVar6.h, f17, f18, oVar6.f16324f / max, f15, f14, cropCenterX, cropCenterY, oVar6.f16327j);
        }
    }

    public final void r(boolean z10) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.f16332c;
        matrix.reset();
        o oVar = this.L;
        float f7 = oVar.f16325g;
        if (f7 != 90.0f && f7 != 270.0f) {
            matrix.postTranslate((-oVar.f16320a) / 2.0f, (-oVar.f16321b) / 2.0f);
        } else {
            matrix.postTranslate((-oVar.f16321b) / 2.0f, (-oVar.f16320a) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.f16328k);
        CropAreaView cropAreaView = this.f16330a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f16339x || this.J || z10) {
            q();
            this.M.s();
        }
        invalidate();
    }

    public void setAspectRatio(float f7) {
        this.f16330a.setActualRect(f7);
    }

    public void setBottomPadding(float f7) {
        this.f16340y = f7;
        this.f16330a.setBottomPadding(f7);
    }

    public void setFreeform(boolean z10) {
        this.f16330a.setFreeform(z10);
        this.f16339x = z10;
    }

    public void setListener(p pVar) {
        this.M = pVar;
    }

    @Override
    public void setRotation(float f7) {
        o oVar = this.L;
        o.e(oVar, f7 - oVar.f16326i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f16330a.setSubtitle(str);
    }

    public void setTopPadding(float f7) {
        this.E = f7;
        this.f16330a.setTopPadding(f7);
    }
}
