package bi;

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
public final class j9 implements RequestDelegate {
    public final int f3209a = 0;
    public final Timer.Task f3210b;
    public final long f3211c;
    public final boolean d;
    public final Timer e;
    public final Runnable f3212f;
    public final Object f3213g;
    public final Cloneable h;
    public final Serializable f3214i;

    public j9(k9 k9Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f3213g = k9Var;
        this.f3210b = task;
        this.h = arrayList;
        this.f3211c = j10;
        this.d = z10;
        this.e = timer;
        this.f3214i = iArr;
        this.f3212f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3209a) {
            case 0:
                k9 k9Var = (k9) this.f3213g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f3214i;
                int i10 = k9Var.f3251a;
                Timer.done(this.f3210b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f3211c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f19451id == k9.e(messageObject)) {
                                    k9.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f19451id = k9.e(messageObject);
                                k9.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            k9Var.f3252b.getStorageQueue().postRunnable(new u8(7, k9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f3212f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f3213g).lambda$loadReplyMessagesForMessages$176(this.f3210b, this.f3211c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f3214i, this.f3212f, tLObject, tL_error);
                return;
        }
    }

    public j9(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f3213g = mediaDataController;
        this.f3210b = task;
        this.f3211c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.f3214i = atomicInteger;
        this.f3212f = runnable;
    }
}
