package ef;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xc;
public final class g extends Drawable {
    public final int f5208a;
    public final Object f5209b;
    public final Object f5210c;

    public g(boolean z4) {
        this.f5208a = 4;
        Paint paint = new Paint();
        this.f5209b = paint;
        Paint paint2 = new Paint();
        this.f5210c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z4) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float round = Math.round(f10 * 10.0f) / 10.0f;
        long j10 = round;
        if (round == ((float) j10)) {
            return android.support.v4.media.a.n(j10, "");
        }
        return "" + round;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f5208a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f5209b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f5210c, (Paint) null);
                    return;
                }
                return;
            case 1:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5209b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f5210c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - nr.f27350k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(x10, imageHeight, intrinsicWidth + x10, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                return;
            case 2:
                xc xcVar = (xc) this.f5210c;
                if (xcVar.f30650c > 1) {
                    xcVar.c(canvas, xcVar.f30659o);
                    return;
                } else {
                    xcVar.c(canvas, (Paint) this.f5209b);
                    return;
                }
            case 3:
                Paint paint = (Paint) this.f5209b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5210c;
                if (chatActivityEnterView.R0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f22868y3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.R0.getY() - chatActivityEnterView.getHeight()) + j6.f19993i3.getIntrinsicHeight();
                    ff ffVar = chatActivityEnterView.B0;
                    if (ffVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = ffVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y10 + offsetY, paint);
                    return;
                }
                return;
            case 4:
                Paint paint2 = (Paint) this.f5210c;
                canvas.drawRect(getBounds(), (Paint) this.f5209b);
                int dp = AndroidUtilities.dp(9.0f);
                int width2 = getBounds().width() / dp;
                int height = getBounds().height() / dp;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < width2) {
                    int i14 = i13 + 1;
                    float f10 = (dp * i14) + i10;
                    canvas.drawLine(f10, i11, f10, getBounds().height() + i11, paint2);
                    i13 = i14;
                }
                while (i12 < height) {
                    i12++;
                    float f11 = (dp * i12) + i11;
                    canvas.drawLine(i10, f11, getBounds().width() + i10, f11, paint2);
                }
                return;
            default:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f5209b;
                Paint paint3 = (Paint) this.f5210c;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - j6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - j6Var.e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((j6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + j6Var.e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                j6Var.f25883a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                j6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - j6Var.e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + j6Var.e) / 2.0f));
                j6Var.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f5208a) {
            case 1:
                return (int) (((ImageReceiver) this.f5209b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f5208a) {
            case 4:
                return 0;
            case 5:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f5208a) {
            case 4:
                return 0;
            case 5:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f5208a) {
            case 0:
                return -3;
            case 1:
                return 0;
            case 2:
                return -2;
            case 3:
                return -2;
            case 4:
                return 0;
            default:
                return -2;
        }
    }

    public void l(float f10, boolean z4) {
        org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f5209b;
        String str = a(f10) + "X";
        if (z4 && TextUtils.equals(j6Var.f25887g, str)) {
            return;
        }
        j6Var.b();
        j6Var.q(str, z4, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f5208a) {
            case 1:
                ((ImageReceiver) this.f5209b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.ui.b.t(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.ui.b.t(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f5208a) {
            case 0:
                return;
            case 1:
                ((ImageReceiver) this.f5209b).setAlpha(i10 / 255.0f);
                return;
            case 2:
            case 3:
            case 4:
                return;
            default:
                ((org.telegram.ui.Components.j6) this.f5209b).f25901w = i10;
                Paint paint = (Paint) this.f5210c;
                if (paint != null) {
                    paint.setAlpha(i10);
                    return;
                }
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f5208a) {
            case 0:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f5209b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i14 = i12 - i10;
                    int i15 = i13 - i11;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i14 / width, i15 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i16 = i10 + ((i14 - round) / 2);
                    int i17 = i11 + ((i15 - round2) / 2);
                    ((Rect) this.f5210c).set(i16, i17, round + i16, round2 + i17);
                    return;
                }
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f5208a;
    }

    public g() {
        this.f5208a = 5;
        i.f fVar = new i.f(this, 8);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f5209b = j6Var;
        j6Var.setCallback(fVar);
        j6Var.k(0.3f, 165L, nr.h);
        j6Var.f25884b = 1;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = j6Var.f25883a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f5210c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public g(xc xcVar, Paint paint) {
        this.f5208a = 2;
        this.f5210c = xcVar;
        this.f5209b = paint;
    }

    public g(Bitmap bitmap) {
        this.f5208a = 0;
        this.f5210c = new Rect();
        this.f5209b = bitmap;
    }

    public g(ImageReceiver imageReceiver, Drawable drawable) {
        this.f5208a = 1;
        this.f5209b = imageReceiver;
        this.f5210c = drawable;
    }

    public g(ChatActivityEnterView chatActivityEnterView) {
        this.f5208a = 3;
        this.f5210c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f5209b = paint;
        paint.setColor(0);
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    private final void j(ColorFilter colorFilter) {
    }

    private final void k(ColorFilter colorFilter) {
    }
}
