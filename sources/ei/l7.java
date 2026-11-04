package ei;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.li;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l7 implements RequestDelegate {
    public final int f10617a = 0;
    public final rz f10618b;
    public final long f10619c;
    public final boolean d;
    public final sz f10620e;
    public final Runnable f10621f;
    public final Object f10622g;
    public final Cloneable h;
    public final Serializable f10623i;

    public l7(m7 m7Var, rz rzVar, ArrayList arrayList, long j10, boolean z10, sz szVar, int[] iArr, Runnable runnable) {
        this.f10622g = m7Var;
        this.f10618b = rzVar;
        this.h = arrayList;
        this.f10619c = j10;
        this.d = z10;
        this.f10620e = szVar;
        this.f10623i = iArr;
        this.f10621f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f10617a) {
            case 0:
                m7 m7Var = (m7) this.f10622g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f10623i;
                int i3 = m7Var.f10643a;
                sz.a(this.f10618b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        zi ziVar = (zi) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j10 = this.f10619c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f27240id == m7.e(ziVar)) {
                                    m7.b(i3, j10, ziVar, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f27240id = m7.e(ziVar);
                                m7.b(i3, j10, ziVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            m7Var.f10644b.f24934a.c(new b0(19, m7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    sz.c(this.f10620e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f10621f.run();
                    return;
                }
                return;
            default:
                li liVar = (li) this.f10622g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f10623i;
                liVar.getClass();
                sz.a(this.f10618b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j11 = this.f10619c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j11;
                            }
                            i13++;
                        } else {
                            zb.X(messages_messages.messages);
                            liVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j11, false);
                            liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            liVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    sz.c(this.f10620e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f10621f) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }

    public l7(li liVar, rz rzVar, long j10, a0.h hVar, boolean z10, sz szVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.f10622g = liVar;
        this.f10618b = rzVar;
        this.f10619c = j10;
        this.h = hVar;
        this.d = z10;
        this.f10620e = szVar;
        this.f10623i = atomicInteger;
        this.f10621f = runnable;
    }
}
