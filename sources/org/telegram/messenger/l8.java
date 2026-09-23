package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16641a = 0;
    public final long f16642b;
    public final ArrayList f16643c;
    public final a0.i d;
    public final Runnable e;
    public final BaseController f16644f;
    public final Object h;
    public final Object f16645n;

    public l8(MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, long j3, a0.i iVar, Runnable runnable) {
        this.f16644f = mediaDataController;
        this.h = task;
        this.f16645n = timer;
        this.f16643c = arrayList;
        this.f16642b = j3;
        this.d = iVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16641a) {
            case 0:
                ((MediaDataController) this.f16644f).lambda$loadReplyMessagesForMessages$171((Timer.Task) this.h, (Timer) this.f16645n, this.f16643c, this.f16642b, this.d, this.e);
                return;
            default:
                Runnable runnable = this.e;
                ((TopicsController) this.f16644f).lambda$reloadTopics$13((TLRPC.TL_messages_savedDialogs) this.h, this.f16642b, this.f16643c, this.d, (HashSet) this.f16645n, runnable);
                return;
        }
    }

    public l8(TopicsController topicsController, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        this.f16644f = topicsController;
        this.h = tL_messages_savedDialogs;
        this.f16642b = j3;
        this.f16643c = arrayList;
        this.d = iVar;
        this.f16645n = hashSet;
        this.e = runnable;
    }
}
