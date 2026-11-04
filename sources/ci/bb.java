package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class bb extends vg.t1 {
    public final int f4889r;
    public Paint[] f4890s;
    public final int f4891w;
    public final int f4892x;

    public bb(Context context, int i3, int i10, int i11) {
        super(context);
        this.f4889r = i11;
        switch (i11) {
            case 1:
                this.f4891w = i3;
                this.f4892x = i10;
                super(context);
                c();
                return;
            default:
                this.f4891w = i3;
                this.f4892x = i10;
                c();
                return;
        }
    }

    @Override
    public final void a() {
        int i3;
        int f10;
        float f11;
        int i10;
        int i11;
        switch (this.f4889r) {
            case 0:
                vg.s1 s1Var = new vg.s1(this.f4891w);
                this.f56857a = s1Var;
                s1Var.O = 105;
                int i12 = 0;
                s1Var.M = false;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.J = false;
                s1Var.f56839m = true;
                s1Var.h = true;
                int i13 = this.f4892x;
                if (i13 == 1) {
                    s1Var.f56837k = org.telegram.messenger.g0.L(24.0f);
                }
                if (i13 == 2) {
                    i3 = 40;
                } else {
                    i3 = 20;
                }
                this.f4890s = new Paint[i3];
                while (true) {
                    Paint[] paintArr = this.f4890s;
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
                            f10 = i0.a.f(i12 / (this.f4890s.length - 1), -371690, -14281);
                        }
                        this.f4890s[i12].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i12++;
                    } else {
                        vg.s1 s1Var2 = this.f56857a;
                        s1Var2.f56838l = new ab(this, 0);
                        s1Var2.f56844r = 17;
                        s1Var2.f56845s = 18;
                        s1Var2.f56846t = 19;
                        if (i13 == 2) {
                            s1Var2.N = true;
                            s1Var2.f56844r = 9;
                            s1Var2.f56845s = 11;
                            s1Var2.f56846t = 13;
                            s1Var2.f56841o = 1.6f;
                            s1Var2.f56849x = 1400L;
                            s1Var2.f56850y = 1600;
                            s1Var2.L = true;
                        }
                        s1Var2.Q = org.telegram.ui.ActionBar.k6.G6;
                        s1Var2.c();
                        return;
                    }
                }
            default:
                vg.s1 s1Var3 = new vg.s1(this.f4891w);
                this.f56857a = s1Var3;
                s1Var3.O = 106;
                int i14 = 0;
                s1Var3.M = false;
                s1Var3.G = false;
                s1Var3.K = true;
                s1Var3.H = true;
                s1Var3.J = false;
                s1Var3.f56839m = true;
                s1Var3.h = true;
                if (this.f4892x == 1) {
                    s1Var3.f56837k = org.telegram.messenger.g0.L(24.0f);
                }
                this.f4890s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f4890s;
                    if (i14 < paintArr2.length) {
                        paintArr2[i14] = new Paint(1);
                        this.f4890s[i14].setColorFilter(new PorterDuffColorFilter(i0.a.f(i14 / (this.f4890s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i14++;
                    } else {
                        vg.s1 s1Var4 = this.f56857a;
                        s1Var4.f56838l = new ab(this, 2);
                        s1Var4.f56844r = 17;
                        s1Var4.f56845s = 18;
                        s1Var4.f56846t = 19;
                        s1Var4.Q = org.telegram.ui.ActionBar.k6.G6;
                        s1Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f4889r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
