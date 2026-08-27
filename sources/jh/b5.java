package jh;

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

    public int f13101a;

    public final TL_stories.StoryItem f13102b;

    public final long f13103c;
    public final int d;

    public boolean f13104e;

    public final boolean f13105f;

    public final boolean f13108j;

    public final boolean f13109k;

    public boolean f13110l;

    public String f13112n;

    public final boolean f13115q;

    public final ArrayList f13106g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public final ArrayList f13107i = new ArrayList();

    public boolean f13111m = true;

    public int f13113o = -1;

    public final HashSet f13114p = new HashSet();

    public final ArrayList f13116r = new ArrayList();

    public final o4 f13117s = new o4();

    public b5(int i10, long j10, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.f13102b = storyItem;
        this.f13105f = j10 < 0;
        this.f13103c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i11 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.f13101a = i11;
        if (i11 < 200) {
            this.f13115q = true;
        }
        boolean z10 = l7.v(storyItem) && !UserConfig.getInstance(i10).isPremium();
        this.f13108j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f13108j = false;
            this.f13109k = true;
        }
        if (this.f13108j) {
            return;
        }
        this.f13110l = true;
        if (storyItem.views != null) {
            for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                Long l10 = storyItem.views.recent_viewers.get(i12);
                long jLongValue = l10.longValue();
                if (MessagesController.getInstance(i10).getUser(l10) != null) {
                    TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                    tL_storyView.user_id = jLongValue;
                    tL_storyView.date = 0;
                    this.f13106g.add(tL_storyView);
                }
            }
        }
    }

    public final void a() {
        String lowerCase;
        String translitString;
        String strE;
        String strE2;
        if (this.f13105f) {
            return;
        }
        ArrayList arrayList = this.f13106g;
        arrayList.clear();
        o4 o4Var = this.f13117s;
        boolean z10 = o4Var.f13746b;
        ArrayList arrayList2 = this.h;
        if (z10 || !TextUtils.isEmpty(o4Var.f13747c)) {
            if (TextUtils.isEmpty(o4Var.f13747c)) {
                lowerCase = null;
                translitString = null;
                strE = null;
                strE2 = null;
            } else {
                lowerCase = o4Var.f13747c.trim().toLowerCase();
                translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                strE2 = s3.c.e(" ", lowerCase);
                strE = s3.c.e(" ", translitString);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                boolean z11 = !o4Var.f13746b || (user != null && user.contact);
                if (z11 && lowerCase != null) {
                    String lowerCase2 = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    String publicUsername = UserObject.getPublicUsername(user);
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase2);
                    if ((lowerCase2 == null || (!lowerCase2.startsWith(lowerCase) && !lowerCase2.contains(strE2))) && ((strTranslitSafe == null || (!strTranslitSafe.startsWith(translitString) && !strTranslitSafe.contains(strE))) && (publicUsername == null || (!publicUsername.startsWith(translitString) && !publicUsername.contains(strE))))) {
                        z11 = false;
                    }
                }
                if (z11) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (o4Var.f13745a) {
            return;
        }
        Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(7)));
    }

    public final int b() {
        return (this.f13105f ? this.f13107i : this.f13106g).size();
    }

    public final void c() {
        if (this.f13104e || !this.f13111m || this.f13108j) {
            return;
        }
        boolean z10 = this.f13105f;
        long j10 = this.f13103c;
        o4 o4Var = this.f13117s;
        int i10 = this.d;
        TL_stories.StoryItem storyItem = this.f13102b;
        if (z10) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = o4Var.f13745a;
            tL_getStoryReactionsList.f22618id = storyItem.f22617id;
            tL_getStoryReactionsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_getStoryReactionsList.limit = (this.f13110l || this.f13107i.size() < 20) ? 20 : 100;
            String str = this.f13112n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.f13104e = true;
            FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.f22617id + " " + this.f13110l + " offset=" + tL_getStoryReactionsList.offset);
            final int i11 = 0;
            int iSendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {

                public final b5 f14187b;

                {
                    this.f14187b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final b5 b5Var = this.f14187b;
                            final int[] iArr = iArr;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            b5 b5Var2 = b5Var;
                                            ArrayList arrayList = b5Var2.f13116r;
                                            ArrayList arrayList2 = b5Var2.h;
                                            int i13 = b5Var2.d;
                                            ArrayList arrayList3 = b5Var2.f13106g;
                                            TL_stories.StoryItem storyItem2 = b5Var2.f13102b;
                                            if (iArr[0] != b5Var2.f13113o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var2.f13104e = false;
                                                b5Var2.f13113o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i13).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i13).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i13).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i13).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var2.f13110l) {
                                                        b5Var2.f13110l = false;
                                                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                            b5Var2.f13114p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var2.f13115q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        b5Var2.f13111m = false;
                                                    } else {
                                                        b5Var2.f13111m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var2.f13112n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var2.f13111m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i16 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i16 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int iF = 0; iF < Math.min(3, storyViewsList.users.size()); iF = com.google.android.recaptcha.internal.a.f(storyViewsList.users.get(iF).f22527id, storyItem2.views.recent_viewers, iF, 1)) {
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
                                                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var2.f13101a = 0;
                                                    }
                                                    b5Var2.f13111m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + b5Var2.f13111m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((c5) arrayList.get(i19)).e(b5Var2);
                                                }
                                                if (arrayList3.size() < 20 && b5Var2.f13111m) {
                                                    b5Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            b5 b5Var3 = b5Var;
                                            ArrayList arrayList4 = b5Var3.f13116r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.f13102b;
                                            int i20 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.f13107i;
                                            if (iArr[0] != b5Var3.f13113o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var3.f13104e = false;
                                                b5Var3.f13113o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.f13110l) {
                                                        b5Var3.f13110l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var3.f13114p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.f13111m = false;
                                                    } else {
                                                        b5Var3.f13111m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.f13112n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.f13111m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var3.f13101a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    b5Var3.f13101a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.f13101a = 0;
                                                    }
                                                    b5Var3.f13111m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f13111m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.f13111m) {
                                                    b5Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 0;
                            final b5 b5Var2 = this.f14187b;
                            final int[] iArr2 = iArr;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (i13) {
                                        case 0:
                                            b5 b5Var3 = b5Var2;
                                            ArrayList arrayList = b5Var3.f13116r;
                                            ArrayList arrayList2 = b5Var3.h;
                                            int i14 = b5Var3.d;
                                            ArrayList arrayList3 = b5Var3.f13106g;
                                            TL_stories.StoryItem storyItem2 = b5Var3.f13102b;
                                            if (iArr2[0] != b5Var3.f13113o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var3.f13104e = false;
                                                b5Var3.f13113o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i14).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i15 = 0; i15 < storyViewsList.views.size(); i15++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i15);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i14).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i14).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i14).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var3.f13110l) {
                                                        b5Var3.f13110l = false;
                                                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                                            b5Var3.f13114p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i16)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var3.f13115q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var3.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        b5Var3.f13111m = false;
                                                    } else {
                                                        b5Var3.f13111m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var3.f13112n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var3.f13111m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i17 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i17 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int iF = 0; iF < Math.min(3, storyViewsList.users.size()); iF = com.google.android.recaptcha.internal.a.f(storyViewsList.users.get(iF).f22527id, storyItem2.views.recent_viewers, iF, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i18 = storyViews2.reactions_count;
                                                    int i19 = storyViewsList.reactions_count;
                                                    if (i18 != i19) {
                                                        storyViews2.reactions_count = i19;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var3.f13101a = 0;
                                                    }
                                                    b5Var3.f13111m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + b5Var3.f13111m);
                                                for (int i110 = 0; i110 < arrayList.size(); i110++) {
                                                    ((c5) arrayList.get(i110)).e(b5Var3);
                                                }
                                                if (arrayList3.size() < 20 && b5Var3.f13111m) {
                                                    b5Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            b5 b5Var4 = b5Var2;
                                            ArrayList arrayList4 = b5Var4.f13116r;
                                            TL_stories.StoryItem storyItem3 = b5Var4.f13102b;
                                            int i20 = b5Var4.d;
                                            ArrayList arrayList5 = b5Var4.f13107i;
                                            if (iArr2[0] != b5Var4.f13113o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var4.f13104e = false;
                                                b5Var4.f13113o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var4.f13110l) {
                                                        b5Var4.f13110l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var4.f13114p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var4.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var4.f13111m = false;
                                                    } else {
                                                        b5Var4.f13111m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var4.f13112n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var4.f13111m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var4.f13101a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    b5Var4.f13101a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var4.f13101a = 0;
                                                    }
                                                    b5Var4.f13111m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + b5Var4.f13111m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var4);
                                                }
                                                if (arrayList5.size() < 20 && b5Var4.f13111m) {
                                                    b5Var4.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            this.f13113o = iSendRequest;
            final int[] iArr = {iSendRequest};
            return;
        }
        TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
        tL_stories_getStoryViewsList.f22626id = storyItem.f22617id;
        tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (this.f13115q) {
            tL_stories_getStoryViewsList.f22627q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = o4Var.f13747c;
            tL_stories_getStoryViewsList.f22627q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = o4Var.f13746b;
            tL_stories_getStoryViewsList.reactions_first = o4Var.f13745a;
        }
        tL_stories_getStoryViewsList.limit = (this.f13110l || this.f13106g.size() < 20) ? 20 : 100;
        String str3 = this.f13112n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.f13104e = true;
        FileLog.d("SelfStoryViewsPage load next " + storyItem.f22617id + " " + this.f13110l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f22627q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        final int i12 = 1;
        int iSendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {

            public final b5 f14187b;

            {
                this.f14187b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i12) {
                    case 0:
                        final int i13 = 1;
                        final b5 b5Var = this.f14187b;
                        final int[] iArr2 = iArr;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        b5 b5Var3 = b5Var;
                                        ArrayList arrayList = b5Var3.f13116r;
                                        ArrayList arrayList2 = b5Var3.h;
                                        int i14 = b5Var3.d;
                                        ArrayList arrayList3 = b5Var3.f13106g;
                                        TL_stories.StoryItem storyItem2 = b5Var3.f13102b;
                                        if (iArr2[0] != b5Var3.f13113o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var3.f13104e = false;
                                            b5Var3.f13113o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i14).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i15 = 0; i15 < storyViewsList.views.size(); i15++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i15);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i14).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i14).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i14).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var3.f13110l) {
                                                    b5Var3.f13110l = false;
                                                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                                        b5Var3.f13114p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i16)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var3.f13115q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var3.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    b5Var3.f13111m = false;
                                                } else {
                                                    b5Var3.f13111m = true;
                                                }
                                                String str4 = storyViewsList.next_offset;
                                                b5Var3.f13112n = str4;
                                                if (TextUtils.isEmpty(str4)) {
                                                    b5Var3.f13111m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i17 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i17 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int iF = 0; iF < Math.min(3, storyViewsList.users.size()); iF = com.google.android.recaptcha.internal.a.f(storyViewsList.users.get(iF).f22527id, storyItem2.views.recent_viewers, iF, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i18 = storyViews2.reactions_count;
                                                int i19 = storyViewsList.reactions_count;
                                                if (i18 != i19) {
                                                    storyViews2.reactions_count = i19;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var3.f13101a = 0;
                                                }
                                                b5Var3.f13111m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + b5Var3.f13111m);
                                            for (int i110 = 0; i110 < arrayList.size(); i110++) {
                                                ((c5) arrayList.get(i110)).e(b5Var3);
                                            }
                                            if (arrayList3.size() < 20 && b5Var3.f13111m) {
                                                b5Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        b5 b5Var4 = b5Var;
                                        ArrayList arrayList4 = b5Var4.f13116r;
                                        TL_stories.StoryItem storyItem3 = b5Var4.f13102b;
                                        int i20 = b5Var4.d;
                                        ArrayList arrayList5 = b5Var4.f13107i;
                                        if (iArr2[0] != b5Var4.f13113o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var4.f13104e = false;
                                            b5Var4.f13113o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var4.f13110l) {
                                                    b5Var4.f13110l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var4.f13114p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var4.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var4.f13111m = false;
                                                } else {
                                                    b5Var4.f13111m = true;
                                                }
                                                String str5 = tL_storyReactionsList.next_offset;
                                                b5Var4.f13112n = str5;
                                                if (TextUtils.isEmpty(str5)) {
                                                    b5Var4.f13111m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var4.f13101a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                b5Var4.f13101a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var4.f13101a = 0;
                                                }
                                                b5Var4.f13111m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + b5Var4.f13111m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var4);
                                            }
                                            if (arrayList5.size() < 20 && b5Var4.f13111m) {
                                                b5Var4.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i14 = 0;
                        final b5 b5Var2 = this.f14187b;
                        final int[] iArr3 = iArr;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z11;
                                switch (i14) {
                                    case 0:
                                        b5 b5Var3 = b5Var2;
                                        ArrayList arrayList = b5Var3.f13116r;
                                        ArrayList arrayList2 = b5Var3.h;
                                        int i15 = b5Var3.d;
                                        ArrayList arrayList3 = b5Var3.f13106g;
                                        TL_stories.StoryItem storyItem2 = b5Var3.f13102b;
                                        if (iArr3[0] != b5Var3.f13113o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var3.f13104e = false;
                                            b5Var3.f13113o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i15).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i16 = 0; i16 < storyViewsList.views.size(); i16++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i16);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i15).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i15).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i15).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var3.f13110l) {
                                                    b5Var3.f13110l = false;
                                                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                                        b5Var3.f13114p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i17)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var3.f13115q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var3.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    b5Var3.f13111m = false;
                                                } else {
                                                    b5Var3.f13111m = true;
                                                }
                                                String str4 = storyViewsList.next_offset;
                                                b5Var3.f13112n = str4;
                                                if (TextUtils.isEmpty(str4)) {
                                                    b5Var3.f13111m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i18 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i18 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int iF = 0; iF < Math.min(3, storyViewsList.users.size()); iF = com.google.android.recaptcha.internal.a.f(storyViewsList.users.get(iF).f22527id, storyItem2.views.recent_viewers, iF, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i19 = storyViews2.reactions_count;
                                                int i110 = storyViewsList.reactions_count;
                                                if (i19 != i110) {
                                                    storyViews2.reactions_count = i110;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var3.f13101a = 0;
                                                }
                                                b5Var3.f13111m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.f22617id + " response  totalItems " + arrayList3.size() + " has next " + b5Var3.f13111m);
                                            for (int i111 = 0; i111 < arrayList.size(); i111++) {
                                                ((c5) arrayList.get(i111)).e(b5Var3);
                                            }
                                            if (arrayList3.size() < 20 && b5Var3.f13111m) {
                                                b5Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        b5 b5Var4 = b5Var2;
                                        ArrayList arrayList4 = b5Var4.f13116r;
                                        TL_stories.StoryItem storyItem3 = b5Var4.f13102b;
                                        int i20 = b5Var4.d;
                                        ArrayList arrayList5 = b5Var4.f13107i;
                                        if (iArr3[0] != b5Var4.f13113o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var4.f13104e = false;
                                            b5Var4.f13113o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var4.f13110l) {
                                                    b5Var4.f13110l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var4.f13114p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var4.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var4.f13111m = false;
                                                } else {
                                                    b5Var4.f13111m = true;
                                                }
                                                String str5 = tL_storyReactionsList.next_offset;
                                                b5Var4.f13112n = str5;
                                                if (TextUtils.isEmpty(str5)) {
                                                    b5Var4.f13111m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var4.f13101a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                b5Var4.f13101a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var4.f13101a = 0;
                                                }
                                                b5Var4.f13111m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.f22617id + " response  totalItems " + arrayList5.size() + " has next " + b5Var4.f13111m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var4);
                                            }
                                            if (arrayList5.size() < 20 && b5Var4.f13111m) {
                                                b5Var4.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        this.f13113o = iSendRequest2;
        final int[] iArr2 = {iSendRequest2};
    }

    public final void d() {
        if (this.f13113o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f13113o, false);
        }
        this.f13113o = -1;
    }

    public final void e(o4 o4Var, boolean z10, boolean z11) {
        o4 o4Var2 = new o4();
        o4Var2.f13745a = o4Var.f13745a;
        o4Var2.f13746b = o4Var.f13746b;
        o4Var2.f13747c = o4Var.f13747c;
        int i10 = 0;
        if (!z10) {
            o4Var2.f13746b = false;
        }
        if (!z11) {
            o4Var2.f13745a = true;
        }
        o4 o4Var3 = this.f13117s;
        if (o4Var3.equals(o4Var2)) {
            return;
        }
        o4Var3.f13745a = o4Var2.f13745a;
        o4Var3.f13746b = o4Var2.f13746b;
        o4Var3.f13747c = o4Var2.f13747c;
        if (this.f13105f || !this.f13115q) {
            d();
            this.f13106g.clear();
            this.f13107i.clear();
            this.f13110l = true;
            this.f13104e = false;
            this.f13111m = true;
            this.f13112n = "";
            c();
            return;
        }
        a();
        while (true) {
            ArrayList arrayList = this.f13116r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((c5) arrayList.get(i10)).e(this);
            i10++;
        }
    }
}
