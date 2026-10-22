package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class m8 implements Runnable {
    public final int f18948a = 0;
    public final long f18949b;
    public final ArrayList f18950c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18951f;
    public final Object h;
    public final Object f18952n;

    public m8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18951f = mediaDataController;
        this.h = task;
        this.f18952n = timer;
        this.f18950c = arrayList;
        this.f18949b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18948a) {
            case 0:
                ((MediaDataController) this.f18951f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18952n, this.f18950c, this.f18949b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18951f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18949b, this.f18950c, this.d, (HashSet) this.f18952n, runnable);
                return;
        }
    }

    public m8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18951f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18949b = j10;
        this.f18950c = arrayList;
        this.d = hVar;
        this.f18952n = hashSet;
        this.e = runnable;
    }
}
