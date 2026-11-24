package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;
public final class htc implements ee, qob {
    public final WallpapersListActivity a;

    public htc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.C0();
    }
}
