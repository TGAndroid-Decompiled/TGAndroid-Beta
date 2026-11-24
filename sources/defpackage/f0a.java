package defpackage;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f0a {
    public int a;
    public final TL_stories.StoryItem b;
    public final long c;
    public final int d;
    public boolean e;
    public final boolean f;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public String n;
    public final boolean q;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public boolean m = true;
    public int o = -1;
    public final HashSet p = new HashSet();
    public final ArrayList r = new ArrayList();
    public final tz9 s = new tz9();

    public f0a(int i, long j, TL_stories.StoryItem storyItem) {
        boolean z;
        int i2;
        boolean z2;
        TL_stories.StoryViews storyViews;
        this.d = i;
        this.b = storyItem;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.c = j;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i2 = 0;
        } else {
            i2 = storyViews2.views_count;
        }
        this.a = i2;
        if (i2 < 200) {
            this.q = true;
        }
        if (x2b.v(storyItem) && !y6c.h(i).p()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.j = z2;
        if (z2 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.j = false;
            this.k = true;
            z2 = false;
        }
        if (!z2) {
            this.l = true;
            if (storyItem.views != null) {
                for (int i3 = 0; i3 < storyItem.views.recent_viewers.size(); i3++) {
                    Long l = storyItem.views.recent_viewers.get(i3);
                    long longValue = l.longValue();
                    if (na7.q1(i).V1(l) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.g.add(tL_storyView);
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
        boolean z;
        if (!this.f) {
            ArrayList arrayList = this.g;
            arrayList.clear();
            tz9 tz9Var = this.s;
            boolean z2 = tz9Var.b;
            ArrayList arrayList2 = this.h;
            if (!z2 && TextUtils.isEmpty(tz9Var.c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(tz9Var.c)) {
                    str = tz9Var.c.trim().toLowerCase();
                    str2 = k96.D0().S0(str, true, false);
                    str4 = b00.h(" ", str);
                    str3 = b00.h(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    TLRPC.User V1 = na7.q1(this.d).V1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i)).user_id));
                    if (tz9Var.b && (V1 == null || !V1.contact)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && str != null) {
                        String lowerCase = qu2.m(0, V1.first_name, V1.last_name).toLowerCase();
                        String p = l7c.p(V1);
                        String I3 = gl.I3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !I3.startsWith(str2) && !I3.contains(str3) && (p == null || (!p.startsWith(str2) && !p.contains(str3)))) {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i));
                    }
                }
            }
            if (!tz9Var.a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 13)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f) {
            arrayList = this.i;
        } else {
            arrayList = this.g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.e && this.m && !this.j) {
            boolean z = this.f;
            int i = 100;
            long j = this.c;
            tz9 tz9Var = this.s;
            int i2 = this.d;
            TL_stories.StoryItem storyItem = this.b;
            if (z) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = tz9Var.a;
                tL_getStoryReactionsList.id = storyItem.id;
                tL_getStoryReactionsList.peer = na7.q1(i2).h1(j);
                if (this.l || this.i.size() < 20) {
                    i = 20;
                }
                tL_getStoryReactionsList.limit = i;
                String str = this.n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.e = true;
                fa4.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final f0a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final f0a f0aVar = this.b;
                                final int[] iArr = r2;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3;
                                        TL_stories.StoryItem storyItem2;
                                        boolean z2;
                                        boolean z3;
                                        boolean z4;
                                        boolean z5;
                                        byte b = r5;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        TLObject tLObject2 = tLObject;
                                        int[] iArr2 = iArr;
                                        f0a f0aVar2 = f0aVar;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = f0aVar2.r;
                                                ArrayList arrayList2 = f0aVar2.h;
                                                int i4 = f0aVar2.d;
                                                TL_stories.StoryItem storyItem3 = f0aVar2.b;
                                                ArrayList arrayList3 = f0aVar2.g;
                                                if (iArr2[0] != f0aVar2.o) {
                                                    fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                    return;
                                                }
                                                f0aVar2.e = false;
                                                f0aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vf6 vf6Var = na7.q1(i4).M1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i5 = 0;
                                                        while (i5 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vf6Var.d(storyView.user_id)) {
                                                                vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i5++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    na7.q1(i4).b4(storyViewsList.users, false);
                                                    na7.q1(i4).V3(storyViewsList.chats, false);
                                                    ad7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f0aVar2.l) {
                                                        f0aVar2.l = false;
                                                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                            f0aVar2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z6 = f0aVar2.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z6) {
                                                        arrayList2.addAll(arrayList4);
                                                        f0aVar2.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        f0aVar2.m = true;
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                        f0aVar2.m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f0aVar2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f0aVar2.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i7 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i7 < min) {
                                                                i7 = mue.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i8 = storyViews.reactions_count;
                                                    int i9 = storyViewsList.reactions_count;
                                                    if (i8 != i9) {
                                                        storyViews.reactions_count = i9;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i3 = 0;
                                                        kk7.f(i4).k(327, new Object[0]);
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar2.a = 0;
                                                    }
                                                    f0aVar2.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar2.m);
                                                for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                    ((g0a) arrayList.get(i10)).c(f0aVar2);
                                                }
                                                if (arrayList3.size() < 20 && f0aVar2.m) {
                                                    f0aVar2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList5 = f0aVar2.r;
                                                TL_stories.StoryItem storyItem5 = f0aVar2.b;
                                                int i11 = f0aVar2.d;
                                                ArrayList arrayList6 = f0aVar2.i;
                                                if (iArr2[0] != f0aVar2.o) {
                                                    fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                    return;
                                                }
                                                f0aVar2.e = false;
                                                f0aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    na7.q1(i11).b4(tL_storyReactionsList.users, false);
                                                    na7.q1(i11).V3(tL_storyReactionsList.chats, false);
                                                    ad7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f0aVar2.l) {
                                                        f0aVar2.l = false;
                                                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                            f0aVar2.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        f0aVar2.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        f0aVar2.m = true;
                                                    } else {
                                                        f0aVar2.m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f0aVar2.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f0aVar2.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i13 = f0aVar2.a;
                                                    int i14 = tL_storyReactionsList.count;
                                                    if (i13 != i14) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    f0aVar2.a = i14;
                                                    if (z5) {
                                                        kk7.f(i11).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar2.a = 0;
                                                    }
                                                    f0aVar2.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar2.m);
                                                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                    ((g0a) arrayList5.get(i15)).c(f0aVar2);
                                                }
                                                if (arrayList6.size() < 20 && f0aVar2.m) {
                                                    f0aVar2.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final f0a f0aVar2 = this.b;
                                final int[] iArr2 = r2;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i3;
                                        TL_stories.StoryItem storyItem2;
                                        boolean z2;
                                        boolean z3;
                                        boolean z4;
                                        boolean z5;
                                        byte b = r5;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        TLObject tLObject2 = tLObject;
                                        int[] iArr22 = iArr2;
                                        f0a f0aVar22 = f0aVar2;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = f0aVar22.r;
                                                ArrayList arrayList2 = f0aVar22.h;
                                                int i4 = f0aVar22.d;
                                                TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                                ArrayList arrayList3 = f0aVar22.g;
                                                if (iArr22[0] != f0aVar22.o) {
                                                    fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                    return;
                                                }
                                                f0aVar22.e = false;
                                                f0aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vf6 vf6Var = na7.q1(i4).M1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i5 = 0;
                                                        while (i5 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vf6Var.d(storyView.user_id)) {
                                                                vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i5++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    na7.q1(i4).b4(storyViewsList.users, false);
                                                    na7.q1(i4).V3(storyViewsList.chats, false);
                                                    ad7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f0aVar22.l) {
                                                        f0aVar22.l = false;
                                                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                            f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z6 = f0aVar22.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z6) {
                                                        arrayList2.addAll(arrayList4);
                                                        f0aVar22.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        f0aVar22.m = true;
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                        f0aVar22.m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f0aVar22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f0aVar22.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i7 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i7 < min) {
                                                                i7 = mue.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i8 = storyViews.reactions_count;
                                                    int i9 = storyViewsList.reactions_count;
                                                    if (i8 != i9) {
                                                        storyViews.reactions_count = i9;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i3 = 0;
                                                        kk7.f(i4).k(327, new Object[0]);
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar22.a = 0;
                                                    }
                                                    f0aVar22.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                                for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                    ((g0a) arrayList.get(i10)).c(f0aVar22);
                                                }
                                                if (arrayList3.size() < 20 && f0aVar22.m) {
                                                    f0aVar22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList5 = f0aVar22.r;
                                                TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                                int i11 = f0aVar22.d;
                                                ArrayList arrayList6 = f0aVar22.i;
                                                if (iArr22[0] != f0aVar22.o) {
                                                    fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                    return;
                                                }
                                                f0aVar22.e = false;
                                                f0aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    na7.q1(i11).b4(tL_storyReactionsList.users, false);
                                                    na7.q1(i11).V3(tL_storyReactionsList.chats, false);
                                                    ad7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f0aVar22.l) {
                                                        f0aVar22.l = false;
                                                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                            f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        f0aVar22.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        f0aVar22.m = true;
                                                    } else {
                                                        f0aVar22.m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f0aVar22.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f0aVar22.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i13 = f0aVar22.a;
                                                    int i14 = tL_storyReactionsList.count;
                                                    if (i13 != i14) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    f0aVar22.a = i14;
                                                    if (z5) {
                                                        kk7.f(i11).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar22.a = 0;
                                                    }
                                                    f0aVar22.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                    ((g0a) arrayList5.get(i15)).c(f0aVar22);
                                                }
                                                if (arrayList6.size() < 20 && f0aVar22.m) {
                                                    f0aVar22.c();
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
                this.o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.id = storyItem.id;
            tL_stories_getStoryViewsList.peer = na7.q1(i2).h1(j);
            if (this.q) {
                tL_stories_getStoryViewsList.q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = tz9Var.c;
                tL_stories_getStoryViewsList.q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = tz9Var.b;
                tL_stories_getStoryViewsList.reactions_first = tz9Var.a;
            }
            if (this.l || this.g.size() < 20) {
                i = 20;
            }
            tL_stories_getStoryViewsList.limit = i;
            String str3 = this.n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.e = true;
            fa4.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final f0a b;

                {
                    this.b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final f0a f0aVar = this.b;
                            final int[] iArr2 = r2;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    int i3;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    boolean z5;
                                    byte b = r5;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr22 = iArr2;
                                    f0a f0aVar22 = f0aVar;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = f0aVar22.r;
                                            ArrayList arrayList2 = f0aVar22.h;
                                            int i4 = f0aVar22.d;
                                            TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                            ArrayList arrayList3 = f0aVar22.g;
                                            if (iArr22[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                return;
                                            }
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vf6 vf6Var = na7.q1(i4).M1().M;
                                                if (storyViewsList.views != null) {
                                                    int i5 = 0;
                                                    while (i5 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vf6Var.d(storyView.user_id)) {
                                                            vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i5++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                na7.q1(i4).b4(storyViewsList.users, false);
                                                na7.q1(i4).V3(storyViewsList.chats, false);
                                                ad7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                        f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z6 = f0aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z6) {
                                                    arrayList2.addAll(arrayList4);
                                                    f0aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    f0aVar22.m = true;
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                    f0aVar22.m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f0aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f0aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i7 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i7 < min) {
                                                            i7 = mue.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i8 = storyViews.reactions_count;
                                                int i9 = storyViewsList.reactions_count;
                                                if (i8 != i9) {
                                                    storyViews.reactions_count = i9;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i3 = 0;
                                                    kk7.f(i4).k(327, new Object[0]);
                                                } else {
                                                    i3 = 0;
                                                }
                                            } else {
                                                i3 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                            for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                ((g0a) arrayList.get(i10)).c(f0aVar22);
                                            }
                                            if (arrayList3.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = f0aVar22.r;
                                            TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                            int i11 = f0aVar22.d;
                                            ArrayList arrayList6 = f0aVar22.i;
                                            if (iArr22[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                return;
                                            }
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                na7.q1(i11).b4(tL_storyReactionsList.users, false);
                                                na7.q1(i11).V3(tL_storyReactionsList.chats, false);
                                                ad7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                        f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    f0aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    f0aVar22.m = true;
                                                } else {
                                                    f0aVar22.m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f0aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f0aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i13 = f0aVar22.a;
                                                int i14 = tL_storyReactionsList.count;
                                                if (i13 != i14) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                f0aVar22.a = i14;
                                                if (z5) {
                                                    kk7.f(i11).k(327, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                ((g0a) arrayList5.get(i15)).c(f0aVar22);
                                            }
                                            if (arrayList6.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final f0a f0aVar2 = this.b;
                            final int[] iArr22 = r2;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    int i3;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    boolean z5;
                                    byte b = r5;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr222 = iArr22;
                                    f0a f0aVar22 = f0aVar2;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = f0aVar22.r;
                                            ArrayList arrayList2 = f0aVar22.h;
                                            int i4 = f0aVar22.d;
                                            TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                            ArrayList arrayList3 = f0aVar22.g;
                                            if (iArr222[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                return;
                                            }
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vf6 vf6Var = na7.q1(i4).M1().M;
                                                if (storyViewsList.views != null) {
                                                    int i5 = 0;
                                                    while (i5 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vf6Var.d(storyView.user_id)) {
                                                            vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i5++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                na7.q1(i4).b4(storyViewsList.users, false);
                                                na7.q1(i4).V3(storyViewsList.chats, false);
                                                ad7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                        f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z6 = f0aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z6) {
                                                    arrayList2.addAll(arrayList4);
                                                    f0aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    f0aVar22.m = true;
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                    f0aVar22.m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f0aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f0aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i7 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i7 < min) {
                                                            i7 = mue.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i8 = storyViews.reactions_count;
                                                int i9 = storyViewsList.reactions_count;
                                                if (i8 != i9) {
                                                    storyViews.reactions_count = i9;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i3 = 0;
                                                    kk7.f(i4).k(327, new Object[0]);
                                                } else {
                                                    i3 = 0;
                                                }
                                            } else {
                                                i3 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                            for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                ((g0a) arrayList.get(i10)).c(f0aVar22);
                                            }
                                            if (arrayList3.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = f0aVar22.r;
                                            TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                            int i11 = f0aVar22.d;
                                            ArrayList arrayList6 = f0aVar22.i;
                                            if (iArr222[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                return;
                                            }
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                na7.q1(i11).b4(tL_storyReactionsList.users, false);
                                                na7.q1(i11).V3(tL_storyReactionsList.chats, false);
                                                ad7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                        f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    f0aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    f0aVar22.m = true;
                                                } else {
                                                    f0aVar22.m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f0aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f0aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i13 = f0aVar22.a;
                                                int i14 = tL_storyReactionsList.count;
                                                if (i13 != i14) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                f0aVar22.a = i14;
                                                if (z5) {
                                                    kk7.f(i11).k(327, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                ((g0a) arrayList5.get(i15)).c(f0aVar22);
                                            }
                                            if (arrayList6.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
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
            this.o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.o, false);
        }
        this.o = -1;
    }

    public final void e(tz9 tz9Var, boolean z, boolean z2) {
        tz9 tz9Var2 = new tz9();
        tz9Var2.a = tz9Var.a;
        tz9Var2.b = tz9Var.b;
        tz9Var2.c = tz9Var.c;
        int i = 0;
        if (!z) {
            tz9Var2.b = false;
        }
        if (!z2) {
            tz9Var2.a = true;
        }
        tz9 tz9Var3 = this.s;
        if (!tz9Var3.equals(tz9Var2)) {
            tz9Var3.a = tz9Var2.a;
            tz9Var3.b = tz9Var2.b;
            tz9Var3.c = tz9Var2.c;
            if (!this.f && this.q) {
                a();
                while (true) {
                    ArrayList arrayList = this.r;
                    if (i < arrayList.size()) {
                        ((g0a) arrayList.get(i)).c(this);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.g.clear();
                this.i.clear();
                this.l = true;
                this.e = false;
                this.m = true;
                this.n = "";
                c();
            }
        }
    }
}
