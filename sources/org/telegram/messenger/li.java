package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class li implements RequestDelegate {
    public final int f16740a = 0;
    public final k00 f16741b;
    public final long f16742c;
    public final boolean d;
    public final l00 e;
    public final Runnable f16743f;
    public final Object f16744g;
    public final Cloneable h;
    public final Serializable f16745i;

    public li(ui uiVar, k00 k00Var, long j10, a0.h hVar, boolean z10, l00 l00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.f16744g = uiVar;
        this.f16741b = k00Var;
        this.f16742c = j10;
        this.h = hVar;
        this.d = z10;
        this.e = l00Var;
        this.f16745i = atomicInteger;
        this.f16743f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f16740a) {
            case 0:
                ui uiVar = (ui) this.f16744g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f16745i;
                uiVar.getClass();
                l00.a(this.f16741b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i10 = 0;
                    while (true) {
                        int size = messages_messages.messages.size();
                        long j10 = this.f16742c;
                        if (i10 < size) {
                            TLRPC.Message message = messages_messages.messages.get(i10);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i10++;
                        } else {
                            hc.X(messages_messages.messages);
                            uiVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            uiVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    l00.c(this.e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f16743f) != null) {
                    i0.g3(runnable);
                    return;
                }
                return;
            default:
                th.r5 r5Var = (th.r5) this.f16744g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f16745i;
                int i11 = r5Var.f49411a;
                l00.a(this.f16741b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        jj jjVar = (jj) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j11 = this.f16742c;
                            if (i13 < size2) {
                                if (tL_stories_stories.stories.get(i13).f20031id == th.r5.e(jjVar)) {
                                    th.r5.b(i11, j11, jjVar, tL_stories_stories.stories.get(i13));
                                } else {
                                    i13++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f20031id = th.r5.e(jjVar);
                                th.r5.b(i11, j11, jjVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            r5Var.f49412b.f15938a.c(new th.o0(15, r5Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    l00.c(this.e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    this.f16743f.run();
                    return;
                }
                return;
        }
    }

    public li(th.r5 r5Var, k00 k00Var, ArrayList arrayList, long j10, boolean z10, l00 l00Var, int[] iArr, Runnable runnable) {
        this.f16744g = r5Var;
        this.f16741b = k00Var;
        this.h = arrayList;
        this.f16742c = j10;
        this.d = z10;
        this.e = l00Var;
        this.f16745i = iArr;
        this.f16743f = runnable;
    }
}
