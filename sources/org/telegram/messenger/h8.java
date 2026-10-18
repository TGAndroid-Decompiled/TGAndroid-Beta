package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18507a = 0;
    public final long f18508b;
    public final ArrayList f18509c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18510f;
    public final Object h;
    public final Object f18511n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18510f = mediaDataController;
        this.h = task;
        this.f18511n = timer;
        this.f18509c = arrayList;
        this.f18508b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18507a) {
            case 0:
                ((MediaDataController) this.f18510f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18511n, this.f18509c, this.f18508b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18510f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18508b, this.f18509c, this.d, (HashSet) this.f18511n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18510f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18508b = j10;
        this.f18509c = arrayList;
        this.d = hVar;
        this.f18511n = hashSet;
        this.e = runnable;
    }
}
