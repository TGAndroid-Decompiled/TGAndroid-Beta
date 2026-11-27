package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class sha extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final eja r;

    public sha(eja ejaVar, Context context) {
        this.r = ejaVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 14 && i != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j) {
        e eVar = this.r.y1;
        if (!this.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser o1 = eVar.getMessagesController().o1(F());
            tL_messages_getCommonChats.user_id = o1;
            if (o1 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j;
            this.e = true;
            f();
            this.n = eVar.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new yp9(this, (byte) 2));
            eVar.getConnectionsManager().bindRequestToGuid(this.n, eVar.getClassGuid());
        }
    }

    public final long F() {
        eja ejaVar = this.r;
        long j = ejaVar.m1;
        if (wf3.B(j)) {
            return ejaVar.y1.getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L))).user_id;
        }
        return j;
    }

    public final boolean G() {
        TLRPC.User X1;
        if (!this.d.isEmpty() && (X1 = this.r.y1.getMessagesController().X1(Long.valueOf(F()))) != null && !X1.bot && !X1.self && !lbc.z(X1)) {
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
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z = false;
        if (i2 == 14) {
            if (view instanceof bv8) {
                bv8 bv8Var = (bv8) view;
                if (G()) {
                    i--;
                }
                ArrayList arrayList = this.d;
                bv8Var.C((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
                if (i != arrayList.size() - 1 || !this.h) {
                    z = true;
                }
                bv8Var.N = z;
            }
        } else if (i2 == 25 && (view instanceof ij6)) {
            ((ij6) view).b(2131232181, 5, ob6.a0(null, null, 2131751710, lbc.k(this.r.y1.getMessagesController().X1(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        bv8 bv8Var;
        eja ejaVar = this.r;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i != 14) {
            if (i != 15) {
                if (i != 25) {
                    tk4 tk4Var = new tk4(context, vnbVar);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.x = false;
                    tk4Var.setViewType(1);
                    bv8Var = tk4Var;
                } else {
                    ij6 ij6Var = new ij6(context);
                    ij6Var.a(aob.v6, aob.u6);
                    ij6Var.setTextLeft(hl.C);
                    bv8Var = ij6Var;
                }
            } else {
                ci G = eja.G(6, ejaVar.m1, vnbVar, context);
                G.setLayoutParams(new r79(-1, -1));
                return new f89(G);
            }
        } else {
            bv8Var = new bv8(context, vnbVar);
        }
        return qu6.h(bv8Var, bv8Var, -1, -2);
    }
}
