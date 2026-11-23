package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class g3 {
    public boolean f24074a;
    public boolean f24075b;
    public long f24076c;
    public boolean d;
    public boolean f24077e;
    public int f24078f;
    public int f24079g;
    public TL_stories.TL_premium_myBoosts h;
    public int f24080i = 0;
    public long f24081j;
    public TLRPC.Chat f24082k;
    public boolean f24083l;
    public boolean f24084m;

    public final void a(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        this.h = tL_premium_myBoosts;
        this.f24080i = 0;
        this.f24079g = 0;
        this.d = false;
        this.f24074a = false;
        this.f24077e = false;
        this.f24076c = 0L;
        if (tL_premium_myBoosts.my_boosts.isEmpty()) {
            this.f24075b = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            if (this.f24081j == n5.o(tL_myBoost.peer)) {
                this.f24080i++;
            }
        }
        if (this.f24080i > 0) {
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
                this.f24079g = tL_myBoost3.slot;
                break;
            }
        }
        if (this.f24079g == 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i11);
                i11++;
                TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                TLRPC.Peer peer = tL_myBoost5.peer;
                if (peer != null && n5.o(peer) != (-this.f24082k.f28434id)) {
                    arrayList3.add(tL_myBoost5);
                }
            }
            if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                this.f24076c = n5.o(tL_myBoost6.peer);
                this.f24079g = tL_myBoost6.slot;
                this.f24074a = true;
            } else if (arrayList3.size() >= 1) {
                this.f24077e = true;
                if (!wg.s.i()) {
                    TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.f24076c = n5.o(tL_myBoost7.peer);
                    this.f24079g = tL_myBoost7.slot;
                }
                this.f24074a = true;
            } else {
                this.f24074a = false;
            }
        } else {
            this.f24074a = true;
        }
        if (this.f24084m) {
            this.f24074a = false;
        }
    }
}
