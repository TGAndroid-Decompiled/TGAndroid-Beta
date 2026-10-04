package ai;

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
public final class x9 implements RequestDelegate {
    public final int f1857a = 0;
    public final Timer.Task f1858b;
    public final long f1859c;
    public final boolean d;
    public final Timer f1860e;
    public final Runnable f1861f;
    public final Object f1862g;
    public final Cloneable h;
    public final Serializable f1863i;

    public x9(y9 y9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f1862g = y9Var;
        this.f1858b = task;
        this.h = arrayList;
        this.f1859c = j3;
        this.d = z10;
        this.f1860e = timer;
        this.f1863i = iArr;
        this.f1861f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1857a) {
            case 0:
                y9 y9Var = (y9) this.f1862g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f1863i;
                int i10 = y9Var.f1915a;
                Timer.done(this.f1858b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f1859c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20279id == y9.e(messageObject)) {
                                    y9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20279id = y9.e(messageObject);
                                y9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            y9Var.f1916b.getStorageQueue().postRunnable(new a1.e(26, y9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f1860e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f1861f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f1862g).lambda$loadReplyMessagesForMessages$176(this.f1858b, this.f1859c, (a0.i) this.h, this.d, this.f1860e, (AtomicInteger) this.f1863i, this.f1861f, tLObject, tL_error);
                return;
        }
    }

    public x9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f1862g = mediaDataController;
        this.f1858b = task;
        this.f1859c = j3;
        this.h = iVar;
        this.d = z10;
        this.f1860e = timer;
        this.f1863i = atomicInteger;
        this.f1861f = runnable;
    }
}
