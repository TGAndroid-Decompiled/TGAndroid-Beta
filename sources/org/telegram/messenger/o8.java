package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f19540a = 0;
    public final long f19541b;
    public final ArrayList f19542c;
    public final a0.h d;
    public final Runnable f19543e;
    public final BaseController f19544f;
    public final Object h;
    public final Object f19545n;

    public o8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f19544f = mediaDataController;
        this.h = task;
        this.f19545n = timer;
        this.f19542c = arrayList;
        this.f19541b = j10;
        this.d = hVar;
        this.f19543e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19540a) {
            case 0:
                ((MediaDataController) this.f19544f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f19545n, this.f19542c, this.f19541b, this.d, this.f19543e);
                return;
            default:
                Runnable runnable = this.f19543e;
                ((TopicsController) this.f19544f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f19541b, this.f19542c, this.d, (HashSet) this.f19545n, runnable);
                return;
        }
    }

    public o8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f19544f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f19541b = j10;
        this.f19542c = arrayList;
        this.d = hVar;
        this.f19545n = hashSet;
        this.f19543e = runnable;
    }
}
