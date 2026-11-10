package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class gc extends ug.q1 {
    public final int f3957r;
    public Paint[] f3958s;
    public final int f3959w;
    public final int f3960x;

    public gc(Context context, int i7, int i10, int i11) {
        super(context);
        this.f3957r = i11;
        switch (i11) {
            case 1:
                this.f3959w = i7;
                this.f3960x = i10;
                super(context);
                c();
                return;
            default:
                this.f3959w = i7;
                this.f3960x = i10;
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
        switch (this.f3957r) {
            case 0:
                ug.p1 p1Var = new ug.p1(this.f3959w);
                this.f56805a = p1Var;
                p1Var.O = 105;
                int i12 = 0;
                p1Var.M = false;
                p1Var.G = false;
                p1Var.K = true;
                p1Var.H = true;
                p1Var.J = false;
                p1Var.f56785m = true;
                p1Var.h = true;
                int i13 = this.f3960x;
                if (i13 == 1) {
                    p1Var.f56783k = org.telegram.messenger.g0.L(24.0f);
                }
                if (i13 == 2) {
                    i7 = 40;
                } else {
                    i7 = 20;
                }
                this.f3958s = new Paint[i7];
                while (true) {
                    Paint[] paintArr = this.f3958s;
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
                            f10 = i0.a.f(i12 / (this.f3958s.length - 1), -371690, -14281);
                        }
                        this.f3958s[i12].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i12++;
                    } else {
                        ug.p1 p1Var2 = this.f56805a;
                        p1Var2.f56784l = new fc(this, 0);
                        p1Var2.f56790r = 17;
                        p1Var2.f56791s = 18;
                        p1Var2.f56792t = 19;
                        if (i13 == 2) {
                            p1Var2.N = true;
                            p1Var2.f56790r = 9;
                            p1Var2.f56791s = 11;
                            p1Var2.f56792t = 13;
                            p1Var2.f56787o = 1.6f;
                            p1Var2.f56795x = 1400L;
                            p1Var2.f56796y = 1600;
                            p1Var2.L = true;
                        }
                        p1Var2.Q = org.telegram.ui.ActionBar.m6.G6;
                        p1Var2.c();
                        return;
                    }
                }
            default:
                ug.p1 p1Var3 = new ug.p1(this.f3959w);
                this.f56805a = p1Var3;
                p1Var3.O = 106;
                int i14 = 0;
                p1Var3.M = false;
                p1Var3.G = false;
                p1Var3.K = true;
                p1Var3.H = true;
                p1Var3.J = false;
                p1Var3.f56785m = true;
                p1Var3.h = true;
                if (this.f3960x == 1) {
                    p1Var3.f56783k = org.telegram.messenger.g0.L(24.0f);
                }
                this.f3958s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f3958s;
                    if (i14 < paintArr2.length) {
                        paintArr2[i14] = new Paint(1);
                        this.f3958s[i14].setColorFilter(new PorterDuffColorFilter(i0.a.f(i14 / (this.f3958s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    } else {
                        ug.p1 p1Var4 = this.f56805a;
                        p1Var4.f56784l = new fc(this, 2);
                        p1Var4.f56790r = 17;
                        p1Var4.f56791s = 18;
                        p1Var4.f56792t = 19;
                        p1Var4.Q = org.telegram.ui.ActionBar.m6.G6;
                        p1Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f3957r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
