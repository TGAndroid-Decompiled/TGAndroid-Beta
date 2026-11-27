package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class cq6 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public cq6(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq6.a():void");
    }

    private final void b() {
        ji8 ji8Var = (ji8) this.b;
        e eVar = (e) this.d;
        Bundle bundle = new Bundle();
        long j = this.c;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        eVar.presentFragment(new ProfileActivity(bundle, null));
        ji8Var.b(false);
    }

    private final void c() {
        boolean z;
        nt9 nt9Var = (nt9) this.b;
        TLObject tLObject = (TLObject) this.d;
        zh6 zh6Var = nt9Var.p;
        int i = nt9Var.a;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            uc7.s1(i).j4(messages_messages.users, false);
            uc7.s1(i).c4(messages_messages.chats, false);
            kf7.a0(i).n1(messages_messages.users, messages_messages.chats, true, true);
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            long j = this.c;
            if (size > 0) {
                if (!nt9Var.q(size, j, true)) {
                    if (!messages_messages.messages.isEmpty()) {
                        mt9 a = mt9.a(i, messages_messages.messages.get(0));
                        a.e = size;
                        a.i = true;
                        nt9Var.c.add(a);
                        nt9Var.k();
                    }
                } else {
                    nt9Var.k();
                }
            }
            ArrayList arrayList = (ArrayList) zh6Var.f(j);
            zh6Var.l(j);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((pcc) arrayList.get(i2)).a(Boolean.valueOf(z));
                }
            }
        }
    }

    private final void d() {
        wua wuaVar = (wua) this.b;
        ((l01) this.d).c(false);
        wuaVar.w2((int) this.c, wuaVar.getContext(), true);
    }

    private final void e() {
        TL_stories.Boost boost = (TL_stories.Boost) this.d;
        nx0 nx0Var = ((nx0[]) this.b)[0];
        if (nx0Var != null) {
            nx0Var.dismiss();
        }
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        S.presentFragment(zu1.ga(boost.giveaway_msg_id, this.c));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq6.run():void");
    }

    public cq6(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
