package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b61 extends la {
    public final d61 d;

    public b61(d61 d61Var) {
        this.d = d61Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        return ((c61) this.d.c.get(i)).a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String m;
        d61 d61Var = this.d;
        ArrayList arrayList = d61Var.c;
        if (((c61) arrayList.get(i)).a == 2) {
            vac vacVar = (vac) f89Var.a;
            u51 u51Var = ((c61) arrayList.get(i)).c;
            TLObject b2 = d61Var.getMessagesController().b2(u51Var.a);
            boolean z = false;
            String str = null;
            if (b2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) b2;
                if (user.self) {
                    m = ob6.M0(2131745629, null);
                } else {
                    m = lv2.m(0, user.first_name, user.last_name);
                }
                str = m;
            } else if (b2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) b2).title;
            }
            vacVar.setSelfAsSavedMessages(true);
            String f = w51.f(u51Var.b);
            if (i == arrayList.size() - 1 || ((c61) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            vacVar.d(b2, str, f, z);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        skb skbVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        skb skbVar2 = new skb(viewGroup.getContext());
                        skbVar2.k(ob6.M0(2131747642, null), false);
                        skbVar2.g(-1, aob.p7);
                        yob.h(aob.d6, null, skbVar2);
                        skbVar = skbVar2;
                    }
                } else {
                    skbVar = new rca(viewGroup.getContext(), (uh9) null);
                }
            } else {
                View vacVar = new vac(4, 0, null, viewGroup.getContext(), false, false);
                yob.h(aob.d6, null, vacVar);
                view = vacVar;
            }
            return qu6.h(view, view, -1, -2);
        }
        skb skbVar3 = new skb(viewGroup.getContext());
        skbVar3.o(2131232104, ob6.M0(2131747650, null), true);
        skbVar3.g(aob.v6, aob.u6);
        yob.h(aob.d6, null, skbVar3);
        skbVar = skbVar3;
        view = skbVar;
        return qu6.h(view, view, -1, -2);
    }
}
