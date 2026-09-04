package bi;

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
public final class r6 {
    public int f3640a;
    public final TL_stories.StoryItem f3641b;
    public final long f3642c;
    public final int d;
    public boolean f3643e;
    public final boolean f3644f;
    public final boolean f3647j;
    public final boolean f3648k;
    public boolean f3649l;
    public String f3651n;
    public final boolean f3654q;
    public final ArrayList f3645g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f3646i = new ArrayList();
    public boolean f3650m = true;
    public int f3652o = -1;
    public final HashSet f3653p = new HashSet();
    public final ArrayList f3655r = new ArrayList();
    public final d6 f3656s = new d6();

    public r6(int i10, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f3641b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3644f = z10;
        this.f3642c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f3640a = i11;
        if (i11 < 200) {
            this.f3654q = true;
        }
        if (p9.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3647j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f3647j = false;
            this.f3648k = true;
        }
        if (!this.f3647j) {
            this.f3649l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l4 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l4.longValue();
                    if (MessagesController.getInstance(i10).getUser(l4) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f3645g.add(tL_storyView);
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
        if (!this.f3644f) {
            ArrayList arrayList = this.f3645g;
            arrayList.clear();
            d6 d6Var = this.f3656s;
            boolean z11 = d6Var.f2864b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(d6Var.f2865c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(d6Var.f2865c)) {
                    str = d6Var.f2865c.trim().toLowerCase();
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
                    if (d6Var.f2864b && (user == null || !user.contact)) {
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
            if (!d6Var.f2863a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new o6(0)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f3644f) {
            arrayList = this.f3646i;
        } else {
            arrayList = this.f3645g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f3643e && this.f3650m && !this.f3647j) {
            boolean z10 = this.f3644f;
            int i10 = 100;
            long j3 = this.f3642c;
            d6 d6Var = this.f3656s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f3641b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = d6Var.f2863a;
                tL_getStoryReactionsList.f20108id = storyItem.f20107id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                tL_getStoryReactionsList.limit = (this.f3649l || this.f3646i.size() < 20) ? 20 : 20;
                String str = this.f3651n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f3643e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f20107id + " " + this.f3649l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final r6 f3503b;

                    {
                        this.f3503b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final r6 r6Var = this.f3503b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                r6 r6Var2 = r6Var;
                                                ArrayList arrayList = r6Var2.f3655r;
                                                ArrayList arrayList2 = r6Var2.h;
                                                int i12 = r6Var2.d;
                                                ArrayList arrayList3 = r6Var2.f3645g;
                                                TL_stories.StoryItem storyItem2 = r6Var2.f3641b;
                                                if (iArr[0] != r6Var2.f3652o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " localId != reqId");
                                                    return;
                                                }
                                                r6Var2.f3643e = false;
                                                r6Var2.f3652o = -1;
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
                                                    if (r6Var2.f3649l) {
                                                        r6Var2.f3649l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            r6Var2.f3653p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (r6Var2.f3654q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        r6Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        r6Var2.f3650m = true;
                                                    } else {
                                                        r6Var2.f3650m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    r6Var2.f3651n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        r6Var2.f3650m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20016id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        r6Var2.f3640a = 0;
                                                    }
                                                    r6Var2.f3650m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " response  totalItems " + arrayList3.size() + " has next " + r6Var2.f3650m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((s6) arrayList.get(i19)).e(r6Var2);
                                                }
                                                if (arrayList3.size() < 20 && r6Var2.f3650m) {
                                                    r6Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                r6 r6Var3 = r6Var;
                                                ArrayList arrayList4 = r6Var3.f3655r;
                                                TL_stories.StoryItem storyItem3 = r6Var3.f3641b;
                                                int i20 = r6Var3.d;
                                                ArrayList arrayList5 = r6Var3.f3646i;
                                                if (iArr[0] != r6Var3.f3652o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " localId != reqId");
                                                    return;
                                                }
                                                r6Var3.f3643e = false;
                                                r6Var3.f3652o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (r6Var3.f3649l) {
                                                        r6Var3.f3649l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            r6Var3.f3653p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        r6Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        r6Var3.f3650m = true;
                                                    } else {
                                                        r6Var3.f3650m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    r6Var3.f3651n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        r6Var3.f3650m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = r6Var3.f3640a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    r6Var3.f3640a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        r6Var3.f3640a = 0;
                                                    }
                                                    r6Var3.f3650m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " response  totalItems " + arrayList5.size() + " has next " + r6Var3.f3650m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((s6) arrayList4.get(i24)).e(r6Var3);
                                                }
                                                if (arrayList5.size() < 20 && r6Var3.f3650m) {
                                                    r6Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final r6 r6Var2 = this.f3503b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                r6 r6Var22 = r6Var2;
                                                ArrayList arrayList = r6Var22.f3655r;
                                                ArrayList arrayList2 = r6Var22.h;
                                                int i12 = r6Var22.d;
                                                ArrayList arrayList3 = r6Var22.f3645g;
                                                TL_stories.StoryItem storyItem2 = r6Var22.f3641b;
                                                if (iArr2[0] != r6Var22.f3652o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " localId != reqId");
                                                    return;
                                                }
                                                r6Var22.f3643e = false;
                                                r6Var22.f3652o = -1;
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
                                                    if (r6Var22.f3649l) {
                                                        r6Var22.f3649l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            r6Var22.f3653p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (r6Var22.f3654q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        r6Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        r6Var22.f3650m = true;
                                                    } else {
                                                        r6Var22.f3650m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    r6Var22.f3651n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        r6Var22.f3650m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20016id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        r6Var22.f3640a = 0;
                                                    }
                                                    r6Var22.f3650m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " response  totalItems " + arrayList3.size() + " has next " + r6Var22.f3650m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((s6) arrayList.get(i19)).e(r6Var22);
                                                }
                                                if (arrayList3.size() < 20 && r6Var22.f3650m) {
                                                    r6Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                r6 r6Var3 = r6Var2;
                                                ArrayList arrayList4 = r6Var3.f3655r;
                                                TL_stories.StoryItem storyItem3 = r6Var3.f3641b;
                                                int i20 = r6Var3.d;
                                                ArrayList arrayList5 = r6Var3.f3646i;
                                                if (iArr2[0] != r6Var3.f3652o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " localId != reqId");
                                                    return;
                                                }
                                                r6Var3.f3643e = false;
                                                r6Var3.f3652o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (r6Var3.f3649l) {
                                                        r6Var3.f3649l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            r6Var3.f3653p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        r6Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        r6Var3.f3650m = true;
                                                    } else {
                                                        r6Var3.f3650m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    r6Var3.f3651n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        r6Var3.f3650m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = r6Var3.f3640a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    r6Var3.f3640a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        r6Var3.f3640a = 0;
                                                    }
                                                    r6Var3.f3650m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " response  totalItems " + arrayList5.size() + " has next " + r6Var3.f3650m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((s6) arrayList4.get(i24)).e(r6Var3);
                                                }
                                                if (arrayList5.size() < 20 && r6Var3.f3650m) {
                                                    r6Var3.c();
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
                this.f3652o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f20116id = storyItem.f20107id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            if (this.f3654q) {
                tL_stories_getStoryViewsList.f20117q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = d6Var.f2865c;
                tL_stories_getStoryViewsList.f20117q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = d6Var.f2864b;
                tL_stories_getStoryViewsList.reactions_first = d6Var.f2863a;
            }
            tL_stories_getStoryViewsList.limit = (this.f3649l || this.f3645g.size() < 20) ? 20 : 20;
            String str3 = this.f3651n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f3643e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f20107id + " " + this.f3649l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f20117q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final r6 f3503b;

                {
                    this.f3503b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final r6 r6Var = this.f3503b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            r6 r6Var22 = r6Var;
                                            ArrayList arrayList = r6Var22.f3655r;
                                            ArrayList arrayList2 = r6Var22.h;
                                            int i12 = r6Var22.d;
                                            ArrayList arrayList3 = r6Var22.f3645g;
                                            TL_stories.StoryItem storyItem2 = r6Var22.f3641b;
                                            if (iArr2[0] != r6Var22.f3652o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " localId != reqId");
                                                return;
                                            }
                                            r6Var22.f3643e = false;
                                            r6Var22.f3652o = -1;
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
                                                if (r6Var22.f3649l) {
                                                    r6Var22.f3649l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        r6Var22.f3653p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (r6Var22.f3654q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    r6Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    r6Var22.f3650m = true;
                                                } else {
                                                    r6Var22.f3650m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                r6Var22.f3651n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    r6Var22.f3650m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20016id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    r6Var22.f3640a = 0;
                                                }
                                                r6Var22.f3650m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " response  totalItems " + arrayList3.size() + " has next " + r6Var22.f3650m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((s6) arrayList.get(i19)).e(r6Var22);
                                            }
                                            if (arrayList3.size() < 20 && r6Var22.f3650m) {
                                                r6Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            r6 r6Var3 = r6Var;
                                            ArrayList arrayList4 = r6Var3.f3655r;
                                            TL_stories.StoryItem storyItem3 = r6Var3.f3641b;
                                            int i20 = r6Var3.d;
                                            ArrayList arrayList5 = r6Var3.f3646i;
                                            if (iArr2[0] != r6Var3.f3652o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " localId != reqId");
                                                return;
                                            }
                                            r6Var3.f3643e = false;
                                            r6Var3.f3652o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (r6Var3.f3649l) {
                                                    r6Var3.f3649l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        r6Var3.f3653p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    r6Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    r6Var3.f3650m = true;
                                                } else {
                                                    r6Var3.f3650m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                r6Var3.f3651n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    r6Var3.f3650m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = r6Var3.f3640a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                r6Var3.f3640a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    r6Var3.f3640a = 0;
                                                }
                                                r6Var3.f3650m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " response  totalItems " + arrayList5.size() + " has next " + r6Var3.f3650m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((s6) arrayList4.get(i24)).e(r6Var3);
                                            }
                                            if (arrayList5.size() < 20 && r6Var3.f3650m) {
                                                r6Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final r6 r6Var2 = this.f3503b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            r6 r6Var22 = r6Var2;
                                            ArrayList arrayList = r6Var22.f3655r;
                                            ArrayList arrayList2 = r6Var22.h;
                                            int i12 = r6Var22.d;
                                            ArrayList arrayList3 = r6Var22.f3645g;
                                            TL_stories.StoryItem storyItem2 = r6Var22.f3641b;
                                            if (iArr22[0] != r6Var22.f3652o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " localId != reqId");
                                                return;
                                            }
                                            r6Var22.f3643e = false;
                                            r6Var22.f3652o = -1;
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
                                                if (r6Var22.f3649l) {
                                                    r6Var22.f3649l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        r6Var22.f3653p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (r6Var22.f3654q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    r6Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    r6Var22.f3650m = true;
                                                } else {
                                                    r6Var22.f3650m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                r6Var22.f3651n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    r6Var22.f3650m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(storyViewsList.users.get(i16).f20016id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    r6Var22.f3640a = 0;
                                                }
                                                r6Var22.f3650m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f20107id + " response  totalItems " + arrayList3.size() + " has next " + r6Var22.f3650m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((s6) arrayList.get(i19)).e(r6Var22);
                                            }
                                            if (arrayList3.size() < 20 && r6Var22.f3650m) {
                                                r6Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            r6 r6Var3 = r6Var2;
                                            ArrayList arrayList4 = r6Var3.f3655r;
                                            TL_stories.StoryItem storyItem3 = r6Var3.f3641b;
                                            int i20 = r6Var3.d;
                                            ArrayList arrayList5 = r6Var3.f3646i;
                                            if (iArr22[0] != r6Var3.f3652o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " localId != reqId");
                                                return;
                                            }
                                            r6Var3.f3643e = false;
                                            r6Var3.f3652o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (r6Var3.f3649l) {
                                                    r6Var3.f3649l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        r6Var3.f3653p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    r6Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    r6Var3.f3650m = true;
                                                } else {
                                                    r6Var3.f3650m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                r6Var3.f3651n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    r6Var3.f3650m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = r6Var3.f3640a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                r6Var3.f3640a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    r6Var3.f3640a = 0;
                                                }
                                                r6Var3.f3650m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f20107id + " response  totalItems " + arrayList5.size() + " has next " + r6Var3.f3650m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((s6) arrayList4.get(i24)).e(r6Var3);
                                            }
                                            if (arrayList5.size() < 20 && r6Var3.f3650m) {
                                                r6Var3.c();
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
            this.f3652o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f3652o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f3652o, false);
        }
        this.f3652o = -1;
    }

    public final void e(d6 d6Var, boolean z10, boolean z11) {
        d6 d6Var2 = new d6();
        d6Var2.f2863a = d6Var.f2863a;
        d6Var2.f2864b = d6Var.f2864b;
        d6Var2.f2865c = d6Var.f2865c;
        int i10 = 0;
        if (!z10) {
            d6Var2.f2864b = false;
        }
        if (!z11) {
            d6Var2.f2863a = true;
        }
        d6 d6Var3 = this.f3656s;
        if (!d6Var3.equals(d6Var2)) {
            d6Var3.f2863a = d6Var2.f2863a;
            d6Var3.f2864b = d6Var2.f2864b;
            d6Var3.f2865c = d6Var2.f2865c;
            if (!this.f3644f && this.f3654q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f3655r;
                    if (i10 < arrayList.size()) {
                        ((s6) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f3645g.clear();
                this.f3646i.clear();
                this.f3649l = true;
                this.f3643e = false;
                this.f3650m = true;
                this.f3651n = "";
                c();
            }
        }
    }
}
