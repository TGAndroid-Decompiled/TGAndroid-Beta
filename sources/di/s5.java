package di;

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
import org.telegram.ui.Components.b10;
public final class s5 {
    public int f9156a;
    public final TL_stories.StoryItem f9157b;
    public final long f9158c;
    public final int d;
    public boolean e;
    public final boolean f9159f;
    public final boolean f9162j;
    public final boolean f9163k;
    public boolean f9164l;
    public String f9166n;
    public final boolean f9169q;
    public final ArrayList f9160g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f9161i = new ArrayList();
    public boolean f9165m = true;
    public int f9167o = -1;
    public final HashSet f9168p = new HashSet();
    public final ArrayList f9170r = new ArrayList();
    public final e5 f9171s = new e5();

    public s5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f9157b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9159f = z10;
        this.f9158c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f9156a = i11;
        if (i11 < 200) {
            this.f9169q = true;
        }
        if (a8.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9162j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f9162j = false;
            this.f9163k = true;
        }
        if (!this.f9162j) {
            this.f9164l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f9160g.add(tL_storyView);
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
        if (!this.f9159f) {
            ArrayList arrayList = this.f9160g;
            arrayList.clear();
            e5 e5Var = this.f9171s;
            boolean z11 = e5Var.f8520b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(e5Var.f8521c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(e5Var.f8521c)) {
                    str = e5Var.f8521c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = b10.j(" ", str);
                    str3 = b10.j(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (e5Var.f8520b && (user == null || !user.contact)) {
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
            if (!e5Var.f8519a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ag.e(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f9159f) {
            arrayList = this.f9161i;
        } else {
            arrayList = this.f9160g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f9165m && !this.f9162j) {
            boolean z10 = this.f9159f;
            int i10 = 100;
            long j10 = this.f9158c;
            e5 e5Var = this.f9171s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f9157b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = e5Var.f8519a;
                tL_getStoryReactionsList.f22267id = storyItem.f22266id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                if (this.f9164l || this.f9161i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f9166n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f22266id + " " + this.f9164l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final s5 f9055b;

                    {
                        this.f9055b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final s5 s5Var = this.f9055b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                s5 s5Var2 = s5Var;
                                                ArrayList arrayList = s5Var2.f9170r;
                                                ArrayList arrayList2 = s5Var2.h;
                                                int i12 = s5Var2.d;
                                                ArrayList arrayList3 = s5Var2.f9160g;
                                                TL_stories.StoryItem storyItem2 = s5Var2.f9157b;
                                                if (iArr[0] != s5Var2.f9167o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var2.e = false;
                                                s5Var2.f9167o = -1;
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
                                                    if (s5Var2.f9164l) {
                                                        s5Var2.f9164l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            s5Var2.f9168p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (s5Var2.f9169q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        s5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        s5Var2.f9165m = true;
                                                    } else {
                                                        s5Var2.f9165m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    s5Var2.f9166n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        s5Var2.f9165m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.h0.j(storyViewsList.users.get(i16).f22176id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        s5Var2.f9156a = 0;
                                                    }
                                                    s5Var2.f9165m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " response  totalItems " + arrayList3.size() + " has next " + s5Var2.f9165m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((t5) arrayList.get(i19)).e(s5Var2);
                                                }
                                                if (arrayList3.size() < 20 && s5Var2.f9165m) {
                                                    s5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                s5 s5Var3 = s5Var;
                                                ArrayList arrayList4 = s5Var3.f9170r;
                                                TL_stories.StoryItem storyItem3 = s5Var3.f9157b;
                                                int i20 = s5Var3.d;
                                                ArrayList arrayList5 = s5Var3.f9161i;
                                                if (iArr[0] != s5Var3.f9167o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var3.e = false;
                                                s5Var3.f9167o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (s5Var3.f9164l) {
                                                        s5Var3.f9164l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            s5Var3.f9168p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        s5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        s5Var3.f9165m = true;
                                                    } else {
                                                        s5Var3.f9165m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    s5Var3.f9166n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        s5Var3.f9165m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = s5Var3.f9156a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    s5Var3.f9156a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        s5Var3.f9156a = 0;
                                                    }
                                                    s5Var3.f9165m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f9165m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((t5) arrayList4.get(i24)).e(s5Var3);
                                                }
                                                if (arrayList5.size() < 20 && s5Var3.f9165m) {
                                                    s5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final s5 s5Var2 = this.f9055b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                s5 s5Var22 = s5Var2;
                                                ArrayList arrayList = s5Var22.f9170r;
                                                ArrayList arrayList2 = s5Var22.h;
                                                int i12 = s5Var22.d;
                                                ArrayList arrayList3 = s5Var22.f9160g;
                                                TL_stories.StoryItem storyItem2 = s5Var22.f9157b;
                                                if (iArr2[0] != s5Var22.f9167o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var22.e = false;
                                                s5Var22.f9167o = -1;
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
                                                    if (s5Var22.f9164l) {
                                                        s5Var22.f9164l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            s5Var22.f9168p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (s5Var22.f9169q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        s5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        s5Var22.f9165m = true;
                                                    } else {
                                                        s5Var22.f9165m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    s5Var22.f9166n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        s5Var22.f9165m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.h0.j(storyViewsList.users.get(i16).f22176id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        s5Var22.f9156a = 0;
                                                    }
                                                    s5Var22.f9165m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f9165m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((t5) arrayList.get(i19)).e(s5Var22);
                                                }
                                                if (arrayList3.size() < 20 && s5Var22.f9165m) {
                                                    s5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                s5 s5Var3 = s5Var2;
                                                ArrayList arrayList4 = s5Var3.f9170r;
                                                TL_stories.StoryItem storyItem3 = s5Var3.f9157b;
                                                int i20 = s5Var3.d;
                                                ArrayList arrayList5 = s5Var3.f9161i;
                                                if (iArr2[0] != s5Var3.f9167o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var3.e = false;
                                                s5Var3.f9167o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (s5Var3.f9164l) {
                                                        s5Var3.f9164l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            s5Var3.f9168p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        s5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        s5Var3.f9165m = true;
                                                    } else {
                                                        s5Var3.f9165m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    s5Var3.f9166n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        s5Var3.f9165m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = s5Var3.f9156a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    s5Var3.f9156a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        s5Var3.f9156a = 0;
                                                    }
                                                    s5Var3.f9165m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f9165m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((t5) arrayList4.get(i24)).e(s5Var3);
                                                }
                                                if (arrayList5.size() < 20 && s5Var3.f9165m) {
                                                    s5Var3.c();
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
                this.f9167o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f22275id = storyItem.f22266id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f9169q) {
                tL_stories_getStoryViewsList.f22276q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = e5Var.f8521c;
                tL_stories_getStoryViewsList.f22276q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = e5Var.f8520b;
                tL_stories_getStoryViewsList.reactions_first = e5Var.f8519a;
            }
            if (this.f9164l || this.f9160g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f9166n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f22266id + " " + this.f9164l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f22276q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final s5 f9055b;

                {
                    this.f9055b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final s5 s5Var = this.f9055b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            s5 s5Var22 = s5Var;
                                            ArrayList arrayList = s5Var22.f9170r;
                                            ArrayList arrayList2 = s5Var22.h;
                                            int i12 = s5Var22.d;
                                            ArrayList arrayList3 = s5Var22.f9160g;
                                            TL_stories.StoryItem storyItem2 = s5Var22.f9157b;
                                            if (iArr2[0] != s5Var22.f9167o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " localId != reqId");
                                                return;
                                            }
                                            s5Var22.e = false;
                                            s5Var22.f9167o = -1;
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
                                                if (s5Var22.f9164l) {
                                                    s5Var22.f9164l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        s5Var22.f9168p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (s5Var22.f9169q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    s5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    s5Var22.f9165m = true;
                                                } else {
                                                    s5Var22.f9165m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                s5Var22.f9166n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    s5Var22.f9165m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.h0.j(storyViewsList.users.get(i16).f22176id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    s5Var22.f9156a = 0;
                                                }
                                                s5Var22.f9165m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f9165m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((t5) arrayList.get(i19)).e(s5Var22);
                                            }
                                            if (arrayList3.size() < 20 && s5Var22.f9165m) {
                                                s5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            s5 s5Var3 = s5Var;
                                            ArrayList arrayList4 = s5Var3.f9170r;
                                            TL_stories.StoryItem storyItem3 = s5Var3.f9157b;
                                            int i20 = s5Var3.d;
                                            ArrayList arrayList5 = s5Var3.f9161i;
                                            if (iArr2[0] != s5Var3.f9167o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " localId != reqId");
                                                return;
                                            }
                                            s5Var3.e = false;
                                            s5Var3.f9167o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (s5Var3.f9164l) {
                                                    s5Var3.f9164l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        s5Var3.f9168p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    s5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    s5Var3.f9165m = true;
                                                } else {
                                                    s5Var3.f9165m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                s5Var3.f9166n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    s5Var3.f9165m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = s5Var3.f9156a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                s5Var3.f9156a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    s5Var3.f9156a = 0;
                                                }
                                                s5Var3.f9165m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f9165m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((t5) arrayList4.get(i24)).e(s5Var3);
                                            }
                                            if (arrayList5.size() < 20 && s5Var3.f9165m) {
                                                s5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final s5 s5Var2 = this.f9055b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            s5 s5Var22 = s5Var2;
                                            ArrayList arrayList = s5Var22.f9170r;
                                            ArrayList arrayList2 = s5Var22.h;
                                            int i12 = s5Var22.d;
                                            ArrayList arrayList3 = s5Var22.f9160g;
                                            TL_stories.StoryItem storyItem2 = s5Var22.f9157b;
                                            if (iArr22[0] != s5Var22.f9167o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " localId != reqId");
                                                return;
                                            }
                                            s5Var22.e = false;
                                            s5Var22.f9167o = -1;
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
                                                if (s5Var22.f9164l) {
                                                    s5Var22.f9164l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        s5Var22.f9168p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (s5Var22.f9169q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    s5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    s5Var22.f9165m = true;
                                                } else {
                                                    s5Var22.f9165m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                s5Var22.f9166n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    s5Var22.f9165m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = c3.h0.j(storyViewsList.users.get(i16).f22176id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    s5Var22.f9156a = 0;
                                                }
                                                s5Var22.f9165m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22266id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f9165m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((t5) arrayList.get(i19)).e(s5Var22);
                                            }
                                            if (arrayList3.size() < 20 && s5Var22.f9165m) {
                                                s5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            s5 s5Var3 = s5Var2;
                                            ArrayList arrayList4 = s5Var3.f9170r;
                                            TL_stories.StoryItem storyItem3 = s5Var3.f9157b;
                                            int i20 = s5Var3.d;
                                            ArrayList arrayList5 = s5Var3.f9161i;
                                            if (iArr22[0] != s5Var3.f9167o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " localId != reqId");
                                                return;
                                            }
                                            s5Var3.e = false;
                                            s5Var3.f9167o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (s5Var3.f9164l) {
                                                    s5Var3.f9164l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        s5Var3.f9168p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    s5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    s5Var3.f9165m = true;
                                                } else {
                                                    s5Var3.f9165m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                s5Var3.f9166n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    s5Var3.f9165m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = s5Var3.f9156a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                s5Var3.f9156a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    s5Var3.f9156a = 0;
                                                }
                                                s5Var3.f9165m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22266id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f9165m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((t5) arrayList4.get(i24)).e(s5Var3);
                                            }
                                            if (arrayList5.size() < 20 && s5Var3.f9165m) {
                                                s5Var3.c();
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
            this.f9167o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f9167o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f9167o, false);
        }
        this.f9167o = -1;
    }

    public final void e(e5 e5Var, boolean z10, boolean z11) {
        e5 e5Var2 = new e5();
        e5Var2.f8519a = e5Var.f8519a;
        e5Var2.f8520b = e5Var.f8520b;
        e5Var2.f8521c = e5Var.f8521c;
        int i10 = 0;
        if (!z10) {
            e5Var2.f8520b = false;
        }
        if (!z11) {
            e5Var2.f8519a = true;
        }
        e5 e5Var3 = this.f9171s;
        if (!e5Var3.equals(e5Var2)) {
            e5Var3.f8519a = e5Var2.f8519a;
            e5Var3.f8520b = e5Var2.f8520b;
            e5Var3.f8521c = e5Var2.f8521c;
            if (!this.f9159f && this.f9169q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f9170r;
                    if (i10 < arrayList.size()) {
                        ((t5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f9160g.clear();
                this.f9161i.clear();
                this.f9164l = true;
                this.e = false;
                this.f9165m = true;
                this.f9166n = "";
                c();
            }
        }
    }
}
