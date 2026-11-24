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
public final class q17 extends gb2 {
    public final wl0 Ld;
    public final float[] Md;
    public final Path Nd;
    public final Paint Od;
    public final Rect Pd;
    public final RectF Qd;
    public final r17 Rd;

    public q17(r17 r17Var, Context context, int i, t17 t17Var) {
        super(context, i, false, null, t17Var);
        this.Rd = r17Var;
        this.Ld = new wl0(r17Var.d, this, 10, false);
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
        n00 n00Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        r17 r17Var = this.Rd;
        ot7 ot7Var = r17Var.h;
        if (r17Var.f && photoImage != null && (((n00Var = r17Var.e) != null && n00Var.g && n00Var.d && ot7Var.z0) || ot7Var.w0 || (ot7Var.y0 != null && ot7Var.O0.y0))) {
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
            RectF rectF = gl.P;
            rectF.set(photoImage.L0, photoImage.M0, photoImage.w(), photoImage.x());
            Path path = this.Nd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = ot7Var.y0;
            if (textureView != null && ot7Var.O0.y0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / ot7Var.A0, photoImage.O0 / ot7Var.B0);
                    canvas.translate(photoImage.r() - ((ot7Var.A0 * max) / 2.0f), photoImage.s() - ((ot7Var.B0 * max) / 2.0f));
                    canvas.scale((ot7Var.A0 / ot7Var.y0.getWidth()) * max, (ot7Var.B0 / ot7Var.y0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Pd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Qd;
                    rectF2.set(0.0f, 0.0f, ot7Var.y0.getWidth(), ot7Var.y0.getHeight());
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
        r17 r17Var = this.Rd;
        n00 n00Var = r17Var.e;
        if ((n00Var != null && n00Var.g && n00Var.d) || r17Var.h.w0) {
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
