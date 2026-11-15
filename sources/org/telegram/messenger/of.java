package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class of implements Runnable {
    public final int f25746a;
    public final si f25747b;
    public final TLRPC.messages_Messages f25748c;
    public final int d;
    public final long f25749e;
    public final ArrayList f25750f;
    public final int h;
    public final int f25751n;
    public final boolean f25752r;
    public final int f25753s;
    public final int f25754w;

    public of(si siVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f25746a = i14;
        this.f25747b = siVar;
        this.f25748c = messages_messages;
        this.d = i7;
        this.f25749e = j3;
        this.f25750f = arrayList;
        this.h = i10;
        this.f25751n = i11;
        this.f25752r = z10;
        this.f25753s = i12;
        this.f25754w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f25746a) {
            case 0:
                g0.h3(new of(this.f25747b, this.f25748c, this.d, this.f25749e, this.f25750f, this.h, this.f25751n, this.f25752r, this.f25753s, this.f25754w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f25748c;
                int i7 = messages_messages.count;
                si siVar = this.f25747b;
                np messagesController = siVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.Y3(arrayList, z10);
                np messagesController2 = siVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.S3(arrayList2, z11);
                ns notificationCenter = siVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.f25749e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f25751n);
                Boolean valueOf5 = Boolean.valueOf(this.f25752r);
                if (this.f25753s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f25750f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f25754w));
                return;
        }
    }
}
