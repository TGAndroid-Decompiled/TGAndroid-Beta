package ih;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class n6 {
    public static HashMap B;
    public final int f11847c;
    public final long d;
    public final int f11848e;
    public final int f11849f;
    public final AbstractSet f11853k;
    public final AbstractSet f11854l;
    public boolean f11860r;
    public boolean f11862t;
    public boolean f11863u;
    public boolean v;
    public boolean f11864w;
    public final h3.g0 f11865x;
    public m6 f11866y;
    public boolean f11867z;
    public int f11845a = 0;
    public final ArrayList f11846b = new ArrayList();
    public final ArrayList f11850g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f11851i = new ArrayList();
    public final HashMap f11852j = new HashMap();
    public final HashSet f11855m = new HashSet();
    public boolean f11856n = true;
    public boolean f11857o = true;
    public final ArrayList f11858p = new ArrayList();
    public final k6 f11859q = new k6(this, 0);
    public int f11861s = -1;
    public int A = -1;

    public n6(int i9, long j10, int i10, int i11, Utilities.Callback callback) {
        this.f11847c = i9;
        this.d = j10;
        this.f11848e = i10;
        this.f11849f = i11;
        this.f11865x = new h3.g0(20, this, callback);
        if (i10 == 0 && i11 > 0) {
            this.f11853k = new LinkedHashSet();
            this.f11854l = new LinkedHashSet();
        } else {
            this.f11853k = new TreeSet(Comparator$CC.reverseOrder());
            this.f11854l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        long j10 = messageObject.messageOwner.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isStory()) {
            if (!z10 || !messageObject.isPhoto()) {
                if ((z11 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
        sb2.append(this.f11848e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(v6.h0(list));
        j3.r0.x("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i9 = 0; i9 < list.size(); i9++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i9);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f22617id);
                    AbstractSet abstractSet = this.f11854l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f11853k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f22617id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f22617id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f22617id));
                        int i10 = this.f11861s;
                        if (i10 != -1) {
                            this.f11861s = i10 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f22617id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f11853k, arrayList);
        v(this.f11854l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i9 = this.f11847c;
            tL_updateAlbum.peer = MessagesController.getInstance(i9).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f11849f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i9).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f11849f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i9 = this.f11847c;
        int i10 = MessagesController.getInstance(i9).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f11850g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f22630id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i9).getInputPeer(this.d);
            ConnectionsManager.getInstance(i9).sendRequest(tL_togglePinnedToTop, new q5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i9;
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.f11848e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(v6.h0(list));
        j3.r0.x("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i9 = this.f11849f;
                if (i11 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f22617id);
                    AbstractSet abstractSet = this.f11854l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f11853k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f22617id))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i10 != 1 && !storyItem2.pinned) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i9 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i9))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z12 = false;
                    }
                    HashMap hashMap = this.f11852j;
                    if (z11 != z12) {
                        if (!z12) {
                            org.telegram.messenger.l0.n(storyItem2.f22617id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f22617id, true);
                            int i12 = this.f11861s;
                            if (i12 != -1) {
                                this.f11861s = i12 - 1;
                            }
                        } else if (this.f11860r) {
                            FileLog.d("StoriesList put story " + storyItem2.f22617id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f22617id));
                            int i13 = this.f11861s;
                            if (i13 != -1) {
                                this.f11861s = i13 + 1;
                            }
                        } else if (!this.f11863u) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.f22617id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f11847c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f11851i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f11860r = false;
                            this.f11864w = false;
                            p(Utilities.clamp(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.f22617id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f22617id != storyItem2.f22617id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        org.telegram.messenger.l0.n(storyItem2.f22617id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f22617id), y(storyItem2));
                    }
                    z13 = true;
                }
                i11++;
            }
            if (i9 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z13) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i9, ArrayList arrayList, boolean z10) {
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
            MessageObject messageObject = (MessageObject) this.f11852j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i9);
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
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f11847c), Integer.valueOf(this.f11848e), Long.valueOf(this.d), Integer.valueOf(this.f11849f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ih.n6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f11851i, this.f11856n, this.f11857o);
        if (z10) {
            k6 k6Var = this.f11859q;
            AndroidUtilities.cancelRunOnUIThread(k6Var);
            AndroidUtilities.runOnUIThread(k6Var);
        }
    }

    public MessageObject f(int i9) {
        return (MessageObject) this.f11852j.get(Integer.valueOf(i9));
    }

    public int g() {
        boolean z10 = this.f11857o;
        ArrayList arrayList = this.f11851i;
        if (z10 && this.f11856n) {
            if (this.f11861s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f11861s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a5.e(28));
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        int i10 = this.f11848e;
        if (i10 == 0 && this.f11849f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f11851i;
            int size = arrayList4.size();
            while (i9 < size) {
                Object obj = arrayList4.get(i9);
                i9++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f22617id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f11850g;
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
        return this.f11854l.size();
    }

    public void j() {
        if (this.f11862t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f11847c);
        messagesStorage.getStorageQueue().postRunnable(new l6(this, messagesStorage, 1));
    }

    public boolean k() {
        if (!this.f11862t && !this.f11863u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f11854l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i9) {
        if (this.f11848e == 0 && this.f11849f <= 0) {
            return this.f11850g.contains(Integer.valueOf(i9));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f11854l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f11850g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i9 = this.f11845a;
        this.f11845a = i9 + 1;
        this.f11846b.add(Integer.valueOf(i9));
        h3.g0 g0Var = this.f11865x;
        if (g0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
        }
        return i9;
    }

    public final void p(int i9, boolean z10) {
        q(i9, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i9, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.f11863u || ((this.f11860r || this.f11864w || !a()) && !z10)) {
            return false;
        }
        if (this.f11862t) {
            this.f11866y = new m6(this, z10, i9, list);
            return false;
        }
        int i11 = this.f11848e;
        long j10 = this.d;
        int i12 = this.f11847c;
        if (i11 == 0 && (i10 = this.f11849f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = this.f11854l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            tL_stories_getStoriesByID.f22624id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j10);
        j3.r0.x("} load", sb2);
        this.f11863u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new gh.u1(this, n10, 3));
        return true;
    }

    public boolean r(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet = this.f11855m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i9));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.f11847c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f22628id.add(Integer.valueOf(i9));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new q5(5));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f11862t && !this.f11863u && !this.f11864w) {
            this.f11862t = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f11847c);
            messagesStorage.getStorageQueue().postRunnable(new l6(this, messagesStorage, 0));
        }
    }

    public final void t(MessageObject messageObject, boolean z10) {
        AbstractSet abstractSet;
        if (messageObject == null) {
            return;
        }
        this.f11852j.put(Integer.valueOf(messageObject.getId()), messageObject);
        if (z10) {
            abstractSet = this.f11853k;
        } else {
            abstractSet = this.f11854l;
        }
        abstractSet.add(Integer.valueOf(messageObject.getId()));
        long b10 = b(messageObject);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(messageObject.getId()));
    }

    public final void u(int i9, boolean z10) {
        MessageObject messageObject = (MessageObject) this.f11852j.remove(Integer.valueOf(i9));
        if (z10) {
            this.f11853k.remove(Integer.valueOf(i9));
        }
        this.f11854l.remove(Integer.valueOf(i9));
        this.f11850g.remove(Integer.valueOf(i9));
        if (messageObject != null) {
            long b10 = b(messageObject);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i9));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f11847c), Integer.valueOf(this.f11848e), Long.valueOf(this.d), Integer.valueOf(this.f11849f))));
        }
    }

    public void x() {
        if (this.f11867z) {
            return;
        }
        this.f11867z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f11850g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f11847c);
        messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.c(this, arrayList, messagesStorage, arrayList2, 13));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f22617id;
        MessageObject messageObject = new MessageObject(this.f11847c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i9) {
        h3.g0 g0Var;
        Integer valueOf = Integer.valueOf(i9);
        ArrayList arrayList = this.f11846b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (g0Var = this.f11865x) != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
            AndroidUtilities.runOnUIThread(g0Var, 300000L);
        }
    }
}
