package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class vxb extends n1a {
    public boolean f2;
    public final wxb g2;

    public vxb(wxb wxbVar, wxb wxbVar2, Activity activity) {
        super(wxbVar2, activity, false, null, 3, null);
        this.g2 = wxbVar;
        this.f2 = true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        long j;
        wxb wxbVar = this.g2;
        i = ((e) wxbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(yac.h(i).f0)) {
            ls6 mediaDataController = wxbVar.getMediaDataController();
            i2 = ((e) wxbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(yac.h(i2).f0);
            if (o0 == null) {
                j = 0;
            } else {
                j = o0.set.id;
            }
            if (j == ls6.r0(document)) {
                z = true;
            }
        }
        wxbVar.f0(l, z);
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
