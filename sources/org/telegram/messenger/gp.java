package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class gp {
    public final int f23896a;
    public final HashSet f23897b = new HashSet();
    public boolean f23898c;
    public boolean d;

    public gp(int i7) {
        this.f23896a = i7;
        if (!this.f23898c && !this.d) {
            this.f23898c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
