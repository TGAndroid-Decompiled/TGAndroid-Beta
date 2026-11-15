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
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class k6 {
    public static HashMap B;
    public final int f11940c;
    public final long d;
    public final int f11941e;
    public final int f11942f;
    public final AbstractSet f11946k;
    public final AbstractSet f11947l;
    public boolean f11953r;
    public boolean f11955t;
    public boolean f11956u;
    public boolean v;
    public boolean f11957w;
    public final f6 f11958x;
    public j6 f11959y;
    public boolean f11960z;
    public int f11938a = 0;
    public final ArrayList f11939b = new ArrayList();
    public final ArrayList f11943g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f11944i = new ArrayList();
    public final HashMap f11945j = new HashMap();
    public final HashSet f11948m = new HashSet();
    public boolean f11949n = true;
    public boolean f11950o = true;
    public final ArrayList f11951p = new ArrayList();
    public final h6 f11952q = new h6(this, 0);
    public int f11954s = -1;
    public int A = -1;

    public k6(int i7, long j3, int i10, int i11, z10 z10Var) {
        this.f11940c = i7;
        this.d = j3;
        this.f11941e = i10;
        this.f11942f = i11;
        this.f11958x = new f6(1, this, z10Var);
        if (i10 == 0 && i11 > 0) {
            this.f11946k = new LinkedHashSet();
            this.f11947l = new LinkedHashSet();
        } else {
            this.f11946k = new TreeSet(Comparator$CC.reverseOrder());
            this.f11947l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(gj gjVar) {
        if (gjVar == null) {
            return 0L;
        }
        long j3 = gjVar.f23817k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(gj gjVar, boolean z10, boolean z11) {
        if (gjVar != null && gjVar.x4()) {
            if (!z10 || !gj.S3(gjVar.f23817k)) {
                if ((z11 && gj.L4(gjVar.f23817k)) || (gjVar.f23822l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        sb2.append(this.f11941e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(s6.k0(list));
        org.telegram.ui.Cells.y0.t("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < list.size(); i7++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i7);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f28290id);
                    AbstractSet abstractSet = this.f11947l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f11946k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f28290id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f28290id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f28290id));
                        int i10 = this.f11954s;
                        if (i10 != -1) {
                            this.f11954s = i10 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f28290id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f11946k, arrayList);
        v(this.f11947l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i7 = this.f11940c;
            tL_updateAlbum.peer = np.s1(i7).j1(this.d);
            tL_updateAlbum.album_id = this.f11942f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i7).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f11942f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i7 = this.f11940c;
        int i10 = np.s1(i7).O5;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f11943g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f28303id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = np.s1(i7).j1(this.d);
            ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new m5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        gj gjVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f11941e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(s6.k0(list));
        org.telegram.ui.Cells.y0.t("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i7 = this.f11942f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f28290id);
                    AbstractSet abstractSet = this.f11947l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f11946k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f28290id))) {
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
                    HashMap hashMap = this.f11945j;
                    if (z11 != z12) {
                        if (!z12) {
                            i5.c.r(storyItem2.f28290id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f28290id, true);
                            int i12 = this.f11954s;
                            if (i12 != -1) {
                                this.f11954s = i12 - 1;
                            }
                        } else if (this.f11953r) {
                            org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.f28290id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f28290id));
                            int i13 = this.f11954s;
                            if (i13 != -1) {
                                this.f11954s = i13 + 1;
                            }
                        } else if (!this.f11956u) {
                            org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.f28290id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f11940c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f11944i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f11953r = false;
                            this.f11957w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((gjVar = (gj) hashMap.get(Integer.valueOf(storyItem2.f28290id))) == null || z10 || (storyItem = gjVar.f23822l) == null || (storyItem != storyItem2 && (storyItem.f28290id != storyItem2.f28290id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        i5.c.r(storyItem2.f28290id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f28290id), y(storyItem2));
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
            gj gjVar = (gj) this.f11945j.get(num);
            if (gjVar != null && (storyItem = gjVar.f23822l) != null) {
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
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f11940c), Integer.valueOf(this.f11941e), Long.valueOf(this.d), Integer.valueOf(this.f11942f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.k6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f11944i, this.f11949n, this.f11950o);
        if (z10) {
            h6 h6Var = this.f11952q;
            org.telegram.messenger.g0.r(h6Var);
            org.telegram.messenger.g0.h3(h6Var);
        }
    }

    public gj f(int i7) {
        return (gj) this.f11945j.get(Integer.valueOf(i7));
    }

    public int g() {
        boolean z10 = this.f11950o;
        ArrayList arrayList = this.f11944i;
        if (z10 && this.f11949n) {
            if (this.f11954s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f11954s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.c(25));
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        int i10 = this.f11941e;
        if (i10 == 0 && this.f11942f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f11944i;
            int size = arrayList4.size();
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList3.add(Integer.valueOf(((gj) obj).f23822l.f28290id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f11943g;
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
        return this.f11947l.size();
    }

    public void j() {
        if (this.f11955t) {
            this.v = true;
            return;
        }
        w();
        vr a02 = vr.a0(this.f11940c);
        a02.f27220a.c(new i6(this, a02, 1));
    }

    public boolean k() {
        if (!this.f11955t && !this.f11956u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f11947l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i7) {
        if (this.f11941e == 0 && this.f11942f <= 0) {
            return this.f11943g.contains(Integer.valueOf(i7));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f11947l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f11943g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i7 = this.f11938a;
        this.f11938a = i7 + 1;
        this.f11939b.add(Integer.valueOf(i7));
        f6 f6Var = this.f11958x;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
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
        if (this.f11956u || ((this.f11953r || this.f11957w || !a()) && !z10)) {
            return false;
        }
        if (this.f11955t) {
            this.f11959y = new j6(this, z10, i7, list);
            return false;
        }
        int i11 = this.f11941e;
        long j3 = this.d;
        int i12 = this.f11940c;
        if (i11 == 0 && (i10 = this.f11942f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = np.s1(i12).j1(j3);
            n10 = this.f11947l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = np.s1(i12).j1(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = np.s1(i12).j1(j3);
            tL_stories_getStoriesByID.f28297id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = np.s1(i12).j1(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j3);
        org.telegram.ui.Cells.y0.t("} load", sb2);
        this.f11956u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new di.u1(this, n10, 4));
        return true;
    }

    public boolean r(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f11948m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i7));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f11940c;
        tL_stories_incrementStoryViews.peer = np.s1(i10).j1(this.d);
        tL_stories_incrementStoryViews.f28301id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new m5(9));
        ns.f(i10).k(ns.F5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f11955t && !this.f11956u && !this.f11957w) {
            this.f11955t = true;
            vr a02 = vr.a0(this.f11940c);
            a02.f27220a.c(new i6(this, a02, 0));
        }
    }

    public final void t(gj gjVar, boolean z10) {
        AbstractSet abstractSet;
        if (gjVar == null) {
            return;
        }
        this.f11945j.put(Integer.valueOf(gjVar.e1()), gjVar);
        if (z10) {
            abstractSet = this.f11946k;
        } else {
            abstractSet = this.f11947l;
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
        gj gjVar = (gj) this.f11945j.remove(Integer.valueOf(i7));
        if (z10) {
            this.f11946k.remove(Integer.valueOf(i7));
        }
        this.f11947l.remove(Integer.valueOf(i7));
        this.f11943g.remove(Integer.valueOf(i7));
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f11940c), Integer.valueOf(this.f11941e), Long.valueOf(this.d), Integer.valueOf(this.f11942f))));
        }
    }

    public void x() {
        if (this.f11960z) {
            return;
        }
        this.f11960z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f11943g);
        c(arrayList, true, true);
        vr a02 = vr.a0(this.f11940c);
        a02.f27220a.c(new androidx.car.app.utils.a(this, arrayList, a02, arrayList2, 15));
    }

    public final gj y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f28290id;
        gj gjVar = new gj(this.f11940c, storyItem);
        gjVar.r0(false);
        return gjVar;
    }

    public final void z(int i7) {
        f6 f6Var;
        Integer valueOf = Integer.valueOf(i7);
        ArrayList arrayList = this.f11939b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (f6Var = this.f11958x) != null) {
            org.telegram.messenger.g0.r(f6Var);
            org.telegram.messenger.g0.i3(f6Var, 300000L);
        }
    }
}
