package jg;

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
import org.telegram.ui.Components.w9;
import vh.j4;
import vh.s3;
public final class e1 extends org.telegram.ui.Cells.q1 {
    public final w9 f9943hd;
    public final float[] f9944id;
    public final Path f9945jd;
    public final Paint f9946kd;
    public final Rect f9947ld;
    public final RectF f9948md;
    public final f1 f9949nd;

    public e1(f1 f1Var, Context context, int i10, i1 i1Var) {
        super(context, i10, false, null, i1Var);
        this.f9949nd = f1Var;
        this.f9943hd = new w9(f1Var.d, this, 10, false);
        this.f9944id = new float[8];
        this.f9945jd = new Path();
        Paint paint = new Paint();
        this.f9946kd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f9947ld = new Rect();
        this.f9948md = new RectF();
    }

    @Override
    public final Paint X1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.f9949nd.h.f10060v0 = true;
            Paint c10 = this.f9943hd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.X1(str);
    }

    @Override
    public final boolean j1(Canvas canvas) {
        j4 j4Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        f1 f1Var = this.f9949nd;
        s3 s3Var = f1Var.h;
        if (f1Var.f9964f && photoImage != null && (((j4Var = f1Var.e) != null && j4Var.f51318g && j4Var.d && s3Var.f10062x0) || s3Var.f10059u0 || (s3Var.f10061w0 != null && s3Var.M0.f50984r0))) {
            int i10 = 0;
            while (true) {
                int[] iArr = photoImage.W0;
                int length = iArr.length;
                fArr = this.f9944id;
                if (i10 >= length) {
                    break;
                }
                int i11 = i10 * 2;
                float f7 = iArr[i10];
                fArr[i11] = f7;
                fArr[i11 + 1] = f7;
                i10++;
            }
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(photoImage.K0, photoImage.L0, photoImage.y(), photoImage.A());
            Path path = this.f9945jd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = s3Var.f10061w0;
            if (textureView != null && s3Var.M0.f50984r0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.M0 / s3Var.f10063y0, photoImage.N0 / s3Var.f10064z0);
                    canvas.translate(photoImage.r() - ((s3Var.f10063y0 * max) / 2.0f), photoImage.s() - ((s3Var.f10064z0 * max) / 2.0f));
                    canvas.scale((s3Var.f10063y0 / s3Var.f10061w0.getWidth()) * max, (s3Var.f10064z0 / s3Var.f10061w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.f9947ld;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.f9948md;
                    rectF2.set(0.0f, 0.0f, s3Var.f10061w0.getWidth(), s3Var.f10061w0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.j1(canvas);
            }
            canvas.drawPath(path, this.f9946kd);
            return true;
        }
        return super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        f1 f1Var = this.f9949nd;
        j4 j4Var = f1Var.e;
        if ((j4Var != null && j4Var.f51318g && j4Var.d) || f1Var.h.f10059u0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        b1(canvas2);
        canvas2.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
