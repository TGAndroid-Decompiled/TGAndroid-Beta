package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.StickersActivity;
public final class rf implements RequestDelegate {
    public final int f26566a;
    public final int f26567b;
    public final int f26568c;
    public final Object d;
    public final Object f26569e;

    public rf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f26566a = i11;
        this.d = obj;
        this.f26567b = i7;
        this.f26568c = i10;
        this.f26569e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26566a) {
            case 0:
                g0.g3(new jg.o1(this.f26567b, this.f26568c, 8, (si) this.d, (StickersActivity) this.f26569e, tLObject));
                return;
            case 1:
                np npVar = (np) this.d;
                Runnable runnable = (Runnable) this.f26569e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    npVar.Q3(messages_dialogs, null, null, this.f26567b, 0, this.f26568c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.g3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                gs0 gs0Var = (gs0) this.d;
                String str = (String) this.f26569e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f26567b;
                        if (i10 == 0 || message.f28419id <= i10) {
                            arrayList.add(new gj(gs0Var.f35625w.f36638y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.g3(new lp0(gs0Var, this.f26568c, arrayList, str, 3));
                return;
        }
    }

    public rf(si siVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f26566a = 0;
        this.d = siVar;
        this.f26567b = i7;
        this.f26569e = stickersActivity;
        this.f26568c = i10;
    }
}
