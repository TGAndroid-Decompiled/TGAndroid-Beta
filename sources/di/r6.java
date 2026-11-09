package di;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class r6 {
    public static HashMap B;
    public final int f9690c;
    public final long d;
    public final int f9691e;
    public final int f9692f;
    public final AbstractSet f9696k;
    public final AbstractSet f9697l;
    public boolean f9703r;
    public boolean f9705t;
    public boolean f9706u;
    public boolean v;
    public boolean f9707w;
    public final z0 f9708x;
    public q6 f9709y;
    public boolean f9710z;
    public int f9688a = 0;
    public final ArrayList f9689b = new ArrayList();
    public final ArrayList f9693g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f9694i = new ArrayList();
    public final HashMap f9695j = new HashMap();
    public final HashSet f9698m = new HashSet();
    public boolean f9699n = true;
    public boolean f9700o = true;
    public final ArrayList f9701p = new ArrayList();
    public final o6 f9702q = new o6(this, 0);
    public int f9704s = -1;
    public int A = -1;

    public r6(int i7, long j3, int i10, int i11, c20 c20Var) {
        this.f9690c = i7;
        this.d = j3;
        this.f9691e = i10;
        this.f9692f = i11;
        this.f9708x = new z0(10, this, c20Var);
        if (i10 == 0 && i11 > 0) {
            this.f9696k = new LinkedHashSet();
            this.f9697l = new LinkedHashSet();
        } else {
            this.f9696k = new TreeSet(Comparator$CC.reverseOrder());
            this.f9697l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(ij ijVar) {
        if (ijVar == null) {
            return 0L;
        }
        long j3 = ijVar.f23262k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(ij ijVar, boolean z9, boolean z10) {
        if (ijVar != null && ijVar.x4()) {
            if (!z9 || !ij.S3(ijVar.f23262k)) {
                if ((z10 && ij.L4(ijVar.f23262k)) || (ijVar.f23266l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        sb2.append(this.f9691e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(z6.k0(list));
        org.telegram.ui.Cells.f1.u("}", sb2);
        if (list != null) {
            boolean z9 = false;
            for (int i7 = 0; i7 < list.size(); i7++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i7);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f27195id);
                    AbstractSet abstractSet = this.f9697l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f9696k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f27195id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f27195id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f27195id));
                        int i10 = this.f9704s;
                        if (i10 != -1) {
                            this.f9704s = i10 - 1;
                        }
                        z9 = true;
                    }
                    u(storyItem.f27195id, true);
                }
            }
            if (z9) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z9) {
        v(this.f9696k, arrayList);
        v(this.f9697l, arrayList);
        d(false);
        if (z9) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i7 = this.f9690c;
            tL_updateAlbum.peer = qp.s1(i7).j1(this.d);
            tL_updateAlbum.album_id = this.f9692f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i7).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z9) {
        if (this.f9692f > 0) {
            B(arrayList, z9);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i7 = this.f9690c;
        int i10 = qp.s1(i7).N5;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f9693g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z9) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f27208id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = qp.s1(i7).j1(this.d);
            ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new v5(3));
        }
    }

    public final void D(List list, boolean z9) {
        int i7;
        boolean z10;
        boolean z11;
        ij ijVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f9691e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(z6.k0(list));
        org.telegram.ui.Cells.f1.u("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            boolean z12 = false;
            while (true) {
                int size = list.size();
                i7 = this.f9692f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f27195id);
                    AbstractSet abstractSet = this.f9697l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f9696k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f27195id))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i10 != 1 && !storyItem2.pinned) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i7 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i7))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z11 = false;
                    }
                    HashMap hashMap = this.f9695j;
                    if (z10 != z11) {
                        if (!z11) {
                            jg.g.s(storyItem2.f27195id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f27195id, true);
                            int i12 = this.f9704s;
                            if (i12 != -1) {
                                this.f9704s = i12 - 1;
                            }
                        } else if (this.f9703r) {
                            org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.f27195id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f27195id));
                            int i13 = this.f9704s;
                            if (i13 != -1) {
                                this.f9704s = i13 + 1;
                            }
                        } else if (!this.f9706u) {
                            org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.f27195id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f9690c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f9694i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f9703r = false;
                            this.f9707w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z10 && z11 && ((ijVar = (ij) hashMap.get(Integer.valueOf(storyItem2.f27195id))) == null || z9 || (storyItem = ijVar.f23266l) == null || (storyItem != storyItem2 && (storyItem.f27195id != storyItem2.f27195id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        jg.g.s(storyItem2.f27195id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f27195id), y(storyItem2));
                    }
                    z12 = true;
                }
                i11++;
            }
            if (i7 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z12) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i7, ArrayList arrayList, boolean z9) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            num.getClass();
            ij ijVar = (ij) this.f9695j.get(num);
            if (ijVar != null && (storyItem = ijVar.f23266l) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i7);
                if (z9) {
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
                z10 |= add;
            }
        }
        if (z10) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l10;
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f9690c), Integer.valueOf(this.f9691e), Long.valueOf(this.d), Integer.valueOf(this.f9692f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.r6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z9) {
        c(this.f9694i, this.f9699n, this.f9700o);
        if (z9) {
            o6 o6Var = this.f9702q;
            org.telegram.messenger.g0.r(o6Var);
            org.telegram.messenger.g0.h3(o6Var);
        }
    }

    public ij f(int i7) {
        return (ij) this.f9695j.get(Integer.valueOf(i7));
    }

    public int g() {
        boolean z9 = this.f9700o;
        ArrayList arrayList = this.f9694i;
        if (z9 && this.f9699n) {
            if (this.f9704s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f9704s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.c(25));
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        int i10 = this.f9691e;
        if (i10 == 0 && this.f9692f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f9694i;
            int size = arrayList4.size();
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList3.add(Integer.valueOf(((ij) obj).f23266l.f27195id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f9693g;
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
        return this.f9697l.size();
    }

    public void j() {
        if (this.f9705t) {
            this.v = true;
            return;
        }
        w();
        yr a02 = yr.a0(this.f9690c);
        a02.f26719a.c(new p6(this, a02, 1));
    }

    public boolean k() {
        if (!this.f9705t && !this.f9706u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f9697l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i7) {
        if (this.f9691e == 0 && this.f9692f <= 0) {
            return this.f9693g.contains(Integer.valueOf(i7));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f9697l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f9693g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i7 = this.f9688a;
        this.f9688a = i7 + 1;
        this.f9689b.add(Integer.valueOf(i7));
        z0 z0Var = this.f9708x;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
        }
        return i7;
    }

    public final void p(int i7, boolean z9) {
        q(i7, Collections.EMPTY_LIST, z9);
    }

    public boolean q(int i7, List list, boolean z9) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.f9706u || ((this.f9703r || this.f9707w || !a()) && !z9)) {
            return false;
        }
        if (this.f9705t) {
            this.f9709y = new q6(this, z9, i7, list);
            return false;
        }
        int i11 = this.f9691e;
        long j3 = this.d;
        int i12 = this.f9690c;
        if (i11 == 0 && (i10 = this.f9692f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = qp.s1(i12).j1(j3);
            n10 = this.f9697l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = qp.s1(i12).j1(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = qp.s1(i12).j1(j3);
            tL_stories_getStoriesByID.f27202id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = qp.s1(i12).j1(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j3);
        org.telegram.ui.Cells.f1.u("} load", sb2);
        this.f9706u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new bi.j2(this, n10, 4));
        return true;
    }

    public boolean r(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f9698m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i7));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f9690c;
        tL_stories_incrementStoryViews.peer = qp.s1(i10).j1(this.d);
        tL_stories_incrementStoryViews.f27206id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new v5(9));
        qs.f(i10).k(qs.F5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f9705t && !this.f9706u && !this.f9707w) {
            this.f9705t = true;
            yr a02 = yr.a0(this.f9690c);
            a02.f26719a.c(new p6(this, a02, 0));
        }
    }

    public final void t(ij ijVar, boolean z9) {
        AbstractSet abstractSet;
        if (ijVar == null) {
            return;
        }
        this.f9695j.put(Integer.valueOf(ijVar.e1()), ijVar);
        if (z9) {
            abstractSet = this.f9696k;
        } else {
            abstractSet = this.f9697l;
        }
        abstractSet.add(Integer.valueOf(ijVar.e1()));
        long b10 = b(ijVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(ijVar.e1()));
    }

    public final void u(int i7, boolean z9) {
        ij ijVar = (ij) this.f9695j.remove(Integer.valueOf(i7));
        if (z9) {
            this.f9696k.remove(Integer.valueOf(i7));
        }
        this.f9697l.remove(Integer.valueOf(i7));
        this.f9693g.remove(Integer.valueOf(i7));
        if (ijVar != null) {
            long b10 = b(ijVar);
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f9690c), Integer.valueOf(this.f9691e), Long.valueOf(this.d), Integer.valueOf(this.f9692f))));
        }
    }

    public void x() {
        if (this.f9710z) {
            return;
        }
        this.f9710z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f9693g);
        c(arrayList, true, true);
        yr a02 = yr.a0(this.f9690c);
        a02.f26719a.c(new ai.d0(this, arrayList, a02, arrayList2, 14));
    }

    public final ij y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f27195id;
        ij ijVar = new ij(this.f9690c, storyItem);
        ijVar.r0(false);
        return ijVar;
    }

    public final void z(int i7) {
        z0 z0Var;
        Integer valueOf = Integer.valueOf(i7);
        ArrayList arrayList = this.f9689b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (z0Var = this.f9708x) != null) {
            org.telegram.messenger.g0.r(z0Var);
            org.telegram.messenger.g0.i3(z0Var, 300000L);
        }
    }
}
