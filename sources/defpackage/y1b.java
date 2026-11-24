package defpackage;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class y1b {
    public static HashMap B;
    public final int c;
    public final long d;
    public final byte e;
    public final int f;
    public final AbstractSet k;
    public final AbstractSet l;
    public boolean r;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final iya x;
    public x1b y;
    public boolean z;
    public int a = 0;
    public final ArrayList b = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final HashSet m = new HashSet();
    public boolean n = true;
    public boolean o = true;
    public final ArrayList p = new ArrayList();
    public final v1b q = new v1b(this, (byte) 0);
    public int s = -1;
    public int A = -1;

    public y1b(int i, long j, int i2, int i3, p8c p8cVar) {
        this.c = i;
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.x = new iya(this, p8cVar, (byte) 9);
        if (i2 == 0 && i3 > 0) {
            this.k = new LinkedHashSet();
            this.l = new LinkedHashSet();
        } else {
            this.k = new TreeSet(Comparator$CC.reverseOrder());
            this.l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(k27 k27Var) {
        if (k27Var == null) {
            return 0L;
        }
        long j = k27Var.k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(k27 k27Var, boolean z, boolean z2) {
        if (k27Var != null && k27Var.w4()) {
            if (!z || !k27.R3(k27Var.k)) {
                if ((z2 && k27.K4(k27Var.k)) || (k27Var.l.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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
        StringBuilder sb = new StringBuilder("StoriesList ");
        sb.append((int) this.e);
        sb.append("{");
        sb.append(this.d);
        sb.append("} updateDeletedStories {");
        sb.append(g2b.j0(list));
        de9.s("}", sb);
        if (list != null) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.id);
                    AbstractSet abstractSet = this.l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.id));
                        abstractSet2.remove(Integer.valueOf(storyItem.id));
                        int i2 = this.s;
                        if (i2 != -1) {
                            this.s = i2 - 1;
                        }
                        z = true;
                    }
                    u(storyItem.id, true);
                }
            }
            if (z) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z) {
        v(this.k, arrayList);
        v(this.l, arrayList);
        d(false);
        if (z) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i = this.c;
            tL_updateAlbum.peer = na7.q1(i).h1(this.d);
            tL_updateAlbum.album_id = this.f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z) {
        if (this.f > 0) {
            B(arrayList, z);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i = this.c;
        int f = na7.q1(i).k4.p2.f();
        if (arrayList2.size() > f) {
            arrayList2.subList(f, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i2 = 0; i2 < arrayList3.size() && arrayList3.get(i2) == arrayList2.get(i2); i2++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = na7.q1(i).h1(this.d);
            ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new ce2((byte) 11));
        }
    }

    public final void D(List list, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        k27 k27Var;
        TL_stories.StoryItem storyItem;
        StringBuilder sb = new StringBuilder("StoriesList ");
        byte b = this.e;
        sb.append((int) b);
        sb.append("{");
        sb.append(this.d);
        sb.append("} updateStories {");
        sb.append(g2b.j0(list));
        de9.s("}", sb);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            boolean z4 = false;
            while (true) {
                int size = list.size();
                i = this.f;
                if (i2 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i2);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.id);
                    AbstractSet abstractSet = this.l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.id))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (b != 1 && !storyItem2.pinned) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (i > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z3 = false;
                    }
                    HashMap hashMap = this.j;
                    if (z2 != z3) {
                        if (!z3) {
                            b00.p(storyItem2.id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.id, true);
                            int i3 = this.s;
                            if (i3 != -1) {
                                this.s = i3 - 1;
                            }
                        } else if (this.r) {
                            fa4.b("StoriesList put story " + storyItem2.id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.id));
                            int i4 = this.s;
                            if (i4 != -1) {
                                this.s = i4 + 1;
                            }
                        } else if (!this.u) {
                            fa4.b("StoriesList cannot put story " + storyItem2.id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.r = false;
                            this.w = false;
                            p(Utilities.j(size2, 50, 10), true);
                        }
                    } else if (z2 && z3 && ((k27Var = (k27) hashMap.get(Integer.valueOf(storyItem2.id))) == null || z || (storyItem = k27Var.l) == null || (storyItem != storyItem2 && (storyItem.id != storyItem2.id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        b00.p(storyItem2.id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.id), y(storyItem2));
                    }
                    z4 = true;
                }
                i2++;
            }
            if (i > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z4) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i, ArrayList arrayList, boolean z) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z2 = false;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            num.getClass();
            k27 k27Var = (k27) this.j.get(num);
            if (k27Var != null && (storyItem = k27Var.l) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i);
                if (z) {
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
                z2 |= add;
            }
        }
        if (z2) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l;
        if (B == null || (l = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f))))) == null || System.currentTimeMillis() - l.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1b.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z) {
        c(this.i, this.n, this.o);
        if (z) {
            v1b v1bVar = this.q;
            gl.r(v1bVar);
            gl.c3(v1bVar);
        }
    }

    public k27 f(int i) {
        return (k27) this.j.get(Integer.valueOf(i));
    }

    public int g() {
        boolean z = this.o;
        ArrayList arrayList = this.i;
        if (z && this.n) {
            if (this.s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new pva((byte) 1));
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        ArrayList arrayList3 = this.g;
        byte b = this.e;
        if (b == 0) {
            if (this.f > 0) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = this.i;
                int size = arrayList5.size();
                while (i < size) {
                    Object obj = arrayList5.get(i);
                    i++;
                    arrayList4.add(Integer.valueOf(((k27) obj).l.id));
                }
                arrayList2.add(arrayList4);
                return arrayList2;
            } else if (!arrayList3.isEmpty()) {
                arrayList2.add(new ArrayList(arrayList3));
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (b == 0 && !arrayList3.isEmpty()) {
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList3.get(i3);
                        i3++;
                        Integer num = (Integer) obj3;
                        num.getClass();
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
        return this.l.size();
    }

    public void j() {
        if (this.t) {
            this.v = true;
            return;
        }
        w();
        ad7 Y = ad7.Y(this.c);
        Y.a.c(new w1b(this, Y, (byte) 1));
    }

    public boolean k() {
        if (!this.t && !this.u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i) {
        if (this.e == 0 && this.f <= 0) {
            return this.g.contains(Integer.valueOf(i));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i = this.a;
        this.a = i + 1;
        this.b.add(Integer.valueOf(i));
        iya iyaVar = this.x;
        if (iyaVar != null) {
            gl.r(iyaVar);
        }
        return i;
    }

    public final void p(int i, boolean z) {
        q(i, Collections.EMPTY_LIST, z);
    }

    public boolean q(int i, List list, boolean z) {
        int n;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        if (this.u || ((this.r || this.w || !a()) && !z)) {
            return false;
        }
        if (this.t) {
            this.y = new x1b(this, z, i, list);
            return false;
        }
        byte b = this.e;
        long j = this.d;
        int i2 = this.c;
        if (b == 0) {
            int i3 = this.f;
            if (i3 > 0) {
                TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
                tL_stories_getAlbumStories.album_id = i3;
                tL_stories_getAlbumStories.peer = na7.q1(i2).h1(j);
                n = this.l.size();
                tL_stories_getAlbumStories.offset = n;
                tL_stories_getAlbumStories.limit = i;
                tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
            } else {
                TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
                tL_stories_getPinnedStories.peer = na7.q1(i2).h1(j);
                n = n();
                tL_stories_getPinnedStories.offset_id = n;
                tL_stories_getPinnedStories.limit = i;
                tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
            }
        } else if (b == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = na7.q1(i2).h1(j);
            tL_stories_getStoriesByID.id.addAll(list);
            n = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = na7.q1(i2).h1(j);
            n = n();
            tL_stories_getStoriesArchive2.offset_id = n;
            tL_stories_getStoriesArchive2.limit = i;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb = new StringBuilder("StoriesList ");
        sb.append((int) b);
        sb.append("{");
        sb.append(j);
        de9.s("} load", sb);
        this.u = true;
        this.A = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesArchive, new l12(this, n, (byte) 8));
        return true;
    }

    public boolean r(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashSet hashSet = this.m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i2 = this.c;
        tL_stories_incrementStoryViews.peer = na7.q1(i2).h1(this.d);
        tL_stories_incrementStoryViews.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_incrementStoryViews, new ce2((byte) 0));
        kk7.f(i2).k(kk7.H5, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.t && !this.u && !this.w) {
            this.t = true;
            ad7 Y = ad7.Y(this.c);
            Y.a.c(new w1b(this, Y, (byte) 0));
        }
    }

    public final void t(k27 k27Var, boolean z) {
        AbstractSet abstractSet;
        if (k27Var == null) {
            return;
        }
        this.j.put(Integer.valueOf(k27Var.e1()), k27Var);
        if (z) {
            abstractSet = this.k;
        } else {
            abstractSet = this.l;
        }
        abstractSet.add(Integer.valueOf(k27Var.e1()));
        long b = b(k27Var);
        Long valueOf = Long.valueOf(b);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(k27Var.e1()));
    }

    public final void u(int i, boolean z) {
        k27 k27Var = (k27) this.j.remove(Integer.valueOf(i));
        if (z) {
            this.k.remove(Integer.valueOf(i));
        }
        this.l.remove(Integer.valueOf(i));
        this.g.remove(Integer.valueOf(i));
        if (k27Var != null) {
            long b = b(k27Var);
            Long valueOf = Long.valueOf(b);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f))));
        }
    }

    public void x() {
        if (this.z) {
            return;
        }
        this.z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.g);
        c(arrayList, true, true);
        ad7 Y = ad7.Y(this.c);
        Y.a.c(new exa(this, arrayList, Y, arrayList2, (byte) 7));
    }

    public final k27 y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.id;
        k27 k27Var = new k27(this.c, storyItem);
        k27Var.r0(false);
        return k27Var;
    }

    public final void z(int i) {
        iya iyaVar;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (iyaVar = this.x) != null) {
            gl.r(iyaVar);
            gl.d3(iyaVar, 300000L);
        }
    }
}
