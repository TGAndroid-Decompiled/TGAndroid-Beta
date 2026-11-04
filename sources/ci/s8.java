package ci;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class s8 {
    public final int f5965a;
    public final long f5966b;
    public boolean f5967c;
    public boolean d;
    public v8 f5970g;
    public boolean f5972j;
    public boolean f5973k;
    public final ArrayList f5968e = new ArrayList();
    public final ArrayList f5969f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f5971i = -1;

    public s8(int i3, long j10) {
        this.f5965a = i3;
        this.f5966b = j10;
        i();
    }

    public final void a(int i3, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v8 e10 = e(i3);
        int i10 = 0;
        long j10 = this.f5966b;
        int i11 = this.f5965a;
        if (e10 != null) {
            e10.f6203l.addAll(0, arrayList);
            e10.f6205n = arrayList.size() + e10.f6205n;
            hs.f(i11).k(hs.G3, Long.valueOf(j10), e10);
            n(i3);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = hp.s1(i11).j1(j10);
        updatestargiftcollection.collection_id = i3;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i3, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = hp.s1(i11).j1(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, new q8(this, 1));
    }

    public final void b(String str, u10 u10Var) {
        if (this.f5973k) {
            return;
        }
        this.f5973k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f5968e.add(tL_starGiftCollection);
        j();
        int i3 = this.f5965a;
        long j10 = this.f5966b;
        v8 v8Var = new v8(i3, j10, false);
        v8Var.f6196c = true;
        v8Var.d = -1;
        v8Var.f6205n = 0;
        v8Var.f6201j = true;
        this.h.put(-1, v8Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = hp.s1(i3).j1(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i3).sendRequest(createstargiftcollection, new ai.q1(this, tL_starGiftCollection, v8Var, u10Var, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5968e;
            if (i10 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
                if (i3 == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final ArrayList d() {
        if (h()) {
            return this.f5968e;
        }
        return this.f5969f;
    }

    public final v8 e(int i3) {
        return (v8) this.h.get(Integer.valueOf(i3));
    }

    public final int f(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5968e;
            if (i10 < arrayList.size()) {
                if (i3 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.f5971i != -1) {
            ConnectionsManager.getInstance(this.f5965a).cancelRequest(this.f5971i, true);
            this.f5971i = -1;
        }
        this.f5967c = false;
        this.d = false;
        if (this.f5972j) {
            i();
        }
    }

    public final boolean h() {
        long j10 = this.f5966b;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f5965a;
        if (i3 >= 0) {
            if (i3 != 0 && j10 != h10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, hp.s1(i10).M0(Long.valueOf(-j10)));
    }

    public final void i() {
        if (!this.f5967c && !this.d) {
            this.f5967c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i3 = this.f5965a;
            getstargiftcollections.peer = hp.s1(i3).j1(this.f5966b);
            ArrayList arrayList = this.f5968e;
            int size = arrayList.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j10 = li.p(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f5971i = ConnectionsManager.getInstance(i3).sendRequest(getstargiftcollections, new q8(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f5969f;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f5968e;
            if (i3 < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i3);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void k(int i3, TL_stars.SavedStarGift savedStarGift) {
        char c2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        v8 e10 = e(i3);
        char c10 = 1;
        boolean z11 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f6203l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (e9.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.f6205n = Math.max(0, e10.f6205n - 1);
                            i10--;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    i10++;
                }
            }
        }
        n(i3);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.f5965a;
        hp s12 = hp.s1(i12);
        long j10 = this.f5966b;
        updatestargiftcollection.peer = s12.j1(j10);
        updatestargiftcollection.collection_id = i3;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i3, z11);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                c2 = c10;
                z10 = z11;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = hp.s1(i12).j1(j10);
                c2 = c10;
                z10 = z11;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c2 = c10;
                z10 = z11;
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
            c10 = c2;
            z11 = z10;
        }
        char c11 = c10;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new q8(this, 2));
        hs f10 = hs.f(i12);
        Object[] objArr = new Object[2];
        objArr[z11 ? 1 : 0] = Long.valueOf(j10);
        objArr[c11] = e10;
        f10.k(hs.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i3, boolean z10) {
        for (v8 v8Var : this.h.values()) {
            v8Var.p(savedStarGift, i3, z10);
        }
        v8 v8Var2 = this.f5970g;
        if (v8Var2 != null) {
            v8Var2.p(savedStarGift, i3, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (v8 v8Var : this.h.values()) {
            v8Var.q(savedStarGift, z10);
        }
        v8 v8Var2 = this.f5970g;
        if (v8Var2 != null) {
            v8Var2.q(savedStarGift, z10);
        }
    }

    public final void n(int i3) {
        TL_stars.SavedStarGift savedStarGift;
        v8 e10 = e(i3);
        TL_stars.TL_starGiftCollection c2 = c(i3);
        if (e10 != null) {
            ArrayList arrayList = e10.f6203l;
            if (c2 != null) {
                if (arrayList.isEmpty()) {
                    savedStarGift = null;
                } else {
                    savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                }
                if (savedStarGift == null) {
                    c2.flags &= -2;
                    c2.icon = null;
                } else {
                    c2.flags |= 1;
                    c2.icon = savedStarGift.gift.getDocument();
                }
                hs.f(this.f5965a).k(hs.H3, Long.valueOf(this.f5966b), this);
            }
        }
    }
}
