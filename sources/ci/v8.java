package ci;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v8 implements w8 {
    public final int f6194a;
    public final long f6195b;
    public int d;
    public Boolean h;
    public boolean f6200i;
    public boolean f6201j;
    public String f6202k;
    public int f6205n;
    public boolean f6206o;
    public ArrayList f6208q;
    public boolean f6196c = false;
    public boolean f6197e = true;
    public boolean f6198f = false;
    public int f6199g = 783;
    public final ArrayList f6203l = new ArrayList();
    public int f6204m = -1;
    public long f6207p = 0;

    public v8(int i3, long j10, boolean z10) {
        this.f6194a = i3;
        this.f6195b = j10;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f6200i && !this.f6201j) {
            if (this.f6202k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6200i = true;
            int i3 = (this.f6207p > 0L ? 1 : (this.f6207p == 0L ? 0 : -1));
            int i10 = 30;
            String str = "";
            int i11 = this.f6194a;
            if (i3 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f6207p;
                if (!z10) {
                    str = this.f6202k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i10 = 15;
                }
                getcraftstargifts.limit = i10;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f6197e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f6199g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f6199g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f6199g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f6199g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f6199g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f6199g, 512);
                getsavedstargifts2.peer_color_available = this.f6198f;
                long j10 = this.f6195b;
                if (j10 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = hp.s1(i11).j1(j10);
                }
                if (!z10) {
                    str = this.f6202k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i10 = Math.max(hp.s1(i11).K6, 15);
                }
                getsavedstargifts2.limit = i10;
                getsavedstargifts = getsavedstargifts2;
                if (this.f6196c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getsavedstargifts, new t8(this, r2, z10, 0));
            this.f6204m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i3) {
        if (!l6.L1(this.f6194a, this.f6195b)) {
            return -1;
        }
        int i10 = i3 + 1;
        while (true) {
            ArrayList arrayList = this.f6203l;
            if (i10 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i10)).can_upgrade) {
                    return i10;
                }
                i10++;
            } else {
                for (int i11 = i3 - 1; i11 >= 0; i11--) {
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
        return this.f6205n;
    }

    @Override
    public final void d() {
        hs.f(this.f6194a).k(hs.G3, Long.valueOf(this.f6195b), this);
    }

    @Override
    public final int e() {
        return this.f6203l.size();
    }

    public final void f() {
        if (this.f6204m != -1) {
            ConnectionsManager.getInstance(this.f6194a).cancelRequest(this.f6204m, true);
            this.f6204m = -1;
        }
        this.f6200i = false;
    }

    public final void g(int i3, boolean z10) {
        int i10;
        if ((i3 & 15) != 0) {
            i10 = 15;
        } else if ((i3 & 768) != 0) {
            i10 = 768;
        } else {
            i10 = 0;
        }
        int i11 = this.f6199g;
        int i12 = i3 | ((~i10) & i11);
        if (i11 != i12) {
            this.f6199g = i12;
            if (z10) {
                j(true);
            }
        }
    }

    @Override
    public final Object get(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f6203l;
            if (i3 < arrayList.size()) {
                return arrayList.get(i3);
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
        tL_inputSavedStarGiftChat.peer = hp.s1(this.f6194a).j1(this.f6195b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f6203l;
            if (i3 < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i3);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f6203l.indexOf(obj);
    }

    public final void j(boolean z10) {
        if (this.f6204m != -1) {
            ConnectionsManager.getInstance(this.f6194a).cancelRequest(this.f6204m, true);
            this.f6204m = -1;
        }
        this.f6200i = false;
        this.f6203l.clear();
        this.f6202k = null;
        this.f6201j = false;
        if (!z10 && !this.f6206o) {
            return;
        }
        a();
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i3 = this.f6194a;
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
                    ArrayList arrayList2 = this.f6203l;
                    if (i11 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i11)).gift;
                        if (starGift3 != null && starGift3.f27230id == starGift2.f27230id) {
                            arrayList2.remove(i11);
                            this.f6205n = Math.max(0, this.f6205n - 1);
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
                hs.f(i3).k(hs.G3, Long.valueOf(this.f6195b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i3).sendRequest(getsavedstargift, new d0(this, 3));
        }
    }

    public final boolean l(TL_stars.SavedStarGift savedStarGift) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f6203l;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (e9.k((TL_stars.SavedStarGift) arrayList.get(i3), savedStarGift)) {
                arrayList.remove(i3);
                this.f6205n = Math.max(0, this.f6205n - 1);
                hs.f(this.f6194a).k(hs.G3, Long.valueOf(this.f6195b), this);
                return true;
            }
            i3++;
        }
    }

    public final void m(int i3, int i10) {
        ArrayList arrayList = this.f6203l;
        int j10 = Utilities.j(i3, arrayList.size() - 1, 0);
        if (j10 >= 0 && j10 < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j10);
            int j11 = Utilities.j(i10, arrayList.size() - 1, 0);
            if (j11 >= 0 && j11 < arrayList.size()) {
                arrayList.add(j11, savedStarGift);
            }
        }
    }

    public final void n() {
        boolean z10 = this.f6196c;
        int i3 = 0;
        long j10 = this.f6195b;
        int i10 = this.f6194a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = hp.s1(i10).j1(j10);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f6203l;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = hp.s1(i10).j1(j10);
        ArrayList i11 = i();
        int size2 = i11.size();
        while (i3 < size2) {
            Object obj2 = i11.get(i3);
            i3++;
            togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new ei.u5(9), 64);
    }

    public final boolean o(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i3 = i();
            boolean contains = i3.contains(savedStarGift);
            int i10 = this.f6194a;
            if (contains) {
                if (!z10) {
                    i3.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f6203l;
                    arrayList.removeAll(i3);
                    if (this.f6197e && !this.f6196c) {
                        Collections.sort(arrayList, new a3.u(3));
                    }
                    arrayList.addAll(0, i3);
                    hs.f(i10).k(hs.G3, Long.valueOf(this.f6195b), this);
                    n();
                    return z12;
                }
            } else if (z10) {
                if (i3.size() + 1 > hp.s1(i10).K6) {
                    if (!z11) {
                        return true;
                    }
                    while (i3.size() > 0 && i3.size() + 1 > hp.s1(i10).K6) {
                        ((TL_stars.SavedStarGift) org.telegram.ui.Cells.f1.o(1, i3)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                i3.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f6203l;
                arrayList.removeAll(i3);
                if (this.f6197e) {
                    Collections.sort(arrayList, new a3.u(3));
                }
                arrayList.addAll(0, i3);
                hs.f(i10).k(hs.G3, Long.valueOf(this.f6195b), this);
                n();
                return z12;
            }
        }
        return false;
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, int i3, boolean z10) {
        ArrayList arrayList = this.f6203l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e9.k(savedStarGift2, savedStarGift)) {
                if (z10) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i3))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i3));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i3));
                }
            }
        }
    }

    public final void q(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f6203l;
        int size = arrayList.size();
        boolean z11 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e9.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            hs.f(this.f6194a).k(hs.G3, Long.valueOf(this.f6195b), this);
        }
    }
}
