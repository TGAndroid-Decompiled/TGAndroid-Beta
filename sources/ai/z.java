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
    public final int f2524a;
    public final Object f2525b;
    public final long f2526c;
    public final Object d;
    public final Object e;
    public final Object f2527f;

    public z(long j10, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f2524a = 8;
        this.d = conferenceCall;
        this.f2526c = j10;
        this.f2525b = tLObject;
        this.e = tL_error;
        this.f2527f = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z.run():void");
    }

    public z(fa faVar, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.f2524a = 6;
        this.d = faVar;
        this.f2525b = tLObject;
        this.e = messagesController;
        this.f2527f = tL_error;
        this.f2526c = j10;
    }

    public z(ha haVar, TLObject tLObject, MessageObject messageObject, long j10, Runnable runnable) {
        this.f2524a = 2;
        this.d = haVar;
        this.f2525b = tLObject;
        this.e = messageObject;
        this.f2526c = j10;
        this.f2527f = runnable;
    }

    public z(me meVar, long j10, ha haVar, MessageObject messageObject, sn snVar) {
        this.f2524a = 7;
        this.d = meVar;
        this.f2526c = j10;
        this.e = haVar;
        this.f2525b = messageObject;
        this.f2527f = snVar;
    }

    public z(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f2524a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2526c = j10;
        this.f2525b = obj3;
        this.f2527f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f2524a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2525b = obj3;
        this.f2526c = j10;
        this.f2527f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f2524a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2525b = obj3;
        this.f2527f = obj4;
        this.f2526c = j10;
    }

    public z(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f2524a = 13;
        this.e = c2Var;
        this.f2525b = tLObject;
        this.f2526c = j10;
        this.d = accountInstance;
        this.f2527f = booleanCallback;
    }

    public z(jr jrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f2524a = i10;
        this.d = jrVar;
        this.f2526c = j10;
        this.e = tLObject;
        this.f2527f = str;
        this.f2525b = tLObject2;
    }

    public z(yh.o1 o1Var, y9 y9Var, long j10, Utilities.Callback callback, Context context) {
        this.f2524a = 16;
        this.d = o1Var;
        this.e = y9Var;
        this.f2526c = j10;
        this.f2527f = callback;
        this.f2525b = context;
    }
}
