package bg;

import android.os.Bundle;
import gh.v7;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.cn;
import org.telegram.ui.lm0;
import org.telegram.ui.zl0;
public final class k0 implements Runnable {
    public final int f1853a;
    public final Object f1854b;
    public final Object f1855c;
    public final Object d;
    public final Object f1856e;
    public final Object f1857f;
    public final Object h;
    public final Object f1858n;

    public k0(v7 v7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, oc ocVar, TLRPC.TL_error tL_error) {
        this.f1853a = 3;
        this.h = v7Var;
        this.f1855c = tLObject;
        this.d = messageObject;
        this.f1856e = inputInvoice;
        this.f1857f = callback;
        this.f1858n = ocVar;
        this.f1854b = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.k0.run():void");
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f1853a = i9;
        this.f1854b = obj;
        this.h = obj2;
        this.f1855c = obj3;
        this.d = obj4;
        this.f1856e = obj5;
        this.f1857f = obj6;
        this.f1858n = obj7;
    }

    public k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1853a = i9;
        this.h = notificationCenterDelegate;
        this.f1854b = tL_error;
        this.f1855c = tLObject;
        this.d = obj;
        this.f1856e = obj2;
        this.f1857f = obj3;
        this.f1858n = obj4;
    }

    public k0(cn cnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f1853a = 8;
        this.h = cnVar;
        this.d = c2Var;
        this.f1855c = tLObject;
        this.f1856e = hashSet;
        this.f1857f = tL_inputGroupCallInviteMessage;
        this.f1858n = messageObject;
        this.f1854b = tL_error;
    }

    public k0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f1853a = 9;
        this.h = launchActivity;
        this.d = c2Var;
        this.f1854b = tL_error;
        this.f1856e = str;
        this.f1857f = bundle;
        this.f1855c = tLObject;
        this.f1858n = sendconfirmphonecode;
    }

    public k0(zl0 zl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, am0 am0Var, TLRPC.TL_error tL_error, lm0 lm0Var) {
        this.f1853a = 12;
        this.h = zl0Var;
        this.f1855c = tLObject;
        this.d = str;
        this.f1856e = tL_secureRequiredType;
        this.f1857f = am0Var;
        this.f1854b = tL_error;
        this.f1858n = lm0Var;
    }
}
