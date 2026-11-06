package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pf implements Runnable {
    public final int f24542a;
    public final ui f24543b;
    public final TLRPC.messages_Messages f24544c;
    public final int d;
    public final long f24545e;
    public final ArrayList f24546f;
    public final int h;
    public final int f24547n;
    public final boolean f24548r;
    public final int f24549s;
    public final int f24550w;

    public pf(ui uiVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z9, int i12, int i13, int i14) {
        this.f24542a = i14;
        this.f24543b = uiVar;
        this.f24544c = messages_messages;
        this.d = i7;
        this.f24545e = j3;
        this.f24546f = arrayList;
        this.h = i10;
        this.f24547n = i11;
        this.f24548r = z9;
        this.f24549s = i12;
        this.f24550w = i13;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f24542a) {
            case 0:
                g0.h3(new pf(this.f24543b, this.f24544c, this.d, this.f24545e, this.f24546f, this.h, this.f24547n, this.f24548r, this.f24549s, this.f24550w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f24544c;
                int i7 = messages_messages.count;
                ui uiVar = this.f24543b;
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
                Long valueOf = Long.valueOf(this.f24545e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f24547n);
                Boolean valueOf5 = Boolean.valueOf(this.f24548r);
                if (this.f24549s != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f24546f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z11), Integer.valueOf(this.f24550w));
                return;
        }
    }
}
