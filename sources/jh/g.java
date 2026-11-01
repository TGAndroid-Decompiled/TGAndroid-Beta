package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import bi.s0;
import c3.i0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.se;
public final class g extends Drawable {
    public final int f10414a;
    public final Object f10415b;
    public final Object f10416c;

    public g(int i10, Object obj, Object obj2) {
        this.f10414a = i10;
        this.f10415b = obj;
        this.f10416c = obj2;
    }

    public static String a(float f7) {
        Math.abs(f7 - 0.25f);
        float round = Math.round(f7 * 10.0f) / 10.0f;
        long j10 = round;
        if (round == ((float) j10)) {
            return a1.g.l(j10, "");
        }
        return "" + round;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f10414a) {
            case 0:
                ImageReceiver imageReceiver = (ImageReceiver) this.f10415b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.f10416c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int B = (int) i0.B(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - gr.f26527k.getInterpolation(imageReceiver.f14385h1)) * org.telegram.messenger.i0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f14385h1 * 5.0f) * 255.0f));
                drawable.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
            case 1:
                Bitmap bitmap = (Bitmap) this.f10415b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f10416c, (Paint) null);
                    return;
                }
                return;
            case 2:
                jc jcVar = (jc) this.f10416c;
                if (jcVar.f27360c > 1) {
                    jcVar.c(canvas, jcVar.f27369o);
                    return;
                } else {
                    jcVar.c(canvas, (Paint) this.f10415b);
                    return;
                }
            case 3:
                Paint paint = (Paint) this.f10415b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f10416c;
                if (chatActivityEnterView.U0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.C3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y3 = (chatActivityEnterView.U0.getY() - chatActivityEnterView.getHeight()) + t6.f21018i3.getIntrinsicHeight();
                    se seVar = chatActivityEnterView.E0;
                    if (seVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = seVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y3 + offsetY, paint);
                    return;
                }
                return;
            case 4:
                Paint paint2 = (Paint) this.f10416c;
                canvas.drawRect(getBounds(), (Paint) this.f10415b);
                int L = org.telegram.messenger.i0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < width2) {
                    i13++;
                    float f7 = (L * i13) + i10;
                    canvas.drawLine(f7, i11, f7, getBounds().height() + i11, paint2);
                }
                while (i12 < height) {
                    i12++;
                    float f10 = (L * i12) + i11;
                    canvas.drawLine(i10, f10, getBounds().width() + i10, f10, paint2);
                }
                return;
            case 5:
                e6 e6Var = (e6) this.f10415b;
                Paint paint3 = (Paint) this.f10416c;
                if (paint3 != null) {
                    paint3.setStrokeWidth(org.telegram.messenger.i0.N(1.6f));
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(((org.telegram.messenger.i0.L(24.0f) - e6Var.c()) / 2.0f) - org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(0.2f) + ((org.telegram.messenger.i0.L(24.0f) - e6Var.e) / 2.0f), org.telegram.messenger.i0.N(3.0f) + ((e6Var.c() + org.telegram.messenger.i0.L(24.0f)) / 2.0f), (org.telegram.messenger.i0.L(24.0f) + e6Var.e) / 2.0f);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(3.0f), paint3);
                }
                e6Var.f25742a.setStrokeWidth(org.telegram.messenger.i0.N(0.3f));
                e6Var.setBounds(0, (int) ((org.telegram.messenger.i0.L(24.0f) - e6Var.e) / 2.0f), org.telegram.messenger.i0.L(24.0f), (int) ((org.telegram.messenger.i0.L(24.0f) + e6Var.e) / 2.0f));
                e6Var.draw(canvas);
                return;
            default:
                ((rz0) this.f10415b).c(getBounds().centerX() - (((rz0) this.f10415b).f30126c / 2.0f), getBounds().centerY(), 1.0f, t6.w0(t6.G6, (p6) this.f10416c), canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f10414a) {
            case 0:
                return (int) (((ImageReceiver) this.f10415b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f10414a) {
            case 4:
                return 0;
            case 5:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f10414a) {
            case 4:
                return 0;
            case 5:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f10414a) {
            case 0:
                return 0;
            case 1:
                return -3;
            case 2:
                return -2;
            case 3:
                return -2;
            case 4:
                return 0;
            case 5:
                return -2;
            default:
                return -2;
        }
    }

    public void n(boolean z10, float f7) {
        e6 e6Var = (e6) this.f10415b;
        String str = a(f7) + "X";
        if (z10 && TextUtils.equals(e6Var.f25749i, str)) {
            return;
        }
        e6Var.a();
        e6Var.t(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f10414a) {
            case 0:
                ((ImageReceiver) this.f10415b).y0(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top, a30.w(2.0f, rect.left, rect.right - org.telegram.messenger.i0.L(2.0f)), a30.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.i0.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f10414a) {
            case 0:
                ((ImageReceiver) this.f10415b).setAlpha(i10 / 255.0f);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ((e6) this.f10415b).B = i10;
                Paint paint = (Paint) this.f10416c;
                if (paint != null) {
                    paint.setAlpha(i10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f10414a) {
            case 1:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f10415b;
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
                    ((Rect) this.f10416c).set(i16, i17, round + i16, round2 + i17);
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
        int i10 = this.f10414a;
    }

    public g(boolean z10) {
        this.f10414a = 4;
        Paint paint = new Paint();
        this.f10415b = paint;
        Paint paint2 = new Paint();
        this.f10416c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public g() {
        this.f10414a = 5;
        s0 s0Var = new s0(this, 4);
        e6 e6Var = new e6(false, true, true);
        this.f10415b = e6Var;
        e6Var.setCallback(s0Var);
        e6Var.n(0.3f, 165L, gr.h);
        e6Var.f25744b = 1;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = e6Var.f25742a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.i0.N(0.6f));
        Paint paint = new Paint(1);
        this.f10416c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public g(jc jcVar, Paint paint) {
        this.f10414a = 2;
        this.f10416c = jcVar;
        this.f10415b = paint;
    }

    public g(Bitmap bitmap) {
        this.f10414a = 1;
        this.f10416c = new Rect();
        this.f10415b = bitmap;
    }

    public g(ChatActivityEnterView chatActivityEnterView) {
        this.f10414a = 3;
        this.f10416c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f10415b = paint;
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

    private final void f(int i10) {
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

    private final void l(ColorFilter colorFilter) {
    }

    private final void m(ColorFilter colorFilter) {
    }
}
