package ei;

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
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class r6 {
    public static HashMap B;
    public final int f10872c;
    public final long d;
    public final int f10873e;
    public final int f10874f;
    public final AbstractSet f10878k;
    public final AbstractSet f10879l;
    public boolean f10885r;
    public boolean f10887t;
    public boolean f10888u;
    public boolean v;
    public boolean f10889w;
    public final b0 f10890x;
    public q6 f10891y;
    public boolean f10892z;
    public int f10870a = 0;
    public final ArrayList f10871b = new ArrayList();
    public final ArrayList f10875g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f10876i = new ArrayList();
    public final HashMap f10877j = new HashMap();
    public final HashSet f10880m = new HashSet();
    public boolean f10881n = true;
    public boolean f10882o = true;
    public final ArrayList f10883p = new ArrayList();
    public final o6 f10884q = new o6(this, 0);
    public int f10886s = -1;
    public int A = -1;

    public r6(int i3, long j10, int i10, int i11, u10 u10Var) {
        this.f10872c = i3;
        this.d = j10;
        this.f10873e = i10;
        this.f10874f = i11;
        this.f10890x = new b0(13, this, u10Var);
        if (i10 == 0 && i11 > 0) {
            this.f10878k = new LinkedHashSet();
            this.f10879l = new LinkedHashSet();
        } else {
            this.f10878k = new TreeSet(Comparator$CC.reverseOrder());
            this.f10879l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(zi ziVar) {
        if (ziVar == null) {
            return 0L;
        }
        long j10 = ziVar.f26868k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(zi ziVar, boolean z10, boolean z11) {
        if (ziVar != null && ziVar.y4()) {
            if (!z10 || !zi.T3(ziVar.f26868k)) {
                if ((z11 && zi.M4(ziVar.f26868k)) || (ziVar.f26871l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
        sb2.append(this.f10873e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(z6.k0(list));
        k2.p1.w("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i3 = 0; i3 < list.size(); i3++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i3);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f27240id);
                    AbstractSet abstractSet = this.f10879l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f10878k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f27240id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f27240id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f27240id));
                        int i10 = this.f10886s;
                        if (i10 != -1) {
                            this.f10886s = i10 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f27240id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f10878k, arrayList);
        v(this.f10879l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i3 = this.f10872c;
            tL_updateAlbum.peer = hp.s1(i3).j1(this.d);
            tL_updateAlbum.album_id = this.f10874f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i3).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f10874f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i3 = this.f10872c;
        int i10 = hp.s1(i3).N5;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f10875g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f27253id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = hp.s1(i3).j1(this.d);
            ConnectionsManager.getInstance(i3).sendRequest(tL_togglePinnedToTop, new u5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i3;
        boolean z11;
        boolean z12;
        zi ziVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f10873e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(z6.k0(list));
        k2.p1.w("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i3 = this.f10874f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f27240id);
                    AbstractSet abstractSet = this.f10879l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f10878k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f27240id))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i10 != 1 && !storyItem2.pinned) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i3 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i3))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z12 = false;
                    }
                    HashMap hashMap = this.f10877j;
                    if (z11 != z12) {
                        if (!z12) {
                            k2.p1.q(storyItem2.f27240id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f27240id, true);
                            int i12 = this.f10886s;
                            if (i12 != -1) {
                                this.f10886s = i12 - 1;
                            }
                        } else if (this.f10885r) {
                            org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.f27240id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f27240id));
                            int i13 = this.f10886s;
                            if (i13 != -1) {
                                this.f10886s = i13 + 1;
                            }
                        } else if (!this.f10888u) {
                            org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.f27240id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f10872c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f10876i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f10885r = false;
                            this.f10889w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((ziVar = (zi) hashMap.get(Integer.valueOf(storyItem2.f27240id))) == null || z10 || (storyItem = ziVar.f26871l) == null || (storyItem != storyItem2 && (storyItem.f27240id != storyItem2.f27240id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        k2.p1.q(storyItem2.f27240id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f27240id), y(storyItem2));
                    }
                    z13 = true;
                }
                i11++;
            }
            if (i3 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z13) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i3, ArrayList arrayList, boolean z10) {
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
            zi ziVar = (zi) this.f10877j.get(num);
            if (ziVar != null && (storyItem = ziVar.f26871l) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i3);
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
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f10872c), Integer.valueOf(this.f10873e), Long.valueOf(this.d), Integer.valueOf(this.f10874f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ei.r6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f10876i, this.f10881n, this.f10882o);
        if (z10) {
            o6 o6Var = this.f10884q;
            org.telegram.messenger.g0.r(o6Var);
            org.telegram.messenger.g0.h3(o6Var);
        }
    }

    public zi f(int i3) {
        return (zi) this.f10877j.get(Integer.valueOf(i3));
    }

    public int g() {
        boolean z10 = this.f10882o;
        ArrayList arrayList = this.f10876i;
        if (z10 && this.f10881n) {
            if (this.f10886s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f10886s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.u(15));
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i10 = this.f10873e;
        if (i10 == 0 && this.f10874f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f10876i;
            int size = arrayList4.size();
            while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                arrayList3.add(Integer.valueOf(((zi) obj).f26871l.f27240id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f10875g;
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
        return this.f10879l.size();
    }

    public void j() {
        if (this.f10887t) {
            this.v = true;
            return;
        }
        w();
        qr a02 = qr.a0(this.f10872c);
        a02.f24934a.c(new p6(this, a02, 1));
    }

    public boolean k() {
        if (!this.f10887t && !this.f10888u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f10879l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i3) {
        if (this.f10873e == 0 && this.f10874f <= 0) {
            return this.f10875g.contains(Integer.valueOf(i3));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f10879l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f10875g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i3 = this.f10870a;
        this.f10870a = i3 + 1;
        this.f10871b.add(Integer.valueOf(i3));
        b0 b0Var = this.f10890x;
        if (b0Var != null) {
            org.telegram.messenger.g0.r(b0Var);
        }
        return i3;
    }

    public final void p(int i3, boolean z10) {
        q(i3, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i3, List list, boolean z10) {
        int n4;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.f10888u || ((this.f10885r || this.f10889w || !a()) && !z10)) {
            return false;
        }
        if (this.f10887t) {
            this.f10891y = new q6(this, z10, i3, list);
            return false;
        }
        int i11 = this.f10873e;
        long j10 = this.d;
        int i12 = this.f10872c;
        if (i11 == 0 && (i10 = this.f10874f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = hp.s1(i12).j1(j10);
            n4 = this.f10879l.size();
            tL_stories_getAlbumStories.offset = n4;
            tL_stories_getAlbumStories.limit = i3;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = hp.s1(i12).j1(j10);
            n4 = n();
            tL_stories_getPinnedStories.offset_id = n4;
            tL_stories_getPinnedStories.limit = i3;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = hp.s1(i12).j1(j10);
            tL_stories_getStoriesByID.f27247id.addAll(list);
            n4 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = hp.s1(i12).j1(j10);
            n4 = n();
            tL_stories_getStoriesArchive2.offset_id = n4;
            tL_stories_getStoriesArchive2.limit = i3;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j10);
        k2.p1.w("} load", sb2);
        this.f10888u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new ci.a2(this, n4, 3));
        return true;
    }

    public boolean r(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        HashSet hashSet = this.f10880m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i3));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f10872c;
        tL_stories_incrementStoryViews.peer = hp.s1(i10).j1(this.d);
        tL_stories_incrementStoryViews.f27251id.add(Integer.valueOf(i3));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new u5(9));
        hs.f(i10).k(hs.F5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f10887t && !this.f10888u && !this.f10889w) {
            this.f10887t = true;
            qr a02 = qr.a0(this.f10872c);
            a02.f24934a.c(new p6(this, a02, 0));
        }
    }

    public final void t(zi ziVar, boolean z10) {
        AbstractSet abstractSet;
        if (ziVar == null) {
            return;
        }
        this.f10877j.put(Integer.valueOf(ziVar.f1()), ziVar);
        if (z10) {
            abstractSet = this.f10878k;
        } else {
            abstractSet = this.f10879l;
        }
        abstractSet.add(Integer.valueOf(ziVar.f1()));
        long b10 = b(ziVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(ziVar.f1()));
    }

    public final void u(int i3, boolean z10) {
        zi ziVar = (zi) this.f10877j.remove(Integer.valueOf(i3));
        if (z10) {
            this.f10878k.remove(Integer.valueOf(i3));
        }
        this.f10879l.remove(Integer.valueOf(i3));
        this.f10875g.remove(Integer.valueOf(i3));
        if (ziVar != null) {
            long b10 = b(ziVar);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i3));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f10872c), Integer.valueOf(this.f10873e), Long.valueOf(this.d), Integer.valueOf(this.f10874f))));
        }
    }

    public void x() {
        if (this.f10892z) {
            return;
        }
        this.f10892z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f10875g);
        c(arrayList, true, true);
        qr a02 = qr.a0(this.f10872c);
        a02.f24934a.c(new ai.z3(this, arrayList, a02, arrayList2, 15));
    }

    public final zi y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f27240id;
        zi ziVar = new zi(this.f10872c, storyItem);
        ziVar.r0(false);
        return ziVar;
    }

    public final void z(int i3) {
        b0 b0Var;
        Integer valueOf = Integer.valueOf(i3);
        ArrayList arrayList = this.f10871b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (b0Var = this.f10890x) != null) {
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 300000L);
        }
    }
}
