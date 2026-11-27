package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class c6b {
    public static final Comparator X = Comparator$CC.comparingInt(new nm((byte) 20));
    public TL_stories.TL_storiesStealthMode B;
    public final oe7 K;
    public int N;
    public boolean R;
    public xx S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int a;
    public final o6b k;
    public final SharedPreferences l;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final HashSet t;
    public int u;
    public int v;
    public final ar3 w;
    public String y;
    public final zh6 b = new zh6();
    public final zh6 c = new zh6();
    public int d = 0;
    public final zh6 e = new zh6();
    public LongSparseIntArray f = new LongSparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final zh6 i = new zh6();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final zh6 m = new zh6();
    public final zh6 x = new zh6();
    public boolean z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final zh6 E = new zh6();
    public final zh6 F = new zh6();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final jz0 J = new jz0(this, (byte) 8);
    public final HashSet L = new HashSet();
    public final zh6 M = new zh6();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public c6b(int i) {
        this.o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.a = i;
        ?? obj = new Object();
        obj.a = i;
        obj.b = kf7.a0(i);
        this.k = obj;
        SharedPreferences sharedPreferences = uc7.s1(i).Y3;
        this.l = sharedPreferences;
        this.o = sharedPreferences.getString("last_stories_state", "");
        this.y = sharedPreferences.getString("last_stories_state_hidden", "");
        this.v = sharedPreferences.getInt("total_stores_hidden", 0);
        this.u = sharedPreferences.getInt("total_stores", 0);
        this.s = sharedPreferences.getBoolean("read_loaded", false);
        this.t = new HashSet(sharedPreferences.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = sharedPreferences.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        this.B = tL_storiesStealthMode;
        o6b o6bVar = this.k;
        o6bVar.b.a.c(new n3b(o6bVar, new h5b(this, (byte) 1), (byte) 13));
        this.K = new oe7(this, i, (byte) 20);
        this.w = new ar3(i);
    }

    public static org.telegram.tgnet.TLRPC.Document B(int r10, org.telegram.tgnet.tl.TL_stories.StoryItem r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6b.B(int, org.telegram.tgnet.tl.TL_stories$StoryItem):org.telegram.tgnet.TLRPC$Document");
    }

    public static boolean F(int i, TLRPC.Document document) {
        String r = xb4.r(null, document);
        int lastIndexOf = r.lastIndexOf(46);
        if (!xb4.G(i).S(r)) {
            File z = xb4.z(4);
            if (lastIndexOf > 0) {
                r = r.substring(0, lastIndexOf);
            }
            if (!new File(z, r.concat(".temp")).exists()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean O(int i, TLRPC.Document document) {
        if (!new File(xb4.z(6), xb4.r(null, document)).exists()) {
            xb4.G(i);
            if (!xb4.J(document, null, true, true).exists()) {
                return false;
            }
        }
        return true;
    }

    public static TL_stories.StoryItem e(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem != null && storyItem2.min) {
            storyItem.pinned = storyItem2.pinned;
            storyItem.isPublic = storyItem2.isPublic;
            storyItem.close_friends = storyItem2.close_friends;
            int i = storyItem2.date;
            if (i != 0) {
                storyItem.date = i;
            }
            int i2 = storyItem2.expire_date;
            if (i2 != 0) {
                storyItem.expire_date = i2;
            }
            storyItem.caption = storyItem2.caption;
            storyItem.entities = storyItem2.entities;
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia != null) {
                storyItem.media = messageMedia;
            }
            return storyItem;
        }
        return storyItem2;
    }

    public static String j0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i)).id + "@" + ((TL_stories.StoryItem) list.get(i)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static String k0(ArrayList arrayList) {
        TL_stories.StoryItem storyItem;
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                if (((r47) arrayList.get(i)).l == null) {
                    str = str + "null";
                } else {
                    str = str + storyItem.id + "@" + storyItem.dialogId;
                }
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final r5b A(long j, boolean z) {
        zh6 zh6Var = this.F;
        r5b r5bVar = (r5b) zh6Var.f(j);
        if (r5bVar == null && z) {
            r5b r5bVar2 = new r5b(this.a, j, this);
            zh6Var.k(j, r5bVar2);
            return r5bVar2;
        }
        return r5bVar;
    }

    public final int C(boolean z) {
        if (z) {
            if (this.z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.p) {
            return Math.max(1, this.u);
        } else {
            return this.g.size();
        }
    }

    public final int D(int i, long j) {
        if (j == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j == yac.h(this.a).e() && !Utilities.x((Collection) this.b.f(j))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f.get(j, 0));
        boolean z = false;
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i == 0 || peerStories.stories.get(i2).id == i) && peerStories.stories.get(i2).id > max) {
                if (peerStories.stories.get(i2).close_friends) {
                    return 2;
                }
                z = true;
            }
        }
        if (P(j) || !z) {
            return 0;
        }
        return 1;
    }

    public final ArrayList E(long j) {
        return (ArrayList) this.b.f(j);
    }

    public final boolean G(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null) {
            return false;
        }
        for (int size = peerStories.stories.size() - 1; size >= 0; size--) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(size);
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        if (I()) {
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && wf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer) == yac.h(this.a).n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        long j = yac.h(this.a).n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.x((Collection) this.b.f(j))) {
            return true;
        }
        return false;
    }

    public final boolean J(long j) {
        if (j == 0) {
            return false;
        }
        if (L(j) || P(j)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean K(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null) {
            return false;
        }
        if (j == yac.h(this.a).e() && !Utilities.x((Collection) this.b.f(j))) {
            return true;
        }
        for (int i = 0; i < peerStories.stories.size(); i++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i);
            if (storyItem != null && storyItem.id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean L(long j) {
        ArrayList arrayList = (ArrayList) this.b.f(j);
        HashMap hashMap = (HashMap) this.e.f(j);
        if (arrayList == null || arrayList.isEmpty()) {
            if (hashMap != null && !hashMap.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean M(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j = storyView.user_id;
        zh6 zh6Var = this.M;
        if (zh6Var.d(j)) {
            return ((Boolean) zh6Var.f(storyView.user_id)).booleanValue();
        }
        if (this.Q == 0) {
            if (!storyView.blocked_my_stories_from && !storyView.blocked) {
                return false;
            }
            return true;
        }
        if (!this.L.contains(Long.valueOf(storyView.user_id)) && !storyView.blocked_my_stories_from && !storyView.blocked) {
            return false;
        }
        return true;
    }

    public final boolean N(TLRPC.User user) {
        if (user != null) {
            if (user.contact || user.id == uc7.s1(this.a).l4.k3.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean P(long j) {
        ArrayList arrayList = (ArrayList) this.b.f(j);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((b6b) c00.g(1, arrayList)).J;
        }
        return false;
    }

    public final void Q(long j) {
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j));
        cc4.b("StoriesController loadAllStoriesForDialog " + j);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i = this.a;
        tL_stories_getPeerStories.peer = uc7.s1(i).j1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_getPeerStories, new yu2(this, j, (byte) 6));
    }

    public final void R() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_getBlocked, new g5b(this, (byte) 1));
    }

    public final void S(boolean z) {
        String str;
        boolean z2;
        if (z) {
            if (this.r) {
                return;
            }
        } else if (this.q) {
            return;
        }
        if (!this.n) {
            boolean z3 = true;
            if (z) {
                this.r = true;
            } else {
                this.q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z) {
                str = this.y;
                z2 = this.z;
            } else {
                str = this.o;
                z2 = this.p;
            }
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (z2 && !TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.next = true;
            } else {
                z3 = false;
            }
            tL_stories_getAllStories.include_hidden = z;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getAllStories, new l5b(this, z, tL_stories_getAllStories, z3));
        }
    }

    public final void T() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new g5b(this, (byte) 0));
        }
    }

    public final void U(final TL_stories.PeerStories peerStories, final boolean z) {
        int i;
        if (peerStories != null) {
            final long n = wf3.n(peerStories.peer);
            if (z) {
                i = -1;
            } else {
                i = 1;
            }
            final long j = n * i;
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.D;
            if (!hashSet.contains(valueOf)) {
                ArrayList<Integer> arrayList = null;
                for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                    if (peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemSkipped) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i2).id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.id = arrayList;
                    int i3 = this.a;
                    tL_stories_getStoriesByID.peer = uc7.s1(i3).j1(n);
                    ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            hl.c3(new kb4(c6b.this, j, z, peerStories, n, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void V() {
        if (this.A) {
            this.n = true;
            h5b h5bVar = new h5b(this, (byte) 2);
            o6b o6bVar = this.k;
            o6bVar.b.a.c(new n3b(o6bVar, h5bVar, (byte) 15));
        } else {
            S(false);
            S(true);
        }
        this.A = false;
    }

    public final void W(int i, long j) {
        hl.c3(new lb2(this, j, i, (byte) 7));
    }

    public final boolean X(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z) {
        if (storyItem != null && peerStories != null) {
            long n = wf3.n(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i = this.f.get(n);
            int max = Math.max(peerStories.max_read_id, Math.max(i, storyItem.id));
            int i2 = this.a;
            ip7.l0.c(new yo7(ip7.n(i2), n, max, (byte) 1));
            peerStories.max_read_id = max;
            this.f.put(n, max);
            if (max > i) {
                if (!z) {
                    this.k.i(max, n);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = uc7.s1(i2).j1(n);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i2).sendRequest(tL_stories_readStories, null);
                jn7.f(i2).k(jn7.I5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Y(long j, TL_stories.StoryItem storyItem) {
        boolean z;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i = this.a;
            if (lq3.q(i).f()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && r47.J4(messageMedia.getDocument())) {
                    z = true;
                } else {
                    z = false;
                }
                storyItem.dialogId = j;
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                if (z) {
                    TLRPC.PhotoSize w = xb4.w(messageMedia2.getDocument().thumbs, 1000, false, null, false);
                    xb4.G(i).X(B(i, storyItem), storyItem, 0, 1);
                    xb4.G(i).V(jn5.c(w, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    if (messageMedia2 == null) {
                        photo = null;
                    } else {
                        photo = messageMedia2.photo;
                    }
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        xb4.G(i).V(jn5.i(xb4.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i2 = 0; i2 < Math.min(2, storyItem.media_areas.size()); i2++) {
                        if (storyItem.media_areas.get(i2) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            w49 d = w49.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i2)).reaction);
                            if (d.f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i).r.get(d.f);
                                if (tL_availableReaction != null) {
                                    xb4.G(i).X(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                wl wlVar = new wl(1, i, d.g);
                                wlVar.m = true;
                                wlVar.u();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Z(TL_stories.PeerStories peerStories) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= peerStories.stories.size()) {
                break;
            } else if (peerStories.stories.get(i2).id > peerStories.max_read_id) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (!peerStories.stories.isEmpty()) {
            long n = wf3.n(peerStories.peer);
            Y(n, peerStories.stories.get(i));
            if (i > 0) {
                Y(n, peerStories.stories.get(i - 1));
            }
            if (i < peerStories.stories.size() - 1) {
                Y(n, peerStories.stories.get(i + 1));
            }
        }
    }

    public final void a(int i, long j, ArrayList arrayList) {
        r5b A = A(j, true);
        A.getClass();
        c6b c6bVar = A.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = A.a;
        tL_updateAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i));
            } else if (!arrayList2.contains(Integer.valueOf(i))) {
                storyItem.albums.add(Integer.valueOf(i));
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        v5b z = c6bVar.z(0, i, A.b, false);
        if (z != null) {
            z.D(arrayList, true);
        }
        ArrayList arrayList4 = A.h;
        int size3 = arrayList4.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            v5b z2 = c6bVar.z(0, ((w5b) obj3).a, A.b, false);
            if (z2 != null) {
                z2.E(i, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void a0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z, boolean z2, boolean z3) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.h;
        ArrayList arrayList4 = this.g;
        if (!z3) {
            if (!z) {
                arrayList4.clear();
            } else {
                arrayList3.clear();
            }
        }
        if (f11.a) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tL_stories_allStories.peer_stories.size(); i++) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(wf3.n(tL_stories_allStories.peer_stories.get(i).peer));
            }
            cc4.b("StoriesController cache=" + z2 + " hidden=" + z + " processAllStoriesResponse {" + ((Object) sb) + "}");
        }
        int i2 = this.a;
        uc7.s1(i2).j4(tL_stories_allStories.users, z2);
        uc7.s1(i2).c4(tL_stories_allStories.chats, z2);
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        for (int i3 = 0; i3 < tL_stories_allStories.peer_stories.size(); i3++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i3);
            long n = wf3.n(peerStories.peer);
            int i4 = 0;
            while (true) {
                int size = peerStories.stories.size();
                arrayList = peerStories.stories;
                if (i4 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem = arrayList.get(i4);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    ip7.l0.c(new yo7(ip7.n(i2), n, storyItem.id, (byte) 0));
                    peerStories.stories.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (!arrayList.isEmpty()) {
                d0(n, peerStories);
                for (int i5 = 0; i5 < 2; i5++) {
                    if (i5 == 0) {
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = arrayList4;
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            break;
                        } else if (wf3.n(((TL_stories.PeerStories) arrayList2.get(i6)).peer) == n) {
                            arrayList2.remove(i6);
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                if (n > 0) {
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
                    if (X1 != null) {
                        if (X1.stories_hidden) {
                            d(peerStories);
                        } else {
                            arrayList4.add(peerStories);
                            Z(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                    if (M0 != null) {
                        if (M0.stories_hidden) {
                            d(peerStories);
                        } else {
                            arrayList4.add(peerStories);
                            Z(peerStories);
                        }
                    }
                }
            } else {
                this.i.l(n);
            }
        }
        if (!z2) {
            ArrayList<TL_stories.PeerStories> arrayList5 = tL_stories_allStories.peer_stories;
            kc kcVar = new kc((byte) 10);
            o6b o6bVar = this.k;
            o6bVar.b.a.c(new my6(o6bVar, arrayList5, z3, z, kcVar, (byte) 6));
        }
        oe7 oe7Var = this.K;
        hl.r(oe7Var);
        oe7Var.run();
    }

    public final void b(int i, long j, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        a(i, j, arrayList);
    }

    public final void b0(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long n = wf3.n(tL_updateStory.peer);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i == 0) {
            cc4.b("StoriesController can't update story dialogId == 0");
            return;
        }
        o6b o6bVar = this.k;
        if (i > 0) {
            user = uc7.s1(this.a).X1(Long.valueOf(n));
            if (user != null && (N(user) || user.self)) {
                o6bVar.b.a.c(new n3b(o6bVar, tL_updateStory, (byte) 11));
            }
        } else {
            o6bVar.b.a.c(new n3b(o6bVar, tL_updateStory, (byte) 11));
            user = null;
        }
        hl.c3(new z09(this, n, tL_updateStory, user, (byte) 10));
    }

    public final void c(long j, b6b b6bVar, zh6 zh6Var, boolean z) {
        ArrayList arrayList = (ArrayList) zh6Var.f(j);
        if (z && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = qd4.s(zh6Var, j);
        }
        arrayList.add(b6bVar);
    }

    public final void c0(long j, TL_stories.PeerStories peerStories) {
        d0(j, peerStories);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        o6b o6bVar = this.k;
        int i2 = this.a;
        if (i > 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
            if (N(X1) || X1.self) {
                o6bVar.b.a.c(new n6b(o6bVar, peerStories, (byte) 1));
            }
        } else if (xc2.j0(uc7.s1(i2).M0(Long.valueOf(-j)))) {
            o6bVar.b.a.c(new n6b(o6bVar, peerStories, (byte) 1));
        }
    }

    public final void d(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long n = wf3.n(peerStories.peer);
        int i = this.a;
        if (n == yac.h(i).e()) {
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (wf3.n(((TL_stories.PeerStories) arrayList.get(i2)).peer) == n) {
                z = true;
            }
            i2++;
        }
        if (!z) {
            arrayList.add(peerStories);
        }
        uc7.s1(i).B();
    }

    public final void d0(long j, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        zh6 zh6Var = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) zh6Var.f(j);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < peerStories.stories.size(); i++) {
                if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    int i2 = peerStories.stories.get(i).id;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i3).id == i2 && (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i, peerStories2.stories.get(i3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        zh6Var.k(j, peerStories);
    }

    public final void e0(int i, long j, ArrayList arrayList) {
        r5b A = A(j, true);
        A.getClass();
        c6b c6bVar = A.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = A.a;
        tL_updateAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        v5b z = c6bVar.z(0, i, A.b, false);
        if (z != null) {
            z.A(arrayList);
        }
        ArrayList arrayList3 = A.h;
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            v5b z2 = c6bVar.z(0, ((w5b) obj3).a, A.b, false);
            if (z2 != null) {
                z2.E(i, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void f(TL_stories.PeerStories peerStories) {
        TLRPC.Chat M0;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        ArrayList arrayList2;
        long n = wf3.n(peerStories.peer);
        int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        TLRPC.User user = null;
        int i2 = this.a;
        if (i > 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n));
            if (X1 == null) {
                cc4.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = X1;
                M0 = null;
            }
        } else {
            M0 = uc7.s1(i2).M0(Long.valueOf(-n));
            if (M0 == null) {
                cc4.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i3 = 0;
        while (true) {
            arrayList = this.g;
            z = true;
            if (i3 < arrayList.size()) {
                if (wf3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer) == n) {
                    arrayList.remove(i3);
                    z2 = true;
                    break;
                }
                i3++;
            } else {
                z2 = false;
                break;
            }
        }
        int i4 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i4 >= arrayList2.size()) {
                break;
            } else if (wf3.n(((TL_stories.PeerStories) arrayList2.get(i4)).peer) == n) {
                arrayList2.remove(i4);
                z2 = true;
                break;
            } else {
                i4++;
            }
        }
        if ((user == null || !user.stories_hidden) && (M0 == null || !M0.stories_hidden)) {
            z = false;
        }
        if (f11.a) {
            cc4.b("StoriesController move user stories to first hidden=" + z + " did=" + n);
        }
        if (z) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z2) {
            Q(n);
        }
        uc7.s1(i2).B();
    }

    public final void f0(int i, long j, pcc pccVar) {
        TL_stories.PeerStories x = x(j);
        if (x != null) {
            for (int i2 = 0; i2 < x.stories.size(); i2++) {
                if (x.stories.get(i2).id == i && !(x.stories.get(i2) instanceof TL_stories.TL_storyItemSkipped)) {
                    pccVar.a(x.stories.get(i2));
                    return;
                }
            }
        }
        long j2 = (i + j) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j2);
        if (storyItem != null) {
            pccVar.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        int i3 = this.a;
        tL_stories_getStoriesByID.peer = uc7.s1(i3).j1(j);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesByID, new n5b(this, j2, pccVar));
    }

    public final boolean g(long j) {
        TLRPC.Chat M0;
        if (j >= 0 || (M0 = uc7.s1(this.a).M0(Long.valueOf(-j))) == null) {
            return false;
        }
        if (!M0.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = M0.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.edit_stories) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void g0(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.j;
        if (z) {
            longSparseIntArray.put(j, 1);
        } else {
            longSparseIntArray.delete(j);
        }
    }

    public final boolean h(long j) {
        if (yac.h(this.a).e() != j && !g(j)) {
            return false;
        }
        return true;
    }

    public final void h0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i = this.a;
        jn7.f(i).k(jn7.G5, new Object[0]);
        SharedPreferences.Editor edit = uc7.s1(i).Y3.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean i(long j) {
        TLRPC.User X1;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i < 0) {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
            if (M0 == null || !xc2.R(M0)) {
                return false;
            }
            if (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i > 0 && (X1 = uc7.s1(i2).X1(Long.valueOf(j))) != null && X1.bot && X1.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void i0(long j, TL_stories.StoryItem storyItem, w49 w49Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i = this.a;
        tL_stories_sendReaction.peer = uc7.s1(i).j1(j);
        if (w49Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (w49Var.g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = w49Var.g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (w49Var.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = w49Var.f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j, storyItem, false);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendReaction, new xe2((byte) 0));
    }

    public final void j(long j, pcc pccVar, boolean z, vnb vnbVar) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i = this.a;
        tL_stories_canSendStory.peer = uc7.s1(i).j1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new rs0(this, z, j, pccVar, vnbVar, (byte) 4), 1024);
    }

    public final void k(ArrayList arrayList) {
        int i;
        ArrayList<TL_stories.StoryItem> arrayList2;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int size = arrayList.size();
            i = this.a;
            if (i2 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i2);
            long n = wf3.n(peerStories.peer);
            int i3 = 0;
            while (true) {
                int size2 = peerStories.stories.size();
                arrayList2 = peerStories.stories;
                if (i3 >= size2) {
                    break;
                }
                if (t6b.w(i, arrayList2.get(i3))) {
                    peerStories.stories.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList2.isEmpty() && !L(n)) {
                this.i.l(n);
                arrayList.remove(peerStories);
                z = true;
            }
            i2++;
        }
        if (z) {
            jn7.f(i).k(jn7.y5, new Object[0]);
        }
    }

    public final void l(TL_stories.PeerStories peerStories) {
        if (peerStories != null && peerStories.stories != null) {
            int i = 0;
            while (i < peerStories.stories.size()) {
                if (t6b.w(this.a, peerStories.stories.get(i))) {
                    peerStories.stories.remove(i);
                    i--;
                }
                i++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void l0(long j, boolean z, boolean z2) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (z) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                if (wf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer) == j) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i);
                    break;
                }
                i++;
            } else {
                peerStories = null;
                break;
            }
        }
        if (peerStories != null) {
            int i2 = 0;
            while (true) {
                if (i2 < arrayList2.size()) {
                    if (wf3.n(((TL_stories.PeerStories) arrayList2.get(i2)).peer) == j) {
                        break;
                    }
                    i2++;
                } else {
                    arrayList2.add(0, peerStories);
                    oe7 oe7Var = this.K;
                    hl.r(oe7Var);
                    oe7Var.run();
                    break;
                }
            }
        }
        int i3 = this.a;
        jn7.f(i3).k(jn7.y5, new Object[0]);
        uc7.s1(i3).B();
        if (z2) {
            if (j >= 0) {
                TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j));
                X1.stories_hidden = z;
                kf7.a0(i3).n1(Collections.singletonList(X1), null, false, true);
                uc7.s1(i3).i4(X1, false, false);
            } else {
                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j));
                M0.stories_hidden = z;
                kf7.a0(i3).n1(null, Collections.singletonList(M0), false, true);
                uc7.s1(i3).a4(M0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = uc7.s1(i3).j1(j);
            tL_stories_togglePeerStoriesHidden.hidden = z;
            ConnectionsManager.getInstance(i3).sendRequest(tL_stories_togglePeerStoriesHidden, new xe2((byte) 0));
        }
    }

    public final boolean m(org.telegram.tgnet.TLRPC.TL_error r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6b.m(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void m0(long j, boolean z, boolean z2) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i = this.a;
        TLRPC.InputPeer j1 = uc7.s1(i).j1(j);
        if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(j, Boolean.valueOf(z));
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z) {
            if (z) {
                hashSet.add(Long.valueOf(j));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j));
                this.N--;
            }
        }
        if (z2) {
            if (z) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.id = j1;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.id = j1;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_contacts_unblock, null);
        }
        jn7.f(i).k(jn7.c3, new Object[0]);
    }

    public final xx n() {
        int f;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i = this.a;
        if (yac.h(i).p()) {
            f = uc7.s1(i).l4.E1.f();
        } else {
            f = uc7.s1(i).l4.D1.f();
        }
        ArrayList arrayList2 = (ArrayList) this.c.f(yac.h(i).e());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories x = x(yac.h(i).e());
        if (x != null && (arrayList = x.stories) != null) {
            size += arrayList.size();
        }
        if (size >= f) {
            return new xx(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = uc7.s1(i).j1(yac.h(i).e());
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new g5b(this, (byte) 5), 1024);
        return null;
    }

    public final void n0(long j, List list) {
        ArrayList arrayList;
        StringBuilder o = ik8.o(j, "updateDeletedStoriesInLists ", " storyItems[");
        o.append(list.size());
        o.append("] {");
        o.append(j0(list));
        o.append("}");
        cc4.b(o.toString());
        v5b z = z(0, -1, j, false);
        v5b z2 = z(1, -1, j, false);
        if (z != null) {
            z.A(list);
        }
        if (z2 != null) {
            z2.A(list);
        }
        int i = 0;
        r5b A = A(j, false);
        if (A != null && (arrayList = A.h) != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v5b z3 = z(0, ((w5b) obj).a, j, false);
                if (z3 != null) {
                    z3.A(list);
                }
            }
        }
    }

    public final void o(int i, long j) {
        String str = "235:" + j + ":" + i;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i2 = this.a;
        tL_stories_getStoriesByID.peer = uc7.s1(i2).j1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new gg(this, i, str, j, (byte) 7));
    }

    public final void o0(long j, List list, boolean z) {
        TL_stories.PeerStories peerStories;
        boolean z2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i > 0) {
            TLRPC.UserFull Y1 = uc7.s1(i2).Y1(j);
            if (Y1 != null) {
                if (Y1.stories == null) {
                    if (z) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        Y1.stories = tL_peerStories;
                        tL_peerStories.peer = uc7.s1(i2).y1(j);
                        Y1.stories.max_read_id = w(j);
                    } else {
                        return;
                    }
                }
                peerStories = Y1.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull N0 = uc7.s1(i2).N0(-j);
            if (N0 != null) {
                if (N0.stories == null) {
                    if (z) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        N0.stories = tL_peerStories2;
                        tL_peerStories2.peer = uc7.s1(i2).y1(j);
                        N0.stories.max_read_id = w(j);
                    } else {
                        return;
                    }
                }
                peerStories = N0.stories;
            } else {
                return;
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i4).id == storyItem.id) {
                        boolean z3 = storyItem instanceof TL_stories.TL_storyItemDeleted;
                        ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                        z2 = true;
                        if (z3) {
                            arrayList.remove(i4);
                        } else {
                            TL_stories.StoryItem storyItem2 = arrayList.get(i4);
                            storyItem = e(storyItem2, storyItem);
                            peerStories.stories.set(i4, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            c00.q(storyItem.id, new StringBuilder("StoriesController update story for full peer storyId="));
                        }
                    } else {
                        i4++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    c00.q(storyItem.id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z) {
                    c00.q(storyItem.id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p() {
        this.s = false;
        this.y = "";
        this.o = "";
        this.l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        ar3 ar3Var = this.w;
        Objects.requireNonNull(ar3Var);
        hl.c3(new uoa(ar3Var, (byte) 21));
        V();
        if (this.s) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new g5b(this, (byte) 4));
    }

    public final void p0(long j, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.i.f(j)) != null) {
            cc4.b("StoriesController update stories from full peer " + j);
            for (int i = 0; i < peerStories2.stories.size(); i++) {
                if (peerStories2.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    int i2 = peerStories2.stories.get(i).id;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i3).id == i2 && (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                            peerStories2.stories.set(i, peerStories.stories.get(i3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
    }

    public final void q(long j, String str, pcc pccVar) {
        r5b A = A(j, true);
        int i = A.a;
        if (A.i) {
            return;
        }
        A.i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = uc7.s1(i).j1(A.b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_createAlbum, new isa(A, pccVar, (byte) 10));
    }

    public final void q0(long j, List list, boolean z) {
        ArrayList arrayList;
        StringBuilder o = ik8.o(j, "updateStoriesInLists ", " storyItems[");
        o.append(list.size());
        o.append("] {");
        o.append(j0(list));
        o.append("}");
        cc4.b(o.toString());
        v5b z2 = z(0, -1, j, false);
        v5b z3 = z(1, -1, j, false);
        if (z2 != null) {
            z2.D(list, z);
        }
        if (z3 != null) {
            z3.D(list, z);
        }
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((q5b) obj).D(list, z);
        }
        r5b A = A(j, false);
        if (A != null && (arrayList = A.h) != null) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                v5b z4 = z(0, ((w5b) obj2).a, j, false);
                if (z4 != null) {
                    z4.D(list, z);
                }
            }
        }
    }

    public final void r(ArrayList arrayList, long j) {
        TLRPC.ChatFull N0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull Y1;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i = this.a;
        tL_stories_deleteStories.peer = uc7.s1(i).j1(j);
        zh6 zh6Var = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) zh6Var.f(j);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i3).id == storyItem.id) {
                            peerStories2.stories.remove(i3);
                            if (peerStories2.stories.isEmpty()) {
                                zh6Var.l(j);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j < 0 ? !((N0 = uc7.s1(i).N0(-j)) == null || (peerStories = N0.stories) == null) : !((Y1 = uc7.s1(i).Y1(j)) == null || (peerStories = Y1.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i4);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i5).id == storyItem2.id) {
                        peerStories2.stories.remove(i5);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_deleteStories, new g5b(this, (byte) 2));
        n0(j, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        o6b o6bVar = this.k;
        o6bVar.b.a.c(new j5b(o6bVar, arrayList2, j, (byte) 3));
        jn7.f(i).k(jn7.y5, new Object[0]);
    }

    public final void r0(long j, ArrayList arrayList, boolean z, wv1 wv1Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories x = x(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (x != null) {
                    for (int i2 = 0; i2 < x.stories.size(); i2++) {
                        if (x.stories.get(i2).id == storyItem.id) {
                            x.stories.get(i2).pinned = z;
                            this.k.k(j, storyItem);
                        }
                    }
                }
            }
        }
        cc4.b("StoriesController updateStoriesPinned");
        q0(j, arrayList, false);
        o0(j, arrayList, false);
        togglepinned.pinned = z;
        int i3 = this.a;
        togglepinned.peer = uc7.s1(i3).j1(j);
        ConnectionsManager.getInstance(i3).sendRequest(togglepinned, new yp9(wv1Var, (byte) 8));
    }

    public final b6b s(long j, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (b6b) hashMap.get(Integer.valueOf(storyItem.id));
        }
        return null;
    }

    public final void s0(long j, TL_stories.StoryItem storyItem, boolean z) {
        String str;
        StringBuilder o = ik8.o(j, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        o.append(str);
        cc4.b(o.toString());
        q0(j, Collections.singletonList(storyItem), z);
        this.k.k(j, storyItem);
        o0(j, Collections.singletonList(storyItem), false);
    }

    public final TL_stories.StoryItem t(int i, long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories != null) {
            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                if (peerStories.stories.get(i2).id == i) {
                    return peerStories.stories.get(i2);
                }
            }
            return null;
        }
        return null;
    }

    public final void t0(long j, int i, TLRPC.Reaction reaction) {
        TL_stories.StoryItem t = t(i, j);
        if (t != null) {
            t.sent_reaction = reaction;
            int i2 = t.flags;
            if (reaction != null) {
                t.flags = i2 | 32768;
            } else {
                t.flags = i2 & (-32769);
            }
            s0(j, t, false);
        }
    }

    public final void u(ArrayList arrayList) {
        boolean z;
        TLRPC.User X1;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            long n = wf3.n(peerStories.peer);
            if (n > 0 && (X1 = uc7.s1(this.a).X1(Long.valueOf(n))) != null && !N(X1)) {
                arrayList.remove(i);
                i--;
                z = true;
            } else {
                z = false;
            }
            int i2 = 0;
            while (i2 < peerStories.stories.size()) {
                if (peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!z && peerStories.stories.isEmpty() && !L(n)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public final String v(int i, long j) {
        w5b b;
        r5b A = A(j, false);
        if (A != null && (b = A.b(i)) != null) {
            return b.b;
        }
        return null;
    }

    public final int w(long j) {
        TL_stories.PeerStories x = x(j);
        if (x == null) {
            x = y(j);
        }
        if (x != null) {
            return Math.max(x.max_read_id, this.f.get(j, 0));
        }
        return this.f.get(j, 0);
    }

    public final TL_stories.PeerStories x(long j) {
        return (TL_stories.PeerStories) this.i.f(j);
    }

    public final TL_stories.PeerStories y(long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i > 0) {
            TLRPC.UserFull Y1 = uc7.s1(i2).Y1(j);
            if (Y1 != null && (peerStories2 = Y1.stories) != null && !peerStories2.checkedExpired) {
                l(peerStories2);
            }
            if (Y1 == null) {
                return null;
            }
            return Y1.stories;
        }
        TLRPC.ChatFull N0 = uc7.s1(i2).N0(-j);
        if (N0 != null && (peerStories = N0.stories) != null && !peerStories.checkedExpired) {
            l(peerStories);
        }
        if (N0 == null) {
            return null;
        }
        return N0.stories;
    }

    public final v5b z(int i, int i2, long j, boolean z) {
        if (i == 0 && i2 > 0) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            v5b v5bVar = (v5b) hashMap3.get(Integer.valueOf(i2));
            if (v5bVar == null && z) {
                v5b v5bVar2 = new v5b(this.a, j, i, i2, new h5b(this, (byte) 0));
                hashMap3.put(Integer.valueOf(i2), v5bVar2);
                return v5bVar2;
            }
            return v5bVar;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i] == null) {
            hashMapArr[i] = new HashMap();
        }
        v5b v5bVar3 = (v5b) hashMapArr[i].get(Long.valueOf(j));
        if (v5bVar3 == null && z) {
            if (i == 4) {
                HashMap hashMap4 = hashMapArr[i];
                Long valueOf2 = Long.valueOf(j);
                p5b p5bVar = new p5b(this.a, j, null, new h5b(this, (byte) 0));
                hashMap4.put(valueOf2, p5bVar);
                return p5bVar;
            }
            HashMap hashMap5 = hashMapArr[i];
            Long valueOf3 = Long.valueOf(j);
            v5b v5bVar4 = new v5b(this.a, j, i, i2, new h5b(this, (byte) 0));
            hashMap5.put(valueOf3, v5bVar4);
            return v5bVar4;
        }
        return v5bVar3;
    }
}
