package di;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.a00;
import org.telegram.messenger.gc;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.messenger.zz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l7 implements RequestDelegate {
    public final int f9339a = 0;
    public final zz f9340b;
    public final long f9341c;
    public final boolean d;
    public final a00 f9342e;
    public final Runnable f9343f;
    public final Object f9344g;
    public final Cloneable h;
    public final Serializable f9345i;

    public l7(m7 m7Var, zz zzVar, ArrayList arrayList, long j3, boolean z9, a00 a00Var, int[] iArr, Runnable runnable) {
        this.f9344g = m7Var;
        this.f9340b = zzVar;
        this.h = arrayList;
        this.f9341c = j3;
        this.d = z9;
        this.f9342e = a00Var;
        this.f9345i = iArr;
        this.f9343f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Runnable runnable;
        switch (this.f9339a) {
            case 0:
                m7 m7Var = (m7) this.f9344g;
                ArrayList arrayList = (ArrayList) this.h;
                int[] iArr = (int[]) this.f9345i;
                int i7 = m7Var.f9367a;
                a00.a(this.f9340b);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ij ijVar = (ij) arrayList.get(i10);
                        int i11 = 0;
                        while (true) {
                            int size = tL_stories_stories.stories.size();
                            long j3 = this.f9341c;
                            if (i11 < size) {
                                if (tL_stories_stories.stories.get(i11).f27199id == m7.e(ijVar)) {
                                    m7.b(i7, j3, ijVar, tL_stories_stories.stories.get(i11));
                                } else {
                                    i11++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.f27199id = m7.e(ijVar);
                                m7.b(i7, j3, ijVar, tL_storyItemDeleted);
                            }
                        }
                        if (this.d) {
                            m7Var.f9368b.f26723a.c(new z0(16, m7Var, arrayList));
                        }
                    }
                } else if (tL_error != null) {
                    a00.c(this.f9342e, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    this.f9343f.run();
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f9344g;
                a0.h hVar = (a0.h) this.h;
                AtomicInteger atomicInteger = (AtomicInteger) this.f9345i;
                uiVar.getClass();
                a00.a(this.f9340b);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (true) {
                        int size2 = messages_messages.messages.size();
                        long j10 = this.f9341c;
                        if (i13 < size2) {
                            TLRPC.Message message = messages_messages.messages.get(i13);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j10;
                            }
                            i13++;
                        } else {
                            gc.X(messages_messages.messages);
                            uiVar.l(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
                            uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                            uiVar.T1(hVar, messages_messages.messages, this.d);
                        }
                    }
                } else {
                    a00.c(this.f9342e, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && (runnable = this.f9343f) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }

    public l7(ui uiVar, zz zzVar, long j3, a0.h hVar, boolean z9, a00 a00Var, AtomicInteger atomicInteger, Runnable runnable) {
        this.f9344g = uiVar;
        this.f9340b = zzVar;
        this.f9341c = j3;
        this.h = hVar;
        this.d = z9;
        this.f9342e = a00Var;
        this.f9345i = atomicInteger;
        this.f9343f = runnable;
    }
}
