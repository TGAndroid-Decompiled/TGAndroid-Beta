package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class pp {
    public final int f17622a;
    public final HashSet f17623b = new HashSet();
    public boolean f17624c;
    public boolean d;

    public pp(int i10) {
        this.f17622a = i10;
        if (!this.f17624c && !this.d) {
            this.f17624c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i10).sendRequest(getsavedmusicids, new v1(this, 5));
        }
    }
}
