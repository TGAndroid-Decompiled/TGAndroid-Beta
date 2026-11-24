package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.a;
public final class g8c extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final RectF g;
    public final u51 h;
    public final vj2 i;
    public Runnable j;
    public StaticLayout k;
    public StaticLayout l;
    public StaticLayout m;
    public String n;
    public String o;
    public String p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    public g8c() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.g = new RectF();
        u51 u51Var = new u51((View) null);
        this.h = u51Var;
        this.i = new vj2(new oo8(this, (byte) 21));
        this.s = gm.L(62.33f);
        this.t = gm.L(12.0f);
        this.u = gm.L(30.0f);
        this.v = gm.L(15.0f);
        this.w = gm.L(7.0f);
        this.x = gm.L(12.0f);
        this.y = gm.L(2.0f);
        this.a = a.b.getDrawable(2131232712).mutate();
        this.b = a.b.getDrawable(2131231622).mutate();
        u51Var.f = new f8c(this, (byte) 0);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(14.0f));
        textPaint2.setTextSize(gm.L(12.0f));
        textPaint3.setTypeface(gm.o());
        textPaint3.setTextSize(gm.L(14.0f));
        b();
    }

    public final int a(int i) {
        this.q = i;
        String str = this.p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.m = new StaticLayout(this.p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i - this.s) - ((int) ((this.t << 1) + measureText))) - this.x) - gm.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.c;
        this.k = new StaticLayout(TextUtils.ellipsize(this.n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.l = new StaticLayout(this.o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = Math.max(this.l.getHeight() + this.k.getHeight() + this.y, this.u) + (this.w << 1);
        this.r = max;
        setBounds(0, 0, this.q, max);
        return this.r;
    }

    public final void b() {
        int w0 = cmb.w0(null, cmb.Yc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.a.setColorFilter(new PorterDuffColorFilter(w0, mode));
        this.b.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.11f, -16777216), mode));
        this.c.setColor(w0);
        this.d.setColor(on2.p(w0, 179));
        this.e.setColor(w0);
        this.f.setColor(cmb.p1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i;
        int i2;
        if (this.k != null && this.l != null && this.m != null) {
            int i3 = getBounds().left;
            int i4 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.k.getHeight();
            int i5 = this.y;
            canvas.save();
            canvas.translate(this.s + i3, centerY - ((this.l.getHeight() + (height + i5)) / 2));
            this.k.draw(canvas);
            canvas.translate(0.0f, this.k.getHeight() + i5);
            this.l.draw(canvas);
            canvas.restore();
            int i6 = this.t;
            int L = i4 - gm.L(11.0f);
            float f = centerY - (this.u / 2);
            RectF rectF = this.g;
            rectF.set(L - ((int) (this.m.getWidth() + (i6 << 1))), f, L, i2 + i);
            float a = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            cmb.p1(0.18f, -1);
            int i7 = this.v;
            canvas.drawRoundRect(rectF, i7, i7, this.f);
            canvas.save();
            canvas.translate(width + i6, ((i - this.m.getHeight()) / 2.0f) + f);
            this.m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f2 = centerY + 1;
            Drawable drawable = this.b;
            ur3.d(drawable, gm.L(29.66f) + i3, f2, 17);
            drawable.draw(canvas);
            Drawable drawable2 = this.a;
            ur3.d(drawable2, gm.L(29.66f) + i3, f2, 17);
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
