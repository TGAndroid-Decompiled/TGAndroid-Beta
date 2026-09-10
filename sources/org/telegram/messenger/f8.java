package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f8 implements RequestDelegate {
    public final int f15149a = 0;
    public final Timer.Task f15150b;
    public final long f15151c;
    public final boolean d;
    public final Timer e;
    public final Runnable f15152f;
    public final Object f15153g;
    public final Cloneable h;
    public final Serializable f15154i;

    public f8(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f15153g = mediaDataController;
        this.f15150b = task;
        this.f15151c = j3;
        this.h = iVar;
        this.d = z10;
        this.e = timer;
        this.f15154i = atomicInteger;
        this.f15152f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15149a) {
            case 0:
                ((MediaDataController) this.f15153g).lambda$loadReplyMessagesForMessages$176(this.f15150b, this.f15151c, (a0.i) this.h, this.d, this.e, (AtomicInteger) this.f15154i, this.f15152f, tLObject, tL_error);
                return;
            default:
                zh.v5 v5Var = (zh.v5) this.f15153g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f15154i;
                int i10 = v5Var.f48989a;
                Timer.done(this.f15150b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f15151c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f17435id == zh.v5.e(messageObject)) {
                                    zh.v5.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f17435id = zh.v5.e(messageObject);
                                zh.v5.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            v5Var.f48990b.getStorageQueue().postRunnable(new yg.q(25, v5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f15152f.run();
                    return;
                }
                return;
        }
    }

    public f8(zh.v5 v5Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f15153g = v5Var;
        this.f15150b = task;
        this.h = arrayList;
        this.f15151c = j3;
        this.d = z10;
        this.e = timer;
        this.f15154i = iArr;
        this.f15152f = runnable;
    }
}
