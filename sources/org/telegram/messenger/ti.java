package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti implements Runnable {
    public final int f21596a = 0;
    public final int f21597b;
    public final boolean f21598c;
    public final boolean d;
    public final Object f21599e;
    public final Serializable f21600f;
    public final Object h;
    public final Object f21601n;
    public final TLObject f21602r;

    public ti(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i9) {
        this.f21599e = sendMessagesHelper;
        this.f21600f = arrayList;
        this.f21598c = z10;
        this.d = z11;
        this.f21602r = message;
        this.h = arrayList2;
        this.f21601n = arrayList3;
        this.f21597b = i9;
    }

    @Override
    public final void run() {
        int i9;
        TLRPC.TL_username tL_username;
        switch (this.f21596a) {
            case 0:
                int i10 = this.f21597b;
                ((SendMessagesHelper) this.f21599e).lambda$performSendMessageRequest$96((ArrayList) this.f21600f, this.f21598c, this.d, (TLRPC.Message) this.f21602r, (ArrayList) this.h, (ArrayList) this.f21601n, i10);
                return;
            default:
                org.telegram.ui.ba baVar = (org.telegram.ui.ba) this.f21599e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21601n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f21602r;
                org.telegram.ui.ma maVar = baVar.f36798a;
                ArrayList arrayList = maVar.f40369w;
                ArrayList arrayList2 = maVar.v;
                arrayList.remove((String) this.f21600f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f21597b;
                boolean z11 = this.f21598c;
                if (z10) {
                    maVar.h0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        maVar.h0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(maVar.getParentActivity(), 0, maVar.getResourceProvider());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.e(baVar, tL_username2, z12, 3));
                        alertDialog$Builder.o();
                    } else {
                        maVar.i0(tL_username2, z12, true);
                    }
                }
                i9 = ((org.telegram.ui.ActionBar.o2) maVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(maVar.f0()));
                maVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (maVar.f40370x != 0 && arrayList2 != null) {
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
                        maVar.i0(tL_username, true, false);
                        maVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ti(org.telegram.ui.ba baVar, String str, TLObject tLObject, int i9, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f21599e = baVar;
        this.f21600f = str;
        this.h = tLObject;
        this.f21597b = i9;
        this.f21598c = z10;
        this.f21601n = tL_error;
        this.f21602r = tL_username;
        this.d = z11;
    }
}
