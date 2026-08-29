package ih;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq0;
public final class f0 extends org.telegram.ui.ActionBar.k {
    public final TL_stars.StarGift f9145a;
    public final Context f9146b;
    public final org.telegram.ui.ActionBar.c6 f9147c;

    public f0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f9145a = starGift;
        this.f9146b = context;
        this.f9147c = c6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f9146b;
        TL_stars.StarGift starGift = this.f9145a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                g0.U(context, starGift, this.f9147c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            dq0.N0(context, null, str, false, str).show();
        }
    }
}
