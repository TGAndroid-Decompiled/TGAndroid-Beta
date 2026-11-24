package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;
public final class ia5 implements View.OnKeyListener {
    public final byte a;
    public boolean b;
    public final d c;

    public ia5(d dVar, byte b) {
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
                qa5 qa5Var = (qa5) dVar;
                if (i == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (qa5Var.f.r.length() != 0) {
                            z = false;
                        }
                        this.b = z;
                    } else if (keyEvent.getAction() == 1 && this.b && !qa5Var.b0.isEmpty()) {
                        qa5Var.h.c((ya5) b00.f(1, qa5Var.b0));
                        qa5Var.w0();
                        qa5Var.l0();
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
                        ya5 ya5Var = (ya5) b00.f(1, arrayList);
                        usersSelectActivity.b.b(ya5Var);
                        if (usersSelectActivity.y == 2) {
                            if (ya5Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (ya5Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (ya5Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (ya5Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (ya5Var.getUid() == Long.MIN_VALUE) {
                            int i2 = na7.q5;
                            usersSelectActivity.L &= -2;
                        } else if (ya5Var.getUid() == -9223372036854775807L) {
                            int i3 = na7.q5;
                            usersSelectActivity.L &= -3;
                        } else if (ya5Var.getUid() == -9223372036854775806L) {
                            int i4 = na7.q5;
                            usersSelectActivity.L &= -5;
                        } else if (ya5Var.getUid() == -9223372036854775805L) {
                            int i5 = na7.q5;
                            usersSelectActivity.L &= -9;
                        } else if (ya5Var.getUid() == -9223372036854775804L) {
                            int i6 = na7.q5;
                            usersSelectActivity.L &= -17;
                        } else if (ya5Var.getUid() == -9223372036854775803L) {
                            int i7 = na7.q5;
                            usersSelectActivity.L &= -33;
                        } else if (ya5Var.getUid() == -9223372036854775802L) {
                            int i8 = na7.q5;
                            usersSelectActivity.L &= -65;
                        } else if (ya5Var.getUid() == -9223372036854775801L) {
                            int i9 = na7.q5;
                            usersSelectActivity.L &= -129;
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
