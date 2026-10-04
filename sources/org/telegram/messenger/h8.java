package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18025a = 0;
    public final long f18026b;
    public final ArrayList f18027c;
    public final a0.i d;
    public final Runnable f18028e;
    public final BaseController f18029f;
    public final Object h;
    public final Object f18030n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18029f = mediaDataController;
        this.h = task;
        this.f18030n = timer;
        this.f18027c = arrayList;
        this.f18026b = j3;
        this.d = iVar;
        this.f18028e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18025a) {
            case 0:
                ((MediaDataController) this.f18029f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18030n, this.f18027c, this.f18026b, this.d, this.f18028e);
                return;
            default:
                Runnable runnable = this.f18028e;
                ((TopicsController) this.f18029f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18026b, this.f18027c, this.d, (HashSet) this.f18030n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18029f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18026b = j3;
        this.f18027c = arrayList;
        this.d = iVar;
        this.f18030n = hashSet;
        this.f18028e = runnable;
    }
}
