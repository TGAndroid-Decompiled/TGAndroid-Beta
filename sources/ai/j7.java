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
public final class j7 {
    public int f1033a;
    public final TL_stories.StoryItem f1034b;
    public final long f1035c;
    public final int d;
    public boolean e;
    public final boolean f1036f;
    public final boolean f1039j;
    public final boolean f1040k;
    public boolean f1041l;
    public String f1043n;
    public final boolean f1046q;
    public final ArrayList f1037g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f1038i = new ArrayList();
    public boolean f1042m = true;
    public int f1044o = -1;
    public final HashSet f1045p = new HashSet();
    public final ArrayList f1047r = new ArrayList();
    public final u6 f1048s = new u6();

    public j7(int i10, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f1034b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1036f = z10;
        this.f1035c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f1033a = i11;
        if (i11 < 200) {
            this.f1046q = true;
        }
        if (ia.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1039j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f1039j = false;
            this.f1040k = true;
        }
        if (!this.f1039j) {
            this.f1041l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f1037g.add(tL_storyView);
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
        if (!this.f1036f) {
            ArrayList arrayList = this.f1037g;
            arrayList.clear();
            u6 u6Var = this.f1048s;
            boolean z11 = u6Var.f1578b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(u6Var.f1579c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(u6Var.f1579c)) {
                    str = u6Var.f1579c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = v7.j.g(" ", str);
                    str3 = v7.j.g(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (u6Var.f1578b && (user == null || !user.contact)) {
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
            if (!u6Var.f1577a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new g7(0)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f1036f) {
            arrayList = this.f1038i;
        } else {
            arrayList = this.f1037g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f1042m && !this.f1039j) {
            boolean z10 = this.f1036f;
            int i10 = 100;
            long j3 = this.f1035c;
            u6 u6Var = this.f1048s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f1034b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = u6Var.f1577a;
                tL_getStoryReactionsList.f18557id = storyItem.f18556id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                tL_getStoryReactionsList.limit = (this.f1041l || this.f1038i.size() < 20) ? 20 : 20;
                String str = this.f1043n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f18556id + " " + this.f1041l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final j7 f957b;

                    {
                        this.f957b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final j7 j7Var = this.f957b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                j7 j7Var2 = j7Var;
                                                ArrayList arrayList = j7Var2.f1047r;
                                                ArrayList arrayList2 = j7Var2.h;
                                                int i12 = j7Var2.d;
                                                ArrayList arrayList3 = j7Var2.f1037g;
                                                TL_stories.StoryItem storyItem2 = j7Var2.f1034b;
                                                if (iArr[0] != j7Var2.f1044o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " localId != reqId");
                                                    return;
                                                }
                                                j7Var2.e = false;
                                                j7Var2.f1044o = -1;
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
                                                    if (j7Var2.f1041l) {
                                                        j7Var2.f1041l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            j7Var2.f1045p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (j7Var2.f1046q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        j7Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        j7Var2.f1042m = true;
                                                    } else {
                                                        j7Var2.f1042m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    j7Var2.f1043n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        j7Var2.f1042m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18468id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        j7Var2.f1033a = 0;
                                                    }
                                                    j7Var2.f1042m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " response  totalItems " + arrayList3.size() + " has next " + j7Var2.f1042m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((k7) arrayList.get(i19)).e(j7Var2);
                                                }
                                                if (arrayList3.size() < 20 && j7Var2.f1042m) {
                                                    j7Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                j7 j7Var3 = j7Var;
                                                ArrayList arrayList4 = j7Var3.f1047r;
                                                TL_stories.StoryItem storyItem3 = j7Var3.f1034b;
                                                int i20 = j7Var3.d;
                                                ArrayList arrayList5 = j7Var3.f1038i;
                                                if (iArr[0] != j7Var3.f1044o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " localId != reqId");
                                                    return;
                                                }
                                                j7Var3.e = false;
                                                j7Var3.f1044o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (j7Var3.f1041l) {
                                                        j7Var3.f1041l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            j7Var3.f1045p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        j7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        j7Var3.f1042m = true;
                                                    } else {
                                                        j7Var3.f1042m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    j7Var3.f1043n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        j7Var3.f1042m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = j7Var3.f1033a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    j7Var3.f1033a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        j7Var3.f1033a = 0;
                                                    }
                                                    j7Var3.f1042m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " response  totalItems " + arrayList5.size() + " has next " + j7Var3.f1042m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((k7) arrayList4.get(i24)).e(j7Var3);
                                                }
                                                if (arrayList5.size() < 20 && j7Var3.f1042m) {
                                                    j7Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final j7 j7Var2 = this.f957b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                j7 j7Var22 = j7Var2;
                                                ArrayList arrayList = j7Var22.f1047r;
                                                ArrayList arrayList2 = j7Var22.h;
                                                int i12 = j7Var22.d;
                                                ArrayList arrayList3 = j7Var22.f1037g;
                                                TL_stories.StoryItem storyItem2 = j7Var22.f1034b;
                                                if (iArr2[0] != j7Var22.f1044o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " localId != reqId");
                                                    return;
                                                }
                                                j7Var22.e = false;
                                                j7Var22.f1044o = -1;
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
                                                    if (j7Var22.f1041l) {
                                                        j7Var22.f1041l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            j7Var22.f1045p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (j7Var22.f1046q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        j7Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        j7Var22.f1042m = true;
                                                    } else {
                                                        j7Var22.f1042m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    j7Var22.f1043n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        j7Var22.f1042m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18468id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        j7Var22.f1033a = 0;
                                                    }
                                                    j7Var22.f1042m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " response  totalItems " + arrayList3.size() + " has next " + j7Var22.f1042m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((k7) arrayList.get(i19)).e(j7Var22);
                                                }
                                                if (arrayList3.size() < 20 && j7Var22.f1042m) {
                                                    j7Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                j7 j7Var3 = j7Var2;
                                                ArrayList arrayList4 = j7Var3.f1047r;
                                                TL_stories.StoryItem storyItem3 = j7Var3.f1034b;
                                                int i20 = j7Var3.d;
                                                ArrayList arrayList5 = j7Var3.f1038i;
                                                if (iArr2[0] != j7Var3.f1044o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " localId != reqId");
                                                    return;
                                                }
                                                j7Var3.e = false;
                                                j7Var3.f1044o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (j7Var3.f1041l) {
                                                        j7Var3.f1041l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            j7Var3.f1045p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        j7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        j7Var3.f1042m = true;
                                                    } else {
                                                        j7Var3.f1042m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    j7Var3.f1043n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        j7Var3.f1042m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = j7Var3.f1033a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    j7Var3.f1033a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        j7Var3.f1033a = 0;
                                                    }
                                                    j7Var3.f1042m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " response  totalItems " + arrayList5.size() + " has next " + j7Var3.f1042m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((k7) arrayList4.get(i24)).e(j7Var3);
                                                }
                                                if (arrayList5.size() < 20 && j7Var3.f1042m) {
                                                    j7Var3.c();
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
                this.f1044o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f18565id = storyItem.f18556id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            if (this.f1046q) {
                tL_stories_getStoryViewsList.f18566q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = u6Var.f1579c;
                tL_stories_getStoryViewsList.f18566q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = u6Var.f1578b;
                tL_stories_getStoryViewsList.reactions_first = u6Var.f1577a;
            }
            tL_stories_getStoryViewsList.limit = (this.f1041l || this.f1037g.size() < 20) ? 20 : 20;
            String str3 = this.f1043n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f18556id + " " + this.f1041l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f18566q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final j7 f957b;

                {
                    this.f957b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final j7 j7Var = this.f957b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            j7 j7Var22 = j7Var;
                                            ArrayList arrayList = j7Var22.f1047r;
                                            ArrayList arrayList2 = j7Var22.h;
                                            int i12 = j7Var22.d;
                                            ArrayList arrayList3 = j7Var22.f1037g;
                                            TL_stories.StoryItem storyItem2 = j7Var22.f1034b;
                                            if (iArr2[0] != j7Var22.f1044o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " localId != reqId");
                                                return;
                                            }
                                            j7Var22.e = false;
                                            j7Var22.f1044o = -1;
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
                                                if (j7Var22.f1041l) {
                                                    j7Var22.f1041l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        j7Var22.f1045p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (j7Var22.f1046q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    j7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    j7Var22.f1042m = true;
                                                } else {
                                                    j7Var22.f1042m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                j7Var22.f1043n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    j7Var22.f1042m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18468id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    j7Var22.f1033a = 0;
                                                }
                                                j7Var22.f1042m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " response  totalItems " + arrayList3.size() + " has next " + j7Var22.f1042m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((k7) arrayList.get(i19)).e(j7Var22);
                                            }
                                            if (arrayList3.size() < 20 && j7Var22.f1042m) {
                                                j7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            j7 j7Var3 = j7Var;
                                            ArrayList arrayList4 = j7Var3.f1047r;
                                            TL_stories.StoryItem storyItem3 = j7Var3.f1034b;
                                            int i20 = j7Var3.d;
                                            ArrayList arrayList5 = j7Var3.f1038i;
                                            if (iArr2[0] != j7Var3.f1044o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " localId != reqId");
                                                return;
                                            }
                                            j7Var3.e = false;
                                            j7Var3.f1044o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (j7Var3.f1041l) {
                                                    j7Var3.f1041l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        j7Var3.f1045p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    j7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    j7Var3.f1042m = true;
                                                } else {
                                                    j7Var3.f1042m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                j7Var3.f1043n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    j7Var3.f1042m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = j7Var3.f1033a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                j7Var3.f1033a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    j7Var3.f1033a = 0;
                                                }
                                                j7Var3.f1042m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " response  totalItems " + arrayList5.size() + " has next " + j7Var3.f1042m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((k7) arrayList4.get(i24)).e(j7Var3);
                                            }
                                            if (arrayList5.size() < 20 && j7Var3.f1042m) {
                                                j7Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final j7 j7Var2 = this.f957b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            j7 j7Var22 = j7Var2;
                                            ArrayList arrayList = j7Var22.f1047r;
                                            ArrayList arrayList2 = j7Var22.h;
                                            int i12 = j7Var22.d;
                                            ArrayList arrayList3 = j7Var22.f1037g;
                                            TL_stories.StoryItem storyItem2 = j7Var22.f1034b;
                                            if (iArr22[0] != j7Var22.f1044o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " localId != reqId");
                                                return;
                                            }
                                            j7Var22.e = false;
                                            j7Var22.f1044o = -1;
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
                                                if (j7Var22.f1041l) {
                                                    j7Var22.f1041l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        j7Var22.f1045p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (j7Var22.f1046q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    j7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    j7Var22.f1042m = true;
                                                } else {
                                                    j7Var22.f1042m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                j7Var22.f1043n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    j7Var22.f1042m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18468id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    j7Var22.f1033a = 0;
                                                }
                                                j7Var22.f1042m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f18556id + " response  totalItems " + arrayList3.size() + " has next " + j7Var22.f1042m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((k7) arrayList.get(i19)).e(j7Var22);
                                            }
                                            if (arrayList3.size() < 20 && j7Var22.f1042m) {
                                                j7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            j7 j7Var3 = j7Var2;
                                            ArrayList arrayList4 = j7Var3.f1047r;
                                            TL_stories.StoryItem storyItem3 = j7Var3.f1034b;
                                            int i20 = j7Var3.d;
                                            ArrayList arrayList5 = j7Var3.f1038i;
                                            if (iArr22[0] != j7Var3.f1044o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " localId != reqId");
                                                return;
                                            }
                                            j7Var3.e = false;
                                            j7Var3.f1044o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (j7Var3.f1041l) {
                                                    j7Var3.f1041l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        j7Var3.f1045p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    j7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    j7Var3.f1042m = true;
                                                } else {
                                                    j7Var3.f1042m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                j7Var3.f1043n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    j7Var3.f1042m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = j7Var3.f1033a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                j7Var3.f1033a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    j7Var3.f1033a = 0;
                                                }
                                                j7Var3.f1042m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18556id + " response  totalItems " + arrayList5.size() + " has next " + j7Var3.f1042m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((k7) arrayList4.get(i24)).e(j7Var3);
                                            }
                                            if (arrayList5.size() < 20 && j7Var3.f1042m) {
                                                j7Var3.c();
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
            this.f1044o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f1044o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f1044o, false);
        }
        this.f1044o = -1;
    }

    public final void e(u6 u6Var, boolean z10, boolean z11) {
        u6 u6Var2 = new u6();
        u6Var2.f1577a = u6Var.f1577a;
        u6Var2.f1578b = u6Var.f1578b;
        u6Var2.f1579c = u6Var.f1579c;
        int i10 = 0;
        if (!z10) {
            u6Var2.f1578b = false;
        }
        if (!z11) {
            u6Var2.f1577a = true;
        }
        u6 u6Var3 = this.f1048s;
        if (!u6Var3.equals(u6Var2)) {
            u6Var3.f1577a = u6Var2.f1577a;
            u6Var3.f1578b = u6Var2.f1578b;
            u6Var3.f1579c = u6Var2.f1579c;
            if (!this.f1036f && this.f1046q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f1047r;
                    if (i10 < arrayList.size()) {
                        ((k7) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f1037g.clear();
                this.f1038i.clear();
                this.f1041l = true;
                this.e = false;
                this.f1042m = true;
                this.f1043n = "";
                c();
            }
        }
    }
}
