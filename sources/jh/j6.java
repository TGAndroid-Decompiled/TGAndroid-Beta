package jh;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;

public class j6 {
    public static HashMap B;

    public final int f13536c;
    public final long d;

    public final int f13537e;

    public final int f13538f;

    public final AbstractSet f13542k;

    public final AbstractSet f13543l;

    public boolean f13549r;

    public boolean f13551t;

    public boolean f13552u;
    public boolean v;

    public boolean f13553w;

    public final hh.m5 f13554x;

    public i6 f13555y;

    public boolean f13556z;

    public int f13534a = 0;

    public final ArrayList f13535b = new ArrayList();

    public final ArrayList f13539g = new ArrayList();
    public final HashMap h = new HashMap();

    public final ArrayList f13540i = new ArrayList();

    public final HashMap f13541j = new HashMap();

    public final HashSet f13544m = new HashSet();

    public boolean f13545n = true;

    public boolean f13546o = true;

    public final ArrayList f13547p = new ArrayList();

    public final g6 f13548q = new g6(this, 0);

    public int f13550s = -1;
    public int A = -1;

    public j6(int i10, long j10, int i11, int i12, Utilities.Callback callback) {
        this.f13536c = i10;
        this.d = j10;
        this.f13537e = i11;
        this.f13538f = i12;
        this.f13554x = new hh.m5(29, this, callback);
        if (i11 != 0 || i12 <= 0) {
            this.f13542k = new TreeSet(Comparator$CC.reverseOrder());
            this.f13543l = new TreeSet(Comparator$CC.reverseOrder());
        } else {
            this.f13542k = new LinkedHashSet();
            this.f13543l = new LinkedHashSet();
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
        return (((long) calendar.get(2)) * 100) + (((long) calendar.get(1)) * 10000) + ((long) calendar.get(5));
    }

    public static boolean e(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject == null || !messageObject.isStory()) {
            return false;
        }
        if (z10 && messageObject.isPhoto()) {
            return true;
        }
        return (z11 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported);
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
        sb2.append(this.f13537e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(s6.h0(list));
        pa.v("}", sb2);
        if (list == null) {
            return;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < list.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
            if (storyItem != null) {
                Integer numValueOf = Integer.valueOf(storyItem.f22617id);
                AbstractSet abstractSet = this.f13543l;
                boolean zContains = abstractSet.contains(numValueOf);
                AbstractSet abstractSet2 = this.f13542k;
                if (zContains || abstractSet2.contains(Integer.valueOf(storyItem.f22617id))) {
                    abstractSet.remove(Integer.valueOf(storyItem.f22617id));
                    abstractSet2.remove(Integer.valueOf(storyItem.f22617id));
                    int i11 = this.f13550s;
                    if (i11 != -1) {
                        this.f13550s = i11 - 1;
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

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.f13542k, arrayList);
        v(this.f13543l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i10 = this.f13536c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f13538f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f13538f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.f13536c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.f13539g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.f22630id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new m5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.f13537e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(s6.h0(list));
        pa.v("}", sb2);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            int size = list.size();
            i10 = this.f13538f;
            if (i12 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
            if (storyItem2 != null) {
                Integer numValueOf = Integer.valueOf(storyItem2.f22617id);
                AbstractSet abstractSet = this.f13543l;
                boolean zContains = abstractSet.contains(numValueOf);
                AbstractSet abstractSet2 = this.f13542k;
                boolean z12 = zContains || abstractSet2.contains(Integer.valueOf(storyItem2.f22617id));
                boolean z13 = i11 == 1 || storyItem2.pinned;
                if (i10 > 0) {
                    ArrayList<Integer> arrayList2 = storyItem2.albums;
                    z13 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i10));
                }
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    z13 = false;
                }
                HashMap map = this.f13541j;
                if (z12 != z13) {
                    if (!z13) {
                        i0.a.v(storyItem2.f22617id, new StringBuilder("StoriesList remove story "));
                        u(storyItem2.f22617id, true);
                        int i13 = this.f13550s;
                        if (i13 != -1) {
                            this.f13550s = i13 - 1;
                        }
                    } else if (this.f13549r) {
                        FileLog.d("StoriesList put story " + storyItem2.f22617id);
                        t(y(storyItem2), false);
                        arrayList.add(Integer.valueOf(storyItem2.f22617id));
                        int i14 = this.f13550s;
                        if (i14 != -1) {
                            this.f13550s = i14 + 1;
                        }
                    } else if (!this.f13552u) {
                        FileLog.d("StoriesList cannot put story " + storyItem2.f22617id + " -> reload");
                        if (this.A != -1) {
                            ConnectionsManager.getInstance(this.f13536c).cancelRequest(this.A, true);
                            this.A = -1;
                        }
                        w();
                        int size2 = this.f13540i.size();
                        map.clear();
                        abstractSet.clear();
                        abstractSet2.clear();
                        j();
                        this.f13549r = false;
                        this.f13553w = false;
                        p(Utilities.clamp(size2, 50, 10), true);
                    }
                } else if (z12 && z13 && ((messageObject = (MessageObject) map.get(Integer.valueOf(storyItem2.f22617id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.f22617id != storyItem2.f22617id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                    i0.a.v(storyItem2.f22617id, new StringBuilder("StoriesList update story "));
                    map.put(Integer.valueOf(storyItem2.f22617id), y(storyItem2));
                }
                z11 = true;
            }
            i12++;
        }
        if (i10 > 0 && !arrayList.isEmpty()) {
            B(arrayList, false);
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final void E(int i10, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        int size = arrayList.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.f13541j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                Integer numValueOf = Integer.valueOf(i10);
                boolean zRemove = z10 ? hashSet.remove(numValueOf) : hashSet.add(numValueOf);
                storyItem.albums = !hashSet.isEmpty() ? new ArrayList<>(hashSet) : null;
                z11 |= zRemove;
            }
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l10;
        return B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.f13536c), Integer.valueOf(this.f13537e), Long.valueOf(this.d), Integer.valueOf(this.f13538f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000;
    }

    public final void c(ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.f13547p;
        arrayList2.clear();
        HashMap map = this.f13541j;
        ArrayList arrayList3 = this.f13539g;
        int i10 = this.f13538f;
        int i11 = this.f13537e;
        if (i11 == 0 && i10 <= 0) {
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                num.getClass();
                MessageObject messageObject = (MessageObject) map.get(num);
                if (e(messageObject, z10, z11)) {
                    arrayList2.add(messageObject);
                }
            }
        }
        int i13 = Integer.MAX_VALUE;
        for (Integer num2 : this.f13543l) {
            int iIntValue = num2.intValue();
            MessageObject messageObject2 = (MessageObject) map.get(num2);
            if (i11 != 0 || i10 > 0 || !arrayList3.contains(num2)) {
                if (e(messageObject2, z10, z11)) {
                    arrayList2.add(messageObject2);
                }
                if (iIntValue < i13) {
                    i13 = iIntValue;
                }
            }
        }
        if (!this.f13549r) {
            Iterator it = this.f13542k.iterator();
            while (it.hasNext() && (this.f13550s == -1 || arrayList2.size() < this.f13550s)) {
                Integer num3 = (Integer) it.next();
                int iIntValue2 = num3.intValue();
                if (i11 != 0 || i10 > 0 || !arrayList3.contains(num3)) {
                    if (i13 == Integer.MAX_VALUE || iIntValue2 < i13) {
                        MessageObject messageObject3 = (MessageObject) map.get(num3);
                        if (e(messageObject3, z10, z11)) {
                            arrayList2.add(messageObject3);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
    }

    public final void d(boolean z10) {
        c(this.f13540i, this.f13545n, this.f13546o);
        if (z10) {
            g6 g6Var = this.f13548q;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.f13541j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.f13546o;
        ArrayList arrayList = this.f13540i;
        if (z10 && this.f13545n) {
            return this.f13550s < 0 ? arrayList.size() : Math.max(arrayList.size(), this.f13550s);
        }
        return arrayList.size();
    }

    public ArrayList h() {
        HashMap map = this.h;
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a5.f(29));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.f13537e;
        if (i11 == 0 && this.f13538f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f13540i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.f22617id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.f13539g;
        if (i11 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TreeSet treeSet = (TreeSet) map.get((Long) obj2);
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
        return this.f13543l.size();
    }

    public void j() {
        if (this.f13551t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13536c);
        messagesStorage.getStorageQueue().postRunnable(new h6(this, messagesStorage, 1));
    }

    public boolean k() {
        return this.f13551t || this.f13552u;
    }

    public boolean l() {
        return this.f13543l.isEmpty() && a();
    }

    public final boolean m(int i10) {
        if (this.f13537e != 0 || this.f13538f > 0) {
            return false;
        }
        return this.f13539g.contains(Integer.valueOf(i10));
    }

    public final int n() {
        AbstractSet abstractSet = this.f13543l;
        if (abstractSet.isEmpty()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList(abstractSet);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            int iIntValue = num.intValue();
            if (!this.f13539g.contains(num)) {
                return iIntValue;
            }
        }
        return -1;
    }

    public final int o() {
        int i10 = this.f13534a;
        this.f13534a = i10 + 1;
        this.f13535b.add(Integer.valueOf(i10));
        hh.m5 m5Var = this.f13554x;
        if (m5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m5Var);
        }
        return i10;
    }

    public final void p(int i10, boolean z10) {
        q(i10, Collections.EMPTY_LIST, z10);
    }

    public boolean q(int i10, List list, boolean z10) {
        int iN;
        TLObject tLObject;
        int i11;
        if (this.f13552u || ((this.f13549r || this.f13553w || !a()) && !z10)) {
            return false;
        }
        if (this.f13551t) {
            this.f13555y = new i6(this, z10, i10, list);
            return false;
        }
        int i12 = this.f13537e;
        long j10 = this.d;
        int i13 = this.f13536c;
        if (i12 == 0 && (i11 = this.f13538f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            iN = this.f13543l.size();
            tL_stories_getAlbumStories.offset = iN;
            tL_stories_getAlbumStories.limit = i10;
            tLObject = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            iN = n();
            tL_stories_getPinnedStories.offset_id = iN;
            tL_stories_getPinnedStories.limit = i10;
            tLObject = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            tL_stories_getStoriesByID.f22624id.addAll(list);
            iN = -1;
            tLObject = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive.peer = MessagesController.getInstance(i13).getInputPeer(j10);
            iN = n();
            tL_stories_getStoriesArchive.offset_id = iN;
            tL_stories_getStoriesArchive.limit = i10;
            tLObject = tL_stories_getStoriesArchive;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j10);
        pa.v("} load", sb2);
        this.f13552u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tLObject, new hh.u1(this, iN, 3));
        return true;
    }

    public boolean r(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f13544m;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.f13536c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.f22628id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new m5(5));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (this.f13551t || this.f13552u || this.f13553w) {
            return;
        }
        this.f13551t = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13536c);
        messagesStorage.getStorageQueue().postRunnable(new h6(this, messagesStorage, 0));
    }

    public final void t(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        this.f13541j.put(Integer.valueOf(messageObject.getId()), messageObject);
        (z10 ? this.f13542k : this.f13543l).add(Integer.valueOf(messageObject.getId()));
        long jB = b(messageObject);
        Long lValueOf = Long.valueOf(jB);
        HashMap map = this.h;
        TreeSet treeSet = (TreeSet) map.get(lValueOf);
        if (treeSet == null) {
            Long lValueOf2 = Long.valueOf(jB);
            TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
            map.put(lValueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(messageObject.getId()));
    }

    public final void u(int i10, boolean z10) {
        MessageObject messageObject = (MessageObject) this.f13541j.remove(Integer.valueOf(i10));
        if (z10) {
            this.f13542k.remove(Integer.valueOf(i10));
        }
        this.f13543l.remove(Integer.valueOf(i10));
        this.f13539g.remove(Integer.valueOf(i10));
        if (messageObject != null) {
            long jB = b(messageObject);
            Long lValueOf = Long.valueOf(jB);
            HashMap map = this.h;
            Collection collection = (Collection) map.get(lValueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i10));
                if (collection.isEmpty()) {
                    map.remove(Long.valueOf(jB));
                }
            }
        }
    }

    public final void w() {
        HashMap map = B;
        if (map != null) {
            map.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.f13536c), Integer.valueOf(this.f13537e), Long.valueOf(this.d), Integer.valueOf(this.f13538f))));
        }
    }

    public void x() {
        if (this.f13556z) {
            return;
        }
        this.f13556z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f13539g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13536c);
        messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.b(this, arrayList, messagesStorage, arrayList2, 14));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.f22617id;
        MessageObject messageObject = new MessageObject(this.f13536c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        hh.m5 m5Var;
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f13535b;
        arrayList.remove(numValueOf);
        if (!arrayList.isEmpty() || (m5Var = this.f13554x) == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(m5Var);
        AndroidUtilities.runOnUIThread(m5Var, 300000L);
    }
}
