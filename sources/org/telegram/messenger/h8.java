package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18030a = 0;
    public final long f18031b;
    public final ArrayList f18032c;
    public final a0.i d;
    public final Runnable f18033e;
    public final BaseController f18034f;
    public final Object h;
    public final Object f18035n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18034f = mediaDataController;
        this.h = task;
        this.f18035n = timer;
        this.f18032c = arrayList;
        this.f18031b = j3;
        this.d = iVar;
        this.f18033e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                ((MediaDataController) this.f18034f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18035n, this.f18032c, this.f18031b, this.d, this.f18033e);
                return;
            default:
                Runnable runnable = this.f18033e;
                ((TopicsController) this.f18034f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18031b, this.f18032c, this.d, (HashSet) this.f18035n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18034f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18031b = j3;
        this.f18032c = arrayList;
        this.d = iVar;
        this.f18035n = hashSet;
        this.f18033e = runnable;
    }
}
