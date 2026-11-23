package fi;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ps;
import org.telegram.messenger.si;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.messenger.ys;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class p6 {
    public static final Comparator X = Comparator$CC.comparingInt(new bg.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final ai.c1 K;
    public int N;
    public boolean R;
    public j6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f12425a;
    public final c7 f12433k;
    public final SharedPreferences f12434l;
    public boolean f12436n;
    public String f12437o;
    public boolean f12438p;
    public boolean f12439q;
    public boolean f12440r;
    public boolean f12441s;
    public final HashSet f12442t;
    public int f12443u;
    public int v;
    public final hi.b1 f12444w;
    public String f12446y;
    public final a0.h f12426b = new a0.h();
    public final a0.h f12427c = new a0.h();
    public int d = 0;
    public final a0.h f12428e = new a0.h();
    public LongSparseIntArray f12429f = new LongSparseIntArray();
    public final ArrayList f12430g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h f12431i = new a0.h();
    public final LongSparseIntArray f12432j = new LongSparseIntArray();
    public final a0.h f12435m = new a0.h();
    public final a0.h f12445x = new a0.h();
    public boolean f12447z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final di.s4 J = new di.s4(this, 1);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public p6(int i7) {
        this.f12437o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f12425a = i7;
        ?? obj = new Object();
        obj.f11857a = i7;
        obj.f11858b = ur.a0(i7);
        this.f12433k = obj;
        SharedPreferences sharedPreferences = np.u1(i7).h7;
        this.f12434l = sharedPreferences;
        this.f12437o = sharedPreferences.getString("last_stories_state", "");
        this.f12446y = sharedPreferences.getString("last_stories_state_hidden", "");
        this.v = sharedPreferences.getInt("total_stores_hidden", 0);
        this.f12443u = sharedPreferences.getInt("total_stores", 0);
        this.f12441s = sharedPreferences.getBoolean("read_loaded", false);
        this.f12442t = new HashSet(sharedPreferences.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = sharedPreferences.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.B = tL_storiesStealthMode;
        c7 c7Var = this.f12433k;
        c7Var.f11858b.f27250a.c(new l4(12, c7Var, new p5(this, 1)));
        this.K = new ai.c1(this, i7, 8);
        this.f12444w = new hi.b1(i7);
    }

    public static org.telegram.tgnet.TLRPC.Document C(int r10, org.telegram.tgnet.tl.TL_stories.StoryItem r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.p6.C(int, org.telegram.tgnet.tl.TL_stories$StoryItem):org.telegram.tgnet.TLRPC$Document");
    }

    public static boolean G(int i7, TLRPC.Document document) {
        String r10 = org.telegram.messenger.w7.r(null, document);
        int lastIndexOf = r10.lastIndexOf(46);
        if (!org.telegram.messenger.w7.G(i7).S(r10)) {
            File z10 = org.telegram.messenger.w7.z(4);
            StringBuilder sb2 = new StringBuilder();
            if (lastIndexOf > 0) {
                r10 = r10.substring(0, lastIndexOf);
            }
            if (!new File(z10, a8.p0.s(sb2, r10, ".temp")).exists()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean P(int i7, TLRPC.Document document) {
        if (!new File(org.telegram.messenger.w7.z(6), org.telegram.messenger.w7.r(null, document)).exists()) {
            org.telegram.messenger.w7.G(i7);
            if (!org.telegram.messenger.w7.J(document, null, true, true).exists()) {
                return false;
            }
        }
        return true;
    }

    public static String a(ArrayList arrayList) {
        TL_stories.StoryItem storyItem;
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (i7 > 0) {
                    str = str + ", ";
                }
                if (((gj) arrayList.get(i7)).f24218l == null) {
                    str = str + "null";
                } else {
                    str = str + storyItem.f28673id + "@" + storyItem.dialogId;
                }
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static TL_stories.StoryItem f(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem != null && storyItem2.min) {
            storyItem.pinned = storyItem2.pinned;
            storyItem.isPublic = storyItem2.isPublic;
            storyItem.close_friends = storyItem2.close_friends;
            int i7 = storyItem2.date;
            if (i7 != 0) {
                storyItem.date = i7;
            }
            int i10 = storyItem2.expire_date;
            if (i10 != 0) {
                storyItem.expire_date = i10;
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

    public static String k0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i7 = 0; i7 < list.size(); i7++) {
            try {
                if (i7 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i7)).f28673id + "@" + ((TL_stories.StoryItem) list.get(i7)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final h6 A(int i7, int i10, long j3, boolean z10) {
        if (i7 == 0 && i10 > 0) {
            Long valueOf = Long.valueOf(j3);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j3), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            h6 h6Var = (h6) hashMap3.get(Integer.valueOf(i10));
            if (h6Var == null && z10) {
                h6 h6Var2 = new h6(this.f12425a, j3, i7, i10, new p5(this, 0));
                hashMap3.put(Integer.valueOf(i10), h6Var2);
                return h6Var2;
            }
            return h6Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i7] == null) {
            hashMapArr[i7] = new HashMap();
        }
        h6 h6Var3 = (h6) hashMapArr[i7].get(Long.valueOf(j3));
        if (h6Var3 == null && z10) {
            if (i7 == 4) {
                HashMap hashMap4 = hashMapArr[i7];
                Long valueOf2 = Long.valueOf(j3);
                a6 a6Var = new a6(this.f12425a, j3, null, new p5(this, 0));
                hashMap4.put(valueOf2, a6Var);
                return a6Var;
            }
            HashMap hashMap5 = hashMapArr[i7];
            Long valueOf3 = Long.valueOf(j3);
            h6 h6Var4 = new h6(this.f12425a, j3, i7, i10, new p5(this, 0));
            hashMap5.put(valueOf3, h6Var4);
            return h6Var4;
        }
        return h6Var3;
    }

    public final d6 B(long j3, boolean z10) {
        a0.h hVar = this.F;
        d6 d6Var = (d6) hVar.f(j3);
        if (d6Var == null && z10) {
            d6 d6Var2 = new d6(this.f12425a, j3, this);
            hVar.k(d6Var2, j3);
            return d6Var2;
        }
        return d6Var;
    }

    public final int D(boolean z10) {
        if (z10) {
            if (this.f12447z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f12438p) {
            return Math.max(1, this.f12443u);
        } else {
            return this.f12430g.size();
        }
    }

    public final int E(int i7, long j3) {
        if (j3 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j3 == k10.i(this.f12425a).e() && !Utilities.x((Collection) this.f12426b.f(j3))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f12429f.get(j3, 0));
        boolean z10 = false;
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i7 == 0 || peerStories.stories.get(i10).f28673id == i7) && peerStories.stories.get(i10).f28673id > max) {
                if (peerStories.stories.get(i10).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        if (Q(j3) || !z10) {
            return 0;
        }
        return 1;
    }

    public final ArrayList F(long j3) {
        return (ArrayList) this.f12426b.f(j3);
    }

    public final boolean H(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
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

    public final boolean I() {
        if (J()) {
            ArrayList arrayList = this.f12430g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(0)).peer) == k10.i(this.f12425a).f24987n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        long j3 = k10.i(this.f12425a).f24987n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.x((Collection) this.f12426b.f(j3))) {
            return true;
        }
        return false;
    }

    public final boolean K(long j3) {
        if (j3 == 0) {
            return false;
        }
        if (M(j3) || Q(j3)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean L(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return false;
        }
        if (j3 == k10.i(this.f12425a).e() && !Utilities.x((Collection) this.f12426b.f(j3))) {
            return true;
        }
        for (int i7 = 0; i7 < peerStories.stories.size(); i7++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i7);
            if (storyItem != null && storyItem.f28673id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(long j3) {
        ArrayList arrayList = (ArrayList) this.f12426b.f(j3);
        HashMap hashMap = (HashMap) this.f12428e.f(j3);
        if (arrayList == null || arrayList.isEmpty()) {
            if (hashMap != null && !hashMap.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean N(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j3 = storyView.user_id;
        a0.h hVar = this.M;
        if (hVar.d(j3)) {
            return ((Boolean) hVar.f(storyView.user_id)).booleanValue();
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

    public final boolean O(TLRPC.User user) {
        if (user != null) {
            if (user.contact || user.f28583id == np.u1(this.f12425a).m0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Q(long j3) {
        ArrayList arrayList = (ArrayList) this.f12426b.f(j3);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((o6) i5.c.h(1, arrayList)).J;
        }
        return false;
    }

    public final void R(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j3));
        org.telegram.messenger.a8.b("StoriesController loadAllStoriesForDialog " + j3);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i7 = this.f12425a;
        tL_stories_getPeerStories.peer = np.u1(i7).l1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getPeerStories, new s5(this, j3, 0));
    }

    public final void S() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.f12425a).sendRequest(tL_contacts_getBlocked, new o5(this, 2));
    }

    public final void T(boolean z10) {
        String str;
        boolean z11;
        if (!z10 || !this.f12440r) {
            if ((!z10 && this.f12439q) || this.f12436n) {
                return;
            }
            boolean z12 = true;
            if (z10) {
                this.f12440r = true;
            } else {
                this.f12439q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z10) {
                str = this.f12446y;
            } else {
                str = this.f12437o;
            }
            if (z10) {
                z11 = this.f12447z;
            } else {
                z11 = this.f12438p;
            }
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (z11 && !TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.next = true;
            } else {
                z12 = false;
            }
            tL_stories_getAllStories.include_hidden = z10;
            ConnectionsManager.getInstance(this.f12425a).sendRequest(tL_stories_getAllStories, new w5(this, z10, tL_stories_getAllStories, z12));
        }
    }

    public final void U() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f12425a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new o5(this, 1));
        }
    }

    public final void V(final TL_stories.PeerStories peerStories, final boolean z10) {
        int i7;
        if (peerStories != null) {
            final long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            if (z10) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            final long j3 = o4 * i7;
            Long valueOf = Long.valueOf(j3);
            HashSet hashSet = this.D;
            if (!hashSet.contains(valueOf)) {
                ArrayList<Integer> arrayList = null;
                for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                    if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i10).f28673id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j3));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f28680id = arrayList;
                    int i11 = this.f12425a;
                    tL_stories_getStoriesByID.peer = np.u1(i11).l1(o4);
                    ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new u5(p6.this, j3, z10, peerStories, o4, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void W() {
        if (this.A) {
            this.f12436n = true;
            p5 p5Var = new p5(this, 2);
            c7 c7Var = this.f12433k;
            c7Var.f11858b.f27250a.c(new l4(9, c7Var, p5Var));
        } else {
            T(false);
            T(true);
        }
        this.A = false;
    }

    public final void X(int i7, long j3) {
        org.telegram.messenger.g0.g3(new di.c9(this, j3, i7, 1));
    }

    public final boolean Y(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i7 = this.f12429f.get(o4);
            int max = Math.max(peerStories.max_read_id, Math.max(i7, storyItem.f28673id));
            int i10 = this.f12425a;
            ys.f28169l0.c(new ps(ys.t(i10), o4, max, 1));
            peerStories.max_read_id = max;
            this.f12429f.put(o4, max);
            if (max > i7) {
                if (!z10) {
                    this.f12433k.i(max, o4);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = np.u1(i10).l1(o4);
                tL_stories_readStories.max_id = storyItem.f28673id;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stories_readStories, null);
                ls.f(i10).k(ls.I5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Z(long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i7 = this.f12425a;
            if (org.telegram.messenger.a6.q(i7).f()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && gj.K4(messageMedia.getDocument())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                storyItem.dialogId = j3;
                if (z10) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(storyItem.media.getDocument().thumbs, 1000, false, null, false);
                    org.telegram.messenger.w7.G(i7).W(C(i7, storyItem), storyItem, 0, 1);
                    org.telegram.messenger.w7.G(i7).V(gc.c(w10, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    TLRPC.MessageMedia messageMedia2 = storyItem.media;
                    if (messageMedia2 == null) {
                        photo = null;
                    } else {
                        photo = messageMedia2.photo;
                    }
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        org.telegram.messenger.w7.G(i7).V(gc.i(org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i10 = 0; i10 < Math.min(2, storyItem.media_areas.size()); i10++) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            ch.p0 d = ch.p0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)).reaction);
                            if (d.f5507f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(i7).f26847r.get(d.f5507f);
                                if (tL_availableReaction != null) {
                                    org.telegram.messenger.w7.G(i7).W(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(1, i7, d.f5508g);
                                p5Var.f38502m = true;
                                p5Var.u();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a0(TL_stories.PeerStories peerStories) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= peerStories.stories.size()) {
                break;
            } else if (peerStories.stories.get(i10).f28673id > peerStories.max_read_id) {
                i7 = i10;
                break;
            } else {
                i10++;
            }
        }
        if (!peerStories.stories.isEmpty()) {
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            Z(o4, peerStories.stories.get(i7));
            if (i7 > 0) {
                Z(o4, peerStories.stories.get(i7 - 1));
            }
            if (i7 < peerStories.stories.size() - 1) {
                Z(o4, peerStories.stories.get(i7 + 1));
            }
        }
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        d6 B = B(j3, true);
        B.getClass();
        p6 p6Var = B.f11901j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.f11894a;
        tL_updateAlbum.peer = np.u1(i10).l1(B.f11895b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f28673id));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i7));
            } else if (!arrayList2.contains(Integer.valueOf(i7))) {
                storyItem.albums.add(Integer.valueOf(i7));
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        h6 A = p6Var.A(0, i7, B.f11895b, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList4.get(i13);
            i13++;
            h6 A2 = p6Var.A(0, ((i6) obj3).f12144a, B.f11895b, false);
            if (A2 != null) {
                A2.E(i7, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.f12430g;
        if (!z12) {
            if (!z10) {
                arrayList3.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (org.telegram.messenger.s2.f26730a) {
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < tL_stories_allStories.peer_stories.size(); i7++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.n5.o(tL_stories_allStories.peer_stories.get(i7).peer));
            }
            org.telegram.messenger.a8.b("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i10 = this.f12425a;
        np.u1(i10).f4(tL_stories_allStories.users, z11);
        np.u1(i10).Z3(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        for (int i11 = 0; i11 < tL_stories_allStories.peer_stories.size(); i11++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i11);
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i12);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    ys.f28169l0.c(new ps(ys.t(i10), o4, storyItem.f28673id, 0));
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (!peerStories.stories.isEmpty()) {
                e0(o4, peerStories);
                for (int i13 = 0; i13 < 2; i13++) {
                    if (i13 == 0) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList3;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        } else if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i14)).peer) == o4) {
                            arrayList.remove(i14);
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                if (o4 > 0) {
                    TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(o4));
                    if (c22 != null) {
                        if (c22.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat O0 = np.u1(i10).O0(Long.valueOf(-o4));
                    if (O0 != null) {
                        if (O0.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                }
            } else {
                this.f12431i.l(o4);
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            ai.n nVar = new ai.n(15);
            c7 c7Var = this.f12433k;
            c7Var.f11858b.f27250a.c(new q5(c7Var, arrayList4, z12, z10, nVar, 1));
        }
        ai.c1 c1Var = this.K;
        org.telegram.messenger.g0.r(c1Var);
        c1Var.run();
    }

    public final void c(int i7, long j3, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i7, j3, arrayList);
    }

    public final void c0(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long o4 = org.telegram.messenger.n5.o(tL_updateStory.peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i7 == 0) {
            org.telegram.messenger.a8.b("StoriesController can't update story dialogId == 0");
            return;
        }
        c7 c7Var = this.f12433k;
        if (i7 > 0) {
            user = np.u1(this.f12425a).c2(Long.valueOf(o4));
            if (user != null && (O(user) || user.self)) {
                c7Var.f11858b.f27250a.c(new l4(10, c7Var, tL_updateStory));
            }
        } else {
            c7Var.f11858b.f27250a.c(new l4(10, c7Var, tL_updateStory));
            user = null;
        }
        org.telegram.messenger.g0.g3(new di.j2(this, o4, tL_updateStory, user, 7));
    }

    public final void d(long j3, o6 o6Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.f3.h(hVar, j3);
        }
        arrayList.add(o6Var);
    }

    public final void d0(long j3, TL_stories.PeerStories peerStories) {
        e0(j3, peerStories);
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        c7 c7Var = this.f12433k;
        int i10 = this.f12425a;
        if (i7 > 0) {
            TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(j3));
            if (O(c22) || c22.self) {
                c7Var.f11858b.f27250a.c(new a7(c7Var, peerStories, 1));
            }
        } else if (org.telegram.messenger.v3.j0(np.u1(i10).O0(Long.valueOf(-j3)))) {
            c7Var.f11858b.f27250a.c(new a7(c7Var, peerStories, 1));
        }
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long o4 = org.telegram.messenger.n5.o(peerStories.peer);
        int i7 = this.f12425a;
        if (o4 == k10.i(i7).e()) {
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer) == o4) {
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        np.u1(i7).D();
    }

    public final void e0(long j3, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.f12431i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j3);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i7 = 0; i7 < peerStories.stories.size(); i7++) {
                if (peerStories.stories.get(i7) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories.stories.get(i7).f28673id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i11).f28673id == i10 && (peerStories2.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i7, peerStories2.stories.get(i11));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        hVar.k(peerStories, j3);
    }

    public final void f0(int i7, long j3, ArrayList arrayList) {
        d6 B = B(j3, true);
        B.getClass();
        p6 p6Var = B.f11901j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.f11894a;
        tL_updateAlbum.peer = np.u1(i10).l1(B.f11895b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f28673id));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i7));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        h6 A = p6Var.A(0, i7, B.f11895b, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            h6 A2 = p6Var.A(0, ((i6) obj3).f12144a, B.f11895b, false);
            if (A2 != null) {
                A2.E(i7, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat O0;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        long o4 = org.telegram.messenger.n5.o(peerStories.peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        int i10 = this.f12425a;
        TLRPC.User user = null;
        if (i7 > 0) {
            TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(o4));
            if (c22 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = c22;
                O0 = null;
            }
        } else {
            O0 = np.u1(i10).O0(Long.valueOf(-o4));
            if (O0 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f12430g;
            z10 = true;
            if (i11 < arrayList.size()) {
                if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer) == o4) {
                    arrayList.remove(i11);
                    z11 = true;
                    break;
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i12 >= arrayList2.size()) {
                break;
            } else if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == o4) {
                arrayList2.remove(i12);
                z11 = true;
                break;
            } else {
                i12++;
            }
        }
        if ((user == null || !user.stories_hidden) && (O0 == null || !O0.stories_hidden)) {
            z10 = false;
        }
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("StoriesController move user stories to first hidden=" + z10 + " did=" + o4);
        }
        if (z10) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z11) {
            R(o4);
        }
        np.u1(i10).D();
    }

    public final void g0(int i7, long j3, y10 y10Var) {
        TL_stories.PeerStories y10 = y(j3);
        if (y10 != null) {
            for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                if (y10.stories.get(i10).f28673id == i7 && !(y10.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped)) {
                    y10Var.a(y10.stories.get(i10));
                    return;
                }
            }
        }
        long j10 = (i7 + j3) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j10);
        if (storyItem != null) {
            y10Var.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f28680id.add(Integer.valueOf(i7));
        int i11 = this.f12425a;
        tL_stories_getStoriesByID.peer = np.u1(i11).l1(j3);
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new y5(this, j10, y10Var));
    }

    public final boolean h(long j3) {
        TLRPC.Chat O0;
        if (j3 >= 0 || (O0 = np.u1(this.f12425a).O0(Long.valueOf(-j3))) == null) {
            return false;
        }
        if (!O0.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = O0.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.edit_stories) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void h0(long j3, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f12432j;
        if (z10) {
            longSparseIntArray.put(j3, 1);
        } else {
            longSparseIntArray.delete(j3);
        }
    }

    public final boolean i(long j3) {
        if (k10.i(this.f12425a).e() != j3 && !h(j3)) {
            return false;
        }
        return true;
    }

    public final void i0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i7 = this.f12425a;
        ls.f(i7).k(ls.G5, new Object[0]);
        SharedPreferences.Editor edit = np.u1(i7).h7.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean j(long j3) {
        TLRPC.User c22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f12425a;
        if (i7 < 0) {
            TLRPC.Chat O0 = np.u1(i10).O0(Long.valueOf(-j3));
            if (O0 == null || !org.telegram.messenger.v3.R(O0)) {
                return false;
            }
            if (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i7 > 0 && (c22 = np.u1(i10).c2(Long.valueOf(j3))) != null && c22.bot && c22.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j3, TL_stories.StoryItem storyItem, ch.p0 p0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f28673id;
        int i7 = this.f12425a;
        tL_stories_sendReaction.peer = np.u1(i7).l1(j3);
        if (p0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (p0Var.f5508g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = p0Var.f5508g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (p0Var.f5507f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = p0Var.f5507f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j3, storyItem, false);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendReaction, new l5(1));
    }

    public final void k(long j3, y10 y10Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i7 = this.f12425a;
        tL_stories_canSendStory.peer = np.u1(i7).l1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_canSendStory, new di.j(this, z10, j3, y10Var, h6Var), 1024);
    }

    public final void l(ArrayList arrayList) {
        int i7;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i7 = this.f12425a;
            if (i10 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (i7.w(i7, peerStories.stories.get(i11))) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (peerStories.stories.isEmpty() && !M(o4)) {
                this.f12431i.l(o4);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            ls.f(i7).k(ls.f25424y5, new Object[0]);
        }
    }

    public final void l0(long j3, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f12430g;
        if (z10) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer) == j3) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i7);
                    break;
                }
                i7++;
            } else {
                peerStories = null;
                break;
            }
        }
        if (peerStories != null) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList2.size()) {
                    if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList2.get(i10)).peer) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList2.add(0, peerStories);
                    ai.c1 c1Var = this.K;
                    org.telegram.messenger.g0.r(c1Var);
                    c1Var.run();
                    break;
                }
            }
        }
        int i11 = this.f12425a;
        ls.f(i11).k(ls.f25424y5, new Object[0]);
        np.u1(i11).D();
        if (z11) {
            if (j3 >= 0) {
                TLRPC.User c22 = np.u1(i11).c2(Long.valueOf(j3));
                c22.stories_hidden = z10;
                ur.a0(i11).m1(Collections.singletonList(c22), null, false, true);
                np.u1(i11).e4(c22, false, false);
            } else {
                TLRPC.Chat O0 = np.u1(i11).O0(Long.valueOf(-j3));
                O0.stories_hidden = z10;
                ur.a0(i11).m1(null, Collections.singletonList(O0), false, true);
                np.u1(i11).X3(O0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = np.u1(i11).l1(j3);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i11).sendRequest(tL_stories_togglePeerStoriesHidden, new l5(1));
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories != null && peerStories.stories != null) {
            int i7 = 0;
            while (i7 < peerStories.stories.size()) {
                if (i7.w(this.f12425a, peerStories.stories.get(i7))) {
                    peerStories.stories.remove(i7);
                    i7--;
                }
                i7++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void m0(long j3, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i7 = this.f12425a;
        TLRPC.InputPeer l1 = np.u1(i7).l1(j3);
        if (l1 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(Boolean.valueOf(z10), j3);
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z10) {
            if (z10) {
                hashSet.add(Long.valueOf(j3));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j3));
                this.N--;
            }
        }
        if (z11) {
            if (z10) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.f28477id = l1;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.f28482id = l1;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_unblock, null);
        }
        ls.f(i7).k(ls.f25290c3, new Object[0]);
    }

    public final boolean n(org.telegram.tgnet.TLRPC.TL_error r8) {
        throw new UnsupportedOperationException("Method not decompiled: fi.p6.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j3, List list) {
        ArrayList arrayList;
        StringBuilder t6 = a8.p0.t(j3, "updateDeletedStoriesInLists ", " storyItems[");
        t6.append(list.size());
        t6.append("] {");
        t6.append(k0(list));
        t6.append("}");
        org.telegram.messenger.a8.b(t6.toString());
        h6 A = A(0, -1, j3, false);
        p6 p6Var = this;
        h6 A2 = p6Var.A(1, -1, j3, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i7 = 0;
        d6 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                h6 A3 = p6Var.A(0, ((i6) obj).f12144a, j3, false);
                if (A3 != null) {
                    A3.A(list);
                }
                p6Var = this;
            }
        }
    }

    public final j6 o() {
        int i7;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10 = this.f12425a;
        if (k10.i(i10).q()) {
            i7 = np.u1(i10).f25904m5;
        } else {
            i7 = np.u1(i10).f25896l5;
        }
        ArrayList arrayList2 = (ArrayList) this.f12427c.f(k10.i(i10).e());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories y10 = y(k10.i(i10).e());
        if (y10 != null && (arrayList = y10.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i7) {
            return new j6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = np.u1(i10).l1(k10.i(i10).e());
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new o5(this, 5), 1024);
        return null;
    }

    public final void o0(long j3, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f12425a;
        if (i7 > 0) {
            TLRPC.UserFull d2 = np.u1(i10).d2(j3);
            if (d2 != null) {
                if (d2.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        d2.stories = tL_peerStories;
                        tL_peerStories.peer = np.u1(i10).B1(j3);
                        d2.stories.max_read_id = x(j3);
                    } else {
                        return;
                    }
                }
                peerStories = d2.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull P0 = np.u1(i10).P0(-j3);
            if (P0 != null) {
                if (P0.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        P0.stories = tL_peerStories2;
                        tL_peerStories2.peer = np.u1(i10).B1(j3);
                        P0.stories.max_read_id = x(j3);
                    } else {
                        return;
                    }
                }
                peerStories = P0.stories;
            } else {
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i12).f28673id == storyItem.f28673id) {
                        z11 = true;
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i12);
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i12);
                            storyItem = f(storyItem2, storyItem);
                            peerStories.stories.set(i12, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            i5.c.t(storyItem.f28673id, new StringBuilder("StoriesController update story for full peer storyId="));
                        }
                    } else {
                        i12++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    i5.c.t(storyItem.f28673id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    i5.c.t(storyItem.f28673id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p(int i7, long j3) {
        String str = "234:" + j3 + ":" + i7;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f12442t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i10 = this.f12425a;
        tL_stories_getStoriesByID.peer = np.u1(i10).l1(j3);
        tL_stories_getStoriesByID.f28680id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new di.v(this, i7, str, j3));
    }

    public final void p0(long j3, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f12431i.f(j3)) != null) {
            org.telegram.messenger.a8.b("StoriesController update stories from full peer " + j3);
            for (int i7 = 0; i7 < peerStories2.stories.size(); i7++) {
                if (peerStories2.stories.get(i7) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories2.stories.get(i7).f28673id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i11).f28673id == i10 && (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                            peerStories2.stories.set(i7, peerStories.stories.get(i11));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public final void q() {
        this.f12441s = false;
        this.f12446y = "";
        this.f12437o = "";
        this.f12434l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        hi.b1 b1Var = this.f12444w;
        Objects.requireNonNull(b1Var);
        org.telegram.messenger.g0.g3(new f2.a(b1Var, 12));
        W();
        if (this.f12441s) {
            return;
        }
        ConnectionsManager.getInstance(this.f12425a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new o5(this, 0));
    }

    public final void q0(long j3, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder t6 = a8.p0.t(j3, "updateStoriesInLists ", " storyItems[");
        t6.append(list.size());
        t6.append("] {");
        t6.append(k0(list));
        t6.append("}");
        org.telegram.messenger.a8.b(t6.toString());
        h6 A = A(0, -1, j3, false);
        p6 p6Var = this;
        h6 A2 = p6Var.A(1, -1, j3, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = p6Var.I;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((b6) obj).D(list, z10);
        }
        d6 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i7 < size2) {
                int i11 = i7 + 1;
                h6 A3 = p6Var.A(0, ((i6) arrayList.get(i7)).f12144a, j3, false);
                if (A3 != null) {
                    A3.D(list, z10);
                }
                p6Var = this;
                i7 = i11;
            }
        }
    }

    public final void r(long j3, String str, y10 y10Var) {
        d6 B = B(j3, true);
        int i7 = B.f11894a;
        if (B.f11900i) {
            return;
        }
        B.f11900i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = np.u1(i7).l1(B.f11895b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_createAlbum, new bi.o1(13, B, y10Var));
    }

    public final void r0(long j3, ArrayList arrayList, boolean z10, w2 w2Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y10 = y(j3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i7);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.f28687id.add(Integer.valueOf(storyItem.f28673id));
                if (y10 != null) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f28673id == storyItem.f28673id) {
                            y10.stories.get(i10).pinned = z10;
                            this.f12433k.k(j3, storyItem);
                        }
                    }
                }
            }
        }
        org.telegram.messenger.a8.b("StoriesController updateStoriesPinned");
        q0(j3, arrayList, false);
        o0(j3, arrayList, false);
        togglepinned.pinned = z10;
        int i11 = this.f12425a;
        togglepinned.peer = np.u1(i11).l1(j3);
        ConnectionsManager.getInstance(i11).sendRequest(togglepinned, new di.y7(w2Var, 1));
    }

    public final void s(ArrayList arrayList, long j3) {
        TLRPC.ChatFull P0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull d2;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i7 = this.f12425a;
        tL_stories_deleteStories.peer = np.u1(i7).l1(j3);
        a0.h hVar = this.f12431i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i11).f28673id == storyItem.f28673id) {
                            peerStories2.stories.remove(i11);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j3);
                            }
                        } else {
                            i11++;
                        }
                    }
                }
                tL_stories_deleteStories.f28676id.add(Integer.valueOf(storyItem.f28673id));
            }
        }
        if (j3 < 0 ? !((P0 = np.u1(i7).P0(-j3)) == null || (peerStories = P0.stories) == null) : !((d2 = np.u1(i7).d2(j3)) == null || (peerStories = d2.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i12);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i13).f28673id == storyItem2.f28673id) {
                        peerStories2.stories.remove(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_deleteStories, new o5(this, 3));
        n0(j3, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f28676id;
        c7 c7Var = this.f12433k;
        c7Var.f11858b.f27250a.c(new bi.q2(c7Var, arrayList2, j3, 9));
        ls.f(i7).k(ls.f25424y5, new Object[0]);
    }

    public final void s0(long j3, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder t6 = a8.p0.t(j3, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f28673id + "@" + storyItem.dialogId;
        }
        t6.append(str);
        org.telegram.messenger.a8.b(t6.toString());
        q0(j3, Collections.singletonList(storyItem), z10);
        this.f12433k.k(j3, storyItem);
        o0(j3, Collections.singletonList(storyItem), false);
    }

    public final o6 t(long j3, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.f12428e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (o6) hashMap.get(Integer.valueOf(storyItem.f28673id));
        }
        return null;
    }

    public final void t0(long j3, int i7, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i7, j3);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            s0(j3, u10, false);
        }
    }

    public final TL_stories.StoryItem u(int i7, long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12431i.f(j3);
        if (peerStories != null) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10).f28673id == i7) {
                    return peerStories.stories.get(i10);
                }
            }
            return null;
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User c22;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i7);
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            if (o4 > 0 && (c22 = np.u1(this.f12425a).c2(Long.valueOf(o4))) != null && !O(c22)) {
                arrayList.remove(i7);
                i7--;
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            while (i10 < peerStories.stories.size()) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (!z10 && peerStories.stories.isEmpty() && !M(o4)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final String w(int i7, long j3) {
        i6 b10;
        d6 B = B(j3, false);
        if (B != null && (b10 = B.b(i7)) != null) {
            return b10.f12145b;
        }
        return null;
    }

    public final int x(long j3) {
        TL_stories.PeerStories y10 = y(j3);
        if (y10 == null) {
            y10 = z(j3);
        }
        if (y10 != null) {
            return Math.max(y10.max_read_id, this.f12429f.get(j3, 0));
        }
        return this.f12429f.get(j3, 0);
    }

    public final TL_stories.PeerStories y(long j3) {
        return (TL_stories.PeerStories) this.f12431i.f(j3);
    }

    public final TL_stories.PeerStories z(long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f12425a;
        if (i7 > 0) {
            TLRPC.UserFull d2 = np.u1(i10).d2(j3);
            if (d2 != null && (peerStories2 = d2.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (d2 == null) {
                return null;
            }
            return d2.stories;
        }
        TLRPC.ChatFull P0 = np.u1(i10).P0(-j3);
        if (P0 != null && (peerStories = P0.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (P0 == null) {
            return null;
        }
        return P0.stories;
    }
}
