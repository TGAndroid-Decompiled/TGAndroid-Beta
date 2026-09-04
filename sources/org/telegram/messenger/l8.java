package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18246a = 0;
    public final long f18247b;
    public final ArrayList f18248c;
    public final a0.i d;
    public final Runnable f18249e;
    public final BaseController f18250f;
    public final Object h;
    public final Object f18251n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18250f = mediaDataController;
        this.h = task;
        this.f18251n = timer;
        this.f18248c = arrayList;
        this.f18247b = j3;
        this.d = iVar;
        this.f18249e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18246a) {
            case 0:
                ((MediaDataController) this.f18250f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18251n, this.f18248c, this.f18247b, this.d, this.f18249e);
                return;
            default:
                Runnable runnable = this.f18249e;
                ((TopicsController) this.f18250f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18247b, this.f18248c, this.d, (HashSet) this.f18251n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18250f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18247b = j3;
        this.f18248c = arrayList;
        this.d = iVar;
        this.f18251n = hashSet;
        this.f18249e = runnable;
    }
}
