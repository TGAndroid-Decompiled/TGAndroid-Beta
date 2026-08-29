package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aj implements Runnable {
    public final int f19739a = 0;
    public final int f19740b;
    public final boolean f19741c;
    public final boolean d;
    public final Object f19742e;
    public final Serializable f19743f;
    public final Object h;
    public final Object f19744n;
    public final TLObject f19745r;

    public aj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.f19742e = sendMessagesHelper;
        this.f19743f = arrayList;
        this.f19741c = z10;
        this.d = z11;
        this.f19745r = message;
        this.h = arrayList2;
        this.f19744n = arrayList3;
        this.f19740b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f19739a) {
            case 0:
                int i11 = this.f19740b;
                ((SendMessagesHelper) this.f19742e).lambda$performSendMessageRequest$96((ArrayList) this.f19743f, this.f19741c, this.d, (TLRPC.Message) this.f19745r, (ArrayList) this.h, (ArrayList) this.f19744n, i11);
                return;
            default:
                org.telegram.ui.aa aaVar = (org.telegram.ui.aa) this.f19742e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19744n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f19745r;
                org.telegram.ui.la laVar = aaVar.f36466a;
                ArrayList arrayList = laVar.f40147w;
                ArrayList arrayList2 = laVar.v;
                arrayList.remove((String) this.f19743f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f19740b;
                boolean z11 = this.f19741c;
                if (z10) {
                    laVar.i0(i12, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        laVar.i0(i12, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(laVar.getParentActivity(), 0, laVar.getResourceProvider());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(aaVar, tL_username2, z12, 3));
                        alertDialog$Builder.o();
                    } else {
                        laVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) laVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(laVar.g0()));
                laVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (laVar.f40148x != 0 && arrayList2 != null) {
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
                        laVar.j0(tL_username, true, false);
                        laVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public aj(org.telegram.ui.aa aaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f19742e = aaVar;
        this.f19743f = str;
        this.h = tLObject;
        this.f19740b = i10;
        this.f19741c = z10;
        this.f19744n = tL_error;
        this.f19745r = tL_username;
        this.d = z11;
    }
}
