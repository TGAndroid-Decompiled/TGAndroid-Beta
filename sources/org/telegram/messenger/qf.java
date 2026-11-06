package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.StickersActivity;
public final class qf implements RequestDelegate {
    public final int f24688a;
    public final int f24689b;
    public final int f24690c;
    public final Object d;
    public final Object f24691e;

    public qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f24688a = i11;
        this.d = obj;
        this.f24689b = i7;
        this.f24690c = i10;
        this.f24691e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24688a) {
            case 0:
                g0.h3(new hi.j4(this.f24689b, this.f24690c, 8, (ui) this.d, (StickersActivity) this.f24691e, tLObject));
                return;
            case 1:
                qp qpVar = (qp) this.d;
                Runnable runnable = (Runnable) this.f24691e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    qpVar.J3(messages_dialogs, null, null, this.f24689b, 0, this.f24690c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                ur0 ur0Var = (ur0) this.d;
                String str = (String) this.f24691e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f24689b;
                        if (i10 == 0 || message.f26974id <= i10) {
                            arrayList.add(new ij(ur0Var.f38711w.f40440x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new pp0(ur0Var, this.f24690c, arrayList, str, 1));
                return;
        }
    }

    public qf(ui uiVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f24688a = 0;
        this.d = uiVar;
        this.f24689b = i7;
        this.f24691e = stickersActivity;
        this.f24690c = i10;
    }
}
