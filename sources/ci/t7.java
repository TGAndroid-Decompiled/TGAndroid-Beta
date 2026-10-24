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
    public final int f5963a = 0;
    public final Timer.Task f5964b;
    public final long f5965c;
    public final boolean d;
    public final Timer e;
    public final Runnable f5966f;
    public final Object f5967g;
    public final Cloneable h;
    public final Serializable f5968i;

    public t7(v7 v7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f5967g = v7Var;
        this.f5964b = task;
        this.h = arrayList;
        this.f5965c = j10;
        this.d = z10;
        this.e = timer;
        this.f5968i = iArr;
        this.f5966f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5963a) {
            case 0:
                v7 v7Var = (v7) this.f5967g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f5968i;
                int i10 = v7Var.f6030a;
                Timer.done(this.f5964b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f5965c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20578id == v7.e(messageObject)) {
                                    v7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20578id = v7.e(messageObject);
                                v7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            v7Var.f6031b.getStorageQueue().postRunnable(new u7(0, v7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f5966f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f5967g).lambda$loadReplyMessagesForMessages$176(this.f5964b, this.f5965c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f5968i, this.f5966f, tLObject, tL_error);
                return;
        }
    }

    public t7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f5967g = mediaDataController;
        this.f5964b = task;
        this.f5965c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.f5968i = atomicInteger;
        this.f5966f = runnable;
    }
}
