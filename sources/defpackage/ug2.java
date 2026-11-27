package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class ug2 extends kg5 {
    public final byte X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public ug2(Activity activity) {
        super(activity, 3);
        int i;
        int i2;
        this.Y0 = new b29[2];
        this.Z0 = new int[2];
        p(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.e = true;
        m(8.0f, 6.0f, 10.0f, 6.0f);
        this.v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < 2; i3++) {
            b29[] b29VarArr = (b29[]) this.Y0;
            if (i3 == 0) {
                i = 2131624286;
            } else {
                i = 2131624285;
            }
            b29VarArr[i3] = new b29(i, hl.L(24.0f), hl.L(24.0f));
            ((b29[]) this.Y0)[i3].setCallback(this);
            if (i3 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new tg2(((b29[]) this.Y0)[i3]), length, spannableStringBuilder.length(), 33);
            if (i3 == 0) {
                i2 = 2131749052;
            } else {
                i2 = 2131749053;
            }
            spannableStringBuilder.append((CharSequence) ob6.M0(i2, null));
        }
        t(spannableStringBuilder);
    }

    @Override
    public final void c(Canvas canvas, float f) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                kjc kjcVar = (kjc) this.Z0;
                paint.setShader(kjcVar.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), kjcVar.b().getAlpha()) * f), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (kjcVar.e) {
                    paint.setShader(((Paint) kjcVar.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                return;
            default:
                super.c(canvas, f);
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((kjc) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                b29[] b29VarArr = (b29[]) this.Y0;
                if ((b29VarArr != null && (drawable == b29VarArr[0] || drawable == b29VarArr[1])) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public ug2(Activity activity, int i, kjc kjcVar, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = kjcVar;
        kjcVar.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z) {
            j(true);
        }
    }
}
