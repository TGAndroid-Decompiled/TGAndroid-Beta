package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f17368a = 0;
    public final long f17369b;
    public final ArrayList f17370c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f17371f;
    public final Object h;
    public final Object f17372n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f17371f = mediaDataController;
        this.h = task;
        this.f17372n = timer;
        this.f17370c = arrayList;
        this.f17369b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17368a) {
            case 0:
                ((MediaDataController) this.f17371f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f17372n, this.f17370c, this.f17369b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f17371f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f17369b, this.f17370c, this.d, (HashSet) this.f17372n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f17371f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f17369b = j10;
        this.f17370c = arrayList;
        this.d = hVar;
        this.f17372n = hashSet;
        this.e = runnable;
    }
}
