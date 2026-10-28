package bi;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mr;
import org.telegram.ui.wn;
public final class a0 implements Runnable {
    public final int f4246a;
    public final Object f4247b;
    public final long f4248c;
    public final Object d;
    public final Object e;
    public final Object f4249f;

    public a0(long j10, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f4246a = 8;
        this.d = conferenceCall;
        this.f4248c = j10;
        this.f4247b = tLObject;
        this.e = tL_error;
        this.f4249f = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.run():void");
    }

    public a0(aa aaVar, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.f4246a = 6;
        this.d = aaVar;
        this.f4247b = tLObject;
        this.e = messagesController;
        this.f4249f = tL_error;
        this.f4248c = j10;
    }

    public a0(ca caVar, TLObject tLObject, MessageObject messageObject, long j10, Runnable runnable) {
        this.f4246a = 2;
        this.d = caVar;
        this.f4247b = tLObject;
        this.e = messageObject;
        this.f4248c = j10;
        this.f4249f = runnable;
    }

    public a0(be beVar, long j10, ca caVar, MessageObject messageObject, wn wnVar) {
        this.f4246a = 7;
        this.d = beVar;
        this.f4248c = j10;
        this.e = caVar;
        this.f4247b = messageObject;
        this.f4249f = wnVar;
    }

    public a0(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f4246a = i10;
        this.d = obj;
        this.e = obj2;
        this.f4248c = j10;
        this.f4247b = obj3;
        this.f4249f = obj4;
    }

    public a0(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f4246a = i10;
        this.d = obj;
        this.e = obj2;
        this.f4247b = obj3;
        this.f4248c = j10;
        this.f4249f = obj4;
    }

    public a0(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f4246a = i10;
        this.d = obj;
        this.e = obj2;
        this.f4247b = obj3;
        this.f4249f = obj4;
        this.f4248c = j10;
    }

    public a0(org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f4246a = 13;
        this.e = e2Var;
        this.f4247b = tLObject;
        this.f4248c = j10;
        this.d = accountInstance;
        this.f4249f = booleanCallback;
    }

    public a0(mr mrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f4246a = i10;
        this.d = mrVar;
        this.f4248c = j10;
        this.e = tLObject;
        this.f4249f = str;
        this.f4247b = tLObject2;
    }

    public a0(zh.p1 p1Var, t9 t9Var, long j10, Utilities.Callback callback, Context context) {
        this.f4246a = 17;
        this.d = p1Var;
        this.e = t9Var;
        this.f4248c = j10;
        this.f4249f = callback;
        this.f4247b = context;
    }
}
