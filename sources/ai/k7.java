package ai;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k7 {
    public int f1227a;
    public final TL_stories.StoryItem f1228b;
    public final long f1229c;
    public final int d;
    public boolean f1230e;
    public final boolean f1231f;
    public final boolean f1234j;
    public final boolean f1235k;
    public boolean f1236l;
    public String f1238n;
    public final boolean f1241q;
    public final ArrayList f1232g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f1233i = new ArrayList();
    public boolean f1237m = true;
    public int f1239o = -1;
    public final HashSet f1240p = new HashSet();
    public final ArrayList f1242r = new ArrayList();
    public final v6 f1243s = new v6();

    public k7(int i10, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f1228b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1231f = z10;
        this.f1229c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f1227a = i11;
        if (i11 < 200) {
            this.f1241q = true;
        }
        if (ja.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1234j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f1234j = false;
            this.f1235k = true;
        }
        if (!this.f1234j) {
            this.f1236l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f1232g.add(tL_storyView);
                    }
                }
            }
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        if (!this.f1231f) {
            ArrayList arrayList = this.f1232g;
            arrayList.clear();
            v6 v6Var = this.f1243s;
            boolean z11 = v6Var.f1826b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(v6Var.f1827c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(v6Var.f1827c)) {
                    str = v6Var.f1827c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = sc.v.i(" ", str);
                    str3 = sc.v.i(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (v6Var.f1826b && (user == null || !user.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        String publicUsername = UserObject.getPublicUsername(user);
                        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && ((translitSafe == null || (!translitSafe.startsWith(str2) && !translitSafe.contains(str3))) && (publicUsername == null || (!publicUsername.startsWith(str2) && !publicUsername.contains(str3))))) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                    }
                }
            }
            if (!v6Var.f1825a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new h7(0)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f1231f) {
            arrayList = this.f1233i;
        } else {
            arrayList = this.f1232g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f1230e && this.f1237m && !this.f1234j) {
            boolean z10 = this.f1231f;
            int i10 = 100;
            long j3 = this.f1229c;
            v6 v6Var = this.f1243s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f1228b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = v6Var.f1825a;
                tL_getStoryReactionsList.f20280id = storyItem.f20279id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                if (this.f1236l || this.f1233i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f1238n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f1230e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f20279id + " " + this.f1236l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final k7 f1153b;

                    {
                        this.f1153b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final k7 k7Var = this.f1153b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                k7 k7Var2 = k7Var;
                                                ArrayList arrayList = k7Var2.f1242r;
                                                ArrayList arrayList2 = k7Var2.h;
                                                int i12 = k7Var2.d;
                                                ArrayList arrayList3 = k7Var2.f1232g;
                                                TL_stories.StoryItem storyItem2 = k7Var2.f1228b;
                                                if (iArr[0] != k7Var2.f1239o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " localId != reqId");
                                                    return;
                                                }
                                                k7Var2.f1230e = false;
                                                k7Var2.f1239o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.i iVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (iVar.d(storyView.user_id)) {
                                                                iVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (k7Var2.f1236l) {
                                                        k7Var2.f1236l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            k7Var2.f1240p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (k7Var2.f1241q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        k7Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        k7Var2.f1237m = true;
                                                    } else {
                                                        k7Var2.f1237m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    k7Var2.f1238n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        k7Var2.f1237m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20189id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        k7Var2.f1227a = 0;
                                                    }
                                                    k7Var2.f1237m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " response  totalItems " + arrayList3.size() + " has next " + k7Var2.f1237m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((l7) arrayList.get(i19)).e(k7Var2);
                                                }
                                                if (arrayList3.size() < 20 && k7Var2.f1237m) {
                                                    k7Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                k7 k7Var3 = k7Var;
                                                ArrayList arrayList4 = k7Var3.f1242r;
                                                TL_stories.StoryItem storyItem3 = k7Var3.f1228b;
                                                int i20 = k7Var3.d;
                                                ArrayList arrayList5 = k7Var3.f1233i;
                                                if (iArr[0] != k7Var3.f1239o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " localId != reqId");
                                                    return;
                                                }
                                                k7Var3.f1230e = false;
                                                k7Var3.f1239o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (k7Var3.f1236l) {
                                                        k7Var3.f1236l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            k7Var3.f1240p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        k7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        k7Var3.f1237m = true;
                                                    } else {
                                                        k7Var3.f1237m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    k7Var3.f1238n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        k7Var3.f1237m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = k7Var3.f1227a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    k7Var3.f1227a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        k7Var3.f1227a = 0;
                                                    }
                                                    k7Var3.f1237m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " response  totalItems " + arrayList5.size() + " has next " + k7Var3.f1237m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((l7) arrayList4.get(i24)).e(k7Var3);
                                                }
                                                if (arrayList5.size() < 20 && k7Var3.f1237m) {
                                                    k7Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final k7 k7Var2 = this.f1153b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                k7 k7Var22 = k7Var2;
                                                ArrayList arrayList = k7Var22.f1242r;
                                                ArrayList arrayList2 = k7Var22.h;
                                                int i12 = k7Var22.d;
                                                ArrayList arrayList3 = k7Var22.f1232g;
                                                TL_stories.StoryItem storyItem2 = k7Var22.f1228b;
                                                if (iArr2[0] != k7Var22.f1239o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " localId != reqId");
                                                    return;
                                                }
                                                k7Var22.f1230e = false;
                                                k7Var22.f1239o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.i iVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (iVar.d(storyView.user_id)) {
                                                                iVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (k7Var22.f1236l) {
                                                        k7Var22.f1236l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            k7Var22.f1240p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (k7Var22.f1241q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        k7Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        k7Var22.f1237m = true;
                                                    } else {
                                                        k7Var22.f1237m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    k7Var22.f1238n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        k7Var22.f1237m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20189id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        k7Var22.f1227a = 0;
                                                    }
                                                    k7Var22.f1237m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " response  totalItems " + arrayList3.size() + " has next " + k7Var22.f1237m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((l7) arrayList.get(i19)).e(k7Var22);
                                                }
                                                if (arrayList3.size() < 20 && k7Var22.f1237m) {
                                                    k7Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                k7 k7Var3 = k7Var2;
                                                ArrayList arrayList4 = k7Var3.f1242r;
                                                TL_stories.StoryItem storyItem3 = k7Var3.f1228b;
                                                int i20 = k7Var3.d;
                                                ArrayList arrayList5 = k7Var3.f1233i;
                                                if (iArr2[0] != k7Var3.f1239o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " localId != reqId");
                                                    return;
                                                }
                                                k7Var3.f1230e = false;
                                                k7Var3.f1239o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (k7Var3.f1236l) {
                                                        k7Var3.f1236l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            k7Var3.f1240p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        k7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        k7Var3.f1237m = true;
                                                    } else {
                                                        k7Var3.f1237m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    k7Var3.f1238n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        k7Var3.f1237m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = k7Var3.f1227a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    k7Var3.f1227a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        k7Var3.f1227a = 0;
                                                    }
                                                    k7Var3.f1237m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " response  totalItems " + arrayList5.size() + " has next " + k7Var3.f1237m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((l7) arrayList4.get(i24)).e(k7Var3);
                                                }
                                                if (arrayList5.size() < 20 && k7Var3.f1237m) {
                                                    k7Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
                this.f1239o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20288id = storyItem.f20279id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            if (this.f1241q) {
                tL_stories_getStoryViewsList.f20289q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = v6Var.f1827c;
                tL_stories_getStoryViewsList.f20289q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = v6Var.f1826b;
                tL_stories_getStoryViewsList.reactions_first = v6Var.f1825a;
            }
            if (this.f1236l || this.f1232g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f1238n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f1230e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f20279id + " " + this.f1236l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20289q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final k7 f1153b;

                {
                    this.f1153b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final k7 k7Var = this.f1153b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            k7 k7Var22 = k7Var;
                                            ArrayList arrayList = k7Var22.f1242r;
                                            ArrayList arrayList2 = k7Var22.h;
                                            int i12 = k7Var22.d;
                                            ArrayList arrayList3 = k7Var22.f1232g;
                                            TL_stories.StoryItem storyItem2 = k7Var22.f1228b;
                                            if (iArr2[0] != k7Var22.f1239o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " localId != reqId");
                                                return;
                                            }
                                            k7Var22.f1230e = false;
                                            k7Var22.f1239o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.i iVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (iVar.d(storyView.user_id)) {
                                                            iVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (k7Var22.f1236l) {
                                                    k7Var22.f1236l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        k7Var22.f1240p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (k7Var22.f1241q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    k7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    k7Var22.f1237m = true;
                                                } else {
                                                    k7Var22.f1237m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                k7Var22.f1238n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    k7Var22.f1237m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20189id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    k7Var22.f1227a = 0;
                                                }
                                                k7Var22.f1237m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " response  totalItems " + arrayList3.size() + " has next " + k7Var22.f1237m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((l7) arrayList.get(i19)).e(k7Var22);
                                            }
                                            if (arrayList3.size() < 20 && k7Var22.f1237m) {
                                                k7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            k7 k7Var3 = k7Var;
                                            ArrayList arrayList4 = k7Var3.f1242r;
                                            TL_stories.StoryItem storyItem3 = k7Var3.f1228b;
                                            int i20 = k7Var3.d;
                                            ArrayList arrayList5 = k7Var3.f1233i;
                                            if (iArr2[0] != k7Var3.f1239o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " localId != reqId");
                                                return;
                                            }
                                            k7Var3.f1230e = false;
                                            k7Var3.f1239o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (k7Var3.f1236l) {
                                                    k7Var3.f1236l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        k7Var3.f1240p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    k7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    k7Var3.f1237m = true;
                                                } else {
                                                    k7Var3.f1237m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                k7Var3.f1238n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    k7Var3.f1237m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = k7Var3.f1227a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                k7Var3.f1227a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    k7Var3.f1227a = 0;
                                                }
                                                k7Var3.f1237m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " response  totalItems " + arrayList5.size() + " has next " + k7Var3.f1237m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((l7) arrayList4.get(i24)).e(k7Var3);
                                            }
                                            if (arrayList5.size() < 20 && k7Var3.f1237m) {
                                                k7Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final k7 k7Var2 = this.f1153b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            k7 k7Var22 = k7Var2;
                                            ArrayList arrayList = k7Var22.f1242r;
                                            ArrayList arrayList2 = k7Var22.h;
                                            int i12 = k7Var22.d;
                                            ArrayList arrayList3 = k7Var22.f1232g;
                                            TL_stories.StoryItem storyItem2 = k7Var22.f1228b;
                                            if (iArr22[0] != k7Var22.f1239o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " localId != reqId");
                                                return;
                                            }
                                            k7Var22.f1230e = false;
                                            k7Var22.f1239o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.i iVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (iVar.d(storyView.user_id)) {
                                                            iVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (k7Var22.f1236l) {
                                                    k7Var22.f1236l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        k7Var22.f1240p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (k7Var22.f1241q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    k7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    k7Var22.f1237m = true;
                                                } else {
                                                    k7Var22.f1237m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                k7Var22.f1238n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    k7Var22.f1237m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20189id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    k7Var22.f1227a = 0;
                                                }
                                                k7Var22.f1237m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20279id + " response  totalItems " + arrayList3.size() + " has next " + k7Var22.f1237m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((l7) arrayList.get(i19)).e(k7Var22);
                                            }
                                            if (arrayList3.size() < 20 && k7Var22.f1237m) {
                                                k7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            k7 k7Var3 = k7Var2;
                                            ArrayList arrayList4 = k7Var3.f1242r;
                                            TL_stories.StoryItem storyItem3 = k7Var3.f1228b;
                                            int i20 = k7Var3.d;
                                            ArrayList arrayList5 = k7Var3.f1233i;
                                            if (iArr22[0] != k7Var3.f1239o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " localId != reqId");
                                                return;
                                            }
                                            k7Var3.f1230e = false;
                                            k7Var3.f1239o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (k7Var3.f1236l) {
                                                    k7Var3.f1236l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        k7Var3.f1240p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    k7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    k7Var3.f1237m = true;
                                                } else {
                                                    k7Var3.f1237m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                k7Var3.f1238n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    k7Var3.f1237m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = k7Var3.f1227a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                k7Var3.f1227a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    k7Var3.f1227a = 0;
                                                }
                                                k7Var3.f1237m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20279id + " response  totalItems " + arrayList5.size() + " has next " + k7Var3.f1237m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((l7) arrayList4.get(i24)).e(k7Var3);
                                            }
                                            if (arrayList5.size() < 20 && k7Var3.f1237m) {
                                                k7Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            this.f1239o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f1239o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f1239o, false);
        }
        this.f1239o = -1;
    }

    public final void e(v6 v6Var, boolean z10, boolean z11) {
        v6 v6Var2 = new v6();
        v6Var2.f1825a = v6Var.f1825a;
        v6Var2.f1826b = v6Var.f1826b;
        v6Var2.f1827c = v6Var.f1827c;
        int i10 = 0;
        if (!z10) {
            v6Var2.f1826b = false;
        }
        if (!z11) {
            v6Var2.f1825a = true;
        }
        v6 v6Var3 = this.f1243s;
        if (!v6Var3.equals(v6Var2)) {
            v6Var3.f1825a = v6Var2.f1825a;
            v6Var3.f1826b = v6Var2.f1826b;
            v6Var3.f1827c = v6Var2.f1827c;
            if (!this.f1231f && this.f1241q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f1242r;
                    if (i10 < arrayList.size()) {
                        ((l7) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f1232g.clear();
                this.f1233i.clear();
                this.f1236l = true;
                this.f1230e = false;
                this.f1237m = true;
                this.f1238n = "";
                c();
            }
        }
    }
}
