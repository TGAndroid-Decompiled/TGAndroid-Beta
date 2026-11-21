package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.StickersActivity;
public final class qf implements RequestDelegate {
    public final int f26419a;
    public final int f26420b;
    public final int f26421c;
    public final Object d;
    public final Object f26422e;

    public qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f26419a = i11;
        this.d = obj;
        this.f26420b = i7;
        this.f26421c = i10;
        this.f26422e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26419a) {
            case 0:
                g0.g3(new jg.o1(this.f26420b, this.f26421c, 8, (ri) this.d, (StickersActivity) this.f26422e, tLObject));
                return;
            case 1:
                mp mpVar = (mp) this.d;
                Runnable runnable = (Runnable) this.f26422e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    mpVar.Q3(messages_dialogs, null, null, this.f26420b, 0, this.f26421c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.g3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                gs0 gs0Var = (gs0) this.d;
                String str = (String) this.f26422e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f26420b;
                        if (i10 == 0 || message.f28452id <= i10) {
                            arrayList.add(new fj(gs0Var.f35646w.f36689y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.g3(new mp0(gs0Var, this.f26421c, arrayList, str, 2));
                return;
        }
    }

    public qf(ri riVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f26419a = 0;
        this.d = riVar;
        this.f26420b = i7;
        this.f26422e = stickersActivity;
        this.f26421c = i10;
    }
}
