package di;

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
public final class h7 {
    public static final Comparator X = Comparator$CC.comparingInt(new ag.e(8));
    public TL_stories.TL_storiesStealthMode B;
    public final ag.r0 K;
    public int N;
    public boolean R;
    public b7 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f8630a;
    public final u7 f8637k;
    public final SharedPreferences f8638l;
    public boolean f8640n;
    public String f8641o;
    public boolean f8642p;
    public boolean f8643q;
    public boolean f8644r;
    public boolean f8645s;
    public final HashSet f8646t;
    public int f8647u;
    public int v;
    public final fi.a1 f8648w;
    public String f8650y;
    public final a0.h f8631b = new a0.h();
    public final a0.h f8632c = new a0.h();
    public int d = 0;
    public final a0.h e = new a0.h();
    public LongSparseIntArray f8633f = new LongSparseIntArray();
    public final ArrayList f8634g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h f8635i = new a0.h();
    public final LongSparseIntArray f8636j = new LongSparseIntArray();
    public final a0.h f8639m = new a0.h();
    public final a0.h f8649x = new a0.h();
    public boolean f8651z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final bi.p5 J = new bi.p5(this, 1);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public h7(int i10) {
        this.f8641o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f8630a = i10;
        ?? obj = new Object();
        obj.f9234a = i10;
        obj.f9235b = MessagesStorage.getInstance(i10);
        this.f8637k = obj;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        this.f8638l = mainSettings;
        this.f8641o = mainSettings.getString("last_stories_state", "");
        this.f8650y = mainSettings.getString("last_stories_state_hidden", "");
        this.v = mainSettings.getInt("total_stores_hidden", 0);
        this.f8647u = mainSettings.getInt("total_stores", 0);
        this.f8645s = mainSettings.getBoolean("read_loaded", false);
        this.f8646t = new HashSet(mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
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
        u7 u7Var = this.f8637k;
        u7Var.f9235b.getStorageQueue().postRunnable(new b4(12, u7Var, new h6(this, 1)));
        this.K = new ag.r0(this, i10, 5);
        this.f8648w = new fi.a1(i10);
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
                    str = str + storyItem.f22266id + "@" + storyItem.dialogId;
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
                str = str + ((TL_stories.StoryItem) list.get(i10)).f22266id + "@" + ((TL_stories.StoryItem) list.get(i10)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final z6 A(long j10, int i10, int i11, boolean z10) {
        if (i10 == 0 && i11 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            z6 z6Var = (z6) hashMap3.get(Integer.valueOf(i11));
            if (z6Var == null && z10) {
                z6 z6Var2 = new z6(this.f8630a, j10, i10, i11, new h6(this, 0));
                hashMap3.put(Integer.valueOf(i11), z6Var2);
                return z6Var2;
            }
            return z6Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i10] == null) {
            hashMapArr[i10] = new HashMap();
        }
        z6 z6Var3 = (z6) hashMapArr[i10].get(Long.valueOf(j10));
        if (z6Var3 == null && z10) {
            if (i10 == 4) {
                HashMap hashMap4 = hashMapArr[i10];
                Long valueOf2 = Long.valueOf(j10);
                s6 s6Var = new s6(this.f8630a, j10, null, new h6(this, 0));
                hashMap4.put(valueOf2, s6Var);
                return s6Var;
            }
            HashMap hashMap5 = hashMapArr[i10];
            Long valueOf3 = Long.valueOf(j10);
            z6 z6Var4 = new z6(this.f8630a, j10, i10, i11, new h6(this, 0));
            hashMap5.put(valueOf3, z6Var4);
            return z6Var4;
        }
        return z6Var3;
    }

    public final v6 B(long j10, boolean z10) {
        a0.h hVar = this.F;
        v6 v6Var = (v6) hVar.f(j10);
        if (v6Var == null && z10) {
            v6 v6Var2 = new v6(this.f8630a, j10, this);
            hVar.k(v6Var2, j10);
            return v6Var2;
        }
        return v6Var;
    }

    public final int C(boolean z10) {
        if (z10) {
            if (this.f8651z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f8642p) {
            return Math.max(1, this.f8647u);
        } else {
            return this.f8634g.size();
        }
    }

    public final int D(int i10, long j10) {
        if (j10 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j10 == UserConfig.getInstance(this.f8630a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f8631b.f(j10))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f8633f.get(j10, 0));
        boolean z10 = false;
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i10 == 0 || peerStories.stories.get(i11).f22266id == i10) && peerStories.stories.get(i11).f22266id > max) {
                if (peerStories.stories.get(i11).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        if (N(j10) || !z10) {
            return 0;
        }
        return 1;
    }

    public final ArrayList E(long j10) {
        return (ArrayList) this.f8631b.f(j10);
    }

    public final boolean F(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
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
            ArrayList arrayList = this.f8634g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer) == UserConfig.getInstance(this.f8630a).clientUserId)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        long j10 = UserConfig.getInstance(this.f8630a).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.isNullOrEmpty((Collection) this.f8631b.f(j10))) {
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
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean J(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        if (j10 == UserConfig.getInstance(this.f8630a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f8631b.f(j10))) {
            return true;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i10);
            if (storyItem != null && storyItem.f22266id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(long j10) {
        ArrayList arrayList = (ArrayList) this.f8631b.f(j10);
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
            if (user.contact || user.f22176id == MessagesController.getInstance(this.f8630a).storiesChangelogUserId) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean N(long j10) {
        ArrayList arrayList = (ArrayList) this.f8631b.f(j10);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((g7) ic.a.g(1, arrayList)).I;
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
        int i10 = this.f8630a;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getPeerStories, new j6(this, j10, 0));
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
        ConnectionsManager.getInstance(this.f8630a).sendRequest(tL_contacts_getBlocked, new g6(this, 3));
    }

    public final void Q(boolean z10) {
        String str;
        boolean z11;
        if (!z10 || !this.f8644r) {
            if ((!z10 && this.f8643q) || this.f8640n) {
                return;
            }
            boolean z12 = true;
            if (z10) {
                this.f8644r = true;
            } else {
                this.f8643q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z10) {
                str = this.f8650y;
            } else {
                str = this.f8641o;
            }
            if (z10) {
                z11 = this.f8651z;
            } else {
                z11 = this.f8642p;
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
            ConnectionsManager.getInstance(this.f8630a).sendRequest(tL_stories_getAllStories, new o6(this, z10, tL_stories_getAllStories, z12));
        }
    }

    public final void R() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f8630a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new g6(this, 2));
        }
    }

    public final void S(final TL_stories.PeerStories peerStories, final boolean z10) {
        int i10;
        if (peerStories != null) {
            final long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (z10) {
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
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i11).f22266id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j10));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f22273id = arrayList;
                    int i12 = this.f8630a;
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(peerDialogId);
                    ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new m6(h7.this, j10, z10, peerStories, peerDialogId, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void T() {
        if (this.A) {
            this.f8640n = true;
            h6 h6Var = new h6(this, 2);
            u7 u7Var = this.f8637k;
            u7Var.f9235b.getStorageQueue().postRunnable(new b4(11, u7Var, h6Var));
        } else {
            Q(false);
            Q(true);
        }
        this.A = false;
    }

    public final void U(int i10, long j10) {
        AndroidUtilities.runOnUIThread(new bi.ga(this, j10, i10, 1));
    }

    public final boolean V(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i10 = this.f8633f.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i10, storyItem.f22266id));
            int i11 = this.f8630a;
            NotificationsController.getInstance(i11).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.f8633f.put(peerDialogId, max);
            if (max > i10) {
                if (!z10) {
                    this.f8637k.i(max, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i11).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.f22266id;
                ConnectionsManager.getInstance(i11).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void W(long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i10 = this.f8630a;
            if (DownloadController.getInstance(i10).canPreloadStories()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                storyItem.dialogId = j10;
                if (z10) {
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
                            bh.x0 d = bh.x0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i11)).reaction);
                            if (d.f4208f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f4208f);
                                if (tL_availableReaction != null) {
                                    FileLoader.getInstance(i10).loadFile(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(1, i10, d.f4209g);
                                t5Var.f32854m = true;
                                t5Var.v();
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
            } else if (peerStories.stories.get(i11).f22266id > peerStories.max_read_id) {
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

    public final void Y(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.f8634g;
        if (!z12) {
            if (!z10) {
                arrayList3.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < tL_stories_allStories.peer_stories.size(); i10++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i10).peer));
            }
            FileLog.d("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i11 = this.f8630a;
        MessagesController.getInstance(i11).putUsers(tL_stories_allStories.users, z11);
        MessagesController.getInstance(i11).putChats(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        for (int i12 = 0; i12 < tL_stories_allStories.peer_stories.size(); i12++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i12);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i13 = 0;
            while (i13 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i13);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(i11).processDeleteStory(peerDialogId, storyItem.f22266id);
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
                this.f8635i.l(peerDialogId);
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            ag.c cVar = new ag.c(12);
            u7 u7Var = this.f8637k;
            u7Var.f9235b.getStorageQueue().postRunnable(new i6(u7Var, arrayList4, z12, z10, cVar, 1));
        }
        ag.r0 r0Var = this.K;
        AndroidUtilities.cancelRunOnUIThread(r0Var);
        r0Var.run();
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
        u7 u7Var = this.f8637k;
        if (i10 > 0) {
            user = MessagesController.getInstance(this.f8630a).getUser(Long.valueOf(peerDialogId));
            if (user != null && (M(user) || user.self)) {
                u7Var.f9235b.getStorageQueue().postRunnable(new b4(10, u7Var, tL_updateStory));
            }
        } else {
            u7Var.f9235b.getStorageQueue().postRunnable(new b4(10, u7Var, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new bi.y2(this, peerDialogId, tL_updateStory, user, 8));
    }

    public final void a0(long j10, TL_stories.PeerStories peerStories) {
        b0(j10, peerStories);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        u7 u7Var = this.f8637k;
        int i11 = this.f8630a;
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
            if (M(user) || user.self) {
                u7Var.f9235b.getStorageQueue().postRunnable(new s7(u7Var, peerStories, 0));
            }
        } else if (ChatObject.isInChat(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)))) {
            u7Var.f9235b.getStorageQueue().postRunnable(new s7(u7Var, peerStories, 0));
        }
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        v6 B = B(j10, true);
        B.getClass();
        h7 h7Var = B.f9266j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f9260a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9261b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f22266id));
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
        z6 A = h7Var.A(B.f9261b, 0, i10, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            z6 A2 = h7Var.A(B.f9261b, 0, ((a7) obj3).f8375a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.f8635i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories.stories.get(i10).f22266id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).f22266id == i11 && (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
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
        v6 B = B(j10, true);
        B.getClass();
        h7 h7Var = B.f9266j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f9260a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9261b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f22266id));
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
        z6 A = h7Var.A(B.f9261b, 0, i10, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            z6 A2 = h7Var.A(B.f9261b, 0, ((a7) obj3).f8375a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void d(long j10, g7 g7Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.t.k(j10, hVar);
        }
        arrayList.add(g7Var);
    }

    public final void d0(long j10, int i10, Utilities.Callback callback) {
        TL_stories.PeerStories y3 = y(j10);
        if (y3 != null) {
            for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                if (y3.stories.get(i11).f22266id == i10 && !(y3.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                    callback.run(y3.stories.get(i11));
                    return;
                }
            }
        }
        long j11 = (i10 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            callback.run(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f22273id.add(Integer.valueOf(i10));
        int i12 = this.f8630a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new q6(this, j11, callback));
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = this.f8630a;
        if (peerDialogId == UserConfig.getInstance(i10).getClientUserId()) {
            return;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        MessagesController.getInstance(i10).checkArchiveFolder();
    }

    public final void e0(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f8636j;
        if (z10) {
            longSparseIntArray.put(j10, 1);
        } else {
            longSparseIntArray.delete(j10);
        }
    }

    public final void f0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i10 = this.f8630a;
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
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        int i11 = this.f8630a;
        TLRPC.User user = null;
        if (i10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList = this.f8634g;
            z10 = true;
            if (i12 < arrayList.size()) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer) == peerDialogId) {
                    arrayList.remove(i12);
                    z11 = true;
                    break;
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        int i13 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i13 >= arrayList2.size()) {
                break;
            } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i13)).peer) == peerDialogId) {
                arrayList2.remove(i13);
                z11 = true;
                break;
            } else {
                i13++;
            }
        }
        if ((user == null || !user.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z10 = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z10 + " did=" + peerDialogId);
        }
        if (z10) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z11) {
            O(peerDialogId);
        }
        MessagesController.getInstance(i11).checkArchiveFolder();
    }

    public final void g0(long j10, TL_stories.StoryItem storyItem, bh.x0 x0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f22266id;
        int i10 = this.f8630a;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (x0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (x0Var.f4209g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = x0Var.f4209g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (x0Var.f4208f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = x0Var.f4208f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        p0(j10, storyItem, false);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendReaction, new d6(1));
    }

    public final boolean h(long j10) {
        TLRPC.Chat chat;
        if (j10 >= 0 || (chat = MessagesController.getInstance(this.f8630a).getChat(Long.valueOf(-j10))) == null) {
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
        if (UserConfig.getInstance(this.f8630a).getClientUserId() != j10 && !h(j10)) {
            return false;
        }
        return true;
    }

    public final void i0(long j10, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f8634g;
        if (z10) {
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
                    ag.r0 r0Var = this.K;
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                    r0Var.run();
                    break;
                }
            }
        }
        int i12 = this.f8630a;
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i12).checkArchiveFolder();
        if (z11) {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                user.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i12).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                chat.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i12).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i12).sendRequest(tL_stories_togglePeerStoriesHidden, new d6(1));
        }
    }

    public final boolean j(long j10) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f8630a;
        if (i10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
            if (chat == null || !ChatObject.isBoostSupported(chat)) {
                return false;
            }
            if (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i10 > 0 && (user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10))) != null && user.bot && user.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j10, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i10 = this.f8630a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            this.M.k(Boolean.valueOf(z10), j10);
            Long valueOf = Long.valueOf(j10);
            HashSet hashSet = this.L;
            if (hashSet.contains(valueOf) != z10) {
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                    this.N++;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    this.N--;
                }
            }
            if (z11) {
                if (z10) {
                    TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                    tL_contacts_block.my_stories_from = true;
                    tL_contacts_block.f22070id = inputPeer;
                    tL_contacts_unblock = tL_contacts_block;
                } else {
                    TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                    tL_contacts_unblock2.my_stories_from = true;
                    tL_contacts_unblock2.f22075id = inputPeer;
                    tL_contacts_unblock = tL_contacts_unblock2;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_unblock, null);
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
        }
    }

    public final void k(long j10, Utilities.Callback callback, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i10 = this.f8630a;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new bi.k(this, z10, j10, callback, u6Var), 1024);
    }

    public final void k0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder t10 = a1.g.t(j10, "updateDeletedStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(h0(list));
        t10.append("}");
        FileLog.d(t10.toString());
        z6 A = A(j10, 0, -1, false);
        h7 h7Var = this;
        z6 A2 = h7Var.A(j10, 1, -1, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i10 = 0;
        v6 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z6 A3 = h7Var.A(j10, 0, ((a7) obj).f8375a, false);
                if (A3 != null) {
                    A3.A(list);
                }
                h7Var = this;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i10 = this.f8630a;
            if (i11 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i11);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                if (a8.w(i10, peerStories.stories.get(i12))) {
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty() && !K(peerDialogId)) {
                this.f8635i.l(peerDialogId);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final void l0(long j10, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f8630a;
        if (i10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull != null) {
                if (userFull.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        userFull.stories = tL_peerStories;
                        tL_peerStories.peer = MessagesController.getInstance(i11).getPeer(j10);
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
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
            if (chatFull != null) {
                if (chatFull.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        chatFull.stories = tL_peerStories2;
                        tL_peerStories2.peer = MessagesController.getInstance(i11).getPeer(j10);
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
        for (int i12 = 0; i12 < list.size(); i12++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i13).f22266id == storyItem.f22266id) {
                        z11 = true;
                        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i13);
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i13);
                            storyItem = f(storyItem2, storyItem);
                            peerStories.stories.set(i13, storyItem);
                            if (storyItem.attachPath == null) {
                                storyItem.attachPath = storyItem2.attachPath;
                            }
                            if (storyItem.firstFramePath == null) {
                                storyItem.firstFramePath = storyItem2.firstFramePath;
                            }
                            org.telegram.messenger.t.o(storyItem.f22266id, new StringBuilder("StoriesController update story for full peer storyId="));
                        }
                    } else {
                        i13++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.messenger.t.o(storyItem.f22266id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    org.telegram.messenger.t.o(storyItem.f22266id, new StringBuilder("StoriesController add new story for full peer storyId="));
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
                if (a8.w(this.f8630a, peerStories.stories.get(i10))) {
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
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f8635i.f(j10)) != null) {
            FileLog.d("StoriesController update stories from full peer " + j10);
            for (int i10 = 0; i10 < peerStories2.stories.size(); i10++) {
                if (peerStories2.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories2.stories.get(i10).f22266id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i12).f22266id == i11 && (peerStories.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
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
        throw new UnsupportedOperationException("Method not decompiled: di.h7.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j10, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder t10 = a1.g.t(j10, "updateStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(h0(list));
        t10.append("}");
        FileLog.d(t10.toString());
        z6 A = A(j10, 0, -1, false);
        h7 h7Var = this;
        z6 A2 = h7Var.A(j10, 1, -1, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = h7Var.I;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((t6) obj).D(list, z10);
        }
        v6 B = B(j10, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                z6 A3 = h7Var.A(j10, 0, ((a7) arrayList.get(i10)).f8375a, false);
                if (A3 != null) {
                    A3.D(list, z10);
                }
                h7Var = this;
                i10 = i12;
            }
        }
    }

    public final b7 o() {
        int i10;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i11 = this.f8630a;
        if (UserConfig.getInstance(i11).isPremium()) {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitPremium;
        } else {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitDefault;
        }
        ArrayList arrayList2 = (ArrayList) this.f8632c.f(UserConfig.getInstance(i11).getClientUserId());
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        TL_stories.PeerStories y3 = y(UserConfig.getInstance(i11).getClientUserId());
        if (y3 != null && (arrayList = y3.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i10) {
            return new b7(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i11).getInputPeer(UserConfig.getInstance(i11).getClientUserId());
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_canSendStory, new g6(this, 1), 1024);
        return null;
    }

    public final void o0(long j10, ArrayList arrayList, boolean z10, k3 k3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y3 = y(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.f22280id.add(Integer.valueOf(storyItem.f22266id));
                if (y3 != null) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f22266id == storyItem.f22266id) {
                            y3.stories.get(i11).pinned = z10;
                            this.f8637k.k(j10, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        n0(j10, arrayList, false);
        l0(j10, arrayList, false);
        togglepinned.pinned = z10;
        int i12 = this.f8630a;
        togglepinned.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(togglepinned, new bi.b9(1, k3Var));
    }

    public final void p(int i10, long j10) {
        String str = "233:" + j10 + ":" + i10;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f8646t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i11 = this.f8630a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        tL_stories_getStoriesByID.f22273id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new bi.d0(this, i10, str, j10, 2));
    }

    public final void p0(long j10, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder t10 = a1.g.t(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f22266id + "@" + storyItem.dialogId;
        }
        t10.append(str);
        FileLog.d(t10.toString());
        n0(j10, Collections.singletonList(storyItem), z10);
        this.f8637k.k(j10, storyItem);
        l0(j10, Collections.singletonList(storyItem), false);
    }

    public final void q() {
        this.f8645s = false;
        this.f8650y = "";
        this.f8641o = "";
        this.f8638l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        fi.a1 a1Var = this.f8648w;
        Objects.requireNonNull(a1Var);
        AndroidUtilities.runOnUIThread(new bi.u6(a1Var, 24));
        T();
        if (this.f8645s) {
            return;
        }
        ConnectionsManager.getInstance(this.f8630a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new g6(this, 0));
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
        v6 B = B(j10, true);
        int i10 = B.f9260a;
        if (B.f9265i) {
            return;
        }
        B.f9265i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.f9261b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_createAlbum, new bi.j(11, B, callback));
    }

    public final void s(long j10, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i10 = this.f8630a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        a0.h hVar = this.f8635i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i12).f22266id == storyItem.f22266id) {
                            peerStories2.stories.remove(i12);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j10);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                tL_stories_deleteStories.f22269id.add(Integer.valueOf(storyItem.f22266id));
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
                    } else if (peerStories2.stories.get(i14).f22266id == storyItem2.f22266id) {
                        peerStories2.stories.remove(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_deleteStories, new g6(this, 4));
        k0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f22269id;
        u7 u7Var = this.f8637k;
        u7Var.f9235b.getStorageQueue().postRunnable(new a3.i0(u7Var, arrayList2, j10, 7));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final g7 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (g7) hashMap.get(Integer.valueOf(storyItem.f22266id));
        }
        return null;
    }

    public final TL_stories.StoryItem u(int i10, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8635i.f(j10);
        if (peerStories != null) {
            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                if (peerStories.stories.get(i11).f22266id == i10) {
                    return peerStories.stories.get(i11);
                }
            }
            return null;
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User user;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId > 0 && (user = MessagesController.getInstance(this.f8630a).getUser(Long.valueOf(peerDialogId))) != null && !M(user)) {
                arrayList.remove(i10);
                i10--;
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!z10 && peerStories.stories.isEmpty() && !K(peerDialogId)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final String w(int i10, long j10) {
        a7 b10;
        v6 B = B(j10, false);
        if (B != null && (b10 = B.b(i10)) != null) {
            return b10.f8376b;
        }
        return null;
    }

    public final int x(long j10) {
        TL_stories.PeerStories y3 = y(j10);
        if (y3 == null) {
            y3 = z(j10);
        }
        if (y3 != null) {
            return Math.max(y3.max_read_id, this.f8633f.get(j10, 0));
        }
        return this.f8633f.get(j10, 0);
    }

    public final TL_stories.PeerStories y(long j10) {
        return (TL_stories.PeerStories) this.f8635i.f(j10);
    }

    public final TL_stories.PeerStories z(long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f8630a;
        if (i10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }
}
