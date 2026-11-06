package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s9 {
    public final int f25430a;
    public final long f25431b;
    public final long f25432c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState f25433e;
    public TL_stars.TL_starGiftAuctionState f25434f;
    public TL_stars.TL_starGiftAuctionStateFinished f25435g;
    public ArrayList h;
    public int f25436i;

    public s9(int i7, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        long j3;
        this.f25430a = i7;
        this.d = starGift;
        this.f25433e = tL_StarGiftAuctionUserState;
        this.f25431b = starGift.f27181id;
        TLRPC.Document document = starGift.sticker;
        if (document != null) {
            j3 = document.f26958id;
        } else {
            j3 = 0;
        }
        this.f25432c = j3;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i7;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i7 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f25434f;
                if (tL_starGiftAuctionState2 != null) {
                    i7 = tL_starGiftAuctionState2.version;
                } else {
                    i7 = 0;
                }
            }
            if (tL_starGiftAuctionState.version > i7) {
                this.f25434f = tL_starGiftAuctionState;
                h();
                return true;
            }
        } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !f()) {
            this.f25435g = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }
        return false;
    }

    public final long b(int i7) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f25434f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i10);
                i10++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                if (i7 <= tL_AuctionBidLevel2.pos) {
                    return tL_AuctionBidLevel2.amount;
                }
            }
            return e();
        }
        return e();
    }

    public final int c(int i7, long j3) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f25434f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i11);
                i11++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j10 = tL_AuctionBidLevel2.amount;
                if (j3 <= j10 && (j3 != j10 || i7 > tL_AuctionBidLevel2.date)) {
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
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f25433e;
        if (tL_StarGiftAuctionUserState.returned) {
            return 3;
        }
        if (tL_StarGiftAuctionUserState.bid_amount == 0) {
            return 4;
        }
        if (this.f25436i <= this.d.gifts_per_round) {
            return 1;
        }
        return 2;
    }

    public final long e() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f25434f;
        if (tL_starGiftAuctionState != null) {
            long j3 = this.f25433e.min_bid_amount;
            if (j3 > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j3);
            }
        }
        long j10 = this.f25433e.min_bid_amount;
        if (j10 > 0) {
            return j10;
        }
        if (tL_starGiftAuctionState == null) {
            return 0L;
        }
        return tL_starGiftAuctionState.min_bid_amount;
    }

    public final boolean f() {
        if (this.f25435g != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i7) {
        if (this.d.auction_start_date > i7) {
            return true;
        }
        return false;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f25434f;
        int i7 = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e10 = p10.i(this.f25430a).e();
                for (int i10 = 0; i10 < this.f25434f.top_bidders.size(); i10++) {
                    if (e10 == this.f25434f.top_bidders.get(i10).longValue()) {
                        i7 = i10 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f25433e;
            long j3 = tL_StarGiftAuctionUserState.bid_amount;
            if (j3 > 0 && !tL_StarGiftAuctionUserState.returned) {
                i7 = c(tL_StarGiftAuctionUserState.bid_date, j3);
            }
        }
        this.f25436i = i7;
    }
}
