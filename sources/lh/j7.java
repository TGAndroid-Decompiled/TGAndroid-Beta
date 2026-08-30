package lh;

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
public final class j7 {
    public final int f12670a;
    public final long f12671b;
    public boolean f12672c;
    public boolean d;
    public l7 f12674g;
    public boolean f12676j;
    public boolean f12677k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f12673f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f12675i = -1;

    public j7(int i10, long j10) {
        this.f12670a = i10;
        this.f12671b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        l7 e = e(i10);
        int i11 = 0;
        long j10 = this.f12671b;
        int i12 = this.f12670a;
        if (e != null) {
            e.f12772l.addAll(0, arrayList);
            e.f12774n = arrayList.size() + e.f12774n;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e);
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
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new h7(this, 1));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f12677k) {
            return;
        }
        this.f12677k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i10 = this.f12670a;
        long j10 = this.f12671b;
        l7 l7Var = new l7(i10, j10, false);
        l7Var.f12766c = true;
        l7Var.d = -1;
        l7Var.f12774n = 0;
        l7Var.f12770j = true;
        this.h.put(-1, l7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new kh.b1(this, tL_starGiftCollection, l7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
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
            return this.e;
        }
        return this.f12673f;
    }

    public final l7 e(int i10) {
        return (l7) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
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
        if (this.f12675i != -1) {
            ConnectionsManager.getInstance(this.f12670a).cancelRequest(this.f12675i, true);
            this.f12675i = -1;
        }
        this.f12672c = false;
        this.d = false;
        if (this.f12676j) {
            i();
        }
    }

    public final boolean h() {
        int i10 = this.f12670a;
        long j10 = this.f12671b;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (!this.f12672c && !this.d) {
            this.f12672c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i10 = this.f12670a;
            getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.f12671b);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f12675i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new h7(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f12673f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
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
        l7 e = e(i10);
        boolean z4 = false;
        if (e != null) {
            ArrayList arrayList2 = e.f12772l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        } else if (t7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e.f12774n = Math.max(0, e.f12774n - 1);
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
        int i13 = this.f12670a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j10 = this.f12671b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i10, z4);
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
            z4 = false;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new h7(this, 2));
        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z4) {
        for (l7 l7Var : this.h.values()) {
            l7Var.n(savedStarGift, i10, z4);
        }
        l7 l7Var2 = this.f12674g;
        if (l7Var2 != null) {
            l7Var2.n(savedStarGift, i10, z4);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z4) {
        for (l7 l7Var : this.h.values()) {
            l7Var.o(savedStarGift, z4);
        }
        l7 l7Var2 = this.f12674g;
        if (l7Var2 != null) {
            l7Var2.o(savedStarGift, z4);
        }
    }

    public final void n(int i10) {
        TL_stars.SavedStarGift savedStarGift;
        l7 e = e(i10);
        TL_stars.TL_starGiftCollection c3 = c(i10);
        if (e != null) {
            ArrayList arrayList = e.f12772l;
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
                NotificationCenter.getInstance(this.f12670a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f12671b), this);
            }
        }
    }
}
