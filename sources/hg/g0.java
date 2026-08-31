package hg;

import android.os.Bundle;
import java.util.HashSet;
import mh.t7;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hm0;
import org.telegram.ui.im0;
import org.telegram.ui.jn;
import org.telegram.ui.tm0;
public final class g0 implements Runnable {
    public final int f7491a;
    public final Object f7492b;
    public final Object f7493c;
    public final Object d;
    public final Object f7494e;
    public final Object f7495f;
    public final Object h;
    public final Object f7496n;

    public g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f7491a = i10;
        this.f7492b = obj;
        this.h = obj2;
        this.f7493c = obj3;
        this.d = obj4;
        this.f7494e = obj5;
        this.f7495f = obj6;
        this.f7496n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.g0.run():void");
    }

    public g0(t7 t7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, qc qcVar, TLRPC.TL_error tL_error) {
        this.f7491a = 3;
        this.h = t7Var;
        this.f7493c = tLObject;
        this.d = messageObject;
        this.f7494e = inputInvoice;
        this.f7495f = callback;
        this.f7496n = qcVar;
        this.f7492b = tL_error;
    }

    public g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7491a = i10;
        this.h = notificationCenterDelegate;
        this.f7492b = tL_error;
        this.f7493c = tLObject;
        this.d = obj;
        this.f7494e = obj2;
        this.f7495f = obj3;
        this.f7496n = obj4;
    }

    public g0(jn jnVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f7491a = 8;
        this.h = jnVar;
        this.d = d2Var;
        this.f7493c = tLObject;
        this.f7494e = hashSet;
        this.f7495f = tL_inputGroupCallInviteMessage;
        this.f7496n = messageObject;
        this.f7492b = tL_error;
    }

    public g0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f7491a = 9;
        this.h = launchActivity;
        this.d = d2Var;
        this.f7492b = tL_error;
        this.f7494e = str;
        this.f7495f = bundle;
        this.f7493c = tLObject;
        this.f7496n = sendconfirmphonecode;
    }

    public g0(hm0 hm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, im0 im0Var, TLRPC.TL_error tL_error, tm0 tm0Var) {
        this.f7491a = 12;
        this.h = hm0Var;
        this.f7493c = tLObject;
        this.d = str;
        this.f7494e = tL_secureRequiredType;
        this.f7495f = im0Var;
        this.f7492b = tL_error;
        this.f7496n = tm0Var;
    }
}
