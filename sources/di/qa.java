package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class qa extends ug.s1 {
    public final int f9285r;
    public Paint[] f9286s;
    public final int f9287w;
    public final int f9288x;

    public qa(Context context, int i7, int i10, int i11) {
        super(context);
        this.f9285r = i11;
        switch (i11) {
            case 1:
                this.f9287w = i7;
                this.f9288x = i10;
                super(context);
                c();
                return;
            default:
                this.f9287w = i7;
                this.f9288x = i10;
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
        switch (this.f9285r) {
            case 0:
                ug.r1 r1Var = new ug.r1(this.f9287w);
                this.f58330a = r1Var;
                r1Var.O = 105;
                int i12 = 0;
                r1Var.M = false;
                r1Var.G = false;
                r1Var.K = true;
                r1Var.H = true;
                r1Var.J = false;
                r1Var.f58315m = true;
                r1Var.h = true;
                int i13 = this.f9288x;
                if (i13 == 1) {
                    r1Var.f58313k = org.telegram.messenger.g0.L(24.0f);
                }
                if (i13 == 2) {
                    i7 = 40;
                } else {
                    i7 = 20;
                }
                this.f9286s = new Paint[i7];
                while (true) {
                    Paint[] paintArr = this.f9286s;
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
                            f10 = i0.a.f(i12 / (this.f9286s.length - 1), -371690, -14281);
                        }
                        this.f9286s[i12].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i12++;
                    } else {
                        ug.r1 r1Var2 = this.f58330a;
                        r1Var2.f58314l = new pa(this, 0);
                        r1Var2.f58320r = 17;
                        r1Var2.f58321s = 18;
                        r1Var2.f58322t = 19;
                        if (i13 == 2) {
                            r1Var2.N = true;
                            r1Var2.f58320r = 9;
                            r1Var2.f58321s = 11;
                            r1Var2.f58322t = 13;
                            r1Var2.f58317o = 1.6f;
                            r1Var2.f58325x = 1400L;
                            r1Var2.f58326y = 1600;
                            r1Var2.L = true;
                        }
                        r1Var2.Q = org.telegram.ui.ActionBar.j6.G6;
                        r1Var2.c();
                        return;
                    }
                }
            default:
                ug.r1 r1Var3 = new ug.r1(this.f9287w);
                this.f58330a = r1Var3;
                r1Var3.O = 106;
                int i14 = 0;
                r1Var3.M = false;
                r1Var3.G = false;
                r1Var3.K = true;
                r1Var3.H = true;
                r1Var3.J = false;
                r1Var3.f58315m = true;
                r1Var3.h = true;
                if (this.f9288x == 1) {
                    r1Var3.f58313k = org.telegram.messenger.g0.L(24.0f);
                }
                this.f9286s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f9286s;
                    if (i14 < paintArr2.length) {
                        paintArr2[i14] = new Paint(1);
                        this.f9286s[i14].setColorFilter(new PorterDuffColorFilter(i0.a.f(i14 / (this.f9286s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    } else {
                        ug.r1 r1Var4 = this.f58330a;
                        r1Var4.f58314l = new pa(this, 2);
                        r1Var4.f58320r = 17;
                        r1Var4.f58321s = 18;
                        r1Var4.f58322t = 19;
                        r1Var4.Q = org.telegram.ui.ActionBar.j6.G6;
                        r1Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f9285r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
