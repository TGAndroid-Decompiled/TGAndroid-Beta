package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class bga extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final nha r;

    public bga(nha nhaVar, Context context) {
        this.r = nhaVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 14 && i != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j) {
        d dVar = this.r.y1;
        if (!this.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser n1 = dVar.getMessagesController().n1(F());
            tL_messages_getCommonChats.user_id = n1;
            if (n1 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j;
            this.e = true;
            f();
            this.n = dVar.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new go9(this, (byte) 2));
            dVar.getConnectionsManager().bindRequestToGuid(this.n, dVar.getClassGuid());
        }
    }

    public final long F() {
        nha nhaVar = this.r;
        long j = nhaVar.m1;
        if (pg3.B(j)) {
            return nhaVar.y1.getMessagesController().Z0(Integer.valueOf((int) (j & 4294967295L))).user_id;
        }
        return j;
    }

    public final boolean G() {
        TLRPC.User W1;
        if (!this.d.isEmpty() && (W1 = this.r.y1.getMessagesController().W1(Long.valueOf(F()))) != null && !W1.bot && !W1.self && !m9c.z(W1)) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty()) {
            if (G()) {
                size++;
            }
            if (!this.h) {
                return size + 1;
            }
            return size;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 15;
        }
        if (G()) {
            if (i == 0) {
                return 25;
            }
            i--;
        }
        if (i < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z = false;
        if (i2 == 14) {
            if (view instanceof ut8) {
                ut8 ut8Var = (ut8) view;
                if (G()) {
                    i--;
                }
                ArrayList arrayList = this.d;
                ut8Var.x((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
                if (i != arrayList.size() - 1 || !this.h) {
                    z = true;
                }
                ut8Var.N = z;
            }
        } else if (i2 == 25 && (view instanceof fj6)) {
            ((fj6) view).b(2131232182, 5, jb6.a0(null, null, 2131751682, m9c.k(this.r.y1.getMessagesController().W1(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ut8 ut8Var;
        nha nhaVar = this.r;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i != 14) {
            if (i != 15) {
                if (i != 25) {
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.x = false;
                    tk4Var.setViewType(1);
                    ut8Var = tk4Var;
                } else {
                    fj6 fj6Var = new fj6(context);
                    fj6Var.a(cmb.u6, cmb.t6);
                    fj6Var.setTextLeft(gm.C);
                    ut8Var = fj6Var;
                }
            } else {
                bj G = nha.G(6, nhaVar.m1, ylbVar, context);
                G.setLayoutParams(new g69(-1, -1));
                return new u69(G);
            }
        } else {
            ut8Var = new ut8(context, ylbVar);
        }
        return kt6.h(ut8Var, ut8Var, -1, -2);
    }
}
