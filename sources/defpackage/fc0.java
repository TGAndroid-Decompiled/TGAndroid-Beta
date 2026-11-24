package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class fc0 extends vz9 {
    public boolean f2;
    public final mc0 g2;

    public fc0(mc0 mc0Var, mc0 mc0Var2, Activity activity, int i) {
        super(mc0Var2, activity, false, null, 4, true, null, 16, i);
        this.g2 = mc0Var;
        this.f2 = true;
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z;
        long j;
        int i2;
        boolean z2 = this.S;
        mc0 mc0Var = this.g2;
        if (z2) {
            i2 = ((d) mc0Var).currentAccount;
            tL_emojiList = hs6.d0(i2).M1;
        } else {
            i = ((d) mc0Var).currentAccount;
            tL_emojiList = hs6.d0(i).N1;
        }
        long j2 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j = document.id;
            } else if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            z = tL_emojiList.document_id.contains(Long.valueOf(j));
        } else {
            z = false;
        }
        if (l != null) {
            j2 = l.longValue();
        }
        mc0Var.m0(z, j2, document);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.r(null);
        }
    }
}
