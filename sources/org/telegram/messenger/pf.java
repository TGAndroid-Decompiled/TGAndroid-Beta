package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f26235a;
    public final ri f26236b;
    public final TLRPC.messages_Messages f26237c;
    public final int d;
    public final long f26238e;
    public final ArrayList f26239f;
    public final int h;
    public final int f26240n;
    public final boolean f26241r;
    public final int f26242s;
    public final int f26243w;

    public pf(ri riVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f26235a = i14;
        this.f26236b = riVar;
        this.f26237c = messages_messages;
        this.d = i7;
        this.f26238e = j3;
        this.f26239f = arrayList;
        this.h = i10;
        this.f26240n = i11;
        this.f26241r = z10;
        this.f26242s = i12;
        this.f26243w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26235a) {
            case 0:
                g0.g3(new pf(this.f26236b, this.f26237c, this.d, this.f26238e, this.f26239f, this.h, this.f26240n, this.f26241r, this.f26242s, this.f26243w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f26237c;
                int i7 = messages_messages.count;
                ri riVar = this.f26236b;
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
                Long valueOf = Long.valueOf(this.f26238e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f26240n);
                Boolean valueOf5 = Boolean.valueOf(this.f26241r);
                if (this.f26242s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f26239f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f26243w));
                return;
        }
    }
}
