package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;
public final class r77 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public r77(cs5 cs5Var, int i, long j, long j2, cs5 cs5Var2, mu1 mu1Var, wjb wjbVar) {
        this.e = cs5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = cs5Var2;
        this.h = mu1Var;
        this.n = wjbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r77.run():void");
    }

    public r77(na7 na7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, vf6 vf6Var, int i, long j2) {
        this.e = na7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = vf6Var;
        this.b = i;
        this.d = j2;
    }

    public r77(z3a z3aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, k27 k27Var) {
        this.e = z3aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = k27Var;
    }

    public r77(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public r77(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
