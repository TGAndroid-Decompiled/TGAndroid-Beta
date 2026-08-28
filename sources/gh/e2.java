package gh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e2 implements Runnable {
    public final int f8003a;
    public final Object f8004b;
    public final long f8005c;
    public final Object d;
    public final Object f8006e;

    public e2(v7 v7Var, Object obj, long j10, Object obj2, int i9) {
        this.f8003a = i9;
        this.d = v7Var;
        this.f8004b = obj;
        this.f8005c = j10;
        this.f8006e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gh.e2.run():void");
    }

    public e2(v7 v7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f8003a = 5;
        this.d = v7Var;
        this.f8006e = callback;
        this.f8004b = starGift;
        this.f8005c = j10;
    }

    public e2(Object obj, long j10, Object obj2, Object obj3, int i9) {
        this.f8003a = i9;
        this.f8004b = obj;
        this.f8005c = j10;
        this.d = obj2;
        this.f8006e = obj3;
    }

    public e2(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.f8003a = i9;
        this.f8004b = obj;
        this.d = obj2;
        this.f8005c = j10;
        this.f8006e = obj3;
    }

    public e2(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f8003a = i9;
        this.f8004b = obj;
        this.d = obj2;
        this.f8006e = obj3;
        this.f8005c = j10;
    }

    public e2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f8003a = 20;
        this.f8004b = messagesController;
        this.f8006e = callback;
        this.d = tL_messages_invitedUsers;
        this.f8005c = j10;
    }
}
