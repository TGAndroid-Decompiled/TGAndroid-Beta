package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.StickersActivity;
public final class qf implements RequestDelegate {
    public final int f26391a;
    public final int f26392b;
    public final int f26393c;
    public final Object d;
    public final Object f26394e;

    public qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.f26391a = i11;
        this.d = obj;
        this.f26392b = i7;
        this.f26393c = i10;
        this.f26394e = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26391a) {
            case 0:
                g0.g3(new jg.o1(this.f26392b, this.f26393c, 8, (ri) this.d, (StickersActivity) this.f26394e, tLObject));
                return;
            case 1:
                mp mpVar = (mp) this.d;
                Runnable runnable = (Runnable) this.f26394e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    mpVar.Q3(messages_dialogs, null, null, this.f26392b, 0, this.f26393c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.g3(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                ds0 ds0Var = (ds0) this.d;
                String str = (String) this.f26394e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.f26392b;
                        if (i10 == 0 || message.f28424id <= i10) {
                            arrayList.add(new fj(ds0Var.f34499w.f35642y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.g3(new kp0(ds0Var, this.f26393c, arrayList, str, 2));
                return;
        }
    }

    public qf(ri riVar, int i7, StickersActivity stickersActivity, int i10) {
        this.f26391a = 0;
        this.d = riVar;
        this.f26392b = i7;
        this.f26394e = stickersActivity;
        this.f26393c = i10;
    }
}
