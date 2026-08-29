package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TextureView;
import nh.e6;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ka;
public final class x1 extends org.telegram.ui.Cells.s1 {
    public final ka Be;
    public final float[] Ce;
    public final Path De;
    public final Paint Ee;
    public final Rect Fe;
    public final RectF Ge;
    public final y1 He;

    public x1(y1 y1Var, Context context, int i10, c2 c2Var) {
        super(context, i10, false, null, c2Var);
        this.He = y1Var;
        this.Be = new ka(y1Var.d, this, 10, false);
        this.Ce = new float[8];
        this.De = new Path();
        Paint paint = new Paint();
        this.Ee = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Fe = new Rect();
        this.Ge = new RectF();
    }

    @Override
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.He.h.f2152r0 = true;
            Paint c3 = this.Be.c(1.0f);
            if (c3 != null) {
                return c3;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        e6 e6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        y1 y1Var = this.He;
        f5 f5Var = y1Var.h;
        if (y1Var.f2616f && photoImage != null && (((e6Var = y1Var.f2615e) != null && e6Var.f17598g && e6Var.d && f5Var.f2154t0) || f5Var.f2151q0 || (f5Var.f2153s0 != null && f5Var.I0.E0))) {
            int i10 = 0;
            while (true) {
                int length = photoImage.getRoundRadius().length;
                fArr = this.Ce;
                if (i10 >= length) {
                    break;
                }
                int i11 = i10 * 2;
                fArr[i11] = photoImage.getRoundRadius()[i10];
                fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                i10++;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
            Path path = this.De;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = f5Var.f2153s0;
            if (textureView != null && f5Var.I0.E0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / f5Var.f2155u0, photoImage.getImageHeight() / f5Var.f2156v0);
                    canvas.translate(photoImage.getCenterX() - ((f5Var.f2155u0 * max) / 2.0f), photoImage.getCenterY() - ((f5Var.f2156v0 * max) / 2.0f));
                    canvas.scale((f5Var.f2155u0 / f5Var.f2153s0.getWidth()) * max, (f5Var.f2156v0 / f5Var.f2153s0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Fe;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ge;
                    rectF2.set(0.0f, 0.0f, f5Var.f2153s0.getWidth(), f5Var.f2153s0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.a2(canvas);
            }
            canvas.drawPath(path, this.Ee);
            return true;
        }
        return super.a2(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        y1 y1Var = this.He;
        e6 e6Var = y1Var.f2615e;
        if ((e6Var != null && e6Var.f17598g && e6Var.d) || y1Var.h.f2151q0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
