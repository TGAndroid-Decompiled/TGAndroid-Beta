package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f49 {
    public final int a;
    public final TLRPC.InputPeer b;
    public final int c;
    public final byte[] d;
    public final pp8 e;
    public final qac f;
    public String g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();

    public f49(int i, TLRPC.InputPeer inputPeer, int i2, byte[] bArr, pp8 pp8Var, qac qacVar) {
        this.a = i;
        this.b = inputPeer;
        this.c = i2;
        this.d = bArr;
        this.e = pp8Var;
        this.f = qacVar;
    }

    public final void a() {
        int i;
        if (!this.h && !this.i) {
            this.i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.g;
            if (str != null) {
                i = 10;
            } else {
                i = 15;
            }
            tL_messages_getPollVotes.limit = i;
            tL_messages_getPollVotes.peer = this.b;
            tL_messages_getPollVotes.id = this.c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getPollVotes, new kc((byte) 0), new a49(this, (byte) 1));
        }
    }
}
