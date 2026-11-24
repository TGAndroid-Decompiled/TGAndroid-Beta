package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class bea extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final nfa r;

    public bea(nfa nfaVar, Context context) {
        this.r = nfaVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 14 && i != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j) {
        d dVar = this.r.y1;
        if (!this.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser m1 = dVar.getMessagesController().m1(F());
            tL_messages_getCommonChats.user_id = m1;
            if (m1 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j;
            this.e = true;
            f();
            this.n = dVar.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new wx9(this, (byte) 1));
            dVar.getConnectionsManager().bindRequestToGuid(this.n, dVar.getClassGuid());
        }
    }

    public final long F() {
        nfa nfaVar = this.r;
        long j = nfaVar.m1;
        if (cf3.B(j)) {
            return nfaVar.y1.getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L))).user_id;
        }
        return j;
    }

    public final boolean G() {
        TLRPC.User V1;
        if (!this.d.isEmpty() && (V1 = this.r.y1.getMessagesController().V1(Long.valueOf(F()))) != null && !V1.bot && !V1.self && !l7c.z(V1)) {
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
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z = false;
        if (i2 == 14) {
            if (view instanceof rr8) {
                rr8 rr8Var = (rr8) view;
                if (G()) {
                    i--;
                }
                ArrayList arrayList = this.d;
                rr8Var.z((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
                if (i != arrayList.size() - 1 || !this.h) {
                    z = true;
                }
                rr8Var.N = z;
            }
        } else if (i2 == 25 && (view instanceof dh6)) {
            ((dh6) view).b(2131232181, 5, k96.a0(null, null, 2131751733, l7c.k(this.r.y1.getMessagesController().V1(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        rr8 rr8Var;
        nfa nfaVar = this.r;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i != 14) {
            if (i != 15) {
                if (i != 25) {
                    pi4 pi4Var = new pi4(context, wjbVar);
                    pi4Var.setIsSingleCell(true);
                    pi4Var.x = false;
                    pi4Var.setViewType(1);
                    rr8Var = pi4Var;
                } else {
                    dh6 dh6Var = new dh6(context);
                    dh6Var.a(bkb.u6, bkb.t6);
                    dh6Var.setTextLeft(gl.C);
                    rr8Var = dh6Var;
                }
            } else {
                bi G = nfa.G(6, nfaVar.m1, wjbVar, context);
                G.setLayoutParams(new e49(-1, -1));
                return new s49(G);
            }
        } else {
            rr8Var = new rr8(context, wjbVar);
        }
        return ls6.h(rr8Var, rr8Var, -1, -2);
    }
}
