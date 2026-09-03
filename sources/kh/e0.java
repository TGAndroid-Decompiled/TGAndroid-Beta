package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.lq0;
public final class e0 extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f10679a;
    public final Context f10680b;
    public final f6 f10681c;

    public e0(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f10679a = starGift;
        this.f10680b = context;
        this.f10681c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f10680b;
        TL_stars.StarGift starGift = this.f10679a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                f0.U(context, starGift, this.f10681c);
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
