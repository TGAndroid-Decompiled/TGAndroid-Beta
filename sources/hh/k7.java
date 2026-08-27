package hh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

public final class k7 {

    public final int f9611a;

    public final long f9612b;

    public boolean f9613c;
    public boolean d;

    public m7 f9616g;

    public boolean f9618j;

    public boolean f9619k;

    public final ArrayList f9614e = new ArrayList();

    public final ArrayList f9615f = new ArrayList();
    public final HashMap h = new HashMap();

    public int f9617i = -1;

    public k7(int i10, long j10) {
        this.f9611a = i10;
        this.f9612b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        m7 m7VarE = e(i10);
        int i11 = 1;
        int i12 = 0;
        long j10 = this.f9612b;
        int i13 = this.f9611a;
        if (m7VarE != null) {
            m7VarE.f9753l.addAll(0, arrayList);
            m7VarE.f9755n = arrayList.size() + m7VarE.f9755n;
            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), m7VarE);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i13).getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i10, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new i7(this, i11));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f9619k) {
            return;
        }
        this.f9619k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f9614e.add(tL_starGiftCollection);
        j();
        int i10 = this.f9611a;
        long j10 = this.f9612b;
        m7 m7Var = new m7(i10, j10, false);
        m7Var.f9746c = true;
        m7Var.d = -1;
        m7Var.f9755n = 0;
        m7Var.f9751j = true;
        this.h.put(-1, m7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new gh.f1(this, tL_starGiftCollection, m7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f9614e;
            if (i11 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i11);
            if (i10 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i11++;
        }
    }

    public final ArrayList d() {
        return h() ? this.f9614e : this.f9615f;
    }

    public final m7 e(int i10) {
        return (m7) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f9614e;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((TL_stars.TL_starGiftCollection) arrayList.get(i11)).collection_id) {
                return i11;
            }
            i11++;
        }
    }

    public final void g() {
        if (this.f9617i != -1) {
            ConnectionsManager.getInstance(this.f9611a).cancelRequest(this.f9617i, true);
            this.f9617i = -1;
        }
        this.f9613c = false;
        this.d = false;
        if (this.f9618j) {
            i();
        }
    }

    public final boolean h() {
        int i10 = this.f9611a;
        long j10 = this.f9612b;
        if (j10 >= 0) {
            return j10 == 0 || j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (this.f9613c || this.d) {
            return;
        }
        this.f9613c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i10 = this.f9611a;
        getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.f9612b);
        ArrayList arrayList = this.f9614e;
        int size = arrayList.size();
        long jCalcHash = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jCalcHash = MediaDataController.calcHash(jCalcHash, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = jCalcHash;
        this.f9617i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new i7(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f9615f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9614e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i10);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i10++;
        }
    }

    public final void k(int i10, TL_stars.SavedStarGift savedStarGift) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        m7 m7VarE = e(i10);
        boolean z10 = false;
        if (m7VarE != null) {
            ArrayList arrayList2 = m7VarE.f9753l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (u7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            m7VarE.f9755n = Math.max(0, m7VarE.f9755n - 1);
                            i11--;
                            break;
                        }
                    }
                    i11++;
                }
            }
        }
        n(i10);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i13 = this.f9611a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j10 = this.f9612b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        int i14 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i10, z10);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
            z10 = false;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new i7(this, i14));
        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), m7VarE);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((m7) it.next()).n(savedStarGift, i10, z10);
        }
        m7 m7Var = this.f9616g;
        if (m7Var != null) {
            m7Var.n(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((m7) it.next()).o(savedStarGift, z10);
        }
        m7 m7Var = this.f9616g;
        if (m7Var != null) {
            m7Var.o(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        m7 m7VarE = e(i10);
        TL_stars.TL_starGiftCollection tL_starGiftCollectionC = c(i10);
        if (m7VarE != null) {
            ArrayList arrayList = m7VarE.f9753l;
            if (tL_starGiftCollectionC == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                tL_starGiftCollectionC.flags &= -2;
                tL_starGiftCollectionC.icon = null;
            } else {
                tL_starGiftCollectionC.flags |= 1;
                tL_starGiftCollectionC.icon = savedStarGift.gift.getDocument();
            }
            NotificationCenter.getInstance(this.f9611a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f9612b), this);
        }
    }
}
