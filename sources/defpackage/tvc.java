package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;
public final class tvc implements fd, oqb {
    public final WallpapersListActivity a;

    public tvc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        this.a.removeSelfFromStack();
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.C0();
    }
}
