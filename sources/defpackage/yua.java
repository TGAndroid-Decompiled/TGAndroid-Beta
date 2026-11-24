package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class yua {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public ava g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public yua(int i, long j) {
        this.a = i;
        this.b = j;
        i();
    }

    public final void a(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ava e = e(i);
        int i2 = 0;
        long j = this.b;
        int i3 = this.a;
        if (e != null) {
            e.l.addAll(0, arrayList);
            e.n = arrayList.size() + e.n;
            nm7.f(i3).k(nm7.I3, Long.valueOf(j), e);
            n(i);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = oc7.r1(i3).i1(j);
        updatestargiftcollection.collection_id = i;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = oc7.r1(i3).i1(j);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                fc4.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i3).sendRequest(updatestargiftcollection, new wua(this, (byte) 1));
    }

    public final void b(qac qacVar, String str) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i = this.a;
        long j = this.b;
        ava avaVar = new ava(i, j, false);
        avaVar.c = true;
        avaVar.d = -1;
        avaVar.n = 0;
        avaVar.j = true;
        this.h.put(-1, avaVar);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = oc7.r1(i).i1(j);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i).sendRequest(createstargiftcollection, new av0(this, tL_starGiftCollection, avaVar, qacVar, (byte) 23));
    }

    public final TL_stars.TL_starGiftCollection c(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i2);
                if (i == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final ArrayList d() {
        if (h()) {
            return this.e;
        }
        return this.f;
    }

    public final ava e(int i) {
        return (ava) this.h.get(Integer.valueOf(i));
    }

    public final int f(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                if (i == ((TL_stars.TL_starGiftCollection) arrayList.get(i2)).collection_id) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.i != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i, true);
            this.i = -1;
        }
        this.c = false;
        this.d = false;
        if (this.j) {
            i();
        }
    }

    public final boolean h() {
        long j = this.b;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i >= 0) {
            if (i != 0 && j != z8c.h(i2).e()) {
                return false;
            }
            return true;
        }
        return sd2.w(5, oc7.r1(i2).L0(Long.valueOf(-j)));
    }

    public final void i() {
        if (!this.c && !this.d) {
            this.c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i = this.a;
            getstargiftcollections.peer = oc7.r1(i).i1(this.b);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            long j = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                j = hs6.r(j, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j;
            this.i = ConnectionsManager.getInstance(i).sendRequest(getstargiftcollections, new wua(this, (byte) 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void k(int i, TL_stars.SavedStarGift savedStarGift) {
        char c;
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        ava e = e(i);
        char c2 = 1;
        boolean z2 = false;
        if (e != null) {
            ArrayList arrayList2 = e.l;
            if (!arrayList2.isEmpty()) {
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (jva.h(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i3))) {
                            arrayList2.remove(i2);
                            e.n = Math.max(0, e.n - 1);
                            i2--;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
            }
        }
        n(i);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i4 = this.a;
        oc7 r1 = oc7.r1(i4);
        long j = this.b;
        updatestargiftcollection.peer = r1.i1(j);
        updatestargiftcollection.collection_id = i;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i, z2);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                c = c2;
                z = z2;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = oc7.r1(i4).i1(j);
                c = c2;
                z = z2;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c = c2;
                z = z2;
                fc4.l("can't convert gift to inputgift to add into the collection");
            }
            c2 = c;
            z2 = z;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i4).sendRequest(updatestargiftcollection, new wua(this, (byte) 2));
        nm7 f = nm7.f(i4);
        Object[] objArr = new Object[2];
        objArr[z2 ? 1 : 0] = Long.valueOf(j);
        objArr[c2] = e;
        f.k(nm7.I3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
        for (ava avaVar : this.h.values()) {
            avaVar.r(savedStarGift, i, z);
        }
        ava avaVar2 = this.g;
        if (avaVar2 != null) {
            avaVar2.r(savedStarGift, i, z);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z) {
        for (ava avaVar : this.h.values()) {
            avaVar.s(savedStarGift, z);
        }
        ava avaVar2 = this.g;
        if (avaVar2 != null) {
            avaVar2.s(savedStarGift, z);
        }
    }

    public final void n(int i) {
        TL_stars.SavedStarGift savedStarGift;
        ava e = e(i);
        TL_stars.TL_starGiftCollection c = c(i);
        if (e != null) {
            ArrayList arrayList = e.l;
            if (c != null) {
                if (arrayList.isEmpty()) {
                    savedStarGift = null;
                } else {
                    savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                }
                int i2 = c.flags;
                if (savedStarGift == null) {
                    c.flags = i2 & (-2);
                    c.icon = null;
                } else {
                    c.flags = i2 | 1;
                    c.icon = savedStarGift.gift.getDocument();
                }
                nm7.f(this.a).k(nm7.J3, Long.valueOf(this.b), this);
            }
        }
    }
}
