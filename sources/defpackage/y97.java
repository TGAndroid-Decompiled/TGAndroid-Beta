package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;
public final class y97 implements Runnable {
    public final byte a = 2;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public y97(bu5 bu5Var, int i, long j, long j2, bu5 bu5Var2, yv1 yv1Var, ylb ylbVar) {
        this.e = bu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = bu5Var2;
        this.h = yv1Var;
        this.n = ylbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y97.run():void");
    }

    public y97(oc7 oc7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, vh6 vh6Var, int i, long j2) {
        this.e = oc7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = vh6Var;
        this.b = i;
        this.d = j2;
    }

    public y97(a6a a6aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, k47 k47Var) {
        this.e = a6aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = k47Var;
    }

    public y97(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public y97(WearReplyReceiver wearReplyReceiver, j5 j5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = j5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
