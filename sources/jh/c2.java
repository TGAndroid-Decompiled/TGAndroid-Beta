package jh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements Runnable {
    public final int f11849a;
    public final Object f11850b;
    public final long f11851c;
    public final Object d;
    public final Object f11852e;

    public c2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f11849a = i10;
        this.f11850b = obj;
        this.f11851c = j10;
        this.d = obj2;
        this.f11852e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jh.c2.run():void");
    }

    public c2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f11849a = i10;
        this.f11850b = obj;
        this.d = obj2;
        this.f11851c = j10;
        this.f11852e = obj3;
    }

    public c2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f11849a = i10;
        this.f11850b = obj;
        this.d = obj2;
        this.f11852e = obj3;
        this.f11851c = j10;
    }

    public c2(s7 s7Var, Object obj, long j10, Object obj2, int i10) {
        this.f11849a = i10;
        this.d = s7Var;
        this.f11850b = obj;
        this.f11851c = j10;
        this.f11852e = obj2;
    }

    public c2(s7 s7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f11849a = 5;
        this.d = s7Var;
        this.f11852e = callback;
        this.f11850b = starGift;
        this.f11851c = j10;
    }

    public c2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f11849a = 20;
        this.f11850b = messagesController;
        this.f11852e = callback;
        this.d = tL_messages_invitedUsers;
        this.f11851c = j10;
    }
}
