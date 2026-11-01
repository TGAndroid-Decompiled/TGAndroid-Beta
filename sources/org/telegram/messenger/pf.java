package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.StickersActivity;
public final class pf implements RequestDelegate {
    public final int f17594a;
    public final int f17595b;
    public final int f17596c;
    public final Object d;
    public final Object e;

    public pf(Object obj, int i10, int i11, Object obj2, int i12) {
        this.f17594a = i12;
        this.d = obj;
        this.f17595b = i10;
        this.f17596c = i11;
        this.e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17594a) {
            case 0:
                i0.g3(new bi.u0(this.f17595b, this.f17596c, 6, (vi) this.d, (StickersActivity) this.e, tLObject));
                return;
            case 1:
                wp wpVar = (wp) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    wpVar.G3(messages_dialogs, null, null, this.f17595b, 0, this.f17596c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        i0.g3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                vs0 vs0Var = (vs0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                        TLRPC.Message message = messages_messages.messages.get(i10);
                        int i11 = this.f17595b;
                        if (i11 == 0 || message.f19815id <= i11) {
                            arrayList.add(new kj(vs0Var.f31904w.f24568x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                i0.g3(new ag.g3(vs0Var, this.f17596c, arrayList, str, 26));
                return;
        }
    }

    public pf(vi viVar, int i10, StickersActivity stickersActivity, int i11) {
        this.f17594a = 0;
        this.d = viVar;
        this.f17595b = i10;
        this.e = stickersActivity;
        this.f17596c = i11;
    }
}
