package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zp6 implements RequestDelegate {
    public final byte a = 0;
    public final pob b;
    public final long c;
    public final boolean d;
    public final qob e;
    public final Runnable f;
    public final Object g;
    public final Cloneable h;
    public final Serializable i;

    public zp6(hq6 hq6Var, pob pobVar, long j, vf6 vf6Var, boolean z, qob qobVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = hq6Var;
        this.b = pobVar;
        this.c = j;
        this.h = vf6Var;
        this.d = z;
        this.e = qobVar;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        char c;
        byte b = this.a;
        Runnable runnable = this.f;
        Serializable serializable = this.i;
        qob qobVar = this.e;
        boolean z = this.d;
        Cloneable cloneable = this.h;
        pob pobVar = this.b;
        Object obj = this.g;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) obj;
                vf6 vf6Var = (vf6) cloneable;
                AtomicInteger atomicInteger = (AtomicInteger) serializable;
                qob.a(pobVar);
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int i = 0;
                    while (true) {
                        int size = messages_messages.messages.size();
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        long j = this.c;
                        if (i < size) {
                            TLRPC.Message message = arrayList.get(i);
                            if (message.dialog_id == 0) {
                                message.dialog_id = j;
                            }
                            i++;
                        } else {
                            fl5.S(arrayList);
                            hq6Var.n(messages_messages.messages, vf6Var, messages_messages.users, messages_messages.chats, j, false);
                            hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                            hq6Var.W1(vf6Var, messages_messages.messages, z);
                        }
                    }
                } else {
                    qob.c(qobVar, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    gl.d3(runnable);
                    return;
                }
                return;
            default:
                s2b s2bVar = (s2b) obj;
                ArrayList arrayList2 = (ArrayList) cloneable;
                int[] iArr = (int[]) serializable;
                int i2 = s2bVar.a;
                qob.a(pobVar);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        k27 k27Var = (k27) arrayList2.get(i3);
                        int i4 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j2 = this.c;
                            if (i4 < size2) {
                                if (tL_stories_stories.stories.get(i4).id == s2b.d(k27Var)) {
                                    s2b.a(i2, j2, k27Var, tL_stories_stories.stories.get(i4));
                                } else {
                                    i4++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = s2b.d(k27Var);
                                s2b.a(i2, j2, k27Var, tL_storyItemDeleted);
                            }
                        }
                        if (z) {
                            s2bVar.b.a.c(new iya(s2bVar, arrayList2, (byte) 15));
                        }
                    }
                    c = 0;
                } else {
                    c = 0;
                    if (tL_error != null) {
                        qob.c(qobVar, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                    }
                }
                int i5 = iArr[c] - 1;
                iArr[c] = i5;
                if (i5 == 0) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public zp6(s2b s2bVar, pob pobVar, ArrayList arrayList, long j, boolean z, qob qobVar, int[] iArr, Runnable runnable) {
        this.g = s2bVar;
        this.b = pobVar;
        this.h = arrayList;
        this.c = j;
        this.d = z;
        this.e = qobVar;
        this.i = iArr;
        this.f = runnable;
    }
}
