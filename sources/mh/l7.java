package mh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l7 implements m7 {
    public final int f14396a;
    public final long f14397b;
    public int d;
    public Boolean h;
    public boolean f14402i;
    public boolean f14403j;
    public String f14404k;
    public int f14407n;
    public boolean f14408o;
    public ArrayList f14410q;
    public boolean f14398c = false;
    public boolean f14399e = true;
    public boolean f14400f = false;
    public int f14401g = 783;
    public final ArrayList f14405l = new ArrayList();
    public int f14406m = -1;
    public long f14409p = 0;

    public l7(int i10, long j10, boolean z4) {
        this.f14396a = i10;
        this.f14397b = j10;
        if (z4) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z4;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f14402i && !this.f14403j) {
            if (this.f14404k == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f14402i = true;
            long j10 = this.f14409p;
            int i10 = 30;
            String str = "";
            int i11 = this.f14396a;
            if (j10 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f14409p;
                if (!z4) {
                    str = this.f14404k;
                }
                getcraftstargifts.offset = str;
                if (z4) {
                    i10 = 15;
                }
                getcraftstargifts.limit = i10;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f14399e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f14401g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f14401g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f14401g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f14401g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f14401g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f14401g, 512);
                getsavedstargifts2.peer_color_available = this.f14400f;
                long j11 = this.f14397b;
                if (j11 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(i11).getInputPeer(j11);
                }
                if (!z4) {
                    str = this.f14404k;
                }
                getsavedstargifts2.offset = str;
                if (z4) {
                    i10 = Math.max(MessagesController.getInstance(i11).stargiftsPinnedToTopLimit, 15);
                }
                getsavedstargifts2.limit = i10;
                getsavedstargifts = getsavedstargifts2;
                if (this.f14398c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getsavedstargifts, new k7(this, r2, z4, 0));
            this.f14406m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i10) {
        if (!g5.O1(this.f14396a, this.f14397b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f14405l;
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
        return this.f14407n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f14396a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f14397b), this);
    }

    @Override
    public final int e() {
        return this.f14405l.size();
    }

    public final void f(int i10, boolean z4) {
        int i11;
        if ((i10 & 15) != 0) {
            i11 = 15;
        } else if ((i10 & 768) != 0) {
            i11 = 768;
        } else {
            i11 = 0;
        }
        int i12 = this.f14401g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f14401g = i13;
            if (z4) {
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
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f14396a).getInputPeer(this.f14397b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override
    public final Object get(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f14405l;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14405l;
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

    public final void i(boolean z4) {
        if (this.f14406m != -1) {
            ConnectionsManager.getInstance(this.f14396a).cancelRequest(this.f14406m, true);
            this.f14406m = -1;
        }
        this.f14402i = false;
        this.f14405l.clear();
        this.f14404k = null;
        this.f14403j = false;
        if (!z4 && !this.f14408o) {
            return;
        }
        a();
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f14405l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f14396a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z4 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f14405l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f21070id == starGift2.f21070id) {
                            arrayList2.remove(i12);
                            this.f14407n = Math.max(0, this.f14407n - 1);
                            z4 = true;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z4) {
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f14397b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new gf.a(this, 9));
        }
    }

    public final void k(int i10, int i11) {
        ArrayList arrayList = this.f14405l;
        int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (clamp >= 0 && clamp < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
            int clamp2 = Utilities.clamp(i11, arrayList.size() - 1, 0);
            if (clamp2 >= 0 && clamp2 < arrayList.size()) {
                arrayList.add(clamp2, savedStarGift);
            }
        }
    }

    public final void l() {
        boolean z4 = this.f14398c;
        int i10 = 0;
        long j10 = this.f14397b;
        int i11 = this.f14396a;
        if (z4) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f14405l;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        ArrayList h = h();
        int size2 = h.size();
        while (i10 < size2) {
            Object obj2 = h.get(i10);
            i10++;
            togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new oh.p5(4), 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z4, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i10 = this.f14396a;
            if (contains) {
                if (!z4) {
                    h.remove(savedStarGift);
                    z11 = false;
                    savedStarGift.pinned_to_top = z4;
                    arrayList = this.f14405l;
                    arrayList.removeAll(h);
                    if (this.f14399e && !this.f14398c) {
                        Collections.sort(arrayList, new e5.f(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f14397b), this);
                    l();
                    return z11;
                }
            } else if (z4) {
                if (h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                    if (!z10) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) e2.c.g(1, h)).pinned_to_top = false;
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z4;
                arrayList = this.f14405l;
                arrayList.removeAll(h);
                if (this.f14399e) {
                    Collections.sort(arrayList, new e5.f(18));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f14397b), this);
                l();
                return z11;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i10, boolean z4) {
        ArrayList arrayList = this.f14405l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t7.k(savedStarGift2, savedStarGift)) {
                if (z4) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i10));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z4) {
        ArrayList arrayList = this.f14405l;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t7.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z4) {
                savedStarGift2.unsaved = z4;
                z10 = true;
            }
        }
        if (z10) {
            NotificationCenter.getInstance(this.f14396a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f14397b), this);
        }
    }
}
