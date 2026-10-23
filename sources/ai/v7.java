package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cm0;
import org.telegram.ui.dm0;
import org.telegram.ui.om0;
import org.telegram.ui.sn;
public final class v7 implements Runnable {
    public final int f2313a;
    public final Object f2314b;
    public final Object f2315c;
    public final Object d;
    public final Object e;
    public final Object f2316f;
    public final Object h;
    public final Object f2317n;

    public v7(ha haVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.TL_error tL_error) {
        this.f2313a = 1;
        this.f2314b = haVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f2316f = inputInvoice;
        this.f2315c = callback;
        this.h = xcVar;
        this.f2317n = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.v7.run():void");
    }

    public v7(ha haVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f2313a = 0;
        this.f2314b = haVar;
        this.d = zArr;
        this.f2316f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.f2317n = callback2;
        this.f2315c = callback;
    }

    public v7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f2313a = i10;
        this.f2314b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2316f = obj4;
        this.h = obj5;
        this.f2317n = obj6;
        this.f2315c = obj7;
    }

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.f2313a = i10;
        this.f2314b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f2316f = str;
        this.f2317n = obj4;
        this.f2315c = obj5;
    }

    public v7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback callback2) {
        this.f2313a = 16;
        this.f2314b = tL_error;
        this.f2315c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f2316f = tL_inputInvoicePremiumGiftCode;
        this.h = o2Var;
        this.f2317n = callback2;
    }

    public v7(sn snVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, x3 x3Var, String str, pf.c cVar) {
        this.f2313a = 5;
        this.f2314b = snVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.f2317n = x3Var;
        this.f2316f = str;
        this.f2315c = cVar;
    }

    public v7(cm0 cm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, dm0 dm0Var, TLRPC.TL_error tL_error, om0 om0Var) {
        this.f2313a = 10;
        this.f2314b = cm0Var;
        this.d = tLObject;
        this.f2316f = str;
        this.e = tL_secureRequiredType;
        this.h = dm0Var;
        this.f2317n = tL_error;
        this.f2315c = om0Var;
    }
}
