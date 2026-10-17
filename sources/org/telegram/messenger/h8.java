package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class h8 implements Runnable {
    public final int f18508a = 0;
    public final long f18509b;
    public final ArrayList f18510c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18511f;
    public final Object h;
    public final Object f18512n;

    public h8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18511f = mediaDataController;
        this.h = task;
        this.f18512n = timer;
        this.f18510c = arrayList;
        this.f18509b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                ((MediaDataController) this.f18511f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18512n, this.f18510c, this.f18509b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18511f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18509b, this.f18510c, this.d, (HashSet) this.f18512n, runnable);
                return;
        }
    }

    public h8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18511f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18509b = j10;
        this.f18510c = arrayList;
        this.d = hVar;
        this.f18512n = hashSet;
        this.e = runnable;
    }
}
