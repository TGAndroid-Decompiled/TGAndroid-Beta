package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class fp {
    public final int f24048a;
    public final HashSet f24049b = new HashSet();
    public boolean f24050c;
    public boolean d;

    public fp(int i7) {
        this.f24048a = i7;
        if (!this.f24050c && !this.d) {
            this.f24050c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
