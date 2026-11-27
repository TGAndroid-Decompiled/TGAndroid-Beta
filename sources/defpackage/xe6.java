package defpackage;

import android.widget.FrameLayout;
public final class xe6 implements Runnable {
    public final byte a;
    public final df6 b;

    public xe6(df6 df6Var, byte b) {
        this.a = b;
        this.b = df6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 0;
        r4 = false;
        r4 = false;
        boolean z = false;
        df6 df6Var = this.b;
        switch (b) {
            case 0:
                df6Var.o();
                return;
            case 1:
                df6Var.postDelayed(new xe6(df6Var, (byte) 2), 150L);
                xe6 xe6Var = df6Var.T;
                df6Var.removeCallbacks(xe6Var);
                df6Var.postDelayed(xe6Var, 3000L);
                df6Var.S = true;
                return;
            case 2:
                bf6 bf6Var = df6Var.a;
                bf6Var.e = false;
                bf6Var.f[0].requestFocus();
                while (true) {
                    ok2[] ok2VarArr = bf6Var.f;
                    if (i < ok2VarArr.length) {
                        ok2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 3:
                df6Var.postDelayed(new xe6(df6Var, (byte) 5), 150L);
                return;
            case 4:
                cf6 cf6Var = df6Var.R;
                df6Var.S = false;
                int i3 = 0;
                while (true) {
                    ok2[] ok2VarArr2 = df6Var.a.f;
                    if (i3 < ok2VarArr2.length) {
                        ok2VarArr2[i3].A(0.0f);
                        i3++;
                    } else if (cf6Var.getCurrentView() != df6Var.e) {
                        cf6Var.showNext();
                        FrameLayout frameLayout = df6Var.h;
                        if (df6Var.f.getVisibility() != 0 && df6Var.a0.G != 3 && !df6Var.Q) {
                            z = true;
                        }
                        hl.T3(frameLayout, z, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                bf6 bf6Var2 = df6Var.a;
                bf6Var2.e = false;
                bf6Var2.f[0].requestFocus();
                while (true) {
                    ok2[] ok2VarArr3 = bf6Var2.f;
                    if (i2 < ok2VarArr3.length) {
                        ok2VarArr3[i2].A(0.0f);
                        i2++;
                    } else {
                        return;
                    }
                }
            case 6:
                df6Var.p(true);
                return;
            case 7:
                df6Var.q();
                return;
            default:
                e29 e29Var = df6Var.x;
                e29Var.getAnimatedDrawable().I(0, false, false);
                e29Var.d();
                bf6 bf6Var3 = df6Var.a;
                if (bf6Var3 != null && bf6Var3.f != null) {
                    bf6Var3.setText("");
                    bf6Var3.f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
