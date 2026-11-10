package di;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.ab;
import bi.ia;
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
import org.telegram.messenger.c20;
import org.telegram.messenger.dt;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public static final Comparator X = Comparator$CC.comparingInt(new bg.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final bg.m0 K;
    public int N;
    public boolean R;
    public t6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f9997a;
    public final m7 f10005k;
    public final SharedPreferences f10006l;
    public boolean f10008n;
    public String f10009o;
    public boolean f10010p;
    public boolean f10011q;
    public boolean f10012r;
    public boolean f10013s;
    public final HashSet f10014t;
    public int f10015u;
    public int v;
    public final fi.z0 f10016w;
    public String f10018y;
    public final a0.h f9998b = new a0.h();
    public final a0.h f9999c = new a0.h();
    public int d = 0;
    public final a0.h f10000e = new a0.h();
    public LongSparseIntArray f10001f = new LongSparseIntArray();
    public final ArrayList f10002g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h f10003i = new a0.h();
    public final LongSparseIntArray f10004j = new LongSparseIntArray();
    public final a0.h f10007m = new a0.h();
    public final a0.h f10017x = new a0.h();
    public boolean f10019z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final bi.s5 J = new bi.s5(this, 1);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public z6(int i7) {
        this.f10009o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f9997a = i7;
        ?? obj = new Object();
        obj.f9367a = i7;
        obj.f9368b = yr.a0(i7);
        this.f10005k = obj;
        SharedPreferences sharedPreferences = qp.s1(i7).f24778e7;
        this.f10006l = sharedPreferences;
        this.f10009o = sharedPreferences.getString("last_stories_state", "");
        this.f10018y = sharedPreferences.getString("last_stories_state_hidden", "");
        this.v = sharedPreferences.getInt("total_stores_hidden", 0);
        this.f10015u = sharedPreferences.getInt("total_stores", 0);
        this.f10013s = sharedPreferences.getBoolean("read_loaded", false);
        this.f10014t = new HashSet(sharedPreferences.getStringSet("unsupported_stories_checked", new HashSet()));
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
        m7 m7Var = this.f10005k;
        m7Var.f9368b.f26723a.c(new z0(17, m7Var, new z5(this, 1)));
        this.K = new bg.m0(this, i7, 3);
        this.f10016w = new fi.z0(i7);
    }

    public static org.telegram.tgnet.TLRPC.Document C(int r10, org.telegram.tgnet.tl.TL_stories.StoryItem r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.z6.C(int, org.telegram.tgnet.tl.TL_stories$StoryItem):org.telegram.tgnet.TLRPC$Document");
    }

    public static boolean G(int i7, TLRPC.Document document) {
        String r10 = org.telegram.messenger.w7.r(null, document);
        int lastIndexOf = r10.lastIndexOf(46);
        if (!org.telegram.messenger.w7.G(i7).S(r10)) {
            File z9 = org.telegram.messenger.w7.z(4);
            StringBuilder sb2 = new StringBuilder();
            if (lastIndexOf > 0) {
                r10 = r10.substring(0, lastIndexOf);
            }
            if (!new File(z9, a8.p0.s(sb2, r10, ".temp")).exists()) {
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
                if (((ij) arrayList.get(i7)).f23270l == null) {
                    str = str + "null";
                } else {
                    str = str + storyItem.f27199id + "@" + storyItem.dialogId;
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
                str = str + ((TL_stories.StoryItem) list.get(i7)).f27199id + "@" + ((TL_stories.StoryItem) list.get(i7)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final r6 A(int i7, int i10, long j3, boolean z9) {
        if (i7 == 0 && i10 > 0) {
            Long valueOf = Long.valueOf(j3);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j3), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            r6 r6Var = (r6) hashMap3.get(Integer.valueOf(i10));
            if (r6Var == null && z9) {
                r6 r6Var2 = new r6(this.f9997a, j3, i7, i10, new z5(this, 0));
                hashMap3.put(Integer.valueOf(i10), r6Var2);
                return r6Var2;
            }
            return r6Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i7] == null) {
            hashMapArr[i7] = new HashMap();
        }
        r6 r6Var3 = (r6) hashMapArr[i7].get(Long.valueOf(j3));
        if (r6Var3 == null && z9) {
            if (i7 == 4) {
                HashMap hashMap4 = hashMapArr[i7];
                Long valueOf2 = Long.valueOf(j3);
                k6 k6Var = new k6(this.f9997a, j3, null, new z5(this, 0));
                hashMap4.put(valueOf2, k6Var);
                return k6Var;
            }
            HashMap hashMap5 = hashMapArr[i7];
            Long valueOf3 = Long.valueOf(j3);
            r6 r6Var4 = new r6(this.f9997a, j3, i7, i10, new z5(this, 0));
            hashMap5.put(valueOf3, r6Var4);
            return r6Var4;
        }
        return r6Var3;
    }

    public final n6 B(long j3, boolean z9) {
        a0.h hVar = this.F;
        n6 n6Var = (n6) hVar.f(j3);
        if (n6Var == null && z9) {
            n6 n6Var2 = new n6(this.f9997a, j3, this);
            hVar.k(n6Var2, j3);
            return n6Var2;
        }
        return n6Var;
    }

    public final int D(boolean z9) {
        if (z9) {
            if (this.f10019z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f10010p) {
            return Math.max(1, this.f10015u);
        } else {
            return this.f10002g.size();
        }
    }

    public final int E(int i7, long j3) {
        if (j3 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j3 == p10.i(this.f9997a).e() && !Utilities.x((Collection) this.f9998b.f(j3))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f10001f.get(j3, 0));
        boolean z9 = false;
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i7 == 0 || peerStories.stories.get(i10).f27199id == i7) && peerStories.stories.get(i10).f27199id > max) {
                if (peerStories.stories.get(i10).close_friends) {
                    return 2;
                }
                z9 = true;
            }
        }
        if (Q(j3) || !z9) {
            return 0;
        }
        return 1;
    }

    public final ArrayList F(long j3) {
        return (ArrayList) this.f9998b.f(j3);
    }

    public final boolean H(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
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
            ArrayList arrayList = this.f10002g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer) == p10.i(this.f9997a).f24493n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        long j3 = p10.i(this.f9997a).f24493n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.x((Collection) this.f9998b.f(j3))) {
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
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean L(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return false;
        }
        if (j3 == p10.i(this.f9997a).e() && !Utilities.x((Collection) this.f9998b.f(j3))) {
            return true;
        }
        for (int i7 = 0; i7 < peerStories.stories.size(); i7++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i7);
            if (storyItem != null && storyItem.f27199id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(long j3) {
        ArrayList arrayList = (ArrayList) this.f9998b.f(j3);
        HashMap hashMap = (HashMap) this.f10000e.f(j3);
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
            if (user.contact || user.f27109id == qp.s1(this.f9997a).f24832l0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Q(long j3) {
        ArrayList arrayList = (ArrayList) this.f9998b.f(j3);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((y6) jg.g.i(1, arrayList)).I;
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
        int i7 = this.f9997a;
        tL_stories_getPeerStories.peer = qp.s1(i7).j1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getPeerStories, new c6(this, j3, 0));
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
        ConnectionsManager.getInstance(this.f9997a).sendRequest(tL_contacts_getBlocked, new y5(this, 2));
    }

    public final void T(boolean z9) {
        String str;
        boolean z10;
        if (!z9 || !this.f10012r) {
            if ((!z9 && this.f10011q) || this.f10008n) {
                return;
            }
            boolean z11 = true;
            if (z9) {
                this.f10012r = true;
            } else {
                this.f10011q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z9) {
                str = this.f10018y;
            } else {
                str = this.f10009o;
            }
            if (z9) {
                z10 = this.f10019z;
            } else {
                z10 = this.f10010p;
            }
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (z10 && !TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.next = true;
            } else {
                z11 = false;
            }
            tL_stories_getAllStories.include_hidden = z9;
            ConnectionsManager.getInstance(this.f9997a).sendRequest(tL_stories_getAllStories, new g6(this, z9, tL_stories_getAllStories, z11));
        }
    }

    public final void U() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f9997a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new y5(this, 1));
        }
    }

    public final void V(final TL_stories.PeerStories peerStories, final boolean z9) {
        int i7;
        if (peerStories != null) {
            final long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            if (z9) {
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
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i10).f27199id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j3));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f27206id = arrayList;
                    int i11 = this.f9997a;
                    tL_stories_getStoriesByID.peer = qp.s1(i11).j1(o4);
                    ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new e6(z6.this, j3, z9, peerStories, o4, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void W() {
        if (this.A) {
            this.f10008n = true;
            z5 z5Var = new z5(this, 2);
            m7 m7Var = this.f10005k;
            m7Var.f9368b.f26723a.c(new z0(14, m7Var, z5Var));
        } else {
            T(false);
            T(true);
        }
        this.A = false;
    }

    public final void X(int i7, long j3) {
        org.telegram.messenger.g0.h3(new ia(this, j3, i7, 1));
    }

    public final boolean Y(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z9) {
        if (storyItem != null && peerStories != null) {
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i7 = this.f10001f.get(o4);
            int max = Math.max(peerStories.max_read_id, Math.max(i7, storyItem.f27199id));
            int i10 = this.f9997a;
            dt.f22080k0.c(new us(dt.t(i10), o4, max, 1));
            peerStories.max_read_id = max;
            this.f10001f.put(o4, max);
            if (max > i7) {
                if (!z9) {
                    this.f10005k.i(max, o4);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = qp.s1(i10).j1(o4);
                tL_stories_readStories.max_id = storyItem.f27199id;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stories_readStories, null);
                qs.f(i10).k(qs.F5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Z(long j3, TL_stories.StoryItem storyItem) {
        boolean z9;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i7 = this.f9997a;
            if (org.telegram.messenger.z5.q(i7).f()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && ij.K4(messageMedia.getDocument())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                storyItem.dialogId = j3;
                if (z9) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(storyItem.media.getDocument().thumbs, 1000, false, null, false);
                    org.telegram.messenger.w7.G(i7).W(C(i7, storyItem), storyItem, 0, 1);
                    org.telegram.messenger.w7.G(i7).V(hc.c(w10, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    TLRPC.MessageMedia messageMedia2 = storyItem.media;
                    if (messageMedia2 == null) {
                        photo = null;
                    } else {
                        photo = messageMedia2.photo;
                    }
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        org.telegram.messenger.w7.G(i7).V(hc.i(org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i10 = 0; i10 < Math.min(2, storyItem.media_areas.size()); i10++) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            ch.o0 d = ch.o0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)).reaction);
                            if (d.f6359f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).f25840r.get(d.f6359f);
                                if (tL_availableReaction != null) {
                                    org.telegram.messenger.w7.G(i7).W(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(1, i7, d.f6360g);
                                h5Var.f34178m = true;
                                h5Var.u();
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
            } else if (peerStories.stories.get(i10).f27199id > peerStories.max_read_id) {
                i7 = i10;
                break;
            } else {
                i10++;
            }
        }
        if (!peerStories.stories.isEmpty()) {
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
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
        n6 B = B(j3, true);
        B.getClass();
        z6 z6Var = B.f9407j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.f9400a;
        tL_updateAlbum.peer = qp.s1(i10).j1(B.f9401b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f27199id));
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
        r6 A = z6Var.A(0, i7, B.f9401b, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList4.get(i13);
            i13++;
            r6 A2 = z6Var.A(0, ((s6) obj3).f9737a, B.f9401b, false);
            if (A2 != null) {
                A2.E(i7, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z9, boolean z10, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.f10002g;
        if (!z11) {
            if (!z9) {
                arrayList3.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (org.telegram.messenger.r2.f25216a) {
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < tL_stories_allStories.peer_stories.size(); i7++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.m5.o(tL_stories_allStories.peer_stories.get(i7).peer));
            }
            org.telegram.messenger.a8.b("StoriesController cache=" + z10 + " hidden=" + z9 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i10 = this.f9997a;
        qp.s1(i10).Y3(tL_stories_allStories.users, z10);
        qp.s1(i10).S3(tL_stories_allStories.chats, z10);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        for (int i11 = 0; i11 < tL_stories_allStories.peer_stories.size(); i11++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i11);
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i12);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    dt.f22080k0.c(new us(dt.t(i10), o4, storyItem.f27199id, 0));
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
                        } else if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i14)).peer) == o4) {
                            arrayList.remove(i14);
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                if (o4 > 0) {
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(o4));
                    if (a22 != null) {
                        if (a22.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-o4));
                    if (M0 != null) {
                        if (M0.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            a0(peerStories);
                        }
                    }
                }
            } else {
                this.f10003i.l(o4);
            }
        }
        if (!z10) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            ai.m0 m0Var = new ai.m0(9);
            m7 m7Var = this.f10005k;
            m7Var.f9368b.f26723a.c(new a6(m7Var, arrayList4, z11, z9, m0Var, 1));
        }
        bg.m0 m0Var2 = this.K;
        org.telegram.messenger.g0.r(m0Var2);
        m0Var2.run();
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
        long o4 = org.telegram.messenger.m5.o(tL_updateStory.peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i7 == 0) {
            org.telegram.messenger.a8.b("StoriesController can't update story dialogId == 0");
            return;
        }
        m7 m7Var = this.f10005k;
        if (i7 > 0) {
            user = qp.s1(this.f9997a).a2(Long.valueOf(o4));
            if (user != null && (O(user) || user.self)) {
                m7Var.f9368b.f26723a.c(new z0(15, m7Var, tL_updateStory));
            }
        } else {
            m7Var.f9368b.f26723a.c(new z0(15, m7Var, tL_updateStory));
            user = null;
        }
        org.telegram.messenger.g0.h3(new bi.w2(this, o4, tL_updateStory, user, 8));
    }

    public final void d(long j3, y6 y6Var, a0.h hVar, boolean z9) {
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (z9 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.j(hVar, j3);
        }
        arrayList.add(y6Var);
    }

    public final void d0(long j3, TL_stories.PeerStories peerStories) {
        e0(j3, peerStories);
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        m7 m7Var = this.f10005k;
        int i10 = this.f9997a;
        if (i7 > 0) {
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(j3));
            if (O(a22) || a22.self) {
                m7Var.f9368b.f26723a.c(new k7(m7Var, peerStories, 1));
            }
        } else if (org.telegram.messenger.t3.j0(qp.s1(i10).M0(Long.valueOf(-j3)))) {
            m7Var.f9368b.f26723a.c(new k7(m7Var, peerStories, 1));
        }
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long o4 = org.telegram.messenger.m5.o(peerStories.peer);
        int i7 = this.f9997a;
        if (o4 == p10.i(i7).e()) {
            return;
        }
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer) == o4) {
                z9 = true;
            }
            i10++;
        }
        if (!z9) {
            arrayList.add(peerStories);
        }
        qp.s1(i7).D();
    }

    public final void e0(long j3, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.f10003i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j3);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i7 = 0; i7 < peerStories.stories.size(); i7++) {
                if (peerStories.stories.get(i7) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories.stories.get(i7).f27199id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i11).f27199id == i10 && (peerStories2.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
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
        n6 B = B(j3, true);
        B.getClass();
        z6 z6Var = B.f9407j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.f9400a;
        tL_updateAlbum.peer = qp.s1(i10).j1(B.f9401b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f27199id));
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
        r6 A = z6Var.A(0, i7, B.f9401b, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            r6 A2 = z6Var.A(0, ((s6) obj3).f9737a, B.f9401b, false);
            if (A2 != null) {
                A2.E(i7, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat M0;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        ArrayList arrayList2;
        long o4 = org.telegram.messenger.m5.o(peerStories.peer);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        int i10 = this.f9997a;
        TLRPC.User user = null;
        if (i7 > 0) {
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(o4));
            if (a22 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = a22;
                M0 = null;
            }
        } else {
            M0 = qp.s1(i10).M0(Long.valueOf(-o4));
            if (M0 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f10002g;
            z9 = true;
            if (i11 < arrayList.size()) {
                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer) == o4) {
                    arrayList.remove(i11);
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i12 >= arrayList2.size()) {
                break;
            } else if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == o4) {
                arrayList2.remove(i12);
                z10 = true;
                break;
            } else {
                i12++;
            }
        }
        if ((user == null || !user.stories_hidden) && (M0 == null || !M0.stories_hidden)) {
            z9 = false;
        }
        if (org.telegram.messenger.r2.f25216a) {
            org.telegram.messenger.a8.b("StoriesController move user stories to first hidden=" + z9 + " did=" + o4);
        }
        if (z9) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z10) {
            R(o4);
        }
        qp.s1(i10).D();
    }

    public final void g0(int i7, long j3, c20 c20Var) {
        TL_stories.PeerStories y10 = y(j3);
        if (y10 != null) {
            for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                if (y10.stories.get(i10).f27199id == i7 && !(y10.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped)) {
                    c20Var.a(y10.stories.get(i10));
                    return;
                }
            }
        }
        long j10 = (i7 + j3) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j10);
        if (storyItem != null) {
            c20Var.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f27206id.add(Integer.valueOf(i7));
        int i11 = this.f9997a;
        tL_stories_getStoriesByID.peer = qp.s1(i11).j1(j3);
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new i6(this, j10, c20Var));
    }

    public final boolean h(long j3) {
        TLRPC.Chat M0;
        if (j3 >= 0 || (M0 = qp.s1(this.f9997a).M0(Long.valueOf(-j3))) == null) {
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

    public final void h0(long j3, boolean z9) {
        LongSparseIntArray longSparseIntArray = this.f10004j;
        if (z9) {
            longSparseIntArray.put(j3, 1);
        } else {
            longSparseIntArray.delete(j3);
        }
    }

    public final boolean i(long j3) {
        if (p10.i(this.f9997a).e() != j3 && !h(j3)) {
            return false;
        }
        return true;
    }

    public final void i0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i7 = this.f9997a;
        qs.f(i7).k(qs.D5, new Object[0]);
        SharedPreferences.Editor edit = qp.s1(i7).f24778e7.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean j(long j3) {
        TLRPC.User a22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9997a;
        if (i7 < 0) {
            TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-j3));
            if (M0 == null || !org.telegram.messenger.t3.R(M0)) {
                return false;
            }
            if (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i7 > 0 && (a22 = qp.s1(i10).a2(Long.valueOf(j3))) != null && a22.bot && a22.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j3, TL_stories.StoryItem storyItem, ch.o0 o0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f27199id;
        int i7 = this.f9997a;
        tL_stories_sendReaction.peer = qp.s1(i7).j1(j3);
        if (o0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (o0Var.f6360g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = o0Var.f6360g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (o0Var.f6359f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = o0Var.f6359f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j3, storyItem, false);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendReaction, new v5(1));
    }

    public final void k(long j3, c20 c20Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i7 = this.f9997a;
        tL_stories_canSendStory.peer = qp.s1(i7).j1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_canSendStory, new bi.k(this, z9, j3, c20Var, h6Var), 1024);
    }

    public final void l(ArrayList arrayList) {
        int i7;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            int size = arrayList.size();
            i7 = this.f9997a;
            if (i10 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (s7.w(i7, peerStories.stories.get(i11))) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (peerStories.stories.isEmpty() && !M(o4)) {
                this.f10003i.l(o4);
                arrayList.remove(peerStories);
                z9 = true;
            }
            i10++;
        }
        if (z9) {
            qs.f(i7).k(qs.f25099v5, new Object[0]);
        }
    }

    public final void l0(long j3, boolean z9, boolean z10) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f10002g;
        if (z9) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer) == j3) {
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
                    if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i10)).peer) == j3) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList2.add(0, peerStories);
                    bg.m0 m0Var = this.K;
                    org.telegram.messenger.g0.r(m0Var);
                    m0Var.run();
                    break;
                }
            }
        }
        int i11 = this.f9997a;
        qs.f(i11).k(qs.f25099v5, new Object[0]);
        qp.s1(i11).D();
        if (z10) {
            if (j3 >= 0) {
                TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(j3));
                a22.stories_hidden = z9;
                yr.a0(i11).m1(Collections.singletonList(a22), null, false, true);
                qp.s1(i11).X3(a22, false, false);
            } else {
                TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-j3));
                M0.stories_hidden = z9;
                yr.a0(i11).m1(null, Collections.singletonList(M0), false, true);
                qp.s1(i11).Q3(M0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = qp.s1(i11).j1(j3);
            tL_stories_togglePeerStoriesHidden.hidden = z9;
            ConnectionsManager.getInstance(i11).sendRequest(tL_stories_togglePeerStoriesHidden, new v5(1));
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories != null && peerStories.stories != null) {
            int i7 = 0;
            while (i7 < peerStories.stories.size()) {
                if (s7.w(this.f9997a, peerStories.stories.get(i7))) {
                    peerStories.stories.remove(i7);
                    i7--;
                }
                i7++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void m0(long j3, boolean z9, boolean z10) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i7 = this.f9997a;
        TLRPC.InputPeer j12 = qp.s1(i7).j1(j3);
        if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(Boolean.valueOf(z9), j3);
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z9) {
            if (z9) {
                hashSet.add(Long.valueOf(j3));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j3));
                this.N--;
            }
        }
        if (z10) {
            if (z9) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.f27003id = j12;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.f27008id = j12;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_unblock, null);
        }
        qs.f(i7).k(qs.f24974a3, new Object[0]);
    }

    public final boolean n(org.telegram.tgnet.TLRPC.TL_error r8) {
        throw new UnsupportedOperationException("Method not decompiled: di.z6.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j3, List list) {
        ArrayList arrayList;
        StringBuilder t6 = a8.p0.t(j3, "updateDeletedStoriesInLists ", " storyItems[");
        t6.append(list.size());
        t6.append("] {");
        t6.append(k0(list));
        t6.append("}");
        org.telegram.messenger.a8.b(t6.toString());
        r6 A = A(0, -1, j3, false);
        z6 z6Var = this;
        r6 A2 = z6Var.A(1, -1, j3, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i7 = 0;
        n6 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                r6 A3 = z6Var.A(0, ((s6) obj).f9737a, j3, false);
                if (A3 != null) {
                    A3.A(list);
                }
                z6Var = this;
            }
        }
    }

    public final t6 o() {
        int i7;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10 = this.f9997a;
        if (p10.i(i10).q()) {
            i7 = qp.s1(i10).f24819j5;
        } else {
            i7 = qp.s1(i10).f24812i5;
        }
        ArrayList arrayList2 = (ArrayList) this.f9999c.f(p10.i(i10).e());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories y10 = y(p10.i(i10).e());
        if (y10 != null && (arrayList = y10.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i7) {
            return new t6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = qp.s1(i10).j1(p10.i(i10).e());
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new y5(this, 5), 1024);
        return null;
    }

    public final void o0(long j3, List list, boolean z9) {
        TL_stories.PeerStories peerStories;
        boolean z10;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9997a;
        if (i7 > 0) {
            TLRPC.UserFull b22 = qp.s1(i10).b2(j3);
            if (b22 != null) {
                if (b22.stories == null) {
                    if (z9) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        b22.stories = tL_peerStories;
                        tL_peerStories.peer = qp.s1(i10).z1(j3);
                        b22.stories.max_read_id = x(j3);
                    } else {
                        return;
                    }
                }
                peerStories = b22.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull N0 = qp.s1(i10).N0(-j3);
            if (N0 != null) {
                if (N0.stories == null) {
                    if (z9) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        N0.stories = tL_peerStories2;
                        tL_peerStories2.peer = qp.s1(i10).z1(j3);
                        N0.stories.max_read_id = x(j3);
                    } else {
                        return;
                    }
                }
                peerStories = N0.stories;
            } else {
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i12).f27199id == storyItem.f27199id) {
                        z10 = true;
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
                            jg.g.s(storyItem.f27199id, new StringBuilder("StoriesController update story for full peer storyId="));
                        }
                    } else {
                        i12++;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    jg.g.s(storyItem.f27199id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z9) {
                    jg.g.s(storyItem.f27199id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p(int i7, long j3) {
        String str = "233:" + j3 + ":" + i7;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f10014t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i10 = this.f9997a;
        tL_stories_getStoriesByID.peer = qp.s1(i10).j1(j3);
        tL_stories_getStoriesByID.f27206id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new bi.b0(this, i7, str, j3));
    }

    public final void p0(long j3, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f10003i.f(j3)) != null) {
            org.telegram.messenger.a8.b("StoriesController update stories from full peer " + j3);
            for (int i7 = 0; i7 < peerStories2.stories.size(); i7++) {
                if (peerStories2.stories.get(i7) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories2.stories.get(i7).f27199id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i11).f27199id == i10 && (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
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
        this.f10013s = false;
        this.f10018y = "";
        this.f10009o = "";
        this.f10006l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        fi.z0 z0Var = this.f10016w;
        Objects.requireNonNull(z0Var);
        org.telegram.messenger.g0.h3(new ab(z0Var, 24));
        W();
        if (this.f10013s) {
            return;
        }
        ConnectionsManager.getInstance(this.f9997a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new y5(this, 0));
    }

    public final void q0(long j3, List list, boolean z9) {
        ArrayList arrayList;
        StringBuilder t6 = a8.p0.t(j3, "updateStoriesInLists ", " storyItems[");
        t6.append(list.size());
        t6.append("] {");
        t6.append(k0(list));
        t6.append("}");
        org.telegram.messenger.a8.b(t6.toString());
        r6 A = A(0, -1, j3, false);
        z6 z6Var = this;
        r6 A2 = z6Var.A(1, -1, j3, false);
        if (A != null) {
            A.D(list, z9);
        }
        if (A2 != null) {
            A2.D(list, z9);
        }
        ArrayList arrayList2 = z6Var.I;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((l6) obj).D(list, z9);
        }
        n6 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i7 < size2) {
                int i11 = i7 + 1;
                r6 A3 = z6Var.A(0, ((s6) arrayList.get(i7)).f9737a, j3, false);
                if (A3 != null) {
                    A3.D(list, z9);
                }
                z6Var = this;
                i7 = i11;
            }
        }
    }

    public final void r(long j3, String str, c20 c20Var) {
        n6 B = B(j3, true);
        int i7 = B.f9400a;
        if (B.f9406i) {
            return;
        }
        B.f9406i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = qp.s1(i7).j1(B.f9401b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_createAlbum, new bi.j(10, B, c20Var));
    }

    public final void r0(long j3, ArrayList arrayList, boolean z9, d3 d3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y10 = y(j3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i7);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z9;
                togglepinned.f27213id.add(Integer.valueOf(storyItem.f27199id));
                if (y10 != null) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).f27199id == storyItem.f27199id) {
                            y10.stories.get(i10).pinned = z9;
                            this.f10005k.k(j3, storyItem);
                        }
                    }
                }
            }
        }
        org.telegram.messenger.a8.b("StoriesController updateStoriesPinned");
        q0(j3, arrayList, false);
        o0(j3, arrayList, false);
        togglepinned.pinned = z9;
        int i11 = this.f9997a;
        togglepinned.peer = qp.s1(i11).j1(j3);
        ConnectionsManager.getInstance(i11).sendRequest(togglepinned, new bi.e9(d3Var, 1));
    }

    public final void s(ArrayList arrayList, long j3) {
        TLRPC.ChatFull N0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull b22;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i7 = this.f9997a;
        tL_stories_deleteStories.peer = qp.s1(i7).j1(j3);
        a0.h hVar = this.f10003i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i11).f27199id == storyItem.f27199id) {
                            peerStories2.stories.remove(i11);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j3);
                            }
                        } else {
                            i11++;
                        }
                    }
                }
                tL_stories_deleteStories.f27202id.add(Integer.valueOf(storyItem.f27199id));
            }
        }
        if (j3 < 0 ? !((N0 = qp.s1(i7).N0(-j3)) == null || (peerStories = N0.stories) == null) : !((b22 = qp.s1(i7).b2(j3)) == null || (peerStories = b22.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i12);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i13).f27199id == storyItem2.f27199id) {
                        peerStories2.stories.remove(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_stories_deleteStories, new y5(this, 3));
        n0(j3, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f27202id;
        m7 m7Var = this.f10005k;
        m7Var.f9368b.f26723a.c(new bi.d3(m7Var, arrayList2, j3, 8));
        qs.f(i7).k(qs.f25099v5, new Object[0]);
    }

    public final void s0(long j3, TL_stories.StoryItem storyItem, boolean z9) {
        String str;
        StringBuilder t6 = a8.p0.t(j3, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f27199id + "@" + storyItem.dialogId;
        }
        t6.append(str);
        org.telegram.messenger.a8.b(t6.toString());
        q0(j3, Collections.singletonList(storyItem), z9);
        this.f10005k.k(j3, storyItem);
        o0(j3, Collections.singletonList(storyItem), false);
    }

    public final y6 t(long j3, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.f10000e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (y6) hashMap.get(Integer.valueOf(storyItem.f27199id));
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
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10003i.f(j3);
        if (peerStories != null) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10).f27199id == i7) {
                    return peerStories.stories.get(i10);
                }
            }
            return null;
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z9;
        TLRPC.User a22;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i7);
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            if (o4 > 0 && (a22 = qp.s1(this.f9997a).a2(Long.valueOf(o4))) != null && !O(a22)) {
                arrayList.remove(i7);
                i7--;
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = 0;
            while (i10 < peerStories.stories.size()) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (!z9 && peerStories.stories.isEmpty() && !M(o4)) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final String w(int i7, long j3) {
        s6 b10;
        n6 B = B(j3, false);
        if (B != null && (b10 = B.b(i7)) != null) {
            return b10.f9738b;
        }
        return null;
    }

    public final int x(long j3) {
        TL_stories.PeerStories y10 = y(j3);
        if (y10 == null) {
            y10 = z(j3);
        }
        if (y10 != null) {
            return Math.max(y10.max_read_id, this.f10001f.get(j3, 0));
        }
        return this.f10001f.get(j3, 0);
    }

    public final TL_stories.PeerStories y(long j3) {
        return (TL_stories.PeerStories) this.f10003i.f(j3);
    }

    public final TL_stories.PeerStories z(long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9997a;
        if (i7 > 0) {
            TLRPC.UserFull b22 = qp.s1(i10).b2(j3);
            if (b22 != null && (peerStories2 = b22.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (b22 == null) {
                return null;
            }
            return b22.stories;
        }
        TLRPC.ChatFull N0 = qp.s1(i10).N0(-j3);
        if (N0 != null && (peerStories = N0.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (N0 == null) {
            return null;
        }
        return N0.stories;
    }
}
