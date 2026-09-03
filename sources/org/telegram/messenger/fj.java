package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fj implements Runnable {
    public final int f17223a = 0;
    public final int f17224b;
    public final boolean f17225c;
    public final boolean d;
    public final Object e;
    public final Serializable f17226f;
    public final Object h;
    public final Object f17227n;
    public final TLObject f17228r;

    public fj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z4, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f17226f = arrayList;
        this.f17225c = z4;
        this.d = z10;
        this.f17228r = message;
        this.h = arrayList2;
        this.f17227n = arrayList3;
        this.f17224b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f17223a) {
            case 0:
                int i11 = this.f17224b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f17226f, this.f17225c, this.d, (TLRPC.Message) this.f17228r, (ArrayList) this.h, (ArrayList) this.f17227n, i11);
                return;
            default:
                org.telegram.ui.ga gaVar = (org.telegram.ui.ga) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17227n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f17228r;
                org.telegram.ui.ra raVar = gaVar.f34369a;
                ArrayList arrayList = raVar.f37782w;
                ArrayList arrayList2 = raVar.v;
                arrayList.remove((String) this.f17226f);
                boolean z4 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f17224b;
                boolean z10 = this.f17225c;
                if (z4) {
                    raVar.i0(i12, z10, false);
                } else {
                    boolean z11 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z10;
                        raVar.i0(i12, z10, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(gaVar, tL_username2, z11, 3));
                        alertDialog$Builder.o();
                    } else {
                        raVar.j0(tL_username2, z11, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(raVar.g0()));
                raVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (raVar.f37783x != 0 && arrayList2 != null) {
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
                        raVar.j0(tL_username, true, false);
                        raVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fj(org.telegram.ui.ga gaVar, String str, TLObject tLObject, int i10, boolean z4, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.e = gaVar;
        this.f17226f = str;
        this.h = tLObject;
        this.f17224b = i10;
        this.f17225c = z4;
        this.f17227n = tL_error;
        this.f17228r = tL_username;
        this.d = z10;
    }
}
