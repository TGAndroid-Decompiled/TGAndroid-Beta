package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.b21;
public final class lg implements Runnable {
    public final int f20898a;
    public final Object f20899b;
    public final Object f20900c;
    public final long d;
    public final Object f20901e;

    public lg(Object obj, long j10, Object obj2, Object obj3, int i9) {
        this.f20898a = i9;
        this.f20899b = obj;
        this.d = j10;
        this.f20900c = obj2;
        this.f20901e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.run():void");
    }

    public lg(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.f20898a = i9;
        this.f20899b = obj;
        this.f20900c = obj2;
        this.d = j10;
        this.f20901e = obj3;
    }

    public lg(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f20898a = i9;
        this.f20899b = obj;
        this.f20900c = obj2;
        this.f20901e = obj3;
        this.d = j10;
    }

    public lg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i9) {
        this.f20898a = i9;
        this.f20900c = obj;
        this.f20899b = messagesStorage;
        this.d = j10;
        this.f20901e = runnable;
    }

    public lg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.f20898a = 1;
        this.f20901e = savedMessagesController;
        this.f20899b = messagesStorage;
        this.f20900c = arrayList;
        this.d = j10;
    }

    public lg(b21 b21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.f20898a = 6;
        this.f20899b = b21Var;
        this.f20901e = hashSet;
        this.f20900c = arrayList;
        this.d = j10;
    }

    public lg(pf.r1 r1Var, MessagesStorage messagesStorage, pf.q1 q1Var, long j10) {
        this.f20898a = 13;
        this.f20900c = r1Var;
        this.f20899b = messagesStorage;
        this.f20901e = q1Var;
        this.d = j10;
    }
}
