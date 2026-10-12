package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f18047a = 0;
    public final long f18048b;
    public final ArrayList f18049c;
    public final a0.i d;
    public final Runnable f18050e;
    public final BaseController f18051f;
    public final Object h;
    public final Object f18052n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18051f = mediaDataController;
        this.h = task;
        this.f18052n = timer;
        this.f18049c = arrayList;
        this.f18048b = j3;
        this.d = iVar;
        this.f18050e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18047a) {
            case 0:
                ((MediaDataController) this.f18051f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18052n, this.f18049c, this.f18048b, this.d, this.f18050e);
                return;
            default:
                Runnable runnable = this.f18050e;
                ((TopicsController) this.f18051f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18048b, this.f18049c, this.d, (HashSet) this.f18052n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18051f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18048b = j3;
        this.f18049c = arrayList;
        this.d = iVar;
        this.f18052n = hashSet;
        this.f18050e = runnable;
    }
}
