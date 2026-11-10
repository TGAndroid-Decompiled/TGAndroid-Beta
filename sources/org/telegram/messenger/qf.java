package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.StickersActivity;
public final class qf implements RequestDelegate {
    public final int f24695a;
    public final int f24696b;
    public final int f24697c;
    public final Object d;
    public final Object f24698e;

    public qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f24695a = i11;
        this.d = obj;
        this.f24696b = i7;
        this.f24697c = i10;
        this.f24698e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24695a) {
            case 0:
                g0.h3(new hi.j4(this.f24696b, this.f24697c, 8, (ui) this.d, (StickersActivity) this.f24698e, tLObject));
                return;
            case 1:
                qp qpVar = (qp) this.d;
                Runnable runnable = (Runnable) this.f24698e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    qpVar.J3(messages_dialogs, null, null, this.f24696b, 0, this.f24697c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                vr0 vr0Var = (vr0) this.d;
                String str = (String) this.f24698e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f24696b;
                        if (i10 == 0 || message.f26981id <= i10) {
                            arrayList.add(new ij(vr0Var.f39725w.f40719x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new pp0(vr0Var, this.f24697c, arrayList, str, 1));
                return;
        }
    }

    public qf(ui uiVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f24695a = 0;
        this.d = uiVar;
        this.f24696b = i7;
        this.f24698e = stickersActivity;
        this.f24697c = i10;
    }
}
