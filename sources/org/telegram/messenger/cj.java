package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cj implements Runnable {
    public final int f15920a = 0;
    public final int f15921b;
    public final boolean f15922c;
    public final boolean d;
    public final Object e;
    public final Serializable f15923f;
    public final Object h;
    public final Object f15924n;
    public final TLObject f15925r;

    public cj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f15923f = arrayList;
        this.f15922c = z10;
        this.d = z11;
        this.f15925r = message;
        this.h = arrayList2;
        this.f15924n = arrayList3;
        this.f15921b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f15920a) {
            case 0:
                int i11 = this.f15921b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f15923f, this.f15922c, this.d, (TLRPC.Message) this.f15925r, (ArrayList) this.h, (ArrayList) this.f15924n, i11);
                return;
            default:
                org.telegram.ui.ha haVar = (org.telegram.ui.ha) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15924n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f15925r;
                org.telegram.ui.sa saVar = haVar.f34219a;
                ArrayList arrayList = saVar.f37436w;
                ArrayList arrayList2 = saVar.v;
                arrayList.remove((String) this.f15923f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f15921b;
                boolean z11 = this.f15922c;
                if (z10) {
                    saVar.i0(i12, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        saVar.i0(i12, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(saVar.getParentActivity(), 0, saVar.getResourceProvider());
                        alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(haVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        saVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) saVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(saVar.g0()));
                saVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (saVar.f37437x != 0 && arrayList2 != null) {
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
                        saVar.j0(tL_username, true, false);
                        saVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cj(org.telegram.ui.ha haVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = haVar;
        this.f15923f = str;
        this.h = tLObject;
        this.f15921b = i10;
        this.f15922c = z10;
        this.f15924n = tL_error;
        this.f15925r = tL_username;
        this.d = z11;
    }
}
