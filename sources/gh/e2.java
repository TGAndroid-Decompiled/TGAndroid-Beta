package gh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import hh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.pz0;

public final class e2 extends fq {

    public pz0 f7221b;

    public final Path f7222c;
    public final Paint d;

    public final float f7223e;

    public bb f7224f;

    public boolean f7225g;
    public int h;

    public e2(View view) {
        super(view);
        Path path = new Path();
        this.f7222c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.f7223e = 1.0f;
        c(path, 1.0f, false);
        this.f28431a.setColor(-698031);
        this.f28431a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f10, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Float f11 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f11.floatValue() : f11.floatValue());
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.83f)), f10), AndroidUtilities.dp(f11));
        path.lineTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(23.5f)), f10), AndroidUtilities.dp(1.17f * f10));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(22.75f)), f10), AndroidUtilities.dp(0.42f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(21.73f)), f10), 0.0f, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(19.62f)), f10), 0.0f, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(2.73f)), f10), AndroidUtilities.dp(f12), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(1.55f)), f10), AndroidUtilities.dp(f12));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(0.36f)), f10), AndroidUtilities.dp(f12), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(-0.23f)), f10), AndroidUtilities.dp(1.4885f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(0.6f)), f10), AndroidUtilities.dp(2.32f * f10));
        path.lineTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(45.72f)), f10), AndroidUtilities.dp(47.44f * f10));
        float fG = com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.56f)), f10);
        float fDp = AndroidUtilities.dp(48.28f * f10);
        Float fValueOf = Float.valueOf(48.0f);
        path.cubicTo(fG, fDp, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(47.68f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(46.5f * f10));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(45.31f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(28.38f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(27.32f * f10));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(fValueOf), f10), AndroidUtilities.dp(26.26f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(47.5f)), f10), AndroidUtilities.dp(25.24f * f10), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.82f)), f10), AndroidUtilities.dp(f11));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = this.f28431a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.f7225g ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{org.telegram.ui.ActionBar.g6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), org.telegram.ui.ActionBar.g6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.d;
        int alpha = paint.getAlpha();
        Path path = this.f7222c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.f28431a);
        if (this.f7224f != null) {
            canvas.clipPath(path);
            this.f7224f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f7224f.d();
            this.f7224f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.f7221b != null) {
            canvas.save();
            canvas.rotate(this.f7225g ? -45.0f : 45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.f7225g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.f7225g ? 5.0f : 6.0f));
            float fMin = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.f7221b.f31697c);
            canvas.scale(fMin, fMin, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.f7225g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.f7225g ? 5.0f : 6.0f));
            canvas2 = canvas;
            this.f7221b.c(((getBounds().width() / 2.0f) + AndroidUtilities.dp(this.f7225g ? -7.0f : 6.0f)) - (this.f7221b.l() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.f7225g ? 4.0f : 5.0f), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i10, CharSequence charSequence, boolean z10) {
        this.f7221b = new pz0(charSequence, i10, z10 ? AndroidUtilities.bold() : null);
    }
}
