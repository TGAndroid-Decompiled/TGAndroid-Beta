package lh;

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
public final class b5 {
    public int f15383a;
    public final TL_stories.StoryItem f15384b;
    public final long f15385c;
    public final int d;
    public boolean f15386e;
    public final boolean f15387f;
    public final boolean f15390j;
    public final boolean f15391k;
    public boolean f15392l;
    public String f15394n;
    public final boolean f15397q;
    public final ArrayList f15388g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f15389i = new ArrayList();
    public boolean f15393m = true;
    public int f15395o = -1;
    public final HashSet f15396p = new HashSet();
    public final ArrayList f15398r = new ArrayList();
    public final o4 f15399s = new o4();

    public b5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i11;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f15384b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15387f = z10;
        this.f15385c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f15383a = i11;
        if (i11 < 200) {
            this.f15397q = true;
        }
        if (l7.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15390j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f15390j = false;
            this.f15391k = true;
        }
        if (!this.f15390j) {
            this.f15392l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l10 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l10.longValue();
                    if (MessagesController.getInstance(i10).getUser(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f15388g.add(tL_storyView);
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
        if (!this.f15387f) {
            ArrayList arrayList = this.f15388g;
            arrayList.clear();
            o4 o4Var = this.f15399s;
            boolean z11 = o4Var.f16018b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(o4Var.f16019c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(o4Var.f16019c)) {
                    str = o4Var.f16019c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = u3.c.e(" ", str);
                    str3 = u3.c.e(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (o4Var.f16018b && (user == null || !user.contact)) {
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
            if (!o4Var.f16017a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f15387f) {
            arrayList = this.f15389i;
        } else {
            arrayList = this.f15388g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f15386e && this.f15393m && !this.f15390j) {
            boolean z10 = this.f15387f;
            int i10 = 100;
            long j10 = this.f15385c;
            o4 o4Var = this.f15399s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f15384b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = o4Var.f16017a;
                tL_getStoryReactionsList.f22630id = storyItem.f22629id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_getStoryReactionsList.limit = (this.f15392l || this.f15389i.size() < 20) ? 20 : 20;
                String str = this.f15394n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f15386e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f22629id + " " + this.f15392l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final b5 f16462b;

                    {
                        this.f16462b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final b5 b5Var = this.f16462b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                b5 b5Var2 = b5Var;
                                                ArrayList arrayList = b5Var2.f15398r;
                                                ArrayList arrayList2 = b5Var2.h;
                                                int i12 = b5Var2.d;
                                                ArrayList arrayList3 = b5Var2.f15388g;
                                                TL_stories.StoryItem storyItem2 = b5Var2.f15384b;
                                                if (iArr[0] != b5Var2.f15395o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var2.f15386e = false;
                                                b5Var2.f15395o = -1;
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
                                                    if (b5Var2.f15392l) {
                                                        b5Var2.f15392l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            b5Var2.f15396p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var2.f15397q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        b5Var2.f15393m = true;
                                                    } else {
                                                        b5Var2.f15393m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var2.f15394n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var2.f15393m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = a4.w.g(storyViewsList.users.get(i16).f22539id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        b5Var2.f15383a = 0;
                                                    }
                                                    b5Var2.f15393m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " response  totalItems " + arrayList3.size() + " has next " + b5Var2.f15393m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((c5) arrayList.get(i19)).e(b5Var2);
                                                }
                                                if (arrayList3.size() < 20 && b5Var2.f15393m) {
                                                    b5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                b5 b5Var3 = b5Var;
                                                ArrayList arrayList4 = b5Var3.f15398r;
                                                TL_stories.StoryItem storyItem3 = b5Var3.f15384b;
                                                int i20 = b5Var3.d;
                                                ArrayList arrayList5 = b5Var3.f15389i;
                                                if (iArr[0] != b5Var3.f15395o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var3.f15386e = false;
                                                b5Var3.f15395o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.f15392l) {
                                                        b5Var3.f15392l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var3.f15396p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.f15393m = true;
                                                    } else {
                                                        b5Var3.f15393m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.f15394n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.f15393m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var3.f15383a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    b5Var3.f15383a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.f15383a = 0;
                                                    }
                                                    b5Var3.f15393m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f15393m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.f15393m) {
                                                    b5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final b5 b5Var2 = this.f16462b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                b5 b5Var22 = b5Var2;
                                                ArrayList arrayList = b5Var22.f15398r;
                                                ArrayList arrayList2 = b5Var22.h;
                                                int i12 = b5Var22.d;
                                                ArrayList arrayList3 = b5Var22.f15388g;
                                                TL_stories.StoryItem storyItem2 = b5Var22.f15384b;
                                                if (iArr2[0] != b5Var22.f15395o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var22.f15386e = false;
                                                b5Var22.f15395o = -1;
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
                                                    if (b5Var22.f15392l) {
                                                        b5Var22.f15392l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            b5Var22.f15396p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var22.f15397q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        b5Var22.f15393m = true;
                                                    } else {
                                                        b5Var22.f15393m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var22.f15394n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var22.f15393m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = a4.w.g(storyViewsList.users.get(i16).f22539id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        b5Var22.f15383a = 0;
                                                    }
                                                    b5Var22.f15393m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f15393m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((c5) arrayList.get(i19)).e(b5Var22);
                                                }
                                                if (arrayList3.size() < 20 && b5Var22.f15393m) {
                                                    b5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                b5 b5Var3 = b5Var2;
                                                ArrayList arrayList4 = b5Var3.f15398r;
                                                TL_stories.StoryItem storyItem3 = b5Var3.f15384b;
                                                int i20 = b5Var3.d;
                                                ArrayList arrayList5 = b5Var3.f15389i;
                                                if (iArr2[0] != b5Var3.f15395o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var3.f15386e = false;
                                                b5Var3.f15395o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.f15392l) {
                                                        b5Var3.f15392l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var3.f15396p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.f15393m = true;
                                                    } else {
                                                        b5Var3.f15393m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.f15394n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.f15393m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var3.f15383a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z13 = false;
                                                    }
                                                    b5Var3.f15383a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.f15383a = 0;
                                                    }
                                                    b5Var3.f15393m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f15393m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.f15393m) {
                                                    b5Var3.c();
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
                this.f15395o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f22638id = storyItem.f22629id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f15397q) {
                tL_stories_getStoryViewsList.f22639q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = o4Var.f16019c;
                tL_stories_getStoryViewsList.f22639q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = o4Var.f16018b;
                tL_stories_getStoryViewsList.reactions_first = o4Var.f16017a;
            }
            tL_stories_getStoryViewsList.limit = (this.f15392l || this.f15388g.size() < 20) ? 20 : 20;
            String str3 = this.f15394n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f15386e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f22629id + " " + this.f15392l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f22639q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final b5 f16462b;

                {
                    this.f16462b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final b5 b5Var = this.f16462b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            b5 b5Var22 = b5Var;
                                            ArrayList arrayList = b5Var22.f15398r;
                                            ArrayList arrayList2 = b5Var22.h;
                                            int i12 = b5Var22.d;
                                            ArrayList arrayList3 = b5Var22.f15388g;
                                            TL_stories.StoryItem storyItem2 = b5Var22.f15384b;
                                            if (iArr2[0] != b5Var22.f15395o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " localId != reqId");
                                                return;
                                            }
                                            b5Var22.f15386e = false;
                                            b5Var22.f15395o = -1;
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
                                                if (b5Var22.f15392l) {
                                                    b5Var22.f15392l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        b5Var22.f15396p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.f15397q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    b5Var22.f15393m = true;
                                                } else {
                                                    b5Var22.f15393m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.f15394n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.f15393m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = a4.w.g(storyViewsList.users.get(i16).f22539id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    b5Var22.f15383a = 0;
                                                }
                                                b5Var22.f15393m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f15393m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((c5) arrayList.get(i19)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.f15393m) {
                                                b5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var3 = b5Var;
                                            ArrayList arrayList4 = b5Var3.f15398r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.f15384b;
                                            int i20 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.f15389i;
                                            if (iArr2[0] != b5Var3.f15395o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " localId != reqId");
                                                return;
                                            }
                                            b5Var3.f15386e = false;
                                            b5Var3.f15395o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.f15392l) {
                                                    b5Var3.f15392l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var3.f15396p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.f15393m = true;
                                                } else {
                                                    b5Var3.f15393m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.f15394n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.f15393m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var3.f15383a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                b5Var3.f15383a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.f15383a = 0;
                                                }
                                                b5Var3.f15393m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f15393m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.f15393m) {
                                                b5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final b5 b5Var2 = this.f16462b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            b5 b5Var22 = b5Var2;
                                            ArrayList arrayList = b5Var22.f15398r;
                                            ArrayList arrayList2 = b5Var22.h;
                                            int i12 = b5Var22.d;
                                            ArrayList arrayList3 = b5Var22.f15388g;
                                            TL_stories.StoryItem storyItem2 = b5Var22.f15384b;
                                            if (iArr22[0] != b5Var22.f15395o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " localId != reqId");
                                                return;
                                            }
                                            b5Var22.f15386e = false;
                                            b5Var22.f15395o = -1;
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
                                                if (b5Var22.f15392l) {
                                                    b5Var22.f15392l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        b5Var22.f15396p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.f15397q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    b5Var22.f15393m = true;
                                                } else {
                                                    b5Var22.f15393m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.f15394n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.f15393m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = a4.w.g(storyViewsList.users.get(i16).f22539id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    b5Var22.f15383a = 0;
                                                }
                                                b5Var22.f15393m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22629id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f15393m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((c5) arrayList.get(i19)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.f15393m) {
                                                b5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var3 = b5Var2;
                                            ArrayList arrayList4 = b5Var3.f15398r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.f15384b;
                                            int i20 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.f15389i;
                                            if (iArr22[0] != b5Var3.f15395o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " localId != reqId");
                                                return;
                                            }
                                            b5Var3.f15386e = false;
                                            b5Var3.f15395o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.f15392l) {
                                                    b5Var3.f15392l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var3.f15396p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.f15393m = true;
                                                } else {
                                                    b5Var3.f15393m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.f15394n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.f15393m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var3.f15383a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z13 = false;
                                                }
                                                b5Var3.f15383a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.f15383a = 0;
                                                }
                                                b5Var3.f15393m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22629id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f15393m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.f15393m) {
                                                b5Var3.c();
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
            this.f15395o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f15395o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f15395o, false);
        }
        this.f15395o = -1;
    }

    public final void e(o4 o4Var, boolean z10, boolean z11) {
        o4 o4Var2 = new o4();
        o4Var2.f16017a = o4Var.f16017a;
        o4Var2.f16018b = o4Var.f16018b;
        o4Var2.f16019c = o4Var.f16019c;
        int i10 = 0;
        if (!z10) {
            o4Var2.f16018b = false;
        }
        if (!z11) {
            o4Var2.f16017a = true;
        }
        o4 o4Var3 = this.f15399s;
        if (!o4Var3.equals(o4Var2)) {
            o4Var3.f16017a = o4Var2.f16017a;
            o4Var3.f16018b = o4Var2.f16018b;
            o4Var3.f16019c = o4Var2.f16019c;
            if (!this.f15387f && this.f15397q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f15398r;
                    if (i10 < arrayList.size()) {
                        ((c5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f15388g.clear();
                this.f15389i.clear();
                this.f15392l = true;
                this.f15386e = false;
                this.f15393m = true;
                this.f15394n = "";
                c();
            }
        }
    }
}
