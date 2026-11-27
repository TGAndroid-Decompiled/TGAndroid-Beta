package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class ih3 implements Runnable {
    public final byte a;
    public final uj3 b;
    public final long c;
    public final boolean d;

    public ih3(uj3 uj3Var, long j, boolean z, byte b) {
        this.a = b;
        this.b = uj3Var;
        this.c = j;
        this.d = z;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder S2;
        byte b = this.a;
        boolean z = this.d;
        long j = this.c;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var2 = this.b;
                c6b O1 = uj3Var2.getMessagesController().O1();
                long j2 = this.c;
                boolean z2 = this.d;
                O1.l0(j2, z2, false);
                qx6 qx6Var = new qx6((byte) 10, false);
                qx6Var.b = new ih3(uj3Var2, j2, z2, (byte) 1);
                qx6Var.c = new ih3(uj3Var2, j2, z2, (byte) 2);
                if (j2 >= 0) {
                    TLRPC.User X1 = uj3Var2.getMessagesController().X1(Long.valueOf(j2));
                    str = lv2.m(15, X1.first_name, null);
                    chat = X1;
                } else {
                    TLRPC.Chat M0 = uj3Var2.getMessagesController().M0(Long.valueOf(-j2));
                    str = M0.title;
                    chat = M0;
                }
                if (uj3Var2.F3()) {
                    S2 = hl.S2(ob6.a0("StoriesMovedToDialogs", null, 2131744415, str));
                } else {
                    S2 = hl.S2(ob6.a0("StoriesMovedToContacts", null, 2131744416, lv2.m(15, str, null)));
                }
                uj3Var2.T = d31.Y().V(Collections.singletonList(chat), S2, null, qx6Var).j();
                return;
            case 1:
                uj3Var.getMessagesController().O1().l0(j, !z, false);
                return;
            default:
                uj3Var.getMessagesController().O1().l0(j, z, true);
                return;
        }
    }
}
