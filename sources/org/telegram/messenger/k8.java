package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f18193a = 0;
    public final long f18194b;
    public final ArrayList f18195c;
    public final a0.i d;
    public final Runnable f18196e;
    public final BaseController f18197f;
    public final Object h;
    public final Object f18198n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18197f = mediaDataController;
        this.h = task;
        this.f18198n = timer;
        this.f18195c = arrayList;
        this.f18194b = j3;
        this.d = iVar;
        this.f18196e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18193a) {
            case 0:
                ((MediaDataController) this.f18197f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18198n, this.f18195c, this.f18194b, this.d, this.f18196e);
                return;
            default:
                Runnable runnable = this.f18196e;
                ((TopicsController) this.f18197f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18194b, this.f18195c, this.d, (HashSet) this.f18198n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18197f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18194b = j3;
        this.f18195c = arrayList;
        this.d = iVar;
        this.f18198n = hashSet;
        this.f18196e = runnable;
    }
}
