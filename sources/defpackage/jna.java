package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class jna extends px4 implements x74 {
    public static final int w = 0;
    public final y74 f;
    public final ae9 h;
    public final ox4[] n;
    public final wjb r;
    public int s;

    public jna(Context context, wjb wjbVar, ae9 ae9Var) {
        super(context);
        this.f = new y74(0, this, s33.h, 1600L);
        this.h = ae9Var;
        this.r = wjbVar;
        int i = bkb.Ml;
        int p1 = bkb.p1(0.09411765f, bkb.v0(i, wjbVar));
        bkb.p1(0.1254902f, bkb.v0(i, wjbVar));
        this.e.setColor(p1);
        this.n = new ox4[]{ox4.c(context, wjbVar, nx4.H, 2131749453), ox4.c(context, wjbVar, nx4.w, 2131749470), ox4.c(context, wjbVar, nx4.K, 2131749451)};
        int i2 = 0;
        while (true) {
            ox4[] ox4VarArr = this.n;
            if (i2 < ox4VarArr.length) {
                this.a.addView(ox4VarArr[i2], nme.l(1.0f, 0, -1));
                this.n[i2].setOnClickListener(new v0(this, i2, (byte) 24));
                i2++;
            } else {
                ox4VarArr[0].f(true, false);
                return;
            }
        }
    }

    public final void a(int i) {
        int i2 = this.s;
        if (i2 != i) {
            ox4[] ox4VarArr = this.n;
            ox4VarArr[i2].f(false, true);
            ox4VarArr[i].f(true, true);
            this.s = i;
            this.f.a(i);
            this.h.a(Integer.valueOf(i));
        }
    }

    public final void b() {
        float f = this.f.f;
        int measuredHeight = getMeasuredHeight() - gl.L(8.0f);
        Rect rect = this.c;
        rect.set(gl.U1(f / 3.0f, gl.L(8.0f), getMeasuredWidth() - gl.L(8.0f)), gl.L(8.0f), gl.U1((f + 1.0f) / 3.0f, gl.L(8.0f), getMeasuredWidth() - gl.L(8.0f)), measuredHeight);
        int L = gl.L(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i = -L;
        rect2.inset(i, i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        b();
        invalidate();
    }

    @Override
    public final void F(float f, int i) {
    }
}
