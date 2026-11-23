package fi;

import android.text.TextUtils;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 {
    public int f11755a;
    public final TL_stories.StoryItem f11756b;
    public final long f11757c;
    public final int d;
    public boolean f11758e;
    public final boolean f11759f;
    public final boolean f11762j;
    public final boolean f11763k;
    public boolean f11764l;
    public String f11766n;
    public final boolean f11769q;
    public final ArrayList f11760g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f11761i = new ArrayList();
    public boolean f11765m = true;
    public int f11767o = -1;
    public final HashSet f11768p = new HashSet();
    public final ArrayList f11770r = new ArrayList();
    public final n4 f11771s = new n4();

    public a5(int i7, long j3, TL_stories.StoryItem storyItem) {
        boolean z10;
        int i10;
        boolean z11;
        TL_stories.StoryViews storyViews;
        this.d = i7;
        this.f11756b = storyItem;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11759f = z10;
        this.f11757c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        if (storyViews2 == null) {
            i10 = 0;
        } else {
            i10 = storyViews2.views_count;
        }
        this.f11755a = i10;
        if (i10 < 200) {
            this.f11769q = true;
        }
        if (i7.v(storyItem) && !k10.i(i7).q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11762j = z11;
        if (z11 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.f11762j = false;
            this.f11763k = true;
        }
        if (!this.f11762j) {
            this.f11764l = true;
            if (storyItem.views != null) {
                for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                    Long l10 = storyItem.views.recent_viewers.get(i11);
                    long longValue = l10.longValue();
                    if (np.u1(i7).c2(l10) != null) {
                        TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                        tL_storyView.user_id = longValue;
                        tL_storyView.date = 0;
                        this.f11760g.add(tL_storyView);
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
        if (!this.f11759f) {
            ArrayList arrayList = this.f11760g;
            arrayList.clear();
            n4 n4Var = this.f11771s;
            boolean z11 = n4Var.f12341b;
            ArrayList arrayList2 = this.h;
            if (!z11 && TextUtils.isEmpty(n4Var.f12342c)) {
                arrayList.addAll(arrayList2);
            } else {
                if (!TextUtils.isEmpty(n4Var.f12342c)) {
                    str = n4Var.f12342c.trim().toLowerCase();
                    str2 = hd.E0().T0(str, true, false);
                    str4 = p5.c.k(" ", str);
                    str3 = p5.c.k(" ", str2);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    TLRPC.User c22 = np.u1(this.d).c2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i7)).user_id));
                    if (n4Var.f12341b && (c22 == null || !c22.contact)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && str != null) {
                        String lowerCase = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name).toLowerCase();
                        String o4 = p10.o(c22);
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
            if (!n4Var.f12340a) {
                Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(7)));
            }
        }
    }

    public final int b() {
        ArrayList arrayList;
        if (this.f11759f) {
            arrayList = this.f11761i;
        } else {
            arrayList = this.f11760g;
        }
        return arrayList.size();
    }

    public final void c() {
        if (!this.f11758e && this.f11765m && !this.f11762j) {
            boolean z10 = this.f11759f;
            int i7 = 100;
            long j3 = this.f11757c;
            n4 n4Var = this.f11771s;
            int i10 = this.d;
            TL_stories.StoryItem storyItem = this.f11756b;
            if (z10) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = n4Var.f12340a;
                tL_getStoryReactionsList.f28674id = storyItem.f28673id;
                tL_getStoryReactionsList.peer = np.u1(i10).l1(j3);
                if (this.f11764l || this.f11761i.size() < 20) {
                    i7 = 20;
                }
                tL_getStoryReactionsList.limit = i7;
                String str = this.f11766n;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.f11758e = true;
                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.f28673id + " " + this.f11764l + " offset=" + tL_getStoryReactionsList.offset);
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final a5 f12820b;

                    {
                        this.f12820b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final a5 a5Var = this.f12820b;
                                final int[] iArr = r2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                a5 a5Var2 = a5Var;
                                                ArrayList arrayList = a5Var2.f11770r;
                                                ArrayList arrayList2 = a5Var2.h;
                                                int i11 = a5Var2.d;
                                                ArrayList arrayList3 = a5Var2.f11760g;
                                                TL_stories.StoryItem storyItem2 = a5Var2.f11756b;
                                                if (iArr[0] != a5Var2.f11767o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " localId != reqId");
                                                    return;
                                                }
                                                a5Var2.f11758e = false;
                                                a5Var2.f11767o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.u1(i11).R1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.u1(i11).f4(storyViewsList.users, false);
                                                    np.u1(i11).Z3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    ur.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (a5Var2.f11764l) {
                                                        a5Var2.f11764l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            a5Var2.f11768p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (a5Var2.f11769q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        a5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        a5Var2.f11765m = true;
                                                    } else {
                                                        a5Var2.f11765m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    a5Var2.f11766n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        a5Var2.f11765m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28583id, storyItem2.views.recent_viewers)) {
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
                                                        ls.f(i11).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        a5Var2.f11755a = 0;
                                                    }
                                                    a5Var2.f11765m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " response  totalItems " + arrayList3.size() + " has next " + a5Var2.f11765m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((b5) arrayList.get(i18)).e(a5Var2);
                                                }
                                                if (arrayList3.size() < 20 && a5Var2.f11765m) {
                                                    a5Var2.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                a5 a5Var3 = a5Var;
                                                ArrayList arrayList4 = a5Var3.f11770r;
                                                TL_stories.StoryItem storyItem3 = a5Var3.f11756b;
                                                int i19 = a5Var3.d;
                                                ArrayList arrayList5 = a5Var3.f11761i;
                                                if (iArr[0] != a5Var3.f11767o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " localId != reqId");
                                                    return;
                                                }
                                                a5Var3.f11758e = false;
                                                a5Var3.f11767o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.u1(i19).f4(tL_storyReactionsList.users, false);
                                                    np.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    ur.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (a5Var3.f11764l) {
                                                        a5Var3.f11764l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            a5Var3.f11768p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        a5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        a5Var3.f11765m = true;
                                                    } else {
                                                        a5Var3.f11765m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    a5Var3.f11766n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        a5Var3.f11765m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = a5Var3.f11755a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    a5Var3.f11755a = i22;
                                                    if (z13) {
                                                        ls.f(i19).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        a5Var3.f11755a = 0;
                                                    }
                                                    a5Var3.f11765m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " response  totalItems " + arrayList5.size() + " has next " + a5Var3.f11765m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((b5) arrayList4.get(i23)).e(a5Var3);
                                                }
                                                if (arrayList5.size() < 20 && a5Var3.f11765m) {
                                                    a5Var3.c();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final a5 a5Var2 = this.f12820b;
                                final int[] iArr2 = r2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z11;
                                        switch (r5) {
                                            case 0:
                                                a5 a5Var22 = a5Var2;
                                                ArrayList arrayList = a5Var22.f11770r;
                                                ArrayList arrayList2 = a5Var22.h;
                                                int i11 = a5Var22.d;
                                                ArrayList arrayList3 = a5Var22.f11760g;
                                                TL_stories.StoryItem storyItem2 = a5Var22.f11756b;
                                                if (iArr2[0] != a5Var22.f11767o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " localId != reqId");
                                                    return;
                                                }
                                                a5Var22.f11758e = false;
                                                a5Var22.f11767o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.u1(i11).R1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.u1(i11).f4(storyViewsList.users, false);
                                                    np.u1(i11).Z3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    ur.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (a5Var22.f11764l) {
                                                        a5Var22.f11764l = false;
                                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                            a5Var22.f11768p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (a5Var22.f11769q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        a5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (!storyViewsList.views.isEmpty()) {
                                                        a5Var22.f11765m = true;
                                                    } else {
                                                        a5Var22.f11765m = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    a5Var22.f11766n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        a5Var22.f11765m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i14 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i14 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28583id, storyItem2.views.recent_viewers)) {
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
                                                        ls.f(i11).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        a5Var22.f11755a = 0;
                                                    }
                                                    a5Var22.f11765m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " response  totalItems " + arrayList3.size() + " has next " + a5Var22.f11765m);
                                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                    ((b5) arrayList.get(i18)).e(a5Var22);
                                                }
                                                if (arrayList3.size() < 20 && a5Var22.f11765m) {
                                                    a5Var22.c();
                                                    return;
                                                }
                                                return;
                                            default:
                                                a5 a5Var3 = a5Var2;
                                                ArrayList arrayList4 = a5Var3.f11770r;
                                                TL_stories.StoryItem storyItem3 = a5Var3.f11756b;
                                                int i19 = a5Var3.d;
                                                ArrayList arrayList5 = a5Var3.f11761i;
                                                if (iArr2[0] != a5Var3.f11767o) {
                                                    org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " localId != reqId");
                                                    return;
                                                }
                                                a5Var3.f11758e = false;
                                                a5Var3.f11767o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.u1(i19).f4(tL_storyReactionsList.users, false);
                                                    np.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                    boolean z13 = true;
                                                    ur.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (a5Var3.f11764l) {
                                                        a5Var3.f11764l = false;
                                                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                            a5Var3.f11768p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        a5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                        a5Var3.f11765m = true;
                                                    } else {
                                                        a5Var3.f11765m = false;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    a5Var3.f11766n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        a5Var3.f11765m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i21 = a5Var3.f11755a;
                                                    int i22 = tL_storyReactionsList.count;
                                                    if (i21 == i22) {
                                                        z13 = false;
                                                    }
                                                    a5Var3.f11755a = i22;
                                                    if (z13) {
                                                        ls.f(i19).k(327, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        a5Var3.f11755a = 0;
                                                    }
                                                    a5Var3.f11765m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " response  totalItems " + arrayList5.size() + " has next " + a5Var3.f11765m);
                                                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                    ((b5) arrayList4.get(i23)).e(a5Var3);
                                                }
                                                if (arrayList5.size() < 20 && a5Var3.f11765m) {
                                                    a5Var3.c();
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
                this.f11767o = sendRequest;
                final int[] iArr = {sendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.f28682id = storyItem.f28673id;
            tL_stories_getStoryViewsList.peer = np.u1(i10).l1(j3);
            if (this.f11769q) {
                tL_stories_getStoryViewsList.f28683q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = n4Var.f12342c;
                tL_stories_getStoryViewsList.f28683q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                tL_stories_getStoryViewsList.just_contacts = n4Var.f12341b;
                tL_stories_getStoryViewsList.reactions_first = n4Var.f12340a;
            }
            if (this.f11764l || this.f11760g.size() < 20) {
                i7 = 20;
            }
            tL_stories_getStoryViewsList.limit = i7;
            String str3 = this.f11766n;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.f11758e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.f28673id + " " + this.f11764l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.f28683q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final a5 f12820b;

                {
                    this.f12820b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final a5 a5Var = this.f12820b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            a5 a5Var22 = a5Var;
                                            ArrayList arrayList = a5Var22.f11770r;
                                            ArrayList arrayList2 = a5Var22.h;
                                            int i11 = a5Var22.d;
                                            ArrayList arrayList3 = a5Var22.f11760g;
                                            TL_stories.StoryItem storyItem2 = a5Var22.f11756b;
                                            if (iArr2[0] != a5Var22.f11767o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " localId != reqId");
                                                return;
                                            }
                                            a5Var22.f11758e = false;
                                            a5Var22.f11767o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.u1(i11).R1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.u1(i11).f4(storyViewsList.users, false);
                                                np.u1(i11).Z3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                ur.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (a5Var22.f11764l) {
                                                    a5Var22.f11764l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        a5Var22.f11768p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (a5Var22.f11769q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    a5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    a5Var22.f11765m = true;
                                                } else {
                                                    a5Var22.f11765m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                a5Var22.f11766n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    a5Var22.f11765m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28583id, storyItem2.views.recent_viewers)) {
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
                                                    ls.f(i11).k(327, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    a5Var22.f11755a = 0;
                                                }
                                                a5Var22.f11765m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " response  totalItems " + arrayList3.size() + " has next " + a5Var22.f11765m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((b5) arrayList.get(i18)).e(a5Var22);
                                            }
                                            if (arrayList3.size() < 20 && a5Var22.f11765m) {
                                                a5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            a5 a5Var3 = a5Var;
                                            ArrayList arrayList4 = a5Var3.f11770r;
                                            TL_stories.StoryItem storyItem3 = a5Var3.f11756b;
                                            int i19 = a5Var3.d;
                                            ArrayList arrayList5 = a5Var3.f11761i;
                                            if (iArr2[0] != a5Var3.f11767o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " localId != reqId");
                                                return;
                                            }
                                            a5Var3.f11758e = false;
                                            a5Var3.f11767o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.u1(i19).f4(tL_storyReactionsList.users, false);
                                                np.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                ur.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (a5Var3.f11764l) {
                                                    a5Var3.f11764l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        a5Var3.f11768p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    a5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    a5Var3.f11765m = true;
                                                } else {
                                                    a5Var3.f11765m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                a5Var3.f11766n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    a5Var3.f11765m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = a5Var3.f11755a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                a5Var3.f11755a = i22;
                                                if (z13) {
                                                    ls.f(i19).k(327, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    a5Var3.f11755a = 0;
                                                }
                                                a5Var3.f11765m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " response  totalItems " + arrayList5.size() + " has next " + a5Var3.f11765m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((b5) arrayList4.get(i23)).e(a5Var3);
                                            }
                                            if (arrayList5.size() < 20 && a5Var3.f11765m) {
                                                a5Var3.c();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final a5 a5Var2 = this.f12820b;
                            final int[] iArr22 = r2;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z11;
                                    switch (r5) {
                                        case 0:
                                            a5 a5Var22 = a5Var2;
                                            ArrayList arrayList = a5Var22.f11770r;
                                            ArrayList arrayList2 = a5Var22.h;
                                            int i11 = a5Var22.d;
                                            ArrayList arrayList3 = a5Var22.f11760g;
                                            TL_stories.StoryItem storyItem2 = a5Var22.f11756b;
                                            if (iArr22[0] != a5Var22.f11767o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " localId != reqId");
                                                return;
                                            }
                                            a5Var22.f11758e = false;
                                            a5Var22.f11767o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.u1(i11).R1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i12 = 0; i12 < storyViewsList.views.size(); i12++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i12);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.u1(i11).f4(storyViewsList.users, false);
                                                np.u1(i11).Z3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                ur.a0(i11).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (a5Var22.f11764l) {
                                                    a5Var22.f11764l = false;
                                                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                                        a5Var22.f11768p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i13)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (a5Var22.f11769q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    a5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (!storyViewsList.views.isEmpty()) {
                                                    a5Var22.f11765m = true;
                                                } else {
                                                    a5Var22.f11765m = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                a5Var22.f11766n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    a5Var22.f11765m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i14 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i14 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i15 = 0; i15 < Math.min(3, storyViewsList.users.size()); i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, storyViewsList.users.get(i15).f28583id, storyItem2.views.recent_viewers)) {
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
                                                    ls.f(i11).k(327, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    a5Var22.f11755a = 0;
                                                }
                                                a5Var22.f11765m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.f28673id + " response  totalItems " + arrayList3.size() + " has next " + a5Var22.f11765m);
                                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                                ((b5) arrayList.get(i18)).e(a5Var22);
                                            }
                                            if (arrayList3.size() < 20 && a5Var22.f11765m) {
                                                a5Var22.c();
                                                return;
                                            }
                                            return;
                                        default:
                                            a5 a5Var3 = a5Var2;
                                            ArrayList arrayList4 = a5Var3.f11770r;
                                            TL_stories.StoryItem storyItem3 = a5Var3.f11756b;
                                            int i19 = a5Var3.d;
                                            ArrayList arrayList5 = a5Var3.f11761i;
                                            if (iArr22[0] != a5Var3.f11767o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " localId != reqId");
                                                return;
                                            }
                                            a5Var3.f11758e = false;
                                            a5Var3.f11767o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.u1(i19).f4(tL_storyReactionsList.users, false);
                                                np.u1(i19).Z3(tL_storyReactionsList.chats, false);
                                                boolean z13 = true;
                                                ur.a0(i19).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (a5Var3.f11764l) {
                                                    a5Var3.f11764l = false;
                                                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                                        a5Var3.f11768p.add(Long.valueOf(org.telegram.messenger.n5.o(((TL_stories.StoryReaction) arrayList5.get(i20)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    a5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (!tL_storyReactionsList.reactions.isEmpty()) {
                                                    a5Var3.f11765m = true;
                                                } else {
                                                    a5Var3.f11765m = false;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                a5Var3.f11766n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    a5Var3.f11765m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i21 = a5Var3.f11755a;
                                                int i22 = tL_storyReactionsList.count;
                                                if (i21 == i22) {
                                                    z13 = false;
                                                }
                                                a5Var3.f11755a = i22;
                                                if (z13) {
                                                    ls.f(i19).k(327, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    a5Var3.f11755a = 0;
                                                }
                                                a5Var3.f11765m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.f28673id + " response  totalItems " + arrayList5.size() + " has next " + a5Var3.f11765m);
                                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                                ((b5) arrayList4.get(i23)).e(a5Var3);
                                            }
                                            if (arrayList5.size() < 20 && a5Var3.f11765m) {
                                                a5Var3.c();
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
            this.f11767o = sendRequest2;
            final int[] iArr2 = {sendRequest2};
        }
    }

    public final void d() {
        if (this.f11767o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.f11767o, false);
        }
        this.f11767o = -1;
    }

    public final void e(n4 n4Var, boolean z10, boolean z11) {
        n4 n4Var2 = new n4();
        n4Var2.f12340a = n4Var.f12340a;
        n4Var2.f12341b = n4Var.f12341b;
        n4Var2.f12342c = n4Var.f12342c;
        int i7 = 0;
        if (!z10) {
            n4Var2.f12341b = false;
        }
        if (!z11) {
            n4Var2.f12340a = true;
        }
        n4 n4Var3 = this.f11771s;
        if (!n4Var3.equals(n4Var2)) {
            n4Var3.f12340a = n4Var2.f12340a;
            n4Var3.f12341b = n4Var2.f12341b;
            n4Var3.f12342c = n4Var2.f12342c;
            if (!this.f11759f && this.f11769q) {
                a();
                while (true) {
                    ArrayList arrayList = this.f11770r;
                    if (i7 < arrayList.size()) {
                        ((b5) arrayList.get(i7)).e(this);
                        i7++;
                    } else {
                        return;
                    }
                }
            } else {
                d();
                this.f11760g.clear();
                this.f11761i.clear();
                this.f11764l = true;
                this.f11758e = false;
                this.f11765m = true;
                this.f11766n = "";
                c();
            }
        }
    }
}
