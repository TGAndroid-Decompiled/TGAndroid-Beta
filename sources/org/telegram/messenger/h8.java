package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18032a = 0;
    public final long f18033b;
    public final ArrayList f18034c;
    public final a0.i d;
    public final Runnable f18035e;
    public final BaseController f18036f;
    public final Object h;
    public final Object f18037n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18036f = mediaDataController;
        this.h = task;
        this.f18037n = timer;
        this.f18034c = arrayList;
        this.f18033b = j3;
        this.d = iVar;
        this.f18035e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18032a) {
            case 0:
                ((MediaDataController) this.f18036f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18037n, this.f18034c, this.f18033b, this.d, this.f18035e);
                return;
            default:
                Runnable runnable = this.f18035e;
                ((TopicsController) this.f18036f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18033b, this.f18034c, this.d, (HashSet) this.f18037n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18036f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18033b = j3;
        this.f18034c = arrayList;
        this.d = iVar;
        this.f18037n = hashSet;
        this.f18035e = runnable;
    }
}
