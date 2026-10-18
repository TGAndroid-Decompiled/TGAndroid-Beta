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
public final class s5 {
    public int f5910a;
    public final TL_stories.StoryItem f5911b;
    public final long f5912c;
    public final int d;
    public boolean e;
    public final boolean f5913f;
    public final boolean f5916j;
    public final boolean f5917k;
    public boolean f5918l;
    public String f5920n;
    public final boolean f5923q;
    public final ArrayList f5914g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f5915i = new ArrayList();
    public boolean f5919m = true;
    public int f5921o = -1;
    public final HashSet f5922p = new HashSet();
    public final ArrayList f5924r = new ArrayList();
    public final e5 f5925s = new e5();

    public s5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f5911b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5913f = z10;
        this.f5912c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f5910a = i11;
        if (i11 < 200) {
            this.f5923q = true;
        }
        if (c8.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5916j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f5916j = false;
            this.f5917k = true;
        }
        if (!this.f5916j) {
            this.f5918l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f5914g.add(tL_storyView);
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
        if (!this.f5913f) {
            ArrayList arrayList = this.f5914g;
            arrayList.clear();
            e5 e5Var = this.f5925s;
            boolean z11 = e5Var.f5287b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(e5Var.f5288c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(e5Var.f5288c)) {
                    str = e5Var.f5288c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = r4.c.h(" ", str);
                    str3 = r4.c.h(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (e5Var.f5287b && (user == null || !user.contact)) {
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
            if (!e5Var.f5286a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.u8(6)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f5913f) {
            arrayList = this.f5915i;
        } else {
            arrayList = this.f5914g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f5919m && !this.f5916j) {
            boolean z10 = this.f5913f;
            int i10 = 100;
            long j10 = this.f5912c;
            e5 e5Var = this.f5925s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f5911b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = e5Var.f5286a;
                tL_getStoryReactionsList.f20507id = storyItem.f20506id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                if (this.f5918l || this.f5915i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f5920n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f20506id + " " + this.f5918l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final s5 f5782b;

                    {
                        this.f5782b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final s5 s5Var = this.f5782b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                s5 s5Var2 = s5Var;
                                                ArrayList arrayList = s5Var2.f5924r;
                                                ArrayList arrayList2 = s5Var2.h;
                                                int i12 = s5Var2.d;
                                                ArrayList arrayList3 = s5Var2.f5914g;
                                                TL_stories.StoryItem storyItem2 = s5Var2.f5911b;
                                                if (iArr[0] != s5Var2.f5921o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var2.e = false;
                                                s5Var2.f5921o = -1;
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
                                                    if (s5Var2.f5918l) {
                                                        s5Var2.f5918l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            s5Var2.f5922p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (s5Var2.f5923q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        s5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        s5Var2.f5919m = true;
                                                    } else {
                                                        s5Var2.f5919m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    s5Var2.f5920n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        s5Var2.f5919m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        s5Var2.f5910a = 0;
                                                    }
                                                    s5Var2.f5919m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + s5Var2.f5919m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((t5) arrayList.get(i19)).e(s5Var2);
                                                }
                                                if (arrayList3.size() < 20 && s5Var2.f5919m) {
                                                    s5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                s5 s5Var3 = s5Var;
                                                ArrayList arrayList4 = s5Var3.f5924r;
                                                TL_stories.StoryItem storyItem3 = s5Var3.f5911b;
                                                int i20 = s5Var3.d;
                                                ArrayList arrayList5 = s5Var3.f5915i;
                                                if (iArr[0] != s5Var3.f5921o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var3.e = false;
                                                s5Var3.f5921o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (s5Var3.f5918l) {
                                                        s5Var3.f5918l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            s5Var3.f5922p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        s5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        s5Var3.f5919m = true;
                                                    } else {
                                                        s5Var3.f5919m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    s5Var3.f5920n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        s5Var3.f5919m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = s5Var3.f5910a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    s5Var3.f5910a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        s5Var3.f5910a = 0;
                                                    }
                                                    s5Var3.f5919m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f5919m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((t5) arrayList4.get(i24)).e(s5Var3);
                                                }
                                                if (arrayList5.size() < 20 && s5Var3.f5919m) {
                                                    s5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final s5 s5Var2 = this.f5782b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                s5 s5Var22 = s5Var2;
                                                ArrayList arrayList = s5Var22.f5924r;
                                                ArrayList arrayList2 = s5Var22.h;
                                                int i12 = s5Var22.d;
                                                ArrayList arrayList3 = s5Var22.f5914g;
                                                TL_stories.StoryItem storyItem2 = s5Var22.f5911b;
                                                if (iArr2[0] != s5Var22.f5921o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var22.e = false;
                                                s5Var22.f5921o = -1;
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
                                                    if (s5Var22.f5918l) {
                                                        s5Var22.f5918l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            s5Var22.f5922p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (s5Var22.f5923q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        s5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        s5Var22.f5919m = true;
                                                    } else {
                                                        s5Var22.f5919m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    s5Var22.f5920n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        s5Var22.f5919m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        s5Var22.f5910a = 0;
                                                    }
                                                    s5Var22.f5919m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f5919m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((t5) arrayList.get(i19)).e(s5Var22);
                                                }
                                                if (arrayList3.size() < 20 && s5Var22.f5919m) {
                                                    s5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                s5 s5Var3 = s5Var2;
                                                ArrayList arrayList4 = s5Var3.f5924r;
                                                TL_stories.StoryItem storyItem3 = s5Var3.f5911b;
                                                int i20 = s5Var3.d;
                                                ArrayList arrayList5 = s5Var3.f5915i;
                                                if (iArr2[0] != s5Var3.f5921o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                    return;
                                                }
                                                s5Var3.e = false;
                                                s5Var3.f5921o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (s5Var3.f5918l) {
                                                        s5Var3.f5918l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            s5Var3.f5922p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        s5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        s5Var3.f5919m = true;
                                                    } else {
                                                        s5Var3.f5919m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    s5Var3.f5920n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        s5Var3.f5919m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = s5Var3.f5910a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    s5Var3.f5910a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        s5Var3.f5910a = 0;
                                                    }
                                                    s5Var3.f5919m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f5919m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((t5) arrayList4.get(i24)).e(s5Var3);
                                                }
                                                if (arrayList5.size() < 20 && s5Var3.f5919m) {
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
                this.f5921o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20515id = storyItem.f20506id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f5923q) {
                tL_stories_getStoryViewsList.f20516q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = e5Var.f5288c;
                tL_stories_getStoryViewsList.f20516q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = e5Var.f5287b;
                tL_stories_getStoryViewsList.reactions_first = e5Var.f5286a;
            }
            if (this.f5918l || this.f5914g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f5920n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f20506id + " " + this.f5918l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20516q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final s5 f5782b;

                {
                    this.f5782b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final s5 s5Var = this.f5782b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            s5 s5Var22 = s5Var;
                                            ArrayList arrayList = s5Var22.f5924r;
                                            ArrayList arrayList2 = s5Var22.h;
                                            int i12 = s5Var22.d;
                                            ArrayList arrayList3 = s5Var22.f5914g;
                                            TL_stories.StoryItem storyItem2 = s5Var22.f5911b;
                                            if (iArr2[0] != s5Var22.f5921o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                return;
                                            }
                                            s5Var22.e = false;
                                            s5Var22.f5921o = -1;
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
                                                if (s5Var22.f5918l) {
                                                    s5Var22.f5918l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        s5Var22.f5922p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (s5Var22.f5923q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    s5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    s5Var22.f5919m = true;
                                                } else {
                                                    s5Var22.f5919m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                s5Var22.f5920n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    s5Var22.f5919m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    s5Var22.f5910a = 0;
                                                }
                                                s5Var22.f5919m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f5919m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((t5) arrayList.get(i19)).e(s5Var22);
                                            }
                                            if (arrayList3.size() < 20 && s5Var22.f5919m) {
                                                s5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            s5 s5Var3 = s5Var;
                                            ArrayList arrayList4 = s5Var3.f5924r;
                                            TL_stories.StoryItem storyItem3 = s5Var3.f5911b;
                                            int i20 = s5Var3.d;
                                            ArrayList arrayList5 = s5Var3.f5915i;
                                            if (iArr2[0] != s5Var3.f5921o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                return;
                                            }
                                            s5Var3.e = false;
                                            s5Var3.f5921o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (s5Var3.f5918l) {
                                                    s5Var3.f5918l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        s5Var3.f5922p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    s5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    s5Var3.f5919m = true;
                                                } else {
                                                    s5Var3.f5919m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                s5Var3.f5920n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    s5Var3.f5919m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = s5Var3.f5910a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                s5Var3.f5910a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    s5Var3.f5910a = 0;
                                                }
                                                s5Var3.f5919m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f5919m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((t5) arrayList4.get(i24)).e(s5Var3);
                                            }
                                            if (arrayList5.size() < 20 && s5Var3.f5919m) {
                                                s5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final s5 s5Var2 = this.f5782b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            s5 s5Var22 = s5Var2;
                                            ArrayList arrayList = s5Var22.f5924r;
                                            ArrayList arrayList2 = s5Var22.h;
                                            int i12 = s5Var22.d;
                                            ArrayList arrayList3 = s5Var22.f5914g;
                                            TL_stories.StoryItem storyItem2 = s5Var22.f5911b;
                                            if (iArr22[0] != s5Var22.f5921o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " localId != reqId");
                                                return;
                                            }
                                            s5Var22.e = false;
                                            s5Var22.f5921o = -1;
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
                                                if (s5Var22.f5918l) {
                                                    s5Var22.f5918l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        s5Var22.f5922p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (s5Var22.f5923q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    s5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    s5Var22.f5919m = true;
                                                } else {
                                                    s5Var22.f5919m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                s5Var22.f5920n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    s5Var22.f5919m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20419id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    s5Var22.f5910a = 0;
                                                }
                                                s5Var22.f5919m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20506id + " response  totalItems " + arrayList3.size() + " has next " + s5Var22.f5919m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((t5) arrayList.get(i19)).e(s5Var22);
                                            }
                                            if (arrayList3.size() < 20 && s5Var22.f5919m) {
                                                s5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            s5 s5Var3 = s5Var2;
                                            ArrayList arrayList4 = s5Var3.f5924r;
                                            TL_stories.StoryItem storyItem3 = s5Var3.f5911b;
                                            int i20 = s5Var3.d;
                                            ArrayList arrayList5 = s5Var3.f5915i;
                                            if (iArr22[0] != s5Var3.f5921o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " localId != reqId");
                                                return;
                                            }
                                            s5Var3.e = false;
                                            s5Var3.f5921o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (s5Var3.f5918l) {
                                                    s5Var3.f5918l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        s5Var3.f5922p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    s5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    s5Var3.f5919m = true;
                                                } else {
                                                    s5Var3.f5919m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                s5Var3.f5920n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    s5Var3.f5919m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = s5Var3.f5910a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                s5Var3.f5910a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    s5Var3.f5910a = 0;
                                                }
                                                s5Var3.f5919m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20506id + " response  totalItems " + arrayList5.size() + " has next " + s5Var3.f5919m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((t5) arrayList4.get(i24)).e(s5Var3);
                                            }
                                            if (arrayList5.size() < 20 && s5Var3.f5919m) {
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
            this.f5921o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f5921o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f5921o, false);
        }
        this.f5921o = -1;
    }

    public final void e(e5 e5Var, boolean z10, boolean z11) {
        e5 e5Var2 = new e5();
        e5Var2.f5286a = e5Var.f5286a;
        e5Var2.f5287b = e5Var.f5287b;
        e5Var2.f5288c = e5Var.f5288c;
        int i10 = 0;
        if (!z10) {
            e5Var2.f5287b = false;
        }
        if (!z11) {
            e5Var2.f5286a = true;
        }
        e5 e5Var3 = this.f5925s;
        if (!e5Var3.equals(e5Var2)) {
            e5Var3.f5286a = e5Var2.f5286a;
            e5Var3.f5287b = e5Var2.f5287b;
            e5Var3.f5288c = e5Var2.f5288c;
            if (!this.f5913f && this.f5923q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f5924r;
                    if (i10 < arrayList.size()) {
                        ((t5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f5914g.clear();
                this.f5915i.clear();
                this.f5918l = true;
                this.e = false;
                this.f5919m = true;
                this.f5920n = "";
                c();
            }
        }
    }
}
