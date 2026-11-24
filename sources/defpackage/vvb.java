package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class vvb extends vz9 {
    public boolean f2;
    public final wvb g2;

    public vvb(wvb wvbVar, wvb wvbVar2, Activity activity) {
        super(wvbVar2, activity, false, null, 3, null);
        this.g2 = wvbVar;
        this.f2 = true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        long j;
        wvb wvbVar = this.g2;
        i = ((d) wvbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(z8c.h(i).f0)) {
            hs6 mediaDataController = wvbVar.getMediaDataController();
            i2 = ((d) wvbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(z8c.h(i2).f0);
            if (o0 == null) {
                j = 0;
            } else {
                j = o0.set.id;
            }
            if (j == hs6.r0(document)) {
                z = true;
            }
        }
        wvbVar.g0(l, z);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.r(null);
        }
    }
}
