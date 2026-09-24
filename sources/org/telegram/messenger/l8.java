package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16884a = 0;
    public final long f16885b;
    public final ArrayList f16886c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16887f;
    public final Object h;
    public final Object f16888n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16887f = mediaDataController;
        this.h = task;
        this.f16888n = timer;
        this.f16886c = arrayList;
        this.f16885b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16884a) {
            case 0:
                ((MediaDataController) this.f16887f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16888n, this.f16886c, this.f16885b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16887f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16885b, this.f16886c, this.d, (HashSet) this.f16888n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16887f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16885b = j3;
        this.f16886c = arrayList;
        this.d = iVar;
        this.f16888n = hashSet;
        this.e = runnable;
    }
}
