package dh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t {
    public final int f4934a;
    public final TLRPC.InputPeer f4935b;
    public final int f4936c;
    public final byte[] d;
    public final ag.d e;
    public final Utilities.Callback f4937f;
    public String f4938g;
    public boolean h;
    public boolean f4939i;
    public final ArrayList f4940j = new ArrayList();

    public t(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, ag.d dVar, Utilities.Callback callback) {
        this.f4934a = i10;
        this.f4935b = inputPeer;
        this.f4936c = i11;
        this.d = bArr;
        this.e = dVar;
        this.f4937f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f4939i) {
            this.f4939i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f4938g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f4935b;
            tL_messages_getPollVotes.f19281id = this.f4936c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f4934a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new m(this, 1));
        }
    }
}
