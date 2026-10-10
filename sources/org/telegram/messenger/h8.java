package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18033a = 0;
    public final long f18034b;
    public final ArrayList f18035c;
    public final a0.i d;
    public final Runnable f18036e;
    public final BaseController f18037f;
    public final Object h;
    public final Object f18038n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18037f = mediaDataController;
        this.h = task;
        this.f18038n = timer;
        this.f18035c = arrayList;
        this.f18034b = j3;
        this.d = iVar;
        this.f18036e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18033a) {
            case 0:
                ((MediaDataController) this.f18037f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18038n, this.f18035c, this.f18034b, this.d, this.f18036e);
                return;
            default:
                Runnable runnable = this.f18036e;
                ((TopicsController) this.f18037f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18034b, this.f18035c, this.d, (HashSet) this.f18038n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18037f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18034b = j3;
        this.f18035c = arrayList;
        this.d = iVar;
        this.f18038n = hashSet;
        this.f18036e = runnable;
    }
}
