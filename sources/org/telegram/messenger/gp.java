package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class gp {
    public final int f23894a;
    public final HashSet f23895b = new HashSet();
    public boolean f23896c;
    public boolean d;

    public gp(int i7) {
        this.f23894a = i7;
        if (!this.f23896c && !this.d) {
            this.f23896c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
