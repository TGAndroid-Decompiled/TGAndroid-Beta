package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f16535a = 0;
    public final long f16536b;
    public final ArrayList f16537c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16538f;
    public final Object h;
    public final Object f16539n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16538f = mediaDataController;
        this.h = task;
        this.f16539n = timer;
        this.f16537c = arrayList;
        this.f16536b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16535a) {
            case 0:
                ((MediaDataController) this.f16538f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16539n, this.f16537c, this.f16536b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16538f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16536b, this.f16537c, this.d, (HashSet) this.f16539n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16538f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16536b = j3;
        this.f16537c = arrayList;
        this.d = iVar;
        this.f16539n = hashSet;
        this.e = runnable;
    }
}
