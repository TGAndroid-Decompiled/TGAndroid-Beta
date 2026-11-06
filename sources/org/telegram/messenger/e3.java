package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e3 {
    public boolean f22140a;
    public boolean f22141b;
    public long f22142c;
    public boolean d;
    public boolean f22143e;
    public int f22144f;
    public int f22145g;
    public TL_stories.TL_premium_myBoosts h;
    public int f22146i = 0;
    public long f22147j;
    public TLRPC.Chat f22148k;
    public boolean f22149l;
    public boolean f22150m;

    public final void a(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        this.h = tL_premium_myBoosts;
        this.f22146i = 0;
        this.f22145g = 0;
        this.d = false;
        this.f22140a = false;
        this.f22143e = false;
        this.f22142c = 0L;
        if (tL_premium_myBoosts.my_boosts.isEmpty()) {
            this.f22141b = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            if (this.f22147j == m5.o(tL_myBoost.peer)) {
                this.f22146i++;
            }
        }
        if (this.f22146i > 0) {
            this.d = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList2 = tL_premium_myBoosts.my_boosts;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            TL_stories.TL_myBoost tL_myBoost2 = arrayList2.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost3 = tL_myBoost2;
            if (tL_myBoost3.peer == null) {
                this.f22145g = tL_myBoost3.slot;
                break;
            }
        }
        if (this.f22145g == 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i11);
                i11++;
                TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                TLRPC.Peer peer = tL_myBoost5.peer;
                if (peer != null && m5.o(peer) != (-this.f22148k.f26952id)) {
                    arrayList3.add(tL_myBoost5);
                }
            }
            if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                this.f22142c = m5.o(tL_myBoost6.peer);
                this.f22145g = tL_myBoost6.slot;
                this.f22140a = true;
            } else if (arrayList3.size() >= 1) {
                this.f22143e = true;
                if (!wg.s.i()) {
                    TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.f22142c = m5.o(tL_myBoost7.peer);
                    this.f22145g = tL_myBoost7.slot;
                }
                this.f22140a = true;
            } else {
                this.f22140a = false;
            }
        } else {
            this.f22140a = true;
        }
        if (this.f22150m) {
            this.f22140a = false;
        }
    }
}
