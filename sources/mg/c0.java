package mg;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.ok0;
import org.telegram.ui.pk0;
import org.telegram.ui.zk0;
import rh.e6;
public final class c0 implements Runnable {
    public final int f13080a;
    public final Object f13081b;
    public final Object f13082c;
    public final Object d;
    public final Object e;
    public final Object f13083f;
    public final Object h;
    public final Object f13084n;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f13080a = i10;
        this.f13081b = obj;
        this.h = obj2;
        this.f13082c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f13083f = obj6;
        this.f13084n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.run():void");
    }

    public c0(us usVar, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f13080a = i10;
        this.h = usVar;
        this.f13081b = tL_error;
        this.f13082c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f13083f = obj3;
        this.f13084n = obj4;
    }

    public c0(fn fnVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, jj jjVar, TLRPC.TL_error tL_error) {
        this.f13080a = 4;
        this.h = fnVar;
        this.d = x1Var;
        this.f13082c = tLObject;
        this.e = hashSet;
        this.f13083f = tL_inputGroupCallInviteMessage;
        this.f13084n = jjVar;
        this.f13081b = tL_error;
    }

    public c0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f13080a = 5;
        this.h = launchActivity;
        this.d = x1Var;
        this.f13081b = tL_error;
        this.e = str;
        this.f13083f = bundle;
        this.f13082c = tLObject;
        this.f13084n = sendconfirmphonecode;
    }

    public c0(ok0 ok0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, pk0 pk0Var, TLRPC.TL_error tL_error, zk0 zk0Var) {
        this.f13080a = 8;
        this.h = ok0Var;
        this.f13082c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f13083f = pk0Var;
        this.f13081b = tL_error;
        this.f13084n = zk0Var;
    }

    public c0(e6 e6Var, TLObject tLObject, jj jjVar, TLRPC.InputInvoice inputInvoice, q20 q20Var, cc ccVar, TLRPC.TL_error tL_error) {
        this.f13080a = 16;
        this.h = e6Var;
        this.f13082c = tLObject;
        this.d = jjVar;
        this.e = inputInvoice;
        this.f13083f = q20Var;
        this.f13084n = ccVar;
        this.f13081b = tL_error;
    }
}
