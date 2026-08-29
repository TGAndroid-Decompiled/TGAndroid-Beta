package bh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t {
    public final int f2700a;
    public final TLRPC.InputPeer f2701b;
    public final int f2702c;
    public final byte[] d;
    public final a4.g f2703e;
    public final Utilities.Callback f2704f;
    public String f2705g;
    public boolean h;
    public boolean f2706i;
    public final ArrayList f2707j = new ArrayList();

    public t(int i10, TLRPC.InputPeer inputPeer, int i11, byte[] bArr, a4.g gVar, Utilities.Callback callback) {
        this.f2700a = i10;
        this.f2701b = inputPeer;
        this.f2702c = i11;
        this.d = bArr;
        this.f2703e = gVar;
        this.f2704f = callback;
    }

    public final void a() {
        int i10;
        if (!this.h && !this.f2706i) {
            this.f2706i = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.f2705g;
            if (str != null) {
                i10 = 10;
            } else {
                i10 = 15;
            }
            tL_messages_getPollVotes.limit = i10;
            tL_messages_getPollVotes.peer = this.f2701b;
            tL_messages_getPollVotes.f22489id = this.f2702c;
            tL_messages_getPollVotes.option = this.d;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.f2700a).sendRequestTyped(tL_messages_getPollVotes, new Object(), new m(this, 1));
        }
    }
}
