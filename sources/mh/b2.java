package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Runnable {
    public final int f13726a;
    public final Object f13727b;
    public final long f13728c;
    public final Object d;
    public final Object f13729e;

    public b2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f13726a = i10;
        this.f13727b = obj;
        this.f13728c = j10;
        this.d = obj2;
        this.f13729e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.b2.run():void");
    }

    public b2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f13726a = i10;
        this.f13727b = obj;
        this.d = obj2;
        this.f13728c = j10;
        this.f13729e = obj3;
    }

    public b2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f13726a = i10;
        this.f13727b = obj;
        this.d = obj2;
        this.f13729e = obj3;
        this.f13728c = j10;
    }

    public b2(t7 t7Var, Object obj, long j10, Object obj2, int i10) {
        this.f13726a = i10;
        this.d = t7Var;
        this.f13727b = obj;
        this.f13728c = j10;
        this.f13729e = obj2;
    }

    public b2(t7 t7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f13726a = 5;
        this.d = t7Var;
        this.f13729e = callback;
        this.f13727b = starGift;
        this.f13728c = j10;
    }

    public b2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f13726a = 19;
        this.f13727b = messagesController;
        this.f13729e = callback;
        this.d = tL_messages_invitedUsers;
        this.f13728c = j10;
    }
}
