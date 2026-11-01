package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class of implements Runnable {
    public final int f17429a;
    public final vi f17430b;
    public final TLRPC.messages_Messages f17431c;
    public final int d;
    public final long e;
    public final ArrayList f17432f;
    public final int h;
    public final int f17433n;
    public final boolean f17434r;
    public final int f17435s;
    public final int f17436w;

    public of(vi viVar, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17429a = i15;
        this.f17430b = viVar;
        this.f17431c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f17432f = arrayList;
        this.h = i11;
        this.f17433n = i12;
        this.f17434r = z10;
        this.f17435s = i13;
        this.f17436w = i14;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f17429a) {
            case 0:
                i0.g3(new of(this.f17430b, this.f17431c, this.d, this.e, this.f17432f, this.h, this.f17433n, this.f17434r, this.f17435s, this.f17436w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f17431c;
                int i10 = messages_messages.count;
                vi viVar = this.f17430b;
                wp messagesController = viVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i11 = this.d;
                if (i11 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.V3(arrayList, z10);
                wp messagesController2 = viVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.P3(arrayList2, z11);
                at notificationCenter = viVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.e);
                Integer valueOf2 = Integer.valueOf(i10);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f17433n);
                Boolean valueOf5 = Boolean.valueOf(this.f17434r);
                if (this.f17435s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f17432f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f17436w));
                return;
        }
    }
}
