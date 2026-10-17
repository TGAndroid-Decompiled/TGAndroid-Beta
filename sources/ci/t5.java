package ci;

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
public final class t5 {
    public int f6008a;
    public final TL_stories.StoryItem f6009b;
    public final long f6010c;
    public final int d;
    public boolean e;
    public final boolean f6011f;
    public final boolean f6014j;
    public final boolean f6015k;
    public boolean f6016l;
    public String f6018n;
    public final boolean f6021q;
    public final ArrayList f6012g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f6013i = new ArrayList();
    public boolean f6017m = true;
    public int f6019o = -1;
    public final HashSet f6020p = new HashSet();
    public final ArrayList f6022r = new ArrayList();
    public final f5 f6023s = new f5();

    public t5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f6009b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6011f = z10;
        this.f6010c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f6008a = i11;
        if (i11 < 200) {
            this.f6021q = true;
        }
        if (d8.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6014j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f6014j = false;
            this.f6015k = true;
        }
        if (!this.f6014j) {
            this.f6016l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f6012g.add(tL_storyView);
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
        if (!this.f6011f) {
            ArrayList arrayList = this.f6012g;
            arrayList.clear();
            f5 f5Var = this.f6023s;
            boolean z11 = f5Var.f5388b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(f5Var.f5389c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(f5Var.f5389c)) {
                    str = f5Var.f5389c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = r.c.g(" ", str);
                    str3 = r.c.g(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (f5Var.f5388b && (user == null || !user.contact)) {
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
            if (!f5Var.f5387a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.u8(6)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f6011f) {
            arrayList = this.f6013i;
        } else {
            arrayList = this.f6012g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f6017m && !this.f6014j) {
            boolean z10 = this.f6011f;
            int i10 = 100;
            long j10 = this.f6010c;
            f5 f5Var = this.f6023s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f6009b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = f5Var.f5387a;
                tL_getStoryReactionsList.f20507id = storyItem.f20506id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                if (this.f6016l || this.f6013i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f6018n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f20506id + " " + this.f6016l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final t5 f5918b;

                    {
                        this.f5918b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final t5 t5Var = this.f5918b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                t5 t5Var2 = t5Var;
                                                ArrayList arrayList = t5Var2.f6022r;
                                                ArrayList arrayList2 = t5Var2.h;
                                                int i12 = t5Var2.d;
                                                ArrayList arrayList3 = t5Var2.f6012g;
                                                TL_stories.StoryItem storyItem2 = t5Var2.f6009b;
                                                if (iArr[0] != t5Var2.f6019o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var2.e = false;
                                                t5Var2.f6019o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (t5Var2.f6016l) {
                                                        t5Var2.f6016l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            t5Var2.f6020p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var2.f6021q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        t5Var2.f6017m = true;
                                                    } else {
                                                        t5Var2.f6017m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var2.f6018n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var2.f6017m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.cast.a6.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        t5Var2.f6008a = 0;
                                                    }
                                                    t5Var2.f6017m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + t5Var2.f6017m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((u5) arrayList.get(i19)).e(t5Var2);
                                                }
                                                if (arrayList3.size() < 20 && t5Var2.f6017m) {
                                                    t5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                t5 t5Var3 = t5Var;
                                                ArrayList arrayList4 = t5Var3.f6022r;
                                                TL_stories.StoryItem storyItem3 = t5Var3.f6009b;
                                                int i20 = t5Var3.d;
                                                ArrayList arrayList5 = t5Var3.f6013i;
                                                if (iArr[0] != t5Var3.f6019o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var3.e = false;
                                                t5Var3.f6019o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.f6016l) {
                                                        t5Var3.f6016l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            t5Var3.f6020p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.f6017m = true;
                                                    } else {
                                                        t5Var3.f6017m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.f6018n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.f6017m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = t5Var3.f6008a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    t5Var3.f6008a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.f6008a = 0;
                                                    }
                                                    t5Var3.f6017m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6017m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((u5) arrayList4.get(i24)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.f6017m) {
                                                    t5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final t5 t5Var2 = this.f5918b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                t5 t5Var22 = t5Var2;
                                                ArrayList arrayList = t5Var22.f6022r;
                                                ArrayList arrayList2 = t5Var22.h;
                                                int i12 = t5Var22.d;
                                                ArrayList arrayList3 = t5Var22.f6012g;
                                                TL_stories.StoryItem storyItem2 = t5Var22.f6009b;
                                                if (iArr2[0] != t5Var22.f6019o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var22.e = false;
                                                t5Var22.f6019o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (t5Var22.f6016l) {
                                                        t5Var22.f6016l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            t5Var22.f6020p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var22.f6021q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        t5Var22.f6017m = true;
                                                    } else {
                                                        t5Var22.f6017m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var22.f6018n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var22.f6017m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.cast.a6.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        t5Var22.f6008a = 0;
                                                    }
                                                    t5Var22.f6017m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6017m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((u5) arrayList.get(i19)).e(t5Var22);
                                                }
                                                if (arrayList3.size() < 20 && t5Var22.f6017m) {
                                                    t5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                t5 t5Var3 = t5Var2;
                                                ArrayList arrayList4 = t5Var3.f6022r;
                                                TL_stories.StoryItem storyItem3 = t5Var3.f6009b;
                                                int i20 = t5Var3.d;
                                                ArrayList arrayList5 = t5Var3.f6013i;
                                                if (iArr2[0] != t5Var3.f6019o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var3.e = false;
                                                t5Var3.f6019o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.f6016l) {
                                                        t5Var3.f6016l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            t5Var3.f6020p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.f6017m = true;
                                                    } else {
                                                        t5Var3.f6017m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.f6018n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.f6017m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = t5Var3.f6008a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    t5Var3.f6008a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.f6008a = 0;
                                                    }
                                                    t5Var3.f6017m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6017m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((u5) arrayList4.get(i24)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.f6017m) {
                                                    t5Var3.c();
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
                this.f6019o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20515id = storyItem.f20506id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f6021q) {
                tL_stories_getStoryViewsList.f20516q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = f5Var.f5389c;
                tL_stories_getStoryViewsList.f20516q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = f5Var.f5388b;
                tL_stories_getStoryViewsList.reactions_first = f5Var.f5387a;
            }
            if (this.f6016l || this.f6012g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f6018n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f20506id + " " + this.f6016l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20516q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final t5 f5918b;

                {
                    this.f5918b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final t5 t5Var = this.f5918b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            t5 t5Var22 = t5Var;
                                            ArrayList arrayList = t5Var22.f6022r;
                                            ArrayList arrayList2 = t5Var22.h;
                                            int i12 = t5Var22.d;
                                            ArrayList arrayList3 = t5Var22.f6012g;
                                            TL_stories.StoryItem storyItem2 = t5Var22.f6009b;
                                            if (iArr2[0] != t5Var22.f6019o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                return;
                                            }
                                            t5Var22.e = false;
                                            t5Var22.f6019o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (t5Var22.f6016l) {
                                                    t5Var22.f6016l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        t5Var22.f6020p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.f6021q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    t5Var22.f6017m = true;
                                                } else {
                                                    t5Var22.f6017m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.f6018n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.f6017m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.cast.a6.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    t5Var22.f6008a = 0;
                                                }
                                                t5Var22.f6017m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6017m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((u5) arrayList.get(i19)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.f6017m) {
                                                t5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            t5 t5Var3 = t5Var;
                                            ArrayList arrayList4 = t5Var3.f6022r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.f6009b;
                                            int i20 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.f6013i;
                                            if (iArr2[0] != t5Var3.f6019o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                return;
                                            }
                                            t5Var3.e = false;
                                            t5Var3.f6019o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.f6016l) {
                                                    t5Var3.f6016l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        t5Var3.f6020p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.f6017m = true;
                                                } else {
                                                    t5Var3.f6017m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.f6018n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.f6017m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = t5Var3.f6008a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                t5Var3.f6008a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.f6008a = 0;
                                                }
                                                t5Var3.f6017m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6017m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((u5) arrayList4.get(i24)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.f6017m) {
                                                t5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final t5 t5Var2 = this.f5918b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            t5 t5Var22 = t5Var2;
                                            ArrayList arrayList = t5Var22.f6022r;
                                            ArrayList arrayList2 = t5Var22.h;
                                            int i12 = t5Var22.d;
                                            ArrayList arrayList3 = t5Var22.f6012g;
                                            TL_stories.StoryItem storyItem2 = t5Var22.f6009b;
                                            if (iArr22[0] != t5Var22.f6019o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                return;
                                            }
                                            t5Var22.e = false;
                                            t5Var22.f6019o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (t5Var22.f6016l) {
                                                    t5Var22.f6016l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        t5Var22.f6020p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.f6021q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    t5Var22.f6017m = true;
                                                } else {
                                                    t5Var22.f6017m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.f6018n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.f6017m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.cast.a6.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    t5Var22.f6008a = 0;
                                                }
                                                t5Var22.f6017m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6017m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((u5) arrayList.get(i19)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.f6017m) {
                                                t5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            t5 t5Var3 = t5Var2;
                                            ArrayList arrayList4 = t5Var3.f6022r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.f6009b;
                                            int i20 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.f6013i;
                                            if (iArr22[0] != t5Var3.f6019o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                return;
                                            }
                                            t5Var3.e = false;
                                            t5Var3.f6019o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.f6016l) {
                                                    t5Var3.f6016l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        t5Var3.f6020p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.f6017m = true;
                                                } else {
                                                    t5Var3.f6017m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.f6018n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.f6017m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = t5Var3.f6008a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                t5Var3.f6008a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.f6008a = 0;
                                                }
                                                t5Var3.f6017m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6017m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((u5) arrayList4.get(i24)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.f6017m) {
                                                t5Var3.c();
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
            this.f6019o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f6019o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f6019o, false);
        }
        this.f6019o = -1;
    }

    public final void e(f5 f5Var, boolean z10, boolean z11) {
        f5 f5Var2 = new f5();
        f5Var2.f5387a = f5Var.f5387a;
        f5Var2.f5388b = f5Var.f5388b;
        f5Var2.f5389c = f5Var.f5389c;
        int i10 = 0;
        if (!z10) {
            f5Var2.f5388b = false;
        }
        if (!z11) {
            f5Var2.f5387a = true;
        }
        f5 f5Var3 = this.f6023s;
        if (!f5Var3.equals(f5Var2)) {
            f5Var3.f5387a = f5Var2.f5387a;
            f5Var3.f5388b = f5Var2.f5388b;
            f5Var3.f5389c = f5Var2.f5389c;
            if (!this.f6011f && this.f6021q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f6022r;
                    if (i10 < arrayList.size()) {
                        ((u5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f6012g.clear();
                this.f6013i.clear();
                this.f6016l = true;
                this.e = false;
                this.f6017m = true;
                this.f6018n = "";
                c();
            }
        }
    }
}
