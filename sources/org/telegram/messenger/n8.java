package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class n8 implements Runnable {
    public final int f21040a = 0;
    public final long f21041b;
    public final ArrayList f21042c;
    public final a0.h d;
    public final Runnable f21043e;
    public final BaseController f21044f;
    public final Object h;
    public final Object f21045n;

    public n8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f21044f = mediaDataController;
        this.h = task;
        this.f21045n = timer;
        this.f21042c = arrayList;
        this.f21041b = j10;
        this.d = hVar;
        this.f21043e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21040a) {
            case 0:
                ((MediaDataController) this.f21044f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f21045n, this.f21042c, this.f21041b, this.d, this.f21043e);
                return;
            default:
                Runnable runnable = this.f21043e;
                ((TopicsController) this.f21044f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f21041b, this.f21042c, this.d, (HashSet) this.f21045n, runnable);
                return;
        }
    }

    public n8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f21044f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f21041b = j10;
        this.f21042c = arrayList;
        this.d = hVar;
        this.f21045n = hashSet;
        this.f21043e = runnable;
    }
}
