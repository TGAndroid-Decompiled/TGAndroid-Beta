package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class ua extends ug.u1 {
    public final int f9887r;
    public Paint[] f9888s;
    public final int f9889w;
    public final int f9890x;

    public ua(Context context, int i7, int i10, int i11) {
        super(context);
        this.f9887r = i11;
        switch (i11) {
            case 1:
                this.f9889w = i7;
                this.f9890x = i10;
                super(context);
                c();
                return;
            default:
                this.f9889w = i7;
                this.f9890x = i10;
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
        switch (this.f9887r) {
            case 0:
                ug.t1 t1Var = new ug.t1(this.f9889w);
                this.f58919a = t1Var;
                t1Var.O = 105;
                int i12 = 0;
                t1Var.M = false;
                t1Var.G = false;
                t1Var.K = true;
                t1Var.H = true;
                t1Var.J = false;
                t1Var.f58902m = true;
                t1Var.h = true;
                int i13 = this.f9890x;
                if (i13 == 1) {
                    t1Var.f58900k = org.telegram.messenger.g0.L(24.0f);
                }
                if (i13 == 2) {
                    i7 = 40;
                } else {
                    i7 = 20;
                }
                this.f9888s = new Paint[i7];
                while (true) {
                    Paint[] paintArr = this.f9888s;
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
                            f10 = i0.a.f(i12 / (this.f9888s.length - 1), -371690, -14281);
                        }
                        this.f9888s[i12].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i12++;
                    } else {
                        ug.t1 t1Var2 = this.f58919a;
                        t1Var2.f58901l = new ta(this, 0);
                        t1Var2.f58907r = 17;
                        t1Var2.f58908s = 18;
                        t1Var2.f58909t = 19;
                        if (i13 == 2) {
                            t1Var2.N = true;
                            t1Var2.f58907r = 9;
                            t1Var2.f58908s = 11;
                            t1Var2.f58909t = 13;
                            t1Var2.f58904o = 1.6f;
                            t1Var2.f58912x = 1400L;
                            t1Var2.f58913y = 1600;
                            t1Var2.L = true;
                        }
                        t1Var2.Q = org.telegram.ui.ActionBar.n6.G6;
                        t1Var2.c();
                        return;
                    }
                }
            default:
                ug.t1 t1Var3 = new ug.t1(this.f9889w);
                this.f58919a = t1Var3;
                t1Var3.O = 106;
                int i14 = 0;
                t1Var3.M = false;
                t1Var3.G = false;
                t1Var3.K = true;
                t1Var3.H = true;
                t1Var3.J = false;
                t1Var3.f58902m = true;
                t1Var3.h = true;
                if (this.f9890x == 1) {
                    t1Var3.f58900k = org.telegram.messenger.g0.L(24.0f);
                }
                this.f9888s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f9888s;
                    if (i14 < paintArr2.length) {
                        paintArr2[i14] = new Paint(1);
                        this.f9888s[i14].setColorFilter(new PorterDuffColorFilter(i0.a.f(i14 / (this.f9888s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    } else {
                        ug.t1 t1Var4 = this.f58919a;
                        t1Var4.f58901l = new ta(this, 2);
                        t1Var4.f58907r = 17;
                        t1Var4.f58908s = 18;
                        t1Var4.f58909t = 19;
                        t1Var4.Q = org.telegram.ui.ActionBar.n6.G6;
                        t1Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f9887r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
