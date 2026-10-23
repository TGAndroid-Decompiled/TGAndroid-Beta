package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18872a = 0;
    public final long f18873b;
    public final ArrayList f18874c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18875f;
    public final Object h;
    public final Object f18876n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18875f = mediaDataController;
        this.h = task;
        this.f18876n = timer;
        this.f18874c = arrayList;
        this.f18873b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18872a) {
            case 0:
                ((MediaDataController) this.f18875f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18876n, this.f18874c, this.f18873b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18875f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18873b, this.f18874c, this.d, (HashSet) this.f18876n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18875f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18873b = j10;
        this.f18874c = arrayList;
        this.d = hVar;
        this.f18876n = hashSet;
        this.e = runnable;
    }
}
