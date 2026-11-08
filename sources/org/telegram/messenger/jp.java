package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class jp {
    public final int f23588a;
    public final HashSet f23589b = new HashSet();
    public boolean f23590c;
    public boolean d;

    public jp(int i7) {
        this.f23588a = i7;
        if (!this.f23590c && !this.d) {
            this.f23590c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
