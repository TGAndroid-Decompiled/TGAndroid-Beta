package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mq0;
public final class e0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f12683a;
    public final Context f12684b;
    public final g6 f12685c;

    public e0(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        this.f12683a = starGift;
        this.f12684b = context;
        this.f12685c = g6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f12684b;
        TL_stars.StarGift starGift = this.f12683a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                f0.U(context, starGift, this.f12685c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            mq0.N0(context, null, str, false, str).show();
        }
    }
}
