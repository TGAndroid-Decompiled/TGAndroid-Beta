package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti implements Runnable {
    public final int f19592a = 0;
    public final int f19593b;
    public final boolean f19594c;
    public final boolean d;
    public final Object e;
    public final Serializable f19595f;
    public final Object h;
    public final Object f19596n;
    public final TLObject f19597r;

    public ti(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f19595f = arrayList;
        this.f19594c = z10;
        this.d = z11;
        this.f19597r = message;
        this.h = arrayList2;
        this.f19596n = arrayList3;
        this.f19593b = i10;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.f19592a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$99((ArrayList) this.f19595f, this.f19594c, this.d, (TLRPC.Message) this.f19597r, (ArrayList) this.h, (ArrayList) this.f19596n, this.f19593b);
                return;
            default:
                org.telegram.ui.ja jaVar = (org.telegram.ui.ja) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19596n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f19597r;
                org.telegram.ui.ua uaVar = jaVar.f38119a;
                ArrayList arrayList = uaVar.f41953w;
                ArrayList arrayList2 = uaVar.v;
                arrayList.remove((String) this.f19595f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i11 = this.f19593b;
                boolean z11 = this.f19594c;
                if (z10) {
                    uaVar.i0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        uaVar.i0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uaVar.getParentActivity(), 0, uaVar.getResourceProvider());
                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.f4(jaVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        uaVar.j0(tL_username2, z12, true);
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.n2) uaVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(uaVar.g0()));
                uaVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (uaVar.f41954x != 0 && arrayList2 != null) {
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
                        uaVar.j0(tL_username, true, false);
                        uaVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ti(org.telegram.ui.ja jaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = jaVar;
        this.f19595f = str;
        this.h = tLObject;
        this.f19593b = i10;
        this.f19594c = z10;
        this.f19596n = tL_error;
        this.f19597r = tL_username;
        this.d = z11;
    }
}
