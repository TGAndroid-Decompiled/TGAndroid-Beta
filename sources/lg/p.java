package lg;

import ai.z;
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
import ci.id;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.i71;
public class p extends FrameLayout implements a {
    public float E;
    public boolean F;
    public final c G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public int K;
    public n L;
    public o M;
    public final RectF N;
    public final RectF O;
    public final CropAreaView f14292a;
    public final ImageView f14293b;
    public final Matrix f14294c;
    public i71 d;
    public g e;
    public final RectF f14295f;
    public final RectF h;
    public float f14296n;
    public final boolean f14297r;
    public final ka.c f14298s;
    public final Matrix v;
    public Bitmap f14299w;
    public boolean f14300x;
    public float f14301y;

    public p(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.f14297r = z10;
        this.f14295f = new RectF();
        this.h = new RectF();
        this.f14294c = new Matrix();
        ka.c cVar = new ka.c(1, false);
        cVar.f13566b = new float[8];
        this.f14298s = cVar;
        this.v = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.f14293b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar2 = new c(context);
        this.G = cVar2;
        cVar2.f14235b = this;
        ?? viewGroup = new ViewGroup(context);
        viewGroup.d = new RectF();
        viewGroup.e = new RectF();
        viewGroup.f22232f = new RectF();
        viewGroup.h = new RectF();
        viewGroup.f22240n = new RectF();
        viewGroup.f22245r = new RectF();
        viewGroup.f22247s = new RectF();
        viewGroup.v = new RectF();
        viewGroup.f22251x = new RectF();
        viewGroup.f22252y = new RectF();
        viewGroup.K = -1.0f;
        viewGroup.L = 1.0f;
        viewGroup.M = -1.0f;
        viewGroup.U = new AccelerateDecelerateInterpolator();
        viewGroup.f22233f0 = true;
        viewGroup.f22239l0 = new RectF();
        viewGroup.f22241n0 = 0.0f;
        viewGroup.f22242o0 = 1.0f;
        viewGroup.f22243p0 = 0.0f;
        viewGroup.f22244q0 = 0.0f;
        viewGroup.f22225a0 = z10;
        viewGroup.J = true;
        viewGroup.I = true;
        viewGroup.V = AndroidUtilities.dp(16.0f);
        viewGroup.W = AndroidUtilities.dp(32.0f);
        viewGroup.f22249t0 = 1;
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
        viewGroup.f22235h0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        viewGroup.T = paint7;
        paint7.setColor(-1);
        viewGroup.setWillNotDraw(false);
        this.f14292a = viewGroup;
        viewGroup.setListener(this);
        addView(viewGroup);
    }

    public static void a(p pVar, Integer[][] numArr, int i10) {
        float f7;
        float f10;
        pVar.I = false;
        if (i10 != 0) {
            if (i10 != 1) {
                Integer[] numArr2 = numArr[i10 - 2];
                if (pVar.f14292a.getAspectRatio() > 1.0f) {
                    pVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
                    return;
                } else {
                    pVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
                    return;
                }
            }
            pVar.setLockedAspectRatio(1.0f);
            return;
        }
        n nVar = pVar.L;
        int i11 = ((nVar.f14287g % 180.0f) > 0.0f ? 1 : ((nVar.f14287g % 180.0f) == 0.0f ? 0 : -1));
        if (i11 != 0) {
            f7 = nVar.f14284b;
        } else {
            f7 = nVar.f14283a;
        }
        if (i11 != 0) {
            f10 = nVar.f14283a;
        } else {
            f10 = nVar.f14284b;
        }
        pVar.setLockedAspectRatio(f7 / f10);
    }

    public static void c(java.lang.String r19, android.graphics.Canvas r20, android.graphics.Bitmap r21, android.graphics.Matrix r22, int r23, int r24, float r25, float r26, float r27, float r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: lg.p.c(java.lang.String, android.graphics.Canvas, android.graphics.Bitmap, android.graphics.Matrix, int, int, float, float, float, float, java.util.ArrayList):void");
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
        } catch (Exception e) {
            FileLog.e(e);
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
        CropAreaView cropAreaView = this.f14292a;
        cropAreaView.setLockedAspectRatio(f7);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f7);
        d(rectF);
        o oVar = this.M;
        if (oVar != null) {
            oVar.d0(false);
            this.M.L(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        RectF rectF;
        float f7;
        int i10;
        int i11;
        float f10;
        CropAreaView cropAreaView = this.f14292a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(rectF, this.O));
        int ceil2 = (int) Math.ceil(f7 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.f14290k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        n nVar = this.L;
        float f11 = nVar.f14286f * cropWidth;
        cropState.transformRotation = (int) nVar.h;
        if (BuildVars.LOGS_ENABLED) {
            l0.m(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            }
            cropState.transformRotation = i10 + 360;
        }
        if (i10 != 90 && i10 != 270) {
            n nVar2 = this.L;
            i11 = (int) nVar2.f14283a;
            f10 = nVar2.f14284b;
        } else {
            n nVar3 = this.L;
            i11 = (int) nVar3.f14284b;
            f10 = nVar3.f14283a;
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
        cropState.cropScale = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.L.e;
        float f15 = fArr[2] / f12;
        n nVar4 = this.L;
        float f16 = nVar4.e;
        cropState.cropPx = f15 / f16;
        cropState.cropPy = (fArr[5] / f13) / f16;
        cropState.cropRotate = nVar4.f14288i;
        cropState.stateScale = f16;
        cropState.mirrored = nVar4.f14289j;
        cropState.scale = cropWidth;
        cropState.matrix = nVar4.f14290k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.f14300x;
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
        CropAreaView cropAreaView = this.f14292a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f7 = this.L.e;
        if (f7 * max > 30.0f) {
            max = 30.0f / f7;
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = max;
        if (!this.f14297r) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float centerX = rectF.centerX();
        ImageView imageView = this.f14293b;
        float a2 = n.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = n.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.f14301y) + i10) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f10, fArr, a2, b10, 0));
        ofFloat.addListener(new ai.n(17, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.U;
        AnimatorSet animatorSet = cropAreaView.f22238k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f22238k0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.f22238k0 = animatorSet2;
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
        animatorSet2.addListener(new z(9, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f7;
        long j3;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f14292a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float a2 = n.a(this.L);
            float b10 = n.b(this.L);
            float f10 = this.L.f14288i;
            float radians = (float) Math.toRadians(f10);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f10, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
            float f11 = (cropWidth - a2) / 2.0f;
            n nVar = this.L;
            float f12 = nVar.e;
            ka.c cVar = this.f14298s;
            float[] fArr = (float[]) cVar.f13566b;
            float[] fArr2 = (float[]) cVar.f13566b;
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
            matrix2.set(nVar.f14290k);
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
            n nVar2 = this.L;
            PointF pointF = new PointF(nVar2.f14285c, nVar2.d);
            if (!rectF2.contains(rectF)) {
                if (z10 && (rectF.width() > rectF2.width() || rectF.height() > rectF2.height())) {
                    f7 = f(rectF2, f12, rectF.width() / n(rectF, rectF2));
                } else {
                    f7 = f12;
                }
                g(rectF2, rectF, pointF, radians);
            } else if (z11 && this.f14296n > 0.0f) {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.L.e * width < this.f14296n) {
                    width = 1.0f;
                }
                f7 = f(rectF2, f12, width);
                g(rectF2, rectF, pointF, radians);
            } else {
                f7 = f12;
            }
            float f17 = pointF.x;
            n nVar3 = this.L;
            float f18 = f17 - nVar3.f14285c;
            float f19 = pointF.y - nVar3.d;
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
            n.f(nVar3, f18, f19);
            n.g(this.L, f7 / f12, 0.0f, 0.0f);
            r(false);
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.f14292a;
        RectF rectF = this.N;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.f14292a.getCropHeight();
    }

    public float getCropLeft() {
        return this.f14292a.getCropLeft();
    }

    public float getCropTop() {
        return this.f14292a.getCropTop();
    }

    public float getCropWidth() {
        return this.f14292a.getCropWidth();
    }

    public int getCurrentHeight() {
        i71 i71Var = this.d;
        if (i71Var != null) {
            return i71Var.getVideoHeight();
        }
        Bitmap bitmap = this.f14299w;
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
        i71 i71Var = this.d;
        if (i71Var != null) {
            return i71Var.getVideoWidth();
        }
        Bitmap bitmap = this.f14299w;
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
        n nVar = this.L;
        if (nVar == null) {
            return 0.0f;
        }
        return nVar.f14287g + nVar.h;
    }

    public boolean getStateMirror() {
        n nVar = this.L;
        if (nVar != null && nVar.f14289j) {
            return true;
        }
        return false;
    }

    public float getStateOrientation() {
        n nVar = this.L;
        if (nVar == null) {
            return 0.0f;
        }
        return nVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        n nVar = this.L;
        if (nVar == null) {
            return;
        }
        final float f7 = nVar.f14286f;
        CropAreaView cropAreaView = this.f14292a;
        AnimatorSet animatorSet = cropAreaView.f22238k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f22238k0 = null;
        }
        n nVar2 = this.L;
        if ((nVar2.h + nVar2.f14287g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f10 = currentWidth / currentHeight;
        float f11 = 1.0f;
        if (!this.f14300x) {
            f10 = 1.0f;
        }
        cropAreaView.a(this.h, f10);
        if (this.f14300x) {
            f11 = 0.0f;
        }
        cropAreaView.setLockedAspectRatio(f11);
        this.f14296n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.f22251x);
        n nVar3 = this.L;
        final float f12 = nVar3.f14285c;
        final float f13 = nVar3.d;
        final float f14 = nVar3.e;
        final float f15 = nVar3.f14288i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p pVar = p.this;
                if (pVar.L == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = pVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                pVar.f14292a.setActualRect(rectF5);
                n nVar4 = pVar.L;
                float f16 = 1.0f - floatValue;
                float f17 = nVar4.f14285c - (f12 * f16);
                float f18 = nVar4.d - (f13 * f16);
                float f19 = nVar4.f14288i - (f15 * f16);
                float lerp = AndroidUtilities.lerp(f14, f7, floatValue);
                n nVar5 = pVar.L;
                n.f(nVar5, -f17, -f18);
                n.g(pVar.L, lerp / nVar5.e, 0.0f, 0.0f);
                n.e(pVar.L, -f19);
                pVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        n nVar = this.L;
        boolean z10 = false;
        if (nVar == null) {
            return false;
        }
        nVar.f14289j = !nVar.f14289j;
        r(false);
        o oVar = this.M;
        if (oVar != null) {
            n nVar2 = this.L;
            float f7 = nVar2.h;
            float f10 = nVar2.f14287g;
            float f11 = ((f7 + f10) - f10) % 360.0f;
            if (!n.c(nVar2) && f11 == 0.0f && this.f14292a.getLockAspectRatio() == 0.0f && !this.L.f14289j) {
                z10 = true;
            }
            oVar.d0(z10);
        }
        return this.L.f14289j;
    }

    public final void k() {
        this.f14292a.g(2, false);
        if (this.f14296n < 1.0E-5f) {
            this.f14296n = this.L.e;
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        float f7;
        CropAreaView cropAreaView = this.f14292a;
        AnimatorSet animatorSet = cropAreaView.f22238k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.f22238k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        n nVar = this.L;
        if (nVar != null && nVar.f14287g % 180.0f != 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.e(currentWidth, currentHeight, z11, this.f14300x);
        if (this.f14300x) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        cropAreaView.setLockedAspectRatio(f7);
        n nVar2 = this.L;
        if (nVar2 != null) {
            n.d(nVar2, 0.0f);
            this.L.f14289j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.f14296n = 0.0f;
        o oVar = this.M;
        if (oVar != null) {
            oVar.d0(true);
            this.M.L(false);
        }
    }

    public final boolean m(float f7) {
        boolean z10;
        boolean z11;
        if (this.L != null) {
            CropAreaView cropAreaView = this.f14292a;
            AnimatorSet animatorSet = cropAreaView.f22238k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.f22238k0 = null;
            }
            this.f14296n = 0.0f;
            n nVar = this.L;
            float f10 = nVar.h;
            float f11 = nVar.f14287g;
            float f12 = (((f10 + f11) - f11) + f7) % 360.0f;
            if (this.f14300x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = getCurrentWidth();
                int currentHeight = getCurrentHeight();
                if ((this.L.f14287g + f12) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, this.f14300x);
            }
            n.d(this.L, f12);
            r(false);
            e(true, false, false, false);
            o oVar = this.M;
            if (oVar != null) {
                if (f12 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.f14289j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                oVar.d0(z11);
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
            if (this.f14292a.getAspectRatio() > 1.0f) {
                strArr[i10] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i10] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(0, this, numArr));
        b2 b2Var = alertDialog$Builder.f18654a;
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
            CropAreaView cropAreaView = this.f14292a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.F) {
                    cropAreaView.g(3, true);
                    this.f14296n = 0.0f;
                    o oVar = this.M;
                    if (oVar != null) {
                        oVar.d0(false);
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
        this.f14300x = true;
        this.d = null;
        this.e = gVar;
        this.K = i10;
        this.f14299w = null;
        CropAreaView cropAreaView = this.f14292a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.L = new n(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new k(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        RectF rectF;
        float f7;
        int i10;
        float f10;
        float max;
        boolean z10;
        if (this.e != null && this.L != null) {
            CropAreaView cropAreaView = this.f14292a;
            cropAreaView.d(this.N);
            int ceil = (int) Math.ceil(n(rectF, this.O));
            int ceil2 = (int) Math.ceil(f7 / cropAreaView.getAspectRatio());
            float cropWidth = ceil / cropAreaView.getCropWidth();
            Matrix matrix = this.L.f14290k;
            float[] fArr = this.H;
            matrix.getValues(fArr);
            n nVar = this.L;
            float f11 = nVar.f14286f * cropWidth;
            int i11 = (int) nVar.h;
            while (i11 < 0) {
                i11 += 360;
            }
            if (i11 != 90 && i11 != 270) {
                n nVar2 = this.L;
                i10 = (int) nVar2.f14283a;
                f10 = nVar2.f14284b;
            } else {
                n nVar3 = this.L;
                i10 = (int) nVar3.f14284b;
                f10 = nVar3.f14283a;
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
            RectF rectF2 = cropAreaView.f22239l0;
            cropAreaView.a(rectF2, f12 / f13);
            if (this.f14300x) {
                max = rectF2.width() / f12;
            } else {
                max = Math.max(rectF2.width() / f12, rectF2.height() / f13);
            }
            n nVar4 = this.L;
            float f16 = nVar4.e;
            float f17 = f16 / max;
            float f18 = f16 / nVar4.f14286f;
            float f19 = (fArr[2] / f12) / f16;
            float f20 = (fArr[5] / f13) / f16;
            float f21 = nVar4.f14288i;
            RectF targetRectToFill = cropAreaView.getTargetRectToFill();
            float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
            float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
            g gVar = this.e;
            n nVar5 = this.L;
            if (!nVar5.f14289j && !n.c(nVar5) && this.L.f14287g < 1.0E-5f) {
                z10 = false;
            } else {
                z10 = true;
            }
            n nVar6 = this.L;
            gVar.e(z10, f19, f20, f21, (int) nVar6.h, f17, f18, nVar6.f14286f / max, f15, f14, cropCenterX, cropCenterY, nVar6.f14289j);
        }
    }

    public final void r(boolean z10) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.f14294c;
        matrix.reset();
        n nVar = this.L;
        float f7 = nVar.f14287g;
        if (f7 != 90.0f && f7 != 270.0f) {
            matrix.postTranslate((-nVar.f14283a) / 2.0f, (-nVar.f14284b) / 2.0f);
        } else {
            matrix.postTranslate((-nVar.f14284b) / 2.0f, (-nVar.f14283a) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.f14290k);
        CropAreaView cropAreaView = this.f14292a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.f14300x || this.J || z10) {
            q();
            this.M.z();
        }
        invalidate();
    }

    public void setAspectRatio(float f7) {
        this.f14292a.setActualRect(f7);
    }

    public void setBottomPadding(float f7) {
        this.f14301y = f7;
        this.f14292a.setBottomPadding(f7);
    }

    public void setFreeform(boolean z10) {
        this.f14292a.setFreeform(z10);
        this.f14300x = z10;
    }

    public void setListener(o oVar) {
        this.M = oVar;
    }

    @Override
    public void setRotation(float f7) {
        n nVar = this.L;
        n.e(nVar, f7 - nVar.f14288i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.f14292a.setSubtitle(str);
    }

    public void setTopPadding(float f7) {
        this.E = f7;
        this.f14292a.setTopPadding(f7);
    }
}
