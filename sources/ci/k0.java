package ci;

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
public final class k0 extends View {
    public final Paint f5301a;
    public final Path f5302b;
    public final RectF f5303c;
    public final l0 d;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.d = l0Var;
        this.f5301a = new Paint(1);
        this.f5302b = new Path();
        this.f5303c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i10;
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        float f7 = g0Var.E;
        if (!z10) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        return ((getHeight() - f10) - g0Var.f15582y) - AndroidUtilities.dp(32.0f);
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
        qg.y1 y1Var;
        float f11;
        float f12;
        l0 l0Var = this.d;
        g0 g0Var = l0Var.h;
        int[] iArr = l0Var.f5375x;
        b7 b7Var = l0Var.f5366a;
        if (l0Var.f5367b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f5301a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (l0Var.f5373s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (l0Var.f5373s < 1.0f) {
            Path path = this.f5302b;
            path.rewind();
            RectF rectF = this.f5303c;
            rectF.set(0.0f, 0.0f, b7Var.getWidth(), b7Var.getHeight());
            int[] iArr2 = l0Var.f5374w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, l0Var.f5373s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, l0Var.f5373s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f13 = l0Var.f5373s;
        float f14 = 1.0f - f13;
        int[] iArr3 = l0Var.v;
        canvas.translate((-iArr3[0]) * f14, (-iArr3[1]) * f14);
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (l0Var.E) {
                l0Var.f5367b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f14, iArr[1] * f14);
            MediaController.CropState cropState2 = l0Var.f5367b.G0;
            if (cropState2 != null) {
                f12 = cropState2.cropPw;
                f11 = cropState2.cropPh;
            } else {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (l0Var.f5367b.getScaleX() * (y1Var.getWidth() / f12)) / b7Var.getWidth(), f14);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(l0Var.f5367b.getRotation() * f14);
            canvas.translate(((l0Var.f5367b.getContentWidth() * f12) / 2.0f) * f14, ((l0Var.f5367b.getContentHeight() * f11) / 2.0f) * f14);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f15 = g0Var.E;
        if (!z11) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f13, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + f15 + i10) * f13);
        if (i11 > 0) {
            float contentWidth = l0Var.f5367b.getContentWidth();
            float contentHeight = l0Var.f5367b.getContentHeight();
            MediaController.CropState cropState3 = l0Var.f5367b.G0;
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
        currentWidth = l0Var.getCurrentWidth();
        lg.g gVar = l0Var.f5376y;
        currentHeight = l0Var.getCurrentHeight();
        int i12 = gVar.f15533i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float y3 = com.google.android.gms.internal.vision.e2.y(gVar.f15536l, 1.0f, f14, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f15530e * 1.0f);
        float f18 = (gVar.f15531f / y3) * containerWidth;
        qg.y1 y1Var2 = l0Var.f5367b;
        if (y1Var2 != null && (cropState = y1Var2.G0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f18, f13);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f18, f13);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(gVar.f15528b * f16 * 1.0f, gVar.f15529c * f17 * 1.0f);
        float d = l0Var.d.d(i12, false) + l0Var.f5367b.getOrientation() + gVar.f15532g;
        MediaController.CropState cropState4 = l0Var.f5367b.G0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, l0Var.f5373s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, l0Var.f5373s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(l0Var.f5367b.getOrientation());
        org.telegram.ui.Components.g6 g6Var = l0Var.f5368c;
        if (l0Var.E) {
            MediaController.CropState cropState5 = l0Var.f5367b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            lg.n nVar = g0Var.L;
            if (nVar != null) {
                z10 = nVar.f15569j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, g6Var.e(z10)), 1.0f);
        canvas.translate((-l0Var.f5367b.getContentWidth()) / 2.0f, (-l0Var.f5367b.getContentHeight()) / 2.0f);
        qg.y1 y1Var3 = l0Var.f5367b;
        Paint paint2 = y1Var3.F0;
        Bitmap bitmap = y1Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
