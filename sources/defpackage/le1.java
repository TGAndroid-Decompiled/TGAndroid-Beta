package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class le1 implements Runnable {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Object e;
    public final Serializable f;
    public final TLObject h;
    public final Object n;
    public final Object r;

    public le1(me1 me1Var, String str, TLObject tLObject, int i, boolean z, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z2) {
        this.e = me1Var;
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
                me1 me1Var = (me1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                ve1 ve1Var = me1Var.a;
                ArrayList arrayList = ve1Var.x;
                ArrayList arrayList2 = ve1Var.w;
                arrayList.remove((String) serializable);
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                int i2 = this.d;
                boolean z2 = this.b;
                TLRPC.TL_username tL_username2 = null;
                if (z) {
                    ve1Var.m0(i2, z2, false);
                } else {
                    boolean z3 = this.c;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z2;
                        ve1Var.m0(i2, z2, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ve1Var.getResourceProvider(), ve1Var.getParentActivity());
                        String M0 = ob6.M0(2131743327, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131743328, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), new bh(me1Var, tL_username, z3, (byte) 4));
                        alertDialog$Builder.o();
                    } else {
                        ve1Var.n0(tL_username, z3, true);
                    }
                }
                i = ((e) ve1Var).currentAccount;
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(ve1Var.e0()));
                ve1Var.getMessagesController().H5(X1, tL_username.username, tL_username.active);
                if (ve1Var.y != 0 && arrayList2 != null) {
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
                        ve1Var.n0(tL_username2, true, false);
                        ve1Var.getMessagesController().H5(X1, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
            default:
                r7a r7aVar = (r7a) obj3;
                jf7 messagesStorage = r7aVar.getMessagesStorage();
                boolean z4 = this.b;
                messagesStorage.g1((ArrayList) serializable, true, false, false, 0, false, !z4 ? 1 : 0, 0L);
                hl.c3(new vo9(r7aVar, this.c, (TLRPC.Message) tLObject, (ArrayList) obj2, z4, (ArrayList) obj, this.d));
                return;
        }
    }

    public le1(r7a r7aVar, ArrayList arrayList, boolean z, boolean z2, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.e = r7aVar;
        this.f = arrayList;
        this.b = z;
        this.c = z2;
        this.h = message;
        this.n = arrayList2;
        this.r = arrayList3;
        this.d = i;
    }
}
