package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fj implements Runnable {
    public final int f18690a = 0;
    public final int f18691b;
    public final boolean f18692c;
    public final boolean d;
    public final Object f18693e;
    public final Serializable f18694f;
    public final Object h;
    public final Object f18695n;
    public final TLObject f18696r;

    public fj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z4, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.f18693e = sendMessagesHelper;
        this.f18694f = arrayList;
        this.f18692c = z4;
        this.d = z10;
        this.f18696r = message;
        this.h = arrayList2;
        this.f18695n = arrayList3;
        this.f18691b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f18690a) {
            case 0:
                int i11 = this.f18691b;
                ((SendMessagesHelper) this.f18693e).lambda$performSendMessageRequest$96((ArrayList) this.f18694f, this.f18692c, this.d, (TLRPC.Message) this.f18696r, (ArrayList) this.h, (ArrayList) this.f18695n, i11);
                return;
            default:
                org.telegram.ui.ea eaVar = (org.telegram.ui.ea) this.f18693e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18695n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f18696r;
                org.telegram.ui.pa paVar = eaVar.f36453a;
                ArrayList arrayList = paVar.f39999w;
                ArrayList arrayList2 = paVar.v;
                arrayList.remove((String) this.f18694f);
                boolean z4 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f18691b;
                boolean z10 = this.f18692c;
                if (z4) {
                    paVar.i0(i12, z10, false);
                } else {
                    boolean z11 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z10;
                        paVar.i0(i12, z10, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(paVar.getParentActivity(), 0, paVar.getResourceProvider());
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(eaVar, tL_username2, z11, 3));
                        alertDialog$Builder.o();
                    } else {
                        paVar.j0(tL_username2, z11, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) paVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(paVar.g0()));
                paVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (paVar.f40000x != 0 && arrayList2 != null) {
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
                        paVar.j0(tL_username, true, false);
                        paVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fj(org.telegram.ui.ea eaVar, String str, TLObject tLObject, int i10, boolean z4, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.f18693e = eaVar;
        this.f18694f = str;
        this.h = tLObject;
        this.f18691b = i10;
        this.f18692c = z4;
        this.f18695n = tL_error;
        this.f18696r = tL_username;
        this.d = z10;
    }
}
