package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18273a = 0;
    public final long f18274b;
    public final ArrayList f18275c;
    public final a0.i d;
    public final Runnable f18276e;
    public final BaseController f18277f;
    public final Object h;
    public final Object f18278n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18277f = mediaDataController;
        this.h = task;
        this.f18278n = timer;
        this.f18275c = arrayList;
        this.f18274b = j3;
        this.d = iVar;
        this.f18276e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                ((MediaDataController) this.f18277f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18278n, this.f18275c, this.f18274b, this.d, this.f18276e);
                return;
            default:
                Runnable runnable = this.f18276e;
                ((TopicsController) this.f18277f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18274b, this.f18275c, this.d, (HashSet) this.f18278n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18277f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18274b = j3;
        this.f18275c = arrayList;
        this.d = iVar;
        this.f18278n = hashSet;
        this.f18276e = runnable;
    }
}
