package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.am0;
import org.telegram.ui.bm0;
import org.telegram.ui.mm0;
import org.telegram.ui.sn;
public final class u7 implements Runnable {
    public final int f2261a;
    public final Object f2262b;
    public final Object f2263c;
    public final Object d;
    public final Object e;
    public final Object f2264f;
    public final Object h;
    public final Object f2265n;

    public u7(ga gaVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.TL_error tL_error) {
        this.f2261a = 1;
        this.f2262b = gaVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f2264f = inputInvoice;
        this.f2263c = callback;
        this.h = xcVar;
        this.f2265n = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.u7.run():void");
    }

    public u7(ga gaVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f2261a = 0;
        this.f2262b = gaVar;
        this.d = zArr;
        this.f2264f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.f2265n = callback2;
        this.f2263c = callback;
    }

    public u7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f2261a = i10;
        this.f2262b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2264f = obj4;
        this.h = obj5;
        this.f2265n = obj6;
        this.f2263c = obj7;
    }

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.f2261a = i10;
        this.f2262b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f2264f = str;
        this.f2265n = obj4;
        this.f2263c = obj5;
    }

    public u7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback callback2) {
        this.f2261a = 16;
        this.f2262b = tL_error;
        this.f2263c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f2264f = tL_inputInvoicePremiumGiftCode;
        this.h = n2Var;
        this.f2265n = callback2;
    }

    public u7(sn snVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, v3 v3Var, String str, pf.c cVar) {
        this.f2261a = 5;
        this.f2262b = snVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.f2265n = v3Var;
        this.f2264f = str;
        this.f2263c = cVar;
    }

    public u7(am0 am0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bm0 bm0Var, TLRPC.TL_error tL_error, mm0 mm0Var) {
        this.f2261a = 10;
        this.f2262b = am0Var;
        this.d = tLObject;
        this.f2264f = str;
        this.e = tL_secureRequiredType;
        this.h = bm0Var;
        this.f2265n = tL_error;
        this.f2263c = mm0Var;
    }
}
