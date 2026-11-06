package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f24534a;
    public final ui f24535b;
    public final TLRPC.messages_Messages f24536c;
    public final int d;
    public final long f24537e;
    public final ArrayList f24538f;
    public final int h;
    public final int f24539n;
    public final boolean f24540r;
    public final int f24541s;
    public final int f24542w;

    public pf(ui uiVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z9, int i12, int i13, int i14) {
        this.f24534a = i14;
        this.f24535b = uiVar;
        this.f24536c = messages_messages;
        this.d = i7;
        this.f24537e = j3;
        this.f24538f = arrayList;
        this.h = i10;
        this.f24539n = i11;
        this.f24540r = z9;
        this.f24541s = i12;
        this.f24542w = i13;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f24534a) {
            case 0:
                g0.h3(new pf(this.f24535b, this.f24536c, this.d, this.f24537e, this.f24538f, this.h, this.f24539n, this.f24540r, this.f24541s, this.f24542w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f24536c;
                int i7 = messages_messages.count;
                ui uiVar = this.f24535b;
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
                Long valueOf = Long.valueOf(this.f24537e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f24539n);
                Boolean valueOf5 = Boolean.valueOf(this.f24540r);
                if (this.f24541s != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f24538f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z11), Integer.valueOf(this.f24542w));
                return;
        }
    }
}
