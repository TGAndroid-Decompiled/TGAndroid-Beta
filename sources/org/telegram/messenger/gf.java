package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f22708a;
    public final li f22709b;
    public final TLRPC.messages_Messages f22710c;
    public final int d;
    public final long f22711e;
    public final ArrayList f22712f;
    public final int h;
    public final int f22713n;
    public final boolean f22714r;
    public final int f22715s;
    public final int f22716w;

    public gf(li liVar, TLRPC.messages_Messages messages_messages, int i3, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f22708a = i14;
        this.f22709b = liVar;
        this.f22710c = messages_messages;
        this.d = i3;
        this.f22711e = j10;
        this.f22712f = arrayList;
        this.h = i10;
        this.f22713n = i11;
        this.f22714r = z10;
        this.f22715s = i12;
        this.f22716w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f22708a) {
            case 0:
                g0.h3(new gf(this.f22709b, this.f22710c, this.d, this.f22711e, this.f22712f, this.h, this.f22713n, this.f22714r, this.f22715s, this.f22716w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f22710c;
                int i3 = messages_messages.count;
                li liVar = this.f22709b;
                hp messagesController = liVar.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                int i10 = this.d;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.Y3(arrayList, z10);
                hp messagesController2 = liVar.getMessagesController();
                ArrayList<TLRPC.Chat> arrayList2 = messages_messages.chats;
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController2.S3(arrayList2, z11);
                hs notificationCenter = liVar.getNotificationCenter();
                Long valueOf = Long.valueOf(this.f22711e);
                Integer valueOf2 = Integer.valueOf(i3);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f22713n);
                Boolean valueOf5 = Boolean.valueOf(this.f22714r);
                if (this.f22715s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f22712f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f22716w));
                return;
        }
    }
}
