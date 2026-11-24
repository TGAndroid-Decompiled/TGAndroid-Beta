package defpackage;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class lx9 implements Runnable {
    public final byte a;
    public final px9 b;
    public final Integer c;

    public lx9(px9 px9Var, Integer num, byte b) {
        this.a = b;
        this.b = px9Var;
        this.c = num;
    }

    @Override
    public final void run() {
        byte b = this.a;
        px9 px9Var = this.b;
        switch (b) {
            case 0:
                px9Var.d(this.c);
                return;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        px9Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    jw9 jw9Var = (jw9) px9Var;
                    tx9 tx9Var = jw9Var.T.e;
                    List list = tx9.b2;
                    tx9Var.k();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = jw9Var.R;
                    long j = ((dx9) view).e.documentId;
                    tL_emojiStatus.document_id = j;
                    tx9Var.o(view, Long.valueOf(j), ((dx9) jw9Var.R).e.document, jw9Var.S, num);
                    if (jw9Var.S == null) {
                        hq6.d0(tx9Var.W).E1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
