package defpackage;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class g1a implements Runnable {
    public final byte a;
    public final j1a b;
    public final Integer c;

    public g1a(j1a j1aVar, Integer num, byte b) {
        this.a = b;
        this.b = j1aVar;
        this.c = num;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j1a j1aVar = this.b;
        switch (b) {
            case 0:
                j1aVar.d(this.c);
                return;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        j1aVar.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    c0a c0aVar = (c0a) j1aVar;
                    n1a n1aVar = c0aVar.T.e;
                    List list = n1a.b2;
                    n1aVar.k();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = c0aVar.R;
                    long j = ((w0a) view).e.documentId;
                    tL_emojiStatus.document_id = j;
                    n1aVar.o(view, Long.valueOf(j), ((w0a) c0aVar.R).e.document, c0aVar.S, num);
                    if (c0aVar.S == null) {
                        ls6.d0(n1aVar.W).E1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
