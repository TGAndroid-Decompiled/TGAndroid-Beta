package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zr6 implements RequestDelegate {
    public final byte a = 0;
    public final qqb b;
    public final long c;
    public final boolean d;
    public final rqb e;
    public final Runnable f;
    public final Object g;
    public final Cloneable h;
    public final Serializable i;

    public zr6(hs6 hs6Var, qqb qqbVar, long j, vh6 vh6Var, boolean z, rqb rqbVar, AtomicInteger atomicInteger, Runnable runnable) {
        this.g = hs6Var;
        this.b = qqbVar;
        this.c = j;
        this.h = vh6Var;
        this.d = z;
        this.e = rqbVar;
        this.i = atomicInteger;
        this.f = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        char c;
        byte b = this.a;
        Runnable runnable = this.f;
        Serializable serializable = this.i;
        rqb rqbVar = this.e;
        boolean z = this.d;
        Cloneable cloneable = this.h;
        qqb qqbVar = this.b;
        Object obj = this.g;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) obj;
                vh6 vh6Var = (vh6) cloneable;
                AtomicInteger atomicInteger = (AtomicInteger) serializable;
                rqb.a(qqbVar);
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
                            fn5.S(arrayList);
                            hs6Var.n(messages_messages.messages, vh6Var, messages_messages.users, messages_messages.chats, j, false);
                            hs6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                            hs6Var.W1(vh6Var, messages_messages.messages, z);
                        }
                    }
                } else {
                    rqb.c(rqbVar, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
                }
                if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
                    gm.c3(runnable);
                    return;
                }
                return;
            default:
                t4b t4bVar = (t4b) obj;
                ArrayList arrayList2 = (ArrayList) cloneable;
                int[] iArr = (int[]) serializable;
                int i2 = t4bVar.a;
                rqb.a(qqbVar);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        k47 k47Var = (k47) arrayList2.get(i3);
                        int i4 = 0;
                        while (true) {
                            int size2 = tL_stories_stories.stories.size();
                            long j2 = this.c;
                            if (i4 < size2) {
                                if (tL_stories_stories.stories.get(i4).id == t4b.d(k47Var)) {
                                    t4b.a(i2, j2, k47Var, tL_stories_stories.stories.get(i4));
                                } else {
                                    i4++;
                                }
                            } else {
                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                tL_storyItemDeleted.id = t4b.d(k47Var);
                                t4b.a(i2, j2, k47Var, tL_storyItemDeleted);
                            }
                        }
                        if (z) {
                            t4bVar.b.a.c(new uva(t4bVar, arrayList2, (byte) 17));
                        }
                    }
                    c = 0;
                } else {
                    c = 0;
                    if (tL_error != null) {
                        rqb.c(rqbVar, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
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

    public zr6(t4b t4bVar, qqb qqbVar, ArrayList arrayList, long j, boolean z, rqb rqbVar, int[] iArr, Runnable runnable) {
        this.g = t4bVar;
        this.b = qqbVar;
        this.h = arrayList;
        this.c = j;
        this.d = z;
        this.e = rqbVar;
        this.i = iArr;
        this.f = runnable;
    }
}
