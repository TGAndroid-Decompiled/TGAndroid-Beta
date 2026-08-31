package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b2 implements Runnable {
    public final int f13724a;
    public final Object f13725b;
    public final long f13726c;
    public final Object d;
    public final Object f13727e;

    public b2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f13724a = i10;
        this.f13725b = obj;
        this.f13726c = j10;
        this.d = obj2;
        this.f13727e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.b2.run():void");
    }

    public b2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f13724a = i10;
        this.f13725b = obj;
        this.d = obj2;
        this.f13726c = j10;
        this.f13727e = obj3;
    }

    public b2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f13724a = i10;
        this.f13725b = obj;
        this.d = obj2;
        this.f13727e = obj3;
        this.f13726c = j10;
    }

    public b2(t7 t7Var, Object obj, long j10, Object obj2, int i10) {
        this.f13724a = i10;
        this.d = t7Var;
        this.f13725b = obj;
        this.f13726c = j10;
        this.f13727e = obj2;
    }

    public b2(t7 t7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f13724a = 5;
        this.d = t7Var;
        this.f13727e = callback;
        this.f13725b = starGift;
        this.f13726c = j10;
    }

    public b2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f13724a = 19;
        this.f13725b = messagesController;
        this.f13727e = callback;
        this.d = tL_messages_invitedUsers;
        this.f13726c = j10;
    }
}
