package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.StickersActivity;
public final class hf implements RequestDelegate {
    public final int f22918a;
    public final int f22919b;
    public final int f22920c;
    public final Object d;
    public final Object f22921e;

    public hf(Object obj, int i3, int i10, Object obj2, int i11) {
        this.f22918a = i11;
        this.d = obj;
        this.f22919b = i3;
        this.f22920c = i10;
        this.f22921e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22918a) {
            case 0:
                g0.h3(new ii.j4(this.f22919b, this.f22920c, 8, (li) this.d, (StickersActivity) this.f22921e, tLObject));
                return;
            case 1:
                hp hpVar = (hp) this.d;
                Runnable runnable = (Runnable) this.f22921e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    hpVar.J3(messages_dialogs, null, null, this.f22919b, 0, this.f22920c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                tr0 tr0Var = (tr0) this.d;
                String str = (String) this.f22921e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                        TLRPC.Message message = messages_messages.messages.get(i3);
                        int i10 = this.f22919b;
                        if (i10 == 0 || message.f27022id <= i10) {
                            arrayList.add(new zi(tr0Var.f38544w.f40142y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new zo0(tr0Var, this.f22920c, arrayList, str, 2));
                return;
        }
    }

    public hf(li liVar, int i3, StickersActivity stickersActivity, int i10) {
        this.f22918a = 0;
        this.d = liVar;
        this.f22919b = i3;
        this.f22921e = stickersActivity;
        this.f22920c = i10;
    }
}
