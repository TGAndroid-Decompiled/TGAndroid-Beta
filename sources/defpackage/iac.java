package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
public final class iac extends View {
    public final gn a;
    public final gn b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final lm h;
    public final int[] n;

    public iac(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        s33 s33Var = s33.h;
        this.h = new lm(this, 0L, 300L, s33Var);
        this.n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        gn gnVar = new gn(true, false, false);
        this.a = gnVar;
        gnVar.n(0.4f, 360L, s33Var);
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.u(-1);
        gnVar.w(gl.N(10.6f));
        gnVar.setCallback(this);
        gnVar.b = 17;
        gn gnVar2 = new gn(true, false, false);
        this.b = gnVar2;
        gnVar2.n(0.2f, 360L, s33Var);
        gnVar2.x(gl.n1("fonts/num.otf"));
        gnVar2.u(-1);
        gnVar2.w(gl.N(8.6f));
        gnVar2.setCallback(this);
        gnVar2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        gnVar2.a.setXfermode(new PorterDuffXfermode(mode));
        gnVar2.N = gl.q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i, boolean z, boolean z2) {
        boolean z3;
        String str;
        if (z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f = z3;
        gn gnVar = this.b;
        gn gnVar2 = this.a;
        if (z2) {
            gnVar2.t("GIF", true, true);
            gnVar.t("", true, true);
        } else {
            if (i >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            gnVar2.t(str, true, true);
            int[] iArr = this.n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i >= iArr[length]) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length < 0) {
                gnVar.t("", true, true);
            } else if (length == 6) {
                gnVar.t("2K", TextUtils.isEmpty(gnVar.i), true);
            } else if (length == 7) {
                gnVar.t("4K", TextUtils.isEmpty(gnVar.i), true);
            } else {
                gnVar.t(String.valueOf(iArr[length]), TextUtils.isEmpty(gnVar.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = yjb.B(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i);
        paint.setStrokeWidth(gl.N(1.33f));
        float N = gl.N(21.33f);
        float N2 = gl.N(6.0f);
        gn gnVar = this.a;
        float max = Math.max(N, gnVar.c() + N2);
        float N3 = gl.N(17.33f);
        RectF rectF = gl.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, gl.N(4.0f), gl.N(4.0f), paint);
        Rect rect = gl.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        gnVar.setBounds(rect);
        gnVar.C = i;
        gnVar.draw(canvas);
        gn gnVar2 = this.b;
        float c = gnVar2.c() + (gl.N(2.0f) * gnVar2.i());
        float N4 = gl.N(8.33f);
        rect.set((int) ((gl.N(16.0f) + (getWidth() / 2.0f)) - c), (int) ((getHeight() / 2.0f) - gl.N(14.0f)), (int) (gl.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - gl.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-gl.N(1.33f), -gl.N(1.33f));
        canvas.drawRoundRect(rectF, gl.N(1.66f), gl.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (gnVar2.i() * B));
        canvas.drawRoundRect(rectF, gl.N(1.66f), gl.N(1.66f), paint2);
        rect.offset((int) (-gl.N(1.33f)), 0);
        canvas.save();
        gnVar2.setBounds(rect);
        gnVar2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z) {
        String str;
        this.f = false;
        if (z) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.a.t(str, true, true);
        this.b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.a != drawable && this.b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
