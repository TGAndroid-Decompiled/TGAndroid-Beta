package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t9 {
    public final int f18033a;
    public final long f18034b;
    public final long f18035c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState e;
    public TL_stars.TL_starGiftAuctionState f18036f;
    public TL_stars.TL_starGiftAuctionStateFinished f18037g;
    public ArrayList h;
    public int f18038i;

    public t9(int i10, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        long j10;
        this.f18033a = i10;
        this.d = starGift;
        this.e = tL_StarGiftAuctionUserState;
        this.f18034b = starGift.f20021id;
        TLRPC.Document document = starGift.sticker;
        if (document != null) {
            j10 = document.f19799id;
        } else {
            j10 = 0;
        }
        this.f18035c = j10;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i10;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i10 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f18036f;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.version;
                } else {
                    i10 = 0;
                }
            }
            if (tL_starGiftAuctionState.version > i10) {
                this.f18036f = tL_starGiftAuctionState;
                h();
                return true;
            }
        } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !f()) {
            this.f18037g = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }
        return false;
    }

    public final long b(int i10) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f18036f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i11);
                i11++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                if (i10 <= tL_AuctionBidLevel2.pos) {
                    return tL_AuctionBidLevel2.amount;
                }
            }
            return e();
        }
        return e();
    }

    public final int c(int i10, long j10) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f18036f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i12);
                i12++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j11 = tL_AuctionBidLevel2.amount;
                if (j10 <= j11 && (j10 != j11 || i10 > tL_AuctionBidLevel2.date)) {
                    i11 = tL_AuctionBidLevel2.pos;
                } else {
                    return tL_AuctionBidLevel2.pos;
                }
            }
            return i11 + 1;
        }
        return -1;
    }

    public final int d() {
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
        if (tL_StarGiftAuctionUserState.returned) {
            return 3;
        }
        if (tL_StarGiftAuctionUserState.bid_amount == 0) {
            return 4;
        }
        if (this.f18038i <= this.d.gifts_per_round) {
            return 1;
        }
        return 2;
    }

    public final long e() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f18036f;
        if (tL_starGiftAuctionState != null) {
            long j10 = this.e.min_bid_amount;
            if (j10 > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j10);
            }
        }
        long j11 = this.e.min_bid_amount;
        if (j11 > 0) {
            return j11;
        }
        if (tL_starGiftAuctionState == null) {
            return 0L;
        }
        return tL_starGiftAuctionState.min_bid_amount;
    }

    public final boolean f() {
        if (this.f18037g != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10) {
        if (this.d.auction_start_date > i10) {
            return true;
        }
        return false;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f18036f;
        int i10 = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e = d20.i(this.f18033a).e();
                for (int i11 = 0; i11 < this.f18036f.top_bidders.size(); i11++) {
                    if (e == this.f18036f.top_bidders.get(i11).longValue()) {
                        i10 = i11 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
            long j10 = tL_StarGiftAuctionUserState.bid_amount;
            if (j10 > 0 && !tL_StarGiftAuctionUserState.returned) {
                i10 = c(tL_StarGiftAuctionUserState.bid_date, j10);
            }
        }
        this.f18038i = i10;
    }
}
