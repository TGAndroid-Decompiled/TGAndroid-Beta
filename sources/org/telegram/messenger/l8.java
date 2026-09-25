package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16899a = 0;
    public final long f16900b;
    public final ArrayList f16901c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16902f;
    public final Object h;
    public final Object f16903n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16902f = mediaDataController;
        this.h = task;
        this.f16903n = timer;
        this.f16901c = arrayList;
        this.f16900b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16899a) {
            case 0:
                ((MediaDataController) this.f16902f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16903n, this.f16901c, this.f16900b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16902f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16900b, this.f16901c, this.d, (HashSet) this.f16903n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16902f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16900b = j3;
        this.f16901c = arrayList;
        this.d = iVar;
        this.f16903n = hashSet;
        this.e = runnable;
    }
}
