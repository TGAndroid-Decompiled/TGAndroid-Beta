package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UsersSelectActivity;
public final class jc5 implements View.OnKeyListener {
    public final byte a;
    public boolean b;
    public final e c;

    public jc5(e eVar, byte b) {
        this.a = b;
        this.c = eVar;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        e eVar = this.c;
        boolean z = true;
        switch (b) {
            case 0:
                rc5 rc5Var = (rc5) eVar;
                if (i == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (rc5Var.f.r.length() != 0) {
                            z = false;
                        }
                        this.b = z;
                    } else if (keyEvent.getAction() == 1 && this.b && !rc5Var.b0.isEmpty()) {
                        rc5Var.h.c((zc5) c00.g(1, rc5Var.b0));
                        rc5Var.x0();
                        rc5Var.l0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) eVar;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.c.length() != 0) {
                            z = false;
                        }
                        this.b = z;
                    } else if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                        zc5 zc5Var = (zc5) c00.g(1, arrayList);
                        usersSelectActivity.b.b(zc5Var);
                        if (usersSelectActivity.y == 2) {
                            if (zc5Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (zc5Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (zc5Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (zc5Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (zc5Var.getUid() == Long.MIN_VALUE) {
                            int i2 = usersSelectActivity.L;
                            int i3 = uc7.r5;
                            usersSelectActivity.L = i2 & (-2);
                        } else if (zc5Var.getUid() == -9223372036854775807L) {
                            int i4 = usersSelectActivity.L;
                            int i5 = uc7.r5;
                            usersSelectActivity.L = i4 & (-3);
                        } else if (zc5Var.getUid() == -9223372036854775806L) {
                            int i6 = usersSelectActivity.L;
                            int i7 = uc7.r5;
                            usersSelectActivity.L = i6 & (-5);
                        } else if (zc5Var.getUid() == -9223372036854775805L) {
                            int i8 = usersSelectActivity.L;
                            int i9 = uc7.r5;
                            usersSelectActivity.L = i8 & (-9);
                        } else if (zc5Var.getUid() == -9223372036854775804L) {
                            int i10 = usersSelectActivity.L;
                            int i11 = uc7.r5;
                            usersSelectActivity.L = i10 & (-17);
                        } else if (zc5Var.getUid() == -9223372036854775803L) {
                            int i12 = usersSelectActivity.L;
                            int i13 = uc7.r5;
                            usersSelectActivity.L = i12 & (-33);
                        } else if (zc5Var.getUid() == -9223372036854775802L) {
                            int i14 = usersSelectActivity.L;
                            int i15 = uc7.r5;
                            usersSelectActivity.L = i14 & (-65);
                        } else if (zc5Var.getUid() == -9223372036854775801L) {
                            int i16 = usersSelectActivity.L;
                            int i17 = uc7.r5;
                            usersSelectActivity.L = i16 & (-129);
                        }
                        usersSelectActivity.c0();
                        usersSelectActivity.Z();
                        return true;
                    }
                }
                return false;
        }
    }
}
