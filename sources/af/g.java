package af;

import a9.p;
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
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.tc;

public final class g extends Drawable {

    public final int f271a;

    public final Object f272b;

    public final Object f273c;

    public g(boolean z10) {
        this.f271a = 4;
        Paint paint = new Paint();
        this.f272b = paint;
        Paint paint2 = new Paint();
        this.f273c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
        } else {
            paint.setColor(-2172970);
            paint2.setColor(-3752002);
        }
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float fRound = Math.round(f10 * 10.0f) / 10.0f;
        long j10 = (long) fRound;
        if (fRound == j10) {
            return p.l(j10, "");
        }
        return "" + fRound;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f271a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f272b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f273c, (Paint) null);
                    break;
                }
                break;
            case 1:
                ImageReceiver imageReceiver = (ImageReceiver) this.f272b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f273c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int iA = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - er.f28126k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(iA, imageHeight, intrinsicWidth + iA, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                break;
            case 2:
                tc tcVar = (tc) this.f273c;
                if (tcVar.f32731c <= 1) {
                    tcVar.c(canvas, (Paint) this.f272b);
                } else {
                    tcVar.c(canvas, tcVar.f32741o);
                }
                break;
            case 3:
                Paint paint = (Paint) this.f272b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f273c;
                if (chatActivityEnterView.Q0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f26202x3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.Q0.getY() - chatActivityEnterView.getHeight()) + g6.f23141i3.getIntrinsicHeight();
                    bf bfVar = chatActivityEnterView.A0;
                    canvas.drawRect(0.0f, 0.0f, width, y10 + (bfVar == null ? 0.0f : bfVar.getOffsetY()), paint);
                    break;
                }
                break;
            case 4:
                Paint paint2 = (Paint) this.f273c;
                canvas.drawRect(getBounds(), (Paint) this.f272b);
                int iDp = AndroidUtilities.dp(9.0f);
                int iWidth = getBounds().width() / iDp;
                int iHeight = getBounds().height() / iDp;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < iWidth) {
                    int i14 = i13 + 1;
                    float f10 = (iDp * i14) + i10;
                    canvas.drawLine(f10, i11, f10, getBounds().height() + i11, paint2);
                    i13 = i14;
                }
                while (i12 < iHeight) {
                    i12++;
                    float f11 = (iDp * i12) + i11;
                    canvas.drawLine(i10, f11, getBounds().width() + i10, f11, paint2);
                }
                break;
            default:
                i6 i6Var = (i6) this.f272b;
                Paint paint3 = (Paint) this.f273c;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - i6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - i6Var.f29241e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((i6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + i6Var.f29241e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                i6Var.f29238a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                i6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - i6Var.f29241e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + i6Var.f29241e) / 2.0f));
                i6Var.draw(canvas);
                break;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f271a) {
            case 1:
                return (int) (((ImageReceiver) this.f272b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f271a) {
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
        switch (this.f271a) {
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
        switch (this.f271a) {
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

    public void l(float f10, boolean z10) {
        i6 i6Var = (i6) this.f272b;
        String str = a(f10) + "X";
        if (z10 && TextUtils.equals(i6Var.f29243g, str)) {
            return;
        }
        i6Var.b();
        i6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f271a) {
            case 1:
                ((ImageReceiver) this.f272b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, rl.u(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), rl.u(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f271a) {
            case 0:
                break;
            case 1:
                ((ImageReceiver) this.f272b).setAlpha(i10 / 255.0f);
                break;
            case 2:
            case 3:
            case 4:
                break;
            default:
                ((i6) this.f272b).f29257w = i10;
                Paint paint = (Paint) this.f273c;
                if (paint != null) {
                    paint.setAlpha(i10);
                }
                break;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f271a) {
            case 0:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f272b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i14 = i12 - i10;
                    int i15 = i13 - i11;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float fMin = Math.min(i14 / width, i15 / height);
                    int iRound = Math.round(width * fMin);
                    int iRound2 = Math.round(height * fMin);
                    int i16 = i10 + ((i14 - iRound) / 2);
                    int i17 = i11 + ((i15 - iRound2) / 2);
                    ((Rect) this.f273c).set(i16, i17, iRound + i16, iRound2 + i17);
                    break;
                }
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f271a;
    }

    public g() {
        this.f271a = 5;
        fg.a aVar = new fg.a(this, 8);
        i6 i6Var = new i6(false, true, true, false);
        this.f272b = i6Var;
        i6Var.setCallback(aVar);
        i6Var.k(0.3f, 165L, er.h);
        i6Var.f29239b = 1;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f29238a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f273c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public g(tc tcVar, Paint paint) {
        this.f271a = 2;
        this.f273c = tcVar;
        this.f272b = paint;
    }

    public g(Bitmap bitmap) {
        this.f271a = 0;
        this.f273c = new Rect();
        this.f272b = bitmap;
    }

    public g(ImageReceiver imageReceiver, Drawable drawable) {
        this.f271a = 1;
        this.f272b = imageReceiver;
        this.f273c = drawable;
    }

    public g(ChatActivityEnterView chatActivityEnterView) {
        this.f271a = 3;
        this.f273c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f272b = paint;
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
