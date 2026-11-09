package di;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k5 {
    public int f9281a;
    public final TL_stories.StoryItem f9282b;
    public final long f9283c;
    public final int d;
    public boolean f9284e;
    public final boolean f9285f;
    public final boolean f9288j;
    public final boolean f9289k;
    public boolean f9290l;
    public String f9292n;
    public final boolean f9295q;
    public final ArrayList f9286g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f9287i = new ArrayList();
    public boolean f9291m = true;
    public int f9293o = -1;
    public final HashSet f9294p = new HashSet();
    public final ArrayList f9296r = new ArrayList();
    public final x4 f9297s = new x4();

    public k5(int i7, long j3, TL_stories.StoryItem storyItem) {
        boolean z9;
        int i10;
        boolean z10;
        TL_stories.StoryViews storyViews;
        this.d = i7;
        this.f9282b = storyItem;
        if (j3 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9285f = z9;
        this.f9283c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f9281a = i10;
        if (i10 < 200) {
            this.f9295q = true;
        }
        if (s7.v(storyItem) && !p10.i(i7).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9288j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f9288j = false;
            this.f9289k = true;
        }
        if (!this.f9288j) {
            this.f9290l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (qp.s1(i7).a2(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f9286g.add(tL_storyView);
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
        boolean z9;
        if (!this.f9285f) {
            ArrayList arrayList = this.f9286g;
            arrayList.clear();
            x4 x4Var = this.f9297s;
            boolean z10 = x4Var.f9927b;
            ArrayList arrayList2 = this.h;
            if (!z10 && TextUtils.isEmpty(x4Var.f9928c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(x4Var.f9928c)) {
                    str = x4Var.f9928c.trim().toLowerCase();
                    str2 = id.E0().S0(str, true, false);
                    str4 = rf.b.i(" ", str);
                    str3 = rf.b.i(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    TLRPC.User a22 = qp.s1(this.d).a2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i7)).user_id));
                    if (x4Var.f9927b && (a22 == null || !a22.contact)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9 && str != null) {
                        String lowerCase = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                        String n10 = t10.n(a22);
                        String O3 = org.telegram.messenger.g0.O3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !O3.startsWith(str2) && !O3.contains(str3) && (n10 == null || (!n10.startsWith(str2) && !n10.contains(str3)))) {
                            z9 = false;
                        }
                    }
                    if (z9) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i7));
                    }
                }
            }
            if (!x4Var.f9926a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f9285f) {
            arrayList = this.f9287i;
        } else {
            arrayList = this.f9286g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f9284e && this.f9291m && !this.f9288j) {
            boolean z9 = this.f9285f;
            int i7 = 100;
            long j3 = this.f9283c;
            x4 x4Var = this.f9297s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f9282b;
            if (z9) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = x4Var.f9926a;
                tL_getStoryReactionsList.f27196id = storyItem.f27195id;
                tL_getStoryReactionsList.peer = qp.s1(i10).j1(j3);
                if (this.f9290l || this.f9287i.size() < 20) {
                    i7 = 20;
                }
                tL_getStoryReactionsList.limit = i7;
                String str = this.f9292n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f9284e = true;
                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.f27195id + " " + this.f9290l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final k5 f9111b;

                    {
                        this.f9111b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final k5 k5Var = this.f9111b;
                                final int[] iArr = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                k5 k5Var2 = k5Var;
                                                ArrayList arrayList = k5Var2.f9296r;
                                                ArrayList arrayList2 = k5Var2.h;
                                                int i11 = k5Var2.d;
                                                ArrayList arrayList3 = k5Var2.f9286g;
                                                TL_stories.StoryItem storyItem2 = k5Var2.f9282b;
                                                if (iArr[0] != k5Var2.f9293o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " localId != reqId");
                                                    return;
                                                }
                                                k5Var2.f9284e = false;
                                                k5Var2.f9293o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = qp.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    qp.s1(i11).Y3(storyViewsList.users, false);
                                                    qp.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z11 = true;
                                                    yr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (k5Var2.f9290l) {
                                                        k5Var2.f9290l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            k5Var2.f9294p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (k5Var2.f9295q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        k5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        k5Var2.f9291m = true;
                                                    } else {
                                                        k5Var2.f9291m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    k5Var2.f9292n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        k5Var2.f9291m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, storyViewsList.users.get(i15).f27105id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i16 = storyViews2.reactions_count;
                                                    int i17 = storyViewsList.reactions_count;
                                                    if (i16 != i17) {
                                                        storyViews2.reactions_count = i17;
                                                    } else {
                                                        z11 = z10;
                                                    }
                                                    if (z11) {
                                                        qs.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        k5Var2.f9281a = 0;
                                                    }
                                                    k5Var2.f9291m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " response  totalItems " + arrayList3.size() + " has next " + k5Var2.f9291m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((l5) arrayList.get(i18)).e(k5Var2);
                                                }
                                                if (arrayList3.size() < 20 && k5Var2.f9291m) {
                                                    k5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                k5 k5Var3 = k5Var;
                                                ArrayList arrayList4 = k5Var3.f9296r;
                                                TL_stories.StoryItem storyItem3 = k5Var3.f9282b;
                                                int i19 = k5Var3.d;
                                                ArrayList arrayList5 = k5Var3.f9287i;
                                                if (iArr[0] != k5Var3.f9293o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " localId != reqId");
                                                    return;
                                                }
                                                k5Var3.f9284e = false;
                                                k5Var3.f9293o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    qp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    qp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    yr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (k5Var3.f9290l) {
                                                        k5Var3.f9290l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            k5Var3.f9294p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        k5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        k5Var3.f9291m = true;
                                                    } else {
                                                        k5Var3.f9291m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    k5Var3.f9292n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        k5Var3.f9291m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = k5Var3.f9281a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z12 = false;
                                                    }
                                                    k5Var3.f9281a = i22;
                                                    if (z12) {
                                                        qs.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        k5Var3.f9281a = 0;
                                                    }
                                                    k5Var3.f9291m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " response  totalItems " + arrayList5.size() + " has next " + k5Var3.f9291m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((l5) arrayList4.get(i23)).e(k5Var3);
                                                }
                                                if (arrayList5.size() < 20 && k5Var3.f9291m) {
                                                    k5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final k5 k5Var2 = this.f9111b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        switch (r5) {
                                            case 0:
                                                k5 k5Var22 = k5Var2;
                                                ArrayList arrayList = k5Var22.f9296r;
                                                ArrayList arrayList2 = k5Var22.h;
                                                int i11 = k5Var22.d;
                                                ArrayList arrayList3 = k5Var22.f9286g;
                                                TL_stories.StoryItem storyItem2 = k5Var22.f9282b;
                                                if (iArr2[0] != k5Var22.f9293o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " localId != reqId");
                                                    return;
                                                }
                                                k5Var22.f9284e = false;
                                                k5Var22.f9293o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = qp.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    qp.s1(i11).Y3(storyViewsList.users, false);
                                                    qp.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z11 = true;
                                                    yr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (k5Var22.f9290l) {
                                                        k5Var22.f9290l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            k5Var22.f9294p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (k5Var22.f9295q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        k5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        k5Var22.f9291m = true;
                                                    } else {
                                                        k5Var22.f9291m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    k5Var22.f9292n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        k5Var22.f9291m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, storyViewsList.users.get(i15).f27105id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i16 = storyViews2.reactions_count;
                                                    int i17 = storyViewsList.reactions_count;
                                                    if (i16 != i17) {
                                                        storyViews2.reactions_count = i17;
                                                    } else {
                                                        z11 = z10;
                                                    }
                                                    if (z11) {
                                                        qs.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        k5Var22.f9281a = 0;
                                                    }
                                                    k5Var22.f9291m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " response  totalItems " + arrayList3.size() + " has next " + k5Var22.f9291m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((l5) arrayList.get(i18)).e(k5Var22);
                                                }
                                                if (arrayList3.size() < 20 && k5Var22.f9291m) {
                                                    k5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                k5 k5Var3 = k5Var2;
                                                ArrayList arrayList4 = k5Var3.f9296r;
                                                TL_stories.StoryItem storyItem3 = k5Var3.f9282b;
                                                int i19 = k5Var3.d;
                                                ArrayList arrayList5 = k5Var3.f9287i;
                                                if (iArr2[0] != k5Var3.f9293o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " localId != reqId");
                                                    return;
                                                }
                                                k5Var3.f9284e = false;
                                                k5Var3.f9293o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    qp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    qp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z12 = true;
                                                    yr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (k5Var3.f9290l) {
                                                        k5Var3.f9290l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            k5Var3.f9294p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        k5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        k5Var3.f9291m = true;
                                                    } else {
                                                        k5Var3.f9291m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    k5Var3.f9292n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        k5Var3.f9291m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = k5Var3.f9281a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z12 = false;
                                                    }
                                                    k5Var3.f9281a = i22;
                                                    if (z12) {
                                                        qs.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        k5Var3.f9281a = 0;
                                                    }
                                                    k5Var3.f9291m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " response  totalItems " + arrayList5.size() + " has next " + k5Var3.f9291m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((l5) arrayList4.get(i23)).e(k5Var3);
                                                }
                                                if (arrayList5.size() < 20 && k5Var3.f9291m) {
                                                    k5Var3.c();
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
                this.f9293o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f27204id = storyItem.f27195id;
            tL_stories_getStoryViewsList.peer = qp.s1(i10).j1(j3);
            if (this.f9295q) {
                tL_stories_getStoryViewsList.f27205q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = x4Var.f9928c;
                tL_stories_getStoryViewsList.f27205q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = x4Var.f9927b;
                tL_stories_getStoryViewsList.reactions_first = x4Var.f9926a;
            }
            if (this.f9290l || this.f9286g.size() < 20) {
                i7 = 20;
            }
            tL_stories_getStoryViewsList.limit = i7;
            String str3 = this.f9292n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f9284e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.f27195id + " " + this.f9290l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f27205q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final k5 f9111b;

                {
                    this.f9111b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final k5 k5Var = this.f9111b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            k5 k5Var22 = k5Var;
                                            ArrayList arrayList = k5Var22.f9296r;
                                            ArrayList arrayList2 = k5Var22.h;
                                            int i11 = k5Var22.d;
                                            ArrayList arrayList3 = k5Var22.f9286g;
                                            TL_stories.StoryItem storyItem2 = k5Var22.f9282b;
                                            if (iArr2[0] != k5Var22.f9293o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " localId != reqId");
                                                return;
                                            }
                                            k5Var22.f9284e = false;
                                            k5Var22.f9293o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = qp.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                qp.s1(i11).Y3(storyViewsList.users, false);
                                                qp.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z11 = true;
                                                yr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (k5Var22.f9290l) {
                                                    k5Var22.f9290l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        k5Var22.f9294p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (k5Var22.f9295q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    k5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    k5Var22.f9291m = true;
                                                } else {
                                                    k5Var22.f9291m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                k5Var22.f9292n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    k5Var22.f9291m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, storyViewsList.users.get(i15).f27105id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i16 = storyViews2.reactions_count;
                                                int i17 = storyViewsList.reactions_count;
                                                if (i16 != i17) {
                                                    storyViews2.reactions_count = i17;
                                                } else {
                                                    z11 = z10;
                                                }
                                                if (z11) {
                                                    qs.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    k5Var22.f9281a = 0;
                                                }
                                                k5Var22.f9291m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " response  totalItems " + arrayList3.size() + " has next " + k5Var22.f9291m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((l5) arrayList.get(i18)).e(k5Var22);
                                            }
                                            if (arrayList3.size() < 20 && k5Var22.f9291m) {
                                                k5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            k5 k5Var3 = k5Var;
                                            ArrayList arrayList4 = k5Var3.f9296r;
                                            TL_stories.StoryItem storyItem3 = k5Var3.f9282b;
                                            int i19 = k5Var3.d;
                                            ArrayList arrayList5 = k5Var3.f9287i;
                                            if (iArr2[0] != k5Var3.f9293o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " localId != reqId");
                                                return;
                                            }
                                            k5Var3.f9284e = false;
                                            k5Var3.f9293o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                qp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                qp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                yr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (k5Var3.f9290l) {
                                                    k5Var3.f9290l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        k5Var3.f9294p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    k5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    k5Var3.f9291m = true;
                                                } else {
                                                    k5Var3.f9291m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                k5Var3.f9292n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    k5Var3.f9291m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = k5Var3.f9281a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z12 = false;
                                                }
                                                k5Var3.f9281a = i22;
                                                if (z12) {
                                                    qs.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    k5Var3.f9281a = 0;
                                                }
                                                k5Var3.f9291m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " response  totalItems " + arrayList5.size() + " has next " + k5Var3.f9291m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((l5) arrayList4.get(i23)).e(k5Var3);
                                            }
                                            if (arrayList5.size() < 20 && k5Var3.f9291m) {
                                                k5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final k5 k5Var2 = this.f9111b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z10;
                                    switch (r5) {
                                        case 0:
                                            k5 k5Var22 = k5Var2;
                                            ArrayList arrayList = k5Var22.f9296r;
                                            ArrayList arrayList2 = k5Var22.h;
                                            int i11 = k5Var22.d;
                                            ArrayList arrayList3 = k5Var22.f9286g;
                                            TL_stories.StoryItem storyItem2 = k5Var22.f9282b;
                                            if (iArr22[0] != k5Var22.f9293o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " localId != reqId");
                                                return;
                                            }
                                            k5Var22.f9284e = false;
                                            k5Var22.f9293o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = qp.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                qp.s1(i11).Y3(storyViewsList.users, false);
                                                qp.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z11 = true;
                                                yr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (k5Var22.f9290l) {
                                                    k5Var22.f9290l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        k5Var22.f9294p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (k5Var22.f9295q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    k5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    k5Var22.f9291m = true;
                                                } else {
                                                    k5Var22.f9291m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                k5Var22.f9292n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    k5Var22.f9291m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.recaptcha.internal.a.g(i15, 1, storyViewsList.users.get(i15).f27105id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i16 = storyViews2.reactions_count;
                                                int i17 = storyViewsList.reactions_count;
                                                if (i16 != i17) {
                                                    storyViews2.reactions_count = i17;
                                                } else {
                                                    z11 = z10;
                                                }
                                                if (z11) {
                                                    qs.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    k5Var22.f9281a = 0;
                                                }
                                                k5Var22.f9291m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27195id + " response  totalItems " + arrayList3.size() + " has next " + k5Var22.f9291m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((l5) arrayList.get(i18)).e(k5Var22);
                                            }
                                            if (arrayList3.size() < 20 && k5Var22.f9291m) {
                                                k5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            k5 k5Var3 = k5Var2;
                                            ArrayList arrayList4 = k5Var3.f9296r;
                                            TL_stories.StoryItem storyItem3 = k5Var3.f9282b;
                                            int i19 = k5Var3.d;
                                            ArrayList arrayList5 = k5Var3.f9287i;
                                            if (iArr22[0] != k5Var3.f9293o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " localId != reqId");
                                                return;
                                            }
                                            k5Var3.f9284e = false;
                                            k5Var3.f9293o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                qp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                qp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z12 = true;
                                                yr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (k5Var3.f9290l) {
                                                    k5Var3.f9290l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        k5Var3.f9294p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    k5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    k5Var3.f9291m = true;
                                                } else {
                                                    k5Var3.f9291m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                k5Var3.f9292n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    k5Var3.f9291m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = k5Var3.f9281a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z12 = false;
                                                }
                                                k5Var3.f9281a = i22;
                                                if (z12) {
                                                    qs.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    k5Var3.f9281a = 0;
                                                }
                                                k5Var3.f9291m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27195id + " response  totalItems " + arrayList5.size() + " has next " + k5Var3.f9291m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((l5) arrayList4.get(i23)).e(k5Var3);
                                            }
                                            if (arrayList5.size() < 20 && k5Var3.f9291m) {
                                                k5Var3.c();
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
            this.f9293o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f9293o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f9293o, false);
        }
        this.f9293o = -1;
    }

    public final void e(x4 x4Var, boolean z9, boolean z10) {
        x4 x4Var2 = new x4();
        x4Var2.f9926a = x4Var.f9926a;
        x4Var2.f9927b = x4Var.f9927b;
        x4Var2.f9928c = x4Var.f9928c;
        int i7 = 0;
        if (!z9) {
            x4Var2.f9927b = false;
        }
        if (!z10) {
            x4Var2.f9926a = true;
        }
        x4 x4Var3 = this.f9297s;
        if (!x4Var3.equals(x4Var2)) {
            x4Var3.f9926a = x4Var2.f9926a;
            x4Var3.f9927b = x4Var2.f9927b;
            x4Var3.f9928c = x4Var2.f9928c;
            if (!this.f9285f && this.f9295q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f9296r;
                    if (i7 < arrayList.size()) {
                        ((l5) arrayList.get(i7)).e(this);
                        i7++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f9286g.clear();
                this.f9287i.clear();
                this.f9290l = true;
                this.f9284e = false;
                this.f9291m = true;
                this.f9292n = "";
                c();
            }
        }
    }
}
