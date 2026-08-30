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
import org.telegram.ui.fm0;
import org.telegram.ui.gm0;
import org.telegram.ui.jn;
import org.telegram.ui.rm0;
public final class g0 implements Runnable {
    public final int f6647a;
    public final Object f6648b;
    public final Object f6649c;
    public final Object d;
    public final Object e;
    public final Object f6650f;
    public final Object h;
    public final Object f6651n;

    public g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f6647a = i10;
        this.f6648b = obj;
        this.h = obj2;
        this.f6649c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f6650f = obj6;
        this.f6651n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.g0.run():void");
    }

    public g0(t7 t7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, qc qcVar, TLRPC.TL_error tL_error) {
        this.f6647a = 3;
        this.h = t7Var;
        this.f6649c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f6650f = callback;
        this.f6651n = qcVar;
        this.f6648b = tL_error;
    }

    public g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6647a = i10;
        this.h = notificationCenterDelegate;
        this.f6648b = tL_error;
        this.f6649c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f6650f = obj3;
        this.f6651n = obj4;
    }

    public g0(jn jnVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f6647a = 8;
        this.h = jnVar;
        this.d = d2Var;
        this.f6649c = tLObject;
        this.e = hashSet;
        this.f6650f = tL_inputGroupCallInviteMessage;
        this.f6651n = messageObject;
        this.f6648b = tL_error;
    }

    public g0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f6647a = 9;
        this.h = launchActivity;
        this.d = d2Var;
        this.f6648b = tL_error;
        this.e = str;
        this.f6650f = bundle;
        this.f6649c = tLObject;
        this.f6651n = sendconfirmphonecode;
    }

    public g0(fm0 fm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, gm0 gm0Var, TLRPC.TL_error tL_error, rm0 rm0Var) {
        this.f6647a = 12;
        this.h = fm0Var;
        this.f6649c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f6650f = gm0Var;
        this.f6648b = tL_error;
        this.f6651n = rm0Var;
    }
}
