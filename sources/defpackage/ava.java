package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ava implements bva {
    public final int a;
    public final long b;
    public int d;
    public Boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public int n;
    public boolean o;
    public ArrayList q;
    public boolean c = false;
    public boolean e = true;
    public boolean f = false;
    public int g = 783;
    public final ArrayList l = new ArrayList();
    public int m = -1;
    public long p = 0;

    public ava(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        if (z) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.i && !this.j) {
            if (this.k == null) {
                z = true;
            } else {
                z = false;
            }
            this.i = true;
            int i = (this.p > 0L ? 1 : (this.p == 0L ? 0 : -1));
            int i2 = 30;
            String str = "";
            int i3 = this.a;
            if (i != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.p;
                if (!z) {
                    str = this.k;
                }
                getcraftstargifts.offset = str;
                if (z) {
                    i2 = 15;
                }
                getcraftstargifts.limit = i2;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.g, 512);
                getsavedstargifts2.peer_color_available = this.f;
                long j = this.b;
                if (j == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = oc7.r1(i3).i1(j);
                }
                if (!z) {
                    str = this.k;
                }
                getsavedstargifts2.offset = str;
                if (z) {
                    i2 = Math.max(oc7.r1(i3).l4.J1.f(), 15);
                }
                getsavedstargifts2.limit = i2;
                getsavedstargifts = getsavedstargifts2;
                if (this.c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i3).sendRequest(getsavedstargifts, new vj1(this, r2, z, (byte) 12));
            this.m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i) {
        if (!wsa.G1(this.a, this.b)) {
            return -1;
        }
        int i2 = i + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i2)).can_upgrade) {
                    return i2;
                }
                i2++;
            } else {
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i3)).can_upgrade) {
                        return i3;
                    }
                }
                return -1;
            }
        }
    }

    @Override
    public final int c() {
        return this.n;
    }

    @Override
    public final void d() {
        nm7.f(this.a).k(nm7.I3, Long.valueOf(this.b), this);
    }

    @Override
    public final int e() {
        return this.l.size();
    }

    public final void f() {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
    }

    public final void g(int i, boolean z) {
        int i2;
        if ((i & 15) != 0) {
            i2 = 15;
        } else if ((i & 768) != 0) {
            i2 = 768;
        } else {
            i2 = 0;
        }
        int i3 = this.g;
        int i4 = ((~i2) & i3) | i;
        if (i3 != i4) {
            this.g = i4;
            if (z) {
                k(true);
            }
        }
    }

    @Override
    public final Object get(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.l;
            if (i < arrayList.size()) {
                return arrayList.get(i);
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
        tL_inputSavedStarGiftChat.peer = oc7.r1(this.a).i1(this.b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final boolean j(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                return false;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(i);
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && TextUtils.equals(starGift.slug, str)) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void k(boolean z) {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
        this.l.clear();
        this.k = null;
        this.j = false;
        if (!z && !this.o) {
            return;
        }
        a();
    }

    public final void l(ArrayList arrayList, TL_stars.StarGift starGift) {
        boolean isEmpty = arrayList.isEmpty();
        int i = this.a;
        if (!isEmpty) {
            int size = arrayList.size();
            boolean z = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = this.l;
                    if (i3 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i3)).gift;
                        if (starGift3 != null && starGift3.id == starGift2.id) {
                            arrayList2.remove(i3);
                            this.n = Math.max(0, this.n - 1);
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                nm7.f(i).k(nm7.I3, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i).sendRequest(getsavedstargift, new go9(this, (byte) 4));
        }
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                return false;
            }
            if (jva.h((TL_stars.SavedStarGift) arrayList.get(i), savedStarGift)) {
                arrayList.remove(i);
                this.n = Math.max(0, this.n - 1);
                nm7.f(this.a).k(nm7.I3, Long.valueOf(this.b), this);
                return true;
            }
            i++;
        }
    }

    public final void n(int i, int i2) {
        ArrayList arrayList = this.l;
        int j = Utilities.j(i, arrayList.size() - 1, 0);
        if (j >= 0 && j < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j);
            int j2 = Utilities.j(i2, arrayList.size() - 1, 0);
            if (j2 >= 0 && j2 < arrayList.size()) {
                arrayList.add(j2, savedStarGift);
            }
        }
    }

    public final void o(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && starGift != tL_starGiftUnique && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, tL_starGiftUnique.slug)) {
                savedStarGift.gift = tL_starGiftUnique;
                z = true;
            }
        }
        if (z) {
            d();
        }
    }

    public final void p() {
        boolean z = this.c;
        int i = 0;
        long j = this.b;
        int i2 = this.a;
        if (z) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = oc7.r1(i2).i1(j);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i2).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = oc7.r1(i2).i1(j);
        ArrayList i3 = i();
        int size2 = i3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = i3.get(i4);
            i4++;
            togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i2).sendRequest(togglestargiftspinnedtotop, new nf2((byte) 0), 64);
    }

    public final boolean q(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
        boolean z3;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i = i();
            boolean contains = i.contains(savedStarGift);
            int i2 = this.a;
            if (contains) {
                if (!z) {
                    i.remove(savedStarGift);
                    z3 = false;
                    savedStarGift.pinned_to_top = z;
                    arrayList = this.l;
                    arrayList.removeAll(i);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new qx7((byte) 29));
                    }
                    arrayList.addAll(0, i);
                    nm7.f(i2).k(nm7.I3, Long.valueOf(this.b), this);
                    p();
                    return z3;
                }
            } else if (z) {
                if (i.size() + 1 > oc7.r1(i2).l4.J1.f()) {
                    if (!z2) {
                        return true;
                    }
                    while (i.size() > 0 && i.size() + 1 > oc7.r1(i2).l4.J1.f()) {
                        ((TL_stars.SavedStarGift) td4.m(1, i)).pinned_to_top = false;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                i.add(savedStarGift);
                savedStarGift.pinned_to_top = z;
                arrayList = this.l;
                arrayList.removeAll(i);
                if (this.e) {
                    Collections.sort(arrayList, new qx7((byte) 29));
                }
                arrayList.addAll(0, i);
                nm7.f(i2).k(nm7.I3, Long.valueOf(this.b), this);
                p();
                return z3;
            }
        }
        return false;
    }

    public final void r(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (jva.h(savedStarGift2, savedStarGift)) {
                ArrayList<Integer> arrayList2 = savedStarGift2.collection_id;
                if (z) {
                    if (!arrayList2.contains(Integer.valueOf(i))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i));
                    }
                } else {
                    arrayList2.remove(Integer.valueOf(i));
                }
            }
        }
    }

    public final void s(TL_stars.SavedStarGift savedStarGift, boolean z) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (jva.h(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z) {
                savedStarGift2.unsaved = z;
                z2 = true;
            }
        }
        if (z2) {
            nm7.f(this.a).k(nm7.I3, Long.valueOf(this.b), this);
        }
    }
}
