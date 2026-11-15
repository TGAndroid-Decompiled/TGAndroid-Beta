package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e3 {
    public boolean f23247a;
    public boolean f23248b;
    public long f23249c;
    public boolean d;
    public boolean f23250e;
    public int f23251f;
    public int f23252g;
    public TL_stories.TL_premium_myBoosts h;
    public int f23253i = 0;
    public long f23254j;
    public TLRPC.Chat f23255k;
    public boolean f23256l;
    public boolean f23257m;

    public final void a(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        this.h = tL_premium_myBoosts;
        this.f23253i = 0;
        this.f23252g = 0;
        this.d = false;
        this.f23247a = false;
        this.f23250e = false;
        this.f23249c = 0L;
        if (tL_premium_myBoosts.my_boosts.isEmpty()) {
            this.f23248b = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            if (this.f23254j == m5.o(tL_myBoost.peer)) {
                this.f23253i++;
            }
        }
        if (this.f23253i > 0) {
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
                this.f23252g = tL_myBoost3.slot;
                break;
            }
        }
        if (this.f23252g == 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i11);
                i11++;
                TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                TLRPC.Peer peer = tL_myBoost5.peer;
                if (peer != null && m5.o(peer) != (-this.f23255k.f28051id)) {
                    arrayList3.add(tL_myBoost5);
                }
            }
            if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                this.f23249c = m5.o(tL_myBoost6.peer);
                this.f23252g = tL_myBoost6.slot;
                this.f23247a = true;
            } else if (arrayList3.size() >= 1) {
                this.f23250e = true;
                if (!wg.q.i()) {
                    TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.f23249c = m5.o(tL_myBoost7.peer);
                    this.f23252g = tL_myBoost7.slot;
                }
                this.f23247a = true;
            } else {
                this.f23247a = false;
            }
        } else {
            this.f23247a = true;
        }
        if (this.f23257m) {
            this.f23247a = false;
        }
    }
}
