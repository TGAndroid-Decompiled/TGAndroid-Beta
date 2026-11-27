package defpackage;

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
import org.telegram.messenger.ImageReceiver;
public final class x37 extends wb2 {
    public final xl0 Ld;
    public final float[] Md;
    public final Path Nd;
    public final Paint Od;
    public final Rect Pd;
    public final RectF Qd;
    public final y37 Rd;

    public x37(y37 y37Var, Context context, int i, a47 a47Var) {
        super(context, i, false, null, a47Var);
        this.Rd = y37Var;
        this.Ld = new xl0(y37Var.d, this, 10, false);
        this.Md = new float[8];
        this.Nd = new Path();
        Paint paint = new Paint();
        this.Od = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Pd = new Rect();
        this.Qd = new RectF();
    }

    @Override
    public final Paint c2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Rd.h.x0 = true;
            Paint c = this.Ld.c(1.0f);
            if (c != null) {
                return c;
            }
        }
        return super.c2(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        o00 o00Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        y37 y37Var = this.Rd;
        vw7 vw7Var = y37Var.h;
        if (y37Var.f && photoImage != null && (((o00Var = y37Var.e) != null && o00Var.g && o00Var.d && vw7Var.z0) || vw7Var.w0 || (vw7Var.y0 != null && vw7Var.O0.s0))) {
            int i = 0;
            while (true) {
                int[] iArr = photoImage.X0;
                int length = iArr.length;
                fArr = this.Md;
                if (i >= length) {
                    break;
                }
                int i2 = i << 1;
                float f = iArr[i];
                fArr[i2] = f;
                fArr[i2 + 1] = f;
                i++;
            }
            RectF rectF = hl.P;
            rectF.set(photoImage.L0, photoImage.M0, photoImage.w(), photoImage.x());
            Path path = this.Nd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = vw7Var.y0;
            if (textureView != null && vw7Var.O0.s0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / vw7Var.A0, photoImage.O0 / vw7Var.B0);
                    canvas.translate(photoImage.r() - ((vw7Var.A0 * max) / 2.0f), photoImage.s() - ((vw7Var.B0 * max) / 2.0f));
                    canvas.scale((vw7Var.A0 / vw7Var.y0.getWidth()) * max, (vw7Var.B0 / vw7Var.y0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Pd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Qd;
                    rectF2.set(0.0f, 0.0f, vw7Var.y0.getWidth(), vw7Var.y0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.l1(canvas);
            }
            canvas.drawPath(path, this.Od);
            return true;
        }
        return super.l1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        y37 y37Var = this.Rd;
        o00 o00Var = y37Var.e;
        if ((o00Var != null && o00Var.g && o00Var.d) || y37Var.h.w0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        d1(canvas2);
        canvas2.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
