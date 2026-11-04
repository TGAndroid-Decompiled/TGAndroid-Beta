package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class ap {
    public final int f21570a;
    public final HashSet f21571b = new HashSet();
    public boolean f21572c;
    public boolean d;

    public ap(int i3) {
        this.f21570a = i3;
        if (!this.f21572c && !this.d) {
            this.f21572c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i3).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
