package ih;

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
public final class h7 implements RequestDelegate {
    public final int f11506a = 0;
    public final Timer.Task f11507b;
    public final long f11508c;
    public final boolean d;
    public final Timer f11509e;
    public final Runnable f11510f;
    public final Object f11511g;
    public final Cloneable h;
    public final Serializable f11512i;

    public h7(i7 i7Var, Timer.Task task, ArrayList arrayList, long j10, boolean z10, Timer timer, int[] iArr, Runnable runnable) {
        this.f11511g = i7Var;
        this.f11507b = task;
        this.h = arrayList;
        this.f11508c = j10;
        this.d = z10;
        this.f11509e = timer;
        this.f11512i = iArr;
        this.f11510f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11506a) {
            case 0:
                i7 i7Var = (i7) this.f11511g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f11512i;
                int i9 = i7Var.f11619a;
                Timer.done(this.f11507b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f11508c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f22617id == i7.e(messageObject)) {
                                    i7.b(i9, j10, messageObject, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f22617id = i7.e(messageObject);
                                i7.b(i9, j10, messageObject, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            i7Var.f11620b.getStorageQueue().postRunnable(new h3.g0(28, i7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f11509e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f11510f.run();
                    return;
                }
                return;
            default:
                ((MediaDataController) this.f11511g).lambda$loadReplyMessagesForMessages$176(this.f11507b, this.f11508c, (a0.h) this.h, this.d, this.f11509e, (AtomicInteger) this.f11512i, this.f11510f, tLObject, tL_error);
                return;
        }
    }

    public h7(MediaDataController mediaDataController, Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f11511g = mediaDataController;
        this.f11507b = task;
        this.f11508c = j10;
        this.h = hVar;
        this.d = z10;
        this.f11509e = timer;
        this.f11512i = atomicInteger;
        this.f11510f = runnable;
    }
}
