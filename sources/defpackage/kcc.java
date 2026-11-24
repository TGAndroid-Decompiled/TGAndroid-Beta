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
public final class kcc extends View {
    public final ho a;
    public final ho b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final ln h;
    public final int[] n;

    public kcc(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        d53 d53Var = d53.h;
        this.h = new ln(this, 0L, 300L, d53Var);
        this.n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        ho hoVar = new ho(true, false, false);
        this.a = hoVar;
        hoVar.n(0.4f, 360L, d53Var);
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.u(-1);
        hoVar.w(gm.N(10.6f));
        hoVar.setCallback(this);
        hoVar.b = 17;
        ho hoVar2 = new ho(true, false, false);
        this.b = hoVar2;
        hoVar2.n(0.2f, 360L, d53Var);
        hoVar2.x(gm.n1("fonts/num.otf"));
        hoVar2.u(-1);
        hoVar2.w(gm.N(8.6f));
        hoVar2.setCallback(this);
        hoVar2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        hoVar2.a.setXfermode(new PorterDuffXfermode(mode));
        hoVar2.N = gm.q.x;
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
        ho hoVar = this.b;
        ho hoVar2 = this.a;
        if (z2) {
            hoVar2.t("GIF", true, true);
            hoVar.t("", true, true);
        } else {
            if (i >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            hoVar2.t(str, true, true);
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
                hoVar.t("", true, true);
            } else if (length == 6) {
                hoVar.t("2K", TextUtils.isEmpty(hoVar.i), true);
            } else if (length == 7) {
                hoVar.t("4K", TextUtils.isEmpty(hoVar.i), true);
            } else {
                hoVar.t(String.valueOf(iArr[length]), TextUtils.isEmpty(hoVar.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = mlb.B(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i);
        paint.setStrokeWidth(gm.N(1.33f));
        float N = gm.N(21.33f);
        float N2 = gm.N(6.0f);
        ho hoVar = this.a;
        float max = Math.max(N, hoVar.c() + N2);
        float N3 = gm.N(17.33f);
        RectF rectF = gm.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, gm.N(4.0f), gm.N(4.0f), paint);
        Rect rect = gm.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        hoVar.setBounds(rect);
        hoVar.C = i;
        hoVar.draw(canvas);
        ho hoVar2 = this.b;
        float c = hoVar2.c() + (gm.N(2.0f) * hoVar2.i());
        float N4 = gm.N(8.33f);
        rect.set((int) ((gm.N(16.0f) + (getWidth() / 2.0f)) - c), (int) ((getHeight() / 2.0f) - gm.N(14.0f)), (int) (gm.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - gm.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-gm.N(1.33f), -gm.N(1.33f));
        canvas.drawRoundRect(rectF, gm.N(1.66f), gm.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (hoVar2.i() * B));
        canvas.drawRoundRect(rectF, gm.N(1.66f), gm.N(1.66f), paint2);
        rect.offset((int) (-gm.N(1.33f)), 0);
        canvas.save();
        hoVar2.setBounds(rect);
        hoVar2.draw(canvas);
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
