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
    public final int f3055a = 0;
    public final Timer.Task f3056b;
    public final long f3057c;
    public final boolean d;
    public final Timer f3058e;
    public final Runnable f3059f;
    public final Object f3060g;
    public final Cloneable h;
    public final Serializable f3061i;

    public g9(h9 h9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f3060g = h9Var;
        this.f3056b = task;
        this.h = arrayList;
        this.f3057c = j3;
        this.d = z10;
        this.f3058e = timer;
        this.f3061i = iArr;
        this.f3059f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3055a) {
            case 0:
                h9 h9Var = (h9) this.f3060g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f3061i;
                int i10 = h9Var.f3100a;
                Timer.done(this.f3056b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f3057c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20134id == h9.e(messageObject)) {
                                    h9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20134id = h9.e(messageObject);
                                h9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            h9Var.f3101b.getStorageQueue().postRunnable(new s8(5, h9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f3058e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f3059f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f3060g).lambda$loadReplyMessagesForMessages$176(this.f3056b, this.f3057c, (a0.i) this.h, this.d, this.f3058e, (AtomicInteger) this.f3061i, this.f3059f, tLObject, tL_error);
                return;
        }
    }

    public g9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f3060g = mediaDataController;
        this.f3056b = task;
        this.f3057c = j3;
        this.h = iVar;
        this.d = z10;
        this.f3058e = timer;
        this.f3061i = atomicInteger;
        this.f3059f = runnable;
    }
}
