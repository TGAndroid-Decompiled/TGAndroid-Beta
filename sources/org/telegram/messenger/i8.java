package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f18584a = 0;
    public final long f18585b;
    public final ArrayList f18586c;
    public final a0.h d;
    public final Runnable e;
    public final BaseController f18587f;
    public final Object h;
    public final Object f18588n;

    public i8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f18587f = mediaDataController;
        this.h = task;
        this.f18588n = timer;
        this.f18586c = arrayList;
        this.f18585b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18584a) {
            case 0:
                ((MediaDataController) this.f18587f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f18588n, this.f18586c, this.f18585b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f18587f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f18585b, this.f18586c, this.d, (HashSet) this.f18588n, runnable);
                return;
        }
    }

    public i8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f18587f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f18585b = j10;
        this.f18586c = arrayList;
        this.d = hVar;
        this.f18588n = hashSet;
        this.e = runnable;
    }
}
