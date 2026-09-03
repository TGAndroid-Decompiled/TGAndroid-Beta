package nh;

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
public final class c5 {
    public int f15126a;
    public final TL_stories.StoryItem f15127b;
    public final long f15128c;
    public final int d;
    public boolean e;
    public final boolean f15129f;
    public final boolean f15132j;
    public final boolean f15133k;
    public boolean f15134l;
    public String f15136n;
    public final boolean f15139q;
    public final ArrayList f15130g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f15131i = new ArrayList();
    public boolean f15135m = true;
    public int f15137o = -1;
    public final HashSet f15138p = new HashSet();
    public final ArrayList f15140r = new ArrayList();
    public final p4 f15141s = new p4();

    public c5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z4;
        int i11;
        boolean z10;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f15127b = storyItem;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15129f = z4;
        this.f15128c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f15126a = i11;
        if (i11 < 200) {
            this.f15139q = true;
        }
        if (m7.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15132j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f15132j = false;
            this.f15133k = true;
        }
        if (!this.f15132j) {
            this.f15134l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l10 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l10.longValue();
                    if (MessagesController.getInstance(i10).getUser(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f15130g.add(tL_storyView);
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
        boolean z4;
        if (!this.f15129f) {
            ArrayList arrayList = this.f15130g;
            arrayList.clear();
            p4 p4Var = this.f15141s;
            boolean z10 = p4Var.f15727b;
            ArrayList arrayList2 = this.h;
            if (!z10 && TextUtils.isEmpty(p4Var.f15728c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(p4Var.f15728c)) {
                    str = p4Var.f15728c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = vh.w2.e(" ", str);
                    str3 = vh.w2.e(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (p4Var.f15727b && (user == null || !user.contact)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4 && str != null) {
                        String lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        String publicUsername = UserObject.getPublicUsername(user);
                        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && ((translitSafe == null || (!translitSafe.startsWith(str2) && !translitSafe.contains(str3))) && (publicUsername == null || (!publicUsername.startsWith(str2) && !publicUsername.contains(str3))))) {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                    }
                }
            }
            if (!p4Var.f15726a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new kf.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f15129f) {
            arrayList = this.f15131i;
        } else {
            arrayList = this.f15130g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.f15135m && !this.f15132j) {
            boolean z4 = this.f15129f;
            int i10 = 100;
            long j10 = this.f15128c;
            p4 p4Var = this.f15141s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f15127b;
            if (z4) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = p4Var.f15726a;
                tL_getStoryReactionsList.f19395id = storyItem.f19394id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_getStoryReactionsList.limit = (this.f15134l || this.f15131i.size() < 20) ? 20 : 20;
                String str = this.f15136n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f19394id + " " + this.f15134l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final c5 f15051b;

                    {
                        this.f15051b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final c5 c5Var = this.f15051b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                c5 c5Var2 = c5Var;
                                                ArrayList arrayList = c5Var2.f15140r;
                                                ArrayList arrayList2 = c5Var2.h;
                                                int i12 = c5Var2.d;
                                                ArrayList arrayList3 = c5Var2.f15130g;
                                                TL_stories.StoryItem storyItem2 = c5Var2.f15127b;
                                                if (iArr[0] != c5Var2.f15137o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " localId != reqId");
                                                    return;
                                                }
                                                c5Var2.e = false;
                                                c5Var2.f15137o = -1;
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
                                                    boolean z11 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (c5Var2.f15134l) {
                                                        c5Var2.f15134l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            c5Var2.f15138p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (c5Var2.f15139q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        c5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        c5Var2.f15135m = true;
                                                    } else {
                                                        c5Var2.f15135m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    c5Var2.f15136n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        c5Var2.f15135m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f19306id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z11 = z10;
                                                    }
                                                    if (z11) {
                                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        c5Var2.f15126a = 0;
                                                    }
                                                    c5Var2.f15135m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " response  totalItems " + arrayList3.size() + " has next " + c5Var2.f15135m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((d5) arrayList.get(i19)).e(c5Var2);
                                                }
                                                if (arrayList3.size() < 20 && c5Var2.f15135m) {
                                                    c5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                c5 c5Var3 = c5Var;
                                                ArrayList arrayList4 = c5Var3.f15140r;
                                                TL_stories.StoryItem storyItem3 = c5Var3.f15127b;
                                                int i20 = c5Var3.d;
                                                ArrayList arrayList5 = c5Var3.f15131i;
                                                if (iArr[0] != c5Var3.f15137o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " localId != reqId");
                                                    return;
                                                }
                                                c5Var3.e = false;
                                                c5Var3.f15137o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (c5Var3.f15134l) {
                                                        c5Var3.f15134l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            c5Var3.f15138p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        c5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        c5Var3.f15135m = true;
                                                    } else {
                                                        c5Var3.f15135m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    c5Var3.f15136n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        c5Var3.f15135m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = c5Var3.f15126a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z12 = false;
                                                    }
                                                    c5Var3.f15126a = i23;
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        c5Var3.f15126a = 0;
                                                    }
                                                    c5Var3.f15135m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " response  totalItems " + arrayList5.size() + " has next " + c5Var3.f15135m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((d5) arrayList4.get(i24)).e(c5Var3);
                                                }
                                                if (arrayList5.size() < 20 && c5Var3.f15135m) {
                                                    c5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final c5 c5Var2 = this.f15051b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                c5 c5Var22 = c5Var2;
                                                ArrayList arrayList = c5Var22.f15140r;
                                                ArrayList arrayList2 = c5Var22.h;
                                                int i12 = c5Var22.d;
                                                ArrayList arrayList3 = c5Var22.f15130g;
                                                TL_stories.StoryItem storyItem2 = c5Var22.f15127b;
                                                if (iArr2[0] != c5Var22.f15137o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " localId != reqId");
                                                    return;
                                                }
                                                c5Var22.e = false;
                                                c5Var22.f15137o = -1;
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
                                                    boolean z11 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (c5Var22.f15134l) {
                                                        c5Var22.f15134l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            c5Var22.f15138p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (c5Var22.f15139q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        c5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        c5Var22.f15135m = true;
                                                    } else {
                                                        c5Var22.f15135m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    c5Var22.f15136n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        c5Var22.f15135m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f19306id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z11 = z10;
                                                    }
                                                    if (z11) {
                                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        c5Var22.f15126a = 0;
                                                    }
                                                    c5Var22.f15135m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " response  totalItems " + arrayList3.size() + " has next " + c5Var22.f15135m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((d5) arrayList.get(i19)).e(c5Var22);
                                                }
                                                if (arrayList3.size() < 20 && c5Var22.f15135m) {
                                                    c5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                c5 c5Var3 = c5Var2;
                                                ArrayList arrayList4 = c5Var3.f15140r;
                                                TL_stories.StoryItem storyItem3 = c5Var3.f15127b;
                                                int i20 = c5Var3.d;
                                                ArrayList arrayList5 = c5Var3.f15131i;
                                                if (iArr2[0] != c5Var3.f15137o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " localId != reqId");
                                                    return;
                                                }
                                                c5Var3.e = false;
                                                c5Var3.f15137o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (c5Var3.f15134l) {
                                                        c5Var3.f15134l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            c5Var3.f15138p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        c5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        c5Var3.f15135m = true;
                                                    } else {
                                                        c5Var3.f15135m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    c5Var3.f15136n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        c5Var3.f15135m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = c5Var3.f15126a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z12 = false;
                                                    }
                                                    c5Var3.f15126a = i23;
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        c5Var3.f15126a = 0;
                                                    }
                                                    c5Var3.f15135m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " response  totalItems " + arrayList5.size() + " has next " + c5Var3.f15135m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((d5) arrayList4.get(i24)).e(c5Var3);
                                                }
                                                if (arrayList5.size() < 20 && c5Var3.f15135m) {
                                                    c5Var3.c();
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
                this.f15137o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f19403id = storyItem.f19394id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f15139q) {
                tL_stories_getStoryViewsList.f19404q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = p4Var.f15728c;
                tL_stories_getStoryViewsList.f19404q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = p4Var.f15727b;
                tL_stories_getStoryViewsList.reactions_first = p4Var.f15726a;
            }
            tL_stories_getStoryViewsList.limit = (this.f15134l || this.f15130g.size() < 20) ? 20 : 20;
            String str3 = this.f15136n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f19394id + " " + this.f15134l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f19404q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final c5 f15051b;

                {
                    this.f15051b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final c5 c5Var = this.f15051b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            c5 c5Var22 = c5Var;
                                            ArrayList arrayList = c5Var22.f15140r;
                                            ArrayList arrayList2 = c5Var22.h;
                                            int i12 = c5Var22.d;
                                            ArrayList arrayList3 = c5Var22.f15130g;
                                            TL_stories.StoryItem storyItem2 = c5Var22.f15127b;
                                            if (iArr2[0] != c5Var22.f15137o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " localId != reqId");
                                                return;
                                            }
                                            c5Var22.e = false;
                                            c5Var22.f15137o = -1;
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
                                                boolean z11 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (c5Var22.f15134l) {
                                                    c5Var22.f15134l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        c5Var22.f15138p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (c5Var22.f15139q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    c5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    c5Var22.f15135m = true;
                                                } else {
                                                    c5Var22.f15135m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                c5Var22.f15136n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    c5Var22.f15135m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f19306id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z11 = z10;
                                                }
                                                if (z11) {
                                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    c5Var22.f15126a = 0;
                                                }
                                                c5Var22.f15135m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " response  totalItems " + arrayList3.size() + " has next " + c5Var22.f15135m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((d5) arrayList.get(i19)).e(c5Var22);
                                            }
                                            if (arrayList3.size() < 20 && c5Var22.f15135m) {
                                                c5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            c5 c5Var3 = c5Var;
                                            ArrayList arrayList4 = c5Var3.f15140r;
                                            TL_stories.StoryItem storyItem3 = c5Var3.f15127b;
                                            int i20 = c5Var3.d;
                                            ArrayList arrayList5 = c5Var3.f15131i;
                                            if (iArr2[0] != c5Var3.f15137o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " localId != reqId");
                                                return;
                                            }
                                            c5Var3.e = false;
                                            c5Var3.f15137o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (c5Var3.f15134l) {
                                                    c5Var3.f15134l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        c5Var3.f15138p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    c5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    c5Var3.f15135m = true;
                                                } else {
                                                    c5Var3.f15135m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                c5Var3.f15136n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    c5Var3.f15135m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = c5Var3.f15126a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z12 = false;
                                                }
                                                c5Var3.f15126a = i23;
                                                if (z12) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    c5Var3.f15126a = 0;
                                                }
                                                c5Var3.f15135m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " response  totalItems " + arrayList5.size() + " has next " + c5Var3.f15135m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((d5) arrayList4.get(i24)).e(c5Var3);
                                            }
                                            if (arrayList5.size() < 20 && c5Var3.f15135m) {
                                                c5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final c5 c5Var2 = this.f15051b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            c5 c5Var22 = c5Var2;
                                            ArrayList arrayList = c5Var22.f15140r;
                                            ArrayList arrayList2 = c5Var22.h;
                                            int i12 = c5Var22.d;
                                            ArrayList arrayList3 = c5Var22.f15130g;
                                            TL_stories.StoryItem storyItem2 = c5Var22.f15127b;
                                            if (iArr22[0] != c5Var22.f15137o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " localId != reqId");
                                                return;
                                            }
                                            c5Var22.e = false;
                                            c5Var22.f15137o = -1;
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
                                                boolean z11 = true;
                                                MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (c5Var22.f15134l) {
                                                    c5Var22.f15134l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        c5Var22.f15138p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (c5Var22.f15139q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    c5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    c5Var22.f15135m = true;
                                                } else {
                                                    c5Var22.f15135m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                c5Var22.f15136n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    c5Var22.f15135m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f19306id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z11 = z10;
                                                }
                                                if (z11) {
                                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    c5Var22.f15126a = 0;
                                                }
                                                c5Var22.f15135m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f19394id + " response  totalItems " + arrayList3.size() + " has next " + c5Var22.f15135m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((d5) arrayList.get(i19)).e(c5Var22);
                                            }
                                            if (arrayList3.size() < 20 && c5Var22.f15135m) {
                                                c5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            c5 c5Var3 = c5Var2;
                                            ArrayList arrayList4 = c5Var3.f15140r;
                                            TL_stories.StoryItem storyItem3 = c5Var3.f15127b;
                                            int i20 = c5Var3.d;
                                            ArrayList arrayList5 = c5Var3.f15131i;
                                            if (iArr22[0] != c5Var3.f15137o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " localId != reqId");
                                                return;
                                            }
                                            c5Var3.e = false;
                                            c5Var3.f15137o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (c5Var3.f15134l) {
                                                    c5Var3.f15134l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        c5Var3.f15138p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    c5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    c5Var3.f15135m = true;
                                                } else {
                                                    c5Var3.f15135m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                c5Var3.f15136n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    c5Var3.f15135m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = c5Var3.f15126a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z12 = false;
                                                }
                                                c5Var3.f15126a = i23;
                                                if (z12) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    c5Var3.f15126a = 0;
                                                }
                                                c5Var3.f15135m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f19394id + " response  totalItems " + arrayList5.size() + " has next " + c5Var3.f15135m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((d5) arrayList4.get(i24)).e(c5Var3);
                                            }
                                            if (arrayList5.size() < 20 && c5Var3.f15135m) {
                                                c5Var3.c();
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
            this.f15137o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f15137o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f15137o, false);
        }
        this.f15137o = -1;
    }

    public final void e(p4 p4Var, boolean z4, boolean z10) {
        p4 p4Var2 = new p4();
        p4Var2.f15726a = p4Var.f15726a;
        p4Var2.f15727b = p4Var.f15727b;
        p4Var2.f15728c = p4Var.f15728c;
        int i10 = 0;
        if (!z4) {
            p4Var2.f15727b = false;
        }
        if (!z10) {
            p4Var2.f15726a = true;
        }
        p4 p4Var3 = this.f15141s;
        if (!p4Var3.equals(p4Var2)) {
            p4Var3.f15726a = p4Var2.f15726a;
            p4Var3.f15727b = p4Var2.f15727b;
            p4Var3.f15728c = p4Var2.f15728c;
            if (!this.f15129f && this.f15139q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f15140r;
                    if (i10 < arrayList.size()) {
                        ((d5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f15130g.clear();
                this.f15131i.clear();
                this.f15134l = true;
                this.e = false;
                this.f15135m = true;
                this.f15136n = "";
                c();
            }
        }
    }
}
