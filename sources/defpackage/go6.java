package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class go6 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public go6(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go6.a():void");
    }

    private final void b() {
        boolean z;
        vp9 vp9Var = (vp9) this.b;
        TLObject tLObject = (TLObject) this.d;
        vf6 vf6Var = vp9Var.p;
        int i = vp9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            na7.q1(i).b4(messages_messages.users, false);
            na7.q1(i).V3(messages_messages.chats, false);
            ad7.Y(i).j1(messages_messages.users, messages_messages.chats, true, true);
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            long j = this.c;
            if (size > 0) {
                if (!vp9Var.q(size, j, true)) {
                    if (!messages_messages.messages.isEmpty()) {
                        up9 a = up9.a(i, messages_messages.messages.get(0));
                        a.e = size;
                        a.i = true;
                        vp9Var.c.add(a);
                        vp9Var.k();
                    }
                } else {
                    vp9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) vf6Var.f(j);
            vf6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((p8c) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void c() {
        vqa vqaVar = (vqa) this.b;
        ((c01) this.d).c(false);
        vqaVar.v2((int) this.c, vqaVar.getContext(), true);
    }

    private final void d() {
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        fx0 fx0Var = ((fx0[]) this.b)[0];
        if (fx0Var != null) {
            fx0Var.dismiss();
        }
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(mu1.V9(boost.giveaway_msg_id, this.c));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go6.run():void");
    }

    public go6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
