package mg;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.mk0;
import org.telegram.ui.nk0;
import org.telegram.ui.xk0;
import rh.e6;
public final class c0 implements Runnable {
    public final int f13081a;
    public final Object f13082b;
    public final Object f13083c;
    public final Object d;
    public final Object e;
    public final Object f13084f;
    public final Object h;
    public final Object f13085n;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f13081a = i10;
        this.f13082b = obj;
        this.h = obj2;
        this.f13083c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f13084f = obj6;
        this.f13085n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.run():void");
    }

    public c0(vs vsVar, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f13081a = i10;
        this.h = vsVar;
        this.f13082b = tL_error;
        this.f13083c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f13084f = obj3;
        this.f13085n = obj4;
    }

    public c0(fn fnVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, kj kjVar, TLRPC.TL_error tL_error) {
        this.f13081a = 4;
        this.h = fnVar;
        this.d = x1Var;
        this.f13083c = tLObject;
        this.e = hashSet;
        this.f13084f = tL_inputGroupCallInviteMessage;
        this.f13085n = kjVar;
        this.f13082b = tL_error;
    }

    public c0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f13081a = 5;
        this.h = launchActivity;
        this.d = x1Var;
        this.f13082b = tL_error;
        this.e = str;
        this.f13084f = bundle;
        this.f13083c = tLObject;
        this.f13085n = sendconfirmphonecode;
    }

    public c0(mk0 mk0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, nk0 nk0Var, TLRPC.TL_error tL_error, xk0 xk0Var) {
        this.f13081a = 8;
        this.h = mk0Var;
        this.f13083c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f13084f = nk0Var;
        this.f13082b = tL_error;
        this.f13085n = xk0Var;
    }

    public c0(e6 e6Var, TLObject tLObject, kj kjVar, TLRPC.InputInvoice inputInvoice, r20 r20Var, cc ccVar, TLRPC.TL_error tL_error) {
        this.f13081a = 16;
        this.h = e6Var;
        this.f13083c = tLObject;
        this.d = kjVar;
        this.e = inputInvoice;
        this.f13084f = r20Var;
        this.f13085n = ccVar;
        this.f13082b = tL_error;
    }
}
