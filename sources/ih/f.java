package ih;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;
public final class f extends xa implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final w41 T;
    public final LongSparseArray U;
    public ArrayList V;
    public boolean W;
    public k51 X;

    public f(Context context) {
        super(context, null, false, false, false, false, false, 2, null);
        int i10 = 0;
        this.U = new LongSparseArray();
        this.V = new ArrayList();
        setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T = w41.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.X.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            e eVar = new e(context, auction2);
            eVar.f9107a.setOnClickListener(new bg.q(this, context, auction2, 2));
            linearLayout.addView(eVar, i7.f6.n(-1, -2));
            this.U.put(auction2.giftId, eVar);
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
        this.V = new ArrayList(list);
        this.f34660e.setTitle(y());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                i10 = tL_starGiftAuctionState.next_round_at;
            } else {
                i10 = 0;
            }
            e eVar = (e) this.U.get(auction.giftId);
            if (eVar != null) {
                eVar.b(this.W);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                eVar.a(max, this.W);
                eVar.f9111f.a(max);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.W = true;
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 5), this.resourcesProvider);
        this.X = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        ArrayList arrayList = this.V;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }
}
