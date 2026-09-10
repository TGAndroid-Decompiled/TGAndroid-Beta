package bi;

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
public final class p0 extends View {
    public final Paint f3354a;
    public final Path f3355b;
    public final RectF f3356c;
    public final q0 d;

    public p0(q0 q0Var, Context context) {
        super(context);
        this.d = q0Var;
        this.f3354a = new Paint(1);
        this.f3355b = new Path();
        this.f3356c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i10;
        boolean z10 = getContext() instanceof BubbleActivity;
        l0 l0Var = this.d.h;
        float f7 = l0Var.E;
        if (!z10) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        return ((getHeight() - f10) - l0Var.f12504y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int currentWidth;
        int currentHeight;
        float lerp;
        float lerp2;
        boolean z10;
        MediaController.CropState cropState;
        float f7;
        float f10;
        pg.x1 x1Var;
        float f11;
        float f12;
        q0 q0Var = this.d;
        l0 l0Var = q0Var.h;
        int[] iArr = q0Var.f3437x;
        e8 e8Var = q0Var.f3429a;
        if (q0Var.f3430b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f3354a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (q0Var.f3435s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (q0Var.f3435s < 1.0f) {
            Path path = this.f3355b;
            path.rewind();
            RectF rectF = this.f3356c;
            rectF.set(0.0f, 0.0f, e8Var.getWidth(), e8Var.getHeight());
            int[] iArr2 = q0Var.f3436w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, q0Var.f3435s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, q0Var.f3435s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f13 = q0Var.f3435s;
        float f14 = 1.0f - f13;
        int[] iArr3 = q0Var.v;
        canvas.translate((-iArr3[0]) * f14, (-iArr3[1]) * f14);
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (q0Var.E) {
                q0Var.f3430b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f14, iArr[1] * f14);
            MediaController.CropState cropState2 = q0Var.f3430b.G0;
            if (cropState2 != null) {
                f12 = cropState2.cropPw;
                f11 = cropState2.cropPh;
            } else {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (q0Var.f3430b.getScaleX() * (x1Var.getWidth() / f12)) / e8Var.getWidth(), f14);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(q0Var.f3430b.getRotation() * f14);
            canvas.translate(((q0Var.f3430b.getContentWidth() * f12) / 2.0f) * f14, ((q0Var.f3430b.getContentHeight() * f11) / 2.0f) * f14);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f15 = l0Var.E;
        if (!z11) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f13, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + f15 + i10) * f13);
        if (i11 > 0) {
            float contentWidth = q0Var.f3430b.getContentWidth();
            float contentHeight = q0Var.f3430b.getContentHeight();
            MediaController.CropState cropState3 = q0Var.f3430b.G0;
            if (cropState3 != null) {
                f7 = cropState3.cropPw;
            } else {
                f7 = 1.0f;
            }
            if (cropState3 != null) {
                f10 = cropState3.cropPh;
            } else {
                f10 = 1.0f;
            }
            float lerp5 = (AndroidUtilities.lerp(1.0f, f7, f14) * contentWidth) / 2.0f;
            float lerp6 = (AndroidUtilities.lerp(1.0f, f10, f14) * contentHeight) / 2.0f;
            float lerp7 = AndroidUtilities.lerp(1.0f, 4.0f, f13);
            canvas.clipRect((-lerp5) * lerp7, (-lerp6) * lerp7, lerp5 * lerp7, lerp6 * lerp7);
        }
        currentWidth = q0Var.getCurrentWidth();
        kg.g gVar = q0Var.f3438y;
        currentHeight = q0Var.getCurrentHeight();
        int i12 = gVar.f12460i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f12463l, 1.0f, f14, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f18 = (gVar.f12458f / z12) * containerWidth;
        pg.x1 x1Var2 = q0Var.f3430b;
        if (x1Var2 != null && (cropState = x1Var2.G0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f18, f13);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f18, f13);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(gVar.f12456b * f16 * 1.0f, gVar.f12457c * f17 * 1.0f);
        float d = q0Var.d.d(i12, false) + q0Var.f3430b.getOrientation() + gVar.f12459g;
        MediaController.CropState cropState4 = q0Var.f3430b.G0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, q0Var.f3435s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, q0Var.f3435s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(q0Var.f3430b.getOrientation());
        org.telegram.ui.Components.d6 d6Var = q0Var.f3431c;
        if (q0Var.E) {
            MediaController.CropState cropState5 = q0Var.f3430b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            kg.n nVar = l0Var.L;
            if (nVar != null) {
                z10 = nVar.f12492j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, d6Var.e(z10)), 1.0f);
        canvas.translate((-q0Var.f3430b.getContentWidth()) / 2.0f, (-q0Var.f3430b.getContentHeight()) / 2.0f);
        pg.x1 x1Var3 = q0Var.f3430b;
        Paint paint2 = x1Var3.F0;
        Bitmap bitmap = x1Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
