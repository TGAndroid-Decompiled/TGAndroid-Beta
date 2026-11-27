package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class oc7 {
    public final int a;
    public final HashSet b = new HashSet();
    public boolean c;
    public boolean d;

    public oc7(int i) {
        this.a = i;
        if (!this.c && !this.d) {
            this.c = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(i).sendRequest(getsavedmusicids, new w15(this, (byte) 13));
        }
    }
}
