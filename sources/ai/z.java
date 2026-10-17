package ai;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jr;
import org.telegram.ui.sn;
public final class z implements Runnable {
    public final int f2507a;
    public final Object f2508b;
    public final long f2509c;
    public final Object d;
    public final Object e;
    public final Object f2510f;

    public z(long j10, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f2507a = 7;
        this.d = conferenceCall;
        this.f2509c = j10;
        this.f2508b = tLObject;
        this.e = tL_error;
        this.f2510f = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z.run():void");
    }

    public z(ea eaVar, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.f2507a = 5;
        this.d = eaVar;
        this.f2508b = tLObject;
        this.e = messagesController;
        this.f2510f = tL_error;
        this.f2509c = j10;
    }

    public z(fa faVar, TLObject tLObject, MessageObject messageObject, long j10, Runnable runnable) {
        this.f2507a = 1;
        this.d = faVar;
        this.f2508b = tLObject;
        this.e = messageObject;
        this.f2509c = j10;
        this.f2510f = runnable;
    }

    public z(ke keVar, long j10, fa faVar, MessageObject messageObject, sn snVar) {
        this.f2507a = 6;
        this.d = keVar;
        this.f2509c = j10;
        this.e = faVar;
        this.f2508b = messageObject;
        this.f2510f = snVar;
    }

    public z(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f2507a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2509c = j10;
        this.f2508b = obj3;
        this.f2510f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f2507a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2508b = obj3;
        this.f2509c = j10;
        this.f2510f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f2507a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2508b = obj3;
        this.f2510f = obj4;
        this.f2509c = j10;
    }

    public z(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f2507a = 12;
        this.e = b2Var;
        this.f2508b = tLObject;
        this.f2509c = j10;
        this.d = accountInstance;
        this.f2510f = booleanCallback;
    }

    public z(jr jrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f2507a = i10;
        this.d = jrVar;
        this.f2509c = j10;
        this.e = tLObject;
        this.f2510f = str;
        this.f2508b = tLObject2;
    }

    public z(yh.p1 p1Var, x9 x9Var, long j10, Utilities.Callback callback, Context context) {
        this.f2507a = 15;
        this.d = p1Var;
        this.e = x9Var;
        this.f2509c = j10;
        this.f2510f = callback;
        this.f2508b = context;
    }
}
