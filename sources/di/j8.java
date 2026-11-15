package di;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class j8 {
    public final int f8865a;
    public final long f8866b;
    public boolean f8867c;
    public boolean d;
    public l8 f8870g;
    public boolean f8872j;
    public boolean f8873k;
    public final ArrayList f8868e = new ArrayList();
    public final ArrayList f8869f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f8871i = -1;

    public j8(int i7, long j3) {
        this.f8865a = i7;
        this.f8866b = j3;
        i();
    }

    public final void a(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        l8 e10 = e(i7);
        int i10 = 0;
        long j3 = this.f8866b;
        int i11 = this.f8865a;
        if (e10 != null) {
            e10.f9001l.addAll(0, arrayList);
            e10.f9003n = arrayList.size() + e10.f9003n;
            ns.f(i11).k(ns.G3, Long.valueOf(j3), e10);
            n(i7);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = np.s1(i11).j1(j3);
        updatestargiftcollection.collection_id = i7;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i7, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = np.s1(i11).j1(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, new h8(this, 1));
    }

    public final void b(String str, z10 z10Var) {
        if (this.f8873k) {
            return;
        }
        this.f8873k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f8868e.add(tL_starGiftCollection);
        j();
        int i7 = this.f8865a;
        long j3 = this.f8866b;
        l8 l8Var = new l8(i7, j3, false);
        l8Var.f8994c = true;
        l8Var.d = -1;
        l8Var.f9003n = 0;
        l8Var.f8999j = true;
        this.h.put(-1, l8Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = np.s1(i7).j1(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(createstargiftcollection, new bi.l1(this, tL_starGiftCollection, l8Var, z10Var, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8868e;
            if (i10 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
                if (i7 == tL_starGiftCollection.collection_id) {
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
            return this.f8868e;
        }
        return this.f8869f;
    }

    public final l8 e(int i7) {
        return (l8) this.h.get(Integer.valueOf(i7));
    }

    public final int f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8868e;
            if (i10 < arrayList.size()) {
                if (i7 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.f8871i != -1) {
            ConnectionsManager.getInstance(this.f8865a).cancelRequest(this.f8871i, true);
            this.f8871i = -1;
        }
        this.f8867c = false;
        this.d = false;
        if (this.f8872j) {
            i();
        }
    }

    public final boolean h() {
        long j3 = this.f8866b;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f8865a;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != m10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, np.s1(i10).M0(Long.valueOf(-j3)));
    }

    public final void i() {
        if (!this.f8867c && !this.d) {
            this.f8867c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i7 = this.f8865a;
            getstargiftcollections.peer = np.s1(i7).j1(this.f8866b);
            ArrayList arrayList = this.f8868e;
            int size = arrayList.size();
            long j3 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j3 = si.p(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j3;
            this.f8871i = ConnectionsManager.getInstance(i7).sendRequest(getstargiftcollections, new h8(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f8869f;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8868e;
            if (i7 < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i7);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void k(int i7, TL_stars.SavedStarGift savedStarGift) {
        char c10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        l8 e10 = e(i7);
        char c11 = 1;
        boolean z11 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f9001l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (u8.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.f9003n = Math.max(0, e10.f9003n - 1);
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
        n(i7);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.f8865a;
        np s12 = np.s1(i12);
        long j3 = this.f8866b;
        updatestargiftcollection.peer = s12.j1(j3);
        updatestargiftcollection.collection_id = i7;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i7, z11);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                c10 = c11;
                z10 = z11;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = np.s1(i12).j1(j3);
                c10 = c11;
                z10 = z11;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c10 = c11;
                z10 = z11;
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
            c11 = c10;
            z11 = z10;
        }
        char c12 = c11;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new h8(this, 2));
        ns f10 = ns.f(i12);
        Object[] objArr = new Object[2];
        objArr[z11 ? 1 : 0] = Long.valueOf(j3);
        objArr[c12] = e10;
        f10.k(ns.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i7, boolean z10) {
        for (l8 l8Var : this.h.values()) {
            l8Var.p(savedStarGift, i7, z10);
        }
        l8 l8Var2 = this.f8870g;
        if (l8Var2 != null) {
            l8Var2.p(savedStarGift, i7, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (l8 l8Var : this.h.values()) {
            l8Var.q(savedStarGift, z10);
        }
        l8 l8Var2 = this.f8870g;
        if (l8Var2 != null) {
            l8Var2.q(savedStarGift, z10);
        }
    }

    public final void n(int i7) {
        TL_stars.SavedStarGift savedStarGift;
        l8 e10 = e(i7);
        TL_stars.TL_starGiftCollection c10 = c(i7);
        if (e10 != null) {
            ArrayList arrayList = e10.f9001l;
            if (c10 != null) {
                if (arrayList.isEmpty()) {
                    savedStarGift = null;
                } else {
                    savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                }
                if (savedStarGift == null) {
                    c10.flags &= -2;
                    c10.icon = null;
                } else {
                    c10.flags |= 1;
                    c10.icon = savedStarGift.gift.getDocument();
                }
                ns.f(this.f8865a).k(ns.H3, Long.valueOf(this.f8866b), this);
            }
        }
    }
}
