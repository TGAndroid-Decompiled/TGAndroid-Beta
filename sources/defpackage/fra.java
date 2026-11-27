package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class fra extends vz4 implements s84 {
    public static final int w = 0;
    public final t84 f;
    public final sh9 h;
    public final uz4[] n;
    public final vnb r;
    public int s;

    public fra(Context context, vnb vnbVar, sh9 sh9Var) {
        super(context);
        this.f = new t84(0, this, k43.h, 1600L);
        this.h = sh9Var;
        this.r = vnbVar;
        int i = aob.Nl;
        int p1 = aob.p1(0.09411765f, aob.v0(i, vnbVar));
        aob.p1(0.1254902f, aob.v0(i, vnbVar));
        this.e.setColor(p1);
        this.n = new uz4[]{uz4.c(context, vnbVar, tz4.I, 2131749414), uz4.c(context, vnbVar, tz4.x, 2131749431), uz4.c(context, vnbVar, tz4.L, 2131749412)};
        int i2 = 0;
        while (true) {
            uz4[] uz4VarArr = this.n;
            if (i2 < uz4VarArr.length) {
                this.a.addView(uz4VarArr[i2], tre.l(1.0f, 0, -1));
                this.n[i2].setOnClickListener(new w0(this, i2, (byte) 25));
                i2++;
            } else {
                uz4VarArr[0].f(true, false);
                return;
            }
        }
    }

    public final void a(int i) {
        int i2 = this.s;
        if (i2 != i) {
            uz4[] uz4VarArr = this.n;
            uz4VarArr[i2].f(false, true);
            uz4VarArr[i].f(true, true);
            this.s = i;
            this.f.a(i);
            this.h.a(Integer.valueOf(i));
        }
    }

    public final void b() {
        float f = this.f.f;
        int measuredHeight = getMeasuredHeight() - hl.L(8.0f);
        Rect rect = this.c;
        rect.set(hl.U1(f / 3.0f, hl.L(8.0f), getMeasuredWidth() - hl.L(8.0f)), hl.L(8.0f), hl.U1((f + 1.0f) / 3.0f, hl.L(8.0f), getMeasuredWidth() - hl.L(8.0f)), measuredHeight);
        int L = hl.L(this.b * 7.0f);
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
    public final void t(int i, float f, float f2, t84 t84Var) {
        b();
        invalidate();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
