package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

public final class l8 implements Runnable {

    public final int f20852a = 0;

    public final long f20853b;

    public final ArrayList f20854c;
    public final a0.h d;

    public final Runnable f20855e;

    public final BaseController f20856f;
    public final Object h;

    public final Object f20857n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f20856f = mediaDataController;
        this.h = task;
        this.f20857n = timer;
        this.f20854c = arrayList;
        this.f20853b = j10;
        this.d = hVar;
        this.f20855e = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20852a) {
            case 0:
                ((MediaDataController) this.f20856f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f20857n, this.f20854c, this.f20853b, this.d, this.f20855e);
                break;
            default:
                ((TopicsController) this.f20856f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f20853b, this.f20854c, this.d, (HashSet) this.f20857n, this.f20855e);
                break;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f20856f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f20853b = j10;
        this.f20854c = arrayList;
        this.d = hVar;
        this.f20857n = hashSet;
        this.f20855e = runnable;
    }
}
