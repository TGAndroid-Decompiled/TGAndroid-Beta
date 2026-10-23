package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18940a = 0;
    public final long f18941b;
    public final ArrayList f18942c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18943f;
    public final Object h;
    public final Object f18944n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18943f = mediaDataController;
        this.h = task;
        this.f18944n = timer;
        this.f18942c = arrayList;
        this.f18941b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18940a) {
            case 0:
                ((MediaDataController) this.f18943f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18944n, this.f18942c, this.f18941b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18943f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18941b, this.f18942c, this.d, (HashSet) this.f18944n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18943f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18941b = j10;
        this.f18942c = arrayList;
        this.d = hVar;
        this.f18944n = hashSet;
        this.e = runnable;
    }
}
