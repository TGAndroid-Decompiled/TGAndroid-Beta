package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f19542a = 0;
    public final long f19543b;
    public final ArrayList f19544c;
    public final a0.h d;
    public final Runnable f19545e;
    public final BaseController f19546f;
    public final Object h;
    public final Object f19547n;

    public o8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f19546f = mediaDataController;
        this.h = task;
        this.f19547n = timer;
        this.f19544c = arrayList;
        this.f19543b = j10;
        this.d = hVar;
        this.f19545e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19542a) {
            case 0:
                ((MediaDataController) this.f19546f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f19547n, this.f19544c, this.f19543b, this.d, this.f19545e);
                return;
            default:
                Runnable runnable = this.f19545e;
                ((TopicsController) this.f19546f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f19543b, this.f19544c, this.d, (HashSet) this.f19547n, runnable);
                return;
        }
    }

    public o8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f19546f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f19543b = j10;
        this.f19544c = arrayList;
        this.d = hVar;
        this.f19547n = hashSet;
        this.f19545e = runnable;
    }
}
