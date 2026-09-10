package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f16290a = 0;
    public final long f16291b;
    public final ArrayList f16292c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16293f;
    public final Object h;
    public final Object f16294n;

    public s8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16293f = mediaDataController;
        this.h = task;
        this.f16294n = timer;
        this.f16292c = arrayList;
        this.f16291b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16290a) {
            case 0:
                ((MediaDataController) this.f16293f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16294n, this.f16292c, this.f16291b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16293f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16291b, this.f16292c, this.d, (HashSet) this.f16294n, runnable);
                return;
        }
    }

    public s8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16293f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16291b = j3;
        this.f16292c = arrayList;
        this.d = iVar;
        this.f16294n = hashSet;
        this.e = runnable;
    }
}
