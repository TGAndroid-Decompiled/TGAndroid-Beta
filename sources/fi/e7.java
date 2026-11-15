package fi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.wz;
import org.telegram.messenger.xz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e7 implements RequestDelegate {
    public final int f11677a = 0;
    public final wz f11678b;
    public final long f11679c;
    public final boolean d;
    public final xz f11680e;
    public final Runnable f11681f;
    public final Object f11682g;
    public final Cloneable h;
    public final Serializable f11683i;

    public e7(f7 f7Var, wz wzVar, ArrayList arrayList, long j3, boolean z10, xz xzVar, int[] iArr, Runnable runnable) {
        this.f11682g = f7Var;
        this.f11678b = wzVar;
        this.h = arrayList;
        this.f11679c = j3;
        this.d = z10;
        this.f11680e = xzVar;
        this.f11683i = iArr;
        this.f11681f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f11677a) {
            case 0:
                f7 f7Var = (f7) this.f11682g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f11683i;
                int i7 = f7Var.f11708a;
                xz.a(this.f11678b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f11679c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f28290id == f7.e(gjVar)) {
                                    f7.b(i7, j3, gjVar, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f28290id = f7.e(gjVar);
                                f7.b(i7, j3, gjVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            f7Var.f11709b.f27220a.c(new f6(7, f7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    xz.c(this.f11680e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f11681f.run();
                    return;
                }
                return;
            default:
                si siVar = (si) this.f11682g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f11683i;
                siVar.getClass();
                xz.a(this.f11678b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j10 = this.f11679c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i13++;
                        } else {
                            fc.X(messages_messages.messages);
                            siVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            siVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    xz.c(this.f11680e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f11681f) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }

    public e7(si siVar, wz wzVar, long j3, a0.h hVar, boolean z10, xz xzVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.f11682g = siVar;
        this.f11678b = wzVar;
        this.f11679c = j3;
        this.h = hVar;
        this.d = z10;
        this.f11680e = xzVar;
        this.f11683i = atomicInteger;
        this.f11681f = runnable;
    }
}
