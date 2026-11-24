package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;
public final class gc5 implements View.OnKeyListener {
    public final byte a;
    public boolean b;
    public final d c;

    public gc5(d dVar, byte b) {
        this.a = b;
        this.c = dVar;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        d dVar = this.c;
        boolean z = true;
        switch (b) {
            case 0:
                oc5 oc5Var = (oc5) dVar;
                if (i == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (oc5Var.f.r.length() != 0) {
                            z = false;
                        }
                        this.b = z;
                    } else if (keyEvent.getAction() == 1 && this.b && !oc5Var.b0.isEmpty()) {
                        oc5Var.h.c((wc5) b10.f(1, oc5Var.b0));
                        oc5Var.x0();
                        oc5Var.m0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) dVar;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.c.length() != 0) {
                            z = false;
                        }
                        this.b = z;
                    } else if (keyEvent.getAction() == 1 && this.b && !arrayList.isEmpty()) {
                        wc5 wc5Var = (wc5) b10.f(1, arrayList);
                        usersSelectActivity.b.b(wc5Var);
                        if (usersSelectActivity.y == 2) {
                            if (wc5Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (wc5Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (wc5Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (wc5Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (wc5Var.getUid() == Long.MIN_VALUE) {
                            int i2 = oc7.s5;
                            usersSelectActivity.L &= -2;
                        } else if (wc5Var.getUid() == -9223372036854775807L) {
                            int i3 = oc7.s5;
                            usersSelectActivity.L &= -3;
                        } else if (wc5Var.getUid() == -9223372036854775806L) {
                            int i4 = oc7.s5;
                            usersSelectActivity.L &= -5;
                        } else if (wc5Var.getUid() == -9223372036854775805L) {
                            int i5 = oc7.s5;
                            usersSelectActivity.L &= -9;
                        } else if (wc5Var.getUid() == -9223372036854775804L) {
                            int i6 = oc7.s5;
                            usersSelectActivity.L &= -17;
                        } else if (wc5Var.getUid() == -9223372036854775803L) {
                            int i7 = oc7.s5;
                            usersSelectActivity.L &= -33;
                        } else if (wc5Var.getUid() == -9223372036854775802L) {
                            int i8 = oc7.s5;
                            usersSelectActivity.L &= -65;
                        } else if (wc5Var.getUid() == -9223372036854775801L) {
                            int i9 = oc7.s5;
                            usersSelectActivity.L &= -129;
                        }
                        usersSelectActivity.d0();
                        usersSelectActivity.a0();
                        return true;
                    }
                }
                return false;
        }
    }
}
