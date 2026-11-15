package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import di.a9;
import fi.b7;
import fi.d7;
import fi.f7;
import fi.i9;
import fi.k7;
import hi.l8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.qq;
import org.telegram.ui.yw;
import org.telegram.ui.zr;
public final class m1 implements Runnable {
    public final int f3695a;
    public final long f3696b;
    public final Object f3697c;
    public final Object d;

    public m1(Object obj, long j3, Object obj2, int i7) {
        this.f3695a = i7;
        this.f3697c = obj;
        this.f3696b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        yw ywVar;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        fm fmVar;
        int i11 = this.f3695a;
        boolean z14 = false;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        int i12 = 0;
        z14 = false;
        z14 = false;
        long j3 = this.f3696b;
        Object obj = this.d;
        Object obj2 = this.f3697c;
        switch (i11) {
            case 0:
                s2 s2Var = (s2) obj2;
                z10 z10Var = (z10) obj;
                s2Var.getClass();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    s2Var.dismiss();
                    if (z10Var != null) {
                        z10Var.a(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j3);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                String str = h2.l0.f13471a;
                l2.f0 f0Var = ((l2.z) ((d3.h0) ((wf.b) obj2).f59108c)).f19233a;
                m2.e eVar = f0Var.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 26, new m2.d(U, obj, j3));
                if (f0Var.T == obj) {
                    f0Var.f18969m.e(26, new i0.b(25));
                    return;
                }
                return;
            case 2:
                di.c6 c6Var = (di.c6) obj2;
                c6Var.getClass();
                ((vf.b) obj).b();
                c6Var.r2((int) j3, c6Var.getContext(), true);
                return;
            case 3:
                di.c6 c6Var2 = (di.c6) obj2;
                Runnable runnable = (Runnable) obj;
                c6Var2.r2((int) j3, c6Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                org.telegram.ui.ActionBar.u2 u2Var = ((org.telegram.ui.ActionBar.u2[]) obj2)[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.ta(boost.giveaway_msg_id, j3));
                    return;
                }
                return;
            case 5:
                fi.q qVar = (fi.q) obj2;
                fi.p pVar = (fi.p) obj;
                fi.s6 s6Var = qVar.f12208s;
                ArrayList arrayList = qVar.f12217y;
                yw ywVar2 = qVar.f12194f0;
                if (ywVar2 != null && ywVar2.getParentActivity() != null) {
                    int i13 = pVar.f12145b;
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList.size()) {
                            long j10 = ((fi.n) arrayList.get(i14)).f12049c;
                            ywVar = ywVar2;
                            if (j10 != m10.i(qVar.f12193f).f24953n && s6Var.L(j10)) {
                                z10 = false;
                            } else {
                                i14++;
                                ywVar2 = ywVar;
                            }
                        } else {
                            ywVar = ywVar2;
                            z10 = true;
                        }
                    }
                    if (pVar.G && (!z10 || arrayList.size() == 1)) {
                        arrayList2.add(Long.valueOf(pVar.F));
                        z12 = true;
                        i7 = i13;
                        z11 = false;
                    } else {
                        if (!pVar.G && s6Var.L(pVar.F)) {
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                long j11 = ((fi.n) arrayList.get(i15)).f12049c;
                                if (!pVar.G && s6Var.L(j11)) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                                if (j11 == pVar.F) {
                                    i13 = arrayList2.size() - 1;
                                }
                            }
                            z11 = true;
                            i7 = i13;
                        } else {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (s6Var.K(((fi.n) arrayList.get(i16)).f12049c)) {
                                    arrayList2.add(Long.valueOf(((fi.n) arrayList.get(i16)).f12049c));
                                } else if (i16 <= i13) {
                                    i13--;
                                }
                            }
                            i7 = i13;
                            z11 = false;
                        }
                        z12 = false;
                    }
                    i9 orCreateStoryViewer = ywVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.x(new di.x2(qVar, j3, 2));
                    Context context = qVar.getContext();
                    b7 a10 = b7.a(qVar.h);
                    a10.f11571e = new ab.z(1, qVar, z12);
                    if (qVar.f12186b == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    a10.f11572f = z13;
                    a10.h = z11;
                    a10.f11573n = z12;
                    a10.f11574r = true;
                    orCreateStoryViewer.M(context, null, arrayList2, i7, null, null, a10, false);
                    return;
                }
                return;
            case 6:
                fi.s6 s6Var2 = (fi.s6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i17 = s6Var2.f12319a;
                s6Var2.C.remove(Long.valueOf(j3));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    np.s1(i17).Y3(tL_stories_peerStories.users, false);
                    TLRPC.User a22 = np.s1(i17).a2(Long.valueOf(j3));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    s6Var2.f12325i.k(peerStories, org.telegram.messenger.m5.o(peerStories.peer));
                    if (a22 != null && (s6Var2.O(a22) || a22.self)) {
                        s6Var2.g(peerStories);
                        f7 f7Var = s6Var2.f12327k;
                        f7Var.f11709b.f27220a.c(new d7(f7Var, peerStories, 1));
                    }
                    StringBuilder t6 = a8.p0.t(j3, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t6.append(tL_stories_peerStories.stories.stories.size());
                    a8.b(t6.toString());
                    ns.f(i17).k(324, new Object[0]);
                    return;
                }
                return;
            case 7:
                fi.r6 r6Var = (fi.r6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                fi.s6 s6Var3 = r6Var.N;
                hi.a1 a1Var = s6Var3.f12338w;
                r6Var.d = true;
                hi.d7 d7Var = r6Var.f12274c;
                if (d7Var.f14168w) {
                    a1Var.b(d7Var);
                }
                d7Var.f14168w = false;
                d7Var.f14170x = null;
                if (!d7Var.f14127b0) {
                    ArrayList arrayList3 = a1Var.f13862b;
                    if (!d7Var.f14165u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj3 = arrayList3.get(i18);
                            i18++;
                            hi.d7 d7Var2 = (hi.d7) obj3;
                            if (d7Var2.f14139g && d7Var2.f14137f == storyItem.f28290id) {
                                arrayList4.add(d7Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(d7Var);
                        d7Var.f14126b = Utilities.f22414b.nextLong();
                        hi.z0 z0Var = new hi.z0(d7Var);
                        d7Var.f14139g = true;
                        z0Var.G = true;
                        d7Var.f14134e = j3;
                        z0Var.I = j3;
                        int i19 = storyItem.f28290id;
                        d7Var.f14137f = i19;
                        z0Var.H = i19;
                        long j12 = storyItem.expire_date * 1000;
                        d7Var.J = j12;
                        z0Var.L = j12;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j13 = document.f28057id;
                            d7Var.H = j13;
                            z0Var.J = j13;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j14 = photo.f28075id;
                                d7Var.I = j14;
                                z0Var.K = j14;
                            }
                        }
                        arrayList3.remove(d7Var);
                        z14 = false;
                        arrayList3.add(0, d7Var);
                        a1Var.a(z0Var);
                    }
                }
                if (!r6Var.f12273b) {
                    s6Var3.R = z14;
                    s6Var3.S = null;
                    return;
                }
                return;
            case 8:
                ((f7) obj2).l(j3, (TL_stories.StoryItem) obj);
                return;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                vr vrVar = ((f7) obj2).f11709b;
                SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            case 10:
                ((View) obj).invalidate();
                np.s1(((k7) obj2).f11961a).P1().h0(j3, false);
                return;
            case 11:
                l8 l8Var = (l8) obj2;
                l8Var.getClass();
                l8Var.e(j3, ((TLRPC.ChatFull) obj).participants);
                return;
            case 12:
                ((long[]) obj2)[0] = j3;
                ((ai.f1) obj).run();
                return;
            case 13:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j3);
                return;
            case 14:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j3, (int[]) obj);
                return;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$5(j3, (String) obj);
                return;
            case 16:
                ((VideoCapturerDevice) obj2).lambda$init$2(j3, (Point) obj);
                return;
            case 17:
                an anVar = (an) obj2;
                anVar.getMessagesController().p0(this.f3696b, ((gj) obj).e1(), anVar.f45259k6);
                return;
            case 18:
                an anVar2 = ((lm) obj2).f49005a;
                i10 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                org.telegram.ui.Components.t4.q0(ez.C(i10).q0((ArrayList) obj, this.f3696b, false, false, true, 0, 0, null, -1, 0L, anVar2.j9(), anVar2.f45422x5), anVar2, null);
                return;
            case 19:
                qq qqVar = (qq) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                qqVar.getMessagesController().f0(qqVar.N, user);
                qqVar.A0(j3);
                if (qqVar.f50738n != null && user != null && cc.a(qqVar)) {
                    cc.D(qqVar, user, qqVar.f50738n.title).j();
                    return;
                }
                return;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (e2Var != null) {
                    e2Var.presentFragment(an.ua(j3));
                    return;
                }
                return;
            case 21:
                int i20 = ChatActivityEnterView.N6;
                ((qf) obj).run();
                org.telegram.messenger.b6.p(((ChatActivityEnterView) obj2).R, j3);
                return;
            case 22:
                ki kiVar = (ki) obj2;
                org.telegram.ui.Components.t4.J(kiVar.getContext(), j3, new sg(kiVar, 16), (org.telegram.ui.ActionBar.e6) obj);
                return;
            case 23:
                hm hmVar = (hm) obj2;
                fm fmVar2 = (fm) obj;
                im imVar = hmVar.Q;
                if (!imVar.f35663r.J1 && hmVar.E == j3 && (fmVar = hmVar.G) == fmVar2) {
                    imVar.K = fmVar;
                    imVar.N = fmVar.f34624a.f35003a;
                    imVar.L = false;
                    hmVar.H = 0.0f;
                    hmVar.invalidate();
                    ValueAnimator valueAnimator = imVar.M;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    imVar.M = ofFloat;
                    ofFloat.addUpdateListener(new dm(hmVar, 0));
                    imVar.M.setDuration(200L);
                    imVar.M.start();
                    fm fmVar3 = imVar.K;
                    RectF f10 = fmVar3.f(fmVar3.e());
                    RectF d = imVar.K.d();
                    imVar.H = (((imVar.E - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    imVar.G = (imVar.F - f10.top) / f10.height();
                    imVar.I = d.width();
                    imVar.J = d.height();
                    try {
                        imVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 24:
                d70.Hd((d70) obj2, j3, (TLRPC.Chat) obj);
                return;
            case 25:
                ((ys0) obj2).f42150y1.presentFragment(an.ta(((gj) obj).e1(), j3));
                return;
            case 26:
                av0.A1((av0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j3);
                return;
            case 27:
                yw ywVar3 = (yw) obj2;
                d3.e0 e0Var = (d3.e0) obj;
                if (ywVar3.H.bot_admin_rights != null) {
                    ywVar3.getMessagesController().Q4(-j3, ywVar3.getMessagesController().a2(Long.valueOf(ywVar3.I)), ywVar3.H.bot_admin_rights, null, false, ywVar3, true, true, null, e0Var, new zr(e0Var, 6));
                    return;
                } else {
                    e0Var.run();
                    return;
                }
            case 28:
                c40 c40Var = (c40) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i12 = message.f28072id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i12 = ((TL_update.TL_updateMessageID) update).f28309id;
                } else if (updates.updates != null) {
                    int i21 = 0;
                    while (true) {
                        if (i21 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i21);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i12 = message2.f28072id;
                                }
                                i21++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i12 = ((TL_update.TL_updateMessageID) update2).f28309id;
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                org.telegram.messenger.r3 r3Var = c40Var.V2;
                if (r3Var != null && i12 != 0) {
                    HashMap hashMap = r3Var.f26215k;
                    Long valueOf = Long.valueOf(j3);
                    ?? obj4 = new Object();
                    obj4.f26052a = i12;
                    obj4.f26053b = true;
                    obj4.f26054c = System.currentTimeMillis();
                    hashMap.put(valueOf, obj4);
                    c40Var.Q0(true);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    an ua2 = an.ua(l10.longValue());
                    T3.presentFragment(ua2);
                    TLRPC.Chat M0 = np.s1(launchActivity.P).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new a9(ua2, this.f3696b, M0, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public m1(Object obj, Object obj2, long j3, int i7) {
        this.f3695a = i7;
        this.f3697c = obj;
        this.d = obj2;
        this.f3696b = j3;
    }
}
