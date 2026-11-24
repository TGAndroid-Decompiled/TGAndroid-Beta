package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class lg3 implements Runnable {
    public final byte a;
    public final cj3 b;
    public final long c;
    public final boolean d;

    public lg3(cj3 cj3Var, long j, boolean z, byte b) {
        this.a = b;
        this.b = cj3Var;
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
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var2 = this.b;
                g2b M1 = cj3Var2.getMessagesController().M1();
                long j2 = this.c;
                boolean z2 = this.d;
                M1.l0(j2, z2, false);
                lv6 lv6Var = new lv6((byte) 10, false);
                lv6Var.b = new lg3(cj3Var2, j2, z2, (byte) 1);
                lv6Var.c = new lg3(cj3Var2, j2, z2, (byte) 2);
                if (j2 >= 0) {
                    TLRPC.User V1 = cj3Var2.getMessagesController().V1(Long.valueOf(j2));
                    str = qu2.m(15, V1.first_name, null);
                    chat = V1;
                } else {
                    TLRPC.Chat K0 = cj3Var2.getMessagesController().K0(Long.valueOf(-j2));
                    str = K0.title;
                    chat = K0;
                }
                if (cj3Var2.D3()) {
                    S2 = gl.S2(k96.a0("StoriesMovedToDialogs", null, 2131744521, str));
                } else {
                    S2 = gl.S2(k96.a0("StoriesMovedToContacts", null, 2131744522, qu2.m(15, str, null)));
                }
                cj3Var2.T = u21.Y().V(Collections.singletonList(chat), S2, null, lv6Var).j();
                return;
            case 1:
                cj3Var.getMessagesController().M1().l0(j, !z, false);
                return;
            default:
                cj3Var.getMessagesController().M1().l0(j, z, true);
                return;
        }
    }
}
