package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class xi implements Runnable {

    public final int f22167a = 0;

    public final int f22168b;

    public final boolean f22169c;
    public final boolean d;

    public final Object f22170e;

    public final Serializable f22171f;
    public final Object h;

    public final Object f22172n;

    public final TLObject f22173r;

    public xi(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.f22170e = sendMessagesHelper;
        this.f22171f = arrayList;
        this.f22169c = z10;
        this.d = z11;
        this.f22173r = message;
        this.h = arrayList2;
        this.f22172n = arrayList3;
        this.f22168b = i10;
    }

    @Override
    public final void run() {
        TLRPC.TL_username tL_username;
        switch (this.f22167a) {
            case 0:
                ((SendMessagesHelper) this.f22170e).lambda$performSendMessageRequest$96((ArrayList) this.f22171f, this.f22169c, this.d, (TLRPC.Message) this.f22173r, (ArrayList) this.h, (ArrayList) this.f22172n, this.f22168b);
                break;
            default:
                org.telegram.ui.ca caVar = (org.telegram.ui.ca) this.f22170e;
                String str = (String) this.f22171f;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f22172n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f22173r;
                org.telegram.ui.na naVar = caVar.f37034a;
                ArrayList arrayList = naVar.f40708w;
                ArrayList arrayList2 = naVar.v;
                arrayList.remove(str);
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                int i10 = this.f22168b;
                boolean z11 = this.f22169c;
                if (z10) {
                    naVar.i0(i10, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        naVar.j0(tL_username2, z12, true);
                    } else {
                        tL_username2.active = z11;
                        naVar.i0(i10, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(naVar.getParentActivity(), 0, naVar.getResourceProvider());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.d(caVar, tL_username2, z12, 3));
                        alertDialog$Builder.o();
                    }
                }
                TLRPC.User user = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) naVar).currentAccount).getUser(Long.valueOf(naVar.g0()));
                naVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (naVar.f40709x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        if (((TLRPC.TL_username) obj).active) {
                            break;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    do {
                        if (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            tL_username = (TLRPC.TL_username) obj2;
                        } else {
                            tL_username = null;
                        }
                        if (tL_username != null) {
                            naVar.j0(tL_username, true, false);
                            naVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        }
                        break;
                    } while (!tL_username.editable);
                    if (tL_username != null) {
                        naVar.j0(tL_username, true, false);
                        naVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                    }
                    break;
                }
                break;
        }
    }

    public xi(org.telegram.ui.ca caVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f22170e = caVar;
        this.f22171f = str;
        this.h = tLObject;
        this.f22168b = i10;
        this.f22169c = z10;
        this.f22172n = tL_error;
        this.f22173r = tL_username;
        this.d = z11;
    }
}
