package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.StickersActivity;
public final class pf implements RequestDelegate {
    public final int f25925a;
    public final int f25926b;
    public final int f25927c;
    public final Object d;
    public final Object f25928e;

    public pf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f25925a = i11;
        this.d = obj;
        this.f25926b = i7;
        this.f25927c = i10;
        this.f25928e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25925a) {
            case 0:
                g0.h3(new jg.o1(this.f25926b, this.f25927c, 8, (si) this.d, (StickersActivity) this.f25928e, tLObject));
                return;
            case 1:
                np npVar = (np) this.d;
                Runnable runnable = (Runnable) this.f25928e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    npVar.J3(messages_dialogs, null, null, this.f25926b, 0, this.f25927c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                vr0 vr0Var = (vr0) this.d;
                String str = (String) this.f25928e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f25926b;
                        if (i10 == 0 || message.f28072id <= i10) {
                            arrayList.add(new gj(vr0Var.f41143w.f42152y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new sp0(vr0Var, this.f25927c, arrayList, str, 1));
                return;
        }
    }

    public pf(si siVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f25925a = 0;
        this.d = siVar;
        this.f25926b = i7;
        this.f25928e = stickersActivity;
        this.f25927c = i10;
    }
}
