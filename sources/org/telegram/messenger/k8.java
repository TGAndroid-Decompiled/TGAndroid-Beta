package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f18166a = 0;
    public final long f18167b;
    public final ArrayList f18168c;
    public final a0.i d;
    public final Runnable f18169e;
    public final BaseController f18170f;
    public final Object h;
    public final Object f18171n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18170f = mediaDataController;
        this.h = task;
        this.f18171n = timer;
        this.f18168c = arrayList;
        this.f18167b = j3;
        this.d = iVar;
        this.f18169e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18166a) {
            case 0:
                ((MediaDataController) this.f18170f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18171n, this.f18168c, this.f18167b, this.d, this.f18169e);
                return;
            default:
                Runnable runnable = this.f18169e;
                ((TopicsController) this.f18170f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18167b, this.f18168c, this.d, (HashSet) this.f18171n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18170f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18167b = j3;
        this.f18168c = arrayList;
        this.d = iVar;
        this.f18171n = hashSet;
        this.f18169e = runnable;
    }
}
