package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16829a = 0;
    public final long f16830b;
    public final ArrayList f16831c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16832f;
    public final Object h;
    public final Object f16833n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16832f = mediaDataController;
        this.h = task;
        this.f16833n = timer;
        this.f16831c = arrayList;
        this.f16830b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16829a) {
            case 0:
                ((MediaDataController) this.f16832f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16833n, this.f16831c, this.f16830b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16832f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16830b, this.f16831c, this.d, (HashSet) this.f16833n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16832f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16830b = j3;
        this.f16831c = arrayList;
        this.d = iVar;
        this.f16833n = hashSet;
        this.e = runnable;
    }
}
