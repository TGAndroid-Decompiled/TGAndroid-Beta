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
public final class v7 implements Runnable {
    public final int f2311a;
    public final Object f2312b;
    public final Object f2313c;
    public final Object d;
    public final Object e;
    public final Object f2314f;
    public final Object h;
    public final Object f2315n;

    public v7(ga gaVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.TL_error tL_error) {
        this.f2311a = 1;
        this.f2312b = gaVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f2314f = inputInvoice;
        this.f2313c = callback;
        this.h = xcVar;
        this.f2315n = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.v7.run():void");
    }

    public v7(ga gaVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f2311a = 0;
        this.f2312b = gaVar;
        this.d = zArr;
        this.f2314f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.f2315n = callback2;
        this.f2313c = callback;
    }

    public v7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f2311a = i10;
        this.f2312b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2314f = obj4;
        this.h = obj5;
        this.f2315n = obj6;
        this.f2313c = obj7;
    }

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.f2311a = i10;
        this.f2312b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f2314f = str;
        this.f2315n = obj4;
        this.f2313c = obj5;
    }

    public v7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback callback2) {
        this.f2311a = 16;
        this.f2312b = tL_error;
        this.f2313c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f2314f = tL_inputInvoicePremiumGiftCode;
        this.h = n2Var;
        this.f2315n = callback2;
    }

    public v7(qn qnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, x3 x3Var, String str, pf.c cVar) {
        this.f2311a = 5;
        this.f2312b = qnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.f2315n = x3Var;
        this.f2314f = str;
        this.f2313c = cVar;
    }

    public v7(yl0 yl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, zl0 zl0Var, TLRPC.TL_error tL_error, km0 km0Var) {
        this.f2311a = 10;
        this.f2312b = yl0Var;
        this.d = tLObject;
        this.f2314f = str;
        this.e = tL_secureRequiredType;
        this.h = zl0Var;
        this.f2315n = tL_error;
        this.f2313c = km0Var;
    }
}
