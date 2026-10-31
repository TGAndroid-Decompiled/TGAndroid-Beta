package e2;

import android.os.SystemClock;
public final class d0 {
    public final int f6125a;
    public int f6126b;
    public boolean f6127c;
    public long d;
    public final e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.f6125a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f6131f;
        i2.i0 i0Var2 = e0Var.f6128a;
        int w02 = i0Var2.w0();
        if (i0Var2.t() && i0Var2.h() != 1 && i0Var2.h() != 4 && w02 != 0 && w02 != 1) {
            e0Var.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z10 = this.f6127c;
            int i10 = this.f6125a;
            if (z10 && this.f6126b == w02) {
                if (elapsedRealtime - this.d >= i10) {
                    e0Var.f6130c.f7821a.A1(new i2.l(2, new f0(4, i10), 1003));
                    return;
                }
                return;
            }
            this.f6127c = true;
            this.d = elapsedRealtime;
            this.f6126b = w02;
            i0Var.e(4);
            i0Var.f6151a.sendEmptyMessageDelayed(4, i10);
            return;
        }
        if (this.f6127c) {
            i0Var.e(4);
        }
        this.f6127c = false;
    }
}
