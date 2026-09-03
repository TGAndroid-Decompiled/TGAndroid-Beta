package gg;

import android.os.Bundle;
import java.util.HashSet;
import lh.t7;
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
import org.telegram.ui.ln;
import org.telegram.ui.tm0;
public final class g0 implements Runnable {
    public final int f6634a;
    public final Object f6635b;
    public final Object f6636c;
    public final Object d;
    public final Object e;
    public final Object f6637f;
    public final Object h;
    public final Object f6638n;

    public g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f6634a = i10;
        this.f6635b = obj;
        this.h = obj2;
        this.f6636c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f6637f = obj6;
        this.f6638n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.g0.run():void");
    }

    public g0(t7 t7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, qc qcVar, TLRPC.TL_error tL_error) {
        this.f6634a = 3;
        this.h = t7Var;
        this.f6636c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f6637f = callback;
        this.f6638n = qcVar;
        this.f6635b = tL_error;
    }

    public g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6634a = i10;
        this.h = notificationCenterDelegate;
        this.f6635b = tL_error;
        this.f6636c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f6637f = obj3;
        this.f6638n = obj4;
    }

    public g0(ln lnVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f6634a = 8;
        this.h = lnVar;
        this.d = d2Var;
        this.f6636c = tLObject;
        this.e = hashSet;
        this.f6637f = tL_inputGroupCallInviteMessage;
        this.f6638n = messageObject;
        this.f6635b = tL_error;
    }

    public g0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f6634a = 9;
        this.h = launchActivity;
        this.d = d2Var;
        this.f6635b = tL_error;
        this.e = str;
        this.f6637f = bundle;
        this.f6636c = tLObject;
        this.f6638n = sendconfirmphonecode;
    }

    public g0(hm0 hm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, im0 im0Var, TLRPC.TL_error tL_error, tm0 tm0Var) {
        this.f6634a = 12;
        this.h = hm0Var;
        this.f6636c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f6637f = im0Var;
        this.f6635b = tL_error;
        this.f6638n = tm0Var;
    }
}
