package bi;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.km0;
import org.telegram.ui.lm0;
import org.telegram.ui.un;
import org.telegram.ui.wm0;
public final class r7 implements Runnable {
    public final int f5346a;
    public final Object f5347b;
    public final Object f5348c;
    public final Object d;
    public final Object e;
    public final Object f5349f;
    public final Object h;
    public final Object f5350n;

    public r7(ca caVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar, TLRPC.TL_error tL_error) {
        this.f5346a = 1;
        this.f5347b = caVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f5349f = inputInvoice;
        this.f5348c = callback;
        this.h = wcVar;
        this.f5350n = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.r7.run():void");
    }

    public r7(ca caVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f5346a = 0;
        this.f5347b = caVar;
        this.d = zArr;
        this.f5349f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.f5350n = callback2;
        this.f5348c = callback;
    }

    public r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f5346a = i10;
        this.f5347b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5349f = obj4;
        this.h = obj5;
        this.f5350n = obj6;
        this.f5348c = obj7;
    }

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.f5346a = i10;
        this.f5347b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f5349f = str;
        this.f5350n = obj4;
        this.f5348c = obj5;
    }

    public r7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.r2 r2Var, Utilities.Callback callback2) {
        this.f5346a = 16;
        this.f5347b = tL_error;
        this.f5348c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f5349f = tL_inputInvoicePremiumGiftCode;
        this.h = r2Var;
        this.f5350n = callback2;
    }

    public r7(un unVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, t3 t3Var, String str, qf.c cVar) {
        this.f5346a = 5;
        this.f5347b = unVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.f5350n = t3Var;
        this.f5349f = str;
        this.f5348c = cVar;
    }

    public r7(km0 km0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, lm0 lm0Var, TLRPC.TL_error tL_error, wm0 wm0Var) {
        this.f5346a = 10;
        this.f5347b = km0Var;
        this.d = tLObject;
        this.f5349f = str;
        this.e = tL_secureRequiredType;
        this.h = lm0Var;
        this.f5350n = tL_error;
        this.f5348c = wm0Var;
    }
}
