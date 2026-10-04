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
public final class l0 extends View {
    public final Paint f5474a;
    public final Path f5475b;
    public final RectF f5476c;
    public final m0 d;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.f5474a = new Paint(1);
        this.f5475b = new Path();
        this.f5476c = new RectF();
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
        return ((getHeight() - f10) - g0Var.f15584y) - AndroidUtilities.dp(32.0f);
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
        qg.x1 x1Var;
        float f11;
        float f12;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.f5553x;
        b7 b7Var = m0Var.f5544a;
        if (m0Var.f5545b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f5474a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.f5551s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.f5551s < 1.0f) {
            Path path = this.f5475b;
            path.rewind();
            RectF rectF = this.f5476c;
            rectF.set(0.0f, 0.0f, b7Var.getWidth(), b7Var.getHeight());
            int[] iArr2 = m0Var.f5552w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, m0Var.f5551s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, m0Var.f5551s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f13 = m0Var.f5551s;
        float f14 = 1.0f - f13;
        int[] iArr3 = m0Var.v;
        canvas.translate((-iArr3[0]) * f14, (-iArr3[1]) * f14);
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (m0Var.E) {
                m0Var.f5545b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f14, iArr[1] * f14);
            MediaController.CropState cropState2 = m0Var.f5545b.G0;
            if (cropState2 != null) {
                f12 = cropState2.cropPw;
                f11 = cropState2.cropPh;
            } else {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (m0Var.f5545b.getScaleX() * (x1Var.getWidth() / f12)) / b7Var.getWidth(), f14);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(m0Var.f5545b.getRotation() * f14);
            canvas.translate(((m0Var.f5545b.getContentWidth() * f12) / 2.0f) * f14, ((m0Var.f5545b.getContentHeight() * f11) / 2.0f) * f14);
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
            float contentWidth = m0Var.f5545b.getContentWidth();
            float contentHeight = m0Var.f5545b.getContentHeight();
            MediaController.CropState cropState3 = m0Var.f5545b.G0;
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
        currentWidth = m0Var.getCurrentWidth();
        lg.g gVar = m0Var.f5554y;
        currentHeight = m0Var.getCurrentHeight();
        int i12 = gVar.f15535i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f15538l, 1.0f, f14, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f15532e * 1.0f);
        float f18 = (gVar.f15533f / z12) * containerWidth;
        qg.x1 x1Var2 = m0Var.f5545b;
        if (x1Var2 != null && (cropState = x1Var2.G0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f18, f13);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f18, f13);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(gVar.f15530b * f16 * 1.0f, gVar.f15531c * f17 * 1.0f);
        float d = m0Var.d.d(i12, false) + m0Var.f5545b.getOrientation() + gVar.f15534g;
        MediaController.CropState cropState4 = m0Var.f5545b.G0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, m0Var.f5551s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, m0Var.f5551s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(m0Var.f5545b.getOrientation());
        org.telegram.ui.Components.e6 e6Var = m0Var.f5546c;
        if (m0Var.E) {
            MediaController.CropState cropState5 = m0Var.f5545b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            lg.n nVar = g0Var.L;
            if (nVar != null) {
                z10 = nVar.f15571j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, e6Var.e(z10)), 1.0f);
        canvas.translate((-m0Var.f5545b.getContentWidth()) / 2.0f, (-m0Var.f5545b.getContentHeight()) / 2.0f);
        qg.x1 x1Var3 = m0Var.f5545b;
        Paint paint2 = x1Var3.F0;
        Bitmap bitmap = x1Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
