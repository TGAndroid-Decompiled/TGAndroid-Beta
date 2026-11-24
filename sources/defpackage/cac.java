package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.UsersSelectActivity;
public final class cac extends z49 {
    public final Context c;
    public final bu9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public cac(UsersSelectActivity usersSelectActivity, Context context) {
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
            if (!pg3.B(dialog.id)) {
                if (pg3.D(dialog.id)) {
                    TLRPC.User W1 = usersSelectActivity.getMessagesController().W1(Long.valueOf(dialog.id));
                    if (W1 != null && ((usersSelectActivity.H || !m9c.D(W1)) && (!W1.bot || z))) {
                        this.r.add(W1);
                        if (m9c.D(W1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat L0 = usersSelectActivity.getMessagesController().L0(Long.valueOf(-dialog.id));
                    if (z2 && L0 != null) {
                        this.r.add(L0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().W1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        bu9 bu9Var = new bu9(false);
        this.f = bu9Var;
        bu9Var.p = false;
        bu9Var.a = new wta(this, (byte) 28);
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof xc5) {
            ((xc5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
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
        mp3 mp3Var = Utilities.g;
        bac bacVar = new bac(this, str, z2, z, (byte) 0);
        this.h = bacVar;
        mp3Var.d(bacVar, 300L);
    }

    @Override
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            bu9 bu9Var = this.f;
            return bu9Var.e.size() + bu9Var.d.size() + size;
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
    public final void t(defpackage.u69 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cac.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View xc5Var;
        Context context = this.c;
        if (i != 1) {
            xc5Var = new l55(context, null);
        } else {
            xc5Var = new xc5(context, 1, 0, true);
        }
        return new u69(xc5Var);
    }
}
