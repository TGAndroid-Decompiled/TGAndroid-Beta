package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16886a = 0;
    public final long f16887b;
    public final ArrayList f16888c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16889f;
    public final Object h;
    public final Object f16890n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16889f = mediaDataController;
        this.h = task;
        this.f16890n = timer;
        this.f16888c = arrayList;
        this.f16887b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16886a) {
            case 0:
                ((MediaDataController) this.f16889f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16890n, this.f16888c, this.f16887b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16889f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16887b, this.f16888c, this.d, (HashSet) this.f16890n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16889f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16887b = j3;
        this.f16888c = arrayList;
        this.d = iVar;
        this.f16890n = hashSet;
        this.e = runnable;
    }
}
