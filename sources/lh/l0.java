package lh;

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

    public final Paint f16280a;

    public final Path f16281b;

    public final RectF f16282c;
    public final m0 d;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.f16280a = new Paint(1);
        this.f16281b = new Path();
        this.f16282c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        return ((getHeight() - (g0Var.A + (!z10 ? AndroidUtilities.statusBarHeight : 0))) - g0Var.f48636y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        MediaController.CropState cropState;
        float f10;
        float f11;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.f16374x;
        q6 q6Var = m0Var.f16365a;
        if (m0Var.f16366b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f16280a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.f16372s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.f16372s < 1.0f) {
            Path path = this.f16281b;
            path.rewind();
            float width = q6Var.getWidth();
            float height = q6Var.getHeight();
            RectF rectF = this.f16282c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = m0Var.f16373w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, m0Var.f16372s, rectF);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, m0Var.f16372s);
            path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f12 = m0Var.f16372s;
        float f13 = 1.0f - f12;
        int[] iArr3 = m0Var.v;
        canvas.translate((-iArr3[0]) * f13, (-iArr3[1]) * f13);
        if (f13 > 0.0f) {
            if (m0Var.A) {
                m0Var.f16366b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f13, iArr[1] * f13);
            zf.x1 x1Var = m0Var.f16366b;
            MediaController.CropState cropState2 = x1Var.C0;
            if (cropState2 != null) {
                f11 = cropState2.cropPw;
                f10 = cropState2.cropPh;
            } else {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            float fLerp2 = AndroidUtilities.lerp(1.0f, (m0Var.f16366b.getScaleX() * (x1Var.getWidth() / f11)) / q6Var.getWidth(), f13);
            canvas.scale(fLerp2, fLerp2);
            canvas.rotate(m0Var.f16366b.getRotation() * f13);
            canvas.translate(((m0Var.f16366b.getContentWidth() * f11) / 2.0f) * f13, ((m0Var.f16366b.getContentHeight() * f10) / 2.0f) * f13);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f12, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + g0Var.A + (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0)) * f12);
        if (f13 > 0.0f) {
            float contentWidth = m0Var.f16366b.getContentWidth();
            float contentHeight = m0Var.f16366b.getContentHeight();
            MediaController.CropState cropState3 = m0Var.f16366b.C0;
            float f14 = cropState3 != null ? cropState3.cropPw : 1.0f;
            float f15 = cropState3 != null ? cropState3.cropPh : 1.0f;
            float fLerp3 = (AndroidUtilities.lerp(1.0f, f14, f13) * contentWidth) / 2.0f;
            float fLerp4 = (AndroidUtilities.lerp(1.0f, f15, f13) * contentHeight) / 2.0f;
            float fLerp5 = AndroidUtilities.lerp(1.0f, 4.0f, f12);
            canvas.clipRect((-fLerp3) * fLerp5, (-fLerp4) * fLerp5, fLerp3 * fLerp5, fLerp4 * fLerp5);
        }
        int currentWidth = m0Var.getCurrentWidth();
        uf.f fVar = m0Var.f16375y;
        int currentHeight = m0Var.getCurrentHeight();
        int i10 = fVar.f48590i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float fZ = com.google.android.recaptcha.internal.a.z(fVar.f48593l, 1.0f, f13, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(fVar.d * 1.0f, fVar.f48587e * 1.0f);
        float f18 = (fVar.f48588f / fZ) * containerWidth;
        zf.x1 x1Var2 = m0Var.f16366b;
        float fLerp6 = (x1Var2 == null || (cropState = x1Var2.C0) == null) ? AndroidUtilities.lerp(1.0f, f18, f12) : AndroidUtilities.lerp(cropState.cropScale, f18, f12);
        canvas.scale(fLerp6, fLerp6);
        canvas.translate(fVar.f48585b * f16 * 1.0f, fVar.f48586c * f17 * 1.0f);
        float fD = m0Var.d.d(i10, false) + m0Var.f16366b.getOrientation() + fVar.f48589g;
        MediaController.CropState cropState4 = m0Var.f16366b.C0;
        canvas.rotate(cropState4 == null ? AndroidUtilities.lerp(0.0f, fD, m0Var.f16372s) : AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, fD, m0Var.f16372s));
        canvas.rotate(m0Var.f16366b.getOrientation());
        org.telegram.ui.Components.y5 y5Var = m0Var.f16367c;
        if (m0Var.A) {
            MediaController.CropState cropState5 = m0Var.f16366b.C0;
            if (cropState5 == null || !cropState5.mirrored) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            uf.l lVar = g0Var.H;
            if (lVar == null) {
                z10 = false;
            } else {
                z10 = lVar.f48623j;
            }
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, y5Var.e(z10)), 1.0f);
        canvas.translate((-m0Var.f16366b.getContentWidth()) / 2.0f, (-m0Var.f16366b.getContentHeight()) / 2.0f);
        zf.x1 x1Var3 = m0Var.f16366b;
        Paint paint2 = x1Var3.B0;
        Bitmap bitmap = x1Var3.f50772w0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
