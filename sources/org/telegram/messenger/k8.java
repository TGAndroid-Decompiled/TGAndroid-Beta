package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class k8 implements Runnable {
    public final int f17669a = 0;
    public final long f17670b;
    public final ArrayList f17671c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f17672f;
    public final Object h;
    public final Object f17673n;

    public k8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f17672f = mediaDataController;
        this.h = task;
        this.f17673n = timer;
        this.f17671c = arrayList;
        this.f17670b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17669a) {
            case 0:
                ((MediaDataController) this.f17672f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f17673n, this.f17671c, this.f17670b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f17672f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f17670b, this.f17671c, this.d, (HashSet) this.f17673n, runnable);
                return;
        }
    }

    public k8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f17672f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f17670b = j10;
        this.f17671c = arrayList;
        this.d = hVar;
        this.f17673n = hashSet;
        this.e = runnable;
    }
}
