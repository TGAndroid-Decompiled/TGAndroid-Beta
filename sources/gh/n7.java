package gh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n7 implements o7 {
    public final int f8616a;
    public final long f8617b;
    public int d;
    public Boolean h;
    public boolean f8622i;
    public boolean f8623j;
    public String f8624k;
    public int f8627n;
    public boolean f8628o;
    public ArrayList f8630q;
    public boolean f8618c = false;
    public boolean f8619e = true;
    public boolean f8620f = false;
    public int f8621g = 783;
    public final ArrayList f8625l = new ArrayList();
    public int f8626m = -1;
    public long f8629p = 0;

    public n7(int i9, long j10, boolean z10) {
        this.f8616a = i9;
        this.f8617b = j10;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f8622i && !this.f8623j) {
            if (this.f8624k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8622i = true;
            long j10 = this.f8629p;
            int i9 = 30;
            String str = "";
            int i10 = this.f8616a;
            if (j10 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f8629p;
                if (!z10) {
                    str = this.f8624k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i9 = 15;
                }
                getcraftstargifts.limit = i9;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f8619e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f8621g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f8621g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f8621g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f8621g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f8621g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f8621g, 512);
                getsavedstargifts2.peer_color_available = this.f8620f;
                long j11 = this.f8617b;
                if (j11 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(i10).getInputPeer(j11);
                }
                if (!z10) {
                    str = this.f8624k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i9 = Math.max(MessagesController.getInstance(i10).stargiftsPinnedToTopLimit, 15);
                }
                getsavedstargifts2.limit = i9;
                getsavedstargifts = getsavedstargifts2;
                if (this.f8618c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getsavedstargifts, new m7(this, r2, z10, 0));
            this.f8626m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i9) {
        if (!k5.O1(this.f8616a, this.f8617b)) {
            return -1;
        }
        int i10 = i9 + 1;
        while (true) {
            ArrayList arrayList = this.f8625l;
            if (i10 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i10)).can_upgrade) {
                    return i10;
                }
                i10++;
            } else {
                for (int i11 = i9 - 1; i11 >= 0; i11--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                        return i11;
                    }
                }
                return -1;
            }
        }
    }

    @Override
    public final int c() {
        return this.f8627n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f8616a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f8617b), this);
    }

    @Override
    public final int e() {
        return this.f8625l.size();
    }

    public final void f(int i9, boolean z10) {
        int i10;
        if ((i9 & 15) != 0) {
            i10 = 15;
        } else if ((i9 & 768) != 0) {
            i10 = 768;
        } else {
            i10 = 0;
        }
        int i11 = this.f8621g;
        int i12 = i9 | ((~i10) & i11);
        if (i11 != i12) {
            this.f8621g = i12;
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
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f8616a).getInputPeer(this.f8617b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override
    public final Object get(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f8625l;
            if (i9 < arrayList.size()) {
                return arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8625l;
            if (i9 < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i9);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f8626m != -1) {
            ConnectionsManager.getInstance(this.f8616a).cancelRequest(this.f8626m, true);
            this.f8626m = -1;
        }
        this.f8622i = false;
        this.f8625l.clear();
        this.f8624k = null;
        this.f8623j = false;
        if (!z10 && !this.f8628o) {
            return;
        }
        a();
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f8625l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i9 = this.f8616a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f8625l;
                    if (i11 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i11)).gift;
                        if (starGift3 != null && starGift3.f22607id == starGift2.f22607id) {
                            arrayList2.remove(i11);
                            this.f8627n = Math.max(0, this.f8627n - 1);
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f8617b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i9).sendRequest(getsavedstargift, new bf.a(this, 9));
        }
    }

    public final void k(int i9, int i10) {
        ArrayList arrayList = this.f8625l;
        int clamp = Utilities.clamp(i9, arrayList.size() - 1, 0);
        if (clamp >= 0 && clamp < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
            int clamp2 = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (clamp2 >= 0 && clamp2 < arrayList.size()) {
                arrayList.add(clamp2, savedStarGift);
            }
        }
    }

    public final void l() {
        boolean z10 = this.f8618c;
        int i9 = 0;
        long j10 = this.f8617b;
        int i10 = this.f8616a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f8625l;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ArrayList h = h();
        int size2 = h.size();
        while (i9 < size2) {
            Object obj2 = h.get(i9);
            i9++;
            togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new ih.q5(5), 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i9 = this.f8616a;
            if (contains) {
                if (!z10) {
                    h.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f8625l;
                    arrayList.removeAll(h);
                    if (this.f8619e && !this.f8618c) {
                        Collections.sort(arrayList, new a5.e(17));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f8617b), this);
                    l();
                    return z12;
                }
            } else if (z10) {
                if (h.size() + 1 > MessagesController.getInstance(i9).stargiftsPinnedToTopLimit) {
                    if (!z11) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i9).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) e2.c.k(1, h)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f8625l;
                arrayList.removeAll(h);
                if (this.f8619e) {
                    Collections.sort(arrayList, new a5.e(17));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f8617b), this);
                l();
                return z12;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i9, boolean z10) {
        ArrayList arrayList = this.f8625l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (v7.k(savedStarGift2, savedStarGift)) {
                if (z10) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i9))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i9));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i9));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f8625l;
        int size = arrayList.size();
        boolean z11 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (v7.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.f8616a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f8617b), this);
        }
    }
}
