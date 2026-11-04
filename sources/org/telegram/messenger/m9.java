package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m9 {
    public final int f24176a;
    public final long f24177b;
    public final long f24178c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState f24179e;
    public TL_stars.TL_starGiftAuctionState f24180f;
    public TL_stars.TL_starGiftAuctionStateFinished f24181g;
    public ArrayList h;
    public int f24182i;

    public m9(int i3, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        long j10;
        this.f24176a = i3;
        this.d = starGift;
        this.f24179e = tL_StarGiftAuctionUserState;
        this.f24177b = starGift.f27230id;
        TLRPC.Document document = starGift.sticker;
        if (document != null) {
            j10 = document.f27007id;
        } else {
            j10 = 0;
        }
        this.f24178c = j10;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i3;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i3 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f24180f;
                if (tL_starGiftAuctionState2 != null) {
                    i3 = tL_starGiftAuctionState2.version;
                } else {
                    i3 = 0;
                }
            }
            if (tL_starGiftAuctionState.version > i3) {
                this.f24180f = tL_starGiftAuctionState;
                h();
                return true;
            }
        } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !f()) {
            this.f24181g = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }
        return false;
    }

    public final long b(int i3) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f24180f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i10);
                i10++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                if (i3 <= tL_AuctionBidLevel2.pos) {
                    return tL_AuctionBidLevel2.amount;
                }
            }
            return e();
        }
        return e();
    }

    public final int c(int i3, long j10) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f24180f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i11);
                i11++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j11 = tL_AuctionBidLevel2.amount;
                if (j10 <= j11 && (j10 != j11 || i3 > tL_AuctionBidLevel2.date)) {
                    i10 = tL_AuctionBidLevel2.pos;
                } else {
                    return tL_AuctionBidLevel2.pos;
                }
            }
            return i10 + 1;
        }
        return -1;
    }

    public final int d() {
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f24179e;
        if (tL_StarGiftAuctionUserState.returned) {
            return 3;
        }
        if (tL_StarGiftAuctionUserState.bid_amount == 0) {
            return 4;
        }
        if (this.f24182i <= this.d.gifts_per_round) {
            return 1;
        }
        return 2;
    }

    public final long e() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f24180f;
        if (tL_starGiftAuctionState != null) {
            long j10 = this.f24179e.min_bid_amount;
            if (j10 > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j10);
            }
        }
        long j11 = this.f24179e.min_bid_amount;
        if (j11 > 0) {
            return j11;
        }
        if (tL_starGiftAuctionState == null) {
            return 0L;
        }
        return tL_starGiftAuctionState.min_bid_amount;
    }

    public final boolean f() {
        if (this.f24181g != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3) {
        if (this.d.auction_start_date > i3) {
            return true;
        }
        return false;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f24180f;
        int i3 = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e10 = h10.i(this.f24176a).e();
                for (int i10 = 0; i10 < this.f24180f.top_bidders.size(); i10++) {
                    if (e10 == this.f24180f.top_bidders.get(i10).longValue()) {
                        i3 = i10 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f24179e;
            long j10 = tL_StarGiftAuctionUserState.bid_amount;
            if (j10 > 0 && !tL_StarGiftAuctionUserState.returned) {
                i3 = c(tL_StarGiftAuctionUserState.bid_date, j10);
            }
        }
        this.f24182i = i3;
    }
}
