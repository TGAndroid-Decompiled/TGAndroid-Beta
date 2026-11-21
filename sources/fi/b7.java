package fi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.ri;
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b7 implements RequestDelegate {
    public final int f11820a = 0;
    public final sz f11821b;
    public final long f11822c;
    public final boolean d;
    public final tz f11823e;
    public final Runnable f11824f;
    public final Object f11825g;
    public final Cloneable h;
    public final Serializable f11826i;

    public b7(c7 c7Var, sz szVar, ArrayList arrayList, long j3, boolean z10, tz tzVar, int[] iArr, Runnable runnable) {
        this.f11825g = c7Var;
        this.f11821b = szVar;
        this.h = arrayList;
        this.f11822c = j3;
        this.d = z10;
        this.f11823e = tzVar;
        this.f11826i = iArr;
        this.f11824f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f11820a) {
            case 0:
                c7 c7Var = (c7) this.f11825g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f11826i;
                int i7 = c7Var.f11854a;
                tz.a(this.f11821b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        fj fjVar = (fj) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f11822c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f28670id == c7.e(fjVar)) {
                                    c7.b(i7, j3, fjVar, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f28670id = c7.e(fjVar);
                                c7.b(i7, j3, fjVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            c7Var.f11855b.f27080a.c(new l4(11, c7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    tz.c(this.f11823e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f11824f.run();
                    return;
                }
                return;
            default:
                ri riVar = (ri) this.f11825g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f11826i;
                riVar.getClass();
                tz.a(this.f11821b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j10 = this.f11822c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i13++;
                        } else {
                            ec.X(messages_messages.messages);
                            riVar.n(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            riVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            riVar.Y1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    tz.c(this.f11823e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f11824f) != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }

    public b7(ri riVar, sz szVar, long j3, a0.h hVar, boolean z10, tz tzVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.f11825g = riVar;
        this.f11821b = szVar;
        this.f11822c = j3;
        this.h = hVar;
        this.d = z10;
        this.f11823e = tzVar;
        this.f11826i = atomicInteger;
        this.f11824f = runnable;
    }
}
