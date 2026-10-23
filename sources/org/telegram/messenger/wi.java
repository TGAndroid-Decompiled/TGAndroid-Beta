package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wi implements Runnable {
    public final int f20012a = 0;
    public final int f20013b;
    public final boolean f20014c;
    public final boolean d;
    public final Object e;
    public final Serializable f20015f;
    public final Object h;
    public final Object f20016n;
    public final TLObject f20017r;

    public wi(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f20015f = arrayList;
        this.f20014c = z10;
        this.d = z11;
        this.f20017r = message;
        this.h = arrayList2;
        this.f20016n = arrayList3;
        this.f20013b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f20012a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$99((ArrayList) this.f20015f, this.f20014c, this.d, (TLRPC.Message) this.f20017r, (ArrayList) this.h, (ArrayList) this.f20016n, this.f20013b);
                return;
            default:
                org.telegram.ui.ha haVar = (org.telegram.ui.ha) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f20016n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f20017r;
                org.telegram.ui.sa saVar = haVar.f37566a;
                ArrayList arrayList = saVar.f41422w;
                ArrayList arrayList2 = saVar.v;
                arrayList.remove((String) this.f20015f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f20013b;
                boolean z11 = this.f20014c;
                if (z10) {
                    saVar.i0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        saVar.i0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(saVar.getParentActivity(), 0, saVar.getResourceProvider());
                        alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.e4(haVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        saVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) saVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(saVar.g0()));
                saVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (saVar.f41423x != 0 && arrayList2 != null) {
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
                        saVar.j0(tL_username, true, false);
                        saVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wi(org.telegram.ui.ha haVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = haVar;
        this.f20015f = str;
        this.h = tLObject;
        this.f20013b = i10;
        this.f20014c = z10;
        this.f20016n = tL_error;
        this.f20017r = tL_username;
        this.d = z11;
    }
}
