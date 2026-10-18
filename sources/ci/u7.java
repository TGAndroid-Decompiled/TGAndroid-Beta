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
public final class u7 implements RequestDelegate {
    public final int f6059a = 0;
    public final Timer.Task f6060b;
    public final long f6061c;
    public final boolean d;
    public final Timer e;
    public final Runnable f6062f;
    public final Object f6063g;
    public final Cloneable h;
    public final Serializable f6064i;

    public u7(w7 w7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f6063g = w7Var;
        this.f6060b = task;
        this.h = arrayList;
        this.f6061c = j10;
        this.d = z10;
        this.e = timer;
        this.f6064i = iArr;
        this.f6062f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6059a) {
            case 0:
                w7 w7Var = (w7) this.f6063g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f6064i;
                int i10 = w7Var.f6128a;
                Timer.done(this.f6060b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f6061c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20513id == w7.e(messageObject)) {
                                    w7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20513id = w7.e(messageObject);
                                w7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            w7Var.f6129b.getStorageQueue().postRunnable(new v7(0, w7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f6062f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f6063g).lambda$loadReplyMessagesForMessages$176(this.f6060b, this.f6061c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f6064i, this.f6062f, tLObject, tL_error);
                return;
        }
    }

    public u7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f6063g = mediaDataController;
        this.f6060b = task;
        this.f6061c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = timer;
        this.f6064i = atomicInteger;
        this.f6062f = runnable;
    }
}
