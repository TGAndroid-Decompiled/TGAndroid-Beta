package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18029a = 0;
    public final long f18030b;
    public final ArrayList f18031c;
    public final a0.i d;
    public final Runnable f18032e;
    public final BaseController f18033f;
    public final Object h;
    public final Object f18034n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18033f = mediaDataController;
        this.h = task;
        this.f18034n = timer;
        this.f18031c = arrayList;
        this.f18030b = j3;
        this.d = iVar;
        this.f18032e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18029a) {
            case 0:
                ((MediaDataController) this.f18033f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18034n, this.f18031c, this.f18030b, this.d, this.f18032e);
                return;
            default:
                Runnable runnable = this.f18032e;
                ((TopicsController) this.f18033f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18030b, this.f18031c, this.d, (HashSet) this.f18034n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18033f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18030b = j3;
        this.f18031c = arrayList;
        this.d = iVar;
        this.f18034n = hashSet;
        this.f18032e = runnable;
    }
}
