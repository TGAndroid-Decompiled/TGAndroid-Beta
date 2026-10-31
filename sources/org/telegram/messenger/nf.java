package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f17092a;
    public final ui f17093b;
    public final TLRPC.messages_Messages f17094c;
    public final int d;
    public final long e;
    public final ArrayList f17095f;
    public final int h;
    public final int f17096n;
    public final boolean f17097r;
    public final int f17098s;
    public final int f17099w;

    public nf(ui uiVar, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17092a = i15;
        this.f17093b = uiVar;
        this.f17094c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f17095f = arrayList;
        this.h = i11;
        this.f17096n = i12;
        this.f17097r = z10;
        this.f17098s = i13;
        this.f17099w = i14;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f17092a) {
            case 0:
                i0.g3(new nf(this.f17093b, this.f17094c, this.d, this.e, this.f17095f, this.h, this.f17096n, this.f17097r, this.f17098s, this.f17099w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f17094c;
                int i10 = messages_messages.count;
                ui uiVar = this.f17093b;
                vp messagesController = uiVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i11 = this.d;
                if (i11 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.V3(arrayList, z10);
                vp messagesController2 = uiVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.P3(arrayList2, z11);
                zs notificationCenter = uiVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.e);
                Integer valueOf2 = Integer.valueOf(i10);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f17096n);
                Boolean valueOf5 = Boolean.valueOf(this.f17097r);
                if (this.f17098s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f17095f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f17099w));
                return;
        }
    }
}
