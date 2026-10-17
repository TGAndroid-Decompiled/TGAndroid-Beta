package ei;

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
    public final Paint f9357a;
    public final Path f9358b;
    public final RectF f9359c;
    public final m0 d;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.f9357a = new Paint(1);
        this.f9358b = new Path();
        this.f9359c = new RectF();
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
        return ((getHeight() - f10) - g0Var.f16920y) - AndroidUtilities.dp(32.0f);
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
        rg.x1 x1Var;
        float f11;
        float f12;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.f9436x;
        r6 r6Var = m0Var.f9428a;
        if (m0Var.f9429b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f9357a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.f9434s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.f9434s < 1.0f) {
            Path path = this.f9358b;
            path.rewind();
            RectF rectF = this.f9359c;
            rectF.set(0.0f, 0.0f, r6Var.getWidth(), r6Var.getHeight());
            int[] iArr2 = m0Var.f9435w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, m0Var.f9434s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, m0Var.f9434s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f13 = m0Var.f9434s;
        float f14 = 1.0f - f13;
        int[] iArr3 = m0Var.v;
        canvas.translate((-iArr3[0]) * f14, (-iArr3[1]) * f14);
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (m0Var.E) {
                m0Var.f9429b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f14, iArr[1] * f14);
            MediaController.CropState cropState2 = m0Var.f9429b.G0;
            if (cropState2 != null) {
                f12 = cropState2.cropPw;
                f11 = cropState2.cropPh;
            } else {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (m0Var.f9429b.getScaleX() * (x1Var.getWidth() / f12)) / r6Var.getWidth(), f14);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(m0Var.f9429b.getRotation() * f14);
            canvas.translate(((m0Var.f9429b.getContentWidth() * f12) / 2.0f) * f14, ((m0Var.f9429b.getContentHeight() * f11) / 2.0f) * f14);
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
            float contentWidth = m0Var.f9429b.getContentWidth();
            float contentHeight = m0Var.f9429b.getContentHeight();
            MediaController.CropState cropState3 = m0Var.f9429b.G0;
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
        mg.g gVar = m0Var.f9437y;
        currentHeight = m0Var.getCurrentHeight();
        int i12 = gVar.f16876i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float x10 = com.google.android.gms.internal.cast.a6.x(gVar.f16879l, 1.0f, f14, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f18 = (gVar.f16874f / x10) * containerWidth;
        rg.x1 x1Var2 = m0Var.f9429b;
        if (x1Var2 != null && (cropState = x1Var2.G0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f18, f13);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f18, f13);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(gVar.f16872b * f16 * 1.0f, gVar.f16873c * f17 * 1.0f);
        float d = m0Var.d.d(i12, false) + m0Var.f9429b.getOrientation() + gVar.f16875g;
        MediaController.CropState cropState4 = m0Var.f9429b.G0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, m0Var.f9434s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, m0Var.f9434s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(m0Var.f9429b.getOrientation());
        org.telegram.ui.Components.f6 f6Var = m0Var.f9430c;
        if (m0Var.E) {
            MediaController.CropState cropState5 = m0Var.f9429b.G0;
            if (cropState5 != null && cropState5.mirrored) {
                z10 = true;
            }
            z10 = false;
        } else {
            mg.n nVar = g0Var.L;
            if (nVar != null) {
                z10 = nVar.f16908j;
            }
            z10 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, f6Var.e(z10)), 1.0f);
        canvas.translate((-m0Var.f9429b.getContentWidth()) / 2.0f, (-m0Var.f9429b.getContentHeight()) / 2.0f);
        rg.x1 x1Var3 = m0Var.f9429b;
        Paint paint2 = x1Var3.F0;
        Bitmap bitmap = x1Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
