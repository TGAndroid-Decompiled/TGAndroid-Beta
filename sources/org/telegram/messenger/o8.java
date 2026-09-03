package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f17977a = 0;
    public final long f17978b;
    public final ArrayList f17979c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f17980f;
    public final Object h;
    public final Object f17981n;

    public o8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f17980f = mediaDataController;
        this.h = task;
        this.f17981n = timer;
        this.f17979c = arrayList;
        this.f17978b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                ((MediaDataController) this.f17980f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f17981n, this.f17979c, this.f17978b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f17980f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f17978b, this.f17979c, this.d, (HashSet) this.f17981n, runnable);
                return;
        }
    }

    public o8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f17980f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f17978b = j10;
        this.f17979c = arrayList;
        this.d = hVar;
        this.f17981n = hashSet;
        this.e = runnable;
    }
}
