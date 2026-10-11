package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18031a = 0;
    public final long f18032b;
    public final ArrayList f18033c;
    public final a0.i d;
    public final Runnable f18034e;
    public final BaseController f18035f;
    public final Object h;
    public final Object f18036n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f18035f = mediaDataController;
        this.h = task;
        this.f18036n = timer;
        this.f18033c = arrayList;
        this.f18032b = j3;
        this.d = iVar;
        this.f18034e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18031a) {
            case 0:
                ((MediaDataController) this.f18035f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18036n, this.f18033c, this.f18032b, this.d, this.f18034e);
                return;
            default:
                Runnable runnable = this.f18034e;
                ((TopicsController) this.f18035f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18032b, this.f18033c, this.d, (HashSet) this.f18036n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f18035f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18032b = j3;
        this.f18033c = arrayList;
        this.d = iVar;
        this.f18036n = hashSet;
        this.f18034e = runnable;
    }
}
