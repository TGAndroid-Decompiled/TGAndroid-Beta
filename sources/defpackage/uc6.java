package defpackage;

import android.widget.FrameLayout;
public final class uc6 implements Runnable {
    public final byte a;
    public final ad6 b;

    public uc6(ad6 ad6Var, byte b) {
        this.a = b;
        this.b = ad6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 0;
        r4 = false;
        r4 = false;
        boolean z = false;
        ad6 ad6Var = this.b;
        switch (b) {
            case 0:
                ad6Var.o();
                return;
            case 1:
                ad6Var.postDelayed(new uc6(ad6Var, (byte) 2), 150L);
                uc6 uc6Var = ad6Var.T;
                ad6Var.removeCallbacks(uc6Var);
                ad6Var.postDelayed(uc6Var, 3000L);
                ad6Var.S = true;
                return;
            case 2:
                yc6 yc6Var = ad6Var.a;
                yc6Var.e = false;
                yc6Var.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr = yc6Var.f;
                    if (i < sj2VarArr.length) {
                        sj2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 3:
                ad6Var.postDelayed(new uc6(ad6Var, (byte) 5), 150L);
                return;
            case 4:
                zc6 zc6Var = ad6Var.R;
                ad6Var.S = false;
                int i3 = 0;
                while (true) {
                    sj2[] sj2VarArr2 = ad6Var.a.f;
                    if (i3 < sj2VarArr2.length) {
                        sj2VarArr2[i3].A(0.0f);
                        i3++;
                    } else if (zc6Var.getCurrentView() != ad6Var.e) {
                        zc6Var.showNext();
                        FrameLayout frameLayout = ad6Var.h;
                        if (ad6Var.f.getVisibility() != 0 && ad6Var.a0.G != 3 && !ad6Var.Q) {
                            z = true;
                        }
                        gl.U3(frameLayout, z, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                yc6 yc6Var2 = ad6Var.a;
                yc6Var2.e = false;
                yc6Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr3 = yc6Var2.f;
                    if (i2 < sj2VarArr3.length) {
                        sj2VarArr3[i2].A(0.0f);
                        i2++;
                    } else {
                        return;
                    }
                }
            case 6:
                ad6Var.p(true);
                return;
            case 7:
                ad6Var.q();
                return;
            default:
                ry8 ry8Var = ad6Var.x;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                yc6 yc6Var3 = ad6Var.a;
                if (yc6Var3 != null && yc6Var3.f != null) {
                    yc6Var3.setText("");
                    yc6Var3.f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
