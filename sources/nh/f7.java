package nh;

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
    public final int f15306a = 0;
    public final Timer.Task f15307b;
    public final long f15308c;
    public final boolean d;
    public final Timer e;
    public final Runnable f15309f;
    public final Object f15310g;
    public final Cloneable h;
    public final Serializable f15311i;

    public f7(g7 g7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z4, Timer timer, int[] iArr, Runnable runnable) {
        this.f15310g = g7Var;
        this.f15307b = task;
        this.h = arrayList;
        this.f15308c = j10;
        this.d = z4;
        this.e = timer;
        this.f15311i = iArr;
        this.f15309f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15306a) {
            case 0:
                g7 g7Var = (g7) this.f15310g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f15311i;
                int i10 = g7Var.f15345a;
                Timer.done(this.f15307b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f15308c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f19394id == g7.e(messageObject)) {
                                    g7.b(i10, j10, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f19394id = g7.e(messageObject);
                                g7.b(i10, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            g7Var.f15346b.getStorageQueue().postRunnable(new n4(13, g7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f15309f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f15310g).lambda$loadReplyMessagesForMessages$176(this.f15307b, this.f15308c, (a0.h) this.h, this.d, this.e, (AtomicInteger) this.f15311i, this.f15309f, tLObject, tL_error);
                return;
        }
    }

    public f7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z4, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f15310g = mediaDataController;
        this.f15307b = task;
        this.f15308c = j10;
        this.h = hVar;
        this.d = z4;
        this.e = timer;
        this.f15311i = atomicInteger;
        this.f15309f = runnable;
    }
}
