package ih;

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
public final class f5 {
    public int f11432a;
    public final TL_stories.StoryItem f11433b;
    public final long f11434c;
    public final int d;
    public boolean f11435e;
    public final boolean f11436f;
    public final boolean f11439j;
    public final boolean f11440k;
    public boolean f11441l;
    public String f11443n;
    public final boolean f11446q;
    public final ArrayList f11437g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f11438i = new ArrayList();
    public boolean f11442m = true;
    public int f11444o = -1;
    public final HashSet f11445p = new HashSet();
    public final ArrayList f11447r = new ArrayList();
    public final s4 f11448s = new s4();

    public f5(int i9, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i10;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i9;
        this.f11433b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11436f = z10;
        this.f11434c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f11432a = i10;
        if (i10 < 200) {
            this.f11446q = true;
        }
        if (p7.v(storyItem) && !UserConfig.getInstance(i9).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11439j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f11439j = false;
            this.f11440k = true;
        }
        if (!this.f11439j) {
            this.f11441l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (MessagesController.getInstance(i9).getUser(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f11437g.add(tL_storyView);
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
        if (!this.f11436f) {
            ArrayList arrayList = this.f11437g;
            arrayList.clear();
            s4 s4Var = this.f11448s;
            boolean z11 = s4Var.f12116b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(s4Var.f12117c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(s4Var.f12117c)) {
                    str = s4Var.f12117c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = ta.b.d(" ", str);
                    str3 = ta.b.d(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i9)).user_id));
                    if (s4Var.f12116b && (user == null || !user.contact)) {
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
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i9));
                    }
                }
            }
            if (!s4Var.f12115a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f11436f) {
            arrayList = this.f11438i;
        } else {
            arrayList = this.f11437g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f11435e && this.f11442m && !this.f11439j) {
            boolean z10 = this.f11436f;
            int i9 = 100;
            long j10 = this.f11434c;
            s4 s4Var = this.f11448s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f11433b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = s4Var.f12115a;
                tL_getStoryReactionsList.f22618id = storyItem.f22617id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_getStoryReactionsList.limit = (this.f11441l || this.f11438i.size() < 20) ? 20 : 20;
                String str = this.f11443n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f11435e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f22617id + " " + this.f11441l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final f5 f11325b;

                    {
                        this.f11325b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final f5 f5Var = this.f11325b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                f5 f5Var2 = f5Var;
                                                ArrayList arrayList = f5Var2.f11447r;
                                                ArrayList arrayList2 = f5Var2.h;
                                                int i11 = f5Var2.d;
                                                ArrayList arrayList3 = f5Var2.f11437g;
                                                TL_stories.StoryItem storyItem2 = f5Var2.f11433b;
                                                if (iArr[0] != f5Var2.f11444o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                    return;
                                                }
                                                f5Var2.f11435e = false;
                                                f5Var2.f11444o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i11).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i11).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i11).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i11).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f5Var2.f11441l) {
                                                        f5Var2.f11441l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            f5Var2.f11445p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (f5Var2.f11446q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        f5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        f5Var2.f11442m = true;
                                                    } else {
                                                        f5Var2.f11442m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f5Var2.f11443n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f5Var2.f11442m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = aa.d.g(storyViewsList.users.get(i15).f22527id, storyItem2.views.recent_viewers, i15, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i16 = storyViews2.reactions_count;
                                                    int i17 = storyViewsList.reactions_count;
                                                    if (i16 != i17) {
                                                        storyViews2.reactions_count = i17;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f5Var2.f11432a = 0;
                                                    }
                                                    f5Var2.f11442m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + f5Var2.f11442m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((g5) arrayList.get(i18)).e(f5Var2);
                                                }
                                                if (arrayList3.size() < 20 && f5Var2.f11442m) {
                                                    f5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                f5 f5Var3 = f5Var;
                                                ArrayList arrayList4 = f5Var3.f11447r;
                                                TL_stories.StoryItem storyItem3 = f5Var3.f11433b;
                                                int i19 = f5Var3.d;
                                                ArrayList arrayList5 = f5Var3.f11438i;
                                                if (iArr[0] != f5Var3.f11444o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                    return;
                                                }
                                                f5Var3.f11435e = false;
                                                f5Var3.f11444o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i19).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i19).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i19).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f5Var3.f11441l) {
                                                        f5Var3.f11441l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            f5Var3.f11445p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        f5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        f5Var3.f11442m = true;
                                                    } else {
                                                        f5Var3.f11442m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f5Var3.f11443n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f5Var3.f11442m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = f5Var3.f11432a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    f5Var3.f11432a = i22;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        f5Var3.f11432a = 0;
                                                    }
                                                    f5Var3.f11442m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.f11442m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((g5) arrayList4.get(i23)).e(f5Var3);
                                                }
                                                if (arrayList5.size() < 20 && f5Var3.f11442m) {
                                                    f5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final f5 f5Var2 = this.f11325b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                f5 f5Var22 = f5Var2;
                                                ArrayList arrayList = f5Var22.f11447r;
                                                ArrayList arrayList2 = f5Var22.h;
                                                int i11 = f5Var22.d;
                                                ArrayList arrayList3 = f5Var22.f11437g;
                                                TL_stories.StoryItem storyItem2 = f5Var22.f11433b;
                                                if (iArr2[0] != f5Var22.f11444o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                    return;
                                                }
                                                f5Var22.f11435e = false;
                                                f5Var22.f11444o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i11).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i11).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i11).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i11).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f5Var22.f11441l) {
                                                        f5Var22.f11441l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            f5Var22.f11445p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (f5Var22.f11446q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        f5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        f5Var22.f11442m = true;
                                                    } else {
                                                        f5Var22.f11442m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f5Var22.f11443n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f5Var22.f11442m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = aa.d.g(storyViewsList.users.get(i15).f22527id, storyItem2.views.recent_viewers, i15, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i16 = storyViews2.reactions_count;
                                                    int i17 = storyViewsList.reactions_count;
                                                    if (i16 != i17) {
                                                        storyViews2.reactions_count = i17;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f5Var22.f11432a = 0;
                                                    }
                                                    f5Var22.f11442m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.f11442m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((g5) arrayList.get(i18)).e(f5Var22);
                                                }
                                                if (arrayList3.size() < 20 && f5Var22.f11442m) {
                                                    f5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                f5 f5Var3 = f5Var2;
                                                ArrayList arrayList4 = f5Var3.f11447r;
                                                TL_stories.StoryItem storyItem3 = f5Var3.f11433b;
                                                int i19 = f5Var3.d;
                                                ArrayList arrayList5 = f5Var3.f11438i;
                                                if (iArr2[0] != f5Var3.f11444o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                    return;
                                                }
                                                f5Var3.f11435e = false;
                                                f5Var3.f11444o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i19).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i19).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i19).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f5Var3.f11441l) {
                                                        f5Var3.f11441l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            f5Var3.f11445p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        f5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        f5Var3.f11442m = true;
                                                    } else {
                                                        f5Var3.f11442m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f5Var3.f11443n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f5Var3.f11442m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = f5Var3.f11432a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    f5Var3.f11432a = i22;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        f5Var3.f11432a = 0;
                                                    }
                                                    f5Var3.f11442m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.f11442m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((g5) arrayList4.get(i23)).e(f5Var3);
                                                }
                                                if (arrayList5.size() < 20 && f5Var3.f11442m) {
                                                    f5Var3.c();
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
                this.f11444o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f22626id = storyItem.f22617id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (this.f11446q) {
                tL_stories_getStoryViewsList.f22627q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = s4Var.f12117c;
                tL_stories_getStoryViewsList.f22627q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = s4Var.f12116b;
                tL_stories_getStoryViewsList.reactions_first = s4Var.f12115a;
            }
            tL_stories_getStoryViewsList.limit = (this.f11441l || this.f11437g.size() < 20) ? 20 : 20;
            String str3 = this.f11443n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f11435e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f22617id + " " + this.f11441l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f22627q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final f5 f11325b;

                {
                    this.f11325b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final f5 f5Var = this.f11325b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            f5 f5Var22 = f5Var;
                                            ArrayList arrayList = f5Var22.f11447r;
                                            ArrayList arrayList2 = f5Var22.h;
                                            int i11 = f5Var22.d;
                                            ArrayList arrayList3 = f5Var22.f11437g;
                                            TL_stories.StoryItem storyItem2 = f5Var22.f11433b;
                                            if (iArr2[0] != f5Var22.f11444o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                return;
                                            }
                                            f5Var22.f11435e = false;
                                            f5Var22.f11444o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i11).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i11).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i11).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i11).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f5Var22.f11441l) {
                                                    f5Var22.f11441l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        f5Var22.f11445p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (f5Var22.f11446q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    f5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    f5Var22.f11442m = true;
                                                } else {
                                                    f5Var22.f11442m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f5Var22.f11443n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f5Var22.f11442m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = aa.d.g(storyViewsList.users.get(i15).f22527id, storyItem2.views.recent_viewers, i15, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i16 = storyViews2.reactions_count;
                                                int i17 = storyViewsList.reactions_count;
                                                if (i16 != i17) {
                                                    storyViews2.reactions_count = i17;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f5Var22.f11432a = 0;
                                                }
                                                f5Var22.f11442m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.f11442m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((g5) arrayList.get(i18)).e(f5Var22);
                                            }
                                            if (arrayList3.size() < 20 && f5Var22.f11442m) {
                                                f5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            f5 f5Var3 = f5Var;
                                            ArrayList arrayList4 = f5Var3.f11447r;
                                            TL_stories.StoryItem storyItem3 = f5Var3.f11433b;
                                            int i19 = f5Var3.d;
                                            ArrayList arrayList5 = f5Var3.f11438i;
                                            if (iArr2[0] != f5Var3.f11444o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                return;
                                            }
                                            f5Var3.f11435e = false;
                                            f5Var3.f11444o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i19).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i19).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i19).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f5Var3.f11441l) {
                                                    f5Var3.f11441l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        f5Var3.f11445p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    f5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    f5Var3.f11442m = true;
                                                } else {
                                                    f5Var3.f11442m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f5Var3.f11443n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f5Var3.f11442m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = f5Var3.f11432a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                f5Var3.f11432a = i22;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    f5Var3.f11432a = 0;
                                                }
                                                f5Var3.f11442m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.f11442m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((g5) arrayList4.get(i23)).e(f5Var3);
                                            }
                                            if (arrayList5.size() < 20 && f5Var3.f11442m) {
                                                f5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final f5 f5Var2 = this.f11325b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            f5 f5Var22 = f5Var2;
                                            ArrayList arrayList = f5Var22.f11447r;
                                            ArrayList arrayList2 = f5Var22.h;
                                            int i11 = f5Var22.d;
                                            ArrayList arrayList3 = f5Var22.f11437g;
                                            TL_stories.StoryItem storyItem2 = f5Var22.f11433b;
                                            if (iArr22[0] != f5Var22.f11444o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                return;
                                            }
                                            f5Var22.f11435e = false;
                                            f5Var22.f11444o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i11).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i11).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i11).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i11).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f5Var22.f11441l) {
                                                    f5Var22.f11441l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        f5Var22.f11445p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (f5Var22.f11446q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    f5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    f5Var22.f11442m = true;
                                                } else {
                                                    f5Var22.f11442m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f5Var22.f11443n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f5Var22.f11442m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = aa.d.g(storyViewsList.users.get(i15).f22527id, storyItem2.views.recent_viewers, i15, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i16 = storyViews2.reactions_count;
                                                int i17 = storyViewsList.reactions_count;
                                                if (i16 != i17) {
                                                    storyViews2.reactions_count = i17;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f5Var22.f11432a = 0;
                                                }
                                                f5Var22.f11442m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.f11442m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((g5) arrayList.get(i18)).e(f5Var22);
                                            }
                                            if (arrayList3.size() < 20 && f5Var22.f11442m) {
                                                f5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            f5 f5Var3 = f5Var2;
                                            ArrayList arrayList4 = f5Var3.f11447r;
                                            TL_stories.StoryItem storyItem3 = f5Var3.f11433b;
                                            int i19 = f5Var3.d;
                                            ArrayList arrayList5 = f5Var3.f11438i;
                                            if (iArr22[0] != f5Var3.f11444o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                return;
                                            }
                                            f5Var3.f11435e = false;
                                            f5Var3.f11444o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i19).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i19).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i19).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f5Var3.f11441l) {
                                                    f5Var3.f11441l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        f5Var3.f11445p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    f5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    f5Var3.f11442m = true;
                                                } else {
                                                    f5Var3.f11442m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f5Var3.f11443n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f5Var3.f11442m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = f5Var3.f11432a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                f5Var3.f11432a = i22;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    f5Var3.f11432a = 0;
                                                }
                                                f5Var3.f11442m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.f11442m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((g5) arrayList4.get(i23)).e(f5Var3);
                                            }
                                            if (arrayList5.size() < 20 && f5Var3.f11442m) {
                                                f5Var3.c();
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
            this.f11444o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f11444o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f11444o, false);
        }
        this.f11444o = -1;
    }

    public final void e(s4 s4Var, boolean z10, boolean z11) {
        s4 s4Var2 = new s4();
        s4Var2.f12115a = s4Var.f12115a;
        s4Var2.f12116b = s4Var.f12116b;
        s4Var2.f12117c = s4Var.f12117c;
        int i9 = 0;
        if (!z10) {
            s4Var2.f12116b = false;
        }
        if (!z11) {
            s4Var2.f12115a = true;
        }
        s4 s4Var3 = this.f11448s;
        if (!s4Var3.equals(s4Var2)) {
            s4Var3.f12115a = s4Var2.f12115a;
            s4Var3.f12116b = s4Var2.f12116b;
            s4Var3.f12117c = s4Var2.f12117c;
            if (!this.f11436f && this.f11446q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f11447r;
                    if (i9 < arrayList.size()) {
                        ((g5) arrayList.get(i9)).e(this);
                        i9++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f11437g.clear();
                this.f11438i.clear();
                this.f11441l = true;
                this.f11435e = false;
                this.f11442m = true;
                this.f11443n = "";
                c();
            }
        }
    }
}
