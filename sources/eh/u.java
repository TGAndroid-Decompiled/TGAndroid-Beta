package eh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u {
    public final int f5671a;
    public final TLRPC.InputPeer f5672b;
    public final int f5673c;
    public final byte[] d;
    public final m f5674e;
    public final Utilities.Callback f5675f;
    public String f5676g;
    public boolean h;
    public boolean f5677i;
    public final ArrayList f5678j = new ArrayList();

    public u(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, m mVar, Utilities.Callback callback) {
        this.f5671a = i10;
        this.f5672b = inputPeer;
        this.f5673c = i11;
        this.d = bArr;
        this.f5674e = mVar;
        this.f5675f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f5677i) {
            this.f5677i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f5676g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f5672b;
            tL_messages_getPollVotes.f20942id = this.f5673c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f5671a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new n(this, 1));
        }
    }
}
