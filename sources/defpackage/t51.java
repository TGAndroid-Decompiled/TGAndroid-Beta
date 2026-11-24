package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t51 extends ka {
    public final v51 d;

    public t51(v51 v51Var) {
        this.d = v51Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.c.size();
    }

    @Override
    public final int d(int i) {
        return ((u51) this.d.c.get(i)).a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String m;
        v51 v51Var = this.d;
        ArrayList arrayList = v51Var.c;
        if (((u51) arrayList.get(i)).a == 2) {
            v6c v6cVar = (v6c) s49Var.a;
            m51 m51Var = ((u51) arrayList.get(i)).c;
            TLObject Z1 = v51Var.getMessagesController().Z1(m51Var.a);
            boolean z = false;
            String str = null;
            if (Z1 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) Z1;
                if (user.self) {
                    m = k96.M0(2131745709, null);
                } else {
                    m = qu2.m(0, user.first_name, user.last_name);
                }
                str = m;
            } else if (Z1 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) Z1).title;
            }
            v6cVar.setSelfAsSavedMessages(true);
            String f = o51.f(m51Var.b);
            if (i == arrayList.size() - 1 || ((u51) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            v6cVar.d(Z1, str, f, z);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wgb wgbVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        wgb wgbVar2 = new wgb(viewGroup.getContext());
                        wgbVar2.k(k96.M0(2131747722, null), false);
                        wgbVar2.g(-1, bkb.o7);
                        zkb.h(bkb.c6, null, wgbVar2);
                        wgbVar = wgbVar2;
                    }
                } else {
                    wgbVar = new b9a(viewGroup.getContext(), (de9) null);
                }
            } else {
                View v6cVar = new v6c(4, 0, null, viewGroup.getContext(), false, false);
                zkb.h(bkb.c6, null, v6cVar);
                view = v6cVar;
            }
            return ls6.h(view, view, -1, -2);
        }
        wgb wgbVar3 = new wgb(viewGroup.getContext());
        wgbVar3.o(2131232104, k96.M0(2131747730, null), true);
        wgbVar3.g(bkb.u6, bkb.t6);
        zkb.h(bkb.c6, null, wgbVar3);
        wgbVar = wgbVar3;
        view = wgbVar;
        return ls6.h(view, view, -1, -2);
    }
}
