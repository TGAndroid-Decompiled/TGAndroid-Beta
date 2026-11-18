package bi;

import android.content.Context;
import android.text.TextUtils;
import di.o9;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.qx0;
public final class e0 implements Runnable {
    public final int f3531a;
    public final long f3532b;
    public final int f3533c;
    public final Object d;
    public final Object f3534e;
    public final Object f3535f;

    public e0(ai.v1 v1Var, int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var, s4 s4Var) {
        this.f3531a = 6;
        this.d = v1Var;
        this.f3533c = i7;
        this.f3532b = j3;
        this.f3534e = h2Var;
        this.f3535f = s4Var;
    }

    @Override
    public final void run() {
        String a02;
        boolean z10;
        boolean z11;
        int i7 = 0;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        switch (this.f3531a) {
            case 0:
                new z8((Context) this.d, this.f3533c, ((q9) this.f3534e).d, null, this.f3532b, (Runnable) this.f3535f, false, false).show();
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3534e;
                long j3 = this.f3532b;
                String str2 = (String) this.f3535f;
                int i10 = this.f3533c;
                ((c1.c) this.d).run();
                if (j3 != 0) {
                    a02 = gd.a0(null, null, 2131749656, str2, org.telegram.messenger.n5.s(i10, j3));
                } else {
                    a02 = gd.a0(null, null, 2131749657, str2);
                }
                u4.s(tL_starGiftUnique, a02);
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.f3534e;
                int i11 = this.f3533c;
                long j10 = this.f3532b;
                ((di.k1) this.d).run();
                u4.s(tL_starGiftUnique2, gd.a0(null, null, 2131749651, (String) this.f3535f));
                String str3 = tL_starGiftUnique2.slug;
                if (!TextUtils.isEmpty(str3)) {
                    org.telegram.messenger.g0.h3(new k4(i11, 0, j10, str3, true), u4.f4080a[0]);
                    return;
                }
                return;
            case 3:
                di.d0 d0Var = (di.d0) this.f3534e;
                int i12 = this.f3533c;
                TLObject tLObject = (TLObject) this.f3535f;
                long j11 = this.f3532b;
                int i13 = ((di.e0) this.d).f8682a;
                boolean[] zArr = d0Var.d;
                boolean[] zArr2 = d0Var.f8638b;
                ArrayList[] arrayListArr = d0Var.f8637a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    mp.u1(i13).f4(starsStatus.users, false);
                    mp.u1(i13).Z3(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i12] = z10;
                    boolean[] zArr3 = d0Var.f8640e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = d0Var.f8639c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    ks.f(i13).k(228, Long.valueOf(j11));
                    return;
                }
                return;
            case 4:
                hi.d dVar = (hi.d) this.d;
                int i14 = this.f3533c;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.f3535f;
                long j12 = this.f3532b;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.f3534e).f28633id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new di.v(i14, 1, j12, dVar, x2VarArr));
                return;
            case 5:
                fi.p6 p6Var = (fi.p6) this.d;
                TLObject tLObject2 = (TLObject) this.f3534e;
                int i15 = this.f3533c;
                String str4 = (String) this.f3535f;
                long j13 = this.f3532b;
                int i16 = p6Var.f12382a;
                HashSet hashSet = p6Var.f12399t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    mp.u1(i16).f4(tL_stories_stories.users, false);
                    mp.u1(i16).Z3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i7 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i7).f28642id == i15) {
                                storyItem = tL_stories_stories.stories.get(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                p6Var.W.remove(str4);
                if (storyItem != null) {
                    storyItem.dialogId = j13;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = mp.u1(i16).B1(j13);
                    tL_updateStory.story = storyItem;
                    p6Var.c0(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str5 = (String) it.next();
                        if (str5.endsWith(":" + j13 + ":" + i15)) {
                            hashSet.remove(str5);
                        }
                    }
                }
                hashSet.add(str4);
                p6Var.f12391l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 6:
                ai.v1 v1Var = (ai.v1) this.d;
                int i17 = this.f3533c;
                long j14 = this.f3532b;
                s4 s4Var = (s4) this.f3535f;
                v1Var.a(Boolean.TRUE);
                lc.Y().Q(2131623990, 36, gd.M0(2131749333, null)).j();
                ii.n.a(i17, j14, 180000 + System.currentTimeMillis(), 0, new o9(v1Var, (org.telegram.ui.ActionBar.h2) this.f3534e, i17, s4Var, 1));
                return;
            case 7:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                TLRPC.User user = (TLRPC.User) this.f3534e;
                int i18 = this.f3533c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f3535f;
                long j15 = this.f3532b;
                if (user != null) {
                    r1Var.f31475l7[i18].r(user);
                    r1Var.f31463k7[i18].i0(user, r1Var.f31475l7[i18], null);
                    return;
                } else if (chat != null) {
                    r1Var.f31475l7[i18].q(chat);
                    r1Var.f31463k7[i18].i0(chat, r1Var.f31475l7[i18], null);
                    return;
                } else {
                    r1Var.f31475l7[i18].k(j15, "", "", null);
                    return;
                }
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.d;
                long j16 = this.f3532b;
                int i19 = this.f3533c;
                String str6 = (String) this.f3534e;
                String str7 = (String) this.f3535f;
                if (p1Var.A) {
                    org.telegram.utils.twidget.i1.f54788a.execute(new qx0(p1Var, j16, 3));
                    return;
                }
                p1Var.v = j16;
                int i20 = p1Var.M;
                if (i20 != i19 && i20 > 0) {
                    p1Var.f54885c.p(j16, i20 / p1Var.f54894l);
                }
                if (!p1Var.H.equals(str6)) {
                    p1Var.f54885c.k(j16, p1Var.H.getBytes(StandardCharsets.UTF_8));
                }
                if (p1Var.f54893k != null && !p1Var.f54893k.equals(str7)) {
                    p1Var.f54885c.j(j16, p1Var.f54893k.getBytes(StandardCharsets.UTF_8));
                }
                p1Var.I = true;
                p1Var.f54885c.o(j16, p1Var.L);
                p1Var.e();
                return;
        }
    }

    public e0(Context context, int i7, q9 q9Var, long j3, Runnable runnable) {
        this.f3531a = 0;
        this.d = context;
        this.f3533c = i7;
        this.f3534e = q9Var;
        this.f3532b = j3;
        this.f3535f = runnable;
    }

    public e0(c1.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, String str, int i7) {
        this.f3531a = 1;
        this.d = cVar;
        this.f3534e = tL_starGiftUnique;
        this.f3532b = j3;
        this.f3535f = str;
        this.f3533c = i7;
    }

    public e0(di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, int i7, long j3) {
        this.f3531a = 2;
        this.d = k1Var;
        this.f3534e = tL_starGiftUnique;
        this.f3535f = str;
        this.f3533c = i7;
        this.f3532b = j3;
    }

    public e0(Object obj, Object obj2, int i7, Object obj3, long j3, int i10) {
        this.f3531a = i10;
        this.d = obj;
        this.f3534e = obj2;
        this.f3533c = i7;
        this.f3535f = obj3;
        this.f3532b = j3;
    }

    public e0(org.telegram.utils.twidget.p1 p1Var, long j3, int i7, String str, String str2) {
        this.f3531a = 8;
        this.d = p1Var;
        this.f3532b = j3;
        this.f3533c = i7;
        this.f3534e = str;
        this.f3535f = str2;
    }
}
