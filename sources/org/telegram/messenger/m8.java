package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class m8 implements Runnable {
    public final int f19014a = 0;
    public final long f19015b;
    public final ArrayList f19016c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f19017f;
    public final Object h;
    public final Object f19018n;

    public m8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f19017f = mediaDataController;
        this.h = task;
        this.f19018n = timer;
        this.f19016c = arrayList;
        this.f19015b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19014a) {
            case 0:
                ((MediaDataController) this.f19017f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f19018n, this.f19016c, this.f19015b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f19017f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f19015b, this.f19016c, this.d, (HashSet) this.f19018n, runnable);
                return;
        }
    }

    public m8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f19017f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f19015b = j10;
        this.f19016c = arrayList;
        this.d = hVar;
        this.f19018n = hashSet;
        this.e = runnable;
    }
}
