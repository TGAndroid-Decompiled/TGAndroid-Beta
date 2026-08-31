package oh;

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
public final class f7 implements RequestDelegate {
    public final int f17137a = 0;
    public final Timer.Task f17138b;
    public final long f17139c;
    public final boolean d;
    public final Timer f17140e;
    public final Runnable f17141f;
    public final Object f17142g;
    public final Cloneable h;
    public final Serializable f17143i;

    public f7(g7 g7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z4, Timer timer, int[] iArr, Runnable runnable) {
        this.f17142g = g7Var;
        this.f17138b = task;
        this.h = arrayList;
        this.f17139c = j10;
        this.d = z4;
        this.f17140e = timer;
        this.f17143i = iArr;
        this.f17141f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17137a) {
            case 0:
                g7 g7Var = (g7) this.f17142g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f17143i;
                int i10 = g7Var.f17163a;
                Timer.done(this.f17138b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f17139c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f21080id == g7.e(messageObject)) {
                                    g7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f21080id = g7.e(messageObject);
                                g7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            g7Var.f17164b.getStorageQueue().postRunnable(new z1(16, g7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f17140e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f17141f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f17142g).lambda$loadReplyMessagesForMessages$176(this.f17138b, this.f17139c, (a0.h) this.h, this.d, this.f17140e, (AtomicInteger) this.f17143i, this.f17141f, tLObject, tL_error);
                return;
        }
    }

    public f7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z4, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f17142g = mediaDataController;
        this.f17138b = task;
        this.f17139c = j10;
        this.h = hVar;
        this.d = z4;
        this.f17140e = timer;
        this.f17143i = atomicInteger;
        this.f17141f = runnable;
    }
}
