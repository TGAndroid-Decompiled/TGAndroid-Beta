package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f26408a;
    public final si f26409b;
    public final TLRPC.messages_Messages f26410c;
    public final int d;
    public final long f26411e;
    public final ArrayList f26412f;
    public final int h;
    public final int f26413n;
    public final boolean f26414r;
    public final int f26415s;
    public final int f26416w;

    public qf(si siVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f26408a = i14;
        this.f26409b = siVar;
        this.f26410c = messages_messages;
        this.d = i7;
        this.f26411e = j3;
        this.f26412f = arrayList;
        this.h = i10;
        this.f26413n = i11;
        this.f26414r = z10;
        this.f26415s = i12;
        this.f26416w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26408a) {
            case 0:
                g0.g3(new qf(this.f26409b, this.f26410c, this.d, this.f26411e, this.f26412f, this.h, this.f26413n, this.f26414r, this.f26415s, this.f26416w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f26410c;
                int i7 = messages_messages.count;
                si siVar = this.f26409b;
                np messagesController = siVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.f4(arrayList, z10);
                np messagesController2 = siVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.Z3(arrayList2, z11);
                ls notificationCenter = siVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.f26411e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f26413n);
                Boolean valueOf5 = Boolean.valueOf(this.f26414r);
                if (this.f26415s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f26412f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f26416w));
                return;
        }
    }
}
