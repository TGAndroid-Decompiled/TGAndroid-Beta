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
public final class y9 implements RequestDelegate {
    public final int f1959a = 0;
    public final Timer.Task f1960b;
    public final long f1961c;
    public final boolean d;
    public final Timer f1962e;
    public final Runnable f1963f;
    public final Object f1964g;
    public final Cloneable h;
    public final Serializable f1965i;

    public y9(z9 z9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f1964g = z9Var;
        this.f1960b = task;
        this.h = arrayList;
        this.f1961c = j3;
        this.d = z10;
        this.f1962e = timer;
        this.f1965i = iArr;
        this.f1963f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1959a) {
            case 0:
                z9 z9Var = (z9) this.f1964g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f1965i;
                int i10 = z9Var.f2019a;
                Timer.done(this.f1960b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f1961c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20041id == z9.e(messageObject)) {
                                    z9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20041id = z9.e(messageObject);
                                z9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            z9Var.f2020b.getStorageQueue().postRunnable(new a1.f(26, z9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f1962e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f1963f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f1964g).lambda$loadReplyMessagesForMessages$176(this.f1960b, this.f1961c, (a0.i) this.h, this.d, this.f1962e, (AtomicInteger) this.f1965i, this.f1963f, tLObject, tL_error);
                return;
        }
    }

    public y9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f1964g = mediaDataController;
        this.f1960b = task;
        this.f1961c = j3;
        this.h = iVar;
        this.d = z10;
        this.f1962e = timer;
        this.f1965i = atomicInteger;
        this.f1963f = runnable;
    }
}
