package fh;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class d extends sa {
    public static final int W = 0;
    public final List T;
    public final GiftAuctionController.Auction U;
    public z41 V;

    public d(Context context, org.telegram.ui.ActionBar.b6 b6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, false, false, false, 2, b6Var);
        this.U = auction;
        this.T = list;
        this.v = 0.2f;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.f32408e.setTitle(y());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(0));
        this.d.setOverScrollMode(2);
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 5));
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i9 = d.leftMargin;
        int i10 = this.backgroundPaddingLeft;
        d.leftMargin = i9 + i10;
        d.rightMargin += i10;
        this.containerView.addView(dVar, d);
        this.V.N(false);
    }

    public static void O(d dVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        dVar.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null && !UserObject.isService(peerDialogId)) {
            Bundle bundle = new Bundle();
            if (peerDialogId > 0) {
                bundle.putLong("user_id", peerDialogId);
                if (peerDialogId == UserConfig.getInstance(dVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -peerDialogId);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 3), this.resourcesProvider);
        this.V = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        List list = this.T;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }
}
