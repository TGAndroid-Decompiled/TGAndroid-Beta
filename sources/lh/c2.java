package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements Runnable {
    public final int f12188a;
    public final Object f12189b;
    public final long f12190c;
    public final Object d;
    public final Object e;

    public c2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f12188a = i10;
        this.f12189b = obj;
        this.f12190c = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.c2.run():void");
    }

    public c2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f12188a = i10;
        this.f12189b = obj;
        this.d = obj2;
        this.f12190c = j10;
        this.e = obj3;
    }

    public c2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f12188a = i10;
        this.f12189b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12190c = j10;
    }

    public c2(t7 t7Var, Object obj, long j10, Object obj2, int i10) {
        this.f12188a = i10;
        this.d = t7Var;
        this.f12189b = obj;
        this.f12190c = j10;
        this.e = obj2;
    }

    public c2(t7 t7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f12188a = 5;
        this.d = t7Var;
        this.e = callback;
        this.f12189b = starGift;
        this.f12190c = j10;
    }

    public c2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f12188a = 19;
        this.f12189b = messagesController;
        this.e = callback;
        this.d = tL_messages_invitedUsers;
        this.f12190c = j10;
    }
}
