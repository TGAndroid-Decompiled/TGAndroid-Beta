package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f26444a;
    public final si f26445b;
    public final TLRPC.messages_Messages f26446c;
    public final int d;
    public final long f26447e;
    public final ArrayList f26448f;
    public final int h;
    public final int f26449n;
    public final boolean f26450r;
    public final int f26451s;
    public final int f26452w;

    public qf(si siVar, TLRPC.messages_Messages messages_messages, int i7, long j3, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f26444a = i14;
        this.f26445b = siVar;
        this.f26446c = messages_messages;
        this.d = i7;
        this.f26447e = j3;
        this.f26448f = arrayList;
        this.h = i10;
        this.f26449n = i11;
        this.f26450r = z10;
        this.f26451s = i12;
        this.f26452w = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26444a) {
            case 0:
                g0.g3(new qf(this.f26445b, this.f26446c, this.d, this.f26447e, this.f26448f, this.h, this.f26449n, this.f26450r, this.f26451s, this.f26452w, 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.f26446c;
                int i7 = messages_messages.count;
                si siVar = this.f26445b;
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
                Long valueOf = Long.valueOf(this.f26447e);
                Integer valueOf2 = Integer.valueOf(i7);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.f26449n);
                Boolean valueOf5 = Boolean.valueOf(this.f26450r);
                if (this.f26451s != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f26448f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z12), Integer.valueOf(this.f26452w));
                return;
        }
    }
}
