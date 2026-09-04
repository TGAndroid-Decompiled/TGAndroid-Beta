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
public final class g9 implements RequestDelegate {
    public final int f3028a = 0;
    public final Timer.Task f3029b;
    public final long f3030c;
    public final boolean d;
    public final Timer f3031e;
    public final Runnable f3032f;
    public final Object f3033g;
    public final Cloneable h;
    public final Serializable f3034i;

    public g9(h9 h9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f3033g = h9Var;
        this.f3029b = task;
        this.h = arrayList;
        this.f3030c = j3;
        this.d = z10;
        this.f3031e = timer;
        this.f3034i = iArr;
        this.f3032f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3028a) {
            case 0:
                h9 h9Var = (h9) this.f3033g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f3034i;
                int i10 = h9Var.f3073a;
                Timer.done(this.f3029b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f3030c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20107id == h9.e(messageObject)) {
                                    h9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20107id = h9.e(messageObject);
                                h9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            h9Var.f3074b.getStorageQueue().postRunnable(new s8(5, h9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f3031e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f3032f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f3033g).lambda$loadReplyMessagesForMessages$176(this.f3029b, this.f3030c, (a0.i) this.h, this.d, this.f3031e, (AtomicInteger) this.f3034i, this.f3032f, tLObject, tL_error);
                return;
        }
    }

    public g9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f3033g = mediaDataController;
        this.f3029b = task;
        this.f3030c = j3;
        this.h = iVar;
        this.d = z10;
        this.f3031e = timer;
        this.f3034i = atomicInteger;
        this.f3032f = runnable;
    }
}
