package gh;

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
public final class l7 {
    public final int f8501a;
    public final long f8502b;
    public boolean f8503c;
    public boolean d;
    public n7 f8506g;
    public boolean f8508j;
    public boolean f8509k;
    public final ArrayList f8504e = new ArrayList();
    public final ArrayList f8505f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f8507i = -1;

    public l7(int i9, long j10) {
        this.f8501a = i9;
        this.f8502b = j10;
        i();
    }

    public final void a(int i9, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        n7 e10 = e(i9);
        int i10 = 0;
        long j10 = this.f8502b;
        int i11 = this.f8501a;
        if (e10 != null) {
            e10.f8625l.addAll(0, arrayList);
            e10.f8627n = arrayList.size() + e10.f8627n;
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
            n(i9);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        updatestargiftcollection.collection_id = i9;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i9, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, new j7(this, 1));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f8509k) {
            return;
        }
        this.f8509k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f8504e.add(tL_starGiftCollection);
        j();
        int i9 = this.f8501a;
        long j10 = this.f8502b;
        n7 n7Var = new n7(i9, j10, false);
        n7Var.f8618c = true;
        n7Var.d = -1;
        n7Var.f8627n = 0;
        n7Var.f8623j = true;
        this.h.put(-1, n7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i9).sendRequest(createstargiftcollection, new fh.h1(this, tL_starGiftCollection, n7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8504e;
            if (i10 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
                if (i9 == tL_starGiftCollection.collection_id) {
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
            return this.f8504e;
        }
        return this.f8505f;
    }

    public final n7 e(int i9) {
        return (n7) this.h.get(Integer.valueOf(i9));
    }

    public final int f(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8504e;
            if (i10 < arrayList.size()) {
                if (i9 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.f8507i != -1) {
            ConnectionsManager.getInstance(this.f8501a).cancelRequest(this.f8507i, true);
            this.f8507i = -1;
        }
        this.f8503c = false;
        this.d = false;
        if (this.f8508j) {
            i();
        }
    }

    public final boolean h() {
        int i9 = this.f8501a;
        long j10 = this.f8502b;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i9).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (!this.f8503c && !this.d) {
            this.f8503c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i9 = this.f8501a;
            getstargiftcollections.peer = MessagesController.getInstance(i9).getInputPeer(this.f8502b);
            ArrayList arrayList = this.f8504e;
            int size = arrayList.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f8507i = ConnectionsManager.getInstance(i9).sendRequest(getstargiftcollections, new j7(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f8505f;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8504e;
            if (i9 < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i9);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void k(int i9, TL_stars.SavedStarGift savedStarGift) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        n7 e10 = e(i9);
        boolean z10 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.f8625l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (v7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.f8627n = Math.max(0, e10.f8627n - 1);
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
        n(i9);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.f8501a;
        MessagesController messagesController = MessagesController.getInstance(i12);
        long j10 = this.f8502b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i9;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i9, z10);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
            z10 = false;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new j7(this, 2));
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i9, boolean z10) {
        for (n7 n7Var : this.h.values()) {
            n7Var.n(savedStarGift, i9, z10);
        }
        n7 n7Var2 = this.f8506g;
        if (n7Var2 != null) {
            n7Var2.n(savedStarGift, i9, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (n7 n7Var : this.h.values()) {
            n7Var.o(savedStarGift, z10);
        }
        n7 n7Var2 = this.f8506g;
        if (n7Var2 != null) {
            n7Var2.o(savedStarGift, z10);
        }
    }

    public final void n(int i9) {
        TL_stars.SavedStarGift savedStarGift;
        n7 e10 = e(i9);
        TL_stars.TL_starGiftCollection c10 = c(i9);
        if (e10 != null) {
            ArrayList arrayList = e10.f8625l;
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
                NotificationCenter.getInstance(this.f8501a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f8502b), this);
            }
        }
    }
}
