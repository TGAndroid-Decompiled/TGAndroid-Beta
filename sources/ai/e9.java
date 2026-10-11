package ai;

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
public class e9 {
    public static HashMap B;
    public final int f895c;
    public final long d;
    public final int f896e;
    public final int f897f;
    public final AbstractSet f901k;
    public final AbstractSet f902l;
    public boolean f908r;
    public boolean f910t;
    public boolean f911u;
    public boolean v;
    public boolean f912w;
    public final a1.f f913x;
    public c9 f914y;
    public boolean f915z;
    public int f893a = 0;
    public final ArrayList f894b = new ArrayList();
    public final ArrayList f898g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f899i = new ArrayList();
    public final HashMap f900j = new HashMap();
    public final HashSet f903m = new HashSet();
    public boolean f904n = true;
    public boolean f905o = true;
    public final ArrayList f906p = new ArrayList();
    public final z8 f907q = new z8(this, 0);
    public int f909s = -1;
    public int A = -1;

    public e9(int i10, long j3, int i11, int i12, Utilities.Callback callback) {
        this.f895c = i10;
        this.d = j3;
        this.f896e = i11;
        this.f897f = i12;
        this.f913x = new a1.f(18, this, callback);
        if (i11 == 0 && i12 > 0) {
            this.f901k = new LinkedHashSet();
            this.f902l = new LinkedHashSet();
        } else {
            this.f901k = new TreeSet(Comparator$CC.reverseOrder());
            this.f902l = new TreeSet(Comparator$CC.reverseOrder());
        }
        s();
    }

    public static long b(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        long j3 = messageObject.messageOwner.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        sb2.append(this.f896e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(m9.h0(list));
        hg.c.t("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f20269id);
                    AbstractSet abstractSet = this.f902l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f901k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f20269id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f20269id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f20269id));
                        int i11 = this.f909s;
                        if (i11 != -1) {
                            this.f909s = i11 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f20269id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f901k, arrayList);
        v(this.f902l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f895c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f897f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f897f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f895c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f898g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f20282id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new v7(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.f896e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(m9.h0(list));
        hg.c.t("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i10 = this.f897f;
                if (i12 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f20269id);
                    AbstractSet abstractSet = this.f902l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f901k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f20269id))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i11 != 1 && !storyItem2.pinned) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i10 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i10))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z12 = false;
                    }
                    HashMap hashMap = this.f900j;
                    if (z11 != z12) {
                        if (!z12) {
                            org.telegram.messenger.q.o(storyItem2.f20269id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f20269id, true);
                            int i13 = this.f909s;
                            if (i13 != -1) {
                                this.f909s = i13 - 1;
                            }
                        } else if (this.f908r) {
                            FileLog.d("StoriesList put story " + storyItem2.f20269id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f20269id));
                            int i14 = this.f909s;
                            if (i14 != -1) {
                                this.f909s = i14 + 1;
                            }
                        } else if (!this.f911u) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.f20269id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f895c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f899i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f908r = false;
                            this.f912w = false;
                            p(Utilities.clamp(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.f20269id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f20269id != storyItem2.f20269id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        org.telegram.messenger.q.o(storyItem2.f20269id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f20269id), y(storyItem2));
                    }
                    z13 = true;
                }
                i12++;
            }
            if (i10 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z13) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i10, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.f900j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i10);
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
        Long l4;
        if (B == null || (l4 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f895c), Integer.valueOf(this.f896e), Long.valueOf(this.d), Integer.valueOf(this.f897f))))) == null || System.currentTimeMillis() - l4.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.e9.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f899i, this.f904n, this.f905o);
        if (z10) {
            z8 z8Var = this.f907q;
            AndroidUtilities.cancelRunOnUIThread(z8Var);
            AndroidUtilities.runOnUIThread(z8Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.f900j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.f905o;
        ArrayList arrayList = this.f899i;
        if (z10 && this.f904n) {
            if (this.f909s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f909s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a4.d(7));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.f896e;
        if (i11 == 0 && this.f897f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f899i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f20269id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f898g;
        if (i11 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (i11 == 0 && !arrayList5.isEmpty()) {
                    int size3 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayList5.get(i13);
                        i13++;
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
        return this.f902l.size();
    }

    public void j() {
        if (this.f910t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f895c);
        messagesStorage.getStorageQueue().postRunnable(new b9(this, messagesStorage, 1));
    }

    public boolean k() {
        if (!this.f910t && !this.f911u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f902l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i10) {
        if (this.f896e == 0 && this.f897f <= 0) {
            return this.f898g.contains(Integer.valueOf(i10));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f902l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f898g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f893a;
        this.f893a = i10 + 1;
        this.f894b.add(Integer.valueOf(i10));
        a1.f fVar = this.f913x;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        return i10;
    }

    public final void p(int i10, boolean z10) {
        q(i10, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i10, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i11;
        if (this.f911u || ((this.f908r || this.f912w || !a()) && !z10)) {
            return false;
        }
        if (this.f910t) {
            this.f914y = new c9(this, z10, i10, list);
            return false;
        }
        int i12 = this.f896e;
        long j3 = this.d;
        int i13 = this.f895c;
        if (i12 == 0 && (i11 = this.f897f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = this.f902l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            tL_stories_getStoriesByID.f20276id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j3);
        hg.c.t("} load", sb2);
        this.f911u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new j8(this, n10, 1));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f903m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f895c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f20280id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new v7(8));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f910t && !this.f911u && !this.f912w) {
            this.f910t = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f895c);
            messagesStorage.getStorageQueue().postRunnable(new b9(this, messagesStorage, 0));
        }
    }

    public final void t(MessageObject messageObject, boolean z10) {
        AbstractSet abstractSet;
        if (messageObject == null) {
            return;
        }
        this.f900j.put(Integer.valueOf(messageObject.getId()), messageObject);
        if (z10) {
            abstractSet = this.f901k;
        } else {
            abstractSet = this.f902l;
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

    public final void u(int i10, boolean z10) {
        MessageObject messageObject = (MessageObject) this.f900j.remove(Integer.valueOf(i10));
        if (z10) {
            this.f901k.remove(Integer.valueOf(i10));
        }
        this.f902l.remove(Integer.valueOf(i10));
        this.f898g.remove(Integer.valueOf(i10));
        if (messageObject != null) {
            long b10 = b(messageObject);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i10));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f895c), Integer.valueOf(this.f896e), Long.valueOf(this.d), Integer.valueOf(this.f897f))));
        }
    }

    public void x() {
        if (this.f915z) {
            return;
        }
        this.f915z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f898g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f895c);
        messagesStorage.getStorageQueue().postRunnable(new i5(this, arrayList, messagesStorage, arrayList2, 3));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f20269id;
        MessageObject messageObject = new MessageObject(this.f895c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        a1.f fVar;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f894b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (fVar = this.f913x) != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
            AndroidUtilities.runOnUIThread(fVar, 300000L);
        }
    }
}
