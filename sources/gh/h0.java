package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sp0;

public final class h0 extends org.telegram.ui.ActionBar.j {

    public final TL_stars.StarGift f7278a;

    public final Context f7279b;

    public final org.telegram.ui.ActionBar.c6 f7280c;

    public h0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f7278a = starGift;
        this.f7279b = context;
        this.f7280c = c6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f7279b;
        TL_stars.StarGift starGift = this.f7278a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                i0.U(context, starGift, this.f7280c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            sp0.N0(context, null, str, false, str).show();
        }
    }
}
