package dh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t {
    public final int f4940a;
    public final TLRPC.InputPeer f4941b;
    public final int f4942c;
    public final byte[] d;
    public final ag.d e;
    public final Utilities.Callback f4943f;
    public String f4944g;
    public boolean h;
    public boolean f4945i;
    public final ArrayList f4946j = new ArrayList();

    public t(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, ag.d dVar, Utilities.Callback callback) {
        this.f4940a = i10;
        this.f4941b = inputPeer;
        this.f4942c = i11;
        this.d = bArr;
        this.e = dVar;
        this.f4943f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f4945i) {
            this.f4945i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f4944g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f4941b;
            tL_messages_getPollVotes.f19256id = this.f4942c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f4940a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new m(this, 1));
        }
    }
}
