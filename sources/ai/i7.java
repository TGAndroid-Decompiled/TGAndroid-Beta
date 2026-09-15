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
public final class i7 {
    public int f990a;
    public final TL_stories.StoryItem f991b;
    public final long f992c;
    public final int d;
    public boolean e;
    public final boolean f993f;
    public final boolean f996j;
    public final boolean f997k;
    public boolean f998l;
    public String f1000n;
    public final boolean f1003q;
    public final ArrayList f994g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f995i = new ArrayList();
    public boolean f999m = true;
    public int f1001o = -1;
    public final HashSet f1002p = new HashSet();
    public final ArrayList f1004r = new ArrayList();
    public final u6 f1005s = new u6();

    public i7(int i10, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f991b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f993f = z10;
        this.f992c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f990a = i11;
        if (i11 < 200) {
            this.f1003q = true;
        }
        if (ia.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f996j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f996j = false;
            this.f997k = true;
        }
        if (!this.f996j) {
            this.f998l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f994g.add(tL_storyView);
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
        if (!this.f993f) {
            ArrayList arrayList = this.f994g;
            arrayList.clear();
            u6 u6Var = this.f1005s;
            boolean z11 = u6Var.f1574b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(u6Var.f1575c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(u6Var.f1575c)) {
                    str = u6Var.f1575c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = org.telegram.ui.Cells.p6.i(" ", str);
                    str3 = org.telegram.ui.Cells.p6.i(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (u6Var.f1574b && (user == null || !user.contact)) {
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
            if (!u6Var.f1573a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new f7(0)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f993f) {
            arrayList = this.f995i;
        } else {
            arrayList = this.f994g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f999m && !this.f996j) {
            boolean z10 = this.f993f;
            int i10 = 100;
            long j3 = this.f992c;
            u6 u6Var = this.f1005s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f991b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = u6Var.f1573a;
                tL_getStoryReactionsList.f18349id = storyItem.f18348id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                tL_getStoryReactionsList.limit = (this.f998l || this.f995i.size() < 20) ? 20 : 20;
                String str = this.f1000n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f18348id + " " + this.f998l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final i7 f898b;

                    {
                        this.f898b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final i7 i7Var = this.f898b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                i7 i7Var2 = i7Var;
                                                ArrayList arrayList = i7Var2.f1004r;
                                                ArrayList arrayList2 = i7Var2.h;
                                                int i12 = i7Var2.d;
                                                ArrayList arrayList3 = i7Var2.f994g;
                                                TL_stories.StoryItem storyItem2 = i7Var2.f991b;
                                                if (iArr[0] != i7Var2.f1001o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " localId != reqId");
                                                    return;
                                                }
                                                i7Var2.e = false;
                                                i7Var2.f1001o = -1;
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
                                                    if (i7Var2.f998l) {
                                                        i7Var2.f998l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            i7Var2.f1002p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (i7Var2.f1003q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        i7Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        i7Var2.f999m = true;
                                                    } else {
                                                        i7Var2.f999m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    i7Var2.f1000n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        i7Var2.f999m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18259id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        i7Var2.f990a = 0;
                                                    }
                                                    i7Var2.f999m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " response  totalItems " + arrayList3.size() + " has next " + i7Var2.f999m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((j7) arrayList.get(i19)).e(i7Var2);
                                                }
                                                if (arrayList3.size() < 20 && i7Var2.f999m) {
                                                    i7Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                i7 i7Var3 = i7Var;
                                                ArrayList arrayList4 = i7Var3.f1004r;
                                                TL_stories.StoryItem storyItem3 = i7Var3.f991b;
                                                int i20 = i7Var3.d;
                                                ArrayList arrayList5 = i7Var3.f995i;
                                                if (iArr[0] != i7Var3.f1001o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " localId != reqId");
                                                    return;
                                                }
                                                i7Var3.e = false;
                                                i7Var3.f1001o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (i7Var3.f998l) {
                                                        i7Var3.f998l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            i7Var3.f1002p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        i7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        i7Var3.f999m = true;
                                                    } else {
                                                        i7Var3.f999m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    i7Var3.f1000n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        i7Var3.f999m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = i7Var3.f990a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    i7Var3.f990a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        i7Var3.f990a = 0;
                                                    }
                                                    i7Var3.f999m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " response  totalItems " + arrayList5.size() + " has next " + i7Var3.f999m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((j7) arrayList4.get(i24)).e(i7Var3);
                                                }
                                                if (arrayList5.size() < 20 && i7Var3.f999m) {
                                                    i7Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final i7 i7Var2 = this.f898b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                i7 i7Var22 = i7Var2;
                                                ArrayList arrayList = i7Var22.f1004r;
                                                ArrayList arrayList2 = i7Var22.h;
                                                int i12 = i7Var22.d;
                                                ArrayList arrayList3 = i7Var22.f994g;
                                                TL_stories.StoryItem storyItem2 = i7Var22.f991b;
                                                if (iArr2[0] != i7Var22.f1001o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " localId != reqId");
                                                    return;
                                                }
                                                i7Var22.e = false;
                                                i7Var22.f1001o = -1;
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
                                                    if (i7Var22.f998l) {
                                                        i7Var22.f998l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            i7Var22.f1002p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (i7Var22.f1003q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        i7Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        i7Var22.f999m = true;
                                                    } else {
                                                        i7Var22.f999m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    i7Var22.f1000n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        i7Var22.f999m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18259id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        i7Var22.f990a = 0;
                                                    }
                                                    i7Var22.f999m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " response  totalItems " + arrayList3.size() + " has next " + i7Var22.f999m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((j7) arrayList.get(i19)).e(i7Var22);
                                                }
                                                if (arrayList3.size() < 20 && i7Var22.f999m) {
                                                    i7Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                i7 i7Var3 = i7Var2;
                                                ArrayList arrayList4 = i7Var3.f1004r;
                                                TL_stories.StoryItem storyItem3 = i7Var3.f991b;
                                                int i20 = i7Var3.d;
                                                ArrayList arrayList5 = i7Var3.f995i;
                                                if (iArr2[0] != i7Var3.f1001o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " localId != reqId");
                                                    return;
                                                }
                                                i7Var3.e = false;
                                                i7Var3.f1001o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (i7Var3.f998l) {
                                                        i7Var3.f998l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            i7Var3.f1002p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        i7Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        i7Var3.f999m = true;
                                                    } else {
                                                        i7Var3.f999m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    i7Var3.f1000n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        i7Var3.f999m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = i7Var3.f990a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    i7Var3.f990a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        i7Var3.f990a = 0;
                                                    }
                                                    i7Var3.f999m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " response  totalItems " + arrayList5.size() + " has next " + i7Var3.f999m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((j7) arrayList4.get(i24)).e(i7Var3);
                                                }
                                                if (arrayList5.size() < 20 && i7Var3.f999m) {
                                                    i7Var3.c();
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
                this.f1001o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f18357id = storyItem.f18348id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            if (this.f1003q) {
                tL_stories_getStoryViewsList.f18358q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = u6Var.f1575c;
                tL_stories_getStoryViewsList.f18358q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = u6Var.f1574b;
                tL_stories_getStoryViewsList.reactions_first = u6Var.f1573a;
            }
            tL_stories_getStoryViewsList.limit = (this.f998l || this.f994g.size() < 20) ? 20 : 20;
            String str3 = this.f1000n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f18348id + " " + this.f998l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f18358q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final i7 f898b;

                {
                    this.f898b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final i7 i7Var = this.f898b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            i7 i7Var22 = i7Var;
                                            ArrayList arrayList = i7Var22.f1004r;
                                            ArrayList arrayList2 = i7Var22.h;
                                            int i12 = i7Var22.d;
                                            ArrayList arrayList3 = i7Var22.f994g;
                                            TL_stories.StoryItem storyItem2 = i7Var22.f991b;
                                            if (iArr2[0] != i7Var22.f1001o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " localId != reqId");
                                                return;
                                            }
                                            i7Var22.e = false;
                                            i7Var22.f1001o = -1;
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
                                                if (i7Var22.f998l) {
                                                    i7Var22.f998l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        i7Var22.f1002p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (i7Var22.f1003q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    i7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    i7Var22.f999m = true;
                                                } else {
                                                    i7Var22.f999m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                i7Var22.f1000n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    i7Var22.f999m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18259id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    i7Var22.f990a = 0;
                                                }
                                                i7Var22.f999m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " response  totalItems " + arrayList3.size() + " has next " + i7Var22.f999m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((j7) arrayList.get(i19)).e(i7Var22);
                                            }
                                            if (arrayList3.size() < 20 && i7Var22.f999m) {
                                                i7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            i7 i7Var3 = i7Var;
                                            ArrayList arrayList4 = i7Var3.f1004r;
                                            TL_stories.StoryItem storyItem3 = i7Var3.f991b;
                                            int i20 = i7Var3.d;
                                            ArrayList arrayList5 = i7Var3.f995i;
                                            if (iArr2[0] != i7Var3.f1001o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " localId != reqId");
                                                return;
                                            }
                                            i7Var3.e = false;
                                            i7Var3.f1001o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (i7Var3.f998l) {
                                                    i7Var3.f998l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        i7Var3.f1002p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    i7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    i7Var3.f999m = true;
                                                } else {
                                                    i7Var3.f999m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                i7Var3.f1000n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    i7Var3.f999m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = i7Var3.f990a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                i7Var3.f990a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    i7Var3.f990a = 0;
                                                }
                                                i7Var3.f999m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " response  totalItems " + arrayList5.size() + " has next " + i7Var3.f999m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((j7) arrayList4.get(i24)).e(i7Var3);
                                            }
                                            if (arrayList5.size() < 20 && i7Var3.f999m) {
                                                i7Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final i7 i7Var2 = this.f898b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            i7 i7Var22 = i7Var2;
                                            ArrayList arrayList = i7Var22.f1004r;
                                            ArrayList arrayList2 = i7Var22.h;
                                            int i12 = i7Var22.d;
                                            ArrayList arrayList3 = i7Var22.f994g;
                                            TL_stories.StoryItem storyItem2 = i7Var22.f991b;
                                            if (iArr22[0] != i7Var22.f1001o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " localId != reqId");
                                                return;
                                            }
                                            i7Var22.e = false;
                                            i7Var22.f1001o = -1;
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
                                                if (i7Var22.f998l) {
                                                    i7Var22.f998l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        i7Var22.f1002p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (i7Var22.f1003q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    i7Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    i7Var22.f999m = true;
                                                } else {
                                                    i7Var22.f999m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                i7Var22.f1000n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    i7Var22.f999m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f18259id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    i7Var22.f990a = 0;
                                                }
                                                i7Var22.f999m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f18348id + " response  totalItems " + arrayList3.size() + " has next " + i7Var22.f999m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((j7) arrayList.get(i19)).e(i7Var22);
                                            }
                                            if (arrayList3.size() < 20 && i7Var22.f999m) {
                                                i7Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            i7 i7Var3 = i7Var2;
                                            ArrayList arrayList4 = i7Var3.f1004r;
                                            TL_stories.StoryItem storyItem3 = i7Var3.f991b;
                                            int i20 = i7Var3.d;
                                            ArrayList arrayList5 = i7Var3.f995i;
                                            if (iArr22[0] != i7Var3.f1001o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " localId != reqId");
                                                return;
                                            }
                                            i7Var3.e = false;
                                            i7Var3.f1001o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (i7Var3.f998l) {
                                                    i7Var3.f998l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        i7Var3.f1002p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    i7Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    i7Var3.f999m = true;
                                                } else {
                                                    i7Var3.f999m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                i7Var3.f1000n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    i7Var3.f999m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = i7Var3.f990a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                i7Var3.f990a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    i7Var3.f990a = 0;
                                                }
                                                i7Var3.f999m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f18348id + " response  totalItems " + arrayList5.size() + " has next " + i7Var3.f999m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((j7) arrayList4.get(i24)).e(i7Var3);
                                            }
                                            if (arrayList5.size() < 20 && i7Var3.f999m) {
                                                i7Var3.c();
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
            this.f1001o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f1001o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f1001o, false);
        }
        this.f1001o = -1;
    }

    public final void e(u6 u6Var, boolean z10, boolean z11) {
        u6 u6Var2 = new u6();
        u6Var2.f1573a = u6Var.f1573a;
        u6Var2.f1574b = u6Var.f1574b;
        u6Var2.f1575c = u6Var.f1575c;
        int i10 = 0;
        if (!z10) {
            u6Var2.f1574b = false;
        }
        if (!z11) {
            u6Var2.f1573a = true;
        }
        u6 u6Var3 = this.f1005s;
        if (!u6Var3.equals(u6Var2)) {
            u6Var3.f1573a = u6Var2.f1573a;
            u6Var3.f1574b = u6Var2.f1574b;
            u6Var3.f1575c = u6Var2.f1575c;
            if (!this.f993f && this.f1003q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f1004r;
                    if (i10 < arrayList.size()) {
                        ((j7) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f994g.clear();
                this.f995i.clear();
                this.f998l = true;
                this.e = false;
                this.f999m = true;
                this.f1000n = "";
                c();
            }
        }
    }
}
