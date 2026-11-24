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
public final class h2a {
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
    public final v1a s = new v1a();

    public h2a(int i, long j, TL_stories.StoryItem storyItem) {
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
        if (y4b.v(storyItem) && !z8c.h(i).p()) {
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
                    if (oc7.r1(i).W1(l) != null) {
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
            v1a v1aVar = this.s;
            boolean z2 = v1aVar.b;
            ArrayList arrayList2 = this.h;
            if (!z2 && TextUtils.isEmpty(v1aVar.c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(v1aVar.c)) {
                    str = v1aVar.c.trim().toLowerCase();
                    str2 = jb6.D0().S0(str, true, false);
                    str4 = b10.h(" ", str);
                    str3 = b10.h(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    TLRPC.User W1 = oc7.r1(this.d).W1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i)).user_id));
                    if (v1aVar.b && (W1 == null || !W1.contact)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && str != null) {
                        String lowerCase = bw2.m(0, W1.first_name, W1.last_name).toLowerCase();
                        String p = m9c.p(W1);
                        String I3 = gm.I3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !I3.startsWith(str2) && !I3.contains(str3) && (p == null || (!p.startsWith(str2) && !p.contains(str3)))) {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i));
                    }
                }
            }
            if (!v1aVar.a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new mn((byte) 13)));
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
            v1a v1aVar = this.s;
            int i2 = this.d;
            TL_stories.StoryItem storyItem = this.b;
            if (z) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = v1aVar.a;
                tL_getStoryReactionsList.id = storyItem.id;
                tL_getStoryReactionsList.peer = oc7.r1(i2).i1(j);
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
                fc4.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final h2a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final h2a h2aVar = this.b;
                                final int[] iArr = r2;
                                gm.c3(new Runnable() {
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
                                        h2a h2aVar2 = h2aVar;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = h2aVar2.r;
                                                ArrayList arrayList2 = h2aVar2.h;
                                                int i4 = h2aVar2.d;
                                                TL_stories.StoryItem storyItem3 = h2aVar2.b;
                                                ArrayList arrayList3 = h2aVar2.g;
                                                if (iArr2[0] != h2aVar2.o) {
                                                    fc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                    return;
                                                }
                                                h2aVar2.e = false;
                                                h2aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vh6 vh6Var = oc7.r1(i4).N1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i5 = 0;
                                                        while (i5 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vh6Var.d(storyView.user_id)) {
                                                                vh6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i5++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    oc7.r1(i4).d4(storyViewsList.users, false);
                                                    oc7.r1(i4).X3(storyViewsList.chats, false);
                                                    cf7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (h2aVar2.l) {
                                                        h2aVar2.l = false;
                                                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                            h2aVar2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z6 = h2aVar2.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z6) {
                                                        arrayList2.addAll(arrayList4);
                                                        h2aVar2.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        h2aVar2.m = true;
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                        h2aVar2.m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    h2aVar2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        h2aVar2.m = z2;
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
                                                                i7 = mle.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
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
                                                        nm7.f(i4).k(329, new Object[0]);
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        h2aVar2.a = 0;
                                                    }
                                                    h2aVar2.m = false;
                                                }
                                                fc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + h2aVar2.m);
                                                for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                    ((i2a) arrayList.get(i10)).c(h2aVar2);
                                                }
                                                if (arrayList3.size() < 20 && h2aVar2.m) {
                                                    h2aVar2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList5 = h2aVar2.r;
                                                TL_stories.StoryItem storyItem5 = h2aVar2.b;
                                                int i11 = h2aVar2.d;
                                                ArrayList arrayList6 = h2aVar2.i;
                                                if (iArr2[0] != h2aVar2.o) {
                                                    fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                    return;
                                                }
                                                h2aVar2.e = false;
                                                h2aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    oc7.r1(i11).d4(tL_storyReactionsList.users, false);
                                                    oc7.r1(i11).X3(tL_storyReactionsList.chats, false);
                                                    cf7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (h2aVar2.l) {
                                                        h2aVar2.l = false;
                                                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                            h2aVar2.p.add(Long.valueOf(pg3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        h2aVar2.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        h2aVar2.m = true;
                                                    } else {
                                                        h2aVar2.m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    h2aVar2.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        h2aVar2.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i13 = h2aVar2.a;
                                                    int i14 = tL_storyReactionsList.count;
                                                    if (i13 != i14) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    h2aVar2.a = i14;
                                                    if (z5) {
                                                        nm7.f(i11).k(329, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        h2aVar2.a = 0;
                                                    }
                                                    h2aVar2.m = false;
                                                }
                                                fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + h2aVar2.m);
                                                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                    ((i2a) arrayList5.get(i15)).c(h2aVar2);
                                                }
                                                if (arrayList6.size() < 20 && h2aVar2.m) {
                                                    h2aVar2.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final h2a h2aVar2 = this.b;
                                final int[] iArr2 = r2;
                                gm.c3(new Runnable() {
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
                                        h2a h2aVar22 = h2aVar2;
                                        switch (b) {
                                            case 0:
                                                ArrayList arrayList = h2aVar22.r;
                                                ArrayList arrayList2 = h2aVar22.h;
                                                int i4 = h2aVar22.d;
                                                TL_stories.StoryItem storyItem3 = h2aVar22.b;
                                                ArrayList arrayList3 = h2aVar22.g;
                                                if (iArr22[0] != h2aVar22.o) {
                                                    fc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                    return;
                                                }
                                                h2aVar22.e = false;
                                                h2aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vh6 vh6Var = oc7.r1(i4).N1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i5 = 0;
                                                        while (i5 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vh6Var.d(storyView.user_id)) {
                                                                vh6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i5++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    oc7.r1(i4).d4(storyViewsList.users, false);
                                                    oc7.r1(i4).X3(storyViewsList.chats, false);
                                                    cf7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (h2aVar22.l) {
                                                        h2aVar22.l = false;
                                                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                            h2aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z6 = h2aVar22.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z6) {
                                                        arrayList2.addAll(arrayList4);
                                                        h2aVar22.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        h2aVar22.m = true;
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                        h2aVar22.m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    h2aVar22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        h2aVar22.m = z2;
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
                                                                i7 = mle.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
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
                                                        nm7.f(i4).k(329, new Object[0]);
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        h2aVar22.a = 0;
                                                    }
                                                    h2aVar22.m = false;
                                                }
                                                fc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + h2aVar22.m);
                                                for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                    ((i2a) arrayList.get(i10)).c(h2aVar22);
                                                }
                                                if (arrayList3.size() < 20 && h2aVar22.m) {
                                                    h2aVar22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ArrayList arrayList5 = h2aVar22.r;
                                                TL_stories.StoryItem storyItem5 = h2aVar22.b;
                                                int i11 = h2aVar22.d;
                                                ArrayList arrayList6 = h2aVar22.i;
                                                if (iArr22[0] != h2aVar22.o) {
                                                    fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                    return;
                                                }
                                                h2aVar22.e = false;
                                                h2aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    oc7.r1(i11).d4(tL_storyReactionsList.users, false);
                                                    oc7.r1(i11).X3(tL_storyReactionsList.chats, false);
                                                    cf7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (h2aVar22.l) {
                                                        h2aVar22.l = false;
                                                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                            h2aVar22.p.add(Long.valueOf(pg3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        h2aVar22.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        h2aVar22.m = true;
                                                    } else {
                                                        h2aVar22.m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    h2aVar22.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        h2aVar22.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i13 = h2aVar22.a;
                                                    int i14 = tL_storyReactionsList.count;
                                                    if (i13 != i14) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    h2aVar22.a = i14;
                                                    if (z5) {
                                                        nm7.f(i11).k(329, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        h2aVar22.a = 0;
                                                    }
                                                    h2aVar22.m = false;
                                                }
                                                fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + h2aVar22.m);
                                                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                    ((i2a) arrayList5.get(i15)).c(h2aVar22);
                                                }
                                                if (arrayList6.size() < 20 && h2aVar22.m) {
                                                    h2aVar22.c();
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
            tL_stories_getStoryViewsList.peer = oc7.r1(i2).i1(j);
            if (this.q) {
                tL_stories_getStoryViewsList.q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = v1aVar.c;
                tL_stories_getStoryViewsList.q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = v1aVar.b;
                tL_stories_getStoryViewsList.reactions_first = v1aVar.a;
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
            fc4.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final h2a b;

                {
                    this.b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final h2a h2aVar = this.b;
                            final int[] iArr2 = r2;
                            gm.c3(new Runnable() {
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
                                    h2a h2aVar22 = h2aVar;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = h2aVar22.r;
                                            ArrayList arrayList2 = h2aVar22.h;
                                            int i4 = h2aVar22.d;
                                            TL_stories.StoryItem storyItem3 = h2aVar22.b;
                                            ArrayList arrayList3 = h2aVar22.g;
                                            if (iArr22[0] != h2aVar22.o) {
                                                fc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                return;
                                            }
                                            h2aVar22.e = false;
                                            h2aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vh6 vh6Var = oc7.r1(i4).N1().M;
                                                if (storyViewsList.views != null) {
                                                    int i5 = 0;
                                                    while (i5 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vh6Var.d(storyView.user_id)) {
                                                            vh6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i5++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                oc7.r1(i4).d4(storyViewsList.users, false);
                                                oc7.r1(i4).X3(storyViewsList.chats, false);
                                                cf7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (h2aVar22.l) {
                                                    h2aVar22.l = false;
                                                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                        h2aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z6 = h2aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z6) {
                                                    arrayList2.addAll(arrayList4);
                                                    h2aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    h2aVar22.m = true;
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                    h2aVar22.m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                h2aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    h2aVar22.m = z2;
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
                                                            i7 = mle.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
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
                                                    nm7.f(i4).k(329, new Object[0]);
                                                } else {
                                                    i3 = 0;
                                                }
                                            } else {
                                                i3 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    h2aVar22.a = 0;
                                                }
                                                h2aVar22.m = false;
                                            }
                                            fc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + h2aVar22.m);
                                            for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                ((i2a) arrayList.get(i10)).c(h2aVar22);
                                            }
                                            if (arrayList3.size() < 20 && h2aVar22.m) {
                                                h2aVar22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = h2aVar22.r;
                                            TL_stories.StoryItem storyItem5 = h2aVar22.b;
                                            int i11 = h2aVar22.d;
                                            ArrayList arrayList6 = h2aVar22.i;
                                            if (iArr22[0] != h2aVar22.o) {
                                                fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                return;
                                            }
                                            h2aVar22.e = false;
                                            h2aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                oc7.r1(i11).d4(tL_storyReactionsList.users, false);
                                                oc7.r1(i11).X3(tL_storyReactionsList.chats, false);
                                                cf7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (h2aVar22.l) {
                                                    h2aVar22.l = false;
                                                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                        h2aVar22.p.add(Long.valueOf(pg3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    h2aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    h2aVar22.m = true;
                                                } else {
                                                    h2aVar22.m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                h2aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    h2aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i13 = h2aVar22.a;
                                                int i14 = tL_storyReactionsList.count;
                                                if (i13 != i14) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                h2aVar22.a = i14;
                                                if (z5) {
                                                    nm7.f(i11).k(329, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    h2aVar22.a = 0;
                                                }
                                                h2aVar22.m = false;
                                            }
                                            fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + h2aVar22.m);
                                            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                ((i2a) arrayList5.get(i15)).c(h2aVar22);
                                            }
                                            if (arrayList6.size() < 20 && h2aVar22.m) {
                                                h2aVar22.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final h2a h2aVar2 = this.b;
                            final int[] iArr22 = r2;
                            gm.c3(new Runnable() {
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
                                    h2a h2aVar22 = h2aVar2;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = h2aVar22.r;
                                            ArrayList arrayList2 = h2aVar22.h;
                                            int i4 = h2aVar22.d;
                                            TL_stories.StoryItem storyItem3 = h2aVar22.b;
                                            ArrayList arrayList3 = h2aVar22.g;
                                            if (iArr222[0] != h2aVar22.o) {
                                                fc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                return;
                                            }
                                            h2aVar22.e = false;
                                            h2aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vh6 vh6Var = oc7.r1(i4).N1().M;
                                                if (storyViewsList.views != null) {
                                                    int i5 = 0;
                                                    while (i5 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i5);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vh6Var.d(storyView.user_id)) {
                                                            vh6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i5++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                oc7.r1(i4).d4(storyViewsList.users, false);
                                                oc7.r1(i4).X3(storyViewsList.chats, false);
                                                cf7.Y(i4).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (h2aVar22.l) {
                                                    h2aVar22.l = false;
                                                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                                                        h2aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i6)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z6 = h2aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z6) {
                                                    arrayList2.addAll(arrayList4);
                                                    h2aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    h2aVar22.m = true;
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                    h2aVar22.m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                h2aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    h2aVar22.m = z2;
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
                                                            i7 = mle.c(i7, 1, storyViewsList.users.get(i7).id, storyViews2.recent_viewers);
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
                                                    nm7.f(i4).k(329, new Object[0]);
                                                } else {
                                                    i3 = 0;
                                                }
                                            } else {
                                                i3 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    h2aVar22.a = 0;
                                                }
                                                h2aVar22.m = false;
                                            }
                                            fc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + h2aVar22.m);
                                            for (int i10 = i3; i10 < arrayList.size(); i10++) {
                                                ((i2a) arrayList.get(i10)).c(h2aVar22);
                                            }
                                            if (arrayList3.size() < 20 && h2aVar22.m) {
                                                h2aVar22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = h2aVar22.r;
                                            TL_stories.StoryItem storyItem5 = h2aVar22.b;
                                            int i11 = h2aVar22.d;
                                            ArrayList arrayList6 = h2aVar22.i;
                                            if (iArr222[0] != h2aVar22.o) {
                                                fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                return;
                                            }
                                            h2aVar22.e = false;
                                            h2aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                oc7.r1(i11).d4(tL_storyReactionsList.users, false);
                                                oc7.r1(i11).X3(tL_storyReactionsList.chats, false);
                                                cf7.Y(i11).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (h2aVar22.l) {
                                                    h2aVar22.l = false;
                                                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                                        h2aVar22.p.add(Long.valueOf(pg3.n(((TL_stories.StoryReaction) arrayList6.get(i12)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    h2aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    h2aVar22.m = true;
                                                } else {
                                                    h2aVar22.m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                h2aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    h2aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i13 = h2aVar22.a;
                                                int i14 = tL_storyReactionsList.count;
                                                if (i13 != i14) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                h2aVar22.a = i14;
                                                if (z5) {
                                                    nm7.f(i11).k(329, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    h2aVar22.a = 0;
                                                }
                                                h2aVar22.m = false;
                                            }
                                            fc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + h2aVar22.m);
                                            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                                                ((i2a) arrayList5.get(i15)).c(h2aVar22);
                                            }
                                            if (arrayList6.size() < 20 && h2aVar22.m) {
                                                h2aVar22.c();
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

    public final void e(v1a v1aVar, boolean z, boolean z2) {
        v1a v1aVar2 = new v1a();
        v1aVar2.a = v1aVar.a;
        v1aVar2.b = v1aVar.b;
        v1aVar2.c = v1aVar.c;
        int i = 0;
        if (!z) {
            v1aVar2.b = false;
        }
        if (!z2) {
            v1aVar2.a = true;
        }
        v1a v1aVar3 = this.s;
        if (!v1aVar3.equals(v1aVar2)) {
            v1aVar3.a = v1aVar2.a;
            v1aVar3.b = v1aVar2.b;
            v1aVar3.c = v1aVar2.c;
            if (!this.f && this.q) {
                a();
                while (true) {
                    ArrayList arrayList = this.r;
                    if (i < arrayList.size()) {
                        ((i2a) arrayList.get(i)).c(this);
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
