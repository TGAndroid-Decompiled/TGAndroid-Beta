package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18504a = 0;
    public final long f18505b;
    public final ArrayList f18506c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18507f;
    public final Object h;
    public final Object f18508n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18507f = mediaDataController;
        this.h = task;
        this.f18508n = timer;
        this.f18506c = arrayList;
        this.f18505b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18504a) {
            case 0:
                ((MediaDataController) this.f18507f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18508n, this.f18506c, this.f18505b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18507f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18505b, this.f18506c, this.d, (HashSet) this.f18508n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18507f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18505b = j10;
        this.f18506c = arrayList;
        this.d = hVar;
        this.f18508n = hashSet;
        this.e = runnable;
    }
}
