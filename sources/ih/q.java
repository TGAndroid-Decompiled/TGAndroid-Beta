package ih;

import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q {
    public final int f8568a;
    public final TLRPC.InputPeer f8569b;
    public final int f8570c;
    public final byte[] d;
    public final gg.c e;
    public final r20 f8571f;
    public String f8572g;
    public boolean h;
    public boolean f8573i;
    public final ArrayList f8574j = new ArrayList();

    public q(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, gg.c cVar, r20 r20Var) {
        this.f8568a = i10;
        this.f8569b = inputPeer;
        this.f8570c = i11;
        this.d = bArr;
        this.e = cVar;
        this.f8571f = r20Var;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f8573i) {
            this.f8573i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f8572g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f8569b;
            tL_messages_getPollVotes.f19893id = this.f8570c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f8568a).sendRequestTyped(tL_messages_getPollVotes, new a3.b(1), new k(this, 1));
        }
    }
}
