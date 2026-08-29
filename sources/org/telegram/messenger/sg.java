package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m21;
public final class sg implements Runnable {
    public final int f21565a;
    public final Object f21566b;
    public final Object f21567c;
    public final long d;
    public final Object f21568e;

    public sg(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f21565a = i10;
        this.f21566b = obj;
        this.d = j10;
        this.f21567c = obj2;
        this.f21568e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sg.run():void");
    }

    public sg(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f21565a = i10;
        this.f21566b = obj;
        this.f21567c = obj2;
        this.d = j10;
        this.f21568e = obj3;
    }

    public sg(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f21565a = i10;
        this.f21566b = obj;
        this.f21567c = obj2;
        this.f21568e = obj3;
        this.d = j10;
    }

    public sg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i10) {
        this.f21565a = i10;
        this.f21567c = obj;
        this.f21566b = messagesStorage;
        this.d = j10;
        this.f21568e = runnable;
    }

    public sg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.f21565a = 1;
        this.f21568e = savedMessagesController;
        this.f21566b = messagesStorage;
        this.f21567c = arrayList;
        this.d = j10;
    }

    public sg(m21 m21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.f21565a = 6;
        this.f21566b = m21Var;
        this.f21568e = hashSet;
        this.f21567c = arrayList;
        this.d = j10;
    }

    public sg(sf.s1 s1Var, MessagesStorage messagesStorage, sf.r1 r1Var, long j10) {
        this.f21565a = 13;
        this.f21567c = s1Var;
        this.f21566b = messagesStorage;
        this.f21568e = r1Var;
        this.d = j10;
    }
}
