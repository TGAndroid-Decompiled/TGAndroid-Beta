package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;
public final class f2b extends a4c {
    public final StickersActivity b;

    public f2b(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hs6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 2, this.b, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hs6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 0, this.b, false, false);
    }
}
