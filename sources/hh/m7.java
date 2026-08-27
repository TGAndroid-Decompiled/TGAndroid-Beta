package hh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class m7 implements n7 {

    public final int f9744a;

    public final long f9745b;
    public int d;
    public Boolean h;

    public boolean f9750i;

    public boolean f9751j;

    public String f9752k;

    public int f9755n;

    public boolean f9756o;

    public ArrayList f9758q;

    public boolean f9746c = false;

    public boolean f9747e = true;

    public boolean f9748f = false;

    public int f9749g = 783;

    public final ArrayList f9753l = new ArrayList();

    public int f9754m = -1;

    public long f9757p = 0;

    public m7(int i10, long j10, boolean z10) {
        this.f9744a = i10;
        this.f9745b = j10;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        TLObject tLObject;
        if (this.f9750i || this.f9751j) {
            return;
        }
        boolean z10 = this.f9752k == null;
        this.f9750i = true;
        long j10 = this.f9757p;
        int i10 = this.f9744a;
        if (j10 != 0) {
            TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
            getcraftstargifts.gift_id = this.f9757p;
            getcraftstargifts.offset = z10 ? "" : this.f9752k;
            getcraftstargifts.limit = z10 ? 15 : 30;
            tLObject = getcraftstargifts;
        } else {
            TL_stars.getSavedStarGifts getsavedstargifts = new TL_stars.getSavedStarGifts();
            getsavedstargifts.sort_by_value = !this.f9747e;
            getsavedstargifts.exclude_unupgradable = !TLObject.hasFlag(this.f9749g, 2);
            getsavedstargifts.exclude_upgradable = !TLObject.hasFlag(this.f9749g, 4);
            getsavedstargifts.exclude_unlimited = !TLObject.hasFlag(this.f9749g, 1);
            getsavedstargifts.exclude_unique = !TLObject.hasFlag(this.f9749g, 8);
            getsavedstargifts.exclude_saved = !TLObject.hasFlag(this.f9749g, 256);
            getsavedstargifts.exclude_unsaved = !TLObject.hasFlag(this.f9749g, 512);
            getsavedstargifts.peer_color_available = this.f9748f;
            long j11 = this.f9745b;
            if (j11 == 0) {
                getsavedstargifts.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                getsavedstargifts.peer = MessagesController.getInstance(i10).getInputPeer(j11);
            }
            getsavedstargifts.offset = z10 ? "" : this.f9752k;
            getsavedstargifts.limit = z10 ? Math.max(MessagesController.getInstance(i10).stargiftsPinnedToTopLimit, 15) : 30;
            tLObject = getsavedstargifts;
            if (this.f9746c) {
                getsavedstargifts.flags |= 64;
                getsavedstargifts.collection_id = this.d;
                tLObject = getsavedstargifts;
            }
        }
        int iSendRequest = ConnectionsManager.getInstance(i10).sendRequest(tLObject, new l7(this, iArr, z10, 0));
        this.f9754m = iSendRequest;
        int[] iArr = {iSendRequest};
    }

    @Override
    public final int b(int i10) {
        if (!i5.O1(this.f9744a, this.f9745b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f9753l;
            if (i11 >= arrayList.size()) {
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i12)).can_upgrade) {
                        return i12;
                    }
                }
                return -1;
            }
            if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                return i11;
            }
            i11++;
        }
    }

    @Override
    public final int c() {
        return this.f9755n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f9744a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f9745b), this);
    }

    @Override
    public final int e() {
        return this.f9753l.size();
    }

    public final void f(int i10, boolean z10) {
        int i11;
        if ((i10 & 15) != 0) {
            i11 = 15;
        } else {
            i11 = (i10 & 768) != 0 ? 768 : 0;
        }
        int i12 = this.f9749g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f9749g = i13;
            if (z10) {
                i(true);
            }
        }
    }

    public final TL_stars.InputSavedStarGift g(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f9744a).getInputPeer(this.f9745b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override
    public final Object get(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f9753l;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9753l;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i10);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i10++;
        }
    }

    public final void i(boolean z10) {
        if (this.f9754m != -1) {
            ConnectionsManager.getInstance(this.f9744a).cancelRequest(this.f9754m, true);
            this.f9754m = -1;
        }
        this.f9750i = false;
        this.f9753l.clear();
        this.f9752k = null;
        this.f9751j = false;
        if (z10 || this.f9756o) {
            a();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f9753l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f9744a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f9753l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f22607id == starGift2.f22607id) {
                            arrayList2.remove(i12);
                            this.f9755n = Math.max(0, this.f9755n - 1);
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f9745b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new cf.a(this, 9));
        }
    }

    public final void k(int i10, int i11) {
        ArrayList arrayList = this.f9753l;
        int iClamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (iClamp < 0 || iClamp >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(iClamp);
        int iClamp2 = Utilities.clamp(i11, arrayList.size() - 1, 0);
        if (iClamp2 < 0 || iClamp2 >= arrayList.size()) {
            return;
        }
        arrayList.add(iClamp2, savedStarGift);
    }

    public final void l() {
        boolean z10 = this.f9746c;
        int i10 = 0;
        long j10 = this.f9745b;
        int i11 = this.f9744a;
        if (!z10) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            ArrayList arrayListH = h();
            int size = arrayListH.size();
            while (i10 < size) {
                Object obj = arrayListH.get(i10);
                i10++;
                togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new jh.m5(5), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.f9753l;
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList arrayListH = h();
            boolean zContains = arrayListH.contains(savedStarGift);
            int i10 = this.f9744a;
            if (zContains) {
                if (!z10) {
                    arrayListH.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f9753l;
                    arrayList.removeAll(arrayListH);
                    if (this.f9747e && !this.f9746c) {
                        Collections.sort(arrayList, new a5.f(18));
                    }
                    arrayList.addAll(0, arrayListH);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f9745b), this);
                    l();
                    return z12;
                }
            } else if (z10) {
                if (arrayListH.size() + 1 <= MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                    z12 = false;
                } else {
                    if (!z11) {
                        return true;
                    }
                    while (arrayListH.size() > 0 && arrayListH.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) com.google.android.recaptcha.internal.a.k(1, arrayListH)).pinned_to_top = false;
                    }
                    z12 = true;
                }
                arrayListH.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f9753l;
                arrayList.removeAll(arrayListH);
                if (this.f9747e) {
                    Collections.sort(arrayList, new a5.f(18));
                }
                arrayList.addAll(0, arrayListH);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f9745b), this);
                l();
                return z12;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.f9753l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (u7.k(savedStarGift2, savedStarGift)) {
                if (!z10) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f9753l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (u7.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.f9744a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f9745b), this);
        }
    }
}
