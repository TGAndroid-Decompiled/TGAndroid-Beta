package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.StickersActivity;
public final class qf implements RequestDelegate {
    public final int f24680a;
    public final int f24681b;
    public final int f24682c;
    public final Object d;
    public final Object f24683e;

    public qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f24680a = i11;
        this.d = obj;
        this.f24681b = i7;
        this.f24682c = i10;
        this.f24683e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24680a) {
            case 0:
                g0.h3(new hi.j4(this.f24681b, this.f24682c, 8, (ui) this.d, (StickersActivity) this.f24683e, tLObject));
                return;
            case 1:
                qp qpVar = (qp) this.d;
                Runnable runnable = (Runnable) this.f24683e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    qpVar.J3(messages_dialogs, null, null, this.f24681b, 0, this.f24682c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                ur0 ur0Var = (ur0) this.d;
                String str = (String) this.f24683e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f24681b;
                        if (i10 == 0 || message.f26973id <= i10) {
                            arrayList.add(new ij(ur0Var.f38715w.f40424x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new pp0(ur0Var, this.f24682c, arrayList, str, 1));
                return;
        }
    }

    public qf(ui uiVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f24680a = 0;
        this.d = uiVar;
        this.f24681b = i7;
        this.f24683e = stickersActivity;
        this.f24682c = i10;
    }
}
