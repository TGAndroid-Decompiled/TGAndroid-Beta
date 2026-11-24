package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class kf1 implements Runnable {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final Serializable f;
    public final TLObject h;
    public final Object n;
    public final Object r;

    public kf1(lf1 lf1Var, String str, TLObject tLObject, int i, boolean z, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z2) {
        this.e = lf1Var;
        this.f = str;
        this.h = tLObject;
        this.d = i;
        this.b = z;
        this.n = tL_error;
        this.r = tL_username;
        this.c = z2;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        TLObject tLObject = this.h;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                lf1 lf1Var = (lf1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                uf1 uf1Var = lf1Var.a;
                ArrayList arrayList = uf1Var.x;
                ArrayList arrayList2 = uf1Var.w;
                arrayList.remove((String) serializable);
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                int i2 = this.d;
                boolean z2 = this.b;
                TLRPC.TL_username tL_username2 = null;
                if (z) {
                    uf1Var.n0(i2, z2, false);
                } else {
                    boolean z3 = this.c;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z2;
                        uf1Var.n0(i2, z2, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uf1Var.getResourceProvider(), uf1Var.getParentActivity());
                        String M0 = jb6.M0(2131743359, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131743360, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), new ci(lf1Var, tL_username, z3, (byte) 4));
                        alertDialog$Builder.o();
                    } else {
                        uf1Var.o0(tL_username, z3, true);
                    }
                }
                i = ((d) uf1Var).currentAccount;
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(uf1Var.f0()));
                uf1Var.getMessagesController().B5(W1, tL_username.username, tL_username.active);
                if (uf1Var.y != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        if (((TLRPC.TL_username) obj4).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj5 = arrayList2.get(i4);
                            i4++;
                            TLRPC.TL_username tL_username3 = (TLRPC.TL_username) obj5;
                            if (tL_username3.editable) {
                                tL_username2 = tL_username3;
                            }
                        }
                    }
                    if (tL_username2 != null) {
                        uf1Var.o0(tL_username2, true, false);
                        uf1Var.getMessagesController().B5(W1, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
            default:
                a6a a6aVar = (a6a) obj3;
                cf7 messagesStorage = a6aVar.getMessagesStorage();
                boolean z4 = this.b;
                messagesStorage.g1((ArrayList) serializable, true, false, false, 0, false, !z4 ? 1 : 0, 0L);
                gm.c3(new jn9(a6aVar, this.c, (TLRPC.Message) tLObject, (ArrayList) obj2, z4, (ArrayList) obj, this.d));
                return;
        }
    }

    public kf1(a6a a6aVar, ArrayList arrayList, boolean z, boolean z2, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.e = a6aVar;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = message;
        this.n = arrayList2;
        this.r = arrayList3;
        this.d = i;
    }
}
