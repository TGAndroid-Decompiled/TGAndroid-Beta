package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class en6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final TLRPC.messages_Messages c;
    public final boolean d;
    public final long e;
    public final ArrayList f;
    public final int h;
    public final int n;
    public final boolean r;
    public final int s;
    public final int w;

    public en6(hq6 hq6Var, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = messages_messages;
        this.d = i;
        this.e = j;
        this.f = arrayList;
        this.h = i2;
        this.n = i3;
        this.r = z;
        this.s = i4;
        this.w = i5;
    }

    @Override
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                gl.c3(new en6(this.b, this.c, this.d ? 1 : 0, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                return;
            default:
                TLRPC.messages_Messages messages_messages = this.c;
                int i = messages_messages.count;
                hq6 hq6Var = this.b;
                na7 messagesController = hq6Var.getMessagesController();
                ArrayList<TLRPC.User> arrayList = messages_messages.users;
                boolean z2 = this.d;
                messagesController.b4(arrayList, z2);
                hq6Var.getMessagesController().V3(messages_messages.chats, z2);
                kk7 notificationCenter = hq6Var.getNotificationCenter();
                Long valueOf = Long.valueOf(this.e);
                Integer valueOf2 = Integer.valueOf(i);
                Integer valueOf3 = Integer.valueOf(this.h);
                Integer valueOf4 = Integer.valueOf(this.n);
                Boolean valueOf5 = Boolean.valueOf(this.r);
                if (this.s != 0) {
                    z = true;
                } else {
                    z = false;
                }
                notificationCenter.k(32, valueOf, valueOf2, this.f, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z), Integer.valueOf(this.w));
                return;
        }
    }
}
