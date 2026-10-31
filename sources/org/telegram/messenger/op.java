package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class op {
    public final int f17289a;
    public final HashSet f17290b = new HashSet();
    public boolean f17291c;
    public boolean d;

    public op(int i10) {
        this.f17289a = i10;
        if (!this.f17291c && !this.d) {
            this.f17291c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i10).sendRequest(getsavedmusicids, new v1(this, 5));
        }
    }
}
