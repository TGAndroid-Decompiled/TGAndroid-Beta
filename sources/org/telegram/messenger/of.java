package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.us0;
import org.telegram.ui.StickersActivity;
public final class of implements RequestDelegate {
    public final int f17261a;
    public final int f17262b;
    public final int f17263c;
    public final Object d;
    public final Object e;

    public of(Object obj, int i10, int i11, Object obj2, int i12) {
        this.f17261a = i12;
        this.d = obj;
        this.f17262b = i10;
        this.f17263c = i11;
        this.e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17261a) {
            case 0:
                i0.g3(new bi.u0(this.f17262b, this.f17263c, 6, (ui) this.d, (StickersActivity) this.e, tLObject));
                return;
            case 1:
                vp vpVar = (vp) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    vpVar.G3(messages_dialogs, null, null, this.f17262b, 0, this.f17263c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        i0.g3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                us0 us0Var = (us0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                        TLRPC.Message message = messages_messages.messages.get(i10);
                        int i11 = this.f17262b;
                        if (i11 == 0 || message.f19814id <= i11) {
                            arrayList.add(new jj(us0Var.f31036w.f33240x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                i0.g3(new ag.g3(us0Var, this.f17263c, arrayList, str, 26));
                return;
        }
    }

    public of(ui uiVar, int i10, StickersActivity stickersActivity, int i11) {
        this.f17261a = 0;
        this.d = uiVar;
        this.f17262b = i10;
        this.e = stickersActivity;
        this.f17263c = i11;
    }
}
