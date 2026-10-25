package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class n8 implements Runnable {
    public final int f20749a = 0;
    public final long f20750b;
    public final ArrayList f20751c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f20752f;
    public final Object h;
    public final Object f20753n;

    public n8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f20752f = mediaDataController;
        this.h = task;
        this.f20753n = timer;
        this.f20751c = arrayList;
        this.f20750b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20749a) {
            case 0:
                ((MediaDataController) this.f20752f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f20753n, this.f20751c, this.f20750b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f20752f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f20750b, this.f20751c, this.d, (HashSet) this.f20753n, runnable);
                return;
        }
    }

    public n8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f20752f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f20750b = j10;
        this.f20751c = arrayList;
        this.d = hVar;
        this.f20753n = hashSet;
        this.e = runnable;
    }
}
