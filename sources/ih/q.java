package ih;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q {
    public final int f8567a;
    public final TLRPC.InputPeer f8568b;
    public final int f8569c;
    public final byte[] d;
    public final gg.c e;
    public final q20 f8570f;
    public String f8571g;
    public boolean h;
    public boolean f8572i;
    public final ArrayList f8573j = new ArrayList();

    public q(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, gg.c cVar, q20 q20Var) {
        this.f8567a = i10;
        this.f8568b = inputPeer;
        this.f8569c = i11;
        this.d = bArr;
        this.e = cVar;
        this.f8570f = q20Var;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f8572i) {
            this.f8572i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f8571g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f8568b;
            tL_messages_getPollVotes.f19892id = this.f8569c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f8567a).sendRequestTyped(tL_messages_getPollVotes, new a3.b(1), new k(this, 1));
        }
    }
}
