package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.UsersSelectActivity;
public final class b8c extends w29 {
    public final Context c;
    public final zr9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public b8c(UsersSelectActivity usersSelectActivity, Context context) {
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
            if (!cf3.B(dialog.id)) {
                if (cf3.D(dialog.id)) {
                    TLRPC.User V1 = usersSelectActivity.getMessagesController().V1(Long.valueOf(dialog.id));
                    if (V1 != null && ((usersSelectActivity.H || !l7c.C(V1)) && (!V1.bot || z))) {
                        this.r.add(V1);
                        if (l7c.C(V1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat K0 = usersSelectActivity.getMessagesController().K0(Long.valueOf(-dialog.id));
                    if (z2 && K0 != null) {
                        this.r.add(K0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().V1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        zr9 zr9Var = new zr9(false);
        this.f = zr9Var;
        zr9Var.p = false;
        zr9Var.a = new hza(this, (byte) 24);
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof za5) {
            ((za5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
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
        co3 co3Var = Utilities.g;
        a8c a8cVar = new a8c(this, str, z2, z, (byte) 0);
        this.h = a8cVar;
        co3Var.d(a8cVar, 300L);
    }

    @Override
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            zr9 zr9Var = this.f;
            return zr9Var.e.size() + zr9Var.d.size() + size;
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
    public final void t(defpackage.s49 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View za5Var;
        Context context = this.c;
        if (i != 1) {
            za5Var = new l35(context, null);
        } else {
            za5Var = new za5(context, 1, 0, true);
        }
        return new s49(za5Var);
    }
}
