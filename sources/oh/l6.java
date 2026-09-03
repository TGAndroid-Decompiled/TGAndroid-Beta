package oh;

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
import org.telegram.ui.yh;
public class l6 {
    public static HashMap B;
    public final int f17400c;
    public final long d;
    public final int f17401e;
    public final int f17402f;
    public final AbstractSet f17406k;
    public final AbstractSet f17407l;
    public boolean f17413r;
    public boolean f17415t;
    public boolean f17416u;
    public boolean v;
    public boolean f17417w;
    public final z1 f17418x;
    public k6 f17419y;
    public boolean f17420z;
    public int f17398a = 0;
    public final ArrayList f17399b = new ArrayList();
    public final ArrayList f17403g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList f17404i = new ArrayList();
    public final HashMap f17405j = new HashMap();
    public final HashSet f17408m = new HashSet();
    public boolean f17409n = true;
    public boolean f17410o = true;
    public final ArrayList f17411p = new ArrayList();
    public final i6 f17412q = new i6(this, 0);
    public int f17414s = -1;
    public int A = -1;

    public l6(int i10, long j10, int i11, int i12, Utilities.Callback callback) {
        this.f17400c = i10;
        this.d = j10;
        this.f17401e = i11;
        this.f17402f = i12;
        this.f17418x = new z1(8, this, callback);
        if (i11 == 0 && i12 > 0) {
            this.f17406k = new LinkedHashSet();
            this.f17407l = new LinkedHashSet();
        } else {
            this.f17406k = new TreeSet(Comparator$CC.reverseOrder());
            this.f17407l = new TreeSet(Comparator$CC.reverseOrder());
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

    public static boolean e(MessageObject messageObject, boolean z4, boolean z10) {
        if (messageObject != null && messageObject.isStory()) {
            if (!z4 || !messageObject.isPhoto()) {
                if ((z10 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported)) {
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
        StringBuilder sb = new StringBuilder("StoriesList ");
        sb.append(this.f17401e);
        sb.append("{");
        sb.append(this.d);
        sb.append("} updateDeletedStories {");
        sb.append(t6.h0(list));
        yh.v("}", sb);
        if (list != null) {
            boolean z4 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
                if (storyItem != null) {
                    Integer valueOf = Integer.valueOf(storyItem.f21082id);
                    AbstractSet abstractSet = this.f17407l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f17406k;
                    if (contains || abstractSet2.contains(Integer.valueOf(storyItem.f21082id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.f21082id));
                        abstractSet2.remove(Integer.valueOf(storyItem.f21082id));
                        int i11 = this.f17414s;
                        if (i11 != -1) {
                            this.f17414s = i11 - 1;
                        }
                        z4 = true;
                    }
                    u(storyItem.f21082id, true);
                }
            }
            if (z4) {
                d(true);
                x();
            }
        }
    }

    public final void B(ArrayList arrayList, boolean z4) {
        v(this.f17406k, arrayList);
        v(this.f17407l, arrayList);
        d(false);
        if (z4) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f17400c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f17402f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z4) {
        if (this.f17402f > 0) {
            B(arrayList, z4);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f17400c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f17403g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z4) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f21095id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new p5(3));
        }
    }

    public final void D(List list, boolean z4) {
        int i10;
        boolean z10;
        boolean z11;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb = new StringBuilder("StoriesList ");
        int i11 = this.f17401e;
        sb.append(i11);
        sb.append("{");
        sb.append(this.d);
        sb.append("} updateStories {");
        sb.append(t6.h0(list));
        yh.v("}", sb);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            boolean z12 = false;
            while (true) {
                int size = list.size();
                i10 = this.f17402f;
                if (i12 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
                if (storyItem2 != null) {
                    Integer valueOf = Integer.valueOf(storyItem2.f21082id);
                    AbstractSet abstractSet = this.f17407l;
                    boolean contains = abstractSet.contains(valueOf);
                    AbstractSet abstractSet2 = this.f17406k;
                    if (!contains && !abstractSet2.contains(Integer.valueOf(storyItem2.f21082id))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i11 != 1 && !storyItem2.pinned) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i10 > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i10))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z11 = false;
                    }
                    HashMap hashMap = this.f17405j;
                    if (z10 != z11) {
                        if (!z11) {
                            l.d.t(storyItem2.f21082id, new StringBuilder("StoriesList remove story "));
                            u(storyItem2.f21082id, true);
                            int i13 = this.f17414s;
                            if (i13 != -1) {
                                this.f17414s = i13 - 1;
                            }
                        } else if (this.f17413r) {
                            FileLog.d("StoriesList put story " + storyItem2.f21082id);
                            t(y(storyItem2), false);
                            arrayList.add(Integer.valueOf(storyItem2.f21082id));
                            int i14 = this.f17414s;
                            if (i14 != -1) {
                                this.f17414s = i14 + 1;
                            }
                        } else if (!this.f17416u) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.f21082id + " -> reload");
                            if (this.A != -1) {
                                ConnectionsManager.getInstance(this.f17400c).cancelRequest(this.A, true);
                                this.A = -1;
                            }
                            w();
                            int size2 = this.f17404i.size();
                            hashMap.clear();
                            abstractSet.clear();
                            abstractSet2.clear();
                            j();
                            this.f17413r = false;
                            this.f17417w = false;
                            p(Utilities.clamp(size2, 50, 10), true);
                        }
                    } else if (z10 && z11 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.f21082id))) == null || z4 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f21082id != storyItem2.f21082id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        l.d.t(storyItem2.f21082id, new StringBuilder("StoriesList update story "));
                        hashMap.put(Integer.valueOf(storyItem2.f21082id), y(storyItem2));
                    }
                    z12 = true;
                }
                i12++;
            }
            if (i10 > 0 && !arrayList.isEmpty()) {
                B(arrayList, false);
            }
            if (z12) {
                d(true);
                x();
            }
        }
    }

    public final void E(int i10, ArrayList arrayList, boolean z4) {
        TL_stories.StoryItem storyItem;
        HashSet hashSet;
        boolean add;
        ArrayList<Integer> arrayList2;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.f17405j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                if (storyItem.albums != null) {
                    hashSet = new HashSet(storyItem.albums);
                } else {
                    hashSet = new HashSet();
                }
                Integer valueOf = Integer.valueOf(i10);
                if (z4) {
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
        if (B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f17400c), Integer.valueOf(this.f17401e), Long.valueOf(this.d), Integer.valueOf(this.f17402f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000) {
            return true;
        }
        return false;
    }

    public final void c(java.util.ArrayList r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: oh.l6.c(java.util.ArrayList, boolean, boolean):void");
    }

    public final void d(boolean z4) {
        c(this.f17404i, this.f17409n, this.f17410o);
        if (z4) {
            i6 i6Var = this.f17412q;
            AndroidUtilities.cancelRunOnUIThread(i6Var);
            AndroidUtilities.runOnUIThread(i6Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.f17405j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z4 = this.f17410o;
        ArrayList arrayList = this.f17404i;
        if (z4 && this.f17409n) {
            if (this.f17414s < 0) {
                return arrayList.size();
            }
            return Math.max(arrayList.size(), this.f17414s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new k0(2));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.f17401e;
        if (i11 == 0 && this.f17402f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f17404i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f21082id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f17403g;
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
        return this.f17407l.size();
    }

    public void j() {
        if (this.f17415t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f17400c);
        messagesStorage.getStorageQueue().postRunnable(new j6(this, messagesStorage, 1));
    }

    public boolean k() {
        if (!this.f17415t && !this.f17416u) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if (this.f17407l.isEmpty() && a()) {
            return true;
        }
        return false;
    }

    public final boolean m(int i10) {
        if (this.f17401e == 0 && this.f17402f <= 0) {
            return this.f17403g.contains(Integer.valueOf(i10));
        }
        return false;
    }

    public final int n() {
        AbstractSet abstractSet = this.f17407l;
        if (!abstractSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.f17403g.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f17398a;
        this.f17398a = i10 + 1;
        this.f17399b.add(Integer.valueOf(i10));
        z1 z1Var = this.f17418x;
        if (z1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
        }
        return i10;
    }

    public final void p(int i10, boolean z4) {
        q(i10, Collections.EMPTY_LIST, z4);
    }

    public boolean q(int i10, List list, boolean z4) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i11;
        if (this.f17416u || ((this.f17413r || this.f17417w || !a()) && !z4)) {
            return false;
        }
        if (this.f17415t) {
            this.f17419y = new k6(this, z4, i10, list);
            return false;
        }
        int i12 = this.f17401e;
        long j10 = this.d;
        int i13 = this.f17400c;
        if (i12 == 0 && (i11 = this.f17402f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            n10 = this.f17407l.size();
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
            tL_stories_getStoriesByID.f21089id.addAll(list);
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
        StringBuilder sb = new StringBuilder("StoriesList ");
        sb.append(i12);
        sb.append("{");
        sb.append(j10);
        yh.v("} load", sb);
        this.f17416u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new mh.r1(this, n10, 3));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f17408m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f17400c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f21093id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new p5(4));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (!this.f17415t && !this.f17416u && !this.f17417w) {
            this.f17415t = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f17400c);
            messagesStorage.getStorageQueue().postRunnable(new j6(this, messagesStorage, 0));
        }
    }

    public final void t(MessageObject messageObject, boolean z4) {
        AbstractSet abstractSet;
        if (messageObject == null) {
            return;
        }
        this.f17405j.put(Integer.valueOf(messageObject.getId()), messageObject);
        if (z4) {
            abstractSet = this.f17406k;
        } else {
            abstractSet = this.f17407l;
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

    public final void u(int i10, boolean z4) {
        MessageObject messageObject = (MessageObject) this.f17405j.remove(Integer.valueOf(i10));
        if (z4) {
            this.f17406k.remove(Integer.valueOf(i10));
        }
        this.f17407l.remove(Integer.valueOf(i10));
        this.f17403g.remove(Integer.valueOf(i10));
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
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f17400c), Integer.valueOf(this.f17401e), Long.valueOf(this.d), Integer.valueOf(this.f17402f))));
        }
    }

    public void x() {
        if (this.f17420z) {
            return;
        }
        this.f17420z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f17403g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f17400c);
        messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.c(this, arrayList, messagesStorage, arrayList2, 16));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f21082id;
        MessageObject messageObject = new MessageObject(this.f17400c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        z1 z1Var;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f17399b;
        arrayList.remove(valueOf);
        if (arrayList.isEmpty() && (z1Var = this.f17418x) != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            AndroidUtilities.runOnUIThread(z1Var, 300000L);
        }
    }
}
