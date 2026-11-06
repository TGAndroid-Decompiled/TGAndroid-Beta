package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lw implements Runnable {
    public final int f23927a = 0;
    public final int f23928b;
    public final boolean f23929c;
    public final boolean d;
    public final Object f23930e;
    public final Serializable f23931f;
    public final Object h;
    public final Object f23932n;
    public final TLObject f23933r;

    public lw(gz gzVar, ArrayList arrayList, boolean z9, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i7) {
        this.f23930e = gzVar;
        this.f23931f = arrayList;
        this.f23929c = z9;
        this.d = z10;
        this.f23933r = message;
        this.h = arrayList2;
        this.f23932n = arrayList3;
        this.f23928b = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f23927a;
        TLObject tLObject = this.f23933r;
        Object obj = this.f23932n;
        Object obj2 = this.h;
        Serializable serializable = this.f23931f;
        Object obj3 = this.f23930e;
        switch (i10) {
            case 0:
                gz gzVar = (gz) obj3;
                yr messagesStorage = gzVar.getMessagesStorage();
                boolean z9 = this.f23929c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z9 ? 1 : 0, 0L);
                g0.h3(new bi.sb(gzVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z9, (ArrayList) obj, this.f23928b));
                return;
            default:
                org.telegram.ui.ca caVar = (org.telegram.ui.ca) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.la laVar = caVar.f44708a;
                ArrayList arrayList = laVar.f47464x;
                ArrayList arrayList2 = laVar.f47463w;
                arrayList.remove((String) serializable);
                boolean z10 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f23928b;
                boolean z11 = this.f23929c;
                TLRPC.TL_username tL_username2 = null;
                if (z10) {
                    laVar.n0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z11;
                        laVar.n0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                        String M0 = hd.M0(2131743673, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M0;
                        u1Var.T = hd.M0(2131743674, null);
                        alertDialog$Builder.k(hd.M0(2131747830, null), new ab.j(caVar, tL_username, z12, 4));
                        alertDialog$Builder.p();
                    } else {
                        laVar.o0(tL_username, z12, true);
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.f2) laVar).currentAccount;
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(laVar.l0()));
                laVar.getMessagesController().t5(a22, tL_username.username, tL_username.active);
                if (laVar.f47465y != 0 && arrayList2 != null) {
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
                        laVar.getMessagesController().t5(a22, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lw(org.telegram.ui.ca caVar, String str, TLObject tLObject, int i7, boolean z9, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.f23930e = caVar;
        this.f23931f = str;
        this.h = tLObject;
        this.f23928b = i7;
        this.f23929c = z9;
        this.f23932n = tL_error;
        this.f23933r = tL_username;
        this.d = z10;
    }
}
