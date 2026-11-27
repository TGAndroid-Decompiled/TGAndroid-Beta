package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.UsersSelectActivity;
public final class bcc extends l69 {
    public final Context c;
    public final sv9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public bcc(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z;
        boolean z2;
        this.w = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.G) {
            this.s = 0;
        } else {
            byte b = usersSelectActivity.y;
            if (b == 2) {
                this.s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (b == 0) {
                if (usersSelectActivity.K) {
                    this.s = 7;
                } else {
                    this.s = 5;
                }
            } else {
                this.s = 0;
            }
        }
        byte b2 = usersSelectActivity.y;
        if (b2 == 2 && !usersSelectActivity.I) {
            z = false;
        } else {
            z = true;
        }
        if (b2 != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = usersSelectActivity.getMessagesController().y;
        int size = arrayList.size();
        int i = 0;
        boolean z3 = false;
        while (i < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (!wf3.B(dialog.id)) {
                if (wf3.D(dialog.id)) {
                    TLRPC.User X1 = usersSelectActivity.getMessagesController().X1(Long.valueOf(dialog.id));
                    if (X1 != null && ((usersSelectActivity.H || !lbc.D(X1)) && (!X1.bot || z))) {
                        this.r.add(X1);
                        if (lbc.D(X1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.id));
                    if (z2 && M0 != null) {
                        this.r.add(M0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().X1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        sv9 sv9Var = new sv9(false);
        this.f = sv9Var;
        sv9Var.p = false;
        sv9Var.a = new ftb(this, (byte) 7);
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof bd5) {
            ((bd5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z;
        boolean z2;
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        byte b = usersSelectActivity.y;
        if (b == 2 && !usersSelectActivity.I) {
            z = false;
        } else {
            z = true;
        }
        if (b != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.f.f(null, null);
            this.f.g(null, true, false, false, false, 0L, false, 0, 0);
            f();
            return;
        }
        to3 to3Var = Utilities.g;
        acc accVar = new acc(this, str, z2, z, (byte) 0);
        this.h = accVar;
        to3Var.d(accVar, 300L);
    }

    @Override
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            sv9 sv9Var = this.f;
            return sv9Var.e.size() + sv9Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        int i = 0;
        if (!usersSelectActivity.G) {
            byte b = usersSelectActivity.y;
            if (b == 2) {
                i = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (b == 0) {
                i = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.r.size() + i;
    }

    @Override
    public final int d(int i) {
        byte b;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.w;
            if (!usersSelectActivity.G ? !((b = usersSelectActivity.y) != 2 ? b != 0 || (!usersSelectActivity.K ? !(i == 0 || i == 4) : !(i == 0 || i == 6)) : i != 0 && i != (!usersSelectActivity.J ? 1 : 0) + 4) : i == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void t(defpackage.f89 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcc.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View bd5Var;
        Context context = this.c;
        if (i != 1) {
            bd5Var = new p55(context, null);
        } else {
            bd5Var = new bd5(context, 1, 0, true);
        }
        return new f89(bd5Var);
    }
}
