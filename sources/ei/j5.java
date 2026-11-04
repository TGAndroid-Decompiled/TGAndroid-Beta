package ei;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j5 {
    public int f10534a;
    public final TL_stories.StoryItem f10535b;
    public final long f10536c;
    public final int d;
    public boolean f10537e;
    public final boolean f10538f;
    public final boolean f10541j;
    public final boolean f10542k;
    public boolean f10543l;
    public String f10545n;
    public final boolean f10548q;
    public final ArrayList f10539g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f10540i = new ArrayList();
    public boolean f10544m = true;
    public int f10546o = -1;
    public final HashSet f10547p = new HashSet();
    public final ArrayList f10549r = new ArrayList();
    public final w4 f10550s = new w4();

    public j5(int i3, long j10, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i10;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i3;
        this.f10535b = storyItem;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10538f = z10;
        this.f10536c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f10534a = i10;
        if (i10 < 200) {
            this.f10548q = true;
        }
        if (s7.v(storyItem) && !h10.i(i3).q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f10541j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f10541j = false;
            this.f10542k = true;
        }
        if (!this.f10541j) {
            this.f10543l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (hp.s1(i3).a2(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f10539g.add(tL_storyView);
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
        if (!this.f10538f) {
            ArrayList arrayList = this.f10539g;
            arrayList.clear();
            w4 w4Var = this.f10550s;
            boolean z11 = w4Var.f11181b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(w4Var.f11182c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(w4Var.f11182c)) {
                    str = w4Var.f11182c.trim().toLowerCase();
                    str2 = bd.E0().S0(str, true, false);
                    str4 = t4.c.f(" ", str);
                    str3 = t4.c.f(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    TLRPC.User a22 = hp.s1(this.d).a2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i3)).user_id));
                    if (w4Var.f11181b && (a22 == null || !a22.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                        String n4 = l10.n(a22);
                        String O3 = org.telegram.messenger.g0.O3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !O3.startsWith(str2) && !O3.contains(str3) && (n4 == null || (!n4.startsWith(str2) && !n4.contains(str3)))) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i3));
                    }
                }
            }
            if (!w4Var.f11180a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new cg.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f10538f) {
            arrayList = this.f10540i;
        } else {
            arrayList = this.f10539g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f10537e && this.f10544m && !this.f10541j) {
            boolean z10 = this.f10538f;
            int i3 = 100;
            long j10 = this.f10536c;
            w4 w4Var = this.f10550s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f10535b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = w4Var.f11180a;
                tL_getStoryReactionsList.f27241id = storyItem.f27240id;
                tL_getStoryReactionsList.peer = hp.s1(i10).j1(j10);
                if (this.f10543l || this.f10540i.size() < 20) {
                    i3 = 20;
                }
                tL_getStoryReactionsList.limit = i3;
                String str = this.f10545n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f10537e = true;
                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.f27240id + " " + this.f10543l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final j5 f10368b;

                    {
                        this.f10368b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final j5 j5Var = this.f10368b;
                                final int[] iArr = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                j5 j5Var2 = j5Var;
                                                ArrayList arrayList = j5Var2.f10549r;
                                                ArrayList arrayList2 = j5Var2.h;
                                                int i11 = j5Var2.d;
                                                ArrayList arrayList3 = j5Var2.f10539g;
                                                TL_stories.StoryItem storyItem2 = j5Var2.f10535b;
                                                if (iArr[0] != j5Var2.f10546o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " localId != reqId");
                                                    return;
                                                }
                                                j5Var2.f10537e = false;
                                                j5Var2.f10546o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = hp.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    hp.s1(i11).Y3(storyViewsList.users, false);
                                                    hp.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    qr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (j5Var2.f10543l) {
                                                        j5Var2.f10543l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            j5Var2.f10547p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (j5Var2.f10548q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        j5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        j5Var2.f10544m = true;
                                                    } else {
                                                        j5Var2.f10544m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    j5Var2.f10545n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        j5Var2.f10544m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = a1.g.h(i15, 1, storyViewsList.users.get(i15).f27150id, storyItem2.views.recent_viewers)) {
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
                                                        hs.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        j5Var2.f10534a = 0;
                                                    }
                                                    j5Var2.f10544m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " response  totalItems " + arrayList3.size() + " has next " + j5Var2.f10544m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((k5) arrayList.get(i18)).e(j5Var2);
                                                }
                                                if (arrayList3.size() < 20 && j5Var2.f10544m) {
                                                    j5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                j5 j5Var3 = j5Var;
                                                ArrayList arrayList4 = j5Var3.f10549r;
                                                TL_stories.StoryItem storyItem3 = j5Var3.f10535b;
                                                int i19 = j5Var3.d;
                                                ArrayList arrayList5 = j5Var3.f10540i;
                                                if (iArr[0] != j5Var3.f10546o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " localId != reqId");
                                                    return;
                                                }
                                                j5Var3.f10537e = false;
                                                j5Var3.f10546o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    hp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    hp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    qr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (j5Var3.f10543l) {
                                                        j5Var3.f10543l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            j5Var3.f10547p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        j5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        j5Var3.f10544m = true;
                                                    } else {
                                                        j5Var3.f10544m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    j5Var3.f10545n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        j5Var3.f10544m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = j5Var3.f10534a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    j5Var3.f10534a = i22;
                                                    if (z13) {
                                                        hs.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        j5Var3.f10534a = 0;
                                                    }
                                                    j5Var3.f10544m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " response  totalItems " + arrayList5.size() + " has next " + j5Var3.f10544m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((k5) arrayList4.get(i23)).e(j5Var3);
                                                }
                                                if (arrayList5.size() < 20 && j5Var3.f10544m) {
                                                    j5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final j5 j5Var2 = this.f10368b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                j5 j5Var22 = j5Var2;
                                                ArrayList arrayList = j5Var22.f10549r;
                                                ArrayList arrayList2 = j5Var22.h;
                                                int i11 = j5Var22.d;
                                                ArrayList arrayList3 = j5Var22.f10539g;
                                                TL_stories.StoryItem storyItem2 = j5Var22.f10535b;
                                                if (iArr2[0] != j5Var22.f10546o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " localId != reqId");
                                                    return;
                                                }
                                                j5Var22.f10537e = false;
                                                j5Var22.f10546o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = hp.s1(i11).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    hp.s1(i11).Y3(storyViewsList.users, false);
                                                    hp.s1(i11).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    qr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (j5Var22.f10543l) {
                                                        j5Var22.f10543l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            j5Var22.f10547p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (j5Var22.f10548q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        j5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        j5Var22.f10544m = true;
                                                    } else {
                                                        j5Var22.f10544m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    j5Var22.f10545n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        j5Var22.f10544m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = a1.g.h(i15, 1, storyViewsList.users.get(i15).f27150id, storyItem2.views.recent_viewers)) {
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
                                                        hs.f(i11).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        j5Var22.f10534a = 0;
                                                    }
                                                    j5Var22.f10544m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " response  totalItems " + arrayList3.size() + " has next " + j5Var22.f10544m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((k5) arrayList.get(i18)).e(j5Var22);
                                                }
                                                if (arrayList3.size() < 20 && j5Var22.f10544m) {
                                                    j5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                j5 j5Var3 = j5Var2;
                                                ArrayList arrayList4 = j5Var3.f10549r;
                                                TL_stories.StoryItem storyItem3 = j5Var3.f10535b;
                                                int i19 = j5Var3.d;
                                                ArrayList arrayList5 = j5Var3.f10540i;
                                                if (iArr2[0] != j5Var3.f10546o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " localId != reqId");
                                                    return;
                                                }
                                                j5Var3.f10537e = false;
                                                j5Var3.f10546o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    hp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                    hp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    qr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (j5Var3.f10543l) {
                                                        j5Var3.f10543l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            j5Var3.f10547p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        j5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        j5Var3.f10544m = true;
                                                    } else {
                                                        j5Var3.f10544m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    j5Var3.f10545n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        j5Var3.f10544m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = j5Var3.f10534a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    j5Var3.f10534a = i22;
                                                    if (z13) {
                                                        hs.f(i19).k(324, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        j5Var3.f10534a = 0;
                                                    }
                                                    j5Var3.f10544m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " response  totalItems " + arrayList5.size() + " has next " + j5Var3.f10544m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((k5) arrayList4.get(i23)).e(j5Var3);
                                                }
                                                if (arrayList5.size() < 20 && j5Var3.f10544m) {
                                                    j5Var3.c();
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
                this.f10546o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f27249id = storyItem.f27240id;
            tL_stories_getStoryViewsList.peer = hp.s1(i10).j1(j10);
            if (this.f10548q) {
                tL_stories_getStoryViewsList.f27250q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = w4Var.f11182c;
                tL_stories_getStoryViewsList.f27250q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = w4Var.f11181b;
                tL_stories_getStoryViewsList.reactions_first = w4Var.f11180a;
            }
            if (this.f10543l || this.f10539g.size() < 20) {
                i3 = 20;
            }
            tL_stories_getStoryViewsList.limit = i3;
            String str3 = this.f10545n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f10537e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.f27240id + " " + this.f10543l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f27250q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final j5 f10368b;

                {
                    this.f10368b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final j5 j5Var = this.f10368b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            j5 j5Var22 = j5Var;
                                            ArrayList arrayList = j5Var22.f10549r;
                                            ArrayList arrayList2 = j5Var22.h;
                                            int i11 = j5Var22.d;
                                            ArrayList arrayList3 = j5Var22.f10539g;
                                            TL_stories.StoryItem storyItem2 = j5Var22.f10535b;
                                            if (iArr2[0] != j5Var22.f10546o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " localId != reqId");
                                                return;
                                            }
                                            j5Var22.f10537e = false;
                                            j5Var22.f10546o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = hp.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                hp.s1(i11).Y3(storyViewsList.users, false);
                                                hp.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                qr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (j5Var22.f10543l) {
                                                    j5Var22.f10543l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        j5Var22.f10547p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (j5Var22.f10548q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    j5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    j5Var22.f10544m = true;
                                                } else {
                                                    j5Var22.f10544m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                j5Var22.f10545n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    j5Var22.f10544m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = a1.g.h(i15, 1, storyViewsList.users.get(i15).f27150id, storyItem2.views.recent_viewers)) {
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
                                                    hs.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    j5Var22.f10534a = 0;
                                                }
                                                j5Var22.f10544m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " response  totalItems " + arrayList3.size() + " has next " + j5Var22.f10544m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((k5) arrayList.get(i18)).e(j5Var22);
                                            }
                                            if (arrayList3.size() < 20 && j5Var22.f10544m) {
                                                j5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            j5 j5Var3 = j5Var;
                                            ArrayList arrayList4 = j5Var3.f10549r;
                                            TL_stories.StoryItem storyItem3 = j5Var3.f10535b;
                                            int i19 = j5Var3.d;
                                            ArrayList arrayList5 = j5Var3.f10540i;
                                            if (iArr2[0] != j5Var3.f10546o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " localId != reqId");
                                                return;
                                            }
                                            j5Var3.f10537e = false;
                                            j5Var3.f10546o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                hp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                hp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                qr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (j5Var3.f10543l) {
                                                    j5Var3.f10543l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        j5Var3.f10547p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    j5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    j5Var3.f10544m = true;
                                                } else {
                                                    j5Var3.f10544m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                j5Var3.f10545n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    j5Var3.f10544m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = j5Var3.f10534a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                j5Var3.f10534a = i22;
                                                if (z13) {
                                                    hs.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    j5Var3.f10534a = 0;
                                                }
                                                j5Var3.f10544m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " response  totalItems " + arrayList5.size() + " has next " + j5Var3.f10544m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((k5) arrayList4.get(i23)).e(j5Var3);
                                            }
                                            if (arrayList5.size() < 20 && j5Var3.f10544m) {
                                                j5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final j5 j5Var2 = this.f10368b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            j5 j5Var22 = j5Var2;
                                            ArrayList arrayList = j5Var22.f10549r;
                                            ArrayList arrayList2 = j5Var22.h;
                                            int i11 = j5Var22.d;
                                            ArrayList arrayList3 = j5Var22.f10539g;
                                            TL_stories.StoryItem storyItem2 = j5Var22.f10535b;
                                            if (iArr22[0] != j5Var22.f10546o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " localId != reqId");
                                                return;
                                            }
                                            j5Var22.f10537e = false;
                                            j5Var22.f10546o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = hp.s1(i11).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                hp.s1(i11).Y3(storyViewsList.users, false);
                                                hp.s1(i11).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                qr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (j5Var22.f10543l) {
                                                    j5Var22.f10543l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        j5Var22.f10547p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (j5Var22.f10548q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    j5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    j5Var22.f10544m = true;
                                                } else {
                                                    j5Var22.f10544m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                j5Var22.f10545n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    j5Var22.f10544m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = a1.g.h(i15, 1, storyViewsList.users.get(i15).f27150id, storyItem2.views.recent_viewers)) {
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
                                                    hs.f(i11).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    j5Var22.f10534a = 0;
                                                }
                                                j5Var22.f10544m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f27240id + " response  totalItems " + arrayList3.size() + " has next " + j5Var22.f10544m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((k5) arrayList.get(i18)).e(j5Var22);
                                            }
                                            if (arrayList3.size() < 20 && j5Var22.f10544m) {
                                                j5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            j5 j5Var3 = j5Var2;
                                            ArrayList arrayList4 = j5Var3.f10549r;
                                            TL_stories.StoryItem storyItem3 = j5Var3.f10535b;
                                            int i19 = j5Var3.d;
                                            ArrayList arrayList5 = j5Var3.f10540i;
                                            if (iArr22[0] != j5Var3.f10546o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " localId != reqId");
                                                return;
                                            }
                                            j5Var3.f10537e = false;
                                            j5Var3.f10546o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                hp.s1(i19).Y3(tL_storyReactionsList.users, false);
                                                hp.s1(i19).S3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                qr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (j5Var3.f10543l) {
                                                    j5Var3.f10543l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        j5Var3.f10547p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    j5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    j5Var3.f10544m = true;
                                                } else {
                                                    j5Var3.f10544m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                j5Var3.f10545n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    j5Var3.f10544m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = j5Var3.f10534a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                j5Var3.f10534a = i22;
                                                if (z13) {
                                                    hs.f(i19).k(324, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    j5Var3.f10534a = 0;
                                                }
                                                j5Var3.f10544m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f27240id + " response  totalItems " + arrayList5.size() + " has next " + j5Var3.f10544m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((k5) arrayList4.get(i23)).e(j5Var3);
                                            }
                                            if (arrayList5.size() < 20 && j5Var3.f10544m) {
                                                j5Var3.c();
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
            this.f10546o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f10546o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f10546o, false);
        }
        this.f10546o = -1;
    }

    public final void e(w4 w4Var, boolean z10, boolean z11) {
        w4 w4Var2 = new w4();
        w4Var2.f11180a = w4Var.f11180a;
        w4Var2.f11181b = w4Var.f11181b;
        w4Var2.f11182c = w4Var.f11182c;
        int i3 = 0;
        if (!z10) {
            w4Var2.f11181b = false;
        }
        if (!z11) {
            w4Var2.f11180a = true;
        }
        w4 w4Var3 = this.f10550s;
        if (!w4Var3.equals(w4Var2)) {
            w4Var3.f11180a = w4Var2.f11180a;
            w4Var3.f11181b = w4Var2.f11181b;
            w4Var3.f11182c = w4Var2.f11182c;
            if (!this.f10538f && this.f10548q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f10549r;
                    if (i3 < arrayList.size()) {
                        ((k5) arrayList.get(i3)).e(this);
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f10539g.clear();
                this.f10540i.clear();
                this.f10543l = true;
                this.f10537e = false;
                this.f10544m = true;
                this.f10545n = "";
                c();
            }
        }
    }
}
