package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16661a = 0;
    public final long f16662b;
    public final ArrayList f16663c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16664f;
    public final Object h;
    public final Object f16665n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16664f = mediaDataController;
        this.h = task;
        this.f16665n = timer;
        this.f16663c = arrayList;
        this.f16662b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16661a) {
            case 0:
                ((MediaDataController) this.f16664f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16665n, this.f16663c, this.f16662b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16664f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16662b, this.f16663c, this.d, (HashSet) this.f16665n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16664f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16662b = j3;
        this.f16663c = arrayList;
        this.d = iVar;
        this.f16665n = hashSet;
        this.e = runnable;
    }
}
