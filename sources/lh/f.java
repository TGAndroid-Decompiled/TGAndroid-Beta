package lh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class f extends sa implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final h51 U;
    public final LongSparseArray V;
    public ArrayList W;
    public boolean X;
    public w51 Y;

    public f(Context context) {
        super(context, null, false, false, false, false, false, 2, null);
        int i10 = 0;
        this.V = new LongSparseArray();
        this.W = new ArrayList();
        setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U = h51.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.Y.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            e eVar = new e(context, auction2);
            eVar.f12679a.setOnClickListener(new eg.o(this, context, auction2, 2));
            linearLayout.addView(eVar, k7.c6.n(-1, -2));
            this.V.put(auction2.giftId, eVar);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.dismiss();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        int i10;
        this.W = new ArrayList(list);
        this.f31015e.setTitle(y());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                i10 = tL_starGiftAuctionState.next_round_at;
            } else {
                i10 = 0;
            }
            e eVar = (e) this.V.get(auction.giftId);
            if (eVar != null) {
                eVar.b(this.X);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                eVar.a(max, this.X);
                eVar.f12683f.a(max);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.X = true;
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 5), this.resourcesProvider);
        this.Y = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        ArrayList arrayList = this.W;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }
}
