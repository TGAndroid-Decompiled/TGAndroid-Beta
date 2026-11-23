package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class ua extends ug.t1 {
    public final int f9878r;
    public Paint[] f9879s;
    public final int f9880w;
    public final int f9881x;

    public ua(Context context, int i7, int i10, int i11) {
        super(context);
        this.f9878r = i11;
        switch (i11) {
            case 1:
                this.f9880w = i7;
                this.f9881x = i10;
                super(context);
                c();
                return;
            default:
                this.f9880w = i7;
                this.f9881x = i10;
                c();
                return;
        }
    }

    @Override
    public final void a() {
        int i7;
        int f10;
        float f11;
        int i10;
        int i11;
        switch (this.f9878r) {
            case 0:
                ug.s1 s1Var = new ug.s1(this.f9880w);
                this.f59038a = s1Var;
                s1Var.O = 105;
                int i12 = 0;
                s1Var.M = false;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.J = false;
                s1Var.f59021m = true;
                s1Var.h = true;
                int i13 = this.f9881x;
                if (i13 == 1) {
                    s1Var.f59019k = org.telegram.messenger.g0.L(24.0f);
                }
                if (i13 == 2) {
                    i7 = 40;
                } else {
                    i7 = 20;
                }
                this.f9879s = new Paint[i7];
                while (true) {
                    Paint[] paintArr = this.f9879s;
                    if (i12 < paintArr.length) {
                        paintArr[i12] = new Paint(1);
                        if (i13 == 2) {
                            if (i12 >= 20) {
                                f11 = (i12 - 20) / 19.0f;
                                i10 = -1005568;
                                i11 = -2062336;
                            } else if (i12 % 5 == 0) {
                                f10 = -2340;
                            } else {
                                f11 = i12 / 19.0f;
                                i10 = -10645;
                                i11 = -20165;
                            }
                            f10 = i0.a.f(f11, i10, i11);
                        } else {
                            f10 = i0.a.f(i12 / (this.f9879s.length - 1), -371690, -14281);
                        }
                        this.f9879s[i12].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i12++;
                    } else {
                        ug.s1 s1Var2 = this.f59038a;
                        s1Var2.f59020l = new ta(this, 0);
                        s1Var2.f59026r = 17;
                        s1Var2.f59027s = 18;
                        s1Var2.f59028t = 19;
                        if (i13 == 2) {
                            s1Var2.N = true;
                            s1Var2.f59026r = 9;
                            s1Var2.f59027s = 11;
                            s1Var2.f59028t = 13;
                            s1Var2.f59023o = 1.6f;
                            s1Var2.f59031x = 1400L;
                            s1Var2.f59032y = 1600;
                            s1Var2.L = true;
                        }
                        s1Var2.Q = org.telegram.ui.ActionBar.n6.G6;
                        s1Var2.c();
                        return;
                    }
                }
            default:
                ug.s1 s1Var3 = new ug.s1(this.f9880w);
                this.f59038a = s1Var3;
                s1Var3.O = 106;
                int i14 = 0;
                s1Var3.M = false;
                s1Var3.G = false;
                s1Var3.K = true;
                s1Var3.H = true;
                s1Var3.J = false;
                s1Var3.f59021m = true;
                s1Var3.h = true;
                if (this.f9881x == 1) {
                    s1Var3.f59019k = org.telegram.messenger.g0.L(24.0f);
                }
                this.f9879s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f9879s;
                    if (i14 < paintArr2.length) {
                        paintArr2[i14] = new Paint(1);
                        this.f9879s[i14].setColorFilter(new PorterDuffColorFilter(i0.a.f(i14 / (this.f9879s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    } else {
                        ug.s1 s1Var4 = this.f59038a;
                        s1Var4.f59020l = new ta(this, 2);
                        s1Var4.f59026r = 17;
                        s1Var4.f59027s = 18;
                        s1Var4.f59028t = 19;
                        s1Var4.Q = org.telegram.ui.ActionBar.n6.G6;
                        s1Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f9878r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
