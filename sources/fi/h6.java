package fi;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class h6 {
    public static HashMap B;
    public final int f12085c;
    public final long d;
    public final int f12086e;
    public final int f12087f;
    public final AbstractSet f12091k;
    public final AbstractSet f12092l;
    public boolean f12098r;
    public boolean f12100t;
    public boolean f12101u;
    public boolean v;
    public boolean f12102w;
    public final l4 f12103x;
    public g6 f12104y;
    public boolean f12105z;
    public int f12083a = 0;
    public final ArrayList f12084b = new ArrayList();
    public final ArrayList f12088g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f12089i = new ArrayList();
    public final HashMap f12090j = new HashMap();
    public final HashSet f12093m = new HashSet();
    public boolean f12094n = true;
    public boolean f12095o = true;
    public final ArrayList f12096p = new ArrayList();
    public final e6 f12097q = new e6(this, 0);
    public int f12099s = -1;
    public int A = -1;

    public h6(int i7, long j3, int i10, int i11, y10 y10Var) {
        this.f12085c = i7;
        this.d = j3;
        this.f12086e = i10;
        this.f12087f = i11;
        this.f12103x = new l4(5, this, y10Var);
        if (i10 == 0 && i11 > 0) {
            this.f12091k = new LinkedHashSet();
            this.f12092l = new LinkedHashSet();
        } else {
            this.f12091k = new TreeSet(Comparator$CC.reverseOrder());
            this.f12092l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(gj gjVar) {
        if (gjVar == null) {
            return 0L;
        }
        long j3 = gjVar.f24213k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(gj gjVar, boolean z10, boolean z11) {
        if (gjVar != null && gjVar.x4()) {
            if (!z10 || !gj.S3(gjVar.f24213k)) {
                if ((z11 && gj.L4(gjVar.f24213k)) || (gjVar.f24218l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void v(AbstractSet abstractSet, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Integer num = (Integer) obj;
            if (abstractSet.contains(num)) {
                linkedHashSet.add(num);
            }
        }
        Iterator it = abstractSet.iterator();
        while (it.hasNext()) {
            Integer num2 = (Integer) it.next();
            if (!linkedHashSet.contains(num2)) {
                linkedHashSet.add(num2);
            }
        }
        abstractSet.clear();
        abstractSet.addAll(linkedHashSet);
    }

    public final void A(List list) {
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(this.f12086e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(p6.k0(list));
        p5.c.s("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < list.size(); i7++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i7);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f28673id);
                    AbstractSet abstractSet = this.f12092l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f12091k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f28673id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f28673id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f28673id));
                        int i10 = this.f12099s;
                        if (i10 != -1) {
                            this.f12099s = i10 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f28673id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f12091k, arrayList);
        v(this.f12092l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i7 = this.f12085c;
            tL_updateAlbum.peer = np.u1(i7).l1(this.d);
            tL_updateAlbum.album_id = this.f12087f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i7).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f12087f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i7 = this.f12085c;
        int i10 = np.u1(i7).Q5;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f12088g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f28686id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = np.u1(i7).l1(this.d);
            ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new l5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        gj gjVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f12086e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(p6.k0(list));
        p5.c.s("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i7 = this.f12087f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f28673id);
                    AbstractSet abstractSet = this.f12092l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f12091k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f28673id))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i10 != 1 && !storyItem2.pinned) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i7 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i7))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z12 = false;
                    }
                    HashMap hashMap = this.f12090j;
                    if (z11 != z12) {
                        if (!z12) {
                            i5.c.t(storyItem2.f28673id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f28673id, true);
                            int i12 = this.f12099s;
                            if (i12 != -1) {
                                this.f12099s = i12 - 1;
                            }
                        } else if (this.f12098r) {
                            org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.f28673id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f28673id));
                            int i13 = this.f12099s;
                            if (i13 != -1) {
                                this.f12099s = i13 + 1;
                            }
                        } else if (!this.f12101u) {
                            org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.f28673id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f12085c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f12089i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f12098r = false;
                            this.f12102w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((gjVar = (gj) hashMap.get(Integer.valueOf(storyItem2.f28673id))) == null || z10 || (storyItem = gjVar.f24218l) == null || (storyItem != storyItem2 && (storyItem.f28673id != storyItem2.f28673id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        i5.c.t(storyItem2.f28673id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f28673id), y(storyItem2));
                    }
                    z13 = true;
                }
                i11++;
            }
            if (i7 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z13) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i7, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            num.getClass();
            gj gjVar = (gj) this.f12090j.get(num);
            if (gjVar != null && (storyItem = gjVar.f24218l) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i7);
                if (z10) {
                    add = hashSet.remove(valueOf);
                } else {
                    add = hashSet.add(valueOf);
                }
                if (!hashSet.isEmpty()) {
                    arrayList2 = new ArrayList<>(hashSet);
                } else {
                    arrayList2 = null;
                }
                storyItem.albums = arrayList2;
                z11 |= add;
            }
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l10;
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f12085c), Integer.valueOf(this.f12086e), Long.valueOf(this.d), Integer.valueOf(this.f12087f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.h6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f12089i, this.f12094n, this.f12095o);
        if (z10) {
            e6 e6Var = this.f12097q;
            org.telegram.messenger.g0.r(e6Var);
            org.telegram.messenger.g0.g3(e6Var);
        }
    }

    public gj f(int i7) {
        return (gj) this.f12090j.get(Integer.valueOf(i7));
    }

    public int g() {
        boolean z10 = this.f12095o;
        ArrayList arrayList = this.f12089i;
        if (z10 && this.f12094n) {
            if (this.f12099s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f12099s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.c(25));
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        int i10 = this.f12086e;
        if (i10 == 0 && this.f12087f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f12089i;
            int size = arrayList4.size();
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList3.add(Integer.valueOf(((gj) obj).f24218l.f28673id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f12088g;
        if (i10 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (i10 == 0 && !arrayList5.isEmpty()) {
                    int size3 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList5.get(i12);
                        i12++;
                        Integer num = (Integer) obj3;
                        num.intValue();
                        arrayList6.remove(num);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    arrayList2.add(arrayList6);
                }
            }
        }
        return arrayList2;
    }

    public int i() {
        return this.f12092l.size();
    }

    public void j() {
        if (this.f12100t) {
            this.v = true;
            return;
        }
        w();
        ur a02 = ur.a0(this.f12085c);
        a02.f27250a.c(new f6(this, a02, 1));
    }

    public boolean k() {
        if (!this.f12100t && !this.f12101u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f12092l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i7) {
        if (this.f12086e == 0 && this.f12087f <= 0) {
            return this.f12088g.contains(Integer.valueOf(i7));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f12092l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f12088g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i7 = this.f12083a;
        this.f12083a = i7 + 1;
        this.f12084b.add(Integer.valueOf(i7));
        l4 l4Var = this.f12103x;
        if (l4Var != null) {
            org.telegram.messenger.g0.r(l4Var);
        }
        return i7;
    }

    public final void p(int i7, boolean z10) {
        q(i7, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i7, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.f12101u || ((this.f12098r || this.f12102w || !a()) && !z10)) {
            return false;
        }
        if (this.f12100t) {
            this.f12104y = new g6(this, z10, i7, list);
            return false;
        }
        int i11 = this.f12086e;
        long j3 = this.d;
        int i12 = this.f12085c;
        if (i11 == 0 && (i10 = this.f12087f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = np.u1(i12).l1(j3);
            n10 = this.f12092l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = np.u1(i12).l1(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = np.u1(i12).l1(j3);
            tL_stories_getStoriesByID.f28680id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = np.u1(i12).l1(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j3);
        p5.c.s("} load", sb2);
        this.f12101u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new di.w1(this, n10, 4));
        return true;
    }

    public boolean r(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f12093m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i7));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f12085c;
        tL_stories_incrementStoryViews.peer = np.u1(i10).l1(this.d);
        tL_stories_incrementStoryViews.f28684id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new l5(9));
        ls.f(i10).k(ls.I5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f12100t && !this.f12101u && !this.f12102w) {
            this.f12100t = true;
            ur a02 = ur.a0(this.f12085c);
            a02.f27250a.c(new f6(this, a02, 0));
        }
    }

    public final void t(gj gjVar, boolean z10) {
        AbstractSet abstractSet;
        if (gjVar == null) {
            return;
        }
        this.f12090j.put(Integer.valueOf(gjVar.e1()), gjVar);
        if (z10) {
            abstractSet = this.f12091k;
        } else {
            abstractSet = this.f12092l;
        }
        abstractSet.add(Integer.valueOf(gjVar.e1()));
        long b10 = b(gjVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(gjVar.e1()));
    }

    public final void u(int i7, boolean z10) {
        gj gjVar = (gj) this.f12090j.remove(Integer.valueOf(i7));
        if (z10) {
            this.f12091k.remove(Integer.valueOf(i7));
        }
        this.f12092l.remove(Integer.valueOf(i7));
        this.f12088g.remove(Integer.valueOf(i7));
        if (gjVar != null) {
            long b10 = b(gjVar);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i7));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f12085c), Integer.valueOf(this.f12086e), Long.valueOf(this.d), Integer.valueOf(this.f12087f))));
        }
    }

    public void x() {
        if (this.f12105z) {
            return;
        }
        this.f12105z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f12088g);
        c(arrayList, true, true);
        ur a02 = ur.a0(this.f12085c);
        a02.f27250a.c(new ai.r(this, arrayList, a02, arrayList2, 18));
    }

    public final gj y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f28673id;
        gj gjVar = new gj(this.f12085c, storyItem);
        gjVar.r0(false);
        return gjVar;
    }

    public final void z(int i7) {
        l4 l4Var;
        Integer valueOf = Integer.valueOf(i7);
        ArrayList arrayList = this.f12084b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (l4Var = this.f12103x) != null) {
            org.telegram.messenger.g0.r(l4Var);
            org.telegram.messenger.g0.h3(l4Var, 300000L);
        }
    }
}
