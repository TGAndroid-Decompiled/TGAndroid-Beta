package fi;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 {
    public int f12903a;
    public final TL_stories.StoryItem f12904b;
    public final long f12905c;
    public final int d;
    public boolean f12906e;
    public final boolean f12907f;
    public final boolean f12910j;
    public final boolean f12911k;
    public boolean f12912l;
    public String f12914n;
    public final boolean f12917q;
    public final ArrayList f12908g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f12909i = new ArrayList();
    public boolean f12913m = true;
    public int f12915o = -1;
    public final HashSet f12916p = new HashSet();
    public final ArrayList f12918r = new ArrayList();
    public final m4 f12919s = new m4();

    public z4(int i7, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i10;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i7;
        this.f12904b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12907f = z10;
        this.f12905c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f12903a = i10;
        if (i10 < 200) {
            this.f12917q = true;
        }
        if (i7.v(storyItem) && !j10.i(i7).q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12910j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f12910j = false;
            this.f12911k = true;
        }
        if (!this.f12910j) {
            this.f12912l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (mp.u1(i7).c2(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f12908g.add(tL_storyView);
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
        if (!this.f12907f) {
            ArrayList arrayList = this.f12908g;
            arrayList.clear();
            m4 m4Var = this.f12919s;
            boolean z11 = m4Var.f12268b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(m4Var.f12269c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(m4Var.f12269c)) {
                    str = m4Var.f12269c.trim().toLowerCase();
                    str2 = gd.E0().S0(str, true, false);
                    str4 = p5.c.k(" ", str);
                    str3 = p5.c.k(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    TLRPC.User c22 = mp.u1(this.d).c2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i7)).user_id));
                    if (m4Var.f12268b && (c22 == null || !c22.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                        String o4 = o10.o(c22);
                        String M3 = org.telegram.messenger.g0.M3(lowerCase);
                        if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !M3.startsWith(str2) && !M3.contains(str3) && (o4 == null || (!o4.startsWith(str2) && !o4.contains(str3)))) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i7));
                    }
                }
            }
            if (!m4Var.f12267a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f12907f) {
            arrayList = this.f12909i;
        } else {
            arrayList = this.f12908g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f12906e && this.f12913m && !this.f12910j) {
            boolean z10 = this.f12907f;
            int i7 = 100;
            long j3 = this.f12905c;
            m4 m4Var = this.f12919s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f12904b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = m4Var.f12267a;
                tL_getStoryReactionsList.f28645id = storyItem.f28644id;
                tL_getStoryReactionsList.peer = mp.u1(i10).l1(j3);
                if (this.f12912l || this.f12909i.size() < 20) {
                    i7 = 20;
                }
                tL_getStoryReactionsList.limit = i7;
                String str = this.f12914n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f12906e = true;
                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.f28644id + " " + this.f12912l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final z4 f12733b;

                    {
                        this.f12733b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final z4 z4Var = this.f12733b;
                                final int[] iArr = r2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                z4 z4Var2 = z4Var;
                                                ArrayList arrayList = z4Var2.f12918r;
                                                ArrayList arrayList2 = z4Var2.h;
                                                int i11 = z4Var2.d;
                                                ArrayList arrayList3 = z4Var2.f12908g;
                                                TL_stories.StoryItem storyItem2 = z4Var2.f12904b;
                                                if (iArr[0] != z4Var2.f12915o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " localId != reqId");
                                                    return;
                                                }
                                                z4Var2.f12906e = false;
                                                z4Var2.f12915o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = mp.u1(i11).R1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    mp.u1(i11).f4(storyViewsList.users, false);
                                                    mp.u1(i11).Z3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    tr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (z4Var2.f12912l) {
                                                        z4Var2.f12912l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            z4Var2.f12916p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (z4Var2.f12917q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        z4Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        z4Var2.f12913m = true;
                                                    } else {
                                                        z4Var2.f12913m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    z4Var2.f12914n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        z4Var2.f12913m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28554id, storyItem2.views.recent_viewers)) {
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
                                                        ks.f(i11).k(326, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        z4Var2.f12903a = 0;
                                                    }
                                                    z4Var2.f12913m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " response  totalItems " + arrayList3.size() + " has next " + z4Var2.f12913m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((a5) arrayList.get(i18)).e(z4Var2);
                                                }
                                                if (arrayList3.size() < 20 && z4Var2.f12913m) {
                                                    z4Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                z4 z4Var3 = z4Var;
                                                ArrayList arrayList4 = z4Var3.f12918r;
                                                TL_stories.StoryItem storyItem3 = z4Var3.f12904b;
                                                int i19 = z4Var3.d;
                                                ArrayList arrayList5 = z4Var3.f12909i;
                                                if (iArr[0] != z4Var3.f12915o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " localId != reqId");
                                                    return;
                                                }
                                                z4Var3.f12906e = false;
                                                z4Var3.f12915o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    mp.u1(i19).f4(tL_storyReactionsList.users, false);
                                                    mp.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    tr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (z4Var3.f12912l) {
                                                        z4Var3.f12912l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            z4Var3.f12916p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        z4Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        z4Var3.f12913m = true;
                                                    } else {
                                                        z4Var3.f12913m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    z4Var3.f12914n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        z4Var3.f12913m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = z4Var3.f12903a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    z4Var3.f12903a = i22;
                                                    if (z13) {
                                                        ks.f(i19).k(326, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        z4Var3.f12903a = 0;
                                                    }
                                                    z4Var3.f12913m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " response  totalItems " + arrayList5.size() + " has next " + z4Var3.f12913m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((a5) arrayList4.get(i23)).e(z4Var3);
                                                }
                                                if (arrayList5.size() < 20 && z4Var3.f12913m) {
                                                    z4Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final z4 z4Var2 = this.f12733b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                z4 z4Var22 = z4Var2;
                                                ArrayList arrayList = z4Var22.f12918r;
                                                ArrayList arrayList2 = z4Var22.h;
                                                int i11 = z4Var22.d;
                                                ArrayList arrayList3 = z4Var22.f12908g;
                                                TL_stories.StoryItem storyItem2 = z4Var22.f12904b;
                                                if (iArr2[0] != z4Var22.f12915o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " localId != reqId");
                                                    return;
                                                }
                                                z4Var22.f12906e = false;
                                                z4Var22.f12915o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = mp.u1(i11).R1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    mp.u1(i11).f4(storyViewsList.users, false);
                                                    mp.u1(i11).Z3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    tr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (z4Var22.f12912l) {
                                                        z4Var22.f12912l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            z4Var22.f12916p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (z4Var22.f12917q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        z4Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        z4Var22.f12913m = true;
                                                    } else {
                                                        z4Var22.f12913m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    z4Var22.f12914n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        z4Var22.f12913m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28554id, storyItem2.views.recent_viewers)) {
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
                                                        ks.f(i11).k(326, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        z4Var22.f12903a = 0;
                                                    }
                                                    z4Var22.f12913m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " response  totalItems " + arrayList3.size() + " has next " + z4Var22.f12913m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((a5) arrayList.get(i18)).e(z4Var22);
                                                }
                                                if (arrayList3.size() < 20 && z4Var22.f12913m) {
                                                    z4Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                z4 z4Var3 = z4Var2;
                                                ArrayList arrayList4 = z4Var3.f12918r;
                                                TL_stories.StoryItem storyItem3 = z4Var3.f12904b;
                                                int i19 = z4Var3.d;
                                                ArrayList arrayList5 = z4Var3.f12909i;
                                                if (iArr2[0] != z4Var3.f12915o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " localId != reqId");
                                                    return;
                                                }
                                                z4Var3.f12906e = false;
                                                z4Var3.f12915o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    mp.u1(i19).f4(tL_storyReactionsList.users, false);
                                                    mp.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    tr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (z4Var3.f12912l) {
                                                        z4Var3.f12912l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            z4Var3.f12916p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        z4Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        z4Var3.f12913m = true;
                                                    } else {
                                                        z4Var3.f12913m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    z4Var3.f12914n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        z4Var3.f12913m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = z4Var3.f12903a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    z4Var3.f12903a = i22;
                                                    if (z13) {
                                                        ks.f(i19).k(326, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        z4Var3.f12903a = 0;
                                                    }
                                                    z4Var3.f12913m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " response  totalItems " + arrayList5.size() + " has next " + z4Var3.f12913m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((a5) arrayList4.get(i23)).e(z4Var3);
                                                }
                                                if (arrayList5.size() < 20 && z4Var3.f12913m) {
                                                    z4Var3.c();
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
                this.f12915o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f28653id = storyItem.f28644id;
            tL_stories_getStoryViewsList.peer = mp.u1(i10).l1(j3);
            if (this.f12917q) {
                tL_stories_getStoryViewsList.f28654q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = m4Var.f12269c;
                tL_stories_getStoryViewsList.f28654q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = m4Var.f12268b;
                tL_stories_getStoryViewsList.reactions_first = m4Var.f12267a;
            }
            if (this.f12912l || this.f12908g.size() < 20) {
                i7 = 20;
            }
            tL_stories_getStoryViewsList.limit = i7;
            String str3 = this.f12914n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f12906e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.f28644id + " " + this.f12912l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f28654q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final z4 f12733b;

                {
                    this.f12733b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final z4 z4Var = this.f12733b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            z4 z4Var22 = z4Var;
                                            ArrayList arrayList = z4Var22.f12918r;
                                            ArrayList arrayList2 = z4Var22.h;
                                            int i11 = z4Var22.d;
                                            ArrayList arrayList3 = z4Var22.f12908g;
                                            TL_stories.StoryItem storyItem2 = z4Var22.f12904b;
                                            if (iArr2[0] != z4Var22.f12915o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " localId != reqId");
                                                return;
                                            }
                                            z4Var22.f12906e = false;
                                            z4Var22.f12915o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = mp.u1(i11).R1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                mp.u1(i11).f4(storyViewsList.users, false);
                                                mp.u1(i11).Z3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                tr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (z4Var22.f12912l) {
                                                    z4Var22.f12912l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        z4Var22.f12916p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (z4Var22.f12917q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    z4Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    z4Var22.f12913m = true;
                                                } else {
                                                    z4Var22.f12913m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                z4Var22.f12914n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    z4Var22.f12913m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28554id, storyItem2.views.recent_viewers)) {
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
                                                    ks.f(i11).k(326, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    z4Var22.f12903a = 0;
                                                }
                                                z4Var22.f12913m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " response  totalItems " + arrayList3.size() + " has next " + z4Var22.f12913m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((a5) arrayList.get(i18)).e(z4Var22);
                                            }
                                            if (arrayList3.size() < 20 && z4Var22.f12913m) {
                                                z4Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            z4 z4Var3 = z4Var;
                                            ArrayList arrayList4 = z4Var3.f12918r;
                                            TL_stories.StoryItem storyItem3 = z4Var3.f12904b;
                                            int i19 = z4Var3.d;
                                            ArrayList arrayList5 = z4Var3.f12909i;
                                            if (iArr2[0] != z4Var3.f12915o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " localId != reqId");
                                                return;
                                            }
                                            z4Var3.f12906e = false;
                                            z4Var3.f12915o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                mp.u1(i19).f4(tL_storyReactionsList.users, false);
                                                mp.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                tr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (z4Var3.f12912l) {
                                                    z4Var3.f12912l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        z4Var3.f12916p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    z4Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    z4Var3.f12913m = true;
                                                } else {
                                                    z4Var3.f12913m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                z4Var3.f12914n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    z4Var3.f12913m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = z4Var3.f12903a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                z4Var3.f12903a = i22;
                                                if (z13) {
                                                    ks.f(i19).k(326, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    z4Var3.f12903a = 0;
                                                }
                                                z4Var3.f12913m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " response  totalItems " + arrayList5.size() + " has next " + z4Var3.f12913m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((a5) arrayList4.get(i23)).e(z4Var3);
                                            }
                                            if (arrayList5.size() < 20 && z4Var3.f12913m) {
                                                z4Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final z4 z4Var2 = this.f12733b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            z4 z4Var22 = z4Var2;
                                            ArrayList arrayList = z4Var22.f12918r;
                                            ArrayList arrayList2 = z4Var22.h;
                                            int i11 = z4Var22.d;
                                            ArrayList arrayList3 = z4Var22.f12908g;
                                            TL_stories.StoryItem storyItem2 = z4Var22.f12904b;
                                            if (iArr22[0] != z4Var22.f12915o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " localId != reqId");
                                                return;
                                            }
                                            z4Var22.f12906e = false;
                                            z4Var22.f12915o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = mp.u1(i11).R1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                mp.u1(i11).f4(storyViewsList.users, false);
                                                mp.u1(i11).Z3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                tr.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (z4Var22.f12912l) {
                                                    z4Var22.f12912l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        z4Var22.f12916p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (z4Var22.f12917q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    z4Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    z4Var22.f12913m = true;
                                                } else {
                                                    z4Var22.f12913m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                z4Var22.f12914n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    z4Var22.f12913m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28554id, storyItem2.views.recent_viewers)) {
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
                                                    ks.f(i11).k(326, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    z4Var22.f12903a = 0;
                                                }
                                                z4Var22.f12913m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28644id + " response  totalItems " + arrayList3.size() + " has next " + z4Var22.f12913m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((a5) arrayList.get(i18)).e(z4Var22);
                                            }
                                            if (arrayList3.size() < 20 && z4Var22.f12913m) {
                                                z4Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            z4 z4Var3 = z4Var2;
                                            ArrayList arrayList4 = z4Var3.f12918r;
                                            TL_stories.StoryItem storyItem3 = z4Var3.f12904b;
                                            int i19 = z4Var3.d;
                                            ArrayList arrayList5 = z4Var3.f12909i;
                                            if (iArr22[0] != z4Var3.f12915o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " localId != reqId");
                                                return;
                                            }
                                            z4Var3.f12906e = false;
                                            z4Var3.f12915o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                mp.u1(i19).f4(tL_storyReactionsList.users, false);
                                                mp.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                tr.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (z4Var3.f12912l) {
                                                    z4Var3.f12912l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        z4Var3.f12916p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    z4Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    z4Var3.f12913m = true;
                                                } else {
                                                    z4Var3.f12913m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                z4Var3.f12914n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    z4Var3.f12913m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = z4Var3.f12903a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                z4Var3.f12903a = i22;
                                                if (z13) {
                                                    ks.f(i19).k(326, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    z4Var3.f12903a = 0;
                                                }
                                                z4Var3.f12913m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28644id + " response  totalItems " + arrayList5.size() + " has next " + z4Var3.f12913m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((a5) arrayList4.get(i23)).e(z4Var3);
                                            }
                                            if (arrayList5.size() < 20 && z4Var3.f12913m) {
                                                z4Var3.c();
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
            this.f12915o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f12915o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f12915o, false);
        }
        this.f12915o = -1;
    }

    public final void e(m4 m4Var, boolean z10, boolean z11) {
        m4 m4Var2 = new m4();
        m4Var2.f12267a = m4Var.f12267a;
        m4Var2.f12268b = m4Var.f12268b;
        m4Var2.f12269c = m4Var.f12269c;
        int i7 = 0;
        if (!z10) {
            m4Var2.f12268b = false;
        }
        if (!z11) {
            m4Var2.f12267a = true;
        }
        m4 m4Var3 = this.f12919s;
        if (!m4Var3.equals(m4Var2)) {
            m4Var3.f12267a = m4Var2.f12267a;
            m4Var3.f12268b = m4Var2.f12268b;
            m4Var3.f12269c = m4Var2.f12269c;
            if (!this.f12907f && this.f12917q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f12918r;
                    if (i7 < arrayList.size()) {
                        ((a5) arrayList.get(i7)).e(this);
                        i7++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f12908g.clear();
                this.f12909i.clear();
                this.f12912l = true;
                this.f12906e = false;
                this.f12913m = true;
                this.f12914n = "";
                c();
            }
        }
    }
}
