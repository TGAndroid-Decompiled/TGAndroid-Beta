package bi;

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
public final class u8 {
    public static final Comparator X = Comparator$CC.comparingInt(new o6(1));
    public TL_stories.TL_storiesStealthMode B;
    public final ah.g K;
    public int N;
    public boolean R;
    public n8 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int f3805a;
    public final h9 f3813k;
    public final SharedPreferences f3814l;
    public boolean f3816n;
    public String f3817o;
    public boolean f3818p;
    public boolean f3819q;
    public boolean f3820r;
    public boolean f3821s;
    public final HashSet f3822t;
    public int f3823u;
    public int v;
    public final di.b1 f3824w;
    public String f3826y;
    public final a0.i f3806b = new a0.i();
    public final a0.i f3807c = new a0.i();
    public int d = 0;
    public final a0.i f3808e = new a0.i();
    public LongSparseIntArray f3809f = new LongSparseIntArray();
    public final ArrayList f3810g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.i f3811i = new a0.i();
    public final LongSparseIntArray f3812j = new LongSparseIntArray();
    public final a0.i f3815m = new a0.i();
    public final a0.i f3825x = new a0.i();
    public boolean f3827z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.i E = new a0.i();
    public final a0.i F = new a0.i();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final l7 J = new l7(this, 0);
    public final HashSet L = new HashSet();
    public final a0.i M = new a0.i();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public u8(int i10) {
        this.f3817o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.f3805a = i10;
        ?? obj = new Object();
        obj.f3073a = i10;
        obj.f3074b = MessagesStorage.getInstance(i10);
        this.f3813k = obj;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        this.f3814l = mainSettings;
        this.f3817o = mainSettings.getString("last_stories_state", "");
        this.f3826y = mainSettings.getString("last_stories_state_hidden", "");
        this.v = mainSettings.getInt("total_stores_hidden", 0);
        this.f3823u = mainSettings.getInt("total_stores", 0);
        this.f3821s = mainSettings.getBoolean("read_loaded", false);
        this.f3822t = new HashSet(mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
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
        h9 h9Var = this.f3813k;
        h9Var.f3074b.getStorageQueue().postRunnable(new s8(4, h9Var, new q7(this, 0)));
        this.K = new ah.g(this, i10, 1);
        this.f3824w = new di.b1(i10);
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
                    str = str + storyItem.f20107id + "@" + storyItem.dialogId;
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
                str = str + ((TL_stories.StoryItem) list.get(i10)).f20107id + "@" + ((TL_stories.StoryItem) list.get(i10)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final l8 A(long j3, int i10, int i11, boolean z10) {
        if (i10 == 0 && i11 > 0) {
            Long valueOf = Long.valueOf(j3);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j3), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            l8 l8Var = (l8) hashMap3.get(Integer.valueOf(i11));
            if (l8Var == null && z10) {
                l8 l8Var2 = new l8(this.f3805a, j3, i10, i11, new o1(this, 3));
                hashMap3.put(Integer.valueOf(i11), l8Var2);
                return l8Var2;
            }
            return l8Var;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i10] == null) {
            hashMapArr[i10] = new HashMap();
        }
        l8 l8Var3 = (l8) hashMapArr[i10].get(Long.valueOf(j3));
        if (l8Var3 == null && z10) {
            if (i10 == 4) {
                HashMap hashMap4 = hashMapArr[i10];
                Long valueOf2 = Long.valueOf(j3);
                b8 b8Var = new b8(this.f3805a, j3, null, new o1(this, 3));
                hashMap4.put(valueOf2, b8Var);
                return b8Var;
            }
            HashMap hashMap5 = hashMapArr[i10];
            Long valueOf3 = Long.valueOf(j3);
            l8 l8Var4 = new l8(this.f3805a, j3, i10, i11, new o1(this, 3));
            hashMap5.put(valueOf3, l8Var4);
            return l8Var4;
        }
        return l8Var3;
    }

    public final f8 B(long j3, boolean z10) {
        a0.i iVar = this.F;
        f8 f8Var = (f8) iVar.f(j3);
        if (f8Var == null && z10) {
            f8 f8Var2 = new f8(this.f3805a, j3, this);
            iVar.k(f8Var2, j3);
            return f8Var2;
        }
        return f8Var;
    }

    public final int C(boolean z10) {
        if (z10) {
            if (this.f3827z) {
                return Math.max(1, this.v);
            }
            return this.h.size();
        } else if (this.f3818p) {
            return Math.max(1, this.f3823u);
        } else {
            return this.f3810g.size();
        }
    }

    public final int D(int i10, long j3) {
        if (j3 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j3 == UserConfig.getInstance(this.f3805a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f3806b.f(j3))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f3809f.get(j3, 0));
        boolean z10 = false;
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i10 == 0 || peerStories.stories.get(i11).f20107id == i10) && peerStories.stories.get(i11).f20107id > max) {
                if (peerStories.stories.get(i11).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        if (N(j3) || !z10) {
            return 0;
        }
        return 1;
    }

    public final ArrayList E(long j3) {
        return (ArrayList) this.f3806b.f(j3);
    }

    public final boolean F(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
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

    public final boolean G() {
        if (H()) {
            ArrayList arrayList = this.f3810g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer) == UserConfig.getInstance(this.f3805a).clientUserId)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        long j3 = UserConfig.getInstance(this.f3805a).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
        if ((peerStories != null && !peerStories.stories.isEmpty()) || !Utilities.isNullOrEmpty((Collection) this.f3806b.f(j3))) {
            return true;
        }
        return false;
    }

    public final boolean I(long j3) {
        if (j3 == 0) {
            return false;
        }
        if (K(j3) || N(j3)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null || peerStories.stories.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean J(long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
        if (peerStories == null) {
            peerStories = z(j3);
        }
        if (peerStories == null) {
            return false;
        }
        if (j3 == UserConfig.getInstance(this.f3805a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.f3806b.f(j3))) {
            return true;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i10);
            if (storyItem != null && storyItem.f20107id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(long j3) {
        ArrayList arrayList = (ArrayList) this.f3806b.f(j3);
        HashMap hashMap = (HashMap) this.f3808e.f(j3);
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
        long j3 = storyView.user_id;
        a0.i iVar = this.M;
        if (iVar.d(j3)) {
            return ((Boolean) iVar.f(storyView.user_id)).booleanValue();
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
            if (user.contact || user.f20016id == MessagesController.getInstance(this.f3805a).storiesChangelogUserId) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean N(long j3) {
        ArrayList arrayList = (ArrayList) this.f3806b.f(j3);
        if (arrayList != null && !arrayList.isEmpty()) {
            return ((t8) i2.g.h(1, arrayList)).I;
        }
        return false;
    }

    public final void O(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j3));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j3);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i10 = this.f3805a;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getPeerStories, new j7(this, j3, 0));
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
        ConnectionsManager.getInstance(this.f3805a).sendRequest(tL_contacts_getBlocked, new g7(this, 3));
    }

    public final void Q(boolean z10) {
        String str;
        boolean z11;
        if (!z10 || !this.f3820r) {
            if ((!z10 && this.f3819q) || this.f3816n) {
                return;
            }
            boolean z12 = true;
            if (z10) {
                this.f3820r = true;
            } else {
                this.f3819q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            if (z10) {
                str = this.f3826y;
            } else {
                str = this.f3817o;
            }
            if (z10) {
                z11 = this.f3827z;
            } else {
                z11 = this.f3818p;
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
            ConnectionsManager.getInstance(this.f3805a).sendRequest(tL_stories_getAllStories, new w7(this, z10, tL_stories_getAllStories, z12));
        }
    }

    public final void R() {
        if (!this.U && !this.V) {
            this.U = true;
            ConnectionsManager.getInstance(this.f3805a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new g7(this, 2));
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
            final long j3 = peerDialogId * i10;
            Long valueOf = Long.valueOf(j3);
            HashSet hashSet = this.D;
            if (!hashSet.contains(valueOf)) {
                ArrayList<Integer> arrayList = null;
                for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                    if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(Integer.valueOf(peerStories.stories.get(i11).f20107id));
                    }
                    if (arrayList != null && arrayList.size() > 14) {
                        break;
                    }
                }
                if (arrayList != null) {
                    hashSet.add(Long.valueOf(j3));
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.f20114id = arrayList;
                    int i12 = this.f3805a;
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(peerDialogId);
                    ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t7(u8.this, j3, z10, peerStories, peerDialogId, tLObject));
                        }
                    });
                }
            }
        }
    }

    public final void T() {
        if (this.A) {
            this.f3816n = true;
            q7 q7Var = new q7(this, 1);
            h9 h9Var = this.f3813k;
            h9Var.f3074b.getStorageQueue().postRunnable(new s8(1, h9Var, q7Var));
        } else {
            Q(false);
            Q(true);
        }
        this.A = false;
    }

    public final void U(int i10, long j3) {
        AndroidUtilities.runOnUIThread(new h7(this, j3, i10, 0));
    }

    public final boolean V(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i10 = this.f3809f.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i10, storyItem.f20107id));
            int i11 = this.f3805a;
            NotificationsController.getInstance(i11).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.f3809f.put(peerDialogId, max);
            if (max > i10) {
                if (!z10) {
                    this.f3813k.i(max, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i11).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.f20107id;
                ConnectionsManager.getInstance(i11).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void W(long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i10 = this.f3805a;
            if (DownloadController.getInstance(i10).canPreloadStories()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                storyItem.dialogId = j3;
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
                            ah.j1 d = ah.j1.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i11)).reaction);
                            if (d.f597f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f597f);
                                if (tL_availableReaction != null) {
                                    FileLoader.getInstance(i10).loadFile(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(1, i10, d.f598g);
                                q5Var.f29586m = true;
                                q5Var.v();
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
            } else if (peerStories.stories.get(i11).f20107id > peerStories.max_read_id) {
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
        ArrayList arrayList3 = this.f3810g;
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
        int i11 = this.f3805a;
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
                    NotificationsController.getInstance(i11).processDeleteStory(peerDialogId, storyItem.f20107id);
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
                this.f3811i.l(peerDialogId);
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            ah.j jVar = new ah.j(6);
            h9 h9Var = this.f3813k;
            h9Var.f3074b.getStorageQueue().postRunnable(new i7(h9Var, arrayList4, z12, z10, jVar, 1));
        }
        ah.g gVar = this.K;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        gVar.run();
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
        h9 h9Var = this.f3813k;
        if (i10 > 0) {
            user = MessagesController.getInstance(this.f3805a).getUser(Long.valueOf(peerDialogId));
            if (user != null && (M(user) || user.self)) {
                h9Var.f3074b.getStorageQueue().postRunnable(new s8(3, h9Var, tL_updateStory));
            }
        } else {
            h9Var.f3074b.getStorageQueue().postRunnable(new s8(3, h9Var, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new x7(this, peerDialogId, tL_updateStory, user, 0));
    }

    public final void a0(long j3, TL_stories.PeerStories peerStories) {
        b0(j3, peerStories);
        h9 h9Var = this.f3813k;
        int i10 = this.f3805a;
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (M(user) || user.self) {
                h9Var.f3074b.getStorageQueue().postRunnable(new e9(h9Var, peerStories, 0));
            }
        } else if (ChatObject.isInChat(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)))) {
            h9Var.f3074b.getStorageQueue().postRunnable(new e9(h9Var, peerStories, 0));
        }
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        f8 B = B(j3, true);
        B.getClass();
        u8 u8Var = B.f2986j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f2979a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f2980b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f20107id));
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
        l8 A = u8Var.A(B.f2980b, 0, i10, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            l8 A2 = u8Var.A(B.f2980b, 0, ((m8) obj3).f3321a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(long j3, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.i iVar = this.f3811i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) iVar.f(j3);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories.stories.get(i10).f20107id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).f20107id == i11 && (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i10, peerStories2.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        iVar.k(peerStories, j3);
    }

    public final void c(int i10, long j3, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i10, j3, arrayList);
    }

    public final void c0(int i10, long j3, ArrayList arrayList) {
        f8 B = B(j3, true);
        B.getClass();
        u8 u8Var = B.f2986j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.f2979a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f2980b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).f20107id));
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
        l8 A = u8Var.A(B.f2980b, 0, i10, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            l8 A2 = u8Var.A(B.f2980b, 0, ((m8) obj3).f3321a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void d(long j3, t8 t8Var, a0.i iVar, boolean z10) {
        ArrayList arrayList = (ArrayList) iVar.f(j3);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.w1.k(j3, iVar);
        }
        arrayList.add(t8Var);
    }

    public final void d0(long j3, int i10, e2.h hVar) {
        TL_stories.PeerStories y3 = y(j3);
        if (y3 != null) {
            for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                if (y3.stories.get(i11).f20107id == i10 && !(y3.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                    hVar.accept(y3.stories.get(i11));
                    return;
                }
            }
        }
        long j10 = (i10 + j3) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j10);
        if (storyItem != null) {
            hVar.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.f20114id.add(Integer.valueOf(i10));
        int i12 = this.f3805a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j3);
        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new z7(this, j10, hVar));
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = this.f3805a;
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

    public final void e0(long j3, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.f3812j;
        if (z10) {
            longSparseIntArray.put(j3, 1);
        } else {
            longSparseIntArray.delete(j3);
        }
    }

    public final void f0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i10 = this.f3805a;
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
        int i10 = this.f3805a;
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
            arrayList = this.f3810g;
            z10 = true;
            if (i11 < arrayList.size()) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
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
            } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == peerDialogId) {
                arrayList2.remove(i12);
                z11 = true;
                break;
            } else {
                i12++;
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
        MessagesController.getInstance(i10).checkArchiveFolder();
    }

    public final void g0(long j3, TL_stories.StoryItem storyItem, ah.j1 j1Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.f20107id;
        int i10 = this.f3805a;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        if (j1Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (j1Var.f598g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = j1Var.f598g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (j1Var.f597f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = j1Var.f597f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        p0(j3, storyItem, false);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendReaction, new c7(1));
    }

    public final boolean h(long j3) {
        TLRPC.Chat chat;
        if (j3 >= 0 || (chat = MessagesController.getInstance(this.f3805a).getChat(Long.valueOf(-j3))) == null) {
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

    public final boolean i(long j3) {
        if (UserConfig.getInstance(this.f3805a).getClientUserId() != j3 && !h(j3)) {
            return false;
        }
        return true;
    }

    public final void i0(long j3, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f3810g;
        if (z10) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer) == j3) {
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
                    if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == j3) {
                        break;
                    }
                    i11++;
                } else {
                    arrayList2.add(0, peerStories);
                    ah.g gVar = this.K;
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    gVar.run();
                    break;
                }
            }
        }
        int i12 = this.f3805a;
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i12).checkArchiveFolder();
        if (z11) {
            if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
                user.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i12).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j3));
                chat.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i12).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i12).getInputPeer(j3);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i12).sendRequest(tL_stories_togglePeerStoriesHidden, new c7(1));
        }
    }

    public final boolean j(long j3) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f3805a;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null || !ChatObject.isBoostSupported(chat)) {
                return false;
            }
            if (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories)) {
                return true;
            }
            return false;
        } else if (i11 > 0 && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null && user.bot && user.bot_can_edit) {
            return true;
        } else {
            return false;
        }
    }

    public final void j0(long j3, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i10 = this.f3805a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j3);
        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
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
                    tL_contacts_block.f19912id = inputPeer;
                    tL_contacts_unblock = tL_contacts_block;
                } else {
                    TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                    tL_contacts_unblock2.my_stories_from = true;
                    tL_contacts_unblock2.f19917id = inputPeer;
                    tL_contacts_unblock = tL_contacts_unblock2;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_unblock, null);
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
        }
    }

    public final void k(long j3, e2.h hVar, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i10 = this.f3805a;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new k7(this, z10, j3, hVar, f6Var), 1024);
    }

    public final void k0(long j3, List list) {
        ArrayList arrayList;
        StringBuilder t10 = a4.a.t(j3, "updateDeletedStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(h0(list));
        t10.append("}");
        FileLog.d(t10.toString());
        l8 A = A(j3, 0, -1, false);
        u8 u8Var = this;
        l8 A2 = u8Var.A(j3, 1, -1, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i10 = 0;
        f8 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l8 A3 = u8Var.A(j3, 0, ((m8) obj).f3321a, false);
                if (A3 != null) {
                    A3.A(list);
                }
                u8Var = this;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i10 = this.f3805a;
            if (i11 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i11);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                if (p9.w(i10, peerStories.stories.get(i12))) {
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty() && !K(peerDialogId)) {
                this.f3811i.l(peerDialogId);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final void l0(long j3, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i10 = this.f3805a;
        if (j3 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (userFull != null) {
                if (userFull.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        userFull.stories = tL_peerStories;
                        tL_peerStories.peer = MessagesController.getInstance(i10).getPeer(j3);
                        userFull.stories.max_read_id = x(j3);
                    } else {
                        return;
                    }
                }
                peerStories = userFull.stories;
            } else {
                return;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j3);
            if (chatFull != null) {
                if (chatFull.stories == null) {
                    if (z10) {
                        TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                        chatFull.stories = tL_peerStories2;
                        tL_peerStories2.peer = MessagesController.getInstance(i10).getPeer(j3);
                        chatFull.stories.max_read_id = x(j3);
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
                    if (peerStories.stories.get(i12).f20107id == storyItem.f20107id) {
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
                            i2.g.o(storyItem.f20107id, new StringBuilder("StoriesController update story for full peer storyId="));
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
                    i2.g.o(storyItem.f20107id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    i2.g.o(storyItem.f20107id, new StringBuilder("StoriesController add new story for full peer storyId="));
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
                if (p9.w(this.f3805a, peerStories.stories.get(i10))) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            peerStories.checkedExpired = true;
        }
    }

    public final void m0(long j3, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories != null && (peerStories2 = (TL_stories.PeerStories) this.f3811i.f(j3)) != null) {
            FileLog.d("StoriesController update stories from full peer " + j3);
            for (int i10 = 0; i10 < peerStories2.stories.size(); i10++) {
                if (peerStories2.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories2.stories.get(i10).f20107id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories.stories.size()) {
                            break;
                        }
                        if (peerStories.stories.get(i12).f20107id == i11 && (peerStories.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
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
        throw new UnsupportedOperationException("Method not decompiled: bi.u8.n(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void n0(long j3, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder t10 = a4.a.t(j3, "updateStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(h0(list));
        t10.append("}");
        FileLog.d(t10.toString());
        l8 A = A(j3, 0, -1, false);
        u8 u8Var = this;
        l8 A2 = u8Var.A(j3, 1, -1, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = u8Var.I;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((d8) obj).D(list, z10);
        }
        f8 B = B(j3, false);
        if (B != null && (arrayList = B.h) != null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                l8 A3 = u8Var.A(j3, 0, ((m8) arrayList.get(i10)).f3321a, false);
                if (A3 != null) {
                    A3.D(list, z10);
                }
                u8Var = this;
                i10 = i12;
            }
        }
    }

    public final n8 o() {
        int i10;
        int size;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i11 = this.f3805a;
        if (UserConfig.getInstance(i11).isPremium()) {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitPremium;
        } else {
            i10 = MessagesController.getInstance(i11).storyExpiringLimitDefault;
        }
        ArrayList arrayList2 = (ArrayList) this.f3807c.f(UserConfig.getInstance(i11).getClientUserId());
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
            return new n8(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i11).getInputPeer(UserConfig.getInstance(i11).getClientUserId());
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_canSendStory, new g7(this, 1), 1024);
        return null;
    }

    public final void o0(long j3, ArrayList arrayList, boolean z10, f4 f4Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y3 = y(j3);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.f20121id.add(Integer.valueOf(storyItem.f20107id));
                if (y3 != null) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).f20107id == storyItem.f20107id) {
                            y3.stories.get(i11).pinned = z10;
                            this.f3813k.k(j3, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        n0(j3, arrayList, false);
        l0(j3, arrayList, false);
        togglepinned.pinned = z10;
        int i12 = this.f3805a;
        togglepinned.peer = MessagesController.getInstance(i12).getInputPeer(j3);
        ConnectionsManager.getInstance(i12).sendRequest(togglepinned, new m7(0, f4Var));
    }

    public final void p(int i10, long j3) {
        String str = "229:" + j3 + ":" + i10;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.f3822t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i11 = this.f3805a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        tL_stories_getStoriesByID.f20114id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new s7(this, i10, str, j3, 0));
    }

    public final void p0(long j3, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder t10 = a4.a.t(j3, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.f20107id + "@" + storyItem.dialogId;
        }
        t10.append(str);
        FileLog.d(t10.toString());
        n0(j3, Collections.singletonList(storyItem), z10);
        this.f3813k.k(j3, storyItem);
        l0(j3, Collections.singletonList(storyItem), false);
    }

    public final void q() {
        this.f3821s = false;
        this.f3826y = "";
        this.f3817o = "";
        this.f3814l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        di.b1 b1Var = this.f3824w;
        Objects.requireNonNull(b1Var);
        AndroidUtilities.runOnUIThread(new a3.c(b1Var, 23));
        T();
        if (this.f3821s) {
            return;
        }
        ConnectionsManager.getInstance(this.f3805a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new g7(this, 0));
    }

    public final void q0(long j3, int i10, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i10, j3);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            p0(j3, u10, false);
        }
    }

    public final void r(long j3, String str, Utilities.Callback callback) {
        f8 B = B(j3, true);
        int i10 = B.f2979a;
        if (B.f2985i) {
            return;
        }
        B.f2985i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.f2980b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_createAlbum, new m1(3, B, callback));
    }

    public final void s(long j3, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i10 = this.f3805a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        a0.i iVar = this.f3811i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) iVar.f(j3);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        } else if (peerStories2.stories.get(i12).f20107id == storyItem.f20107id) {
                            peerStories2.stories.remove(i12);
                            if (peerStories2.stories.isEmpty()) {
                                iVar.l(j3);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                tL_stories_deleteStories.f20110id.add(Integer.valueOf(storyItem.f20107id));
            }
        }
        if (j3 < 0 ? !((chatFull = MessagesController.getInstance(i10).getChatFull(-j3)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(i10).getUserFull(j3)) == null || (peerStories = userFull.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i13);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= peerStories2.stories.size()) {
                        break;
                    } else if (peerStories2.stories.get(i14).f20107id == storyItem2.f20107id) {
                        peerStories2.stories.remove(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_deleteStories, new g7(this, 4));
        k0(j3, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.f20110id;
        h9 h9Var = this.f3813k;
        h9Var.f3074b.getStorageQueue().postRunnable(new a3.g0(h9Var, arrayList2, j3, 4));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final t8 t(long j3, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.f3808e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            return (t8) hashMap.get(Integer.valueOf(storyItem.f20107id));
        }
        return null;
    }

    public final TL_stories.StoryItem u(int i10, long j3) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3811i.f(j3);
        if (peerStories != null) {
            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                if (peerStories.stories.get(i11).f20107id == i10) {
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
            if (peerDialogId > 0 && (user = MessagesController.getInstance(this.f3805a).getUser(Long.valueOf(peerDialogId))) != null && !M(user)) {
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

    public final String w(int i10, long j3) {
        m8 b10;
        f8 B = B(j3, false);
        if (B != null && (b10 = B.b(i10)) != null) {
            return b10.f3322b;
        }
        return null;
    }

    public final int x(long j3) {
        TL_stories.PeerStories y3 = y(j3);
        if (y3 == null) {
            y3 = z(j3);
        }
        if (y3 != null) {
            return Math.max(y3.max_read_id, this.f3809f.get(j3, 0));
        }
        return this.f3809f.get(j3, 0);
    }

    public final TL_stories.PeerStories y(long j3) {
        return (TL_stories.PeerStories) this.f3811i.f(j3);
    }

    public final TL_stories.PeerStories z(long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.f3805a;
        if (j3 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j3);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }
}
