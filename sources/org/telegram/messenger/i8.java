package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f20566a = 0;
    public final long f20567b;
    public final ArrayList f20568c;
    public final a0.h d;
    public final Runnable f20569e;
    public final BaseController f20570f;
    public final Object h;
    public final Object f20571n;

    public i8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f20570f = mediaDataController;
        this.h = task;
        this.f20571n = timer;
        this.f20568c = arrayList;
        this.f20567b = j10;
        this.d = hVar;
        this.f20569e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20566a) {
            case 0:
                ((MediaDataController) this.f20570f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f20571n, this.f20568c, this.f20567b, this.d, this.f20569e);
                return;
            default:
                Runnable runnable = this.f20569e;
                ((TopicsController) this.f20570f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f20567b, this.f20568c, this.d, (HashSet) this.f20571n, runnable);
                return;
        }
    }

    public i8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f20570f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f20567b = j10;
        this.f20568c = arrayList;
        this.d = hVar;
        this.f20571n = hashSet;
        this.f20569e = runnable;
    }
}
