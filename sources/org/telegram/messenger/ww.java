package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ww implements Runnable {
    public final int f19141a = 0;
    public final int f19142b;
    public final boolean f19143c;
    public final boolean d;
    public final Object e;
    public final Serializable f19144f;
    public final Object h;
    public final Object f19145n;
    public final TLObject f19146r;

    public ww(qz qzVar, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = qzVar;
        this.f19144f = arrayList;
        this.f19143c = z10;
        this.d = z11;
        this.f19146r = message;
        this.h = arrayList2;
        this.f19145n = arrayList3;
        this.f19142b = i10;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f19141a;
        TLObject tLObject = this.f19146r;
        Object obj = this.f19145n;
        Object obj2 = this.h;
        Serializable serializable = this.f19144f;
        Object obj3 = this.e;
        switch (i11) {
            case 0:
                qz qzVar = (qz) obj3;
                hs messagesStorage = qzVar.getMessagesStorage();
                boolean z10 = this.f19143c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
                i0.g3(new li.m0(qzVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z10, (ArrayList) obj, this.f19142b));
                return;
            default:
                org.telegram.ui.ea eaVar = (org.telegram.ui.ea) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.oa oaVar = eaVar.f36995a;
                ArrayList arrayList = oaVar.f40213x;
                ArrayList arrayList2 = oaVar.f40212w;
                arrayList.remove((String) serializable);
                boolean z11 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f19142b;
                boolean z12 = this.f19143c;
                TLRPC.TL_username tL_username2 = null;
                if (z11) {
                    oaVar.m0(i12, z12, false);
                } else {
                    boolean z13 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z12;
                        oaVar.m0(i12, z12, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, oaVar.getParentActivity(), oaVar.getResourceProvider());
                        String L0 = cd.L0(2131743698, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = cd.L0(2131743699, null);
                        alertDialog$Builder.k(cd.L0(2131747847, null), new ag.v0(eaVar, tL_username, z13, 2));
                        alertDialog$Builder.p();
                    } else {
                        oaVar.n0(tL_username, z13, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.k2) oaVar).currentAccount;
                TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(oaVar.k0()));
                oaVar.getMessagesController().q5(Z1, tL_username.username, tL_username.active);
                if (oaVar.f40214y != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        if (((TLRPC.TL_username) obj4).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            Object obj5 = arrayList2.get(i14);
                            i14++;
                            TLRPC.TL_username tL_username3 = (TLRPC.TL_username) obj5;
                            if (tL_username3.editable) {
                                tL_username2 = tL_username3;
                            }
                        }
                    }
                    if (tL_username2 != null) {
                        oaVar.n0(tL_username2, true, false);
                        oaVar.getMessagesController().q5(Z1, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ww(org.telegram.ui.ea eaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = eaVar;
        this.f19144f = str;
        this.h = tLObject;
        this.f19142b = i10;
        this.f19143c = z10;
        this.f19145n = tL_error;
        this.f19146r = tL_username;
        this.d = z11;
    }
}
