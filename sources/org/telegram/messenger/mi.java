package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mi implements RequestDelegate {
    public final int f17124a = 0;
    public final l00 f17125b;
    public final long f17126c;
    public final boolean d;
    public final m00 e;
    public final Runnable f17127f;
    public final Object f17128g;
    public final Cloneable h;
    public final Serializable f17129i;

    public mi(vi viVar, l00 l00Var, long j10, a0.h hVar, boolean z10, m00 m00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.f17128g = viVar;
        this.f17125b = l00Var;
        this.f17126c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = m00Var;
        this.f17129i = atomicInteger;
        this.f17127f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f17124a) {
            case 0:
                vi viVar = (vi) this.f17128g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f17129i;
                viVar.getClass();
                m00.a(this.f17125b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (true) {
                        int size = messages_messages.messages.size();
                        long j10 = this.f17126c;
                        if (i10 < size) {
                            TLRPC.Message message = messages_messages.messages.get(i10);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i10++;
                        } else {
                            ic.X(messages_messages.messages);
                            viVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            viVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            viVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    m00.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f17127f) != null) {
                    i0.g3(runnable);
                    return;
                }
                return;
            default:
                th.r5 r5Var = (th.r5) this.f17128g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f17129i;
                int i11 = r5Var.f49425a;
                m00.a(this.f17125b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        kj kjVar = (kj) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j11 = this.f17126c;
                            if (i13 < size2) {
                                if (tL_stories_stories.stories.get(i13).f20032id == th.r5.e(kjVar)) {
                                    th.r5.b(i11, j11, kjVar, tL_stories_stories.stories.get(i13));
                                } else {
                                    i13++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20032id = th.r5.e(kjVar);
                                th.r5.b(i11, j11, kjVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            r5Var.f49426b.f16331a.c(new th.o0(16, r5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    m00.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    this.f17127f.run();
                    return;
                }
                return;
        }
    }

    public mi(th.r5 r5Var, l00 l00Var, ArrayList arrayList, long j10, boolean z10, m00 m00Var, int[] iArr, Runnable runnable) {
        this.f17128g = r5Var;
        this.f17125b = l00Var;
        this.h = arrayList;
        this.f17126c = j10;
        this.d = z10;
        this.e = m00Var;
        this.f17129i = iArr;
        this.f17127f = runnable;
    }
}
