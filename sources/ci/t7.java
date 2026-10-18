package ci;

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
    public final int f5957a = 0;
    public final Timer.Task f5958b;
    public final long f5959c;
    public final boolean d;
    public final Timer e;
    public final Runnable f5960f;
    public final Object f5961g;
    public final Cloneable h;
    public final Serializable f5962i;

    public t7(v7 v7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f5961g = v7Var;
        this.f5958b = task;
        this.h = arrayList;
        this.f5959c = j10;
        this.d = z10;
        this.e = timer;
        this.f5962i = iArr;
        this.f5960f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5957a) {
            case 0:
                v7 v7Var = (v7) this.f5961g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f5962i;
                int i10 = v7Var.f6023a;
                Timer.done(this.f5958b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f5959c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20506id == v7.e(messageObject)) {
                                    v7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20506id = v7.e(messageObject);
                                v7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            v7Var.f6024b.getStorageQueue().postRunnable(new u7(0, v7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f5960f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f5961g).lambda$loadReplyMessagesForMessages$176(this.f5958b, this.f5959c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f5962i, this.f5960f, tLObject, tL_error);
                return;
        }
    }

    public t7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f5961g = mediaDataController;
        this.f5958b = task;
        this.f5959c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.f5962i = atomicInteger;
        this.f5960f = runnable;
    }
}
