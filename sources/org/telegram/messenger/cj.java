package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cj implements Runnable {
    public final int f15911a = 0;
    public final int f15912b;
    public final boolean f15913c;
    public final boolean d;
    public final Object e;
    public final Serializable f15914f;
    public final Object h;
    public final Object f15915n;
    public final TLObject f15916r;

    public cj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f15914f = arrayList;
        this.f15913c = z10;
        this.d = z11;
        this.f15916r = message;
        this.h = arrayList2;
        this.f15915n = arrayList3;
        this.f15912b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f15911a) {
            case 0:
                int i11 = this.f15912b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f15914f, this.f15913c, this.d, (TLRPC.Message) this.f15916r, (ArrayList) this.h, (ArrayList) this.f15915n, i11);
                return;
            default:
                org.telegram.ui.fa faVar = (org.telegram.ui.fa) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15915n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f15916r;
                org.telegram.ui.qa qaVar = faVar.f33523a;
                ArrayList arrayList = qaVar.f36823w;
                ArrayList arrayList2 = qaVar.v;
                arrayList.remove((String) this.f15914f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f15912b;
                boolean z11 = this.f15913c;
                if (z10) {
                    qaVar.i0(i12, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        qaVar.i0(i12, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qaVar.getParentActivity(), 0, qaVar.getResourceProvider());
                        alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(faVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        qaVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) qaVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(qaVar.g0()));
                qaVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (qaVar.f36824x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        if (((TLRPC.TL_username) obj).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            tL_username = (TLRPC.TL_username) obj2;
                            if (tL_username.editable) {
                            }
                        } else {
                            tL_username = null;
                        }
                    }
                    if (tL_username != null) {
                        qaVar.j0(tL_username, true, false);
                        qaVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cj(org.telegram.ui.fa faVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = faVar;
        this.f15914f = str;
        this.h = tLObject;
        this.f15912b = i10;
        this.f15913c = z10;
        this.f15915n = tL_error;
        this.f15916r = tL_username;
        this.d = z11;
    }
}
