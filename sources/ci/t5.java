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
    public int f6009a;
    public final TL_stories.StoryItem f6010b;
    public final long f6011c;
    public final int d;
    public boolean e;
    public final boolean f6012f;
    public final boolean f6015j;
    public final boolean f6016k;
    public boolean f6017l;
    public String f6019n;
    public final boolean f6022q;
    public final ArrayList f6013g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f6014i = new ArrayList();
    public boolean f6018m = true;
    public int f6020o = -1;
    public final HashSet f6021p = new HashSet();
    public final ArrayList f6023r = new ArrayList();
    public final f5 f6024s = new f5();

    public t5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f6010b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6012f = z10;
        this.f6011c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f6009a = i11;
        if (i11 < 200) {
            this.f6022q = true;
        }
        if (d8.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6015j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f6015j = false;
            this.f6016k = true;
        }
        if (!this.f6015j) {
            this.f6017l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f6013g.add(tL_storyView);
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
        if (!this.f6012f) {
            ArrayList arrayList = this.f6013g;
            arrayList.clear();
            f5 f5Var = this.f6024s;
            boolean z11 = f5Var.f5389b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(f5Var.f5390c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(f5Var.f5390c)) {
                    str = f5Var.f5390c.trim().toLowerCase();
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
                    if (f5Var.f5389b && (user == null || !user.contact)) {
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
            if (!f5Var.f5388a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.u8(6)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f6012f) {
            arrayList = this.f6014i;
        } else {
            arrayList = this.f6013g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f6018m && !this.f6015j) {
            boolean z10 = this.f6012f;
            int i10 = 100;
            long j10 = this.f6011c;
            f5 f5Var = this.f6024s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f6010b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = f5Var.f5388a;
                tL_getStoryReactionsList.f20514id = storyItem.f20513id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                if (this.f6017l || this.f6014i.size() < 20) {
                    i10 = 20;
                }
                tL_getStoryReactionsList.limit = i10;
                String str = this.f6019n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f20513id + " " + this.f6017l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final t5 f5919b;

                    {
                        this.f5919b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final t5 t5Var = this.f5919b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                t5 t5Var2 = t5Var;
                                                ArrayList arrayList = t5Var2.f6023r;
                                                ArrayList arrayList2 = t5Var2.h;
                                                int i12 = t5Var2.d;
                                                ArrayList arrayList3 = t5Var2.f6013g;
                                                TL_stories.StoryItem storyItem2 = t5Var2.f6010b;
                                                if (iArr[0] != t5Var2.f6020o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var2.e = false;
                                                t5Var2.f6020o = -1;
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
                                                    if (t5Var2.f6017l) {
                                                        t5Var2.f6017l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            t5Var2.f6021p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var2.f6022q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        t5Var2.f6018m = true;
                                                    } else {
                                                        t5Var2.f6018m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var2.f6019n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var2.f6018m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20426id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        t5Var2.f6009a = 0;
                                                    }
                                                    t5Var2.f6018m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " response  totalItems " + arrayList3.size() + " has next " + t5Var2.f6018m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((u5) arrayList.get(i19)).e(t5Var2);
                                                }
                                                if (arrayList3.size() < 20 && t5Var2.f6018m) {
                                                    t5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                t5 t5Var3 = t5Var;
                                                ArrayList arrayList4 = t5Var3.f6023r;
                                                TL_stories.StoryItem storyItem3 = t5Var3.f6010b;
                                                int i20 = t5Var3.d;
                                                ArrayList arrayList5 = t5Var3.f6014i;
                                                if (iArr[0] != t5Var3.f6020o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var3.e = false;
                                                t5Var3.f6020o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.f6017l) {
                                                        t5Var3.f6017l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            t5Var3.f6021p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.f6018m = true;
                                                    } else {
                                                        t5Var3.f6018m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.f6019n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.f6018m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = t5Var3.f6009a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    t5Var3.f6009a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.f6009a = 0;
                                                    }
                                                    t5Var3.f6018m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6018m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((u5) arrayList4.get(i24)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.f6018m) {
                                                    t5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final t5 t5Var2 = this.f5919b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                t5 t5Var22 = t5Var2;
                                                ArrayList arrayList = t5Var22.f6023r;
                                                ArrayList arrayList2 = t5Var22.h;
                                                int i12 = t5Var22.d;
                                                ArrayList arrayList3 = t5Var22.f6013g;
                                                TL_stories.StoryItem storyItem2 = t5Var22.f6010b;
                                                if (iArr2[0] != t5Var22.f6020o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var22.e = false;
                                                t5Var22.f6020o = -1;
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
                                                    if (t5Var22.f6017l) {
                                                        t5Var22.f6017l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            t5Var22.f6021p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var22.f6022q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        t5Var22.f6018m = true;
                                                    } else {
                                                        t5Var22.f6018m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var22.f6019n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var22.f6018m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20426id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        t5Var22.f6009a = 0;
                                                    }
                                                    t5Var22.f6018m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6018m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((u5) arrayList.get(i19)).e(t5Var22);
                                                }
                                                if (arrayList3.size() < 20 && t5Var22.f6018m) {
                                                    t5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                t5 t5Var3 = t5Var2;
                                                ArrayList arrayList4 = t5Var3.f6023r;
                                                TL_stories.StoryItem storyItem3 = t5Var3.f6010b;
                                                int i20 = t5Var3.d;
                                                ArrayList arrayList5 = t5Var3.f6014i;
                                                if (iArr2[0] != t5Var3.f6020o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " localId != reqId");
                                                    return;
                                                }
                                                t5Var3.e = false;
                                                t5Var3.f6020o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.f6017l) {
                                                        t5Var3.f6017l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            t5Var3.f6021p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.f6018m = true;
                                                    } else {
                                                        t5Var3.f6018m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.f6019n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.f6018m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = t5Var3.f6009a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    t5Var3.f6009a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.f6009a = 0;
                                                    }
                                                    t5Var3.f6018m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6018m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((u5) arrayList4.get(i24)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.f6018m) {
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
                this.f6020o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20522id = storyItem.f20513id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f6022q) {
                tL_stories_getStoryViewsList.f20523q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = f5Var.f5390c;
                tL_stories_getStoryViewsList.f20523q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = f5Var.f5389b;
                tL_stories_getStoryViewsList.reactions_first = f5Var.f5388a;
            }
            if (this.f6017l || this.f6013g.size() < 20) {
                i10 = 20;
            }
            tL_stories_getStoryViewsList.limit = i10;
            String str3 = this.f6019n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f20513id + " " + this.f6017l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20523q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final t5 f5919b;

                {
                    this.f5919b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final t5 t5Var = this.f5919b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            t5 t5Var22 = t5Var;
                                            ArrayList arrayList = t5Var22.f6023r;
                                            ArrayList arrayList2 = t5Var22.h;
                                            int i12 = t5Var22.d;
                                            ArrayList arrayList3 = t5Var22.f6013g;
                                            TL_stories.StoryItem storyItem2 = t5Var22.f6010b;
                                            if (iArr2[0] != t5Var22.f6020o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " localId != reqId");
                                                return;
                                            }
                                            t5Var22.e = false;
                                            t5Var22.f6020o = -1;
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
                                                if (t5Var22.f6017l) {
                                                    t5Var22.f6017l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        t5Var22.f6021p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.f6022q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    t5Var22.f6018m = true;
                                                } else {
                                                    t5Var22.f6018m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.f6019n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.f6018m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20426id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    t5Var22.f6009a = 0;
                                                }
                                                t5Var22.f6018m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6018m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((u5) arrayList.get(i19)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.f6018m) {
                                                t5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            t5 t5Var3 = t5Var;
                                            ArrayList arrayList4 = t5Var3.f6023r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.f6010b;
                                            int i20 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.f6014i;
                                            if (iArr2[0] != t5Var3.f6020o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " localId != reqId");
                                                return;
                                            }
                                            t5Var3.e = false;
                                            t5Var3.f6020o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.f6017l) {
                                                    t5Var3.f6017l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        t5Var3.f6021p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.f6018m = true;
                                                } else {
                                                    t5Var3.f6018m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.f6019n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.f6018m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = t5Var3.f6009a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                t5Var3.f6009a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.f6009a = 0;
                                                }
                                                t5Var3.f6018m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6018m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((u5) arrayList4.get(i24)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.f6018m) {
                                                t5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final t5 t5Var2 = this.f5919b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            t5 t5Var22 = t5Var2;
                                            ArrayList arrayList = t5Var22.f6023r;
                                            ArrayList arrayList2 = t5Var22.h;
                                            int i12 = t5Var22.d;
                                            ArrayList arrayList3 = t5Var22.f6013g;
                                            TL_stories.StoryItem storyItem2 = t5Var22.f6010b;
                                            if (iArr22[0] != t5Var22.f6020o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " localId != reqId");
                                                return;
                                            }
                                            t5Var22.e = false;
                                            t5Var22.f6020o = -1;
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
                                                if (t5Var22.f6017l) {
                                                    t5Var22.f6017l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        t5Var22.f6021p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.f6022q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    t5Var22.f6018m = true;
                                                } else {
                                                    t5Var22.f6018m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.f6019n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.f6018m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i16).f20426id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    t5Var22.f6009a = 0;
                                                }
                                                t5Var22.f6018m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20513id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.f6018m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((u5) arrayList.get(i19)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.f6018m) {
                                                t5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            t5 t5Var3 = t5Var2;
                                            ArrayList arrayList4 = t5Var3.f6023r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.f6010b;
                                            int i20 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.f6014i;
                                            if (iArr22[0] != t5Var3.f6020o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " localId != reqId");
                                                return;
                                            }
                                            t5Var3.e = false;
                                            t5Var3.f6020o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.f6017l) {
                                                    t5Var3.f6017l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        t5Var3.f6021p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.f6018m = true;
                                                } else {
                                                    t5Var3.f6018m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.f6019n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.f6018m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = t5Var3.f6009a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                t5Var3.f6009a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.f6009a = 0;
                                                }
                                                t5Var3.f6018m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20513id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.f6018m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((u5) arrayList4.get(i24)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.f6018m) {
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
            this.f6020o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f6020o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f6020o, false);
        }
        this.f6020o = -1;
    }

    public final void e(f5 f5Var, boolean z10, boolean z11) {
        f5 f5Var2 = new f5();
        f5Var2.f5388a = f5Var.f5388a;
        f5Var2.f5389b = f5Var.f5389b;
        f5Var2.f5390c = f5Var.f5390c;
        int i10 = 0;
        if (!z10) {
            f5Var2.f5389b = false;
        }
        if (!z11) {
            f5Var2.f5388a = true;
        }
        f5 f5Var3 = this.f6024s;
        if (!f5Var3.equals(f5Var2)) {
            f5Var3.f5388a = f5Var2.f5388a;
            f5Var3.f5389b = f5Var2.f5389b;
            f5Var3.f5390c = f5Var2.f5390c;
            if (!this.f6012f && this.f6022q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f6023r;
                    if (i10 < arrayList.size()) {
                        ((u5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f6013g.clear();
                this.f6014i.clear();
                this.f6017l = true;
                this.e = false;
                this.f6018m = true;
                this.f6019n = "";
                c();
            }
        }
    }
}
