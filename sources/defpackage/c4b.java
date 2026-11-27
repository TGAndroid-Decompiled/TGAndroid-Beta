package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.StickersActivity;
public final class c4b extends z5c {
    public final StickersActivity b;

    public c4b(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((e) stickersActivity).currentAccount;
        ls6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 2, this.b, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((e) stickersActivity).currentAccount;
        ls6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 0, this.b, false, false);
    }
}
