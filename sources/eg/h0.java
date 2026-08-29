package eg;

import android.os.Bundle;
import java.util.HashSet;
import jh.s7;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.jm0;
import org.telegram.ui.xl0;
import org.telegram.ui.yl0;
public final class h0 implements Runnable {
    public final int f6021a;
    public final Object f6022b;
    public final Object f6023c;
    public final Object d;
    public final Object f6024e;
    public final Object f6025f;
    public final Object h;
    public final Object f6026n;

    public h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f6021a = i10;
        this.f6022b = obj;
        this.h = obj2;
        this.f6023c = obj3;
        this.d = obj4;
        this.f6024e = obj5;
        this.f6025f = obj6;
        this.f6026n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: eg.h0.run():void");
    }

    public h0(s7 s7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, tc tcVar, TLRPC.TL_error tL_error) {
        this.f6021a = 3;
        this.h = s7Var;
        this.f6023c = tLObject;
        this.d = messageObject;
        this.f6024e = inputInvoice;
        this.f6025f = callback;
        this.f6026n = tcVar;
        this.f6022b = tL_error;
    }

    public h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6021a = i10;
        this.h = notificationCenterDelegate;
        this.f6022b = tL_error;
        this.f6023c = tLObject;
        this.d = obj;
        this.f6024e = obj2;
        this.f6025f = obj3;
        this.f6026n = obj4;
    }

    public h0(fn fnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f6021a = 8;
        this.h = fnVar;
        this.d = c2Var;
        this.f6023c = tLObject;
        this.f6024e = hashSet;
        this.f6025f = tL_inputGroupCallInviteMessage;
        this.f6026n = messageObject;
        this.f6022b = tL_error;
    }

    public h0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f6021a = 9;
        this.h = launchActivity;
        this.d = c2Var;
        this.f6022b = tL_error;
        this.f6024e = str;
        this.f6025f = bundle;
        this.f6023c = tLObject;
        this.f6026n = sendconfirmphonecode;
    }

    public h0(xl0 xl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, yl0 yl0Var, TLRPC.TL_error tL_error, jm0 jm0Var) {
        this.f6021a = 12;
        this.h = xl0Var;
        this.f6023c = tLObject;
        this.d = str;
        this.f6024e = tL_secureRequiredType;
        this.f6025f = yl0Var;
        this.f6022b = tL_error;
        this.f6026n = jm0Var;
    }
}
