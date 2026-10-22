package ci;

import ai.pa;
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
public class a7 {
    public static HashMap B;
    public final int f5146c;
    public final long d;
    public final int e;
    public final int f5147f;
    public final AbstractSet f5151k;
    public final AbstractSet f5152l;
    public boolean f5158r;
    public boolean f5160t;
    public boolean f5161u;
    public boolean v;
    public boolean f5162w;
    public final pa f5163x;
    public z6 f5164y;
    public boolean f5165z;
    public int f5144a = 0;
    public final ArrayList f5145b = new ArrayList();
    public final ArrayList f5148g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f5149i = new ArrayList();
    public final HashMap f5150j = new HashMap();
    public final HashSet f5153m = new HashSet();
    public boolean f5154n = true;
    public boolean f5155o = true;
    public final ArrayList f5156p = new ArrayList();
    public final x6 f5157q = new x6(this, 0);
    public int f5159s = -1;
    public int A = -1;

    public a7(int i10, long j10, int i11, int i12, Utilities.Callback callback) {
        this.f5146c = i10;
        this.d = j10;
        this.e = i11;
        this.f5147f = i12;
        this.f5163x = new pa(22, this, callback);
        if (i11 == 0 && i12 > 0) {
            this.f5151k = new LinkedHashSet();
            this.f5152l = new LinkedHashSet();
        } else {
            this.f5151k = new TreeSet(Comparator$CC.reverseOrder());
            this.f5152l = new TreeSet(Comparator$CC.reverseOrder());
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
        sb2.append(this.e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(i7.h0(list));
        i2.e.v("}", sb2);
        if (list != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f20513id);
                    AbstractSet abstractSet = this.f5152l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f5151k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f20513id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f20513id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f20513id));
                        int i11 = this.f5159s;
                        if (i11 != -1) {
                            this.f5159s = i11 - 1;
                        }
                        z10 = true;
                    }
                    u(storyItem.f20513id, true);
                }
            }
            if (z10) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f5151k, arrayList);
        v(this.f5152l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f5146c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f5147f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f5147f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f5146c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f5148g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f20526id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new e6(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(i7.h0(list));
        i2.e.v("}", sb2);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            boolean z13 = false;
            while (true) {
                int size = list.size();
                i10 = this.f5147f;
                if (i12 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f20513id);
                    AbstractSet abstractSet = this.f5152l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f5151k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f20513id))) {
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
                    HashMap hashMap = this.f5150j;
                    if (z11 != z12) {
                        if (!z12) {
                            org.telegram.messenger.g0.o(storyItem2.f20513id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f20513id, true);
                            int i13 = this.f5159s;
                            if (i13 != -1) {
                                this.f5159s = i13 - 1;
                            }
                        } else if (this.f5158r) {
                            FileLog.d("StoriesList put story " + storyItem2.f20513id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f20513id));
                            int i14 = this.f5159s;
                            if (i14 != -1) {
                                this.f5159s = i14 + 1;
                            }
                        } else if (!this.f5161u) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.f20513id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f5146c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f5149i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f5158r = false;
                            this.f5162w = false;
                            p(Utilities.clamp(size2, 50, 10), true);
                        }
                    } else if (z11 && z12 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.f20513id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f20513id != storyItem2.f20513id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        org.telegram.messenger.g0.o(storyItem2.f20513id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f20513id), y(storyItem2));
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
            MessageObject messageObject = (MessageObject) this.f5150j.get(num);
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
        if (B == null || (l4 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f5146c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f5147f))))) == null || System.currentTimeMillis() - l4.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.a7.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z10) {
        c(this.f5149i, this.f5154n, this.f5155o);
        if (z10) {
            x6 x6Var = this.f5157q;
            AndroidUtilities.cancelRunOnUIThread(x6Var);
            AndroidUtilities.runOnUIThread(x6Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.f5150j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.f5155o;
        ArrayList arrayList = this.f5149i;
        if (z10 && this.f5154n) {
            if (this.f5159s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f5159s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a4.d(15));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.e;
        if (i11 == 0 && this.f5147f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f5149i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f20513id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f5148g;
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
        return this.f5152l.size();
    }

    public void j() {
        if (this.f5160t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f5146c);
        messagesStorage.getStorageQueue().postRunnable(new y6(this, messagesStorage, 1));
    }

    public boolean k() {
        if (!this.f5160t && !this.f5161u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f5152l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i10) {
        if (this.e == 0 && this.f5147f <= 0) {
            return this.f5148g.contains(Integer.valueOf(i10));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f5152l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f5148g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f5144a;
        this.f5144a = i10 + 1;
        this.f5145b.add(Integer.valueOf(i10));
        pa paVar = this.f5163x;
        if (paVar != null) {
            AndroidUtilities.cancelRunOnUIThread(paVar);
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
        if (this.f5161u || ((this.f5158r || this.f5162w || !a()) && !z10)) {
            return false;
        }
        if (this.f5160t) {
            this.f5164y = new z6(this, z10, i10, list);
            return false;
        }
        int i12 = this.e;
        long j10 = this.d;
        int i13 = this.f5146c;
        if (i12 == 0 && (i11 = this.f5147f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            n10 = this.f5152l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            tL_stories_getStoriesByID.f20520id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j10);
        i2.e.v("} load", sb2);
        this.f5161u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new ai.n2(this, n10, 3));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f5153m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f5146c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f20524id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new e6(8));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f5160t && !this.f5161u && !this.f5162w) {
            this.f5160t = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f5146c);
            messagesStorage.getStorageQueue().postRunnable(new y6(this, messagesStorage, 0));
        }
    }

    public final void t(MessageObject messageObject, boolean z10) {
        AbstractSet abstractSet;
        if (messageObject == null) {
            return;
        }
        this.f5150j.put(Integer.valueOf(messageObject.getId()), messageObject);
        if (z10) {
            abstractSet = this.f5151k;
        } else {
            abstractSet = this.f5152l;
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
        MessageObject messageObject = (MessageObject) this.f5150j.remove(Integer.valueOf(i10));
        if (z10) {
            this.f5151k.remove(Integer.valueOf(i10));
        }
        this.f5152l.remove(Integer.valueOf(i10));
        this.f5148g.remove(Integer.valueOf(i10));
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f5146c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f5147f))));
        }
    }

    public void x() {
        if (this.f5165z) {
            return;
        }
        this.f5165z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f5148g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f5146c);
        messagesStorage.getStorageQueue().postRunnable(new ai.y0(this, arrayList, messagesStorage, arrayList2, 10));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f20513id;
        MessageObject messageObject = new MessageObject(this.f5146c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        pa paVar;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f5145b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (paVar = this.f5163x) != null) {
            AndroidUtilities.cancelRunOnUIThread(paVar);
            AndroidUtilities.runOnUIThread(paVar, 300000L);
        }
    }
}
