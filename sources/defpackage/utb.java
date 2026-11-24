package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class utb extends tx9 {
    public boolean f2;
    public final vtb g2;

    public utb(vtb vtbVar, vtb vtbVar2, Activity activity) {
        super(vtbVar2, activity, false, null, 3, null);
        this.g2 = vtbVar;
        this.f2 = true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        long j;
        vtb vtbVar = this.g2;
        i = ((d) vtbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(y6c.h(i).f0)) {
            hq6 mediaDataController = vtbVar.getMediaDataController();
            i2 = ((d) vtbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(y6c.h(i2).f0);
            if (o0 == null) {
                j = 0;
            } else {
                j = o0.set.id;
            }
            if (j == hq6.r0(document)) {
                z = true;
            }
        }
        vtbVar.f0(l, z);
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
