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
    public final int f1961a = 0;
    public final Timer.Task f1962b;
    public final long f1963c;
    public final boolean d;
    public final Timer f1964e;
    public final Runnable f1965f;
    public final Object f1966g;
    public final Cloneable h;
    public final Serializable f1967i;

    public y9(z9 z9Var, Timer.Task task, ArrayList arrayList, long j3, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f1966g = z9Var;
        this.f1962b = task;
        this.h = arrayList;
        this.f1963c = j3;
        this.d = z10;
        this.f1964e = timer;
        this.f1967i = iArr;
        this.f1965f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1961a) {
            case 0:
                z9 z9Var = (z9) this.f1966g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f1967i;
                int i10 = z9Var.f2021a;
                Timer.done(this.f1962b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f1963c;
                            if (i12 < size) {
                                if (tL_stories_stories.stories.get(i12).f20275id == z9.e(messageObject)) {
                                    z9.b(i10, j3, messageObject, tL_stories_stories.stories.get(i12));
                                } else {
                                    i12++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20275id = z9.e(messageObject);
                                z9.b(i10, j3, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            z9Var.f2022b.getStorageQueue().postRunnable(new a1.f(26, z9Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f1964e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    this.f1965f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f1966g).lambda$loadReplyMessagesForMessages$176(this.f1962b, this.f1963c, (a0.i) this.h, this.d, this.f1964e, (AtomicInteger) this.f1967i, this.f1965f, tLObject, tL_error);
                return;
        }
    }

    public y9(MediaDataController mediaDataController, Timer.Task task, long j3, a0.i iVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f1966g = mediaDataController;
        this.f1962b = task;
        this.f1963c = j3;
        this.h = iVar;
        this.d = z10;
        this.f1964e = timer;
        this.f1967i = atomicInteger;
        this.f1965f = runnable;
    }
}
