package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class qh2 extends hg5 {
    public final byte X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public qh2(Activity activity) {
        super(activity, 3);
        int i;
        int i2;
        this.Y0 = new p09[2];
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
            p09[] p09VarArr = (p09[]) this.Y0;
            if (i3 == 0) {
                i = 2131624286;
            } else {
                i = 2131624285;
            }
            p09VarArr[i3] = new p09(i, gm.L(24.0f), gm.L(24.0f));
            ((p09[]) this.Y0)[i3].setCallback(this);
            if (i3 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new ph2(((p09[]) this.Y0)[i3]), length, spannableStringBuilder.length(), 33);
            if (i3 == 0) {
                i2 = 2131749055;
            } else {
                i2 = 2131749056;
            }
            spannableStringBuilder.append((CharSequence) jb6.M0(i2, null));
        }
        t(spannableStringBuilder);
    }

    @Override
    public final void c(Canvas canvas, float f) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                lhc lhcVar = (lhc) this.Z0;
                paint.setShader(lhcVar.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), lhcVar.b().getAlpha()) * f), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (lhcVar.e) {
                    paint.setShader(((Paint) lhcVar.d.a).getShader());
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
                ((lhc) this.Z0).d(getX(), getY());
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
                p09[] p09VarArr = (p09[]) this.Y0;
                if ((p09VarArr != null && (drawable == p09VarArr[0] || drawable == p09VarArr[1])) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public qh2(Activity activity, int i, lhc lhcVar, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = lhcVar;
        lhcVar.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z) {
            j(true);
        }
    }
}
