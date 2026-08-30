package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18000a = 0;
    public final long f18001b;
    public final ArrayList f18002c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18003f;
    public final Object h;
    public final Object f18004n;

    public o8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18003f = mediaDataController;
        this.h = task;
        this.f18004n = timer;
        this.f18002c = arrayList;
        this.f18001b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18000a) {
            case 0:
                ((MediaDataController) this.f18003f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18004n, this.f18002c, this.f18001b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18003f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18001b, this.f18002c, this.d, (HashSet) this.f18004n, runnable);
                return;
        }
    }

    public o8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18003f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18001b = j10;
        this.f18002c = arrayList;
        this.d = hVar;
        this.f18004n = hashSet;
        this.e = runnable;
    }
}
