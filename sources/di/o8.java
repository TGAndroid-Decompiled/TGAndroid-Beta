package di;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o8 implements p8 {
    public final int f9461a;
    public final long f9462b;
    public int d;
    public Boolean h;
    public boolean f9467i;
    public boolean f9468j;
    public String f9469k;
    public int f9472n;
    public boolean f9473o;
    public ArrayList f9475q;
    public boolean f9463c = false;
    public boolean f9464e = true;
    public boolean f9465f = false;
    public int f9466g = 783;
    public final ArrayList f9470l = new ArrayList();
    public int f9471m = -1;
    public long f9474p = 0;

    public o8(int i7, long j3, boolean z10) {
        this.f9461a = i7;
        this.f9462b = j3;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f9467i && !this.f9468j) {
            if (this.f9469k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9467i = true;
            int i7 = (this.f9474p > 0L ? 1 : (this.f9474p == 0L ? 0 : -1));
            int i10 = 30;
            String str = "";
            int i11 = this.f9461a;
            if (i7 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f9474p;
                if (!z10) {
                    str = this.f9469k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i10 = 15;
                }
                getcraftstargifts.limit = i10;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f9464e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f9466g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f9466g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f9466g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f9466g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f9466g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f9466g, 512);
                getsavedstargifts2.peer_color_available = this.f9465f;
                long j3 = this.f9462b;
                if (j3 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = mp.u1(i11).l1(j3);
                }
                if (!z10) {
                    str = this.f9469k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i10 = Math.max(mp.u1(i11).N6, 15);
                }
                getsavedstargifts2.limit = i10;
                getsavedstargifts = getsavedstargifts2;
                if (this.f9463c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getsavedstargifts, new n8(this, r2, z10, 0));
            this.f9471m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i7) {
        if (!f6.S1(this.f9461a, this.f9462b)) {
            return -1;
        }
        int i10 = i7 + 1;
        while (true) {
            ArrayList arrayList = this.f9470l;
            if (i10 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i10)).can_upgrade) {
                    return i10;
                }
                i10++;
            } else {
                for (int i11 = i7 - 1; i11 >= 0; i11--) {
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
        return this.f9472n;
    }

    @Override
    public final void d() {
        ks.f(this.f9461a).k(ks.I3, Long.valueOf(this.f9462b), this);
    }

    @Override
    public final int e() {
        return this.f9470l.size();
    }

    public final void f() {
        if (this.f9471m != -1) {
            ConnectionsManager.getInstance(this.f9461a).cancelRequest(this.f9471m, true);
            this.f9471m = -1;
        }
        this.f9467i = false;
    }

    public final void g(int i7, boolean z10) {
        int i10;
        if ((i7 & 15) != 0) {
            i10 = 15;
        } else if ((i7 & 768) != 0) {
            i10 = 768;
        } else {
            i10 = 0;
        }
        int i11 = this.f9466g;
        int i12 = i7 | ((~i10) & i11);
        if (i11 != i12) {
            this.f9466g = i12;
            if (z10) {
                k(true);
            }
        }
    }

    @Override
    public final Object get(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f9470l;
            if (i7 < arrayList.size()) {
                return arrayList.get(i7);
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
        tL_inputSavedStarGiftChat.peer = mp.u1(this.f9461a).l1(this.f9462b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9470l;
            if (i7 < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i7);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f9470l.indexOf(obj);
    }

    public final boolean j(String str) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f9470l;
            if (i7 >= arrayList.size()) {
                return false;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(i7);
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && TextUtils.equals(starGift.slug, str)) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final void k(boolean z10) {
        if (this.f9471m != -1) {
            ConnectionsManager.getInstance(this.f9461a).cancelRequest(this.f9471m, true);
            this.f9471m = -1;
        }
        this.f9467i = false;
        this.f9470l.clear();
        this.f9469k = null;
        this.f9468j = false;
        if (!z10 && !this.f9473o) {
            return;
        }
        a();
    }

    public final void l(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i7 = this.f9461a;
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
                    ArrayList arrayList2 = this.f9470l;
                    if (i11 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i11)).gift;
                        if (starGift3 != null && starGift3.f28634id == starGift2.f28634id) {
                            arrayList2.remove(i11);
                            this.f9472n = Math.max(0, this.f9472n - 1);
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
                ks.f(i7).k(ks.I3, Long.valueOf(this.f9462b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i7).sendRequest(getsavedstargift, new ai.e1(this, 4));
        }
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f9470l;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (x8.k((TL_stars.SavedStarGift) arrayList.get(i7), savedStarGift)) {
                arrayList.remove(i7);
                this.f9472n = Math.max(0, this.f9472n - 1);
                ks.f(this.f9461a).k(ks.I3, Long.valueOf(this.f9462b), this);
                return true;
            }
            i7++;
        }
    }

    public final void n(int i7, int i10) {
        ArrayList arrayList = this.f9470l;
        int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
        if (j3 >= 0 && j3 < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j3);
            int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
            if (j10 >= 0 && j10 < arrayList.size()) {
                arrayList.add(j10, savedStarGift);
            }
        }
    }

    public final void o(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList = this.f9470l;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && starGift != tL_starGiftUnique && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, tL_starGiftUnique.slug)) {
                savedStarGift.gift = tL_starGiftUnique;
                z10 = true;
            }
        }
        if (z10) {
            d();
        }
    }

    public final void p() {
        boolean z10 = this.f9463c;
        int i7 = 0;
        long j3 = this.f9462b;
        int i10 = this.f9461a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = mp.u1(i10).l1(j3);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f9470l;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = mp.u1(i10).l1(j3);
        ArrayList i11 = i();
        int size2 = i11.size();
        while (i7 < size2) {
            Object obj2 = i11.get(i7);
            i7++;
            togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new fi.k5(9), 64);
    }

    public final boolean q(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i7 = i();
            boolean contains = i7.contains(savedStarGift);
            int i10 = this.f9461a;
            if (contains) {
                if (!z10) {
                    i7.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f9470l;
                    arrayList.removeAll(i7);
                    if (this.f9464e && !this.f9463c) {
                        Collections.sort(arrayList, new a3.c(15));
                    }
                    arrayList.addAll(0, i7);
                    ks.f(i10).k(ks.I3, Long.valueOf(this.f9462b), this);
                    p();
                    return z12;
                }
            } else if (z10) {
                if (i7.size() + 1 > mp.u1(i10).N6) {
                    if (!z11) {
                        return true;
                    }
                    while (i7.size() > 0 && i7.size() + 1 > mp.u1(i10).N6) {
                        ((TL_stars.SavedStarGift) p5.c.g(1, i7)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                i7.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f9470l;
                arrayList.removeAll(i7);
                if (this.f9464e) {
                    Collections.sort(arrayList, new a3.c(15));
                }
                arrayList.addAll(0, i7);
                ks.f(i10).k(ks.I3, Long.valueOf(this.f9462b), this);
                p();
                return z12;
            }
        }
        return false;
    }

    public final void r(TL_stars.SavedStarGift savedStarGift, int i7, boolean z10) {
        ArrayList arrayList = this.f9470l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (x8.k(savedStarGift2, savedStarGift)) {
                if (z10) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i7))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i7));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i7));
                }
            }
        }
    }

    public final void s(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f9470l;
        int size = arrayList.size();
        boolean z11 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (x8.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            ks.f(this.f9461a).k(ks.I3, Long.valueOf(this.f9462b), this);
        }
    }
}
