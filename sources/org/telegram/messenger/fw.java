package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fw implements Runnable {
    public final int f23999a = 0;
    public final int f24000b;
    public final boolean f24001c;
    public final boolean d;
    public final Object f24002e;
    public final Serializable f24003f;
    public final Object h;
    public final Object f24004n;
    public final TLObject f24005r;

    public fw(az azVar, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i7) {
        this.f24002e = azVar;
        this.f24003f = arrayList;
        this.f24001c = z10;
        this.d = z11;
        this.f24005r = message;
        this.h = arrayList2;
        this.f24004n = arrayList3;
        this.f24000b = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f23999a;
        TLObject tLObject = this.f24005r;
        Object obj = this.f24004n;
        Object obj2 = this.h;
        Serializable serializable = this.f24003f;
        Object obj3 = this.f24002e;
        switch (i10) {
            case 0:
                az azVar = (az) obj3;
                ur messagesStorage = azVar.getMessagesStorage();
                boolean z10 = this.f24001c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
                g0.g3(new di.ia(azVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z10, (ArrayList) obj, this.f24000b));
                return;
            default:
                org.telegram.ui.ca caVar = (org.telegram.ui.ca) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.la laVar = caVar.f46501a;
                ArrayList arrayList = laVar.f49540x;
                ArrayList arrayList2 = laVar.f49539w;
                arrayList.remove((String) serializable);
                boolean z11 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f24000b;
                boolean z12 = this.f24001c;
                TLRPC.TL_username tL_username2 = null;
                if (z11) {
                    laVar.n0(i11, z12, false);
                } else {
                    boolean z13 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z12;
                        laVar.n0(i11, z12, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                        String N0 = hd.N0(2131743427, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N0;
                        t1Var.U = hd.N0(2131743428, null);
                        alertDialog$Builder.k(hd.N0(2131747637, null), new ab.j(caVar, tL_username, z13, 4));
                        alertDialog$Builder.p();
                    } else {
                        laVar.o0(tL_username, z13, true);
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.g2) laVar).currentAccount;
                TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(laVar.l0()));
                laVar.getMessagesController().F5(c22, tL_username.username, tL_username.active);
                if (laVar.f49541y != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        if (((TLRPC.TL_username) obj4).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            Object obj5 = arrayList2.get(i13);
                            i13++;
                            TLRPC.TL_username tL_username3 = (TLRPC.TL_username) obj5;
                            if (tL_username3.editable) {
                                tL_username2 = tL_username3;
                            }
                        }
                    }
                    if (tL_username2 != null) {
                        laVar.o0(tL_username2, true, false);
                        laVar.getMessagesController().F5(c22, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fw(org.telegram.ui.ca caVar, String str, TLObject tLObject, int i7, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f24002e = caVar;
        this.f24003f = str;
        this.h = tLObject;
        this.f24000b = i7;
        this.f24001c = z10;
        this.f24004n = tL_error;
        this.f24005r = tL_username;
        this.d = z11;
    }
}
