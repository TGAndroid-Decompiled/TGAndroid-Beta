package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aj implements Runnable {
    public final int f19639a = 0;
    public final int f19640b;
    public final boolean f19641c;
    public final boolean d;
    public final Object e;
    public final Serializable f19642f;
    public final Object h;
    public final Object f19643n;
    public final TLObject f19644r;

    public aj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f19642f = arrayList;
        this.f19641c = z10;
        this.d = z11;
        this.f19644r = message;
        this.h = arrayList2;
        this.f19643n = arrayList3;
        this.f19640b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f19639a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$99((ArrayList) this.f19642f, this.f19641c, this.d, (TLRPC.Message) this.f19644r, (ArrayList) this.h, (ArrayList) this.f19643n, this.f19640b);
                return;
            default:
                org.telegram.ui.ia iaVar = (org.telegram.ui.ia) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19643n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f19644r;
                org.telegram.ui.ta taVar = iaVar.f40078a;
                ArrayList arrayList = taVar.f43583w;
                ArrayList arrayList2 = taVar.v;
                arrayList.remove((String) this.f19642f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f19640b;
                boolean z11 = this.f19641c;
                if (z10) {
                    taVar.j0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        taVar.j0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(taVar.getParentActivity(), 0, taVar.getResourceProvider());
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bi.z3(iaVar, tL_username2, z12, 4));
                        alertDialog$Builder.p();
                    } else {
                        taVar.k0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.r2) taVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(taVar.h0()));
                taVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (taVar.f43584x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        if (((TLRPC.TL_username) obj).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            tL_username = (TLRPC.TL_username) obj2;
                            if (tL_username.editable) {
                            }
                        } else {
                            tL_username = null;
                        }
                    }
                    if (tL_username != null) {
                        taVar.k0(tL_username, true, false);
                        taVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public aj(org.telegram.ui.ia iaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = iaVar;
        this.f19642f = str;
        this.h = tLObject;
        this.f19640b = i10;
        this.f19641c = z10;
        this.f19643n = tL_error;
        this.f19644r = tL_username;
        this.d = z11;
    }
}
