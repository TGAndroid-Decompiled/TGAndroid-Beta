package ai;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x9 implements y9 {
    public final int f2440a;
    public final long f2441b;
    public int d;
    public Boolean h;
    public boolean f2445i;
    public boolean f2446j;
    public String f2447k;
    public int f2450n;
    public boolean f2451o;
    public ArrayList f2453q;
    public boolean f2442c = false;
    public boolean e = true;
    public boolean f2443f = false;
    public int f2444g = 783;
    public final ArrayList f2448l = new ArrayList();
    public int f2449m = -1;
    public long f2452p = 0;

    public x9(int i10, long j10, boolean z10) {
        this.f2440a = i10;
        this.f2441b = j10;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f2445i && !this.f2446j) {
            if (this.f2447k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2445i = true;
            int i10 = (this.f2452p > 0L ? 1 : (this.f2452p == 0L ? 0 : -1));
            int i11 = 30;
            String str = "";
            int i12 = this.f2440a;
            if (i10 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f2452p;
                if (!z10) {
                    str = this.f2447k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i11 = 15;
                }
                getcraftstargifts.limit = i11;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f2444g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f2444g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f2444g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f2444g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f2444g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f2444g, 512);
                getsavedstargifts2.peer_color_available = this.f2443f;
                long j10 = this.f2441b;
                if (j10 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                }
                if (!z10) {
                    str = this.f2447k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i11 = Math.max(MessagesController.getInstance(i12).stargiftsPinnedToTopLimit, 15);
                }
                getsavedstargifts2.limit = i11;
                getsavedstargifts = getsavedstargifts2;
                if (this.f2442c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(getsavedstargifts, new w9(this, r2, z10, 0));
            this.f2449m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i10) {
        if (!k7.b2(this.f2440a, this.f2441b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f2448l;
            if (i11 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                    return i11;
                }
                i11++;
            } else {
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i12)).can_upgrade) {
                        return i12;
                    }
                }
                return -1;
            }
        }
    }

    @Override
    public final int c() {
        return this.f2450n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f2440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f2441b), this);
    }

    @Override
    public final int e() {
        return this.f2448l.size();
    }

    public final void f() {
        if (this.f2449m != -1) {
            ConnectionsManager.getInstance(this.f2440a).cancelRequest(this.f2449m, true);
            this.f2449m = -1;
        }
        this.f2445i = false;
    }

    public final void g(int i10, boolean z10) {
        int i11;
        if ((i10 & 15) != 0) {
            i11 = 15;
        } else if ((i10 & 768) != 0) {
            i11 = 768;
        } else {
            i11 = 0;
        }
        int i12 = this.f2444g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f2444g = i13;
            if (z10) {
                j(true);
            }
        }
    }

    @Override
    public final Object get(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f2448l;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final TL_stars.InputSavedStarGift h(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f2440a).getInputPeer(this.f2441b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f2448l;
            if (i10 < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i10);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f2448l.indexOf(obj);
    }

    public final void j(boolean z10) {
        if (this.f2449m != -1) {
            ConnectionsManager.getInstance(this.f2440a).cancelRequest(this.f2449m, true);
            this.f2449m = -1;
        }
        this.f2445i = false;
        this.f2448l.clear();
        this.f2447k = null;
        this.f2446j = false;
        if (!z10 && !this.f2451o) {
            return;
        }
        a();
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f2440a;
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
                    ArrayList arrayList2 = this.f2448l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f20496id == starGift2.f20496id) {
                            arrayList2.remove(i12);
                            this.f2450n = Math.max(0, this.f2450n - 1);
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
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f2441b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new h(this, 4));
        }
    }

    public final void l(int i10, int i11) {
        ArrayList arrayList = this.f2448l;
        int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (clamp >= 0 && clamp < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
            int clamp2 = Utilities.clamp(i11, arrayList.size() - 1, 0);
            if (clamp2 >= 0 && clamp2 < arrayList.size()) {
                arrayList.add(clamp2, savedStarGift);
            }
        }
    }

    public final void m() {
        boolean z10 = this.f2442c;
        int i10 = 0;
        long j10 = this.f2441b;
        int i11 = this.f2440a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f2448l;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        ArrayList i12 = i();
        int size2 = i12.size();
        while (i10 < size2) {
            Object obj2 = i12.get(i10);
            i10++;
            togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new ci.e6(8), 64);
    }

    public final boolean n(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i10 = i();
            boolean contains = i10.contains(savedStarGift);
            int i11 = this.f2440a;
            if (contains) {
                if (!z10) {
                    i10.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f2448l;
                    arrayList.removeAll(i10);
                    if (this.e && !this.f2442c) {
                        Collections.sort(arrayList, new a4.d(3));
                    }
                    arrayList.addAll(0, i10);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f2441b), this);
                    m();
                    return z12;
                }
            } else if (z10) {
                if (i10.size() + 1 > MessagesController.getInstance(i11).stargiftsPinnedToTopLimit) {
                    if (!z11) {
                        return true;
                    }
                    while (i10.size() > 0 && i10.size() + 1 > MessagesController.getInstance(i11).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) i0.a.z(1, i10)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                i10.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f2448l;
                arrayList.removeAll(i10);
                if (this.e) {
                    Collections.sort(arrayList, new a4.d(3));
                }
                arrayList.addAll(0, i10);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f2441b), this);
                m();
                return z12;
            }
        }
        return false;
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.f2448l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (fa.k(savedStarGift2, savedStarGift)) {
                if (z10) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i10));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f2448l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (fa.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.f2440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f2441b), this);
        }
    }
}
