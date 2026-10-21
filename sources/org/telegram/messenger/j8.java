package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f18671a = 0;
    public final long f18672b;
    public final ArrayList f18673c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18674f;
    public final Object h;
    public final Object f18675n;

    public j8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18674f = mediaDataController;
        this.h = task;
        this.f18675n = timer;
        this.f18673c = arrayList;
        this.f18672b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18671a) {
            case 0:
                ((MediaDataController) this.f18674f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18675n, this.f18673c, this.f18672b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18674f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18672b, this.f18673c, this.d, (HashSet) this.f18675n, runnable);
                return;
        }
    }

    public j8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18674f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18672b = j10;
        this.f18673c = arrayList;
        this.d = hVar;
        this.f18675n = hashSet;
        this.e = runnable;
    }
}
