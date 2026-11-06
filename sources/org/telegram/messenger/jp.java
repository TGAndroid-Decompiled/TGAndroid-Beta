package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class jp {
    public final int f23569a;
    public final HashSet f23570b = new HashSet();
    public boolean f23571c;
    public boolean d;

    public jp(int i7) {
        this.f23569a = i7;
        if (!this.f23571c && !this.d) {
            this.f23571c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
