package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ej implements Runnable {
    public final int f17157a = 0;
    public final int f17158b;
    public final boolean f17159c;
    public final boolean d;
    public final Object e;
    public final Serializable f17160f;
    public final Object h;
    public final Object f17161n;
    public final TLObject f17162r;

    public ej(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z4, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f17160f = arrayList;
        this.f17159c = z4;
        this.d = z10;
        this.f17162r = message;
        this.h = arrayList2;
        this.f17161n = arrayList3;
        this.f17158b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f17157a) {
            case 0:
                int i11 = this.f17158b;
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f17160f, this.f17159c, this.d, (TLRPC.Message) this.f17162r, (ArrayList) this.h, (ArrayList) this.f17161n, i11);
                return;
            default:
                org.telegram.ui.ea eaVar = (org.telegram.ui.ea) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17161n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f17162r;
                org.telegram.ui.pa paVar = eaVar.f33942a;
                ArrayList arrayList = paVar.f37258w;
                ArrayList arrayList2 = paVar.v;
                arrayList.remove((String) this.f17160f);
                boolean z4 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i12 = this.f17158b;
                boolean z10 = this.f17159c;
                if (z4) {
                    paVar.i0(i12, z10, false);
                } else {
                    boolean z11 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z10;
                        paVar.i0(i12, z10, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(paVar.getParentActivity(), 0, paVar.getResourceProvider());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(eaVar, tL_username2, z11, 3));
                        alertDialog$Builder.o();
                    } else {
                        paVar.j0(tL_username2, z11, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) paVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(paVar.g0()));
                paVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (paVar.f37259x != 0 && arrayList2 != null) {
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

    public ej(org.telegram.ui.ea eaVar, String str, TLObject tLObject, int i10, boolean z4, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.e = eaVar;
        this.f17160f = str;
        this.h = tLObject;
        this.f17158b = i10;
        this.f17159c = z4;
        this.f17161n = tL_error;
        this.f17162r = tL_username;
        this.d = z10;
    }
}
