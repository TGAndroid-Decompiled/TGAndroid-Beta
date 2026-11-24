package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class hq6 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public hq6(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.a():void");
    }

    private final void b() {
        boolean z;
        wr9 wr9Var = (wr9) this.b;
        TLObject tLObject = (TLObject) this.d;
        vh6 vh6Var = wr9Var.p;
        int i = wr9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            oc7.r1(i).d4(messages_messages.users, false);
            oc7.r1(i).X3(messages_messages.chats, false);
            cf7.Y(i).j1(messages_messages.users, messages_messages.chats, true, true);
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            long j = this.c;
            if (size > 0) {
                if (!wr9Var.q(size, j, true)) {
                    if (!messages_messages.messages.isEmpty()) {
                        vr9 a = vr9.a(i, messages_messages.messages.get(0));
                        a.e = size;
                        a.i = true;
                        wr9Var.c.add(a);
                        wr9Var.k();
                    }
                } else {
                    wr9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) vh6Var.f(j);
            vh6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((qac) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void c() {
        wsa wsaVar = (wsa) this.b;
        ((k11) this.d).c(false);
        wsaVar.v2((int) this.c, wsaVar.getContext(), true);
    }

    private final void d() {
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        my0 my0Var = ((my0[]) this.b)[0];
        if (my0Var != null) {
            my0Var.dismiss();
        }
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(yv1.fa(boost.giveaway_msg_id, this.c));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.run():void");
    }

    public hq6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
