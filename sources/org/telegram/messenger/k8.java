package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f18048a = 0;
    public final long f18049b;
    public final ArrayList f18050c;
    public final a0.i d;
    public final Runnable f18051e;
    public final BaseController f18052f;
    public final Object h;
    public final Object f18053n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18052f = mediaDataController;
        this.h = task;
        this.f18053n = timer;
        this.f18050c = arrayList;
        this.f18049b = j3;
        this.d = iVar;
        this.f18051e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18048a) {
            case 0:
                ((MediaDataController) this.f18052f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18053n, this.f18050c, this.f18049b, this.d, this.f18051e);
                return;
            default:
                Runnable runnable = this.f18051e;
                ((TopicsController) this.f18052f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18049b, this.f18050c, this.d, (HashSet) this.f18053n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18052f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18049b = j3;
        this.f18050c = arrayList;
        this.d = iVar;
        this.f18053n = hashSet;
        this.f18051e = runnable;
    }
}
