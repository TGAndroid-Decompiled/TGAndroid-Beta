package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class fp {
    public final int f24045a;
    public final HashSet f24046b = new HashSet();
    public boolean f24047c;
    public boolean d;

    public fp(int i7) {
        this.f24045a = i7;
        if (!this.f24047c && !this.d) {
            this.f24047c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
