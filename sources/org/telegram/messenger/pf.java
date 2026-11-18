package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f26237a;
    public final ri f26238b;
    public final TLRPC.messages_Messages f26239c;
    public final int d;
    public final long f26240e;
    public final ArrayList f26241f;
    public final int h;
    public final int f26242n;
    public final boolean f26243r;
    public final int f26244s;
    public final int f26245w;

    public pf(ri riVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f26237a = i14;
        this.f26238b = riVar;
        this.f26239c = messages_messages;
        this.d = i7;
        this.f26240e = j3;
        this.f26241f = arrayList;
        this.h = i10;
        this.f26242n = i11;
        this.f26243r = z10;
        this.f26244s = i12;
        this.f26245w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26237a) {
            case 0:
                g0.g3(new pf(this.f26238b, this.f26239c, this.d, this.f26240e, this.f26241f, this.h, this.f26242n, this.f26243r, this.f26244s, this.f26245w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f26239c;
                int i7 = messages_messages.count;
                ri riVar = this.f26238b;
                mp messagesController = riVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.f4(arrayList, z10);
                mp messagesController2 = riVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.Z3(arrayList2, z11);
                ks notificationCenter = riVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.f26240e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f26242n);
                Boolean valueOf5 = Boolean.valueOf(this.f26243r);
                if (this.f26244s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f26241f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f26245w));
                return;
        }
    }
}
