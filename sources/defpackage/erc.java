package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;
public final class erc implements ed, pmb {
    public final WallpapersListActivity a;

    public erc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.B0();
    }
}
