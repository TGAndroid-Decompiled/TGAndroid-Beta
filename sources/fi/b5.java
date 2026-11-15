package fi;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class b5 {
    public int f11550a;
    public final TL_stories.StoryItem f11551b;
    public final long f11552c;
    public final int d;
    public boolean f11553e;
    public final boolean f11554f;
    public final boolean f11557j;
    public final boolean f11558k;
    public boolean f11559l;
    public String f11561n;
    public final boolean f11564q;
    public final ArrayList f11555g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f11556i = new ArrayList();
    public boolean f11560m = true;
    public int f11562o = -1;
    public final HashSet f11563p = new HashSet();
    public final ArrayList f11565r = new ArrayList();
    public final o4 f11566s = new o4();

    public b5(int i7, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i10;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i7;
        this.f11551b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11554f = z10;
        this.f11552c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f11550a = i10;
        if (i10 < 200) {
            this.f11564q = true;
        }
        if (l7.v(storyItem) && !m10.i(i7).q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11557j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f11557j = false;
            this.f11558k = true;
        }
        if (!this.f11557j) {
            this.f11559l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (np.s1(i7).a2(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f11555g.add(tL_storyView);
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
        if (!this.f11554f) {
            ArrayList arrayList = this.f11555g;
            arrayList.clear();
            o4 o4Var = this.f11566s;
            boolean z11 = o4Var.f12116b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(o4Var.f12117c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(o4Var.f12117c)) {
                    str = o4Var.f12117c.trim().toLowerCase();
                    str2 = hd.E0().S0(str, true, false);
                    str4 = r.b.k(" ", str);
                    str3 = r.b.k(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    TLRPC.User a22 = np.s1(this.d).a2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i7)).user_id));
                    if (o4Var.f12116b && (a22 == null || !a22.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                        String n10 = q10.n(a22);
                        String N3 = org.telegram.messenger.g0.N3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !N3.startsWith(str2) && !N3.contains(str3) && (n10 == null || (!n10.startsWith(str2) && !n10.contains(str3)))) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i7));
                    }
                }
            }
            if (!o4Var.f12115a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f11554f) {
            arrayList = this.f11556i;
        } else {
            arrayList = this.f11555g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f11553e && this.f11560m && !this.f11557j) {
            boolean z10 = this.f11554f;
            int i7 = 100;
            long j3 = this.f11552c;
            o4 o4Var = this.f11566s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f11551b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = o4Var.f12115a;
                tL_getStoryReactionsList.f28291id = storyItem.f28290id;
                tL_getStoryReactionsList.peer = np.s1(i10).j1(j3);
                if (this.f11559l || this.f11556i.size() < 20) {
                    i7 = 20;
                }
                tL_getStoryReactionsList.limit = i7;
                String str = this.f11561n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f11553e = true;
                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.f28290id + " " + this.f11559l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final b5 f12589b;

                    {
                        this.f12589b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final b5 b5Var = this.f12589b;
                                final int[] iArr = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                b5 b5Var2 = b5Var;
                                                ArrayList arrayList = b5Var2.f11565r;
                                                ArrayList arrayList2 = b5Var2.h;
                                                int i11 = b5Var2.d;
                                                ArrayList arrayList3 = b5Var2.f11555g;
                                                TL_stories.StoryItem storyItem2 = b5Var2.f11551b;
                                                if (iArr[0] != b5Var2.f11562o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var2.f11553e = false;
                                                b5Var2.f11562o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.s1(i11).Y3(storyViewsList.users, false);
                                                    np.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    vr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var2.f11559l) {
                                                        b5Var2.f11559l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            b5Var2.f11563p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var2.f11564q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        b5Var2.f11560m = true;
                                                    } else {
                                                        b5Var2.f11560m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var2.f11561n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var2.f11560m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28200id, storyItem2.views.recent_viewers)) {
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
                                                        ns.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var2.f11550a = 0;
                                                    }
                                                    b5Var2.f11560m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " response  totalItems " + arrayList3.size() + " has next " + b5Var2.f11560m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((c5) arrayList.get(i18)).e(b5Var2);
                                                }
                                                if (arrayList3.size() < 20 && b5Var2.f11560m) {
                                                    b5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                b5 b5Var3 = b5Var;
                                                ArrayList arrayList4 = b5Var3.f11565r;
                                                TL_stories.StoryItem storyItem3 = b5Var3.f11551b;
                                                int i19 = b5Var3.d;
                                                ArrayList arrayList5 = b5Var3.f11556i;
                                                if (iArr[0] != b5Var3.f11562o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var3.f11553e = false;
                                                b5Var3.f11562o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    np.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    vr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.f11559l) {
                                                        b5Var3.f11559l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            b5Var3.f11563p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.f11560m = true;
                                                    } else {
                                                        b5Var3.f11560m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.f11561n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.f11560m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = b5Var3.f11550a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    b5Var3.f11550a = i22;
                                                    if (z13) {
                                                        ns.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.f11550a = 0;
                                                    }
                                                    b5Var3.f11560m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f11560m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((c5) arrayList4.get(i23)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.f11560m) {
                                                    b5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final b5 b5Var2 = this.f12589b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                b5 b5Var22 = b5Var2;
                                                ArrayList arrayList = b5Var22.f11565r;
                                                ArrayList arrayList2 = b5Var22.h;
                                                int i11 = b5Var22.d;
                                                ArrayList arrayList3 = b5Var22.f11555g;
                                                TL_stories.StoryItem storyItem2 = b5Var22.f11551b;
                                                if (iArr2[0] != b5Var22.f11562o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var22.f11553e = false;
                                                b5Var22.f11562o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.s1(i11).Y3(storyViewsList.users, false);
                                                    np.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    vr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var22.f11559l) {
                                                        b5Var22.f11559l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            b5Var22.f11563p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var22.f11564q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        b5Var22.f11560m = true;
                                                    } else {
                                                        b5Var22.f11560m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var22.f11561n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var22.f11560m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28200id, storyItem2.views.recent_viewers)) {
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
                                                        ns.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var22.f11550a = 0;
                                                    }
                                                    b5Var22.f11560m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f11560m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((c5) arrayList.get(i18)).e(b5Var22);
                                                }
                                                if (arrayList3.size() < 20 && b5Var22.f11560m) {
                                                    b5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                b5 b5Var3 = b5Var2;
                                                ArrayList arrayList4 = b5Var3.f11565r;
                                                TL_stories.StoryItem storyItem3 = b5Var3.f11551b;
                                                int i19 = b5Var3.d;
                                                ArrayList arrayList5 = b5Var3.f11556i;
                                                if (iArr2[0] != b5Var3.f11562o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " localId != reqId");
                                                    return;
                                                }
                                                b5Var3.f11553e = false;
                                                b5Var3.f11562o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    np.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    vr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.f11559l) {
                                                        b5Var3.f11559l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            b5Var3.f11563p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.f11560m = true;
                                                    } else {
                                                        b5Var3.f11560m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.f11561n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.f11560m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = b5Var3.f11550a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    b5Var3.f11550a = i22;
                                                    if (z13) {
                                                        ns.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.f11550a = 0;
                                                    }
                                                    b5Var3.f11560m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f11560m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((c5) arrayList4.get(i23)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.f11560m) {
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
                this.f11562o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f28299id = storyItem.f28290id;
            tL_stories_getStoryViewsList.peer = np.s1(i10).j1(j3);
            if (this.f11564q) {
                tL_stories_getStoryViewsList.f28300q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = o4Var.f12117c;
                tL_stories_getStoryViewsList.f28300q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = o4Var.f12116b;
                tL_stories_getStoryViewsList.reactions_first = o4Var.f12115a;
            }
            if (this.f11559l || this.f11555g.size() < 20) {
                i7 = 20;
            }
            tL_stories_getStoryViewsList.limit = i7;
            String str3 = this.f11561n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f11553e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.f28290id + " " + this.f11559l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f28300q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final b5 f12589b;

                {
                    this.f12589b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final b5 b5Var = this.f12589b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            b5 b5Var22 = b5Var;
                                            ArrayList arrayList = b5Var22.f11565r;
                                            ArrayList arrayList2 = b5Var22.h;
                                            int i11 = b5Var22.d;
                                            ArrayList arrayList3 = b5Var22.f11555g;
                                            TL_stories.StoryItem storyItem2 = b5Var22.f11551b;
                                            if (iArr2[0] != b5Var22.f11562o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " localId != reqId");
                                                return;
                                            }
                                            b5Var22.f11553e = false;
                                            b5Var22.f11562o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.s1(i11).Y3(storyViewsList.users, false);
                                                np.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                vr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var22.f11559l) {
                                                    b5Var22.f11559l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        b5Var22.f11563p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.f11564q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    b5Var22.f11560m = true;
                                                } else {
                                                    b5Var22.f11560m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.f11561n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.f11560m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28200id, storyItem2.views.recent_viewers)) {
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
                                                    ns.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var22.f11550a = 0;
                                                }
                                                b5Var22.f11560m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f11560m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((c5) arrayList.get(i18)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.f11560m) {
                                                b5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var3 = b5Var;
                                            ArrayList arrayList4 = b5Var3.f11565r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.f11551b;
                                            int i19 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.f11556i;
                                            if (iArr2[0] != b5Var3.f11562o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " localId != reqId");
                                                return;
                                            }
                                            b5Var3.f11553e = false;
                                            b5Var3.f11562o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                np.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                vr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.f11559l) {
                                                    b5Var3.f11559l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        b5Var3.f11563p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.f11560m = true;
                                                } else {
                                                    b5Var3.f11560m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.f11561n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.f11560m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = b5Var3.f11550a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                b5Var3.f11550a = i22;
                                                if (z13) {
                                                    ns.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.f11550a = 0;
                                                }
                                                b5Var3.f11560m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f11560m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((c5) arrayList4.get(i23)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.f11560m) {
                                                b5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final b5 b5Var2 = this.f12589b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            b5 b5Var22 = b5Var2;
                                            ArrayList arrayList = b5Var22.f11565r;
                                            ArrayList arrayList2 = b5Var22.h;
                                            int i11 = b5Var22.d;
                                            ArrayList arrayList3 = b5Var22.f11555g;
                                            TL_stories.StoryItem storyItem2 = b5Var22.f11551b;
                                            if (iArr22[0] != b5Var22.f11562o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " localId != reqId");
                                                return;
                                            }
                                            b5Var22.f11553e = false;
                                            b5Var22.f11562o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.s1(i11).Y3(storyViewsList.users, false);
                                                np.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                vr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var22.f11559l) {
                                                    b5Var22.f11559l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        b5Var22.f11563p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.f11564q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    b5Var22.f11560m = true;
                                                } else {
                                                    b5Var22.f11560m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.f11561n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.f11560m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28200id, storyItem2.views.recent_viewers)) {
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
                                                    ns.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var22.f11550a = 0;
                                                }
                                                b5Var22.f11560m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28290id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.f11560m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((c5) arrayList.get(i18)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.f11560m) {
                                                b5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var3 = b5Var2;
                                            ArrayList arrayList4 = b5Var3.f11565r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.f11551b;
                                            int i19 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.f11556i;
                                            if (iArr22[0] != b5Var3.f11562o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " localId != reqId");
                                                return;
                                            }
                                            b5Var3.f11553e = false;
                                            b5Var3.f11562o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                np.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                vr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.f11559l) {
                                                    b5Var3.f11559l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        b5Var3.f11563p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.f11560m = true;
                                                } else {
                                                    b5Var3.f11560m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.f11561n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.f11560m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = b5Var3.f11550a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                b5Var3.f11550a = i22;
                                                if (z13) {
                                                    ns.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.f11550a = 0;
                                                }
                                                b5Var3.f11560m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28290id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.f11560m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((c5) arrayList4.get(i23)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.f11560m) {
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
            this.f11562o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f11562o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f11562o, false);
        }
        this.f11562o = -1;
    }

    public final void e(o4 o4Var, boolean z10, boolean z11) {
        o4 o4Var2 = new o4();
        o4Var2.f12115a = o4Var.f12115a;
        o4Var2.f12116b = o4Var.f12116b;
        o4Var2.f12117c = o4Var.f12117c;
        int i7 = 0;
        if (!z10) {
            o4Var2.f12116b = false;
        }
        if (!z11) {
            o4Var2.f12115a = true;
        }
        o4 o4Var3 = this.f11566s;
        if (!o4Var3.equals(o4Var2)) {
            o4Var3.f12115a = o4Var2.f12115a;
            o4Var3.f12116b = o4Var2.f12116b;
            o4Var3.f12117c = o4Var2.f12117c;
            if (!this.f11554f && this.f11564q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f11565r;
                    if (i7 < arrayList.size()) {
                        ((c5) arrayList.get(i7)).e(this);
                        i7++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f11555g.clear();
                this.f11556i.clear();
                this.f11559l = true;
                this.f11553e = false;
                this.f11560m = true;
                this.f11561n = "";
                c();
            }
        }
    }
}
