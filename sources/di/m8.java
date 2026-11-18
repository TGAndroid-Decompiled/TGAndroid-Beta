package di;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 {
    public final int f9319a;
    public final long f9320b;
    public boolean f9321c;
    public boolean d;
    public o8 f9324g;
    public boolean f9326j;
    public boolean f9327k;
    public final ArrayList f9322e = new ArrayList();
    public final ArrayList f9323f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f9325i = -1;

    public m8(int i7, long j3) {
        this.f9319a = i7;
        this.f9320b = j3;
        i();
    }

    public final void a(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        o8 e10 = e(i7);
        int i10 = 0;
        long j3 = this.f9320b;
        int i11 = this.f9319a;
        if (e10 != null) {
            e10.f9467l.addAll(0, arrayList);
            e10.f9469n = arrayList.size() + e10.f9469n;
            ks.f(i11).k(ks.I3, Long.valueOf(j3), e10);
            n(i7);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = mp.u1(i11).l1(j3);
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
                tL_inputSavedStarGiftChat.peer = mp.u1(i11).l1(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, new k8(this, 1));
    }

    public final void b(String str, x10 x10Var) {
        if (this.f9327k) {
            return;
        }
        this.f9327k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f9322e.add(tL_starGiftCollection);
        j();
        int i7 = this.f9319a;
        long j3 = this.f9320b;
        o8 o8Var = new o8(i7, j3, false);
        o8Var.f9460c = true;
        o8Var.d = -1;
        o8Var.f9469n = 0;
        o8Var.f9465j = true;
        this.h.put(-1, o8Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = mp.u1(i7).l1(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(createstargiftcollection, new bi.g2(this, tL_starGiftCollection, o8Var, x10Var, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9322e;
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
            return this.f9322e;
        }
        return this.f9323f;
    }

    public final o8 e(int i7) {
        return (o8) this.h.get(Integer.valueOf(i7));
    }

    public final int f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9322e;
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
        if (this.f9325i != -1) {
            ConnectionsManager.getInstance(this.f9319a).cancelRequest(this.f9325i, true);
            this.f9325i = -1;
        }
        this.f9321c = false;
        this.d = false;
        if (this.f9326j) {
            i();
        }
    }

    public final boolean h() {
        long j3 = this.f9320b;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9319a;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != j10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.v3.w(5, mp.u1(i10).O0(Long.valueOf(-j3)));
    }

    public final void i() {
        if (!this.f9321c && !this.d) {
            this.f9321c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i7 = this.f9319a;
            getstargiftcollections.peer = mp.u1(i7).l1(this.f9320b);
            ArrayList arrayList = this.f9322e;
            int size = arrayList.size();
            long j3 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j3 = ri.r(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j3;
            this.f9325i = ConnectionsManager.getInstance(i7).sendRequest(getstargiftcollections, new k8(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f9323f;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9322e;
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
        o8 e10 = e(i7);
        char c11 = 1;
        boolean z11 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f9467l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (x8.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.f9469n = Math.max(0, e10.f9469n - 1);
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
        int i12 = this.f9319a;
        mp u12 = mp.u1(i12);
        long j3 = this.f9320b;
        updatestargiftcollection.peer = u12.l1(j3);
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
                tL_inputSavedStarGiftChat.peer = mp.u1(i12).l1(j3);
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
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new k8(this, 2));
        ks f10 = ks.f(i12);
        Object[] objArr = new Object[2];
        objArr[z11 ? 1 : 0] = Long.valueOf(j3);
        objArr[c12] = e10;
        f10.k(ks.I3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i7, boolean z10) {
        for (o8 o8Var : this.h.values()) {
            o8Var.r(savedStarGift, i7, z10);
        }
        o8 o8Var2 = this.f9324g;
        if (o8Var2 != null) {
            o8Var2.r(savedStarGift, i7, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (o8 o8Var : this.h.values()) {
            o8Var.s(savedStarGift, z10);
        }
        o8 o8Var2 = this.f9324g;
        if (o8Var2 != null) {
            o8Var2.s(savedStarGift, z10);
        }
    }

    public final void n(int i7) {
        TL_stars.SavedStarGift savedStarGift;
        o8 e10 = e(i7);
        TL_stars.TL_starGiftCollection c10 = c(i7);
        if (e10 != null) {
            ArrayList arrayList = e10.f9467l;
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
                ks.f(this.f9319a).k(ks.J3, Long.valueOf(this.f9320b), this);
            }
        }
    }
}
