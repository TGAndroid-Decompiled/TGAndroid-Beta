package jh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class i7 {
    public final int f12259a;
    public final long f12260b;
    public boolean f12261c;
    public boolean d;
    public k7 f12264g;
    public boolean f12266j;
    public boolean f12267k;
    public final ArrayList f12262e = new ArrayList();
    public final ArrayList f12263f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f12265i = -1;

    public i7(int i10, long j10) {
        this.f12259a = i10;
        this.f12260b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        k7 e10 = e(i10);
        int i11 = 0;
        long j10 = this.f12260b;
        int i12 = this.f12259a;
        if (e10 != null) {
            e10.f12387l.addAll(0, arrayList);
            e10.f12389n = arrayList.size() + e10.f12389n;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i10, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new g7(this, 1));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f12267k) {
            return;
        }
        this.f12267k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f12262e.add(tL_starGiftCollection);
        j();
        int i10 = this.f12259a;
        long j10 = this.f12260b;
        k7 k7Var = new k7(i10, j10, false);
        k7Var.f12380c = true;
        k7Var.d = -1;
        k7Var.f12389n = 0;
        k7Var.f12385j = true;
        this.h.put(-1, k7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new ih.c1(this, tL_starGiftCollection, k7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f12262e;
            if (i11 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i11);
                if (i10 == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final ArrayList d() {
        if (h()) {
            return this.f12262e;
        }
        return this.f12263f;
    }

    public final k7 e(int i10) {
        return (k7) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f12262e;
            if (i11 < arrayList.size()) {
                if (i10 == ((TL_stars.TL_starGiftCollection) arrayList.get(i11)).collection_id) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.f12265i != -1) {
            ConnectionsManager.getInstance(this.f12259a).cancelRequest(this.f12265i, true);
            this.f12265i = -1;
        }
        this.f12261c = false;
        this.d = false;
        if (this.f12266j) {
            i();
        }
    }

    public final boolean h() {
        int i10 = this.f12259a;
        long j10 = this.f12260b;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (!this.f12261c && !this.d) {
            this.f12261c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i10 = this.f12259a;
            getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.f12260b);
            ArrayList arrayList = this.f12262e;
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f12265i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new g7(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f12263f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12262e;
            if (i10 < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i10);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k(int i10, TL_stars.SavedStarGift savedStarGift) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        k7 e10 = e(i10);
        boolean z10 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f12387l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        } else if (s7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e10.f12389n = Math.max(0, e10.f12389n - 1);
                            i11--;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
            }
        }
        n(i10);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i13 = this.f12259a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j10 = this.f12260b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
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
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new g7(this, 2));
        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        for (k7 k7Var : this.h.values()) {
            k7Var.n(savedStarGift, i10, z10);
        }
        k7 k7Var2 = this.f12264g;
        if (k7Var2 != null) {
            k7Var2.n(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (k7 k7Var : this.h.values()) {
            k7Var.o(savedStarGift, z10);
        }
        k7 k7Var2 = this.f12264g;
        if (k7Var2 != null) {
            k7Var2.o(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        TL_stars.SavedStarGift savedStarGift;
        k7 e10 = e(i10);
        TL_stars.TL_starGiftCollection c3 = c(i10);
        if (e10 != null) {
            ArrayList arrayList = e10.f12387l;
            if (c3 != null) {
                if (arrayList.isEmpty()) {
                    savedStarGift = null;
                } else {
                    savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                }
                if (savedStarGift == null) {
                    c3.flags &= -2;
                    c3.icon = null;
                } else {
                    c3.flags |= 1;
                    c3.icon = savedStarGift.gift.getDocument();
                }
                NotificationCenter.getInstance(this.f12259a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f12260b), this);
            }
        }
    }
}
