package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f20841a = 0;
    public final long f20842b;
    public final ArrayList f20843c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f20844f;
    public final Object h;
    public final Object f20845n;

    public o8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f20844f = mediaDataController;
        this.h = task;
        this.f20845n = timer;
        this.f20843c = arrayList;
        this.f20842b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20841a) {
            case 0:
                ((MediaDataController) this.f20844f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f20845n, this.f20843c, this.f20842b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f20844f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f20842b, this.f20843c, this.d, (HashSet) this.f20845n, runnable);
                return;
        }
    }

    public o8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f20844f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f20842b = j10;
        this.f20843c = arrayList;
        this.d = hVar;
        this.f20845n = hashSet;
        this.e = runnable;
    }
}
