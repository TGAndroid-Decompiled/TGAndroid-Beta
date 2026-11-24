package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a71 extends ka {
    public final c71 d;

    public a71(c71 c71Var) {
        this.d = c71Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        return ((b71) this.d.c.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String m;
        c71 c71Var = this.d;
        ArrayList arrayList = c71Var.c;
        if (((b71) arrayList.get(i)).a == 2) {
            w8c w8cVar = (w8c) u69Var.a;
            t61 t61Var = ((b71) arrayList.get(i)).c;
            TLObject a2 = c71Var.getMessagesController().a2(t61Var.a);
            boolean z = false;
            String str = null;
            if (a2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) a2;
                if (user.self) {
                    m = jb6.M0(2131745635, null);
                } else {
                    m = bw2.m(0, user.first_name, user.last_name);
                }
                str = m;
            } else if (a2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) a2).title;
            }
            w8cVar.setSelfAsSavedMessages(true);
            String f = v61.f(t61Var.b);
            if (i == arrayList.size() - 1 || ((b71) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            w8cVar.d(a2, str, f, z);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xib xibVar;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        xib xibVar2 = new xib(viewGroup.getContext());
                        xibVar2.k(jb6.M0(2131747648, null), false);
                        xibVar2.g(-1, cmb.o7);
                        anb.h(cmb.c6, null, xibVar2);
                        xibVar = xibVar2;
                    }
                } else {
                    xibVar = new bba(viewGroup.getContext(), (hg9) null);
                }
            } else {
                View w8cVar = new w8c(4, 0, null, viewGroup.getContext(), false, false);
                anb.h(cmb.c6, null, w8cVar);
                view = w8cVar;
            }
            return kt6.h(view, view, -1, -2);
        }
        xib xibVar3 = new xib(viewGroup.getContext());
        xibVar3.o(2131232105, jb6.M0(2131747656, null), true);
        xibVar3.g(cmb.u6, cmb.t6);
        anb.h(cmb.c6, null, xibVar3);
        xibVar = xibVar3;
        view = xibVar;
        return kt6.h(view, view, -1, -2);
    }
}
