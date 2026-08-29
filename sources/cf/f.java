package cf;

import a4.w;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
public final class f extends Drawable {
    public final int f3057a;
    public final Object f3058b;
    public final Object f3059c;

    public f(boolean z10) {
        this.f3057a = 4;
        Paint paint = new Paint();
        this.f3058b = paint;
        Paint paint2 = new Paint();
        this.f3059c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public static String a(float f9) {
        Math.abs(f9 - 0.25f);
        float round = Math.round(f9 * 10.0f) / 10.0f;
        long j10 = round;
        if (round == ((float) j10)) {
            return w.m(j10, "");
        }
        return "" + round;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f3057a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f3058b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f3059c, (Paint) null);
                    return;
                }
                return;
            case 1:
                ImageReceiver imageReceiver = (ImageReceiver) this.f3058b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f3059c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - jr.f29804k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                return;
            case 2:
                ad adVar = (ad) this.f3059c;
                if (adVar.f26741c > 1) {
                    adVar.c(canvas, adVar.f26751o);
                    return;
                } else {
                    adVar.c(canvas, (Paint) this.f3058b);
                    return;
                }
            case 3:
                Paint paint = (Paint) this.f3058b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3059c;
                if (chatActivityEnterView.Q0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f26218x3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y8 = (chatActivityEnterView.Q0.getY() - chatActivityEnterView.getHeight()) + g6.f23149i3.getIntrinsicHeight();
                    jf jfVar = chatActivityEnterView.A0;
                    if (jfVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = jfVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y8 + offsetY, paint);
                    return;
                }
                return;
            case 4:
                Paint paint2 = (Paint) this.f3059c;
                canvas.drawRect(getBounds(), (Paint) this.f3058b);
                int dp = AndroidUtilities.dp(9.0f);
                int width2 = getBounds().width() / dp;
                int height = getBounds().height() / dp;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < width2) {
                    int i14 = i13 + 1;
                    float f9 = (dp * i14) + i10;
                    canvas.drawLine(f9, i11, f9, getBounds().height() + i11, paint2);
                    i13 = i14;
                }
                while (i12 < height) {
                    i12++;
                    float f10 = (dp * i12) + i11;
                    canvas.drawLine(i10, f10, getBounds().width() + i10, f10, paint2);
                }
                return;
            default:
                n6 n6Var = (n6) this.f3058b;
                Paint paint3 = (Paint) this.f3059c;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - n6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - n6Var.f30864e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((n6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + n6Var.f30864e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                n6Var.f30861a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                n6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - n6Var.f30864e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + n6Var.f30864e) / 2.0f));
                n6Var.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f3057a) {
            case 1:
                return (int) (((ImageReceiver) this.f3058b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f3057a) {
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
        switch (this.f3057a) {
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
        switch (this.f3057a) {
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

    public void l(float f9, boolean z10) {
        n6 n6Var = (n6) this.f3058b;
        String str = a(f9) + "X";
        if (z10 && TextUtils.equals(n6Var.f30866g, str)) {
            return;
        }
        n6Var.b();
        n6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f3057a) {
            case 1:
                ((ImageReceiver) this.f3058b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.ui.b.u(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.ui.b.u(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f3057a) {
            case 0:
                return;
            case 1:
                ((ImageReceiver) this.f3058b).setAlpha(i10 / 255.0f);
                return;
            case 2:
            case 3:
            case 4:
                return;
            default:
                ((n6) this.f3058b).f30880w = i10;
                Paint paint = (Paint) this.f3059c;
                if (paint != null) {
                    paint.setAlpha(i10);
                    return;
                }
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f3057a) {
            case 0:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f3058b;
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
                    ((Rect) this.f3059c).set(i16, i17, round + i16, round2 + i17);
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
        int i10 = this.f3057a;
    }

    public f() {
        this.f3057a = 5;
        hg.a aVar = new hg.a(this, 8);
        n6 n6Var = new n6(false, true, true, false);
        this.f3058b = n6Var;
        n6Var.setCallback(aVar);
        n6Var.k(0.3f, 165L, jr.h);
        n6Var.f30862b = 1;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = n6Var.f30861a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f3059c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public f(ad adVar, Paint paint) {
        this.f3057a = 2;
        this.f3059c = adVar;
        this.f3058b = paint;
    }

    public f(Bitmap bitmap) {
        this.f3057a = 0;
        this.f3059c = new Rect();
        this.f3058b = bitmap;
    }

    public f(ImageReceiver imageReceiver, Drawable drawable) {
        this.f3057a = 1;
        this.f3058b = imageReceiver;
        this.f3059c = drawable;
    }

    public f(ChatActivityEnterView chatActivityEnterView) {
        this.f3057a = 3;
        this.f3059c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f3058b = paint;
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
