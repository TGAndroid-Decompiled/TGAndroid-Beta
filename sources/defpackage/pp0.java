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
public final class pp0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final ylb c;
    public final uib d;
    public final uib e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;
    public int k;

    public pp0(int i, ylb ylbVar, Context context) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i;
        this.c = ylbVar;
        uib uibVar = new uib(jb6.M0(2131753033, null), 14.0f, gm.o());
        this.d = uibVar;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar.a();
        uib uibVar2 = new uib("", 13.0f, null);
        this.e = uibVar2;
        uibVar2.l(4);
        uibVar2.a();
        this.f = context.getResources().getDrawable(2131231180).mutate();
        Drawable d = b10.d(context, 2131230872);
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
        ylb ylbVar = this.c;
        if (cmb.g1(ylbVar)) {
            int v0 = cmb.v0(cmb.Ea, ylbVar);
            i = cmb.v0(cmb.Fa, ylbVar);
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
        Paint U0 = cmb.U0("paintChatActionBackground", ylbVar);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), U0);
        if (ylbVar != null) {
            b1 = ylbVar.g();
        } else {
            b1 = cmb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.U0("paintChatActionBackgroundDarken", ylbVar));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + gm.L(17.0f));
        canvas.drawCircle(rectF.centerX(), gm.L(35.0f), gm.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - gm.L(20.0f));
        int L = gm.L(15.0f);
        drawable2.setBounds(centerX, L, gm.L(40.0f) + centerX, gm.L(40.0f) + L);
        drawable2.draw(canvas);
        canvas.translate(0.0f, gm.L(70.0f));
        canvas.translate(0.0f, gm.L(14.0f));
        float centerX2 = rectF.centerX();
        uib uibVar = this.d;
        this.d.c(centerX2 - (uibVar.j() / 2.0f), uibVar.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, uibVar.h());
        canvas.translate(0.0f, gm.L(4.0f));
        float centerX3 = rectF.centerX();
        uib uibVar2 = this.e;
        this.e.c(centerX3 - (uibVar2.j() / 2.0f), 0.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, uibVar2.h());
        canvas.translate(0.0f, gm.L(2.0f));
        drawable.setBounds((int) (rectF.centerX() - gm.L(10.0f)), 0, (int) (rectF.centerX() + gm.L(10.0f)), gm.L(20.0f));
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
