package fi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.si;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b7 implements RequestDelegate {
    public final int f11823a = 0;
    public final tz f11824b;
    public final long f11825c;
    public final boolean d;
    public final uz f11826e;
    public final Runnable f11827f;
    public final Object f11828g;
    public final Cloneable h;
    public final Serializable f11829i;

    public b7(c7 c7Var, tz tzVar, ArrayList arrayList, long j3, boolean z10, uz uzVar, int[] iArr, Runnable runnable) {
        this.f11828g = c7Var;
        this.f11824b = tzVar;
        this.h = arrayList;
        this.f11825c = j3;
        this.d = z10;
        this.f11826e = uzVar;
        this.f11829i = iArr;
        this.f11827f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f11823a) {
            case 0:
                c7 c7Var = (c7) this.f11828g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f11829i;
                int i7 = c7Var.f11857a;
                uz.a(this.f11824b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        gj gjVar = (gj) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f11825c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f28673id == c7.e(gjVar)) {
                                    c7.b(i7, j3, gjVar, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f28673id = c7.e(gjVar);
                                c7.b(i7, j3, gjVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            c7Var.f11858b.f27250a.c(new l4(11, c7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    uz.c(this.f11826e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f11827f.run();
                    return;
                }
                return;
            default:
                si siVar = (si) this.f11828g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f11829i;
                siVar.getClass();
                uz.a(this.f11824b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j10 = this.f11825c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i13++;
                        } else {
                            fc.X(messages_messages.messages);
                            siVar.n(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            siVar.Y1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    uz.c(this.f11826e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f11827f) != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }

    public b7(si siVar, tz tzVar, long j3, a0.h hVar, boolean z10, uz uzVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.f11828g = siVar;
        this.f11824b = tzVar;
        this.f11825c = j3;
        this.h = hVar;
        this.d = z10;
        this.f11826e = uzVar;
        this.f11829i = atomicInteger;
        this.f11827f = runnable;
    }
}
