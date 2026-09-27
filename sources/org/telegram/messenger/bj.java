package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bj implements Runnable {
    public final int f16014a = 0;
    public final int f16015b;
    public final boolean f16016c;
    public final boolean d;
    public final Object e;
    public final Serializable f16017f;
    public final Object h;
    public final Object f16018n;
    public final TLObject f16019r;

    public bj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f16017f = arrayList;
        this.f16016c = z10;
        this.d = z11;
        this.f16019r = message;
        this.h = arrayList2;
        this.f16018n = arrayList3;
        this.f16015b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f16014a) {
            case 0:
                int i11 = this.f16015b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f16017f, this.f16016c, this.d, (TLRPC.Message) this.f16019r, (ArrayList) this.h, (ArrayList) this.f16018n, i11);
                return;
            default:
                org.telegram.ui.ia iaVar = (org.telegram.ui.ia) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16018n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f16019r;
                org.telegram.ui.ta taVar = iaVar.f34408a;
                ArrayList arrayList = taVar.f37742w;
                ArrayList arrayList2 = taVar.v;
                arrayList.remove((String) this.f16017f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f16015b;
                boolean z11 = this.f16016c;
                if (z10) {
                    taVar.i0(i12, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        taVar.i0(i12, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(taVar.getParentActivity(), 0, taVar.getResourceProvider());
                        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(iaVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        taVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) taVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(taVar.g0()));
                taVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (taVar.f37743x != 0 && arrayList2 != null) {
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
                        taVar.j0(tL_username, true, false);
                        taVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bj(org.telegram.ui.ia iaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = iaVar;
        this.f16017f = str;
        this.h = tLObject;
        this.f16015b = i10;
        this.f16016c = z10;
        this.f16018n = tL_error;
        this.f16019r = tL_username;
        this.d = z11;
    }
}
