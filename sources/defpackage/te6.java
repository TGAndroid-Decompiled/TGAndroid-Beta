package defpackage;

import android.widget.FrameLayout;
public final class te6 implements Runnable {
    public final byte a;
    public final ze6 b;

    public te6(ze6 ze6Var, byte b) {
        this.a = b;
        this.b = ze6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 0;
        r4 = false;
        r4 = false;
        boolean z = false;
        ze6 ze6Var = this.b;
        switch (b) {
            case 0:
                ze6Var.o();
                return;
            case 1:
                ze6Var.postDelayed(new te6(ze6Var, (byte) 2), 150L);
                te6 te6Var = ze6Var.T;
                ze6Var.removeCallbacks(te6Var);
                ze6Var.postDelayed(te6Var, 3000L);
                ze6Var.S = true;
                return;
            case 2:
                xe6 xe6Var = ze6Var.a;
                xe6Var.e = false;
                xe6Var.f[0].requestFocus();
                while (true) {
                    gl2[] gl2VarArr = xe6Var.f;
                    if (i < gl2VarArr.length) {
                        gl2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 3:
                ze6Var.postDelayed(new te6(ze6Var, (byte) 5), 150L);
                return;
            case 4:
                ye6 ye6Var = ze6Var.R;
                ze6Var.S = false;
                int i3 = 0;
                while (true) {
                    gl2[] gl2VarArr2 = ze6Var.a.f;
                    if (i3 < gl2VarArr2.length) {
                        gl2VarArr2[i3].A(0.0f);
                        i3++;
                    } else if (ye6Var.getCurrentView() != ze6Var.e) {
                        ye6Var.showNext();
                        FrameLayout frameLayout = ze6Var.h;
                        if (ze6Var.f.getVisibility() != 0 && ze6Var.a0.G != 3 && !ze6Var.Q) {
                            z = true;
                        }
                        gm.T3(frameLayout, z, 1.0f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 5:
                xe6 xe6Var2 = ze6Var.a;
                xe6Var2.e = false;
                xe6Var2.f[0].requestFocus();
                while (true) {
                    gl2[] gl2VarArr3 = xe6Var2.f;
                    if (i2 < gl2VarArr3.length) {
                        gl2VarArr3[i2].A(0.0f);
                        i2++;
                    } else {
                        return;
                    }
                }
            case 6:
                ze6Var.p(true);
                return;
            case 7:
                ze6Var.q();
                return;
            default:
                s09 s09Var = ze6Var.x;
                s09Var.getAnimatedDrawable().I(0, false, false);
                s09Var.d();
                xe6 xe6Var3 = ze6Var.a;
                if (xe6Var3 != null && xe6Var3.f != null) {
                    xe6Var3.setText("");
                    xe6Var3.f[0].requestFocus();
                    return;
                }
                return;
        }
    }
}
