package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class yh3 implements Runnable {
    public final byte a;
    public final nk3 b;
    public final long c;
    public final boolean d;

    public yh3(nk3 nk3Var, long j, boolean z, byte b) {
        this.a = b;
        this.b = nk3Var;
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
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var2 = this.b;
                h4b N1 = nk3Var2.getMessagesController().N1();
                long j2 = this.c;
                boolean z2 = this.d;
                N1.l0(j2, z2, false);
                hi2 hi2Var = new hi2((byte) 12, false);
                hi2Var.b = new yh3(nk3Var2, j2, z2, (byte) 1);
                hi2Var.c = new yh3(nk3Var2, j2, z2, (byte) 2);
                if (j2 >= 0) {
                    TLRPC.User W1 = nk3Var2.getMessagesController().W1(Long.valueOf(j2));
                    str = bw2.m(15, W1.first_name, null);
                    chat = W1;
                } else {
                    TLRPC.Chat L0 = nk3Var2.getMessagesController().L0(Long.valueOf(-j2));
                    str = L0.title;
                    chat = L0;
                }
                if (nk3Var2.F3()) {
                    S2 = gm.S2(jb6.a0("StoriesMovedToDialogs", null, 2131744447, str));
                } else {
                    S2 = gm.S2(jb6.a0("StoriesMovedToContacts", null, 2131744448, bw2.m(15, str, null)));
                }
                nk3Var2.T = c41.Y().V(Collections.singletonList(chat), S2, null, hi2Var).j();
                return;
            case 1:
                nk3Var.getMessagesController().N1().l0(j, !z, false);
                return;
            default:
                nk3Var.getMessagesController().N1().l0(j, z, true);
                return;
        }
    }
}
