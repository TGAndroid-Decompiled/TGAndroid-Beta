package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class gp {
    public final int f24257a;
    public final HashSet f24258b = new HashSet();
    public boolean f24259c;
    public boolean d;

    public gp(int i7) {
        this.f24257a = i7;
        if (!this.f24259c && !this.d) {
            this.f24259c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
        }
    }
}
