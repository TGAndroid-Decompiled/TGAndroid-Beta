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
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class h6 {
    public static HashMap B;
    public final int f12041c;
    public final long d;
    public final int f12042e;
    public final int f12043f;
    public final AbstractSet f12047k;
    public final AbstractSet f12048l;
    public boolean f12054r;
    public boolean f12056t;
    public boolean f12057u;
    public boolean v;
    public boolean f12058w;
    public final a6 f12059x;
    public g6 f12060y;
    public boolean f12061z;
    public int f12039a = 0;
    public final ArrayList f12040b = new ArrayList();
    public final ArrayList f12044g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f12045i = new ArrayList();
    public final HashMap f12046j = new HashMap();
    public final HashSet f12049m = new HashSet();
    public boolean f12050n = true;
    public boolean f12051o = true;
    public final ArrayList f12052p = new ArrayList();
    public final e6 f12053q = new e6(this, 0);
    public int f12055s = -1;
    public int A = -1;

    public h6(int i7, long j3, int i10, int i11, x10 x10Var) {
        this.f12041c = i7;
        this.d = j3;
        this.f12042e = i10;
        this.f12043f = i11;
        this.f12059x = new a6(3, this, x10Var);
        if (i10 == 0 && i11 > 0) {
            this.f12047k = new LinkedHashSet();
            this.f12048l = new LinkedHashSet();
        } else {
            this.f12047k = new TreeSet(Comparator$CC.reverseOrder());
            this.f12048l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(fj fjVar) {
        if (fjVar == null) {
            return 0L;
        }
        long j3 = fjVar.f23965k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(fj fjVar, boolean z10, boolean z11) {
        if (fjVar != null && fjVar.x4()) {
            if (!z10 || !fj.S3(fjVar.f23965k)) {
                if ((z11 && fj.L4(fjVar.f23965k)) || (fjVar.f23970l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        sb2.append(this.f12042e);
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
                    Integer valueOf = Integer.valueOf(storyItem.f28642id);
                    AbstractSet abstractSet = this.f12048l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f12047k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f28642id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f28642id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f28642id));
                        int i10 = this.f12055s;
                        if (i10 != -1) {
                            this.f12055s = i10 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f28642id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f12047k, arrayList);
        v(this.f12048l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i7 = this.f12041c;
            tL_updateAlbum.peer = mp.u1(i7).l1(this.d);
            tL_updateAlbum.album_id = this.f12043f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i7).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f12043f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i7 = this.f12041c;
        int i10 = mp.u1(i7).Q5;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f12044g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f28655id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = mp.u1(i7).l1(this.d);
            ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new k5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        fj fjVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f12042e;
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
                i7 = this.f12043f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f28642id);
                    AbstractSet abstractSet = this.f12048l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f12047k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f28642id))) {
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
                    HashMap hashMap = this.f12046j;
                    if (z11 != z12) {
                        if (!z12) {
                            i5.c.t(storyItem2.f28642id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f28642id, true);
                            int i12 = this.f12055s;
                            if (i12 != -1) {
                                this.f12055s = i12 - 1;
                            }
                        } else if (this.f12054r) {
                            org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.f28642id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f28642id));
                            int i13 = this.f12055s;
                            if (i13 != -1) {
                                this.f12055s = i13 + 1;
                            }
                        } else if (!this.f12057u) {
                            org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.f28642id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f12041c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f12045i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f12054r = false;
                            this.f12058w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((fjVar = (fj) hashMap.get(Integer.valueOf(storyItem2.f28642id))) == null || z10 || (storyItem = fjVar.f23970l) == null || (storyItem != storyItem2 && (storyItem.f28642id != storyItem2.f28642id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        i5.c.t(storyItem2.f28642id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f28642id), y(storyItem2));
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
            fj fjVar = (fj) this.f12046j.get(num);
            if (fjVar != null && (storyItem = fjVar.f23970l) != null) {
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
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f12041c), Integer.valueOf(this.f12042e), Long.valueOf(this.d), Integer.valueOf(this.f12043f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.h6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f12045i, this.f12050n, this.f12051o);
        if (z10) {
            e6 e6Var = this.f12053q;
            org.telegram.messenger.g0.r(e6Var);
            org.telegram.messenger.g0.g3(e6Var);
        }
    }

    public fj f(int i7) {
        return (fj) this.f12046j.get(Integer.valueOf(i7));
    }

    public int g() {
        boolean z10 = this.f12051o;
        ArrayList arrayList = this.f12045i;
        if (z10 && this.f12050n) {
            if (this.f12055s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f12055s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.c(25));
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        int i10 = this.f12042e;
        if (i10 == 0 && this.f12043f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f12045i;
            int size = arrayList4.size();
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList3.add(Integer.valueOf(((fj) obj).f23970l.f28642id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f12044g;
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
        return this.f12048l.size();
    }

    public void j() {
        if (this.f12056t) {
            this.v = true;
            return;
        }
        w();
        tr a02 = tr.a0(this.f12041c);
        a02.f27052a.c(new f6(this, a02, 1));
    }

    public boolean k() {
        if (!this.f12056t && !this.f12057u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f12048l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i7) {
        if (this.f12042e == 0 && this.f12043f <= 0) {
            return this.f12044g.contains(Integer.valueOf(i7));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f12048l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f12044g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i7 = this.f12039a;
        this.f12039a = i7 + 1;
        this.f12040b.add(Integer.valueOf(i7));
        a6 a6Var = this.f12059x;
        if (a6Var != null) {
            org.telegram.messenger.g0.r(a6Var);
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
        if (this.f12057u || ((this.f12054r || this.f12058w || !a()) && !z10)) {
            return false;
        }
        if (this.f12056t) {
            this.f12060y = new g6(this, z10, i7, list);
            return false;
        }
        int i11 = this.f12042e;
        long j3 = this.d;
        int i12 = this.f12041c;
        if (i11 == 0 && (i10 = this.f12043f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = mp.u1(i12).l1(j3);
            n10 = this.f12048l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = mp.u1(i12).l1(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = mp.u1(i12).l1(j3);
            tL_stories_getStoriesByID.f28649id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = mp.u1(i12).l1(j3);
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
        this.f12057u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new di.w1(this, n10, 4));
        return true;
    }

    public boolean r(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f12049m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i7));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f12041c;
        tL_stories_incrementStoryViews.peer = mp.u1(i10).l1(this.d);
        tL_stories_incrementStoryViews.f28653id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new k5(9));
        ks.f(i10).k(ks.I5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f12056t && !this.f12057u && !this.f12058w) {
            this.f12056t = true;
            tr a02 = tr.a0(this.f12041c);
            a02.f27052a.c(new f6(this, a02, 0));
        }
    }

    public final void t(fj fjVar, boolean z10) {
        AbstractSet abstractSet;
        if (fjVar == null) {
            return;
        }
        this.f12046j.put(Integer.valueOf(fjVar.e1()), fjVar);
        if (z10) {
            abstractSet = this.f12047k;
        } else {
            abstractSet = this.f12048l;
        }
        abstractSet.add(Integer.valueOf(fjVar.e1()));
        long b10 = b(fjVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(fjVar.e1()));
    }

    public final void u(int i7, boolean z10) {
        fj fjVar = (fj) this.f12046j.remove(Integer.valueOf(i7));
        if (z10) {
            this.f12047k.remove(Integer.valueOf(i7));
        }
        this.f12048l.remove(Integer.valueOf(i7));
        this.f12044g.remove(Integer.valueOf(i7));
        if (fjVar != null) {
            long b10 = b(fjVar);
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f12041c), Integer.valueOf(this.f12042e), Long.valueOf(this.d), Integer.valueOf(this.f12043f))));
        }
    }

    public void x() {
        if (this.f12061z) {
            return;
        }
        this.f12061z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f12044g);
        c(arrayList, true, true);
        tr a02 = tr.a0(this.f12041c);
        a02.f27052a.c(new ai.s(this, arrayList, a02, arrayList2, 18));
    }

    public final fj y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f28642id;
        fj fjVar = new fj(this.f12041c, storyItem);
        fjVar.r0(false);
        return fjVar;
    }

    public final void z(int i7) {
        a6 a6Var;
        Integer valueOf = Integer.valueOf(i7);
        ArrayList arrayList = this.f12040b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (a6Var = this.f12059x) != null) {
            org.telegram.messenger.g0.r(a6Var);
            org.telegram.messenger.g0.h3(a6Var, 300000L);
        }
    }
}
