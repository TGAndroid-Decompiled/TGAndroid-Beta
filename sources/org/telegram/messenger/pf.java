package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f24549a;
    public final ui f24550b;
    public final TLRPC.messages_Messages f24551c;
    public final int d;
    public final long f24552e;
    public final ArrayList f24553f;
    public final int h;
    public final int f24554n;
    public final boolean f24555r;
    public final int f24556s;
    public final int f24557w;

    public pf(ui uiVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z9, int i12, int i13, int i14) {
        this.f24549a = i14;
        this.f24550b = uiVar;
        this.f24551c = messages_messages;
        this.d = i7;
        this.f24552e = j3;
        this.f24553f = arrayList;
        this.h = i10;
        this.f24554n = i11;
        this.f24555r = z9;
        this.f24556s = i12;
        this.f24557w = i13;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f24549a) {
            case 0:
                g0.h3(new pf(this.f24550b, this.f24551c, this.d, this.f24552e, this.f24553f, this.h, this.f24554n, this.f24555r, this.f24556s, this.f24557w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f24551c;
                int i7 = messages_messages.count;
                ui uiVar = this.f24550b;
                qp messagesController = uiVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                if (i10 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                messagesController.Y3(arrayList, z9);
                qp messagesController2 = uiVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController2.S3(arrayList2, z10);
                qs notificationCenter = uiVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.f24552e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f24554n);
                Boolean valueOf5 = Boolean.valueOf(this.f24555r);
                if (this.f24556s != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f24553f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z11), Integer.valueOf(this.f24557w));
                return;
        }
    }
}
