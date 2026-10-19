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
import org.telegram.ui.hr;
import org.telegram.ui.qn;
public final class z implements Runnable {
    public final int f2515a;
    public final Object f2516b;
    public final long f2517c;
    public final Object d;
    public final Object e;
    public final Object f2518f;

    public z(long j10, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f2515a = 7;
        this.d = conferenceCall;
        this.f2517c = j10;
        this.f2516b = tLObject;
        this.e = tL_error;
        this.f2518f = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.z.run():void");
    }

    public z(fa faVar, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.f2515a = 5;
        this.d = faVar;
        this.f2516b = tLObject;
        this.e = messagesController;
        this.f2518f = tL_error;
        this.f2517c = j10;
    }

    public z(ga gaVar, TLObject tLObject, MessageObject messageObject, long j10, Runnable runnable) {
        this.f2515a = 1;
        this.d = gaVar;
        this.f2516b = tLObject;
        this.e = messageObject;
        this.f2517c = j10;
        this.f2518f = runnable;
    }

    public z(le leVar, long j10, ga gaVar, MessageObject messageObject, qn qnVar) {
        this.f2515a = 6;
        this.d = leVar;
        this.f2517c = j10;
        this.e = gaVar;
        this.f2516b = messageObject;
        this.f2518f = qnVar;
    }

    public z(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f2515a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2517c = j10;
        this.f2516b = obj3;
        this.f2518f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f2515a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2516b = obj3;
        this.f2517c = j10;
        this.f2518f = obj4;
    }

    public z(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f2515a = i10;
        this.d = obj;
        this.e = obj2;
        this.f2516b = obj3;
        this.f2518f = obj4;
        this.f2517c = j10;
    }

    public z(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f2515a = 12;
        this.e = b2Var;
        this.f2516b = tLObject;
        this.f2517c = j10;
        this.d = accountInstance;
        this.f2518f = booleanCallback;
    }

    public z(hr hrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f2515a = i10;
        this.d = hrVar;
        this.f2517c = j10;
        this.e = tLObject;
        this.f2518f = str;
        this.f2516b = tLObject2;
    }

    public z(yh.o1 o1Var, y9 y9Var, long j10, Utilities.Callback callback, Context context) {
        this.f2515a = 15;
        this.d = o1Var;
        this.e = y9Var;
        this.f2517c = j10;
        this.f2518f = callback;
        this.f2516b = context;
    }
}
