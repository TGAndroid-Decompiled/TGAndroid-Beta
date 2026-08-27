package gh;

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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class d extends qa {
    public static final int W = 0;
    public final List T;
    public final GiftAuctionController.Auction U;
    public b51 V;

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.U = auction;
        this.T = list;
        this.v = 0.2f;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.f31853e.setTitle(z());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(0));
        this.d.setOverScrollMode(2);
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setOnClickListener(new ag.w0(this, 7));
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = layoutParamsD.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i10 + i11;
        layoutParamsD.rightMargin += i11;
        this.containerView.addView(dVar, layoutParamsD);
        this.V.N(false);
    }

    public static void P(d dVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        dVar.dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null || UserObject.isService(peerDialogId)) {
            return;
        }
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
        n2VarU.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 3), this.resourcesProvider);
        this.V = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        List list = this.T;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }
}
