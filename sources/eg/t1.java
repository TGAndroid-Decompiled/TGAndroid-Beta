package eg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fa;
import qh.i5;
import qh.o4;
public final class t1 extends org.telegram.ui.Cells.t1 {
    public final fa Ce;
    public final float[] De;
    public final Path Ee;
    public final Paint Fe;
    public final Rect Ge;
    public final RectF He;
    public final u1 Ie;

    public t1(u1 u1Var, Context context, int i10, a9.a aVar) {
        super(context, i10, false, null, aVar);
        this.Ie = u1Var;
        this.Ce = new fa(u1Var.d, this, 10, false);
        this.De = new float[8];
        this.Ee = new Path();
        Paint paint = new Paint();
        this.Fe = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Ge = new Rect();
        this.He = new RectF();
    }

    @Override
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Ie.h.f5557s0 = true;
            Paint c3 = this.Ce.c(1.0f);
            if (c3 != null) {
                return c3;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        i5 i5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        u1 u1Var = this.Ie;
        o4 o4Var = u1Var.h;
        if (u1Var.f5505f && photoImage != null && (((i5Var = u1Var.f5504e) != null && i5Var.f45427g && i5Var.d && o4Var.f5559u0) || o4Var.f5556r0 || (o4Var.f5558t0 != null && o4Var.J0.F0))) {
            int i10 = 0;
            while (true) {
                int length = photoImage.getRoundRadius().length;
                fArr = this.De;
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
            Path path = this.Ee;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = o4Var.f5558t0;
            if (textureView != null && o4Var.J0.F0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / o4Var.f5560v0, photoImage.getImageHeight() / o4Var.f5561w0);
                    canvas.translate(photoImage.getCenterX() - ((o4Var.f5560v0 * max) / 2.0f), photoImage.getCenterY() - ((o4Var.f5561w0 * max) / 2.0f));
                    canvas.scale((o4Var.f5560v0 / o4Var.f5558t0.getWidth()) * max, (o4Var.f5561w0 / o4Var.f5558t0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Ge;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.He;
                    rectF2.set(0.0f, 0.0f, o4Var.f5558t0.getWidth(), o4Var.f5558t0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.a2(canvas);
            }
            canvas.drawPath(path, this.Fe);
            return true;
        }
        return super.a2(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        u1 u1Var = this.Ie;
        i5 i5Var = u1Var.f5504e;
        if ((i5Var != null && i5Var.f45427g && i5Var.d) || u1Var.h.f5556r0) {
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
