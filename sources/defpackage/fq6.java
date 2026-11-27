package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fq6 implements RequestDelegate {
    public final byte a = 0;
    public final psb b;
    public final long c;
    public final boolean d;
    public final qsb e;
    public final Runnable f;
    public final Object g;
    public final Cloneable h;
    public final Serializable i;

    public fq6(ls6 ls6Var, psb psbVar, long j, zh6 zh6Var, boolean z, qsb qsbVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = ls6Var;
        this.b = psbVar;
        this.c = j;
        this.h = zh6Var;
        this.d = z;
        this.e = qsbVar;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        char c;
        byte b = this.a;
        Runnable runnable = this.f;
        Serializable serializable = this.i;
        qsb qsbVar = this.e;
        boolean z = this.d;
        Cloneable cloneable = this.h;
        psb psbVar = this.b;
        Object obj = this.g;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) obj;
                zh6 zh6Var = (zh6) cloneable;
                AtomicInteger atomicInteger = (AtomicInteger) serializable;
                qsb.a(psbVar);
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
                            in5.S(arrayList);
                            ls6Var.n(messages_messages.messages, zh6Var, messages_messages.users, messages_messages.chats, j, false);
                            ls6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                            ls6Var.W1(zh6Var, messages_messages.messages, z);
                        }
                    }
                } else {
                    qsb.c(qsbVar, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    hl.c3(runnable);
                    return;
                }
                return;
            default:
                o6b o6bVar = (o6b) obj;
                ArrayList arrayList2 = (ArrayList) cloneable;
                int[] iArr = (int[]) serializable;
                int i2 = o6bVar.a;
                qsb.a(psbVar);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        r47 r47Var = (r47) arrayList2.get(i3);
                        int i4 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j2 = this.c;
                            if (i4 < size2) {
                                if (tL_stories_stories.stories.get(i4).id == o6b.d(r47Var)) {
                                    o6b.a(i2, j2, r47Var, tL_stories_stories.stories.get(i4));
                                } else {
                                    i4++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = o6b.d(r47Var);
                                o6b.a(i2, j2, r47Var, tL_storyItemDeleted);
                            }
                        }
                        if (z) {
                            o6bVar.b.a.c(new z3b(o6bVar, arrayList2, (byte) 11));
                        }
                    }
                    c = 0;
                } else {
                    c = 0;
                    if (tL_error != null) {
                        qsb.c(qsbVar, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
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

    public fq6(o6b o6bVar, psb psbVar, ArrayList arrayList, long j, boolean z, qsb qsbVar, int[] iArr, Runnable runnable) {
        this.g = o6bVar;
        this.b = psbVar;
        this.h = arrayList;
        this.c = j;
        this.d = z;
        this.e = qsbVar;
        this.i = iArr;
        this.f = runnable;
    }
}
