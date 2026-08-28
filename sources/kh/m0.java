package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;
public final class m0 extends View {
    public final Paint f15659a;
    public final Path f15660b;
    public final RectF f15661c;
    public final n0 d;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.d = n0Var;
        this.f15659a = new Paint(1);
        this.f15660b = new Path();
        this.f15661c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i9;
        boolean z10 = getContext() instanceof BubbleActivity;
        h0 h0Var = this.d.h;
        float f10 = h0Var.A;
        if (!z10) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float f11 = f10 + i9;
        return ((getHeight() - f11) - h0Var.f47914y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int currentWidth;
        int currentHeight;
        float lerp;
        float lerp2;
        boolean z10;
        MediaController.CropState cropState;
        float f10;
        float f11;
        yf.x1 x1Var;
        float f12;
        float f13;
        n0 n0Var = this.d;
        h0 h0Var = n0Var.h;
        int[] iArr = n0Var.f15729x;
        r6 r6Var = n0Var.f15720a;
        if (n0Var.f15721b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f15659a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.f15727s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.f15727s < 1.0f) {
            Path path = this.f15660b;
            path.rewind();
            RectF rectF = this.f15661c;
            rectF.set(0.0f, 0.0f, r6Var.getWidth(), r6Var.getHeight());
            int[] iArr2 = n0Var.f15728w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, n0Var.f15727s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, n0Var.f15727s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = n0Var.f15727s;
        float f15 = 1.0f - f14;
        int[] iArr3 = n0Var.v;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (n0Var.A) {
                n0Var.f15721b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            MediaController.CropState cropState2 = n0Var.f15721b.C0;
            if (cropState2 != null) {
                f13 = cropState2.cropPw;
                f12 = cropState2.cropPh;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (n0Var.f15721b.getScaleX() * (x1Var.getWidth() / f13)) / r6Var.getWidth(), f15);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(n0Var.f15721b.getRotation() * f15);
            canvas.translate(((n0Var.f15721b.getContentWidth() * f13) / 2.0f) * f15, ((n0Var.f15721b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = h0Var.A;
        if (!z11) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f14, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + f16 + i9) * f14);
        if (i10 > 0) {
            float contentWidth = n0Var.f15721b.getContentWidth();
            float contentHeight = n0Var.f15721b.getContentHeight();
            MediaController.CropState cropState3 = n0Var.f15721b.C0;
            if (cropState3 != null) {
                f10 = cropState3.cropPw;
            } else {
                f10 = 1.0f;
            }
            if (cropState3 != null) {
                f11 = cropState3.cropPh;
            } else {
                f11 = 1.0f;
            }
            float lerp5 = (AndroidUtilities.lerp(1.0f, f10, f15) * contentWidth) / 2.0f;
            float lerp6 = (AndroidUtilities.lerp(1.0f, f11, f15) * contentHeight) / 2.0f;
            float lerp7 = AndroidUtilities.lerp(1.0f, 4.0f, f14);
            canvas.clipRect((-lerp5) * lerp7, (-lerp6) * lerp7, lerp5 * lerp7, lerp6 * lerp7);
        }
        currentWidth = n0Var.getCurrentWidth();
        tf.f fVar = n0Var.f15730y;
        currentHeight = n0Var.getCurrentHeight();
        int i11 = fVar.f47868i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = e2.c.z(fVar.f47871l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(fVar.d * 1.0f, fVar.f47865e * 1.0f);
        float f19 = (fVar.f47866f / z12) * containerWidth;
        yf.x1 x1Var2 = n0Var.f15721b;
        if (x1Var2 != null && (cropState = x1Var2.C0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f19, f14);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f19, f14);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(fVar.f47863b * f17 * 1.0f, fVar.f47864c * f18 * 1.0f);
        float d = n0Var.d.d(i11, false) + n0Var.f15721b.getOrientation() + fVar.f47867g;
        MediaController.CropState cropState4 = n0Var.f15721b.C0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, n0Var.f15727s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, n0Var.f15727s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(n0Var.f15721b.getOrientation());
        org.telegram.ui.Components.y5 y5Var = n0Var.f15722c;
        if (n0Var.A) {
            MediaController.CropState cropState5 = n0Var.f15721b.C0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            tf.l lVar = h0Var.H;
            if (lVar != null) {
                z10 = lVar.f47901j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, y5Var.e(z10)), 1.0f);
        canvas.translate((-n0Var.f15721b.getContentWidth()) / 2.0f, (-n0Var.f15721b.getContentHeight()) / 2.0f);
        yf.x1 x1Var3 = n0Var.f15721b;
        Paint paint2 = x1Var3.B0;
        Bitmap bitmap = x1Var3.f50177w0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
