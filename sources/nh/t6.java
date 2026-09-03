package nh;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t6 {
    public static final Comparator X = Comparator$CC.comparingInt(new kf.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final ah.b K;
    public int N;
    public boolean R;
    public n6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f15897a;
    public final g7 f15904k;
    public final SharedPreferences f15905l;
    public boolean f15907n;
    public String f15908o;
    public boolean f15909p;
    public boolean f15910q;
    public boolean f15911r;
    public boolean f15912s;
    public final HashSet f15913t;
    public int f15914u;
    public int v;
    public final ph.t0 f15915w;
    public String f15917y;
    public final a0.h f15898b = new a0.h();
    public final a0.h f15899c = new a0.h();
    public int d = 0;
    public final a0.h e = new a0.h();
    public LongSparseIntArray f15900f = new LongSparseIntArray();
    public final ArrayList f15901g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h f15902i = new a0.h();
    public final LongSparseIntArray f15903j = new LongSparseIntArray();
    public final a0.h f15906m = new a0.h();
    public final a0.h f15916x = new a0.h();
    public boolean f15918z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final d4.t J = new d4.t(this, 4);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public t6(int i10) {
        this.f15908o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f15897a = i10;
        ?? obj = new Object();
        obj.f15345a = i10;
        obj.f15346b = MessagesStorage.getInstance(i10);
        this.f15904k = obj;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        this.f15905l = mainSettings;
        this.f15908o = mainSettings.getString("last_stories_state", "");
        this.f15917y = mainSettings.getString("last_stories_state_hidden", "");
        this.v = mainSettings.getInt("total_stores_hidden", 0);
        this.f15914u = mainSettings.getInt("total_stores", 0);
        this.f15912s = mainSettings.getBoolean("read_loaded", false);
        this.f15913t = new HashSet(mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = mainSettings.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.B = tL_storiesStealthMode;
        g7 g7Var = this.f15904k;
        g7Var.f15346b.getStorageQueue().postRunnable(new n4(11, g7Var, new w5(this, 0)));
        this.K = new ah.b(this, i10, 10);
        this.f15915w = new ph.t0(i10);
    }

    public static String a(ArrayList arrayList) {
        TL_stories.StoryItem storyItem;
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                if (((MessageObject) arrayList.get(i10)).storyItem == null) {
                    str = str + "null";
                } else {
                    str = str + storyItem.f19394id + "@" + storyItem.dialogId;
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
            int i10 = storyItem2.date;
            if (i10 != 0) {
                storyItem.date = i10;
            }
            int i11 = storyItem2.expire_date;
            if (i11 != 0) {
                storyItem.expire_date = i11;
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

    public static String h0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i10)).f19394id + "@" + ((TL_stories.StoryItem) list.get(i10)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final l6 A(long j10, int i10, int i11, boolean z4) {
        if (i10 == 0 && i11 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            l6 l6Var = (l6) hashMap3.get(Integer.valueOf(i11));
            if (l6Var == null && z4) {
                l6 l6Var2 = new l6(this.f15897a, j10, i10, i11, new cg.h0(this, 27));
                hashMap3.put(Integer.valueOf(i11), l6Var2);
                return l6Var2;
            }
            return l6Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i10] == null) {
            hashMapArr[i10] = new HashMap();
        }
        l6 l6Var3 = (l6) hashMapArr[i10].get(Long.valueOf(j10));
        if (l6Var3 == null && z4) {
            if (i10 == 4) {
                HashMap hashMap4 = hashMapArr[i10];
                Long valueOf2 = Long.valueOf(j10);
                d6 d6Var = new d6(this.f15897a, j10, null, new cg.h0(this, 27));
                hashMap4.put(valueOf2, d6Var);
                return d6Var;
            }
            HashMap hashMap5 = hashMapArr[i10];
            Long valueOf3 = Long.valueOf(j10);
            l6 l6Var4 = new l6(this.f15897a, j10, i10, i11, new cg.h0(this, 27));
            hashMap5.put(valueOf3, l6Var4);
            return l6Var4;
        }
        return l6Var3;
    }

    public final h6 B(long j10, boolean z4) {
        a0.h hVar = this.F;
        h6 h6Var = (h6) hVar.f(j10);
        if (h6Var == null && z4) {
            h6 h6Var2 = new h6(this.f15897a, j10, this);
            hVar.k(h6Var2, j10);
            return h6Var2;
        }
        return h6Var;
    }

    public final int C(boolean z4) {
        if (z4) {
            if (this.f15918z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f15909p) {
            return Math.max(1, this.f15914u);
        } else {
            return this.f15901g.size();
        }
    }

    public final int D(int i10, long j10) {
        if (j10 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j10 == UserConfig.getInstance(this.f15897a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f15898b.f(j10))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f15900f.get(j10, 0));
        boolean z4 = false;
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i10 == 0 || peerStories.stories.get(i11).f19394id == i10) && peerStories.stories.get(i11).f19394id > max) {
                if (peerStories.stories.get(i11).close_friends) {
                    return 2;
                }
                z4 = true;
            }
        }
        if (N(j10) || !z4) {
            return 0;
        }
        return 1;
    }

    public final ArrayList E(long j10) {
        return (ArrayList) this.f15898b.f(j10);
    }

    public final boolean F(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
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

    public final boolean G() {
        if (H()) {
            ArrayList arrayList = this.f15901g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer) == UserConfig.getInstance(this.f15897a).clientUserId)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        long j10 = UserConfig.getInstance(this.f15897a).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.isNullOrEmpty((Collection) this.f15898b.f(j10))) {
            return true;
        }
        return false;
    }

    public final boolean I(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (K(j10) || N(j10)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean J(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        if (j10 == UserConfig.getInstance(this.f15897a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f15898b.f(j10))) {
            return true;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i10);
            if (storyItem != null && storyItem.f19394id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(long j10) {
        ArrayList arrayList = (ArrayList) this.f15898b.f(j10);
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            if (hashMap != null && !hashMap.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean L(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j10 = storyView.user_id;
        a0.h hVar = this.M;
        if (hVar.d(j10)) {
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

    public final boolean M(TLRPC.User user) {
        if (user != null) {
            if (user.contact || user.f19306id == MessagesController.getInstance(this.f15897a).storiesChangelogUserId) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean N(long j10) {
        ArrayList arrayList = (ArrayList) this.f15898b.f(j10);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((s6) kf.k0.i(1, arrayList)).F;
        }
        return false;
    }

    public final void O(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j10));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j10);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i10 = this.f15897a;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getPeerStories, new t5(this, j10, 0));
    }

    public final void P() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.f15897a).sendRequest(tL_contacts_getBlocked, new s5(this, 3));
    }

    public final void Q(boolean z4) {
        String str;
        boolean z10;
        if (!z4 || !this.f15911r) {
            if ((!z4 && this.f15910q) || this.f15907n) {
                return;
            }
            boolean z11 = true;
            if (z4) {
                this.f15911r = true;
            } else {
                this.f15910q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z4) {
                str = this.f15917y;
            } else {
                str = this.f15908o;
            }
            if (z4) {
                z10 = this.f15918z;
            } else {
                z10 = this.f15909p;
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
            tL_stories_getAllStories.include_hidden = z4;
            ConnectionsManager.getInstance(this.f15897a).sendRequest(tL_stories_getAllStories, new z5(this, z4, tL_stories_getAllStories, z11));
        }
    }

    public final void R() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f15897a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new s5(this, 2));
        }
    }

    public final void S(final TL_stories.PeerStories peerStories, final boolean z4) {
        int i10;
        if (peerStories != null) {
            final long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (z4) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            final long j10 = peerDialogId * i10;
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.D;
            if (!hashSet.contains(valueOf)) {
                ArrayList<Integer> arrayList = null;
                for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                    if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i11).f19394id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j10));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f19401id = arrayList;
                    int i12 = this.f15897a;
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(peerDialogId);
                    ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new y5(t6.this, j10, z4, peerStories, peerDialogId, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void T() {
        if (this.A) {
            this.f15907n = true;
            w5 w5Var = new w5(this, 1);
            g7 g7Var = this.f15904k;
            g7Var.f15346b.getStorageQueue().postRunnable(new n4(12, g7Var, w5Var));
        } else {
            Q(false);
            Q(true);
        }
        this.A = false;
    }

    public final void U(int i10, long j10) {
        AndroidUtilities.runOnUIThread(new lh.a9(this, j10, i10, 1));
    }

    public final boolean V(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z4) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i10 = this.f15900f.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i10, storyItem.f19394id));
            int i11 = this.f15897a;
            NotificationsController.getInstance(i11).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.f15900f.put(peerDialogId, max);
            if (max > i10) {
                if (!z4) {
                    this.f15904k.i(max, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i11).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.f19394id;
                ConnectionsManager.getInstance(i11).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void W(long j10, TL_stories.StoryItem storyItem) {
        boolean z4;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i10 = this.f15897a;
            if (DownloadController.getInstance(i10).canPreloadStories()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                storyItem.dialogId = j10;
                if (z4) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000);
                    FileLoader.getInstance(i10).loadFile(storyItem.media.getDocument(), storyItem, 0, 1);
                    FileLoader.getInstance(i10).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    TLRPC.MessageMedia messageMedia2 = storyItem.media;
                    if (messageMedia2 == null) {
                        photo = null;
                    } else {
                        photo = messageMedia2.photo;
                    }
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        FileLoader.getInstance(i10).loadFile(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i11 = 0; i11 < Math.min(2, storyItem.media_areas.size()); i11++) {
                        if (storyItem.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            mg.q0 d = mg.q0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i11)).reaction);
                            if (d.f14095f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f14095f);
                                if (tL_availableReaction != null) {
                                    FileLoader.getInstance(i10).loadFile(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(1, i10, d.f14096g);
                                l5Var.f26589m = true;
                                l5Var.v();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void X(TL_stories.PeerStories peerStories) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                break;
            } else if (peerStories.stories.get(i11).f19394id > peerStories.max_read_id) {
                i10 = i11;
                break;
            } else {
                i11++;
            }
        }
        if (!peerStories.stories.isEmpty()) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            W(peerDialogId, peerStories.stories.get(i10));
            if (i10 > 0) {
                W(peerDialogId, peerStories.stories.get(i10 - 1));
            }
            if (i10 < peerStories.stories.size() - 1) {
                W(peerDialogId, peerStories.stories.get(i10 + 1));
            }
        }
    }

    public final void Y(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z4, boolean z10, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.f15901g;
        if (!z11) {
            if (!z4) {
                arrayList3.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < tL_stories_allStories.peer_stories.size(); i10++) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i10).peer));
            }
            FileLog.d("StoriesController cache=" + z10 + " hidden=" + z4 + " processAllStoriesResponse {" + ((Object) sb) + "}");
        }
        int i11 = this.f15897a;
        MessagesController.getInstance(i11).putUsers(tL_stories_allStories.users, z10);
        MessagesController.getInstance(i11).putChats(tL_stories_allStories.chats, z10);
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        for (int i12 = 0; i12 < tL_stories_allStories.peer_stories.size(); i12++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i12);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i13 = 0;
            while (i13 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i13);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(i11).processDeleteStory(peerDialogId, storyItem.f19394id);
                    peerStories.stories.remove(i13);
                    i13--;
                }
                i13++;
            }
            if (!peerStories.stories.isEmpty()) {
                b0(peerDialogId, peerStories);
                for (int i14 = 0; i14 < 2; i14++) {
                    if (i14 == 0) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList3;
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i15)).peer) == peerDialogId) {
                            arrayList.remove(i15);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        if (user.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            X(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        if (chat.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            X(peerStories);
                        }
                    }
                }
            } else {
                this.f15902i.l(peerDialogId);
            }
        }
        if (!z10) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            cg.n0 n0Var = new cg.n0(18);
            g7 g7Var = this.f15904k;
            g7Var.f15346b.getStorageQueue().postRunnable(new cg.x0(g7Var, arrayList4, z11, z4, n0Var, 3));
        }
        ah.b bVar = this.K;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public final void Z(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        if (i10 == 0) {
            FileLog.d("StoriesController can't update story dialogId == 0");
            return;
        }
        g7 g7Var = this.f15904k;
        if (i10 > 0) {
            user = MessagesController.getInstance(this.f15897a).getUser(Long.valueOf(peerDialogId));
            if (user != null && (M(user) || user.self)) {
                g7Var.f15346b.getStorageQueue().postRunnable(new n4(10, g7Var, tL_updateStory));
            }
        } else {
            g7Var.f15346b.getStorageQueue().postRunnable(new n4(10, g7Var, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new lh.c2(this, peerDialogId, tL_updateStory, user, 8));
    }

    public final void a0(long j10, TL_stories.PeerStories peerStories) {
        b0(j10, peerStories);
        g7 g7Var = this.f15904k;
        int i10 = this.f15897a;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (M(user) || user.self) {
                g7Var.f15346b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 0));
            }
        } else if (ChatObject.isInChat(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)))) {
            g7Var.f15346b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 0));
        }
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        h6 B = B(j10, true);
        B.getClass();
        t6 t6Var = B.f15370j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f15364a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f15365b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f19394id));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i10));
            } else if (!arrayList2.contains(Integer.valueOf(i10))) {
                storyItem.albums.add(Integer.valueOf(i10));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        l6 A = t6Var.A(B.f15365b, 0, i10, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            l6 A2 = t6Var.A(B.f15365b, 0, ((m6) obj3).f15598a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.f15902i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories.stories.get(i10).f19394id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).f19394id == i11 && (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i10, peerStories2.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        hVar.k(peerStories, j10);
    }

    public final void c(int i10, long j10, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i10, j10, arrayList);
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        h6 B = B(j10, true);
        B.getClass();
        t6 t6Var = B.f15370j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f15364a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f15365b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f19394id));
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i10));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        l6 A = t6Var.A(B.f15365b, 0, i10, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            l6 A2 = t6Var.A(B.f15365b, 0, ((m6) obj3).f15598a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void d(long j10, s6 s6Var, a0.h hVar, boolean z4) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z4 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.y3.l(j10, hVar);
        }
        arrayList.add(s6Var);
    }

    public final void d0(long j10, int i10, h5.d dVar) {
        TL_stories.PeerStories y10 = y(j10);
        if (y10 != null) {
            for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                if (y10.stories.get(i11).f19394id == i10 && !(y10.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                    dVar.accept(y10.stories.get(i11));
                    return;
                }
            }
        }
        long j11 = (i10 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            dVar.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f19401id.add(Integer.valueOf(i10));
        int i12 = this.f15897a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new b6(this, j11, dVar));
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = this.f15897a;
        if (peerDialogId == UserConfig.getInstance(i10).getClientUserId()) {
            return;
        }
        int i11 = 0;
        boolean z4 = false;
        while (true) {
            arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
                z4 = true;
            }
            i11++;
        }
        if (!z4) {
            arrayList.add(peerStories);
        }
        MessagesController.getInstance(i10).checkArchiveFolder();
    }

    public final void e0(long j10, boolean z4) {
        LongSparseIntArray longSparseIntArray = this.f15903j;
        if (z4) {
            longSparseIntArray.put(j10, 1);
        } else {
            longSparseIntArray.delete(j10);
        }
    }

    public final void f0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i10 = this.f15897a;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stealthModeChanged, new Object[0]);
        SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.bytesToHex(serializedData.toByteArray())).apply();
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat chat;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        ArrayList arrayList2;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = this.f15897a;
        TLRPC.User user = null;
        if (peerDialogId > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f15901g;
            z4 = true;
            if (i11 < arrayList.size()) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
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
            } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == peerDialogId) {
                arrayList2.remove(i12);
                z10 = true;
                break;
            } else {
                i12++;
            }
        }
        if ((user == null || !user.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z4 = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z4 + " did=" + peerDialogId);
        }
        if (z4) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z10) {
            O(peerDialogId);
        }
        MessagesController.getInstance(i10).checkArchiveFolder();
    }

    public final void g0(long j10, TL_stories.StoryItem storyItem, mg.q0 q0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f19394id;
        int i10 = this.f15897a;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (q0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (q0Var.f14096g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = q0Var.f14096g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (q0Var.f14095f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = q0Var.f14095f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        p0(j10, storyItem, false);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendReaction, new p5(1));
    }

    public final boolean h(long j10) {
        TLRPC.Chat chat;
        if (j10 >= 0 || (chat = MessagesController.getInstance(this.f15897a).getChat(Long.valueOf(-j10))) == null) {
            return false;
        }
        if (!chat.creator) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
            if (tL_chatAdminRights == null || !tL_chatAdminRights.edit_stories) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i(long j10) {
        if (UserConfig.getInstance(this.f15897a).getClientUserId() != j10 && !h(j10)) {
            return false;
        }
        return true;
    }

    public final void i0(long j10, boolean z4, boolean z10) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f15901g;
        if (z4) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer) == j10) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i10);
                    break;
                }
                i10++;
            } else {
                peerStories = null;
                break;
            }
        }
        if (peerStories != null) {
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == j10) {
                        break;
                    }
                    i11++;
                } else {
                    arrayList2.add(0, peerStories);
                    ah.b bVar = this.K;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    bVar.run();
                    break;
                }
            }
        }
        int i12 = this.f15897a;
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i12).checkArchiveFolder();
        if (z10) {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                user.stories_hidden = z4;
                MessagesStorage.getInstance(i12).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i12).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                chat.stories_hidden = z4;
                MessagesStorage.getInstance(i12).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i12).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z4;
            ConnectionsManager.getInstance(i12).sendRequest(tL_stories_togglePeerStoriesHidden, new p5(1));
        }
    }

    public final boolean j(long j10) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f15897a;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isBoostSupported(chat)) {
                return false;
            }
            if (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i11 > 0 && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null && user.bot && user.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j10, boolean z4, boolean z10) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i10 = this.f15897a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            this.M.k(Boolean.valueOf(z4), j10);
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.L;
            if (hashSet.contains(valueOf) != z4) {
                if (z4) {
                    hashSet.add(Long.valueOf(j10));
                    this.N++;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    this.N--;
                }
            }
            if (z10) {
                if (z4) {
                    TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                    tL_contacts_block.my_stories_from = true;
                    tL_contacts_block.f19202id = inputPeer;
                    tL_contacts_unblock = tL_contacts_block;
                } else {
                    TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                    tL_contacts_unblock2.my_stories_from = true;
                    tL_contacts_unblock2.f19207id = inputPeer;
                    tL_contacts_unblock = tL_contacts_unblock2;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_unblock, null);
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
        }
    }

    public final void k(long j10, h5.d dVar, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i10 = this.f15897a;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new lh.f(this, z4, j10, dVar, f6Var), 1024);
    }

    public final void k0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder s6 = android.support.v4.media.a.s(j10, "updateDeletedStoriesInLists ", " storyItems[");
        s6.append(list.size());
        s6.append("] {");
        s6.append(h0(list));
        s6.append("}");
        FileLog.d(s6.toString());
        l6 A = A(j10, 0, -1, false);
        t6 t6Var = this;
        l6 A2 = t6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i10 = 0;
        h6 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l6 A3 = t6Var.A(j10, 0, ((m6) obj).f15598a, false);
                if (A3 != null) {
                    A3.A(list);
                }
                t6Var = this;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int i10;
        int i11 = 0;
        boolean z4 = false;
        while (true) {
            int size = arrayList.size();
            i10 = this.f15897a;
            if (i11 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i11);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                if (m7.w(i10, peerStories.stories.get(i12))) {
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty() && !K(peerDialogId)) {
                this.f15902i.l(peerDialogId);
                arrayList.remove(peerStories);
                z4 = true;
            }
            i11++;
        }
        if (z4) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final void l0(long j10, List list, boolean z4) {
        TL_stories.PeerStories peerStories;
        boolean z10;
        int i10 = this.f15897a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                if (userFull.stories == null) {
                    if (z4) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        userFull.stories = tL_peerStories;
                        tL_peerStories.peer = MessagesController.getInstance(i10).getPeer(j10);
                        userFull.stories.max_read_id = x(j10);
                    } else {
                        return;
                    }
                }
                peerStories = userFull.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                if (chatFull.stories == null) {
                    if (z4) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        chatFull.stories = tL_peerStories2;
                        tL_peerStories2.peer = MessagesController.getInstance(i10).getPeer(j10);
                        chatFull.stories.max_read_id = x(j10);
                    } else {
                        return;
                    }
                }
                peerStories = chatFull.stories;
            } else {
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i12).f19394id == storyItem.f19394id) {
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
                            kf.k0.t(storyItem.f19394id, new StringBuilder("StoriesController update story for full peer storyId="));
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
                    kf.k0.t(storyItem.f19394id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z4) {
                    kf.k0.t(storyItem.f19394id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories != null && peerStories.stories != null) {
            int i10 = 0;
            while (i10 < peerStories.stories.size()) {
                if (m7.w(this.f15897a, peerStories.stories.get(i10))) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void m0(long j10, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f15902i.f(j10)) != null) {
            FileLog.d("StoriesController update stories from full peer " + j10);
            for (int i10 = 0; i10 < peerStories2.stories.size(); i10++) {
                if (peerStories2.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories2.stories.get(i10).f19394id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i12).f19394id == i11 && (peerStories.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories2.stories.set(i10, peerStories.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
    }

    public final boolean n(org.telegram.tgnet.TLRPC.TL_error r8) {
        throw new UnsupportedOperationException("Method not decompiled: nh.t6.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j10, List list, boolean z4) {
        ArrayList arrayList;
        StringBuilder s6 = android.support.v4.media.a.s(j10, "updateStoriesInLists ", " storyItems[");
        s6.append(list.size());
        s6.append("] {");
        s6.append(h0(list));
        s6.append("}");
        FileLog.d(s6.toString());
        l6 A = A(j10, 0, -1, false);
        t6 t6Var = this;
        l6 A2 = t6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.D(list, z4);
        }
        if (A2 != null) {
            A2.D(list, z4);
        }
        ArrayList arrayList2 = t6Var.I;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((f6) obj).D(list, z4);
        }
        h6 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                l6 A3 = t6Var.A(j10, 0, ((m6) arrayList.get(i10)).f15598a, false);
                if (A3 != null) {
                    A3.D(list, z4);
                }
                t6Var = this;
                i10 = i12;
            }
        }
    }

    public final n6 o() {
        int i10;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i11 = this.f15897a;
        if (UserConfig.getInstance(i11).isPremium()) {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitPremium;
        } else {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitDefault;
        }
        ArrayList arrayList2 = (ArrayList) this.f15899c.f(UserConfig.getInstance(i11).getClientUserId());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories y10 = y(UserConfig.getInstance(i11).getClientUserId());
        if (y10 != null && (arrayList = y10.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i10) {
            return new n6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i11).getInputPeer(UserConfig.getInstance(i11).getClientUserId());
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_canSendStory, new s5(this, 1), 1024);
        return null;
    }

    public final void o0(long j10, ArrayList arrayList, boolean z4, d3 d3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y10 = y(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z4;
                togglepinned.f19408id.add(Integer.valueOf(storyItem.f19394id));
                if (y10 != null) {
                    for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                        if (y10.stories.get(i11).f19394id == storyItem.f19394id) {
                            y10.stories.get(i11).pinned = z4;
                            this.f15904k.k(j10, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        n0(j10, arrayList, false);
        l0(j10, arrayList, false);
        togglepinned.pinned = z4;
        int i12 = this.f15897a;
        togglepinned.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(togglepinned, new lh.v6(1, d3Var));
    }

    public final void p(int i10, long j10) {
        String str = "229:" + j10 + ":" + i10;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f15913t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i11 = this.f15897a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        tL_stories_getStoriesByID.f19401id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new lh.u(this, i10, str, j10, 2));
    }

    public final void p0(long j10, TL_stories.StoryItem storyItem, boolean z4) {
        String str;
        StringBuilder s6 = android.support.v4.media.a.s(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f19394id + "@" + storyItem.dialogId;
        }
        s6.append(str);
        FileLog.d(s6.toString());
        n0(j10, Collections.singletonList(storyItem), z4);
        this.f15904k.k(j10, storyItem);
        l0(j10, Collections.singletonList(storyItem), false);
    }

    public final void q() {
        this.f15912s = false;
        this.f15917y = "";
        this.f15908o = "";
        this.f15905l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        ph.t0 t0Var = this.f15915w;
        Objects.requireNonNull(t0Var);
        AndroidUtilities.runOnUIThread(new n5(t0Var, 2));
        T();
        if (this.f15912s) {
            return;
        }
        ConnectionsManager.getInstance(this.f15897a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new s5(this, 0));
    }

    public final void q0(long j10, int i10, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i10, j10);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            p0(j10, u10, false);
        }
    }

    public final void r(long j10, String str, Utilities.Callback callback) {
        h6 B = B(j10, true);
        int i10 = B.f15364a;
        if (B.f15369i) {
            return;
        }
        B.f15369i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.f15365b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_createAlbum, new dg.d3(14, B, callback));
    }

    public final void s(long j10, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i10 = this.f15897a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        a0.h hVar = this.f15902i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i12).f19394id == storyItem.f19394id) {
                            peerStories2.stories.remove(i12);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j10);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                tL_stories_deleteStories.f19397id.add(Integer.valueOf(storyItem.f19394id));
            }
        }
        if (j10 < 0 ? !((chatFull = MessagesController.getInstance(i10).getChatFull(-j10)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(i10).getUserFull(j10)) == null || (peerStories = userFull.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i13);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i14).f19394id == storyItem2.f19394id) {
                        peerStories2.stories.remove(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_deleteStories, new s5(this, 4));
        k0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f19397id;
        g7 g7Var = this.f15904k;
        g7Var.f15346b.getStorageQueue().postRunnable(new i5.v(g7Var, arrayList2, j10, 8));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final s6 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (s6) hashMap.get(Integer.valueOf(storyItem.f19394id));
        }
        return null;
    }

    public final TL_stories.StoryItem u(int i10, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15902i.f(j10);
        if (peerStories != null) {
            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                if (peerStories.stories.get(i11).f19394id == i10) {
                    return peerStories.stories.get(i11);
                }
            }
            return null;
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z4;
        TLRPC.User user;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId > 0 && (user = MessagesController.getInstance(this.f15897a).getUser(Long.valueOf(peerDialogId))) != null && !M(user)) {
                arrayList.remove(i10);
                i10--;
                z4 = true;
            } else {
                z4 = false;
            }
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!z4 && peerStories.stories.isEmpty() && !K(peerDialogId)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final String w(int i10, long j10) {
        m6 b10;
        h6 B = B(j10, false);
        if (B != null && (b10 = B.b(i10)) != null) {
            return b10.f15599b;
        }
        return null;
    }

    public final int x(long j10) {
        TL_stories.PeerStories y10 = y(j10);
        if (y10 == null) {
            y10 = z(j10);
        }
        if (y10 != null) {
            return Math.max(y10.max_read_id, this.f15900f.get(j10, 0));
        }
        return this.f15900f.get(j10, 0);
    }

    public final TL_stories.PeerStories y(long j10) {
        return (TL_stories.PeerStories) this.f15902i.f(j10);
    }

    public final TL_stories.PeerStories z(long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.f15897a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }
}
