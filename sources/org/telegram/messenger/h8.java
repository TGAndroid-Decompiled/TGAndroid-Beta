package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18067a = 0;
    public final long f18068b;
    public final ArrayList f18069c;
    public final a0.i d;
    public final Runnable f18070e;
    public final BaseController f18071f;
    public final Object h;
    public final Object f18072n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18071f = mediaDataController;
        this.h = task;
        this.f18072n = timer;
        this.f18069c = arrayList;
        this.f18068b = j3;
        this.d = iVar;
        this.f18070e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18067a) {
            case 0:
                ((MediaDataController) this.f18071f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18072n, this.f18069c, this.f18068b, this.d, this.f18070e);
                return;
            default:
                Runnable runnable = this.f18070e;
                ((TopicsController) this.f18071f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18068b, this.f18069c, this.d, (HashSet) this.f18072n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18071f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18068b = j3;
        this.f18069c = arrayList;
        this.d = iVar;
        this.f18072n = hashSet;
        this.f18070e = runnable;
    }
}
