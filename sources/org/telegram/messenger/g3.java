package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class g3 {
    public boolean f24180a;
    public boolean f24181b;
    public long f24182c;
    public boolean d;
    public boolean f24183e;
    public int f24184f;
    public int f24185g;
    public TL_stories.TL_premium_myBoosts h;
    public int f24186i = 0;
    public long f24187j;
    public TLRPC.Chat f24188k;
    public boolean f24189l;
    public boolean f24190m;

    public final void a(TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        this.h = tL_premium_myBoosts;
        this.f24186i = 0;
        this.f24185g = 0;
        this.d = false;
        this.f24180a = false;
        this.f24183e = false;
        this.f24182c = 0L;
        if (tL_premium_myBoosts.my_boosts.isEmpty()) {
            this.f24181b = true;
        }
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            if (this.f24187j == n5.o(tL_myBoost.peer)) {
                this.f24186i++;
            }
        }
        if (this.f24186i > 0) {
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
                this.f24185g = tL_myBoost3.slot;
                break;
            }
        }
        if (this.f24185g == 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TL_stories.TL_myBoost> arrayList4 = tL_premium_myBoosts.my_boosts;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (i11 < size3) {
                TL_stories.TL_myBoost tL_myBoost4 = arrayList4.get(i11);
                i11++;
                TL_stories.TL_myBoost tL_myBoost5 = tL_myBoost4;
                TLRPC.Peer peer = tL_myBoost5.peer;
                if (peer != null && n5.o(peer) != (-this.f24188k.f28431id)) {
                    arrayList3.add(tL_myBoost5);
                }
            }
            if (arrayList3.size() == 1 && ((TL_stories.TL_myBoost) arrayList3.get(0)).cooldown_until_date == 0) {
                TL_stories.TL_myBoost tL_myBoost6 = (TL_stories.TL_myBoost) arrayList3.get(0);
                this.f24182c = n5.o(tL_myBoost6.peer);
                this.f24185g = tL_myBoost6.slot;
                this.f24180a = true;
            } else if (arrayList3.size() >= 1) {
                this.f24183e = true;
                if (!wg.s.i()) {
                    TL_stories.TL_myBoost tL_myBoost7 = (TL_stories.TL_myBoost) arrayList3.get(0);
                    this.f24182c = n5.o(tL_myBoost7.peer);
                    this.f24185g = tL_myBoost7.slot;
                }
                this.f24180a = true;
            } else {
                this.f24180a = false;
            }
        } else {
            this.f24180a = true;
        }
        if (this.f24190m) {
            this.f24180a = false;
        }
    }
}
