package oh;

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
import org.telegram.ui.yh;
public final class d5 {
    public int f16970a;
    public final TL_stories.StoryItem f16971b;
    public final long f16972c;
    public final int d;
    public boolean f16973e;
    public final boolean f16974f;
    public final boolean f16977j;
    public final boolean f16978k;
    public boolean f16979l;
    public String f16981n;
    public final boolean f16984q;
    public final ArrayList f16975g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f16976i = new ArrayList();
    public boolean f16980m = true;
    public int f16982o = -1;
    public final HashSet f16983p = new HashSet();
    public final ArrayList f16985r = new ArrayList();
    public final q4 f16986s = new q4();

    public d5(int i10, long j10, TL_stories.StoryItem storyItem) {
        boolean z4;
        int i11;
        boolean z10;
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f16971b = storyItem;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16974f = z4;
        this.f16972c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i11 = 0;
        } else {
            i11 = storyViews2.views_count;
        }
        this.f16970a = i11;
        if (i11 < 200) {
            this.f16984q = true;
        }
        if (m7.v(storyItem) && !UserConfig.getInstance(i10).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16977j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f16977j = false;
            this.f16978k = true;
        }
        if (!this.f16977j) {
            this.f16979l = true;
            if (storyItem.views != null) {
                for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                    Long l10 = storyItem.views.recent_viewers.get(i12);
                    long longValue = l10.longValue();
                    if (MessagesController.getInstance(i10).getUser(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f16975g.add(tL_storyView);
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
        if (!this.f16974f) {
            ArrayList arrayList = this.f16975g;
            arrayList.clear();
            q4 q4Var = this.f16986s;
            boolean z10 = q4Var.f17656b;
            ArrayList arrayList2 = this.h;
            if (!z10 && TextUtils.isEmpty(q4Var.f17657c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(q4Var.f17657c)) {
                    str = q4Var.f17657c.trim().toLowerCase();
                    str2 = LocaleController.getInstance().getTranslitString(str);
                    str4 = yh.k(" ", str);
                    str3 = yh.k(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                    if (q4Var.f17656b && (user == null || !user.contact)) {
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
            if (!q4Var.f17655a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new lf.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f16974f) {
            arrayList = this.f16976i;
        } else {
            arrayList = this.f16975g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f16973e && this.f16980m && !this.f16977j) {
            boolean z4 = this.f16974f;
            int i10 = 100;
            long j10 = this.f16972c;
            q4 q4Var = this.f16986s;
            int i11 = this.d;
            TL_stories.StoryItem storyItem = this.f16971b;
            if (z4) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = q4Var.f17655a;
                tL_getStoryReactionsList.f21081id = storyItem.f21080id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_getStoryReactionsList.limit = (this.f16979l || this.f16976i.size() < 20) ? 20 : 20;
                String str = this.f16981n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f16973e = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f21080id + " " + this.f16979l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final d5 f16895b;

                    {
                        this.f16895b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final d5 d5Var = this.f16895b;
                                final int[] iArr = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                d5 d5Var2 = d5Var;
                                                ArrayList arrayList = d5Var2.f16985r;
                                                ArrayList arrayList2 = d5Var2.h;
                                                int i12 = d5Var2.d;
                                                ArrayList arrayList3 = d5Var2.f16975g;
                                                TL_stories.StoryItem storyItem2 = d5Var2.f16971b;
                                                if (iArr[0] != d5Var2.f16982o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " localId != reqId");
                                                    return;
                                                }
                                                d5Var2.f16973e = false;
                                                d5Var2.f16982o = -1;
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
                                                    if (d5Var2.f16979l) {
                                                        d5Var2.f16979l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            d5Var2.f16983p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (d5Var2.f16984q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        d5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        d5Var2.f16980m = true;
                                                    } else {
                                                        d5Var2.f16980m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    d5Var2.f16981n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        d5Var2.f16980m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f20990id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        d5Var2.f16970a = 0;
                                                    }
                                                    d5Var2.f16980m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " response  totalItems " + arrayList3.size() + " has next " + d5Var2.f16980m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((e5) arrayList.get(i19)).e(d5Var2);
                                                }
                                                if (arrayList3.size() < 20 && d5Var2.f16980m) {
                                                    d5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                d5 d5Var3 = d5Var;
                                                ArrayList arrayList4 = d5Var3.f16985r;
                                                TL_stories.StoryItem storyItem3 = d5Var3.f16971b;
                                                int i20 = d5Var3.d;
                                                ArrayList arrayList5 = d5Var3.f16976i;
                                                if (iArr[0] != d5Var3.f16982o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " localId != reqId");
                                                    return;
                                                }
                                                d5Var3.f16973e = false;
                                                d5Var3.f16982o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (d5Var3.f16979l) {
                                                        d5Var3.f16979l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            d5Var3.f16983p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        d5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        d5Var3.f16980m = true;
                                                    } else {
                                                        d5Var3.f16980m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    d5Var3.f16981n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        d5Var3.f16980m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = d5Var3.f16970a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z12 = false;
                                                    }
                                                    d5Var3.f16970a = i23;
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        d5Var3.f16970a = 0;
                                                    }
                                                    d5Var3.f16980m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " response  totalItems " + arrayList5.size() + " has next " + d5Var3.f16980m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((e5) arrayList4.get(i24)).e(d5Var3);
                                                }
                                                if (arrayList5.size() < 20 && d5Var3.f16980m) {
                                                    d5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final d5 d5Var2 = this.f16895b;
                                final int[] iArr2 = r2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                d5 d5Var22 = d5Var2;
                                                ArrayList arrayList = d5Var22.f16985r;
                                                ArrayList arrayList2 = d5Var22.h;
                                                int i12 = d5Var22.d;
                                                ArrayList arrayList3 = d5Var22.f16975g;
                                                TL_stories.StoryItem storyItem2 = d5Var22.f16971b;
                                                if (iArr2[0] != d5Var22.f16982o) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " localId != reqId");
                                                    return;
                                                }
                                                d5Var22.f16973e = false;
                                                d5Var22.f16982o = -1;
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
                                                    if (d5Var22.f16979l) {
                                                        d5Var22.f16979l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            d5Var22.f16983p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (d5Var22.f16984q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        d5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        d5Var22.f16980m = true;
                                                    } else {
                                                        d5Var22.f16980m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    d5Var22.f16981n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        d5Var22.f16980m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f20990id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                        d5Var22.f16970a = 0;
                                                    }
                                                    d5Var22.f16980m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " response  totalItems " + arrayList3.size() + " has next " + d5Var22.f16980m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((e5) arrayList.get(i19)).e(d5Var22);
                                                }
                                                if (arrayList3.size() < 20 && d5Var22.f16980m) {
                                                    d5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                d5 d5Var3 = d5Var2;
                                                ArrayList arrayList4 = d5Var3.f16985r;
                                                TL_stories.StoryItem storyItem3 = d5Var3.f16971b;
                                                int i20 = d5Var3.d;
                                                ArrayList arrayList5 = d5Var3.f16976i;
                                                if (iArr2[0] != d5Var3.f16982o) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " localId != reqId");
                                                    return;
                                                }
                                                d5Var3.f16973e = false;
                                                d5Var3.f16982o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (d5Var3.f16979l) {
                                                        d5Var3.f16979l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            d5Var3.f16983p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        d5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        d5Var3.f16980m = true;
                                                    } else {
                                                        d5Var3.f16980m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    d5Var3.f16981n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        d5Var3.f16980m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = d5Var3.f16970a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    if (i22 == i23) {
                                                        z12 = false;
                                                    }
                                                    d5Var3.f16970a = i23;
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        d5Var3.f16970a = 0;
                                                    }
                                                    d5Var3.f16980m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " response  totalItems " + arrayList5.size() + " has next " + d5Var3.f16980m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((e5) arrayList4.get(i24)).e(d5Var3);
                                                }
                                                if (arrayList5.size() < 20 && d5Var3.f16980m) {
                                                    d5Var3.c();
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
                this.f16982o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f21089id = storyItem.f21080id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            if (this.f16984q) {
                tL_stories_getStoryViewsList.f21090q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = q4Var.f17657c;
                tL_stories_getStoryViewsList.f21090q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = q4Var.f17656b;
                tL_stories_getStoryViewsList.reactions_first = q4Var.f17655a;
            }
            tL_stories_getStoryViewsList.limit = (this.f16979l || this.f16975g.size() < 20) ? 20 : 20;
            String str3 = this.f16981n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f16973e = true;
            FileLog.d("SelfStoryViewsPage load next " + storyItem.f21080id + " " + this.f16979l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f21090q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final d5 f16895b;

                {
                    this.f16895b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final d5 d5Var = this.f16895b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            d5 d5Var22 = d5Var;
                                            ArrayList arrayList = d5Var22.f16985r;
                                            ArrayList arrayList2 = d5Var22.h;
                                            int i12 = d5Var22.d;
                                            ArrayList arrayList3 = d5Var22.f16975g;
                                            TL_stories.StoryItem storyItem2 = d5Var22.f16971b;
                                            if (iArr2[0] != d5Var22.f16982o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " localId != reqId");
                                                return;
                                            }
                                            d5Var22.f16973e = false;
                                            d5Var22.f16982o = -1;
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
                                                if (d5Var22.f16979l) {
                                                    d5Var22.f16979l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        d5Var22.f16983p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (d5Var22.f16984q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    d5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    d5Var22.f16980m = true;
                                                } else {
                                                    d5Var22.f16980m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                d5Var22.f16981n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    d5Var22.f16980m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f20990id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    d5Var22.f16970a = 0;
                                                }
                                                d5Var22.f16980m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " response  totalItems " + arrayList3.size() + " has next " + d5Var22.f16980m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((e5) arrayList.get(i19)).e(d5Var22);
                                            }
                                            if (arrayList3.size() < 20 && d5Var22.f16980m) {
                                                d5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            d5 d5Var3 = d5Var;
                                            ArrayList arrayList4 = d5Var3.f16985r;
                                            TL_stories.StoryItem storyItem3 = d5Var3.f16971b;
                                            int i20 = d5Var3.d;
                                            ArrayList arrayList5 = d5Var3.f16976i;
                                            if (iArr2[0] != d5Var3.f16982o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " localId != reqId");
                                                return;
                                            }
                                            d5Var3.f16973e = false;
                                            d5Var3.f16982o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (d5Var3.f16979l) {
                                                    d5Var3.f16979l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        d5Var3.f16983p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    d5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    d5Var3.f16980m = true;
                                                } else {
                                                    d5Var3.f16980m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                d5Var3.f16981n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    d5Var3.f16980m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = d5Var3.f16970a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z12 = false;
                                                }
                                                d5Var3.f16970a = i23;
                                                if (z12) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    d5Var3.f16970a = 0;
                                                }
                                                d5Var3.f16980m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " response  totalItems " + arrayList5.size() + " has next " + d5Var3.f16980m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((e5) arrayList4.get(i24)).e(d5Var3);
                                            }
                                            if (arrayList5.size() < 20 && d5Var3.f16980m) {
                                                d5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final d5 d5Var2 = this.f16895b;
                            final int[] iArr22 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            d5 d5Var22 = d5Var2;
                                            ArrayList arrayList = d5Var22.f16985r;
                                            ArrayList arrayList2 = d5Var22.h;
                                            int i12 = d5Var22.d;
                                            ArrayList arrayList3 = d5Var22.f16975g;
                                            TL_stories.StoryItem storyItem2 = d5Var22.f16971b;
                                            if (iArr22[0] != d5Var22.f16982o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " localId != reqId");
                                                return;
                                            }
                                            d5Var22.f16973e = false;
                                            d5Var22.f16982o = -1;
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
                                                if (d5Var22.f16979l) {
                                                    d5Var22.f16979l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        d5Var22.f16983p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (d5Var22.f16984q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    d5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    d5Var22.f16980m = true;
                                                } else {
                                                    d5Var22.f16980m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                d5Var22.f16981n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    d5Var22.f16980m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = android.support.v4.media.a.g(storyViewsList.users.get(i16).f20990id, storyItem2.views.recent_viewers, i16, 1)) {
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
                                                    d5Var22.f16970a = 0;
                                                }
                                                d5Var22.f16980m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f21080id + " response  totalItems " + arrayList3.size() + " has next " + d5Var22.f16980m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((e5) arrayList.get(i19)).e(d5Var22);
                                            }
                                            if (arrayList3.size() < 20 && d5Var22.f16980m) {
                                                d5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            d5 d5Var3 = d5Var2;
                                            ArrayList arrayList4 = d5Var3.f16985r;
                                            TL_stories.StoryItem storyItem3 = d5Var3.f16971b;
                                            int i20 = d5Var3.d;
                                            ArrayList arrayList5 = d5Var3.f16976i;
                                            if (iArr22[0] != d5Var3.f16982o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " localId != reqId");
                                                return;
                                            }
                                            d5Var3.f16973e = false;
                                            d5Var3.f16982o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (d5Var3.f16979l) {
                                                    d5Var3.f16979l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        d5Var3.f16983p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    d5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    d5Var3.f16980m = true;
                                                } else {
                                                    d5Var3.f16980m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                d5Var3.f16981n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    d5Var3.f16980m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = d5Var3.f16970a;
                                                int i23 = tL_storyReactionsList.count;
                                                if (i22 == i23) {
                                                    z12 = false;
                                                }
                                                d5Var3.f16970a = i23;
                                                if (z12) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    d5Var3.f16970a = 0;
                                                }
                                                d5Var3.f16980m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f21080id + " response  totalItems " + arrayList5.size() + " has next " + d5Var3.f16980m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((e5) arrayList4.get(i24)).e(d5Var3);
                                            }
                                            if (arrayList5.size() < 20 && d5Var3.f16980m) {
                                                d5Var3.c();
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
            this.f16982o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f16982o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f16982o, false);
        }
        this.f16982o = -1;
    }

    public final void e(q4 q4Var, boolean z4, boolean z10) {
        q4 q4Var2 = new q4();
        q4Var2.f17655a = q4Var.f17655a;
        q4Var2.f17656b = q4Var.f17656b;
        q4Var2.f17657c = q4Var.f17657c;
        int i10 = 0;
        if (!z4) {
            q4Var2.f17656b = false;
        }
        if (!z10) {
            q4Var2.f17655a = true;
        }
        q4 q4Var3 = this.f16986s;
        if (!q4Var3.equals(q4Var2)) {
            q4Var3.f17655a = q4Var2.f17655a;
            q4Var3.f17656b = q4Var2.f17656b;
            q4Var3.f17657c = q4Var2.f17657c;
            if (!this.f16974f && this.f16984q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f16985r;
                    if (i10 < arrayList.size()) {
                        ((e5) arrayList.get(i10)).e(this);
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f16975g.clear();
                this.f16976i.clear();
                this.f16979l = true;
                this.f16973e = false;
                this.f16980m = true;
                this.f16981n = "";
                c();
            }
        }
    }
}
