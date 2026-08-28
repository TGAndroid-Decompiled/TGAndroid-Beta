package fh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rp0;
public final class j0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f6526a;
    public final Context f6527b;
    public final org.telegram.ui.ActionBar.b6 f6528c;

    public j0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f6526a = starGift;
        this.f6527b = context;
        this.f6528c = b6Var;
    }

    @Override
    public final void b(int i9) {
        Context context = this.f6527b;
        TL_stars.StarGift starGift = this.f6526a;
        if (i9 != 3 && i9 != 2) {
            if (i9 == 4) {
                k0.T(context, starGift, this.f6528c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i9 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            rp0.N0(context, null, str, false, str).show();
        }
    }
}
