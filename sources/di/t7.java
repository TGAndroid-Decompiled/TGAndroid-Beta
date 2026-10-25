package di;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t7 implements RequestDelegate {
    public final int f9201a = 0;
    public final Timer.Task f9202b;
    public final long f9203c;
    public final boolean d;
    public final Timer e;
    public final Runnable f9204f;
    public final Object f9205g;
    public final Cloneable h;
    public final Serializable f9206i;

    public t7(u7 u7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f9205g = u7Var;
        this.f9202b = task;
        this.h = arrayList;
        this.f9203c = j10;
        this.d = z10;
        this.e = timer;
        this.f9206i = iArr;
        this.f9204f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9201a) {
            case 0:
                u7 u7Var = (u7) this.f9205g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f9206i;
                int i10 = u7Var.f9234a;
                Timer.done(this.f9202b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f9203c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f22264id == u7.e(messageObject)) {
                                    u7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f22264id = u7.e(messageObject);
                                u7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            u7Var.f9235b.getStorageQueue().postRunnable(new b4(14, u7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f9204f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f9205g).lambda$loadReplyMessagesForMessages$176(this.f9202b, this.f9203c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f9206i, this.f9204f, tLObject, tL_error);
                return;
        }
    }

    public t7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f9205g = mediaDataController;
        this.f9202b = task;
        this.f9203c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.f9206i = atomicInteger;
        this.f9204f = runnable;
    }
}
