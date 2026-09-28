package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f16536a = 0;
    public final long f16537b;
    public final ArrayList f16538c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16539f;
    public final Object h;
    public final Object f16540n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16539f = mediaDataController;
        this.h = task;
        this.f16540n = timer;
        this.f16538c = arrayList;
        this.f16537b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16536a) {
            case 0:
                ((MediaDataController) this.f16539f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16540n, this.f16538c, this.f16537b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16539f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16537b, this.f16538c, this.d, (HashSet) this.f16540n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16539f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16537b = j3;
        this.f16538c = arrayList;
        this.d = iVar;
        this.f16540n = hashSet;
        this.e = runnable;
    }
}
