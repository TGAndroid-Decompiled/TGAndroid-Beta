package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.km0;
import org.telegram.ui.qn;
import org.telegram.ui.yl0;
import org.telegram.ui.zl0;
public final class u7 implements Runnable {
    public final int f2258a;
    public final Object f2259b;
    public final Object f2260c;
    public final Object d;
    public final Object e;
    public final Object f2261f;
    public final Object h;
    public final Object f2262n;

    public u7(ga gaVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.TL_error tL_error) {
        this.f2258a = 1;
        this.f2259b = gaVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f2261f = inputInvoice;
        this.f2260c = callback;
        this.h = xcVar;
        this.f2262n = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.u7.run():void");
    }

    public u7(ga gaVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f2258a = 0;
        this.f2259b = gaVar;
        this.d = zArr;
        this.f2261f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.f2262n = callback2;
        this.f2260c = callback;
    }

    public u7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f2258a = i10;
        this.f2259b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2261f = obj4;
        this.h = obj5;
        this.f2262n = obj6;
        this.f2260c = obj7;
    }

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.f2258a = i10;
        this.f2259b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f2261f = str;
        this.f2262n = obj4;
        this.f2260c = obj5;
    }

    public u7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback callback2) {
        this.f2258a = 16;
        this.f2259b = tL_error;
        this.f2260c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f2261f = tL_inputInvoicePremiumGiftCode;
        this.h = n2Var;
        this.f2262n = callback2;
    }

    public u7(qn qnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, x3 x3Var, String str, pf.c cVar) {
        this.f2258a = 5;
        this.f2259b = qnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.f2262n = x3Var;
        this.f2261f = str;
        this.f2260c = cVar;
    }

    public u7(yl0 yl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, zl0 zl0Var, TLRPC.TL_error tL_error, km0 km0Var) {
        this.f2258a = 10;
        this.f2259b = yl0Var;
        this.d = tLObject;
        this.f2261f = str;
        this.e = tL_secureRequiredType;
        this.h = zl0Var;
        this.f2262n = tL_error;
        this.f2260c = km0Var;
    }
}
