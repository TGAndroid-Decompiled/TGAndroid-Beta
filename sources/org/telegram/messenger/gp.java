package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class gp {
    public final int f24293a;
    public final HashSet f24294b = new HashSet();
    public boolean f24295c;
    public boolean d;

    public gp(int i7) {
        this.f24293a = i7;
        if (!this.f24295c && !this.d) {
            this.f24295c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
