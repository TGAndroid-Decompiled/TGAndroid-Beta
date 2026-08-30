package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lq0;
public final class e0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f10549a;
    public final Context f10550b;
    public final org.telegram.ui.ActionBar.f6 f10551c;

    public e0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f10549a = starGift;
        this.f10550b = context;
        this.f10551c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f10550b;
        TL_stars.StarGift starGift = this.f10549a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                f0.U(context, starGift, this.f10551c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            lq0.N0(context, null, str, false, str).show();
        }
    }
}
