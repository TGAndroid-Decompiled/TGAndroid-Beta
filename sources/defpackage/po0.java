package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class po0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final wjb c;
    public final tgb d;
    public final tgb e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;
    public int k;

    public po0(int i, wjb wjbVar, Context context) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i;
        this.c = wjbVar;
        tgb tgbVar = new tgb(k96.M0(2131753065, null), 14.0f, gl.o());
        this.d = tgbVar;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        tgbVar.a();
        tgb tgbVar2 = new tgb("", 13.0f, null);
        this.e = tgbVar2;
        tgbVar2.l(4);
        tgbVar2.a();
        this.f = context.getResources().getDrawable(2131231179).mutate();
        Drawable d = b00.d(context, 2131230871);
        this.g = d;
        d.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        boolean b1;
        wjb wjbVar = this.c;
        if (bkb.g1(wjbVar)) {
            int v0 = bkb.v0(bkb.Ea, wjbVar);
            i = bkb.v0(bkb.Fa, wjbVar);
            i2 = v0;
        } else {
            i = -1;
            i2 = -1;
        }
        int i3 = this.k;
        Drawable drawable = this.g;
        Drawable drawable2 = this.f;
        if (i3 != i || drawable2.getColorFilter() == null) {
            this.k = i;
            int i4 = this.k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i4, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.k, mode));
        }
        Paint U0 = bkb.U0("paintChatActionBackground", wjbVar);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), U0);
        if (wjbVar != null) {
            b1 = wjbVar.g();
        } else {
            b1 = bkb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.U0("paintChatActionBackgroundDarken", wjbVar));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + gl.L(17.0f));
        canvas.drawCircle(rectF.centerX(), gl.L(35.0f), gl.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - gl.L(20.0f));
        int L = gl.L(15.0f);
        drawable2.setBounds(centerX, L, gl.L(40.0f) + centerX, gl.L(40.0f) + L);
        drawable2.draw(canvas);
        canvas.translate(0.0f, gl.L(70.0f));
        canvas.translate(0.0f, gl.L(14.0f));
        float centerX2 = rectF.centerX();
        tgb tgbVar = this.d;
        this.d.c(centerX2 - (tgbVar.j() / 2.0f), tgbVar.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, tgbVar.h());
        canvas.translate(0.0f, gl.L(4.0f));
        float centerX3 = rectF.centerX();
        tgb tgbVar2 = this.e;
        this.e.c(centerX3 - (tgbVar2.j() / 2.0f), 0.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, tgbVar2.h());
        canvas.translate(0.0f, gl.L(2.0f));
        drawable.setBounds((int) (rectF.centerX() - gl.L(10.0f)), 0, (int) (rectF.centerX() + gl.L(10.0f)), gl.L(20.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
