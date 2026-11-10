package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class t9 {
    public final int f4755a;
    public final long f4756b;
    public boolean f4757c;
    public boolean d;
    public v9 f4760g;
    public boolean f4762j;
    public boolean f4763k;
    public final ArrayList f4758e = new ArrayList();
    public final ArrayList f4759f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f4761i = -1;

    public t9(int i7, long j3) {
        this.f4755a = i7;
        this.f4756b = j3;
        i();
    }

    public final void a(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v9 e10 = e(i7);
        int i10 = 0;
        long j3 = this.f4756b;
        int i11 = this.f4755a;
        if (e10 != null) {
            e10.f4914l.addAll(0, arrayList);
            e10.f4916n = arrayList.size() + e10.f4916n;
            qs.f(i11).k(qs.G3, Long.valueOf(j3), e10);
            n(i7);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = qp.s1(i11).j1(j3);
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
                tL_inputSavedStarGiftChat.peer = qp.s1(i11).j1(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, new r9(this, 1));
    }

    public final void b(String str, c20 c20Var) {
        if (this.f4763k) {
            return;
        }
        this.f4763k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f4758e.add(tL_starGiftCollection);
        j();
        int i7 = this.f4755a;
        long j3 = this.f4756b;
        v9 v9Var = new v9(i7, j3, false);
        v9Var.f4907c = true;
        v9Var.d = -1;
        v9Var.f4916n = 0;
        v9Var.f4912j = true;
        this.h.put(-1, v9Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = qp.s1(i7).j1(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(createstargiftcollection, new g2(this, tL_starGiftCollection, v9Var, c20Var, 4));
    }

    public final TL_stars.TL_starGiftCollection c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4758e;
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
            return this.f4758e;
        }
        return this.f4759f;
    }

    public final v9 e(int i7) {
        return (v9) this.h.get(Integer.valueOf(i7));
    }

    public final int f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4758e;
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
        if (this.f4761i != -1) {
            ConnectionsManager.getInstance(this.f4755a).cancelRequest(this.f4761i, true);
            this.f4761i = -1;
        }
        this.f4757c = false;
        this.d = false;
        if (this.f4762j) {
            i();
        }
    }

    public final boolean h() {
        long j3 = this.f4756b;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f4755a;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != p10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, qp.s1(i10).M0(Long.valueOf(-j3)));
    }

    public final void i() {
        if (!this.f4757c && !this.d) {
            this.f4757c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i7 = this.f4755a;
            getstargiftcollections.peer = qp.s1(i7).j1(this.f4756b);
            ArrayList arrayList = this.f4758e;
            int size = arrayList.size();
            long j3 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j3 = ui.p(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j3;
            this.f4761i = ConnectionsManager.getInstance(i7).sendRequest(getstargiftcollections, new r9(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f4759f;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f4758e;
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
        boolean z9;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        v9 e10 = e(i7);
        char c11 = 1;
        boolean z10 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f4914l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (ea.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.f4916n = Math.max(0, e10.f4916n - 1);
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
        int i12 = this.f4755a;
        qp s12 = qp.s1(i12);
        long j3 = this.f4756b;
        updatestargiftcollection.peer = s12.j1(j3);
        updatestargiftcollection.collection_id = i7;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i7, z10);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                c10 = c11;
                z9 = z10;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = qp.s1(i12).j1(j3);
                c10 = c11;
                z9 = z10;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c10 = c11;
                z9 = z10;
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
            c11 = c10;
            z10 = z9;
        }
        char c12 = c11;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new r9(this, 2));
        qs f10 = qs.f(i12);
        Object[] objArr = new Object[2];
        objArr[z10 ? 1 : 0] = Long.valueOf(j3);
        objArr[c12] = e10;
        f10.k(qs.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i7, boolean z9) {
        for (v9 v9Var : this.h.values()) {
            v9Var.p(savedStarGift, i7, z9);
        }
        v9 v9Var2 = this.f4760g;
        if (v9Var2 != null) {
            v9Var2.p(savedStarGift, i7, z9);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z9) {
        for (v9 v9Var : this.h.values()) {
            v9Var.q(savedStarGift, z9);
        }
        v9 v9Var2 = this.f4760g;
        if (v9Var2 != null) {
            v9Var2.q(savedStarGift, z9);
        }
    }

    public final void n(int i7) {
        TL_stars.SavedStarGift savedStarGift;
        v9 e10 = e(i7);
        TL_stars.TL_starGiftCollection c10 = c(i7);
        if (e10 != null) {
            ArrayList arrayList = e10.f4914l;
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
                qs.f(this.f4755a).k(qs.H3, Long.valueOf(this.f4756b), this);
            }
        }
    }
}
