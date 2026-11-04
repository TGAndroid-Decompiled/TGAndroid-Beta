package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dw implements Runnable {
    public final int f22251a = 0;
    public final int f22252b;
    public final boolean f22253c;
    public final boolean d;
    public final Object f22254e;
    public final Serializable f22255f;
    public final Object h;
    public final Object f22256n;
    public final TLObject f22257r;

    public dw(yy yyVar, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i3) {
        this.f22254e = yyVar;
        this.f22255f = arrayList;
        this.f22253c = z10;
        this.d = z11;
        this.f22257r = message;
        this.h = arrayList2;
        this.f22256n = arrayList3;
        this.f22252b = i3;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f22251a;
        TLObject tLObject = this.f22257r;
        Object obj = this.f22256n;
        Object obj2 = this.h;
        Serializable serializable = this.f22255f;
        Object obj3 = this.f22254e;
        switch (i10) {
            case 0:
                yy yyVar = (yy) obj3;
                qr messagesStorage = yyVar.getMessagesStorage();
                boolean z10 = this.f22253c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
                g0.h3(new ci.pa(yyVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z10, (ArrayList) obj, this.f22252b));
                return;
            default:
                org.telegram.ui.ba baVar = (org.telegram.ui.ba) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.ka kaVar = baVar.f44006a;
                ArrayList arrayList = kaVar.f46847x;
                ArrayList arrayList2 = kaVar.f46846w;
                arrayList.remove((String) serializable);
                boolean z11 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f22252b;
                boolean z12 = this.f22253c;
                TLRPC.TL_username tL_username2 = null;
                if (z11) {
                    kaVar.n0(i11, z12, false);
                } else {
                    boolean z13 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username.active = z12;
                        kaVar.n0(i11, z12, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kaVar.getParentActivity(), kaVar.getResourceProvider());
                        String M0 = bd.M0(2131743682, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131743683, null);
                        alertDialog$Builder.k(bd.M0(2131747839, null), new ci.l3(baVar, tL_username, z13, 3));
                        alertDialog$Builder.p();
                    } else {
                        kaVar.o0(tL_username, z13, true);
                    }
                }
                i3 = ((org.telegram.ui.ActionBar.d2) kaVar).currentAccount;
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(kaVar.l0()));
                kaVar.getMessagesController().t5(a22, tL_username.username, tL_username.active);
                if (kaVar.f46848y != 0 && arrayList2 != null) {
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
                        kaVar.o0(tL_username2, true, false);
                        kaVar.getMessagesController().t5(a22, tL_username2.username, tL_username2.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public dw(org.telegram.ui.ba baVar, String str, TLObject tLObject, int i3, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f22254e = baVar;
        this.f22255f = str;
        this.h = tLObject;
        this.f22252b = i3;
        this.f22253c = z10;
        this.f22256n = tL_error;
        this.f22257r = tL_username;
        this.d = z11;
    }
}
