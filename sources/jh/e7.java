package jh;

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

    public final int f13306a = 0;

    public final Timer.Task f13307b;

    public final long f13308c;
    public final boolean d;

    public final Timer f13309e;

    public final Runnable f13310f;

    public final Object f13311g;
    public final Cloneable h;

    public final Serializable f13312i;

    public e7(f7 f7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f13311g = f7Var;
        this.f13307b = task;
        this.h = arrayList;
        this.f13308c = j10;
        this.d = z10;
        this.f13309e = timer;
        this.f13312i = iArr;
        this.f13310f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13306a) {
            case 0:
                f7 f7Var = (f7) this.f13311g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f13312i;
                int i10 = f7Var.f13331a;
                Timer.done(this.f13307b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f13308c;
                            if (i12 >= size) {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f22617id = f7.e(messageObject);
                                f7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            } else if (tL_stories_stories.stories.get(i12).f22617id == f7.e(messageObject)) {
                                f7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                            } else {
                                i12++;
                            }
                        }
                        if (this.d) {
                            f7Var.f13332b.getStorageQueue().postRunnable(new p6(7, f7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f13309e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f13310f.run();
                }
                break;
            default:
                ((MediaDataController) this.f13311g).lambda$loadReplyMessagesForMessages$176(this.f13307b, this.f13308c, (a0.h) this.h, this.d, this.f13309e, (AtomicInteger) this.f13312i, this.f13310f, tLObject, tL_error);
                break;
        }
    }

    public e7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f13311g = mediaDataController;
        this.f13307b = task;
        this.f13308c = j10;
        this.h = hVar;
        this.d = z10;
        this.f13309e = timer;
        this.f13312i = atomicInteger;
        this.f13310f = runnable;
    }
}
