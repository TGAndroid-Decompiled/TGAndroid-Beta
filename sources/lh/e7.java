package lh;

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
public final class e7 implements RequestDelegate {
    public final int f15578a = 0;
    public final Timer.Task f15579b;
    public final long f15580c;
    public final boolean d;
    public final Timer f15581e;
    public final Runnable f15582f;
    public final Object f15583g;
    public final Cloneable h;
    public final Serializable f15584i;

    public e7(f7 f7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f15583g = f7Var;
        this.f15579b = task;
        this.h = arrayList;
        this.f15580c = j10;
        this.d = z10;
        this.f15581e = timer;
        this.f15584i = iArr;
        this.f15582f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15578a) {
            case 0:
                f7 f7Var = (f7) this.f15583g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f15584i;
                int i10 = f7Var.f15599a;
                Timer.done(this.f15579b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f15580c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f22629id == f7.e(messageObject)) {
                                    f7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f22629id = f7.e(messageObject);
                                f7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            f7Var.f15600b.getStorageQueue().postRunnable(new r3(14, f7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f15581e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f15582f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f15583g).lambda$loadReplyMessagesForMessages$176(this.f15579b, this.f15580c, (a0.h) this.h, this.d, this.f15581e, (AtomicInteger) this.f15584i, this.f15582f, tLObject, tL_error);
                return;
        }
    }

    public e7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f15583g = mediaDataController;
        this.f15579b = task;
        this.f15580c = j10;
        this.h = hVar;
        this.d = z10;
        this.f15581e = timer;
        this.f15584i = atomicInteger;
        this.f15582f = runnable;
    }
}
