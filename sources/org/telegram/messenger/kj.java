package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kj implements Runnable {
    public final int f15646a = 0;
    public final int f15647b;
    public final boolean f15648c;
    public final boolean d;
    public final Object e;
    public final Serializable f15649f;
    public final Object h;
    public final Object f15650n;
    public final TLObject f15651r;

    public kj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f15649f = arrayList;
        this.f15648c = z10;
        this.d = z11;
        this.f15651r = message;
        this.h = arrayList2;
        this.f15650n = arrayList3;
        this.f15647b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f15646a) {
            case 0:
                int i11 = this.f15647b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f15649f, this.f15648c, this.d, (TLRPC.Message) this.f15651r, (ArrayList) this.h, (ArrayList) this.f15650n, i11);
                return;
            default:
                org.telegram.ui.ga gaVar = (org.telegram.ui.ga) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15650n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f15651r;
                org.telegram.ui.ra raVar = gaVar.f33049a;
                ArrayList arrayList = raVar.f36279w;
                ArrayList arrayList2 = raVar.v;
                arrayList.remove((String) this.f15649f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f15647b;
                boolean z11 = this.f15648c;
                if (z10) {
                    raVar.i0(i12, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        raVar.i0(i12, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(gaVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        raVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(raVar.g0()));
                raVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (raVar.f36280x != 0 && arrayList2 != null) {
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

    public kj(org.telegram.ui.ga gaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = gaVar;
        this.f15649f = str;
        this.h = tLObject;
        this.f15647b = i10;
        this.f15648c = z10;
        this.f15650n = tL_error;
        this.f15651r = tL_username;
        this.d = z11;
    }
}
