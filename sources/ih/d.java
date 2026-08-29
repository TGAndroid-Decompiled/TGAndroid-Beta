package ih;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class d extends xa {
    public static final int W = 0;
    public final List T;
    public final GiftAuctionController.Auction U;
    public k51 V;

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.U = auction;
        this.T = list;
        this.v = 0.2f;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.f34660e.setTitle(y());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(0));
        this.d.setOverScrollMode(2);
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.setOnClickListener(new ag.o(this, 11));
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(dVar, d);
        this.V.N(false);
    }

    public static void P(d dVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
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
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 4), this.resourcesProvider);
        this.V = k51Var;
        k51Var.f29939r = false;
        return k51Var;
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
