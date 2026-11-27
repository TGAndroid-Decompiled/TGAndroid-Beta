package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kv4 {
    public final int a;
    public final long b;
    public final long c;
    public TL_stars.StarGift d;
    public TL_stars.TL_StarGiftAuctionUserState e;
    public TL_stars.TL_starGiftAuctionState f;
    public TL_stars.TL_starGiftAuctionStateFinished g;
    public ArrayList h;
    public int i;

    public kv4(int i, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        long j;
        this.a = i;
        this.d = starGift;
        this.e = tL_StarGiftAuctionUserState;
        this.b = starGift.id;
        TLRPC.Document document = starGift.sticker;
        if (document != null) {
            j = document.id;
        } else {
            j = 0;
        }
        this.c = j;
        a(starGiftAuctionState);
    }

    public final boolean a(TL_stars.StarGiftAuctionState starGiftAuctionState) {
        int i;
        if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (f()) {
                i = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.f;
                if (tL_starGiftAuctionState2 != null) {
                    i = tL_starGiftAuctionState2.version;
                } else {
                    i = 0;
                }
            }
            if (tL_starGiftAuctionState.version > i) {
                this.f = tL_starGiftAuctionState;
                h();
                return true;
            }
        } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !f()) {
            this.g = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }
        return false;
    }

    public final long b(int i) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i2);
                i2++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                if (i <= tL_AuctionBidLevel2.pos) {
                    return tL_AuctionBidLevel2.amount;
                }
            }
            return e();
        }
        return e();
    }

    public final int c(int i, long j) {
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i3);
                i3++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j2 = tL_AuctionBidLevel2.amount;
                if (j <= j2 && (j != j2 || i > tL_AuctionBidLevel2.date)) {
                    i2 = tL_AuctionBidLevel2.pos;
                } else {
                    return tL_AuctionBidLevel2.pos;
                }
            }
            return i2 + 1;
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
        if (this.i <= this.d.gifts_per_round) {
            return 1;
        }
        return 2;
    }

    public final long e() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        if (tL_starGiftAuctionState != null) {
            long j = this.e.min_bid_amount;
            if (j > 0) {
                return Math.max(tL_starGiftAuctionState.min_bid_amount, j);
            }
        }
        long j2 = this.e.min_bid_amount;
        if (j2 > 0) {
            return j2;
        }
        if (tL_starGiftAuctionState == null) {
            return 0L;
        }
        return tL_starGiftAuctionState.min_bid_amount;
    }

    public final boolean f() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i) {
        if (this.d.auction_start_date > i) {
            return true;
        }
        return false;
    }

    public final void h() {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f;
        int i = -1;
        if (tL_starGiftAuctionState != null) {
            if (tL_starGiftAuctionState.top_bidders != null) {
                long e = yac.h(this.a).e();
                for (int i2 = 0; i2 < this.f.top_bidders.size(); i2++) {
                    if (e == this.f.top_bidders.get(i2).longValue()) {
                        i = i2 + 1;
                        break;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.e;
            long j = tL_StarGiftAuctionUserState.bid_amount;
            if (j > 0 && !tL_StarGiftAuctionUserState.returned) {
                i = c(tL_StarGiftAuctionUserState.bid_date, j);
            }
        }
        this.i = i;
    }
}
